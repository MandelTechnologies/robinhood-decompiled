package com.robinhood.android.dashboard.lib.chart;

import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardChartViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/chart/DashboardChartViewState;", "", "showFxTooltip", "", "sortingHatQuery", "Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "<init>", "(ZLcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;)V", "getShowFxTooltip", "()Z", "getSortingHatQuery", "()Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardChartViewState {
    public static final int $stable = 8;
    private final boolean showFxTooltip;
    private final SortingHatQueryArgs sortingHatQuery;

    public static /* synthetic */ DashboardChartViewState copy$default(DashboardChartViewState dashboardChartViewState, boolean z, SortingHatQueryArgs sortingHatQueryArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dashboardChartViewState.showFxTooltip;
        }
        if ((i & 2) != 0) {
            sortingHatQueryArgs = dashboardChartViewState.sortingHatQuery;
        }
        return dashboardChartViewState.copy(z, sortingHatQueryArgs);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowFxTooltip() {
        return this.showFxTooltip;
    }

    /* renamed from: component2, reason: from getter */
    public final SortingHatQueryArgs getSortingHatQuery() {
        return this.sortingHatQuery;
    }

    public final DashboardChartViewState copy(boolean showFxTooltip, SortingHatQueryArgs sortingHatQuery) {
        return new DashboardChartViewState(showFxTooltip, sortingHatQuery);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardChartViewState)) {
            return false;
        }
        DashboardChartViewState dashboardChartViewState = (DashboardChartViewState) other;
        return this.showFxTooltip == dashboardChartViewState.showFxTooltip && Intrinsics.areEqual(this.sortingHatQuery, dashboardChartViewState.sortingHatQuery);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showFxTooltip) * 31;
        SortingHatQueryArgs sortingHatQueryArgs = this.sortingHatQuery;
        return iHashCode + (sortingHatQueryArgs == null ? 0 : sortingHatQueryArgs.hashCode());
    }

    public String toString() {
        return "DashboardChartViewState(showFxTooltip=" + this.showFxTooltip + ", sortingHatQuery=" + this.sortingHatQuery + ")";
    }

    public DashboardChartViewState(boolean z, SortingHatQueryArgs sortingHatQueryArgs) {
        this.showFxTooltip = z;
        this.sortingHatQuery = sortingHatQueryArgs;
    }

    public final boolean getShowFxTooltip() {
        return this.showFxTooltip;
    }

    public final SortingHatQueryArgs getSortingHatQuery() {
        return this.sortingHatQuery;
    }
}
