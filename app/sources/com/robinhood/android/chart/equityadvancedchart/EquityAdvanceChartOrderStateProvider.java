package com.robinhood.android.chart.equityadvancedchart;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityAdvanceChartOrderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderViewState;", "<init>", "()V", "reduce", "dataState", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EquityAdvanceChartOrderStateProvider implements StateProvider<EquityAdvanceChartOrderDataState, EquityAdvanceChartOrderViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EquityAdvanceChartOrderViewState reduce(EquityAdvanceChartOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new EquityAdvanceChartOrderViewState(dataState.getActiveRhsAccount(), dataState.getBuyingPower(), dataState.getOrderInstrument(), dataState.getInstrumentPosition(), dataState.getInstrumentTradeAmount(), dataState.getAutoSendSwitchState(), dataState.getNextMarketHours(), dataState.getLongOrderMarketHours(), dataState.getShortOrderMarketHours(), dataState.getLongOrderTimeInForce(), dataState.getShortOrderTimeInForce(), dataState.getBrokebackOrderExpireDateString(), dataState.getQuote(), dataState.getAutoSendKillSwitchEnabled(), dataState.getNbboSummary(), dataState.getTradingOnChart(), dataState.getAutoSendConfirmMarketOrderSide(), dataState.getNbboLoading(), extensions2.toImmutableSet(dataState.getActiveRhsAccountFeatures()), dataState.getShouldShowOptionsPromo(), dataState.getChartCursorPrice(), dataState.getBuySellData(), dataState.getShortingExperimentEnabled(), dataState.getShortingInfo());
    }
}
