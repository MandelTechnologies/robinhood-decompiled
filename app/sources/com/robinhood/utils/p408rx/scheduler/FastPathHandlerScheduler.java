package com.robinhood.utils.p408rx.scheduler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.robinhood.models.p320db.Instrument;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FastPathHandlerScheduler.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/rx/scheduler/FastPathHandlerScheduler;", "Lio/reactivex/Scheduler;", "handler", "Landroid/os/Handler;", "<init>", "(Landroid/os/Handler;)V", "scheduleDirect", "Lio/reactivex/disposables/Disposable;", "runnable", "Ljava/lang/Runnable;", "delay", "", Instrument.TYPE_UNIT, "Ljava/util/concurrent/TimeUnit;", "createWorker", "Lio/reactivex/Scheduler$Worker;", "HandlerWorker", "ScheduledRunnable", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FastPathHandlerScheduler extends Scheduler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FastPathHandlerScheduler mainThread = new FastPathHandlerScheduler(new Handler(Looper.getMainLooper()));
    private final Handler handler;

    public static final FastPathHandlerScheduler getMainThread() {
        return INSTANCE.getMainThread();
    }

    public FastPathHandlerScheduler(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long delay, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        Intrinsics.checkNotNullExpressionValue(runnableOnSchedule, "onSchedule(...)");
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.handler, runnableOnSchedule);
        if (delay <= 0 && Looper.myLooper() == this.handler.getLooper()) {
            scheduledRunnable.run();
            Disposable disposableDisposed = Disposables.disposed();
            Intrinsics.checkNotNullExpressionValue(disposableDisposed, "disposed(...)");
            return disposableDisposed;
        }
        this.handler.postDelayed(scheduledRunnable, unit.toMillis(delay));
        return scheduledRunnable;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new HandlerWorker(this.handler);
    }

    /* compiled from: FastPathHandlerScheduler.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/rx/scheduler/FastPathHandlerScheduler$HandlerWorker;", "Lio/reactivex/Scheduler$Worker;", "handler", "Landroid/os/Handler;", "<init>", "(Landroid/os/Handler;)V", "disposed", "", "schedule", "Lio/reactivex/disposables/Disposable;", "runnable", "Ljava/lang/Runnable;", "delay", "", Instrument.TYPE_UNIT, "Ljava/util/concurrent/TimeUnit;", "dispose", "", "isDisposed", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class HandlerWorker extends Scheduler.Worker {
        private volatile boolean disposed;
        private final Handler handler;

        public HandlerWorker(Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.handler = handler;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long delay, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Intrinsics.checkNotNullParameter(unit, "unit");
            if (this.disposed) {
                Disposable disposableDisposed = Disposables.disposed();
                Intrinsics.checkNotNullExpressionValue(disposableDisposed, "disposed(...)");
                return disposableDisposed;
            }
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            Intrinsics.checkNotNullExpressionValue(runnableOnSchedule, "onSchedule(...)");
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(this.handler, runnableOnSchedule);
            if (delay <= 0 && Looper.myLooper() == this.handler.getLooper()) {
                scheduledRunnable.run();
                Disposable disposableDisposed2 = Disposables.disposed();
                Intrinsics.checkNotNullExpressionValue(disposableDisposed2, "disposed(...)");
                return disposableDisposed2;
            }
            Message messageObtain = Message.obtain(this.handler, scheduledRunnable);
            messageObtain.obj = this;
            this.handler.sendMessageDelayed(messageObtain, unit.toMillis(delay));
            if (!this.disposed) {
                return scheduledRunnable;
            }
            this.handler.removeCallbacks(scheduledRunnable);
            Disposable disposableDisposed3 = Disposables.disposed();
            Intrinsics.checkNotNullExpressionValue(disposableDisposed3, "disposed(...)");
            return disposableDisposed3;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.handler.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: isDisposed, reason: from getter */
        public boolean getDisposed() {
            return this.disposed;
        }
    }

    /* compiled from: FastPathHandlerScheduler.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/rx/scheduler/FastPathHandlerScheduler$ScheduledRunnable;", "Ljava/lang/Runnable;", "Lio/reactivex/disposables/Disposable;", "handler", "Landroid/os/Handler;", "delegate", "<init>", "(Landroid/os/Handler;Ljava/lang/Runnable;)V", "disposed", "", "run", "", "dispose", "isDisposed", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ScheduledRunnable implements Runnable, Disposable {
        private final Runnable delegate;
        private volatile boolean disposed;
        private final Handler handler;

        public ScheduledRunnable(Handler handler, Runnable delegate) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.handler = handler;
            this.delegate = delegate;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.delegate.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.handler.removeCallbacks(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: isDisposed, reason: from getter */
        public boolean getDisposed() {
            return this.disposed;
        }
    }

    /* compiled from: FastPathHandlerScheduler.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/rx/scheduler/FastPathHandlerScheduler$Companion;", "", "<init>", "()V", "mainThread", "Lcom/robinhood/utils/rx/scheduler/FastPathHandlerScheduler;", "getMainThread$annotations", "getMainThread", "()Lcom/robinhood/utils/rx/scheduler/FastPathHandlerScheduler;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getMainThread$annotations() {
        }

        private Companion() {
        }

        public final FastPathHandlerScheduler getMainThread() {
            return FastPathHandlerScheduler.mainThread;
        }
    }
}
