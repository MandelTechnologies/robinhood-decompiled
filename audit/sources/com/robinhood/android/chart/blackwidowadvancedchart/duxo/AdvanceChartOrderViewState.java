package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import kotlin.Metadata;

/* compiled from: AdvanceChartOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "", "allowFractional", "", "getAllowFractional", "()Z", "symbol", "", "getSymbol", "()Ljava/lang/String;", "instrumentOrderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "getInstrumentOrderState", "()Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "autoSendOrders", "getAutoSendOrders", "tradeRowState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "getTradeRowState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvanceChartOrderViewState {
    boolean getAllowFractional();

    boolean getAutoSendOrders();

    InstrumentOrderState getInstrumentOrderState();

    String getSymbol();

    TradeRowState getTradeRowState();
}
