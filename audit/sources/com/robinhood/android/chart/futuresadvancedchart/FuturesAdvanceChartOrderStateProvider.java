package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesAdvanceChartOrderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016JP\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderDataState;", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderViewState;", "<init>", "()V", "reduce", "dataState", "buildFuturesOrderState", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesOrderState;", "activeInstrumentId", "Ljava/util/UUID;", "activeAccount", "Lcom/robinhood/models/db/Account;", "activeRhdAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "instrumentBuyingPower", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrumentBuyingPower;", "orderInstrument", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesInstrument;", "instrumentPosition", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesChartPosition;", "instrumentTradeAmount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "buildFuturesTradeRowState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "orderState", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FuturesAdvanceChartOrderStateProvider implements StateProvider<FuturesAdvanceChartOrderDataState, FuturesAdvanceChartOrderViewState> {
    @Override // com.robinhood.android.udf.StateProvider
    public FuturesAdvanceChartOrderViewState reduce(FuturesAdvanceChartOrderDataState dataState) {
        FuturesContract contract;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        FuturesOrderState futuresOrderStateBuildFuturesOrderState = buildFuturesOrderState(dataState.getActiveInstrumentId(), dataState.getActiveRhsAccount(), dataState.getActiveFuturesAccount(), dataState.getBuyingPower(), dataState.getOrderInstrument(), dataState.getInstrumentPosition(), dataState.getInstrumentTradeAmount());
        FuturesInstrument orderInstrument = dataState.getOrderInstrument();
        return new FuturesAdvanceChartOrderViewState(false, (orderInstrument == null || (contract = orderInstrument.getContract()) == null) ? null : contract.getDisplaySymbol(), futuresOrderStateBuildFuturesOrderState, false, buildFuturesTradeRowState(futuresOrderStateBuildFuturesOrderState));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final FuturesOrderState buildFuturesOrderState(UUID activeInstrumentId, Account activeAccount, FuturesAccount activeRhdAccount, FuturesInstrumentBuyingPower instrumentBuyingPower, FuturesInstrument orderInstrument, FuturesChartPosition instrumentPosition, InstrumentOrderState4 instrumentTradeAmount) {
        FuturesCostBasis futuresCostBasis;
        FuturesCostBasis costBasis;
        if (!Intrinsics.areEqual(orderInstrument != null ? orderInstrument.getId() : null, activeInstrumentId)) {
            return null;
        }
        if (instrumentPosition == null || (costBasis = instrumentPosition.getCostBasis()) == null) {
            futuresCostBasis = null;
        } else {
            if (Intrinsics.areEqual(costBasis.getRhdAccountId(), activeRhdAccount != null ? activeRhdAccount.getId() : null)) {
                futuresCostBasis = costBasis;
            }
        }
        if (activeAccount == null || orderInstrument == null) {
            return null;
        }
        Quantity quantity = instrumentTradeAmount instanceof Quantity ? (Quantity) instrumentTradeAmount : null;
        if (quantity == null || instrumentBuyingPower == null) {
            return null;
        }
        return new FuturesOrderState(activeAccount, activeRhdAccount, orderInstrument, quantity, instrumentBuyingPower, futuresCostBasis, null);
    }

    private final TradeRowState buildFuturesTradeRowState(FuturesOrderState orderState) {
        BigDecimal amount;
        Quantity orderTradeAmount;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C10962R.string.market_buy_label, new Object[0]);
        StringResource stringResourceInvoke2 = companion.invoke(C10962R.string.market_sell_label, new Object[0]);
        int i = C10962R.string.quantity_short_label;
        if (orderState == null || (orderTradeAmount = orderState.getOrderTradeAmount()) == null || (amount = orderTradeAmount.getAmount()) == null) {
            amount = BigDecimal.ONE;
        }
        Intrinsics.checkNotNull(amount);
        return new TradeRowState(companion.invoke(i, Integer.valueOf(BigDecimals7.toIntRounded(amount))), false, stringResourceInvoke, true, false, stringResourceInvoke2, true, false);
    }
}
