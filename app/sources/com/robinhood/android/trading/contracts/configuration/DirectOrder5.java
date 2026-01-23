package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/SimpleLimit;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "presetPercentLimit", "Ljava/math/BigDecimal;", "getPresetPercentLimit", "()Ljava/math/BigDecimal;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit;", "Lcom/robinhood/android/trading/contracts/configuration/ShareSimpleLimit;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.SimpleLimit, reason: use source file name */
/* loaded from: classes9.dex */
public interface DirectOrder5 extends DirectOrder {
    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder, com.robinhood.android.trading.contracts.configuration.DirectOrder2
    Order.Configuration getOrderConfiguration();

    BigDecimal getPresetPercentLimit();

    @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder
    OrderTimeInForce getTimeInForce();

    /* compiled from: DirectOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.SimpleLimit$DefaultImpls */
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(DirectOrder5 directOrder5) {
            return DirectOrder.DefaultImpls.getOrderAmountType(directOrder5);
        }

        public static boolean getTaxLots(DirectOrder5 directOrder5) {
            return DirectOrder.DefaultImpls.getTaxLots(directOrder5);
        }

        public static boolean isBuySellDollarOrder(DirectOrder5 directOrder5) {
            return DirectOrder.DefaultImpls.isBuySellDollarOrder(directOrder5);
        }

        public static boolean isBuySellOrder(DirectOrder5 directOrder5) {
            return DirectOrder.DefaultImpls.isBuySellOrder(directOrder5);
        }

        public static boolean isBuySellSharesOrder(DirectOrder5 directOrder5) {
            return DirectOrder.DefaultImpls.isBuySellSharesOrder(directOrder5);
        }

        public static boolean isDefaultOrderType(DirectOrder5 directOrder5) {
            return DirectOrder.DefaultImpls.isDefaultOrderType(directOrder5);
        }

        public static Order.Configuration getOrderConfiguration(DirectOrder5 directOrder5) {
            return Order.Configuration.SIMPLE_LIMIT;
        }

        public static OrderTimeInForce getTimeInForce(DirectOrder5 directOrder5) {
            return OrderTimeInForce.GFD;
        }
    }
}
