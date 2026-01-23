package com.robinhood.shared.trade.crypto.validation.check;

import android.content.res.Resources;
import android.os.Bundle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.p375ui.format.CryptoOrderFormatter2;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMaxOrderSizeCheck.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\u000eB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "isValidatingInTaxLotSelection", "", "<init>", "(Lcom/robinhood/analytics/EventLogger;Z)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure;", "input", "Failure", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoMaxOrderSizeCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private final boolean isValidatingInTaxLotSelection;

    public CryptoMaxOrderSizeCheck(EventLogger eventLogger, boolean z) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
        this.isValidatingInTaxLotSelection = z;
    }

    public /* synthetic */ CryptoMaxOrderSizeCheck(EventLogger eventLogger, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventLogger, (i & 2) != 0 ? false : z);
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        BigDecimal orderQuantity = input.getRequest().getOrderQuantity();
        BigDecimal maxOrderSize = input.getRequestContext().getCurrencyPair().getMaxOrderSize();
        if (BigDecimals7.lte(orderQuantity, maxOrderSize)) {
            return null;
        }
        RequestInputs requestInputs = input.getRequestContext().getRequestInputs();
        if (requestInputs instanceof RequestInputs.AsAsset) {
            if (this.isValidatingInTaxLotSelection) {
                RequestInputs.AsAsset asAsset = (RequestInputs.AsAsset) requestInputs;
                return new Failure.TaxLots(asAsset.getPurchaseSize(), input.getRequestContext().getCurrencyPair(), asAsset.getSide(), maxOrderSize, input.getOrderInfo().getUncollaredPrice(), this.eventLogger);
            }
            RequestInputs.AsAsset asAsset2 = (RequestInputs.AsAsset) requestInputs;
            return new Failure.AsAsset(asAsset2.getPurchaseSize(), input.getRequestContext().getCurrencyPair(), asAsset2.getSide(), maxOrderSize, input.getOrderInfo().getUncollaredPrice(), this.eventLogger);
        }
        if (!(requestInputs instanceof RequestInputs.AsQuote)) {
            throw new NoWhenBranchMatchedException();
        }
        RequestInputs.AsQuote asQuote = (RequestInputs.AsQuote) requestInputs;
        return new Failure.AsQuote(asQuote.getPurchaseCost(), input.getRequestContext().getCurrencyPair(), asQuote.getSide(), maxOrderSize, input.getOrderInfo().getUncollaredPrice(), this.eventLogger);
    }

    /* compiled from: CryptoMaxOrderSizeCheck.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003&'(B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0003)*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "maxSize", "Ljava/math/BigDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getMaxSize", "()Ljava/math/BigDecimal;", "getPrice", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getTitle", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getNegativeAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "AsAsset", "AsQuote", "TaxLots", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure$AsAsset;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure$AsQuote;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure$TaxLots;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final String checkIdentifier;
        private final UiCurrencyPair currencyPair;
        private final EventLogger eventLogger;
        private final BigDecimal maxSize;
        private final BigDecimal price;
        private final OrderSide side;

        public /* synthetic */ Failure(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, EventLogger eventLogger, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiCurrencyPair, orderSide, bigDecimal, bigDecimal2, eventLogger);
        }

        public UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        public OrderSide getSide() {
            return this.side;
        }

        public BigDecimal getMaxSize() {
            return this.maxSize;
        }

        public BigDecimal getPrice() {
            return this.price;
        }

        public EventLogger getEventLogger() {
            return this.eventLogger;
        }

        private Failure(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, EventLogger eventLogger) {
            super(eventLogger);
            this.currencyPair = uiCurrencyPair;
            this.side = orderSide;
            this.maxSize = bigDecimal;
            this.price = bigDecimal2;
            this.eventLogger = eventLogger;
            this.checkIdentifier = "crypto_max_order_size_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_too_large_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getNegativeAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return activity.getString(C11048R.string.general_label_dismiss);
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            BigDecimal scale = getMaxSize().multiply(getPrice()).setScale(getCurrencyPair().getQuoteCurrency().getDecimalScale(), RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            resolver.setOrderSize(scale, getMaxSize());
            return Validator.Action.Abort.INSTANCE;
        }

        /* compiled from: CryptoMaxOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure$AsAsset;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure;", "enteredAssetAmount", "Ljava/math/BigDecimal;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "maxSize", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getEnteredAssetAmount", "()Ljava/math/BigDecimal;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getMaxSize", "getPrice", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AsAsset extends Failure {
            public static final int $stable = 8;
            private final UiCurrencyPair currencyPair;
            private final BigDecimal enteredAssetAmount;
            private final EventLogger eventLogger;
            private final BigDecimal maxSize;
            private final BigDecimal price;
            private final OrderSide side;

            public static /* synthetic */ AsAsset copy$default(AsAsset asAsset, BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal bigDecimal2, BigDecimal bigDecimal3, EventLogger eventLogger, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = asAsset.enteredAssetAmount;
                }
                if ((i & 2) != 0) {
                    uiCurrencyPair = asAsset.currencyPair;
                }
                if ((i & 4) != 0) {
                    orderSide = asAsset.side;
                }
                if ((i & 8) != 0) {
                    bigDecimal2 = asAsset.maxSize;
                }
                if ((i & 16) != 0) {
                    bigDecimal3 = asAsset.price;
                }
                if ((i & 32) != 0) {
                    eventLogger = asAsset.eventLogger;
                }
                BigDecimal bigDecimal4 = bigDecimal3;
                EventLogger eventLogger2 = eventLogger;
                return asAsset.copy(bigDecimal, uiCurrencyPair, orderSide, bigDecimal2, bigDecimal4, eventLogger2);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getEnteredAssetAmount() {
                return this.enteredAssetAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component3, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getMaxSize() {
                return this.maxSize;
            }

            /* renamed from: component5, reason: from getter */
            public final BigDecimal getPrice() {
                return this.price;
            }

            /* renamed from: component6, reason: from getter */
            public final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            public final AsAsset copy(BigDecimal enteredAssetAmount, UiCurrencyPair currencyPair, OrderSide side, BigDecimal maxSize, BigDecimal price, EventLogger eventLogger) {
                Intrinsics.checkNotNullParameter(enteredAssetAmount, "enteredAssetAmount");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(maxSize, "maxSize");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new AsAsset(enteredAssetAmount, currencyPair, side, maxSize, price, eventLogger);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AsAsset)) {
                    return false;
                }
                AsAsset asAsset = (AsAsset) other;
                return Intrinsics.areEqual(this.enteredAssetAmount, asAsset.enteredAssetAmount) && Intrinsics.areEqual(this.currencyPair, asAsset.currencyPair) && this.side == asAsset.side && Intrinsics.areEqual(this.maxSize, asAsset.maxSize) && Intrinsics.areEqual(this.price, asAsset.price) && Intrinsics.areEqual(this.eventLogger, asAsset.eventLogger);
            }

            public int hashCode() {
                return (((((((((this.enteredAssetAmount.hashCode() * 31) + this.currencyPair.hashCode()) * 31) + this.side.hashCode()) * 31) + this.maxSize.hashCode()) * 31) + this.price.hashCode()) * 31) + this.eventLogger.hashCode();
            }

            public String toString() {
                return "AsAsset(enteredAssetAmount=" + this.enteredAssetAmount + ", currencyPair=" + this.currencyPair + ", side=" + this.side + ", maxSize=" + this.maxSize + ", price=" + this.price + ", eventLogger=" + this.eventLogger + ")";
            }

            public final BigDecimal getEnteredAssetAmount() {
                return this.enteredAssetAmount;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public BigDecimal getMaxSize() {
                return this.maxSize;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public BigDecimal getPrice() {
                return this.price;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsAsset(BigDecimal enteredAssetAmount, UiCurrencyPair currencyPair, OrderSide side, BigDecimal maxSize, BigDecimal price, EventLogger eventLogger) {
                super(currencyPair, side, maxSize, price, eventLogger, null);
                Intrinsics.checkNotNullParameter(enteredAssetAmount, "enteredAssetAmount");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(maxSize, "maxSize");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.enteredAssetAmount = enteredAssetAmount;
                this.currencyPair = currencyPair;
                this.side = side;
                this.maxSize = maxSize;
                this.price = price;
                this.eventLogger = eventLogger;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i = C40095R.string.crypto_order_check_too_large_asset_message;
                String displayName = getCurrencyPair().getDisplayName();
                String currency$default = CurrencyDefinitions.formatCurrency$default(getCurrencyPair().getAssetCurrency(), getMaxSize(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
                StringResource sideLabel = CryptoOrderFormatter2.getSideLabel(getSide());
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String lowerCase = sideLabel.getText(resources).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string2 = activity.getString(i, displayName, currency$default, lowerCase, CurrencyDefinitions.formatCurrency$default(getCurrencyPair().getAssetCurrency(), this.enteredAssetAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i = C40095R.string.crypto_order_check_too_large_set_max;
                StringResource sideLabel = CryptoOrderFormatter2.getSideLabel(getSide());
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return activity.getString(i, sideLabel.getText(resources).toString(), CurrencyDefinitions.formatCurrency$default(getCurrencyPair().getAssetCurrency(), getMaxSize(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
        }

        /* compiled from: CryptoMaxOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure$AsQuote;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure;", "enteredQuoteAmount", "Ljava/math/BigDecimal;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "maxSize", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getEnteredQuoteAmount", "()Ljava/math/BigDecimal;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getMaxSize", "getPrice", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AsQuote extends Failure {
            public static final int $stable = 8;
            private final UiCurrencyPair currencyPair;
            private final BigDecimal enteredQuoteAmount;
            private final EventLogger eventLogger;
            private final BigDecimal maxSize;
            private final BigDecimal price;
            private final OrderSide side;

            public static /* synthetic */ AsQuote copy$default(AsQuote asQuote, BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal bigDecimal2, BigDecimal bigDecimal3, EventLogger eventLogger, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = asQuote.enteredQuoteAmount;
                }
                if ((i & 2) != 0) {
                    uiCurrencyPair = asQuote.currencyPair;
                }
                if ((i & 4) != 0) {
                    orderSide = asQuote.side;
                }
                if ((i & 8) != 0) {
                    bigDecimal2 = asQuote.maxSize;
                }
                if ((i & 16) != 0) {
                    bigDecimal3 = asQuote.price;
                }
                if ((i & 32) != 0) {
                    eventLogger = asQuote.eventLogger;
                }
                BigDecimal bigDecimal4 = bigDecimal3;
                EventLogger eventLogger2 = eventLogger;
                return asQuote.copy(bigDecimal, uiCurrencyPair, orderSide, bigDecimal2, bigDecimal4, eventLogger2);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getEnteredQuoteAmount() {
                return this.enteredQuoteAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component3, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getMaxSize() {
                return this.maxSize;
            }

            /* renamed from: component5, reason: from getter */
            public final BigDecimal getPrice() {
                return this.price;
            }

            /* renamed from: component6, reason: from getter */
            public final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            public final AsQuote copy(BigDecimal enteredQuoteAmount, UiCurrencyPair currencyPair, OrderSide side, BigDecimal maxSize, BigDecimal price, EventLogger eventLogger) {
                Intrinsics.checkNotNullParameter(enteredQuoteAmount, "enteredQuoteAmount");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(maxSize, "maxSize");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new AsQuote(enteredQuoteAmount, currencyPair, side, maxSize, price, eventLogger);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AsQuote)) {
                    return false;
                }
                AsQuote asQuote = (AsQuote) other;
                return Intrinsics.areEqual(this.enteredQuoteAmount, asQuote.enteredQuoteAmount) && Intrinsics.areEqual(this.currencyPair, asQuote.currencyPair) && this.side == asQuote.side && Intrinsics.areEqual(this.maxSize, asQuote.maxSize) && Intrinsics.areEqual(this.price, asQuote.price) && Intrinsics.areEqual(this.eventLogger, asQuote.eventLogger);
            }

            public int hashCode() {
                return (((((((((this.enteredQuoteAmount.hashCode() * 31) + this.currencyPair.hashCode()) * 31) + this.side.hashCode()) * 31) + this.maxSize.hashCode()) * 31) + this.price.hashCode()) * 31) + this.eventLogger.hashCode();
            }

            public String toString() {
                return "AsQuote(enteredQuoteAmount=" + this.enteredQuoteAmount + ", currencyPair=" + this.currencyPair + ", side=" + this.side + ", maxSize=" + this.maxSize + ", price=" + this.price + ", eventLogger=" + this.eventLogger + ")";
            }

            public final BigDecimal getEnteredQuoteAmount() {
                return this.enteredQuoteAmount;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public BigDecimal getMaxSize() {
                return this.maxSize;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public BigDecimal getPrice() {
                return this.price;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsQuote(BigDecimal enteredQuoteAmount, UiCurrencyPair currencyPair, OrderSide side, BigDecimal maxSize, BigDecimal price, EventLogger eventLogger) {
                super(currencyPair, side, maxSize, price, eventLogger, null);
                Intrinsics.checkNotNullParameter(enteredQuoteAmount, "enteredQuoteAmount");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(maxSize, "maxSize");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.enteredQuoteAmount = enteredQuoteAmount;
                this.currencyPair = currencyPair;
                this.side = side;
                this.maxSize = maxSize;
                this.price = price;
                this.eventLogger = eventLogger;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i = C40095R.string.crypto_order_check_too_large_quote_message;
                String displayName = getCurrencyPair().getDisplayName();
                Currency quoteCurrency = getCurrencyPair().getQuoteCurrency();
                BigDecimal bigDecimalMultiply = getMaxSize().multiply(getPrice());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                String currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrency, bigDecimalMultiply, false, false, null, 0, null, null, false, false, false, false, 2046, null);
                StringResource sideLabel = CryptoOrderFormatter2.getSideLabel(getSide());
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String lowerCase = sideLabel.getText(resources).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string2 = activity.getString(i, displayName, currency$default, lowerCase, CurrencyDefinitions.formatCurrency$default(getCurrencyPair().getQuoteCurrency(), this.enteredQuoteAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i = C40095R.string.crypto_order_check_too_large_set_max;
                StringResource sideLabel = CryptoOrderFormatter2.getSideLabel(getSide());
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = sideLabel.getText(resources).toString();
                Currency quoteCurrency = getCurrencyPair().getQuoteCurrency();
                BigDecimal bigDecimalMultiply = getMaxSize().multiply(getPrice());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                return activity.getString(i, string2, CurrencyDefinitions.formatCurrency$default(quoteCurrency, bigDecimalMultiply, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
        }

        /* compiled from: CryptoMaxOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003JE\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure$TaxLots;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMaxOrderSizeCheck$Failure;", "enteredAssetAmount", "Ljava/math/BigDecimal;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "maxSize", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getEnteredAssetAmount", "()Ljava/math/BigDecimal;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getMaxSize", "getPrice", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "getNegativeAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLots extends Failure {
            public static final int $stable = 8;
            private final UiCurrencyPair currencyPair;
            private final BigDecimal enteredAssetAmount;
            private final EventLogger eventLogger;
            private final BigDecimal maxSize;
            private final BigDecimal price;
            private final OrderSide side;

            public static /* synthetic */ TaxLots copy$default(TaxLots taxLots, BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal bigDecimal2, BigDecimal bigDecimal3, EventLogger eventLogger, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = taxLots.enteredAssetAmount;
                }
                if ((i & 2) != 0) {
                    uiCurrencyPair = taxLots.currencyPair;
                }
                if ((i & 4) != 0) {
                    orderSide = taxLots.side;
                }
                if ((i & 8) != 0) {
                    bigDecimal2 = taxLots.maxSize;
                }
                if ((i & 16) != 0) {
                    bigDecimal3 = taxLots.price;
                }
                if ((i & 32) != 0) {
                    eventLogger = taxLots.eventLogger;
                }
                BigDecimal bigDecimal4 = bigDecimal3;
                EventLogger eventLogger2 = eventLogger;
                return taxLots.copy(bigDecimal, uiCurrencyPair, orderSide, bigDecimal2, bigDecimal4, eventLogger2);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getEnteredAssetAmount() {
                return this.enteredAssetAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component3, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getMaxSize() {
                return this.maxSize;
            }

            /* renamed from: component5, reason: from getter */
            public final BigDecimal getPrice() {
                return this.price;
            }

            /* renamed from: component6, reason: from getter */
            public final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            public final TaxLots copy(BigDecimal enteredAssetAmount, UiCurrencyPair currencyPair, OrderSide side, BigDecimal maxSize, BigDecimal price, EventLogger eventLogger) {
                Intrinsics.checkNotNullParameter(enteredAssetAmount, "enteredAssetAmount");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(maxSize, "maxSize");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new TaxLots(enteredAssetAmount, currencyPair, side, maxSize, price, eventLogger);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxLots)) {
                    return false;
                }
                TaxLots taxLots = (TaxLots) other;
                return Intrinsics.areEqual(this.enteredAssetAmount, taxLots.enteredAssetAmount) && Intrinsics.areEqual(this.currencyPair, taxLots.currencyPair) && this.side == taxLots.side && Intrinsics.areEqual(this.maxSize, taxLots.maxSize) && Intrinsics.areEqual(this.price, taxLots.price) && Intrinsics.areEqual(this.eventLogger, taxLots.eventLogger);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getNegativeAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return null;
            }

            public int hashCode() {
                return (((((((((this.enteredAssetAmount.hashCode() * 31) + this.currencyPair.hashCode()) * 31) + this.side.hashCode()) * 31) + this.maxSize.hashCode()) * 31) + this.price.hashCode()) * 31) + this.eventLogger.hashCode();
            }

            public String toString() {
                return "TaxLots(enteredAssetAmount=" + this.enteredAssetAmount + ", currencyPair=" + this.currencyPair + ", side=" + this.side + ", maxSize=" + this.maxSize + ", price=" + this.price + ", eventLogger=" + this.eventLogger + ")";
            }

            public final BigDecimal getEnteredAssetAmount() {
                return this.enteredAssetAmount;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public BigDecimal getMaxSize() {
                return this.maxSize;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public BigDecimal getPrice() {
                return this.price;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure
            public EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLots(BigDecimal enteredAssetAmount, UiCurrencyPair currencyPair, OrderSide side, BigDecimal maxSize, BigDecimal price, EventLogger eventLogger) {
                super(currencyPair, side, maxSize, price, eventLogger, null);
                Intrinsics.checkNotNullParameter(enteredAssetAmount, "enteredAssetAmount");
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(maxSize, "maxSize");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.enteredAssetAmount = enteredAssetAmount;
                this.currencyPair = currencyPair;
                this.side = side;
                this.maxSize = maxSize;
                this.price = price;
                this.eventLogger = eventLogger;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i = C40095R.string.crypto_order_check_too_large_asset_message;
                String displayName = getCurrencyPair().getDisplayName();
                String currency$default = CurrencyDefinitions.formatCurrency$default(getCurrencyPair().getAssetCurrency(), getMaxSize(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
                StringResource sideLabel = CryptoOrderFormatter2.getSideLabel(getSide());
                Resources resources = activity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String lowerCase = sideLabel.getText(resources).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string2 = activity.getString(i, displayName, currency$default, lowerCase, CurrencyDefinitions.formatCurrency$default(getCurrencyPair().getAssetCurrency(), this.enteredAssetAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return activity.getString(C40095R.string.crypto_tax_lot_selection_validation_failure_edit_order_cta);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMaxOrderSizeCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Validator.Action.Abort.INSTANCE;
            }
        }
    }
}
