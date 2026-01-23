package com.twilio.util;

import android.os.Process;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Executors6;

/* compiled from: CoroutineContextAndroid.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, m3636d2 = {"newSingleThreadCoroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "name", "", "setThreadPriority", "", "priority", "", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.CoroutineContextAndroidKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CoroutineContextAndroid {
    public static final CoroutineDispatcher newSingleThreadCoroutineContext(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.twilio.util.CoroutineContextAndroidKt$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return CoroutineContextAndroid.newSingleThreadCoroutineContext$lambda$2(name, runnable);
            }
        });
        Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return Executors6.from((ExecutorService) scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread newSingleThreadCoroutineContext$lambda$2(String name, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(new Runnable() { // from class: com.twilio.util.CoroutineContextAndroidKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineContextAndroid.newSingleThreadCoroutineContext$lambda$2$lambda$0(runnable);
            }
        }, name);
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newSingleThreadCoroutineContext$lambda$2$lambda$0(Runnable runnable) {
        setThreadPriority(-1);
        runnable.run();
    }

    private static final void setThreadPriority(int i) {
        try {
            Process.setThreadPriority(i);
        } catch (Throwable th) {
            TwilioLogger.INSTANCE.getLogger("setThreadPriority").m3202w("Exception in Process.setThreadPriority(" + i + ')', th);
        }
    }
}
