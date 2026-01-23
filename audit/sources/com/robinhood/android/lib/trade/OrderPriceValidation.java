package com.robinhood.android.lib.trade;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPriceValidation.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ \u0010\r\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/OrderPriceValidation;", "", "<init>", "()V", "AGGRESSIVE_LIMIT_PRICE_THRESHOLD", "", "AGGRESSIVE_STOP_PRICE_THRESHOLD", "getAggressiveLimitPricePercent", "Ljava/math/BigDecimal;", "lastTradePrice", "isBuy", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "isStopPriceAggressive", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OrderPriceValidation {
    public static final int $stable = 0;
    private static final String AGGRESSIVE_LIMIT_PRICE_THRESHOLD = "0.3";
    private static final String AGGRESSIVE_STOP_PRICE_THRESHOLD = "0.05";
    public static final OrderPriceValidation INSTANCE = new OrderPriceValidation();

    private OrderPriceValidation() {
    }

    public final BigDecimal getAggressiveLimitPricePercent(BigDecimal lastTradePrice, boolean isBuy, BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        if (lastTradePrice == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = new BigDecimal(AGGRESSIVE_LIMIT_PRICE_THRESHOLD).multiply(lastTradePrice.max(BigDecimal.ONE));
        if (isBuy && BigDecimals7.m2978gt(price.subtract(lastTradePrice), bigDecimalMultiply)) {
            return BigDecimals7.safeDivide(price.subtract(lastTradePrice), lastTradePrice);
        }
        if (isBuy || !BigDecimals7.m2978gt(lastTradePrice.subtract(price), bigDecimalMultiply)) {
            return null;
        }
        return BigDecimals7.safeDivide(lastTradePrice.subtract(price), lastTradePrice);
    }

    public final boolean isStopPriceAggressive(BigDecimal lastTradePrice, boolean isBuy, BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        if (lastTradePrice == null) {
            return false;
        }
        BigDecimal bigDecimalMultiply = new BigDecimal(AGGRESSIVE_STOP_PRICE_THRESHOLD).multiply(lastTradePrice);
        if (isBuy && BigDecimals7.m2978gt(lastTradePrice.subtract(price), bigDecimalMultiply)) {
            return true;
        }
        return !isBuy && BigDecimals7.m2978gt(price.subtract(lastTradePrice), bigDecimalMultiply);
    }
}
