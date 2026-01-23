package com.singular.sdk.internal;

import com.singular.sdk.SingularConfig;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.DeviceIDManager;

/* loaded from: classes12.dex */
public class SingularParamsBase extends SingularMap {
    protected SingularParamsBase() {
    }

    protected SingularParamsBase withDeviceInfo(SingularInstance singularInstance) {
        return withDeviceInfo(singularInstance, false);
    }

    protected SingularParamsBase withDeviceInfo(SingularInstance singularInstance, boolean z) {
        DeviceInfo deviceInfo = singularInstance.getDeviceInfo();
        SingularConfig singularConfig = singularInstance.getSingularConfig();
        put(Constants.RequestParamsKeys.PACKAGE_NAME_KEY, deviceInfo.packageName);
        put(Constants.RequestParamsKeys.PLATFORM_KEY, deviceInfo.platform);
        if (singularConfig.limitAdvertisingIdentifiers.booleanValue()) {
            put(Constants.LimitedAdvertisingIdentifiers.LIMITED_ADVERTISING_IDENTIFIERS_STATUS, Constants.SdidMigrationStatusCodes.ALREADY_SDID);
        }
        DeviceIDManager.SdidModel actualSdid = DeviceIDManager.getInstance().getActualSdid(ConfigManager.getInstance(), singularInstance.getContext());
        if (DeviceIDManager.getInstance().wasCustomSdidProvided() && !ConfigManager.getInstance().isSetSdidEnabled()) {
            put(Constants.DID_SET_CUSTOM_SDID_KEY, "0");
        }
        if (shouldUseSdid(singularInstance, z, actualSdid)) {
            put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.UPPERCASE_SDID_KEY);
            put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, actualSdid.getValue());
            tryPutAifaOrAsid(deviceInfo, singularConfig);
            if (DeviceIDManager.getInstance().wasCustomSdidProvided() && actualSdid.getSource() == DeviceIDManager.SdidModel.SdidSource.custom) {
                put(Constants.DID_SET_CUSTOM_SDID_KEY, Constants.SdidMigrationStatusCodes.ALREADY_SDID);
                return this;
            }
        } else {
            if (!Utils.isEmptyOrNull(deviceInfo.amid)) {
                put(Constants.DeviceIdentifierKeyspaceKeys.AMID_KEYSPACE_KEY, deviceInfo.amid);
                put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.DeviceIdentifierKeyspaceValues.AMID_KEYSPACE_VALUE);
                put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.amid);
                tryPutAifaOrAsid(deviceInfo, singularConfig);
                return this;
            }
            if (!Utils.isEmptyOrNull(deviceInfo.aifa) && !singularConfig.limitAdvertisingIdentifiers.booleanValue()) {
                put(Constants.DeviceIdentifierKeyspaceKeys.AIFA_KEYSPACE_KEY, deviceInfo.aifa);
                put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.DeviceIdentifierKeyspaceValues.AIFA_KEYSPACE_VALUE);
                put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.aifa);
                return this;
            }
            if (!Utils.isEmptyOrNull(deviceInfo.oaid)) {
                put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.DeviceIdentifierKeyspaceValues.OAID_KEYSPACE_VALUE);
                put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.oaid);
                put(Constants.DeviceIdentifierKeyspaceKeys.OAID_KEYSPACE_KEY, deviceInfo.oaid);
                if (!Utils.isEmptyOrNull(deviceInfo.asid)) {
                    put(Constants.DeviceIdentifierKeyspaceKeys.ASID_KEYSPACE_KEY, deviceInfo.asid);
                    return this;
                }
            } else {
                if (!Utils.isEmptyOrNull(deviceInfo.imei) && !singularConfig.limitAdvertisingIdentifiers.booleanValue()) {
                    put(Constants.DeviceIdentifierKeyspaceKeys.IMEI_KEYSPACE_KEY, deviceInfo.imei);
                    put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.DeviceIdentifierKeyspaceValues.IMEI_KEYSPACE_VALUE);
                    put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.imei);
                    return this;
                }
                if (!Utils.isEmptyOrNull(deviceInfo.asid)) {
                    put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.DeviceIdentifierKeyspaceValues.ASID_KEYSPACE_VALUE);
                    put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.asid);
                    put(Constants.DeviceIdentifierKeyspaceKeys.ASID_KEYSPACE_KEY, deviceInfo.asid);
                    return this;
                }
                if (!Utils.isEmptyOrNull(deviceInfo.andi) && !singularConfig.limitAdvertisingIdentifiers.booleanValue()) {
                    put(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, Constants.DeviceIdentifierKeyspaceValues.ANDI_KEYSPACE_VALUE);
                    put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.andi);
                    put(Constants.DeviceIdentifierKeyspaceKeys.ANDI_KEYSPACE_KEY, deviceInfo.andi);
                }
            }
        }
        return this;
    }

    private void tryPutAifaOrAsid(DeviceInfo deviceInfo, SingularConfig singularConfig) {
        if (!Utils.isEmptyOrNull(deviceInfo.aifa) && !singularConfig.limitAdvertisingIdentifiers.booleanValue()) {
            put(Constants.DeviceIdentifierKeyspaceKeys.AIFA_KEYSPACE_KEY, deviceInfo.aifa);
        } else {
            if (Utils.isEmptyOrNull(deviceInfo.asid)) {
                return;
            }
            put(Constants.DeviceIdentifierKeyspaceKeys.ASID_KEYSPACE_KEY, deviceInfo.asid);
        }
    }

    private static boolean shouldUseSdid(SingularInstance singularInstance, boolean z, DeviceIDManager.SdidModel sdidModel) {
        if (sdidModel == null || Utils.isEmptyOrNull(sdidModel.getValue())) {
            return false;
        }
        return z || DeviceIDManager.getInstance().didSendStartSessionWithSdid(singularInstance.getContext());
    }

    protected SingularParamsBase withSingularConfig(SingularConfig singularConfig) {
        put(Constants.RequestParamsKeys.DEVELOPER_API_KEY, singularConfig.apiKey);
        return this;
    }
}
