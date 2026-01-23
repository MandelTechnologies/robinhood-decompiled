package io.branch.referral;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.Branch;
import io.branch.referral.validators.DeepLinkRoutingValidator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes21.dex */
abstract class ServerRequestInitSession extends ServerRequest {
    private final Context context_;

    public abstract String getRequestActionName();

    @Override // io.branch.referral.ServerRequest
    protected boolean shouldUpdateLimitFacebookTracking() {
        return true;
    }

    ServerRequestInitSession(Context context, String str) {
        super(context, str);
        this.context_ = context;
    }

    ServerRequestInitSession(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.context_ = context;
    }

    @Override // io.branch.referral.ServerRequest
    protected void setPost(JSONObject jSONObject) throws JSONException {
        super.setPost(jSONObject);
        String appVersion = DeviceInfo.getInstance().getAppVersion();
        if (!DeviceInfo.isNullOrEmptyOrBlank(appVersion)) {
            jSONObject.put(Defines$Jsonkey.AppVersion.getKey(), appVersion);
        }
        jSONObject.put(Defines$Jsonkey.FaceBookAppLinkChecked.getKey(), this.prefHelper_.getIsAppLinkTriggeredInit());
        jSONObject.put(Defines$Jsonkey.IsReferrable.getKey(), this.prefHelper_.getIsReferrable());
        jSONObject.put(Defines$Jsonkey.Debug.getKey(), Branch.isDeviceIDFetchDisabled());
        updateInstallStateAndTimestamps(jSONObject);
        updateEnvironment(this.context_, jSONObject);
    }

