package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/Limit;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lcom/robinhood/android/trading/contracts/configuration/LimitPriceHolder;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitComplete;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitDraft;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$LimitNew;", "Lcom/robinhood/android/trading/contracts/configuration/ShareLimit;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.Limit, reason: use source file name */
/* loaded from: classes9.dex */
public interface DirectOrder2 extends DirectOrder, DirectOrder3 {
    Order.Configuration getOrderConfiguration();

    /* compiled from: DirectOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.Limit$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DirectOrder2 directOrder2) {
            return DirectOrder.DefaultImpls.getOrderAmountType(directOrder2);
        }

        public static boolean getTaxLots(DirectOrder2 directOrder2) {
            return DirectOrder.DefaultImpls.getTaxLots(directOrder2);
        }

        public static boolean isBuySellDollarOrder(DirectOrder2 directOrder2) {
            return DirectOrder.DefaultImpls.isBuySellDollarOrder(directOrder2);
        }

        public static boolean isBuySellOrder(DirectOrder2 directOrder2) {
            return DirectOrder.DefaultImpls.isBuySellOrder(directOrder2);
        }

        public static boolean isBuySellSharesOrder(DirectOrder2 directOrder2) {
            return DirectOrder.DefaultImpls.isBuySellSharesOrder(directOrder2);
        }

        public static boolean isDefaultOrderType(DirectOrder2 directOrder2) {
            return DirectOrder.DefaultImpls.isDefaultOrderType(directOrder2);
        }

        public static Order.Configuration getOrderConfiguration(DirectOrder2 directOrder2) {
            return Order.Configuration.LIMIT;
        }
    }
}
