package com.robinhood.shared.history.formatters.legacy.rhy;

import com.robinhood.android.common.C11048R;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.transfers.api.DebitCardTransferState;
import com.robinhood.transfers.api.TransferPurpose;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.history.C41787R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/transfers/api/TransferState;", "getLabelResId", "(Lcom/robinhood/transfers/api/TransferState;)I", "Lcom/robinhood/transfers/api/DebitCardTransferState;", "(Lcom/robinhood/transfers/api/DebitCardTransferState;)I", "Lcom/robinhood/transfers/api/TransferPurpose;", "(Lcom/robinhood/transfers/api/TransferPurpose;)Ljava/lang/Integer;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class UtilsKt {

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TransferState.values().length];
            try {
                iArr[TransferState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferState.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferState.NEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransferState.PAUSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransferState.PENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransferState.PREPROCESSING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransferState.PENDING_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransferState.READY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransferState.REVERSED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TransferState.REJECTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DebitCardTransferState.values().length];
            try {
                iArr2[DebitCardTransferState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DebitCardTransferState.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[DebitCardTransferState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[DebitCardTransferState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[DebitCardTransferState.REVERSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[DebitCardTransferState.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[DebitCardTransferState.DISPUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[DebitCardTransferState.REINSTATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[DebitCardTransferState.REFUNDED.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[DebitCardTransferState.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TransferPurpose.values().length];
            try {
                iArr3[TransferPurpose.ADMIN_REVERSAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[TransferPurpose.ADMIN_FORCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[TransferPurpose.ADMIN_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[TransferPurpose.CUSTOMER_INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[TransferPurpose.DEPOSIT_SCHEDULES.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[TransferPurpose.SPLIT_YOUR_PAYCHECK.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[TransferPurpose.CASH_CUSHION.ordinal()] = 7;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[TransferPurpose.RECURRING_INVESTMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[TransferPurpose.REWARDS_MATCHING.ordinal()] = 9;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[TransferPurpose.REWARDS_ROUNDUP.ordinal()] = 10;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[TransferPurpose.CASHBACK_REDEMPTION_CC.ordinal()] = 11;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[TransferPurpose.CM_MIGRATION_BILLPAY.ordinal()] = 12;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[TransferPurpose.CM_MIGRATION_DISPUTES_ARBITRATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[TransferPurpose.CM_MIGRATION_DISPUTES_CHARGEBACK.ordinal()] = 14;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[TransferPurpose.CM_MIGRATION_DISPUTES_SECOND_PRESENTMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[TransferPurpose.CM_MIGRATION_SETTLE_PENDING_AUTH.ordinal()] = 16;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[TransferPurpose.NOA_REDIRECT.ordinal()] = 17;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[TransferPurpose.UNKNOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final int getLabelResId(TransferState transferState) {
        Intrinsics.checkNotNullParameter(transferState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[transferState.ordinal()]) {
            case 1:
                return C41787R.string.minerva_rhy_transfer_state_unknown;
            case 2:
                return C41787R.string.minerva_rhy_transfer_state_cancelled;
            case 3:
                return C41787R.string.minerva_rhy_transfer_state_completed;
            case 4:
                return C41787R.string.minerva_rhy_transfer_state_failed;
            case 5:
                return C41787R.string.minerva_rhy_transfer_state_new;
            case 6:
                return C39006R.string.minerva_ach_transfer_state_in_review;
            case 7:
            case 8:
                return C41787R.string.minerva_rhy_transfer_state_pending;
            case 9:
                return C41787R.string.minerva_rhy_transfer_state_pending_cancel;
            case 10:
                return C41787R.string.minerva_rhy_transfer_state_ready;
            case 11:
                return C41787R.string.minerva_rhy_transfer_state_reversed;
            case 12:
                return C41787R.string.minerva_rhy_transfer_state_rejected;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getLabelResId(DebitCardTransferState debitCardTransferState) {
        Intrinsics.checkNotNullParameter(debitCardTransferState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[debitCardTransferState.ordinal()]) {
            case 1:
                return C41787R.string.minerva_rhy_transfer_state_new;
            case 2:
                return C41787R.string.minerva_rhy_transfer_state_ready;
            case 3:
                return C11048R.string.general_label_paused;
            case 4:
                return C41787R.string.minerva_rhy_transfer_state_completed;
            case 5:
                return C41787R.string.minerva_rhy_transfer_state_reversed;
            case 6:
                return C41787R.string.minerva_rhy_transfer_state_failed;
            case 7:
                return C39006R.string.debit_card_transfer_state_disputed;
            case 8:
                return C39006R.string.debit_card_transfer_state_reinstated;
            case 9:
                return C39006R.string.debit_card_transfer_state_refunded;
            case 10:
                return C11048R.string.general_label_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Integer getLabelResId(TransferPurpose transferPurpose) {
        Intrinsics.checkNotNullParameter(transferPurpose, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[transferPurpose.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return Integer.valueOf(C41787R.string.minerva_rhy_transfer_reason_account_issue);
            case 4:
                return Integer.valueOf(C41787R.string.minerva_rhy_transfer_reason_one_time_transfer);
            case 5:
                return Integer.valueOf(C41787R.string.minerva_rhy_transfer_reason_recurring_deposit);
            case 6:
                return Integer.valueOf(C41787R.string.minerva_rhy_transfer_reason_paycheck_investment);
            case 7:
                return Integer.valueOf(C41787R.string.minerva_rhy_transfer_reason_cash_cushion);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
