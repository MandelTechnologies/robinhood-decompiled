package com.robinhood.android.trade.equity.p261ui.configuration.price.validation;

import android.os.Bundle;
import com.robinhood.android.lib.trade.validation.BaseOrderPriceContext3;
import com.robinhood.android.lib.trade.validation.Validator;
import kotlin.Metadata;

/* compiled from: OrderPriceValidator.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceValidator;", "Lcom/robinhood/android/lib/trade/validation/Validator;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "<init>", "()V", "getFailure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "passthroughArgs", "Landroid/os/Bundle;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderPriceValidator extends Validator<OrderPriceContext, OrderPriceFailureResolver> {
    public static final OrderPriceValidator INSTANCE = new OrderPriceValidator();
    public static final int $stable = Validator.$stable;

    private OrderPriceValidator() {
        super(MinTickSizeCheck.INSTANCE);
    }

    public final Validator.Failure<OrderPriceContext, OrderPriceFailureResolver> getFailure(Bundle passthroughArgs) {
        if (passthroughArgs != null) {
            return BaseOrderPriceContext3.INSTANCE.getFailure(passthroughArgs);
        }
        return null;
    }
}
