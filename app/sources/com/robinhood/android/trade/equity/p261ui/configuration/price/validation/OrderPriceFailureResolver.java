package com.robinhood.android.trade.equity.p261ui.configuration.price.validation;

import com.robinhood.android.lib.trade.validation.BaseOrderPriceContext2;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: OrderPriceFailureResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceFailureResolver;", "overridePrice", "", "newPrice", "Ljava/math/BigDecimal;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface OrderPriceFailureResolver extends BaseOrderPriceContext2 {
    void overridePrice(BigDecimal newPrice);
}
