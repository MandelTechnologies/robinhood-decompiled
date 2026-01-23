package com.robinhood.rosetta.converters.orders;

import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.Direction;
import rosetta.order.MarketHours;
import rosetta.order.PositionEffect;
import rosetta.order.Side;
import rosetta.order.TimeInForce;
import rosetta.order.Trigger;

/* compiled from: Orders.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0000\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\u000e\u0010\u0000\u001a\u00060\u0006j\u0002`\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0000\u001a\u00020\r*\u00020\u000e\u001a\f\u0010\u0000\u001a\u00020\u000f*\u0004\u0018\u00010\u0010\u001a\f\u0010\u0000\u001a\u00020\u0011*\u0004\u0018\u00010\u0012¨\u0006\u0013"}, m3636d2 = {"toProtobuf", "Lrosetta/order/Side;", "Lcom/robinhood/models/db/OrderSide;", "Lcom/robinhood/models/db/EquityOrderSide;", "Lrosetta/order/PositionEffect;", "Lcom/robinhood/models/db/OrderPositionEffect;", "Lrosetta/order/OrderType;", "Lcom/robinhood/rosetta/eventlogging/EventOrderType;", "Lcom/robinhood/models/db/OrderType;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "Lcom/robinhood/models/api/CryptoOrderType;", "Lrosetta/order/Trigger;", "Lcom/robinhood/models/db/OrderTrigger;", "Lrosetta/order/TimeInForce;", "Lcom/robinhood/models/db/OrderTimeInForce;", "Lrosetta/option/Direction;", "Lcom/robinhood/models/db/OrderDirection;", "Lrosetta/order/MarketHours;", "Lcom/robinhood/models/db/OrderMarketHours;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.orders.OrdersKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Orders2 {

    /* compiled from: Orders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.orders.OrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
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
            int[] iArr3 = new int[OrderPositionEffect.values().length];
            try {
                iArr3[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderType.values().length];
            try {
                iArr4[OrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[OrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CryptoOrderType.values().length];
            try {
                iArr5[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[CryptoOrderType.STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[CryptoOrderType.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[OrderTrigger.values().length];
            try {
                iArr6[OrderTrigger.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[OrderTrigger.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[OrderTimeInForce.values().length];
            try {
                iArr7[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr7[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[OrderDirection.values().length];
            try {
                iArr8[OrderDirection.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr8[OrderDirection.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[OrderMarketHours.values().length];
            try {
                iArr9[OrderMarketHours.REGULAR_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr9[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr9[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr9[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr9[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$8 = iArr9;
        }
    }

    public static final Side toProtobuf(OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i == 1) {
            return Side.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Side.SELL;
    }

    public static final Side toProtobuf(EquityOrderSide equityOrderSide) {
        Intrinsics.checkNotNullParameter(equityOrderSide, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[equityOrderSide.ordinal()];
        if (i == 1) {
            return Side.BUY;
        }
        if (i == 2) {
            return Side.SELL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Side.SELL_SHORT;
    }

    public static final PositionEffect toProtobuf(OrderPositionEffect orderPositionEffect) {
        int i = orderPositionEffect == null ? -1 : WhenMappings.$EnumSwitchMapping$2[orderPositionEffect.ordinal()];
        if (i == -1) {
            return PositionEffect.POSITION_EFFECT_UNSPECIFIED;
        }
        if (i == 1) {
            return PositionEffect.OPEN;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PositionEffect.CLOSE;
    }

    public static final rosetta.order.OrderType toProtobuf(OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[orderType.ordinal()];
        if (i == 1) {
            return rosetta.order.OrderType.MARKET;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return rosetta.order.OrderType.LIMIT;
    }

    public static final CryptoOrderContext.CryptoOrderType toProtobuf(CryptoOrderType cryptoOrderType) {
        Intrinsics.checkNotNullParameter(cryptoOrderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[cryptoOrderType.ordinal()];
        if (i == 1) {
            return CryptoOrderContext.CryptoOrderType.MARKET;
        }
        if (i == 2) {
            return CryptoOrderContext.CryptoOrderType.LIMIT;
        }
        if (i == 3) {
            return CryptoOrderContext.CryptoOrderType.STOP_LIMIT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoOrderContext.CryptoOrderType.STOP_LOSS;
    }

    public static final Trigger toProtobuf(OrderTrigger orderTrigger) {
        Intrinsics.checkNotNullParameter(orderTrigger, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$5[orderTrigger.ordinal()];
        if (i == 1) {
            return Trigger.IMMEDIATE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Trigger.STOP;
    }

    public static final TimeInForce toProtobuf(OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$6[orderTimeInForce.ordinal()];
        if (i == 1) {
            return TimeInForce.GFD;
        }
        if (i == 2) {
            return TimeInForce.GTC;
        }
        return TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
    }

    public static final Direction toProtobuf(OrderDirection orderDirection) {
        int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$7[orderDirection.ordinal()];
        if (i == -1) {
            return Direction.DIRECTION_UNSPECIFIED;
        }
        if (i == 1) {
            return Direction.CREDIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Direction.DEBIT;
    }

    public static final MarketHours toProtobuf(OrderMarketHours orderMarketHours) {
        int i = orderMarketHours == null ? -1 : WhenMappings.$EnumSwitchMapping$8[orderMarketHours.ordinal()];
        if (i == -1) {
            return MarketHours.MARKET_HOURS_UNSPECIFIED;
        }
        if (i == 1) {
            return MarketHours.REGULAR_HOURS;
        }
        if (i == 2) {
            return MarketHours.EXTENDED_HOURS;
        }
        if (i == 3) {
            return MarketHours.HYPER_EXTENDED_HOURS;
        }
        if (i == 4) {
            return MarketHours.REGULAR_CURB_HOURS;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return MarketHours.ALL_DAY_HOURS;
    }
}
