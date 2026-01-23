package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTrailingPeg;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0001\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/TrailingStop;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "getTrailingPeg", "()Lcom/robinhood/models/db/OrderTrailingPeg;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.TrailingStop, reason: use source file name */
/* loaded from: classes9.dex */
public interface DirectOrder9 extends DirectOrder {
    OrderMarketHours getMarketHours();

    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
    Order.Configuration getOrderConfiguration();

    OrderTrailingPeg getTrailingPeg();

    /* compiled from: DirectOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.TrailingStop$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DirectOrder9 directOrder9) {
            return DirectOrder.DefaultImpls.getOrderAmountType(directOrder9);
        }

        public static boolean getTaxLots(DirectOrder9 directOrder9) {
            return DirectOrder.DefaultImpls.getTaxLots(directOrder9);
        }

        public static boolean isBuySellDollarOrder(DirectOrder9 directOrder9) {
            return DirectOrder.DefaultImpls.isBuySellDollarOrder(directOrder9);
        }

        public static boolean isBuySellOrder(DirectOrder9 directOrder9) {
            return DirectOrder.DefaultImpls.isBuySellOrder(directOrder9);
        }

        public static boolean isBuySellSharesOrder(DirectOrder9 directOrder9) {
            return DirectOrder.DefaultImpls.isBuySellSharesOrder(directOrder9);
        }

        public static boolean isDefaultOrderType(DirectOrder9 directOrder9) {
            return DirectOrder.DefaultImpls.isDefaultOrderType(directOrder9);
        }

        public static Order.Configuration getOrderConfiguration(DirectOrder9 directOrder9) {
            return Order.Configuration.TRAILING_STOP;
        }
    }
}
