package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.android.charts.models.p080db.PageWithChart;
import com.robinhood.android.charts.models.p080db.PerformanceChartSpans;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "", "accountNumber", "", "assets", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "span", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "spans", "Lcom/robinhood/android/charts/models/db/PerformanceChartSpans;", "chart", "Lcom/robinhood/android/charts/models/db/PageWithChart;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;Lcom/robinhood/android/charts/models/db/PerformanceChartSpans;Lcom/robinhood/android/charts/models/db/PageWithChart;)V", "getAccountNumber", "()Ljava/lang/String;", "getAssets", "()Ljava/util/List;", "getSpan", "()Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "getSpans", "()Lcom/robinhood/android/charts/models/db/PerformanceChartSpans;", "getChart", "()Lcom/robinhood/android/charts/models/db/PageWithChart;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfitAndLossChart {
    private final String accountNumber;
    private final List<AssetClass> assets;
    private final PageWithChart chart;
    private final ProfitAndLossChartSpan span;
    private final PerformanceChartSpans spans;

    public static /* synthetic */ ProfitAndLossChart copy$default(ProfitAndLossChart profitAndLossChart, String str, List list, ProfitAndLossChartSpan profitAndLossChartSpan, PerformanceChartSpans performanceChartSpans, PageWithChart pageWithChart, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profitAndLossChart.accountNumber;
        }
        if ((i & 2) != 0) {
            list = profitAndLossChart.assets;
        }
        if ((i & 4) != 0) {
            profitAndLossChartSpan = profitAndLossChart.span;
        }
        if ((i & 8) != 0) {
            performanceChartSpans = profitAndLossChart.spans;
        }
        if ((i & 16) != 0) {
            pageWithChart = profitAndLossChart.chart;
        }
        PageWithChart pageWithChart2 = pageWithChart;
        ProfitAndLossChartSpan profitAndLossChartSpan2 = profitAndLossChartSpan;
        return profitAndLossChart.copy(str, list, profitAndLossChartSpan2, performanceChartSpans, pageWithChart2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<AssetClass> component2() {
        return this.assets;
    }

    /* renamed from: component3, reason: from getter */
    public final ProfitAndLossChartSpan getSpan() {
        return this.span;
    }

    /* renamed from: component4, reason: from getter */
    public final PerformanceChartSpans getSpans() {
        return this.spans;
    }

    /* renamed from: component5, reason: from getter */
    public final PageWithChart getChart() {
        return this.chart;
    }

    public final ProfitAndLossChart copy(String accountNumber, List<? extends AssetClass> assets, ProfitAndLossChartSpan span, PerformanceChartSpans spans, PageWithChart chart) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(chart, "chart");
        return new ProfitAndLossChart(accountNumber, assets, span, spans, chart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossChart)) {
            return false;
        }
        ProfitAndLossChart profitAndLossChart = (ProfitAndLossChart) other;
        return Intrinsics.areEqual(this.accountNumber, profitAndLossChart.accountNumber) && Intrinsics.areEqual(this.assets, profitAndLossChart.assets) && this.span == profitAndLossChart.span && Intrinsics.areEqual(this.spans, profitAndLossChart.spans) && Intrinsics.areEqual(this.chart, profitAndLossChart.chart);
    }

    public int hashCode() {
        return (((((((this.accountNumber.hashCode() * 31) + this.assets.hashCode()) * 31) + this.span.hashCode()) * 31) + this.spans.hashCode()) * 31) + this.chart.hashCode();
    }

    public String toString() {
        return "ProfitAndLossChart(accountNumber=" + this.accountNumber + ", assets=" + this.assets + ", span=" + this.span + ", spans=" + this.spans + ", chart=" + this.chart + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfitAndLossChart(String accountNumber, List<? extends AssetClass> assets, ProfitAndLossChartSpan span, PerformanceChartSpans spans, PageWithChart chart) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.accountNumber = accountNumber;
        this.assets = assets;
        this.span = span;
        this.spans = spans;
        this.chart = chart;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<AssetClass> getAssets() {
        return this.assets;
    }

    public final ProfitAndLossChartSpan getSpan() {
        return this.span;
    }

    public final PerformanceChartSpans getSpans() {
        return this.spans;
    }

    public final PageWithChart getChart() {
        return this.chart;
    }
}
