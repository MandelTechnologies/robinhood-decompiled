package com.robinhood.android.futures.detail.p140ui.chart;

import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartViewState;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.futures.charts.contracts.models.ScrubData;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesDetailChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/ChartStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.chart.ChartStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesDetailChartDuxo3 implements StateProvider<FuturesDetailChartDataState, FuturesDetailChartViewState> {
    public static final int $stable = 0;
    public static final FuturesDetailChartDuxo3 INSTANCE = new FuturesDetailChartDuxo3();

    private FuturesDetailChartDuxo3() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesDetailChartViewState reduce(FuturesDetailChartDataState dataState) {
        FuturesDetailChartViewState.ChartData chartData;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID contractId = dataState.getContractId();
        FuturesContract contract = dataState.getContract();
        String streamingSymbol = contract != null ? contract.getStreamingSymbol() : null;
        FuturesContract contract2 = dataState.getContract();
        UUID productId = contract2 != null ? contract2.getProductId() : null;
        if (dataState.getProduct() != null) {
            FuturesDetailChartViewState.ChartData.CurrentCursorData currentCursorData = dataState.getCurrentCursorData();
            FuturesProduct product = dataState.getProduct();
            FuturesQuote quote = dataState.getQuote();
            String nullable$default = FuturesProduct5.formatNullable$default(product, quote != null ? quote.getBidPrice() : null, null, 2, null);
            FuturesProduct product2 = dataState.getProduct();
            FuturesQuote quote2 = dataState.getQuote();
            chartData = new FuturesDetailChartViewState.ChartData(currentCursorData, nullable$default, FuturesProduct5.formatNullable$default(product2, quote2 != null ? quote2.getAskPrice() : null, null, 2, null), dataState.getChart());
        } else {
            chartData = null;
        }
        boolean zIsChartPositive = dataState.getIsChartPositive();
        List<ScrubData> scrubData = dataState.getScrubData();
        return new FuturesDetailChartViewState(contractId, streamingSymbol, productId, chartData, zIsChartPositive, scrubData != null ? extensions2.toPersistentList(scrubData) : null, dataState.getCurrentChartType(), dataState.getShowContinuousChartToggle(), dataState.isContinuousChart(), dataState.getCurrentDisplaySpan(), dataState.getChartSettingsVisible(), dataState.isInFuturesAdvancedChartsExperiment(), dataState.getHasVisitedMac());
    }
}
