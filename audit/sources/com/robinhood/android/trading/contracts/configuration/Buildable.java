package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import kotlin.Metadata;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLoss;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface Buildable extends ShareBasedOrderConfiguration {

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(Buildable buildable) {
            return ShareBasedOrderConfiguration.DefaultImpls.getOrderAmountType(buildable);
        }

        public static boolean getTaxLots(Buildable buildable) {
            return ShareBasedOrderConfiguration.DefaultImpls.getTaxLots(buildable);
        }

        public static boolean isBuySellDollarOrder(Buildable buildable) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellDollarOrder(buildable);
        }

        public static boolean isBuySellOrder(Buildable buildable) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellOrder(buildable);
        }

        public static boolean isBuySellSharesOrder(Buildable buildable) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellSharesOrder(buildable);
        }

        public static boolean isDefaultOrderType(Buildable buildable) {
            return ShareBasedOrderConfiguration.DefaultImpls.isDefaultOrderType(buildable);
        }
    }
}
