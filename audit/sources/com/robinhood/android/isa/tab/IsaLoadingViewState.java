package com.robinhood.android.isa.tab;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaNavHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaLoadingViewState;", "", "dashboardState", "Lcom/robinhood/android/isa/tab/IsaDashboardState;", "<init>", "(Lcom/robinhood/android/isa/tab/IsaDashboardState;)V", "getDashboardState", "()Lcom/robinhood/android/isa/tab/IsaDashboardState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaLoadingViewState {
    public static final int $stable = 8;
    private final IsaNavHostDuxo2 dashboardState;

    public static /* synthetic */ IsaLoadingViewState copy$default(IsaLoadingViewState isaLoadingViewState, IsaNavHostDuxo2 isaNavHostDuxo2, int i, Object obj) {
        if ((i & 1) != 0) {
            isaNavHostDuxo2 = isaLoadingViewState.dashboardState;
        }
        return isaLoadingViewState.copy(isaNavHostDuxo2);
    }

    /* renamed from: component1, reason: from getter */
    public final IsaNavHostDuxo2 getDashboardState() {
        return this.dashboardState;
    }

    public final IsaLoadingViewState copy(IsaNavHostDuxo2 dashboardState) {
        Intrinsics.checkNotNullParameter(dashboardState, "dashboardState");
        return new IsaLoadingViewState(dashboardState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IsaLoadingViewState) && Intrinsics.areEqual(this.dashboardState, ((IsaLoadingViewState) other).dashboardState);
    }

    public int hashCode() {
        return this.dashboardState.hashCode();
    }

    public String toString() {
        return "IsaLoadingViewState(dashboardState=" + this.dashboardState + ")";
    }

    public IsaLoadingViewState(IsaNavHostDuxo2 dashboardState) {
        Intrinsics.checkNotNullParameter(dashboardState, "dashboardState");
        this.dashboardState = dashboardState;
    }

    public final IsaNavHostDuxo2 getDashboardState() {
        return this.dashboardState;
    }
}
