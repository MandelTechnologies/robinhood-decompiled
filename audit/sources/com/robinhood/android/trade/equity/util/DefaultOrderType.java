package com.robinhood.android.trade.equity.util;

import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder4;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
import com.robinhood.android.trading.contracts.configuration.DollarBased3;
import com.robinhood.android.trading.contracts.configuration.DollarBased5;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.android.trading.contracts.configuration.ShareSimpleLimit;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.TradingSession;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultOrderType.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007¨\u0006\u0012"}, m3636d2 = {"determineDefaultOrderType", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "tradingSession", "Lcom/robinhood/models/db/TradingSession;", "instrument", "Lcom/robinhood/models/db/Instrument;", "isShareBased", "", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "initialShareQuantity", "Ljava/math/BigDecimal;", "isOtc", "isMarketBuysEnabled", "isBuyToClose", "isSubOneShareShortPosition", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.DefaultOrderTypeKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DefaultOrderType {
    public static final EquityOrderConfiguration.Resolved determineDefaultOrderType(TradingSession tradingSession, Instrument instrument, boolean z, EquityOrderSide side, String accountNumber, BigDecimal bigDecimal, boolean z2, boolean z3, boolean z4, boolean z5) {
        EquityOrderSide equityOrderSide;
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        boolean z6 = tradingSession instanceof TradingSession.Regular;
        if (side == EquityOrderSide.SELL_SHORT || (side == (equityOrderSide = EquityOrderSide.BUY) && z4)) {
            if (z6 || (z5 && z4)) {
                return new AdvancedOrder.MarketNew(accountNumber, bigDecimal, false);
            }
            return new AdvancedOrder.LimitNew(accountNumber, bigDecimal, null, null, null, false, 28, null);
        }
        if (z) {
            tuples2M3642to = Tuples4.m3642to(new ShareMarket.New(accountNumber, bigDecimal), new ShareSimpleLimit.New(accountNumber, bigDecimal, instrument.getDefaultPresetPercentLimit()));
        } else {
            tuples2M3642to = Tuples4.m3642to(new DollarBased3.New(accountNumber, null, 2, null), new DollarBased5.New(accountNumber, null, instrument.getDefaultPresetPercentLimit(), 2, null));
        }
        DirectOrder4 directOrder4 = (DirectOrder4) tuples2M3642to.component1();
        DirectOrder5 directOrder5 = (DirectOrder5) tuples2M3642to.component2();
        return (z && side == equityOrderSide && (z2 || !z3)) ? directOrder5 : (!z6 && (tradingSession instanceof TradingSession.Extended)) ? directOrder5 : directOrder4;
    }
}
