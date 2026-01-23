package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: DollarBased.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DollarOrder;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Direct;", "orderAmountType", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "getOrderAmountType", "()Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "dollarAmount", "Ljava/math/BigDecimal;", "getDollarAmount", "()Ljava/math/BigDecimal;", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasic;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trading.contracts.configuration.DollarOrder, reason: use source file name */
/* loaded from: classes9.dex */
public interface DollarBased4 extends EquityOrderConfiguration.Direct {
    BigDecimal getDollarAmount();

    @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
    DefaultableOrderConfiguration getOrderAmountType();

    /* compiled from: DollarBased.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trading.contracts.configuration.DollarOrder$DefaultImpls */
    public static final class DefaultImpls {
        public static boolean isBuySellDollarOrder(DollarBased4 dollarBased4) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellDollarOrder(dollarBased4);
        }

        public static boolean isBuySellOrder(DollarBased4 dollarBased4) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellOrder(dollarBased4);
        }

        public static boolean isBuySellSharesOrder(DollarBased4 dollarBased4) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellSharesOrder(dollarBased4);
        }

        public static boolean isDefaultOrderType(DollarBased4 dollarBased4) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isDefaultOrderType(dollarBased4);
        }

        public static DefaultableOrderConfiguration getOrderAmountType(DollarBased4 dollarBased4) {
            return DefaultableOrderConfiguration.DOLLAR;
        }
    }
}
