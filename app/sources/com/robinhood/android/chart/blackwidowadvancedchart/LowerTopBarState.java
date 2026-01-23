package com.robinhood.android.chart.blackwidowadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState;", "", "indicatorQuickAccessState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/IndicatorQuickAccessState;", "displayStatus", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "<init>", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/IndicatorQuickAccessState;Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;)V", "getIndicatorQuickAccessState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/IndicatorQuickAccessState;", "getDisplayStatus", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DisplayStatus", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LowerTopBarState {
    public static final int $stable = 8;
    private final DisplayStatus displayStatus;
    private final IndicatorQuickAccessState indicatorQuickAccessState;

    public static /* synthetic */ LowerTopBarState copy$default(LowerTopBarState lowerTopBarState, IndicatorQuickAccessState indicatorQuickAccessState, DisplayStatus displayStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            indicatorQuickAccessState = lowerTopBarState.indicatorQuickAccessState;
        }
        if ((i & 2) != 0) {
            displayStatus = lowerTopBarState.displayStatus;
        }
        return lowerTopBarState.copy(indicatorQuickAccessState, displayStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final IndicatorQuickAccessState getIndicatorQuickAccessState() {
        return this.indicatorQuickAccessState;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplayStatus getDisplayStatus() {
        return this.displayStatus;
    }

    public final LowerTopBarState copy(IndicatorQuickAccessState indicatorQuickAccessState, DisplayStatus displayStatus) {
        Intrinsics.checkNotNullParameter(displayStatus, "displayStatus");
        return new LowerTopBarState(indicatorQuickAccessState, displayStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LowerTopBarState)) {
            return false;
        }
        LowerTopBarState lowerTopBarState = (LowerTopBarState) other;
        return Intrinsics.areEqual(this.indicatorQuickAccessState, lowerTopBarState.indicatorQuickAccessState) && Intrinsics.areEqual(this.displayStatus, lowerTopBarState.displayStatus);
    }

    public int hashCode() {
        IndicatorQuickAccessState indicatorQuickAccessState = this.indicatorQuickAccessState;
        return ((indicatorQuickAccessState == null ? 0 : indicatorQuickAccessState.hashCode()) * 31) + this.displayStatus.hashCode();
    }

    public String toString() {
        return "LowerTopBarState(indicatorQuickAccessState=" + this.indicatorQuickAccessState + ", displayStatus=" + this.displayStatus + ")";
    }

    public LowerTopBarState(IndicatorQuickAccessState indicatorQuickAccessState, DisplayStatus displayStatus) {
        Intrinsics.checkNotNullParameter(displayStatus, "displayStatus");
        this.indicatorQuickAccessState = indicatorQuickAccessState;
        this.displayStatus = displayStatus;
    }

    public final IndicatorQuickAccessState getIndicatorQuickAccessState() {
        return this.indicatorQuickAccessState;
    }

    public final DisplayStatus getDisplayStatus() {
        return this.displayStatus;
    }

    /* compiled from: BlackWidowAdvancedChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "", "Gone", ChartActionsRow.INDICATORS, "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus$Gone;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus$Indicators;", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DisplayStatus {

        /* compiled from: BlackWidowAdvancedChartViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus$Gone;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Gone implements DisplayStatus {
            public static final int $stable = 0;
            public static final Gone INSTANCE = new Gone();

            public boolean equals(Object other) {
                return this == other || (other instanceof Gone);
            }

            public int hashCode() {
                return 1133929604;
            }

            public String toString() {
                return "Gone";
            }

            private Gone() {
            }
        }

        /* compiled from: BlackWidowAdvancedChartViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus$Indicators;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Indicators implements DisplayStatus {
            public static final int $stable = 0;
            public static final Indicators INSTANCE = new Indicators();

            public boolean equals(Object other) {
                return this == other || (other instanceof Indicators);
            }

            public int hashCode() {
                return -1198872471;
            }

            public String toString() {
                return ChartActionsRow.INDICATORS;
            }

            private Indicators() {
            }
        }
    }
}
