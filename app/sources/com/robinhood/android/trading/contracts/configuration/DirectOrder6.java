package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/Stop;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lcom/robinhood/android/trading/contracts/configuration/StopPriceHolder;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLoss;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.Stop, reason: use source file name */
/* loaded from: classes9.dex */
public interface DirectOrder6 extends DirectOrder, DirectOrder8 {
    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
    Order.Configuration getOrderConfiguration();

    /* compiled from: DirectOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.Stop$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DirectOrder6 directOrder6) {
            return DirectOrder.DefaultImpls.getOrderAmountType(directOrder6);
        }

        public static boolean getTaxLots(DirectOrder6 directOrder6) {
            return DirectOrder.DefaultImpls.getTaxLots(directOrder6);
        }

        public static boolean isBuySellDollarOrder(DirectOrder6 directOrder6) {
            return DirectOrder.DefaultImpls.isBuySellDollarOrder(directOrder6);
        }

        public static boolean isBuySellOrder(DirectOrder6 directOrder6) {
            return DirectOrder.DefaultImpls.isBuySellOrder(directOrder6);
        }

        public static boolean isBuySellSharesOrder(DirectOrder6 directOrder6) {
            return DirectOrder.DefaultImpls.isBuySellSharesOrder(directOrder6);
        }

        public static boolean isDefaultOrderType(DirectOrder6 directOrder6) {
            return DirectOrder.DefaultImpls.isDefaultOrderType(directOrder6);
        }

        public static Order.Configuration getOrderConfiguration(DirectOrder6 directOrder6) {
            return Order.Configuration.STOP_LOSS;
        }
    }
}
