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

/**
 * Locale specific text values
 * 
 * @author Farhan Arshad
 */
public interface Resources {
    // Huawei Preferences Page
    static final String PREFERENCES_HUAWEI_DESCRIPTION = Activator
            .getResourceString("preferences.huawei.description");

    static final String PREFERENCES_HUAWEI_SELECT_REGION = Activator
            .getResourceString("preferences.huawei.selectRegion");

    static final String PREFERENCES_HUAWEI_USERNAME = Activator
            .getResourceString("preferences.huawei.username");

    static final String PREFERENCES_HUAWEI_PASSWORD = Activator
            .getResourceString("preferences.huawei.password");

    static final String PREFERENCES_HUAWEI_DOMAIN = Activator
            .getResourceString("preferences.huawei.domain");
    
    static final String PREFERENCES_HUAWEI_RESET_TOKEN = Activator
            .getResourceString("preferences.huawei.resetToken");
    
    static final String PREFERENCES_HUAWEI_TEST_TOKEN = Activator
            .getResourceString("preferences.huawei.testConnection");
    
    // App Wizard Page
    static final String WIZARD_APP_PAGE_PAGE_NAME = Activator
            .getResourceString("wizard.appPage.pageName");

    static final String WIZARD_APP_PAGE_TITLE = Activator
            .getResourceString("wizard.appPage.title");

    static final String WIZARD_APP_PAGE_DESCRIPTION = Activator
            .getResourceString("wizard.appPage.description");

    static final String WIZARD_APP_PAGE_SERVICE_INSTANCE_GROUP_NAME = Activator
            .getResourceString("wizard.appPage.serviceInstanceGroupName");

    static final String WIZARD_APP_PAGE_SERVICE_INSTANCE_ID = Activator
            .getResourceString("wizard.appPage.serviceInstanceId");

    static final String WIZARD_APP_PAGE_APPLICATION_GROUP_NAME = Activator
            .getResourceString("wizard.appPage.applicationGroupName");

    static final String WIZARD_APP_PAGE_APP_NAME = Activator
            .getResourceString("wizard.appPage.appName");

    static final String WIZARD_APP_PAGE_APP_DISPLAY_NAME = Activator
            .getResourceString("wizard.appPage.appDisplayName");

    static final String WIZARD_APP_PAGE_APP_VERSION = Activator
            .getResourceString("wizard.appPage.appVersion");

    static final String WIZARD_APP_PAGE_APP_DESCRIPTION = Activator
            .getResourceString("wizard.appPage.appDescription");

    static final String WIZARD_APP_PAGE_APP_TYPE = Activator
            .getResourceString("wizard.appPage.appType");

    static final String WIZARD_APP_PAGE_APP_TYPE_ERROR = Activator
            .getResourceString("wizard.appPage.appTypeError");

    static final String WIZARD_APP_PAGE_APP_CATEGORY = Activator
            .getResourceString("wizard.appPage.appCategory");

    static final String WIZARD_APP_PAGE_APP_CATEGORY_ERROR = Activator
            .getResourceString("wizard.appPage.appCategoryError");

    static final String WIZARD_APP_PAGE_PLATFORM_GROUP_NAME = Activator
            .getResourceString("wizard.appPage.platformGroupName");

    static final String WIZARD_APP_PAGE_APP_CLUSTER = Activator
            .getResourceString("wizard.appPage.appCluster");

    static final String WIZARD_APP_PAGE_APP_CLUSTER_ERROR = Activator
            .getResourceString("wizard.appPage.appClusterError");

    static final String WIZARD_APP_PAGE_APP_CLUSTER_NAMESPACE = Activator
            .getResourceString("wizard.appPage.appClusterNamespace");

    static final String WIZARD_APP_PAGE_APP_CLUSTER_NAMESPACE_ERROR = Activator
            .getResourceString("wizard.appPage.appClusterNamespaceError");

    static final String WIZARD_APP_PAGE_APP_ELB = Activator
            .getResourceString("wizard.appPage.appElb");

    static final String WIZARD_APP_PAGE_APP_ELB_ERROR = Activator
            .getResourceString("wizard.appPage.appElbError");

    static final String WIZARD_APP_PAGE_APP_VPC = Activator
            .getResourceString("wizard.appPage.appVpc");

