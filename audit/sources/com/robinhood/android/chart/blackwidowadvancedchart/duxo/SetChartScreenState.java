package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartScreenState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvanceChartEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/SetChartScreenState;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "screenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "advanceScreenState", "", "<init>", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;Z)V", "getScreenState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "getAdvanceScreenState", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SetChartScreenState implements AdvanceChartEvent {
    public static final int $stable = 8;
    private final boolean advanceScreenState;
    private final ChartScreenState screenState;

    public static /* synthetic */ SetChartScreenState copy$default(SetChartScreenState setChartScreenState, ChartScreenState chartScreenState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            chartScreenState = setChartScreenState.screenState;
        }
        if ((i & 2) != 0) {
            z = setChartScreenState.advanceScreenState;
        }
        return setChartScreenState.copy(chartScreenState, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ChartScreenState getScreenState() {
        return this.screenState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAdvanceScreenState() {
        return this.advanceScreenState;
    }

    public final SetChartScreenState copy(ChartScreenState screenState, boolean advanceScreenState) {
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        return new SetChartScreenState(screenState, advanceScreenState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetChartScreenState)) {
            return false;
        }
        SetChartScreenState setChartScreenState = (SetChartScreenState) other;
        return Intrinsics.areEqual(this.screenState, setChartScreenState.screenState) && this.advanceScreenState == setChartScreenState.advanceScreenState;
    }

    public int hashCode() {
        return (this.screenState.hashCode() * 31) + Boolean.hashCode(this.advanceScreenState);
    }

    public String toString() {
        return "SetChartScreenState(screenState=" + this.screenState + ", advanceScreenState=" + this.advanceScreenState + ")";
    }

    public SetChartScreenState(ChartScreenState screenState, boolean z) {
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        this.screenState = screenState;
        this.advanceScreenState = z;
    }

    public /* synthetic */ SetChartScreenState(ChartScreenState chartScreenState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chartScreenState, (i & 2) != 0 ? false : z);
    }

    public final ChartScreenState getScreenState() {
        return this.screenState;
    }

    public final boolean getAdvanceScreenState() {
        return this.advanceScreenState;
    }
}
