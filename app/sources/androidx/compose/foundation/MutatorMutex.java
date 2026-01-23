package androidx.compose.foundation;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: MutatorMutex.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0002\b\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u0003R(\u0010\u001d\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "<init>", "()V", "Landroidx/compose/foundation/MutatorMutex$Mutator;", "mutator", "", "tryMutateOrCancel", "(Landroidx/compose/foundation/MutatorMutex$Mutator;)V", "R", "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryLock", "()Z", "unlock", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Mutator", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class MutatorMutex {
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final Mutex mutex = Mutex3.Mutex$default(false, 1, null);

    /* compiled from: MutatorMutex.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/foundation/MutatorMutex$Mutator;", "", "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/Job;)V", "other", "", "canInterrupt", "(Landroidx/compose/foundation/MutatorMutex$Mutator;)Z", "", "cancel", "()V", "Landroidx/compose/foundation/MutatePriority;", "getPriority", "()Landroidx/compose/foundation/MutatePriority;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* loaded from: classes4.dex */
    private static final class Mutator {
        private final Job job;
        private final MutatorMutex2 priority;

        public Mutator(MutatorMutex2 mutatorMutex2, Job job) {
            this.priority = mutatorMutex2;
            this.job = job;
        }

        public final boolean canInterrupt(Mutator other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void cancel() {
            this.job.cancel((CancellationException) new MutationInterruptedException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatorMutex2 mutatorMutex2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatorMutex2 = MutatorMutex2.Default;
        }
        return mutatorMutex.mutate(mutatorMutex2, function1, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MutatorMutex.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.MutatorMutex$mutate$2", m3645f = "MutatorMutex.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 125}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.MutatorMutex$mutate$2 */
    /* loaded from: classes4.dex */
    static final class C10522<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatorMutex2 $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10522(MutatorMutex2 mutatorMutex2, MutatorMutex mutatorMutex, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super C10522> continuation) {
            super(2, continuation);
            this.$priority = mutatorMutex2;
            this.this$0 = mutatorMutex;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10522 c10522 = new C10522(this.$priority, this.this$0, this.$block, continuation);
            c10522.L$0 = obj;
            return c10522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C10522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Function1<Continuation<? super R>, Object> function1;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutator mutator2;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatorMutex2 mutatorMutex22 = this.$priority;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                        Intrinsics.checkNotNull(element);
                        Mutator mutator3 = new Mutator(mutatorMutex22, (Job) element);
                        this.this$0.tryMutateOrCancel(mutator3);
                        mutex = this.this$0.mutex;
                        Function1<Continuation<? super R>, Object> function12 = this.$block;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = mutex;
                        this.L$2 = function12;
                        this.L$3 = mutatorMutex3;
                        this.label = 1;
                        if (mutex.lock(null, this) != coroutine_suspended) {
                            mutator = mutator3;
                            mutatorMutex = mutatorMutex3;
                            function1 = function12;
                        }
                        return coroutine_suspended;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        mutex2 = (Mutex) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$3;
                    function1 = (Function1) this.L$2;
                    Mutex mutex3 = (Mutex) this.L$1;
                    mutator = (Mutator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    this.L$0 = mutator;
                    this.L$1 = mutex;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke != coroutine_suspended) {
                        mutatorMutex2 = mutatorMutex;
                        mutex2 = mutex;
                        obj = objInvoke;
                        mutator2 = mutator;
                        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                        mutex2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    mutator2 = mutator;
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    public final <R> Object mutate(MutatorMutex2 mutatorMutex2, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return CoroutineScope2.coroutineScope(new C10522(mutatorMutex2, this, function1, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MutatorMutex.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", m3645f = "MutatorMutex.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 165}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.MutatorMutex$mutateWith$2 */
    /* loaded from: classes4.dex */
    static final class C10532<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatorMutex2 $priority;
        final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10532(MutatorMutex2 mutatorMutex2, MutatorMutex mutatorMutex, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t, Continuation<? super C10532> continuation) {
            super(2, continuation);
            this.$priority = mutatorMutex2;
            this.this$0 = mutatorMutex;
            this.$block = function2;
            this.$receiver = t;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10532 c10532 = new C10532(this.$priority, this.this$0, this.$block, this.$receiver, continuation);
            c10532.L$0 = obj;
            return c10532;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C10532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            Function2 function2;
            Mutator mutator;
            MutatorMutex mutatorMutex;
            Object obj2;
            Throwable th;
            MutatorMutex mutatorMutex2;
            Mutator mutator2;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatorMutex2 mutatorMutex22 = this.$priority;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                        Intrinsics.checkNotNull(element);
                        Mutator mutator3 = new Mutator(mutatorMutex22, (Job) element);
                        this.this$0.tryMutateOrCancel(mutator3);
                        mutex = this.this$0.mutex;
                        function2 = this.$block;
                        Object obj3 = this.$receiver;
                        MutatorMutex mutatorMutex3 = this.this$0;
                        this.L$0 = mutator3;
                        this.L$1 = mutex;
                        this.L$2 = function2;
                        this.L$3 = obj3;
                        this.L$4 = mutatorMutex3;
                        this.label = 1;
                        if (mutex.lock(null, this) != coroutine_suspended) {
                            mutator = mutator3;
                            mutatorMutex = mutatorMutex3;
                            obj2 = obj3;
                        }
                        return coroutine_suspended;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.L$2;
                        mutex2 = (Mutex) this.L$1;
                        mutator2 = (Mutator) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                            throw th;
                        }
                    }
                    mutatorMutex = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    function2 = (Function2) this.L$2;
                    Mutex mutex3 = (Mutex) this.L$1;
                    mutator = (Mutator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    this.L$0 = mutator;
                    this.L$1 = mutex;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke != coroutine_suspended) {
                        mutatorMutex2 = mutatorMutex;
                        mutex2 = mutex;
                        obj = objInvoke;
                        mutator2 = mutator;
                        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                        mutex2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    mutatorMutex2 = mutatorMutex;
                    mutator2 = mutator;
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(mutatorMutex2.currentMutator, mutator2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    public final <T, R> Object mutateWith(T t, MutatorMutex2 mutatorMutex2, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return CoroutineScope2.coroutineScope(new C10532(mutatorMutex2, this, function2, t, null), continuation);
    }

    @PublishedApi
    public final boolean tryLock() {
        return Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null);
    }

    @PublishedApi
    public final void unlock() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }
}
