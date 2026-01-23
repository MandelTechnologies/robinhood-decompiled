package com.robinhood.android.trade.options.profitloss.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003JU\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossSparklinesAndAreas;", "", "positiveSegments", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossSegment;", "negativeSegments", "positiveAreas", "negativeAreas", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPositiveSegments", "()Ljava/util/List;", "getNegativeSegments", "getPositiveAreas", "getNegativeAreas", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossSparklinesAndAreas {
    public static final int $stable = 8;
    private final List<List<ProfitAndLossSegment>> negativeAreas;
    private final List<ProfitAndLossSegment> negativeSegments;
    private final List<List<ProfitAndLossSegment>> positiveAreas;
    private final List<ProfitAndLossSegment> positiveSegments;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfitAndLossSparklinesAndAreas copy$default(ProfitAndLossSparklinesAndAreas profitAndLossSparklinesAndAreas, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profitAndLossSparklinesAndAreas.positiveSegments;
        }
        if ((i & 2) != 0) {
            list2 = profitAndLossSparklinesAndAreas.negativeSegments;
        }
        if ((i & 4) != 0) {
            list3 = profitAndLossSparklinesAndAreas.positiveAreas;
        }
        if ((i & 8) != 0) {
            list4 = profitAndLossSparklinesAndAreas.negativeAreas;
        }
        return profitAndLossSparklinesAndAreas.copy(list, list2, list3, list4);
    }

    public final List<ProfitAndLossSegment> component1() {
        return this.positiveSegments;
    }

    public final List<ProfitAndLossSegment> component2() {
        return this.negativeSegments;
    }

    public final List<List<ProfitAndLossSegment>> component3() {
        return this.positiveAreas;
    }

    public final List<List<ProfitAndLossSegment>> component4() {
        return this.negativeAreas;
    }

    public final ProfitAndLossSparklinesAndAreas copy(List<ProfitAndLossSegment> positiveSegments, List<ProfitAndLossSegment> negativeSegments, List<? extends List<ProfitAndLossSegment>> positiveAreas, List<? extends List<ProfitAndLossSegment>> negativeAreas) {
        Intrinsics.checkNotNullParameter(positiveSegments, "positiveSegments");
        Intrinsics.checkNotNullParameter(negativeSegments, "negativeSegments");
        Intrinsics.checkNotNullParameter(positiveAreas, "positiveAreas");
        Intrinsics.checkNotNullParameter(negativeAreas, "negativeAreas");
        return new ProfitAndLossSparklinesAndAreas(positiveSegments, negativeSegments, positiveAreas, negativeAreas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossSparklinesAndAreas)) {
            return false;
        }
        ProfitAndLossSparklinesAndAreas profitAndLossSparklinesAndAreas = (ProfitAndLossSparklinesAndAreas) other;
        return Intrinsics.areEqual(this.positiveSegments, profitAndLossSparklinesAndAreas.positiveSegments) && Intrinsics.areEqual(this.negativeSegments, profitAndLossSparklinesAndAreas.negativeSegments) && Intrinsics.areEqual(this.positiveAreas, profitAndLossSparklinesAndAreas.positiveAreas) && Intrinsics.areEqual(this.negativeAreas, profitAndLossSparklinesAndAreas.negativeAreas);
    }

    public int hashCode() {
        return (((((this.positiveSegments.hashCode() * 31) + this.negativeSegments.hashCode()) * 31) + this.positiveAreas.hashCode()) * 31) + this.negativeAreas.hashCode();
    }

    public String toString() {
        return "ProfitAndLossSparklinesAndAreas(positiveSegments=" + this.positiveSegments + ", negativeSegments=" + this.negativeSegments + ", positiveAreas=" + this.positiveAreas + ", negativeAreas=" + this.negativeAreas + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfitAndLossSparklinesAndAreas(List<ProfitAndLossSegment> positiveSegments, List<ProfitAndLossSegment> negativeSegments, List<? extends List<ProfitAndLossSegment>> positiveAreas, List<? extends List<ProfitAndLossSegment>> negativeAreas) {
        Intrinsics.checkNotNullParameter(positiveSegments, "positiveSegments");
        Intrinsics.checkNotNullParameter(negativeSegments, "negativeSegments");
        Intrinsics.checkNotNullParameter(positiveAreas, "positiveAreas");
        Intrinsics.checkNotNullParameter(negativeAreas, "negativeAreas");
        this.positiveSegments = positiveSegments;
        this.negativeSegments = negativeSegments;
        this.positiveAreas = positiveAreas;
        this.negativeAreas = negativeAreas;
    }

    public final List<ProfitAndLossSegment> getPositiveSegments() {
        return this.positiveSegments;
    }

    public final List<ProfitAndLossSegment> getNegativeSegments() {
        return this.negativeSegments;
    }

    public final List<List<ProfitAndLossSegment>> getPositiveAreas() {
        return this.positiveAreas;
    }

    public final List<List<ProfitAndLossSegment>> getNegativeAreas() {
        return this.negativeAreas;
    }
}
