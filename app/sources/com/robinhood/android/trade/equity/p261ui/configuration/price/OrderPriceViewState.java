package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceContext;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceFailureResolver;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceStep;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceValidator;
import com.robinhood.android.trade.equity.p261ui.configuration.toolbar.OrderConfigurationToolbar;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderPriceViewState.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001^B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010H\u001a\u00020\u0000J\u001a\u0010I\u001a\u00020\u00002\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130KJ\u0006\u0010L\u001a\u00020\u0000J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\rHÂ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÂ\u0003J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÂ\u0003J\t\u0010U\u001a\u00020\u0015HÂ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J£\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001J\u0013\u0010Y\u001a\u00020\u00152\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020&HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u00103\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0011\u00105\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0013\u00106\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b;\u0010$R#\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0>0=8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010C\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\bD\u00100R\u0016\u0010E\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "screenType", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceScreenType;", "userPrice", "Ljava/math/BigDecimal;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "retryWhen", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "validationContext", "Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "isOrderReplacement", "", "orderToBeReplaced", "Lcom/robinhood/models/db/Order;", "validationResult", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult;", "<init>", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceScreenType;Ljava/math/BigDecimal;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Lcom/robinhood/nbbo/models/db/NbboSummary;Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;Lcom/robinhood/android/lib/trade/validation/Validator$ValidationContext;ZLcom/robinhood/models/db/Order;Lcom/robinhood/udf/UiEvent;)V", "getValidationResult", "()Lcom/robinhood/udf/UiEvent;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "()Ljava/math/BigDecimal;", "finishActivityOnBack", "getFinishActivityOnBack", "()Z", "instrumentSymbol", "", "getInstrumentSymbol", "()Ljava/lang/String;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "lastTradePriceString", "Lcom/robinhood/utils/resource/StringResource;", "getLastTradePriceString", "()Lcom/robinhood/utils/resource/StringResource;", "bestBidPriceString", "getBestBidPriceString", "bestAskPriceString", "getBestAskPriceString", "isContinueButtonEnabled", "marketDataDisclosureDialogArgs", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Args;", "getMarketDataDisclosureDialogArgs", "()Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDialog$Args;", "shouldRetryValidation", "getShouldRetryValidation", "orderPriceCurrentPriceLabel", "", "Lkotlin/Pair;", "getOrderPriceCurrentPriceLabel", "()Ljava/util/List;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "toolbarTitle", "getToolbarTitle", "orderPriceContext", "getOrderPriceContext", "()Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "abortValidation", "skipFailureAndValidate", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "validate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "ValidationResult", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class OrderPriceViewState {
    public static final int $stable = 8;
    private final Order.Configuration configuration;
    private final Instrument instrument;
    private final String instrumentSymbol;
    private final boolean isContinueButtonEnabled;
    private final boolean isOrderReplacement;
    private final NbboSummary nbboSummary;
    private final Order orderToBeReplaced;
    private final Quote quote;
    private final Validator.Action.RetryWhen<OrderPriceContext> retryWhen;
    private final OrderPriceScreenType screenType;
    private final EquityOrderSide side;
    private final BigDecimal userPrice;
    private final Validator.ValidationContext<OrderPriceContext, OrderPriceFailureResolver> validationContext;
    private final UiEvent<ValidationResult> validationResult;

    /* compiled from: OrderPriceViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTrigger.values().length];
            try {
                iArr[OrderTrigger.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Order.Configuration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component10, reason: from getter */
    private final Order getOrderToBeReplaced() {
        return this.orderToBeReplaced;
    }

    /* renamed from: component2, reason: from getter */
    private final OrderPriceScreenType getScreenType() {
        return this.screenType;
    }

    /* renamed from: component3, reason: from getter */
    private final BigDecimal getUserPrice() {
        return this.userPrice;
    }

    /* renamed from: component4, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    private final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component6, reason: from getter */
    private final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    private final Validator.Action.RetryWhen<OrderPriceContext> component7() {
        return this.retryWhen;
    }

    private final Validator.ValidationContext<OrderPriceContext, OrderPriceFailureResolver> component8() {
        return this.validationContext;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getIsOrderReplacement() {
        return this.isOrderReplacement;
    }

    public static /* synthetic */ OrderPriceViewState copy$default(OrderPriceViewState orderPriceViewState, Order.Configuration configuration, OrderPriceScreenType orderPriceScreenType, BigDecimal bigDecimal, Instrument instrument, Quote quote, NbboSummary nbboSummary, Validator.Action.RetryWhen retryWhen, Validator.ValidationContext validationContext, boolean z, Order order, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            configuration = orderPriceViewState.configuration;
        }
        if ((i & 2) != 0) {
            orderPriceScreenType = orderPriceViewState.screenType;
        }
        if ((i & 4) != 0) {
            bigDecimal = orderPriceViewState.userPrice;
        }
        if ((i & 8) != 0) {
            instrument = orderPriceViewState.instrument;
        }
        if ((i & 16) != 0) {
            quote = orderPriceViewState.quote;
        }
        if ((i & 32) != 0) {
            nbboSummary = orderPriceViewState.nbboSummary;
        }
        if ((i & 64) != 0) {
            retryWhen = orderPriceViewState.retryWhen;
        }
        if ((i & 128) != 0) {
            validationContext = orderPriceViewState.validationContext;
        }
        if ((i & 256) != 0) {
            z = orderPriceViewState.isOrderReplacement;
        }
        if ((i & 512) != 0) {
            order = orderPriceViewState.orderToBeReplaced;
        }
        if ((i & 1024) != 0) {
            uiEvent = orderPriceViewState.validationResult;
        }
        Order order2 = order;
        UiEvent uiEvent2 = uiEvent;
        Validator.ValidationContext validationContext2 = validationContext;
        boolean z2 = z;
        NbboSummary nbboSummary2 = nbboSummary;
        Validator.Action.RetryWhen retryWhen2 = retryWhen;
        Quote quote2 = quote;
        BigDecimal bigDecimal2 = bigDecimal;
        return orderPriceViewState.copy(configuration, orderPriceScreenType, bigDecimal2, instrument, quote2, nbboSummary2, retryWhen2, validationContext2, z2, order2, uiEvent2);
    }

    public final UiEvent<ValidationResult> component11() {
        return this.validationResult;
    }

    public final OrderPriceViewState copy(Order.Configuration configuration, OrderPriceScreenType screenType, BigDecimal userPrice, Instrument instrument, Quote quote, NbboSummary nbboSummary, Validator.Action.RetryWhen<? super OrderPriceContext> retryWhen, Validator.ValidationContext<? super OrderPriceContext, ? super OrderPriceFailureResolver> validationContext, boolean isOrderReplacement, Order orderToBeReplaced, UiEvent<ValidationResult> validationResult) {
        return new OrderPriceViewState(configuration, screenType, userPrice, instrument, quote, nbboSummary, retryWhen, validationContext, isOrderReplacement, orderToBeReplaced, validationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPriceViewState)) {
            return false;
        }
        OrderPriceViewState orderPriceViewState = (OrderPriceViewState) other;
        return this.configuration == orderPriceViewState.configuration && this.screenType == orderPriceViewState.screenType && Intrinsics.areEqual(this.userPrice, orderPriceViewState.userPrice) && Intrinsics.areEqual(this.instrument, orderPriceViewState.instrument) && Intrinsics.areEqual(this.quote, orderPriceViewState.quote) && Intrinsics.areEqual(this.nbboSummary, orderPriceViewState.nbboSummary) && Intrinsics.areEqual(this.retryWhen, orderPriceViewState.retryWhen) && Intrinsics.areEqual(this.validationContext, orderPriceViewState.validationContext) && this.isOrderReplacement == orderPriceViewState.isOrderReplacement && Intrinsics.areEqual(this.orderToBeReplaced, orderPriceViewState.orderToBeReplaced) && Intrinsics.areEqual(this.validationResult, orderPriceViewState.validationResult);
    }

    public int hashCode() {
        Order.Configuration configuration = this.configuration;
        int iHashCode = (configuration == null ? 0 : configuration.hashCode()) * 31;
        OrderPriceScreenType orderPriceScreenType = this.screenType;
        int iHashCode2 = (iHashCode + (orderPriceScreenType == null ? 0 : orderPriceScreenType.hashCode())) * 31;
        BigDecimal bigDecimal = this.userPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode4 = (iHashCode3 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode5 = (iHashCode4 + (quote == null ? 0 : quote.hashCode())) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode6 = (iHashCode5 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31;
        Validator.Action.RetryWhen<OrderPriceContext> retryWhen = this.retryWhen;
        int iHashCode7 = (iHashCode6 + (retryWhen == null ? 0 : retryWhen.hashCode())) * 31;
        Validator.ValidationContext<OrderPriceContext, OrderPriceFailureResolver> validationContext = this.validationContext;
        int iHashCode8 = (((iHashCode7 + (validationContext == null ? 0 : validationContext.hashCode())) * 31) + Boolean.hashCode(this.isOrderReplacement)) * 31;
        Order order = this.orderToBeReplaced;
        int iHashCode9 = (iHashCode8 + (order == null ? 0 : order.hashCode())) * 31;
        UiEvent<ValidationResult> uiEvent = this.validationResult;
        return iHashCode9 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "OrderPriceViewState(configuration=" + this.configuration + ", screenType=" + this.screenType + ", userPrice=" + this.userPrice + ", instrument=" + this.instrument + ", quote=" + this.quote + ", nbboSummary=" + this.nbboSummary + ", retryWhen=" + this.retryWhen + ", validationContext=" + this.validationContext + ", isOrderReplacement=" + this.isOrderReplacement + ", orderToBeReplaced=" + this.orderToBeReplaced + ", validationResult=" + this.validationResult + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderPriceViewState(Order.Configuration configuration, OrderPriceScreenType orderPriceScreenType, BigDecimal bigDecimal, Instrument instrument, Quote quote, NbboSummary nbboSummary, Validator.Action.RetryWhen<? super OrderPriceContext> retryWhen, Validator.ValidationContext<? super OrderPriceContext, ? super OrderPriceFailureResolver> validationContext, boolean z, Order order, UiEvent<ValidationResult> uiEvent) {
        this.configuration = configuration;
        this.screenType = orderPriceScreenType;
        this.userPrice = bigDecimal;
        this.instrument = instrument;
        this.quote = quote;
        this.nbboSummary = nbboSummary;
        this.retryWhen = retryWhen;
        this.validationContext = validationContext;
        this.isOrderReplacement = z;
        this.orderToBeReplaced = order;
        this.validationResult = uiEvent;
        this.instrumentSymbol = instrument != null ? instrument.getSymbol() : null;
        this.isContinueButtonEnabled = BigDecimals7.isPositive(getPrice());
        this.side = orderPriceScreenType != null ? orderPriceScreenType.getSide() : null;
    }

    public /* synthetic */ OrderPriceViewState(Order.Configuration configuration, OrderPriceScreenType orderPriceScreenType, BigDecimal bigDecimal, Instrument instrument, Quote quote, NbboSummary nbboSummary, Validator.Action.RetryWhen retryWhen, Validator.ValidationContext validationContext, boolean z, Order order, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : configuration, (i & 2) != 0 ? null : orderPriceScreenType, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : instrument, (i & 16) != 0 ? null : quote, (i & 32) != 0 ? null : nbboSummary, (i & 64) != 0 ? null : retryWhen, (i & 128) != 0 ? null : validationContext, z, (i & 512) != 0 ? null : order, (i & 1024) != 0 ? null : uiEvent);
    }

    public final UiEvent<ValidationResult> getValidationResult() {
        return this.validationResult;
    }

    public final BigDecimal getPrice() {
        BigDecimal currencyScale;
        BigDecimal bigDecimal = this.userPrice;
        if (bigDecimal != null && (currencyScale = BigDecimals7.setCurrencyScale(bigDecimal)) != null) {
            return currencyScale;
        }
        Order order = this.orderToBeReplaced;
        if (order == null) {
            return null;
        }
        BigDecimal price = order.getPrice();
        if (price != null) {
            return price;
        }
        if (WhenMappings.$EnumSwitchMapping$0[order.getTrigger().ordinal()] == 1) {
            return order.getStopPrice();
        }
        return null;
    }

    public final boolean getFinishActivityOnBack() {
        return this.quote == null;
    }

    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    public final Money getLastTradePrice() {
        Quote quote = this.quote;
        if (quote != null) {
            return quote.getLastTradePrice();
        }
        return null;
    }

    public final StringResource getLastTradePriceString() {
        Money lastTradePrice;
        StringResource stringResourceInvoke;
        Quote quote = this.quote;
        return (quote == null || (lastTradePrice = quote.getLastTradePrice()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(Money.format$default(lastTradePrice, null, true, null, false, 0, null, false, null, false, false, 1021, null))) == null) ? StringResource.INSTANCE.invoke(C29365R.string.limit_price_fragment_market_data_not_available_dash, new Object[0]) : stringResourceInvoke;
    }

    private final StringResource getBestBidPriceString() {
        Money bidPrice;
        String bidPrice2;
        StringResource stringResourceInvoke;
        NbboSummary nbboSummary = this.nbboSummary;
        if (nbboSummary != null && (bidPrice2 = nbboSummary.getBidPrice()) != null && (stringResourceInvoke = StringResource.INSTANCE.invoke(bidPrice2)) != null) {
            return stringResourceInvoke;
        }
        Quote quote = this.quote;
        if (quote != null && (bidPrice = quote.getBidPrice()) != null) {
            return StringResource.INSTANCE.invoke(Money.format$default(bidPrice, null, true, null, false, 0, null, false, null, false, false, 1021, null));
        }
        return StringResource.INSTANCE.invoke(C29365R.string.limit_price_fragment_market_data_not_available_dash, new Object[0]);
    }

    private final StringResource getBestAskPriceString() {
        Money askPrice;
        String askPrice2;
        StringResource stringResourceInvoke;
        NbboSummary nbboSummary = this.nbboSummary;
        if (nbboSummary != null && (askPrice2 = nbboSummary.getAskPrice()) != null && (stringResourceInvoke = StringResource.INSTANCE.invoke(askPrice2)) != null) {
            return stringResourceInvoke;
        }
        Quote quote = this.quote;
        if (quote != null && (askPrice = quote.getAskPrice()) != null) {
            return StringResource.INSTANCE.invoke(Money.format$default(askPrice, null, true, null, false, 0, null, false, null, false, false, 1021, null));
        }
        return StringResource.INSTANCE.invoke(C29365R.string.limit_price_fragment_market_data_not_available_dash, new Object[0]);
    }

    /* renamed from: isContinueButtonEnabled, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    public final MarketDataDisclosureDialog.Args getMarketDataDisclosureDialogArgs() {
        if (this.instrument == null || this.quote == null) {
            return null;
        }
        return new MarketDataDisclosureDialog.Args(this.instrument.getId(), this.quote, this.side, this.configuration);
    }

    public final boolean getShouldRetryValidation() {
        Validator.Action.RetryWhen<OrderPriceContext> retryWhen;
        OrderPriceContext orderPriceContext = getOrderPriceContext();
        if (orderPriceContext == null || (retryWhen = this.retryWhen) == null) {
            return false;
        }
        return retryWhen.matches(orderPriceContext);
    }

    public final List<Tuples2<StringResource, StringResource>> getOrderPriceCurrentPriceLabel() {
        if (this.configuration != Order.Configuration.LIMIT) {
            return CollectionsKt.listOf(new Tuples2(StringResource.INSTANCE.invoke(C29365R.string.order_create_advanced_market_price, new Object[0]), getLastTradePriceString()));
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return CollectionsKt.listOf((Object[]) new Tuples2[]{new Tuples2(companion.invoke(C29365R.string.order_create_advanced_bid_price, new Object[0]), getBestBidPriceString()), new Tuples2(companion.invoke(C29365R.string.order_create_advanced_ask_price, new Object[0]), getBestAskPriceString())});
    }

    public final StringResource getToolbarTitle() {
        return OrderConfigurationToolbar.INSTANCE.toolbarTitle(this.configuration, this.isOrderReplacement);
    }

    private final OrderPriceContext getOrderPriceContext() {
        BigDecimal price = getPrice();
        if (this.side == null || this.configuration == null || price == null) {
            return null;
        }
        EquityOrderSide equityOrderSide = this.side;
        OrderPriceStep step = null;
        Order.Configuration configuration = this.configuration;
        Money lastTradePrice = getLastTradePrice();
        BigDecimal decimalValue = lastTradePrice != null ? lastTradePrice.getDecimalValue() : null;
        Instrument instrument = this.instrument;
        OrderPriceScreenType orderPriceScreenType = this.screenType;
        if (orderPriceScreenType != null) {
            step = orderPriceScreenType.getStep();
        }
        return new OrderPriceContext(equityOrderSide, configuration, price, decimalValue, instrument, step);
    }

    public final OrderPriceViewState abortValidation() {
        return copy$default(this, null, null, null, null, null, null, null, null, false, null, null, 1855, null);
    }

    public final OrderPriceViewState skipFailureAndValidate(Validator.Failure<? super OrderPriceContext, ? super OrderPriceFailureResolver> failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        Validator.ValidationContext<OrderPriceContext, OrderPriceFailureResolver> validationContext = this.validationContext;
        return copy$default(this, null, null, null, null, null, null, null, validationContext != null ? validationContext.skipFailure(failure) : null, false, null, null, 1919, null).validate();
    }

    public final OrderPriceViewState validate() {
        Object failure;
        OrderPriceContext orderPriceContext = getOrderPriceContext();
        if (orderPriceContext == null) {
            return this;
        }
        Validator.ValidationContext<OrderPriceContext, OrderPriceFailureResolver> validationContextValidateWithContext = this.validationContext;
        if (validationContextValidateWithContext == null) {
            validationContextValidateWithContext = OrderPriceValidator.INSTANCE.validateWithContext(orderPriceContext);
        }
        Validator.ValidationContext<OrderPriceContext, OrderPriceFailureResolver> validationContext = validationContextValidateWithContext;
        Validator.Failure<OrderPriceContext, OrderPriceFailureResolver> failure2 = validationContext.getFailure();
        if (failure2 == null) {
            failure = new ValidationResult.Success(orderPriceContext.getPrice());
        } else {
            failure = new ValidationResult.Failure(failure2, orderPriceContext);
        }
        return copy$default(this, null, null, null, null, null, null, null, validationContext, false, null, new UiEvent(failure), 831, null);
    }

    /* compiled from: OrderPriceViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult;", "", "<init>", "()V", "Success", "Failure", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult$Failure;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult$Success;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ValidationResult {
        public static final int $stable = 0;

        public /* synthetic */ ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ValidationResult() {
        }

        /* compiled from: OrderPriceViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult$Success;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult;", "validatedPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getValidatedPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends ValidationResult {
            public static final int $stable = 8;
            private final BigDecimal validatedPrice;

            public static /* synthetic */ Success copy$default(Success success, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = success.validatedPrice;
                }
                return success.copy(bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getValidatedPrice() {
                return this.validatedPrice;
            }

            public final Success copy(BigDecimal validatedPrice) {
                Intrinsics.checkNotNullParameter(validatedPrice, "validatedPrice");
                return new Success(validatedPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.validatedPrice, ((Success) other).validatedPrice);
            }

            public int hashCode() {
                return this.validatedPrice.hashCode();
            }

            public String toString() {
                return "Success(validatedPrice=" + this.validatedPrice + ")";
            }

            public final BigDecimal getValidatedPrice() {
                return this.validatedPrice;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(BigDecimal validatedPrice) {
                super(null);
                Intrinsics.checkNotNullParameter(validatedPrice, "validatedPrice");
                this.validatedPrice = validatedPrice;
            }
        }

        /* compiled from: OrderPriceViewState.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÂ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult$Failure;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState$ValidationResult;", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "input", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$Failure;Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;)V", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends ValidationResult {
            public static final int $stable = 8;
            private final Validator.Failure<OrderPriceContext, OrderPriceFailureResolver> failure;
            private final OrderPriceContext input;

            private final Validator.Failure<OrderPriceContext, OrderPriceFailureResolver> component1() {
                return this.failure;
            }

            /* renamed from: component2, reason: from getter */
            private final OrderPriceContext getInput() {
                return this.input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Failure copy$default(Failure failure, Validator.Failure failure2, OrderPriceContext orderPriceContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    failure2 = failure.failure;
                }
                if ((i & 2) != 0) {
                    orderPriceContext = failure.input;
                }
                return failure.copy(failure2, orderPriceContext);
            }

            public final Failure copy(Validator.Failure<? super OrderPriceContext, ? super OrderPriceFailureResolver> failure, OrderPriceContext input) {
                Intrinsics.checkNotNullParameter(failure, "failure");
                Intrinsics.checkNotNullParameter(input, "input");
                return new Failure(failure, input);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.failure, failure.failure) && Intrinsics.areEqual(this.input, failure.input);
            }

            public int hashCode() {
                return (this.failure.hashCode() * 31) + this.input.hashCode();
            }

            public String toString() {
                return "Failure(failure=" + this.failure + ", input=" + this.input + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Failure(Validator.Failure<? super OrderPriceContext, ? super OrderPriceFailureResolver> failure, OrderPriceContext input) {
                super(null);
                Intrinsics.checkNotNullParameter(failure, "failure");
                Intrinsics.checkNotNullParameter(input, "input");
                this.failure = failure;
                this.input = input;
            }

            public final void showAlert(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.failure.showAlert(activity, this.input);
            }
        }
    }
}
