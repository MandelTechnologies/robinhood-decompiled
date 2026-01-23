package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesLadderScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesLadderScreenKt$LadderScaffold$8$2$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesLadderScreenKt$LadderScaffold$8$2$1$1(Object obj) {
        super(0, obj, LadderCallbacks.class, "onQuantitySelectorClicked", "onQuantitySelectorClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LadderCallbacks) this.receiver).onQuantitySelectorClicked();
    }
}
