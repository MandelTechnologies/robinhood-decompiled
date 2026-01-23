package com.robinhood.android.equities.equitytrade;

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

/* compiled from: EquityOrderIntent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"extendWithDraft", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/models/db/Order;", "newPrice", "Ljava/math/BigDecimal;", "lib-equity-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.equitytrade.EquityOrderIntentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderIntent2 {
    public static final ShareBasedOrderConfiguration extendWithDraft(Order order, BigDecimal bigDecimal) {
        BigDecimal price;
        Intrinsics.checkNotNullParameter(order, "<this>");
        Order.Configuration configuration = order.getConfiguration();
        Order.Configuration configuration2 = Order.Configuration.LIMIT;
        if (configuration == configuration2 && bigDecimal != null) {
            String accountNumber = order.getAccountNumber();
            BigDecimal quantity = order.getQuantity();
            if (quantity == null) {
                return null;
            }
            OrderTimeInForce timeInForce = order.getTimeInForce();
            OrderMarketHours marketHours = order.getMarketHours();
            if (marketHours == null) {
                if (order.getExtendedHours()) {
                    marketHours = OrderMarketHours.EXTENDED_HOURS;
                } else {
                    marketHours = OrderMarketHours.REGULAR_HOURS;
                }
            }
            return new AdvancedOrder.LimitDraft(accountNumber, quantity, bigDecimal, timeInForce, marketHours, false, true).completedDraft();
        }
        if (order.getConfiguration() == configuration2) {
            String accountNumber2 = order.getAccountNumber();
            BigDecimal quantity2 = order.getQuantity();
            if (quantity2 == null) {
                return null;
            }
            OrderTimeInForce timeInForce2 = order.getTimeInForce();
            BigDecimal price2 = order.getPrice();
            if (price2 == null) {
                return null;
            }
            OrderMarketHours marketHours2 = order.getMarketHours();
            if (marketHours2 == null) {
                if (order.getExtendedHours()) {
                    marketHours2 = OrderMarketHours.EXTENDED_HOURS;
                } else {
                    marketHours2 = OrderMarketHours.REGULAR_HOURS;
                }
            }
            return new AdvancedOrder.LimitDraft(accountNumber2, quantity2, price2, timeInForce2, marketHours2, false, false);
        }
        Order.Configuration configuration3 = order.getConfiguration();
        Order.Configuration configuration4 = Order.Configuration.STOP_LIMIT;
        if (configuration3 == configuration4 && bigDecimal != null) {
            String accountNumber3 = order.getAccountNumber();
            BigDecimal quantity3 = order.getQuantity();
            if (quantity3 == null) {
                return null;
            }
            OrderTimeInForce timeInForce3 = order.getTimeInForce();
            BigDecimal price3 = order.getPrice();
            if (price3 == null) {
                return null;
            }
            OrderMarketHours marketHours3 = order.getMarketHours();
            if (marketHours3 == null) {
                if (order.getExtendedHours()) {
                    marketHours3 = OrderMarketHours.EXTENDED_HOURS;
                } else {
                    marketHours3 = OrderMarketHours.REGULAR_HOURS;
                }
            }
            return new ShareStopLimit.Draft(accountNumber3, price3, quantity3, bigDecimal, timeInForce3, marketHours3, true);
        }
        if (order.getConfiguration() == configuration4) {
            String accountNumber4 = order.getAccountNumber();
            BigDecimal quantity4 = order.getQuantity();
            OrderTimeInForce timeInForce4 = order.getTimeInForce();
            BigDecimal stopPrice = order.getStopPrice();
            if (stopPrice == null || (price = order.getPrice()) == null) {
                return null;
            }
            return new ShareStopLimit.New(accountNumber4, price, quantity4, stopPrice, timeInForce4, null, 32, null);
        }
        Order.Configuration configuration5 = order.getConfiguration();
        Order.Configuration configuration6 = Order.Configuration.STOP_LOSS;
        if (configuration5 == configuration6 && bigDecimal != null) {
            String accountNumber5 = order.getAccountNumber();
            BigDecimal quantity5 = order.getQuantity();
            if (quantity5 == null) {
                return null;
            }
            OrderTimeInForce timeInForce5 = order.getTimeInForce();
            OrderMarketHours marketHours4 = order.getMarketHours();
            if (marketHours4 == null) {
                if (order.getExtendedHours()) {
                    marketHours4 = OrderMarketHours.EXTENDED_HOURS;
                } else {
                    marketHours4 = OrderMarketHours.REGULAR_HOURS;
                }
            }
            return new ShareStopLoss.Draft(accountNumber5, quantity5, bigDecimal, timeInForce5, marketHours4, true);
        }
        if (order.getConfiguration() != configuration6) {
            return null;
        }
        String accountNumber6 = order.getAccountNumber();
        BigDecimal quantity6 = order.getQuantity();
        OrderTimeInForce timeInForce6 = order.getTimeInForce();
        BigDecimal stopPrice2 = order.getStopPrice();
        if (stopPrice2 == null) {
            return null;
        }
        return new ShareStopLoss.New(accountNumber6, quantity6, stopPrice2, timeInForce6, null, 16, null);
    }
}
