package com.robinhood.shared.trade.crypto.fee;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MonetizationFeeCalculator.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\"\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/fee/MonetizationFeeCalculator;", "", "<init>", "()V", "getFeeAmount", "Ljava/math/BigDecimal;", "quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "feeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getTotalCost", "cost", "feeAmount", "requestContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "getTotalCostInQuoteMode", "getTotalCostInAssetMode", "applyFeeToQuantity", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "shouldApplyFee", "", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MonetizationFeeCalculator {
    public static final int $stable = 0;
    public static final MonetizationFeeCalculator INSTANCE = new MonetizationFeeCalculator();

    /* compiled from: MonetizationFeeCalculator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MonetizationModel.values().length];
            try {
                iArr3[MonetizationModel.REBATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[MonetizationModel.FEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private MonetizationFeeCalculator() {
    }

    public final BigDecimal getFeeAmount(BigDecimal quantity, BigDecimal price, UiFeeEstimation feeEstimation, OrderSide orderSide, CryptoInputMode inputMode) {
        BigDecimal bigDecimalSafeMultiply;
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(feeEstimation, "feeEstimation");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        if (BigDecimals7.isZero(quantity) || BigDecimals7.isZero(price)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        if (orderSide == OrderSide.BUY && inputMode == CryptoInputMode.QUOTE_CURRENCY) {
            bigDecimalSafeMultiply = quantity.subtract(BigDecimals7.safeDivide(quantity, BigDecimals7.safeAdd(BigDecimal.ONE, feeEstimation.getFeeRatio())));
            Intrinsics.checkNotNullExpressionValue(bigDecimalSafeMultiply, "subtract(...)");
        } else {
            bigDecimalSafeMultiply = BigDecimals7.safeMultiply(quantity, feeEstimation.getFeeRatio());
        }
        BigDecimal bigDecimalSafeMultiply2 = BigDecimals7.safeMultiply(bigDecimalSafeMultiply, price);
        return BigDecimals7.isZero(feeEstimation.getFeeRatio()) ? bigDecimalSafeMultiply2 : (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSafeMultiply2, feeEstimation.getMinFeeAmount());
    }

    public final BigDecimal getTotalCost(BigDecimal cost, BigDecimal feeAmount, CryptoOrderContext.RequestContext requestContext) {
        Intrinsics.checkNotNullParameter(cost, "cost");
        Intrinsics.checkNotNullParameter(requestContext, "requestContext");
        if (BigDecimals7.isZero(cost)) {
            return cost;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[requestContext.getRequestInputs().getInputMode().ordinal()];
        if (i == 1) {
            return getTotalCostInQuoteMode(cost, feeAmount, requestContext);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getTotalCostInAssetMode(cost, feeAmount, requestContext);
    }

    private final BigDecimal getTotalCostInQuoteMode(BigDecimal cost, BigDecimal feeAmount, CryptoOrderContext.RequestContext requestContext) {
        RequestInputs requestInputs = requestContext.getRequestInputs();
        int i = WhenMappings.$EnumSwitchMapping$2[requestInputs.getMonetizationModel().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$1[requestInputs.getSide().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalSubtract = cost.subtract(BigDecimals7.orZero(feeAmount));
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                Comparable comparableCoerceAtLeast = RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO);
                Intrinsics.checkNotNullExpressionValue(comparableCoerceAtLeast, "coerceAtLeast(...)");
                return (BigDecimal) comparableCoerceAtLeast;
            }
        }
        return cost;
    }

    private final BigDecimal getTotalCostInAssetMode(BigDecimal cost, BigDecimal feeAmount, CryptoOrderContext.RequestContext requestContext) {
        RequestInputs requestInputs = requestContext.getRequestInputs();
        int i = WhenMappings.$EnumSwitchMapping$2[requestInputs.getMonetizationModel().ordinal()];
        if (i == 1) {
            return cost;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[requestInputs.getSide().ordinal()];
        if (i2 == 1) {
            BigDecimal bigDecimalAdd = cost.add(BigDecimals7.orZero(feeAmount));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            return bigDecimalAdd;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal bigDecimalSubtract = cost.subtract(BigDecimals7.orZero(feeAmount));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Comparable comparableCoerceAtLeast = RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO);
        Intrinsics.checkNotNullExpressionValue(comparableCoerceAtLeast, "coerceAtLeast(...)");
        return (BigDecimal) comparableCoerceAtLeast;
    }

    public final BigDecimal applyFeeToQuantity(BigDecimal quantity, BigDecimal feeAmount, BigDecimal price, UiCurrencyPair currencyPair) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(feeAmount, "feeAmount");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        if (!BigDecimals7.isPositive(quantity)) {
            return quantity;
        }
        BigDecimal bigDecimalSubtract = quantity.subtract(BigDecimals7.safeDivide(BigDecimals7.coerceScaleAtLeast(feeAmount, currencyPair.getAssetCurrency().getDecimalScale()), price));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public final boolean shouldApplyFee(RequestInputs requestInputs) {
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        return requestInputs.getMonetizationModel() == MonetizationModel.FEE && requestInputs.getSide() == OrderSide.BUY && requestInputs.getInputMode() == CryptoInputMode.QUOTE_CURRENCY;
    }
}
