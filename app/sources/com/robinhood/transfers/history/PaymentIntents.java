package com.robinhood.transfers.history;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.p320db.bff.PaymentIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentIntents.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"badgeTextRes", "", "Lcom/robinhood/models/db/bff/PaymentIntent$State;", "getBadgeTextRes", "(Lcom/robinhood/models/db/bff/PaymentIntent$State;)Ljava/lang/Integer;", "badgeTint", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "getBadgeTint", "(Lcom/robinhood/models/db/bff/PaymentIntent$State;)Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Tint;", "lib-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.transfers.history.PaymentIntentsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PaymentIntents {

    /* compiled from: PaymentIntents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.transfers.history.PaymentIntentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentIntent.State.values().length];
            try {
                iArr[PaymentIntent.State.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentIntent.State.REVERSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentIntent.State.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentIntent.State.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentIntent.State.NEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentIntent.State.SCHEDULED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentIntent.State.PENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentIntent.State.PENDING_REVERSE.ordinal()] = 8;
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
        }
    }

    public static final Integer getBadgeTextRes(PaymentIntent.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return Integer.valueOf(C41787R.string.payment_intent_state_canceled);
            case 2:
                return Integer.valueOf(C41787R.string.payment_intent_state_reversed);
            case 3:
                return Integer.valueOf(C11048R.string.general_label_failed);
            case 4:
                return Integer.valueOf(C41787R.string.payment_intent_state_paused);
            case 5:
            case 6:
            case 7:
            case 8:
                return Integer.valueOf(C11048R.string.general_label_pending);
            case 9:
            case 10:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TransactionSummary.Tint getBadgeTint(PaymentIntent.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[state.ordinal()] == 3) {
            return TransactionSummary.Tint.NEGATIVE;
        }
        return TransactionSummary.Tint.FOREGROUND_2;
    }
}
