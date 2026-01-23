package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector4;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
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
/* loaded from: classes12.dex */
final class LadderRowKt$PendingOrderRow$2$1 implements PointerInputEventHandler {
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ Function1<LadderState.LadderData.SelectedPendingOrders, Unit> $onPendingOrderDownInitiated;
    final /* synthetic */ LadderState.LadderData.PendingOrderRow.Group $orderGroup;
    final /* synthetic */ Integer $selectedPendingOrdersIndex;

    /* JADX WARN: Multi-variable type inference failed */
    LadderRowKt$PendingOrderRow$2$1(LadderState.LadderData.PendingOrderRow.Group group, boolean z, Integer num, Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function1) {
        this.$orderGroup = group;
        this.$isSelected = z;
        this.$selectedPendingOrdersIndex = num;
        this.$onPendingOrderDownInitiated = function1;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final LadderState.LadderData.SelectedPendingOrders group;
        Integer num;
        ImmutableList<LadderState.LadderData.UiPendingOrder> orders = this.$orderGroup.getOrders();
        if (this.$isSelected && (num = this.$selectedPendingOrdersIndex) != null) {
            LadderState.LadderData.UiPendingOrder uiPendingOrder = orders.get(num.intValue());
            if (uiPendingOrder.isPlaceholder()) {
                return Unit.INSTANCE;
            }
            group = new LadderState.LadderData.SelectedPendingOrders.Single(uiPendingOrder);
        } else {
            if (orders == null || !orders.isEmpty()) {
                Iterator<LadderState.LadderData.UiPendingOrder> it = orders.iterator();
                while (it.hasNext()) {
                    if (it.next().isPlaceholder()) {
                        return Unit.INSTANCE;
                    }
                }
            }
            group = new LadderState.LadderData.SelectedPendingOrders.Group(this.$orderGroup.getGroupLabel(), orders);
        }
        final Function1<LadderState.LadderData.SelectedPendingOrders, Unit> function1 = this.$onPendingOrderDownInitiated;
        Object objDetectTouchDownWithoutConsumingEvent = LadderCustomGestureDetector4.detectTouchDownWithoutConsumingEvent(pointerInputScope, new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$PendingOrderRow$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LadderRowKt$PendingOrderRow$2$1.invoke$lambda$1(function1, group);
            }
        }, continuation);
        return objDetectTouchDownWithoutConsumingEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTouchDownWithoutConsumingEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function1 function1, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders) {
        function1.invoke(selectedPendingOrders);
        return Unit.INSTANCE;
    }
}
