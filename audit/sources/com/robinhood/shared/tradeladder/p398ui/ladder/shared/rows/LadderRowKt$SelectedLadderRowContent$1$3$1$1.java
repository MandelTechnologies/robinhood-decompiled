package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector4;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: LadderRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final class LadderRowKt$SelectedLadderRowContent$1$3$1$1 implements PointerInputEventHandler {
    final /* synthetic */ LadderState.LadderData.SelectedRow.OrderConfig $endConfig;
    final /* synthetic */ Function0<Unit> $onEndOrderClicked;

    LadderRowKt$SelectedLadderRowContent$1$3$1$1(LadderState.LadderData.SelectedRow.OrderConfig orderConfig, Function0<Unit> function0) {
        this.$endConfig = orderConfig;
        this.$onEndOrderClicked = function0;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final LadderState.LadderData.SelectedRow.OrderConfig orderConfig = this.$endConfig;
        final Function0<Unit> function0 = this.$onEndOrderClicked;
        Object objDetectTouchDownWithoutConsumingEvent = LadderCustomGestureDetector4.detectTouchDownWithoutConsumingEvent(pointerInputScope, new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$SelectedLadderRowContent$1$3$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LadderRowKt$SelectedLadderRowContent$1$3$1$1.invoke$lambda$0(orderConfig, function0);
            }
        }, continuation);
        return objDetectTouchDownWithoutConsumingEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTouchDownWithoutConsumingEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(LadderState.LadderData.SelectedRow.OrderConfig orderConfig, Function0 function0) {
        if (orderConfig.getOnClickPassthrough()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
