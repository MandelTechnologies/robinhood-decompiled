package com.robinhood.android.dashboard.lib.appbar;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardAppBarViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "", "shouldShowInboxBadge", "", "inboxBadgeIsCritical", "homeDashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "searchSource", "Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;", "showSearch", "navigationIcon", "Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;ZZLcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;ZLcom/robinhood/android/dashboard/lib/appbar/NavigationIcon;)V", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "()Ljava/lang/String;", "getShouldShowInboxBadge", "()Z", "getInboxBadgeIsCritical", "getHomeDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getSearchSource", "()Lcom/robinhood/android/search/contracts/SearchFragmentKey$Source;", "getShowSearch", "getNavigationIcon", "()Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon;", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardAppBarViewState implements LoggableViewState {
    public static final int $stable = 8;
    private final HomeDashboardType homeDashboardType;
    private final boolean inboxBadgeIsCritical;
    private final NavigationIcon navigationIcon;
    private final StringResource primaryText;
    private final SearchFragmentKey.Source searchSource;
    private final String secondaryText;
    private final boolean shouldShowInboxBadge;
    private final boolean showSearch;

    public static /* synthetic */ DashboardAppBarViewState copy$default(DashboardAppBarViewState dashboardAppBarViewState, StringResource stringResource, String str, boolean z, boolean z2, HomeDashboardType homeDashboardType, SearchFragmentKey.Source source, boolean z3, NavigationIcon navigationIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = dashboardAppBarViewState.primaryText;
        }
        if ((i & 2) != 0) {
            str = dashboardAppBarViewState.secondaryText;
        }
        if ((i & 4) != 0) {
            z = dashboardAppBarViewState.shouldShowInboxBadge;
        }
        if ((i & 8) != 0) {
            z2 = dashboardAppBarViewState.inboxBadgeIsCritical;
        }
        if ((i & 16) != 0) {
            homeDashboardType = dashboardAppBarViewState.homeDashboardType;
        }
        if ((i & 32) != 0) {
            source = dashboardAppBarViewState.searchSource;
        }
        if ((i & 64) != 0) {
            z3 = dashboardAppBarViewState.showSearch;
        }
        if ((i & 128) != 0) {
            navigationIcon = dashboardAppBarViewState.navigationIcon;
        }
        boolean z4 = z3;
        NavigationIcon navigationIcon2 = navigationIcon;
        HomeDashboardType homeDashboardType2 = homeDashboardType;
        SearchFragmentKey.Source source2 = source;
        return dashboardAppBarViewState.copy(stringResource, str, z, z2, homeDashboardType2, source2, z4, navigationIcon2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInboxBadgeIsCritical() {
        return this.inboxBadgeIsCritical;
    }

    /* renamed from: component5, reason: from getter */
    public final HomeDashboardType getHomeDashboardType() {
        return this.homeDashboardType;
    }

    /* renamed from: component6, reason: from getter */
    public final SearchFragmentKey.Source getSearchSource() {
        return this.searchSource;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowSearch() {
        return this.showSearch;
    }

    /* renamed from: component8, reason: from getter */
    public final NavigationIcon getNavigationIcon() {
        return this.navigationIcon;
    }

    public final DashboardAppBarViewState copy(StringResource primaryText, String secondaryText, boolean shouldShowInboxBadge, boolean inboxBadgeIsCritical, HomeDashboardType homeDashboardType, SearchFragmentKey.Source searchSource, boolean showSearch, NavigationIcon navigationIcon) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        return new DashboardAppBarViewState(primaryText, secondaryText, shouldShowInboxBadge, inboxBadgeIsCritical, homeDashboardType, searchSource, showSearch, navigationIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardAppBarViewState)) {
            return false;
        }
        DashboardAppBarViewState dashboardAppBarViewState = (DashboardAppBarViewState) other;
        return Intrinsics.areEqual(this.primaryText, dashboardAppBarViewState.primaryText) && Intrinsics.areEqual(this.secondaryText, dashboardAppBarViewState.secondaryText) && this.shouldShowInboxBadge == dashboardAppBarViewState.shouldShowInboxBadge && this.inboxBadgeIsCritical == dashboardAppBarViewState.inboxBadgeIsCritical && Intrinsics.areEqual(this.homeDashboardType, dashboardAppBarViewState.homeDashboardType) && this.searchSource == dashboardAppBarViewState.searchSource && this.showSearch == dashboardAppBarViewState.showSearch && Intrinsics.areEqual(this.navigationIcon, dashboardAppBarViewState.navigationIcon);
    }

    public int hashCode() {
        int iHashCode = this.primaryText.hashCode() * 31;
        String str = this.secondaryText;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldShowInboxBadge)) * 31) + Boolean.hashCode(this.inboxBadgeIsCritical)) * 31;
        HomeDashboardType homeDashboardType = this.homeDashboardType;
        int iHashCode3 = (((((iHashCode2 + (homeDashboardType == null ? 0 : homeDashboardType.hashCode())) * 31) + this.searchSource.hashCode()) * 31) + Boolean.hashCode(this.showSearch)) * 31;
        NavigationIcon navigationIcon = this.navigationIcon;
        return iHashCode3 + (navigationIcon != null ? navigationIcon.hashCode() : 0);
    }

    public String toString() {
        return "DashboardAppBarViewState(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", shouldShowInboxBadge=" + this.shouldShowInboxBadge + ", inboxBadgeIsCritical=" + this.inboxBadgeIsCritical + ", homeDashboardType=" + this.homeDashboardType + ", searchSource=" + this.searchSource + ", showSearch=" + this.showSearch + ", navigationIcon=" + this.navigationIcon + ")";
    }

    public DashboardAppBarViewState(StringResource primaryText, String str, boolean z, boolean z2, HomeDashboardType homeDashboardType, SearchFragmentKey.Source searchSource, boolean z3, NavigationIcon navigationIcon) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        this.primaryText = primaryText;
        this.secondaryText = str;
        this.shouldShowInboxBadge = z;
        this.inboxBadgeIsCritical = z2;
        this.homeDashboardType = homeDashboardType;
        this.searchSource = searchSource;
        this.showSearch = z3;
        this.navigationIcon = navigationIcon;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    public final boolean getInboxBadgeIsCritical() {
        return this.inboxBadgeIsCritical;
    }

    public final HomeDashboardType getHomeDashboardType() {
        return this.homeDashboardType;
    }

    public final SearchFragmentKey.Source getSearchSource() {
        return this.searchSource;
    }

    public final boolean getShowSearch() {
        return this.showSearch;
    }

    public final NavigationIcon getNavigationIcon() {
        return this.navigationIcon;
    }

    @Override // com.robinhood.android.autoeventlogging.LoggableViewState
    public LoggableViewState2 loadedState() {
        HomeDashboardType homeDashboardType = this.homeDashboardType;
        if (homeDashboardType != null && (!(homeDashboardType instanceof HomeDashboardType.Account) || this.secondaryText != null)) {
            return new LoggableViewState2.Completed("DASHBOARD_APP_BAR_DUXO", null, 2, null);
        }
        return new LoggableViewState2.Loading("DASHBOARD_APP_BAR_DUXO");
    }
}
