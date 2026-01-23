package com.robinhood.android.equities.ordertypeschedule;

import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DollarBased3;
import com.robinhood.android.trading.contracts.configuration.DollarBased5;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.android.trading.contracts.configuration.ShareSimpleLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.android.trading.contracts.configuration.ShareTrailingStop;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.TradingSession2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportedOrderTypes.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001aP\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001aL\u0010\u000f\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001aH\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\t¨\u0006\u001a"}, m3636d2 = {"supportedOrderTypes", "", "Lcom/robinhood/models/db/Order$Configuration;", "Lcom/robinhood/models/db/TradingSession;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "positionQuantity", "Ljava/math/BigDecimal;", "isShare", "", "isOtcInstrument", "marketBuysEnabled", "subzeroEnabled", "selectableOrderTypes", "nominalTypes", "defaultOrderType", "selectableConfigurations", "inflate", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "accountNumber", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "initialShareQuantity", "initialDollarAmount", "useAdvancedShareMarket", "lib-order-type-schedule_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.ordertypeschedule.SupportedOrderTypesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SupportedOrderTypes {

    /* compiled from: SupportedOrderTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.ordertypeschedule.SupportedOrderTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderPositionEffect.values().length];
            try {
                iArr[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Order.Configuration.values().length];
            try {
                iArr3[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Order.Configuration.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Order.Configuration.STOP_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final List<Order.Configuration> supportedOrderTypes(TradingSession tradingSession, EquityOrderSide side, BigDecimal positionQuantity, boolean z, boolean z2, boolean z3, boolean z4) {
        OrderPositionEffect orderPositionEffect;
        Intrinsics.checkNotNullParameter(tradingSession, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionQuantity, "positionQuantity");
        int i = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
        if (i == 1) {
            BigDecimal ZERO = BigDecimal.ZERO;
            if (positionQuantity.compareTo(ZERO) < 0 && z4) {
                orderPositionEffect = OrderPositionEffect.CLOSE;
            } else {
                orderPositionEffect = OrderPositionEffect.OPEN;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[orderPositionEffect.ordinal()];
            if (i2 == 1) {
                return CollectionsKt.listOfNotNull((Object[]) new Order.Configuration[]{(!z || (z3 && !z2)) ? Order.Configuration.MARKET : null, Order.Configuration.SIMPLE_LIMIT, Order.Configuration.LIMIT, Order.Configuration.STOP_LOSS, Order.Configuration.STOP_LIMIT, Order.Configuration.TRAILING_STOP});
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimal = new BigDecimal(-1);
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            if (positionQuantity.compareTo(ZERO) <= 0 && positionQuantity.compareTo(bigDecimal) >= 0) {
                return CollectionsKt.listOf(Order.Configuration.MARKET);
            }
            return CollectionsKt.listOf((Object[]) new Order.Configuration[]{Order.Configuration.MARKET, Order.Configuration.LIMIT, Order.Configuration.STOP_LOSS, Order.Configuration.STOP_LIMIT, Order.Configuration.TRAILING_STOP});
        }
        if (i == 2) {
            return CollectionsKt.listOf((Object[]) new Order.Configuration[]{Order.Configuration.MARKET, Order.Configuration.SIMPLE_LIMIT, Order.Configuration.LIMIT, Order.Configuration.STOP_LOSS, Order.Configuration.STOP_LIMIT, Order.Configuration.TRAILING_STOP});
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z4 && tradingSession.getCurrentShortSellSessions() != null && !TradingSession2.allowsShorting(tradingSession)) {
            return CollectionsKt.emptyList();
        }
        if (tradingSession instanceof TradingSession.Extended.AfterHours) {
            return CollectionsKt.listOf(Order.Configuration.LIMIT);
        }
        if (tradingSession instanceof TradingSession.Extended.PreMarket) {
            if (z4 && TradingSession2.allowsShorting(tradingSession)) {
                return CollectionsKt.listOf((Object[]) new Order.Configuration[]{Order.Configuration.MARKET, Order.Configuration.LIMIT, Order.Configuration.STOP_LOSS});
            }
            return CollectionsKt.emptyList();
        }
        if (tradingSession instanceof TradingSession.Overnight) {
            return CollectionsKt.emptyList();
        }
        if (!(tradingSession instanceof TradingSession.Regular)) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.listOf((Object[]) new Order.Configuration[]{Order.Configuration.MARKET, Order.Configuration.LIMIT, Order.Configuration.STOP_LOSS});
    }

    public static /* synthetic */ List selectableOrderTypes$default(TradingSession tradingSession, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, boolean z, boolean z2, boolean z3, boolean z4, List list, int i, Object obj) {
        if ((i & 64) != 0) {
            list = supportedOrderTypes(tradingSession, equityOrderSide, bigDecimal, z, z2, z3, z4);
        }
        return selectableOrderTypes(tradingSession, equityOrderSide, bigDecimal, z, z2, z3, z4, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<Order.Configuration> selectableOrderTypes(TradingSession tradingSession, EquityOrderSide side, BigDecimal positionQuantity, boolean z, boolean z2, boolean z3, boolean z4, List<? extends Order.Configuration> nominalTypes) {
        Intrinsics.checkNotNullParameter(tradingSession, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionQuantity, "positionQuantity");
        Intrinsics.checkNotNullParameter(nominalTypes, "nominalTypes");
        Order.Configuration configuration = Order.Configuration.MARKET;
        boolean zContains = nominalTypes.contains(configuration);
        Order.Configuration configuration2 = Order.Configuration.SIMPLE_LIMIT;
        boolean zContains2 = nominalTypes.contains(configuration2);
        if (!zContains || !zContains2) {
            return nominalTypes;
        }
        if ((tradingSession instanceof TradingSession.Regular) || (tradingSession instanceof TradingSession.Overnight)) {
            configuration = configuration2;
        } else if (!(tradingSession instanceof TradingSession.Extended)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : nominalTypes) {
            if (((Order.Configuration) obj) != configuration) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Order.Configuration defaultOrderType$default(TradingSession tradingSession, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, boolean z, boolean z2, boolean z3, boolean z4, List list, int i, Object obj) {
        List listSelectableOrderTypes$default;
        TradingSession tradingSession2;
        EquityOrderSide equityOrderSide2;
        BigDecimal bigDecimal2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if ((i & 64) != 0) {
            tradingSession2 = tradingSession;
            equityOrderSide2 = equityOrderSide;
            bigDecimal2 = bigDecimal;
            z5 = z;
            z6 = z2;
            z7 = z3;
            z8 = z4;
            listSelectableOrderTypes$default = selectableOrderTypes$default(tradingSession2, equityOrderSide2, bigDecimal2, z5, z6, z7, z8, null, 64, null);
        } else {
            listSelectableOrderTypes$default = list;
            tradingSession2 = tradingSession;
            equityOrderSide2 = equityOrderSide;
            bigDecimal2 = bigDecimal;
            z5 = z;
            z6 = z2;
            z7 = z3;
            z8 = z4;
        }
        return defaultOrderType(tradingSession2, equityOrderSide2, bigDecimal2, z5, z6, z7, z8, listSelectableOrderTypes$default);
    }

    public static final Order.Configuration defaultOrderType(TradingSession tradingSession, EquityOrderSide side, BigDecimal positionQuantity, boolean z, boolean z2, boolean z3, boolean z4, List<? extends Order.Configuration> selectableConfigurations) {
        Intrinsics.checkNotNullParameter(tradingSession, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionQuantity, "positionQuantity");
        Intrinsics.checkNotNullParameter(selectableConfigurations, "selectableConfigurations");
        return (Order.Configuration) CollectionsKt.firstOrNull((List) selectableConfigurations);
    }

    public static final DirectOrder inflate(Order.Configuration configuration, String accountNumber, Instrument instrument, EquityOrderSide side, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(side, "side");
        switch (WhenMappings.$EnumSwitchMapping$2[configuration.ordinal()]) {
            case 1:
                if (z) {
                    if (side == EquityOrderSide.SELL_SHORT || z2) {
                        return new AdvancedOrder.MarketNew(accountNumber, bigDecimal, false);
                    }
                    return new ShareMarket.New(accountNumber, bigDecimal);
                }
                return new DollarBased3.New(accountNumber, bigDecimal2);
            case 2:
                if (z) {
                    return new ShareSimpleLimit.New(accountNumber, bigDecimal, instrument.getDefaultPresetPercentLimit());
                }
                return new DollarBased5.New(accountNumber, bigDecimal2, instrument.getDefaultPresetPercentLimit());
            case 3:
                return new AdvancedOrder.LimitNew(accountNumber, bigDecimal, null, null, null, false, 28, null);
            case 4:
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return new ShareStopLoss.New(accountNumber, bigDecimal, ZERO, OrderTimeInForce.GFD, null, 16, null);
            case 5:
                BigDecimal ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                return new ShareStopLimit.New(accountNumber, ZERO2, bigDecimal, ZERO2, OrderTimeInForce.GFD, null, 32, null);
            case 6:
                return new ShareTrailingStop.New(accountNumber, bigDecimal, null, OrderTimeInForce.GFD, null, 20, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
