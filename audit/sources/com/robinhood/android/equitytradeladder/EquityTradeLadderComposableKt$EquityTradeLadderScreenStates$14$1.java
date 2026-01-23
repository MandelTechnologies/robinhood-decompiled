package com.robinhood.android.equitytradeladder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$14$1 extends FunctionReferenceImpl implements Function1<LadderScreenState, Unit> {
    EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$14$1(Object obj) {
        super(1, obj, EquityTradeLadderDuxo.class, "advanceScreenState", "advanceScreenState(Lcom/robinhood/android/equitytradeladder/LadderScreenState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LadderScreenState ladderScreenState) {
        invoke2(ladderScreenState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LadderScreenState ladderScreenState) {
        ((EquityTradeLadderDuxo) this.receiver).advanceScreenState(ladderScreenState);
    }
}
