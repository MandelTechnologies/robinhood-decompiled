package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/StopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lcom/robinhood/android/trading/contracts/configuration/LimitPriceHolder;", "Lcom/robinhood/android/trading/contracts/configuration/StopPriceHolder;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.StopLimit, reason: use source file name */
/* loaded from: classes9.dex */
public interface DirectOrder7 extends DirectOrder, DirectOrder3, DirectOrder8 {
    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
    Order.Configuration getOrderConfiguration();

    /* compiled from: DirectOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.StopLimit$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DirectOrder7 directOrder7) {
            return DirectOrder.DefaultImpls.getOrderAmountType(directOrder7);
        }

        public static boolean getTaxLots(DirectOrder7 directOrder7) {
            return DirectOrder.DefaultImpls.getTaxLots(directOrder7);
        }

        public static boolean isBuySellDollarOrder(DirectOrder7 directOrder7) {
            return DirectOrder.DefaultImpls.isBuySellDollarOrder(directOrder7);
        }

        public static boolean isBuySellOrder(DirectOrder7 directOrder7) {
            return DirectOrder.DefaultImpls.isBuySellOrder(directOrder7);
        }

        public static boolean isBuySellSharesOrder(DirectOrder7 directOrder7) {
            return DirectOrder.DefaultImpls.isBuySellSharesOrder(directOrder7);
        }

        public static boolean isDefaultOrderType(DirectOrder7 directOrder7) {
            return DirectOrder.DefaultImpls.isDefaultOrderType(directOrder7);
        }

        public static Order.Configuration getOrderConfiguration(DirectOrder7 directOrder7) {
            return Order.Configuration.STOP_LIMIT;
        }
    }
}
