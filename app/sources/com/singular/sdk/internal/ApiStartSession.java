package com.singular.sdk.internal;

import android.net.Uri;
import com.singular.sdk.SingularConfig;
import com.singular.sdk.SingularLinkParams;
import com.singular.sdk.internal.Api;
import com.singular.sdk.internal.ApiSubmitEvent;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.LicenseApiHelper;
import com.singular.sdk.internal.utils.UriUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ApiStartSession extends BaseApi {
    private static final int LICENSE_RETRY_INTERVAL_MS = 3000;
    private static final SingularLog logger = SingularLog.getLogger(ApiStartSession.class.getSimpleName());
    static final String path = "/start";
    private int licenseAttemptsCounter;

    static /* synthetic */ int access$108(ApiStartSession apiStartSession) {
        int i = apiStartSession.licenseAttemptsCounter;
        apiStartSession.licenseAttemptsCounter = i + 1;
        return i;
    }

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

    ApiStartSession(long j) {
        super(Constants.API_TYPE_SESSION_START, j);
        this.licenseAttemptsCounter = 0;
        this.canUseSdidBeforeStartSessionWasSentWithSdid = true;
    }

    private class ApiStartSessionConstants {
        static final String STRING_REFERRER = "referrer";

        private ApiStartSessionConstants() {
        }
    }

    @Override // com.singular.sdk.internal.Api
    public String getPath() {
        return path;
    }

    @Override // com.singular.sdk.internal.Api
    public Api.OnApiCallback getOnApiCallback() {
        return new OnSessionStartCallback();
    }

    public class OnSessionStartCallback implements Api.OnApiCallback {
        /* JADX INFO: Access modifiers changed from: private */
        public boolean isLicenseResponseValid(int i) {
            return (i == -1 || i == 257 || i == 4) ? false : true;
        }

        public OnSessionStartCallback() {
        }

        @Override // com.singular.sdk.internal.Api.OnApiCallback
        public boolean handle(SingularInstance singularInstance, int i, String str) {
            String str2;
            if (i != 200) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.optString("status", "").equalsIgnoreCase("ok")) {
                    return false;
                }
                if (ApiStartSession.this.containsKey(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY) && ApiStartSession.this.get(Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY).equalsIgnoreCase(Constants.UPPERCASE_SDID_KEY) && !DeviceIDManager.getInstance().didSendStartSessionWithSdid(singularInstance.getContext())) {
                    DeviceIDManager.getInstance().setDidSendStartSessionWithSdidTrue(singularInstance.getContext());
                }
                String strOptString = jSONObject.optString("ddl", null);
                String strOptString2 = jSONObject.optString("deferred_passthrough", null);
                if (!Utils.isOpenedWithDeeplink() && (!Utils.isEmptyOrNull(strOptString) || !Utils.isEmptyOrNull(strOptString2))) {
                    handleDDL(singularInstance, strOptString, strOptString2);
                }
                String strOptString3 = jSONObject.optString(Constants.RESOLVED_SINGULAR_LINK, null);
                if (!Utils.isEmptyOrNull(strOptString3) && (str2 = ApiStartSession.this.get(Constants.SINGULAR_LINK_RESOLVE_REQUIRED)) != null && Boolean.parseBoolean(str2) && Utils.lagSince(ApiStartSession.this.getTimestamp()) < SingularInstance.getInstance().getSingularConfig().shortlinkTimeoutSec) {
                    Utils.handleSingularLink(Uri.parse(strOptString3));
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.DEVICE_ATTRIBUTION_INFO_KEY);
                if (jSONObjectOptJSONObject != null) {
                    singularInstance.handleDeviceAttributionData(jSONObjectOptJSONObject);
                }
                String str3 = ApiStartSession.this.get(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY);
                if (Utils.isEmptyOrNull(str3) || Utils.isLicenseRetrieved(singularInstance.getContext(), str3)) {
                    return true;
                }
                Utils.saveLicenseInfo(singularInstance.getContext(), str3);
                performLicenseCheck(singularInstance, str3);
                return true;
            } catch (JSONException e) {
                ApiStartSession.logger.error("error in handle()", e);
                return false;
            }
        }

        /* renamed from: com.singular.sdk.internal.ApiStartSession$OnSessionStartCallback$1 */
        class RunnableC423551 implements Runnable {
            final /* synthetic */ String val$identifier;
            final /* synthetic */ SingularInstance val$singular;

            RunnableC423551(SingularInstance singularInstance, String str) {
                this.val$singular = singularInstance;
                this.val$identifier = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                ApiStartSession.access$108(ApiStartSession.this);
                LicenseApiHelper.checkLicense(this.val$singular.getContext(), new LicenseApiHelper.LicenseResultHandler() { // from class: com.singular.sdk.internal.ApiStartSession.OnSessionStartCallback.1.1
                    @Override // com.singular.sdk.internal.LicenseApiHelper.LicenseResultHandler
                    public void handle(final int i, final String str, final String str2) {
                        new Thread(new Runnable() { // from class: com.singular.sdk.internal.ApiStartSession.OnSessionStartCallback.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    if (!OnSessionStartCallback.this.isLicenseResponseValid(i) && ApiStartSession.this.licenseAttemptsCounter < 3) {
                                        Thread.sleep(ApiStartSession.this.licenseAttemptsCounter * 3000);
                                        RunnableC423551 runnableC423551 = RunnableC423551.this;
                                        OnSessionStartCallback.this.performLicenseCheck(runnableC423551.val$singular, runnableC423551.val$identifier);
                                    } else {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("responseCode", String.valueOf(i));
                                        jSONObject.put("signedData", str);
                                        jSONObject.put("signature", str2);
                                        RunnableC423551.this.val$singular.logEvent(new ApiSubmitEvent.RawEvent(LicenseApiHelper.LICENSING_EVENT_NAME, jSONObject.toString()));
                                    }
                                } catch (Throwable th) {
                                    ApiStartSession.logger.error("Error occurred while trying to send licensing status event", th);
                                }
                            }
                        }).start();
                    }
                });
            }
        }

        void performLicenseCheck(SingularInstance singularInstance, String str) {
            ApiStartSession.logger.debug("Trying to fetch license key from the Licensing Service");
            new Thread(new RunnableC423551(singularInstance, str)).start();
        }

        void handleDDL(SingularInstance singularInstance, final String str, String str2) {
            final SingularConfig.DDLHandler dDLHandler = singularInstance.getSingularConfig().ddlHandler;
            if (dDLHandler == null) {
                ApiStartSession.logger.error("DDLHandler is not configured, ignoring callback for url = %s", str);
                return;
            }
            if (Utils.lagSince(ApiStartSession.this.getTimestamp()) > dDLHandler.timeoutInSec) {
                ApiStartSession.logger.error("DDLHandler timedout. timeout = %dms", Long.valueOf(dDLHandler.timeoutInSec));
            } else {
                if (Utils.handleDeepLink(new SingularLinkParams(str, str2, true, Uri.parse(str))) || dDLHandler.handler == null) {
                    return;
                }
                Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.ApiStartSession.OnSessionStartCallback.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            dDLHandler.handler.handleLink(str);
                        } catch (Throwable th) {
                            ApiStartSession.logger.error("DDL handling failed: " + Utils.formatException(th));
                        }
                    }
                });
            }
        }
    }

    static class Params extends SingularParamsBase {
        private Params() {
        }

        static Params build(long j, SingularInstance singularInstance) {
            return new Params().withId(j).withSingularConfig(singularInstance.getSingularConfig()).withDeviceInfo(singularInstance).withConnectionType(Utils.getConnectionType(singularInstance.getContext())).withAppInstallInfo(singularInstance).withInstallReferrer(singularInstance).withDTInstallReferrer(singularInstance).withUtils();
        }

        private Params withInstallReferrer(SingularInstance singularInstance) {
            if (singularInstance.getIsFirstInstall()) {
                if (singularInstance.getGoogleInstallReferrer() != null) {
                    put("install_ref", new JSONObject((Map<?, ?>) singularInstance.getGoogleInstallReferrer()).toString());
                }
                put("install_ref_timeinterval", String.valueOf(singularInstance.getInstallReferrerTimeInterval()));
                HashMap map = new HashMap();
                if (singularInstance.getSamsungInstallReferrer() != null) {
                    map.putAll(singularInstance.getSamsungInstallReferrer());
                }
                if (singularInstance.getMetaInstallReferrer() != null) {
                    map.putAll(singularInstance.getMetaInstallReferrer());
                }
                put(Constants.RequestBody.INSTALL_REFERRER_KEY, new JSONObject((Map<?, ?>) map).toString());
            }
            return this;
        }

        private Params withDTInstallReferrer(SingularInstance singularInstance) {
            if (singularInstance.getIsFirstInstall() & (singularInstance.getDTInstallReferrer() != null)) {
                put(Constants.DT_INSTALL_REFERRER_KEY, singularInstance.getDTInstallReferrer());
            }
            return this;
        }

        private Params withUtils() {
            put("asid_timeinterval", String.valueOf(Utils.getASIDTimeInterval()));
            put("asid_scope", String.valueOf(Utils.getASIDScope()));
            String encryptedApiKey = Utils.getEncryptedApiKey();
            if (!Utils.isEmptyOrNull(encryptedApiKey)) {
                put("ek", encryptedApiKey);
            }
            return this;
        }

        private Params withId(long j) {
            put(Constants.RequestParamsKeys.SESSION_ID_KEY, String.valueOf(j));
            return this;
        }

        private Params withConnectionType(String str) {
            put("c", str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.singular.sdk.internal.SingularParamsBase
        public Params withSingularConfig(SingularConfig singularConfig) throws IOException {
            super.withSingularConfig(singularConfig);
            Uri uri = singularConfig.openUri;
            if (UriUtils.isValid(uri)) {
                put("ref", uri.getQueryParameter(com.adjust.sdk.Constants.REFERRER));
                put("extra", uri.getQuery());
            }
            Uri uriResolveESPLink = singularConfig.singularLink;
            if (SLPushNotificationsManager.getInstance().didAppOpenWithPushNotification().booleanValue()) {
                uriResolveESPLink = SLPushNotificationsManager.getInstance().getPushLink();
                put(Constants.PARAM_APP_OPENED_FROM_PUSH_NOTIFICATION, Constants.SdidMigrationStatusCodes.ALREADY_SDID);
            }
            if (singularConfig.ddlHandler != null || singularConfig.linkCallback != null) {
                put("ddl_enabled", "true");
                put("ddl_to", String.valueOf(singularConfig.ddlHandler.timeoutInSec));
            } else {
                put("ddl_enabled", "false");
            }
            if (UriUtils.isValid(uriResolveESPLink)) {
                String queryParameter = uriResolveESPLink.getQueryParameter(com.adjust.sdk.Constants.REFERRER);
                String query = uriResolveESPLink.getQuery();
                if (!Utils.isEmptyOrNull(queryParameter)) {
                    put("ref", queryParameter);
                }
                if (!Utils.isEmptyOrNull(query)) {
                    put("extra", query);
                }
                if (Utils.isESPLink(uriResolveESPLink)) {
                    put("esp_link", uriResolveESPLink.toString());
                    uriResolveESPLink = Utils.resolveESPLink(uriResolveESPLink);
                }
                if (Utils.validateSingularLink(uriResolveESPLink)) {
                    boolean zIsShortLink = Utils.isShortLink(uriResolveESPLink);
                    if (!zIsShortLink) {
                        Utils.handleSingularLink(uriResolveESPLink);
                    }
                    put(Constants.SINGULAR_LINK, uriResolveESPLink.toString());
                    put(Constants.SINGULAR_LINK_RESOLVE_TIMEOUT, String.valueOf(singularConfig.shortlinkTimeoutSec));
                    put(Constants.SINGULAR_LINK_RESOLVE_REQUIRED, String.valueOf(zIsShortLink));
                }
                singularConfig.singularLink = null;
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0055  */
        @Override // com.singular.sdk.internal.SingularParamsBase
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Params withDeviceInfo(SingularInstance singularInstance) {
            super.withDeviceInfo(singularInstance, true);
            DeviceInfo deviceInfo = singularInstance.getDeviceInfo();
            put("ab", deviceInfo.abi);
            put("av", deviceInfo.appVersion);
            put("br", deviceInfo.deviceBrand);
            put("de", deviceInfo.deviceBuild);
            put("ma", deviceInfo.deviceManufacturer);
            put("mo", deviceInfo.deviceModel);
            put(Constants.RequestParamsKeys.APP_NAME_KEY, deviceInfo.appName);
            put("pr", deviceInfo.buildProduct);
            put(Constants.RequestParamsKeys.SDK_VERSION_KEY, Utils.getSdkVersion(singularInstance));
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
            put("v", deviceInfo.osVersion);
            if (!Utils.isEmptyOrNull(deviceInfo.installSource)) {
                put("src", deviceInfo.installSource);
            }
            if (!Utils.isEmptyOrNull(deviceInfo.gcmRegId)) {
                put("ri", deviceInfo.gcmRegId);
            }
            if (!Utils.isEmptyOrNull(deviceInfo.fcmRegId)) {
                put("fi", deviceInfo.fcmRegId);
            }
            if (deviceInfo.hasPreloadCampaign()) {
                put("apc", deviceInfo.preloadCampaign);
                put("apg", deviceInfo.preloadGroup);
                put("aps", deviceInfo.preloadSource);
            }
            put("lc", Locale.getDefault().toString());
            put("install_time", Long.valueOf(deviceInfo.firstInstallTime).toString());
            put("update_time", Long.valueOf(deviceInfo.lastUpdateTime).toString());
            put("current_device_time", Long.valueOf(Utils.getCurrentTimeMillis()).toString());
            put("device_type", deviceInfo.deviceType);
            put(Constants.CUSTOM_USER_ID_KEY, deviceInfo.customUserId);
            if (!Utils.isEmptyOrNull(deviceInfo.deviceUserAgent)) {
                put("device_user_agent", deviceInfo.deviceUserAgent);
            }
            return this;
        }

        private Params withAppInstallInfo(SingularInstance singularInstance) {
            if (singularInstance.getIsFirstInstall()) {
                put("is", "true");
                return this;
            }
            put("is", "false");
            return this;
        }
    }
}
