package com.salesforce.android.smi.common.internal.util;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.common.internal.util.Throttle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* compiled from: Throttle.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 ,*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0003-.,Bc\b\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\u000f\u001a\u00028\u000027\u0010\u0012\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR<\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0001\u0002/0¨\u00061"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/Throttle;", "T", "R", "", "", "startInterval", "endInterval", "Lkotlin/Function1;", "latestParamProvider", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lcom/salesforce/android/smi/common/api/Result;", "destinationFunction", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "param", "Lkotlin/ParameterName;", "name", "block", "runAsync", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "throttleExecute", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "async", "", "reset", "()V", "Ljava/lang/Long;", "getStartInterval", "()Ljava/lang/Long;", "getEndInterval", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "getDestinationFunction", "()Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/Job;", "throttleJob", "Lkotlinx/coroutines/Job;", "getThrottleJob", "()Lkotlinx/coroutines/Job;", "setThrottleJob", "(Lkotlinx/coroutines/Job;)V", "latestParam", "Ljava/lang/Object;", "Factory", "ThrottleLatest", "ThrottleFirst", "Lcom/salesforce/android/smi/common/internal/util/Throttle$ThrottleFirst;", "Lcom/salesforce/android/smi/common/internal/util/Throttle$ThrottleLatest;", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class Throttle<T, R> {

    /* renamed from: Factory, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function2<T, Continuation<? super Result<? extends R>>, Object> destinationFunction;
    private final Long endInterval;
    private T latestParam;
    private final Function1<T, T> latestParamProvider;
    private final Long startInterval;
    private Job throttleJob;

    /* compiled from: Throttle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.common.internal.util.Throttle", m3645f = "Throttle.kt", m3646l = {65, 66, 67}, m3647m = "throttleExecute")
    /* renamed from: com.salesforce.android.smi.common.internal.util.Throttle$throttleExecute$1 */
    static final class C420681 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ Throttle<T, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420681(Throttle<T, R> throttle, Continuation<? super C420681> continuation) {
            super(continuation);
            this.this$0 = throttle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.throttleExecute(null, this);
        }
    }

    public /* synthetic */ Throttle(Long l, Long l2, Function1 function1, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, function1, function2);
    }

    public Object async(T t, Continuation<? super Result<? extends R>> continuation) {
        return async$suspendImpl(this, t, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Throttle(Long l, Long l2, Function1<? super T, ? extends T> function1, Function2<? super T, ? super Continuation<? super Result<? extends R>>, ? extends Object> function2) {
        this.startInterval = l;
        this.endInterval = l2;
        this.latestParamProvider = function1;
        this.destinationFunction = function2;
    }

    public /* synthetic */ Throttle(Long l, Long l2, Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : function1, function2, null);
    }

    protected final void setThrottleJob(Job job) {
        this.throttleJob = job;
    }

    /* compiled from: Throttle.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "R", "T", "it"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.common.internal.util.Throttle$async$2", m3645f = "Throttle.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.common.internal.util.Throttle$async$2 */
    static final class C420672 extends ContinuationImpl7 implements Function2<T, Continuation<? super Result<? extends R>>, Object> {
        final /* synthetic */ T $param;
        int label;
        final /* synthetic */ Throttle<T, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420672(Throttle<T, R> throttle, T t, Continuation<? super C420672> continuation) {
            super(2, continuation);
            this.this$0 = throttle;
            this.$param = t;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C420672(this.this$0, this.$param, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C420672) obj, (Continuation) obj2);
        }

        public final Object invoke(T t, Continuation<? super Result<? extends R>> continuation) {
            return ((C420672) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Throttle.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.salesforce.android.smi.common.internal.util.Throttle$async$2$1", m3645f = "Throttle.kt", m3646l = {29}, m3647m = "invokeSuspend")
        /* renamed from: com.salesforce.android.smi.common.internal.util.Throttle$async$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends R>>, Object> {
            final /* synthetic */ T $param;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ Throttle<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Throttle<T, R> throttle, T t, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = throttle;
                this.$param = t;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$param, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends R>> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new Throttle2(this.this$0, this.$param, null), 3, null);
                this.this$0.setThrottleJob(deferredAsync$default);
                this.label = 1;
                Object objAwait = deferredAsync$default.await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            }
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$param, null);
            this.label = 1;
            Object objCoroutineScope = CoroutineScope2.coroutineScope(anonymousClass1, this);
            return objCoroutineScope == coroutine_suspended ? coroutine_suspended : objCoroutineScope;
        }
    }

    static /* synthetic */ <T, R> Object async$suspendImpl(Throttle<T, R> throttle, T t, Continuation<? super Result<? extends R>> continuation) {
        return throttle.runAsync(t, new C420672(throttle, t, null), continuation);
    }

    private final Object runAsync(T t, Function2<? super T, ? super Continuation<? super Result<? extends R>>, ? extends Object> function2, Continuation<? super Result<? extends R>> continuation) {
        Function1<T, T> function1 = this.latestParamProvider;
        this.latestParam = function1 != null ? function1.invoke(t) : null;
        Job job = this.throttleJob;
        if (job == null || job.isCompleted()) {
            return function2.invoke(t, continuation);
        }
        return Result.Empty.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[PHI: r9 r10
      0x0083: PHI (r9v5 com.salesforce.android.smi.common.internal.util.Throttle<T, R>) = 
      (r9v2 com.salesforce.android.smi.common.internal.util.Throttle<T, R>)
      (r9v10 com.salesforce.android.smi.common.internal.util.Throttle<T, R>)
     binds: [B:32:0x0080, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r10v11 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:32:0x0080, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object throttleExecute(T t, Continuation<? super Result<? extends R>> continuation) {
        C420681 c420681;
        T t2;
        Throttle<T, R> throttle;
        Throttle<T, R> throttle2;
        T t3;
        if (continuation instanceof C420681) {
            c420681 = (C420681) continuation;
            int i = c420681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420681.label = i - Integer.MIN_VALUE;
            } else {
                c420681 = new C420681(this, continuation);
            }
        }
        Object objInvoke = c420681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (this.startInterval != null) {
                long jLongValue = this.startInterval.longValue();
                c420681.L$0 = this;
                c420681.L$1 = t;
                c420681.label = 1;
                if (DelayKt.delay(jLongValue, c420681) != coroutine_suspended) {
                    throttle2 = this;
                }
                return coroutine_suspended;
            }
            t2 = t;
            throttle = this;
            Function2<T, Continuation<? super Result<? extends R>>, Object> function2 = throttle.destinationFunction;
            t3 = throttle.latestParam;
            if (t3 != null) {
                t2 = t3;
            }
            c420681.L$0 = throttle;
            c420681.L$1 = null;
            c420681.label = 2;
            objInvoke = function2.invoke(t2, c420681);
            if (objInvoke != coroutine_suspended) {
                Result result = (Result) objInvoke;
                if (throttle.endInterval != null) {
                }
                return result;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Result result2 = (Result) c420681.L$0;
                ResultKt.throwOnFailure(objInvoke);
                return result2;
            }
            throttle = (Throttle) c420681.L$0;
            ResultKt.throwOnFailure(objInvoke);
            Result result3 = (Result) objInvoke;
            if (throttle.endInterval != null) {
                long jLongValue2 = throttle.endInterval.longValue();
                c420681.L$0 = result3;
                c420681.label = 3;
                if (DelayKt.delay(jLongValue2, c420681) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return result3;
        }
        t = (T) c420681.L$1;
        throttle2 = (Throttle) c420681.L$0;
        ResultKt.throwOnFailure(objInvoke);
        t2 = t;
        throttle = throttle2;
        Function2<T, Continuation<? super Result<? extends R>>, Object> function22 = throttle.destinationFunction;
        t3 = throttle.latestParam;
        if (t3 != null) {
        }
        c420681.L$0 = throttle;
        c420681.L$1 = null;
        c420681.label = 2;
        objInvoke = function22.invoke(t2, c420681);
        if (objInvoke != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final synchronized void reset() {
        try {
            Job job = this.throttleJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.throttleJob = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* compiled from: Throttle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00030\b2\u0006\u0010\r\u001a\u00028\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00018\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/Throttle$ThrottleLatest;", "T", "R", "Lcom/salesforce/android/smi/common/internal/util/Throttle;", "", "interval", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lcom/salesforce/android/smi/common/api/Result;", "", "destinationFunction", "<init>", "(JLkotlin/jvm/functions/Function2;)V", "param", "async", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latestParam", "Ljava/lang/Object;", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    protected static final class ThrottleLatest<T, R> extends Throttle<T, R> {
        private T latestParam;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$0(Object obj) {
            return obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThrottleLatest(long j, Function2<? super T, ? super Continuation<? super Result<? extends R>>, ? extends Object> destinationFunction) {
            super(Long.valueOf(j), null, new Function1() { // from class: com.salesforce.android.smi.common.internal.util.Throttle$ThrottleLatest$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Throttle.ThrottleLatest._init_$lambda$0(obj);
                }
            }, destinationFunction, 2, null);
            Intrinsics.checkNotNullParameter(destinationFunction, "destinationFunction");
        }

        @Override // com.salesforce.android.smi.common.internal.util.Throttle
        public Object async(T t, Continuation<? super Result<? extends R>> continuation) {
            this.latestParam = t;
            Object objAsync = super.async(t, continuation);
            return objAsync == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAsync : (Result) objAsync;
        }
    }

    /* compiled from: Throttle.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/Throttle$ThrottleFirst;", "T", "R", "Lcom/salesforce/android/smi/common/internal/util/Throttle;", "interval", "", "destinationFunction", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lcom/salesforce/android/smi/common/api/Result;", "", "<init>", "(JLkotlin/jvm/functions/Function2;)V", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    protected static final class ThrottleFirst<T, R> extends Throttle<T, R> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThrottleFirst(long j, Function2<? super T, ? super Continuation<? super Result<? extends R>>, ? extends Object> destinationFunction) {
            super(null, Long.valueOf(j), null, destinationFunction, 5, null);
            Intrinsics.checkNotNullParameter(destinationFunction, "destinationFunction");
        }
    }

    /* compiled from: Throttle.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\r\u0010\u000eJY\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/Throttle$Factory;", "", "<init>", "()V", "T", "R", "", "interval", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lcom/salesforce/android/smi/common/api/Result;", "destinationFunction", "Lcom/salesforce/android/smi/common/internal/util/Throttle;", "latest", "(JLkotlin/jvm/functions/Function2;)Lcom/salesforce/android/smi/common/internal/util/Throttle;", "first", "DEFAULT_INTERVAL", "J", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.salesforce.android.smi.common.internal.util.Throttle$Factory, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Throttle latest$default(Companion companion, long j, Function2 function2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 1000;
            }
            return companion.latest(j, function2);
        }

        public final <T, R> Throttle<T, R> latest(long interval, Function2<? super T, ? super Continuation<? super Result<? extends R>>, ? extends Object> destinationFunction) {
            Intrinsics.checkNotNullParameter(destinationFunction, "destinationFunction");
            return new ThrottleLatest(interval, destinationFunction);
        }

        public final <T, R> Throttle<T, R> first(long interval, Function2<? super T, ? super Continuation<? super Result<? extends R>>, ? extends Object> destinationFunction) {
            Intrinsics.checkNotNullParameter(destinationFunction, "destinationFunction");
            return new ThrottleFirst(interval, destinationFunction);
        }
    }
}
