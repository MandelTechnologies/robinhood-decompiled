package kotlinx.coroutines.flow.internal;

import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContext;

/* compiled from: Combine.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m3645f = "Combine.kt", m3646l = {123}, m3647m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1, reason: use source file name */
/* loaded from: classes14.dex */
final class Combine3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T1> $flow;
    final /* synthetic */ Flow<T2> $flow2;
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Combine3(Flow<? extends T2> flow, Flow<? extends T1> flow2, FlowCollector<? super R> flowCollector, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super Combine3> continuation) {
        super(2, continuation);
        this.$flow2 = flow;
        this.$flow = flow2;
        this.$this_unsafeFlow = flowCollector;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Combine3 combine3 = new Combine3(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, continuation);
        combine3.L$0 = obj;
        return combine3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Combine3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Channel8 channel8;
        CompletableJob completableJob;
        Channel8 channel82;
        CompletableJob completableJob2;
        Unit unit;
        C461312 c461312;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Channel8 channel8Produce$default = Produce.produce$default(coroutineScope, null, 0, new Combine5(this.$flow2, null), 3, null);
            final CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
            Intrinsics.checkNotNull(channel8Produce$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
            ((Channel9) channel8Produce$default).mo28845invokeOnClose(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    if (completableJobJob$default.isActive()) {
                        completableJobJob$default.cancel((CancellationException) new FlowExceptions(completableJobJob$default));
                    }
                }
            });
            try {
                CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                Object objThreadContextElements = ThreadContext.threadContextElements(coroutineContext);
                CoroutineContext coroutineContextPlus = coroutineScope.getCoroutineContext().plus(completableJobJob$default);
                try {
                    try {
                        unit = Unit.INSTANCE;
                        try {
                            c461312 = new C461312(this.$flow, coroutineContext, objThreadContextElements, channel8Produce$default, this.$this_unsafeFlow, this.$transform, completableJobJob$default, null);
                            channel8 = channel8Produce$default;
                            completableJob = completableJobJob$default;
                        } catch (FlowExceptions e) {
                            e = e;
                            channel8 = channel8Produce$default;
                            completableJob = completableJobJob$default;
                        }
                    } catch (Throwable th) {
                        th = th;
                        channel8 = channel8Produce$default;
                    }
                } catch (FlowExceptions e2) {
                    e = e2;
                    completableJob = completableJobJob$default;
                    channel8 = channel8Produce$default;
                }
                try {
                    this.L$0 = channel8;
                    this.L$1 = completableJob;
                    this.label = 1;
                    if (ChannelFlow3.withContextUndispatched$default(coroutineContextPlus, unit, null, c461312, this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel82 = channel8;
                } catch (FlowExceptions e3) {
                    e = e3;
                    completableJob2 = completableJob;
                    channel82 = channel8;
                    FlowExceptions_commonKt.checkOwnership(e, completableJob2);
                    Channel8.DefaultImpls.cancel$default(channel82, null, 1, null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    channel82 = channel8;
                    Channel8.DefaultImpls.cancel$default(channel82, null, 1, null);
                    throw th;
                }
            } catch (FlowExceptions e4) {
                e = e4;
                channel8 = channel8Produce$default;
                completableJob = completableJobJob$default;
            } catch (Throwable th3) {
                th = th3;
                channel8 = channel8Produce$default;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob2 = (CompletableJob) this.L$1;
            channel82 = (Channel8) this.L$0;
            try {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (FlowExceptions e5) {
                    e = e5;
                    FlowExceptions_commonKt.checkOwnership(e, completableJob2);
                    Channel8.DefaultImpls.cancel$default(channel82, null, 1, null);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                th = th4;
                Channel8.DefaultImpls.cancel$default(channel82, null, 1, null);
                throw th;
            }
        }
        Channel8.DefaultImpls.cancel$default(channel82, null, 1, null);
        return Unit.INSTANCE;
    }

    /* compiled from: Combine.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m3645f = "Combine.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    static final class C461312 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ CompletableJob $collectJob;
        final /* synthetic */ Flow<T1> $flow;
        final /* synthetic */ CoroutineContext $scopeContext;
        final /* synthetic */ Channel8<Object> $second;
        final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C461312(Flow<? extends T1> flow, CoroutineContext coroutineContext, Object obj, Channel8<? extends Object> channel8, FlowCollector<? super R> flowCollector, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, CompletableJob completableJob, Continuation<? super C461312> continuation) {
            super(2, continuation);
            this.$flow = flow;
            this.$scopeContext = coroutineContext;
            this.$cnt = obj;
            this.$second = channel8;
            this.$this_unsafeFlow = flowCollector;
            this.$transform = function3;
            this.$collectJob = completableJob;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C461312(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C461312) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Combine.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ CompletableJob $collectJob;
            final /* synthetic */ CoroutineContext $scopeContext;
            final /* synthetic */ Channel8<Object> $second;
            final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineContext coroutineContext, Object obj, Channel8<? extends Object> channel8, FlowCollector<? super R> flowCollector, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, CompletableJob completableJob) {
                this.$scopeContext = coroutineContext;
                this.$cnt = obj;
                this.$second = channel8;
                this.$this_unsafeFlow = flowCollector;
                this.$transform = function3;
                this.$collectJob = completableJob;
            }

            /* compiled from: Combine.kt */
            @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m3645f = "Combine.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508321 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
                final /* synthetic */ CompletableJob $collectJob;
                final /* synthetic */ Channel8<Object> $second;
                final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> $transform;
                final /* synthetic */ T1 $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C508321(Channel8<? extends Object> channel8, FlowCollector<? super R> flowCollector, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, T1 t1, CompletableJob completableJob, Continuation<? super C508321> continuation) {
                    super(2, continuation);
                    this.$second = channel8;
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform = function3;
                    this.$value = t1;
                    this.$collectJob = completableJob;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C508321(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return ((C508321) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
                
                    if (r1.emit(r9, r8) != r0) goto L30;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.FlowCollector] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objMo28798receiveCatchingJP2dKIU;
                    ?? r1;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel8<Object> channel8 = this.$second;
                        this.label = 1;
                        objMo28798receiveCatchingJP2dKIU = channel8.mo28798receiveCatchingJP2dKIU(this);
                        if (objMo28798receiveCatchingJP2dKIU != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        objMo28798receiveCatchingJP2dKIU = ((Channel5) obj).getHolder();
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r1 = flowCollector;
                        this.L$0 = null;
                        this.label = 3;
                    }
                    CompletableJob completableJob = this.$collectJob;
                    if (objMo28798receiveCatchingJP2dKIU instanceof Channel5.Failed) {
                        Throwable thM28805exceptionOrNullimpl = Channel5.m28805exceptionOrNullimpl(objMo28798receiveCatchingJP2dKIU);
                        if (thM28805exceptionOrNullimpl == null) {
                            throw new FlowExceptions(completableJob);
                        }
                        throw thM28805exceptionOrNullimpl;
                    }
                    Object obj2 = this.$this_unsafeFlow;
                    Function3 function3 = this.$transform;
                    Object obj3 = this.$value;
                    if (objMo28798receiveCatchingJP2dKIU == NullSurrogate.NULL) {
                        objMo28798receiveCatchingJP2dKIU = null;
                    }
                    this.L$0 = obj2;
                    this.label = 2;
                    obj = function3.invoke(obj3, objMo28798receiveCatchingJP2dKIU, this);
                    r1 = obj2;
                    if (obj != coroutine_suspended) {
                        this.L$0 = null;
                        this.label = 3;
                    }
                    return coroutine_suspended;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T1 t1, Continuation<? super Unit> continuation) {
                Combine4 combine4;
                if (continuation instanceof Combine4) {
                    combine4 = (Combine4) continuation;
                    int i = combine4.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        combine4.label = i - Integer.MIN_VALUE;
                    } else {
                        combine4 = new Combine4(this, continuation);
                    }
                }
                Object obj = combine4.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = combine4.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext coroutineContext = this.$scopeContext;
                    Unit unit = Unit.INSTANCE;
                    Object obj2 = this.$cnt;
                    C508321 c508321 = new C508321(this.$second, this.$this_unsafeFlow, this.$transform, t1, this.$collectJob, null);
                    combine4.label = 1;
                    if (ChannelFlow3.withContextUndispatched(coroutineContext, unit, obj2, c508321, combine4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<T1> flow = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
                this.label = 1;
                if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
