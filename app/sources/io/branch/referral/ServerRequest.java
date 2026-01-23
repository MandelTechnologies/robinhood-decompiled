package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes21.dex */
public abstract class ServerRequest {
    private static final String[] initializationAndEventRoutes = {Defines$RequestPath.RegisterInstall.getPath(), Defines$RequestPath.RegisterOpen.getPath(), Defines$RequestPath.CompletedAction.getPath(), Defines$RequestPath.ContentEvent.getPath(), Defines$RequestPath.TrackStandardEvent.getPath(), Defines$RequestPath.TrackCustomEvent.getPath()};
    public boolean constructError_;
    private final Context context_;
    private final Set<PROCESS_WAIT_LOCK> locks_;
    private JSONObject params_;
    protected final PrefHelper prefHelper_;
    private long queueWaitTime_;
    private String requestPath_;
    boolean skipOnTimeOut;

    public enum BRANCH_API_VERSION {
        V1,
        V1_CPID,
        V1_LATD,
        V2
    }

    enum PROCESS_WAIT_LOCK {
        SDK_INIT_WAIT_LOCK,
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK,
        USER_SET_WAIT_LOCK
    }

    public abstract void clearCallbacks();

    public abstract boolean handleErrors(Context context);

    public abstract void handleFailure(int i, String str);

    public boolean isGAdsParamsRequired() {
        return true;
    }

    public abstract boolean isGetRequest();

    boolean isPersistable() {
        return true;
    }

    public void onPreExecute() {
    }

    public abstract void onRequestSucceeded(ServerResponse serverResponse, Branch branch);

    protected boolean prepareExecuteWithoutTracking() {
        return false;
    }

    public boolean shouldRetryOnFail() {
        return false;
    }

    protected boolean shouldUpdateLimitFacebookTracking() {
        return false;
    }

    public ServerRequest(Context context, String str) {
        this.queueWaitTime_ = 0L;
        this.constructError_ = false;
        this.skipOnTimeOut = false;
        this.context_ = context;
        this.requestPath_ = str;
        this.prefHelper_ = PrefHelper.getInstance(context);
        this.params_ = new JSONObject();
        this.locks_ = new HashSet();
    }

    protected ServerRequest(String str, JSONObject jSONObject, Context context) {
        this.queueWaitTime_ = 0L;
        this.constructError_ = false;
        this.skipOnTimeOut = false;
        this.context_ = context;
        this.requestPath_ = str;
        this.params_ = jSONObject;
        this.prefHelper_ = PrefHelper.getInstance(context);
        this.locks_ = new HashSet();
    }

    public final String getRequestPath() {
        return this.requestPath_;
    }

    public String getRequestUrl() {
        return this.prefHelper_.getAPIBaseUrl() + this.requestPath_;
    }

