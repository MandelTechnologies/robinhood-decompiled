package com.robinhood.android.equitytradeladder;

import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$19$1 extends FunctionReferenceImpl implements Function1<TradeQuantity, Unit> {
    EquityTradeLadderComposableKt$EquityTradeLadderScreenStates$19$1(Object obj) {
        super(1, obj, EquityTradeLadderDuxo.class, "onQuantityInputModeChanged", "onQuantityInputModeChanged(Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TradeQuantity tradeQuantity) {
        invoke2(tradeQuantity);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TradeQuantity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EquityTradeLadderDuxo) this.receiver).onQuantityInputModeChanged(p0);
    }
}
