package com.robinhood.android.portfolio.pnl.api;

import com.robinhood.android.charts.models.api.ApiPageWithChart;
import com.robinhood.android.charts.models.api.ApiPerformanceChartSpans;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiProfitAndLossChart.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/api/ApiProfitAndLossChart;", "", "account_number", "", "assets", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "span", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "spans", "Lcom/robinhood/android/charts/models/api/ApiPerformanceChartSpans;", "chart", "Lcom/robinhood/android/charts/models/api/ApiPageWithChart;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;Lcom/robinhood/android/charts/models/api/ApiPerformanceChartSpans;Lcom/robinhood/android/charts/models/api/ApiPageWithChart;)V", "getAccount_number", "()Ljava/lang/String;", "getAssets", "()Ljava/util/List;", "getSpan", "()Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "getSpans", "()Lcom/robinhood/android/charts/models/api/ApiPerformanceChartSpans;", "getChart", "()Lcom/robinhood/android/charts/models/api/ApiPageWithChart;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiProfitAndLossChart {
    private final String account_number;
    private final List<AssetClass> assets;
    private final ApiPageWithChart<GenericAction> chart;
    private final ProfitAndLossChartSpan span;
    private final ApiPerformanceChartSpans spans;

    public static /* synthetic */ ApiProfitAndLossChart copy$default(ApiProfitAndLossChart apiProfitAndLossChart, String str, List list, ProfitAndLossChartSpan profitAndLossChartSpan, ApiPerformanceChartSpans apiPerformanceChartSpans, ApiPageWithChart apiPageWithChart, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiProfitAndLossChart.account_number;
        }
        if ((i & 2) != 0) {
            list = apiProfitAndLossChart.assets;
        }
        if ((i & 4) != 0) {
            profitAndLossChartSpan = apiProfitAndLossChart.span;
        }
        if ((i & 8) != 0) {
            apiPerformanceChartSpans = apiProfitAndLossChart.spans;
        }
        if ((i & 16) != 0) {
            apiPageWithChart = apiProfitAndLossChart.chart;
        }
        ApiPageWithChart apiPageWithChart2 = apiPageWithChart;
        ProfitAndLossChartSpan profitAndLossChartSpan2 = profitAndLossChartSpan;
        return apiProfitAndLossChart.copy(str, list, profitAndLossChartSpan2, apiPerformanceChartSpans, apiPageWithChart2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    public final List<AssetClass> component2() {
        return this.assets;
    }

    /* renamed from: component3, reason: from getter */
    public final ProfitAndLossChartSpan getSpan() {
        return this.span;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiPerformanceChartSpans getSpans() {
        return this.spans;
    }

    public final ApiPageWithChart<GenericAction> component5() {
        return this.chart;
    }

    public final ApiProfitAndLossChart copy(String account_number, List<? extends AssetClass> assets, ProfitAndLossChartSpan span, ApiPerformanceChartSpans spans, ApiPageWithChart<GenericAction> chart) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(chart, "chart");
        return new ApiProfitAndLossChart(account_number, assets, span, spans, chart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiProfitAndLossChart)) {
            return false;
        }
        ApiProfitAndLossChart apiProfitAndLossChart = (ApiProfitAndLossChart) other;
        return Intrinsics.areEqual(this.account_number, apiProfitAndLossChart.account_number) && Intrinsics.areEqual(this.assets, apiProfitAndLossChart.assets) && this.span == apiProfitAndLossChart.span && Intrinsics.areEqual(this.spans, apiProfitAndLossChart.spans) && Intrinsics.areEqual(this.chart, apiProfitAndLossChart.chart);
    }

    public int hashCode() {
        return (((((((this.account_number.hashCode() * 31) + this.assets.hashCode()) * 31) + this.span.hashCode()) * 31) + this.spans.hashCode()) * 31) + this.chart.hashCode();
    }

    public String toString() {
        return "ApiProfitAndLossChart(account_number=" + this.account_number + ", assets=" + this.assets + ", span=" + this.span + ", spans=" + this.spans + ", chart=" + this.chart + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiProfitAndLossChart(String account_number, List<? extends AssetClass> assets, ProfitAndLossChartSpan span, ApiPerformanceChartSpans spans, ApiPageWithChart<GenericAction> chart) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.account_number = account_number;
        this.assets = assets;
        this.span = span;
        this.spans = spans;
        this.chart = chart;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final List<AssetClass> getAssets() {
        return this.assets;
    }

    public final ProfitAndLossChartSpan getSpan() {
        return this.span;
    }

    public final ApiPerformanceChartSpans getSpans() {
        return this.spans;
    }

    public final ApiPageWithChart<GenericAction> getChart() {
        return this.chart;
    }
}
