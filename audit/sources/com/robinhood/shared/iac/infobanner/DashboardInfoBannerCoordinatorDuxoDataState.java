package com.robinhood.shared.iac.infobanner;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DashboardInfoBannerCoordinatorDuxoViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoDataState;", "", "bannersByLocation", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "Lcom/robinhood/models/db/IacInfoBanner;", "<init>", "(Lkotlinx/collections/immutable/ImmutableMap;)V", "getBannersByLocation", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DashboardInfoBannerCoordinatorDuxoDataState {
    private final ImmutableMap<IacInfoBannerLocation, IacInfoBanner> bannersByLocation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardInfoBannerCoordinatorDuxoDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardInfoBannerCoordinatorDuxoDataState copy$default(DashboardInfoBannerCoordinatorDuxoDataState dashboardInfoBannerCoordinatorDuxoDataState, ImmutableMap immutableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableMap = dashboardInfoBannerCoordinatorDuxoDataState.bannersByLocation;
        }
        return dashboardInfoBannerCoordinatorDuxoDataState.copy(immutableMap);
    }

    public final ImmutableMap<IacInfoBannerLocation, IacInfoBanner> component1() {
        return this.bannersByLocation;
    }

    public final DashboardInfoBannerCoordinatorDuxoDataState copy(ImmutableMap<IacInfoBannerLocation, IacInfoBanner> bannersByLocation) {
        Intrinsics.checkNotNullParameter(bannersByLocation, "bannersByLocation");
        return new DashboardInfoBannerCoordinatorDuxoDataState(bannersByLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DashboardInfoBannerCoordinatorDuxoDataState) && Intrinsics.areEqual(this.bannersByLocation, ((DashboardInfoBannerCoordinatorDuxoDataState) other).bannersByLocation);
    }

    public int hashCode() {
        return this.bannersByLocation.hashCode();
    }

    public String toString() {
        return "DashboardInfoBannerCoordinatorDuxoDataState(bannersByLocation=" + this.bannersByLocation + ")";
    }

    public DashboardInfoBannerCoordinatorDuxoDataState(ImmutableMap<IacInfoBannerLocation, IacInfoBanner> bannersByLocation) {
        Intrinsics.checkNotNullParameter(bannersByLocation, "bannersByLocation");
        this.bannersByLocation = bannersByLocation;
    }

    public final ImmutableMap<IacInfoBannerLocation, IacInfoBanner> getBannersByLocation() {
        return this.bannersByLocation;
    }

    public /* synthetic */ DashboardInfoBannerCoordinatorDuxoDataState(ImmutableMap immutableMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.toImmutableMap(MapsKt.emptyMap()) : immutableMap);
    }

    /* compiled from: DashboardInfoBannerCoordinatorDuxoViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoDataState;", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoViewState;", "<init>", "()V", "reduce", "dataState", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<DashboardInfoBannerCoordinatorDuxoDataState, DashboardInfoBannerCoordinatorDuxoViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public DashboardInfoBannerCoordinatorDuxoViewState reduce(DashboardInfoBannerCoordinatorDuxoDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            return new DashboardInfoBannerCoordinatorDuxoViewState(dataState.getBannersByLocation());
        }
    }
}
