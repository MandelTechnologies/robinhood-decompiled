package com.robinhood.shared.trade.crypto.context;

import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.crypto.p314db.Quote;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import rosetta.order.Side;

/* compiled from: CryptoOrderContext.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004EFGHB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J;\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b0\u00102R\u0011\u00103\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006I"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "request", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "accountContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;", "requestContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "orderInfo", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$OrderInfo;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$OrderInfo;)V", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getRequest", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "getAccountContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;", "getRequestContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "getOrderInfo", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$OrderInfo;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "getLoggingCryptoOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "bidPrice", "Lcom/robinhood/models/util/Money;", "getBidPrice", "()Lcom/robinhood/models/util/Money;", "askPrice", "getAskPrice", "midPrice", "getMidPrice", "buySpreadFraction", "Ljava/math/BigDecimal;", "getBuySpreadFraction", "()Ljava/math/BigDecimal;", "sellSpreadFraction", "getSellSpreadFraction", "feeRatio", "getFeeRatio", "uiFeeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "getUiFeeEstimation", "()Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "isMonetizationModelDataLoaded", "", "()Z", "isReviewable", "isScreenDataLoaded", "cryptoOrderManagerRequest", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request;", "getCryptoOrderManagerRequest", "()Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Request;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "RequestData", "RequestContext", "AccountContext", "OrderInfo", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderContext {
    public static final int $stable = 8;
    private final AccountContext accountContext;
    private final Screen eventScreen;
    private final OrderInfo orderInfo;
    private final RequestData request;
    private final RequestContext requestContext;

    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MonetizationModel.values().length];
            try {
                iArr2[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ CryptoOrderContext copy$default(CryptoOrderContext cryptoOrderContext, Screen screen, RequestData requestData, AccountContext accountContext, RequestContext requestContext, OrderInfo orderInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = cryptoOrderContext.eventScreen;
        }
        if ((i & 2) != 0) {
            requestData = cryptoOrderContext.request;
        }
        if ((i & 4) != 0) {
            accountContext = cryptoOrderContext.accountContext;
        }
        if ((i & 8) != 0) {
            requestContext = cryptoOrderContext.requestContext;
        }
        if ((i & 16) != 0) {
            orderInfo = cryptoOrderContext.orderInfo;
        }
        OrderInfo orderInfo2 = orderInfo;
        AccountContext accountContext2 = accountContext;
        return cryptoOrderContext.copy(screen, requestData, accountContext2, requestContext, orderInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestData getRequest() {
        return this.request;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountContext getAccountContext() {
        return this.accountContext;
    }

    /* renamed from: component4, reason: from getter */
    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public final CryptoOrderContext copy(Screen eventScreen, RequestData request, AccountContext accountContext, RequestContext requestContext, OrderInfo orderInfo) {
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(accountContext, "accountContext");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        return new CryptoOrderContext(eventScreen, request, accountContext, requestContext, orderInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderContext)) {
            return false;
        }
        CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) other;
        return Intrinsics.areEqual(this.eventScreen, cryptoOrderContext.eventScreen) && Intrinsics.areEqual(this.request, cryptoOrderContext.request) && Intrinsics.areEqual(this.accountContext, cryptoOrderContext.accountContext) && Intrinsics.areEqual(this.requestContext, cryptoOrderContext.requestContext) && Intrinsics.areEqual(this.orderInfo, cryptoOrderContext.orderInfo);
    }

    public int hashCode() {
        return (((((((this.eventScreen.hashCode() * 31) + this.request.hashCode()) * 31) + this.accountContext.hashCode()) * 31) + this.requestContext.hashCode()) * 31) + this.orderInfo.hashCode();
    }

    public String toString() {
        return "CryptoOrderContext(eventScreen=" + this.eventScreen + ", request=" + this.request + ", accountContext=" + this.accountContext + ", requestContext=" + this.requestContext + ", orderInfo=" + this.orderInfo + ")";
    }

    public CryptoOrderContext(Screen eventScreen, RequestData request, AccountContext accountContext, RequestContext requestContext, OrderInfo orderInfo) {
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(accountContext, "accountContext");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        this.eventScreen = eventScreen;
        this.request = request;
        this.accountContext = accountContext;
        this.requestContext = requestContext;
        this.orderInfo = orderInfo;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final RequestData getRequest() {
        return this.request;
    }

    public final AccountContext getAccountContext() {
        return this.accountContext;
    }

    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
        double d;
        Money buyingPower;
        BigDecimal decimalValue;
        double dDoubleValue;
        int i;
        double dDoubleValue2;
        CryptoOrderContext.CryptoOrderType protobuf = Orders2.toProtobuf(this.request.getType());
        Side protobuf2 = Orders2.toProtobuf(this.request.getSide());
        String string2 = this.request.getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = this.request.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        OrderSide side = this.request.getSide();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[side.ordinal()];
        if (i2 == 1) {
            CryptoBuyingPower cryptoBuyingPower = this.accountContext.getCryptoBuyingPower();
            if (cryptoBuyingPower == null || (buyingPower = cryptoBuyingPower.getBuyingPower()) == null || (decimalValue = buyingPower.getDecimalValue()) == null) {
                d = 0.0d;
                CryptoOrderContext.EntryType entryType = this.requestContext.getRequestInputs().getEntryType();
                String code = this.requestContext.getCurrencyPair().getAssetCurrency().getCode();
                String code2 = this.requestContext.getCurrencyPair().getQuoteCurrency().getCode();
                double dDoubleValue3 = this.orderInfo.getUncollaredPrice().doubleValue();
                BigDecimal enteredAmount = this.request.getEnteredAmount();
                double dDoubleValue4 = enteredAmount != null ? enteredAmount.doubleValue() : 0.0d;
                double dDoubleValue5 = this.orderInfo.getDisplayQuantity().doubleValue();
                double dDoubleValue6 = this.orderInfo.getUncollaredTotalCost().doubleValue();
                i = iArr[this.request.getSide().ordinal()];
                if (i != 1) {
                    dDoubleValue2 = getBuySpreadFraction().doubleValue();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dDoubleValue2 = getSellSpreadFraction().doubleValue();
                }
                return new com.robinhood.rosetta.eventlogging.CryptoOrderContext(protobuf, protobuf2, string2, string3, 0.0d, entryType, code, code2, dDoubleValue3, d, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue2, 0.0d, null, null, null, 0.0d, null, 1032208, null);
            }
            dDoubleValue = decimalValue.doubleValue();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dDoubleValue = this.requestContext.getSellingPower().doubleValue();
        }
        d = dDoubleValue;
        CryptoOrderContext.EntryType entryType2 = this.requestContext.getRequestInputs().getEntryType();
        String code3 = this.requestContext.getCurrencyPair().getAssetCurrency().getCode();
        String code22 = this.requestContext.getCurrencyPair().getQuoteCurrency().getCode();
        double dDoubleValue32 = this.orderInfo.getUncollaredPrice().doubleValue();
        BigDecimal enteredAmount2 = this.request.getEnteredAmount();
        if (enteredAmount2 != null) {
        }
        double dDoubleValue52 = this.orderInfo.getDisplayQuantity().doubleValue();
        double dDoubleValue62 = this.orderInfo.getUncollaredTotalCost().doubleValue();
        i = iArr[this.request.getSide().ordinal()];
        if (i != 1) {
        }
        return new com.robinhood.rosetta.eventlogging.CryptoOrderContext(protobuf, protobuf2, string2, string3, 0.0d, entryType2, code3, code22, dDoubleValue32, d, dDoubleValue4, dDoubleValue52, dDoubleValue62, dDoubleValue2, 0.0d, null, null, null, 0.0d, null, 1032208, null);
    }

    public final Money getBidPrice() {
        return this.requestContext.getQuote().getBidPrice();
    }

    public final Money getAskPrice() {
        return this.requestContext.getQuote().getAskPrice();
    }

    public final Money getMidPrice() {
        return this.requestContext.getQuote().getMidPrice();
    }

    public final BigDecimal getBuySpreadFraction() {
        return this.requestContext.getQuote().getBuySpreadFraction();
    }

    public final BigDecimal getSellSpreadFraction() {
        return this.requestContext.getQuote().getSellSpreadFraction();
    }

    public final BigDecimal getFeeRatio() {
        UiFeeEstimation uiFeeEstimation = this.requestContext.getUiFeeEstimation();
        if (uiFeeEstimation != null) {
            return uiFeeEstimation.getFeeRatio();
        }
        return null;
    }

    public final UiFeeEstimation getUiFeeEstimation() {
        return this.requestContext.getUiFeeEstimation();
    }

    public final boolean isMonetizationModelDataLoaded() {
        MonetizationModel nullableMonetizationModel = this.requestContext.getRequestInputs().getNullableMonetizationModel();
        int i = nullableMonetizationModel == null ? -1 : WhenMappings.$EnumSwitchMapping$1[nullableMonetizationModel.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (this.requestContext.getUiFeeEstimation() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean isReviewable() {
        BigDecimal purchaseSize;
        if (!isMonetizationModelDataLoaded()) {
            return false;
        }
        RequestInputs requestInputs = this.requestContext.getRequestInputs();
        if (requestInputs instanceof RequestInputs.AsQuote) {
            purchaseSize = ((RequestInputs.AsQuote) requestInputs).getPurchaseCost();
        } else {
            if (!(requestInputs instanceof RequestInputs.AsAsset)) {
                throw new NoWhenBranchMatchedException();
            }
            purchaseSize = ((RequestInputs.AsAsset) requestInputs).getPurchaseSize();
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return purchaseSize.compareTo(bigDecimal) > 0 && this.orderInfo.getCollaredPrice().compareTo(bigDecimal) > 0;
    }

    public final boolean isScreenDataLoaded() {
        return isMonetizationModelDataLoaded();
    }

    public final CryptoOrderManager.Request getCryptoOrderManagerRequest() {
        return new CryptoOrderManager.Request.Standard(this.request.toApiRequest());
    }

    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u00104\u001a\u000205J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010@\u001a\u00020\u0014HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J±\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001J\u0013\u0010F\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006K"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "", "collaredPrice", "Ljava/math/BigDecimal;", "orderQuantity", "currencyPairId", "Ljava/util/UUID;", "refId", "side", "Lcom/robinhood/models/db/OrderSide;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "type", "Lcom/robinhood/models/api/CryptoOrderType;", "isQuantityCollared", "", "enteredAmount", "tradeBonusEligibility", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "accountId", "", "stopPrice", "limitPrice", "feeRatio", "selectedTaxLots", "", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$TaxLot;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/api/CryptoOrderType;ZLjava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;)V", "getCollaredPrice", "()Ljava/math/BigDecimal;", "getOrderQuantity", "getCurrencyPairId", "()Ljava/util/UUID;", "getRefId", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getType", "()Lcom/robinhood/models/api/CryptoOrderType;", "()Z", "getEnteredAmount", "getTradeBonusEligibility", "()Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "getAccountId", "()Ljava/lang/String;", "getStopPrice", "getLimitPrice", "getFeeRatio", "getSelectedTaxLots", "()Ljava/util/List;", "toApiRequest", "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class RequestData {
        public static final int $stable = 8;
        private final String accountId;
        private final BigDecimal collaredPrice;
        private final UUID currencyPairId;
        private final BigDecimal enteredAmount;
        private final BigDecimal feeRatio;
        private final boolean isQuantityCollared;
        private final BigDecimal limitPrice;
        private final BigDecimal orderQuantity;
        private final UUID refId;
        private final List<RequestInputs.TaxLot> selectedTaxLots;
        private final OrderSide side;
        private final BigDecimal stopPrice;
        private final OrderTimeInForce timeInForce;
        private final UiCryptoTradeBonusEligibility tradeBonusEligibility;
        private final CryptoOrderType type;

        /* compiled from: CryptoOrderContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getCollaredPrice() {
            return this.collaredPrice;
        }

        /* renamed from: component10, reason: from getter */
        public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component12, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        /* renamed from: component13, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        /* renamed from: component14, reason: from getter */
        public final BigDecimal getFeeRatio() {
            return this.feeRatio;
        }

        public final List<RequestInputs.TaxLot> component15() {
            return this.selectedTaxLots;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getOrderQuantity() {
            return this.orderQuantity;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component7, reason: from getter */
        public final CryptoOrderType getType() {
            return this.type;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsQuantityCollared() {
            return this.isQuantityCollared;
        }

        /* renamed from: component9, reason: from getter */
        public final BigDecimal getEnteredAmount() {
            return this.enteredAmount;
        }

        public final RequestData copy(BigDecimal collaredPrice, BigDecimal orderQuantity, UUID currencyPairId, UUID refId, OrderSide side, OrderTimeInForce timeInForce, CryptoOrderType type2, boolean isQuantityCollared, BigDecimal enteredAmount, UiCryptoTradeBonusEligibility tradeBonusEligibility, String accountId, BigDecimal stopPrice, BigDecimal limitPrice, BigDecimal feeRatio, List<RequestInputs.TaxLot> selectedTaxLots) {
            Intrinsics.checkNotNullParameter(collaredPrice, "collaredPrice");
            Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new RequestData(collaredPrice, orderQuantity, currencyPairId, refId, side, timeInForce, type2, isQuantityCollared, enteredAmount, tradeBonusEligibility, accountId, stopPrice, limitPrice, feeRatio, selectedTaxLots);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestData)) {
                return false;
            }
            RequestData requestData = (RequestData) other;
            return Intrinsics.areEqual(this.collaredPrice, requestData.collaredPrice) && Intrinsics.areEqual(this.orderQuantity, requestData.orderQuantity) && Intrinsics.areEqual(this.currencyPairId, requestData.currencyPairId) && Intrinsics.areEqual(this.refId, requestData.refId) && this.side == requestData.side && this.timeInForce == requestData.timeInForce && this.type == requestData.type && this.isQuantityCollared == requestData.isQuantityCollared && Intrinsics.areEqual(this.enteredAmount, requestData.enteredAmount) && Intrinsics.areEqual(this.tradeBonusEligibility, requestData.tradeBonusEligibility) && Intrinsics.areEqual(this.accountId, requestData.accountId) && Intrinsics.areEqual(this.stopPrice, requestData.stopPrice) && Intrinsics.areEqual(this.limitPrice, requestData.limitPrice) && Intrinsics.areEqual(this.feeRatio, requestData.feeRatio) && Intrinsics.areEqual(this.selectedTaxLots, requestData.selectedTaxLots);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.collaredPrice.hashCode() * 31) + this.orderQuantity.hashCode()) * 31) + this.currencyPairId.hashCode()) * 31) + this.refId.hashCode()) * 31) + this.side.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isQuantityCollared)) * 31;
            BigDecimal bigDecimal = this.enteredAmount;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
            int iHashCode3 = (((iHashCode2 + (uiCryptoTradeBonusEligibility == null ? 0 : uiCryptoTradeBonusEligibility.hashCode())) * 31) + this.accountId.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.stopPrice;
            int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.limitPrice;
            int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.feeRatio;
            int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            List<RequestInputs.TaxLot> list = this.selectedTaxLots;
            return iHashCode6 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "RequestData(collaredPrice=" + this.collaredPrice + ", orderQuantity=" + this.orderQuantity + ", currencyPairId=" + this.currencyPairId + ", refId=" + this.refId + ", side=" + this.side + ", timeInForce=" + this.timeInForce + ", type=" + this.type + ", isQuantityCollared=" + this.isQuantityCollared + ", enteredAmount=" + this.enteredAmount + ", tradeBonusEligibility=" + this.tradeBonusEligibility + ", accountId=" + this.accountId + ", stopPrice=" + this.stopPrice + ", limitPrice=" + this.limitPrice + ", feeRatio=" + this.feeRatio + ", selectedTaxLots=" + this.selectedTaxLots + ")";
        }

        public RequestData(BigDecimal collaredPrice, BigDecimal orderQuantity, UUID currencyPairId, UUID refId, OrderSide side, OrderTimeInForce timeInForce, CryptoOrderType type2, boolean z, BigDecimal bigDecimal, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, String accountId, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List<RequestInputs.TaxLot> list) {
            Intrinsics.checkNotNullParameter(collaredPrice, "collaredPrice");
            Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.collaredPrice = collaredPrice;
            this.orderQuantity = orderQuantity;
            this.currencyPairId = currencyPairId;
            this.refId = refId;
            this.side = side;
            this.timeInForce = timeInForce;
            this.type = type2;
            this.isQuantityCollared = z;
            this.enteredAmount = bigDecimal;
            this.tradeBonusEligibility = uiCryptoTradeBonusEligibility;
            this.accountId = accountId;
            this.stopPrice = bigDecimal2;
            this.limitPrice = bigDecimal3;
            this.feeRatio = bigDecimal4;
            this.selectedTaxLots = list;
        }

        public /* synthetic */ RequestData(BigDecimal bigDecimal, BigDecimal bigDecimal2, UUID uuid, UUID uuid2, OrderSide orderSide, OrderTimeInForce orderTimeInForce, CryptoOrderType cryptoOrderType, boolean z, BigDecimal bigDecimal3, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, String str, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, bigDecimal2, uuid, uuid2, orderSide, orderTimeInForce, cryptoOrderType, z, bigDecimal3, uiCryptoTradeBonusEligibility, str, bigDecimal4, bigDecimal5, bigDecimal6, (i & 16384) != 0 ? null : list);
        }

        public final BigDecimal getCollaredPrice() {
            return this.collaredPrice;
        }

        public final BigDecimal getOrderQuantity() {
            return this.orderQuantity;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final OrderSide getSide() {
            return this.side;
        }

        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final CryptoOrderType getType() {
            return this.type;
        }

        public final boolean isQuantityCollared() {
            return this.isQuantityCollared;
        }

        public final BigDecimal getEnteredAmount() {
            return this.enteredAmount;
        }

        public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final BigDecimal getFeeRatio() {
            return this.feeRatio;
        }

        public final List<RequestInputs.TaxLot> getSelectedTaxLots() {
            return this.selectedTaxLots;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ApiCryptoOrderRequest toApiRequest() {
            UiCryptoTradeBonusEligibility.TradeBonus assetBonus;
            BigDecimal bonusRatio;
            BigDecimal bigDecimal;
            ArrayList arrayList;
            UiCryptoTradeBonusEligibility.TradeBonus quoteBonus;
            UUID uuid = this.currencyPairId;
            BigDecimal bigDecimal2 = this.enteredAmount;
            BigDecimal bigDecimal3 = this.collaredPrice;
            BigDecimal bigDecimal4 = this.orderQuantity;
            UUID uuid2 = this.refId;
            OrderSide orderSide = this.side;
            OrderTimeInForce orderTimeInForce = this.timeInForce;
            CryptoOrderType cryptoOrderType = this.type;
            boolean z = this.isQuantityCollared;
            int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i == 1) {
                UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
                if (uiCryptoTradeBonusEligibility != null && (assetBonus = uiCryptoTradeBonusEligibility.getAssetBonus()) != null) {
                    bonusRatio = assetBonus.getBonusRatio();
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility2 = this.tradeBonusEligibility;
                bonusRatio = (uiCryptoTradeBonusEligibility2 == null || (quoteBonus = uiCryptoTradeBonusEligibility2.getQuoteBonus()) == null) ? null : quoteBonus.getBonusRatio();
            }
            String str = this.accountId;
            BigDecimal bigDecimal5 = this.stopPrice;
            BigDecimal bigDecimal6 = this.limitPrice;
            BigDecimal bigDecimal7 = this.feeRatio;
            List<RequestInputs.TaxLot> list = this.selectedTaxLots;
            if (list != null) {
                List<RequestInputs.TaxLot> list2 = list;
                bigDecimal = bonusRatio;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    RequestInputs.TaxLot taxLot = (RequestInputs.TaxLot) it.next();
                    arrayList2.add(new ApiCryptoOrderRequest.SelectedTaxLot(taxLot.getId(), taxLot.getQuantity()));
                    it = it;
                    str = str;
                }
                arrayList = arrayList2;
            } else {
                bigDecimal = bonusRatio;
                arrayList = null;
            }
            return new ApiCryptoOrderRequest(str, uuid, bigDecimal2, bigDecimal3, bigDecimal4, uuid2, orderSide, orderTimeInForce, cryptoOrderType, z, bigDecimal, bigDecimal5, bigDecimal6, bigDecimal7, arrayList, null, null, null, null, null);
        }
    }

    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "holding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "quote", "Lcom/robinhood/models/crypto/db/Quote;", "uiFeeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "<init>", "(Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/ui/UiCryptoHolding;Lcom/robinhood/models/crypto/db/Quote;Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;)V", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getHolding", "()Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "getQuote", "()Lcom/robinhood/models/crypto/db/Quote;", "getUiFeeEstimation", "()Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "sellingPower", "Ljava/math/BigDecimal;", "getSellingPower", "()Ljava/math/BigDecimal;", "priceByOrderType", "getPriceByOrderType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestContext {
        public static final int $stable = 8;
        private final UiCurrencyPair currencyPair;
        private final UiCryptoHolding holding;
        private final Quote quote;
        private final RequestInputs requestInputs;
        private final UiFeeEstimation uiFeeEstimation;

        /* compiled from: CryptoOrderContext.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ RequestContext copy$default(RequestContext requestContext, RequestInputs requestInputs, UiCurrencyPair uiCurrencyPair, UiCryptoHolding uiCryptoHolding, Quote quote, UiFeeEstimation uiFeeEstimation, int i, Object obj) {
            if ((i & 1) != 0) {
                requestInputs = requestContext.requestInputs;
            }
            if ((i & 2) != 0) {
                uiCurrencyPair = requestContext.currencyPair;
            }
            if ((i & 4) != 0) {
                uiCryptoHolding = requestContext.holding;
            }
            if ((i & 8) != 0) {
                quote = requestContext.quote;
            }
            if ((i & 16) != 0) {
                uiFeeEstimation = requestContext.uiFeeEstimation;
            }
            UiFeeEstimation uiFeeEstimation2 = uiFeeEstimation;
            UiCryptoHolding uiCryptoHolding2 = uiCryptoHolding;
            return requestContext.copy(requestInputs, uiCurrencyPair, uiCryptoHolding2, quote, uiFeeEstimation2);
        }

        /* renamed from: component1, reason: from getter */
        public final RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        /* renamed from: component2, reason: from getter */
        public final UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        /* renamed from: component3, reason: from getter */
        public final UiCryptoHolding getHolding() {
            return this.holding;
        }

        /* renamed from: component4, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        /* renamed from: component5, reason: from getter */
        public final UiFeeEstimation getUiFeeEstimation() {
            return this.uiFeeEstimation;
        }

        public final RequestContext copy(RequestInputs requestInputs, UiCurrencyPair currencyPair, UiCryptoHolding holding, Quote quote, UiFeeEstimation uiFeeEstimation) {
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            Intrinsics.checkNotNullParameter(quote, "quote");
            return new RequestContext(requestInputs, currencyPair, holding, quote, uiFeeEstimation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestContext)) {
                return false;
            }
            RequestContext requestContext = (RequestContext) other;
            return Intrinsics.areEqual(this.requestInputs, requestContext.requestInputs) && Intrinsics.areEqual(this.currencyPair, requestContext.currencyPair) && Intrinsics.areEqual(this.holding, requestContext.holding) && Intrinsics.areEqual(this.quote, requestContext.quote) && Intrinsics.areEqual(this.uiFeeEstimation, requestContext.uiFeeEstimation);
        }

        public int hashCode() {
            int iHashCode = ((this.requestInputs.hashCode() * 31) + this.currencyPair.hashCode()) * 31;
            UiCryptoHolding uiCryptoHolding = this.holding;
            int iHashCode2 = (((iHashCode + (uiCryptoHolding == null ? 0 : uiCryptoHolding.hashCode())) * 31) + this.quote.hashCode()) * 31;
            UiFeeEstimation uiFeeEstimation = this.uiFeeEstimation;
            return iHashCode2 + (uiFeeEstimation != null ? uiFeeEstimation.hashCode() : 0);
        }

        public String toString() {
            return "RequestContext(requestInputs=" + this.requestInputs + ", currencyPair=" + this.currencyPair + ", holding=" + this.holding + ", quote=" + this.quote + ", uiFeeEstimation=" + this.uiFeeEstimation + ")";
        }

        public RequestContext(RequestInputs requestInputs, UiCurrencyPair currencyPair, UiCryptoHolding uiCryptoHolding, Quote quote, UiFeeEstimation uiFeeEstimation) {
            Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.requestInputs = requestInputs;
            this.currencyPair = currencyPair;
            this.holding = uiCryptoHolding;
            this.quote = quote;
            this.uiFeeEstimation = uiFeeEstimation;
        }

        public final RequestInputs getRequestInputs() {
            return this.requestInputs;
        }

        public final UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        public final UiCryptoHolding getHolding() {
            return this.holding;
        }

        public final Quote getQuote() {
            return this.quote;
        }

        public final UiFeeEstimation getUiFeeEstimation() {
            return this.uiFeeEstimation;
        }

        public final BigDecimal getSellingPower() {
            BigDecimal decimalValue = this.quote.getBidPrice().getDecimalValue();
            UiCryptoHolding uiCryptoHolding = this.holding;
            BigDecimal bigDecimalMultiply = decimalValue.multiply(BigDecimals7.orZero(uiCryptoHolding != null ? uiCryptoHolding.getQuantityAvailable() : null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return bigDecimalMultiply;
        }

        public final BigDecimal getPriceByOrderType() {
            CryptoOrderPrices orderPrices = this.requestInputs.getOrderPrices();
            if (orderPrices instanceof CryptoOrderPrices.Market) {
                int i = WhenMappings.$EnumSwitchMapping$0[this.requestInputs.getSide().ordinal()];
                if (i == 1) {
                    return Money3.getBigDecimalCompat(this.quote.getAskPrice());
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return Money3.getBigDecimalCompat(this.quote.getBidPrice());
            }
            if (orderPrices instanceof CryptoOrderPrices.Limit) {
                return ((CryptoOrderPrices.Limit) orderPrices).getLimitPrice();
            }
            if (orderPrices instanceof CryptoOrderPrices.StopLoss) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.requestInputs.getSide().ordinal()];
                if (i2 == 1) {
                    return (BigDecimal) RangesKt.coerceAtLeast(((CryptoOrderPrices.StopLoss) orderPrices).getStopPrice(), Money3.getBigDecimalCompat(this.quote.getAskPrice()));
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return (BigDecimal) RangesKt.coerceAtMost(((CryptoOrderPrices.StopLoss) orderPrices).getStopPrice(), Money3.getBigDecimalCompat(this.quote.getBidPrice()));
            }
            if (orderPrices instanceof CryptoOrderPrices.StopLimit) {
                return ((CryptoOrderPrices.StopLimit) orderPrices).getLimitPrice();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JR\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;", "", "cryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "cryptoBuyingPower", "Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "isMarginInvestingEnabled", "", "isMemberPdtRevampV1", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoAccount;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/crypto/db/CryptoBuyingPower;Ljava/lang/Boolean;Z)V", "getCryptoAccount", "()Lcom/robinhood/models/crypto/db/CryptoAccount;", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getUnifiedBalances", "()Lcom/robinhood/models/crypto/db/UnifiedBalances;", "getCryptoBuyingPower", "()Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/crypto/db/CryptoAccount;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/models/crypto/db/UnifiedBalances;Lcom/robinhood/models/crypto/db/CryptoBuyingPower;Ljava/lang/Boolean;Z)Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountContext {
        public static final int $stable = 8;
        private final CryptoAccount cryptoAccount;
        private final CryptoBuyingPower cryptoBuyingPower;
        private final Boolean isMarginInvestingEnabled;
        private final boolean isMemberPdtRevampV1;
        private final UnifiedAccountV2 unifiedAccount;
        private final UnifiedBalances unifiedBalances;

        public static /* synthetic */ AccountContext copy$default(AccountContext accountContext, CryptoAccount cryptoAccount, UnifiedAccountV2 unifiedAccountV2, UnifiedBalances unifiedBalances, CryptoBuyingPower cryptoBuyingPower, Boolean bool, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoAccount = accountContext.cryptoAccount;
            }
            if ((i & 2) != 0) {
                unifiedAccountV2 = accountContext.unifiedAccount;
            }
            if ((i & 4) != 0) {
                unifiedBalances = accountContext.unifiedBalances;
            }
            if ((i & 8) != 0) {
                cryptoBuyingPower = accountContext.cryptoBuyingPower;
            }
            if ((i & 16) != 0) {
                bool = accountContext.isMarginInvestingEnabled;
            }
            if ((i & 32) != 0) {
                z = accountContext.isMemberPdtRevampV1;
            }
            Boolean bool2 = bool;
            boolean z2 = z;
            return accountContext.copy(cryptoAccount, unifiedAccountV2, unifiedBalances, cryptoBuyingPower, bool2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoAccount getCryptoAccount() {
            return this.cryptoAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final UnifiedAccountV2 getUnifiedAccount() {
            return this.unifiedAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final UnifiedBalances getUnifiedBalances() {
            return this.unifiedBalances;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoBuyingPower getCryptoBuyingPower() {
            return this.cryptoBuyingPower;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsMarginInvestingEnabled() {
            return this.isMarginInvestingEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsMemberPdtRevampV1() {
            return this.isMemberPdtRevampV1;
        }

        public final AccountContext copy(CryptoAccount cryptoAccount, UnifiedAccountV2 unifiedAccount, UnifiedBalances unifiedBalances, CryptoBuyingPower cryptoBuyingPower, Boolean isMarginInvestingEnabled, boolean isMemberPdtRevampV1) {
            Intrinsics.checkNotNullParameter(unifiedBalances, "unifiedBalances");
            return new AccountContext(cryptoAccount, unifiedAccount, unifiedBalances, cryptoBuyingPower, isMarginInvestingEnabled, isMemberPdtRevampV1);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountContext)) {
                return false;
            }
            AccountContext accountContext = (AccountContext) other;
            return Intrinsics.areEqual(this.cryptoAccount, accountContext.cryptoAccount) && Intrinsics.areEqual(this.unifiedAccount, accountContext.unifiedAccount) && Intrinsics.areEqual(this.unifiedBalances, accountContext.unifiedBalances) && Intrinsics.areEqual(this.cryptoBuyingPower, accountContext.cryptoBuyingPower) && Intrinsics.areEqual(this.isMarginInvestingEnabled, accountContext.isMarginInvestingEnabled) && this.isMemberPdtRevampV1 == accountContext.isMemberPdtRevampV1;
        }

        public int hashCode() {
            CryptoAccount cryptoAccount = this.cryptoAccount;
            int iHashCode = (cryptoAccount == null ? 0 : cryptoAccount.hashCode()) * 31;
            UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
            int iHashCode2 = (((iHashCode + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31) + this.unifiedBalances.hashCode()) * 31;
            CryptoBuyingPower cryptoBuyingPower = this.cryptoBuyingPower;
            int iHashCode3 = (iHashCode2 + (cryptoBuyingPower == null ? 0 : cryptoBuyingPower.hashCode())) * 31;
            Boolean bool = this.isMarginInvestingEnabled;
            return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
        }

        public String toString() {
            return "AccountContext(cryptoAccount=" + this.cryptoAccount + ", unifiedAccount=" + this.unifiedAccount + ", unifiedBalances=" + this.unifiedBalances + ", cryptoBuyingPower=" + this.cryptoBuyingPower + ", isMarginInvestingEnabled=" + this.isMarginInvestingEnabled + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
        }

        public AccountContext(CryptoAccount cryptoAccount, UnifiedAccountV2 unifiedAccountV2, UnifiedBalances unifiedBalances, CryptoBuyingPower cryptoBuyingPower, Boolean bool, boolean z) {
            Intrinsics.checkNotNullParameter(unifiedBalances, "unifiedBalances");
            this.cryptoAccount = cryptoAccount;
            this.unifiedAccount = unifiedAccountV2;
            this.unifiedBalances = unifiedBalances;
            this.cryptoBuyingPower = cryptoBuyingPower;
            this.isMarginInvestingEnabled = bool;
            this.isMemberPdtRevampV1 = z;
        }

        public /* synthetic */ AccountContext(CryptoAccount cryptoAccount, UnifiedAccountV2 unifiedAccountV2, UnifiedBalances unifiedBalances, CryptoBuyingPower cryptoBuyingPower, Boolean bool, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoAccount, unifiedAccountV2, unifiedBalances, cryptoBuyingPower, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z);
        }

        public final CryptoAccount getCryptoAccount() {
            return this.cryptoAccount;
        }

        public final UnifiedAccountV2 getUnifiedAccount() {
            return this.unifiedAccount;
        }

        public final UnifiedBalances getUnifiedBalances() {
            return this.unifiedBalances;
        }

        public final CryptoBuyingPower getCryptoBuyingPower() {
            return this.cryptoBuyingPower;
        }

        public final Boolean isMarginInvestingEnabled() {
            return this.isMarginInvestingEnabled;
        }

        public final boolean isMemberPdtRevampV1() {
            return this.isMemberPdtRevampV1;
        }
    }

    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J]\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$OrderInfo;", "", "feeAmount", "Ljava/math/BigDecimal;", "displayFeeAmount", "", "uncollaredTotalCost", "displayQuantity", "orderQuantity", "uncollaredPrice", "collaredPrice", "isQuantityCollared", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)V", "getFeeAmount", "()Ljava/math/BigDecimal;", "getDisplayFeeAmount", "()Ljava/lang/String;", "getUncollaredTotalCost", "getDisplayQuantity", "getOrderQuantity", "getUncollaredPrice", "getCollaredPrice", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderInfo {
        public static final int $stable = 8;
        private final BigDecimal collaredPrice;
        private final String displayFeeAmount;
        private final BigDecimal displayQuantity;
        private final BigDecimal feeAmount;
        private final boolean isQuantityCollared;
        private final BigDecimal orderQuantity;
        private final BigDecimal uncollaredPrice;
        private final BigDecimal uncollaredTotalCost;

        public static /* synthetic */ OrderInfo copy$default(OrderInfo orderInfo, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = orderInfo.feeAmount;
            }
            if ((i & 2) != 0) {
                str = orderInfo.displayFeeAmount;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = orderInfo.uncollaredTotalCost;
            }
            if ((i & 8) != 0) {
                bigDecimal3 = orderInfo.displayQuantity;
            }
            if ((i & 16) != 0) {
                bigDecimal4 = orderInfo.orderQuantity;
            }
            if ((i & 32) != 0) {
                bigDecimal5 = orderInfo.uncollaredPrice;
            }
            if ((i & 64) != 0) {
                bigDecimal6 = orderInfo.collaredPrice;
            }
            if ((i & 128) != 0) {
                z = orderInfo.isQuantityCollared;
            }
            BigDecimal bigDecimal7 = bigDecimal6;
            boolean z2 = z;
            BigDecimal bigDecimal8 = bigDecimal4;
            BigDecimal bigDecimal9 = bigDecimal5;
            return orderInfo.copy(bigDecimal, str, bigDecimal2, bigDecimal3, bigDecimal8, bigDecimal9, bigDecimal7, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getFeeAmount() {
            return this.feeAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayFeeAmount() {
            return this.displayFeeAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getUncollaredTotalCost() {
            return this.uncollaredTotalCost;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getDisplayQuantity() {
            return this.displayQuantity;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getOrderQuantity() {
            return this.orderQuantity;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getUncollaredPrice() {
            return this.uncollaredPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final BigDecimal getCollaredPrice() {
            return this.collaredPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsQuantityCollared() {
            return this.isQuantityCollared;
        }

        public final OrderInfo copy(BigDecimal feeAmount, String displayFeeAmount, BigDecimal uncollaredTotalCost, BigDecimal displayQuantity, BigDecimal orderQuantity, BigDecimal uncollaredPrice, BigDecimal collaredPrice, boolean isQuantityCollared) {
            Intrinsics.checkNotNullParameter(uncollaredTotalCost, "uncollaredTotalCost");
            Intrinsics.checkNotNullParameter(displayQuantity, "displayQuantity");
            Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
            Intrinsics.checkNotNullParameter(uncollaredPrice, "uncollaredPrice");
            Intrinsics.checkNotNullParameter(collaredPrice, "collaredPrice");
            return new OrderInfo(feeAmount, displayFeeAmount, uncollaredTotalCost, displayQuantity, orderQuantity, uncollaredPrice, collaredPrice, isQuantityCollared);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderInfo)) {
                return false;
            }
            OrderInfo orderInfo = (OrderInfo) other;
            return Intrinsics.areEqual(this.feeAmount, orderInfo.feeAmount) && Intrinsics.areEqual(this.displayFeeAmount, orderInfo.displayFeeAmount) && Intrinsics.areEqual(this.uncollaredTotalCost, orderInfo.uncollaredTotalCost) && Intrinsics.areEqual(this.displayQuantity, orderInfo.displayQuantity) && Intrinsics.areEqual(this.orderQuantity, orderInfo.orderQuantity) && Intrinsics.areEqual(this.uncollaredPrice, orderInfo.uncollaredPrice) && Intrinsics.areEqual(this.collaredPrice, orderInfo.collaredPrice) && this.isQuantityCollared == orderInfo.isQuantityCollared;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.feeAmount;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            String str = this.displayFeeAmount;
            return ((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.uncollaredTotalCost.hashCode()) * 31) + this.displayQuantity.hashCode()) * 31) + this.orderQuantity.hashCode()) * 31) + this.uncollaredPrice.hashCode()) * 31) + this.collaredPrice.hashCode()) * 31) + Boolean.hashCode(this.isQuantityCollared);
        }

        public String toString() {
            return "OrderInfo(feeAmount=" + this.feeAmount + ", displayFeeAmount=" + this.displayFeeAmount + ", uncollaredTotalCost=" + this.uncollaredTotalCost + ", displayQuantity=" + this.displayQuantity + ", orderQuantity=" + this.orderQuantity + ", uncollaredPrice=" + this.uncollaredPrice + ", collaredPrice=" + this.collaredPrice + ", isQuantityCollared=" + this.isQuantityCollared + ")";
        }

        public OrderInfo(BigDecimal bigDecimal, String str, BigDecimal uncollaredTotalCost, BigDecimal displayQuantity, BigDecimal orderQuantity, BigDecimal uncollaredPrice, BigDecimal collaredPrice, boolean z) {
            Intrinsics.checkNotNullParameter(uncollaredTotalCost, "uncollaredTotalCost");
            Intrinsics.checkNotNullParameter(displayQuantity, "displayQuantity");
            Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
            Intrinsics.checkNotNullParameter(uncollaredPrice, "uncollaredPrice");
            Intrinsics.checkNotNullParameter(collaredPrice, "collaredPrice");
            this.feeAmount = bigDecimal;
            this.displayFeeAmount = str;
            this.uncollaredTotalCost = uncollaredTotalCost;
            this.displayQuantity = displayQuantity;
            this.orderQuantity = orderQuantity;
            this.uncollaredPrice = uncollaredPrice;
            this.collaredPrice = collaredPrice;
            this.isQuantityCollared = z;
        }

        public final BigDecimal getFeeAmount() {
            return this.feeAmount;
        }

        public final String getDisplayFeeAmount() {
            return this.displayFeeAmount;
        }

        public final BigDecimal getUncollaredTotalCost() {
            return this.uncollaredTotalCost;
        }

        public final BigDecimal getDisplayQuantity() {
            return this.displayQuantity;
        }

        public final BigDecimal getOrderQuantity() {
            return this.orderQuantity;
        }

        public final BigDecimal getUncollaredPrice() {
            return this.uncollaredPrice;
        }

        public final BigDecimal getCollaredPrice() {
            return this.collaredPrice;
        }

        public final boolean isQuantityCollared() {
            return this.isQuantityCollared;
        }
    }
}
