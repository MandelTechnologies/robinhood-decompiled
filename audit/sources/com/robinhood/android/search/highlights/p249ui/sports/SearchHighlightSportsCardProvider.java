package com.robinhood.android.search.highlights.p249ui.sports;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtil;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState3;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.search.highlights.C27914R;
import com.robinhood.android.search.highlights.model.ProbabilitySegment;
import com.robinhood.android.search.highlights.p249ui.sports.SearchHighlightSportsCardViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;

/* compiled from: SearchHighlightSportsCardProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDataState;", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState;", "<init>", "()V", "reduce", "dataState", "createTimeIndicatorLabel", "Lcom/robinhood/utils/resource/StringResource;", "eventState", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "Companion", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightSportsCardProvider implements StateProvider<SearchHighlightSportsCardDataState, SearchHighlightSportsCardViewState> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ZoneId timeZone = ZoneId.systemDefault();
    private static final SearchHighlightSportsCardViewState defaultViewState = new SearchHighlightSportsCardViewState(false, null, null, null, true, null, 32, null);

    /* compiled from: SearchHighlightSportsCardProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PredictionMarketEventState3.values().length];
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PredictionMarketEventState3.EVENT_STATUS_PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public SearchHighlightSportsCardViewState reduce(SearchHighlightSportsCardDataState dataState) {
        Map<Integer, EventContract> contracts2;
        Map<String, String> contractDescriptionMap;
        Event event;
        EventContract eventContract;
        SearchHighlightSportsCardProvider searchHighlightSportsCardProvider;
        boolean z;
        String str;
        EventQuote eventQuote;
        BigDecimal lastTradePrice;
        EventQuote eventQuote2;
        BigDecimal lastTradePrice2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        PredictionMarketEventState eventState = dataState.getEventState();
        if (eventState != null && (contracts2 = dataState.getContracts()) != null && (contractDescriptionMap = dataState.getContractDescriptionMap()) != null) {
            UiEcEvent ecEvent = dataState.getEcEvent();
            if (ecEvent == null || (event = ecEvent.getEvent()) == null) {
                return defaultViewState;
            }
            if (contracts2.size() != 2) {
                return defaultViewState;
            }
            EventContract eventContract2 = contracts2.get(0);
            if (eventContract2 != null && (eventContract = contracts2.get(1)) != null) {
                DayNightColor dayNightColor = DayNightColor2.getDayNightColor(eventContract2);
                DayNightColor dayNightColor2 = DayNightColor2.getDayNightColor(eventContract);
                PredictionMarketEventState eventState2 = dataState.getEventState();
                ImmutableList3 immutableList3PersistentListOf = null;
                PredictionMarketEventState3 eventStatus = eventState2 != null ? eventState2.getEventStatus() : null;
                int i = eventStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventStatus.ordinal()];
                if (i == 1 || i == 2) {
                    searchHighlightSportsCardProvider = this;
                    z = true;
                } else {
                    searchHighlightSportsCardProvider = this;
                    z = false;
                }
                StringResource stringResourceCreateTimeIndicatorLabel = searchHighlightSportsCardProvider.createTimeIndicatorLabel(dataState, eventState);
                String str2 = eventState.getContractIdToEventScore().get(eventContract2.getContractId());
                String str3 = (str2 == null && (str2 = contractDescriptionMap.get(Uuids.toStringOrEmpty(eventContract2.getContractId()))) == null) ? "" : str2;
                Boolean bool = eventState.getContractIdToVisualIndicator().get(eventContract2.getContractId());
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                String str4 = eventState.getContractIdToEventScore().get(eventContract.getContractId());
                if (str4 == null) {
                    String str5 = contractDescriptionMap.get(Uuids.toStringOrEmpty(eventContract.getContractId()));
                    str = str5 == null ? "" : str5;
                } else {
                    str = str4;
                }
                Boolean bool2 = eventState.getContractIdToVisualIndicator().get(eventContract.getContractId());
                ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(new SearchHighlightSportsCardViewState.ContractRowItem(eventContract2.getImageUrl(), eventContract2.getDisplayShortName(), str3, zBooleanValue, dayNightColor), new SearchHighlightSportsCardViewState.ContractRowItem(eventContract.getImageUrl(), eventContract.getDisplayShortName(), str, bool2 != null ? bool2.booleanValue() : false, dayNightColor2));
                Map<UUID, EventQuote> quoteMap = dataState.getQuoteMap();
                Float fValueOf = (quoteMap == null || (eventQuote2 = quoteMap.get(eventContract2.getContractId())) == null || (lastTradePrice2 = eventQuote2.getLastTradePrice()) == null) ? null : Float.valueOf(lastTradePrice2.floatValue());
                Map<UUID, EventQuote> quoteMap2 = dataState.getQuoteMap();
                Float fValueOf2 = (quoteMap2 == null || (eventQuote = quoteMap2.get(eventContract.getContractId())) == null || (lastTradePrice = eventQuote.getLastTradePrice()) == null) ? null : Float.valueOf(lastTradePrice.floatValue());
                if (fValueOf != null && fValueOf2 != null) {
                    immutableList3PersistentListOf = extensions2.persistentListOf(new ProbabilitySegment(fValueOf.floatValue(), dayNightColor), new ProbabilitySegment(fValueOf2.floatValue(), dayNightColor2));
                }
                return new SearchHighlightSportsCardViewState(z, event.getEventId(), stringResourceCreateTimeIndicatorLabel, immutableList3PersistentListOf2, dataState.getLoading(), immutableList3PersistentListOf);
            }
            return defaultViewState;
        }
        return defaultViewState;
    }

    private final StringResource createTimeIndicatorLabel(SearchHighlightSportsCardDataState searchHighlightSportsCardDataState, PredictionMarketEventState predictionMarketEventState) {
        StringResource eventStartTimeText;
        if (predictionMarketEventState.getEventProgress().length() > 0) {
            return StringResource.INSTANCE.invoke(predictionMarketEventState.getEventProgress());
        }
        Instant gameStartTimestamp = predictionMarketEventState.getGameStartTimestamp();
        if (gameStartTimestamp != null) {
            LocalDate localDateNow = LocalDate.now(searchHighlightSportsCardDataState.getClock());
            ZoneId zoneId = timeZone;
            LocalDate localDateOfInstant = LocalDate.ofInstant(gameStartTimestamp, zoneId);
            LocalTime localTimeOfInstant = LocalTime.ofInstant(gameStartTimestamp, zoneId);
            LocalDate localDatePlusDays = localDateNow.plusDays(1L);
            LocalTimeFormatter localTimeFormatter = LocalTimeFormatter.SHORT;
            Intrinsics.checkNotNull(localTimeOfInstant);
            String str = localTimeFormatter.format(localTimeOfInstant);
            if (Intrinsics.areEqual(localDateOfInstant, localDateNow)) {
                eventStartTimeText = StringResource.INSTANCE.invoke(C27914R.string.ec_game_today, str);
            } else if (Intrinsics.areEqual(localDateOfInstant, localDatePlusDays)) {
                eventStartTimeText = StringResource.INSTANCE.invoke(C27914R.string.ec_game_tomorrow, str);
            } else {
                eventStartTimeText = EventStartTimeStringUtil.getEventStartTimeText(gameStartTimestamp, predictionMarketEventState.getGameStartFormat());
            }
            if (eventStartTimeText != null) {
                return eventStartTimeText;
            }
        }
        return StringResource.INSTANCE.invoke(predictionMarketEventState.getEventProgress());
    }

    /* compiled from: SearchHighlightSportsCardProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardProvider$Companion;", "", "<init>", "()V", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState;", "defaultViewState", "Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState;", "getDefaultViewState", "()Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardViewState;", "j$/time/ZoneId", "kotlin.jvm.PlatformType", "timeZone", "Lj$/time/ZoneId;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SearchHighlightSportsCardViewState getDefaultViewState() {
            return SearchHighlightSportsCardProvider.defaultViewState;
        }
    }
}
