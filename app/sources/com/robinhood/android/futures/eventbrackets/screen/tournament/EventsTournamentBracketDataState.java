package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.android.futures.eventbrackets.C17135R;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketGameOverviewCardData;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketRoundData;
import com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildAppBarData;
import com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildTournamentBracket;
import com.robinhood.android.futures.eventbrackets.screen.tournament.switcher.EventsTournamentSwitcherData;
import com.robinhood.android.models.event.p186db.arsenal.EventBracket;
import com.robinhood.android.models.event.p186db.arsenal.EventBracketTradeButtonMetadata;
import com.robinhood.android.models.event.p186db.arsenal.EventId;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic4;
import com.robinhood.android.models.event.p186db.arsenal.UiEventBracket;
import com.robinhood.android.models.event.p186db.ceres.EventContractRealizedPnlByContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventGameData;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.store.experiments.EventBracketExperiment;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventsTournamentBracketDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#\u0018\u00010\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010&J\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000fJ\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0017\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014HÆ\u0003J\u0017\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014HÆ\u0003J\t\u0010Z\u001a\u00020\u001bHÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000fHÆ\u0003J\u0017\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010!HÆ\u0003J\u0017\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#\u0018\u00010\u0014HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010@J\u009a\u0002\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010aJ\u0013\u0010b\u001a\u00020\b2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020\u0006HÖ\u0001J\t\u0010e\u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010,R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0015\u0010$\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010A\u001a\u0004\b$\u0010@R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\f8F¢\u0006\u0006\u001a\u0004\bF\u00100R\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010K\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006f"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;", "", "topicId", "Ljava/util/UUID;", "bracketId", "selectedTabIndex", "", "isInEcV3Exp", "", "eventBracketVariant", "Lcom/robinhood/store/experiments/EventBracketExperiment$Variants;", "tabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/TabData;", "liveGames", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "bracket", "Lcom/robinhood/android/models/event/db/arsenal/UiEventBracket;", "eventsMap", "", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "contractIdToQuotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToPositions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "navigationInfo", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "relevantEventTopics", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;", "eventIdToEventGameDataMap", "Lcom/robinhood/android/models/event/db/marketdata/EventGameData;", "individualAccountNumber", "", "contractIdToRealizedPnl", "Lcom/robinhood/android/models/event/db/ceres/EventContractRealizedPnlByContract;", "isWeekAfterFinalEvent", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;IZLcom/robinhood/store/experiments/EventBracketExperiment$Variants;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/models/event/db/arsenal/UiEventBracket;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;Lkotlinx/collections/immutable/PersistentList;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;)V", "getTopicId", "()Ljava/util/UUID;", "getBracketId", "getSelectedTabIndex", "()I", "()Z", "getEventBracketVariant", "()Lcom/robinhood/store/experiments/EventBracketExperiment$Variants;", "getTabs", "()Lkotlinx/collections/immutable/ImmutableList;", "getLiveGames", "()Lkotlinx/collections/immutable/PersistentList;", "getBracket", "()Lcom/robinhood/android/models/event/db/arsenal/UiEventBracket;", "getEventsMap", "()Ljava/util/Map;", "getContractIdToQuotes", "getContractIdToPositions", "getNavigationInfo", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "getRelevantEventTopics", "getEventIdToEventGameDataMap", "getIndividualAccountNumber", "()Ljava/lang/String;", "getContractIdToRealizedPnl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "buildRounds", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "switcherRelevantTopics", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/switcher/EventsTournamentSwitcherData$EventTopic;", "getSwitcherRelevantTopics", "appBarData", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;", "getAppBarData", "()Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AppBarData;", "eventTournamentBracketHeaderData", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventTournamentBracketHeaderData;", "getEventTournamentBracketHeaderData", "()Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventTournamentBracketHeaderData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/util/UUID;Ljava/util/UUID;IZLcom/robinhood/store/experiments/EventBracketExperiment$Variants;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/models/event/db/arsenal/UiEventBracket;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;Lkotlinx/collections/immutable/PersistentList;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;", "equals", "other", "hashCode", "toString", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EventsTournamentBracketDataState {
    public static final int $stable = 8;
    private final UiEventBracket bracket;
    private final UUID bracketId;
    private final Map<UUID, UiEventContractPosition> contractIdToPositions;
    private final Map<UUID, EventQuote> contractIdToQuotes;
    private final Map<UUID, EventContractRealizedPnlByContract> contractIdToRealizedPnl;
    private final EventBracketExperiment.Variants eventBracketVariant;
    private final Map<UUID, EventGameData> eventIdToEventGameDataMap;
    private final Map<UUID, UiEcEvent> eventsMap;
    private final String individualAccountNumber;
    private final boolean isInEcV3Exp;
    private final Boolean isWeekAfterFinalEvent;
    private final ImmutableList3<BracketGameOverviewCardData> liveGames;
    private final BracketNavigationInfo navigationInfo;
    private final ImmutableList3<EventTopic> relevantEventTopics;
    private final int selectedTabIndex;
    private final ImmutableList<TabData> tabs;
    private final UUID topicId;

    public static /* synthetic */ EventsTournamentBracketDataState copy$default(EventsTournamentBracketDataState eventsTournamentBracketDataState, UUID uuid, UUID uuid2, int i, boolean z, EventBracketExperiment.Variants variants, ImmutableList immutableList, ImmutableList3 immutableList3, UiEventBracket uiEventBracket, Map map, Map map2, Map map3, BracketNavigationInfo bracketNavigationInfo, ImmutableList3 immutableList32, Map map4, String str, Map map5, Boolean bool, int i2, Object obj) {
        Boolean bool2;
        Map map6;
        UUID uuid3;
        EventsTournamentBracketDataState eventsTournamentBracketDataState2;
        String str2;
        UUID uuid4;
        int i3;
        boolean z2;
        EventBracketExperiment.Variants variants2;
        ImmutableList immutableList2;
        ImmutableList3 immutableList33;
        UiEventBracket uiEventBracket2;
        Map map7;
        Map map8;
        Map map9;
        BracketNavigationInfo bracketNavigationInfo2;
        ImmutableList3 immutableList34;
        Map map10;
        UUID uuid5 = (i2 & 1) != 0 ? eventsTournamentBracketDataState.topicId : uuid;
        UUID uuid6 = (i2 & 2) != 0 ? eventsTournamentBracketDataState.bracketId : uuid2;
        int i4 = (i2 & 4) != 0 ? eventsTournamentBracketDataState.selectedTabIndex : i;
        boolean z3 = (i2 & 8) != 0 ? eventsTournamentBracketDataState.isInEcV3Exp : z;
        EventBracketExperiment.Variants variants3 = (i2 & 16) != 0 ? eventsTournamentBracketDataState.eventBracketVariant : variants;
        ImmutableList immutableList4 = (i2 & 32) != 0 ? eventsTournamentBracketDataState.tabs : immutableList;
        ImmutableList3 immutableList35 = (i2 & 64) != 0 ? eventsTournamentBracketDataState.liveGames : immutableList3;
        UiEventBracket uiEventBracket3 = (i2 & 128) != 0 ? eventsTournamentBracketDataState.bracket : uiEventBracket;
        Map map11 = (i2 & 256) != 0 ? eventsTournamentBracketDataState.eventsMap : map;
        Map map12 = (i2 & 512) != 0 ? eventsTournamentBracketDataState.contractIdToQuotes : map2;
        Map map13 = (i2 & 1024) != 0 ? eventsTournamentBracketDataState.contractIdToPositions : map3;
        BracketNavigationInfo bracketNavigationInfo3 = (i2 & 2048) != 0 ? eventsTournamentBracketDataState.navigationInfo : bracketNavigationInfo;
        ImmutableList3 immutableList36 = (i2 & 4096) != 0 ? eventsTournamentBracketDataState.relevantEventTopics : immutableList32;
        Map map14 = (i2 & 8192) != 0 ? eventsTournamentBracketDataState.eventIdToEventGameDataMap : map4;
        UUID uuid7 = uuid5;
        String str3 = (i2 & 16384) != 0 ? eventsTournamentBracketDataState.individualAccountNumber : str;
        Map map15 = (i2 & 32768) != 0 ? eventsTournamentBracketDataState.contractIdToRealizedPnl : map5;
        if ((i2 & 65536) != 0) {
            map6 = map15;
            bool2 = eventsTournamentBracketDataState.isWeekAfterFinalEvent;
            str2 = str3;
            uuid4 = uuid6;
            i3 = i4;
            z2 = z3;
            variants2 = variants3;
            immutableList2 = immutableList4;
            immutableList33 = immutableList35;
            uiEventBracket2 = uiEventBracket3;
            map7 = map11;
            map8 = map12;
            map9 = map13;
            bracketNavigationInfo2 = bracketNavigationInfo3;
            immutableList34 = immutableList36;
            map10 = map14;
            uuid3 = uuid7;
            eventsTournamentBracketDataState2 = eventsTournamentBracketDataState;
        } else {
            bool2 = bool;
            map6 = map15;
            uuid3 = uuid7;
            eventsTournamentBracketDataState2 = eventsTournamentBracketDataState;
            str2 = str3;
            uuid4 = uuid6;
            i3 = i4;
            z2 = z3;
            variants2 = variants3;
            immutableList2 = immutableList4;
            immutableList33 = immutableList35;
            uiEventBracket2 = uiEventBracket3;
            map7 = map11;
            map8 = map12;
            map9 = map13;
            bracketNavigationInfo2 = bracketNavigationInfo3;
            immutableList34 = immutableList36;
            map10 = map14;
        }
        return eventsTournamentBracketDataState2.copy(uuid3, uuid4, i3, z2, variants2, immutableList2, immutableList33, uiEventBracket2, map7, map8, map9, bracketNavigationInfo2, immutableList34, map10, str2, map6, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getTopicId() {
        return this.topicId;
    }

    public final Map<UUID, EventQuote> component10() {
        return this.contractIdToQuotes;
    }

    public final Map<UUID, UiEventContractPosition> component11() {
        return this.contractIdToPositions;
    }

    /* renamed from: component12, reason: from getter */
    public final BracketNavigationInfo getNavigationInfo() {
        return this.navigationInfo;
    }

    public final ImmutableList3<EventTopic> component13() {
        return this.relevantEventTopics;
    }

    public final Map<UUID, EventGameData> component14() {
        return this.eventIdToEventGameDataMap;
    }

    /* renamed from: component15, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final Map<UUID, EventContractRealizedPnlByContract> component16() {
        return this.contractIdToRealizedPnl;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getIsWeekAfterFinalEvent() {
        return this.isWeekAfterFinalEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getBracketId() {
        return this.bracketId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInEcV3Exp() {
        return this.isInEcV3Exp;
    }

    /* renamed from: component5, reason: from getter */
    public final EventBracketExperiment.Variants getEventBracketVariant() {
        return this.eventBracketVariant;
    }

    public final ImmutableList<TabData> component6() {
        return this.tabs;
    }

    public final ImmutableList3<BracketGameOverviewCardData> component7() {
        return this.liveGames;
    }

    /* renamed from: component8, reason: from getter */
    public final UiEventBracket getBracket() {
        return this.bracket;
    }

    public final Map<UUID, UiEcEvent> component9() {
        return this.eventsMap;
    }

    public final EventsTournamentBracketDataState copy(UUID topicId, UUID bracketId, int selectedTabIndex, boolean isInEcV3Exp, EventBracketExperiment.Variants eventBracketVariant, ImmutableList<TabData> tabs, ImmutableList3<BracketGameOverviewCardData> liveGames, UiEventBracket bracket, Map<UUID, UiEcEvent> eventsMap, Map<UUID, EventQuote> contractIdToQuotes, Map<UUID, UiEventContractPosition> contractIdToPositions, BracketNavigationInfo navigationInfo, ImmutableList3<EventTopic> relevantEventTopics, Map<UUID, EventGameData> eventIdToEventGameDataMap, String individualAccountNumber, Map<UUID, EventContractRealizedPnlByContract> contractIdToRealizedPnl, Boolean isWeekAfterFinalEvent) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        Intrinsics.checkNotNullParameter(eventBracketVariant, "eventBracketVariant");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(liveGames, "liveGames");
        Intrinsics.checkNotNullParameter(navigationInfo, "navigationInfo");
        return new EventsTournamentBracketDataState(topicId, bracketId, selectedTabIndex, isInEcV3Exp, eventBracketVariant, tabs, liveGames, bracket, eventsMap, contractIdToQuotes, contractIdToPositions, navigationInfo, relevantEventTopics, eventIdToEventGameDataMap, individualAccountNumber, contractIdToRealizedPnl, isWeekAfterFinalEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsTournamentBracketDataState)) {
            return false;
        }
        EventsTournamentBracketDataState eventsTournamentBracketDataState = (EventsTournamentBracketDataState) other;
        return Intrinsics.areEqual(this.topicId, eventsTournamentBracketDataState.topicId) && Intrinsics.areEqual(this.bracketId, eventsTournamentBracketDataState.bracketId) && this.selectedTabIndex == eventsTournamentBracketDataState.selectedTabIndex && this.isInEcV3Exp == eventsTournamentBracketDataState.isInEcV3Exp && this.eventBracketVariant == eventsTournamentBracketDataState.eventBracketVariant && Intrinsics.areEqual(this.tabs, eventsTournamentBracketDataState.tabs) && Intrinsics.areEqual(this.liveGames, eventsTournamentBracketDataState.liveGames) && Intrinsics.areEqual(this.bracket, eventsTournamentBracketDataState.bracket) && Intrinsics.areEqual(this.eventsMap, eventsTournamentBracketDataState.eventsMap) && Intrinsics.areEqual(this.contractIdToQuotes, eventsTournamentBracketDataState.contractIdToQuotes) && Intrinsics.areEqual(this.contractIdToPositions, eventsTournamentBracketDataState.contractIdToPositions) && Intrinsics.areEqual(this.navigationInfo, eventsTournamentBracketDataState.navigationInfo) && Intrinsics.areEqual(this.relevantEventTopics, eventsTournamentBracketDataState.relevantEventTopics) && Intrinsics.areEqual(this.eventIdToEventGameDataMap, eventsTournamentBracketDataState.eventIdToEventGameDataMap) && Intrinsics.areEqual(this.individualAccountNumber, eventsTournamentBracketDataState.individualAccountNumber) && Intrinsics.areEqual(this.contractIdToRealizedPnl, eventsTournamentBracketDataState.contractIdToRealizedPnl) && Intrinsics.areEqual(this.isWeekAfterFinalEvent, eventsTournamentBracketDataState.isWeekAfterFinalEvent);
    }

    public int hashCode() {
        UUID uuid = this.topicId;
        int iHashCode = (((((((((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.bracketId.hashCode()) * 31) + Integer.hashCode(this.selectedTabIndex)) * 31) + Boolean.hashCode(this.isInEcV3Exp)) * 31) + this.eventBracketVariant.hashCode()) * 31) + this.tabs.hashCode()) * 31) + this.liveGames.hashCode()) * 31;
        UiEventBracket uiEventBracket = this.bracket;
        int iHashCode2 = (iHashCode + (uiEventBracket == null ? 0 : uiEventBracket.hashCode())) * 31;
        Map<UUID, UiEcEvent> map = this.eventsMap;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<UUID, EventQuote> map2 = this.contractIdToQuotes;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<UUID, UiEventContractPosition> map3 = this.contractIdToPositions;
        int iHashCode5 = (((iHashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31) + this.navigationInfo.hashCode()) * 31;
        ImmutableList3<EventTopic> immutableList3 = this.relevantEventTopics;
        int iHashCode6 = (iHashCode5 + (immutableList3 == null ? 0 : immutableList3.hashCode())) * 31;
        Map<UUID, EventGameData> map4 = this.eventIdToEventGameDataMap;
        int iHashCode7 = (iHashCode6 + (map4 == null ? 0 : map4.hashCode())) * 31;
        String str = this.individualAccountNumber;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Map<UUID, EventContractRealizedPnlByContract> map5 = this.contractIdToRealizedPnl;
        int iHashCode9 = (iHashCode8 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Boolean bool = this.isWeekAfterFinalEvent;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "EventsTournamentBracketDataState(topicId=" + this.topicId + ", bracketId=" + this.bracketId + ", selectedTabIndex=" + this.selectedTabIndex + ", isInEcV3Exp=" + this.isInEcV3Exp + ", eventBracketVariant=" + this.eventBracketVariant + ", tabs=" + this.tabs + ", liveGames=" + this.liveGames + ", bracket=" + this.bracket + ", eventsMap=" + this.eventsMap + ", contractIdToQuotes=" + this.contractIdToQuotes + ", contractIdToPositions=" + this.contractIdToPositions + ", navigationInfo=" + this.navigationInfo + ", relevantEventTopics=" + this.relevantEventTopics + ", eventIdToEventGameDataMap=" + this.eventIdToEventGameDataMap + ", individualAccountNumber=" + this.individualAccountNumber + ", contractIdToRealizedPnl=" + this.contractIdToRealizedPnl + ", isWeekAfterFinalEvent=" + this.isWeekAfterFinalEvent + ")";
    }

    public EventsTournamentBracketDataState(UUID uuid, UUID bracketId, int i, boolean z, EventBracketExperiment.Variants eventBracketVariant, ImmutableList<TabData> tabs, ImmutableList3<BracketGameOverviewCardData> liveGames, UiEventBracket uiEventBracket, Map<UUID, UiEcEvent> map, Map<UUID, EventQuote> map2, Map<UUID, UiEventContractPosition> map3, BracketNavigationInfo navigationInfo, ImmutableList3<EventTopic> immutableList3, Map<UUID, EventGameData> map4, String str, Map<UUID, EventContractRealizedPnlByContract> map5, Boolean bool) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        Intrinsics.checkNotNullParameter(eventBracketVariant, "eventBracketVariant");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(liveGames, "liveGames");
        Intrinsics.checkNotNullParameter(navigationInfo, "navigationInfo");
        this.topicId = uuid;
        this.bracketId = bracketId;
        this.selectedTabIndex = i;
        this.isInEcV3Exp = z;
        this.eventBracketVariant = eventBracketVariant;
        this.tabs = tabs;
        this.liveGames = liveGames;
        this.bracket = uiEventBracket;
        this.eventsMap = map;
        this.contractIdToQuotes = map2;
        this.contractIdToPositions = map3;
        this.navigationInfo = navigationInfo;
        this.relevantEventTopics = immutableList3;
        this.eventIdToEventGameDataMap = map4;
        this.individualAccountNumber = str;
        this.contractIdToRealizedPnl = map5;
        this.isWeekAfterFinalEvent = bool;
    }

    public final UUID getTopicId() {
        return this.topicId;
    }

    public final UUID getBracketId() {
        return this.bracketId;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final boolean isInEcV3Exp() {
        return this.isInEcV3Exp;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EventsTournamentBracketDataState(UUID uuid, UUID uuid2, int i, boolean z, EventBracketExperiment.Variants variants, ImmutableList immutableList, ImmutableList3 immutableList3, UiEventBracket uiEventBracket, Map map, Map map2, Map map3, BracketNavigationInfo bracketNavigationInfo, ImmutableList3 immutableList32, Map map4, String str, Map map5, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        ImmutableList immutableListPersistentListOf;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        EventBracketExperiment.Variants variants2 = (i2 & 16) != 0 ? EventBracketExperiment.Variants.CONTROL : variants;
        if ((i2 & 32) != 0) {
            StringResource.Companion companion = StringResource.INSTANCE;
            immutableListPersistentListOf = extensions2.persistentListOf(new TabData(companion.invoke(C17135R.string.events_tournament_bracket_tab_all, new Object[0])), new TabData(companion.invoke(C17135R.string.events_tournament_bracket_tab_live, new Object[0])));
        } else {
            immutableListPersistentListOf = immutableList;
        }
        this(uuid, uuid2, i, z2, variants2, immutableListPersistentListOf, (i2 & 64) != 0 ? extensions2.persistentListOf() : immutableList3, (i2 & 128) != 0 ? null : uiEventBracket, (i2 & 256) != 0 ? null : map, (i2 & 512) != 0 ? null : map2, (i2 & 1024) != 0 ? null : map3, (i2 & 2048) != 0 ? new BracketNavigationInfo(extensions2.persistentListOf(), extensions2.persistentListOf()) : bracketNavigationInfo, (i2 & 4096) != 0 ? null : immutableList32, (i2 & 8192) != 0 ? null : map4, (i2 & 16384) != 0 ? null : str, (32768 & i2) != 0 ? null : map5, (i2 & 65536) != 0 ? null : bool);
    }

    public final EventBracketExperiment.Variants getEventBracketVariant() {
        return this.eventBracketVariant;
    }

    public final ImmutableList<TabData> getTabs() {
        return this.tabs;
    }

    public final ImmutableList3<BracketGameOverviewCardData> getLiveGames() {
        return this.liveGames;
    }

    public final UiEventBracket getBracket() {
        return this.bracket;
    }

    public final Map<UUID, UiEcEvent> getEventsMap() {
        return this.eventsMap;
    }

    public final Map<UUID, EventQuote> getContractIdToQuotes() {
        return this.contractIdToQuotes;
    }

    public final Map<UUID, UiEventContractPosition> getContractIdToPositions() {
        return this.contractIdToPositions;
    }

    public final BracketNavigationInfo getNavigationInfo() {
        return this.navigationInfo;
    }

    public final ImmutableList3<EventTopic> getRelevantEventTopics() {
        return this.relevantEventTopics;
    }

    public final Map<UUID, EventGameData> getEventIdToEventGameDataMap() {
        return this.eventIdToEventGameDataMap;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final Map<UUID, EventContractRealizedPnlByContract> getContractIdToRealizedPnl() {
        return this.contractIdToRealizedPnl;
    }

    public final Boolean isWeekAfterFinalEvent() {
        return this.isWeekAfterFinalEvent;
    }

    public final ImmutableList3<BracketRoundData> buildRounds() {
        List<EventId> eventIdList;
        UiEventBracket uiEventBracket = this.bracket;
        Integer numValueOf = (uiEventBracket == null || (eventIdList = uiEventBracket.getEventIdList()) == null) ? null : Integer.valueOf(eventIdList.size());
        Map<UUID, UiEcEvent> map = this.eventsMap;
        if (!Intrinsics.areEqual(numValueOf, map != null ? Integer.valueOf(map.size()) : null)) {
            return extensions2.persistentListOf();
        }
        Map<UUID, UiEcEvent> map2 = this.eventsMap;
        if (map2 != null) {
            return BuildTournamentBracket.buildBracket(map2, this.contractIdToQuotes, this.contractIdToPositions, this.eventIdToEventGameDataMap, this.contractIdToRealizedPnl);
        }
        return extensions2.persistentListOf();
    }

    public final ImmutableList<EventsTournamentSwitcherData.EventTopic> getSwitcherRelevantTopics() {
        List listEmptyList;
        ImmutableList3<EventTopic> immutableList3 = this.relevantEventTopics;
        if (immutableList3 != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
            for (EventTopic eventTopic : immutableList3) {
                if (eventTopic.getType() != EventTopic4.EVENT_TOPIC_TYPE_BRACKET) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                listEmptyList.add(new EventsTournamentSwitcherData.EventTopic(StringResource.INSTANCE.invoke(eventTopic.getName()), eventTopic.getId(), eventTopic.getTypeId()));
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return extensions2.toPersistentList(listEmptyList);
    }

    public final AppBarData getAppBarData() {
        return BuildAppBarData.buildBracketAppBarData(this.bracket, this.eventsMap, this.eventIdToEventGameDataMap, this.contractIdToRealizedPnl);
    }

    public final EventTournamentBracketHeaderData getEventTournamentBracketHeaderData() {
        EventBracket bracket;
        EventBracketTradeButtonMetadata tradeButtonMetadata;
        UiEventBracket uiEventBracket = this.bracket;
        if (uiEventBracket == null || (bracket = uiEventBracket.getBracket()) == null || (tradeButtonMetadata = bracket.getTradeButtonMetadata()) == null) {
            return null;
        }
        String text = tradeButtonMetadata.getText();
        String backgroundImageUrl = this.bracket.getBracket().getBackgroundImageUrl();
        if (backgroundImageUrl == null) {
            backgroundImageUrl = "";
        }
        return new EventTournamentBracketHeaderData(text, backgroundImageUrl, tradeButtonMetadata.getTradeButtonEventId(), tradeButtonMetadata.getText());
    }
}
