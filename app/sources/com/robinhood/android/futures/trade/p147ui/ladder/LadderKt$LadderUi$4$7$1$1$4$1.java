package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Ladder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class LadderKt$LadderUi$4$7$1$1$4$1 extends FunctionReferenceImpl implements Function1<FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> {
    LadderKt$LadderUi$4$7$1$1$4$1(Object obj) {
        super(1, obj, LadderCallbacks.class, "onPendingOrderSelected", "onPendingOrderSelected(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders) {
        invoke2(selectedPendingOrders);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FuturesLadderViewState.LadderData.SelectedPendingOrders p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((LadderCallbacks) this.receiver).onPendingOrderSelected(p0);
    }
}
