package com.robinhood.android.equities.tradesettings.p120ui;

import com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingSessionAndTimeInForceBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.ui.TradingSessionAndTimeInForceBottomSheetKt$TradingSessionAndTimeInForceBottomSheet$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class TradingSessionAndTimeInForceBottomSheet7 extends FunctionReferenceImpl implements Function3<TradeSettingsStore4, TradeSettingsStore3, OrderTimeInForce, Unit> {
    TradingSessionAndTimeInForceBottomSheet7(Object obj) {
        super(3, obj, TradingSessionAndTimeInForceDuxo.class, "onTimeInForceChanged", "onTimeInForceChanged(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderTimeInForce;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderTimeInForce orderTimeInForce) {
        invoke2(tradeSettingsStore4, tradeSettingsStore3, orderTimeInForce);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TradeSettingsStore4 p0, TradeSettingsStore3 p1, OrderTimeInForce p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((TradingSessionAndTimeInForceDuxo) this.receiver).onTimeInForceChanged(p0, p1, p2);
    }
}
