package io.sentry.util.thread;

/* loaded from: classes21.dex */
public final class NoOpMainThreadChecker implements IMainThreadChecker {
    private static final NoOpMainThreadChecker instance = new NoOpMainThreadChecker();

    @Override // io.sentry.util.thread.IMainThreadChecker
    public boolean isMainThread() {
        return false;
    }

    public static NoOpMainThreadChecker getInstance() {
        return instance;
    }
}
