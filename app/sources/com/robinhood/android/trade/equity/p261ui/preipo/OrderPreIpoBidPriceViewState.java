package com.robinhood.android.trade.equity.p261ui.preipo;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPreIpoBidPriceViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceViewState;", "", "instrumentId", "Ljava/util/UUID;", "ipoQuote", "Lcom/robinhood/directipo/models/db/IpoQuote;", "instrument", "Lcom/robinhood/models/db/Instrument;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/directipo/models/db/IpoQuote;Lcom/robinhood/models/db/Instrument;Ljava/math/BigDecimal;)V", "getInstrumentId", "()Ljava/util/UUID;", "getIpoQuote", "()Lcom/robinhood/directipo/models/db/IpoQuote;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getPrice", "()Ljava/math/BigDecimal;", "numpadButtonEnabled", "", "getNumpadButtonEnabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderPreIpoBidPriceViewState {
    public static final int $stable = 8;
    private final Instrument instrument;
    private final UUID instrumentId;
    private final IpoQuote ipoQuote;
    private final boolean numpadButtonEnabled;
    private final BigDecimal price;

    public OrderPreIpoBidPriceViewState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OrderPreIpoBidPriceViewState copy$default(OrderPreIpoBidPriceViewState orderPreIpoBidPriceViewState, UUID uuid, IpoQuote ipoQuote, Instrument instrument, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = orderPreIpoBidPriceViewState.instrumentId;
        }
        if ((i & 2) != 0) {
            ipoQuote = orderPreIpoBidPriceViewState.ipoQuote;
        }
        if ((i & 4) != 0) {
            instrument = orderPreIpoBidPriceViewState.instrument;
        }
        if ((i & 8) != 0) {
            bigDecimal = orderPreIpoBidPriceViewState.price;
        }
        return orderPreIpoBidPriceViewState.copy(uuid, ipoQuote, instrument, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final IpoQuote getIpoQuote() {
        return this.ipoQuote;
    }

    /* renamed from: component3, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    public final OrderPreIpoBidPriceViewState copy(UUID instrumentId, IpoQuote ipoQuote, Instrument instrument, BigDecimal price) {
        return new OrderPreIpoBidPriceViewState(instrumentId, ipoQuote, instrument, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPreIpoBidPriceViewState)) {
            return false;
        }
        OrderPreIpoBidPriceViewState orderPreIpoBidPriceViewState = (OrderPreIpoBidPriceViewState) other;
        return Intrinsics.areEqual(this.instrumentId, orderPreIpoBidPriceViewState.instrumentId) && Intrinsics.areEqual(this.ipoQuote, orderPreIpoBidPriceViewState.ipoQuote) && Intrinsics.areEqual(this.instrument, orderPreIpoBidPriceViewState.instrument) && Intrinsics.areEqual(this.price, orderPreIpoBidPriceViewState.price);
    }

    public int hashCode() {
        UUID uuid = this.instrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        IpoQuote ipoQuote = this.ipoQuote;
        int iHashCode2 = (iHashCode + (ipoQuote == null ? 0 : ipoQuote.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        return iHashCode3 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "OrderPreIpoBidPriceViewState(instrumentId=" + this.instrumentId + ", ipoQuote=" + this.ipoQuote + ", instrument=" + this.instrument + ", price=" + this.price + ")";
    }

    public OrderPreIpoBidPriceViewState(UUID uuid, IpoQuote ipoQuote, Instrument instrument, BigDecimal bigDecimal) {
        this.instrumentId = uuid;
        this.ipoQuote = ipoQuote;
        this.instrument = instrument;
        this.price = bigDecimal;
        this.numpadButtonEnabled = BigDecimals7.isPositive(bigDecimal);
    }

    public /* synthetic */ OrderPreIpoBidPriceViewState(UUID uuid, IpoQuote ipoQuote, Instrument instrument, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : ipoQuote, (i & 4) != 0 ? null : instrument, (i & 8) != 0 ? null : bigDecimal);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final IpoQuote getIpoQuote() {
        return this.ipoQuote;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final boolean getNumpadButtonEnabled() {
        return this.numpadButtonEnabled;
    }
}
