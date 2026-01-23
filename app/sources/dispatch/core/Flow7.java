package dispatch.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Flow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\u001a%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "flowOnDefault", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flowOnIO", "flowOnMain", "flowOnMainImmediate", "dispatch-core"}, m3637k = 2, m3638mv = {1, 5, 1}, m3640xi = 48)
/* renamed from: dispatch.core.FlowKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Flow7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Flow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "dispatch.core.FlowKt$flowOnDefault$1", m3645f = "Flow.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: dispatch.core.FlowKt$flowOnDefault$1 */
    /* loaded from: classes18.dex */
    static final class C446491<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_flowOnDefault;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C446491(Flow<? extends T> flow, Continuation<? super C446491> continuation) {
            super(2, continuation);
            this.$this_flowOnDefault = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C446491 c446491 = new C446491(this.$this_flowOnDefault, continuation);
            c446491.L$0 = obj;
            return c446491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C446491) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow flowFlowOn = kotlinx.coroutines.flow.FlowKt.flowOn(this.$this_flowOnDefault, CoroutineScopeExt.getDispatcherProvider(getContext()).getDefault());
                FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: dispatch.core.FlowKt$flowOnDefault$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public Object emit(T t, Continuation<? super Unit> continuation) {
                        Object objEmit = flowCollector.emit(t, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowOn.collect(flowCollector2, this) == coroutine_suspended) {
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

    public static final <T> Flow<T> flowOnDefault(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return kotlinx.coroutines.flow.FlowKt.flow(new C446491(flow, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Flow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "dispatch.core.FlowKt$flowOnIO$1", m3645f = "Flow.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: dispatch.core.FlowKt$flowOnIO$1 */
    /* loaded from: classes18.dex */
    static final class C446501<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_flowOnIO;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C446501(Flow<? extends T> flow, Continuation<? super C446501> continuation) {
            super(2, continuation);
            this.$this_flowOnIO = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C446501 c446501 = new C446501(this.$this_flowOnIO, continuation);
            c446501.L$0 = obj;
            return c446501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C446501) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow flowFlowOn = kotlinx.coroutines.flow.FlowKt.flowOn(this.$this_flowOnIO, CoroutineScopeExt.getDispatcherProvider(getContext()).getIo());
                FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: dispatch.core.FlowKt$flowOnIO$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public Object emit(T t, Continuation<? super Unit> continuation) {
                        Object objEmit = flowCollector.emit(t, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowOn.collect(flowCollector2, this) == coroutine_suspended) {
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

    public static final <T> Flow<T> flowOnIO(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return kotlinx.coroutines.flow.FlowKt.flow(new C446501(flow, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Flow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "dispatch.core.FlowKt$flowOnMain$1", m3645f = "Flow.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: dispatch.core.FlowKt$flowOnMain$1 */
    /* loaded from: classes18.dex */
    static final class C446511<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_flowOnMain;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C446511(Flow<? extends T> flow, Continuation<? super C446511> continuation) {
            super(2, continuation);
            this.$this_flowOnMain = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C446511 c446511 = new C446511(this.$this_flowOnMain, continuation);
            c446511.L$0 = obj;
            return c446511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C446511) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow flowFlowOn = kotlinx.coroutines.flow.FlowKt.flowOn(this.$this_flowOnMain, CoroutineScopeExt.getDispatcherProvider(getContext()).getMain());
                FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: dispatch.core.FlowKt$flowOnMain$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public Object emit(T t, Continuation<? super Unit> continuation) {
                        Object objEmit = flowCollector.emit(t, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowOn.collect(flowCollector2, this) == coroutine_suspended) {
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

    public static final <T> Flow<T> flowOnMain(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return kotlinx.coroutines.flow.FlowKt.flow(new C446511(flow, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Flow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "dispatch.core.FlowKt$flowOnMainImmediate$1", m3645f = "Flow.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: dispatch.core.FlowKt$flowOnMainImmediate$1 */
    static final class C446521<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_flowOnMainImmediate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C446521(Flow<? extends T> flow, Continuation<? super C446521> continuation) {
            super(2, continuation);
            this.$this_flowOnMainImmediate = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C446521 c446521 = new C446521(this.$this_flowOnMainImmediate, continuation);
            c446521.L$0 = obj;
            return c446521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C446521) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow flowFlowOn = kotlinx.coroutines.flow.FlowKt.flowOn(this.$this_flowOnMainImmediate, CoroutineScopeExt.getDispatcherProvider(getContext()).getMainImmediate());
                FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: dispatch.core.FlowKt$flowOnMainImmediate$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public Object emit(T t, Continuation<? super Unit> continuation) {
                        Object objEmit = flowCollector.emit(t, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowOn.collect(flowCollector2, this) == coroutine_suspended) {
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

    public static final <T> Flow<T> flowOnMainImmediate(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return kotlinx.coroutines.flow.FlowKt.flow(new C446521(flow, null));
    }
}
