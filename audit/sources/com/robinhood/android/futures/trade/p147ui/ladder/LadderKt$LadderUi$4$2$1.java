package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Ladder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class LadderKt$LadderUi$4$2$1 extends FunctionReferenceImpl implements Function1<LadderCustomGestureDetector, Unit> {
    LadderKt$LadderUi$4$2$1(Object obj) {
        super(1, obj, LadderCallbacks.class, "onPendingOrderDragDirectionChanged", "onPendingOrderDragDirectionChanged(Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LadderCustomGestureDetector ladderCustomGestureDetector) {
        invoke2(ladderCustomGestureDetector);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LadderCustomGestureDetector ladderCustomGestureDetector) {
        ((LadderCallbacks) this.receiver).onPendingOrderDragDirectionChanged(ladderCustomGestureDetector);
    }
}
