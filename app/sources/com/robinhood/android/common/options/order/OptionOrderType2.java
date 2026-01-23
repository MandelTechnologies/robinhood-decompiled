package com.robinhood.android.common.options.order;

import com.robinhood.android.common.options.order.OptionOrderUserInputPrices;
import com.robinhood.android.transfers.ach.p265ui.CreateQueuedAchDepositDuxo;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderEducationType;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderType.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0001¨\u0006\f"}, m3636d2 = {"toOptionOrderType", "Lcom/robinhood/models/db/OptionOrderType;", "Lcom/robinhood/models/db/Order$Configuration;", "toOrderConfiguration", "toOptionOrderEducationType", "Lcom/robinhood/models/db/OptionOrderEducationType;", "toDefaultUserInputPrices", "Lcom/robinhood/android/common/options/order/OptionOrderUserInputPrices;", "Lcom/robinhood/models/db/OptionOrder;", "toReplacedOrderType", "toRosettaType", "Lcom/robinhood/rosetta/eventlogging/OptionsContext$OptionOrderType;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.order.OptionOrderTypeKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionOrderType2 {

    /* compiled from: OptionOrderType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.order.OptionOrderTypeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionOrderType.values().length];
            try {
                iArr2[OptionOrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OptionOrderType.STOP_MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OptionOrderType.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OptionOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionOrderEducationType.values().length];
            try {
                iArr3[OptionOrderEducationType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OptionOrderEducationType.STOP_MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final OptionOrderType toOptionOrderType(Order.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[configuration.ordinal()]) {
            case 1:
                return OptionOrderType.LIMIT;
            case 2:
                return OptionOrderType.STOP_MARKET;
            case 3:
                return OptionOrderType.STOP_LIMIT;
            case 4:
                return OptionOrderType.MARKET;
            case 5:
            case 6:
                throw new IllegalStateException(("Unsupported order configuration: " + configuration).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Order.Configuration toOrderConfiguration(OptionOrderType optionOrderType) {
        Intrinsics.checkNotNullParameter(optionOrderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[optionOrderType.ordinal()];
        if (i == 1) {
            return Order.Configuration.LIMIT;
        }
        if (i == 2) {
            return Order.Configuration.STOP_LOSS;
        }
        if (i == 3) {
            return Order.Configuration.MARKET;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Order.Configuration.STOP_LIMIT;
    }

    public static final OptionOrderEducationType toOptionOrderEducationType(OptionOrderType optionOrderType) {
        Intrinsics.checkNotNullParameter(optionOrderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[optionOrderType.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return OptionOrderEducationType.STOP_MARKET;
        }
        if (i == 3) {
            return OptionOrderEducationType.MARKET;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final OptionOrderType toOptionOrderType(OptionOrderEducationType optionOrderEducationType) {
        Intrinsics.checkNotNullParameter(optionOrderEducationType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[optionOrderEducationType.ordinal()];
        if (i == 1) {
            return OptionOrderType.MARKET;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionOrderType.STOP_MARKET;
    }

    public static final OptionOrderUserInputPrices toDefaultUserInputPrices(OptionOrderType optionOrderType) {
        Intrinsics.checkNotNullParameter(optionOrderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[optionOrderType.ordinal()];
        if (i == 1) {
            return new OptionOrderUserInputPrices.Limit(null);
        }
        if (i == 2) {
            return new OptionOrderUserInputPrices.StopMarket("", CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO);
        }
        if (i == 3) {
            return OptionOrderUserInputPrices.Market.INSTANCE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new OptionOrderUserInputPrices.StopLimit(null, null);
    }

    public static final OptionOrderType toOptionOrderType(OptionOrder optionOrder) {
        Intrinsics.checkNotNullParameter(optionOrder, "<this>");
        OrderType type2 = optionOrder.getType();
        OrderType orderType = OrderType.LIMIT;
        if (type2 == orderType && optionOrder.getTrigger() == OrderTrigger.IMMEDIATE) {
            return OptionOrderType.LIMIT;
        }
        if (optionOrder.getType() == orderType && optionOrder.getTrigger() == OrderTrigger.STOP) {
            return OptionOrderType.STOP_LIMIT;
        }
        OrderType type3 = optionOrder.getType();
        OrderType orderType2 = OrderType.MARKET;
        if (type3 == orderType2 && optionOrder.getTrigger() == OrderTrigger.IMMEDIATE) {
            return OptionOrderType.MARKET;
        }
        if (optionOrder.getType() == orderType2 && optionOrder.getTrigger() == OrderTrigger.STOP) {
            return OptionOrderType.STOP_MARKET;
        }
        throw new IllegalStateException(("Impossible combination: " + optionOrder.getType() + ", " + optionOrder.getTrigger()).toString());
    }

    public static final OptionOrderType toReplacedOrderType(OptionOrder optionOrder) {
        Intrinsics.checkNotNullParameter(optionOrder, "<this>");
        return (optionOrder.getType() == OrderType.MARKET && optionOrder.getTrigger() == OrderTrigger.IMMEDIATE) ? OptionOrderType.LIMIT : toOptionOrderType(optionOrder);
    }

    public static final OptionsContext.OptionOrderType toRosettaType(OptionOrderType optionOrderType) {
        Intrinsics.checkNotNullParameter(optionOrderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[optionOrderType.ordinal()];
        if (i == 1) {
            return OptionsContext.OptionOrderType.LIMIT;
        }
        if (i == 2) {
            return OptionsContext.OptionOrderType.STOP_MARKET;
        }
        if (i == 3) {
            return OptionsContext.OptionOrderType.MARKET;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionsContext.OptionOrderType.STOP_LIMIT;
    }
}
