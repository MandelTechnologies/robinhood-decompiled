package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrailingStopViewState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002CDBe\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u000203J\u0010\u00104\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000106J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u00109\u001a\u00020\u0007HÂ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010?\u001a\u00020\u001d2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020$HÖ\u0001J\t\u0010B\u001a\u00020\u000eHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0011\u0010-\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019R\u0013\u0010/\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "clearInputEvent", "Lcom/robinhood/udf/UiEvent;", "", "validationResult", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult;", "lastTradePrice", "", "trailingStopPrice", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/OrderTrailingPeg;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getClearInputEvent", "()Lcom/robinhood/udf/UiEvent;", "getValidationResult", "getLastTradePrice", "()Ljava/lang/String;", "getTrailingStopPrice", "()Lcom/robinhood/utils/resource/StringResource;", "instrumentSymbol", "getInstrumentSymbol", "isContinueButtonEnabled", "", "()Z", "marketDataDisclosureDialogArgs", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Args;", "getMarketDataDisclosureDialogArgs", "()Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Args;", "amountMaxLength", "", "getAmountMaxLength", "()I", "numpadDelimiterEnabled", "getNumpadDelimiterEnabled", "trailAmountDollarPrefixVisible", "getTrailAmountDollarPrefixVisible", "trailAmountPercentagePostfixVisible", "getTrailAmountPercentagePostfixVisible", "trailAmountLabel", "getTrailAmountLabel", "priceDisplayText", "getPriceDisplayText", "updateTrailType", "type", "Lcom/robinhood/models/db/OrderTrailingPeg$TrailingPegType;", "updateTrailAmount", "amount", "Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "ValidationResult", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TrailingStopViewState {
    private static final int DEFAULT_INPUT_MAX_LENGTH = 12;
    private static final int PERCENTAGE_INPUT_MAX_LENGTH = 2;
    private final UiEvent<Unit> clearInputEvent;
    private final Instrument instrument;
    private final String instrumentSymbol;
    private final boolean isContinueButtonEnabled;
    private final String lastTradePrice;
    private final Quote quote;
    private final OrderTrailingPeg trailingPeg;
    private final StringResource trailingStopPrice;
    private final UiEvent<ValidationResult> validationResult;
    public static final int $stable = 8;

    /* compiled from: TrailingStopViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTrailingPeg.TrailingPegType.values().length];
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TrailingStopViewState() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* renamed from: component1, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    private final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component3, reason: from getter */
    private final OrderTrailingPeg getTrailingPeg() {
        return this.trailingPeg;
    }

    public static /* synthetic */ TrailingStopViewState copy$default(TrailingStopViewState trailingStopViewState, Instrument instrument, Quote quote, OrderTrailingPeg orderTrailingPeg, UiEvent uiEvent, UiEvent uiEvent2, String str, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = trailingStopViewState.instrument;
        }
        if ((i & 2) != 0) {
            quote = trailingStopViewState.quote;
        }
        if ((i & 4) != 0) {
            orderTrailingPeg = trailingStopViewState.trailingPeg;
        }
        if ((i & 8) != 0) {
            uiEvent = trailingStopViewState.clearInputEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = trailingStopViewState.validationResult;
        }
        if ((i & 32) != 0) {
            str = trailingStopViewState.lastTradePrice;
        }
        if ((i & 64) != 0) {
            stringResource = trailingStopViewState.trailingStopPrice;
        }
        String str2 = str;
        StringResource stringResource2 = stringResource;
        UiEvent uiEvent3 = uiEvent2;
        OrderTrailingPeg orderTrailingPeg2 = orderTrailingPeg;
        return trailingStopViewState.copy(instrument, quote, orderTrailingPeg2, uiEvent, uiEvent3, str2, stringResource2);
    }

    public final UiEvent<Unit> component4() {
        return this.clearInputEvent;
    }

    public final UiEvent<ValidationResult> component5() {
        return this.validationResult;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLastTradePrice() {
        return this.lastTradePrice;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getTrailingStopPrice() {
        return this.trailingStopPrice;
    }

    public final TrailingStopViewState copy(Instrument instrument, Quote quote, OrderTrailingPeg trailingPeg, UiEvent<Unit> clearInputEvent, UiEvent<ValidationResult> validationResult, String lastTradePrice, StringResource trailingStopPrice) {
        Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
        return new TrailingStopViewState(instrument, quote, trailingPeg, clearInputEvent, validationResult, lastTradePrice, trailingStopPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailingStopViewState)) {
            return false;
        }
        TrailingStopViewState trailingStopViewState = (TrailingStopViewState) other;
        return Intrinsics.areEqual(this.instrument, trailingStopViewState.instrument) && Intrinsics.areEqual(this.quote, trailingStopViewState.quote) && Intrinsics.areEqual(this.trailingPeg, trailingStopViewState.trailingPeg) && Intrinsics.areEqual(this.clearInputEvent, trailingStopViewState.clearInputEvent) && Intrinsics.areEqual(this.validationResult, trailingStopViewState.validationResult) && Intrinsics.areEqual(this.lastTradePrice, trailingStopViewState.lastTradePrice) && Intrinsics.areEqual(this.trailingStopPrice, trailingStopViewState.trailingStopPrice);
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
        Quote quote = this.quote;
        int iHashCode2 = (((iHashCode + (quote == null ? 0 : quote.hashCode())) * 31) + this.trailingPeg.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.clearInputEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<ValidationResult> uiEvent2 = this.validationResult;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        String str = this.lastTradePrice;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource = this.trailingStopPrice;
        return iHashCode5 + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "TrailingStopViewState(instrument=" + this.instrument + ", quote=" + this.quote + ", trailingPeg=" + this.trailingPeg + ", clearInputEvent=" + this.clearInputEvent + ", validationResult=" + this.validationResult + ", lastTradePrice=" + this.lastTradePrice + ", trailingStopPrice=" + this.trailingStopPrice + ")";
    }

    public TrailingStopViewState(Instrument instrument, Quote quote, OrderTrailingPeg trailingPeg, UiEvent<Unit> uiEvent, UiEvent<ValidationResult> uiEvent2, String str, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
        this.instrument = instrument;
        this.quote = quote;
        this.trailingPeg = trailingPeg;
        this.clearInputEvent = uiEvent;
        this.validationResult = uiEvent2;
        this.lastTradePrice = str;
        this.trailingStopPrice = stringResource;
        this.instrumentSymbol = instrument != null ? instrument.getSymbol() : null;
        this.isContinueButtonEnabled = trailingPeg.isValid();
    }

    public /* synthetic */ TrailingStopViewState(Instrument instrument, Quote quote, OrderTrailingPeg orderTrailingPeg, UiEvent uiEvent, UiEvent uiEvent2, String str, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrument, (i & 2) != 0 ? null : quote, (i & 4) != 0 ? new OrderTrailingPeg(null, null, OrderTrailingPeg.TrailingPegType.PERCENTAGE) : orderTrailingPeg, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : stringResource);
    }

    public final UiEvent<Unit> getClearInputEvent() {
        return this.clearInputEvent;
    }

    public final UiEvent<ValidationResult> getValidationResult() {
        return this.validationResult;
    }

    public final String getLastTradePrice() {
        return this.lastTradePrice;
    }

    public final StringResource getTrailingStopPrice() {
        return this.trailingStopPrice;
    }

    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    /* renamed from: isContinueButtonEnabled, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    public final MarketDataDisclosureDialog.Args getMarketDataDisclosureDialogArgs() {
        if (this.instrument == null || this.quote == null) {
            return null;
        }
        return new MarketDataDisclosureDialog.Args(this.instrument.getId(), this.quote, null, Order.Configuration.TRAILING_STOP);
    }

    public final int getAmountMaxLength() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.trailingPeg.getType().ordinal()];
        if (i == 1) {
            return 12;
        }
        if (i == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getNumpadDelimiterEnabled() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.trailingPeg.getType().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getTrailAmountDollarPrefixVisible() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.trailingPeg.getType().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getTrailAmountPercentagePostfixVisible() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.trailingPeg.getType().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getTrailAmountLabel() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.trailingPeg.getType().ordinal()];
        if (i2 == 1) {
            i = C29365R.string.order_create_trailing_amount_price;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C29365R.string.order_create_trailing_amount_percentage;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final StringResource getPriceDisplayText() {
        if (this.trailingPeg.isValid()) {
            return this.trailingStopPrice;
        }
        return StringResource.INSTANCE.invoke(C29365R.string.order_create_trailing_amount_initial_stop_price_placeholder, new Object[0]);
    }

    public final TrailingStopViewState updateTrailType(OrderTrailingPeg.TrailingPegType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return this.trailingPeg.getType() == type2 ? this : copy$default(this, null, null, new OrderTrailingPeg(null, null, type2), new UiEvent(Unit.INSTANCE), null, null, null, 115, null);
    }

    public final TrailingStopViewState updateTrailAmount(BigDecimal amount) {
        OrderTrailingPeg orderTrailingPeg;
        if (amount != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.trailingPeg.getType().ordinal()];
            if (i == 1) {
                orderTrailingPeg = new OrderTrailingPeg(null, Money3.toMoney(amount, Currencies.USD));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                orderTrailingPeg = new OrderTrailingPeg(Integer.valueOf(amount.intValue()), null);
            }
        } else {
            orderTrailingPeg = new OrderTrailingPeg(null, null, this.trailingPeg.getType());
        }
        return copy$default(this, null, null, orderTrailingPeg, null, null, null, null, 123, null);
    }

    /* compiled from: TrailingStopViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult;", "", "<init>", "()V", "Success", "Failure", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult$Failure;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult$Success;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ValidationResult {
        public static final int $stable = 0;

        public /* synthetic */ ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ValidationResult() {
        }

        /* compiled from: TrailingStopViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult$Success;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "<init>", "(Lcom/robinhood/models/db/OrderTrailingPeg;)V", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends ValidationResult {
            public static final int $stable = 8;
            private final OrderTrailingPeg trailingPeg;

            public static /* synthetic */ Success copy$default(Success success, OrderTrailingPeg orderTrailingPeg, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderTrailingPeg = success.trailingPeg;
                }
                return success.copy(orderTrailingPeg);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderTrailingPeg getTrailingPeg() {
                return this.trailingPeg;
            }

            public final Success copy(OrderTrailingPeg trailingPeg) {
                Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
                return new Success(trailingPeg);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.trailingPeg, ((Success) other).trailingPeg);
            }

            public int hashCode() {
                return this.trailingPeg.hashCode();
            }

            public String toString() {
                return "Success(trailingPeg=" + this.trailingPeg + ")";
            }

            public final OrderTrailingPeg getTrailingPeg() {
                return this.trailingPeg;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(OrderTrailingPeg trailingPeg) {
                super(null);
                Intrinsics.checkNotNullParameter(trailingPeg, "trailingPeg");
                this.trailingPeg = trailingPeg;
            }
        }

        /* compiled from: TrailingStopViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult$Failure;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState$ValidationResult;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failure extends ValidationResult {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super(null);
            }
        }
    }
}
