package io.sentry.util.thread;

/* loaded from: classes14.dex */
public final class MainThreadChecker implements IMainThreadChecker {
    private static final long mainThreadId = Thread.currentThread().getId();
    private static final MainThreadChecker instance = new MainThreadChecker();

    public static MainThreadChecker getInstance() {
        return instance;
    }

    private MainThreadChecker() {
    }

    public boolean isMainThread(long j) {
        return mainThreadId == j;
    }

    public boolean isMainThread(Thread thread) {
        return isMainThread(thread.getId());
    }

    @Override // io.sentry.util.thread.IMainThreadChecker
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }
}
