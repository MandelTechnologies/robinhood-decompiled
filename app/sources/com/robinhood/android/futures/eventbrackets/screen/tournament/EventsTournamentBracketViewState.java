package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.android.futures.eventbrackets.p141ui.BracketGameOverviewCardData;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketRoundData;
import com.robinhood.android.futures.eventbrackets.screen.tournament.switcher.EventsTournamentSwitcherData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: EventsTournamentBracketViewState.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0015HÆ\u0003J\t\u0010D\u001a\u00020\u0015HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J¯\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\tHÆ\u0001J\u0013\u0010J\u001a\u00020\u00152\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\tHÖ\u0001J\t\u0010M\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u001d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u00109\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u00100¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;", "", "bracketId", "Ljava/util/UUID;", "individualAccountNumber", "", "appBarData", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;", "selectedTabIndex", "", "tabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/TabData;", "allRounds", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "liveGames", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "navigationInfo", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "showScreenLoading", "", "showContentLoading", "allDataViewMode", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AllDataViewMode;", "header", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventTournamentBracketHeaderData;", "eventsTournamentSwitcherData", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/switcher/EventsTournamentSwitcherData;", "initialRoundIndex", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;ILkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;ZZLcom/robinhood/android/futures/eventbrackets/screen/tournament/AllDataViewMode;Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventTournamentBracketHeaderData;Lcom/robinhood/android/futures/eventbrackets/screen/tournament/switcher/EventsTournamentSwitcherData;I)V", "getBracketId", "()Ljava/util/UUID;", "getIndividualAccountNumber", "()Ljava/lang/String;", "getAppBarData", "()Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;", "getSelectedTabIndex", "()I", "getTabs", "()Lkotlinx/collections/immutable/ImmutableList;", "getAllRounds", "()Lkotlinx/collections/immutable/PersistentList;", "getLiveGames", "getNavigationInfo", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "getShowScreenLoading", "()Z", "getShowContentLoading", "getAllDataViewMode", "()Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AllDataViewMode;", "getHeader", "()Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventTournamentBracketHeaderData;", "getEventsTournamentSwitcherData", "()Lcom/robinhood/android/futures/eventbrackets/screen/tournament/switcher/EventsTournamentSwitcherData;", "getInitialRoundIndex", "showNavigator", "getShowNavigator", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventsTournamentBracketViewState {
    public static final int $stable = 8;
    private final EventsTournamentBracketViewState2 allDataViewMode;
    private final ImmutableList3<BracketRoundData> allRounds;
    private final AppBarData appBarData;
    private final UUID bracketId;
    private final EventsTournamentSwitcherData eventsTournamentSwitcherData;
    private final EventTournamentBracketHeaderData header;
    private final String individualAccountNumber;
    private final int initialRoundIndex;
    private final ImmutableList3<BracketGameOverviewCardData> liveGames;
    private final BracketNavigationInfo navigationInfo;
    private final int selectedTabIndex;
    private final boolean showContentLoading;
    private final boolean showNavigator;
    private final boolean showScreenLoading;
    private final ImmutableList<TabData> tabs;

    /* renamed from: component1, reason: from getter */
    public final UUID getBracketId() {
        return this.bracketId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowContentLoading() {
        return this.showContentLoading;
    }

    /* renamed from: component11, reason: from getter */
    public final EventsTournamentBracketViewState2 getAllDataViewMode() {
        return this.allDataViewMode;
    }

    /* renamed from: component12, reason: from getter */
    public final EventTournamentBracketHeaderData getHeader() {
        return this.header;
    }

    /* renamed from: component13, reason: from getter */
    public final EventsTournamentSwitcherData getEventsTournamentSwitcherData() {
        return this.eventsTournamentSwitcherData;
    }

    /* renamed from: component14, reason: from getter */
    public final int getInitialRoundIndex() {
        return this.initialRoundIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final AppBarData getAppBarData() {
        return this.appBarData;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final ImmutableList<TabData> component5() {
        return this.tabs;
    }

    public final ImmutableList3<BracketRoundData> component6() {
        return this.allRounds;
    }

    public final ImmutableList3<BracketGameOverviewCardData> component7() {
        return this.liveGames;
    }

    /* renamed from: component8, reason: from getter */
    public final BracketNavigationInfo getNavigationInfo() {
        return this.navigationInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowScreenLoading() {
        return this.showScreenLoading;
    }

    public final EventsTournamentBracketViewState copy(UUID bracketId, String individualAccountNumber, AppBarData appBarData, int selectedTabIndex, ImmutableList<TabData> tabs, ImmutableList3<BracketRoundData> allRounds, ImmutableList3<BracketGameOverviewCardData> liveGames, BracketNavigationInfo navigationInfo, boolean showScreenLoading, boolean showContentLoading, EventsTournamentBracketViewState2 allDataViewMode, EventTournamentBracketHeaderData header, EventsTournamentSwitcherData eventsTournamentSwitcherData, int initialRoundIndex) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        Intrinsics.checkNotNullParameter(appBarData, "appBarData");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(allRounds, "allRounds");
        Intrinsics.checkNotNullParameter(liveGames, "liveGames");
        Intrinsics.checkNotNullParameter(navigationInfo, "navigationInfo");
        return new EventsTournamentBracketViewState(bracketId, individualAccountNumber, appBarData, selectedTabIndex, tabs, allRounds, liveGames, navigationInfo, showScreenLoading, showContentLoading, allDataViewMode, header, eventsTournamentSwitcherData, initialRoundIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsTournamentBracketViewState)) {
            return false;
        }
        EventsTournamentBracketViewState eventsTournamentBracketViewState = (EventsTournamentBracketViewState) other;
        return Intrinsics.areEqual(this.bracketId, eventsTournamentBracketViewState.bracketId) && Intrinsics.areEqual(this.individualAccountNumber, eventsTournamentBracketViewState.individualAccountNumber) && Intrinsics.areEqual(this.appBarData, eventsTournamentBracketViewState.appBarData) && this.selectedTabIndex == eventsTournamentBracketViewState.selectedTabIndex && Intrinsics.areEqual(this.tabs, eventsTournamentBracketViewState.tabs) && Intrinsics.areEqual(this.allRounds, eventsTournamentBracketViewState.allRounds) && Intrinsics.areEqual(this.liveGames, eventsTournamentBracketViewState.liveGames) && Intrinsics.areEqual(this.navigationInfo, eventsTournamentBracketViewState.navigationInfo) && this.showScreenLoading == eventsTournamentBracketViewState.showScreenLoading && this.showContentLoading == eventsTournamentBracketViewState.showContentLoading && this.allDataViewMode == eventsTournamentBracketViewState.allDataViewMode && Intrinsics.areEqual(this.header, eventsTournamentBracketViewState.header) && Intrinsics.areEqual(this.eventsTournamentSwitcherData, eventsTournamentBracketViewState.eventsTournamentSwitcherData) && this.initialRoundIndex == eventsTournamentBracketViewState.initialRoundIndex;
    }

    public int hashCode() {
        int iHashCode = this.bracketId.hashCode() * 31;
        String str = this.individualAccountNumber;
        int iHashCode2 = (((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appBarData.hashCode()) * 31) + Integer.hashCode(this.selectedTabIndex)) * 31) + this.tabs.hashCode()) * 31) + this.allRounds.hashCode()) * 31) + this.liveGames.hashCode()) * 31) + this.navigationInfo.hashCode()) * 31) + Boolean.hashCode(this.showScreenLoading)) * 31) + Boolean.hashCode(this.showContentLoading)) * 31;
        EventsTournamentBracketViewState2 eventsTournamentBracketViewState2 = this.allDataViewMode;
        int iHashCode3 = (iHashCode2 + (eventsTournamentBracketViewState2 == null ? 0 : eventsTournamentBracketViewState2.hashCode())) * 31;
        EventTournamentBracketHeaderData eventTournamentBracketHeaderData = this.header;
        int iHashCode4 = (iHashCode3 + (eventTournamentBracketHeaderData == null ? 0 : eventTournamentBracketHeaderData.hashCode())) * 31;
        EventsTournamentSwitcherData eventsTournamentSwitcherData = this.eventsTournamentSwitcherData;
        return ((iHashCode4 + (eventsTournamentSwitcherData != null ? eventsTournamentSwitcherData.hashCode() : 0)) * 31) + Integer.hashCode(this.initialRoundIndex);
    }

    public String toString() {
        return "EventsTournamentBracketViewState(bracketId=" + this.bracketId + ", individualAccountNumber=" + this.individualAccountNumber + ", appBarData=" + this.appBarData + ", selectedTabIndex=" + this.selectedTabIndex + ", tabs=" + this.tabs + ", allRounds=" + this.allRounds + ", liveGames=" + this.liveGames + ", navigationInfo=" + this.navigationInfo + ", showScreenLoading=" + this.showScreenLoading + ", showContentLoading=" + this.showContentLoading + ", allDataViewMode=" + this.allDataViewMode + ", header=" + this.header + ", eventsTournamentSwitcherData=" + this.eventsTournamentSwitcherData + ", initialRoundIndex=" + this.initialRoundIndex + ")";
    }

    public EventsTournamentBracketViewState(UUID bracketId, String str, AppBarData appBarData, int i, ImmutableList<TabData> tabs, ImmutableList3<BracketRoundData> allRounds, ImmutableList3<BracketGameOverviewCardData> liveGames, BracketNavigationInfo navigationInfo, boolean z, boolean z2, EventsTournamentBracketViewState2 eventsTournamentBracketViewState2, EventTournamentBracketHeaderData eventTournamentBracketHeaderData, EventsTournamentSwitcherData eventsTournamentSwitcherData, int i2) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        Intrinsics.checkNotNullParameter(appBarData, "appBarData");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(allRounds, "allRounds");
        Intrinsics.checkNotNullParameter(liveGames, "liveGames");
        Intrinsics.checkNotNullParameter(navigationInfo, "navigationInfo");
        this.bracketId = bracketId;
        this.individualAccountNumber = str;
        this.appBarData = appBarData;
        this.selectedTabIndex = i;
        this.tabs = tabs;
        this.allRounds = allRounds;
        this.liveGames = liveGames;
        this.navigationInfo = navigationInfo;
        this.showScreenLoading = z;
        this.showContentLoading = z2;
        this.allDataViewMode = eventsTournamentBracketViewState2;
        this.header = eventTournamentBracketHeaderData;
        this.eventsTournamentSwitcherData = eventsTournamentSwitcherData;
        this.initialRoundIndex = i2;
        this.showNavigator = !allRounds.isEmpty() && i == 0;
    }

    public final UUID getBracketId() {
        return this.bracketId;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final AppBarData getAppBarData() {
        return this.appBarData;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final ImmutableList<TabData> getTabs() {
        return this.tabs;
    }

    public final ImmutableList3<BracketRoundData> getAllRounds() {
        return this.allRounds;
    }

    public final ImmutableList3<BracketGameOverviewCardData> getLiveGames() {
        return this.liveGames;
    }

    public final BracketNavigationInfo getNavigationInfo() {
        return this.navigationInfo;
    }

    public final boolean getShowScreenLoading() {
        return this.showScreenLoading;
    }

    public final boolean getShowContentLoading() {
        return this.showContentLoading;
    }

    public final EventsTournamentBracketViewState2 getAllDataViewMode() {
        return this.allDataViewMode;
    }

    public final EventTournamentBracketHeaderData getHeader() {
        return this.header;
    }

    public final EventsTournamentSwitcherData getEventsTournamentSwitcherData() {
        return this.eventsTournamentSwitcherData;
    }

    public final int getInitialRoundIndex() {
        return this.initialRoundIndex;
    }

    public final boolean getShowNavigator() {
        return this.showNavigator;
    }
}
