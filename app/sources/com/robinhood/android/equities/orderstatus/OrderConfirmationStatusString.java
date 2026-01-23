package com.robinhood.android.equities.orderstatus;

import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfirmationStatusString.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"getOrderConfirmationStatusString", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/Order;", "symbol", "", "Lcom/robinhood/models/api/EquityOrderState;", "lib-order-status_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.orderstatus.OrderConfirmationStatusStringKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class OrderConfirmationStatusString {

    /* compiled from: OrderConfirmationStatusString.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.orderstatus.OrderConfirmationStatusStringKt$WhenMappings */
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
                iArr[EquityOrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EquityOrderState.PARTIALLY_FILLED.ordinal()] = 6;
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
                iArr[EquityOrderState.LOCATE_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EquityOrderState.REJECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EquityOrderState.CANCELED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EquityOrderState.FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EquityOrderState.VOIDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EquityOrderState.LOCATING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EquityOrderState.TRIGGERED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getOrderConfirmationStatusString(Order order, String symbol) {
        Intrinsics.checkNotNullParameter(order, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return getOrderConfirmationStatusString(order.getState(), symbol);
    }

    public static final StringResource getOrderConfirmationStatusString(EquityOrderState equityOrderState, String symbol) {
        int i;
        Intrinsics.checkNotNullParameter(equityOrderState, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        StringResource.Companion companion = StringResource.INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$0[equityOrderState.ordinal()]) {
            case 1:
                i = C14743R.string.order_confirmation_status_queued;
                break;
            case 2:
            case 3:
                i = C14743R.string.order_confirmation_status_unconfirmed;
                break;
            case 4:
                i = C14743R.string.order_confirmation_status_confirmed;
                break;
            case 5:
            case 6:
                i = C14743R.string.order_confirmation_status_partially_filled;
                break;
            case 7:
                i = C14743R.string.order_confirmation_status_pending_cancel;
                break;
            case 8:
                i = C14743R.string.order_confirmation_status_filled;
                break;
            case 9:
            case 10:
                i = C14743R.string.order_confirmation_status_rejected;
                break;
            case 11:
                i = C14743R.string.order_confirmation_status_canceled;
                break;
            case 12:
                i = C14743R.string.order_confirmation_status_failed;
                break;
            case 13:
                i = C14743R.string.order_confirmation_status_voided;
                break;
            case 14:
                i = C14743R.string.order_confirmation_status_locating;
                break;
            case 15:
                throw new IllegalStateException("Triggered should not be used in order confirmation status");
            default:
                throw new NoWhenBranchMatchedException();
        }
        return companion.invoke(i, symbol);
    }
}
