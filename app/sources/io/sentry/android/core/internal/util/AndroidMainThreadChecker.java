package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.SentryThread;
import io.sentry.util.thread.IMainThreadChecker;

/* loaded from: classes21.dex */
public final class AndroidMainThreadChecker implements IMainThreadChecker {
    private static final AndroidMainThreadChecker instance = new AndroidMainThreadChecker();

    public static AndroidMainThreadChecker getInstance() {
        return instance;
    }

    private AndroidMainThreadChecker() {
    }

    public boolean isMainThread(long j) {
        return Looper.getMainLooper().getThread().getId() == j;
    }

    public boolean isMainThread(Thread thread) {
        return isMainThread(thread.getId());
    }

    @Override // io.sentry.util.thread.IMainThreadChecker
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    public boolean isMainThread(SentryThread sentryThread) {
        Long id = sentryThread.getId();
        return id != null && isMainThread(id.longValue());
    }
}
