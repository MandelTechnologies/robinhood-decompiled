package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.android.charts.models.p080db.PageWithChart2;
import com.robinhood.android.charts.models.p080db.PerformanceChartSpans2;
import com.robinhood.android.portfolio.pnl.api.ApiProfitAndLossChart;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossChart;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossChartKt {
    public static final ProfitAndLossChart toDbModel(ApiProfitAndLossChart apiProfitAndLossChart) {
        Intrinsics.checkNotNullParameter(apiProfitAndLossChart, "<this>");
        return new ProfitAndLossChart(apiProfitAndLossChart.getAccount_number(), apiProfitAndLossChart.getAssets(), apiProfitAndLossChart.getSpan(), PerformanceChartSpans2.toDbModel(apiProfitAndLossChart.getSpans()), PageWithChart2.toDbModel(apiProfitAndLossChart.getChart()));
    }
}
