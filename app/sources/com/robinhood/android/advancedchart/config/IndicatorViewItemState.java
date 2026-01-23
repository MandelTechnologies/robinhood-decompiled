package com.robinhood.android.advancedchart.config;

import com.robinhood.android.advanced.chart.IndicatorState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartIndicatorListViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/IndicatorViewItemState;", "", "indicatorState", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "showToggle", "", "<init>", "(Lcom/robinhood/android/advanced/chart/IndicatorState;Z)V", "getIndicatorState", "()Lcom/robinhood/android/advanced/chart/IndicatorState;", "getShowToggle", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class IndicatorViewItemState {
    public static final int $stable = 8;
    private final IndicatorState indicatorState;
    private final boolean showToggle;

    public static /* synthetic */ IndicatorViewItemState copy$default(IndicatorViewItemState indicatorViewItemState, IndicatorState indicatorState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            indicatorState = indicatorViewItemState.indicatorState;
        }
        if ((i & 2) != 0) {
            z = indicatorViewItemState.showToggle;
        }
        return indicatorViewItemState.copy(indicatorState, z);
    }

    /* renamed from: component1, reason: from getter */
    public final IndicatorState getIndicatorState() {
        return this.indicatorState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowToggle() {
        return this.showToggle;
    }

    public final IndicatorViewItemState copy(IndicatorState indicatorState, boolean showToggle) {
        Intrinsics.checkNotNullParameter(indicatorState, "indicatorState");
        return new IndicatorViewItemState(indicatorState, showToggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorViewItemState)) {
            return false;
        }
        IndicatorViewItemState indicatorViewItemState = (IndicatorViewItemState) other;
        return Intrinsics.areEqual(this.indicatorState, indicatorViewItemState.indicatorState) && this.showToggle == indicatorViewItemState.showToggle;
    }

    public int hashCode() {
        return (this.indicatorState.hashCode() * 31) + Boolean.hashCode(this.showToggle);
    }

    public String toString() {
        return "IndicatorViewItemState(indicatorState=" + this.indicatorState + ", showToggle=" + this.showToggle + ")";
    }

    public IndicatorViewItemState(IndicatorState indicatorState, boolean z) {
        Intrinsics.checkNotNullParameter(indicatorState, "indicatorState");
        this.indicatorState = indicatorState;
        this.showToggle = z;
    }

    public final IndicatorState getIndicatorState() {
        return this.indicatorState;
    }

    public final boolean getShowToggle() {
        return this.showToggle;
    }
}
