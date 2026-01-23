package com.robinhood.p370rx.android;

import android.os.StrictMode;
import com.singular.sdk.internal.Constants;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.schedulers.ComputationScheduler;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxSchedulerMonitor.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rx/android/RxSchedulerMonitor;", "", "<init>", "()V", "init", "", "ThreadFactoryWrapper", "lib-rx-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RxSchedulerMonitor {
    public static final RxSchedulerMonitor INSTANCE = new RxSchedulerMonitor();

    public final void init() {
    }

    private RxSchedulerMonitor() {
    }

    /* compiled from: RxSchedulerMonitor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rx.android.RxSchedulerMonitor$init$1 */
    static final class C372831<T, R> implements Function {
        final /* synthetic */ ThreadFactoryWrapper $wrappedFactory;

        C372831(ThreadFactoryWrapper threadFactoryWrapper) {
            this.$wrappedFactory = threadFactoryWrapper;
        }

        @Override // io.reactivex.functions.Function
        public final Scheduler apply(Callable<Scheduler> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new ComputationScheduler(this.$wrappedFactory);
        }
    }

    /* compiled from: RxSchedulerMonitor.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/rx/android/RxSchedulerMonitor$ThreadFactoryWrapper;", "Ljava/util/concurrent/ThreadFactory;", "delegate", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "newThread", "Ljava/lang/Thread;", Constants.REVENUE_AMOUNT_KEY, "Ljava/lang/Runnable;", "lib-rx-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ThreadFactoryWrapper implements ThreadFactory {
        private final ThreadFactory delegate;

        public ThreadFactoryWrapper(ThreadFactory delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable r) {
            Intrinsics.checkNotNullParameter(r, "r");
            Thread threadNewThread = this.delegate.newThread(new Runnable() { // from class: com.robinhood.rx.android.RxSchedulerMonitor$ThreadFactoryWrapper$newThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().permitDiskReads().permitDiskWrites().penaltyLog().penaltyDeath().build());
                    r.run();
                }
            });
            Intrinsics.checkNotNullExpressionValue(threadNewThread, "newThread(...)");
            return threadNewThread;
        }
    }
}
