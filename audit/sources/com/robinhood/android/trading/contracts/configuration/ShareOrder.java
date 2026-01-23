package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: ShareBased.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/ShareOrder;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Direct;", "taxLots", "", "getTaxLots", "()Z", "orderAmountType", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "getOrderAmountType", "()Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "shareQuantity", "Ljava/math/BigDecimal;", "getShareQuantity", "()Ljava/math/BigDecimal;", "mutateShareQuantity", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasic;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ShareOrder extends EquityOrderConfiguration.Direct {
    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    DefaultableOrderConfiguration getOrderAmountType();

    BigDecimal getShareQuantity();

    boolean getTaxLots();

    ShareOrder mutateShareQuantity(BigDecimal shareQuantity);

    /* compiled from: ShareBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getTaxLots(ShareOrder shareOrder) {
            return false;
        }

        public static boolean isBuySellDollarOrder(ShareOrder shareOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellDollarOrder(shareOrder);
        }

        public static boolean isBuySellOrder(ShareOrder shareOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellOrder(shareOrder);
        }

        public static boolean isBuySellSharesOrder(ShareOrder shareOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellSharesOrder(shareOrder);
        }

        public static boolean isDefaultOrderType(ShareOrder shareOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isDefaultOrderType(shareOrder);
        }

        public static DefaultableOrderConfiguration getOrderAmountType(ShareOrder shareOrder) {
            return DefaultableOrderConfiguration.SHARE;
        }
    }
}
