package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ManagedDashboardOverview.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewKt$ManagedDashboardOverview$1$5$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ManagedDashboardOverview6 extends FunctionReferenceImpl implements Function1<ManagedReturnsChartState.ReturnsBar, Unit> {
    ManagedDashboardOverview6(Object obj) {
        super(1, obj, ManagedDashboardOverviewDuxo.class, "onReturnsChartBarSelected", "onReturnsChartBarSelected(Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ManagedReturnsChartState.ReturnsBar returnsBar) {
        invoke2(returnsBar);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ManagedReturnsChartState.ReturnsBar returnsBar) {
        ((ManagedDashboardOverviewDuxo) this.receiver).onReturnsChartBarSelected(returnsBar);
    }
}