    protected void setPost(JSONObject jSONObject) throws JSONException {
        this.params_ = jSONObject;
        if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1) {
            DeviceInfo.getInstance().updateRequestWithV1Params(this, this.params_);
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            this.params_.put(Defines$Jsonkey.UserData.getKey(), jSONObject2);
            DeviceInfo.getInstance().updateRequestWithV2Params(this, this.context_, this.prefHelper_, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public JSONObject getPost() {
        return this.params_;
    }

    public JSONObject getPostWithInstrumentationValues(ConcurrentHashMap<String, String> concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.params_ != null) {
                JSONObject jSONObject2 = new JSONObject(this.params_.toString());
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            if (concurrentHashMap.size() <= 0) {
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            for (String str : concurrentHashMap.keySet()) {
                jSONObject3.put(str, concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
            jSONObject.put(Defines$Jsonkey.Branch_Instrumentation.getKey(), jSONObject3);
            return jSONObject;
        } catch (ConcurrentModificationException unused) {
            return this.params_;
        } catch (JSONException unused2) {
            return jSONObject;
        }
    }

    public JSONObject getGetParams() {
        return this.params_;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("REQ_POST", this.params_);
            jSONObject.put("REQ_POST_PATH", this.requestPath_);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static ServerRequest fromJSON(JSONObject jSONObject, Context context) {
        String string2 = "";
        JSONObject jSONObject2 = jSONObject.has("REQ_POST") ? jSONObject.getJSONObject("REQ_POST") : null;
        try {
            if (jSONObject.has("REQ_POST_PATH")) {
                string2 = jSONObject.getString("REQ_POST_PATH");
            }
        } catch (JSONException unused) {
        }
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        return getExtendedServerRequest(string2, jSONObject2, context);
    }

    private static ServerRequest getExtendedServerRequest(String str, JSONObject jSONObject, Context context) {
        if (str.equalsIgnoreCase(Defines$RequestPath.CompletedAction.getPath())) {
            return new ServerRequestActionCompleted(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.GetURL.getPath())) {
            return new ServerRequestCreateUrl(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.GetCreditHistory.getPath())) {
            return new ServerRequestGetRewardHistory(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.GetCredits.getPath())) {
            return new ServerRequestGetRewards(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.IdentifyUser.getPath())) {
            return new ServerRequestIdentifyUserRequest(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.Logout.getPath())) {
            return new ServerRequestLogout(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.RedeemRewards.getPath())) {
            return new ServerRequestRedeemRewards(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.RegisterClose.getPath())) {
            return new ServerRequestRegisterClose(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.RegisterInstall.getPath())) {
            return new ServerRequestRegisterInstall(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(Defines$RequestPath.RegisterOpen.getPath())) {
            return new ServerRequestRegisterOpen(str, jSONObject, context);
        }
        return null;
    }

    private void updateGAdsParams() {
        BRANCH_API_VERSION branchRemoteAPIVersion = getBranchRemoteAPIVersion();
        int lATVal = DeviceInfo.getInstance().getSystemObserver().getLATVal();
        String aid = DeviceInfo.getInstance().getSystemObserver().getAID();
        if (!TextUtils.isEmpty(aid)) {
            updateAdvertisingIdsObject(aid);
        }
        try {
            if (branchRemoteAPIVersion == BRANCH_API_VERSION.V1) {
                this.params_.put(Defines$Jsonkey.LATVal.getKey(), lATVal);
                if (!TextUtils.isEmpty(aid)) {
                    if (!SystemObserver.isHuaweiMobileServicesAvailable(this.context_)) {
                        this.params_.put(Defines$Jsonkey.GoogleAdvertisingID.getKey(), aid);
                    }
                    this.params_.remove(Defines$Jsonkey.UnidentifiedDevice.getKey());
                    return;
                } else {
                    if (payloadContainsDeviceIdentifiers(this.params_)) {
                        return;
                    }
                    JSONObject jSONObject = this.params_;
                    Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.UnidentifiedDevice;
                    if (jSONObject.optBoolean(defines$Jsonkey.getKey())) {
                        return;
                    }
                    this.params_.put(defines$Jsonkey.getKey(), true);
                    return;
                }
            }
            JSONObject jSONObjectOptJSONObject = this.params_.optJSONObject(Defines$Jsonkey.UserData.getKey());
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put(Defines$Jsonkey.LimitedAdTracking.getKey(), lATVal);
                if (!TextUtils.isEmpty(aid)) {
                    if (!SystemObserver.isHuaweiMobileServicesAvailable(this.context_)) {
                        jSONObjectOptJSONObject.put(Defines$Jsonkey.AAID.getKey(), aid);
                    }
                    jSONObjectOptJSONObject.remove(Defines$Jsonkey.UnidentifiedDevice.getKey());
                } else {
                    if (payloadContainsDeviceIdentifiers(jSONObjectOptJSONObject)) {
                        return;
                    }
                    Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.UnidentifiedDevice;
                    if (jSONObjectOptJSONObject.optBoolean(defines$Jsonkey2.getKey())) {
                        return;
                    }
                    jSONObjectOptJSONObject.put(defines$Jsonkey2.getKey(), true);
                }
            }
        } catch (JSONException unused) {
        }
    }

    private void updateAdvertisingIdsObject(String str) {
        String key;
        try {
            if (SystemObserver.isFireOSDevice()) {
                key = Defines$Jsonkey.FireAdId.getKey();
            } else if (SystemObserver.isHuaweiMobileServicesAvailable(Branch.getInstance().getApplicationContext())) {
                key = Defines$Jsonkey.OpenAdvertisingID.getKey();
            } else {
                key = Defines$Jsonkey.AAID.getKey();
            }
            this.params_.put(Defines$Jsonkey.AdvertisingIDs.getKey(), new JSONObject().put(key, str));
        } catch (JSONException unused) {
        }
    }

    private boolean payloadContainsDeviceIdentifiers(JSONObject jSONObject) {
        return jSONObject.has(Defines$Jsonkey.AndroidID.getKey()) || jSONObject.has(Defines$Jsonkey.DeviceFingerprintID.getKey()) || jSONObject.has(Defines$ModuleNameKeys.imei.getKey());
    }

    private void updateDeviceInfo() {
        JSONObject jSONObjectOptJSONObject;
        if (getBranchRemoteAPIVersion() != BRANCH_API_VERSION.V2 || (jSONObjectOptJSONObject = this.params_.optJSONObject(Defines$Jsonkey.UserData.getKey())) == null) {
            return;
        }
        try {
            jSONObjectOptJSONObject.put(Defines$Jsonkey.DeveloperIdentity.getKey(), this.prefHelper_.getIdentity());
            jSONObjectOptJSONObject.put(Defines$Jsonkey.DeviceFingerprintID.getKey(), this.prefHelper_.getDeviceFingerPrintID());
        } catch (JSONException unused) {
        }
    }

    private void updateRequestMetadata() {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> itKeys = this.prefHelper_.getRequestMetadata().keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, this.prefHelper_.getRequestMetadata().get(next));
            }
            JSONObject jSONObjectOptJSONObject = this.params_.optJSONObject(Defines$Jsonkey.Metadata.getKey());
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    jSONObject.put(next2, jSONObjectOptJSONObject.get(next2));
                }
            }
            if ((this instanceof ServerRequestRegisterInstall) && this.prefHelper_.getInstallMetadata().length() > 0) {
                Iterator<String> itKeys3 = this.prefHelper_.getInstallMetadata().keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    this.params_.putOpt(next3, this.prefHelper_.getInstallMetadata().get(next3));
                }
            }
            this.params_.put(Defines$Jsonkey.Metadata.getKey(), jSONObject);
        } catch (JSONException unused) {
            PrefHelper.Debug("Could not merge metadata, ignoring user metadata.");
        }
    }

    private void updateLimitFacebookTracking() {
        boolean zIsAppTrackingLimited;
        JSONObject jSONObjectOptJSONObject = getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1 ? this.params_ : this.params_.optJSONObject(Defines$Jsonkey.UserData.getKey());
        if (jSONObjectOptJSONObject == null || !(zIsAppTrackingLimited = this.prefHelper_.isAppTrackingLimited())) {
            return;
        }
        try {
            jSONObjectOptJSONObject.putOpt(Defines$Jsonkey.limitFacebookTracking.getKey(), Boolean.valueOf(zIsAppTrackingLimited));
        } catch (JSONException unused) {
        }
    }

    private void updateDisableAdNetworkCallouts() {
        boolean adNetworkCalloutsDisabled;
        JSONObject jSONObjectOptJSONObject = getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V1 ? this.params_ : this.params_.optJSONObject(Defines$Jsonkey.UserData.getKey());
        if (jSONObjectOptJSONObject == null || !(adNetworkCalloutsDisabled = this.prefHelper_.getAdNetworkCalloutsDisabled())) {
            return;
        }
        try {
            jSONObjectOptJSONObject.putOpt(Defines$Jsonkey.DisableAdNetworkCallouts.getKey(), Boolean.valueOf(adNetworkCalloutsDisabled));
        } catch (JSONException unused) {
        }
    }

    void doFinalUpdateOnMainThread() {
        updateRequestMetadata();
        if (shouldUpdateLimitFacebookTracking()) {
            updateLimitFacebookTracking();
        }
    }

    void doFinalUpdateOnBackgroundThread() {
        if (this instanceof ServerRequestInitSession) {
            ((ServerRequestInitSession) this).updateLinkReferrerParams();
        }
        updateDeviceInfo();
        updateDisableAdNetworkCallouts();
        if (isGAdsParamsRequired()) {
            updateGAdsParams();
        }
    }

    protected boolean doesAppHasInternetPermission(Context context) {
        int iCheckCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.INTERNET");
        if (iCheckCallingOrSelfPermission != 0) {
            PrefHelper.Debug("Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        }
        return iCheckCallingOrSelfPermission == 0;
    }

    public void onRequestQueued() {
        this.queueWaitTime_ = System.currentTimeMillis();
    }

    public long getQueueWaitTime() {
        if (this.queueWaitTime_ > 0) {
            return System.currentTimeMillis() - this.queueWaitTime_;
        }
        return 0L;
    }

    public void addProcessWaitLock(PROCESS_WAIT_LOCK process_wait_lock) {
        if (process_wait_lock != null) {
            this.locks_.add(process_wait_lock);
        }
    }

    public void removeProcessWaitLock(PROCESS_WAIT_LOCK process_wait_lock) {
        this.locks_.remove(process_wait_lock);
    }

    public boolean isWaitingOnProcessToFinish() {
        return this.locks_.size() > 0;
    }

    protected void updateEnvironment(Context context, JSONObject jSONObject) {
        try {
            String key = (DeviceInfo.getInstance().isPackageInstalled() ? Defines$Jsonkey.NativeApp : Defines$Jsonkey.InstantApp).getKey();
            if (getBranchRemoteAPIVersion() == BRANCH_API_VERSION.V2) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Defines$Jsonkey.UserData.getKey());
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put(Defines$Jsonkey.Environment.getKey(), key);
                    return;
                }
                return;
            }
            jSONObject.put(Defines$Jsonkey.Environment.getKey(), key);
        } catch (Exception unused) {
        }
    }

    public BRANCH_API_VERSION getBranchRemoteAPIVersion() {
        return BRANCH_API_VERSION.V1;
    }

    public void reportTrackingDisabledError() {
        PrefHelper.Debug("Requested operation cannot be completed since tracking is disabled [" + this.requestPath_ + "]");
        handleFailure(-117, "");
    }

    boolean isInitializationOrEventRequest() {
        for (String str : initializationAndEventRoutes) {
            if (str.equals(this.requestPath_)) {
                return true;
            }
        }
        return false;
    }
}
