package com.robinhood.android.trading.contracts.configuration;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DirectOrder.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\t\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Direct;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "taxLots", "", "getTaxLots", "()Z", "completedDraft", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Draft;", "Draft", "Validated", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/Limit;", "Lcom/robinhood/android/trading/contracts/configuration/Market;", "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/SimpleLimit;", "Lcom/robinhood/android/trading/contracts/configuration/Stop;", "Lcom/robinhood/android/trading/contracts/configuration/StopLimit;", "Lcom/robinhood/android/trading/contracts/configuration/TrailingStop;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface DirectOrder extends EquityOrderConfiguration.Direct, EquityOrderConfiguration.Resolved {
    Draft completedDraft();

    Order.Configuration getOrderConfiguration();

    boolean getTaxLots();

    OrderTimeInForce getTimeInForce();

    /* compiled from: DirectOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getTaxLots(DirectOrder directOrder) {
            return false;
        }

        public static DefaultableOrderConfiguration getOrderAmountType(DirectOrder directOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.getOrderAmountType(directOrder);
        }

        public static boolean isBuySellDollarOrder(DirectOrder directOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellDollarOrder(directOrder);
        }

        public static boolean isBuySellOrder(DirectOrder directOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellOrder(directOrder);
        }

        public static boolean isBuySellSharesOrder(DirectOrder directOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isBuySellSharesOrder(directOrder);
        }

        public static boolean isDefaultOrderType(DirectOrder directOrder) {
            return EquityOrderConfiguration.Direct.DefaultImpls.isDefaultOrderType(directOrder);
        }
    }

    /* compiled from: DirectOrder.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0000H\u0016J \u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\r\u001a\u00020\u0000H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\b\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "autoValidate", "", "getAutoValidate", "()Z", "completedDraft", "validated", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Validated;", "checkOverrides", "", "", "orderSummary", AnalyticsStrings.BUTTON_LIST_EDIT, "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Draft;", "Lcom/robinhood/android/trading/contracts/configuration/ShareDraft;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Draft extends DirectOrder {
        Draft completedDraft();

        Draft edit();

        boolean getAutoValidate();

        Validated validated(List<String> checkOverrides, String orderSummary);

        /* compiled from: DirectOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static Draft completedDraft(Draft draft) {
                return draft;
            }

            public static DefaultableOrderConfiguration getOrderAmountType(Draft draft) {
                return DefaultImpls.getOrderAmountType(draft);
            }

            public static boolean getTaxLots(Draft draft) {
                return DefaultImpls.getTaxLots(draft);
            }

            public static boolean isBuySellDollarOrder(Draft draft) {
                return DefaultImpls.isBuySellDollarOrder(draft);
            }

            public static boolean isBuySellOrder(Draft draft) {
                return DefaultImpls.isBuySellOrder(draft);
            }

            public static boolean isBuySellSharesOrder(Draft draft) {
                return DefaultImpls.isBuySellSharesOrder(draft);
            }

            public static boolean isDefaultOrderType(Draft draft) {
                return DefaultImpls.isDefaultOrderType(draft);
            }
        }
    }

    /* compiled from: DirectOrder.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder$Draft;", "autoValidate", "", "getAutoValidate", "()Z", "checkOverrides", "", "", "getCheckOverrides", "()Ljava/util/List;", "orderSummary", "getOrderSummary", "()Ljava/lang/String;", "Lcom/robinhood/android/trading/contracts/configuration/DollarMarket$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/DollarSimpleLimit$Validated;", "Lcom/robinhood/android/trading/contracts/configuration/ShareValidated;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Validated extends Draft {
        @Override // com.robinhood.android.trading.contracts.configuration.DirectOrder.Draft
        boolean getAutoValidate();

        List<String> getCheckOverrides();

        String getOrderSummary();

        /* compiled from: DirectOrder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static boolean getAutoValidate(Validated validated) {
                return true;
            }

            public static Draft completedDraft(Validated validated) {
                return Draft.DefaultImpls.completedDraft(validated);
            }

            public static DefaultableOrderConfiguration getOrderAmountType(Validated validated) {
                return Draft.DefaultImpls.getOrderAmountType(validated);
            }

            public static boolean getTaxLots(Validated validated) {
                return Draft.DefaultImpls.getTaxLots(validated);
            }

            public static boolean isBuySellDollarOrder(Validated validated) {
                return Draft.DefaultImpls.isBuySellDollarOrder(validated);
            }

            public static boolean isBuySellOrder(Validated validated) {
                return Draft.DefaultImpls.isBuySellOrder(validated);
            }

            public static boolean isBuySellSharesOrder(Validated validated) {
                return Draft.DefaultImpls.isBuySellSharesOrder(validated);
            }

            public static boolean isDefaultOrderType(Validated validated) {
                return Draft.DefaultImpls.isDefaultOrderType(validated);
            }
        }
    }
}
