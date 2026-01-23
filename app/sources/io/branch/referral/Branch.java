package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import io.branch.referral.BranchStrongMatchHelper;
import io.branch.referral.BranchViewHandler;
import io.branch.referral.DeferredAppLinkDataHandler;
import io.branch.referral.GooglePlayStoreAttribution;
import io.branch.referral.ServerRequest;
import io.branch.referral.SystemObserver;
import io.branch.referral.network.BranchRemoteInterface;
import io.branch.referral.network.BranchRemoteInterfaceUrlConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes21.dex */
public class Branch implements BranchViewHandler.IBranchViewEvents, SystemObserver.AdsParamsFetchEvents, GooglePlayStoreAttribution.IInstallReferrerEvents {
    private static Branch branchReferral_ = null;
    private static boolean bypassCurrentActivityIntentState_ = false;
    static boolean bypassWaitingForIntent_ = false;
    static boolean checkInstallReferrer_ = true;
    private static String cookieBasedMatchDomain_ = "app.link";
    static boolean disableAutoSessionInitialization = false;
    private static boolean disableDeviceIDFetch_ = false;
    private static boolean isActivityLifeCycleCallbackRegistered_ = false;
    private static boolean isAutoSessionMode_ = false;
    private static long playStoreReferrerWaitTime = 1500;
    private BranchActivityLifecycleObserver activityLifeCycleObserver;
    private BranchRemoteInterface branchRemoteInterface_;
    private Context context_;
    WeakReference<Activity> currentActivityReference_;
    private JSONObject deeplinkDebugParams_;
    private final DeviceInfo deviceInfo_;
    private boolean hasNetwork_;
    private final ConcurrentHashMap<String, String> instrumentationExtraData_;
    private boolean isGAParamsFetchInProgress_;
    private Map<BranchLinkData, String> linkCache_;
    final Object lock;
    private int networkCount_;
    private PrefHelper prefHelper_;
    private final ServerRequestQueue requestQueue_;
    private Semaphore serverSema_;
    private final TrackingController trackingController;
    private static final String[] EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST = {"extra_launch_uri", "branch_intent"};
    private static boolean enableInstantDeepLinking = false;
    private static String pluginVersion = null;
    private static String pluginName = null;
    private boolean enableFacebookAppLinkCheck_ = false;
    private INTENT_STATE intentState_ = INTENT_STATE.PENDING;
    private SESSION_STATE initState_ = SESSION_STATE.UNINITIALISED;
    public boolean closeRequestNeeded = false;
    private CountDownLatch getFirstReferringParamsLatch = null;
    private CountDownLatch getLatestReferringParamsLatch = null;
    private boolean performCookieBasedStrongMatchingOnGAIDAvailable = false;
    private boolean isInstantDeepLinkPossible = false;

    public interface BranchReferralInitListener {
        void onInitFinished(JSONObject jSONObject, BranchError branchError);
    }

    /* loaded from: classes14.dex */
    public interface IBranchViewControl {
        boolean skipBranchViewsOnThisActivity();
    }

    enum INTENT_STATE {
        PENDING,
        READY
    }

    /* loaded from: classes14.dex */
    public interface LogoutStatusListener {
    }

    enum SESSION_STATE {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    ShareLinkManager getShareLinkManager() {
        return null;
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewVisible(String str, String str2) {
    }

    private Branch(Context context) {
        this.isGAParamsFetchInProgress_ = false;
        this.context_ = context;
        this.prefHelper_ = PrefHelper.getInstance(context);
        TrackingController trackingController = new TrackingController(context);
        this.trackingController = trackingController;
        this.branchRemoteInterface_ = new BranchRemoteInterfaceUrlConnection(this);
        DeviceInfo deviceInfoInitialize = DeviceInfo.initialize(context);
        this.deviceInfo_ = deviceInfoInitialize;
        this.requestQueue_ = ServerRequestQueue.getInstance(context);
        this.serverSema_ = new Semaphore(1);
        this.lock = new Object();
        this.networkCount_ = 0;
        this.hasNetwork_ = true;
        this.linkCache_ = new HashMap();
        this.instrumentationExtraData_ = new ConcurrentHashMap<>();
        if (trackingController.isTrackingDisabled()) {
            return;
        }
        this.isGAParamsFetchInProgress_ = deviceInfoInitialize.getSystemObserver().prefetchAdsParams(context, this);
    }

    public Context getApplicationContext() {
        return this.context_;
    }

    public static void expectDelayedSessionInitialization(boolean z) {
        disableAutoSessionInitialization = z;
    }

    public void disableTracking(boolean z) {
        this.trackingController.disableTracking(this.context_, z);
    }

    public boolean isTrackingDisabled() {
        return this.trackingController.isTrackingDisabled();
    }

    public static Branch getInstance() {
        if (branchReferral_ == null) {
            PrefHelper.Debug("Branch instance is not created yet. Make sure you have initialised Branch. [Consider Calling getInstance(Context ctx) if you still have issue.]");
        } else if (isAutoSessionMode_ && !isActivityLifeCycleCallbackRegistered_) {
            PrefHelper.Debug("Branch instance is not properly initialised. Make sure your Application class is extending BranchApp class. If you are not extending BranchApp class make sure you are initialising Branch in your Applications onCreate()");
        }
        return branchReferral_;
    }

