package com.robinhood.shared.crypto.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TokenizedStocksCalculations.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a&\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a&\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u001e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\"\u001b\u0010\u0005\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"calculateExchangeFee", "Ljava/math/BigDecimal;", "quantity", "quotePrice", "exchangeFeePercentage", "HUNDRED", "getHUNDRED", "()Ljava/math/BigDecimal;", "HUNDRED$delegate", "Lkotlin/Lazy;", "calculateTotalEstimatedCostOrCreditWithFeePercentage", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "calculateTotalEstimatedCostOrCredit", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "fee", "totalPriceForAllQuantity", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.TokenizedStocksCalculationsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TokenizedStocksCalculations {
    private static final Lazy HUNDRED$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.utils.TokenizedStocksCalculationsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TokenizedStocksCalculations.HUNDRED_delegate$lambda$1();
        }
    });

    /* compiled from: TokenizedStocksCalculations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.TokenizedStocksCalculationsKt$WhenMappings */
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

    public static final BigDecimal calculateExchangeFee(BigDecimal quantity, BigDecimal quotePrice, BigDecimal exchangeFeePercentage) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(quotePrice, "quotePrice");
        Intrinsics.checkNotNullParameter(exchangeFeePercentage, "exchangeFeePercentage");
        BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(BigDecimals7.safeMultiply(BigDecimals7.safeMultiply(quantity, quotePrice), exchangeFeePercentage), getHUNDRED());
        return (BigDecimals7.isPositive(quantity) && BigDecimals7.isPositive(quotePrice)) ? (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSafeDivide, new BigDecimal("0.01")) : bigDecimalSafeDivide;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal HUNDRED_delegate$lambda$1() {
        return new BigDecimal("100");
    }

    private static final BigDecimal getHUNDRED() {
        return (BigDecimal) HUNDRED$delegate.getValue();
    }

    public static final BigDecimal calculateTotalEstimatedCostOrCreditWithFeePercentage(OrderSide orderSide, BigDecimal quantity, BigDecimal quotePrice, BigDecimal exchangeFeePercentage) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(quotePrice, "quotePrice");
        Intrinsics.checkNotNullParameter(exchangeFeePercentage, "exchangeFeePercentage");
        return calculateTotalEstimatedCostOrCredit(orderSide, quantity, quotePrice, calculateExchangeFee(quantity, quotePrice, exchangeFeePercentage));
    }

    public static final BigDecimal calculateTotalEstimatedCostOrCredit(OrderSide orderSide, BigDecimal quantity, BigDecimal price, BigDecimal fee) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(fee, "fee");
        return calculateTotalEstimatedCostOrCredit(orderSide, BigDecimals7.safeMultiply(quantity, price), fee);
    }

    public static final BigDecimal calculateTotalEstimatedCostOrCredit(OrderSide orderSide, BigDecimal totalPriceForAllQuantity, BigDecimal fee) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(totalPriceForAllQuantity, "totalPriceForAllQuantity");
        Intrinsics.checkNotNullParameter(fee, "fee");
        int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i == 1) {
            BigDecimal bigDecimalAdd = totalPriceForAllQuantity.add(fee);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            return bigDecimalAdd;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal bigDecimalSubtract = totalPriceForAllQuantity.subtract(fee);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }
}
