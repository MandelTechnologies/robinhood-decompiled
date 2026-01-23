package com.robinhood.shared.iac.infobanner;

import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: DashboardInfoBannerCoordinatorDuxoViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoViewState;", "", "bannersByLocation", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "Lcom/robinhood/models/db/IacInfoBanner;", "<init>", "(Lkotlinx/collections/immutable/ImmutableMap;)V", "getBannersByLocation", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DashboardInfoBannerCoordinatorDuxoViewState {
    public static final int $stable = 8;
    private final ImmutableMap<IacInfoBannerLocation, IacInfoBanner> bannersByLocation;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardInfoBannerCoordinatorDuxoViewState copy$default(DashboardInfoBannerCoordinatorDuxoViewState dashboardInfoBannerCoordinatorDuxoViewState, ImmutableMap immutableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableMap = dashboardInfoBannerCoordinatorDuxoViewState.bannersByLocation;
        }
        return dashboardInfoBannerCoordinatorDuxoViewState.copy(immutableMap);
    }

    public final ImmutableMap<IacInfoBannerLocation, IacInfoBanner> component1() {
        return this.bannersByLocation;
    }

    public final DashboardInfoBannerCoordinatorDuxoViewState copy(ImmutableMap<IacInfoBannerLocation, IacInfoBanner> bannersByLocation) {
        Intrinsics.checkNotNullParameter(bannersByLocation, "bannersByLocation");
        return new DashboardInfoBannerCoordinatorDuxoViewState(bannersByLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DashboardInfoBannerCoordinatorDuxoViewState) && Intrinsics.areEqual(this.bannersByLocation, ((DashboardInfoBannerCoordinatorDuxoViewState) other).bannersByLocation);
    }

    public int hashCode() {
        return this.bannersByLocation.hashCode();
    }

    public String toString() {
        return "DashboardInfoBannerCoordinatorDuxoViewState(bannersByLocation=" + this.bannersByLocation + ")";
    }

    public DashboardInfoBannerCoordinatorDuxoViewState(ImmutableMap<IacInfoBannerLocation, IacInfoBanner> bannersByLocation) {
        Intrinsics.checkNotNullParameter(bannersByLocation, "bannersByLocation");
        this.bannersByLocation = bannersByLocation;
    }

    public final ImmutableMap<IacInfoBannerLocation, IacInfoBanner> getBannersByLocation() {
        return this.bannersByLocation;
    }
}