    static boolean isInitSessionAction(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase("install");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean handleBranchViewIfAvailable(ServerResponse serverResponse) {
        if (serverResponse == null || serverResponse.getObject() == null) {
            return false;
        }
        JSONObject object = serverResponse.getObject();
        Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.BranchViewData;
        if (!object.has(defines$Jsonkey.getKey())) {
            return false;
        }
        try {
            JSONObject jSONObject = serverResponse.getObject().getJSONObject(defines$Jsonkey.getKey());
            String requestActionName = getRequestActionName();
            if (Branch.getInstance().getCurrentActivity() != null) {
                Activity currentActivity = Branch.getInstance().getCurrentActivity();
                if (currentActivity instanceof Branch.IBranchViewControl ? true ^ ((Branch.IBranchViewControl) currentActivity).skipBranchViewsOnThisActivity() : true) {
                    return BranchViewHandler.getInstance().showBranchView(jSONObject, requestActionName, currentActivity, Branch.getInstance());
                }
                return BranchViewHandler.getInstance().markInstallOrOpenBranchViewPending(jSONObject, requestActionName);
            }
            return BranchViewHandler.getInstance().markInstallOrOpenBranchViewPending(jSONObject, requestActionName);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void onRequestSucceeded(ServerResponse serverResponse, Branch branch) throws InterruptedException {
        Branch.getInstance().unlockSDKInitWaitLock();
        this.prefHelper_.setLinkClickIdentifier("bnc_no_value");
        this.prefHelper_.setGoogleSearchInstallIdentifier("bnc_no_value");
        this.prefHelper_.setGooglePlayReferrer("bnc_no_value");
        this.prefHelper_.setExternalIntentUri("bnc_no_value");
        this.prefHelper_.setExternalIntentExtra("bnc_no_value");
        this.prefHelper_.setAppLink("bnc_no_value");
        this.prefHelper_.setPushIdentifier("bnc_no_value");
        this.prefHelper_.setIsAppLinkTriggeredInit(Boolean.FALSE);
        this.prefHelper_.setInstallReferrerParams("bnc_no_value");
        this.prefHelper_.setIsFullAppConversion(false);
        if (this.prefHelper_.getLong("bnc_previous_update_time") == 0) {
            PrefHelper prefHelper = this.prefHelper_;
            prefHelper.setLong("bnc_previous_update_time", prefHelper.getLong("bnc_last_known_update_time"));
        }
    }

    void onInitSessionCompleted(ServerResponse serverResponse, Branch branch) {
        DeepLinkRoutingValidator.validate(branch.currentActivityReference_);
        branch.updateSkipURLFormats();
    }

    void updateLinkReferrerParams() {
        String linkClickIdentifier = this.prefHelper_.getLinkClickIdentifier();
        if (!linkClickIdentifier.equals("bnc_no_value")) {
            try {
                getPost().put(Defines$Jsonkey.LinkIdentifier.getKey(), linkClickIdentifier);
                getPost().put(Defines$Jsonkey.FaceBookAppLinkChecked.getKey(), this.prefHelper_.getIsAppLinkTriggeredInit());
            } catch (JSONException unused) {
            }
        }
        String googleSearchInstallIdentifier = this.prefHelper_.getGoogleSearchInstallIdentifier();
        if (!googleSearchInstallIdentifier.equals("bnc_no_value")) {
            try {
                getPost().put(Defines$Jsonkey.GoogleSearchInstallReferrer.getKey(), googleSearchInstallIdentifier);
            } catch (JSONException unused2) {
            }
        }
        String googlePlayReferrer = this.prefHelper_.getGooglePlayReferrer();
        if (!googlePlayReferrer.equals("bnc_no_value")) {
            try {
                getPost().put(Defines$Jsonkey.GooglePlayInstallReferrer.getKey(), googlePlayReferrer);
            } catch (JSONException unused3) {
            }
        }
        if (this.prefHelper_.isFullAppConversion()) {
            try {
                getPost().put(Defines$Jsonkey.AndroidAppLinkURL.getKey(), this.prefHelper_.getAppLink());
                getPost().put(Defines$Jsonkey.IsFullAppConv.getKey(), true);
            } catch (JSONException unused4) {
            }
        }
    }

    @Override // io.branch.referral.ServerRequest
    public void onPreExecute() {
        JSONObject post = getPost();
        try {
            if (!this.prefHelper_.getAppLink().equals("bnc_no_value")) {
                post.put(Defines$Jsonkey.AndroidAppLinkURL.getKey(), this.prefHelper_.getAppLink());
            }
            if (!this.prefHelper_.getPushIdentifier().equals("bnc_no_value")) {
                post.put(Defines$Jsonkey.AndroidPushIdentifier.getKey(), this.prefHelper_.getPushIdentifier());
            }
            if (!this.prefHelper_.getExternalIntentUri().equals("bnc_no_value")) {
                post.put(Defines$Jsonkey.External_Intent_URI.getKey(), this.prefHelper_.getExternalIntentUri());
            }
            if (!this.prefHelper_.getExternalIntentExtra().equals("bnc_no_value")) {
                post.put(Defines$Jsonkey.External_Intent_Extra.getKey(), this.prefHelper_.getExternalIntentExtra());
            }
        } catch (JSONException unused) {
        }
        Branch.expectDelayedSessionInitialization(false);
    }

    private void updateInstallStateAndTimestamps(JSONObject jSONObject) throws JSONException {
        String appVersion = DeviceInfo.getInstance().getAppVersion();
        long firstInstallTime = DeviceInfo.getInstance().getFirstInstallTime();
        long lastUpdateTime = DeviceInfo.getInstance().getLastUpdateTime();
        if ("bnc_no_value".equals(this.prefHelper_.getAppVersion())) {
            i = lastUpdateTime - firstInstallTime < 86400000 ? 0 : 2;
            if (isTuneMigration()) {
                i = 5;
            }
        } else if (this.prefHelper_.getAppVersion().equals(appVersion)) {
            i = 1;
        }
        jSONObject.put(Defines$Jsonkey.Update.getKey(), i);
        jSONObject.put(Defines$Jsonkey.FirstInstallTime.getKey(), firstInstallTime);
        jSONObject.put(Defines$Jsonkey.LastUpdateTime.getKey(), lastUpdateTime);
        long j = this.prefHelper_.getLong("bnc_original_install_time");
        if (j == 0) {
            this.prefHelper_.setLong("bnc_original_install_time", firstInstallTime);
        } else {
            firstInstallTime = j;
        }
        jSONObject.put(Defines$Jsonkey.OriginalInstallTime.getKey(), firstInstallTime);
        long j2 = this.prefHelper_.getLong("bnc_last_known_update_time");
        if (j2 < lastUpdateTime) {
            this.prefHelper_.setLong("bnc_previous_update_time", j2);
            this.prefHelper_.setLong("bnc_last_known_update_time", lastUpdateTime);
        }
        jSONObject.put(Defines$Jsonkey.PreviousUpdateTime.getKey(), this.prefHelper_.getLong("bnc_previous_update_time"));
    }

    private boolean isTuneMigration() {
        return !TextUtils.isEmpty(this.context_.getApplicationContext().getSharedPreferences("com.mobileapptracking", 0).getString("mat_id", null));
    }

    @Override // io.branch.referral.ServerRequest
    protected boolean prepareExecuteWithoutTracking() {
        JSONObject post = getPost();
        if (post.has(Defines$Jsonkey.AndroidAppLinkURL.getKey()) || post.has(Defines$Jsonkey.AndroidPushIdentifier.getKey()) || post.has(Defines$Jsonkey.LinkIdentifier.getKey())) {
            post.remove(Defines$Jsonkey.DeviceFingerprintID.getKey());
            post.remove(Defines$Jsonkey.IdentityID.getKey());
            post.remove(Defines$Jsonkey.FaceBookAppLinkChecked.getKey());
            post.remove(Defines$Jsonkey.External_Intent_Extra.getKey());
            post.remove(Defines$Jsonkey.External_Intent_URI.getKey());
            post.remove(Defines$Jsonkey.FirstInstallTime.getKey());
            post.remove(Defines$Jsonkey.LastUpdateTime.getKey());
            post.remove(Defines$Jsonkey.OriginalInstallTime.getKey());
            post.remove(Defines$Jsonkey.PreviousUpdateTime.getKey());
            post.remove(Defines$Jsonkey.InstallBeginTimeStamp.getKey());
            post.remove(Defines$Jsonkey.ClickedReferrerTimeStamp.getKey());
            post.remove(Defines$Jsonkey.HardwareID.getKey());
            post.remove(Defines$Jsonkey.IsHardwareIDReal.getKey());
            post.remove(Defines$Jsonkey.LocalIP.getKey());
            try {
                post.put(Defines$Jsonkey.TrackingDisabled.getKey(), true);
            } catch (JSONException unused) {
            }
            return true;
        }
        return super.prepareExecuteWithoutTracking();
    }
}
