package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.models.transfer.shared.AchTransferState;
import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.transfers.models.p406db.AchTransfer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OriginatedAchTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/transfers/models/db/AchTransfer;", "getLabelResId", "(Lcom/robinhood/transfers/models/db/AchTransfer;)I", "Lcom/robinhood/android/models/transfer/shared/AchTransferState;", "(Lcom/robinhood/android/models/transfer/shared/AchTransferState;)I", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.OriginatedAchTransferFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OriginatedAchTransferFormatter2 {

    /* compiled from: OriginatedAchTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.formatters.legacy.OriginatedAchTransferFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AchTransferRhsState.values().length];
            try {
                iArr[AchTransferRhsState.REVIEWING_BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AchTransferRhsState.PENDING_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AchTransferRhsState.REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AchTransferRhsState.NEEDS_APPROVAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AchTransferRhsState.APPROVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AchTransferRhsState.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AchTransferRhsState.CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AchTransferRhsState.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AchTransferRhsState.SUBMITTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AchTransferRhsState.REVERSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AchTransferRhsState.COMPLETED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AchTransferRhsState.NEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AchTransferRhsState.PENDING_CANCEL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AchTransferRhsState.REQUESTING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AchTransferRhsState.ASKING_APPROVAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AchTransferRhsState.ABORTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AchTransferState.values().length];
            try {
                iArr2[AchTransferState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[AchTransferState.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AchTransferState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[AchTransferState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[AchTransferState.REVERSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[AchTransferState.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[AchTransferState.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResId(AchTransfer achTransfer) {
        AchTransferRhsState rhsState = achTransfer.getRhsState();
        switch (rhsState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rhsState.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return getLabelResId(achTransfer.getState());
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return C39006R.string.minerva_ach_transfer_state_in_review;
            case 2:
                return C39006R.string.minerva_ach_transfer_state_pending_confirmation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResId(AchTransferState achTransferState) {
        switch (WhenMappings.$EnumSwitchMapping$1[achTransferState.ordinal()]) {
            case 1:
                return C39006R.string.minerva_ach_transfer_state_pending;
            case 2:
                return C39006R.string.minerva_ach_transfer_state_pending;
            case 3:
                return C41787R.string.minerva_rhy_transfer_state_failed;
            case 4:
                return C39006R.string.minerva_ach_transfer_state_completed;
            case 5:
                return C39006R.string.minerva_ach_transfer_state_reversed;
            case 6:
                return C39006R.string.minerva_ach_transfer_state_cancelled;
            case 7:
                return C11048R.string.general_label_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