    static final String WIZARD_APP_PAGE_APP_VPC_ERROR = Activator
            .getResourceString("wizard.appPage.appVpcError");

    static final String WIZARD_APP_PAGE_APP_SUBNET = Activator
            .getResourceString("wizard.appPage.appSubnet");

    static final String WIZARD_APP_PAGE_APP_SUBNET_ERROR = Activator
            .getResourceString("wizard.appPage.appSubnetError");

    static final String WIZARD_APP_PAGE_APP_SIZE = Activator
            .getResourceString("wizard.appPage.appSize");

    static final String WIZARD_APP_PAGE_APP_SIZE_ERROR = Activator
            .getResourceString("wizard.appPage.appSizeError");

    static final String WIZARD_APP_PAGE_APP_REPLICAS = Activator
            .getResourceString("wizard.appPage.appReplicas");

    static final String WIZARD_APP_PAGE_PORT = Activator
            .getResourceString("wizard.appPage.port");

    static final String WIZARD_APP_PAGE_APP_GROUP = Activator
            .getResourceString("wizard.appPage.appGroup");
    
    static final String WIZARD_APP_PAGE_APP_GROUP_ERROR = Activator
            .getResourceString("wizard.appPage.appGroupError");
    
    static final String WIZARD_SRC_PAGE_SWR_GROUP_NAME = Activator
            .getResourceString("wizard.srcPage.swrGroupName");

    static final String WIZARD_SRC_PAGE_SWR_REPO = Activator
            .getResourceString("wizard.srcPage.swrRepo");

    static final String WIZARD_APP_PAGE_SWR_REPO_ERROR = Activator
            .getResourceString("wizard.appPage.swrRepoError");

    // Services Wizard Page
    static final String WIZARD_SERVICES_PAGE_PAGE_NAME = Activator
            .getResourceString("wizard.servicesPage.pageName");

    static final String WIZARD_SERVICES_PAGE_TITLE = Activator
            .getResourceString("wizard.servicesPage.title");

    static final String WIZARD_SERVICES_PAGE_DESCRIPTION = Activator
            .getResourceString("wizard.servicesPage.description");

    static final String WIZARD_SERVICES_PAGE_DCS_GROUP_NAME = Activator
            .getResourceString("wizard.servicesPage.dcsGroupName");

    static final String WIZARD_SERVICES_PAGE_DCS_INSTANCE = Activator
            .getResourceString("wizard.servicesPage.dcsInstance");

    static final String WIZARD_SERVICES_PAGE_DCS_ERROR = Activator
            .getResourceString("wizard.servicesPage.dcsError");

    static final String WIZARD_SERVICES_PAGE_DCS_PASSWORD = Activator
            .getResourceString("wizard.servicesPage.dcsPassword");

    static final String WIZARD_SERVICES_PAGE_RDS_GROUP_NAME = Activator
            .getResourceString("wizard.servicesPage.rdsGroupName");

    static final String WIZARD_SERVICES_PAGE_RDS_INSTANCE = Activator
            .getResourceString("wizard.servicesPage.rdsInstance");

    static final String WIZARD_SERVICES_PAGE_RDS_ERROR = Activator
            .getResourceString("wizard.servicesPage.rdsError");

    static final String WIZARD_SERVICES_PAGE_RDS_CONNECTION_TYPE = Activator
            .getResourceString("wizard.servicesPage.rdsConnectionType");

    static final String WIZARD_SERVICES_PAGE_RDS_DB_NAME = Activator
            .getResourceString("wizard.servicesPage.rdsDbName");

    static final String WIZARD_SERVICES_PAGE_RDS_DB_USER = Activator
            .getResourceString("wizard.servicesPage.rdsDbUser");

    static final String WIZARD_SERVICES_PAGE_RDS_DB_PASSWORD = Activator
            .getResourceString("wizard.servicesPage.rdsDbPassword");

    // Ext Params Wizard Page
    static final String WIZARD_EXT_PARAMS_PAGE_PAGE_NAME = Activator
            .getResourceString("wizard.extParamsPage.pageName");

    static final String WIZARD_EXT_PARAMS_PAGE_TITLE = Activator
            .getResourceString("wizard.extParamsPage.title");

