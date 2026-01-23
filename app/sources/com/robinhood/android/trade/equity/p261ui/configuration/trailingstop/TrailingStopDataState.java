package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopViewState;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TrailingStopDataState.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010!J\u0006\u0010)\u001a\u00020\u0000J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J[\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDataState;", "", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "clearInputEvent", "Lcom/robinhood/udf/UiEvent;", "", "validationResult", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult;", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/OrderTrailingPeg;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "getClearInputEvent", "()Lcom/robinhood/udf/UiEvent;", "getValidationResult", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "trailingStopPrice", "Ljava/math/BigDecimal;", "getTrailingStopPrice", "()Ljava/math/BigDecimal;", "updateTrailType", "type", "Lcom/robinhood/models/db/OrderTrailingPeg$TrailingPegType;", "updateTrailAmount", "amount", "validate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TrailingStopDataState {
    public static final int $stable = 8;
    private final UiEvent<Unit> clearInputEvent;
    private final Instrument instrument;
    private final Quote quote;
    private final EquityOrderSide side;
    private final OrderTrailingPeg trailingPeg;
    private final UiEvent<TrailingStopViewState.ValidationResult> validationResult;

    /* compiled from: TrailingStopDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTrailingPeg.TrailingPegType.values().length];
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PERCENTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TrailingStopDataState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TrailingStopDataState copy$default(TrailingStopDataState trailingStopDataState, EquityOrderSide equityOrderSide, Instrument instrument, Quote quote, OrderTrailingPeg orderTrailingPeg, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            equityOrderSide = trailingStopDataState.side;
        }
        if ((i & 2) != 0) {
            instrument = trailingStopDataState.instrument;
        }
        if ((i & 4) != 0) {
            quote = trailingStopDataState.quote;
        }
        if ((i & 8) != 0) {
            orderTrailingPeg = trailingStopDataState.trailingPeg;
        }
        if ((i & 16) != 0) {
            uiEvent = trailingStopDataState.clearInputEvent;
        }
        if ((i & 32) != 0) {
            uiEvent2 = trailingStopDataState.validationResult;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        return trailingStopDataState.copy(equityOrderSide, instrument, quote, orderTrailingPeg, uiEvent3, uiEvent4);
    }

    /* renamed from: component1, reason: from getter */
    public final EquityOrderSide getSide() {
        return this.side;
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
    public final OrderTrailingPeg getTrailingPeg() {
        return this.trailingPeg;
    }

    public final UiEvent<Unit> component5() {
        return this.clearInputEvent;
    }

    public final UiEvent<TrailingStopViewState.ValidationResult> component6() {
        return this.validationResult;
    }

    public final TrailingStopDataState copy(EquityOrderSide side, Instrument instrument, Quote quote, OrderTrailingPeg trailingPeg, UiEvent<Unit> clearInputEvent, UiEvent<TrailingStopViewState.ValidationResult> validationResult) {
        Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
        return new TrailingStopDataState(side, instrument, quote, trailingPeg, clearInputEvent, validationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailingStopDataState)) {
            return false;
        }
        TrailingStopDataState trailingStopDataState = (TrailingStopDataState) other;
        return this.side == trailingStopDataState.side && Intrinsics.areEqual(this.instrument, trailingStopDataState.instrument) && Intrinsics.areEqual(this.quote, trailingStopDataState.quote) && Intrinsics.areEqual(this.trailingPeg, trailingStopDataState.trailingPeg) && Intrinsics.areEqual(this.clearInputEvent, trailingStopDataState.clearInputEvent) && Intrinsics.areEqual(this.validationResult, trailingStopDataState.validationResult);
    }

    public int hashCode() {
        EquityOrderSide equityOrderSide = this.side;
        int iHashCode = (equityOrderSide == null ? 0 : equityOrderSide.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode3 = (((iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31) + this.trailingPeg.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.clearInputEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<TrailingStopViewState.ValidationResult> uiEvent2 = this.validationResult;
        return iHashCode4 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "TrailingStopDataState(side=" + this.side + ", instrument=" + this.instrument + ", quote=" + this.quote + ", trailingPeg=" + this.trailingPeg + ", clearInputEvent=" + this.clearInputEvent + ", validationResult=" + this.validationResult + ")";
    }

    public TrailingStopDataState(EquityOrderSide equityOrderSide, Instrument instrument, Quote quote, OrderTrailingPeg trailingPeg, UiEvent<Unit> uiEvent, UiEvent<TrailingStopViewState.ValidationResult> uiEvent2) {
        Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
        this.side = equityOrderSide;
        this.instrument = instrument;
        this.quote = quote;
        this.trailingPeg = trailingPeg;
        this.clearInputEvent = uiEvent;
        this.validationResult = uiEvent2;
    }

    public final EquityOrderSide getSide() {
        return this.side;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public /* synthetic */ TrailingStopDataState(EquityOrderSide equityOrderSide, Instrument instrument, Quote quote, OrderTrailingPeg orderTrailingPeg, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : equityOrderSide, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : quote, (i & 8) != 0 ? new OrderTrailingPeg(null, null, OrderTrailingPeg.TrailingPegType.PERCENTAGE) : orderTrailingPeg, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : uiEvent2);
    }

    public final OrderTrailingPeg getTrailingPeg() {
        return this.trailingPeg;
    }

    public final UiEvent<Unit> getClearInputEvent() {
        return this.clearInputEvent;
    }

    public final UiEvent<TrailingStopViewState.ValidationResult> getValidationResult() {
        return this.validationResult;
    }

    public final Money getLastTradePrice() {
        Quote quote = this.quote;
        if (quote != null) {
            return quote.getLastTradePrice();
        }
        return null;
    }

    public final BigDecimal getTrailingStopPrice() {
        if (this.side == null) {
            return null;
        }
        Money lastTradePrice = getLastTradePrice();
        BigDecimal decimalValue = lastTradePrice != null ? lastTradePrice.getDecimalValue() : null;
        BigDecimal bigDecimalCalculateStopPrice = this.trailingPeg.calculateStopPrice(this.side, decimalValue);
        return bigDecimalCalculateStopPrice == null ? decimalValue == null ? BigDecimal.ZERO : decimalValue : bigDecimalCalculateStopPrice;
    }

    public final TrailingStopDataState updateTrailType(OrderTrailingPeg.TrailingPegType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return this.trailingPeg.getType() == type2 ? this : copy$default(this, null, null, null, new OrderTrailingPeg(null, null, type2), new UiEvent(Unit.INSTANCE), null, 39, null);
    }

    public final TrailingStopDataState updateTrailAmount(BigDecimal amount) {
        OrderTrailingPeg orderTrailingPeg;
        if (amount != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.trailingPeg.getType().ordinal()];
            if (i == 1) {
                orderTrailingPeg = new OrderTrailingPeg(Integer.valueOf(((BigDecimal) RangesKt.coerceIn(amount, BigDecimal.ONE, new BigDecimal(99))).intValue()), null);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                orderTrailingPeg = new OrderTrailingPeg(null, Money3.toMoney(amount, Currencies.USD));
            }
        } else {
            orderTrailingPeg = new OrderTrailingPeg(null, null, this.trailingPeg.getType());
        }
        return copy$default(this, null, null, null, orderTrailingPeg, null, null, 55, null);
    }

    public final TrailingStopDataState validate() {
        Object success;
        BigDecimal trailingStopPrice = getTrailingStopPrice();
        BigDecimal currencyScale = trailingStopPrice != null ? BigDecimals7.setCurrencyScale(trailingStopPrice) : null;
        if (currencyScale != null && BigDecimals7.lte(currencyScale, BigDecimal.ZERO)) {
            success = TrailingStopViewState.ValidationResult.Failure.INSTANCE;
        } else {
            success = new TrailingStopViewState.ValidationResult.Success(this.trailingPeg);
        }
        return copy$default(this, null, null, null, null, null, new UiEvent(success), 31, null);
    }
}
