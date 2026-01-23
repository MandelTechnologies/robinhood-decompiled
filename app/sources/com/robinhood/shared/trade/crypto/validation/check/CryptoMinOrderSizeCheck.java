package com.robinhood.shared.trade.crypto.validation.check;

import android.os.Bundle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.fee.CryptoFeeOrderSizeCalculator;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMinOrderSizeCheck.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0002\u0011\u0012B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "isValidatingInTaxLotSelection", "", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/shared/app/type/AppType;Z)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure;", "input", "checkForFee", "FailureReason", "Failure", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoMinOrderSizeCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    public static final int $stable = 8;
    private final AppType appType;
    private final EventLogger eventLogger;
    private final boolean isValidatingInTaxLotSelection;

    public CryptoMinOrderSizeCheck(EventLogger eventLogger, AppType appType, boolean z) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.eventLogger = eventLogger;
        this.appType = appType;
        this.isValidatingInTaxLotSelection = z;
    }

    public /* synthetic */ CryptoMinOrderSizeCheck(EventLogger eventLogger, AppType appType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventLogger, appType, (i & 4) != 0 ? false : z);
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        FailureReason minOrderSize;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getRequestContext().getRequestInputs().getMonetizationModel() == MonetizationModel.FEE) {
            return checkForFee(input);
        }
        UiCurrencyPair currencyPair = input.getRequestContext().getCurrencyPair();
        RequestInputs requestInputs = input.getRequestContext().getRequestInputs();
        BigDecimal minOrderSize2 = currencyPair.getMinOrderSize();
        BigDecimal minOrderQuantityIncrement = currencyPair.getMinOrderQuantityIncrement();
        RoundingMode roundingMode = RoundingMode.UP;
        BigDecimal bigDecimalRoundToInterval = BigDecimals7.roundToInterval(minOrderSize2, minOrderQuantityIncrement, roundingMode);
        if (BigDecimals7.gte(input.getRequest().getOrderQuantity(), bigDecimalRoundToInterval)) {
            return null;
        }
        BigDecimal minOrderQuoteAmount = currencyPair.getMinOrderQuoteAmount();
        boolean z = requestInputs.getSide() == OrderSide.SELL && requestInputs.getOrderPrices().getOrderType() == CryptoOrderType.MARKET;
        if (this.appType == AppType.TRADER && z && minOrderQuoteAmount != null) {
            if (BigDecimals7.gte(input.getRequest().getOrderQuantity().multiply(input.getRequest().getCollaredPrice()), currencyPair.getMinOrderQuoteAmount())) {
                return null;
            }
            BigDecimal bigDecimalRoundToInterval2 = BigDecimals7.roundToInterval(BigDecimals7.safeDivide(minOrderQuoteAmount, BigDecimals7.coerceScaleAtLeast(input.getOrderInfo().getCollaredPrice(), currencyPair.getAssetCurrency().getDecimalScale()), roundingMode), currencyPair.getMinOrderQuantityIncrement(), roundingMode);
            UiCryptoHolding holding = input.getRequestContext().getHolding();
            BigDecimal bigDecimalOrZero = BigDecimals7.orZero(holding != null ? holding.getQuantityAvailable() : null);
            BigDecimal bigDecimal = (BigDecimal) ComparisonsKt.minOf(bigDecimalRoundToInterval2, bigDecimalRoundToInterval);
            BigDecimal bigDecimalAdd = minOrderQuoteAmount.add(currencyPair.getQuoteCurrency().getIncrement());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            minOrderSize = new FailureReason.MinSellQuoteOrderSize(bigDecimalAdd, bigDecimal, BigDecimals7.m2979lt(bigDecimalOrZero, bigDecimalRoundToInterval));
        } else {
            BigDecimal bigDecimalMultiply = bigDecimalRoundToInterval.multiply(input.getOrderInfo().getUncollaredPrice());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            minOrderSize = new FailureReason.MinOrderSize(bigDecimalMultiply, bigDecimalRoundToInterval);
        }
        if (requestInputs instanceof RequestInputs.AsQuote) {
            return new Failure.AsQuote(currencyPair, ((RequestInputs.AsQuote) requestInputs).getSide(), minOrderSize, this.eventLogger, false, 16, null);
        }
        if (!(requestInputs instanceof RequestInputs.AsAsset)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.isValidatingInTaxLotSelection) {
            return new Failure.TaxLots(currencyPair, ((RequestInputs.AsAsset) requestInputs).getSide(), minOrderSize, this.eventLogger, false, 16, null);
        }
        return new Failure.AsAsset(currencyPair, ((RequestInputs.AsAsset) requestInputs).getSide(), minOrderSize, this.eventLogger, false, 16, null);
    }

    private final Failure checkForFee(CryptoOrderContext input) {
        UiCurrencyPair currencyPair = input.getRequestContext().getCurrencyPair();
        BigDecimal minFeeOrderQuoteAmount = currencyPair.getMinFeeOrderQuoteAmount();
        if (minFeeOrderQuoteAmount == null) {
            return null;
        }
        RequestInputs requestInputs = input.getRequestContext().getRequestInputs();
        BigDecimal priceByOrderType = input.getRequestContext().getPriceByOrderType();
        FailureReason.MinOrderSize minOrderSize = new FailureReason.MinOrderSize(minFeeOrderQuoteAmount, CryptoFeeOrderSizeCalculator.INSTANCE.getMinAssetOrderSize(currencyPair, priceByOrderType));
        if (requestInputs instanceof RequestInputs.AsQuote) {
            RequestInputs.AsQuote asQuote = (RequestInputs.AsQuote) requestInputs;
            if (BigDecimals7.gte(asQuote.getPurchaseCost(), minFeeOrderQuoteAmount)) {
                return null;
            }
            return new Failure.AsQuote(currencyPair, asQuote.getSide(), minOrderSize, this.eventLogger, this.appType == AppType.TRADER);
        }
        if (!(requestInputs instanceof RequestInputs.AsAsset)) {
            throw new NoWhenBranchMatchedException();
        }
        RequestInputs.AsAsset asAsset = (RequestInputs.AsAsset) requestInputs;
        if (BigDecimals7.gte(BigDecimals7.safeMultiply(asAsset.getPurchaseSize(), priceByOrderType), minFeeOrderQuoteAmount)) {
            return null;
        }
        if (this.isValidatingInTaxLotSelection) {
            return new Failure.TaxLots(currencyPair, asAsset.getSide(), minOrderSize, this.eventLogger, this.appType == AppType.TRADER);
        }
        return new Failure.AsAsset(currencyPair, asAsset.getSide(), minOrderSize, this.eventLogger, this.appType == AppType.TRADER);
    }

    /* compiled from: CryptoMinOrderSizeCheck.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "", "<init>", "()V", "minOrderSize", "Ljava/math/BigDecimal;", "getMinOrderSize", "()Ljava/math/BigDecimal;", "minQuoteOrderSize", "getMinQuoteOrderSize", "MinOrderSize", "MinSellQuoteOrderSize", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason$MinOrderSize;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason$MinSellQuoteOrderSize;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class FailureReason {
        public static final int $stable = 0;

        public /* synthetic */ FailureReason(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract BigDecimal getMinOrderSize();

        public abstract BigDecimal getMinQuoteOrderSize();

        private FailureReason() {
        }

        /* compiled from: CryptoMinOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason$MinOrderSize;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "minQuoteOrderSize", "Ljava/math/BigDecimal;", "minOrderSize", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMinQuoteOrderSize", "()Ljava/math/BigDecimal;", "getMinOrderSize", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MinOrderSize extends FailureReason {
            public static final int $stable = 8;
            private final BigDecimal minOrderSize;
            private final BigDecimal minQuoteOrderSize;

            public static /* synthetic */ MinOrderSize copy$default(MinOrderSize minOrderSize, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = minOrderSize.minQuoteOrderSize;
                }
                if ((i & 2) != 0) {
                    bigDecimal2 = minOrderSize.minOrderSize;
                }
                return minOrderSize.copy(bigDecimal, bigDecimal2);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getMinQuoteOrderSize() {
                return this.minQuoteOrderSize;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getMinOrderSize() {
                return this.minOrderSize;
            }

            public final MinOrderSize copy(BigDecimal minQuoteOrderSize, BigDecimal minOrderSize) {
                Intrinsics.checkNotNullParameter(minQuoteOrderSize, "minQuoteOrderSize");
                Intrinsics.checkNotNullParameter(minOrderSize, "minOrderSize");
                return new MinOrderSize(minQuoteOrderSize, minOrderSize);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MinOrderSize)) {
                    return false;
                }
                MinOrderSize minOrderSize = (MinOrderSize) other;
                return Intrinsics.areEqual(this.minQuoteOrderSize, minOrderSize.minQuoteOrderSize) && Intrinsics.areEqual(this.minOrderSize, minOrderSize.minOrderSize);
            }

            public int hashCode() {
                return (this.minQuoteOrderSize.hashCode() * 31) + this.minOrderSize.hashCode();
            }

            public String toString() {
                return "MinOrderSize(minQuoteOrderSize=" + this.minQuoteOrderSize + ", minOrderSize=" + this.minOrderSize + ")";
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.FailureReason
            public BigDecimal getMinQuoteOrderSize() {
                return this.minQuoteOrderSize;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.FailureReason
            public BigDecimal getMinOrderSize() {
                return this.minOrderSize;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MinOrderSize(BigDecimal minQuoteOrderSize, BigDecimal minOrderSize) {
                super(null);
                Intrinsics.checkNotNullParameter(minQuoteOrderSize, "minQuoteOrderSize");
                Intrinsics.checkNotNullParameter(minOrderSize, "minOrderSize");
                this.minQuoteOrderSize = minQuoteOrderSize;
                this.minOrderSize = minOrderSize;
            }
        }

        /* compiled from: CryptoMinOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason$MinSellQuoteOrderSize;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "minQuoteOrderSize", "Ljava/math/BigDecimal;", "minOrderSize", "isDustHolder", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)V", "getMinQuoteOrderSize", "()Ljava/math/BigDecimal;", "getMinOrderSize", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MinSellQuoteOrderSize extends FailureReason {
            public static final int $stable = 8;
            private final boolean isDustHolder;
            private final BigDecimal minOrderSize;
            private final BigDecimal minQuoteOrderSize;

            public static /* synthetic */ MinSellQuoteOrderSize copy$default(MinSellQuoteOrderSize minSellQuoteOrderSize, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = minSellQuoteOrderSize.minQuoteOrderSize;
                }
                if ((i & 2) != 0) {
                    bigDecimal2 = minSellQuoteOrderSize.minOrderSize;
                }
                if ((i & 4) != 0) {
                    z = minSellQuoteOrderSize.isDustHolder;
                }
                return minSellQuoteOrderSize.copy(bigDecimal, bigDecimal2, z);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getMinQuoteOrderSize() {
                return this.minQuoteOrderSize;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getMinOrderSize() {
                return this.minOrderSize;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsDustHolder() {
                return this.isDustHolder;
            }

            public final MinSellQuoteOrderSize copy(BigDecimal minQuoteOrderSize, BigDecimal minOrderSize, boolean isDustHolder) {
                Intrinsics.checkNotNullParameter(minQuoteOrderSize, "minQuoteOrderSize");
                Intrinsics.checkNotNullParameter(minOrderSize, "minOrderSize");
                return new MinSellQuoteOrderSize(minQuoteOrderSize, minOrderSize, isDustHolder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MinSellQuoteOrderSize)) {
                    return false;
                }
                MinSellQuoteOrderSize minSellQuoteOrderSize = (MinSellQuoteOrderSize) other;
                return Intrinsics.areEqual(this.minQuoteOrderSize, minSellQuoteOrderSize.minQuoteOrderSize) && Intrinsics.areEqual(this.minOrderSize, minSellQuoteOrderSize.minOrderSize) && this.isDustHolder == minSellQuoteOrderSize.isDustHolder;
            }

            public int hashCode() {
                return (((this.minQuoteOrderSize.hashCode() * 31) + this.minOrderSize.hashCode()) * 31) + Boolean.hashCode(this.isDustHolder);
            }

            public String toString() {
                return "MinSellQuoteOrderSize(minQuoteOrderSize=" + this.minQuoteOrderSize + ", minOrderSize=" + this.minOrderSize + ", isDustHolder=" + this.isDustHolder + ")";
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.FailureReason
            public BigDecimal getMinQuoteOrderSize() {
                return this.minQuoteOrderSize;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.FailureReason
            public BigDecimal getMinOrderSize() {
                return this.minOrderSize;
            }

            public final boolean isDustHolder() {
                return this.isDustHolder;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MinSellQuoteOrderSize(BigDecimal minQuoteOrderSize, BigDecimal minOrderSize, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(minQuoteOrderSize, "minQuoteOrderSize");
                Intrinsics.checkNotNullParameter(minOrderSize, "minOrderSize");
                this.minQuoteOrderSize = minQuoteOrderSize;
                this.minOrderSize = minOrderSize;
                this.isDustHolder = z;
            }
        }
    }

    /* compiled from: CryptoMinOrderSizeCheck.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003&'(B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\f\u0010$\u001a\u00020%*\u00020!H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0003)*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "failureReason", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;Lcom/robinhood/analytics/EventLogger;)V", "getPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getFailureReason", "()Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getTitle", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "", "buyOrSellByMinAmountText", "getNegativeAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "setMinOrderSize", "", "AsQuote", "AsAsset", "TaxLots", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure$AsAsset;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure$AsQuote;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure$TaxLots;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final FailureReason failureReason;
        private final UiCurrencyPair pair;
        private final OrderSide side;

        /* compiled from: CryptoMinOrderSizeCheck.kt */
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

        public /* synthetic */ Failure(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiCurrencyPair, orderSide, failureReason, eventLogger);
        }

        public UiCurrencyPair getPair() {
            return this.pair;
        }

        public OrderSide getSide() {
            return this.side;
        }

        public FailureReason getFailureReason() {
            return this.failureReason;
        }

        private Failure(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger) {
            super(eventLogger);
            this.pair = uiCurrencyPair;
            this.side = orderSide;
            this.failureReason = failureReason;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public final String getCheckIdentifier() {
            FailureReason failureReason = getFailureReason();
            if (failureReason instanceof FailureReason.MinOrderSize) {
                return "crypto_min_order_size_check";
            }
            if (failureReason instanceof FailureReason.MinSellQuoteOrderSize) {
                return "crypto_min_order_quote_amount_check";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_min_size_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public CharSequence getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FailureReason failureReason = getFailureReason();
            if (failureReason instanceof FailureReason.MinOrderSize) {
                return buyOrSellByMinAmountText(activity);
            }
            if (!(failureReason instanceof FailureReason.MinSellQuoteOrderSize)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((FailureReason.MinSellQuoteOrderSize) failureReason).isDustHolder()) {
                return activity.getString(C40095R.string.crypto_quote_order_sell_all);
            }
            return buyOrSellByMinAmountText(activity);
        }

        private final String buyOrSellByMinAmountText(BaseActivity activity) {
            int i;
            String currency$default;
            int i2 = WhenMappings.$EnumSwitchMapping$0[getSide().ordinal()];
            if (i2 == 1) {
                i = C40095R.string.crypto_order_check_min_size_buy_action;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C40095R.string.crypto_order_check_min_size_sell_action;
            }
            if (this instanceof AsQuote) {
                AsQuote asQuote = (AsQuote) this;
                currency$default = CurrencyDefinitions.formatCurrency$default(asQuote.getPair().getQuoteCurrency(), asQuote.getFailureReason().getMinQuoteOrderSize(), false, false, RoundingMode.UP, 0, null, null, false, false, false, false, 2038, null);
            } else {
                if (!(this instanceof AsAsset)) {
                    if (this instanceof TaxLots) {
                        throw new IllegalStateException("Tax lots should override getPositiveAction");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AsAsset asAsset = (AsAsset) this;
                currency$default = CurrencyDefinitions.formatCurrency$default(asAsset.getPair().getAssetCurrency(), asAsset.getFailureReason().getMinOrderSize(), false, false, RoundingMode.UP, 0, null, null, false, false, false, false, 2038, null);
            }
            String string2 = activity.getString(i, currency$default);
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
            FailureReason failureReason = getFailureReason();
            if (failureReason instanceof FailureReason.MinOrderSize) {
                setMinOrderSize(resolver);
            } else {
                if (!(failureReason instanceof FailureReason.MinSellQuoteOrderSize)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((FailureReason.MinSellQuoteOrderSize) failureReason).isDustHolder()) {
                    resolver.convertToSellAll();
                } else {
                    setMinOrderSize(resolver);
                }
            }
            return Validator.Action.Abort.INSTANCE;
        }

        private final void setMinOrderSize(CryptoOrderValidator3 cryptoOrderValidator3) {
            BigDecimal minQuoteOrderSize = getFailureReason().getMinQuoteOrderSize();
            int decimalScale = getPair().getQuoteCurrency().getDecimalScale();
            RoundingMode roundingMode = RoundingMode.UP;
            BigDecimal scale = minQuoteOrderSize.setScale(decimalScale, roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            BigDecimal scale2 = getFailureReason().getMinOrderSize().setScale(getPair().getAssetCurrency().getDecimalScale(), roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            cryptoOrderValidator3.setOrderSize(scale, scale2);
        }

        /* compiled from: CryptoMinOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÂ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÂ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure$AsQuote;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "failureReason", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "isTraderFeeOrder", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;Lcom/robinhood/analytics/EventLogger;Z)V", "getPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getFailureReason", "()Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AsQuote extends Failure {
            public static final int $stable = 8;
            private final EventLogger eventLogger;
            private final FailureReason failureReason;
            private final boolean isTraderFeeOrder;
            private final UiCurrencyPair pair;
            private final OrderSide side;

            /* renamed from: component4, reason: from getter */
            private final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* renamed from: component5, reason: from getter */
            private final boolean getIsTraderFeeOrder() {
                return this.isTraderFeeOrder;
            }

            public static /* synthetic */ AsQuote copy$default(AsQuote asQuote, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = asQuote.pair;
                }
                if ((i & 2) != 0) {
                    orderSide = asQuote.side;
                }
                if ((i & 4) != 0) {
                    failureReason = asQuote.failureReason;
                }
                if ((i & 8) != 0) {
                    eventLogger = asQuote.eventLogger;
                }
                if ((i & 16) != 0) {
                    z = asQuote.isTraderFeeOrder;
                }
                boolean z2 = z;
                FailureReason failureReason2 = failureReason;
                return asQuote.copy(uiCurrencyPair, orderSide, failureReason2, eventLogger, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getPair() {
                return this.pair;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final FailureReason getFailureReason() {
                return this.failureReason;
            }

            public final AsQuote copy(UiCurrencyPair pair, OrderSide side, FailureReason failureReason, EventLogger eventLogger, boolean isTraderFeeOrder) {
                Intrinsics.checkNotNullParameter(pair, "pair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(failureReason, "failureReason");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new AsQuote(pair, side, failureReason, eventLogger, isTraderFeeOrder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AsQuote)) {
                    return false;
                }
                AsQuote asQuote = (AsQuote) other;
                return Intrinsics.areEqual(this.pair, asQuote.pair) && this.side == asQuote.side && Intrinsics.areEqual(this.failureReason, asQuote.failureReason) && Intrinsics.areEqual(this.eventLogger, asQuote.eventLogger) && this.isTraderFeeOrder == asQuote.isTraderFeeOrder;
            }

            public int hashCode() {
                return (((((((this.pair.hashCode() * 31) + this.side.hashCode()) * 31) + this.failureReason.hashCode()) * 31) + this.eventLogger.hashCode()) * 31) + Boolean.hashCode(this.isTraderFeeOrder);
            }

            public String toString() {
                return "AsQuote(pair=" + this.pair + ", side=" + this.side + ", failureReason=" + this.failureReason + ", eventLogger=" + this.eventLogger + ", isTraderFeeOrder=" + this.isTraderFeeOrder + ")";
            }

            public /* synthetic */ AsQuote(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiCurrencyPair, orderSide, failureReason, eventLogger, (i & 16) != 0 ? false : z);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public UiCurrencyPair getPair() {
                return this.pair;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public FailureReason getFailureReason() {
                return this.failureReason;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsQuote(UiCurrencyPair pair, OrderSide side, FailureReason failureReason, EventLogger eventLogger, boolean z) {
                super(pair, side, failureReason, eventLogger, null);
                Intrinsics.checkNotNullParameter(pair, "pair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(failureReason, "failureReason");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.pair = pair;
                this.side = side;
                this.failureReason = failureReason;
                this.eventLogger = eventLogger;
                this.isTraderFeeOrder = z;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getMessage(BaseActivity activity) {
                int i;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.isTraderFeeOrder) {
                    i = C40095R.string.crypto_order_check_min_size_fee_quote;
                } else {
                    i = C40095R.string.crypto_order_check_min_size;
                }
                String string2 = activity.getString(i, getPair().getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(getPair().getQuoteCurrency(), getFailureReason().getMinQuoteOrderSize(), false, false, RoundingMode.UP, 0, null, null, false, false, false, false, 2038, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CryptoMinOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÂ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÂ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure$AsAsset;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "failureReason", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "isTraderFeeOrder", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;Lcom/robinhood/analytics/EventLogger;Z)V", "getPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getFailureReason", "()Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AsAsset extends Failure {
            public static final int $stable = 8;
            private final EventLogger eventLogger;
            private final FailureReason failureReason;
            private final boolean isTraderFeeOrder;
            private final UiCurrencyPair pair;
            private final OrderSide side;

            /* renamed from: component4, reason: from getter */
            private final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* renamed from: component5, reason: from getter */
            private final boolean getIsTraderFeeOrder() {
                return this.isTraderFeeOrder;
            }

            public static /* synthetic */ AsAsset copy$default(AsAsset asAsset, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = asAsset.pair;
                }
                if ((i & 2) != 0) {
                    orderSide = asAsset.side;
                }
                if ((i & 4) != 0) {
                    failureReason = asAsset.failureReason;
                }
                if ((i & 8) != 0) {
                    eventLogger = asAsset.eventLogger;
                }
                if ((i & 16) != 0) {
                    z = asAsset.isTraderFeeOrder;
                }
                boolean z2 = z;
                FailureReason failureReason2 = failureReason;
                return asAsset.copy(uiCurrencyPair, orderSide, failureReason2, eventLogger, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getPair() {
                return this.pair;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final FailureReason getFailureReason() {
                return this.failureReason;
            }

            public final AsAsset copy(UiCurrencyPair pair, OrderSide side, FailureReason failureReason, EventLogger eventLogger, boolean isTraderFeeOrder) {
                Intrinsics.checkNotNullParameter(pair, "pair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(failureReason, "failureReason");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new AsAsset(pair, side, failureReason, eventLogger, isTraderFeeOrder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AsAsset)) {
                    return false;
                }
                AsAsset asAsset = (AsAsset) other;
                return Intrinsics.areEqual(this.pair, asAsset.pair) && this.side == asAsset.side && Intrinsics.areEqual(this.failureReason, asAsset.failureReason) && Intrinsics.areEqual(this.eventLogger, asAsset.eventLogger) && this.isTraderFeeOrder == asAsset.isTraderFeeOrder;
            }

            public int hashCode() {
                return (((((((this.pair.hashCode() * 31) + this.side.hashCode()) * 31) + this.failureReason.hashCode()) * 31) + this.eventLogger.hashCode()) * 31) + Boolean.hashCode(this.isTraderFeeOrder);
            }

            public String toString() {
                return "AsAsset(pair=" + this.pair + ", side=" + this.side + ", failureReason=" + this.failureReason + ", eventLogger=" + this.eventLogger + ", isTraderFeeOrder=" + this.isTraderFeeOrder + ")";
            }

            public /* synthetic */ AsAsset(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiCurrencyPair, orderSide, failureReason, eventLogger, (i & 16) != 0 ? false : z);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public UiCurrencyPair getPair() {
                return this.pair;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public FailureReason getFailureReason() {
                return this.failureReason;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsAsset(UiCurrencyPair pair, OrderSide side, FailureReason failureReason, EventLogger eventLogger, boolean z) {
                super(pair, side, failureReason, eventLogger, null);
                Intrinsics.checkNotNullParameter(pair, "pair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(failureReason, "failureReason");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.pair = pair;
                this.side = side;
                this.failureReason = failureReason;
                this.eventLogger = eventLogger;
                this.isTraderFeeOrder = z;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getMessage(BaseActivity activity) {
                int i;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.isTraderFeeOrder) {
                    i = C40095R.string.crypto_order_check_min_size_fee_asset;
                } else {
                    i = C40095R.string.crypto_order_check_min_size;
                }
                String string2 = activity.getString(i, getPair().getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(getPair().getAssetCurrency(), getFailureReason().getMinOrderSize(), false, false, RoundingMode.UP, 0, null, null, false, false, false, false, 2038, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CryptoMinOrderSizeCheck.kt */
        @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÂ\u0003J\t\u0010&\u001a\u00020\u000bHÂ\u0003J;\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure$TaxLots;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$Failure;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "failureReason", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "isTraderFeeOrder", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;Lcom/robinhood/analytics/EventLogger;Z)V", "getPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getFailureReason", "()Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMinOrderSizeCheck$FailureReason;", "getMessage", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getPositiveAction", "", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "getNegativeAction", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLots extends Failure {
            public static final int $stable = 8;
            private final EventLogger eventLogger;
            private final FailureReason failureReason;
            private final boolean isTraderFeeOrder;
            private final UiCurrencyPair pair;
            private final OrderSide side;

            /* renamed from: component4, reason: from getter */
            private final EventLogger getEventLogger() {
                return this.eventLogger;
            }

            /* renamed from: component5, reason: from getter */
            private final boolean getIsTraderFeeOrder() {
                return this.isTraderFeeOrder;
            }

            public static /* synthetic */ TaxLots copy$default(TaxLots taxLots, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = taxLots.pair;
                }
                if ((i & 2) != 0) {
                    orderSide = taxLots.side;
                }
                if ((i & 4) != 0) {
                    failureReason = taxLots.failureReason;
                }
                if ((i & 8) != 0) {
                    eventLogger = taxLots.eventLogger;
                }
                if ((i & 16) != 0) {
                    z = taxLots.isTraderFeeOrder;
                }
                boolean z2 = z;
                FailureReason failureReason2 = failureReason;
                return taxLots.copy(uiCurrencyPair, orderSide, failureReason2, eventLogger, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getPair() {
                return this.pair;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final FailureReason getFailureReason() {
                return this.failureReason;
            }

            public final TaxLots copy(UiCurrencyPair pair, OrderSide side, FailureReason failureReason, EventLogger eventLogger, boolean isTraderFeeOrder) {
                Intrinsics.checkNotNullParameter(pair, "pair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(failureReason, "failureReason");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                return new TaxLots(pair, side, failureReason, eventLogger, isTraderFeeOrder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxLots)) {
                    return false;
                }
                TaxLots taxLots = (TaxLots) other;
                return Intrinsics.areEqual(this.pair, taxLots.pair) && this.side == taxLots.side && Intrinsics.areEqual(this.failureReason, taxLots.failureReason) && Intrinsics.areEqual(this.eventLogger, taxLots.eventLogger) && this.isTraderFeeOrder == taxLots.isTraderFeeOrder;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getNegativeAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return null;
            }

            public int hashCode() {
                return (((((((this.pair.hashCode() * 31) + this.side.hashCode()) * 31) + this.failureReason.hashCode()) * 31) + this.eventLogger.hashCode()) * 31) + Boolean.hashCode(this.isTraderFeeOrder);
            }

            public String toString() {
                return "TaxLots(pair=" + this.pair + ", side=" + this.side + ", failureReason=" + this.failureReason + ", eventLogger=" + this.eventLogger + ", isTraderFeeOrder=" + this.isTraderFeeOrder + ")";
            }

            public /* synthetic */ TaxLots(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, FailureReason failureReason, EventLogger eventLogger, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiCurrencyPair, orderSide, failureReason, eventLogger, (i & 16) != 0 ? false : z);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public UiCurrencyPair getPair() {
                return this.pair;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure
            public FailureReason getFailureReason() {
                return this.failureReason;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLots(UiCurrencyPair pair, OrderSide side, FailureReason failureReason, EventLogger eventLogger, boolean z) {
                super(pair, side, failureReason, eventLogger, null);
                Intrinsics.checkNotNullParameter(pair, "pair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(failureReason, "failureReason");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.pair = pair;
                this.side = side;
                this.failureReason = failureReason;
                this.eventLogger = eventLogger;
                this.isTraderFeeOrder = z;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getMessage(BaseActivity activity) {
                int i;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.isTraderFeeOrder) {
                    i = C40095R.string.crypto_order_check_min_size_fee_asset;
                } else {
                    i = C40095R.string.crypto_order_check_min_size;
                }
                String string2 = activity.getString(i, getPair().getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(getPair().getAssetCurrency(), getFailureReason().getMinOrderSize(), false, false, RoundingMode.UP, 0, null, null, false, false, false, false, 2038, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public CharSequence getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return activity.getString(C40095R.string.crypto_tax_lot_selection_validation_failure_edit_order_cta);
            }

            @Override // com.robinhood.shared.trade.crypto.validation.check.CryptoMinOrderSizeCheck.Failure, com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Validator.Action.Abort.INSTANCE;
            }
        }
    }
}