    private static Branch getBranchInstance(Context context, boolean z, String str) throws PackageManager.NameNotFoundException {
        boolean branchKey;
        if (branchReferral_ == null) {
            branchReferral_ = new Branch(context.getApplicationContext());
            boolean zCheckTestMode = BranchUtil.checkTestMode(context);
            if (z) {
                zCheckTestMode = false;
            }
            BranchUtil.setTestMode(zCheckTestMode);
            if (TextUtils.isEmpty(str)) {
                str = BranchUtil.readBranchKey(context);
            }
            if (TextUtils.isEmpty(str)) {
                PrefHelper.Debug("Warning: Please enter your branch_key in your project's Manifest file!");
                branchKey = branchReferral_.prefHelper_.setBranchKey("bnc_no_value");
            } else {
                branchKey = branchReferral_.prefHelper_.setBranchKey(str);
            }
            if (branchKey) {
                branchReferral_.linkCache_.clear();
                branchReferral_.requestQueue_.clear();
            }
            branchReferral_.context_ = context.getApplicationContext();
            if (context instanceof Application) {
                isAutoSessionMode_ = true;
                branchReferral_.setActivityLifeCycleObserver((Application) context);
            }
        }
        return branchReferral_;
    }

    public static Branch getAutoInstance(Context context) throws PackageManager.NameNotFoundException {
        isAutoSessionMode_ = true;
        getBranchInstance(context, true ^ BranchUtil.checkTestMode(context), null);
        BranchPreinstall.getPreinstallSystemData(branchReferral_, context);
        return branchReferral_;
    }

    public static boolean isDeviceIDFetchDisabled() {
        return disableDeviceIDFetch_;
    }

    public void setRequestMetadata(String str, String str2) {
        this.prefHelper_.setRequestMetadata(str, str2);
    }

    public Branch addInstallMetadata(String str, String str2) {
        this.prefHelper_.addInstallMetadata(str, str2);
        return this;
    }

    public Branch setPreinstallCampaign(String str) {
        addInstallMetadata(Defines$PreinstallKey.campaign.getKey(), str);
        return this;
    }

    public Branch setPreinstallPartner(String str) {
        addInstallMetadata(Defines$PreinstallKey.partner.getKey(), str);
        return this;
    }

    void closeSessionInternal() throws InterruptedException {
        executeClose();
        this.prefHelper_.setExternalIntentUri(null);
        this.trackingController.updateTrackingState(this.context_);
    }

    void clearPendingRequests() {
        this.requestQueue_.clear();
    }

    private void executeClose() throws InterruptedException {
        SESSION_STATE session_state = this.initState_;
        SESSION_STATE session_state2 = SESSION_STATE.UNINITIALISED;
        if (session_state != session_state2) {
            if (!this.hasNetwork_) {
                ServerRequest serverRequestPeek = this.requestQueue_.peek();
                if ((serverRequestPeek instanceof ServerRequestRegisterInstall) || (serverRequestPeek instanceof ServerRequestRegisterOpen)) {
                    this.requestQueue_.dequeue();
                }
            } else if (!this.requestQueue_.containsClose() && this.closeRequestNeeded) {
                handleNewRequest(new ServerRequestRegisterClose(this.context_));
            }
            setInitState(session_state2);
        }
        this.closeRequestNeeded = false;
    }

    public static String getPluginVersion() {
        return pluginVersion;
    }

    static String getPluginName() {
        return pluginName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readAndStripParam(Uri uri, Activity activity) {
        if (enableInstantDeepLinking) {
            boolean z = this.intentState_ == INTENT_STATE.READY || !this.activityLifeCycleObserver.isCurrentActivityLaunchedFromStack();
            boolean zIsRestartSessionRequested = isRestartSessionRequested(activity != null ? activity.getIntent() : null);
            if (z && !zIsRestartSessionRequested) {
                extractSessionParamsForIDL(uri, activity);
            }
        }
        if (bypassCurrentActivityIntentState_) {
            this.intentState_ = INTENT_STATE.READY;
        }
        if (this.intentState_ == INTENT_STATE.READY) {
            extractExternalUriAndIntentExtras(uri, activity);
            if (extractBranchLinkFromIntentExtra(activity) || isActivityLaunchedFromHistory(activity) || extractClickID(uri, activity)) {
                return;
            }
            extractAppLink(uri, activity);
        }
    }

    void unlockSDKInitWaitLock() throws InterruptedException {
        ServerRequestQueue serverRequestQueue = this.requestQueue_;
        if (serverRequestQueue == null) {
            return;
        }
        serverRequestQueue.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
        processNextQueueItem();
    }

    private boolean isIntentParamsAlreadyConsumed(Activity activity) {
        return (activity == null || activity.getIntent() == null || !activity.getIntent().getBooleanExtra(Defines$IntentKeys.BranchLinkUsed.getKey(), false)) ? false : true;
    }

    private boolean isActivityLaunchedFromHistory(Activity activity) {
        return (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) ? false : true;
    }

    String getSessionReferredLink() {
        String externalIntentUri = this.prefHelper_.getExternalIntentUri();
        if (externalIntentUri.equals("bnc_no_value")) {
            return null;
        }
        return externalIntentUri;
    }

    @Override // io.branch.referral.SystemObserver.AdsParamsFetchEvents
    public void onAdsParamsFetchFinished() throws InterruptedException {
        this.isGAParamsFetchInProgress_ = false;
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        if (this.performCookieBasedStrongMatchingOnGAIDAvailable) {
            performCookieBasedStrongMatch();
            this.performCookieBasedStrongMatchingOnGAIDAvailable = false;
        } else {
            processNextQueueItem();
        }
    }

    @Override // io.branch.referral.GooglePlayStoreAttribution.IInstallReferrerEvents
    public void onInstallReferrerEventsFinished() throws InterruptedException {
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
        processNextQueueItem();
    }

    void updateSkipURLFormats() {
        UniversalResourceAnalyser.getInstance(this.context_).checkAndUpdateSkipURLFormats(this.context_);
    }

    public void setIdentity(String str) throws InterruptedException {
        setIdentity(str, null);
    }

    public void setIdentity(String str, BranchReferralInitListener branchReferralInitListener) throws InterruptedException {
        ServerRequestIdentifyUserRequest serverRequestIdentifyUserRequest = new ServerRequestIdentifyUserRequest(this.context_, branchReferralInitListener, str);
        if (!serverRequestIdentifyUserRequest.constructError_ && !serverRequestIdentifyUserRequest.handleErrors(this.context_)) {
            handleNewRequest(serverRequestIdentifyUserRequest);
        } else if (serverRequestIdentifyUserRequest.isExistingID()) {
            serverRequestIdentifyUserRequest.handleUserExist(branchReferral_);
        }
    }

    public void logout() throws InterruptedException {
        logout(null);
    }

    public void logout(LogoutStatusListener logoutStatusListener) throws InterruptedException {
        ServerRequestLogout serverRequestLogout = new ServerRequestLogout(this.context_, logoutStatusListener);
        if (serverRequestLogout.constructError_ || serverRequestLogout.handleErrors(this.context_)) {
            return;
        }
        handleNewRequest(serverRequestLogout);
    }

    public JSONObject getFirstReferringParams() {
        return appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getInstallParams()));
    }

