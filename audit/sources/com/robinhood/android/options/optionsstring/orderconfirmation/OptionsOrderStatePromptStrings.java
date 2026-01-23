package com.robinhood.android.options.optionsstring.orderconfirmation;

import android.content.res.Resources;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.OptionOrderTypeStrings;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.shared.models.history.shared.OrderState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsOrderStatePromptStrings.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¨\u0006\n"}, m3636d2 = {"getOrderStatePromptStr", "", "res", "Landroid/content/res/Resources;", "newOrderType", "Lcom/robinhood/models/db/OptionOrderType;", "newOrderState", "Lcom/robinhood/shared/models/history/shared/OrderState;", "newOptionName", "oldOrderState", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.orderconfirmation.OptionsOrderStatePromptStringsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsOrderStatePromptStrings {

    /* compiled from: OptionsOrderStatePromptStrings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.orderconfirmation.OptionsOrderStatePromptStringsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderState.values().length];
            try {
                iArr[OrderState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderState.UNCONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderState.TRIGGERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderState.QUEUED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderState.CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderState.PARTIALLY_FILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderState.FILLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OrderState.REJECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OrderState.CANCELED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OrderState.NOT_ACCEPTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OrderState.PENDING_CANCELLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OrderState.FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OrderState.VOIDED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getOrderStatePromptStr(Resources res, OptionOrderType newOrderType, OrderState newOrderState, String newOptionName, OrderState orderState) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(newOrderType, "newOrderType");
        Intrinsics.checkNotNullParameter(newOrderState, "newOrderState");
        Intrinsics.checkNotNullParameter(newOptionName, "newOptionName");
        String lowerCase = OptionOrderTypeStrings.getOrderWithTypeStr(newOrderType, res).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (newOrderState == OrderState.FAILED && orderState != null && orderState != OrderState.CANCELED) {
            String string2 = res.getString(C23386R.string.order_status_prompt_failed_previous_order_not_canceled, lowerCase, newOptionName);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        OrderState orderState2 = OrderState.CANCELED;
        boolean z = true;
        boolean z2 = orderState == orderState2 || orderState == OrderState.PARTIALLY_FILLED_REST_CANCELLED;
        boolean z3 = newOrderState == orderState2 || newOrderState == OrderState.PARTIALLY_FILLED_REST_CANCELLED;
        if (newOrderState != OrderState.NEW && newOrderState != OrderState.UNCONFIRMED && newOrderState != OrderState.TRIGGERED) {
            z = false;
        }
        String string3 = null;
        if (orderState != null) {
            if (z2 && z3) {
                string3 = res.getString(C23386R.string.order_status_prompt_previous_order_also_canceled);
            } else if (z2) {
                string3 = res.getString(C23386R.string.order_status_prompt_previous_order_canceled);
            } else if (z) {
                string3 = res.getString(C23386R.string.order_status_prompt_before_previous_order_canceled);
            }
        }
        switch (WhenMappings.$EnumSwitchMapping$0[newOrderState.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i = C23386R.string.order_status_prompt_pending;
                break;
            case 4:
                i = C23386R.string.order_status_prompt_queued;
                break;
            case 5:
                i = C23386R.string.order_status_prompt_placed;
                break;
            case 6:
                i = C23386R.string.order_status_prompt_partially_filled;
                break;
            case 7:
                i = C23386R.string.order_status_prompt_filled;
                break;
            case 8:
                i = C23386R.string.order_status_prompt_rejected;
                break;
            case 9:
            case 10:
            case 11:
                i = C23386R.string.order_status_prompt_canceled;
                break;
            case 12:
                i = C23386R.string.order_status_prompt_pending_cancel;
                break;
            case 13:
                i = C23386R.string.order_status_prompt_failed;
                break;
            case 14:
                i = C23386R.string.order_status_prompt_voided;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string4 = res.getString(i, lowerCase, newOptionName);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        if (string3 == null) {
            return string4;
        }
        String string5 = res.getString(C23386R.string.order_status_prompt_with_cancel_new, string4, string3);
        Intrinsics.checkNotNull(string5);
        return string5;
    }
}
