package io.sentry;

/* loaded from: classes21.dex */
public final class SentryCrashLastRunState {
    private static final SentryCrashLastRunState INSTANCE = new SentryCrashLastRunState();
    private Boolean crashedLastRun;
    private final Object crashedLastRunLock = new Object();
    private boolean readCrashedLastRun;

    private SentryCrashLastRunState() {
    }

    public static SentryCrashLastRunState getInstance() {
        return INSTANCE;
    }

    public void setCrashedLastRun(boolean z) {
        synchronized (this.crashedLastRunLock) {
            try {
                if (!this.readCrashedLastRun) {
                    this.crashedLastRun = Boolean.valueOf(z);
                    this.readCrashedLastRun = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
