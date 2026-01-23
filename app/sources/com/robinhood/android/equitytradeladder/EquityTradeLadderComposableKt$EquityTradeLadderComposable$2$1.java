package com.robinhood.android.equitytradeladder;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderPillData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1", m3645f = "EquityTradeLadderComposable.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LadderState.LadderData $ladderData;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ SnapshotState<ImmutableList<OrderPillData>> $offscreenOrders$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1(LadderState.LadderData ladderData, SnapshotState<ImmutableList<OrderPillData>> snapshotState, LazyListState lazyListState, Continuation<? super EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1> continuation) {
        super(2, continuation);
        this.$ladderData = ladderData;
        this.$offscreenOrders$delegate = snapshotState;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1(this.$ladderData, this.$offscreenOrders$delegate, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$ladderData.getPendingOrders().isEmpty()) {
                final LazyListState lazyListState = this.$listState;
                final LadderState.LadderData ladderData = this.$ladderData;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1.invokeSuspend$lambda$0(lazyListState, ladderData);
                    }
                }));
                final SnapshotState<ImmutableList<OrderPillData>> snapshotState = this.$offscreenOrders$delegate;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderComposableKt$EquityTradeLadderComposable$2$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ImmutableList<OrderPillData>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ImmutableList<OrderPillData> immutableList, Continuation<? super Unit> continuation) {
                        snapshotState.setValue(immutableList);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.$offscreenOrders$delegate.setValue(null);
                return Unit.INSTANCE;
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
    public static final ImmutableList invokeSuspend$lambda$0(LazyListState lazyListState, LadderState.LadderData ladderData) {
        OrderPillData.Companion companion = OrderPillData.INSTANCE;
        Map<Integer, LadderState.LadderData.PendingOrderRow> pendingOrders = ladderData.getPendingOrders();
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = ladderData.getSelectedPendingOrders();
        return companion.create(lazyListState, pendingOrders, selectedPendingOrders != null ? selectedPendingOrders.getOrders() : null);
    }
}
