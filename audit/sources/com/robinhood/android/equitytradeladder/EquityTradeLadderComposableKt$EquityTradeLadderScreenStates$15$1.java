package com.robinhood.android.equitytradeladder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$15$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$15$1(Object obj) {
        super(1, obj, EquityTradeLadderDuxo.class, "onAutoSendToggled", "onAutoSendToggled(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((EquityTradeLadderDuxo) this.receiver).onAutoSendToggled(z);
    }
}
