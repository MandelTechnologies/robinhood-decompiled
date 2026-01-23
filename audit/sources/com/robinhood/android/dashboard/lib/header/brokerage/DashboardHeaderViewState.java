package com.robinhood.android.dashboard.lib.header.brokerage;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.dashboard.lib.header.brokerage.pill.NuxPillVisibilityExperiment;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardHeaderViewState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010&\u001a\u00020'H\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jo\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00102\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "activeAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "activeDashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "title", "Lcom/robinhood/utils/resource/StringResource;", "showHeader", "", "badge", "Lcom/robinhood/models/home/HomeAccountSwitcher$AccountSwitcherBadgeInfo;", "tooltip", "Lcom/robinhood/models/home/HomeAccountSwitcher$AccountSwitcherTooltipInfo;", "accountsLoading", "showPillInNuxVariant", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/models/home/HomeAccountSwitcher$AccountSwitcherBadgeInfo;Lcom/robinhood/models/home/HomeAccountSwitcher$AccountSwitcherTooltipInfo;ZLcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;)V", "getActiveAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getActiveDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getShowHeader", "()Z", "getBadge", "()Lcom/robinhood/models/home/HomeAccountSwitcher$AccountSwitcherBadgeInfo;", "getTooltip", "()Lcom/robinhood/models/home/HomeAccountSwitcher$AccountSwitcherTooltipInfo;", "getAccountsLoading", "getShowPillInNuxVariant", "()Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardHeaderViewState implements LoggableViewState {
    public static final int $stable = 8;
    private final AccountSwitcherData accountSwitcherData;
    private final boolean accountsLoading;
    private final BrokerageAccountType activeAccountType;
    private final HomeDashboardType activeDashboardType;
    private final HomeAccountSwitcher.AccountSwitcherBadgeInfo badge;
    private final boolean showHeader;
    private final NuxPillVisibilityExperiment.Variant showPillInNuxVariant;
    private final StringResource title;
    private final HomeAccountSwitcher.AccountSwitcherTooltipInfo tooltip;

    public static /* synthetic */ DashboardHeaderViewState copy$default(DashboardHeaderViewState dashboardHeaderViewState, BrokerageAccountType brokerageAccountType, HomeDashboardType homeDashboardType, AccountSwitcherData accountSwitcherData, StringResource stringResource, boolean z, HomeAccountSwitcher.AccountSwitcherBadgeInfo accountSwitcherBadgeInfo, HomeAccountSwitcher.AccountSwitcherTooltipInfo accountSwitcherTooltipInfo, boolean z2, NuxPillVisibilityExperiment.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = dashboardHeaderViewState.activeAccountType;
        }
        if ((i & 2) != 0) {
            homeDashboardType = dashboardHeaderViewState.activeDashboardType;
        }
        if ((i & 4) != 0) {
            accountSwitcherData = dashboardHeaderViewState.accountSwitcherData;
        }
        if ((i & 8) != 0) {
            stringResource = dashboardHeaderViewState.title;
        }
        if ((i & 16) != 0) {
            z = dashboardHeaderViewState.showHeader;
        }
        if ((i & 32) != 0) {
            accountSwitcherBadgeInfo = dashboardHeaderViewState.badge;
        }
        if ((i & 64) != 0) {
            accountSwitcherTooltipInfo = dashboardHeaderViewState.tooltip;
        }
        if ((i & 128) != 0) {
            z2 = dashboardHeaderViewState.accountsLoading;
        }
        if ((i & 256) != 0) {
            variant = dashboardHeaderViewState.showPillInNuxVariant;
        }
        boolean z3 = z2;
        NuxPillVisibilityExperiment.Variant variant2 = variant;
        HomeAccountSwitcher.AccountSwitcherBadgeInfo accountSwitcherBadgeInfo2 = accountSwitcherBadgeInfo;
        HomeAccountSwitcher.AccountSwitcherTooltipInfo accountSwitcherTooltipInfo2 = accountSwitcherTooltipInfo;
        boolean z4 = z;
        AccountSwitcherData accountSwitcherData2 = accountSwitcherData;
        return dashboardHeaderViewState.copy(brokerageAccountType, homeDashboardType, accountSwitcherData2, stringResource, z4, accountSwitcherBadgeInfo2, accountSwitcherTooltipInfo2, z3, variant2);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getActiveAccountType() {
        return this.activeAccountType;
    }

    /* renamed from: component2, reason: from getter */
    public final HomeDashboardType getActiveDashboardType() {
        return this.activeDashboardType;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowHeader() {
        return this.showHeader;
    }

    /* renamed from: component6, reason: from getter */
    public final HomeAccountSwitcher.AccountSwitcherBadgeInfo getBadge() {
        return this.badge;
    }

    /* renamed from: component7, reason: from getter */
    public final HomeAccountSwitcher.AccountSwitcherTooltipInfo getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getAccountsLoading() {
        return this.accountsLoading;
    }

    /* renamed from: component9, reason: from getter */
    public final NuxPillVisibilityExperiment.Variant getShowPillInNuxVariant() {
        return this.showPillInNuxVariant;
    }

    public final DashboardHeaderViewState copy(BrokerageAccountType activeAccountType, HomeDashboardType activeDashboardType, AccountSwitcherData accountSwitcherData, StringResource title, boolean showHeader, HomeAccountSwitcher.AccountSwitcherBadgeInfo badge, HomeAccountSwitcher.AccountSwitcherTooltipInfo tooltip, boolean accountsLoading, NuxPillVisibilityExperiment.Variant showPillInNuxVariant) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DashboardHeaderViewState(activeAccountType, activeDashboardType, accountSwitcherData, title, showHeader, badge, tooltip, accountsLoading, showPillInNuxVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardHeaderViewState)) {
            return false;
        }
        DashboardHeaderViewState dashboardHeaderViewState = (DashboardHeaderViewState) other;
        return this.activeAccountType == dashboardHeaderViewState.activeAccountType && Intrinsics.areEqual(this.activeDashboardType, dashboardHeaderViewState.activeDashboardType) && Intrinsics.areEqual(this.accountSwitcherData, dashboardHeaderViewState.accountSwitcherData) && Intrinsics.areEqual(this.title, dashboardHeaderViewState.title) && this.showHeader == dashboardHeaderViewState.showHeader && Intrinsics.areEqual(this.badge, dashboardHeaderViewState.badge) && Intrinsics.areEqual(this.tooltip, dashboardHeaderViewState.tooltip) && this.accountsLoading == dashboardHeaderViewState.accountsLoading && this.showPillInNuxVariant == dashboardHeaderViewState.showPillInNuxVariant;
    }

    public int hashCode() {
        BrokerageAccountType brokerageAccountType = this.activeAccountType;
        int iHashCode = (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode()) * 31;
        HomeDashboardType homeDashboardType = this.activeDashboardType;
        int iHashCode2 = (iHashCode + (homeDashboardType == null ? 0 : homeDashboardType.hashCode())) * 31;
        AccountSwitcherData accountSwitcherData = this.accountSwitcherData;
        int iHashCode3 = (((((iHashCode2 + (accountSwitcherData == null ? 0 : accountSwitcherData.hashCode())) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.showHeader)) * 31;
        HomeAccountSwitcher.AccountSwitcherBadgeInfo accountSwitcherBadgeInfo = this.badge;
        int iHashCode4 = (iHashCode3 + (accountSwitcherBadgeInfo == null ? 0 : accountSwitcherBadgeInfo.hashCode())) * 31;
        HomeAccountSwitcher.AccountSwitcherTooltipInfo accountSwitcherTooltipInfo = this.tooltip;
        int iHashCode5 = (((iHashCode4 + (accountSwitcherTooltipInfo == null ? 0 : accountSwitcherTooltipInfo.hashCode())) * 31) + Boolean.hashCode(this.accountsLoading)) * 31;
        NuxPillVisibilityExperiment.Variant variant = this.showPillInNuxVariant;
        return iHashCode5 + (variant != null ? variant.hashCode() : 0);
    }

    public String toString() {
        return "DashboardHeaderViewState(activeAccountType=" + this.activeAccountType + ", activeDashboardType=" + this.activeDashboardType + ", accountSwitcherData=" + this.accountSwitcherData + ", title=" + this.title + ", showHeader=" + this.showHeader + ", badge=" + this.badge + ", tooltip=" + this.tooltip + ", accountsLoading=" + this.accountsLoading + ", showPillInNuxVariant=" + this.showPillInNuxVariant + ")";
    }

    public DashboardHeaderViewState(BrokerageAccountType brokerageAccountType, HomeDashboardType homeDashboardType, AccountSwitcherData accountSwitcherData, StringResource title, boolean z, HomeAccountSwitcher.AccountSwitcherBadgeInfo accountSwitcherBadgeInfo, HomeAccountSwitcher.AccountSwitcherTooltipInfo accountSwitcherTooltipInfo, boolean z2, NuxPillVisibilityExperiment.Variant variant) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.activeAccountType = brokerageAccountType;
        this.activeDashboardType = homeDashboardType;
        this.accountSwitcherData = accountSwitcherData;
        this.title = title;
        this.showHeader = z;
        this.badge = accountSwitcherBadgeInfo;
        this.tooltip = accountSwitcherTooltipInfo;
        this.accountsLoading = z2;
        this.showPillInNuxVariant = variant;
    }

    public final BrokerageAccountType getActiveAccountType() {
        return this.activeAccountType;
    }

    public final HomeDashboardType getActiveDashboardType() {
        return this.activeDashboardType;
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final boolean getShowHeader() {
        return this.showHeader;
    }

    public final HomeAccountSwitcher.AccountSwitcherBadgeInfo getBadge() {
        return this.badge;
    }

    public final HomeAccountSwitcher.AccountSwitcherTooltipInfo getTooltip() {
        return this.tooltip;
    }

    public final boolean getAccountsLoading() {
        return this.accountsLoading;
    }

    public final NuxPillVisibilityExperiment.Variant getShowPillInNuxVariant() {
        return this.showPillInNuxVariant;
    }

    @Override // com.robinhood.android.autoeventlogging.LoggableViewState
    public LoggableViewState2 loadedState() {
        return new LoggableViewState2.Completed("DASHBOARD_BROKERAGE_ACCOUNT_HEADER", null, 2, null);
    }
}
