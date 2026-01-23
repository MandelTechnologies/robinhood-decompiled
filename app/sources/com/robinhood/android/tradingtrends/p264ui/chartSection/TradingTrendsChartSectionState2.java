package com.robinhood.android.tradingtrends.p264ui.chartSection;

import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsChartSectionState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDataState;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "<init>", "()V", "reduce", "dataState", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionStateProvider, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsChartSectionState2 implements StateProvider<TradingTrendsChartSectionDataState, TradingTrendsChartSectionState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public TradingTrendsChartSectionState3 reduce(TradingTrendsChartSectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getInstrumentId() != null && dataState.getData() != null) {
            return new TradingTrendsChartSectionState3.Ready(dataState.getInstrumentId(), dataState.getData(), dataState.getChart());
        }
        if (dataState.isDetailPage() || dataState.getLoading()) {
            return new TradingTrendsChartSectionState3.Loading(dataState.isDetailPage());
        }
        return TradingTrendsChartSectionState3.Disabled.INSTANCE;
    }
}
