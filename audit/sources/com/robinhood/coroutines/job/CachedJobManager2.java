package com.robinhood.coroutines.job;

import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: CachedJobManager.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 =*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002<=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0006H$¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0017JR\u0010 \u001a\u0002H!\"\u0004\b\u0001\u0010!2<\u0010\"\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0&\u0012\u0006\u0012\u0004\u0018\u00010'0#¢\u0006\u0002\b(H\u0086@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,J \u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0086@¢\u0006\u0002\u00102J\u000e\u00103\u001a\u000204H\u0096@¢\u0006\u0002\u0010,J\u001a\u00105\u001a\u00020\u00152\n\u00100\u001a\u000606j\u0002`7H\u0082@¢\u0006\u0002\u00108J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0002\u0010,J\u000e\u0010:\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010,J\b\u0010;\u001a\u00020\u0015H\u0002R\u0012\u0010\u0005\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, m3636d2 = {"Lcom/robinhood/coroutines/job/AbstractCachedJobManager;", "C", "Lcom/robinhood/coroutines/job/CachedJobManager;", "<init>", "()V", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "getParentScope", "()Lkotlinx/coroutines/CoroutineScope;", "idleTimeout", "Lkotlin/time/Duration;", "getIdleTimeout-UwyO8pc", "()J", "additionalContext", "Lkotlin/coroutines/CoroutineContext;", "getAdditionalContext", "()Lkotlin/coroutines/CoroutineContext;", "launchComponent", "scope", "(Lkotlinx/coroutines/CoroutineScope;)Ljava/lang/Object;", "onComponentDestroyed", "", "component", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activeCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "state", "Lcom/robinhood/coroutines/job/AbstractCachedJobManager$State;", "idleTimerJob", "Lkotlinx/coroutines/Job;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "execute", "R", "block", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAwake", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retainUntilCanceled", "", "sleepImpl", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtainComponent", "startIdleTimer", "cancelIdleTimer", "State", "Companion", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager, reason: use source file name */
/* loaded from: classes20.dex */
public abstract class CachedJobManager2<C> implements CachedJobManager<C> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_TIMEOUT;
    private Job idleTimerJob;
    private State<C> state;
    private final AtomicInteger activeCount = new AtomicInteger(0);
    private final Mutex lock = Mutex3.Mutex$default(false, 1, null);

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 123, 128, 128}, m3647m = "execute")
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$execute$1 */
    /* loaded from: classes15.dex */
    static final class C329781<R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CachedJobManager2<C> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C329781(CachedJobManager2<C> cachedJobManager2, Continuation<? super C329781> continuation) {
            super(continuation);
            this.this$0 = cachedJobManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.execute(null, this);
        }
    }

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "isAwake")
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$isAwake$1 */
    /* loaded from: classes15.dex */
    static final class C329801 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CachedJobManager2<C> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C329801(CachedJobManager2<C> cachedJobManager2, Continuation<? super C329801> continuation) {
            super(continuation);
            this.this$0 = cachedJobManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.isAwake(this);
        }
    }

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "obtainComponent")
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$obtainComponent$1 */
    /* loaded from: classes15.dex */
    static final class C329811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CachedJobManager2<C> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C329811(CachedJobManager2<C> cachedJobManager2, Continuation<? super C329811> continuation) {
            super(continuation);
            this.this$0 = cachedJobManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.obtainComponent(this);
        }
    }

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "retainUntilCanceled$suspendImpl")
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$retainUntilCanceled$1 */
    /* loaded from: classes15.dex */
    static final class C329821<C> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CachedJobManager2<C> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C329821(CachedJobManager2<C> cachedJobManager2, Continuation<? super C329821> continuation) {
            super(continuation);
            this.this$0 = cachedJobManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachedJobManager2.retainUntilCanceled$suspendImpl(this.this$0, this);
        }
    }

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.f2779x59907a3d, 151}, m3647m = "sleepImpl")
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$sleepImpl$1 */
    /* loaded from: classes15.dex */
    static final class C329841 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CachedJobManager2<C> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C329841(CachedJobManager2<C> cachedJobManager2, Continuation<? super C329841> continuation) {
            super(continuation);
            this.this$0 = cachedJobManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sleepImpl(null, this);
        }
    }

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "startIdleTimer")
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$startIdleTimer$1 */
    /* loaded from: classes15.dex */
    static final class C329851 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CachedJobManager2<C> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C329851(CachedJobManager2<C> cachedJobManager2, Continuation<? super C329851> continuation) {
            super(continuation);
            this.this$0 = cachedJobManager2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.startIdleTimer(this);
        }
    }

    protected abstract CoroutineScope getParentScope();

    protected abstract C launchComponent(CoroutineScope scope);

    public Object onComponentDestroyed(C c, Continuation<? super Unit> continuation) {
        return onComponentDestroyed$suspendImpl(this, c, continuation);
    }

    @Override // com.robinhood.coroutines.job.CachedJobManager7
    public Object retainUntilCanceled(Continuation<?> continuation) {
        return retainUntilCanceled$suspendImpl(this, continuation);
    }

    /* renamed from: getIdleTimeout-UwyO8pc, reason: not valid java name */
    protected long getIdleTimeout() {
        return DEFAULT_TIMEOUT;
    }

    protected CoroutineContext getAdditionalContext() {
        return CoroutineContextImpl6.INSTANCE;
    }

    static /* synthetic */ <C> Object onComponentDestroyed$suspendImpl(CachedJobManager2<C> cachedJobManager2, C c, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.coroutines.job.CachedJobManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object execute(Function3<? super CoroutineScope, ? super C, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        C329781 c329781;
        if (continuation instanceof C329781) {
            c329781 = (C329781) continuation;
            int i = c329781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329781.label = i - Integer.MIN_VALUE;
            } else {
                c329781 = new C329781(this, continuation);
            }
        }
        Object objObtainComponent = c329781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329781.label;
        try {
        } catch (Throwable th) {
            if (this.activeCount.decrementAndGet() != 0) {
                throw th;
            }
            c329781.L$0 = th;
            c329781.label = 4;
            if (startIdleTimer(c329781) != coroutine_suspended) {
                throw th;
            }
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objObtainComponent);
            this.activeCount.incrementAndGet();
            c329781.L$0 = function3;
            c329781.label = 1;
            objObtainComponent = obtainComponent(c329781);
            if (objObtainComponent == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(objObtainComponent);
                if (this.activeCount.decrementAndGet() == 0) {
                    c329781.L$0 = objObtainComponent;
                    c329781.label = 3;
                    if (startIdleTimer(c329781) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return objObtainComponent;
            }
            if (i2 == 3) {
                Object obj = c329781.L$0;
                ResultKt.throwOnFailure(objObtainComponent);
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th2 = (Throwable) c329781.L$0;
            ResultKt.throwOnFailure(objObtainComponent);
            throw th2;
        }
        function3 = (Function3) c329781.L$0;
        ResultKt.throwOnFailure(objObtainComponent);
        State state = (State) objObtainComponent;
        Job job = state.getJob();
        C329792 c329792 = new C329792(function3, state, null);
        c329781.L$0 = null;
        c329781.label = 2;
        objObtainComponent = SpecialCancellation2.withCancellation(job, c329792, c329781);
        if (objObtainComponent != coroutine_suspended) {
            if (this.activeCount.decrementAndGet() == 0) {
            }
            return objObtainComponent;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: CachedJobManager.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager$execute$2", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$execute$2 */
    /* loaded from: classes15.dex */
    static final class C329792<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function3<CoroutineScope, C, Continuation<? super R>, Object> $block;
        final /* synthetic */ State<C> $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329792(Function3<? super CoroutineScope, ? super C, ? super Continuation<? super R>, ? extends Object> function3, State<C> state, Continuation<? super C329792> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$state = state;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329792 c329792 = new C329792(this.$block, this.$state, continuation);
            c329792.L$0 = obj;
            return c329792;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C329792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Function3<CoroutineScope, C, Continuation<? super R>, Object> function3 = this.$block;
            C component = this.$state.getComponent();
            this.label = 1;
            Object objInvoke = function3.invoke(coroutineScope, component, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.coroutines.job.CachedJobManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isAwake(Continuation<? super Boolean> continuation) {
        C329801 c329801;
        Mutex mutex;
        Job job;
        if (continuation instanceof C329801) {
            c329801 = (C329801) continuation;
            int i = c329801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329801.label = i - Integer.MIN_VALUE;
            } else {
                c329801 = new C329801(this, continuation);
            }
        }
        Object obj = c329801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329801.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.lock;
            c329801.L$0 = mutex2;
            c329801.label = 1;
            if (mutex2.lock(null, c329801) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c329801.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            State<C> state = this.state;
            if (state == null || (job = state.getJob()) == null || !job.isActive()) {
                z = false;
            }
            Boolean boolBoxBoolean = boxing.boxBoolean(z);
            mutex.unlock(null);
            return boolBoxBoolean;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // com.robinhood.coroutines.job.CachedJobManager
    public final Object sleep(String str, Throwable th, Continuation<? super Unit> continuation) throws Throwable {
        Object objSleepImpl = sleepImpl(new CachedJobManager8(str, th), continuation);
        return objSleepImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSleepImpl : Unit.INSTANCE;
    }

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "C", "Lkotlinx/coroutines/CoroutineScope;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.AbstractCachedJobManager$retainUntilCanceled$2", m3645f = "CachedJobManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$retainUntilCanceled$2 */
    /* loaded from: classes15.dex */
    static final class C329832 extends ContinuationImpl7 implements Function3<CoroutineScope, C, Continuation<?>, Object> {
        int label;

        C329832(Continuation<? super C329832> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object obj, Continuation<?> continuation) {
            return invoke2(coroutineScope, (CoroutineScope) obj, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, C c, Continuation<?> continuation) {
            return new C329832(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <C> Object retainUntilCanceled$suspendImpl(CachedJobManager2<C> cachedJobManager2, Continuation<?> continuation) {
        C329821 c329821;
        if (continuation instanceof C329821) {
            c329821 = (C329821) continuation;
            int i = c329821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329821.label = i - Integer.MIN_VALUE;
            } else {
                c329821 = new C329821(cachedJobManager2, continuation);
            }
        }
        Object obj = c329821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C329832 c329832 = new C329832(null);
            c329821.label = 1;
            if (cachedJobManager2.execute(c329832, c329821) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sleepImpl(CancellationException cancellationException, Continuation<? super Unit> continuation) throws Throwable {
        C329841 c329841;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        if (continuation instanceof C329841) {
            c329841 = (C329841) continuation;
            int i = c329841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329841.label = i - Integer.MIN_VALUE;
            } else {
                c329841 = new C329841(this, continuation);
            }
        }
        Object obj = c329841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329841.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.lock;
                c329841.L$0 = cancellationException;
                c329841.L$1 = mutex;
                c329841.label = 1;
                if (mutex.lock(null, c329841) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c329841.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) c329841.L$1;
            CancellationException cancellationException2 = (CancellationException) c329841.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            cancellationException = cancellationException2;
            NonCancellable nonCancellable = NonCancellable.INSTANCE;
            CachedJobManager3 cachedJobManager3 = new CachedJobManager3(this, cancellationException, null);
            c329841.L$0 = mutex;
            c329841.L$1 = null;
            c329841.label = 2;
            if (BuildersKt.withContext(nonCancellable, cachedJobManager3, c329841) != coroutine_suspended) {
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return unit2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex4 = mutex;
            th = th3;
            mutex2 = mutex4;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object obtainComponent(Continuation<? super State<C>> continuation) {
        C329811 c329811;
        Mutex mutex;
        if (continuation instanceof C329811) {
            c329811 = (C329811) continuation;
            int i = c329811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329811.label = i - Integer.MIN_VALUE;
            } else {
                c329811 = new C329811(this, continuation);
            }
        }
        Object obj = c329811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.lock;
            c329811.L$0 = mutex2;
            c329811.label = 1;
            if (mutex2.lock(null, c329811) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c329811.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            cancelIdleTimer();
            State<C> state = this.state;
            if (state != null && state.getJob().isActive()) {
                return state;
            }
            CoroutineContext.Element element = getParentScope().getCoroutineContext().get(Job.INSTANCE);
            if (element == null) {
                throw new IllegalStateException(("Parent context must contain a job: " + getParentScope()).toString());
            }
            CompletableJob completableJobJob = JobKt.Job((Job) element);
            State<C> state2 = new State<>(completableJobJob, launchComponent(CoroutineScope2.plus(CoroutineScope2.plus(getParentScope(), completableJobJob), getAdditionalContext())));
            this.state = state2;
            return state2;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startIdleTimer(Continuation<? super Unit> continuation) {
        C329851 c329851;
        Mutex mutex;
        if (continuation instanceof C329851) {
            c329851 = (C329851) continuation;
            int i = c329851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329851.label = i - Integer.MIN_VALUE;
            } else {
                c329851 = new C329851(this, continuation);
            }
        }
        Object obj = c329851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.lock;
            c329851.L$0 = mutex;
            c329851.label = 1;
            if (mutex.lock(null, c329851) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c329851.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
        }
        try {
            if (this.state == null) {
                return Unit.INSTANCE;
            }
            cancelIdleTimer();
            this.idleTimerJob = BuildersKt__Builders_commonKt.launch$default(getParentScope(), null, null, new CachedJobManager4(this, null), 3, null);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelIdleTimer() {
        Job job = this.idleTimerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.idleTimerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CachedJobManager.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/coroutines/job/AbstractCachedJobManager$State;", "C", "", "job", "Lkotlinx/coroutines/Job;", "component", "<init>", "(Lkotlinx/coroutines/Job;Ljava/lang/Object;)V", "getJob", "()Lkotlinx/coroutines/Job;", "getComponent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lkotlinx/coroutines/Job;Ljava/lang/Object;)Lcom/robinhood/coroutines/job/AbstractCachedJobManager$State;", "equals", "", "other", "hashCode", "", "toString", "", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$State, reason: from toString */
    /* loaded from: classes15.dex */
    static final /* data */ class State<C> {
        private final C component;
        private final Job job;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, Job job, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                job = state.job;
            }
            if ((i & 2) != 0) {
                obj = state.component;
            }
            return state.copy(job, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final Job getJob() {
            return this.job;
        }

        public final C component2() {
            return this.component;
        }

        public final State<C> copy(Job job, C component) {
            Intrinsics.checkNotNullParameter(job, "job");
            return new State<>(job, component);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.job, state.job) && Intrinsics.areEqual(this.component, state.component);
        }

        public int hashCode() {
            int iHashCode = this.job.hashCode() * 31;
            C c = this.component;
            return iHashCode + (c == null ? 0 : c.hashCode());
        }

        public String toString() {
            return "State(job=" + this.job + ", component=" + this.component + ")";
        }

        public State(Job job, C c) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.job = job;
            this.component = c;
        }

        public final Job getJob() {
            return this.job;
        }

        public final C getComponent() {
            return this.component;
        }
    }

    /* compiled from: CachedJobManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/coroutines/job/AbstractCachedJobManager$Companion;", "", "<init>", "()V", "DEFAULT_TIMEOUT", "Lkotlin/time/Duration;", "getDEFAULT_TIMEOUT-UwyO8pc", "()J", "J", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.coroutines.job.AbstractCachedJobManager$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDEFAULT_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m22191getDEFAULT_TIMEOUTUwyO8pc() {
            return CachedJobManager2.DEFAULT_TIMEOUT;
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DEFAULT_TIMEOUT = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
    }
}
