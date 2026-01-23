package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.android.futures.eventbrackets.p141ui.BracketGameOverviewCardData;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketMatchState;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketRoundData;
import com.robinhood.android.futures.eventbrackets.screen.tournament.switcher.EventsTournamentSwitcherData;
import com.robinhood.android.models.event.p186db.arsenal.EventBracket;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.UiEventBracket;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.store.experiments.EventBracketExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventsTournamentBracketStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;", "<init>", "()V", "reduce", "dataState", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventsTournamentBracketStateProvider implements StateProvider<EventsTournamentBracketDataState, EventsTournamentBracketViewState> {
    public static final int $stable = 0;
    public static final EventsTournamentBracketStateProvider INSTANCE = new EventsTournamentBracketStateProvider();

    /* compiled from: EventsTournamentBracketStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventBracketExperiment.Variants.values().length];
            try {
                iArr[EventBracketExperiment.Variants.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventBracketExperiment.Variants.BRACKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventBracketExperiment.Variants.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EventsTournamentBracketStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public EventsTournamentBracketViewState reduce(EventsTournamentBracketDataState dataState) {
        ImmutableList3 immutableList3;
        boolean z;
        EventsTournamentBracketViewState2 eventsTournamentBracketViewState2;
        EventBracket bracket;
        Integer defaultRoundIndex;
        ImmutableList3<EventTopic> relevantEventTopics;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ImmutableList3<BracketRoundData> immutableList3BuildRounds = dataState.buildRounds();
        Integer numValueOf = Integer.valueOf(CollectionsKt.getLastIndex(immutableList3BuildRounds));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        UUID bracketId = dataState.getBracketId();
        String individualAccountNumber = dataState.getIndividualAccountNumber();
        AppBarData appBarData = dataState.getAppBarData();
        int selectedTabIndex = dataState.getSelectedTabIndex();
        ImmutableList<TabData> tabs = dataState.getTabs();
        ArrayList arrayList = new ArrayList();
        Iterator<BracketRoundData> it = immutableList3BuildRounds.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, it.next().getCards());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((BracketGameOverviewCardData) obj).getState(), new BracketMatchState.Tradeable(true))) {
                arrayList2.add(obj);
            }
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList2);
        BracketNavigationInfo navigationInfo = dataState.getNavigationInfo();
        if (dataState.isInEcV3Exp() && dataState.getEventBracketVariant() != EventBracketExperiment.Variants.CONTROL && Intrinsics.areEqual(dataState.isWeekAfterFinalEvent(), Boolean.FALSE)) {
            immutableList3 = persistentList;
            z = false;
        } else {
            immutableList3 = persistentList;
            z = true;
        }
        boolean zIsEmpty = immutableList3BuildRounds.isEmpty();
        EventTournamentBracketHeaderData eventTournamentBracketHeaderData = dataState.getEventTournamentBracketHeaderData();
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getEventBracketVariant().ordinal()];
        if (i == 1) {
            eventsTournamentBracketViewState2 = null;
        } else if (i == 2) {
            eventsTournamentBracketViewState2 = EventsTournamentBracketViewState2.BRACKET;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eventsTournamentBracketViewState2 = EventsTournamentBracketViewState2.LIST;
        }
        EventsTournamentSwitcherData eventsTournamentSwitcherData = (dataState.getTopicId() == null || (relevantEventTopics = dataState.getRelevantEventTopics()) == null || relevantEventTopics.isEmpty()) ? null : new EventsTournamentSwitcherData(dataState.getSwitcherRelevantTopics(), dataState.getTopicId());
        UiEventBracket bracket2 = dataState.getBracket();
        return new EventsTournamentBracketViewState(bracketId, individualAccountNumber, appBarData, selectedTabIndex, tabs, immutableList3BuildRounds, immutableList3, navigationInfo, z, zIsEmpty, eventsTournamentBracketViewState2, eventTournamentBracketHeaderData, eventsTournamentSwitcherData, (bracket2 == null || (bracket = bracket2.getBracket()) == null || (defaultRoundIndex = bracket.getDefaultRoundIndex()) == null) ? 0 : RangesKt.coerceIn(defaultRoundIndex.intValue(), 0, iIntValue));
    }
}
