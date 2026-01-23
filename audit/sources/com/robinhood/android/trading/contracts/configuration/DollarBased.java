package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DollarBased4;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import kotlin.Metadata;

/* compiled from: DollarBased.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/DollarOrder;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.DollarBasedOrderConfiguration, reason: use source file name */
/* loaded from: classes9.dex */
public interface DollarBased extends DollarBased4, DirectOrder {

    /* compiled from: DollarBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarBasedOrderConfiguration$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DollarBased dollarBased) {
            return DollarBased4.DefaultImpls.getOrderAmountType(dollarBased);
        }

        public static boolean getTaxLots(DollarBased dollarBased) {
            return DirectOrder.DefaultImpls.getTaxLots(dollarBased);
        }

        public static boolean isBuySellDollarOrder(DollarBased dollarBased) {
            return DollarBased4.DefaultImpls.isBuySellDollarOrder(dollarBased);
        }

        public static boolean isBuySellOrder(DollarBased dollarBased) {
            return DollarBased4.DefaultImpls.isBuySellOrder(dollarBased);
        }

        public static boolean isBuySellSharesOrder(DollarBased dollarBased) {
            return DollarBased4.DefaultImpls.isBuySellSharesOrder(dollarBased);
        }

        public static boolean isDefaultOrderType(DollarBased dollarBased) {
            return DollarBased4.DefaultImpls.isDefaultOrderType(dollarBased);
        }
    }
}
