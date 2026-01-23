package kotlinx.coroutines.rx2;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Interruptible;
import kotlinx.coroutines.Job4;

/* compiled from: RxScheduler.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aY\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b20\u0010\u000f\u001a,\u0012\u001e\u0012\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nj\u0002`\u000e\u0012\b\u0012\u00060\u0005j\u0002`\u00060\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012*8\b\u0002\u0010\u0013\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¨\u0006\u0014"}, m3636d2 = {"Lio/reactivex/Scheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "asCoroutineDispatcher", "(Lio/reactivex/Scheduler;)Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "delayMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlinx/coroutines/rx2/Task;", "adaptForScheduling", "Lio/reactivex/disposables/Disposable;", "scheduleTask", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Runnable;JLkotlin/jvm/functions/Function1;)Lio/reactivex/disposables/Disposable;", "Task", "kotlinx-coroutines-rx2"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.rx2.RxSchedulerKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class RxScheduler4 {
    public static final CoroutineDispatcher asCoroutineDispatcher(Scheduler scheduler) {
        if (scheduler instanceof RxScheduler2) {
            return ((RxScheduler2) scheduler).dispatcher;
        }
        return new RxScheduler7(scheduler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, kotlinx.coroutines.DisposableHandle] */
    public static final Disposable scheduleTask(CoroutineScope coroutineScope, Runnable runnable, long j, Function1<? super Function1<? super Continuation<? super Unit>, ? extends Object>, ? extends Runnable> function1) {
        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Disposable disposableFromRunnable = Disposables.fromRunnable(new Runnable() { // from class: kotlinx.coroutines.rx2.RxSchedulerKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RxScheduler4.scheduleTask$lambda$0(objectRef);
            }
        });
        Runnable runnableInvoke = function1.invoke(new RxScheduler6(disposableFromRunnable, coroutineContext, RxJavaPlugins.onSchedule(runnable)));
        if (!CoroutineScope2.isActive(coroutineScope)) {
            return Disposables.disposed();
        }
        if (j <= 0) {
            runnableInvoke.run();
            return disposableFromRunnable;
        }
        objectRef.element = DelayKt.getDelay(coroutineContext).invokeOnTimeout(j, runnableInvoke, coroutineContext);
        return disposableFromRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleTask$lambda$0(Ref.ObjectRef objectRef) {
        Job4 job4 = (Job4) objectRef.element;
        if (job4 != null) {
            job4.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scheduleTask$task(Disposable disposable, CoroutineContext coroutineContext, final Runnable runnable, Continuation<? super Unit> continuation) {
        RxScheduler5 rxScheduler5;
        if (continuation instanceof RxScheduler5) {
            rxScheduler5 = (RxScheduler5) continuation;
            int i = rxScheduler5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxScheduler5.label = i - Integer.MIN_VALUE;
            } else {
                rxScheduler5 = new RxScheduler5(continuation);
            }
        }
        Object obj = rxScheduler5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rxScheduler5.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (disposable.isDisposed()) {
                    return Unit.INSTANCE;
                }
                Function0 function0 = new Function0() { // from class: kotlinx.coroutines.rx2.RxSchedulerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RxScheduler4.scheduleTask$task$lambda$1(runnable);
                    }
                };
                rxScheduler5.L$0 = coroutineContext;
                rxScheduler5.label = 1;
                if (Interruptible.runInterruptible$default(null, function0, rxScheduler5, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineContext = (CoroutineContext) rxScheduler5.L$0;
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable th) {
            RxCancellable2.handleUndeliverableException(th, coroutineContext);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scheduleTask$task$lambda$1(Runnable runnable) {
        runnable.run();
        return Unit.INSTANCE;
    }
}
