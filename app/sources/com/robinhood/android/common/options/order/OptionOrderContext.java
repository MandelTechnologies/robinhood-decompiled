package com.robinhood.android.common.options.order;

import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.order.OptionOrderUserInputPrices;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.models.Decimals4;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.ApiOptionOrderPostBody;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionsBuyingPower;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.OptionOrderToReplaceBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import retrofit2.Response;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderContext.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bB\b\u0087\b\u0018\u0000 a2\u00020\u0001:\nbcdefghijaB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010&\u001a\u00020%2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010#\u001a\u00020\u00192\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006HÆ\u0003¢\u0006\u0004\b=\u00102Jv\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020 HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\u00192\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u00100R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u0010<R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bW\u00102R\u0019\u0010X\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\\\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\\\u0010\u001dR\u0011\u0010^\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b^\u0010\u001dR\u0011\u0010`\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b_\u0010[¨\u0006k"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext;", "", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", "apiRequest", "Lcom/robinhood/android/common/options/order/OptionOrderContext$AccountContext;", "accountContext", "", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;", "legContexts", "Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;", "prices", "Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestArguments;", "requestArguments", "Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestContext;", "requestContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext$StrategyContext;", "strategyContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext$ValidationContext;", "validationContext", "Lcom/robinhood/models/db/KaizenExperiment;", "experiments", "<init>", "(Lcom/robinhood/models/api/ApiOptionOrderRequest;Lcom/robinhood/android/common/options/order/OptionOrderContext$AccountContext;Ljava/util/List;Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestArguments;Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestContext;Lcom/robinhood/android/common/options/order/OptionOrderContext$StrategyContext;Lcom/robinhood/android/common/options/order/OptionOrderContext$ValidationContext;Ljava/util/List;)V", "j$/time/Clock", Card.Icon.CLOCK, "", "shouldUseServerMarketability", "(Lj$/time/Clock;)Z", "shouldIncludeMaxOrderSizeImprovements", "()Z", "", "requestId", "", "numberOfChecksSeen", "checkOverrides", "isInMaxOrderSizeImprovementExperiment", "orderPathExperiments", "Lcom/robinhood/models/api/ApiOptionOrderPostBody;", "getApiOptionOrderPostBody", "(Ljava/lang/String;ILjava/util/List;ZLjava/util/List;)Lcom/robinhood/models/api/ApiOptionOrderPostBody;", "legContext", "Ljava/math/BigDecimal;", "getApiOptionOrderFeeRequestLegPremium", "(Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;)Ljava/math/BigDecimal;", "getQuantityForLeg", "component1", "()Lcom/robinhood/models/api/ApiOptionOrderRequest;", "component2", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$AccountContext;", "component3", "()Ljava/util/List;", "component4", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;", "component5", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestArguments;", "component6", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestContext;", "component7", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$StrategyContext;", "component8", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$ValidationContext;", "component9", "copy", "(Lcom/robinhood/models/api/ApiOptionOrderRequest;Lcom/robinhood/android/common/options/order/OptionOrderContext$AccountContext;Ljava/util/List;Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestArguments;Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestContext;Lcom/robinhood/android/common/options/order/OptionOrderContext$StrategyContext;Lcom/robinhood/android/common/options/order/OptionOrderContext$ValidationContext;Ljava/util/List;)Lcom/robinhood/android/common/options/order/OptionOrderContext;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", "getApiRequest", "Lcom/robinhood/android/common/options/order/OptionOrderContext$AccountContext;", "getAccountContext", "Ljava/util/List;", "getLegContexts", "Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;", "getPrices", "Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestArguments;", "getRequestArguments", "Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestContext;", "getRequestContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext$StrategyContext;", "getStrategyContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext$ValidationContext;", "getValidationContext", "getExperiments", "netValueBeforeFee", "Ljava/math/BigDecimal;", "getNetValueBeforeFee", "()Ljava/math/BigDecimal;", "isReviewable", "Z", "isSingleLeg", "getCloseableQuantity", "closeableQuantity", "Companion", "StrategyContext", "RequestContext", "ValidationContext", "RequestArguments", "LegContext", "LimitPrice", "AccountContext", "QuoteAggregation", "Prices", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class OptionOrderContext {
    private final AccountContext accountContext;
    private final ApiOptionOrderRequest apiRequest;
    private final List<KaizenExperiment> experiments;
    private final boolean isReviewable;
    private final List<LegContext> legContexts;
    private final BigDecimal netValueBeforeFee;
    private final Prices prices;
    private final RequestArguments requestArguments;
    private final RequestContext requestContext;
    private final StrategyContext strategyContext;
    private final ValidationContext validationContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ OptionOrderContext copy$default(OptionOrderContext optionOrderContext, ApiOptionOrderRequest apiOptionOrderRequest, AccountContext accountContext, List list, Prices prices, RequestArguments requestArguments, RequestContext requestContext, StrategyContext strategyContext, ValidationContext validationContext, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiOptionOrderRequest = optionOrderContext.apiRequest;
        }
        if ((i & 2) != 0) {
            accountContext = optionOrderContext.accountContext;
        }
        if ((i & 4) != 0) {
            list = optionOrderContext.legContexts;
        }
        if ((i & 8) != 0) {
            prices = optionOrderContext.prices;
        }
        if ((i & 16) != 0) {
            requestArguments = optionOrderContext.requestArguments;
        }
        if ((i & 32) != 0) {
            requestContext = optionOrderContext.requestContext;
        }
        if ((i & 64) != 0) {
            strategyContext = optionOrderContext.strategyContext;
        }
        if ((i & 128) != 0) {
            validationContext = optionOrderContext.validationContext;
        }
        if ((i & 256) != 0) {
            list2 = optionOrderContext.experiments;
        }
        ValidationContext validationContext2 = validationContext;
        List list3 = list2;
        RequestContext requestContext2 = requestContext;
        StrategyContext strategyContext2 = strategyContext;
        RequestArguments requestArguments2 = requestArguments;
        List list4 = list;
        return optionOrderContext.copy(apiOptionOrderRequest, accountContext, list4, prices, requestArguments2, requestContext2, strategyContext2, validationContext2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiOptionOrderRequest getApiRequest() {
        return this.apiRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountContext getAccountContext() {
        return this.accountContext;
    }

    public final List<LegContext> component3() {
        return this.legContexts;
    }

    /* renamed from: component4, reason: from getter */
    public final Prices getPrices() {
        return this.prices;
    }

    /* renamed from: component5, reason: from getter */
    public final RequestArguments getRequestArguments() {
        return this.requestArguments;
    }

    /* renamed from: component6, reason: from getter */
    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    /* renamed from: component7, reason: from getter */
    public final StrategyContext getStrategyContext() {
        return this.strategyContext;
    }

    /* renamed from: component8, reason: from getter */
    public final ValidationContext getValidationContext() {
        return this.validationContext;
    }

    public final List<KaizenExperiment> component9() {
        return this.experiments;
    }

    public final OptionOrderContext copy(ApiOptionOrderRequest apiRequest, AccountContext accountContext, List<LegContext> legContexts, Prices prices, RequestArguments requestArguments, RequestContext requestContext, StrategyContext strategyContext, ValidationContext validationContext, List<? extends KaizenExperiment> experiments) {
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        Intrinsics.checkNotNullParameter(accountContext, "accountContext");
        Intrinsics.checkNotNullParameter(legContexts, "legContexts");
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(requestArguments, "requestArguments");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        Intrinsics.checkNotNullParameter(strategyContext, "strategyContext");
        Intrinsics.checkNotNullParameter(validationContext, "validationContext");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return new OptionOrderContext(apiRequest, accountContext, legContexts, prices, requestArguments, requestContext, strategyContext, validationContext, experiments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderContext)) {
            return false;
        }
        OptionOrderContext optionOrderContext = (OptionOrderContext) other;
        return Intrinsics.areEqual(this.apiRequest, optionOrderContext.apiRequest) && Intrinsics.areEqual(this.accountContext, optionOrderContext.accountContext) && Intrinsics.areEqual(this.legContexts, optionOrderContext.legContexts) && Intrinsics.areEqual(this.prices, optionOrderContext.prices) && Intrinsics.areEqual(this.requestArguments, optionOrderContext.requestArguments) && Intrinsics.areEqual(this.requestContext, optionOrderContext.requestContext) && Intrinsics.areEqual(this.strategyContext, optionOrderContext.strategyContext) && Intrinsics.areEqual(this.validationContext, optionOrderContext.validationContext) && Intrinsics.areEqual(this.experiments, optionOrderContext.experiments);
    }

    public int hashCode() {
        return (((((((((((((((this.apiRequest.hashCode() * 31) + this.accountContext.hashCode()) * 31) + this.legContexts.hashCode()) * 31) + this.prices.hashCode()) * 31) + this.requestArguments.hashCode()) * 31) + this.requestContext.hashCode()) * 31) + this.strategyContext.hashCode()) * 31) + this.validationContext.hashCode()) * 31) + this.experiments.hashCode();
    }

    public String toString() {
        return "OptionOrderContext(apiRequest=" + this.apiRequest + ", accountContext=" + this.accountContext + ", legContexts=" + this.legContexts + ", prices=" + this.prices + ", requestArguments=" + this.requestArguments + ", requestContext=" + this.requestContext + ", strategyContext=" + this.strategyContext + ", validationContext=" + this.validationContext + ", experiments=" + this.experiments + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionOrderContext(ApiOptionOrderRequest apiRequest, AccountContext accountContext, List<LegContext> legContexts, Prices prices, RequestArguments requestArguments, RequestContext requestContext, StrategyContext strategyContext, ValidationContext validationContext, List<? extends KaizenExperiment> experiments) {
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(apiRequest, "apiRequest");
        Intrinsics.checkNotNullParameter(accountContext, "accountContext");
        Intrinsics.checkNotNullParameter(legContexts, "legContexts");
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(requestArguments, "requestArguments");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        Intrinsics.checkNotNullParameter(strategyContext, "strategyContext");
        Intrinsics.checkNotNullParameter(validationContext, "validationContext");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.apiRequest = apiRequest;
        this.accountContext = accountContext;
        this.legContexts = legContexts;
        this.prices = prices;
        this.requestArguments = requestArguments;
        this.requestContext = requestContext;
        this.strategyContext = strategyContext;
        this.validationContext = validationContext;
        this.experiments = experiments;
        BigDecimal quantity = requestArguments.getQuantity();
        BigDecimal tradeValueMultiplier = requestContext.getOptionChain().getOptionChain().getTradeValueMultiplier();
        BigDecimal priceForTotalCostCalculation = prices.getPriceForTotalCostCalculation();
        if (priceForTotalCostCalculation != null) {
            BigDecimal bigDecimalMultiply2 = tradeValueMultiplier.multiply(quantity);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            bigDecimalMultiply = priceForTotalCostCalculation.multiply(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        } else {
            bigDecimalMultiply = null;
        }
        this.netValueBeforeFee = bigDecimalMultiply;
        this.isReviewable = BigDecimals7.isPositive(requestArguments.getQuantity()) && prices.isReviewable();
    }

    public final ApiOptionOrderRequest getApiRequest() {
        return this.apiRequest;
    }

    public final AccountContext getAccountContext() {
        return this.accountContext;
    }

    public final List<LegContext> getLegContexts() {
        return this.legContexts;
    }

    public final Prices getPrices() {
        return this.prices;
    }

    public final RequestArguments getRequestArguments() {
        return this.requestArguments;
    }

    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final StrategyContext getStrategyContext() {
        return this.strategyContext;
    }

    public final ValidationContext getValidationContext() {
        return this.validationContext;
    }

    public final List<KaizenExperiment> getExperiments() {
        return this.experiments;
    }

    public final BigDecimal getNetValueBeforeFee() {
        return this.netValueBeforeFee;
    }

    public final boolean isSingleLeg() {
        return this.legContexts.size() == 1;
    }

    /* renamed from: isReviewable, reason: from getter */
    public final boolean getIsReviewable() {
        return this.isReviewable;
    }

    public final BigDecimal getCloseableQuantity() {
        Object next;
        AggregateOptionPosition aggregateOptionPosition;
        Iterator<T> it = this.legContexts.iterator();
        BigDecimal quantity = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                BigDecimal closeableQuantity = ((LegContext) next).getCloseableQuantity();
                do {
                    Object next2 = it.next();
                    BigDecimal closeableQuantity2 = ((LegContext) next2).getCloseableQuantity();
                    if (closeableQuantity.compareTo(closeableQuantity2) > 0) {
                        next = next2;
                        closeableQuantity = closeableQuantity2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        BigDecimal closeableQuantity3 = next != null ? ((LegContext) next).getCloseableQuantity() : null;
        Intrinsics.checkNotNull(closeableQuantity3);
        UiAggregateOptionPositionFull aggregateOptionPosition2 = this.accountContext.getAggregateOptionPosition();
        if (aggregateOptionPosition2 != null && (aggregateOptionPosition = aggregateOptionPosition2.getAggregateOptionPosition()) != null) {
            quantity = aggregateOptionPosition.getQuantity();
        }
        if (quantity == null) {
            return closeableQuantity3;
        }
        BigDecimal bigDecimalMin = quantity.min(closeableQuantity3);
        Intrinsics.checkNotNull(bigDecimalMin);
        return bigDecimalMin;
    }

    public final boolean shouldUseServerMarketability(Clock clock) {
        Object next;
        Intrinsics.checkNotNullParameter(clock, "clock");
        MarketHours equityRegularMarketHours = this.validationContext.getEquityRegularMarketHours();
        if (equityRegularMarketHours != null) {
            Instant instantNow = Instant.now(clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            if (equityRegularMarketHours.isOpenRegular(instantNow)) {
                Iterator<T> it = this.experiments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((KaizenExperiment) next).getName(), Experiments.OptionsSingleLegMarketabilityExperiment.INSTANCE.getServerName())) {
                        break;
                    }
                }
                KaizenExperiment kaizenExperiment = (KaizenExperiment) next;
                if ((kaizenExperiment != null && kaizenExperiment.isInExperiment()) || !isSingleLeg()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean shouldIncludeMaxOrderSizeImprovements() {
        Object next;
        Iterator<T> it = this.experiments.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((KaizenExperiment) next).getName(), Experiments.OptionsMaxOrderSizeImprovementsExperiment.INSTANCE.getServerName())) {
                break;
            }
        }
        KaizenExperiment kaizenExperiment = (KaizenExperiment) next;
        return kaizenExperiment != null && kaizenExperiment.isInExperiment();
    }

    public static /* synthetic */ ApiOptionOrderPostBody getApiOptionOrderPostBody$default(OptionOrderContext optionOrderContext, String str, int i, List list, boolean z, List list2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return optionOrderContext.getApiOptionOrderPostBody(str, i3, list, z, list2);
    }

    public final ApiOptionOrderPostBody getApiOptionOrderPostBody(String requestId, int numberOfChecksSeen, List<String> checkOverrides, boolean isInMaxOrderSizeImprovementExperiment, List<String> orderPathExperiments) {
        Money buyingPower;
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        String account = this.apiRequest.getAccount();
        String account_number = this.apiRequest.getAccount_number();
        OrderDirection direction = this.apiRequest.getDirection();
        List<LegContext> list = this.legContexts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toApiOptionOrderLegPostBody$feature_lib_options_externalDebug((LegContext) it.next()));
        }
        OrderMarketHours market_hours = this.apiRequest.getMarket_hours();
        boolean override_day_trade_checks = this.apiRequest.getOverride_day_trade_checks();
        BigDecimal price = this.apiRequest.getPrice();
        BigDecimal quantity = this.apiRequest.getQuantity();
        BigDecimal quantity_to_replace = this.apiRequest.getQuantity_to_replace();
        UUID ref_id = this.apiRequest.getRef_id();
        UUID order_to_replace_id = this.apiRequest.getOrder_to_replace_id();
        OrderTimeInForce time_in_force = this.apiRequest.getTime_in_force();
        BigDecimal stop_price = this.apiRequest.getStop_price();
        OrderTrigger trigger = this.apiRequest.getTrigger();
        OrderType type2 = this.apiRequest.getType();
        OptionsBuyingPower displayedOptionsBuyingPower = this.accountContext.getDisplayedOptionsBuyingPower();
        return new ApiOptionOrderPostBody(account, account_number, checkOverrides, direction, arrayList, market_hours, override_day_trade_checks, price, quantity, quantity_to_replace, ref_id, order_to_replace_id, time_in_force, stop_price, trigger, type2, new ApiOptionOrderPostBody.ApiOptionOrderPostMetadata(requestId, (displayedOptionsBuyingPower == null || (buyingPower = displayedOptionsBuyingPower.getBuyingPower()) == null) ? null : buyingPower.getDecimalValue(), this.prices.getUserInputPrices().getAbsoluteLimitPriceForAnalytics(), this.prices.getExplicitDirection() != null, numberOfChecksSeen, this.accountContext.getNumberOfAccounts(), this.accountContext.getAccount().getBrokerageAccountType()), Boolean.TRUE, Boolean.valueOf(isInMaxOrderSizeImprovementExperiment), orderPathExperiments);
    }

    public final BigDecimal getApiOptionOrderFeeRequestLegPremium(LegContext legContext) {
        OptionInstrumentQuote optionQuote;
        Decimals4 bidPrice;
        Decimals4 adjustedMarkPrice;
        Intrinsics.checkNotNullParameter(legContext, "legContext");
        OptionOrderUserInputPrices userInputPrices = this.prices.getUserInputPrices();
        if (userInputPrices instanceof OptionOrderUserInputPrices.Limit) {
            if (isSingleLeg()) {
                return this.prices.getAbsoluteLimitPriceForOrderApiRequest();
            }
            OptionInstrumentQuote optionQuote2 = legContext.getRequestContext().getOptionQuote();
            if (optionQuote2 == null || (adjustedMarkPrice = optionQuote2.getAdjustedMarkPrice()) == null) {
                return null;
            }
            return adjustedMarkPrice.getUnsignedValue();
        }
        if (userInputPrices instanceof OptionOrderUserInputPrices.StopLimit) {
            return this.prices.getAbsoluteLimitPriceForOrderApiRequest();
        }
        if (Intrinsics.areEqual(userInputPrices, OptionOrderUserInputPrices.Market.INSTANCE)) {
            LegContext legContext2 = (LegContext) CollectionsKt.singleOrNull((List) this.legContexts);
            if (legContext2 == null || (optionQuote = legContext2.getRequestContext().getOptionQuote()) == null || (bidPrice = optionQuote.getBidPrice()) == null) {
                return null;
            }
            return bidPrice.getUnsignedValue();
        }
        if (!(userInputPrices instanceof OptionOrderUserInputPrices.StopMarket)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.prices.getAbsoluteStopPriceForOrderApiRequest();
    }

    public final BigDecimal getQuantityForLeg(LegContext legContext) {
        Intrinsics.checkNotNullParameter(legContext, "legContext");
        BigDecimal bigDecimalMultiply = this.requestArguments.getQuantity().multiply(legContext.getRequestArguments().getRatioQuantity());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$StrategyContext;", "", "openingStrategyType", "Lcom/robinhood/models/api/OptionStrategyType;", "closingStrategyType", "strategyDisplayName", "", "<init>", "(Lcom/robinhood/models/api/OptionStrategyType;Lcom/robinhood/models/api/OptionStrategyType;Ljava/lang/String;)V", "getOpeningStrategyType", "()Lcom/robinhood/models/api/OptionStrategyType;", "getClosingStrategyType", "getStrategyDisplayName", "()Ljava/lang/String;", "overallStrategyType", "getOverallStrategyType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StrategyContext {
        public static final int $stable = 0;
        private final OptionStrategyType closingStrategyType;
        private final OptionStrategyType openingStrategyType;
        private final OptionStrategyType overallStrategyType;
        private final String strategyDisplayName;

        public static /* synthetic */ StrategyContext copy$default(StrategyContext strategyContext, OptionStrategyType optionStrategyType, OptionStrategyType optionStrategyType2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                optionStrategyType = strategyContext.openingStrategyType;
            }
            if ((i & 2) != 0) {
                optionStrategyType2 = strategyContext.closingStrategyType;
            }
            if ((i & 4) != 0) {
                str = strategyContext.strategyDisplayName;
            }
            return strategyContext.copy(optionStrategyType, optionStrategyType2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionStrategyType getOpeningStrategyType() {
            return this.openingStrategyType;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionStrategyType getClosingStrategyType() {
            return this.closingStrategyType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStrategyDisplayName() {
            return this.strategyDisplayName;
        }

        public final StrategyContext copy(OptionStrategyType openingStrategyType, OptionStrategyType closingStrategyType, String strategyDisplayName) {
            return new StrategyContext(openingStrategyType, closingStrategyType, strategyDisplayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrategyContext)) {
                return false;
            }
            StrategyContext strategyContext = (StrategyContext) other;
            return this.openingStrategyType == strategyContext.openingStrategyType && this.closingStrategyType == strategyContext.closingStrategyType && Intrinsics.areEqual(this.strategyDisplayName, strategyContext.strategyDisplayName);
        }

        public int hashCode() {
            OptionStrategyType optionStrategyType = this.openingStrategyType;
            int iHashCode = (optionStrategyType == null ? 0 : optionStrategyType.hashCode()) * 31;
            OptionStrategyType optionStrategyType2 = this.closingStrategyType;
            int iHashCode2 = (iHashCode + (optionStrategyType2 == null ? 0 : optionStrategyType2.hashCode())) * 31;
            String str = this.strategyDisplayName;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "StrategyContext(openingStrategyType=" + this.openingStrategyType + ", closingStrategyType=" + this.closingStrategyType + ", strategyDisplayName=" + this.strategyDisplayName + ")";
        }

        public StrategyContext(OptionStrategyType optionStrategyType, OptionStrategyType optionStrategyType2, String str) {
            this.openingStrategyType = optionStrategyType;
            this.closingStrategyType = optionStrategyType2;
            this.strategyDisplayName = str;
            this.overallStrategyType = (optionStrategyType == null || optionStrategyType2 != null) ? (optionStrategyType != null || optionStrategyType2 == null) ? null : optionStrategyType2 : optionStrategyType;
        }

        public final OptionStrategyType getOpeningStrategyType() {
            return this.openingStrategyType;
        }

        public final OptionStrategyType getClosingStrategyType() {
            return this.closingStrategyType;
        }

        public final String getStrategyDisplayName() {
            return this.strategyDisplayName;
        }

        public final OptionStrategyType getOverallStrategyType() {
            return this.overallStrategyType;
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestContext;", "", "equityInstruments", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Instrument;", "optionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Ljava/util/Map;Lcom/robinhood/models/ui/UiOptionChain;)V", "getEquityInstruments", "()Ljava/util/Map;", "getOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestContext {
        public static final int $stable = 8;
        private final Map<UUID, Instrument> equityInstruments;
        private final UiOptionChain optionChain;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestContext copy$default(RequestContext requestContext, Map map, UiOptionChain uiOptionChain, int i, Object obj) {
            if ((i & 1) != 0) {
                map = requestContext.equityInstruments;
            }
            if ((i & 2) != 0) {
                uiOptionChain = requestContext.optionChain;
            }
            return requestContext.copy(map, uiOptionChain);
        }

        public final Map<UUID, Instrument> component1() {
            return this.equityInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final UiOptionChain getOptionChain() {
            return this.optionChain;
        }

        public final RequestContext copy(Map<UUID, Instrument> equityInstruments, UiOptionChain optionChain) {
            Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
            Intrinsics.checkNotNullParameter(optionChain, "optionChain");
            return new RequestContext(equityInstruments, optionChain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestContext)) {
                return false;
            }
            RequestContext requestContext = (RequestContext) other;
            return Intrinsics.areEqual(this.equityInstruments, requestContext.equityInstruments) && Intrinsics.areEqual(this.optionChain, requestContext.optionChain);
        }

        public int hashCode() {
            return (this.equityInstruments.hashCode() * 31) + this.optionChain.hashCode();
        }

        public String toString() {
            return "RequestContext(equityInstruments=" + this.equityInstruments + ", optionChain=" + this.optionChain + ")";
        }

        public RequestContext(Map<UUID, Instrument> equityInstruments, UiOptionChain optionChain) {
            Intrinsics.checkNotNullParameter(equityInstruments, "equityInstruments");
            Intrinsics.checkNotNullParameter(optionChain, "optionChain");
            this.equityInstruments = equityInstruments;
            this.optionChain = optionChain;
        }

        public final Map<UUID, Instrument> getEquityInstruments() {
            return this.equityInstruments;
        }

        public final UiOptionChain getOptionChain() {
            return this.optionChain;
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$ValidationContext;", "", "collateral", "Lcom/robinhood/models/api/ApiCollateral;", "cryptoCancelAllPendingOrdersResponse", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "equityRegularMarketHours", "Lcom/robinhood/models/db/MarketHours;", "<init>", "(Lcom/robinhood/models/api/ApiCollateral;Lretrofit2/Response;Lcom/robinhood/models/db/MarketHours;)V", "getCollateral", "()Lcom/robinhood/models/api/ApiCollateral;", "getCryptoCancelAllPendingOrdersResponse", "()Lretrofit2/Response;", "getEquityRegularMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ValidationContext {
        public static final int $stable = 8;
        private final ApiCollateral collateral;
        private final Response<ApiCryptoCancelAllPendingOrders> cryptoCancelAllPendingOrdersResponse;
        private final MarketHours equityRegularMarketHours;

        public ValidationContext() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationContext copy$default(ValidationContext validationContext, ApiCollateral apiCollateral, Response response, MarketHours marketHours, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCollateral = validationContext.collateral;
            }
            if ((i & 2) != 0) {
                response = validationContext.cryptoCancelAllPendingOrdersResponse;
            }
            if ((i & 4) != 0) {
                marketHours = validationContext.equityRegularMarketHours;
            }
            return validationContext.copy(apiCollateral, response, marketHours);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCollateral getCollateral() {
            return this.collateral;
        }

        public final Response<ApiCryptoCancelAllPendingOrders> component2() {
            return this.cryptoCancelAllPendingOrdersResponse;
        }

        /* renamed from: component3, reason: from getter */
        public final MarketHours getEquityRegularMarketHours() {
            return this.equityRegularMarketHours;
        }

        public final ValidationContext copy(ApiCollateral collateral, Response<ApiCryptoCancelAllPendingOrders> cryptoCancelAllPendingOrdersResponse, MarketHours equityRegularMarketHours) {
            return new ValidationContext(collateral, cryptoCancelAllPendingOrdersResponse, equityRegularMarketHours);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationContext)) {
                return false;
            }
            ValidationContext validationContext = (ValidationContext) other;
            return Intrinsics.areEqual(this.collateral, validationContext.collateral) && Intrinsics.areEqual(this.cryptoCancelAllPendingOrdersResponse, validationContext.cryptoCancelAllPendingOrdersResponse) && Intrinsics.areEqual(this.equityRegularMarketHours, validationContext.equityRegularMarketHours);
        }

        public int hashCode() {
            ApiCollateral apiCollateral = this.collateral;
            int iHashCode = (apiCollateral == null ? 0 : apiCollateral.hashCode()) * 31;
            Response<ApiCryptoCancelAllPendingOrders> response = this.cryptoCancelAllPendingOrdersResponse;
            int iHashCode2 = (iHashCode + (response == null ? 0 : response.hashCode())) * 31;
            MarketHours marketHours = this.equityRegularMarketHours;
            return iHashCode2 + (marketHours != null ? marketHours.hashCode() : 0);
        }

        public String toString() {
            return "ValidationContext(collateral=" + this.collateral + ", cryptoCancelAllPendingOrdersResponse=" + this.cryptoCancelAllPendingOrdersResponse + ", equityRegularMarketHours=" + this.equityRegularMarketHours + ")";
        }

        public ValidationContext(ApiCollateral apiCollateral, Response<ApiCryptoCancelAllPendingOrders> response, MarketHours marketHours) {
            this.collateral = apiCollateral;
            this.cryptoCancelAllPendingOrdersResponse = response;
            this.equityRegularMarketHours = marketHours;
        }

        public /* synthetic */ ValidationContext(ApiCollateral apiCollateral, Response response, MarketHours marketHours, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : apiCollateral, (i & 2) != 0 ? null : response, (i & 4) != 0 ? null : marketHours);
        }

        public final ApiCollateral getCollateral() {
            return this.collateral;
        }

        public final Response<ApiCryptoCancelAllPendingOrders> getCryptoCancelAllPendingOrdersResponse() {
            return this.cryptoCancelAllPendingOrdersResponse;
        }

        public final MarketHours getEquityRegularMarketHours() {
            return this.equityRegularMarketHours;
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JS\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestArguments;", "", "overrideDayTradeChecks", "", "overrideDtbpChecks", "quantity", "Ljava/math/BigDecimal;", "refId", "Ljava/util/UUID;", "optionOrderToReplaceBundle", "Lcom/robinhood/models/ui/OptionOrderToReplaceBundle;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "<init>", "(ZZLjava/math/BigDecimal;Ljava/util/UUID;Lcom/robinhood/models/ui/OptionOrderToReplaceBundle;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;)V", "getOverrideDayTradeChecks", "()Z", "getOverrideDtbpChecks", "getQuantity", "()Ljava/math/BigDecimal;", "getRefId", "()Ljava/util/UUID;", "getOptionOrderToReplaceBundle", "()Lcom/robinhood/models/ui/OptionOrderToReplaceBundle;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestArguments {
        public static final int $stable = 8;
        private final OrderMarketHours marketHours;
        private final OptionOrderToReplaceBundle optionOrderToReplaceBundle;
        private final boolean overrideDayTradeChecks;
        private final boolean overrideDtbpChecks;
        private final BigDecimal quantity;
        private final UUID refId;
        private final OrderTimeInForce timeInForce;

        public static /* synthetic */ RequestArguments copy$default(RequestArguments requestArguments, boolean z, boolean z2, BigDecimal bigDecimal, UUID uuid, OptionOrderToReplaceBundle optionOrderToReplaceBundle, OrderTimeInForce orderTimeInForce, OrderMarketHours orderMarketHours, int i, Object obj) {
            if ((i & 1) != 0) {
                z = requestArguments.overrideDayTradeChecks;
            }
            if ((i & 2) != 0) {
                z2 = requestArguments.overrideDtbpChecks;
            }
            if ((i & 4) != 0) {
                bigDecimal = requestArguments.quantity;
            }
            if ((i & 8) != 0) {
                uuid = requestArguments.refId;
            }
            if ((i & 16) != 0) {
                optionOrderToReplaceBundle = requestArguments.optionOrderToReplaceBundle;
            }
            if ((i & 32) != 0) {
                orderTimeInForce = requestArguments.timeInForce;
            }
            if ((i & 64) != 0) {
                orderMarketHours = requestArguments.marketHours;
            }
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            OrderMarketHours orderMarketHours2 = orderMarketHours;
            OptionOrderToReplaceBundle optionOrderToReplaceBundle2 = optionOrderToReplaceBundle;
            BigDecimal bigDecimal2 = bigDecimal;
            return requestArguments.copy(z, z2, bigDecimal2, uuid, optionOrderToReplaceBundle2, orderTimeInForce2, orderMarketHours2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getOverrideDayTradeChecks() {
            return this.overrideDayTradeChecks;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getOverrideDtbpChecks() {
            return this.overrideDtbpChecks;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOrderToReplaceBundle getOptionOrderToReplaceBundle() {
            return this.optionOrderToReplaceBundle;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component7, reason: from getter */
        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }

        public final RequestArguments copy(boolean overrideDayTradeChecks, boolean overrideDtbpChecks, BigDecimal quantity, UUID refId, OptionOrderToReplaceBundle optionOrderToReplaceBundle, OrderTimeInForce timeInForce, OrderMarketHours marketHours) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new RequestArguments(overrideDayTradeChecks, overrideDtbpChecks, quantity, refId, optionOrderToReplaceBundle, timeInForce, marketHours);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestArguments)) {
                return false;
            }
            RequestArguments requestArguments = (RequestArguments) other;
            return this.overrideDayTradeChecks == requestArguments.overrideDayTradeChecks && this.overrideDtbpChecks == requestArguments.overrideDtbpChecks && Intrinsics.areEqual(this.quantity, requestArguments.quantity) && Intrinsics.areEqual(this.refId, requestArguments.refId) && Intrinsics.areEqual(this.optionOrderToReplaceBundle, requestArguments.optionOrderToReplaceBundle) && this.timeInForce == requestArguments.timeInForce && this.marketHours == requestArguments.marketHours;
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.overrideDayTradeChecks) * 31) + Boolean.hashCode(this.overrideDtbpChecks)) * 31) + this.quantity.hashCode()) * 31) + this.refId.hashCode()) * 31;
            OptionOrderToReplaceBundle optionOrderToReplaceBundle = this.optionOrderToReplaceBundle;
            int iHashCode2 = (((iHashCode + (optionOrderToReplaceBundle == null ? 0 : optionOrderToReplaceBundle.hashCode())) * 31) + this.timeInForce.hashCode()) * 31;
            OrderMarketHours orderMarketHours = this.marketHours;
            return iHashCode2 + (orderMarketHours != null ? orderMarketHours.hashCode() : 0);
        }

        public String toString() {
            return "RequestArguments(overrideDayTradeChecks=" + this.overrideDayTradeChecks + ", overrideDtbpChecks=" + this.overrideDtbpChecks + ", quantity=" + this.quantity + ", refId=" + this.refId + ", optionOrderToReplaceBundle=" + this.optionOrderToReplaceBundle + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ")";
        }

        public RequestArguments(boolean z, boolean z2, BigDecimal quantity, UUID refId, OptionOrderToReplaceBundle optionOrderToReplaceBundle, OrderTimeInForce timeInForce, OrderMarketHours orderMarketHours) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.overrideDayTradeChecks = z;
            this.overrideDtbpChecks = z2;
            this.quantity = quantity;
            this.refId = refId;
            this.optionOrderToReplaceBundle = optionOrderToReplaceBundle;
            this.timeInForce = timeInForce;
            this.marketHours = orderMarketHours;
        }

        public final boolean getOverrideDayTradeChecks() {
            return this.overrideDayTradeChecks;
        }

        public final boolean getOverrideDtbpChecks() {
            return this.overrideDtbpChecks;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final OptionOrderToReplaceBundle getOptionOrderToReplaceBundle() {
            return this.optionOrderToReplaceBundle;
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final OrderMarketHours getMarketHours() {
            return this.marketHours;
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001f !B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;", "", "requestArguments", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestArguments;", "requestContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestContext;", "accountContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$AccountContext;", "<init>", "(Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestArguments;Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestContext;Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$AccountContext;)V", "getRequestArguments", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestArguments;", "getRequestContext", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestContext;", "getAccountContext", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$AccountContext;", "closeableQuantity", "Ljava/math/BigDecimal;", "getCloseableQuantity", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RequestArguments", "RequestContext", "AccountContext", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LegContext {
        public static final int $stable = 8;
        private final AccountContext accountContext;
        private final RequestArguments requestArguments;
        private final RequestContext requestContext;

        public static /* synthetic */ LegContext copy$default(LegContext legContext, RequestArguments requestArguments, RequestContext requestContext, AccountContext accountContext, int i, Object obj) {
            if ((i & 1) != 0) {
                requestArguments = legContext.requestArguments;
            }
            if ((i & 2) != 0) {
                requestContext = legContext.requestContext;
            }
            if ((i & 4) != 0) {
                accountContext = legContext.accountContext;
            }
            return legContext.copy(requestArguments, requestContext, accountContext);
        }

        /* renamed from: component1, reason: from getter */
        public final RequestArguments getRequestArguments() {
            return this.requestArguments;
        }

        /* renamed from: component2, reason: from getter */
        public final RequestContext getRequestContext() {
            return this.requestContext;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountContext getAccountContext() {
            return this.accountContext;
        }

        public final LegContext copy(RequestArguments requestArguments, RequestContext requestContext, AccountContext accountContext) {
            Intrinsics.checkNotNullParameter(requestArguments, "requestArguments");
            Intrinsics.checkNotNullParameter(requestContext, "requestContext");
            Intrinsics.checkNotNullParameter(accountContext, "accountContext");
            return new LegContext(requestArguments, requestContext, accountContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegContext)) {
                return false;
            }
            LegContext legContext = (LegContext) other;
            return Intrinsics.areEqual(this.requestArguments, legContext.requestArguments) && Intrinsics.areEqual(this.requestContext, legContext.requestContext) && Intrinsics.areEqual(this.accountContext, legContext.accountContext);
        }

        public int hashCode() {
            return (((this.requestArguments.hashCode() * 31) + this.requestContext.hashCode()) * 31) + this.accountContext.hashCode();
        }

        public String toString() {
            return "LegContext(requestArguments=" + this.requestArguments + ", requestContext=" + this.requestContext + ", accountContext=" + this.accountContext + ")";
        }

        public LegContext(RequestArguments requestArguments, RequestContext requestContext, AccountContext accountContext) {
            Intrinsics.checkNotNullParameter(requestArguments, "requestArguments");
            Intrinsics.checkNotNullParameter(requestContext, "requestContext");
            Intrinsics.checkNotNullParameter(accountContext, "accountContext");
            this.requestArguments = requestArguments;
            this.requestContext = requestContext;
            this.accountContext = accountContext;
        }

        public final RequestArguments getRequestArguments() {
            return this.requestArguments;
        }

        public final RequestContext getRequestContext() {
            return this.requestContext;
        }

        public final AccountContext getAccountContext() {
            return this.accountContext;
        }

        /* compiled from: OptionOrderContext.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestArguments;", "", "side", "Lcom/robinhood/models/db/OrderSide;", "ratioQuantity", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;)V", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getRatioQuantity", "()Ljava/math/BigDecimal;", "direction", "Lcom/robinhood/models/db/OrderDirection;", "getDirection", "()Lcom/robinhood/models/db/OrderDirection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RequestArguments {
            public static final int $stable = 8;
            private final OrderDirection direction;
            private final BigDecimal ratioQuantity;
            private final OrderSide side;

            public static /* synthetic */ RequestArguments copy$default(RequestArguments requestArguments, OrderSide orderSide, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderSide = requestArguments.side;
                }
                if ((i & 2) != 0) {
                    bigDecimal = requestArguments.ratioQuantity;
                }
                return requestArguments.copy(orderSide, bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getRatioQuantity() {
                return this.ratioQuantity;
            }

            public final RequestArguments copy(OrderSide side, BigDecimal ratioQuantity) {
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(ratioQuantity, "ratioQuantity");
                return new RequestArguments(side, ratioQuantity);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequestArguments)) {
                    return false;
                }
                RequestArguments requestArguments = (RequestArguments) other;
                return this.side == requestArguments.side && Intrinsics.areEqual(this.ratioQuantity, requestArguments.ratioQuantity);
            }

            public int hashCode() {
                return (this.side.hashCode() * 31) + this.ratioQuantity.hashCode();
            }

            public String toString() {
                return "RequestArguments(side=" + this.side + ", ratioQuantity=" + this.ratioQuantity + ")";
            }

            public RequestArguments(OrderSide side, BigDecimal ratioQuantity) {
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(ratioQuantity, "ratioQuantity");
                this.side = side;
                this.ratioQuantity = ratioQuantity;
                this.direction = OrderDirection.INSTANCE.fromSide(side);
            }

            public final OrderSide getSide() {
                return this.side;
            }

            public final BigDecimal getRatioQuantity() {
                return this.ratioQuantity;
            }

            public final OrderDirection getDirection() {
                return this.direction;
            }
        }

        /* compiled from: OptionOrderContext.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$RequestContext;", "", "optionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "optionQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "<init>", "(Lcom/robinhood/models/ui/UiOptionInstrument;Lcom/robinhood/models/db/OptionInstrumentQuote;Lcom/robinhood/models/db/OrderPositionEffect;)V", "getOptionInstrument", "()Lcom/robinhood/models/ui/UiOptionInstrument;", "getOptionQuote", "()Lcom/robinhood/models/db/OptionInstrumentQuote;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RequestContext {
            public static final int $stable = 8;
            private final UiOptionInstrument optionInstrument;
            private final OptionInstrumentQuote optionQuote;
            private final OrderPositionEffect positionEffect;

            public static /* synthetic */ RequestContext copy$default(RequestContext requestContext, UiOptionInstrument uiOptionInstrument, OptionInstrumentQuote optionInstrumentQuote, OrderPositionEffect orderPositionEffect, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiOptionInstrument = requestContext.optionInstrument;
                }
                if ((i & 2) != 0) {
                    optionInstrumentQuote = requestContext.optionQuote;
                }
                if ((i & 4) != 0) {
                    orderPositionEffect = requestContext.positionEffect;
                }
                return requestContext.copy(uiOptionInstrument, optionInstrumentQuote, orderPositionEffect);
            }

            /* renamed from: component1, reason: from getter */
            public final UiOptionInstrument getOptionInstrument() {
                return this.optionInstrument;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionInstrumentQuote getOptionQuote() {
                return this.optionQuote;
            }

            /* renamed from: component3, reason: from getter */
            public final OrderPositionEffect getPositionEffect() {
                return this.positionEffect;
            }

            public final RequestContext copy(UiOptionInstrument optionInstrument, OptionInstrumentQuote optionQuote, OrderPositionEffect positionEffect) {
                Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
                Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
                return new RequestContext(optionInstrument, optionQuote, positionEffect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequestContext)) {
                    return false;
                }
                RequestContext requestContext = (RequestContext) other;
                return Intrinsics.areEqual(this.optionInstrument, requestContext.optionInstrument) && Intrinsics.areEqual(this.optionQuote, requestContext.optionQuote) && this.positionEffect == requestContext.positionEffect;
            }

            public int hashCode() {
                int iHashCode = this.optionInstrument.hashCode() * 31;
                OptionInstrumentQuote optionInstrumentQuote = this.optionQuote;
                return ((iHashCode + (optionInstrumentQuote == null ? 0 : optionInstrumentQuote.hashCode())) * 31) + this.positionEffect.hashCode();
            }

            public String toString() {
                return "RequestContext(optionInstrument=" + this.optionInstrument + ", optionQuote=" + this.optionQuote + ", positionEffect=" + this.positionEffect + ")";
            }

            public RequestContext(UiOptionInstrument optionInstrument, OptionInstrumentQuote optionInstrumentQuote, OrderPositionEffect positionEffect) {
                Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
                Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
                this.optionInstrument = optionInstrument;
                this.optionQuote = optionInstrumentQuote;
                this.positionEffect = positionEffect;
            }

            public final UiOptionInstrument getOptionInstrument() {
                return this.optionInstrument;
            }

            public final OptionInstrumentQuote getOptionQuote() {
                return this.optionQuote;
            }

            public final OrderPositionEffect getPositionEffect() {
                return this.positionEffect;
            }
        }

        /* compiled from: OptionOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext$AccountContext;", "", "shortPosition", "Lcom/robinhood/models/db/OptionInstrumentPosition;", "longPosition", "<init>", "(Lcom/robinhood/models/db/OptionInstrumentPosition;Lcom/robinhood/models/db/OptionInstrumentPosition;)V", "getShortPosition", "()Lcom/robinhood/models/db/OptionInstrumentPosition;", "getLongPosition", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountContext {
            public static final int $stable = 8;
            private final OptionInstrumentPosition longPosition;
            private final OptionInstrumentPosition shortPosition;

            public static /* synthetic */ AccountContext copy$default(AccountContext accountContext, OptionInstrumentPosition optionInstrumentPosition, OptionInstrumentPosition optionInstrumentPosition2, int i, Object obj) {
                if ((i & 1) != 0) {
                    optionInstrumentPosition = accountContext.shortPosition;
                }
                if ((i & 2) != 0) {
                    optionInstrumentPosition2 = accountContext.longPosition;
                }
                return accountContext.copy(optionInstrumentPosition, optionInstrumentPosition2);
            }

            /* renamed from: component1, reason: from getter */
            public final OptionInstrumentPosition getShortPosition() {
                return this.shortPosition;
            }

            /* renamed from: component2, reason: from getter */
            public final OptionInstrumentPosition getLongPosition() {
                return this.longPosition;
            }

            public final AccountContext copy(OptionInstrumentPosition shortPosition, OptionInstrumentPosition longPosition) {
                return new AccountContext(shortPosition, longPosition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountContext)) {
                    return false;
                }
                AccountContext accountContext = (AccountContext) other;
                return Intrinsics.areEqual(this.shortPosition, accountContext.shortPosition) && Intrinsics.areEqual(this.longPosition, accountContext.longPosition);
            }

            public int hashCode() {
                OptionInstrumentPosition optionInstrumentPosition = this.shortPosition;
                int iHashCode = (optionInstrumentPosition == null ? 0 : optionInstrumentPosition.hashCode()) * 31;
                OptionInstrumentPosition optionInstrumentPosition2 = this.longPosition;
                return iHashCode + (optionInstrumentPosition2 != null ? optionInstrumentPosition2.hashCode() : 0);
            }

            public String toString() {
                return "AccountContext(shortPosition=" + this.shortPosition + ", longPosition=" + this.longPosition + ")";
            }

            public AccountContext(OptionInstrumentPosition optionInstrumentPosition, OptionInstrumentPosition optionInstrumentPosition2) {
                this.shortPosition = optionInstrumentPosition;
                this.longPosition = optionInstrumentPosition2;
            }

            public final OptionInstrumentPosition getShortPosition() {
                return this.shortPosition;
            }

            public final OptionInstrumentPosition getLongPosition() {
                return this.longPosition;
            }
        }

        public final BigDecimal getCloseableQuantity() {
            if (this.accountContext.getShortPosition() != null) {
                return this.accountContext.getShortPosition().getCloseableQuantity();
            }
            if (this.accountContext.getLongPosition() != null) {
                return this.accountContext.getLongPosition().getCloseableQuantity();
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÂ\u0003J\u0019\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0001J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0003J\u0013\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\tH\u0096\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$LimitPrice;", "Lkotlin/ranges/ClosedRange;", "Ljava/math/BigDecimal;", "value", "<init>", "(Lkotlin/ranges/ClosedRange;)V", "component1", "copy", "contains", "", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "endInclusive", "getEndInclusive", "()Ljava/math/BigDecimal;", "start", "getStart", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LimitPrice implements Range2<BigDecimal> {
        public static final int $stable = 8;
        private final Range2<BigDecimal> value;

        private final Range2<BigDecimal> component1() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LimitPrice copy$default(LimitPrice limitPrice, Range2 range2, int i, Object obj) {
            if ((i & 1) != 0) {
                range2 = limitPrice.value;
            }
            return limitPrice.copy(range2);
        }

        @Override // kotlin.ranges.Range2
        public boolean contains(BigDecimal value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return this.value.contains(value);
        }

        public final LimitPrice copy(Range2<BigDecimal> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new LimitPrice(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LimitPrice) && Intrinsics.areEqual(this.value, ((LimitPrice) other).value);
        }

        @Override // kotlin.ranges.Range2
        public BigDecimal getEndInclusive() {
            return (BigDecimal) this.value.getEndInclusive();
        }

        @Override // kotlin.ranges.Range2
        public BigDecimal getStart() {
            return (BigDecimal) this.value.getStart();
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // kotlin.ranges.Range2
        public boolean isEmpty() {
            return this.value.isEmpty();
        }

        public String toString() {
            return "LimitPrice(value=" + this.value + ")";
        }

        public LimitPrice(Range2<BigDecimal> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$AccountContext;", "", "account", "Lcom/robinhood/models/db/Account;", "numberOfAccounts", "", "equityPosition", "Lcom/robinhood/models/db/Position;", "aggregateOptionPosition", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "displayedOptionsBuyingPower", "Lcom/robinhood/models/db/OptionsBuyingPower;", "<init>", "(Lcom/robinhood/models/db/Account;ILcom/robinhood/models/db/Position;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/db/OptionsBuyingPower;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getNumberOfAccounts", "()I", "getEquityPosition", "()Lcom/robinhood/models/db/Position;", "getAggregateOptionPosition", "()Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getDisplayedOptionsBuyingPower", "()Lcom/robinhood/models/db/OptionsBuyingPower;", "hasMultipleAccounts", "", "getHasMultipleAccounts", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountContext {
        public static final int $stable = 8;
        private final Account account;
        private final UiAggregateOptionPositionFull aggregateOptionPosition;
        private final OptionsBuyingPower displayedOptionsBuyingPower;
        private final Position equityPosition;
        private final boolean hasMultipleAccounts;
        private final int numberOfAccounts;

        public static /* synthetic */ AccountContext copy$default(AccountContext accountContext, Account account, int i, Position position, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, OptionsBuyingPower optionsBuyingPower, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                account = accountContext.account;
            }
            if ((i2 & 2) != 0) {
                i = accountContext.numberOfAccounts;
            }
            if ((i2 & 4) != 0) {
                position = accountContext.equityPosition;
            }
            if ((i2 & 8) != 0) {
                uiAggregateOptionPositionFull = accountContext.aggregateOptionPosition;
            }
            if ((i2 & 16) != 0) {
                optionsBuyingPower = accountContext.displayedOptionsBuyingPower;
            }
            OptionsBuyingPower optionsBuyingPower2 = optionsBuyingPower;
            Position position2 = position;
            return accountContext.copy(account, i, position2, uiAggregateOptionPositionFull, optionsBuyingPower2);
        }

        /* renamed from: component1, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNumberOfAccounts() {
            return this.numberOfAccounts;
        }

        /* renamed from: component3, reason: from getter */
        public final Position getEquityPosition() {
            return this.equityPosition;
        }

        /* renamed from: component4, reason: from getter */
        public final UiAggregateOptionPositionFull getAggregateOptionPosition() {
            return this.aggregateOptionPosition;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionsBuyingPower getDisplayedOptionsBuyingPower() {
            return this.displayedOptionsBuyingPower;
        }

        public final AccountContext copy(Account account, int numberOfAccounts, Position equityPosition, UiAggregateOptionPositionFull aggregateOptionPosition, OptionsBuyingPower displayedOptionsBuyingPower) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new AccountContext(account, numberOfAccounts, equityPosition, aggregateOptionPosition, displayedOptionsBuyingPower);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountContext)) {
                return false;
            }
            AccountContext accountContext = (AccountContext) other;
            return Intrinsics.areEqual(this.account, accountContext.account) && this.numberOfAccounts == accountContext.numberOfAccounts && Intrinsics.areEqual(this.equityPosition, accountContext.equityPosition) && Intrinsics.areEqual(this.aggregateOptionPosition, accountContext.aggregateOptionPosition) && Intrinsics.areEqual(this.displayedOptionsBuyingPower, accountContext.displayedOptionsBuyingPower);
        }

        public int hashCode() {
            int iHashCode = ((this.account.hashCode() * 31) + Integer.hashCode(this.numberOfAccounts)) * 31;
            Position position = this.equityPosition;
            int iHashCode2 = (iHashCode + (position == null ? 0 : position.hashCode())) * 31;
            UiAggregateOptionPositionFull uiAggregateOptionPositionFull = this.aggregateOptionPosition;
            int iHashCode3 = (iHashCode2 + (uiAggregateOptionPositionFull == null ? 0 : uiAggregateOptionPositionFull.hashCode())) * 31;
            OptionsBuyingPower optionsBuyingPower = this.displayedOptionsBuyingPower;
            return iHashCode3 + (optionsBuyingPower != null ? optionsBuyingPower.hashCode() : 0);
        }

        public String toString() {
            return "AccountContext(account=" + this.account + ", numberOfAccounts=" + this.numberOfAccounts + ", equityPosition=" + this.equityPosition + ", aggregateOptionPosition=" + this.aggregateOptionPosition + ", displayedOptionsBuyingPower=" + this.displayedOptionsBuyingPower + ")";
        }

        public AccountContext(Account account, int i, Position position, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, OptionsBuyingPower optionsBuyingPower) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.numberOfAccounts = i;
            this.equityPosition = position;
            this.aggregateOptionPosition = uiAggregateOptionPositionFull;
            this.displayedOptionsBuyingPower = optionsBuyingPower;
            this.hasMultipleAccounts = i > 1;
        }

        public final Account getAccount() {
            return this.account;
        }

        public final int getNumberOfAccounts() {
            return this.numberOfAccounts;
        }

        public final Position getEquityPosition() {
            return this.equityPosition;
        }

        public final UiAggregateOptionPositionFull getAggregateOptionPosition() {
            return this.aggregateOptionPosition;
        }

        public final OptionsBuyingPower getDisplayedOptionsBuyingPower() {
            return this.displayedOptionsBuyingPower;
        }

        public final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$QuoteAggregation;", "", "bidPrice", "Ljava/math/BigDecimal;", "askPrice", "bidPriceForLogging", "askPriceForLogging", "defaultPrice", "naturalPrice", "isAggregate", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)V", "getBidPrice", "()Ljava/math/BigDecimal;", "getAskPrice", "getBidPriceForLogging", "getAskPriceForLogging", "getDefaultPrice", "getNaturalPrice", "()Z", "spreadAmount", "getSpreadAmount", "isBidAskNegative", "isBidAskPositive", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuoteAggregation {
        private final BigDecimal askPrice;
        private final BigDecimal askPriceForLogging;
        private final BigDecimal bidPrice;
        private final BigDecimal bidPriceForLogging;
        private final BigDecimal defaultPrice;
        private final boolean isAggregate;
        private final BigDecimal naturalPrice;
        private final BigDecimal spreadAmount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public static /* synthetic */ QuoteAggregation copy$default(QuoteAggregation quoteAggregation, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = quoteAggregation.bidPrice;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = quoteAggregation.askPrice;
            }
            if ((i & 4) != 0) {
                bigDecimal3 = quoteAggregation.bidPriceForLogging;
            }
            if ((i & 8) != 0) {
                bigDecimal4 = quoteAggregation.askPriceForLogging;
            }
            if ((i & 16) != 0) {
                bigDecimal5 = quoteAggregation.defaultPrice;
            }
            if ((i & 32) != 0) {
                bigDecimal6 = quoteAggregation.naturalPrice;
            }
            if ((i & 64) != 0) {
                z = quoteAggregation.isAggregate;
            }
            BigDecimal bigDecimal7 = bigDecimal6;
            boolean z2 = z;
            BigDecimal bigDecimal8 = bigDecimal5;
            BigDecimal bigDecimal9 = bigDecimal3;
            return quoteAggregation.copy(bigDecimal, bigDecimal2, bigDecimal9, bigDecimal4, bigDecimal8, bigDecimal7, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getBidPrice() {
            return this.bidPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAskPrice() {
            return this.askPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getBidPriceForLogging() {
            return this.bidPriceForLogging;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getAskPriceForLogging() {
            return this.askPriceForLogging;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getDefaultPrice() {
            return this.defaultPrice;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getNaturalPrice() {
            return this.naturalPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsAggregate() {
            return this.isAggregate;
        }

        public final QuoteAggregation copy(BigDecimal bidPrice, BigDecimal askPrice, BigDecimal bidPriceForLogging, BigDecimal askPriceForLogging, BigDecimal defaultPrice, BigDecimal naturalPrice, boolean isAggregate) {
            Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
            Intrinsics.checkNotNullParameter(askPrice, "askPrice");
            Intrinsics.checkNotNullParameter(bidPriceForLogging, "bidPriceForLogging");
            Intrinsics.checkNotNullParameter(askPriceForLogging, "askPriceForLogging");
            Intrinsics.checkNotNullParameter(naturalPrice, "naturalPrice");
            return new QuoteAggregation(bidPrice, askPrice, bidPriceForLogging, askPriceForLogging, defaultPrice, naturalPrice, isAggregate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuoteAggregation)) {
                return false;
            }
            QuoteAggregation quoteAggregation = (QuoteAggregation) other;
            return Intrinsics.areEqual(this.bidPrice, quoteAggregation.bidPrice) && Intrinsics.areEqual(this.askPrice, quoteAggregation.askPrice) && Intrinsics.areEqual(this.bidPriceForLogging, quoteAggregation.bidPriceForLogging) && Intrinsics.areEqual(this.askPriceForLogging, quoteAggregation.askPriceForLogging) && Intrinsics.areEqual(this.defaultPrice, quoteAggregation.defaultPrice) && Intrinsics.areEqual(this.naturalPrice, quoteAggregation.naturalPrice) && this.isAggregate == quoteAggregation.isAggregate;
        }

        public int hashCode() {
            int iHashCode = ((((((this.bidPrice.hashCode() * 31) + this.askPrice.hashCode()) * 31) + this.bidPriceForLogging.hashCode()) * 31) + this.askPriceForLogging.hashCode()) * 31;
            BigDecimal bigDecimal = this.defaultPrice;
            return ((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.naturalPrice.hashCode()) * 31) + Boolean.hashCode(this.isAggregate);
        }

        public String toString() {
            return "QuoteAggregation(bidPrice=" + this.bidPrice + ", askPrice=" + this.askPrice + ", bidPriceForLogging=" + this.bidPriceForLogging + ", askPriceForLogging=" + this.askPriceForLogging + ", defaultPrice=" + this.defaultPrice + ", naturalPrice=" + this.naturalPrice + ", isAggregate=" + this.isAggregate + ")";
        }

        public QuoteAggregation(BigDecimal bidPrice, BigDecimal askPrice, BigDecimal bidPriceForLogging, BigDecimal askPriceForLogging, BigDecimal bigDecimal, BigDecimal naturalPrice, boolean z) {
            Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
            Intrinsics.checkNotNullParameter(askPrice, "askPrice");
            Intrinsics.checkNotNullParameter(bidPriceForLogging, "bidPriceForLogging");
            Intrinsics.checkNotNullParameter(askPriceForLogging, "askPriceForLogging");
            Intrinsics.checkNotNullParameter(naturalPrice, "naturalPrice");
            this.bidPrice = bidPrice;
            this.askPrice = askPrice;
            this.bidPriceForLogging = bidPriceForLogging;
            this.askPriceForLogging = askPriceForLogging;
            this.defaultPrice = bigDecimal;
            this.naturalPrice = naturalPrice;
            this.isAggregate = z;
            BigDecimal bigDecimalSubtract = askPrice.subtract(bidPrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            this.spreadAmount = bigDecimalSubtract;
        }

        public final BigDecimal getBidPrice() {
            return this.bidPrice;
        }

        public final BigDecimal getAskPrice() {
            return this.askPrice;
        }

        public final BigDecimal getBidPriceForLogging() {
            return this.bidPriceForLogging;
        }

        public final BigDecimal getAskPriceForLogging() {
            return this.askPriceForLogging;
        }

        public final BigDecimal getDefaultPrice() {
            return this.defaultPrice;
        }

        public final BigDecimal getNaturalPrice() {
            return this.naturalPrice;
        }

        public final boolean isAggregate() {
            return this.isAggregate;
        }

        public final BigDecimal getSpreadAmount() {
            return this.spreadAmount;
        }

        public final boolean isBidAskNegative() {
            if (BigDecimals7.isNegative(this.bidPrice)) {
                return BigDecimals7.isNegative(this.askPrice) || BigDecimals7.isZero(this.askPrice);
            }
            return false;
        }

        public final boolean isBidAskPositive() {
            return (BigDecimals7.isPositive(this.bidPrice) || BigDecimals7.isZero(this.bidPrice)) && BigDecimals7.isPositive(this.askPrice);
        }

        /* compiled from: OptionOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$QuoteAggregation$Companion;", "", "<init>", "()V", "fromAggregator", "Lcom/robinhood/android/common/options/order/OptionOrderContext$QuoteAggregation;", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "legContexts", "", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final QuoteAggregation fromAggregator(OptionSettings.DefaultPricingSetting defaultPricingType, List<LegContext> legContexts) {
                Intrinsics.checkNotNullParameter(legContexts, "legContexts");
                BigDecimal scale = null;
                if (legContexts.isEmpty()) {
                    return null;
                }
                List<LegContext> list = legContexts;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (LegContext legContext : list) {
                    OptionInstrumentQuote optionQuote = legContext.getRequestContext().getOptionQuote();
                    if (optionQuote == null) {
                        return null;
                    }
                    arrayList.add(new OptionQuoteAggregator.LegContext(optionQuote, legContext.getRequestArguments().getSide(), legContext.getRequestArguments().getRatioQuantity()));
                }
                OptionQuoteAggregator optionQuoteAggregator = OptionQuoteAggregator.INSTANCE;
                OptionQuoteAggregator.BidAsk internalBidAsk = optionQuoteAggregator.getInternalBidAsk(arrayList);
                BigDecimal internalDefaultPriceNullable = optionQuoteAggregator.getInternalDefaultPriceNullable(arrayList, defaultPricingType, true);
                BigDecimal bid = internalBidAsk.getBid();
                BigDecimal ask = internalBidAsk.getAsk();
                BigDecimal bid2 = internalBidAsk.getBid();
                BigDecimal ask2 = internalBidAsk.getAsk();
                if (internalDefaultPriceNullable != null) {
                    if (arrayList.size() == 1) {
                        OptionChain.TickRequirements tickRequirements = (OptionChain.TickRequirements) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.common.options.order.OptionOrderContext$QuoteAggregation$Companion$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionOrderContext.QuoteAggregation.Companion.fromAggregator$lambda$2$lambda$1((OptionOrderContext.LegContext) obj);
                            }
                        }));
                        if (tickRequirements == null) {
                            return null;
                        }
                        internalDefaultPriceNullable = optionQuoteAggregator.getInternalMinTickedPrice(internalDefaultPriceNullable, tickRequirements);
                    }
                    if (internalDefaultPriceNullable != null) {
                        scale = internalDefaultPriceNullable.setScale(2, RoundingMode.UP);
                    }
                }
                return new QuoteAggregation(bid, ask, bid2, ask2, scale, optionQuoteAggregator.getInternalDefaultPrice(arrayList, OptionSettings.DefaultPricingSetting.NATURAL_PRICE, true), arrayList.size() > 1);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionChain.TickRequirements fromAggregator$lambda$2$lambda$1(LegContext it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getRequestContext().getOptionInstrument().getOptionChain().getMinTicks();
            }
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0001`B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010Z\u001a\u00020\u00052\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020]HÖ\u0001J\t\u0010^\u001a\u00020_HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u001f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0005*\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u00102\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0010\u00104\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010;\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0013\u0010=\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0013\u0010?\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0010\u0010A\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010C\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0013\u0010E\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0013\u0010G\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0013\u0010I\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)R\u0013\u0010K\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010)R\u0013\u0010M\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bN\u0010)R\u0010\u0010O\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010P\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bP\u0010\u0012R\u0011\u0010Q\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0012¨\u0006a"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;", "", "directionOverride", "Lcom/robinhood/models/db/OrderDirection;", "preserveUserInput", "", "quoteAggregation", "Lcom/robinhood/android/common/options/order/OptionOrderContext$QuoteAggregation;", "singleLegDirection", "userInputPrices", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "<init>", "(Lcom/robinhood/models/db/OrderDirection;ZLcom/robinhood/android/common/options/order/OptionOrderContext$QuoteAggregation;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;)V", "getDirectionOverride", "()Lcom/robinhood/models/db/OrderDirection;", "getPreserveUserInput", "()Z", "getQuoteAggregation", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$QuoteAggregation;", "getSingleLegDirection", "getUserInputPrices", "()Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "getDefaultPricingType", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "explicitDirection", "getExplicitDirection$feature_lib_options_externalDebug", "netDirection", "getNetDirection", "isDebit", "isCredit", "roundingMode", "Ljava/math/RoundingMode;", "getRoundingMode", "()Ljava/math/RoundingMode;", "isInvalidDefaultPrice", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)Z", "validDefaultPrice", "getValidDefaultPrice", "()Ljava/math/BigDecimal;", "absoluteDefaultPrice", "getAbsoluteDefaultPrice", "netLimitPrice", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LimitPrice;", "getNetLimitPrice", "()Lcom/robinhood/android/common/options/order/OptionOrderContext$LimitPrice;", "naturalPrice", "getNaturalPrice", "absoluteNaturalPrice", "getAbsoluteNaturalPrice", "limitPrice", "absoluteLimitPriceOrDefault", "absoluteLimitPriceOrDefaultForLimitOrderTypes", "absoluteLimitPriceForBidAskBarState", "Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "getAbsoluteLimitPriceForBidAskBarState", "()Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "absoluteLimitPriceForOrderApiRequest", "getAbsoluteLimitPriceForOrderApiRequest", "absoluteLimitPriceForServerOrderCheckRetryAction", "getAbsoluteLimitPriceForServerOrderCheckRetryAction", "absoluteLimitPriceForSingleLegOrderSummary", "getAbsoluteLimitPriceForSingleLegOrderSummary", "absoluteStopPriceOrDefaultForStopLimit", "stopPriceForStopMarket", "absoluteStopPriceForSingleLegOrderSummary", "getAbsoluteStopPriceForSingleLegOrderSummary", "absoluteStopPriceForOrderApiRequest", "getAbsoluteStopPriceForOrderApiRequest", "absolutePriceForClientOrderChecks", "getAbsolutePriceForClientOrderChecks", "priceForProfitLossChart", "getPriceForProfitLossChart", "priceForTotalCostCalculation", "getPriceForTotalCostCalculation", "absolutePriceForCostPerContractString", "getAbsolutePriceForCostPerContractString", "absolutePriceForIsPriceReviewable", "isReviewable", "hasValidPriceForMarketabilityAndPl", "getHasValidPriceForMarketabilityAndPl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Prices {
        private final BigDecimal absoluteDefaultPrice;
        private final LimitPriceWithSource absoluteLimitPriceForBidAskBarState;
        private final BigDecimal absoluteLimitPriceForOrderApiRequest;
        private final BigDecimal absoluteLimitPriceForServerOrderCheckRetryAction;
        private final BigDecimal absoluteLimitPriceForSingleLegOrderSummary;
        private final BigDecimal absoluteLimitPriceOrDefault;
        private final BigDecimal absoluteLimitPriceOrDefaultForLimitOrderTypes;
        private final BigDecimal absoluteNaturalPrice;
        private final BigDecimal absolutePriceForClientOrderChecks;
        private final BigDecimal absolutePriceForCostPerContractString;
        private final BigDecimal absolutePriceForIsPriceReviewable;
        private final BigDecimal absoluteStopPriceForOrderApiRequest;
        private final BigDecimal absoluteStopPriceForSingleLegOrderSummary;
        private final BigDecimal absoluteStopPriceOrDefaultForStopLimit;
        private final OptionSettings.DefaultPricingSetting defaultPricingType;
        private final OrderDirection directionOverride;
        private final OrderDirection explicitDirection;
        private final boolean hasValidPriceForMarketabilityAndPl;
        private final BigDecimal limitPrice;
        private final BigDecimal naturalPrice;
        private final OrderDirection netDirection;
        private final LimitPrice netLimitPrice;
        private final boolean preserveUserInput;
        private final BigDecimal priceForProfitLossChart;
        private final BigDecimal priceForTotalCostCalculation;
        private final QuoteAggregation quoteAggregation;
        private final RoundingMode roundingMode;
        private final OrderDirection singleLegDirection;
        private final BigDecimal stopPriceForStopMarket;
        private final OptionOrderUserInputPrices userInputPrices;
        private final BigDecimal validDefaultPrice;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: OptionOrderContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[OrderDirection.values().length];
                try {
                    iArr[OrderDirection.CREDIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderDirection.DEBIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[OptionOrderType.values().length];
                try {
                    iArr2[OptionOrderType.LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[OptionOrderType.STOP_LIMIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[OptionOrderType.MARKET.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[OptionOrderType.STOP_MARKET.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static /* synthetic */ Prices copy$default(Prices prices, OrderDirection orderDirection, boolean z, QuoteAggregation quoteAggregation, OrderDirection orderDirection2, OptionOrderUserInputPrices optionOrderUserInputPrices, OptionSettings.DefaultPricingSetting defaultPricingSetting, int i, Object obj) {
            if ((i & 1) != 0) {
                orderDirection = prices.directionOverride;
            }
            if ((i & 2) != 0) {
                z = prices.preserveUserInput;
            }
            if ((i & 4) != 0) {
                quoteAggregation = prices.quoteAggregation;
            }
            if ((i & 8) != 0) {
                orderDirection2 = prices.singleLegDirection;
            }
            if ((i & 16) != 0) {
                optionOrderUserInputPrices = prices.userInputPrices;
            }
            if ((i & 32) != 0) {
                defaultPricingSetting = prices.defaultPricingType;
            }
            OptionOrderUserInputPrices optionOrderUserInputPrices2 = optionOrderUserInputPrices;
            OptionSettings.DefaultPricingSetting defaultPricingSetting2 = defaultPricingSetting;
            return prices.copy(orderDirection, z, quoteAggregation, orderDirection2, optionOrderUserInputPrices2, defaultPricingSetting2);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderDirection getDirectionOverride() {
            return this.directionOverride;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPreserveUserInput() {
            return this.preserveUserInput;
        }

        /* renamed from: component3, reason: from getter */
        public final QuoteAggregation getQuoteAggregation() {
            return this.quoteAggregation;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderDirection getSingleLegDirection() {
            return this.singleLegDirection;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOrderUserInputPrices getUserInputPrices() {
            return this.userInputPrices;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
            return this.defaultPricingType;
        }

        public final Prices copy(OrderDirection directionOverride, boolean preserveUserInput, QuoteAggregation quoteAggregation, OrderDirection singleLegDirection, OptionOrderUserInputPrices userInputPrices, OptionSettings.DefaultPricingSetting defaultPricingType) {
            Intrinsics.checkNotNullParameter(userInputPrices, "userInputPrices");
            return new Prices(directionOverride, preserveUserInput, quoteAggregation, singleLegDirection, userInputPrices, defaultPricingType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Prices)) {
                return false;
            }
            Prices prices = (Prices) other;
            return this.directionOverride == prices.directionOverride && this.preserveUserInput == prices.preserveUserInput && Intrinsics.areEqual(this.quoteAggregation, prices.quoteAggregation) && this.singleLegDirection == prices.singleLegDirection && Intrinsics.areEqual(this.userInputPrices, prices.userInputPrices) && this.defaultPricingType == prices.defaultPricingType;
        }

        public int hashCode() {
            OrderDirection orderDirection = this.directionOverride;
            int iHashCode = (((orderDirection == null ? 0 : orderDirection.hashCode()) * 31) + Boolean.hashCode(this.preserveUserInput)) * 31;
            QuoteAggregation quoteAggregation = this.quoteAggregation;
            int iHashCode2 = (iHashCode + (quoteAggregation == null ? 0 : quoteAggregation.hashCode())) * 31;
            OrderDirection orderDirection2 = this.singleLegDirection;
            int iHashCode3 = (((iHashCode2 + (orderDirection2 == null ? 0 : orderDirection2.hashCode())) * 31) + this.userInputPrices.hashCode()) * 31;
            OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingType;
            return iHashCode3 + (defaultPricingSetting != null ? defaultPricingSetting.hashCode() : 0);
        }

        public String toString() {
            return "Prices(directionOverride=" + this.directionOverride + ", preserveUserInput=" + this.preserveUserInput + ", quoteAggregation=" + this.quoteAggregation + ", singleLegDirection=" + this.singleLegDirection + ", userInputPrices=" + this.userInputPrices + ", defaultPricingType=" + this.defaultPricingType + ")";
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Prices(OrderDirection orderDirection, boolean z, QuoteAggregation quoteAggregation, OrderDirection orderDirection2, OptionOrderUserInputPrices userInputPrices, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
            RoundingMode roundingMode;
            BigDecimal defaultPrice;
            LimitPrice limitPrice;
            Range2 range2RangeTo;
            BigDecimal bigDecimalMultiply;
            BigDecimal bigDecimal;
            BigDecimal bigDecimalOrZero;
            BigDecimal bigDecimalAbs;
            BigDecimal bigDecimalMultiply2;
            BigDecimal bigDecimalAbs2;
            BigDecimal bigDecimal2;
            BigDecimal absoluteStopPriceOrDefaultForStopMarket;
            BigDecimal bigDecimal3;
            BigDecimal defaultPrice2;
            BigDecimal bigDecimalAbs3;
            OrderDirection orderDirection3 = orderDirection2;
            Intrinsics.checkNotNullParameter(userInputPrices, "userInputPrices");
            this.directionOverride = orderDirection;
            this.preserveUserInput = z;
            this.quoteAggregation = quoteAggregation;
            this.singleLegDirection = orderDirection3;
            this.userInputPrices = userInputPrices;
            this.defaultPricingType = defaultPricingSetting;
            orderDirection3 = orderDirection3 == null ? orderDirection : orderDirection3;
            this.explicitDirection = orderDirection3;
            if (orderDirection3 == null) {
                if (quoteAggregation == null) {
                    orderDirection3 = OrderDirection.CREDIT;
                } else {
                    BigDecimal defaultPrice3 = quoteAggregation.getDefaultPrice();
                    if (quoteAggregation.isBidAskNegative()) {
                        orderDirection3 = OrderDirection.CREDIT;
                    } else if (quoteAggregation.isBidAskPositive()) {
                        orderDirection3 = OrderDirection.DEBIT;
                    } else if (defaultPrice3 == null || defaultPrice3.signum() != 1) {
                        orderDirection3 = ((defaultPrice3 == null || defaultPrice3.signum() != 0) && (defaultPrice3 == null || defaultPrice3.signum() != -1)) ? null : OrderDirection.CREDIT;
                    } else {
                        orderDirection3 = OrderDirection.DEBIT;
                    }
                }
            }
            this.netDirection = orderDirection3;
            int i = orderDirection3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection3.ordinal()];
            if (i == -1) {
                roundingMode = null;
            } else if (i == 1) {
                roundingMode = RoundingMode.DOWN;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                roundingMode = RoundingMode.UP;
            }
            this.roundingMode = roundingMode;
            if (!z || orderDirection == null) {
                if (quoteAggregation == null || (defaultPrice = quoteAggregation.getDefaultPrice()) == null || isInvalidDefaultPrice(defaultPrice)) {
                    defaultPrice = null;
                }
            } else if (quoteAggregation != null && (defaultPrice2 = quoteAggregation.getDefaultPrice()) != null && (bigDecimalAbs3 = defaultPrice2.abs()) != null) {
                defaultPrice = bigDecimalAbs3.multiply(orderDirection.getMultiplier());
                Intrinsics.checkNotNullExpressionValue(defaultPrice, "multiply(...)");
            }
            this.validDefaultPrice = defaultPrice;
            BigDecimal bigDecimalAbs4 = defaultPrice != null ? defaultPrice.abs() : null;
            this.absoluteDefaultPrice = bigDecimalAbs4;
            if (quoteAggregation == null) {
                limitPrice = null;
            } else {
                BigDecimal bidPrice = quoteAggregation.getBidPrice();
                BigDecimal askPrice = quoteAggregation.getAskPrice();
                if (orderDirection3 != null) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[orderDirection3.ordinal()];
                    if (i2 == 1) {
                        BigDecimal bigDecimalNegate = askPrice.negate();
                        BigDecimal bigDecimalNegate2 = bidPrice.negate();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
                        range2RangeTo = RangesKt.rangeTo(bigDecimalNegate, bigDecimalNegate2);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        range2RangeTo = RangesKt.rangeTo(bidPrice, askPrice);
                    }
                    limitPrice = new LimitPrice(range2RangeTo);
                }
            }
            this.netLimitPrice = limitPrice;
            BigDecimal naturalPrice = quoteAggregation != null ? quoteAggregation.getNaturalPrice() : null;
            this.naturalPrice = naturalPrice;
            BigDecimal bigDecimalAbs5 = naturalPrice != null ? naturalPrice.abs() : null;
            this.absoluteNaturalPrice = bigDecimalAbs5;
            if (userInputPrices.getAbsoluteLimitPriceWithSource() == null || orderDirection3 == null) {
                bigDecimalMultiply = null;
            } else {
                bigDecimalMultiply = userInputPrices.getAbsoluteLimitPriceWithSource().getLimitPrice().multiply(orderDirection3.getMultiplier());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
            this.limitPrice = bigDecimalMultiply;
            BigDecimal bigDecimal4 = bigDecimalMultiply == null ? defaultPrice : bigDecimalMultiply;
            BigDecimal bigDecimalAbs6 = bigDecimal4 != null ? bigDecimal4.abs() : null;
            this.absoluteLimitPriceOrDefault = bigDecimalAbs6;
            OptionOrderType optionOrderType = userInputPrices.getOptionOrderType();
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i3 = iArr[optionOrderType.ordinal()];
            if (i3 == 1 || i3 == 2) {
                bigDecimal = bigDecimalAbs6;
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimal = null;
            }
            this.absoluteLimitPriceOrDefaultForLimitOrderTypes = bigDecimal;
            LimitPriceWithSource limitPriceWithSource = bigDecimalAbs4 != null ? new LimitPriceWithSource(bigDecimalAbs4, OptionOrderLimitPrice.TEXT_INPUT) : null;
            LimitPriceWithSource absoluteLimitPriceWithSource = userInputPrices.getAbsoluteLimitPriceWithSource();
            this.absoluteLimitPriceForBidAskBarState = absoluteLimitPriceWithSource != null ? absoluteLimitPriceWithSource : limitPriceWithSource;
            int i4 = iArr[userInputPrices.getOptionOrderType().ordinal()];
            if (i4 == 1 || i4 == 2) {
                bigDecimalOrZero = BigDecimals7.orZero(bigDecimalAbs6);
            } else {
                if (i4 != 3 && i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimalOrZero = null;
            }
            this.absoluteLimitPriceForOrderApiRequest = bigDecimalOrZero;
            this.absoluteLimitPriceForServerOrderCheckRetryAction = bigDecimal;
            this.absoluteLimitPriceForSingleLegOrderSummary = bigDecimal;
            if (orderDirection3 != null) {
                BigDecimal absoluteStopPriceForStopLimit = userInputPrices.getAbsoluteStopPriceForStopLimit();
                absoluteStopPriceForStopLimit = absoluteStopPriceForStopLimit == null ? defaultPrice : absoluteStopPriceForStopLimit;
                bigDecimalAbs = absoluteStopPriceForStopLimit != null ? absoluteStopPriceForStopLimit.abs() : null;
            }
            this.absoluteStopPriceOrDefaultForStopLimit = bigDecimalAbs;
            if (userInputPrices.getAbsoluteStopPriceOrDefaultForStopMarket() == null || orderDirection3 == null) {
                bigDecimalMultiply2 = null;
            } else {
                bigDecimalMultiply2 = userInputPrices.getAbsoluteStopPriceOrDefaultForStopMarket().multiply(orderDirection3.getMultiplier());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            }
            this.stopPriceForStopMarket = bigDecimalMultiply2;
            int i5 = iArr[userInputPrices.getOptionOrderType().ordinal()];
            if (i5 == 1) {
                bigDecimalAbs = null;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimalAbs = userInputPrices.getAbsoluteStopPriceOrDefaultForStopMarket();
                }
            }
            this.absoluteStopPriceForSingleLegOrderSummary = bigDecimalAbs;
            int i6 = iArr[userInputPrices.getOptionOrderType().ordinal()];
            if (i6 == 1) {
                bigDecimalAbs2 = null;
            } else if (i6 == 2) {
                BigDecimal absoluteStopPriceForStopLimit2 = userInputPrices.getAbsoluteStopPriceForStopLimit();
                bigDecimalAbs4 = absoluteStopPriceForStopLimit2 != null ? absoluteStopPriceForStopLimit2 : bigDecimalAbs4;
                if (bigDecimalAbs4 != null) {
                    bigDecimalAbs2 = bigDecimalAbs4.abs();
                }
            } else if (i6 != 3) {
                if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimalAbs2 = userInputPrices.getAbsoluteStopPriceOrDefaultForStopMarket();
            }
            this.absoluteStopPriceForOrderApiRequest = bigDecimalAbs2;
            this.absolutePriceForClientOrderChecks = bigDecimalAbs6;
            int i7 = iArr[userInputPrices.getOptionOrderType().ordinal()];
            if (i7 == 1 || i7 == 2) {
                bigDecimal2 = bigDecimalMultiply;
            } else if (i7 == 3) {
                bigDecimal2 = naturalPrice;
            } else {
                if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimal2 = bigDecimalMultiply2;
            }
            this.priceForProfitLossChart = bigDecimal2;
            int i8 = iArr[userInputPrices.getOptionOrderType().ordinal()];
            if (i8 == 1 || i8 == 2) {
                if (bigDecimalMultiply != null) {
                    defaultPrice = bigDecimalMultiply;
                }
            } else if (i8 == 3) {
                defaultPrice = naturalPrice;
            } else {
                if (i8 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                defaultPrice = bigDecimalMultiply2;
            }
            this.priceForTotalCostCalculation = defaultPrice;
            int i9 = iArr[userInputPrices.getOptionOrderType().ordinal()];
            if (i9 == 1 || i9 == 2) {
                absoluteStopPriceOrDefaultForStopMarket = bigDecimalAbs6;
            } else if (i9 == 3) {
                absoluteStopPriceOrDefaultForStopMarket = bigDecimalAbs5;
            } else {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                absoluteStopPriceOrDefaultForStopMarket = userInputPrices.getAbsoluteStopPriceOrDefaultForStopMarket();
            }
            this.absolutePriceForCostPerContractString = absoluteStopPriceOrDefaultForStopMarket;
            int i10 = iArr[userInputPrices.getOptionOrderType().ordinal()];
            if (i10 == 1 || i10 == 2) {
                bigDecimal3 = bigDecimalAbs6;
            } else if (i10 == 3) {
                bigDecimal3 = bigDecimalAbs5;
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalAbs7 = bigDecimalMultiply2 != null ? bigDecimalMultiply2.abs() : null;
                bigDecimal3 = (bigDecimalAbs7 == null || bigDecimalAbs7.compareTo(BigDecimal.ZERO) != 0) ? bigDecimalAbs7 : null;
            }
            this.absolutePriceForIsPriceReviewable = bigDecimal3;
            this.hasValidPriceForMarketabilityAndPl = isReviewable() && orderDirection3 != null;
        }

        public final OrderDirection getDirectionOverride() {
            return this.directionOverride;
        }

        public final boolean getPreserveUserInput() {
            return this.preserveUserInput;
        }

        public final QuoteAggregation getQuoteAggregation() {
            return this.quoteAggregation;
        }

        public final OrderDirection getSingleLegDirection() {
            return this.singleLegDirection;
        }

        public final OptionOrderUserInputPrices getUserInputPrices() {
            return this.userInputPrices;
        }

        public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
            return this.defaultPricingType;
        }

        /* renamed from: getExplicitDirection$feature_lib_options_externalDebug, reason: from getter */
        public final OrderDirection getExplicitDirection() {
            return this.explicitDirection;
        }

        public final OrderDirection getNetDirection() {
            return this.netDirection;
        }

        public final boolean isDebit() {
            return this.netDirection == OrderDirection.DEBIT;
        }

        public final boolean isCredit() {
            return this.netDirection == OrderDirection.CREDIT;
        }

        public final RoundingMode getRoundingMode() {
            return this.roundingMode;
        }

        private final boolean isInvalidDefaultPrice(BigDecimal bigDecimal) {
            OrderDirection orderDirection = this.netDirection;
            int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection.ordinal()];
            if (i == -1) {
                return true;
            }
            if (i == 1) {
                return BigDecimals7.isPositive(bigDecimal);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return BigDecimals7.isNegative(bigDecimal);
        }

        public final BigDecimal getValidDefaultPrice() {
            return this.validDefaultPrice;
        }

        public final BigDecimal getAbsoluteDefaultPrice() {
            return this.absoluteDefaultPrice;
        }

        public final LimitPrice getNetLimitPrice() {
            return this.netLimitPrice;
        }

        public final BigDecimal getNaturalPrice() {
            return this.naturalPrice;
        }

        public final BigDecimal getAbsoluteNaturalPrice() {
            return this.absoluteNaturalPrice;
        }

        public final LimitPriceWithSource getAbsoluteLimitPriceForBidAskBarState() {
            return this.absoluteLimitPriceForBidAskBarState;
        }

        public final BigDecimal getAbsoluteLimitPriceForOrderApiRequest() {
            return this.absoluteLimitPriceForOrderApiRequest;
        }

        public final BigDecimal getAbsoluteLimitPriceForServerOrderCheckRetryAction() {
            return this.absoluteLimitPriceForServerOrderCheckRetryAction;
        }

        public final BigDecimal getAbsoluteLimitPriceForSingleLegOrderSummary() {
            return this.absoluteLimitPriceForSingleLegOrderSummary;
        }

        public final BigDecimal getAbsoluteStopPriceForSingleLegOrderSummary() {
            return this.absoluteStopPriceForSingleLegOrderSummary;
        }

        public final BigDecimal getAbsoluteStopPriceForOrderApiRequest() {
            return this.absoluteStopPriceForOrderApiRequest;
        }

        public final BigDecimal getAbsolutePriceForClientOrderChecks() {
            return this.absolutePriceForClientOrderChecks;
        }

        public final BigDecimal getPriceForProfitLossChart() {
            return this.priceForProfitLossChart;
        }

        public final BigDecimal getPriceForTotalCostCalculation() {
            return this.priceForTotalCostCalculation;
        }

        public final BigDecimal getAbsolutePriceForCostPerContractString() {
            return this.absolutePriceForCostPerContractString;
        }

        public final boolean isReviewable() {
            return this.netDirection != null ? this.absolutePriceForIsPriceReviewable != null : (copy$default(this, OrderDirection.CREDIT, false, null, null, null, null, 62, null).validDefaultPrice == null || copy$default(this, OrderDirection.DEBIT, false, null, null, null, null, 62, null).validDefaultPrice == null) ? false : true;
        }

        public final boolean getHasValidPriceForMarketabilityAndPl() {
            return this.hasValidPriceForMarketabilityAndPl;
        }

        /* compiled from: OptionOrderContext.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;", "directionOverride", "Lcom/robinhood/models/db/OrderDirection;", "preserveUserInput", "", "legContexts", "", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;", "userInputPrices", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public static /* synthetic */ Prices from$default(Companion companion, OrderDirection orderDirection, boolean z, List list, OptionOrderUserInputPrices optionOrderUserInputPrices, OptionSettings.DefaultPricingSetting defaultPricingSetting, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderDirection = null;
                }
                return companion.from(orderDirection, z, list, optionOrderUserInputPrices, defaultPricingSetting);
            }

            public final Prices from(OrderDirection directionOverride, boolean preserveUserInput, List<LegContext> legContexts, OptionOrderUserInputPrices userInputPrices, OptionSettings.DefaultPricingSetting defaultPricingType) {
                LegContext.RequestArguments requestArguments;
                OrderSide side;
                Intrinsics.checkNotNullParameter(legContexts, "legContexts");
                Intrinsics.checkNotNullParameter(userInputPrices, "userInputPrices");
                QuoteAggregation quoteAggregationFromAggregator = QuoteAggregation.INSTANCE.fromAggregator(defaultPricingType, legContexts);
                LegContext legContext = (LegContext) CollectionsKt.singleOrNull((List) legContexts);
                return new Prices(directionOverride, preserveUserInput, quoteAggregationFromAggregator, (legContext == null || (requestArguments = legContext.getRequestArguments()) == null || (side = requestArguments.getSide()) == null) ? null : OrderDirection.INSTANCE.fromSide(side), userInputPrices, defaultPricingType);
            }
        }
    }

    /* compiled from: OptionOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0001¢\u0006\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContext$Companion;", "", "<init>", "()V", "createApiRequest", "Lcom/robinhood/models/api/ApiOptionOrderRequest;", "accountContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext$AccountContext;", "formSource", "Lrosetta/option/OptionOrderFormSource;", "legContexts", "", "Lcom/robinhood/android/common/options/order/OptionOrderContext$LegContext;", "requestArguments", "Lcom/robinhood/android/common/options/order/OptionOrderContext$RequestArguments;", "prices", "Lcom/robinhood/android/common/options/order/OptionOrderContext$Prices;", "toApiOptionOrderLegPostBody", "Lcom/robinhood/models/api/ApiOptionOrderPostBody$ApiOptionOrderLegPostBody;", "toApiOptionOrderLegPostBody$feature_lib_options_externalDebug", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ApiOptionOrderRequest createApiRequest(AccountContext accountContext, OptionOrderFormSource formSource, List<LegContext> legContexts, RequestArguments requestArguments, Prices prices) {
            Intrinsics.checkNotNullParameter(accountContext, "accountContext");
            Intrinsics.checkNotNullParameter(formSource, "formSource");
            Intrinsics.checkNotNullParameter(legContexts, "legContexts");
            Intrinsics.checkNotNullParameter(requestArguments, "requestArguments");
            Intrinsics.checkNotNullParameter(prices, "prices");
            String url = accountContext.getAccount().getUrl();
            String accountNumber = accountContext.getAccount().getAccountNumber();
            QuoteAggregation quoteAggregation = prices.getQuoteAggregation();
            BigDecimal askPriceForLogging = quoteAggregation != null ? quoteAggregation.getAskPriceForLogging() : null;
            QuoteAggregation quoteAggregation2 = prices.getQuoteAggregation();
            BigDecimal bidPriceForLogging = quoteAggregation2 != null ? quoteAggregation2.getBidPriceForLogging() : null;
            OrderDirection netDirection = prices.getNetDirection();
            OptionOrder.FormSource formSourceFromOptionOrderFormSource = OptionOrder.FormSource.INSTANCE.fromOptionOrderFormSource(formSource);
            List<LegContext> list = legContexts;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (LegContext legContext : list) {
                arrayList.add(new ApiOptionOrderRequest.Leg(OptionInstrument.INSTANCE.getPath(legContext.getRequestContext().getOptionInstrument().getOptionInstrument().getId()), legContext.getRequestContext().getPositionEffect(), legContext.getRequestArguments().getRatioQuantity().intValueExact(), legContext.getRequestArguments().getSide()));
            }
            OrderMarketHours marketHours = requestArguments.getMarketHours();
            boolean overrideDayTradeChecks = requestArguments.getOverrideDayTradeChecks();
            boolean overrideDtbpChecks = requestArguments.getOverrideDtbpChecks();
            BigDecimal absoluteLimitPriceForOrderApiRequest = prices.getAbsoluteLimitPriceForOrderApiRequest();
            BigDecimal quantity = requestArguments.getQuantity();
            OptionOrderToReplaceBundle optionOrderToReplaceBundle = requestArguments.getOptionOrderToReplaceBundle();
            BigDecimal unprocessedQuantity = optionOrderToReplaceBundle != null ? optionOrderToReplaceBundle.getUnprocessedQuantity() : null;
            UUID refId = requestArguments.getRefId();
            OptionOrderToReplaceBundle optionOrderToReplaceBundle2 = requestArguments.getOptionOrderToReplaceBundle();
            return new ApiOptionOrderRequest(url, accountNumber, askPriceForLogging, bidPriceForLogging, netDirection, formSourceFromOptionOrderFormSource, arrayList, marketHours, overrideDayTradeChecks, overrideDtbpChecks, absoluteLimitPriceForOrderApiRequest, quantity, unprocessedQuantity, refId, optionOrderToReplaceBundle2 != null ? optionOrderToReplaceBundle2.getOrderToReplaceId() : null, requestArguments.getTimeInForce(), prices.getAbsoluteStopPriceForOrderApiRequest(), prices.getUserInputPrices().getTrigger(), prices.getUserInputPrices().getType());
        }

        public final ApiOptionOrderPostBody.ApiOptionOrderLegPostBody toApiOptionOrderLegPostBody$feature_lib_options_externalDebug(LegContext legContext) {
            Decimals4 askPrice;
            Decimals4 bidPrice;
            Intrinsics.checkNotNullParameter(legContext, "<this>");
            String string2 = legContext.getRequestContext().getOptionInstrument().getOptionInstrument().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            OrderPositionEffect positionEffect = legContext.getRequestContext().getPositionEffect();
            int iIntValueExact = legContext.getRequestArguments().getRatioQuantity().intValueExact();
            OrderSide side = legContext.getRequestArguments().getSide();
            OptionInstrumentQuote optionQuote = legContext.getRequestContext().getOptionQuote();
            BigDecimal rawValue = (optionQuote == null || (bidPrice = optionQuote.getBidPrice()) == null) ? null : bidPrice.getRawValue();
            OptionInstrumentQuote optionQuote2 = legContext.getRequestContext().getOptionQuote();
            BigDecimal rawValue2 = (optionQuote2 == null || (askPrice = optionQuote2.getAskPrice()) == null) ? null : askPrice.getRawValue();
            OptionInstrumentQuote optionQuote3 = legContext.getRequestContext().getOptionQuote();
            Integer bidSize = optionQuote3 != null ? optionQuote3.getBidSize() : null;
            OptionInstrumentQuote optionQuote4 = legContext.getRequestContext().getOptionQuote();
            Integer askSize = optionQuote4 != null ? optionQuote4.getAskSize() : null;
            OptionInstrumentQuote optionQuote5 = legContext.getRequestContext().getOptionQuote();
            return new ApiOptionOrderPostBody.ApiOptionOrderLegPostBody(string2, positionEffect, iIntValueExact, side, new ApiOptionOrderPostBody.ApiOptionOrderLegPostBody.ApiOptionOrderLegPostMetadata(new ApiOptionOrderPostBody.ApiOptionOrderLegPostBody.ApiOptionOrderLegPostMetadata.ApiOptionQuote(rawValue, rawValue2, bidSize, askSize, optionQuote5 != null ? optionQuote5.getOpenInterest() : null)));
        }
    }
}
