package com.robinhood.android.investFlow.search.item;

import com.robinhood.android.investFlow.search.item.DiscoveryItemViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoveryItemDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDataState;", "", "instrumentId", "Ljava/util/UUID;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "selected", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getSelected", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DiscoveryItemDataState {
    private final Instrument instrument;
    private final UUID instrumentId;
    private final Quote quote;
    private final boolean selected;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateProvider<DiscoveryItemDataState, DiscoveryItemViewState> StateProvider = new StateProvider() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemDataState$Companion$StateProvider$1
        @Override // com.robinhood.android.udf.StateProvider
        public final DiscoveryItemViewState reduce(DiscoveryItemDataState dataState) {
            UUID instrumentId;
            Money lastTradePrice;
            String str;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            DiscoveryItemViewState.Loading loading = new DiscoveryItemViewState.Loading(dataState.getSelected());
            Instrument instrument = dataState.getInstrument();
            if (instrument != null && (instrumentId = dataState.getInstrumentId()) != null) {
                String symbol = instrument.getSymbol();
                String displayName = instrument.getDisplayName();
                Quote quote = dataState.getQuote();
                if (quote != null && (lastTradePrice = quote.getLastTradePrice()) != null && (str = Money.format$default(lastTradePrice, null, false, null, false, 0, null, false, null, false, false, 1023, null)) != null) {
                    return new DiscoveryItemViewState.Loaded(instrumentId, symbol, displayName, str, dataState.getSelected());
                }
            }
            return loading;
        }
    };

    public DiscoveryItemDataState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ DiscoveryItemDataState copy$default(DiscoveryItemDataState discoveryItemDataState, UUID uuid, Instrument instrument, Quote quote, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = discoveryItemDataState.instrumentId;
        }
        if ((i & 2) != 0) {
            instrument = discoveryItemDataState.instrument;
        }
        if ((i & 4) != 0) {
            quote = discoveryItemDataState.quote;
        }
        if ((i & 8) != 0) {
            z = discoveryItemDataState.selected;
        }
        return discoveryItemDataState.copy(uuid, instrument, quote, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component3, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final DiscoveryItemDataState copy(UUID instrumentId, Instrument instrument, Quote quote, boolean selected) {
        return new DiscoveryItemDataState(instrumentId, instrument, quote, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoveryItemDataState)) {
            return false;
        }
        DiscoveryItemDataState discoveryItemDataState = (DiscoveryItemDataState) other;
        return Intrinsics.areEqual(this.instrumentId, discoveryItemDataState.instrumentId) && Intrinsics.areEqual(this.instrument, discoveryItemDataState.instrument) && Intrinsics.areEqual(this.quote, discoveryItemDataState.quote) && this.selected == discoveryItemDataState.selected;
    }

    public int hashCode() {
        UUID uuid = this.instrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Quote quote = this.quote;
        return ((iHashCode2 + (quote != null ? quote.hashCode() : 0)) * 31) + Boolean.hashCode(this.selected);
    }

    public String toString() {
        return "DiscoveryItemDataState(instrumentId=" + this.instrumentId + ", instrument=" + this.instrument + ", quote=" + this.quote + ", selected=" + this.selected + ")";
    }

    public DiscoveryItemDataState(UUID uuid, Instrument instrument, Quote quote, boolean z) {
        this.instrumentId = uuid;
        this.instrument = instrument;
        this.quote = quote;
        this.selected = z;
    }

    public /* synthetic */ DiscoveryItemDataState(UUID uuid, Instrument instrument, Quote quote, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : quote, (i & 8) != 0 ? false : z);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* compiled from: DiscoveryItemDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDataState$Companion;", "", "<init>", "()V", "StateProvider", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDataState;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;", "getStateProvider", "()Lcom/robinhood/android/udf/StateProvider;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StateProvider<DiscoveryItemDataState, DiscoveryItemViewState> getStateProvider() {
            return DiscoveryItemDataState.StateProvider;
        }
    }
}