    static final String WIZARD_EXT_PARAMS_PAGE_DESCRIPTION = Activator
            .getResourceString("wizard.extParamsPage.description");

    // Dialogs
    static final String DIALOG_NO_SETTINGS_FILE_TITLE = Activator
            .getResourceString("dialog.noSettingsFileTitle");

    static final String DIALOG_NO_SETTINGS_FILE_MESSAGE = Activator
            .getResourceString("dialog.noSettingsFileMessage");

    static final String DIALOG_NO_RESOURCE_SELECTED_TITLE = Activator
            .getResourceString("dialog.noResourceSelectedTitle");

    static final String DIALOG_NO_RESOURCE_SELECTED_MESSAGE = Activator
            .getResourceString("dialog.noResourceSelectedMessage");

    static final String DIALOG_NO_FILE_SELECTED_MESSAGE = Activator
            .getResourceString("dialog.noFileSelectedMessage");

    static final String DIALOG_DEPLOY_TITLE = Activator
            .getResourceString("dialog.deploy.title");

    static final String DIALOG_DEPLOY_MESSAGE = Activator
            .getResourceString("dialog.deploy.message");

    static final String DIALOG_STATUS_ERROR = Activator
            .getResourceString("dialog.status.error");

    static final String DIALOG_STATUS_MESSAGE = Activator
            .getResourceString("dialog.status.message");

    static final String DIALOG_STATUS_URLMESSAGE = Activator
            .getResourceString("dialog.status.urlMessage");
    
    static final String DIALOG_INVALID_SERVICE_INSTANCE_ID_MESSAGE = Activator
            .getResourceString("dialog.invalidServiceInstanceId.message");

    // Jobs
    static final String JOB_DEPLOY_NAME = Activator
            .getResourceString("job.deploy.name");

    static final String JOB_DEPLOY_UPLOAD = Activator
            .getResourceString("job.deploy.upload");

    static final String JOB_DEPLOY_UPLOAD_FAILED = Activator
            .getResourceString("job.deploy.upload.failed");

    static final String JOB_DEPLOY_DEPLOY = Activator
            .getResourceString("job.deploy.deploy");

    static final String JOB_DEPLOY_DEPLOY_FAILED = Activator
            .getResourceString("job.deploy.deploy.failed");

    static final String JOB_DEPLOY_MONITOR_TIMEOUT = Activator
            .getResourceString("job.deploy.monitor.timeout");

    static final String JOB_DEPLOY_MONITOR_ERROR = Activator
            .getResourceString("job.deploy.monitor.error");

    static final String JOB_DEPLOY_URL = Activator
            .getResourceString("job.deploy.url");

    static final String JOB_DEPLOY_URL_FAILED = Activator
            .getResourceString("job.deploy.url.failed");

    static final String JOB_DEPLOY_SUCCESSFUL = Activator
            .getResourceString("job.deploy.successful");

    static final String JOB_DEPLOY_SUCCESSFUL_NO_URL = Activator
            .getResourceString("job.deploy.successfulNoUrl");
    
    
    static final String PROGRESS_TASK_GET_SIZE = Activator
            .getResourceString("monitor.task.size");
    static final String PROGRESS_TASK_GET_ELB = Activator
            .getResourceString("monitor.task.elb");
    static final String PROGRESS_TASK_GET_VPC = Activator
            .getResourceString("monitor.task.vpc");
    static final String PROGRESS_TASK_GET_DCS = Activator
            .getResourceString("monitor.task.dcs");
    static final String PROGRESS_TASK_GET_RDS = Activator
            .getResourceString("monitor.task.rds");
    static final String PROGRESS_TASK_GET_REGIONS = Activator
            .getResourceString("monitor.task.region");
    static final String PROGRESS_TASK_GET_TYPE = Activator
            .getResourceString("monitor.task.type");
    static final String PROGRESS_TASK_GET_REPOS = Activator
            .getResourceString("monitor.task.repos");


    // General
    static final String INFO = Activator.getResourceString("info");

    static final String ERROR = Activator.getResourceString("error");

    static final String SUCCESSFUL = Activator.getResourceString("successful");

    static final String FAILED = Activator.getResourceString("failed");

    static final String SEE_DETAILS = Activator.getResourceString("seeDetails");

}
