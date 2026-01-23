package com.robinhood.android.trade.options.profitloss.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossSegment;", "", "points", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPoint;", "interpolation", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPoints", "()Ljava/util/List;", "getInterpolation", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossSegment {
    public static final int $stable = 8;
    private final String interpolation;
    private final List<ProfitAndLossPoint> points;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfitAndLossSegment copy$default(ProfitAndLossSegment profitAndLossSegment, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profitAndLossSegment.points;
        }
        if ((i & 2) != 0) {
            str = profitAndLossSegment.interpolation;
        }
        return profitAndLossSegment.copy(list, str);
    }

    public final List<ProfitAndLossPoint> component1() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInterpolation() {
        return this.interpolation;
    }

    public final ProfitAndLossSegment copy(List<ProfitAndLossPoint> points, String interpolation) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(interpolation, "interpolation");
        return new ProfitAndLossSegment(points, interpolation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossSegment)) {
            return false;
        }
        ProfitAndLossSegment profitAndLossSegment = (ProfitAndLossSegment) other;
        return Intrinsics.areEqual(this.points, profitAndLossSegment.points) && Intrinsics.areEqual(this.interpolation, profitAndLossSegment.interpolation);
    }

    public int hashCode() {
        return (this.points.hashCode() * 31) + this.interpolation.hashCode();
    }

    public String toString() {
        return "ProfitAndLossSegment(points=" + this.points + ", interpolation=" + this.interpolation + ")";
    }

    public ProfitAndLossSegment(List<ProfitAndLossPoint> points, String interpolation) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(interpolation, "interpolation");
        this.points = points;
        this.interpolation = interpolation;
    }

    public final List<ProfitAndLossPoint> getPoints() {
        return this.points;
    }

    public /* synthetic */ ProfitAndLossSegment(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "linear" : str);
    }

    public final String getInterpolation() {
        return this.interpolation;
    }
}
