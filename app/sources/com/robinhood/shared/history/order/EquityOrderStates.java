package com.robinhood.shared.history.order;

import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.EquityOrderState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderStates.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getLabelResId", "", "Lcom/robinhood/models/api/EquityOrderState;", "fromDetail", "", "lib-order-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.order.EquityOrderStatesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EquityOrderStates {

    /* compiled from: EquityOrderStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.order.EquityOrderStatesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderState.values().length];
            try {
                iArr[EquityOrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderState.UNCONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EquityOrderState.CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EquityOrderState.PARTIALLY_FILLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EquityOrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EquityOrderState.PENDING_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EquityOrderState.FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EquityOrderState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EquityOrderState.CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EquityOrderState.FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EquityOrderState.VOIDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EquityOrderState.TRIGGERED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EquityOrderState.LOCATING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EquityOrderState.LOCATE_FAILED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ int getLabelResId$default(EquityOrderState equityOrderState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getLabelResId(equityOrderState, z);
    }

    public static final int getLabelResId(EquityOrderState equityOrderState, boolean z) {
        Intrinsics.checkNotNullParameter(equityOrderState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[equityOrderState.ordinal()]) {
            case 1:
                return C32428R.string.order_state_queued;
            case 2:
            case 3:
                return C32428R.string.order_state_pending;
            case 4:
                return C32428R.string.order_state_placed;
            case 5:
                return C39008R.string.order_state_partially_filled_rest_pending;
            case 6:
                return C39008R.string.order_state_partially_filled_rest_cancelled;
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
                return C32428R.string.order_state_pending_locate;
            case 15:
                if (z) {
                    return C32428R.string.order_state_locate_failed_detail;
                }
                return C32428R.string.order_state_locate_failed;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
