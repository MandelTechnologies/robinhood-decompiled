package com.robinhood.common.strings;

import android.content.res.Resources;
import com.robinhood.shared.models.history.shared.OrderState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderStates.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/shared/models/history/shared/OrderState;", "getLabelResId", "(Lcom/robinhood/shared/models/history/shared/OrderState;)I", "getOrderStateString", "", "res", "Landroid/content/res/Resources;", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.common.strings.OrderStatesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class OrderStates {

    /* compiled from: OrderStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.OrderStatesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderState.values().length];
            try {
                iArr[OrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderState.UNCONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderState.CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderState.PARTIALLY_FILLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderState.PENDING_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OrderState.FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OrderState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OrderState.CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OrderState.FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OrderState.VOIDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OrderState.TRIGGERED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OrderState.NOT_ACCEPTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getLabelResId(OrderState orderState) {
        Intrinsics.checkNotNullParameter(orderState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[orderState.ordinal()]) {
            case 1:
                return C32428R.string.order_state_queued;
            case 2:
            case 3:
                return C32428R.string.order_state_pending;
            case 4:
                return C32428R.string.order_state_placed;
            case 5:
            case 6:
                return C32428R.string.order_state_partially_filled;
            case 7:
                return C32428R.string.order_state_pending_cancel;
            case 8:
                return C32428R.string.order_state_filled;
            case 9:
                return C32428R.string.order_state_rejected;
            case 10:
                return C32428R.string.order_state_canceled;
            case 11:
                return C32428R.string.order_state_failed;
            case 12:
                return C32428R.string.order_state_voided;
            case 13:
                return C32428R.string.order_state_triggered;
            case 14:
                throw new IllegalStateException("Unsupported order state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getOrderStateString(OrderState orderState, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(orderState, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(getLabelResId(orderState));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
