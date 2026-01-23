package com.robinhood.android.equity.validation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.android.equity.ordercheck.Logging5;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.EquityOrderPayload;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.MarketHours;
import rosetta.order.PositionEffect;
import rosetta.order.Side;
import rosetta.order.Trigger;

/* compiled from: EquityOrderContext.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u008a\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010P\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010UJ\u0006\u0010Y\u001a\u000207J\u000e\u0010{\u001a\u0002072\u0006\u0010|\u001a\u00020\u0000J\u0006\u0010}\u001a\u00020~J\u0007\u0010\u007f\u001a\u00030\u0080\u0001J\u0013\u0010\u0081\u0001\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0002J\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010Q2\b\u0010T\u001a\u0004\u0018\u00010UH\u0002J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003J\u001e\u0010\u0085\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0086\u0001\u001a\u0002072\b\u0010|\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0087\u0001\u001a\u00030\u0088\u0001HÖ\u0001J\n\u0010\u0089\u0001\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010:\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b;\u00105R\u0013\u0010<\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b=\u00105R\u0013\u0010>\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b?\u00105R\u0011\u0010@\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bA\u00105R\u0011\u0010B\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bC\u00105R\u0011\u0010D\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bD\u00109R\u0011\u0010E\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bE\u00109R\u0011\u0010F\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bG\u00105R\u0011\u0010H\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bI\u00109R\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bO\u00109R\u0013\u0010V\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0013\u0010Z\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010^\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010`\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b`\u00109R\u0013\u0010a\u001a\u0004\u0018\u00010b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010e\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\bf\u00105R\u0013\u0010g\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\bh\u00105R\u0013\u0010i\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\bj\u00105R\u0011\u0010k\u001a\u00020l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0011\u0010o\u001a\u00020p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010s\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bt\u00109R\u0011\u0010u\u001a\u0002078F¢\u0006\u0006\u001a\u0004\bv\u00109R\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00110x8F¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006\u008b\u0001"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderContext;", "", "orderRequestDraft", "Lcom/robinhood/models/db/DirectOrderRequestDraft;", "requestContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;", "<init>", "(Lcom/robinhood/models/db/DirectOrderRequestDraft;Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;)V", "getOrderRequestDraft", "()Lcom/robinhood/models/db/DirectOrderRequestDraft;", "getRequestContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;", "refId", "Ljava/util/UUID;", "getRefId", "()Ljava/util/UUID;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "orderType", "Lcom/robinhood/models/db/OrderType;", "getOrderType", "()Lcom/robinhood/models/db/OrderType;", "trigger", "Lcom/robinhood/models/db/OrderTrigger;", "getTrigger", "()Lcom/robinhood/models/db/OrderTrigger;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "accountNumber", "getAccountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "instrument", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "totalCost", "Ljava/math/BigDecimal;", "getTotalCost", "()Ljava/math/BigDecimal;", "allowExtendedHours", "", "getAllowExtendedHours", "()Z", "uncollaredPrice", "getUncollaredPrice", "unCollaredTotalCost", "getUnCollaredTotalCost", "stopPrice", "getStopPrice", "displayPrice", "getDisplayPrice", "estimatedCost", "getEstimatedCost", "isBuy", "isSell", "buyingPower", "getBuyingPower", "canAffordOrder", "getCanAffordOrder", "taxLotSelectionType", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "getTaxLotSelectionType", "()Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "hasUserEnteredValue", "getHasUserEnteredValue", "getAvailableText", "Lcom/robinhood/utils/resource/StringResource;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "orderPendingReplacement", "Lcom/robinhood/models/db/Order;", "availableTextForDollarBased", "getAvailableTextForDollarBased", "()Lcom/robinhood/utils/resource/StringResource;", "canEnterFractionalQuantity", "dollarBasedAmount", "Lcom/robinhood/models/util/Money;", "getDollarBasedAmount", "()Lcom/robinhood/models/util/Money;", "isExtendedHours", "()Ljava/lang/Boolean;", "isDollarBasedAmount", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "presetPercentLimit", "getPresetPercentLimit", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "quantity", "getQuantity", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "onlyRegularHours", "getOnlyRegularHours", "overrideFlipIpoAccessShares", "getOverrideFlipIpoAccessShares", "checkOverrides", "", "getCheckOverrides", "()Ljava/util/List;", "hasEqualCollateral", "other", "toOrderPayload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "toRosetta", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "getAvailableTextForBuy", "getAvailableTextForSell", "component1", "component2", "copy", "equals", "hashCode", "", "toString", "RequestContext", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityOrderContext {
    public static final int $stable = 8;
    private final DirectOrderRequestDraft orderRequestDraft;
    private final RequestContext requestContext;

    /* compiled from: EquityOrderContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderType.values().length];
            try {
                iArr2[OrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ EquityOrderContext copy$default(EquityOrderContext equityOrderContext, DirectOrderRequestDraft directOrderRequestDraft, RequestContext requestContext, int i, Object obj) {
        if ((i & 1) != 0) {
            directOrderRequestDraft = equityOrderContext.orderRequestDraft;
        }
        if ((i & 2) != 0) {
            requestContext = equityOrderContext.requestContext;
        }
        return equityOrderContext.copy(directOrderRequestDraft, requestContext);
    }

    /* renamed from: component1, reason: from getter */
    public final DirectOrderRequestDraft getOrderRequestDraft() {
        return this.orderRequestDraft;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final EquityOrderContext copy(DirectOrderRequestDraft orderRequestDraft, RequestContext requestContext) {
        Intrinsics.checkNotNullParameter(orderRequestDraft, "orderRequestDraft");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        return new EquityOrderContext(orderRequestDraft, requestContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderContext)) {
            return false;
        }
        EquityOrderContext equityOrderContext = (EquityOrderContext) other;
        return Intrinsics.areEqual(this.orderRequestDraft, equityOrderContext.orderRequestDraft) && Intrinsics.areEqual(this.requestContext, equityOrderContext.requestContext);
    }

    public int hashCode() {
        return (this.orderRequestDraft.hashCode() * 31) + this.requestContext.hashCode();
    }

    public final Boolean isExtendedHours() {
        return null;
    }

    public String toString() {
        return "EquityOrderContext(orderRequestDraft=" + this.orderRequestDraft + ", requestContext=" + this.requestContext + ")";
    }

    public EquityOrderContext(DirectOrderRequestDraft orderRequestDraft, RequestContext requestContext) {
        Intrinsics.checkNotNullParameter(orderRequestDraft, "orderRequestDraft");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        this.orderRequestDraft = orderRequestDraft;
        this.requestContext = requestContext;
    }

    public final DirectOrderRequestDraft getOrderRequestDraft() {
        return this.orderRequestDraft;
    }

    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final UUID getRefId() {
        return this.orderRequestDraft.getRefId();
    }

    public final String getSymbol() {
        return this.orderRequestDraft.getInstrument().getSymbol();
    }

    public final EquityOrderSide getSide() {
        return this.orderRequestDraft.getSide();
    }

    public final OrderPositionEffect getPositionEffect() {
        if (this.orderRequestDraft.getOrderFormVersion() >= 7) {
            return this.orderRequestDraft.getPositionEffect();
        }
        return null;
    }

    public final OrderType getOrderType() {
        return this.orderRequestDraft.getType();
    }

    public final OrderTrigger getTrigger() {
        return this.orderRequestDraft.getTrigger();
    }

    public final Order.Configuration getConfiguration() {
        return this.orderRequestDraft.getOrderConfiguration();
    }

    public final String getAccountNumber() {
        return this.requestContext.getAccount().getAccountNumber();
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.requestContext.getAccount().getBrokerageAccountType();
    }

    public final Instrument getInstrument() {
        return this.requestContext.getInstrument();
    }

    public final BigDecimal getTotalCost() {
        if (BigDecimals7.isZero(this.orderRequestDraft.getQuantity())) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
        BigDecimal bigDecimalSafeMultiply = BigDecimals7.safeMultiply(getEstimatedCost(), this.orderRequestDraft.getQuantity());
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(this.orderRequestDraft.getEstimatedTotalFeeAndTaxes());
        int i = WhenMappings.$EnumSwitchMapping$0[getSide().ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = -1;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        BigDecimal bigDecimalAdd = bigDecimalSafeMultiply.add(BigDecimals7.times(bigDecimalOrZero, i2));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    public final boolean getAllowExtendedHours() {
        return getMarketHours().getLegacy_extended_hours();
    }

    public final BigDecimal getUncollaredPrice() {
        Quote quote = this.requestContext.getQuote();
        if (quote == null) {
            return null;
        }
        return Order.INSTANCE.getUnCollaredPrice(this.orderRequestDraft.getSide(), quote.getLastTradePrice().getDecimalValue(), this.orderRequestDraft.getStopPrice(), this.orderRequestDraft.getTrailingPeg(), this.orderRequestDraft.getTrigger());
    }

    public final BigDecimal getUnCollaredTotalCost() {
        BigDecimal uncollaredPrice = getUncollaredPrice();
        if (uncollaredPrice != null) {
            return BigDecimals7.safeMultiply(uncollaredPrice, this.orderRequestDraft.getQuantity());
        }
        return null;
    }

    public final BigDecimal getStopPrice() {
        return this.orderRequestDraft.getStopPrice();
    }

    public final BigDecimal getDisplayPrice() {
        return this.orderRequestDraft.getDisplayPrice();
    }

    public final BigDecimal getEstimatedCost() {
        return BigDecimals7.orZero(Order.INSTANCE.getEstimatedCost(this.orderRequestDraft.getType(), this.orderRequestDraft.getSide(), this.orderRequestDraft.getTrigger(), this.orderRequestDraft.getPresetPercentLimit() != null, null, this.orderRequestDraft.getPrice(), this.orderRequestDraft.getStopPrice(), this.orderRequestDraft.getTrailingPeg(), this.orderRequestDraft.getLastTradePrice()));
    }

    public final boolean isBuy() {
        return this.orderRequestDraft.getSide() == EquityOrderSide.BUY;
    }

    public final boolean isSell() {
        return this.orderRequestDraft.getSide() == EquityOrderSide.SELL;
    }

    public final BigDecimal getBuyingPower() {
        return this.requestContext.getInstrumentBuyingPower().getBuyingPowerAmount().getDecimalValue();
    }

    public final boolean getCanAffordOrder() {
        return BigDecimals7.gte(getBuyingPower(), getTotalCost());
    }

    public final TaxLotSelectionType getTaxLotSelectionType() {
        return this.orderRequestDraft.getTaxLotSelectionType();
    }

    public final boolean getHasUserEnteredValue() {
        Money dollarBasedAmount;
        if (this.orderRequestDraft.getDollarBasedAmount() != null && (dollarBasedAmount = this.orderRequestDraft.getDollarBasedAmount()) != null) {
            return !BigDecimals7.m2977eq(dollarBasedAmount.getDecimalValue(), BigDecimal.ZERO);
        }
        if (BigDecimals7.isZero(getTotalCost())) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.orderRequestDraft.getType().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.orderRequestDraft.getPrice() != null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ StringResource getAvailableText$default(EquityOrderContext equityOrderContext, InstrumentBuyingPower instrumentBuyingPower, Order order, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentBuyingPower = null;
        }
        return equityOrderContext.getAvailableText(instrumentBuyingPower, order);
    }

    public final StringResource getAvailableText(InstrumentBuyingPower instrumentBuyingPower, Order orderPendingReplacement) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderRequestDraft.getSide().ordinal()];
        if (i == 1) {
            return getAvailableTextForBuy(instrumentBuyingPower);
        }
        if (i == 2) {
            return getAvailableTextForSell(orderPendingReplacement);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StringResource getAvailableTextForDollarBased() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderRequestDraft.getSide().ordinal()];
        if (i == 1) {
            if (BigDecimals7.isNegative(getBuyingPower())) {
                return StringResource.INSTANCE.invoke(C20649R.string.order_create_negative_buying_power, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C20649R.string.order_create_available_buying_power_with_symbol, Formats.getAmountFormat().format(getBuyingPower()), this.requestContext.getInstrument().getSymbol());
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("dollar based order not supported for shorting");
        }
        Quote quote = this.requestContext.getQuote();
        Position position = this.requestContext.getPosition();
        if (quote == null || position == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C20649R.string.order_create_available_equity_value, Formats.getAmountFormat().format(position.getSellableAmount(quote).getDecimalValue()), this.requestContext.getInstrument().getSymbol());
    }

    public final boolean canEnterFractionalQuantity() {
        boolean canBuyFractional;
        Instrument instrument = this.requestContext.getInstrument();
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderRequestDraft.getSide().ordinal()];
        if (i == 1) {
            canBuyFractional = instrument.getCanBuyFractional();
        } else if (i == 2) {
            canBuyFractional = instrument.canSellFractional(this.requestContext.getPosition());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            canBuyFractional = false;
        }
        return (getConfiguration() == Order.Configuration.MARKET || getConfiguration() == Order.Configuration.SIMPLE_LIMIT) && canBuyFractional;
    }

    public final Money getDollarBasedAmount() {
        return this.orderRequestDraft.getDollarBasedAmount();
    }

    public final boolean isDollarBasedAmount() {
        return this.orderRequestDraft.getDollarBasedAmount() != null;
    }

    public final OrderTrailingPeg getTrailingPeg() {
        return this.orderRequestDraft.getTrailingPeg();
    }

    public final BigDecimal getPresetPercentLimit() {
        return this.orderRequestDraft.getPresetPercentLimit();
    }

    public final BigDecimal getPrice() {
        return this.orderRequestDraft.getPrice();
    }

    public final BigDecimal getQuantity() {
        return this.orderRequestDraft.getQuantity();
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.orderRequestDraft.getTimeInForce();
    }

    public final OrderMarketHours getMarketHours() {
        return this.orderRequestDraft.getMarketHours();
    }

    public final boolean getOnlyRegularHours() {
        return getMarketHours() == OrderMarketHours.REGULAR_HOURS;
    }

    public final boolean getOverrideFlipIpoAccessShares() {
        return this.requestContext.getOverrideFlipIpoAccessShares();
    }

    public final List<String> getCheckOverrides() {
        return this.orderRequestDraft.getCheckOverrides();
    }

    public final boolean hasEqualCollateral(EquityOrderContext other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(getInstrument(), other.getInstrument()) && Intrinsics.areEqual(getQuantity(), other.getQuantity());
    }

    public final EquityOrderPayload toOrderPayload() {
        return Logging5.toOrderPayload(this.orderRequestDraft);
    }

    public final com.robinhood.rosetta.eventlogging.EquityOrderContext toRosetta() {
        String protobuf;
        String string2 = getInstrument().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String symbol = getInstrument().getSymbol();
        Side protobuf2 = Orders2.toProtobuf(getSide());
        PositionEffect protobuf3 = Orders2.toProtobuf(getPositionEffect());
        rosetta.order.OrderType protobuf4 = Orders2.toProtobuf(getOrderType());
        Trigger protobuf5 = Orders2.toProtobuf(getTrigger());
        Boolean protobuf6 = Booleans2.toProtobuf(Boolean.valueOf(isDollarBasedAmount()));
        Boolean protobuf7 = Booleans2.toProtobuf(Boolean.valueOf(getTrailingPeg() != null));
        Boolean protobuf8 = Booleans2.toProtobuf(Boolean.valueOf(getPresetPercentLimit() != null));
        MarketHours protobuf9 = Orders2.toProtobuf(getMarketHours());
        BigDecimal estimatedTotalFeeAndTaxes = this.orderRequestDraft.getEstimatedTotalFeeAndTaxes();
        if (estimatedTotalFeeAndTaxes == null || (protobuf = Securities.toProtobuf(estimatedTotalFeeAndTaxes)) == null) {
            protobuf = "";
        }
        return new com.robinhood.rosetta.eventlogging.EquityOrderContext(string2, symbol, protobuf2, protobuf4, protobuf5, protobuf6, protobuf7, protobuf8, protobuf9, null, null, null, null, null, null, protobuf, protobuf3, null, null, null, 949760, null);
    }

    private final StringResource getAvailableTextForBuy(InstrumentBuyingPower instrumentBuyingPower) {
        if (BigDecimals7.isNegative(getBuyingPower())) {
            return StringResource.INSTANCE.invoke(C20649R.string.order_create_negative_buying_power, new Object[0]);
        }
        if (instrumentBuyingPower != null) {
            return StringResource.INSTANCE.invoke(C20649R.string.order_create_available_buying_power, NumberFormatter.DefaultImpls.formatNullable$default(Formats.getCurrencyFormat(), instrumentBuyingPower.getBuyingPowerAmount().getDecimalValue(), null, 2, null));
        }
        return StringResource.INSTANCE.invoke(C20649R.string.order_create_available_buying_power, Formats.getPriceFormat().format(getBuyingPower()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[PHI: r1
      0x0049: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:17:0x0047, B:20:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final StringResource getAvailableTextForSell(Order orderPendingReplacement) {
        int intRoundUp;
        Position position = this.requestContext.getPosition();
        if (position == null) {
            return null;
        }
        BigDecimal bigDecimalAdd = position.getClosableQuantity().add(BigDecimals7.orZero(orderPendingReplacement != null ? orderPendingReplacement.getQuantity() : null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimal = BigDecimal.ONE;
        if (Intrinsics.areEqual(bigDecimalAdd, bigDecimal)) {
            intRoundUp = 1;
        } else if (bigDecimalAdd.compareTo(BigDecimal.ZERO) < 0 || bigDecimalAdd.compareTo(bigDecimal) >= 0) {
            int i = Integer.MAX_VALUE;
            if (bigDecimalAdd.compareTo(new BigDecimal(Integer.MAX_VALUE)) >= 0) {
                intRoundUp = i;
            } else {
                i = Integer.MIN_VALUE;
                if (bigDecimalAdd.compareTo(new BigDecimal(Integer.MIN_VALUE)) > 0) {
                    intRoundUp = BigDecimals7.toIntRoundUp(bigDecimalAdd);
                }
            }
        } else {
            intRoundUp = 0;
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C20649R.plurals.order_create_available_shares, intRoundUp), Formats.getShareQuantityFormat().format(bigDecimalAdd));
    }

    /* compiled from: EquityOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003JI\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;", "", "account", "Lcom/robinhood/models/db/Account;", "instrument", "Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "quote", "Lcom/robinhood/models/db/Quote;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "overrideFlipIpoAccessShares", "", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/InstrumentBuyingPower;Z)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getOverrideFlipIpoAccessShares", "()Z", "defaultPresetPercentLimit", "Ljava/math/BigDecimal;", "getDefaultPresetPercentLimit", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestContext {
        public static final int $stable = 8;
        private final Account account;
        private final BigDecimal defaultPresetPercentLimit;
        private final Instrument instrument;
        private final InstrumentBuyingPower instrumentBuyingPower;
        private final boolean overrideFlipIpoAccessShares;
        private final Position position;
        private final Quote quote;

        public static /* synthetic */ RequestContext copy$default(RequestContext requestContext, Account account, Instrument instrument, Position position, Quote quote, InstrumentBuyingPower instrumentBuyingPower, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                account = requestContext.account;
            }
            if ((i & 2) != 0) {
                instrument = requestContext.instrument;
            }
            if ((i & 4) != 0) {
                position = requestContext.position;
            }
            if ((i & 8) != 0) {
                quote = requestContext.quote;
            }
            if ((i & 16) != 0) {
                instrumentBuyingPower = requestContext.instrumentBuyingPower;
            }
            if ((i & 32) != 0) {
                z = requestContext.overrideFlipIpoAccessShares;
            }
            InstrumentBuyingPower instrumentBuyingPower2 = instrumentBuyingPower;
            boolean z2 = z;
            return requestContext.copy(account, instrument, position, quote, instrumentBuyingPower2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component3, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* renamed from: component4, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        /* renamed from: component5, reason: from getter */
        public final InstrumentBuyingPower getInstrumentBuyingPower() {
            return this.instrumentBuyingPower;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getOverrideFlipIpoAccessShares() {
            return this.overrideFlipIpoAccessShares;
        }

        public final RequestContext copy(Account account, Instrument instrument, Position position, Quote quote, InstrumentBuyingPower instrumentBuyingPower, boolean overrideFlipIpoAccessShares) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
            return new RequestContext(account, instrument, position, quote, instrumentBuyingPower, overrideFlipIpoAccessShares);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestContext)) {
                return false;
            }
            RequestContext requestContext = (RequestContext) other;
            return Intrinsics.areEqual(this.account, requestContext.account) && Intrinsics.areEqual(this.instrument, requestContext.instrument) && Intrinsics.areEqual(this.position, requestContext.position) && Intrinsics.areEqual(this.quote, requestContext.quote) && Intrinsics.areEqual(this.instrumentBuyingPower, requestContext.instrumentBuyingPower) && this.overrideFlipIpoAccessShares == requestContext.overrideFlipIpoAccessShares;
        }

        public int hashCode() {
            int iHashCode = ((this.account.hashCode() * 31) + this.instrument.hashCode()) * 31;
            Position position = this.position;
            int iHashCode2 = (iHashCode + (position == null ? 0 : position.hashCode())) * 31;
            Quote quote = this.quote;
            return ((((iHashCode2 + (quote != null ? quote.hashCode() : 0)) * 31) + this.instrumentBuyingPower.hashCode()) * 31) + Boolean.hashCode(this.overrideFlipIpoAccessShares);
        }

        public String toString() {
            return "RequestContext(account=" + this.account + ", instrument=" + this.instrument + ", position=" + this.position + ", quote=" + this.quote + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", overrideFlipIpoAccessShares=" + this.overrideFlipIpoAccessShares + ")";
        }

        public RequestContext(Account account, Instrument instrument, Position position, Quote quote, InstrumentBuyingPower instrumentBuyingPower, boolean z) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
            this.account = account;
            this.instrument = instrument;
            this.position = position;
            this.quote = quote;
            this.instrumentBuyingPower = instrumentBuyingPower;
            this.overrideFlipIpoAccessShares = z;
            this.defaultPresetPercentLimit = instrument.getDefaultPresetPercentLimit();
        }

        public final Account getAccount() {
            return this.account;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final Quote getQuote() {
            return this.quote;
        }

        public final InstrumentBuyingPower getInstrumentBuyingPower() {
            return this.instrumentBuyingPower;
        }

        public final boolean getOverrideFlipIpoAccessShares() {
            return this.overrideFlipIpoAccessShares;
        }

        public final BigDecimal getDefaultPresetPercentLimit() {
            return this.defaultPresetPercentLimit;
        }
    }
}
