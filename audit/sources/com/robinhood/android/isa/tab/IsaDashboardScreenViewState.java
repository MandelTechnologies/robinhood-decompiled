package com.robinhood.android.isa.tab;

import kotlin.Metadata;

/* compiled from: IsaDashboardScreenDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaDashboardScreenViewState;", "", "showAddMoneyCta", "", "<init>", "(Z)V", "getShowAddMoneyCta", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaDashboardScreenViewState {
    public static final int $stable = 0;
    private final boolean showAddMoneyCta;

    public static /* synthetic */ IsaDashboardScreenViewState copy$default(IsaDashboardScreenViewState isaDashboardScreenViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = isaDashboardScreenViewState.showAddMoneyCta;
        }
        return isaDashboardScreenViewState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowAddMoneyCta() {
        return this.showAddMoneyCta;
    }

    public final IsaDashboardScreenViewState copy(boolean showAddMoneyCta) {
        return new IsaDashboardScreenViewState(showAddMoneyCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IsaDashboardScreenViewState) && this.showAddMoneyCta == ((IsaDashboardScreenViewState) other).showAddMoneyCta;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showAddMoneyCta);
    }

    public String toString() {
        return "IsaDashboardScreenViewState(showAddMoneyCta=" + this.showAddMoneyCta + ")";
    }

    public IsaDashboardScreenViewState(boolean z) {
        this.showAddMoneyCta = z;
    }

    public final boolean getShowAddMoneyCta() {
        return this.showAddMoneyCta;
    }
}
