package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector2;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: LadderRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class LadderRowKt$PendingOrderRow$2$1 implements PointerInputEventHandler {
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ Function1<FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> $onPendingOrderDownInitiated;
    final /* synthetic */ FuturesLadderViewState.LadderData.PendingOrderRow.Group $orderGroup;
    final /* synthetic */ Integer $selectedPendingOrdersIndex;

    /* JADX WARN: Multi-variable type inference failed */
    LadderRowKt$PendingOrderRow$2$1(FuturesLadderViewState.LadderData.PendingOrderRow.Group group, boolean z, Integer num, Function1<? super FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> function1) {
        this.$orderGroup = group;
        this.$isSelected = z;
        this.$selectedPendingOrdersIndex = num;
        this.$onPendingOrderDownInitiated = function1;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final FuturesLadderViewState.LadderData.SelectedPendingOrders group;
        Integer num;
        ImmutableList<FuturesLadderViewState.LadderData.UiPendingOrder> orders = this.$orderGroup.getOrders();
        if (this.$isSelected && (num = this.$selectedPendingOrdersIndex) != null) {
            FuturesLadderViewState.LadderData.UiPendingOrder uiPendingOrder = orders.get(num.intValue());
            if (uiPendingOrder.isPlaceholder()) {
                return Unit.INSTANCE;
            }
            group = new FuturesLadderViewState.LadderData.SelectedPendingOrders.Single(uiPendingOrder);
        } else {
            if (orders == null || !orders.isEmpty()) {
                Iterator<FuturesLadderViewState.LadderData.UiPendingOrder> it = orders.iterator();
                while (it.hasNext()) {
                    if (it.next().isPlaceholder()) {
                        return Unit.INSTANCE;
                    }
                }
            }
            group = new FuturesLadderViewState.LadderData.SelectedPendingOrders.Group(this.$orderGroup.getGroupLabel(), orders);
        }
        final Function1<FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> function1 = this.$onPendingOrderDownInitiated;
        Object objDetectTouchDownWithoutConsumingEvent = LadderCustomGestureDetector2.detectTouchDownWithoutConsumingEvent(pointerInputScope, new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$PendingOrderRow$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LadderRowKt$PendingOrderRow$2$1.invoke$lambda$1(function1, group);
            }
        }, continuation);
        return objDetectTouchDownWithoutConsumingEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTouchDownWithoutConsumingEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function1 function1, FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders) {
        function1.invoke(selectedPendingOrders);
        return Unit.INSTANCE;
    }
}
