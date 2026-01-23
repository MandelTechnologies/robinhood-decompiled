package com.robinhood.shared.education.order;

import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeEducationConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toOrderTypeEducation", "Lcom/robinhood/shared/education/order/OrderTypeEducation;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "lib-order-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.order.OrderTypeEducationConfigurationKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeEducationConfiguration2 {

    /* compiled from: OrderTypeEducationConfiguration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationConfigurationKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderSide.values().length];
            try {
                iArr3[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final OrderTypeEducation toOrderTypeEducation(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration) {
        Intrinsics.checkNotNullParameter(orderTypeEducationConfiguration, "<this>");
        if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring) {
            return OrderTypeEducation.RECURRING_BUY;
        }
        if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder equityOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) orderTypeEducationConfiguration;
            int i = WhenMappings.$EnumSwitchMapping$1[equityOrder.getSide().ordinal()];
            if (i == 1) {
                switch (WhenMappings.$EnumSwitchMapping$0[equityOrder.getDirectOrder().getOrderConfiguration().ordinal()]) {
                    case 1:
                    case 2:
                        return OrderTypeEducation.MARKET_BUY;
                    case 3:
                        return OrderTypeEducation.LIMIT_BUY;
                    case 4:
                        return OrderTypeEducation.STOP_BUY;
                    case 5:
                        return OrderTypeEducation.STOP_LIMIT_BUY;
                    case 6:
                        return OrderTypeEducation.TRAILING_STOP_BUY;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[equityOrder.getDirectOrder().getOrderConfiguration().ordinal()]) {
                case 1:
                case 2:
                    return OrderTypeEducation.MARKET_SELL;
                case 3:
                    return OrderTypeEducation.LIMIT_SELL;
                case 4:
                    return OrderTypeEducation.STOP_SELL;
                case 5:
                    return OrderTypeEducation.STOP_LIMIT_SELL;
                case 6:
                    return OrderTypeEducation.TRAILING_STOP_SELL;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) orderTypeEducationConfiguration;
            int i2 = WhenMappings.$EnumSwitchMapping$2[cryptoOrder.getSide().ordinal()];
            if (i2 == 1) {
                Order.Configuration orderConfiguration = cryptoOrder.getOrderConfiguration();
                int i3 = WhenMappings.$EnumSwitchMapping$0[orderConfiguration.ordinal()];
                if (i3 == 3) {
                    return OrderTypeEducation.LIMIT_BUY_CRYPTO;
                }
                if (i3 == 4) {
                    return OrderTypeEducation.STOP_BUY_CRYPTO;
                }
                if (i3 == 5) {
                    return OrderTypeEducation.STOP_LIMIT_BUY_CRYPTO;
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(orderConfiguration);
                throw new ExceptionsH();
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Order.Configuration orderConfiguration2 = cryptoOrder.getOrderConfiguration();
            int i4 = WhenMappings.$EnumSwitchMapping$0[orderConfiguration2.ordinal()];
            if (i4 == 3) {
                return OrderTypeEducation.LIMIT_SELL_CRYPTO;
            }
            if (i4 == 4) {
                return OrderTypeEducation.STOP_SELL_CRYPTO;
            }
            if (i4 == 5) {
                return OrderTypeEducation.STOP_LIMIT_SELL_CRYPTO;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(orderConfiguration2);
            throw new ExceptionsH();
        }
        if (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) orderTypeEducationConfiguration;
            int i5 = WhenMappings.$EnumSwitchMapping$2[perpetualContract.getSide().ordinal()];
            if (i5 == 1) {
                Order.Configuration orderConfiguration3 = perpetualContract.getOrderConfiguration();
                if (WhenMappings.$EnumSwitchMapping$0[orderConfiguration3.ordinal()] == 3) {
                    return OrderTypeEducation.LIMIT_LONG_PERPETUAL;
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(orderConfiguration3);
                throw new ExceptionsH();
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Order.Configuration orderConfiguration4 = perpetualContract.getOrderConfiguration();
            if (WhenMappings.$EnumSwitchMapping$0[orderConfiguration4.ordinal()] == 3) {
                return OrderTypeEducation.LIMIT_SHORT_PERPETUAL;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(orderConfiguration4);
            throw new ExceptionsH();
        }
        if (!(orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks)) {
            throw new NoWhenBranchMatchedException();
        }
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks tokenizedStocks = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) orderTypeEducationConfiguration;
        int i6 = WhenMappings.$EnumSwitchMapping$2[tokenizedStocks.getSide().ordinal()];
        if (i6 == 1) {
            Order.Configuration orderConfiguration5 = tokenizedStocks.getOrderConfiguration();
            if (WhenMappings.$EnumSwitchMapping$0[orderConfiguration5.ordinal()] == 3) {
                return OrderTypeEducation.LIMIT_BUY_TOKEN;
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(orderConfiguration5);
            throw new ExceptionsH();
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Order.Configuration orderConfiguration6 = tokenizedStocks.getOrderConfiguration();
        if (WhenMappings.$EnumSwitchMapping$0[orderConfiguration6.ordinal()] == 3) {
            return OrderTypeEducation.LIMIT_SELL_TOKEN;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(orderConfiguration6);
        throw new ExceptionsH();
    }
}
