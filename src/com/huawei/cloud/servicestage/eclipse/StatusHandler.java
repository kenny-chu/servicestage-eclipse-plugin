/**
 * Copyright 2016 - 2018 Huawei Technologies Co., Ltd. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huawei.cloud.servicestage.eclipse;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class StatusHandler extends ServiceStageHandler implements Resources {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Integer result = (Integer) super.execute(event);
        if (result != 0) {
            return result;
        }

        Shell shell = window.getShell();
        
        // Check settings file exists
        File settingsFile = Util.getSettingsFile(project);
        if (settingsFile == null || !settingsFile.exists()) {
            MessageDialog.openError(shell, DIALOG_NO_SETTINGS_FILE_TITLE,
                    DIALOG_NO_SETTINGS_FILE_MESSAGE);
            return -1;
        }
        
        // Sanity check service instance ID
        try {
            IDialogSettings ds = Util.loadDialogSettings(project);
            String instanceId = ds.get(ConfigConstants.SERVICE_INSTANCE_ID);
            if (instanceId == null || instanceId.trim().isEmpty()) {
                MessageDialog.openError(shell, DIALOG_STATUS_ERROR,
                        DIALOG_INVALID_SERVICE_INSTANCE_ID_MESSAGE);
                return -1;
            }
        } catch (IOException e){
            Util.showExceptionDialog(DIALOG_STATUS_ERROR, shell, e);
            return -1;
        }
        

        AppStatus status = null;
        try {
            status = RequestManager.getInstance().getApplicationStatus(project);
            Logger.info(status.getDetails());
        } catch (Exception e) {
            Util.showExceptionDialog(DIALOG_STATUS_ERROR, shell, e);
            return -1;
        }

        if (status.getStatus().equals(AppStatus.RUNNING)) {
            String url = null;
            try {
                url = RequestManager.getInstance().getApplicationUrl(project);
            } catch (Exception e) {
                Util.showExceptionDialog(DIALOG_STATUS_ERROR, shell, e);
                return -1;
            }

            String message = Util.isEmpty(url)
                    ? String.format(DIALOG_STATUS_MESSAGE, status.getStatus())
                    : String.format(DIALOG_STATUS_URLMESSAGE,
                            status.getStatus(), url);
            Util.showInfoDialog(status.getStatus(), message, window.getShell());
        } else {
            String taskLogs;
            try {
                taskLogs = RequestManager.getInstance()
                        .getApplicationTaskLogs(project);
            } catch (Exception e) {
                Logger.exception("Failed to get application task logs", e);
                taskLogs = "Failed to get application task logs";
            }

            String message = String.format(DIALOG_STATUS_MESSAGE,
                    status.getStatus());
            Util.showInfoDialog(status.getStatus(), message, taskLogs,
                    window.getShell());
        }

        return 0;
    }
}
