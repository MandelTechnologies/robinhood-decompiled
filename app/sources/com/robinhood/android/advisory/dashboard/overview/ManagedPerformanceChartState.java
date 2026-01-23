package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManagedDashboardOverviewChartState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedPerformanceChartState;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewChartState;", "model", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "returnsBreakdown", "Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;", "activeSpan", "", "<init>", "(Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;Ljava/lang/String;)V", "getModel", "()Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getReturnsBreakdown", "()Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;", "getActiveSpan", "()Ljava/lang/String;", "type", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "getType", "()Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ManagedPerformanceChartState implements ManagedDashboardOverviewChartState {
    public static final int $stable = 8;
    private final String activeSpan;
    private final PerformanceChartModel model;
    private final ReturnsBreakdown returnsBreakdown;

    public static /* synthetic */ ManagedPerformanceChartState copy$default(ManagedPerformanceChartState managedPerformanceChartState, PerformanceChartModel performanceChartModel, ReturnsBreakdown returnsBreakdown, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            performanceChartModel = managedPerformanceChartState.model;
        }
        if ((i & 2) != 0) {
            returnsBreakdown = managedPerformanceChartState.returnsBreakdown;
        }
        if ((i & 4) != 0) {
            str = managedPerformanceChartState.activeSpan;
        }
        return managedPerformanceChartState.copy(performanceChartModel, returnsBreakdown, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PerformanceChartModel getModel() {
        return this.model;
    }

    /* renamed from: component2, reason: from getter */
    public final ReturnsBreakdown getReturnsBreakdown() {
        return this.returnsBreakdown;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveSpan() {
        return this.activeSpan;
    }

    public final ManagedPerformanceChartState copy(PerformanceChartModel model, ReturnsBreakdown returnsBreakdown, String activeSpan) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(activeSpan, "activeSpan");
        return new ManagedPerformanceChartState(model, returnsBreakdown, activeSpan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagedPerformanceChartState)) {
            return false;
        }
        ManagedPerformanceChartState managedPerformanceChartState = (ManagedPerformanceChartState) other;
        return Intrinsics.areEqual(this.model, managedPerformanceChartState.model) && Intrinsics.areEqual(this.returnsBreakdown, managedPerformanceChartState.returnsBreakdown) && Intrinsics.areEqual(this.activeSpan, managedPerformanceChartState.activeSpan);
    }

    public int hashCode() {
        int iHashCode = this.model.hashCode() * 31;
        ReturnsBreakdown returnsBreakdown = this.returnsBreakdown;
        return ((iHashCode + (returnsBreakdown == null ? 0 : returnsBreakdown.hashCode())) * 31) + this.activeSpan.hashCode();
    }

    public String toString() {
        return "ManagedPerformanceChartState(model=" + this.model + ", returnsBreakdown=" + this.returnsBreakdown + ", activeSpan=" + this.activeSpan + ")";
    }

    public ManagedPerformanceChartState(PerformanceChartModel model, ReturnsBreakdown returnsBreakdown, String activeSpan) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(activeSpan, "activeSpan");
        this.model = model;
        this.returnsBreakdown = returnsBreakdown;
        this.activeSpan = activeSpan;
    }

    @Override // com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState
    public boolean getShowUnreadIndicator() {
        return ManagedDashboardOverviewChartState.DefaultImpls.getShowUnreadIndicator(this);
    }

    public final PerformanceChartModel getModel() {
        return this.model;
    }

    public final ReturnsBreakdown getReturnsBreakdown() {
        return this.returnsBreakdown;
    }

    public final String getActiveSpan() {
        return this.activeSpan;
    }

    @Override // com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState
    public AdvisoryChartSwitcher getType() {
        return AdvisoryChartSwitcher.PERFORMANCE;
    }
}
