package com.robinhood.android.event.trade.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderState;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormStringUtils.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005J.\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J>\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0019J.\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0019J6\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/event/trade/util/EventOrderFormStringUtils;", "", "<init>", "()V", "getOrderActionResource", "Lcom/robinhood/utils/resource/StringResource;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "getOutcomeLabelResource", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getOrderStatusResource", "orderState", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderState;", "buildOrderTimeInForceType", "timeInForce", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "buildQuantityIocOrFokSummary", "quantity", "", "contractNameWithDescriptions", "buildQuantityGtdSummary", "expirationString", "buildNotionalSummary", "notionalAmount", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "estimatedQuantity", "estimatedCost", "buildQuantityReceipt", "yesOrNoWithContractName", "buildOutcomeWithContractNameForSingleLeg", "contractName", "buildNotionalReceipt", "notionalPrice", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventOrderFormStringUtils {
    public static final int $stable = 0;
    public static final EventOrderFormStringUtils INSTANCE = new EventOrderFormStringUtils();

    /* compiled from: EventOrderFormStringUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[EventOrderPositionEffect.values().length];
            try {
                iArr[EventOrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventOrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventOrderSide.values().length];
            try {
                iArr2[EventOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EventOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FuturesOrderState.values().length];
            try {
                iArr3[FuturesOrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[FuturesOrderState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FuturesOrderState.UNCONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FuturesOrderState.CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FuturesOrderState.TRIGGERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[FuturesOrderState.PARTIALLY_FILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[FuturesOrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[FuturesOrderState.FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[FuturesOrderState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[FuturesOrderState.CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[FuturesOrderState.PENDING_CANCELLED.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[FuturesOrderState.FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[FuturesOrderState.VOIDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderFormTimeInForce.values().length];
            try {
                iArr4[OrderFormTimeInForce.IOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[OrderFormTimeInForce.UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[OrderFormTimeInForce.GTD.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[OrderFormTimeInForce.FOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private EventOrderFormStringUtils() {
    }

    public final StringResource getOrderActionResource(EventOrderPositionEffect positionEffect) {
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        int i = WhenMappings.$EnumSwitchMapping$0[positionEffect.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C16465R.string.event_order_action_buy, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C16465R.string.event_order_action_sell, new Object[0]);
    }

    public final StringResource getOutcomeLabelResource(EventOrderSide side, EventOrderPositionEffect positionEffect) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        int i = WhenMappings.$EnumSwitchMapping$0[positionEffect.ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
            if (i2 == 1) {
                return StringResource.INSTANCE.invoke(C16465R.string.event_contract_yes, new Object[0]);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C16465R.string.event_contract_no, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
        if (i3 == 1) {
            return StringResource.INSTANCE.invoke(C16465R.string.event_contract_no, new Object[0]);
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C16465R.string.event_contract_yes, new Object[0]);
    }

    public final StringResource getOrderStatusResource(FuturesOrderState orderState) {
        Intrinsics.checkNotNullParameter(orderState, "orderState");
        switch (WhenMappings.$EnumSwitchMapping$2[orderState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return StringResource.INSTANCE.invoke(C16465R.string.event_order_status_placed, new Object[0]);
            case 6:
            case 7:
                return StringResource.INSTANCE.invoke(C16465R.string.event_order_status_partially_filled_bold, new Object[0]);
            case 8:
                return StringResource.INSTANCE.invoke(C16465R.string.event_order_status_complete_bold, new Object[0]);
            case 9:
                return StringResource.INSTANCE.invoke(C16465R.string.event_order_status_rejected, new Object[0]);
            case 10:
            case 11:
                return StringResource.INSTANCE.invoke(C16465R.string.event_order_status_canceled, new Object[0]);
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C16465R.string.event_order_status_failed, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final StringResource buildOrderTimeInForceType(OrderFormTimeInForce timeInForce) {
        int i;
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        int i2 = WhenMappings.$EnumSwitchMapping$3[timeInForce.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = C16465R.string.events_order_form_order_type_ioc;
        } else if (i2 == 3) {
            i = C16465R.string.events_order_form_order_type_gtd;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = C16465R.string.events_order_form_order_type_fok;
        }
        return StringResource.INSTANCE.invoke(i, new Object[0]);
    }

    public final StringResource buildQuantityIocOrFokSummary(OrderFormTimeInForce timeInForce, EventOrderPositionEffect positionEffect, int quantity, StringResource contractNameWithDescriptions) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(contractNameWithDescriptions, "contractNameWithDescriptions");
        StringResource orderActionResource = getOrderActionResource(positionEffect);
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C16465R.plurals.events_order_form_summary_qty_ioc, quantity), buildOrderTimeInForceType(timeInForce), orderActionResource, Integer.valueOf(quantity), contractNameWithDescriptions);
    }

    public final StringResource buildQuantityGtdSummary(OrderFormTimeInForce timeInForce, EventOrderPositionEffect positionEffect, int quantity, StringResource contractNameWithDescriptions, StringResource expirationString) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(contractNameWithDescriptions, "contractNameWithDescriptions");
        Intrinsics.checkNotNullParameter(expirationString, "expirationString");
        StringResource orderActionResource = getOrderActionResource(positionEffect);
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C16465R.plurals.events_order_form_summary_qty_gtd, quantity), buildOrderTimeInForceType(timeInForce), orderActionResource, Formats.getShareQuantityFormat().format(Integer.valueOf(quantity)), contractNameWithDescriptions, expirationString);
    }

    public final StringResource buildNotionalSummary(OrderFormTimeInForce timeInForce, EventOrderPositionEffect positionEffect, String notionalAmount, StringResource contractNameWithDescriptions, String price, int estimatedQuantity, String estimatedCost) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(notionalAmount, "notionalAmount");
        Intrinsics.checkNotNullParameter(contractNameWithDescriptions, "contractNameWithDescriptions");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(estimatedCost, "estimatedCost");
        StringResource orderActionResource = getOrderActionResource(positionEffect);
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C16465R.plurals.events_order_form_summary_notional, estimatedQuantity), buildOrderTimeInForceType(timeInForce), orderActionResource, notionalAmount, contractNameWithDescriptions, price, Formats.getShareQuantityFormat().format(Integer.valueOf(estimatedQuantity)), estimatedCost);
    }

    public final StringResource buildQuantityReceipt(EventOrderPositionEffect positionEffect, int quantity, StringResource yesOrNoWithContractName, String price, FuturesOrderState orderState) {
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(yesOrNoWithContractName, "yesOrNoWithContractName");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(orderState, "orderState");
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C16465R.plurals.order_receipt_detail_qty, quantity), getOrderActionResource(positionEffect), Formats.getShareQuantityFormat().format(Integer.valueOf(quantity)), yesOrNoWithContractName, price, getOrderStatusResource(orderState));
    }

    public final StringResource buildOutcomeWithContractNameForSingleLeg(EventOrderSide side, EventOrderPositionEffect positionEffect, String contractName) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(contractName, "contractName");
        return StringResource.INSTANCE.invoke(C16465R.string.event_outcome_with_contract_name, getOutcomeLabelResource(side, positionEffect), contractName);
    }

    public final StringResource buildNotionalReceipt(EventOrderPositionEffect positionEffect, String notionalPrice, StringResource yesOrNoWithContractName, String price, FuturesOrderState orderState, int estimatedQuantity) {
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(notionalPrice, "notionalPrice");
        Intrinsics.checkNotNullParameter(yesOrNoWithContractName, "yesOrNoWithContractName");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(orderState, "orderState");
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C16465R.plurals.order_receipt_detail_notional, estimatedQuantity), getOrderActionResource(positionEffect), notionalPrice, yesOrNoWithContractName, price, getOrderStatusResource(orderState));
    }
}
