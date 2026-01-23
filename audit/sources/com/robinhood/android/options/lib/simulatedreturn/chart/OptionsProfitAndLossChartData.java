package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsProfitAndLossChartDataState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0003\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0003HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003J®\u0001\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00032\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;", "", "dataPoints", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartPoint;", "pointsOfInterest", "segmentedLineData", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment;", "xAxisData", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "yAxisData", "positiveAreas", "", "negativeAreas", "underlyingX", "", "limitAtZero", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "limitAtInfinity", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Float;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;)V", "getDataPoints", "()Lkotlinx/collections/immutable/ImmutableList;", "getPointsOfInterest", "getSegmentedLineData", "getXAxisData", "getYAxisData", "getPositiveAreas", "getNegativeAreas", "getUnderlyingX", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLimitAtZero", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "getLimitAtInfinity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Float;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsProfitAndLossChartData {
    public static final int $stable = 8;
    private final ImmutableList<OptionsSimulatedReturnChartPoint> dataPoints;
    private final ProfitAndLossLimit limitAtInfinity;
    private final ProfitAndLossLimit limitAtZero;
    private final ImmutableList<List<OptionsProfitAndLossSegment>> negativeAreas;
    private final ImmutableList<OptionsSimulatedReturnChartPoint> pointsOfInterest;
    private final ImmutableList<List<OptionsProfitAndLossSegment>> positiveAreas;
    private final ImmutableList<OptionsProfitAndLossSegment> segmentedLineData;
    private final Float underlyingX;
    private final ImmutableList<SimulatedReturnsGridLine> xAxisData;
    private final ImmutableList<SimulatedReturnsGridLine> yAxisData;

    public OptionsProfitAndLossChartData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ OptionsProfitAndLossChartData copy$default(OptionsProfitAndLossChartData optionsProfitAndLossChartData, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, ImmutableList immutableList7, Float f, ProfitAndLossLimit profitAndLossLimit, ProfitAndLossLimit profitAndLossLimit2, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = optionsProfitAndLossChartData.dataPoints;
        }
        if ((i & 2) != 0) {
            immutableList2 = optionsProfitAndLossChartData.pointsOfInterest;
        }
        if ((i & 4) != 0) {
            immutableList3 = optionsProfitAndLossChartData.segmentedLineData;
        }
        if ((i & 8) != 0) {
            immutableList4 = optionsProfitAndLossChartData.xAxisData;
        }
        if ((i & 16) != 0) {
            immutableList5 = optionsProfitAndLossChartData.yAxisData;
        }
        if ((i & 32) != 0) {
            immutableList6 = optionsProfitAndLossChartData.positiveAreas;
        }
        if ((i & 64) != 0) {
            immutableList7 = optionsProfitAndLossChartData.negativeAreas;
        }
        if ((i & 128) != 0) {
            f = optionsProfitAndLossChartData.underlyingX;
        }
        if ((i & 256) != 0) {
            profitAndLossLimit = optionsProfitAndLossChartData.limitAtZero;
        }
        if ((i & 512) != 0) {
            profitAndLossLimit2 = optionsProfitAndLossChartData.limitAtInfinity;
        }
        ProfitAndLossLimit profitAndLossLimit3 = profitAndLossLimit;
        ProfitAndLossLimit profitAndLossLimit4 = profitAndLossLimit2;
        ImmutableList immutableList8 = immutableList7;
        Float f2 = f;
        ImmutableList immutableList9 = immutableList5;
        ImmutableList immutableList10 = immutableList6;
        return optionsProfitAndLossChartData.copy(immutableList, immutableList2, immutableList3, immutableList4, immutableList9, immutableList10, immutableList8, f2, profitAndLossLimit3, profitAndLossLimit4);
    }

    public final ImmutableList<OptionsSimulatedReturnChartPoint> component1() {
        return this.dataPoints;
    }

    /* renamed from: component10, reason: from getter */
    public final ProfitAndLossLimit getLimitAtInfinity() {
        return this.limitAtInfinity;
    }

    public final ImmutableList<OptionsSimulatedReturnChartPoint> component2() {
        return this.pointsOfInterest;
    }

    public final ImmutableList<OptionsProfitAndLossSegment> component3() {
        return this.segmentedLineData;
    }

    public final ImmutableList<SimulatedReturnsGridLine> component4() {
        return this.xAxisData;
    }

    public final ImmutableList<SimulatedReturnsGridLine> component5() {
        return this.yAxisData;
    }

    public final ImmutableList<List<OptionsProfitAndLossSegment>> component6() {
        return this.positiveAreas;
    }

    public final ImmutableList<List<OptionsProfitAndLossSegment>> component7() {
        return this.negativeAreas;
    }

    /* renamed from: component8, reason: from getter */
    public final Float getUnderlyingX() {
        return this.underlyingX;
    }

    /* renamed from: component9, reason: from getter */
    public final ProfitAndLossLimit getLimitAtZero() {
        return this.limitAtZero;
    }

    public final OptionsProfitAndLossChartData copy(ImmutableList<OptionsSimulatedReturnChartPoint> dataPoints, ImmutableList<OptionsSimulatedReturnChartPoint> pointsOfInterest, ImmutableList<OptionsProfitAndLossSegment> segmentedLineData, ImmutableList<SimulatedReturnsGridLine> xAxisData, ImmutableList<SimulatedReturnsGridLine> yAxisData, ImmutableList<? extends List<OptionsProfitAndLossSegment>> positiveAreas, ImmutableList<? extends List<OptionsProfitAndLossSegment>> negativeAreas, Float underlyingX, ProfitAndLossLimit limitAtZero, ProfitAndLossLimit limitAtInfinity) {
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(pointsOfInterest, "pointsOfInterest");
        Intrinsics.checkNotNullParameter(segmentedLineData, "segmentedLineData");
        Intrinsics.checkNotNullParameter(xAxisData, "xAxisData");
        Intrinsics.checkNotNullParameter(yAxisData, "yAxisData");
        Intrinsics.checkNotNullParameter(positiveAreas, "positiveAreas");
        Intrinsics.checkNotNullParameter(negativeAreas, "negativeAreas");
        return new OptionsProfitAndLossChartData(dataPoints, pointsOfInterest, segmentedLineData, xAxisData, yAxisData, positiveAreas, negativeAreas, underlyingX, limitAtZero, limitAtInfinity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitAndLossChartData)) {
            return false;
        }
        OptionsProfitAndLossChartData optionsProfitAndLossChartData = (OptionsProfitAndLossChartData) other;
        return Intrinsics.areEqual(this.dataPoints, optionsProfitAndLossChartData.dataPoints) && Intrinsics.areEqual(this.pointsOfInterest, optionsProfitAndLossChartData.pointsOfInterest) && Intrinsics.areEqual(this.segmentedLineData, optionsProfitAndLossChartData.segmentedLineData) && Intrinsics.areEqual(this.xAxisData, optionsProfitAndLossChartData.xAxisData) && Intrinsics.areEqual(this.yAxisData, optionsProfitAndLossChartData.yAxisData) && Intrinsics.areEqual(this.positiveAreas, optionsProfitAndLossChartData.positiveAreas) && Intrinsics.areEqual(this.negativeAreas, optionsProfitAndLossChartData.negativeAreas) && Intrinsics.areEqual((Object) this.underlyingX, (Object) optionsProfitAndLossChartData.underlyingX) && Intrinsics.areEqual(this.limitAtZero, optionsProfitAndLossChartData.limitAtZero) && Intrinsics.areEqual(this.limitAtInfinity, optionsProfitAndLossChartData.limitAtInfinity);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.dataPoints.hashCode() * 31) + this.pointsOfInterest.hashCode()) * 31) + this.segmentedLineData.hashCode()) * 31) + this.xAxisData.hashCode()) * 31) + this.yAxisData.hashCode()) * 31) + this.positiveAreas.hashCode()) * 31) + this.negativeAreas.hashCode()) * 31;
        Float f = this.underlyingX;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        ProfitAndLossLimit profitAndLossLimit = this.limitAtZero;
        int iHashCode3 = (iHashCode2 + (profitAndLossLimit == null ? 0 : profitAndLossLimit.hashCode())) * 31;
        ProfitAndLossLimit profitAndLossLimit2 = this.limitAtInfinity;
        return iHashCode3 + (profitAndLossLimit2 != null ? profitAndLossLimit2.hashCode() : 0);
    }

    public String toString() {
        return "OptionsProfitAndLossChartData(dataPoints=" + this.dataPoints + ", pointsOfInterest=" + this.pointsOfInterest + ", segmentedLineData=" + this.segmentedLineData + ", xAxisData=" + this.xAxisData + ", yAxisData=" + this.yAxisData + ", positiveAreas=" + this.positiveAreas + ", negativeAreas=" + this.negativeAreas + ", underlyingX=" + this.underlyingX + ", limitAtZero=" + this.limitAtZero + ", limitAtInfinity=" + this.limitAtInfinity + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsProfitAndLossChartData(ImmutableList<OptionsSimulatedReturnChartPoint> dataPoints, ImmutableList<OptionsSimulatedReturnChartPoint> pointsOfInterest, ImmutableList<OptionsProfitAndLossSegment> segmentedLineData, ImmutableList<SimulatedReturnsGridLine> xAxisData, ImmutableList<SimulatedReturnsGridLine> yAxisData, ImmutableList<? extends List<OptionsProfitAndLossSegment>> positiveAreas, ImmutableList<? extends List<OptionsProfitAndLossSegment>> negativeAreas, Float f, ProfitAndLossLimit profitAndLossLimit, ProfitAndLossLimit profitAndLossLimit2) {
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(pointsOfInterest, "pointsOfInterest");
        Intrinsics.checkNotNullParameter(segmentedLineData, "segmentedLineData");
        Intrinsics.checkNotNullParameter(xAxisData, "xAxisData");
        Intrinsics.checkNotNullParameter(yAxisData, "yAxisData");
        Intrinsics.checkNotNullParameter(positiveAreas, "positiveAreas");
        Intrinsics.checkNotNullParameter(negativeAreas, "negativeAreas");
        this.dataPoints = dataPoints;
        this.pointsOfInterest = pointsOfInterest;
        this.segmentedLineData = segmentedLineData;
        this.xAxisData = xAxisData;
        this.yAxisData = yAxisData;
        this.positiveAreas = positiveAreas;
        this.negativeAreas = negativeAreas;
        this.underlyingX = f;
        this.limitAtZero = profitAndLossLimit;
        this.limitAtInfinity = profitAndLossLimit2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionsProfitAndLossChartData(kotlinx.collections.immutable.ImmutableList r2, kotlinx.collections.immutable.ImmutableList r3, kotlinx.collections.immutable.ImmutableList r4, kotlinx.collections.immutable.ImmutableList r5, kotlinx.collections.immutable.ImmutableList r6, kotlinx.collections.immutable.ImmutableList r7, kotlinx.collections.immutable.ImmutableList r8, java.lang.Float r9, com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimit r10, com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimit r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L8
            kotlinx.collections.immutable.PersistentList r2 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L8:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            kotlinx.collections.immutable.PersistentList r3 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L18
            kotlinx.collections.immutable.PersistentList r4 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L18:
            r13 = r12 & 8
            if (r13 == 0) goto L20
            kotlinx.collections.immutable.PersistentList r5 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L20:
            r13 = r12 & 16
            if (r13 == 0) goto L28
            kotlinx.collections.immutable.PersistentList r6 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L28:
            r13 = r12 & 32
            if (r13 == 0) goto L30
            kotlinx.collections.immutable.PersistentList r7 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L30:
            r13 = r12 & 64
            if (r13 == 0) goto L38
            kotlinx.collections.immutable.PersistentList r8 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L38:
            r13 = r12 & 128(0x80, float:1.794E-43)
            r0 = 0
            if (r13 == 0) goto L3e
            r9 = r0
        L3e:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L43
            r10 = r0
        L43:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L53
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L5e
        L53:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L5e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartData.<init>(kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, java.lang.Float, com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimit, com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimit, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImmutableList<OptionsSimulatedReturnChartPoint> getDataPoints() {
        return this.dataPoints;
    }

    public final ImmutableList<OptionsSimulatedReturnChartPoint> getPointsOfInterest() {
        return this.pointsOfInterest;
    }

    public final ImmutableList<OptionsProfitAndLossSegment> getSegmentedLineData() {
        return this.segmentedLineData;
    }

    public final ImmutableList<SimulatedReturnsGridLine> getXAxisData() {
        return this.xAxisData;
    }

    public final ImmutableList<SimulatedReturnsGridLine> getYAxisData() {
        return this.yAxisData;
    }

    public final ImmutableList<List<OptionsProfitAndLossSegment>> getPositiveAreas() {
        return this.positiveAreas;
    }

    public final ImmutableList<List<OptionsProfitAndLossSegment>> getNegativeAreas() {
        return this.negativeAreas;
    }

    public final Float getUnderlyingX() {
        return this.underlyingX;
    }

    public final ProfitAndLossLimit getLimitAtZero() {
        return this.limitAtZero;
    }

    public final ProfitAndLossLimit getLimitAtInfinity() {
        return this.limitAtInfinity;
    }
}
