package com.robinhood.android.futures.charts;

import android.os.Parcelable;
import com.robinhood.futures.charts.contracts.models.ScrubData;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesChartsServiceManager.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/charts/FuturesChartResult;", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "comparisonPoint", "", "isChartPositive", "", "scrubData", "", "Lcom/robinhood/futures/charts/contracts/models/ScrubData;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Ljava/lang/Double;ZLjava/util/List;)V", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getComparisonPoint", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "getScrubData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Ljava/lang/Double;ZLjava/util/List;)Lcom/robinhood/android/futures/charts/FuturesChartResult;", "equals", "other", "hashCode", "", "toString", "", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesChartResult {
    public static final int $stable = 8;
    private final Chart<Parcelable> chart;
    private final Double comparisonPoint;
    private final boolean isChartPositive;
    private final List<ScrubData> scrubData;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesChartResult copy$default(FuturesChartResult futuresChartResult, Chart chart, Double d, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            chart = futuresChartResult.chart;
        }
        if ((i & 2) != 0) {
            d = futuresChartResult.comparisonPoint;
        }
        if ((i & 4) != 0) {
            z = futuresChartResult.isChartPositive;
        }
        if ((i & 8) != 0) {
            list = futuresChartResult.scrubData;
        }
        return futuresChartResult.copy(chart, d, z, list);
    }

    public final Chart<Parcelable> component1() {
        return this.chart;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getComparisonPoint() {
        return this.comparisonPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChartPositive() {
        return this.isChartPositive;
    }

    public final List<ScrubData> component4() {
        return this.scrubData;
    }

    public final FuturesChartResult copy(Chart<? extends Parcelable> chart, Double comparisonPoint, boolean isChartPositive, List<ScrubData> scrubData) {
        return new FuturesChartResult(chart, comparisonPoint, isChartPositive, scrubData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesChartResult)) {
            return false;
        }
        FuturesChartResult futuresChartResult = (FuturesChartResult) other;
        return Intrinsics.areEqual(this.chart, futuresChartResult.chart) && Intrinsics.areEqual((Object) this.comparisonPoint, (Object) futuresChartResult.comparisonPoint) && this.isChartPositive == futuresChartResult.isChartPositive && Intrinsics.areEqual(this.scrubData, futuresChartResult.scrubData);
    }

    public int hashCode() {
        Chart<Parcelable> chart = this.chart;
        int iHashCode = (chart == null ? 0 : chart.hashCode()) * 31;
        Double d = this.comparisonPoint;
        int iHashCode2 = (((iHashCode + (d == null ? 0 : d.hashCode())) * 31) + Boolean.hashCode(this.isChartPositive)) * 31;
        List<ScrubData> list = this.scrubData;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "FuturesChartResult(chart=" + this.chart + ", comparisonPoint=" + this.comparisonPoint + ", isChartPositive=" + this.isChartPositive + ", scrubData=" + this.scrubData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesChartResult(Chart<? extends Parcelable> chart, Double d, boolean z, List<ScrubData> list) {
        this.chart = chart;
        this.comparisonPoint = d;
        this.isChartPositive = z;
        this.scrubData = list;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final Double getComparisonPoint() {
        return this.comparisonPoint;
    }

    public final boolean isChartPositive() {
        return this.isChartPositive;
    }

    public final List<ScrubData> getScrubData() {
        return this.scrubData;
    }
}
