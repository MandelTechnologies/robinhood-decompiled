package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import kotlin.Metadata;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "Lcom/robinhood/android/trading/contracts/configuration/ShareLimit$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareSimpleLimit$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLoss$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Validated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ShareValidated extends ShareBasedOrderConfiguration, DirectOrder.Validated {

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DirectOrder.Draft completedDraft(ShareValidated shareValidated) {
            return DirectOrder.Validated.DefaultImpls.completedDraft(shareValidated);
        }

        public static boolean getAutoValidate(ShareValidated shareValidated) {
            return DirectOrder.Validated.DefaultImpls.getAutoValidate(shareValidated);
        }

        public static DefaultableOrderConfiguration getOrderAmountType(ShareValidated shareValidated) {
            return ShareBasedOrderConfiguration.DefaultImpls.getOrderAmountType(shareValidated);
        }

        public static boolean getTaxLots(ShareValidated shareValidated) {
            return ShareBasedOrderConfiguration.DefaultImpls.getTaxLots(shareValidated);
        }

        public static boolean isBuySellDollarOrder(ShareValidated shareValidated) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellDollarOrder(shareValidated);
        }

        public static boolean isBuySellOrder(ShareValidated shareValidated) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellOrder(shareValidated);
        }

        public static boolean isBuySellSharesOrder(ShareValidated shareValidated) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellSharesOrder(shareValidated);
        }

        public static boolean isDefaultOrderType(ShareValidated shareValidated) {
            return ShareBasedOrderConfiguration.DefaultImpls.isDefaultOrderType(shareValidated);
        }
    }
}