    public void removeSessionInitializationDelay() throws InterruptedException {
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.USER_SET_WAIT_LOCK);
        processNextQueueItem();
    }

    public JSONObject getLatestReferringParams() {
        return appendDebugParams(convertParamsStringToDictionary(this.prefHelper_.getSessionParams()));
    }

    private JSONObject appendDebugParams(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = this.deeplinkDebugParams_;
                if (jSONObject2 != null) {
                    if (jSONObject2.length() > 0) {
                        PrefHelper.Debug("You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link");
                    }
                    Iterator<String> itKeys = this.deeplinkDebugParams_.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, this.deeplinkDebugParams_.get(next));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    private JSONObject convertParamsStringToDictionary(String str) {
        if (str.equals("bnc_no_value")) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(Base64.decode(str.getBytes(), 2)));
            } catch (JSONException e) {
                e.printStackTrace();
                return new JSONObject();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNextQueueItem() throws InterruptedException {
        try {
            this.serverSema_.acquire();
            if (this.networkCount_ == 0 && this.requestQueue_.getSize() > 0) {
                this.networkCount_ = 1;
                ServerRequest serverRequestPeek = this.requestQueue_.peek();
                this.serverSema_.release();
                if (serverRequestPeek != null) {
                    if (!serverRequestPeek.isWaitingOnProcessToFinish()) {
                        if (!(serverRequestPeek instanceof ServerRequestRegisterInstall) && !hasUser()) {
                            PrefHelper.Debug("Branch Error: User session has not been initialized!");
                            this.networkCount_ = 0;
                            handleFailure(this.requestQueue_.getSize() - 1, -101);
                            return;
                        } else if (requestNeedsSession(serverRequestPeek) && !isSessionAvailableForRequest()) {
                            this.networkCount_ = 0;
                            handleFailure(this.requestQueue_.getSize() - 1, -101);
                            return;
                        } else {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            BranchPostTask branchPostTask = new BranchPostTask(serverRequestPeek, countDownLatch);
                            branchPostTask.executeTask(new Void[0]);
                            startTimeoutTimer(countDownLatch, branchPostTask, this.prefHelper_.getTimeout());
                            return;
                        }
                    }
                    this.networkCount_ = 0;
                    return;
                }
                this.requestQueue_.remove(null);
                return;
            }
            this.serverSema_.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startTimeoutTimer(final CountDownLatch countDownLatch, final BranchPostTask branchPostTask, final int i) {
        new Thread(new Runnable() { // from class: io.branch.referral.Branch.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (countDownLatch.await(i, TimeUnit.MILLISECONDS)) {
                        return;
                    }
                    branchPostTask.cancel(true);
                    branchPostTask.thisReq_.handleFailure(-111, "Timed out: " + branchPostTask.thisReq_.getRequestUrl());
                    Branch.this.requestQueue_.remove(branchPostTask.thisReq_);
                } catch (InterruptedException unused) {
                }
            }
        }).start();
    }

    private boolean requestNeedsSession(ServerRequest serverRequest) {
        return ((serverRequest instanceof ServerRequestInitSession) || (serverRequest instanceof ServerRequestCreateUrl)) ? false : true;
    }

