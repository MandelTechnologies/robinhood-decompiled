package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J \u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Draft;", "validated", "Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "checkOverrides", "", "", "orderSummary", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareMarket$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareSimpleLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareStopLoss$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareTrailingStop$Draft;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ShareDraft extends ShareBasedOrderConfiguration, DirectOrder.Draft {
    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
    ShareValidated validated(List<String> checkOverrides, String orderSummary);

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DirectOrder.Draft completedDraft(ShareDraft shareDraft) {
            return DirectOrder.Draft.DefaultImpls.completedDraft(shareDraft);
        }

        public static DefaultableOrderConfiguration getOrderAmountType(ShareDraft shareDraft) {
            return ShareBasedOrderConfiguration.DefaultImpls.getOrderAmountType(shareDraft);
        }

        public static boolean getTaxLots(ShareDraft shareDraft) {
            return ShareBasedOrderConfiguration.DefaultImpls.getTaxLots(shareDraft);
        }

        public static boolean isBuySellDollarOrder(ShareDraft shareDraft) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellDollarOrder(shareDraft);
        }

        public static boolean isBuySellOrder(ShareDraft shareDraft) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellOrder(shareDraft);
        }

        public static boolean isBuySellSharesOrder(ShareDraft shareDraft) {
            return ShareBasedOrderConfiguration.DefaultImpls.isBuySellSharesOrder(shareDraft);
        }

        public static boolean isDefaultOrderType(ShareDraft shareDraft) {
            return ShareBasedOrderConfiguration.DefaultImpls.isDefaultOrderType(shareDraft);
        }
    }
}
