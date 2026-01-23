package com.robinhood.android.equitytradeladder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$13$1 extends FunctionReferenceImpl implements Function2<LadderScreenState, Boolean, Unit> {
    EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$13$1(Object obj) {
        super(2, obj, EquityTradeLadderDuxo.class, "setScreenState", "setScreenState(Lcom/robinhood/android/equitytradeladder/LadderScreenState;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LadderScreenState ladderScreenState, Boolean bool) {
        invoke(ladderScreenState, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LadderScreenState p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EquityTradeLadderDuxo) this.receiver).setScreenState(p0, z);
    }
}
