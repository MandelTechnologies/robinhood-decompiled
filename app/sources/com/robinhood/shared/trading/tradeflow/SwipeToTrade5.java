package com.robinhood.shared.trading.tradeflow;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SwipeToTrade.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1", m3645f = "SwipeToTrade.kt", m3646l = {111}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class SwipeToTrade5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnchoredDraggableState<SwipeToTrade3> $anchoredDraggableState;
    final /* synthetic */ SnapshotState<Boolean> $isOnSwipedCalled$delegate;
    final /* synthetic */ SnapshotState4<OrderData> $savedOrderData$delegate;
    final /* synthetic */ SnapshotState4<Function1<OrderData, Unit>> $updatedOnSwiped$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeToTrade5(AnchoredDraggableState<SwipeToTrade3> anchoredDraggableState, SnapshotState<Boolean> snapshotState, SnapshotState4<? extends OrderData> snapshotState4, SnapshotState4<? extends Function1<? super OrderData, Unit>> snapshotState42, Continuation<? super SwipeToTrade5> continuation) {
        super(2, continuation);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$isOnSwipedCalled$delegate = snapshotState;
        this.$savedOrderData$delegate = snapshotState4;
        this.$updatedOnSwiped$delegate = snapshotState42;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeToTrade5(this.$anchoredDraggableState, this.$isOnSwipedCalled$delegate, this.$savedOrderData$delegate, this.$updatedOnSwiped$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeToTrade5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final AnchoredDraggableState<SwipeToTrade3> anchoredDraggableState = this.$anchoredDraggableState;
            final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SwipeToTrade5.invokeSuspend$lambda$0(anchoredDraggableState);
                }
            });
            final SnapshotState<Boolean> snapshotState = this.$isOnSwipedCalled$delegate;
            Flow<SwipeToTrade3> flow = new Flow<SwipeToTrade3>() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1$invokeSuspend$$inlined$filter$1$2 */
                public static final class C410922<T> implements FlowCollector {
                    final /* synthetic */ SnapshotState $isOnSwipedCalled$delegate$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1$invokeSuspend$$inlined$filter$1$2", m3645f = "SwipeToTrade.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C410922.this.emit(null, this);
                        }
                    }

                    public C410922(FlowCollector flowCollector, SnapshotState snapshotState) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$isOnSwipedCalled$delegate$inlined = snapshotState;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (((SwipeToTrade3) obj) == SwipeToTrade3.END && !SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$3(this.$isOnSwipedCalled$delegate$inlined)) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super SwipeToTrade3> flowCollector, Continuation continuation) {
                    Object objCollect = flowSnapshotFlow.collect(new C410922(flowCollector, snapshotState), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            final SnapshotState4<OrderData> snapshotState4 = this.$savedOrderData$delegate;
            final SnapshotState<Boolean> snapshotState2 = this.$isOnSwipedCalled$delegate;
            final SnapshotState4<Function1<OrderData, Unit>> snapshotState42 = this.$updatedOnSwiped$delegate;
            FlowCollector<? super SwipeToTrade3> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeToTrade$1$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((SwipeToTrade3) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(SwipeToTrade3 swipeToTrade3, Continuation<? super Unit> continuation) {
                    Object value = snapshotState4.getValue();
                    if (value != null) {
                        SnapshotState<Boolean> snapshotState3 = snapshotState2;
                        SnapshotState4<Function1<OrderData, Unit>> snapshotState43 = snapshotState42;
                        SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$4(snapshotState3, true);
                        SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$5(snapshotState43).invoke(value);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeToTrade3 invokeSuspend$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        return (SwipeToTrade3) anchoredDraggableState.getSettledValue();
    }
}
