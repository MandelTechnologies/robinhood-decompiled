package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Ladder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class LadderKt$LadderUi$4$4$1 extends FunctionReferenceImpl implements Function2<Boolean, Boolean, Unit> {
    LadderKt$LadderUi$4$4$1(Object obj) {
        super(2, obj, LadderCallbacks.class, "onPendingOrderDragEnded", "onPendingOrderDragEnded(ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        invoke(bool.booleanValue(), bool2.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, boolean z2) {
        ((LadderCallbacks) this.receiver).onPendingOrderDragEnded(z, z2);
    }
}
