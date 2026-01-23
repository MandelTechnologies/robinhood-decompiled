package com.robinhood.android.dashboard.lib;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.home.HomeState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardDataState;", "", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "account", "Lcom/robinhood/models/db/Account;", "homeState", "Lcom/robinhood/models/home/HomeState;", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "accessibleFeatures", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "isInEcRegionGate", "", "isEmbedded", "isDashboardFundingCtaEnabled", "<init>", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/home/HomeState;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/util/Set;ZZZ)V", "getDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getHomeState", "()Lcom/robinhood/models/home/HomeState;", "getPageDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getAccessibleFeatures", "()Ljava/util/Set;", "()Z", "mutateDashboardType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardDataState {
    public static final int $stable = 8;
    private final Set<AccountFeature> accessibleFeatures;
    private final Account account;
    private final HomeDashboardType dashboardType;
    private final HomeState homeState;
    private final boolean isDashboardFundingCtaEnabled;
    private final boolean isEmbedded;
    private final boolean isInEcRegionGate;
    private final Direction pageDirection;

    public DashboardDataState() {
        this(null, null, null, null, null, false, false, false, 255, null);
    }

    public static /* synthetic */ DashboardDataState copy$default(DashboardDataState dashboardDataState, HomeDashboardType homeDashboardType, Account account, HomeState homeState, Direction direction, Set set, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDashboardType = dashboardDataState.dashboardType;
        }
        if ((i & 2) != 0) {
            account = dashboardDataState.account;
        }
        if ((i & 4) != 0) {
            homeState = dashboardDataState.homeState;
        }
        if ((i & 8) != 0) {
            direction = dashboardDataState.pageDirection;
        }
        if ((i & 16) != 0) {
            set = dashboardDataState.accessibleFeatures;
        }
        if ((i & 32) != 0) {
            z = dashboardDataState.isInEcRegionGate;
        }
        if ((i & 64) != 0) {
            z2 = dashboardDataState.isEmbedded;
        }
        if ((i & 128) != 0) {
            z3 = dashboardDataState.isDashboardFundingCtaEnabled;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        Set set2 = set;
        boolean z6 = z;
        return dashboardDataState.copy(homeDashboardType, account, homeState, direction, set2, z6, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final HomeDashboardType getDashboardType() {
        return this.dashboardType;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final HomeState getHomeState() {
        return this.homeState;
    }

    /* renamed from: component4, reason: from getter */
    public final Direction getPageDirection() {
        return this.pageDirection;
    }

    public final Set<AccountFeature> component5() {
        return this.accessibleFeatures;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInEcRegionGate() {
        return this.isInEcRegionGate;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsDashboardFundingCtaEnabled() {
        return this.isDashboardFundingCtaEnabled;
    }

    public final DashboardDataState copy(HomeDashboardType dashboardType, Account account, HomeState homeState, Direction pageDirection, Set<? extends AccountFeature> accessibleFeatures, boolean isInEcRegionGate, boolean isEmbedded, boolean isDashboardFundingCtaEnabled) {
        return new DashboardDataState(dashboardType, account, homeState, pageDirection, accessibleFeatures, isInEcRegionGate, isEmbedded, isDashboardFundingCtaEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardDataState)) {
            return false;
        }
        DashboardDataState dashboardDataState = (DashboardDataState) other;
        return Intrinsics.areEqual(this.dashboardType, dashboardDataState.dashboardType) && Intrinsics.areEqual(this.account, dashboardDataState.account) && Intrinsics.areEqual(this.homeState, dashboardDataState.homeState) && this.pageDirection == dashboardDataState.pageDirection && Intrinsics.areEqual(this.accessibleFeatures, dashboardDataState.accessibleFeatures) && this.isInEcRegionGate == dashboardDataState.isInEcRegionGate && this.isEmbedded == dashboardDataState.isEmbedded && this.isDashboardFundingCtaEnabled == dashboardDataState.isDashboardFundingCtaEnabled;
    }

    public int hashCode() {
        HomeDashboardType homeDashboardType = this.dashboardType;
        int iHashCode = (homeDashboardType == null ? 0 : homeDashboardType.hashCode()) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        HomeState homeState = this.homeState;
        int iHashCode3 = (iHashCode2 + (homeState == null ? 0 : homeState.hashCode())) * 31;
        Direction direction = this.pageDirection;
        int iHashCode4 = (iHashCode3 + (direction == null ? 0 : direction.hashCode())) * 31;
        Set<AccountFeature> set = this.accessibleFeatures;
        return ((((((iHashCode4 + (set != null ? set.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInEcRegionGate)) * 31) + Boolean.hashCode(this.isEmbedded)) * 31) + Boolean.hashCode(this.isDashboardFundingCtaEnabled);
    }

    public String toString() {
        return "DashboardDataState(dashboardType=" + this.dashboardType + ", account=" + this.account + ", homeState=" + this.homeState + ", pageDirection=" + this.pageDirection + ", accessibleFeatures=" + this.accessibleFeatures + ", isInEcRegionGate=" + this.isInEcRegionGate + ", isEmbedded=" + this.isEmbedded + ", isDashboardFundingCtaEnabled=" + this.isDashboardFundingCtaEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardDataState(HomeDashboardType homeDashboardType, Account account, HomeState homeState, Direction direction, Set<? extends AccountFeature> set, boolean z, boolean z2, boolean z3) {
        this.dashboardType = homeDashboardType;
        this.account = account;
        this.homeState = homeState;
        this.pageDirection = direction;
        this.accessibleFeatures = set;
        this.isInEcRegionGate = z;
        this.isEmbedded = z2;
        this.isDashboardFundingCtaEnabled = z3;
    }

    public /* synthetic */ DashboardDataState(HomeDashboardType homeDashboardType, Account account, HomeState homeState, Direction direction, Set set, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : homeDashboardType, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : homeState, (i & 8) != 0 ? null : direction, (i & 16) != 0 ? null : set, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3);
    }

    public final HomeDashboardType getDashboardType() {
        return this.dashboardType;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final HomeState getHomeState() {
        return this.homeState;
    }

    public final Direction getPageDirection() {
        return this.pageDirection;
    }

    public final Set<AccountFeature> getAccessibleFeatures() {
        return this.accessibleFeatures;
    }

    public final boolean isInEcRegionGate() {
        return this.isInEcRegionGate;
    }

    public final boolean isEmbedded() {
        return this.isEmbedded;
    }

    public final boolean isDashboardFundingCtaEnabled() {
        return this.isDashboardFundingCtaEnabled;
    }

    public final DashboardDataState mutateDashboardType(HomeDashboardType dashboardType, boolean isEmbedded) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        return Intrinsics.areEqual(dashboardType, this.dashboardType) ? this : copy$default(this, dashboardType, null, null, null, null, false, isEmbedded, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null);
    }
}
