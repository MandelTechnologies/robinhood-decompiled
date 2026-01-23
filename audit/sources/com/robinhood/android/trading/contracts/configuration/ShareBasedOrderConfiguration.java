package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.ShareOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH&R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/ShareOrder;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "taxLots", "", "getTaxLots", "()Z", "mutateShareQuantity", "shareQuantity", "Ljava/math/BigDecimal;", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket;", "Lcom/robinhood/android/trading/contracts/configuration/ShareSimpleLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLoss;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop;", "Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ShareBasedOrderConfiguration extends ShareOrder, DirectOrder {
    @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder
    boolean getTaxLots();

    @Override // com.robinhood.android.trading.contracts.configuration.ShareOrder
    ShareBasedOrderConfiguration mutateShareQuantity(BigDecimal shareQuantity);

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getTaxLots(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
            return false;
        }

        public static DefaultableOrderConfiguration getOrderAmountType(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
            return ShareOrder.DefaultImpls.getOrderAmountType(shareBasedOrderConfiguration);
        }

        public static boolean isBuySellDollarOrder(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
            return ShareOrder.DefaultImpls.isBuySellDollarOrder(shareBasedOrderConfiguration);
        }

        public static boolean isBuySellOrder(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
            return ShareOrder.DefaultImpls.isBuySellOrder(shareBasedOrderConfiguration);
        }

        public static boolean isBuySellSharesOrder(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
            return ShareOrder.DefaultImpls.isBuySellSharesOrder(shareBasedOrderConfiguration);
        }

        public static boolean isDefaultOrderType(ShareBasedOrderConfiguration shareBasedOrderConfiguration) {
            return ShareOrder.DefaultImpls.isDefaultOrderType(shareBasedOrderConfiguration);
        }
    }
}
