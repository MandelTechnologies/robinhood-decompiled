package com.robinhood.android.accountcenter.views;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.accountcenter.views.ProfileAccountBreakdownStatus;
import com.robinhood.android.accountcenter.views.ProfilePageStatus;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p355ui.ProfileAccountBreakdown;
import com.robinhood.udf.UiEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0006HÂ\u0003J\t\u0010]\u001a\u00020\bHÂ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\nHÂ\u0003J\t\u0010_\u001a\u00020\fHÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010a\u001a\u00020\fHÆ\u0003J_\u0010b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\u0013\u0010c\u001a\u00020\f2\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020fHÖ\u0001J\t\u0010g\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0011\u0010\"\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0016R\u0011\u0010$\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0011\u0010&\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010(\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010*\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0011\u0010,\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0016R\u0011\u0010.\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010<\u001a\u0004\u0018\u00010=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010H\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0011\u0010N\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0016R\u0011\u0010P\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0016R\u0013\u0010R\u001a\u0004\u0018\u00010I¢\u0006\b\n\u0000\u001a\u0004\bS\u0010KR\u0016\u0010T\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0016\u0010W\u001a\u0004\u0018\u00010X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006h"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileViewState;", "", "savedProfileEvent", "Lcom/robinhood/udf/UiEvent;", "", "profilePageStatus", "Lcom/robinhood/android/accountcenter/views/ProfilePageStatus;", "profileAccountBreakdownStatus", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus;", "selectedAssetId", "", "expandDisclosure", "", "iacInfoBanners", "", "Lcom/robinhood/models/db/IacInfoBanner;", "showAssetTabsAndCircleChart", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/accountcenter/views/ProfilePageStatus;Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownStatus;Ljava/lang/String;ZLjava/util/List;Z)V", "getSavedProfileEvent", "()Lcom/robinhood/udf/UiEvent;", "getExpandDisclosure", "()Z", "getIacInfoBanners", "()Ljava/util/List;", "getShowAssetTabsAndCircleChart", "showProfile", "getShowProfile", "showProfilePageError", "getShowProfilePageError", "showAssetTabs", "getShowAssetTabs", "showCircleChartHeader", "getShowCircleChartHeader", "showCircleChart", "getShowCircleChart", "showAssetBreakdownList", "getShowAssetBreakdownList", "showAssetBreakdownDescription", "getShowAssetBreakdownDescription", "showEmptyAssetBreakdownView", "getShowEmptyAssetBreakdownView", "showInsightListHeader", "getShowInsightListHeader", "showInsightListHeaderInfoIcon", "getShowInsightListHeaderInfoIcon", "showInsightList", "getShowInsightList", "profileAccountBreakdownState", "Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownState;", "getProfileAccountBreakdownState", "()Lcom/robinhood/android/accountcenter/views/ProfileAccountBreakdownState;", "assetTabsState", "Lcom/robinhood/android/accountcenter/views/AssetTabsState;", "getAssetTabsState", "()Lcom/robinhood/android/accountcenter/views/AssetTabsState;", "circleChartState", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownCircleChartState;", "getCircleChartState", "()Lcom/robinhood/android/accountcenter/views/AssetBreakdownCircleChartState;", "assetBreakdownListState", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownListState;", "getAssetBreakdownListState", "()Lcom/robinhood/android/accountcenter/views/AssetBreakdownListState;", "activeAssetBreakdown", "Lcom/robinhood/android/accountcenter/views/AssetBreakdown;", "getActiveAssetBreakdown", "()Lcom/robinhood/android/accountcenter/views/AssetBreakdown;", "insightListState", "Lcom/robinhood/android/accountcenter/views/InsightListState;", "getInsightListState", "()Lcom/robinhood/android/accountcenter/views/InsightListState;", "collapsedDisclosure", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getCollapsedDisclosure", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "expandedDisclosure", "getExpandedDisclosure", "showDisclosure", "getShowDisclosure", "canAppendToggleText", "getCanAppendToggleText", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "getDisclosure", "activeAssetId", "getActiveAssetId", "()Ljava/lang/String;", "profileAccountBreakdown", "Lcom/robinhood/models/ui/ProfileAccountBreakdown;", "getProfileAccountBreakdown", "()Lcom/robinhood/models/ui/ProfileAccountBreakdown;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class ProfileViewState {
    public static final int $stable = 8;
    private final boolean canAppendToggleText;
    private final MarkdownContent disclosure;
    private final boolean expandDisclosure;
    private final List<IacInfoBanner> iacInfoBanners;
    private final ProfileAccountBreakdownStatus profileAccountBreakdownStatus;
    private final ProfilePageStatus profilePageStatus;
    private final UiEvent<Unit> savedProfileEvent;
    private final String selectedAssetId;
    private final boolean showAssetTabsAndCircleChart;
    private final boolean showDisclosure;

    public ProfileViewState() {
        this(null, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* renamed from: component2, reason: from getter */
    private final ProfilePageStatus getProfilePageStatus() {
        return this.profilePageStatus;
    }

    /* renamed from: component3, reason: from getter */
    private final ProfileAccountBreakdownStatus getProfileAccountBreakdownStatus() {
        return this.profileAccountBreakdownStatus;
    }

    /* renamed from: component4, reason: from getter */
    private final String getSelectedAssetId() {
        return this.selectedAssetId;
    }

    public static /* synthetic */ ProfileViewState copy$default(ProfileViewState profileViewState, UiEvent uiEvent, ProfilePageStatus profilePageStatus, ProfileAccountBreakdownStatus profileAccountBreakdownStatus, String str, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = profileViewState.savedProfileEvent;
        }
        if ((i & 2) != 0) {
            profilePageStatus = profileViewState.profilePageStatus;
        }
        if ((i & 4) != 0) {
            profileAccountBreakdownStatus = profileViewState.profileAccountBreakdownStatus;
        }
        if ((i & 8) != 0) {
            str = profileViewState.selectedAssetId;
        }
        if ((i & 16) != 0) {
            z = profileViewState.expandDisclosure;
        }
        if ((i & 32) != 0) {
            list = profileViewState.iacInfoBanners;
        }
        if ((i & 64) != 0) {
            z2 = profileViewState.showAssetTabsAndCircleChart;
        }
        List list2 = list;
        boolean z3 = z2;
        boolean z4 = z;
        ProfileAccountBreakdownStatus profileAccountBreakdownStatus2 = profileAccountBreakdownStatus;
        return profileViewState.copy(uiEvent, profilePageStatus, profileAccountBreakdownStatus2, str, z4, list2, z3);
    }

    public final UiEvent<Unit> component1() {
        return this.savedProfileEvent;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    public final List<IacInfoBanner> component6() {
        return this.iacInfoBanners;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowAssetTabsAndCircleChart() {
        return this.showAssetTabsAndCircleChart;
    }

    public final ProfileViewState copy(UiEvent<Unit> savedProfileEvent, ProfilePageStatus profilePageStatus, ProfileAccountBreakdownStatus profileAccountBreakdownStatus, String selectedAssetId, boolean expandDisclosure, List<IacInfoBanner> iacInfoBanners, boolean showAssetTabsAndCircleChart) {
        Intrinsics.checkNotNullParameter(profilePageStatus, "profilePageStatus");
        Intrinsics.checkNotNullParameter(profileAccountBreakdownStatus, "profileAccountBreakdownStatus");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        return new ProfileViewState(savedProfileEvent, profilePageStatus, profileAccountBreakdownStatus, selectedAssetId, expandDisclosure, iacInfoBanners, showAssetTabsAndCircleChart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileViewState)) {
            return false;
        }
        ProfileViewState profileViewState = (ProfileViewState) other;
        return Intrinsics.areEqual(this.savedProfileEvent, profileViewState.savedProfileEvent) && Intrinsics.areEqual(this.profilePageStatus, profileViewState.profilePageStatus) && Intrinsics.areEqual(this.profileAccountBreakdownStatus, profileViewState.profileAccountBreakdownStatus) && Intrinsics.areEqual(this.selectedAssetId, profileViewState.selectedAssetId) && this.expandDisclosure == profileViewState.expandDisclosure && Intrinsics.areEqual(this.iacInfoBanners, profileViewState.iacInfoBanners) && this.showAssetTabsAndCircleChart == profileViewState.showAssetTabsAndCircleChart;
    }

    public int hashCode() {
        UiEvent<Unit> uiEvent = this.savedProfileEvent;
        int iHashCode = (((((uiEvent == null ? 0 : uiEvent.hashCode()) * 31) + this.profilePageStatus.hashCode()) * 31) + this.profileAccountBreakdownStatus.hashCode()) * 31;
        String str = this.selectedAssetId;
        return ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.expandDisclosure)) * 31) + this.iacInfoBanners.hashCode()) * 31) + Boolean.hashCode(this.showAssetTabsAndCircleChart);
    }

    public String toString() {
        return "ProfileViewState(savedProfileEvent=" + this.savedProfileEvent + ", profilePageStatus=" + this.profilePageStatus + ", profileAccountBreakdownStatus=" + this.profileAccountBreakdownStatus + ", selectedAssetId=" + this.selectedAssetId + ", expandDisclosure=" + this.expandDisclosure + ", iacInfoBanners=" + this.iacInfoBanners + ", showAssetTabsAndCircleChart=" + this.showAssetTabsAndCircleChart + ")";
    }

    public ProfileViewState(UiEvent<Unit> uiEvent, ProfilePageStatus profilePageStatus, ProfileAccountBreakdownStatus profileAccountBreakdownStatus, String str, boolean z, List<IacInfoBanner> iacInfoBanners, boolean z2) {
        MarkdownContent expandedDisclosure;
        Intrinsics.checkNotNullParameter(profilePageStatus, "profilePageStatus");
        Intrinsics.checkNotNullParameter(profileAccountBreakdownStatus, "profileAccountBreakdownStatus");
        Intrinsics.checkNotNullParameter(iacInfoBanners, "iacInfoBanners");
        this.savedProfileEvent = uiEvent;
        this.profilePageStatus = profilePageStatus;
        this.profileAccountBreakdownStatus = profileAccountBreakdownStatus;
        this.selectedAssetId = str;
        this.expandDisclosure = z;
        this.iacInfoBanners = iacInfoBanners;
        this.showAssetTabsAndCircleChart = z2;
        boolean z3 = (getCollapsedDisclosure() == null && getExpandedDisclosure() == null) ? false : true;
        this.showDisclosure = z3;
        boolean z4 = (getExpandedDisclosure() == null || getCollapsedDisclosure() == null) ? false : true;
        this.canAppendToggleText = z4;
        if (z3 && !z4) {
            expandedDisclosure = getExpandedDisclosure();
            if (expandedDisclosure == null) {
                expandedDisclosure = getCollapsedDisclosure();
            }
        } else {
            expandedDisclosure = z ? getExpandedDisclosure() : getCollapsedDisclosure();
        }
        this.disclosure = expandedDisclosure;
    }

    public final UiEvent<Unit> getSavedProfileEvent() {
        return this.savedProfileEvent;
    }

    public /* synthetic */ ProfileViewState(UiEvent uiEvent, ProfilePageStatus profilePageStatus, ProfileAccountBreakdownStatus profileAccountBreakdownStatus, String str, boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? ProfilePageStatus.Loading.INSTANCE : profilePageStatus, (i & 4) != 0 ? ProfileAccountBreakdownStatus.Loading.INSTANCE : profileAccountBreakdownStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? false : z2);
    }

    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    public final List<IacInfoBanner> getIacInfoBanners() {
        return this.iacInfoBanners;
    }

    public final boolean getShowAssetTabsAndCircleChart() {
        return this.showAssetTabsAndCircleChart;
    }

    private final boolean getShowProfile() {
        return !(this.profilePageStatus instanceof ProfilePageStatus.Loading);
    }

    private final boolean getShowProfilePageError() {
        return getShowProfile() && (this.profilePageStatus instanceof ProfilePageStatus.Failed);
    }

    public final boolean getShowAssetTabs() {
        return (getShowProfilePageError() || getAssetTabsState() == null) ? false : true;
    }

    public final boolean getShowCircleChartHeader() {
        if (getShowProfilePageError()) {
            return false;
        }
        AssetBreakdownCircleChartState circleChartState = getCircleChartState();
        String headerText = circleChartState != null ? circleChartState.getHeaderText() : null;
        return (headerText == null || StringsKt.isBlank(headerText) || !getShowCircleChart()) ? false : true;
    }

    public final boolean getShowCircleChart() {
        return (getShowProfilePageError() || getCircleChartState() == null) ? false : true;
    }

    public final boolean getShowAssetBreakdownList() {
        if (getShowProfilePageError() || getActiveAssetBreakdown() == null) {
            return false;
        }
        AssetBreakdown activeAssetBreakdown = getActiveAssetBreakdown();
        return (activeAssetBreakdown != null ? activeAssetBreakdown.getEmptyBreakdownState() : null) == null;
    }

    public final boolean getShowAssetBreakdownDescription() {
        if (!this.showAssetTabsAndCircleChart || !getShowAssetBreakdownList()) {
            return false;
        }
        AssetBreakdown activeAssetBreakdown = getActiveAssetBreakdown();
        return (activeAssetBreakdown != null ? activeAssetBreakdown.getDescription() : null) != null;
    }

    public final boolean getShowEmptyAssetBreakdownView() {
        AssetBreakdown activeAssetBreakdown;
        return (getShowProfilePageError() || (activeAssetBreakdown = getActiveAssetBreakdown()) == null || !activeAssetBreakdown.getItems().isEmpty() || activeAssetBreakdown.getEmptyBreakdownState() == null) ? false : true;
    }

    public final boolean getShowInsightListHeader() {
        if (getShowProfilePageError()) {
            return false;
        }
        InsightListState insightListState = getInsightListState();
        String displayText = insightListState != null ? insightListState.getDisplayText() : null;
        return (displayText == null || StringsKt.isBlank(displayText) || !getShowInsightList()) ? false : true;
    }

    public final boolean getShowInsightListHeaderInfoIcon() {
        InsightListState insightListState;
        return getShowInsightListHeader() && (insightListState = getInsightListState()) != null && insightListState.getShowInfoIcon();
    }

    public final boolean getShowInsightList() {
        List<InsightItem> insightList;
        if (!getShowProfilePageError()) {
            InsightListState insightListState = getInsightListState();
            if ((insightListState == null || (insightList = insightListState.getInsightList()) == null) ? false : !insightList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final ProfileAccountBreakdownState getProfileAccountBreakdownState() {
        ProfileAccountBreakdown profileAccountBreakdown = getProfileAccountBreakdown();
        if (profileAccountBreakdown != null) {
            return new ProfileAccountBreakdownState(profileAccountBreakdown);
        }
        return null;
    }

    public final AssetTabsState getAssetTabsState() {
        if (this.showAssetTabsAndCircleChart) {
            ProfilePageStatus profilePageStatus = this.profilePageStatus;
            ProfilePageStatus.Success success = profilePageStatus instanceof ProfilePageStatus.Success ? (ProfilePageStatus.Success) profilePageStatus : null;
            if (success != null) {
                return success.createAssetTabsState(getActiveAssetId());
            }
        }
        return null;
    }

    public final AssetBreakdownCircleChartState getCircleChartState() {
        if (this.showAssetTabsAndCircleChart) {
            ProfilePageStatus profilePageStatus = this.profilePageStatus;
            ProfilePageStatus.Success success = profilePageStatus instanceof ProfilePageStatus.Success ? (ProfilePageStatus.Success) profilePageStatus : null;
            if (success != null) {
                return success.createProfileCircleChartState(getActiveAssetId());
            }
        }
        return null;
    }

    private final AssetBreakdownListState getAssetBreakdownListState() {
        ProfilePageStatus profilePageStatus = this.profilePageStatus;
        ProfilePageStatus.Success success = profilePageStatus instanceof ProfilePageStatus.Success ? (ProfilePageStatus.Success) profilePageStatus : null;
        if (success != null) {
            return success.getAssetBreakdownListState();
        }
        return null;
    }

    public final AssetBreakdown getActiveAssetBreakdown() {
        List<AssetBreakdown> assetBreakdowns;
        AssetBreakdownListState assetBreakdownListState = getAssetBreakdownListState();
        Object obj = null;
        if (assetBreakdownListState == null || (assetBreakdowns = assetBreakdownListState.getAssetBreakdowns()) == null) {
            return null;
        }
        Iterator<T> it = assetBreakdowns.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((AssetBreakdown) next).getId(), getActiveAssetId())) {
                obj = next;
                break;
            }
        }
        return (AssetBreakdown) obj;
    }

    public final InsightListState getInsightListState() {
        ProfilePageStatus profilePageStatus = this.profilePageStatus;
        ProfilePageStatus.Success success = profilePageStatus instanceof ProfilePageStatus.Success ? (ProfilePageStatus.Success) profilePageStatus : null;
        if (success != null) {
            return success.getInsightListState();
        }
        return null;
    }

    private final MarkdownContent getCollapsedDisclosure() {
        ProfilePageStatus profilePageStatus = this.profilePageStatus;
        ProfilePageStatus.Success success = profilePageStatus instanceof ProfilePageStatus.Success ? (ProfilePageStatus.Success) profilePageStatus : null;
        if (success != null) {
            return success.getCollapsedDisclosure();
        }
        return null;
    }

    private final MarkdownContent getExpandedDisclosure() {
        ProfilePageStatus profilePageStatus = this.profilePageStatus;
        ProfilePageStatus.Success success = profilePageStatus instanceof ProfilePageStatus.Success ? (ProfilePageStatus.Success) profilePageStatus : null;
        if (success != null) {
            return success.getExpandedDisclosure();
        }
        return null;
    }

    public final boolean getShowDisclosure() {
        return this.showDisclosure;
    }

    public final boolean getCanAppendToggleText() {
        return this.canAppendToggleText;
    }

    public final MarkdownContent getDisclosure() {
        return this.disclosure;
    }

    private final String getActiveAssetId() {
        String str = this.selectedAssetId;
        if (str != null) {
            return str;
        }
        ProfilePageStatus profilePageStatus = this.profilePageStatus;
        ProfilePageStatus.Success success = profilePageStatus instanceof ProfilePageStatus.Success ? (ProfilePageStatus.Success) profilePageStatus : null;
        if (success != null) {
            return success.getLargestAssetId();
        }
        return null;
    }

    private final ProfileAccountBreakdown getProfileAccountBreakdown() {
        ProfileAccountBreakdownStatus profileAccountBreakdownStatus = this.profileAccountBreakdownStatus;
        ProfileAccountBreakdownStatus.Success success = profileAccountBreakdownStatus instanceof ProfileAccountBreakdownStatus.Success ? (ProfileAccountBreakdownStatus.Success) profileAccountBreakdownStatus : null;
        if (success != null) {
            return success.getProfileAccountBreakdown();
        }
        return null;
    }
}
