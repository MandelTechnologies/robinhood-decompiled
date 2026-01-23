package com.robinhood.android.advisory.dashboard.overview;

import kotlin.Metadata;

/* compiled from: ManagedDashboardOverviewChartState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewChartState;", "", "type", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "getType", "()Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "showUnreadIndicator", "", "getShowUnreadIndicator", "()Z", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedPerformanceChartState;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState;", "Lcom/robinhood/android/advisory/dashboard/overview/PortfolioBreakdownState;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ManagedDashboardOverviewChartState {

    /* compiled from: ManagedDashboardOverviewChartState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getShowUnreadIndicator(ManagedDashboardOverviewChartState managedDashboardOverviewChartState) {
            return false;
        }
    }

    boolean getShowUnreadIndicator();

    AdvisoryChartSwitcher getType();
}
