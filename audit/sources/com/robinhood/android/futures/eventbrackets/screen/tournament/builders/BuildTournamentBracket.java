package com.robinhood.android.futures.eventbrackets.screen.tournament.builders;

import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventGameData2;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketGameOverviewCardData;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketGameSeedData;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketMatchState;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketRoundData;
import com.robinhood.android.futures.eventbrackets.screen.tournament.utils.BigDecimals;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventLiveDataBackup;
import com.robinhood.android.models.event.p186db.arsenal.EventMetadata;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p186db.ceres.EventContractRealizedPnlByContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventGameData;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.models.util.Money;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BuildTournamentBracket.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001az\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004H\u0000\u001a$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u001a>\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004H\u0002\u001a\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u0016H\u0000\u001a(\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004H\u0002\u001a.\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u001a,\u0010 \u001a\u0004\u0018\u00010\u0018*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0000¨\u0006#"}, m3636d2 = {"buildBracket", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "sortedEventsMap", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "contractIdToQuotes", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "contractIdToPositions", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "eventIdToEventGameDataMap", "Lcom/robinhood/android/models/event/db/marketdata/EventGameData;", "contractIdToRealizedPnl", "Lcom/robinhood/android/models/event/db/ceres/EventContractRealizedPnlByContract;", "canNavigateToEdp", "", "uiEvent", "seed1", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "seed2", "getRealizedPnlForEvent", "Lcom/robinhood/models/util/Money;", "currencyDeltaFormat", "", "computeRealizedPnlForEventHelper", "event", "getBracketMatchState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "isViewModeMulti", "gameStatus", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/GameStatus;", "getTeamScore", "contractId", "eventId", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildTournamentBracketKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildTournamentBracket {

    /* compiled from: BuildTournamentBracket.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildTournamentBracketKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventViewMode.values().length];
            try {
                iArr[EventViewMode.PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventViewMode.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventViewMode.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImmutableList3<BracketRoundData> buildBracket(Map<UUID, UiEcEvent> sortedEventsMap, Map<UUID, EventQuote> map, Map<UUID, UiEventContractPosition> map2, Map<UUID, EventGameData> map3, Map<UUID, EventContractRealizedPnlByContract> map4) {
        UiEventContractPosition uiEventContractPosition;
        BigDecimal quantity;
        boolean z;
        String displayLabel;
        EventGameData eventGameData;
        EventGameData eventGameData2;
        String displayLabel2;
        BracketGameSeedData bracketGameSeedData;
        String str;
        EventQuote eventQuote;
        BigDecimal lastTradePrice;
        Intrinsics.checkNotNullParameter(sortedEventsMap, "sortedEventsMap");
        Collection<UiEcEvent> collectionValues = sortedEventsMap.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : collectionValues) {
            EventMetadata round = ((UiEcEvent) obj).getEvent().getRound();
            Integer numValueOf = round != null ? Integer.valueOf(round.getIndex()) : null;
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<UiEcEvent> list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (UiEcEvent uiEcEvent : list) {
                Event event = uiEcEvent.getEvent();
                SortedMap<Integer, EventContract> orderedContracts = uiEcEvent.getOrderedContracts();
                ArrayList arrayList3 = new ArrayList(orderedContracts.size());
                Iterator<Map.Entry<Integer, EventContract>> it = orderedContracts.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<Integer, EventContract> next = it.next();
                    Integer key2 = next.getKey();
                    EventContract value = next.getValue();
                    if (value != null) {
                        String namePrefix = value.getNamePrefix();
                        String str2 = namePrefix == null ? "" : namePrefix;
                        String displayLongName = value.getDisplayLongName();
                        if (map == null || (eventQuote = map.get(value.getContractId())) == null || (lastTradePrice = eventQuote.getLastTradePrice()) == null || (str = Formats.getPercentFormat().format(lastTradePrice)) == null) {
                            str = "-";
                        }
                        bracketGameSeedData = new BracketGameSeedData(str2, displayLongName, str, value.getLightThemeColor(), value.getDarkThemeColor(), map3 != null ? getTeamScore(map3, value.getContractId(), event.getEventId()) : null);
                    } else {
                        bracketGameSeedData = null;
                    }
                    arrayList3.add(Tuples4.m3642to(key2, bracketGameSeedData));
                }
                Map map5 = MapsKt.toMap(arrayList3);
                Collection<EventContract> collectionValues2 = uiEcEvent.getOrderedContracts().values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
                Collection<EventContract> collection = collectionValues2;
                if ((collection instanceof Collection) && collection.isEmpty()) {
                    z = false;
                } else {
                    for (EventContract eventContract : collection) {
                        if (map2 != null && (uiEventContractPosition = map2.get(eventContract.getContractId())) != null && (quantity = uiEventContractPosition.getQuantity()) != null && !BigDecimals7.isZero(quantity)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                Tuples2<Integer, Integer> homeAndAwayIndicesPair = BuildEventGameDataContext.getHomeAndAwayIndicesPair(event.getViewMode(), map5);
                Integer numComponent1 = homeAndAwayIndicesPair.component1();
                Integer numComponent2 = homeAndAwayIndicesPair.component2();
                BracketGameSeedData bracketGameSeedData2 = (BracketGameSeedData) map5.get(numComponent1);
                BracketGameSeedData bracketGameSeedData3 = (BracketGameSeedData) map5.get(numComponent2);
                Money realizedPnlForEvent = getRealizedPnlForEvent(uiEcEvent, map3, map4);
                UUID eventId = event.getEventId();
                if (map3 == null || (eventGameData2 = map3.get(event.getEventId())) == null || (displayLabel2 = eventGameData2.getDisplayLabel()) == null) {
                    EventLiveDataBackup eventLiveDataBackup = event.getEventLiveDataBackup();
                    displayLabel = eventLiveDataBackup != null ? eventLiveDataBackup.getDisplayLabel() : "";
                } else {
                    displayLabel = displayLabel2;
                }
                arrayList2.add(new BracketGameOverviewCardData(eventId, bracketGameSeedData2, bracketGameSeedData3, displayLabel, getBracketMatchState(event.getViewMode() == EventViewMode.MULTI, (map3 == null || (eventGameData = map3.get(event.getEventId())) == null) ? null : eventGameData.getStatus(), bracketGameSeedData2, bracketGameSeedData3), z, realizedPnlForEvent, canNavigateToEdp(uiEcEvent, bracketGameSeedData2, bracketGameSeedData3)));
            }
            linkedHashMap2.put(key, arrayList2);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList4.add(new BracketRoundData(extensions2.toPersistentList((Iterable) ((Map.Entry) it2.next()).getValue())));
        }
        return extensions2.toPersistentList(arrayList4);
    }

    private static final boolean canNavigateToEdp(UiEcEvent uiEcEvent, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2) {
        boolean z;
        int i = WhenMappings.$EnumSwitchMapping$0[uiEcEvent.getEvent().getViewMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            z = (bracketGameSeedData == null || bracketGameSeedData2 == null) ? false : true;
        }
        return uiEcEvent.isActive() && z;
    }

    private static final Money getRealizedPnlForEvent(UiEcEvent uiEcEvent, Map<UUID, EventGameData> map, Map<UUID, EventContractRealizedPnlByContract> map2) {
        EventGameData eventGameData;
        ApiEventGameData2 status;
        if (uiEcEvent.isFinalEvent()) {
            return computeRealizedPnlForEventHelper(uiEcEvent, map2);
        }
        if (map == null || (eventGameData = map.get(uiEcEvent.getEvent().getEventId())) == null || (status = eventGameData.getStatus()) == null || !status.isGameOver()) {
            return null;
        }
        return computeRealizedPnlForEventHelper(uiEcEvent, map2);
    }

    public static final String currencyDeltaFormat(Money money) {
        BigDecimal decimalValue;
        if (money == null || (decimalValue = money.getDecimalValue()) == null) {
            return null;
        }
        if (BigDecimals7.isZero(decimalValue)) {
            return Formats.getWholeNumberCurrencyFormat().format(decimalValue);
        }
        return Formats.getCurrencyDeltaFormat().format(decimalValue);
    }

    private static final Money computeRealizedPnlForEventHelper(UiEcEvent uiEcEvent, Map<UUID, EventContractRealizedPnlByContract> map) {
        EventContractRealizedPnlByContract eventContractRealizedPnlByContract;
        SortedMap<Integer, EventContract> orderedContracts = uiEcEvent.getOrderedContracts();
        ArrayList arrayList = new ArrayList(orderedContracts.size());
        Iterator<Map.Entry<Integer, EventContract>> it = orderedContracts.entrySet().iterator();
        while (true) {
            Money realizedPnl = null;
            if (!it.hasNext()) {
                break;
            }
            EventContract value = it.next().getValue();
            if (map != null && (eventContractRealizedPnlByContract = map.get(value.getContractId())) != null) {
                realizedPnl = eventContractRealizedPnlByContract.getRealizedPnl();
            }
            arrayList.add(realizedPnl);
        }
        Iterator it2 = CollectionsKt.filterNotNull(arrayList).iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Money moneyPlus = (Money) it2.next();
        while (it2.hasNext()) {
            moneyPlus = moneyPlus.plus((Money) it2.next());
        }
        return moneyPlus;
    }

    private static final BracketMatchState getBracketMatchState(boolean z, ApiEventGameData2 apiEventGameData2, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2) {
        String score;
        String score2;
        if (apiEventGameData2 == ApiEventGameData2.HALFTIME || apiEventGameData2 == ApiEventGameData2.IN_PROGRESS) {
            return new BracketMatchState.Tradeable(true);
        }
        if (apiEventGameData2 != ApiEventGameData2.FINAL) {
            if (bracketGameSeedData == null && bracketGameSeedData2 == null) {
                return new BracketMatchState.Locked(z);
            }
            return new BracketMatchState.Tradeable(false);
        }
        BigDecimal bigDecimalOrNull = null;
        BigDecimal bigDecimalOrNull2 = (bracketGameSeedData == null || (score2 = bracketGameSeedData.getScore()) == null) ? null : StringsKt.toBigDecimalOrNull(score2);
        if (bracketGameSeedData2 != null && (score = bracketGameSeedData2.getScore()) != null) {
            bigDecimalOrNull = StringsKt.toBigDecimalOrNull(score);
        }
        if (bigDecimalOrNull2 != null && bigDecimalOrNull != null) {
            return new BracketMatchState.Resolved(bigDecimalOrNull2.compareTo(bigDecimalOrNull) > 0);
        }
        return new BracketMatchState.Tradeable(false);
    }

    public static final String getTeamScore(Map<UUID, EventGameData> map, UUID contractId, UUID eventId) {
        EventGameData eventGameData;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (map != null && (eventGameData = map.get(eventId)) != null) {
            if (Intrinsics.areEqual(contractId, eventGameData.getHomeId())) {
                BigDecimal homePoints = eventGameData.getHomePoints();
                if (homePoints != null) {
                    return BigDecimals.formatIntegerWithoutGroupingFormat(homePoints);
                }
                return null;
            }
            if (Intrinsics.areEqual(contractId, eventGameData.getAwayId())) {
                BigDecimal awayPoints = eventGameData.getAwayPoints();
                if (awayPoints != null) {
                    return BigDecimals.formatIntegerWithoutGroupingFormat(awayPoints);
                }
                return null;
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Invalid contractId " + contractId + " for event with ID " + eventId), false, null, 6, null);
        }
        return null;
    }
}
