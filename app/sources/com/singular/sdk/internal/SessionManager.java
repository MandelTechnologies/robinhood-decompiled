package com.singular.sdk.internal;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.singular.sdk.internal.BroadcastReceivers;

/* loaded from: classes12.dex */
class SessionManager {
    private static final SingularLog logger = SingularLog.getLogger("Session");
    private final BroadcastReceivers.NetworkChange networkChangeReceiver;
    private final SingularInstance singular;
    private boolean usingForegroundTracking = false;
    private long sessionId = -1;
    private long lastSessionPauseTime = -1;
    private long sequence = 0;
    private boolean inForeground = true;

    SessionManager(SingularInstance singularInstance) {
        this.singular = singularInstance;
        this.networkChangeReceiver = new BroadcastReceivers.NetworkChange(singularInstance);
        load();
        startNewSessionIfNeeded(Utils.getCurrentTimeMillis());
        enableForegroundTracking((Application) singularInstance.getContext());
        registerNetworkChangeReceiver();
    }

    private void enableForegroundTracking(Application application) {
        if (this.usingForegroundTracking) {
            return;
        }
        if (Utils.getWrapperName() == null || !Utils.getWrapperName().equalsIgnoreCase("mParticle")) {
            new SingularLifecycleCallbacks(this).registerSelf(application);
        }
    }

    void useForegroundTracking() {
        this.usingForegroundTracking = true;
    }

    private void load() {
        SharedPreferences sharedPreferences = this.singular.getContext().getSharedPreferences(Constants.PREF_SESSION, 0);
        this.sessionId = sharedPreferences.getLong("id", -1L);
        this.lastSessionPauseTime = sharedPreferences.getLong("lastSessionPauseTime", Utils.getCurrentTimeMillis());
        this.sequence = sharedPreferences.getLong("seq", 0L);
        logger.debug("load() <= %s", toString());
    }

    private void persist() {
        try {
            SharedPreferences.Editor editorEdit = this.singular.getContext().getSharedPreferences(Constants.PREF_SESSION, 0).edit();
            editorEdit.putLong("id", this.sessionId);
            editorEdit.putLong("lastSessionPauseTime", this.lastSessionPauseTime);
            editorEdit.putLong("seq", this.sequence);
            editorEdit.commit();
        } catch (Throwable th) {
            logger.error(Utils.formatException(th));
        }
    }

    private boolean inSession() {
        return this.sessionId > 0;
    }

    long getSessionId() {
        return this.sessionId;
    }

    long getNextSequenceNumber() {
        long j = this.sequence + 1;
        this.sequence = j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSessionPauseTime(long j) {
        this.lastSessionPauseTime = j;
        persist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startNewSessionIfNeeded(long j) {
        if (this.singular == null) {
            logger.debug("can't start new session - singular instance is null");
            return false;
        }
        if (SLPushNotificationsManager.getInstance().tryHandlePushNotificationAtPaths(this.singular.getSingularConfig().pushNotificationPayload, this.singular.getSingularConfig().pushNotificationLinkPath).booleanValue()) {
            logger.debug("app is opened with push link");
            SLPushNotificationsManager.getInstance().appOpenedWithPushNotification();
            startNewSession(j);
            return true;
        }
        if (this.singular.getSingularConfig().singularLink != null) {
            logger.debug("app is opened with deeplink.so starting new session");
            startNewSession(j);
            return true;
        }
        DeviceIDManager.getInstance().loadPreviousSdidForComparison(this.singular.getContext());
        if (DeviceIDManager.getInstance().isCurrentSdidNewComparedToPrevious(this.singular.getContext())) {
            logger.debug("starting new session because current sdid is fresh");
            startNewSession(j);
            return true;
        }
        if (inSession() && isWithinMinTimeBetweenSessions(j)) {
            logger.debug("session is not expired yet");
            return false;
        }
        logger.debug("session is expired. starting new session");
        startNewSession(j);
        return true;
    }

    public void startNewSession(long j) {
        logger.debug("startNewSession() At %d", Long.valueOf(j));
        setSessionId(j);
        resetSequence();
        sendSessionStartEvent();
    }

    private boolean isWithinMinTimeBetweenSessions(long j) {
        return j - this.lastSessionPauseTime < this.singular.getSingularConfig().sessionTimeoutSec * 1000;
    }

    private void setSessionId(long j) {
        this.sessionId = j;
    }

    private void resetSequence() {
        this.sequence = 0L;
    }

    private void sendSessionStartEvent() {
        if (inSession()) {
            this.singular.logSessionStart(this.sessionId);
        }
    }

    void onExitForeground(final long j) {
        logger.debug("onExitForeground() At %d", Long.valueOf(j));
        SLPushNotificationsManager.getInstance().appMovedToBackground();
        this.singular.runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SessionManager.1
            @Override // java.lang.Runnable
            public void run() {
                SessionManager.this.setLastSessionPauseTime(j);
                SessionManager.this.inForeground = false;
                BatchManager.getInstance().sendEvents();
                SessionManager.this.unregisterNetworkChangeReceiver();
                Utils.appMovedToBackground();
            }
        });
    }

    void onEnterForeground(final long j) {
        logger.debug("onEnterForeground() At %d", Long.valueOf(j));
        final Boolean boolValueOf = Boolean.valueOf((Utils.isOpenedWithDeeplink() || SLPushNotificationsManager.getInstance().didAppOpenWithPushNotification().booleanValue()) ? false : true);
        this.singular.runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SessionManager.2
            @Override // java.lang.Runnable
            public void run() {
                if (boolValueOf.booleanValue()) {
                    SessionManager.this.startNewSessionIfNeeded(j);
                }
                SessionManager.this.inForeground = true;
                SessionManager.this.registerNetworkChangeReceiver();
            }
        });
    }

    void registerNetworkChangeReceiver() {
        if (this.inForeground || !this.usingForegroundTracking) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.singular.getContext().registerReceiver(this.networkChangeReceiver, intentFilter);
            logger.debug("registerNetworkChangeReceiver()");
        }
    }

    void unregisterNetworkChangeReceiver() {
        if (this.networkChangeReceiver != null) {
            try {
                this.singular.getContext().unregisterReceiver(this.networkChangeReceiver);
                logger.debug("unregisterNetworkChangeReceiver()");
            } catch (Throwable unused) {
            }
        }
    }

    public String toString() {
        return "{id=" + this.sessionId + ", lastSessionPauseTime=" + this.lastSessionPauseTime + ", seq=" + this.sequence + '}';
    }
}
