package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/Market;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketComplete;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketDraft;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketNew;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.Market, reason: use source file name */
/* loaded from: classes9.dex */
public interface DirectOrder4 extends DirectOrder {
    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
    Order.Configuration getOrderConfiguration();

    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
    OrderTimeInForce getTimeInForce();

    /* compiled from: DirectOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.Market$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DirectOrder4 directOrder4) {
            return DirectOrder.DefaultImpls.getOrderAmountType(directOrder4);
        }

        public static boolean getTaxLots(DirectOrder4 directOrder4) {
            return DirectOrder.DefaultImpls.getTaxLots(directOrder4);
        }

        public static boolean isBuySellDollarOrder(DirectOrder4 directOrder4) {
            return DirectOrder.DefaultImpls.isBuySellDollarOrder(directOrder4);
        }

        public static boolean isBuySellOrder(DirectOrder4 directOrder4) {
            return DirectOrder.DefaultImpls.isBuySellOrder(directOrder4);
        }

        public static boolean isBuySellSharesOrder(DirectOrder4 directOrder4) {
            return DirectOrder.DefaultImpls.isBuySellSharesOrder(directOrder4);
        }

        public static boolean isDefaultOrderType(DirectOrder4 directOrder4) {
            return DirectOrder.DefaultImpls.isDefaultOrderType(directOrder4);
        }

        public static Order.Configuration getOrderConfiguration(DirectOrder4 directOrder4) {
            return Order.Configuration.MARKET;
        }

        public static OrderTimeInForce getTimeInForce(DirectOrder4 directOrder4) {
            return OrderTimeInForce.GFD;
        }
    }
}