    private boolean isSessionAvailableForRequest() {
        return hasSession() && hasDeviceFingerPrint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFailure(int i, int i2) {
        ServerRequest serverRequestPeekAt;
        if (i >= this.requestQueue_.getSize()) {
            serverRequestPeekAt = this.requestQueue_.peekAt(r2.getSize() - 1);
        } else {
            serverRequestPeekAt = this.requestQueue_.peekAt(i);
        }
        handleFailure(serverRequestPeekAt, i2);
    }

    private void handleFailure(ServerRequest serverRequest, int i) {
        if (serverRequest == null) {
            return;
        }
        serverRequest.handleFailure(i, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAllRequestsInQueue() {
        JSONObject post;
        for (int i = 0; i < this.requestQueue_.getSize(); i++) {
            try {
                ServerRequest serverRequestPeekAt = this.requestQueue_.peekAt(i);
                if (serverRequestPeekAt != null && (post = serverRequestPeekAt.getPost()) != null) {
                    Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.SessionID;
                    if (post.has(defines$Jsonkey.getKey())) {
                        serverRequestPeekAt.getPost().put(defines$Jsonkey.getKey(), this.prefHelper_.getSessionID());
                    }
                    Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.IdentityID;
                    if (post.has(defines$Jsonkey2.getKey())) {
                        serverRequestPeekAt.getPost().put(defines$Jsonkey2.getKey(), this.prefHelper_.getIdentityID());
                    }
                    Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.DeviceFingerprintID;
                    if (post.has(defines$Jsonkey3.getKey())) {
                        serverRequestPeekAt.getPost().put(defines$Jsonkey3.getKey(), this.prefHelper_.getDeviceFingerPrintID());
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    public TrackingController getTrackingController() {
        return this.trackingController;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo_;
    }

    PrefHelper getPrefHelper() {
        return this.prefHelper_;
    }

    boolean isGAParamsFetchInProgress() {
        return this.isGAParamsFetchInProgress_;
    }

    void setGAParamsFetchInProgress(boolean z) {
        this.isGAParamsFetchInProgress_ = z;
    }

    void setIntentState(INTENT_STATE intent_state) {
        this.intentState_ = intent_state;
    }

    void setInitState(SESSION_STATE session_state) {
        this.initState_ = session_state;
    }

    SESSION_STATE getInitState() {
        return this.initState_;
    }

    private boolean hasSession() {
        return !this.prefHelper_.getSessionID().equals("bnc_no_value");
    }

    public void setInstantDeepLinkPossible(boolean z) {
        this.isInstantDeepLinkPossible = z;
    }

    public boolean isInstantDeepLinkPossible() {
        return this.isInstantDeepLinkPossible;
    }

    private boolean hasDeviceFingerPrint() {
        return !this.prefHelper_.getDeviceFingerPrintID().equals("bnc_no_value");
    }

    private boolean hasUser() {
        return !this.prefHelper_.getIdentityID().equals("bnc_no_value");
    }

    private void insertRequestAtFront(ServerRequest serverRequest) {
        if (this.networkCount_ == 0) {
            this.requestQueue_.insert(serverRequest, 0);
        } else {
            this.requestQueue_.insert(serverRequest, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeSession(BranchReferralInitListener branchReferralInitListener, int i) throws InterruptedException {
        if (this.prefHelper_.getBranchKey() == null || this.prefHelper_.getBranchKey().equalsIgnoreCase("bnc_no_value")) {
            setInitState(SESSION_STATE.UNINITIALISED);
            if (branchReferralInitListener != null) {
                branchReferralInitListener.onInitFinished(null, new BranchError("Trouble initializing Branch.", -114));
            }
            PrefHelper.Debug("Warning: Please enter your branch_key in your project's manifest");
            return;
        }
        if (BranchUtil.isTestModeEnabled()) {
            PrefHelper.Debug("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
        }
        ServerRequestInitSession installOrOpenRequest = getInstallOrOpenRequest(branchReferralInitListener);
        SESSION_STATE session_state = this.initState_;
        SESSION_STATE session_state2 = SESSION_STATE.UNINITIALISED;
        if (session_state == session_state2 && getSessionReferredLink() == null && this.enableFacebookAppLinkCheck_ && DeferredAppLinkDataHandler.fetchDeferredAppLinkData(this.context_, new DeferredAppLinkDataHandler.AppLinkFetchEvents() { // from class: io.branch.referral.Branch.2
            @Override // io.branch.referral.DeferredAppLinkDataHandler.AppLinkFetchEvents
            public void onAppLinkFetchFinished(String str) throws InterruptedException {
                Branch.this.prefHelper_.setIsAppLinkTriggeredInit(Boolean.TRUE);
                if (str != null) {
                    String queryParameter = Uri.parse(str).getQueryParameter(Defines$Jsonkey.LinkClickID.getKey());
                    if (!TextUtils.isEmpty(queryParameter)) {
                        Branch.this.prefHelper_.setLinkClickIdentifier(queryParameter);
                    }
                }
                Branch.this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
                Branch.this.processNextQueueItem();
            }
        }).booleanValue()) {
            installOrOpenRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
        }
        if (i > 0) {
            installOrOpenRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.USER_SET_WAIT_LOCK);
            new Handler().postDelayed(new Runnable() { // from class: io.branch.referral.Branch.3
                @Override // java.lang.Runnable
                public void run() throws InterruptedException {
                    Branch.this.removeSessionInitializationDelay();
                }
            }, i);
        }
        Intent intent = getCurrentActivity() != null ? getCurrentActivity().getIntent() : null;
        boolean zIsRestartSessionRequested = isRestartSessionRequested(intent);
        if (getInitState() != session_state2 && !zIsRestartSessionRequested) {
            if (branchReferralInitListener != null) {
                branchReferralInitListener.onInitFinished(null, new BranchError("Warning.", -118));
            }
        } else {
            if (zIsRestartSessionRequested && intent != null) {
                intent.removeExtra(Defines$IntentKeys.ForceNewBranchSession.getKey());
            }
            registerAppInit(installOrOpenRequest, false);
        }
    }

    void registerAppInit(ServerRequestInitSession serverRequestInitSession, boolean z) throws InterruptedException {
        setInitState(SESSION_STATE.INITIALISING);
        if (!z) {
            if (this.intentState_ != INTENT_STATE.READY && isWaitingForIntent()) {
                serverRequestInitSession.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
            }
            if (checkInstallReferrer_ && (serverRequestInitSession instanceof ServerRequestRegisterInstall) && !GooglePlayStoreAttribution.hasBeenUsed) {
                ServerRequest.PROCESS_WAIT_LOCK process_wait_lock = ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK;
                serverRequestInitSession.addProcessWaitLock(process_wait_lock);
                new GooglePlayStoreAttribution().captureInstallReferrer(this.context_, playStoreReferrerWaitTime, this);
                if (GooglePlayStoreAttribution.erroredOut) {
                    serverRequestInitSession.removeProcessWaitLock(process_wait_lock);
                }
            }
        }
        if (this.isGAParamsFetchInProgress_) {
            serverRequestInitSession.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        }
        if (!this.requestQueue_.containsInitRequest()) {
            insertRequestAtFront(serverRequestInitSession);
            processNextQueueItem();
        } else {
            PrefHelper.Debug("Warning! Attempted to queue multiple init session requests");
        }
    }

    ServerRequestInitSession getInstallOrOpenRequest(BranchReferralInitListener branchReferralInitListener) {
        if (hasUser()) {
            return new ServerRequestRegisterOpen(this.context_, branchReferralInitListener);
        }
        return new ServerRequestRegisterInstall(this.context_, branchReferralInitListener);
    }

    void onIntentReady(Activity activity) throws InterruptedException {
        setIntentState(INTENT_STATE.READY);
        this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        if (activity.getIntent() != null && getInitState() != SESSION_STATE.INITIALISED) {
            readAndStripParam(activity.getIntent().getData(), activity);
            if (!isTrackingDisabled() && cookieBasedMatchDomain_ != null && this.prefHelper_.getBranchKey() != null && !this.prefHelper_.getBranchKey().equalsIgnoreCase("bnc_no_value")) {
                if (this.isGAParamsFetchInProgress_) {
                    this.performCookieBasedStrongMatchingOnGAIDAvailable = true;
                } else {
                    performCookieBasedStrongMatch();
                }
            }
        }
        processNextQueueItem();
    }

    private void performCookieBasedStrongMatch() {
        if (this.trackingController.isTrackingDisabled() || this.context_ == null) {
            return;
        }
        this.requestQueue_.setStrongMatchWaitLock();
        BranchStrongMatchHelper.getInstance().checkForStrongMatch(this.context_, cookieBasedMatchDomain_, this.deviceInfo_, this.prefHelper_, new BranchStrongMatchHelper.StrongMatchCheckEvents() { // from class: io.branch.referral.Branch.4
            @Override // io.branch.referral.BranchStrongMatchHelper.StrongMatchCheckEvents
            public void onStrongMatchCheckFinished() throws InterruptedException {
                Branch.this.requestQueue_.unlockProcessWait(ServerRequest.PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                Branch.this.processNextQueueItem();
            }
        });
    }

    public void handleNewRequest(ServerRequest serverRequest) throws InterruptedException {
        if (this.trackingController.isTrackingDisabled() && !serverRequest.prepareExecuteWithoutTracking()) {
            serverRequest.reportTrackingDisabledError();
            return;
        }
        if (this.initState_ != SESSION_STATE.INITIALISED && !(serverRequest instanceof ServerRequestInitSession)) {
            if (serverRequest instanceof ServerRequestLogout) {
                serverRequest.handleFailure(-101, "");
                PrefHelper.Debug("Branch is not initialized, cannot logout");
                return;
            } else if (serverRequest instanceof ServerRequestRegisterClose) {
                PrefHelper.Debug("Branch is not initialized, cannot close session");
                return;
            } else if (requestNeedsSession(serverRequest)) {
                serverRequest.addProcessWaitLock(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
            }
        }
        this.requestQueue_.enqueue(serverRequest);
        serverRequest.onRequestQueued();
        processNextQueueItem();
    }

    private void setActivityLifeCycleObserver(Application application) {
        try {
            BranchActivityLifecycleObserver branchActivityLifecycleObserver = new BranchActivityLifecycleObserver();
            this.activityLifeCycleObserver = branchActivityLifecycleObserver;
            application.unregisterActivityLifecycleCallbacks(branchActivityLifecycleObserver);
            application.registerActivityLifecycleCallbacks(this.activityLifeCycleObserver);
            isActivityLifeCycleCallbackRegistered_ = true;
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            isActivityLifeCycleCallbackRegistered_ = false;
            isAutoSessionMode_ = false;
            PrefHelper.Debug(new BranchError("", -108).getMessage());
        }
    }

    boolean isRestartSessionRequested(Intent intent) {
        return checkIntentForSessionRestart(intent) || checkIntentForUnusedBranchLink(intent);
    }

    private boolean checkIntentForSessionRestart(Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra(Defines$IntentKeys.ForceNewBranchSession.getKey(), false);
        }
        return false;
    }

    private boolean checkIntentForUnusedBranchLink(Intent intent) {
        if (intent != null) {
            boolean z = intent.getStringExtra(Defines$IntentKeys.BranchURI.getKey()) != null;
            boolean booleanExtra = intent.getBooleanExtra(Defines$IntentKeys.BranchLinkUsed.getKey(), false);
            if (z && !booleanExtra) {
                return true;
            }
        }
        return false;
    }

    private class BranchPostTask extends BranchAsyncTask<Void, Void, ServerResponse> {
        private final CountDownLatch latch_;
        ServerRequest thisReq_;

        public BranchPostTask(ServerRequest serverRequest, CountDownLatch countDownLatch) {
            this.thisReq_ = serverRequest;
            this.latch_ = countDownLatch;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            this.thisReq_.onPreExecute();
            this.thisReq_.doFinalUpdateOnMainThread();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public ServerResponse doInBackground(Void... voidArr) {
            Branch.this.addExtraInstrumentationData(this.thisReq_.getRequestPath() + "-" + Defines$Jsonkey.Queue_Wait_Time.getKey(), String.valueOf(this.thisReq_.getQueueWaitTime()));
            this.thisReq_.doFinalUpdateOnBackgroundThread();
            if (!Branch.this.isTrackingDisabled() || this.thisReq_.prepareExecuteWithoutTracking()) {
                return this.thisReq_.isGetRequest() ? Branch.this.branchRemoteInterface_.make_restful_get(this.thisReq_.getRequestUrl(), this.thisReq_.getGetParams(), this.thisReq_.getRequestPath(), Branch.this.prefHelper_.getBranchKey()) : Branch.this.branchRemoteInterface_.make_restful_post(this.thisReq_.getPostWithInstrumentationValues(Branch.this.instrumentationExtraData_), this.thisReq_.getRequestUrl(), this.thisReq_.getRequestPath(), Branch.this.prefHelper_.getBranchKey());
            }
            return new ServerResponse(this.thisReq_.getRequestPath(), -117, "");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(ServerResponse serverResponse) throws InterruptedException {
            boolean z;
            super.onPostExecute((BranchPostTask) serverResponse);
            this.latch_.countDown();
            if (serverResponse == null || isCancelled()) {
                return;
            }
            try {
                int statusCode = serverResponse.getStatusCode();
                boolean z2 = true;
                Branch.this.hasNetwork_ = true;
                if (serverResponse.getStatusCode() == -117) {
                    this.thisReq_.reportTrackingDisabledError();
                    Branch.this.requestQueue_.remove(this.thisReq_);
                } else if (statusCode == 200) {
                    Branch.this.hasNetwork_ = true;
                    ServerRequest serverRequest = this.thisReq_;
                    if (serverRequest instanceof ServerRequestCreateUrl) {
                        if (serverResponse.getObject() != null) {
                            String string2 = serverResponse.getObject().getString("url");
                            Map map = Branch.this.linkCache_;
                            ((ServerRequestCreateUrl) this.thisReq_).getLinkPost();
                            map.put(null, string2);
                        }
                    } else if (serverRequest instanceof ServerRequestLogout) {
                        Branch.this.linkCache_.clear();
                        Branch.this.requestQueue_.clear();
                    }
                    Branch.this.requestQueue_.dequeue();
                    ServerRequest serverRequest2 = this.thisReq_;
                    if (!(serverRequest2 instanceof ServerRequestInitSession) && !(serverRequest2 instanceof ServerRequestIdentifyUserRequest)) {
                        serverRequest2.onRequestSucceeded(serverResponse, Branch.branchReferral_);
                    } else {
                        JSONObject object = serverResponse.getObject();
                        if (object != null) {
                            if (Branch.this.isTrackingDisabled()) {
                                z2 = false;
                            } else {
                                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.SessionID;
                                if (object.has(defines$Jsonkey.getKey())) {
                                    Branch.this.prefHelper_.setSessionID(object.getString(defines$Jsonkey.getKey()));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.IdentityID;
                                if (object.has(defines$Jsonkey2.getKey())) {
                                    if (!Branch.this.prefHelper_.getIdentityID().equals(object.getString(defines$Jsonkey2.getKey()))) {
                                        Branch.this.linkCache_.clear();
                                        Branch.this.prefHelper_.setIdentityID(object.getString(defines$Jsonkey2.getKey()));
                                        z = true;
                                    }
                                }
                                Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.DeviceFingerprintID;
                                if (object.has(defines$Jsonkey3.getKey())) {
                                    Branch.this.prefHelper_.setDeviceFingerPrintID(object.getString(defines$Jsonkey3.getKey()));
                                } else {
                                    z2 = z;
                                }
                            }
                            if (z2) {
                                Branch.this.updateAllRequestsInQueue();
                            }
                            ServerRequest serverRequest3 = this.thisReq_;
                            if (!(serverRequest3 instanceof ServerRequestInitSession)) {
                                serverRequest3.onRequestSucceeded(serverResponse, Branch.branchReferral_);
                            } else {
                                Branch.this.setInitState(SESSION_STATE.INITIALISED);
                                this.thisReq_.onRequestSucceeded(serverResponse, Branch.branchReferral_);
                                if (!((ServerRequestInitSession) this.thisReq_).handleBranchViewIfAvailable(serverResponse)) {
                                    Branch.this.checkForAutoDeepLinkConfiguration();
                                }
                                if (Branch.this.getLatestReferringParamsLatch != null) {
                                    Branch.this.getLatestReferringParamsLatch.countDown();
                                }
                                if (Branch.this.getFirstReferringParamsLatch != null) {
                                    Branch.this.getFirstReferringParamsLatch.countDown();
                                }
                            }
                        }
                    }
                } else {
                    if (this.thisReq_ instanceof ServerRequestInitSession) {
                        Branch.this.setInitState(SESSION_STATE.UNINITIALISED);
                    }
                    if (statusCode == 400 || statusCode == 409) {
                        Branch.this.requestQueue_.remove(this.thisReq_);
                        ServerRequest serverRequest4 = this.thisReq_;
                        if (serverRequest4 instanceof ServerRequestCreateUrl) {
                            ((ServerRequestCreateUrl) serverRequest4).handleDuplicateURLError();
                        } else {
                            PrefHelper.LogAlways("Branch API Error: Conflicting resource error code from API");
                            Branch.this.handleFailure(0, statusCode);
                        }
                    } else {
                        Branch.this.hasNetwork_ = false;
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < Branch.this.requestQueue_.getSize(); i++) {
                            arrayList.add(Branch.this.requestQueue_.peekAt(i));
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ServerRequest serverRequest5 = (ServerRequest) it.next();
                            if (serverRequest5 == null || !serverRequest5.shouldRetryOnFail()) {
                                Branch.this.requestQueue_.remove(serverRequest5);
                            }
                        }
                        Branch.this.networkCount_ = 0;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ServerRequest serverRequest6 = (ServerRequest) it2.next();
                            if (serverRequest6 != null) {
                                serverRequest6.handleFailure(statusCode, serverResponse.getFailReason());
                                if (serverRequest6.shouldRetryOnFail()) {
                                    serverRequest6.clearCallbacks();
                                }
                            }
                        }
                    }
                }
                Branch.this.networkCount_ = 0;
                if (!Branch.this.hasNetwork_ || Branch.this.initState_ == SESSION_STATE.UNINITIALISED) {
                    return;
                }
                Branch.this.processNextQueueItem();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onCancelled(ServerResponse serverResponse) {
            super.onCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForAutoDeepLinkConfiguration() {
        Bundle bundle;
        JSONObject latestReferringParams = getLatestReferringParams();
        String str = null;
        try {
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Clicked_Branch_Link;
            if (latestReferringParams.has(defines$Jsonkey.getKey()) && latestReferringParams.getBoolean(defines$Jsonkey.getKey()) && latestReferringParams.length() > 0) {
                Bundle bundle2 = this.context_.getPackageManager().getApplicationInfo(this.context_.getPackageName(), 128).metaData;
                if (bundle2 == null || !bundle2.getBoolean("io.branch.sdk.auto_link_disable", false)) {
                    ActivityInfo[] activityInfoArr = this.context_.getPackageManager().getPackageInfo(this.context_.getPackageName(), EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE).activities;
                    int i = 1501;
                    if (activityInfoArr != null) {
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (activityInfo != null && (bundle = activityInfo.metaData) != null && ((bundle.getString("io.branch.sdk.auto_link_keys") != null || activityInfo.metaData.getString("io.branch.sdk.auto_link_path") != null) && (checkForAutoDeepLinkKeys(latestReferringParams, activityInfo) || checkForAutoDeepLinkPath(latestReferringParams, activityInfo)))) {
                                str = activityInfo.name;
                                i = activityInfo.metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
                                break;
                            }
                        }
                    }
                    if (str != null && getCurrentActivity() != null) {
                        Activity currentActivity = getCurrentActivity();
                        Intent intent = new Intent(currentActivity, Class.forName(str));
                        intent.putExtra("io.branch.sdk.auto_linked", "true");
                        intent.putExtra(Defines$Jsonkey.ReferringData.getKey(), latestReferringParams.toString());
                        Iterator<String> itKeys = latestReferringParams.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            intent.putExtra(next, latestReferringParams.getString(next));
                        }
                        currentActivity.startActivityForResult(intent, i);
                        return;
                    }
                    PrefHelper.Debug("No activity reference to launch deep linked activity");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            PrefHelper.Debug("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            PrefHelper.Debug("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity " + ((String) null));
        } catch (Exception unused3) {
        }
    }

    private boolean checkForAutoDeepLinkKeys(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String str : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkForAutoDeepLinkPath(JSONObject jSONObject, ActivityInfo activityInfo) {
        String string2 = null;
        try {
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.AndroidDeepLinkPath;
            if (jSONObject.has(defines$Jsonkey.getKey())) {
                string2 = jSONObject.getString(defines$Jsonkey.getKey());
            } else {
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.DeepLinkPath;
                if (jSONObject.has(defines$Jsonkey2.getKey())) {
                    string2 = jSONObject.getString(defines$Jsonkey2.getKey());
                }
            }
        } catch (JSONException unused) {
        }
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_path") != null && string2 != null) {
            for (String str : activityInfo.metaData.getString("io.branch.sdk.auto_link_path").split(",")) {
                if (pathMatch(str.trim(), string2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean pathMatch(String str, String str2) {
        String[] strArrSplit = str.split("\\?")[0].split("/");
        String[] strArrSplit2 = str2.split("\\?")[0].split("/");
        if (strArrSplit.length != strArrSplit2.length) {
            return false;
        }
        for (int i = 0; i < strArrSplit.length && i < strArrSplit2.length; i++) {
            String str3 = strArrSplit[i];
            if (!str3.equals(strArrSplit2[i]) && !str3.contains("*")) {
                return false;
            }
        }
        return true;
    }

    public static void bypassWaitingForIntent(boolean z) {
        bypassWaitingForIntent_ = z;
    }

    public static boolean isWaitingForIntent() {
        return !bypassWaitingForIntent_;
    }

    public static boolean bypassCurrentActivityIntentState() {
        return bypassCurrentActivityIntentState_;
    }

    void setIsReferrable(boolean z) {
        if (z) {
            this.prefHelper_.setIsReferrable();
        } else {
            this.prefHelper_.clearIsReferrable();
        }
    }

    public void addExtraInstrumentationData(String str, String str2) {
        this.instrumentationExtraData_.put(str, str2);
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewAccepted(String str, String str2) {
        if (ServerRequestInitSession.isInitSessionAction(str)) {
            checkForAutoDeepLinkConfiguration();
        }
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewCancelled(String str, String str2) {
        if (ServerRequestInitSession.isInitSessionAction(str)) {
            checkForAutoDeepLinkConfiguration();
        }
    }

    @Override // io.branch.referral.BranchViewHandler.IBranchViewEvents
    public void onBranchViewError(int i, String str, String str2) {
        if (ServerRequestInitSession.isInitSessionAction(str2)) {
            checkForAutoDeepLinkConfiguration();
        }
    }

    private void extractSessionParamsForIDL(Uri uri, Activity activity) {
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        Intent intent = activity.getIntent();
        if (uri != null) {
            try {
                if (!isIntentParamsAlreadyConsumed(activity)) {
                    Defines$IntentKeys defines$IntentKeys = Defines$IntentKeys.BranchData;
                    if (!TextUtils.isEmpty(intent.getStringExtra(defines$IntentKeys.getKey()))) {
                        String stringExtra = intent.getStringExtra(defines$IntentKeys.getKey());
                        if (stringExtra != null) {
                            JSONObject jSONObject = new JSONObject(stringExtra);
                            jSONObject.put(Defines$Jsonkey.Clicked_Branch_Link.getKey(), true);
                            this.prefHelper_.setSessionParams(jSONObject.toString());
                            this.isInstantDeepLinkPossible = true;
                        }
                        intent.removeExtra(defines$IntentKeys.getKey());
                        activity.setIntent(intent);
                        return;
                    }
                    if (uri.isHierarchical() && Boolean.valueOf(uri.getQueryParameter(Defines$Jsonkey.Instant.getKey())).booleanValue()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : uri.getQueryParameterNames()) {
                            jSONObject2.put(str, uri.getQueryParameter(str));
                        }
                        jSONObject2.put(Defines$Jsonkey.Clicked_Branch_Link.getKey(), true);
                        this.prefHelper_.setSessionParams(jSONObject2.toString());
                        this.isInstantDeepLinkPossible = true;
                        return;
                    }
                    return;
                }
            } catch (JSONException unused) {
                return;
            }
        }
        if (this.prefHelper_.getInstallParams().equals("bnc_no_value")) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(Defines$Jsonkey.IsFirstSession.getKey(), false);
        this.prefHelper_.setSessionParams(jSONObject3.toString());
        this.isInstantDeepLinkPossible = true;
    }

    private void extractAppLink(Uri uri, Activity activity) {
        if (uri == null || activity == null) {
            return;
        }
        String scheme = uri.getScheme();
        Intent intent = activity.getIntent();
        if (scheme == null || intent == null) {
            return;
        }
        if ((!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase(Constants.SCHEME)) || TextUtils.isEmpty(uri.getHost()) || isIntentParamsAlreadyConsumed(activity)) {
            return;
        }
        if (uri.toString().equalsIgnoreCase(UniversalResourceAnalyser.getInstance(this.context_).getStrippedURL(uri.toString()))) {
            this.prefHelper_.setAppLink(uri.toString());
        }
        intent.putExtra(Defines$IntentKeys.BranchLinkUsed.getKey(), true);
        activity.setIntent(intent);
    }

    private boolean extractClickID(Uri uri, Activity activity) {
        String queryParameter;
        String str;
        if (uri != null) {
            try {
                if (!uri.isHierarchical() || (queryParameter = uri.getQueryParameter(Defines$Jsonkey.LinkClickID.getKey())) == null) {
                    return false;
                }
                this.prefHelper_.setLinkClickIdentifier(queryParameter);
                String str2 = "link_click_id=" + queryParameter;
                String string2 = uri.toString();
                if (str2.equals(uri.getQuery())) {
                    str = "\\?" + str2;
                } else if (string2.length() - str2.length() == string2.indexOf(str2)) {
                    str = "&" + str2;
                } else {
                    str = str2 + "&";
                }
                activity.getIntent().setData(Uri.parse(string2.replaceFirst(str, "")));
                activity.getIntent().putExtra(Defines$IntentKeys.BranchLinkUsed.getKey(), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean extractBranchLinkFromIntentExtra(Activity activity) {
        String string2;
        if (activity == null) {
            return false;
        }
        try {
            if (activity.getIntent() == null || activity.getIntent().getExtras() == null || isIntentParamsAlreadyConsumed(activity)) {
                return false;
            }
            Object obj = activity.getIntent().getExtras().get(Defines$IntentKeys.BranchURI.getKey());
            if (obj instanceof String) {
                string2 = (String) obj;
            } else {
                string2 = obj instanceof Uri ? ((Uri) obj).toString() : null;
            }
            if (TextUtils.isEmpty(string2)) {
                return false;
            }
            this.prefHelper_.setPushIdentifier(string2);
            Intent intent = activity.getIntent();
            intent.putExtra(Defines$IntentKeys.BranchLinkUsed.getKey(), true);
            activity.setIntent(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void extractExternalUriAndIntentExtras(Uri uri, Activity activity) {
        try {
            if (isIntentParamsAlreadyConsumed(activity)) {
                return;
            }
            String strippedURL = UniversalResourceAnalyser.getInstance(this.context_).getStrippedURL(uri.toString());
            this.prefHelper_.setExternalIntentUri(strippedURL);
            if (strippedURL.equals(uri.toString())) {
                Bundle extras = activity.getIntent().getExtras();
                Set<String> setKeySet = extras.keySet();
                if (setKeySet.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                for (String str : EXTERNAL_INTENT_EXTRA_KEY_WHITE_LIST) {
                    if (setKeySet.contains(str)) {
                        jSONObject.put(str, extras.get(str));
                    }
                }
                if (jSONObject.length() > 0) {
                    this.prefHelper_.setExternalIntentExtra(jSONObject.toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivityReference_;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static class InitSessionBuilder {
        private BranchReferralInitListener callback;
        private int delay;
        private Boolean ignoreIntent;
        private boolean isReInitializing;
        private Boolean isReferrable;
        private Uri uri;

        private InitSessionBuilder(Activity activity) {
            Branch branch = Branch.getInstance();
            if (activity != null) {
                if (branch.getCurrentActivity() == null || !branch.getCurrentActivity().getLocalClassName().equals(activity.getLocalClassName())) {
                    branch.currentActivityReference_ = new WeakReference<>(activity);
                }
            }
        }

        public InitSessionBuilder withCallback(BranchReferralInitListener branchReferralInitListener) {
            this.callback = branchReferralInitListener;
            return this;
        }

        public InitSessionBuilder withData(Uri uri) {
            this.uri = uri;
            return this;
        }

        public void init() throws InterruptedException {
            Branch branch = Branch.getInstance();
            if (branch == null) {
                PrefHelper.LogAlways("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
                return;
            }
            Boolean bool = this.isReferrable;
            if (bool != null) {
                branch.setIsReferrable(bool.booleanValue());
            }
            Boolean bool2 = this.ignoreIntent;
            if (bool2 != null) {
                Branch.bypassWaitingForIntent(bool2.booleanValue());
            }
            Activity currentActivity = branch.getCurrentActivity();
            Intent intent = currentActivity != null ? currentActivity.getIntent() : null;
            Uri uri = this.uri;
            if (uri != null) {
                branch.readAndStripParam(uri, currentActivity);
            } else if (this.isReInitializing && branch.isRestartSessionRequested(intent)) {
                branch.readAndStripParam(intent != null ? intent.getData() : null, currentActivity);
            } else if (this.isReInitializing) {
                return;
            }
            if (branch.isInstantDeepLinkPossible) {
                branch.isInstantDeepLinkPossible = false;
                this.callback.onInitFinished(branch.getLatestReferringParams(), null);
                branch.addExtraInstrumentationData(Defines$Jsonkey.InstantDeepLinkSession.getKey(), "true");
                branch.checkForAutoDeepLinkConfiguration();
                this.callback = null;
            }
            if (this.delay > 0) {
                Branch.expectDelayedSessionInitialization(true);
            }
            branch.initializeSession(this.callback, this.delay);
        }
    }

    boolean isIDLSession() {
        return Boolean.parseBoolean(this.instrumentationExtraData_.get(Defines$Jsonkey.InstantDeepLinkSession.getKey()));
    }

    public static InitSessionBuilder sessionBuilder(Activity activity) {
        return new InitSessionBuilder(activity);
    }
}
