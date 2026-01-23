package com.robinhood.android.trade.equity.util;

import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareStopLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: Orders.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"extend", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/models/db/Order;", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.OrdersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Orders {

    /* compiled from: Orders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.util.OrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ShareBasedOrderConfiguration extend(Order order) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[order.getConfiguration().ordinal()];
        if (i == 1) {
            Timber.INSTANCE.mo3356i("Setting limit price from orderToExtend", new Object[0]);
            String accountNumber = order.getAccountNumber();
            BigDecimal quantity = order.getQuantity();
            Intrinsics.checkNotNull(quantity);
            OrderTimeInForce timeInForce = order.getTimeInForce();
            BigDecimal price = order.getPrice();
            Intrinsics.checkNotNull(price);
            OrderMarketHours marketHours = order.getMarketHours();
            if (marketHours == null) {
                if (order.getExtendedHours()) {
                    marketHours = OrderMarketHours.EXTENDED_HOURS;
                } else {
                    marketHours = OrderMarketHours.REGULAR_HOURS;
                }
            }
            return new AdvancedOrder.LimitDraft(accountNumber, quantity, price, timeInForce, marketHours, false, false);
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            String accountNumber2 = order.getAccountNumber();
            BigDecimal quantity2 = order.getQuantity();
            OrderTimeInForce timeInForce2 = order.getTimeInForce();
            BigDecimal stopPrice = order.getStopPrice();
            Intrinsics.checkNotNull(stopPrice);
            return new ShareStopLoss.New(accountNumber2, quantity2, stopPrice, timeInForce2, null, 16, null);
        }
        String accountNumber3 = order.getAccountNumber();
        BigDecimal quantity3 = order.getQuantity();
        OrderTimeInForce timeInForce3 = order.getTimeInForce();
        BigDecimal stopPrice2 = order.getStopPrice();
        Intrinsics.checkNotNull(stopPrice2);
        BigDecimal price2 = order.getPrice();
        Intrinsics.checkNotNull(price2);
        return new ShareStopLimit.New(accountNumber3, price2, quantity3, stopPrice2, timeInForce3, null, 32, null);
    }
}
