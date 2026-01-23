package com.robinhood.android.event.gamedetail.p130ui.chart;

import android.os.Parcelable;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.android.eventcontracts.sharedeventui.chart.EventChartColorOverlay;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailChart.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BQ\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState;", "", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "colors", "Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "chartSideLegendState", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;", "scrubbedPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "activeSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "leftDeltaAnimationData", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;", "rightDeltaAnimationData", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;Lcom/robinhood/models/serverdriven/experimental/api/Point;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;)V", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "getColors", "()Lcom/robinhood/android/eventcontracts/sharedeventui/chart/EventChartColorOverlay;", "getChartSideLegendState", "()Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;", "getScrubbedPoint", "()Lcom/robinhood/models/serverdriven/experimental/api/Point;", "getActiveSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getLeftDeltaAnimationData", "()Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;", "getRightDeltaAnimationData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DeltaAnimationData", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChartState {
    public static final int $stable = 8;
    private final DisplaySpan activeSpan;
    private final Chart<Parcelable> chart;
    private final ChartSideLegendState chartSideLegendState;
    private final EventChartColorOverlay colors;
    private final DeltaAnimationData leftDeltaAnimationData;
    private final DeltaAnimationData rightDeltaAnimationData;
    private final Point scrubbedPoint;

    public static /* synthetic */ ChartState copy$default(ChartState chartState, Chart chart, EventChartColorOverlay eventChartColorOverlay, ChartSideLegendState chartSideLegendState, Point point, DisplaySpan displaySpan, DeltaAnimationData deltaAnimationData, DeltaAnimationData deltaAnimationData2, int i, Object obj) {
        if ((i & 1) != 0) {
            chart = chartState.chart;
        }
        if ((i & 2) != 0) {
            eventChartColorOverlay = chartState.colors;
        }
        if ((i & 4) != 0) {
            chartSideLegendState = chartState.chartSideLegendState;
        }
        if ((i & 8) != 0) {
            point = chartState.scrubbedPoint;
        }
        if ((i & 16) != 0) {
            displaySpan = chartState.activeSpan;
        }
        if ((i & 32) != 0) {
            deltaAnimationData = chartState.leftDeltaAnimationData;
        }
        if ((i & 64) != 0) {
            deltaAnimationData2 = chartState.rightDeltaAnimationData;
        }
        DeltaAnimationData deltaAnimationData3 = deltaAnimationData;
        DeltaAnimationData deltaAnimationData4 = deltaAnimationData2;
        DisplaySpan displaySpan2 = displaySpan;
        ChartSideLegendState chartSideLegendState2 = chartSideLegendState;
        return chartState.copy(chart, eventChartColorOverlay, chartSideLegendState2, point, displaySpan2, deltaAnimationData3, deltaAnimationData4);
    }

    public final Chart<Parcelable> component1() {
        return this.chart;
    }

    /* renamed from: component2, reason: from getter */
    public final EventChartColorOverlay getColors() {
        return this.colors;
    }

    /* renamed from: component3, reason: from getter */
    public final ChartSideLegendState getChartSideLegendState() {
        return this.chartSideLegendState;
    }

    /* renamed from: component4, reason: from getter */
    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    /* renamed from: component5, reason: from getter */
    public final DisplaySpan getActiveSpan() {
        return this.activeSpan;
    }

    /* renamed from: component6, reason: from getter */
    public final DeltaAnimationData getLeftDeltaAnimationData() {
        return this.leftDeltaAnimationData;
    }

    /* renamed from: component7, reason: from getter */
    public final DeltaAnimationData getRightDeltaAnimationData() {
        return this.rightDeltaAnimationData;
    }

    public final ChartState copy(Chart<? extends Parcelable> chart, EventChartColorOverlay colors, ChartSideLegendState chartSideLegendState, Point scrubbedPoint, DisplaySpan activeSpan, DeltaAnimationData leftDeltaAnimationData, DeltaAnimationData rightDeltaAnimationData) {
        Intrinsics.checkNotNullParameter(chartSideLegendState, "chartSideLegendState");
        return new ChartState(chart, colors, chartSideLegendState, scrubbedPoint, activeSpan, leftDeltaAnimationData, rightDeltaAnimationData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartState)) {
            return false;
        }
        ChartState chartState = (ChartState) other;
        return Intrinsics.areEqual(this.chart, chartState.chart) && Intrinsics.areEqual(this.colors, chartState.colors) && Intrinsics.areEqual(this.chartSideLegendState, chartState.chartSideLegendState) && Intrinsics.areEqual(this.scrubbedPoint, chartState.scrubbedPoint) && this.activeSpan == chartState.activeSpan && Intrinsics.areEqual(this.leftDeltaAnimationData, chartState.leftDeltaAnimationData) && Intrinsics.areEqual(this.rightDeltaAnimationData, chartState.rightDeltaAnimationData);
    }

    public int hashCode() {
        Chart<Parcelable> chart = this.chart;
        int iHashCode = (chart == null ? 0 : chart.hashCode()) * 31;
        EventChartColorOverlay eventChartColorOverlay = this.colors;
        int iHashCode2 = (((iHashCode + (eventChartColorOverlay == null ? 0 : eventChartColorOverlay.hashCode())) * 31) + this.chartSideLegendState.hashCode()) * 31;
        Point point = this.scrubbedPoint;
        int iHashCode3 = (iHashCode2 + (point == null ? 0 : point.hashCode())) * 31;
        DisplaySpan displaySpan = this.activeSpan;
        int iHashCode4 = (iHashCode3 + (displaySpan == null ? 0 : displaySpan.hashCode())) * 31;
        DeltaAnimationData deltaAnimationData = this.leftDeltaAnimationData;
        int iHashCode5 = (iHashCode4 + (deltaAnimationData == null ? 0 : deltaAnimationData.hashCode())) * 31;
        DeltaAnimationData deltaAnimationData2 = this.rightDeltaAnimationData;
        return iHashCode5 + (deltaAnimationData2 != null ? deltaAnimationData2.hashCode() : 0);
    }

    public String toString() {
        return "ChartState(chart=" + this.chart + ", colors=" + this.colors + ", chartSideLegendState=" + this.chartSideLegendState + ", scrubbedPoint=" + this.scrubbedPoint + ", activeSpan=" + this.activeSpan + ", leftDeltaAnimationData=" + this.leftDeltaAnimationData + ", rightDeltaAnimationData=" + this.rightDeltaAnimationData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChartState(Chart<? extends Parcelable> chart, EventChartColorOverlay eventChartColorOverlay, ChartSideLegendState chartSideLegendState, Point point, DisplaySpan displaySpan, DeltaAnimationData deltaAnimationData, DeltaAnimationData deltaAnimationData2) {
        Intrinsics.checkNotNullParameter(chartSideLegendState, "chartSideLegendState");
        this.chart = chart;
        this.colors = eventChartColorOverlay;
        this.chartSideLegendState = chartSideLegendState;
        this.scrubbedPoint = point;
        this.activeSpan = displaySpan;
        this.leftDeltaAnimationData = deltaAnimationData;
        this.rightDeltaAnimationData = deltaAnimationData2;
    }

    public final Chart<Parcelable> getChart() {
        return this.chart;
    }

    public final EventChartColorOverlay getColors() {
        return this.colors;
    }

    public final ChartSideLegendState getChartSideLegendState() {
        return this.chartSideLegendState;
    }

    public final Point getScrubbedPoint() {
        return this.scrubbedPoint;
    }

    public final DisplaySpan getActiveSpan() {
        return this.activeSpan;
    }

    public final DeltaAnimationData getLeftDeltaAnimationData() {
        return this.leftDeltaAnimationData;
    }

    public final DeltaAnimationData getRightDeltaAnimationData() {
        return this.rightDeltaAnimationData;
    }

    /* compiled from: GameDetailChart.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/chart/ChartState$DeltaAnimationData;", "", "deltas", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "contractColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;)V", "getDeltas", "()Lkotlinx/collections/immutable/ImmutableList;", "getContractColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DeltaAnimationData {
        public static final int $stable = 0;
        private final DayNightColor contractColor;
        private final ImmutableList<Delta> deltas;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeltaAnimationData copy$default(DeltaAnimationData deltaAnimationData, ImmutableList immutableList, DayNightColor dayNightColor, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = deltaAnimationData.deltas;
            }
            if ((i & 2) != 0) {
                dayNightColor = deltaAnimationData.contractColor;
            }
            return deltaAnimationData.copy(immutableList, dayNightColor);
        }

        public final ImmutableList<Delta> component1() {
            return this.deltas;
        }

        /* renamed from: component2, reason: from getter */
        public final DayNightColor getContractColor() {
            return this.contractColor;
        }

        public final DeltaAnimationData copy(ImmutableList<Delta> deltas, DayNightColor contractColor) {
            Intrinsics.checkNotNullParameter(deltas, "deltas");
            Intrinsics.checkNotNullParameter(contractColor, "contractColor");
            return new DeltaAnimationData(deltas, contractColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeltaAnimationData)) {
                return false;
            }
            DeltaAnimationData deltaAnimationData = (DeltaAnimationData) other;
            return Intrinsics.areEqual(this.deltas, deltaAnimationData.deltas) && Intrinsics.areEqual(this.contractColor, deltaAnimationData.contractColor);
        }

        public int hashCode() {
            return (this.deltas.hashCode() * 31) + this.contractColor.hashCode();
        }

        public String toString() {
            return "DeltaAnimationData(deltas=" + this.deltas + ", contractColor=" + this.contractColor + ")";
        }

        public DeltaAnimationData(ImmutableList<Delta> deltas, DayNightColor contractColor) {
            Intrinsics.checkNotNullParameter(deltas, "deltas");
            Intrinsics.checkNotNullParameter(contractColor, "contractColor");
            this.deltas = deltas;
            this.contractColor = contractColor;
        }

        public final ImmutableList<Delta> getDeltas() {
            return this.deltas;
        }

        public final DayNightColor getContractColor() {
            return this.contractColor;
        }
    }
}
