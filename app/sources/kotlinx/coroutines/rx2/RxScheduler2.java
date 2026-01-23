package kotlinx.coroutines.rx2;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Instrument;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.rx2.RxScheduler2;

/* compiled from: RxScheduler.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001 J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u000b\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¨\u0006!"}, m3636d2 = {"Lkotlinx/coroutines/rx2/DispatcherScheduler;", "Lio/reactivex/Scheduler;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "delay", "Ljava/util/concurrent/TimeUnit;", Instrument.TYPE_UNIT, "Lio/reactivex/disposables/Disposable;", "scheduleDirect", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Scheduler$Worker;", "createWorker", "()Lio/reactivex/Scheduler$Worker;", "", "shutdown", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CompletableJob;", "schedulerJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/atomicfu/AtomicLong;", "workerCounter", "DispatcherWorker", "kotlinx-coroutines-rx2"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.rx2.DispatcherScheduler, reason: use source file name */
/* loaded from: classes14.dex */
final class RxScheduler2 extends Scheduler {
    private static final /* synthetic */ AtomicLongFieldUpdater workerCounter$volatile$FU = AtomicLongFieldUpdater.newUpdater(RxScheduler2.class, "workerCounter$volatile");

    @JvmField
    public final CoroutineDispatcher dispatcher;
    private final CompletableJob schedulerJob;
    private final CoroutineScope scope;
    private volatile /* synthetic */ long workerCounter$volatile;

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable block, long delay, TimeUnit unit) {
        return RxScheduler4.scheduleTask(this.scope, block, unit.toMillis(delay), new Function1() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RxScheduler2.scheduleDirect$lambda$1(this.f$0, (Function1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable scheduleDirect$lambda$1(final RxScheduler2 rxScheduler2, final Function1 function1) {
        return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RxScheduler2.scheduleDirect$lambda$1$lambda$0(this.f$0, function1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleDirect$lambda$1$lambda$0(RxScheduler2 rxScheduler2, Function1 function1) {
        BuildersKt__Builders_commonKt.launch$default(rxScheduler2.scope, null, null, new RxScheduler3(function1, null), 3, null);
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new DispatcherWorker(workerCounter$volatile$FU.getAndIncrement(this), this.dispatcher, this.schedulerJob);
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        Job.DefaultImpls.cancel$default(this.schedulerJob, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RxScheduler.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lkotlinx/coroutines/rx2/DispatcherScheduler$DispatcherWorker;", "Lio/reactivex/Scheduler$Worker;", "counter", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "parentJob", "Lkotlinx/coroutines/Job;", "<init>", "(JLkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/Job;)V", "workerJob", "Lkotlinx/coroutines/CompletableJob;", "workerScope", "Lkotlinx/coroutines/CoroutineScope;", "blockChannel", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "schedule", "Lio/reactivex/disposables/Disposable;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "delay", Instrument.TYPE_UNIT, "Ljava/util/concurrent/TimeUnit;", "isDisposed", "", "dispose", "toString", "", "kotlinx-coroutines-rx2"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker */
    static final class DispatcherWorker extends Scheduler.Worker {
        private final Channel<Function1<Continuation<? super Unit>, Object>> blockChannel;
        private final long counter;
        private final CoroutineDispatcher dispatcher;
        private final CompletableJob workerJob;
        private final CoroutineScope workerScope;

        public DispatcherWorker(long j, CoroutineDispatcher coroutineDispatcher, Job job) {
            this.counter = j;
            this.dispatcher = coroutineDispatcher;
            CompletableJob completableJobSupervisorJob = Supervisor3.SupervisorJob(job);
            this.workerJob = completableJobSupervisorJob;
            CoroutineScope CoroutineScope = CoroutineScope2.CoroutineScope(completableJobSupervisorJob.plus(coroutineDispatcher));
            this.workerScope = CoroutineScope;
            this.blockChannel = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C461341(null), 3, null);
        }

        /* compiled from: RxScheduler.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1", m3645f = "RxScheduler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, 78}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1 */
        static final class C461341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            int label;

            C461341(Continuation<? super C461341> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return DispatcherWorker.this.new C461341(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C461341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
            
                if (r7.invoke(r6) == r0) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x003e, B:22:0x004e, B:24:0x0056, B:27:0x0069, B:14:0x002d, B:17:0x003a), top: B:36:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x003e, B:22:0x004e, B:24:0x0056, B:27:0x0069, B:14:0x002d, B:17:0x003a), top: B:36:0x0008 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:8:0x0019). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Channel8 channel8;
                Channel3 it;
                Channel3 channel3;
                Object objHasNext;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        channel8 = DispatcherWorker.this.blockChannel;
                        it = channel8.iterator();
                        this.L$0 = channel8;
                        this.L$1 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext != coroutine_suspended) {
                        }
                    } else if (i == 1) {
                        channel3 = (Channel3) this.L$1;
                        channel8 = (Channel8) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channel3 = (Channel3) this.L$1;
                        channel8 = (Channel8) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = channel3;
                        this.L$0 = channel8;
                        this.L$1 = it;
                        this.label = 1;
                        objHasNext = it.hasNext(this);
                        if (objHasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channel3 = it;
                        obj = objHasNext;
                        if (!((Boolean) obj).booleanValue()) {
                            Function1 function1 = (Function1) channel3.next();
                            this.L$0 = channel8;
                            this.L$1 = channel3;
                            this.label = 2;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed(channel8, null);
                            return Unit.INSTANCE;
                        }
                    }
                } finally {
                }
            }
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable block, long delay, TimeUnit unit) {
            return RxScheduler4.scheduleTask(this.workerScope, block, unit.toMillis(delay), new Function1() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RxScheduler2.DispatcherWorker.schedule$lambda$1(this.f$0, (Function1) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Runnable schedule$lambda$1(final DispatcherWorker dispatcherWorker, final Function1 function1) {
            return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    RxScheduler2.DispatcherWorker.schedule$lambda$1$lambda$0(this.f$0, function1);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void schedule$lambda$1$lambda$0(DispatcherWorker dispatcherWorker, Function1 function1) {
            dispatcherWorker.blockChannel.mo8337trySendJP2dKIU(function1);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: isDisposed */
        public boolean getDisposed() {
            return !CoroutineScope2.isActive(this.workerScope);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Channel9.DefaultImpls.close$default(this.blockChannel, null, 1, null);
            Job.DefaultImpls.cancel$default(this.workerJob, null, 1, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.dispatcher);
            sb.append(" (worker ");
            sb.append(this.counter);
            sb.append(", ");
            sb.append(getDisposed() ? "disposed" : "active");
            sb.append(')');
            return sb.toString();
        }
    }

    public String toString() {
        return this.dispatcher.getName();
    }
}
