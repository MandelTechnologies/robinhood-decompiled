package com.robinhood.android.transfers.history;

import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.models.p320db.bff.PaymentIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentIntentHistoryDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"resId", "", "Lcom/robinhood/models/db/bff/PaymentIntent$State;", "getResId", "(Lcom/robinhood/models/db/bff/PaymentIntent$State;)I", "purposeResId", "Lcom/robinhood/models/db/bff/PaymentIntent$Purpose;", "getPurposeResId", "(Lcom/robinhood/models/db/bff/PaymentIntent$Purpose;)I", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PaymentIntentHistoryDetailStateProvider2 {

    /* compiled from: PaymentIntentHistoryDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentIntent.State.values().length];
            try {
                iArr[PaymentIntent.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentIntent.State.SCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentIntent.State.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentIntent.State.PENDING_REVERSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentIntent.State.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentIntent.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentIntent.State.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentIntent.State.REVERSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentIntent.State.COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentIntent.State.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentIntent.Purpose.values().length];
            try {
                iArr2[PaymentIntent.Purpose.SG_BANK_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PaymentIntent.Purpose.I18N_WIRE_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PaymentIntent.Purpose.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getResId(PaymentIntent.State state) {
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return C30065R.string.transfer_state_new;
            case 2:
                return C30065R.string.transfer_state_scheduled;
            case 3:
            case 4:
                return C30065R.string.transfer_state_pending;
            case 5:
                return C8331R.string.ach_transfer_state_in_review;
            case 6:
                return C30065R.string.transfer_state_failed;
            case 7:
                return C30065R.string.transfer_state_canceled;
            case 8:
                return C30065R.string.transfer_state_reversed;
            case 9:
                return C30065R.string.transfer_state_completed;
            case 10:
                return C11048R.string.general_label_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getPurposeResId(PaymentIntent.Purpose purpose) {
        int i = WhenMappings.$EnumSwitchMapping$1[purpose.ordinal()];
        if (i == 1) {
            return C30065R.string.payment_intent_purpose_fast;
        }
        if (i == 2) {
            return C30065R.string.payment_intent_purpose_wire;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C30065R.string.payment_intent_purpose_unknown;
    }
}
