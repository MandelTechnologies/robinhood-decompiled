package com.robinhood.android.event.trade;

import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderFormFocusedField.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"defaultFocusField", "Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.OrderFormFocusedFieldKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderFormFocusedField2 {

    /* compiled from: OrderFormFocusedField.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.OrderFormFocusedFieldKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderFormOrderType.values().length];
            try {
                iArr[OrderFormOrderType.NOTIONAL_BASED_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFormOrderType.QUANTITY_BASED_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderFormOrderType.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OrderFormFocusedField defaultFocusField(OrderFormOrderType orderFormOrderType) {
        Intrinsics.checkNotNullParameter(orderFormOrderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderFormOrderType.ordinal()];
        if (i == 1) {
            return OrderFormFocusedField.NOTIONAL_AMOUNT;
        }
        if (i == 2) {
            return OrderFormFocusedField.QUANTITY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderFormFocusedField.QUANTITY;
    }
}
