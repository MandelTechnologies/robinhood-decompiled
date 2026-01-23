package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Ladder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class LadderKt$LadderUi$4$3$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    LadderKt$LadderUi$4$3$1(Object obj) {
        super(1, obj, LadderCallbacks.class, "onPendingOrderDraggedOverRowChanged", "onPendingOrderDraggedOverRowChanged(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((LadderCallbacks) this.receiver).onPendingOrderDraggedOverRowChanged(i);
    }
}
