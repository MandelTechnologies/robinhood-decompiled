package com.robinhood.android.search.highlights.p249ui.sports;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.models.card.p311db.Card;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: SearchHighlightSportsCardDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0084\u0001\u0010!\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001aR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b0\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001fR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b5\u0010\u0016¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDataState;", "", "", "", "contractDescriptionMap", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "ecEvent", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "eventState", "", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "contracts", "", "loading", "j$/time/Clock", Card.Icon.CLOCK, "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "quoteMap", "<init>", "(Ljava/util/Map;Lcom/robinhood/android/models/event/ui/UiEcEvent;Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;Ljava/util/Map;ZLj$/time/Clock;Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "component2", "()Lcom/robinhood/android/models/event/ui/UiEcEvent;", "component3", "()Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "component4", "component5", "()Z", "component6", "()Lj$/time/Clock;", "component7", "copy", "(Ljava/util/Map;Lcom/robinhood/android/models/event/ui/UiEcEvent;Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;Ljava/util/Map;ZLj$/time/Clock;Ljava/util/Map;)Lcom/robinhood/android/search/highlights/ui/sports/SearchHighlightSportsCardDataState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getContractDescriptionMap", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "getEcEvent", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "getEventState", "getContracts", "Z", "getLoading", "Lj$/time/Clock;", "getClock", "getQuoteMap", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightSportsCardDataState {
    public static final int $stable = 8;
    private final Clock clock;
    private final Map<String, String> contractDescriptionMap;
    private final Map<Integer, EventContract> contracts;
    private final UiEcEvent ecEvent;
    private final PredictionMarketEventState eventState;
    private final boolean loading;
    private final Map<UUID, EventQuote> quoteMap;

    public static /* synthetic */ SearchHighlightSportsCardDataState copy$default(SearchHighlightSportsCardDataState searchHighlightSportsCardDataState, Map map, UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, Map map2, boolean z, Clock clock, Map map3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = searchHighlightSportsCardDataState.contractDescriptionMap;
        }
        if ((i & 2) != 0) {
            uiEcEvent = searchHighlightSportsCardDataState.ecEvent;
        }
        if ((i & 4) != 0) {
            predictionMarketEventState = searchHighlightSportsCardDataState.eventState;
        }
        if ((i & 8) != 0) {
            map2 = searchHighlightSportsCardDataState.contracts;
        }
        if ((i & 16) != 0) {
            z = searchHighlightSportsCardDataState.loading;
        }
        if ((i & 32) != 0) {
            clock = searchHighlightSportsCardDataState.clock;
        }
        if ((i & 64) != 0) {
            map3 = searchHighlightSportsCardDataState.quoteMap;
        }
        Clock clock2 = clock;
        Map map4 = map3;
        boolean z2 = z;
        PredictionMarketEventState predictionMarketEventState2 = predictionMarketEventState;
        return searchHighlightSportsCardDataState.copy(map, uiEcEvent, predictionMarketEventState2, map2, z2, clock2, map4);
    }

    public final Map<String, String> component1() {
        return this.contractDescriptionMap;
    }

    /* renamed from: component2, reason: from getter */
    public final UiEcEvent getEcEvent() {
        return this.ecEvent;
    }

    /* renamed from: component3, reason: from getter */
    public final PredictionMarketEventState getEventState() {
        return this.eventState;
    }

    public final Map<Integer, EventContract> component4() {
        return this.contracts;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component6, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    public final Map<UUID, EventQuote> component7() {
        return this.quoteMap;
    }

    public final SearchHighlightSportsCardDataState copy(Map<String, String> contractDescriptionMap, UiEcEvent ecEvent, PredictionMarketEventState eventState, Map<Integer, EventContract> contracts2, boolean loading, Clock clock, Map<UUID, EventQuote> quoteMap) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        return new SearchHighlightSportsCardDataState(contractDescriptionMap, ecEvent, eventState, contracts2, loading, clock, quoteMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlightSportsCardDataState)) {
            return false;
        }
        SearchHighlightSportsCardDataState searchHighlightSportsCardDataState = (SearchHighlightSportsCardDataState) other;
        return Intrinsics.areEqual(this.contractDescriptionMap, searchHighlightSportsCardDataState.contractDescriptionMap) && Intrinsics.areEqual(this.ecEvent, searchHighlightSportsCardDataState.ecEvent) && Intrinsics.areEqual(this.eventState, searchHighlightSportsCardDataState.eventState) && Intrinsics.areEqual(this.contracts, searchHighlightSportsCardDataState.contracts) && this.loading == searchHighlightSportsCardDataState.loading && Intrinsics.areEqual(this.clock, searchHighlightSportsCardDataState.clock) && Intrinsics.areEqual(this.quoteMap, searchHighlightSportsCardDataState.quoteMap);
    }

    public int hashCode() {
        Map<String, String> map = this.contractDescriptionMap;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        UiEcEvent uiEcEvent = this.ecEvent;
        int iHashCode2 = (iHashCode + (uiEcEvent == null ? 0 : uiEcEvent.hashCode())) * 31;
        PredictionMarketEventState predictionMarketEventState = this.eventState;
        int iHashCode3 = (iHashCode2 + (predictionMarketEventState == null ? 0 : predictionMarketEventState.hashCode())) * 31;
        Map<Integer, EventContract> map2 = this.contracts;
        int iHashCode4 = (((((iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31) + Boolean.hashCode(this.loading)) * 31) + this.clock.hashCode()) * 31;
        Map<UUID, EventQuote> map3 = this.quoteMap;
        return iHashCode4 + (map3 != null ? map3.hashCode() : 0);
    }

    public String toString() {
        return "SearchHighlightSportsCardDataState(contractDescriptionMap=" + this.contractDescriptionMap + ", ecEvent=" + this.ecEvent + ", eventState=" + this.eventState + ", contracts=" + this.contracts + ", loading=" + this.loading + ", clock=" + this.clock + ", quoteMap=" + this.quoteMap + ")";
    }

    public SearchHighlightSportsCardDataState(Map<String, String> map, UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, Map<Integer, EventContract> map2, boolean z, Clock clock, Map<UUID, EventQuote> map3) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.contractDescriptionMap = map;
        this.ecEvent = uiEcEvent;
        this.eventState = predictionMarketEventState;
        this.contracts = map2;
        this.loading = z;
        this.clock = clock;
        this.quoteMap = map3;
    }

    public /* synthetic */ SearchHighlightSportsCardDataState(Map map, UiEcEvent uiEcEvent, PredictionMarketEventState predictionMarketEventState, Map map2, boolean z, Clock clock, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : uiEcEvent, (i & 4) != 0 ? null : predictionMarketEventState, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? true : z, clock, (i & 64) != 0 ? null : map3);
    }

    public final Map<String, String> getContractDescriptionMap() {
        return this.contractDescriptionMap;
    }

    public final UiEcEvent getEcEvent() {
        return this.ecEvent;
    }

    public final PredictionMarketEventState getEventState() {
        return this.eventState;
    }

    public final Map<Integer, EventContract> getContracts() {
        return this.contracts;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final Map<UUID, EventQuote> getQuoteMap() {
        return this.quoteMap;
    }
}
