package com.robinhood.shared.order.type.timeInForce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import com.robinhood.shared.order.type.priceInput.EditableOrderPrice;
import com.robinhood.shared.order.type.timeInForce.TimeInForceOrderPrice;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeInForceOrderPrice.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"toTimeInForceOrderPrice", "Lcom/robinhood/shared/order/type/timeInForce/TimeInForceOrderPrice;", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "toOrderPrices", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "timeInForceOverride", "Lcom/robinhood/models/db/OrderTimeInForce;", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.timeInForce.TimeInForceOrderPriceKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TimeInForceOrderPrice2 {
    public static final TimeInForceOrderPrice toTimeInForceOrderPrice(EditableOrderPrice editableOrderPrice) {
        Intrinsics.checkNotNullParameter(editableOrderPrice, "<this>");
        if (!(editableOrderPrice instanceof EditableOrderPrice.Limit)) {
            throw new NoWhenBranchMatchedException();
        }
        EditableOrderPrice.Limit limit = (EditableOrderPrice.Limit) editableOrderPrice;
        return new TimeInForceOrderPrice.Limit(limit.getPrice(), limit.getTimeInForce());
    }

    public static final CryptoOrderTypeFragmentKey5 toOrderPrices(TimeInForceOrderPrice timeInForceOrderPrice, OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(timeInForceOrderPrice, "<this>");
        if (!(timeInForceOrderPrice instanceof TimeInForceOrderPrice.Limit)) {
            throw new NoWhenBranchMatchedException();
        }
        TimeInForceOrderPrice.Limit limit = (TimeInForceOrderPrice.Limit) timeInForceOrderPrice;
        BigDecimal price = limit.getPrice();
        if (orderTimeInForce == null) {
            orderTimeInForce = limit.getTimeInForce();
        }
        return new CryptoOrderTypeFragmentKey5.Limit(price, orderTimeInForce);
    }
}
