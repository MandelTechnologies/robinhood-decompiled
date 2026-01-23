package com.robinhood.android.advisory.projection.chart;

import kotlin.Metadata;

/* compiled from: ChartModels.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/chart/EndOfYearProjectionValue;", "", "percentile5", "", "median", "percentile95", "netDeposit", "<init>", "(DDDD)V", "getPercentile5", "()D", "getMedian", "getPercentile95", "getNetDeposit", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EndOfYearProjectionValue {
    public static final int $stable = 0;
    private final double median;
    private final double netDeposit;
    private final double percentile5;
    private final double percentile95;

    public static /* synthetic */ EndOfYearProjectionValue copy$default(EndOfYearProjectionValue endOfYearProjectionValue, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = endOfYearProjectionValue.percentile5;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = endOfYearProjectionValue.median;
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = endOfYearProjectionValue.percentile95;
        }
        return endOfYearProjectionValue.copy(d5, d6, d3, (i & 8) != 0 ? endOfYearProjectionValue.netDeposit : d4);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPercentile5() {
        return this.percentile5;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMedian() {
        return this.median;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPercentile95() {
        return this.percentile95;
    }

    /* renamed from: component4, reason: from getter */
    public final double getNetDeposit() {
        return this.netDeposit;
    }

    public final EndOfYearProjectionValue copy(double percentile5, double median, double percentile95, double netDeposit) {
        return new EndOfYearProjectionValue(percentile5, median, percentile95, netDeposit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndOfYearProjectionValue)) {
            return false;
        }
        EndOfYearProjectionValue endOfYearProjectionValue = (EndOfYearProjectionValue) other;
        return Double.compare(this.percentile5, endOfYearProjectionValue.percentile5) == 0 && Double.compare(this.median, endOfYearProjectionValue.median) == 0 && Double.compare(this.percentile95, endOfYearProjectionValue.percentile95) == 0 && Double.compare(this.netDeposit, endOfYearProjectionValue.netDeposit) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.percentile5) * 31) + Double.hashCode(this.median)) * 31) + Double.hashCode(this.percentile95)) * 31) + Double.hashCode(this.netDeposit);
    }

    public String toString() {
        return "EndOfYearProjectionValue(percentile5=" + this.percentile5 + ", median=" + this.median + ", percentile95=" + this.percentile95 + ", netDeposit=" + this.netDeposit + ")";
    }

    public EndOfYearProjectionValue(double d, double d2, double d3, double d4) {
        this.percentile5 = d;
        this.median = d2;
        this.percentile95 = d3;
        this.netDeposit = d4;
    }

    public final double getPercentile5() {
        return this.percentile5;
    }

    public final double getMedian() {
        return this.median;
    }

    public final double getPercentile95() {
        return this.percentile95;
    }

    public final double getNetDeposit() {
        return this.netDeposit;
    }
}
