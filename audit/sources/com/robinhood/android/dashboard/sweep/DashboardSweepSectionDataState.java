package com.robinhood.android.dashboard.sweep;

import com.robinhood.android.dashboard.sweep.DashboardSweepSectionViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardSweepSectionDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDataState;", "", "sweepSplash", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash;)V", "getSweepSplash", "()Lcom/robinhood/models/api/bonfire/ApiSweepSplash;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardSweepSectionDataState {
    private final ApiSweepSplash sweepSplash;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardSweepSectionDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DashboardSweepSectionDataState copy$default(DashboardSweepSectionDataState dashboardSweepSectionDataState, ApiSweepSplash apiSweepSplash, int i, Object obj) {
        if ((i & 1) != 0) {
            apiSweepSplash = dashboardSweepSectionDataState.sweepSplash;
        }
        return dashboardSweepSectionDataState.copy(apiSweepSplash);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiSweepSplash getSweepSplash() {
        return this.sweepSplash;
    }

    public final DashboardSweepSectionDataState copy(ApiSweepSplash sweepSplash) {
        return new DashboardSweepSectionDataState(sweepSplash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DashboardSweepSectionDataState) && Intrinsics.areEqual(this.sweepSplash, ((DashboardSweepSectionDataState) other).sweepSplash);
    }

    public int hashCode() {
        ApiSweepSplash apiSweepSplash = this.sweepSplash;
        if (apiSweepSplash == null) {
            return 0;
        }
        return apiSweepSplash.hashCode();
    }

    public String toString() {
        return "DashboardSweepSectionDataState(sweepSplash=" + this.sweepSplash + ")";
    }

    public DashboardSweepSectionDataState(ApiSweepSplash apiSweepSplash) {
        this.sweepSplash = apiSweepSplash;
    }

    public /* synthetic */ DashboardSweepSectionDataState(ApiSweepSplash apiSweepSplash, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiSweepSplash);
    }

    public final ApiSweepSplash getSweepSplash() {
        return this.sweepSplash;
    }

    /* compiled from: DashboardSweepSectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDataState;", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "<init>", "()V", "reduce", "dataState", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<DashboardSweepSectionDataState, DashboardSweepSectionViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public DashboardSweepSectionViewState reduce(DashboardSweepSectionDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ApiSweepSplash sweepSplash = dataState.getSweepSplash();
            ApiSweepSplash.SweepSectionV2 sweep_section_v2 = sweepSplash != null ? sweepSplash.getSweep_section_v2() : null;
            ApiSweepSplash.SweepSection sweep_section = sweepSplash != null ? sweepSplash.getSweep_section() : null;
            if (sweepSplash == null) {
                return DashboardSweepSectionViewState.Loading.INSTANCE;
            }
            if (sweep_section_v2 != null) {
                return new DashboardSweepSectionViewState.V2(sweep_section_v2);
            }
            if (sweep_section != null) {
                return new DashboardSweepSectionViewState.V1(sweep_section);
            }
            return DashboardSweepSectionViewState.Empty.INSTANCE;
        }
    }
}
