package com.robinhood.android.futures.charts;

import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesChartsServiceManager.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\\\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "defaultDisplay", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "netReturn", "", "spanPnl", "commission", "exchangeFees", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getDefaultDisplay", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getNetReturn", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSpanPnl", "getCommission", "getExchangeFees", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;", "equals", "", "other", "hashCode", "", "toString", "", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesPerformanceChartResult {
    public static final int $stable = 8;
    private final Chart<Parcelable> chart;
    private final Double commission;
    private final CursorData defaultDisplay;
    private final Double exchangeFees;
    private final Double netReturn;
    private final Double spanPnl;

    public static /* synthetic */ FuturesPerformanceChartResult copy$default(FuturesPerformanceChartResult futuresPerformanceChartResult, Chart chart, CursorData cursorData, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            chart = futuresPerformanceChartResult.chart;
        }
        if ((i & 2) != 0) {
            cursorData = futuresPerformanceChartResult.defaultDisplay;
        }
        if ((i & 4) != 0) {
            d = futuresPerformanceChartResult.netReturn;
        }
        if ((i & 8) != 0) {
            d2 = futuresPerformanceChartResult.spanPnl;
        }
        if ((i & 16) != 0) {
            d3 = futuresPerformanceChartResult.commission;
        }
        if ((i & 32) != 0) {
            d4 = futuresPerformanceChartResult.exchangeFees;
        }
        Double d5 = d3;
        Double d6 = d4;
        return futuresPerformanceChartResult.copy(chart, cursorData, d, d2, d5, d6);
    }

    public final Chart<Parcelable> component1() {
        return this.chart;
    }

    /* renamed from: component2, reason: from getter */
    public final CursorData getDefaultDisplay() {
        return this.defaultDisplay;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getNetReturn() {
        return this.netReturn;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getSpanPnl() {
        return this.spanPnl;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getCommission() {
        return this.commission;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getExchangeFees() {
        return this.exchangeFees;
    }

    public final FuturesPerformanceChartResult copy(Chart<? extends Parcelable> chart, CursorData defaultDisplay, Double netReturn, Double spanPnl, Double commission, Double exchangeFees) {
        return new FuturesPerformanceChartResult(chart, defaultDisplay, netReturn, spanPnl, commission, exchangeFees);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesPerformanceChartResult)) {
            return false;
        }
        FuturesPerformanceChartResult futuresPerformanceChartResult = (FuturesPerformanceChartResult) other;
        return Intrinsics.areEqual(this.chart, futuresPerformanceChartResult.chart) && Intrinsics.areEqual(this.defaultDisplay, futuresPerformanceChartResult.defaultDisplay) && Intrinsics.areEqual((Object) this.netReturn, (Object) futuresPerformanceChartResult.netReturn) && Intrinsics.areEqual((Object) this.spanPnl, (Object) futuresPerformanceChartResult.spanPnl) && Intrinsics.areEqual((Object) this.commission, (Object) futuresPerformanceChartResult.commission) && Intrinsics.areEqual((Object) this.exchangeFees, (Object) futuresPerformanceChartResult.exchangeFees);
    }

    public int hashCode() {
        Chart<Parcelable> chart = this.chart;
        int iHashCode = (chart == null ? 0 : chart.hashCode()) * 31;
        CursorData cursorData = this.defaultDisplay;
        int iHashCode2 = (iHashCode + (cursorData == null ? 0 : cursorData.hashCode())) * 31;
        Double d = this.netReturn;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.spanPnl;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.commission;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.exchangeFees;
        return iHashCode5 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        return "FuturesPerformanceChartResult(chart=" + this.chart + ", defaultDisplay=" + this.defaultDisplay + ", netReturn=" + this.netReturn + ", spanPnl=" + this.spanPnl + ", commission=" + this.commission + ", exchangeFees=" + this.exchangeFees + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesPerformanceChartResult(Chart<? extends Parcelable> chart, CursorData cursorData, Double d, Double d2, Double d3, Double d4) {
        this.chart = chart;
        this.defaultDisplay = cursorData;
        this.netReturn = d;
        this.spanPnl = d2;
        this.commission = d3;
        this.exchangeFees = d4;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final CursorData getDefaultDisplay() {
        return this.defaultDisplay;
    }

    public final Double getNetReturn() {
        return this.netReturn;
    }

    public final Double getSpanPnl() {
        return this.spanPnl;
    }

    public final Double getCommission() {
        return this.commission;
    }

    public final Double getExchangeFees() {
        return this.exchangeFees;
    }
}
