package com.robinhood.android.dashboard;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.home.contracts.HomeDashboardType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeDashboardViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/dashboard/HomeDashboardViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "<init>", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;)V", "getDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HomeDashboardViewState implements LoggableViewState {
    public static final int $stable = 8;
    private final HomeDashboardType dashboardType;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeDashboardViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HomeDashboardViewState copy$default(HomeDashboardViewState homeDashboardViewState, HomeDashboardType homeDashboardType, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDashboardType = homeDashboardViewState.dashboardType;
        }
        return homeDashboardViewState.copy(homeDashboardType);
    }

    /* renamed from: component1, reason: from getter */
    public final HomeDashboardType getDashboardType() {
        return this.dashboardType;
    }

    public final HomeDashboardViewState copy(HomeDashboardType dashboardType) {
        return new HomeDashboardViewState(dashboardType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HomeDashboardViewState) && Intrinsics.areEqual(this.dashboardType, ((HomeDashboardViewState) other).dashboardType);
    }

    public int hashCode() {
        HomeDashboardType homeDashboardType = this.dashboardType;
        if (homeDashboardType == null) {
            return 0;
        }
        return homeDashboardType.hashCode();
    }

    public String toString() {
        return "HomeDashboardViewState(dashboardType=" + this.dashboardType + ")";
    }

    public HomeDashboardViewState(HomeDashboardType homeDashboardType) {
        this.dashboardType = homeDashboardType;
    }

    public /* synthetic */ HomeDashboardViewState(HomeDashboardType homeDashboardType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : homeDashboardType);
    }

    public final HomeDashboardType getDashboardType() {
        return this.dashboardType;
    }

    @Override // com.robinhood.android.autoeventlogging.LoggableViewState
    public LoggableViewState2 loadedState() {
        if (this.dashboardType == null) {
            return new LoggableViewState2.Loading(null, 1, null);
        }
        return new LoggableViewState2.Completed(null, null, 3, null);
    }
}
