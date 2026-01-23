package com.robinhood.shared.trade.crypto.fee;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeOrderSizeCalculator.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/fee/CryptoFeeOrderSizeCalculator;", "", "<init>", "()V", "getMinAssetOrderSize", "Ljava/math/BigDecimal;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeOrderSizeCalculator {
    public static final int $stable = 0;
    public static final CryptoFeeOrderSizeCalculator INSTANCE = new CryptoFeeOrderSizeCalculator();

    private CryptoFeeOrderSizeCalculator() {
    }

    public final BigDecimal getMinAssetOrderSize(UiCurrencyPair uiCurrencyPair, BigDecimal price) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(price, "price");
        BigDecimal minFeeOrderQuoteAmount = uiCurrencyPair.getMinFeeOrderQuoteAmount();
        if (minFeeOrderQuoteAmount == null) {
            throw new IllegalStateException("Missing minFeeOrderQuoteAmount for fee order");
        }
        BigDecimal bigDecimalCoerceScaleAtLeast = BigDecimals7.coerceScaleAtLeast(minFeeOrderQuoteAmount, uiCurrencyPair.getAssetCurrencyForCost().getDecimalScale());
        RoundingMode roundingMode = RoundingMode.UP;
        return BigDecimals7.roundToInterval(BigDecimals7.safeDivide(bigDecimalCoerceScaleAtLeast, price, roundingMode), uiCurrencyPair.getMinOrderQuantityIncrement(), roundingMode);
    }
}
