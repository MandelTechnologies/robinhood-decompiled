package com.robinhood.android.event.history.p131ui.order.utils;

import com.robinhood.android.event.history.C16405R;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.android.models.event.p186db.order.EventOrder4;
import com.robinhood.android.models.event.p186db.order.EventOrderConfiguration;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.common.strings.C32428R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderStrings.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\bH\u0007¨\u0006\t"}, m3636d2 = {"eventOrderTypeName", "", "Lcom/robinhood/android/models/event/db/order/EventOrderConfiguration;", "orderSide", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/PositionEffect;", "eventOrderYesNoType", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "feature-event-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.order.utils.OrderStringsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderStrings {

    /* compiled from: OrderStrings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.history.ui.order.utils.OrderStringsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EventOrderConfiguration.values().length];
            try {
                iArr[EventOrderConfiguration.MARKET_TO_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventOrderConfiguration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventOrderConfiguration.STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventOrderConfiguration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventOrderSide.values().length];
            try {
                iArr2[EventOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EventOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EventOrder4.values().length];
            try {
                iArr3[EventOrder4.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EventOrder4.CLOSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EventOrder4.POSITION_EFFECT_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final int eventOrderTypeName(EventOrderConfiguration eventOrderConfiguration, EventOrderSide orderSide, EventOrder4 positionEffect) {
        Intrinsics.checkNotNullParameter(eventOrderConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        int i = WhenMappings.$EnumSwitchMapping$2[positionEffect.ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[eventOrderConfiguration.ordinal()];
            if (i2 == 1) {
                return C16594R.string.order_description_market_to_limit_buy;
            }
            if (i2 == 2) {
                return C32428R.string.order_description_limit_buy;
            }
            if (i2 == 3) {
                return C32428R.string.order_description_stop_limit_buy;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return C32428R.string.order_description_stop_loss_buy;
        }
        if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[eventOrderConfiguration.ordinal()];
            if (i3 == 1) {
                return C16594R.string.order_description_market_to_limit_sell;
            }
            if (i3 == 2) {
                return C32428R.string.order_description_limit_sell;
            }
            if (i3 == 3) {
                return C32428R.string.order_description_stop_limit_sell;
            }
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return C32428R.string.order_description_stop_loss_sell;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[eventOrderConfiguration.ordinal()];
        if (i4 == 1) {
            int i5 = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
            if (i5 == 1) {
                return C16594R.string.order_description_market_to_limit_buy;
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C16594R.string.order_description_market_to_limit_sell;
        }
        if (i4 == 2) {
            int i6 = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
            if (i6 == 1) {
                return C32428R.string.order_description_limit_buy;
            }
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C32428R.string.order_description_limit_sell;
        }
        if (i4 == 3) {
            int i7 = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
            if (i7 == 1) {
                return C32428R.string.order_description_stop_limit_buy;
            }
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C32428R.string.order_description_stop_limit_sell;
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
        if (i8 == 1) {
            return C32428R.string.order_description_stop_loss_buy;
        }
        if (i8 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C32428R.string.order_description_stop_loss_sell;
    }

    public static final int eventOrderYesNoType(UiEventOrder uiEventOrder) {
        Intrinsics.checkNotNullParameter(uiEventOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[uiEventOrder.getOrder().getPositionEffect().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = WhenMappings.$EnumSwitchMapping$1[uiEventOrder.getSide().ordinal()];
                if (i2 == 1) {
                    return C16405R.string.description_no;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return C16405R.string.description_yes;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[uiEventOrder.getSide().ordinal()];
        if (i3 == 1) {
            return C16405R.string.description_yes;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C16405R.string.description_no;
    }
}
