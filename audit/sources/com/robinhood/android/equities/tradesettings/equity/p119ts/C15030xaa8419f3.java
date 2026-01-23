package com.robinhood.android.equities.tradesettings.equity.p119ts;

import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.models.p320db.OrderMarketHours;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradingSessionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionBottomSheetKt$EquityTradingSessionBottomSheet$1$1 */
/* loaded from: classes3.dex */
/* synthetic */ class C15030xaa8419f3 extends FunctionReferenceImpl implements Function3<TradeSettingsStore4, TradeSettingsStore3, OrderMarketHours, Unit> {
    C15030xaa8419f3(Object obj) {
        super(3, obj, EquityTradingSessionDuxo.class, "onTradingSessionChanged", "onTradingSessionChanged(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderMarketHours;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderMarketHours orderMarketHours) {
        invoke2(tradeSettingsStore4, tradeSettingsStore3, orderMarketHours);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TradeSettingsStore4 p0, TradeSettingsStore3 p1, OrderMarketHours p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((EquityTradingSessionDuxo) this.receiver).onTradingSessionChanged(p0, p1, p2);
    }
}
