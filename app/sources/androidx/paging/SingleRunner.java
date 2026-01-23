package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: SingleRunner.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0003\u000f\u0010\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J6\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Landroidx/paging/SingleRunner;", "", "cancelPreviousInEqualPriority", "", "(Z)V", "holder", "Landroidx/paging/SingleRunner$Holder;", "runInIsolation", "", "priority", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class SingleRunner {
    private final Holder holder;

    /* compiled from: SingleRunner.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.SingleRunner", m3645f = "SingleRunner.kt", m3646l = {49}, m3647m = "runInIsolation")
    /* renamed from: androidx.paging.SingleRunner$runInIsolation$1 */
    static final class C27891 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27891(Continuation<? super C27891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleRunner.this.runInIsolation(0, null, this);
        }
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public SingleRunner(boolean z) {
        this.holder = new Holder(this, z);
    }

    public /* synthetic */ SingleRunner(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public static /* synthetic */ Object runInIsolation$default(SingleRunner singleRunner, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.runInIsolation(i, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runInIsolation(int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        C27891 c27891;
        SingleRunner singleRunner;
        if (continuation instanceof C27891) {
            c27891 = (C27891) continuation;
            int i2 = c27891.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27891.label = i2 - Integer.MIN_VALUE;
            } else {
                c27891 = new C27891(continuation);
            }
        }
        Object obj = c27891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c27891.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                C27902 c27902 = new C27902(i, function1, null);
                c27891.L$0 = this;
                c27891.label = 1;
                if (CoroutineScope2.coroutineScope(c27902, c27891) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (CancelIsolatedRunnerException e) {
                e = e;
                singleRunner = this;
                if (e.getRunner() != singleRunner) {
                    throw e;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleRunner = (SingleRunner) c27891.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancelIsolatedRunnerException e2) {
                e = e2;
                if (e.getRunner() != singleRunner) {
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SingleRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.SingleRunner$runInIsolation$2", m3645f = "SingleRunner.kt", m3646l = {53, 59, 61, 61}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.SingleRunner$runInIsolation$2 */
    static final class C27902 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        final /* synthetic */ int $priority;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27902(int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C27902> continuation) {
            super(2, continuation);
            this.$priority = i;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27902 c27902 = SingleRunner.this.new C27902(this.$priority, this.$block, continuation);
            c27902.L$0 = obj;
            return c27902;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27902) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        
            if (r9.onFinish(r1, r8) != r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$Holder] */
        /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.SingleRunner$Holder] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Job job;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            int i = 4;
            try {
            } catch (Throwable th) {
                ?? r3 = SingleRunner.this.holder;
                this.L$0 = th;
                this.label = i;
                if (r3.onFinish(r1, this) != coroutine_suspended) {
                    throw th;
                }
            }
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.INSTANCE);
                if (element != null) {
                    Job job2 = (Job) element;
                    Holder holder = SingleRunner.this.holder;
                    int i2 = this.$priority;
                    this.L$0 = job2;
                    this.label = 1;
                    Object objTryEnqueue = holder.tryEnqueue(i2, job2, this);
                    if (objTryEnqueue != coroutine_suspended) {
                        job = job2;
                        obj = objTryEnqueue;
                    }
                    return coroutine_suspended;
                }
                throw new IllegalStateException("Internal error. coroutineScope should've created a job.");
            }
            if (r1 == 1) {
                Job job3 = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                job = job3;
            } else {
                if (r1 != 2) {
                    if (r1 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                Job job4 = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = job4;
                ?? r9 = SingleRunner.this.holder;
                i = 0;
                this.L$0 = null;
                this.label = 3;
            }
            if (((Boolean) obj).booleanValue()) {
                Function1<Continuation<? super Unit>, Object> function1 = this.$block;
                this.L$0 = job;
                this.label = 2;
                r1 = job;
                if (function1.invoke(this) != coroutine_suspended) {
                    ?? r92 = SingleRunner.this.holder;
                    i = 0;
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SingleRunner.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "runner", "Landroidx/paging/SingleRunner;", "(Landroidx/paging/SingleRunner;)V", "getRunner", "()Landroidx/paging/SingleRunner;", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    private static final class CancelIsolatedRunnerException extends CancellationException {
        private final SingleRunner runner;

        public final SingleRunner getRunner() {
            return this.runner;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelIsolatedRunnerException(SingleRunner runner) {
            super("Cancelled isolated runner");
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.runner = runner;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRunner.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "singleRunner", "Landroidx/paging/SingleRunner;", "cancelPreviousInEqualPriority", "", "(Landroidx/paging/SingleRunner;Z)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "previous", "Lkotlinx/coroutines/Job;", "previousPriority", "", "onFinish", "", "job", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEnqueue", "priority", "(ILkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    static final class Holder {
        private final boolean cancelPreviousInEqualPriority;
        private final Mutex mutex;
        private Job previous;
        private int previousPriority;
        private final SingleRunner singleRunner;

        public Holder(SingleRunner singleRunner, boolean z) {
            Intrinsics.checkNotNullParameter(singleRunner, "singleRunner");
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z;
            this.mutex = Mutex3.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object tryEnqueue(int i, Job job, Continuation<? super Boolean> continuation) {
            SingleRunner3 singleRunner3;
            Holder holder;
            Job job2;
            Mutex mutex;
            Job job3;
            Holder holder2;
            int i2;
            if (continuation instanceof SingleRunner3) {
                singleRunner3 = (SingleRunner3) continuation;
                int i3 = singleRunner3.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    singleRunner3.label = i3 - Integer.MIN_VALUE;
                } else {
                    singleRunner3 = new SingleRunner3(this, continuation);
                }
            }
            Object obj = singleRunner3.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = singleRunner3.label;
            boolean z = true;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Mutex mutex2 = this.mutex;
                    singleRunner3.L$0 = this;
                    singleRunner3.L$1 = job;
                    singleRunner3.L$2 = mutex2;
                    singleRunner3.I$0 = i;
                    singleRunner3.label = 1;
                    if (mutex2.lock(null, singleRunner3) != coroutine_suspended) {
                        holder = this;
                        job2 = job;
                        mutex = mutex2;
                    }
                    return coroutine_suspended;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = singleRunner3.I$0;
                    Mutex mutex3 = (Mutex) singleRunner3.L$2;
                    job3 = (Job) singleRunner3.L$1;
                    holder2 = (Holder) singleRunner3.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    holder = holder2;
                    job2 = job3;
                    holder.previous = job2;
                    holder.previousPriority = i;
                    job = mutex;
                    return boxing.boxBoolean(z);
                }
                i = singleRunner3.I$0;
                Mutex mutex4 = (Mutex) singleRunner3.L$2;
                job2 = (Job) singleRunner3.L$1;
                holder = (Holder) singleRunner3.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex4;
                Job job4 = holder.previous;
                if (job4 != null && job4.isActive() && (i2 = holder.previousPriority) >= i && (i2 != i || !holder.cancelPreviousInEqualPriority)) {
                    z = false;
                    job = mutex;
                    return boxing.boxBoolean(z);
                }
                if (job4 != null) {
                    job4.cancel((CancellationException) new CancelIsolatedRunnerException(holder.singleRunner));
                }
                if (job4 != null) {
                    singleRunner3.L$0 = holder;
                    singleRunner3.L$1 = job2;
                    singleRunner3.L$2 = mutex;
                    singleRunner3.I$0 = i;
                    singleRunner3.label = 2;
                    if (job4.join(singleRunner3) != coroutine_suspended) {
                        job3 = job2;
                        holder2 = holder;
                        mutex = mutex;
                        holder = holder2;
                        job2 = job3;
                    }
                    return coroutine_suspended;
                }
                holder.previous = job2;
                holder.previousPriority = i;
                job = mutex;
                return boxing.boxBoolean(z);
            } finally {
                job.unlock(null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object onFinish(Job job, Continuation<? super Unit> continuation) {
            SingleRunner2 singleRunner2;
            Mutex mutex;
            Holder holder;
            if (continuation instanceof SingleRunner2) {
                singleRunner2 = (SingleRunner2) continuation;
                int i = singleRunner2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    singleRunner2.label = i - Integer.MIN_VALUE;
                } else {
                    singleRunner2 = new SingleRunner2(this, continuation);
                }
            }
            Object obj = singleRunner2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = singleRunner2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.mutex;
                singleRunner2.L$0 = this;
                singleRunner2.L$1 = job;
                singleRunner2.L$2 = mutex;
                singleRunner2.label = 1;
                if (mutex.lock(null, singleRunner2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                holder = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex2 = (Mutex) singleRunner2.L$2;
                Job job2 = (Job) singleRunner2.L$1;
                holder = (Holder) singleRunner2.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                job = job2;
            }
            try {
                if (job == holder.previous) {
                    holder.previous = null;
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }
}
