package com.robinhood.android.trade.directipo.validation;

import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager2;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration;
import com.robinhood.models.api.IpoOrderUpdateRequest;
import com.robinhood.models.api.OrderRequest;
import com.robinhood.models.api.bonfire.OrderInputFormat;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.util.Money;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderContext.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0003345B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020$H\u0002J\t\u0010'\u001a\u00020\u0003HÂ\u0003J\t\u0010(\u001a\u00020\u0005HÂ\u0003J\t\u0010)\u001a\u00020\u0007HÂ\u0003J\t\u0010*\u001a\u00020\tHÂ\u0003J\t\u0010+\u001a\u00020\u000bHÂ\u0003J;\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010-\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "", "orderConfiguration", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "priceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "customPrice", "Lcom/robinhood/models/util/Money;", "quantity", "Ljava/math/BigDecimal;", "staticInputs", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;", "<init>", "(Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;)V", "existingOrderId", "Ljava/util/UUID;", "pricePerShare", "totalCost", "canAffordOrder", "", "getCanAffordOrder", "()Z", "hasCobDeadlinePassed", "getHasCobDeadlinePassed", "limitPriceAggressiveness", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness;", "getLimitPriceAggressiveness", "()Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness;", "hasIpoAccessCustomPriceLimit", "request", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest;", "getRequest", "()Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest;", "getPriceInitializedOrderRequest", "Lcom/robinhood/models/api/OrderRequest;", "getPriceInitializedIpoOrderUpdateRequest", "Lcom/robinhood/models/api/IpoOrderUpdateRequest;", "getPriceFinalizedOrderRequest", "getPriceFinalizedIpoOrderUpdateRequest", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "StaticInputs", "LimitPriceAggressiveness", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DirectIpoOrderContext {
    private final Money customPrice;
    private final UUID existingOrderId;
    private final boolean hasIpoAccessCustomPriceLimit;
    private final ApiDirectIpoOrderConfiguration orderConfiguration;
    private final Money pricePerShare;
    private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType;
    private final BigDecimal quantity;
    private final DirectIpoOrderSubmissionManager2 request;
    private final StaticInputs staticInputs;
    private final Money totalCost;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.values().length];
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.LISTED_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.NAMED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IpoAccessStatus.values().length];
            try {
                iArr2[IpoAccessStatus.S1_FILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IpoAccessStatus.PUBLIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IpoAccessStatus.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IpoAccessStatus.DELAYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IpoAccessStatus.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IpoAccessStatus.PRICE_FINALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[IpoAccessStatus.PRICE_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final ApiDirectIpoOrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    /* renamed from: component2, reason: from getter */
    private final ApiDirectIpoOrderConfiguration.IpoAccessPriceType getPriceType() {
        return this.priceType;
    }

    /* renamed from: component3, reason: from getter */
    private final Money getCustomPrice() {
        return this.customPrice;
    }

    /* renamed from: component4, reason: from getter */
    private final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    private final StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    public static /* synthetic */ DirectIpoOrderContext copy$default(DirectIpoOrderContext directIpoOrderContext, ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, Money money, BigDecimal bigDecimal, StaticInputs staticInputs, int i, Object obj) {
        if ((i & 1) != 0) {
            apiDirectIpoOrderConfiguration = directIpoOrderContext.orderConfiguration;
        }
        if ((i & 2) != 0) {
            ipoAccessPriceType = directIpoOrderContext.priceType;
        }
        if ((i & 4) != 0) {
            money = directIpoOrderContext.customPrice;
        }
        if ((i & 8) != 0) {
            bigDecimal = directIpoOrderContext.quantity;
        }
        if ((i & 16) != 0) {
            staticInputs = directIpoOrderContext.staticInputs;
        }
        StaticInputs staticInputs2 = staticInputs;
        Money money2 = money;
        return directIpoOrderContext.copy(apiDirectIpoOrderConfiguration, ipoAccessPriceType, money2, bigDecimal, staticInputs2);
    }

    public final DirectIpoOrderContext copy(ApiDirectIpoOrderConfiguration orderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, Money customPrice, BigDecimal quantity, StaticInputs staticInputs) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(customPrice, "customPrice");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        return new DirectIpoOrderContext(orderConfiguration, priceType, customPrice, quantity, staticInputs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectIpoOrderContext)) {
            return false;
        }
        DirectIpoOrderContext directIpoOrderContext = (DirectIpoOrderContext) other;
        return Intrinsics.areEqual(this.orderConfiguration, directIpoOrderContext.orderConfiguration) && this.priceType == directIpoOrderContext.priceType && Intrinsics.areEqual(this.customPrice, directIpoOrderContext.customPrice) && Intrinsics.areEqual(this.quantity, directIpoOrderContext.quantity) && Intrinsics.areEqual(this.staticInputs, directIpoOrderContext.staticInputs);
    }

    public int hashCode() {
        return (((((((this.orderConfiguration.hashCode() * 31) + this.priceType.hashCode()) * 31) + this.customPrice.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.staticInputs.hashCode();
    }

    public String toString() {
        return "DirectIpoOrderContext(orderConfiguration=" + this.orderConfiguration + ", priceType=" + this.priceType + ", customPrice=" + this.customPrice + ", quantity=" + this.quantity + ", staticInputs=" + this.staticInputs + ")";
    }

    public DirectIpoOrderContext(ApiDirectIpoOrderConfiguration orderConfiguration, ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType, Money customPrice, BigDecimal quantity, StaticInputs staticInputs) {
        DirectIpoOrderSubmissionManager2 create;
        OrderRequest priceFinalizedOrderRequest;
        IpoOrderUpdateRequest priceFinalizedIpoOrderUpdateRequest;
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(customPrice, "customPrice");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        this.orderConfiguration = orderConfiguration;
        this.priceType = priceType;
        this.customPrice = customPrice;
        this.quantity = quantity;
        this.staticInputs = staticInputs;
        UUID orderId = orderConfiguration.getOrderId();
        this.existingOrderId = orderId;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[priceType.ordinal()];
        boolean z = true;
        if (i == 1) {
            customPrice = orderConfiguration.getContext().getPricePerShare();
        } else if (i != 2) {
            if (i == 3) {
                throw new IllegalStateException("Unknown PriceTypes should be filtered out");
            }
            throw new NoWhenBranchMatchedException();
        }
        this.pricePerShare = customPrice;
        this.totalCost = customPrice.times(quantity);
        int i2 = iArr[priceType.ordinal()];
        if (i2 == 1) {
            z = false;
        } else if (i2 != 2) {
            if (i2 == 3) {
                throw new IllegalStateException("Unknown PriceTypes should be filtered out");
            }
            throw new NoWhenBranchMatchedException();
        }
        this.hasIpoAccessCustomPriceLimit = z;
        if (orderId != null) {
            IpoAccessStatus phase = orderConfiguration.getPhase();
            switch (WhenMappings.$EnumSwitchMapping$1[phase.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException(("Unexpected phase: " + phase).toString());
                case 6:
                    priceFinalizedIpoOrderUpdateRequest = getPriceFinalizedIpoOrderUpdateRequest();
                    break;
                case 7:
                    priceFinalizedIpoOrderUpdateRequest = getPriceInitializedIpoOrderUpdateRequest();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            create = new DirectIpoOrderSubmissionManager2.Update(orderId, priceFinalizedIpoOrderUpdateRequest);
        } else {
            IpoAccessStatus phase2 = orderConfiguration.getPhase();
            switch (WhenMappings.$EnumSwitchMapping$1[phase2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException(("Unexpected phase: " + phase2).toString());
                case 6:
                    priceFinalizedOrderRequest = getPriceFinalizedOrderRequest();
                    break;
                case 7:
                    priceFinalizedOrderRequest = getPriceInitializedOrderRequest();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            create = new DirectIpoOrderSubmissionManager2.Create(priceFinalizedOrderRequest);
        }
        this.request = create;
    }

    public final boolean getCanAffordOrder() {
        return this.orderConfiguration.getContext().getAvailable_buying_power().compareTo(this.totalCost) >= 0;
    }

    public final boolean getHasCobDeadlinePassed() {
        return this.orderConfiguration.getContext().getHas_cob_deadline_passed();
    }

    public final LimitPriceAggressiveness getLimitPriceAggressiveness() {
        IpoAccessStatus phase = this.orderConfiguration.getPhase();
        switch (WhenMappings.$EnumSwitchMapping$1[phase.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                throw new IllegalStateException(("Unexpected phase: " + phase).toString());
            case 6:
                return LimitPriceAggressiveness.NotAggressive.INSTANCE;
            case 7:
                int i = WhenMappings.$EnumSwitchMapping$0[this.priceType.ordinal()];
                if (i == 1) {
                    return LimitPriceAggressiveness.NotAggressive.INSTANCE;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unknown PriceTypes should be filtered out");
                }
                Money upperPriceRange = this.orderConfiguration.getContext().getUpperPriceRange();
                if (upperPriceRange == null) {
                    return LimitPriceAggressiveness.NotAggressive.INSTANCE;
                }
                Money lowerPriceRange = this.orderConfiguration.getContext().getLowerPriceRange();
                if (lowerPriceRange == null) {
                    return LimitPriceAggressiveness.NotAggressive.INSTANCE;
                }
                if (this.customPrice.compareTo(upperPriceRange) > 0 || this.customPrice.compareTo(lowerPriceRange) < 0) {
                    return new LimitPriceAggressiveness.Aggressive(lowerPriceRange, upperPriceRange);
                }
                return LimitPriceAggressiveness.NotAggressive.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final DirectIpoOrderSubmissionManager2 getRequest() {
        return this.request;
    }

    private final OrderRequest getPriceInitializedOrderRequest() {
        Money upper_price_collared;
        Money upper_price;
        Money lower_price_collared;
        Money lower_price;
        BigDecimal decimalValue = this.pricePerShare.getDecimalValue();
        String url = Account.INSTANCE.getUrl(this.orderConfiguration.getAccount_number());
        String url2 = Instrument.INSTANCE.getUrl(this.orderConfiguration.getInstrument_id());
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote = this.orderConfiguration.getContext().getIpo_access_quote();
        BigDecimal decimalValue2 = null;
        BigDecimal decimalValue3 = (ipo_access_quote == null || (lower_price = ipo_access_quote.getLower_price()) == null) ? null : lower_price.getDecimalValue();
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote2 = this.orderConfiguration.getContext().getIpo_access_quote();
        BigDecimal decimalValue4 = (ipo_access_quote2 == null || (lower_price_collared = ipo_access_quote2.getLower_price_collared()) == null) ? null : lower_price_collared.getDecimalValue();
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote3 = this.orderConfiguration.getContext().getIpo_access_quote();
        BigDecimal decimalValue5 = (ipo_access_quote3 == null || (upper_price = ipo_access_quote3.getUpper_price()) == null) ? null : upper_price.getDecimalValue();
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote4 = this.orderConfiguration.getContext().getIpo_access_quote();
        if (ipo_access_quote4 != null && (upper_price_collared = ipo_access_quote4.getUpper_price_collared()) != null) {
            decimalValue2 = upper_price_collared.getDecimalValue();
        }
        return new OrderRequest(url, null, null, null, url2, null, decimalValue4, decimalValue3, decimalValue2, decimalValue5, this.hasIpoAccessCustomPriceLimit, true, null, decimalValue, this.quantity, this.staticInputs.getRefId(), EquityOrderSide.BUY, null, this.orderConfiguration.getContext().getInstrument_symbol(), OrderTimeInForce.GTC, null, OrderTrigger.IMMEDIATE, OrderType.LIMIT, null, null, null, null, null, null, null, null, null, null, OrderInputFormat.SHARES, null, -15593426, 1, null);
    }

    private final IpoOrderUpdateRequest getPriceInitializedIpoOrderUpdateRequest() {
        Money upper_price_collared;
        Money upper_price;
        Money lower_price_collared;
        Money lower_price;
        BigDecimal bigDecimal = this.quantity;
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote = this.orderConfiguration.getContext().getIpo_access_quote();
        BigDecimal decimalValue = null;
        BigDecimal decimalValue2 = (ipo_access_quote == null || (lower_price = ipo_access_quote.getLower_price()) == null) ? null : lower_price.getDecimalValue();
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote2 = this.orderConfiguration.getContext().getIpo_access_quote();
        BigDecimal decimalValue3 = (ipo_access_quote2 == null || (lower_price_collared = ipo_access_quote2.getLower_price_collared()) == null) ? null : lower_price_collared.getDecimalValue();
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote3 = this.orderConfiguration.getContext().getIpo_access_quote();
        BigDecimal decimalValue4 = (ipo_access_quote3 == null || (upper_price = ipo_access_quote3.getUpper_price()) == null) ? null : upper_price.getDecimalValue();
        ApiDirectIpoOrderConfiguration.IpoAccessQuote ipo_access_quote4 = this.orderConfiguration.getContext().getIpo_access_quote();
        if (ipo_access_quote4 != null && (upper_price_collared = ipo_access_quote4.getUpper_price_collared()) != null) {
            decimalValue = upper_price_collared.getDecimalValue();
        }
        return new IpoOrderUpdateRequest(decimalValue3, decimalValue2, decimalValue, decimalValue4, this.hasIpoAccessCustomPriceLimit, this.pricePerShare.getDecimalValue(), bigDecimal, this.staticInputs.getRefId(), this.staticInputs.getAccountNumber());
    }

    private final OrderRequest getPriceFinalizedOrderRequest() {
        BigDecimal decimalValue = this.pricePerShare.getDecimalValue();
        return new OrderRequest(Account.INSTANCE.getUrl(this.orderConfiguration.getAccount_number()), null, null, null, Instrument.INSTANCE.getUrl(this.orderConfiguration.getInstrument_id()), null, null, null, null, null, this.hasIpoAccessCustomPriceLimit, true, null, decimalValue, this.quantity, this.staticInputs.getRefId(), EquityOrderSide.BUY, null, this.orderConfiguration.getContext().getInstrument_symbol(), OrderTimeInForce.GTC, null, OrderTrigger.IMMEDIATE, OrderType.LIMIT, null, null, null, null, null, null, null, null, null, null, OrderInputFormat.SHARES, null, -15592466, 1, null);
    }

    private final IpoOrderUpdateRequest getPriceFinalizedIpoOrderUpdateRequest() {
        return new IpoOrderUpdateRequest(null, null, null, null, this.hasIpoAccessCustomPriceLimit, this.pricePerShare.getDecimalValue(), this.quantity, this.staticInputs.getRefId(), this.staticInputs.getAccountNumber(), 15, null);
    }

    /* compiled from: DirectIpoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$StaticInputs;", "", "refId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getRefId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StaticInputs {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID refId;

        public static /* synthetic */ StaticInputs copy$default(StaticInputs staticInputs, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = staticInputs.refId;
            }
            if ((i & 2) != 0) {
                str = staticInputs.accountNumber;
            }
            return staticInputs.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final StaticInputs copy(UUID refId, String accountNumber) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new StaticInputs(refId, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StaticInputs)) {
                return false;
            }
            StaticInputs staticInputs = (StaticInputs) other;
            return Intrinsics.areEqual(this.refId, staticInputs.refId) && Intrinsics.areEqual(this.accountNumber, staticInputs.accountNumber);
        }

        public int hashCode() {
            return (this.refId.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "StaticInputs(refId=" + this.refId + ", accountNumber=" + this.accountNumber + ")";
        }

        public StaticInputs(UUID refId, String accountNumber) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.refId = refId;
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getRefId() {
            return this.refId;
        }
    }

    /* compiled from: DirectIpoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness;", "", "<init>", "()V", "NotAggressive", "Aggressive", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness$Aggressive;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness$NotAggressive;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class LimitPriceAggressiveness {
        public static final int $stable = 0;

        public /* synthetic */ LimitPriceAggressiveness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LimitPriceAggressiveness() {
        }

        /* compiled from: DirectIpoOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness$NotAggressive;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness;", "<init>", "()V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NotAggressive extends LimitPriceAggressiveness {
            public static final int $stable = 0;
            public static final NotAggressive INSTANCE = new NotAggressive();

            private NotAggressive() {
                super(null);
            }
        }

        /* compiled from: DirectIpoOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness$Aggressive;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$LimitPriceAggressiveness;", "lowerPriceRange", "Lcom/robinhood/models/util/Money;", "upperPriceRange", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "getLowerPriceRange", "()Lcom/robinhood/models/util/Money;", "getUpperPriceRange", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Aggressive extends LimitPriceAggressiveness {
            public static final int $stable = 8;
            private final Money lowerPriceRange;
            private final Money upperPriceRange;

            public static /* synthetic */ Aggressive copy$default(Aggressive aggressive, Money money, Money money2, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = aggressive.lowerPriceRange;
                }
                if ((i & 2) != 0) {
                    money2 = aggressive.upperPriceRange;
                }
                return aggressive.copy(money, money2);
            }

            /* renamed from: component1, reason: from getter */
            public final Money getLowerPriceRange() {
                return this.lowerPriceRange;
            }

            /* renamed from: component2, reason: from getter */
            public final Money getUpperPriceRange() {
                return this.upperPriceRange;
            }

            public final Aggressive copy(Money lowerPriceRange, Money upperPriceRange) {
                Intrinsics.checkNotNullParameter(lowerPriceRange, "lowerPriceRange");
                Intrinsics.checkNotNullParameter(upperPriceRange, "upperPriceRange");
                return new Aggressive(lowerPriceRange, upperPriceRange);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Aggressive)) {
                    return false;
                }
                Aggressive aggressive = (Aggressive) other;
                return Intrinsics.areEqual(this.lowerPriceRange, aggressive.lowerPriceRange) && Intrinsics.areEqual(this.upperPriceRange, aggressive.upperPriceRange);
            }

            public int hashCode() {
                return (this.lowerPriceRange.hashCode() * 31) + this.upperPriceRange.hashCode();
            }

            public String toString() {
                return "Aggressive(lowerPriceRange=" + this.lowerPriceRange + ", upperPriceRange=" + this.upperPriceRange + ")";
            }

            public final Money getLowerPriceRange() {
                return this.lowerPriceRange;
            }

            public final Money getUpperPriceRange() {
                return this.upperPriceRange;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Aggressive(Money lowerPriceRange, Money upperPriceRange) {
                super(null);
                Intrinsics.checkNotNullParameter(lowerPriceRange, "lowerPriceRange");
                Intrinsics.checkNotNullParameter(upperPriceRange, "upperPriceRange");
                this.lowerPriceRange = lowerPriceRange;
                this.upperPriceRange = upperPriceRange;
            }
        }
    }

    /* compiled from: DirectIpoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext$Companion;", "", "<init>", "()V", "isInputIdentical", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "b", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isInputIdentical(DirectIpoOrderContext a, DirectIpoOrderContext b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            return Intrinsics.areEqual(a.quantity, b.quantity) && Intrinsics.areEqual(b.customPrice, b.customPrice);
        }
    }
}
