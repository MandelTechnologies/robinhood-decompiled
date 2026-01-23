package com.singular.sdk.internal;

import com.singular.sdk.SingularConfig;
import com.singular.sdk.internal.Api;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ApiCustomUserId extends BaseApi {
    private static final SingularLog logger = SingularLog.getLogger(ApiCustomUserId.class.getSimpleName());
    static final String path = "/set_device_for_custom_id";

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ long getTimestamp() {
        return super.getTimestamp();
    }

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ String getType() {
        return super.getType();
    }

    @Override // com.singular.sdk.internal.BaseApi
    public /* bridge */ /* synthetic */ String getUrl() {
        return super.getUrl();
    }

    @Override // com.singular.sdk.internal.BaseApi
    public /* bridge */ /* synthetic */ boolean isAdmonEvent() {
        return super.isAdmonEvent();
    }

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ boolean makeRequest(SingularInstance singularInstance) throws IOException {
        return super.makeRequest(singularInstance);
    }

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ String toJsonAsString() {
        return super.toJsonAsString();
    }

    public ApiCustomUserId(long j) {
        super(Constants.API_TYPE_CUSTOM_USER_ID, j);
    }

    @Override // com.singular.sdk.internal.Api
    public String getPath() {
        return path;
    }

    @Override // com.singular.sdk.internal.Api
    public Api.OnApiCallback getOnApiCallback() {
        return new OnSetCustomUserIdCallback();
    }

    public class OnSetCustomUserIdCallback implements Api.OnApiCallback {
        public OnSetCustomUserIdCallback() {
        }

        @Override // com.singular.sdk.internal.Api.OnApiCallback
        public boolean handle(SingularInstance singularInstance, int i, String str) {
            if (i != 200) {
                return false;
            }
            try {
                return new JSONObject(str).optString("status", "").equalsIgnoreCase("ok");
            } catch (JSONException e) {
                ApiCustomUserId.logger.error("error in handle()", e);
                return false;
            }
        }
    }

    static class Params extends SingularParamsBase {
        private Params() {
        }

        static Params build(SingularInstance singularInstance) {
            return new Params().withSingularConfig(singularInstance.getSingularConfig()).withDeviceInfo(singularInstance);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.singular.sdk.internal.SingularParamsBase
        public Params withSingularConfig(SingularConfig singularConfig) {
            super.withSingularConfig(singularConfig);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
        @Override // com.singular.sdk.internal.SingularParamsBase
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Params withDeviceInfo(SingularInstance singularInstance) {
            super.withDeviceInfo(singularInstance);
            DeviceInfo deviceInfo = singularInstance.getDeviceInfo();
            put(Constants.RequestParamsKeys.SDK_VERSION_KEY, deviceInfo.sdkVersion);
            put("av", deviceInfo.appVersion);
            put(Constants.RequestParamsKeys.APP_NAME_KEY, deviceInfo.appName);
            String str = "0";
            if (deviceInfo.isGooglePlayServicesAvailable) {
                if (deviceInfo.isLimitedTrackingEnabled) {
                    str = Constants.SdidMigrationStatusCodes.ALREADY_SDID;
                }
            } else if (!deviceInfo.isAmazonAvailable) {
                str = "-1";
            } else if (deviceInfo.isLimitedTrackingEnabled) {
            }
            put("dnt", str);
            put(Constants.CUSTOM_USER_ID_KEY, deviceInfo.customUserId);
            return this;
        }
    }
}
