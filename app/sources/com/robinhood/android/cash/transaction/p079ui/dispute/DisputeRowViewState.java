package com.robinhood.android.cash.transaction.p079ui.dispute;

import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.common.C11048R;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.p320db.mcduckling.Dispute;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeRowViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0011HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowViewState;", "", "isSingle", "", "dispute", "Lcom/robinhood/models/db/mcduckling/Dispute;", "<init>", "(ZLcom/robinhood/models/db/mcduckling/Dispute;)V", "()Z", "getDispute", "()Lcom/robinhood/models/db/mcduckling/Dispute;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "isDisputeCancelButtonVisible", "disputeStateLabelResId", "", "getDisputeStateLabelResId", "()I", "disputeStateDescResId", "getDisputeStateDescResId", "disputeReasonLabelResId", "getDisputeReasonLabelResId", "disputeReasonTimelineResId", "getDisputeReasonTimelineResId", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DisputeRowViewState {
    public static final int $stable = 8;
    private final Dispute dispute;
    private final int disputeReasonLabelResId;
    private final int disputeReasonTimelineResId;
    private final int disputeStateDescResId;
    private final int disputeStateLabelResId;
    private final UUID id;
    private final boolean isDisputeCancelButtonVisible;
    private final boolean isSingle;

    /* compiled from: DisputeRowViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiDispute.State.values().length];
            try {
                iArr[ApiDispute.State.RHY_SUBMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDispute.State.SUBMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDispute.State.PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiDispute.State.PROVISIONAL_CREDITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiDispute.State.NOT_CREDITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiDispute.State.CREDITED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiDispute.State.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiDispute.State.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiDispute.Reason.values().length];
            try {
                iArr2[ApiDispute.Reason.FUNDS_NOT_DISPENSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiDispute.Reason.DUPLICATE_CHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ApiDispute.Reason.INCORRECTLY_BILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ApiDispute.Reason.ALREADY_PAID.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ApiDispute.Reason.CANCELLED_RECURRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ApiDispute.Reason.GOODS_NOT_RECEIVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ApiDispute.Reason.DEFECTIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ApiDispute.Reason.CREDIT_NOT_PROCESSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ApiDispute.Reason.UNAUTHORIZED_TRANSACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ApiDispute.Reason.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ DisputeRowViewState copy$default(DisputeRowViewState disputeRowViewState, boolean z, Dispute dispute, int i, Object obj) {
        if ((i & 1) != 0) {
            z = disputeRowViewState.isSingle;
        }
        if ((i & 2) != 0) {
            dispute = disputeRowViewState.dispute;
        }
        return disputeRowViewState.copy(z, dispute);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSingle() {
        return this.isSingle;
    }

    /* renamed from: component2, reason: from getter */
    public final Dispute getDispute() {
        return this.dispute;
    }

    public final DisputeRowViewState copy(boolean isSingle, Dispute dispute) {
        Intrinsics.checkNotNullParameter(dispute, "dispute");
        return new DisputeRowViewState(isSingle, dispute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisputeRowViewState)) {
            return false;
        }
        DisputeRowViewState disputeRowViewState = (DisputeRowViewState) other;
        return this.isSingle == disputeRowViewState.isSingle && Intrinsics.areEqual(this.dispute, disputeRowViewState.dispute);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSingle) * 31) + this.dispute.hashCode();
    }

    public String toString() {
        return "DisputeRowViewState(isSingle=" + this.isSingle + ", dispute=" + this.dispute + ")";
    }

    public DisputeRowViewState(boolean z, Dispute dispute) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(dispute, "dispute");
        this.isSingle = z;
        this.dispute = dispute;
        this.id = dispute.getId();
        this.isDisputeCancelButtonVisible = dispute.getCanCancel();
        ApiDispute.State state = dispute.getState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[state.ordinal()]) {
            case 1:
            case 2:
                i = C10421R.string.dispute_state_submitted;
                break;
            case 3:
                i = C10421R.string.dispute_state_processing;
                break;
            case 4:
                i = C10421R.string.dispute_state_provisional_credited;
                break;
            case 5:
                i = C10421R.string.dispute_state_not_credited;
                break;
            case 6:
                i = C10421R.string.dispute_state_credited;
                break;
            case 7:
                i = C10421R.string.dispute_state_canceled;
                break;
            case 8:
                i = C11048R.string.general_label_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.disputeStateLabelResId = i;
        switch (iArr[dispute.getState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                i2 = C10421R.string.dispute_state_desc_submitted_processing;
                break;
            case 4:
                i2 = C10421R.string.dispute_state_desc_provisional_credited;
                break;
            case 5:
                i2 = C10421R.string.dispute_state_desc_not_credited;
                break;
            case 6:
                i2 = C10421R.string.dispute_state_desc_credited;
                break;
            case 7:
                i2 = C10421R.string.dispute_state_desc_canceled;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.disputeStateDescResId = i2;
        ApiDispute.Reason reason = dispute.getReason();
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
        switch (iArr2[reason.ordinal()]) {
            case 1:
                i3 = C10421R.string.dispute_reason_funds_not_dispensed;
                break;
            case 2:
                i3 = C10421R.string.dispute_reason_duplicate_charge;
                break;
            case 3:
                i3 = C10421R.string.dispute_reason_incorrectly_billed;
                break;
            case 4:
                i3 = C10421R.string.dispute_reason_already_paid;
                break;
            case 5:
                i3 = C10421R.string.dispute_reason_cancelled_recurring;
                break;
            case 6:
                i3 = C10421R.string.dispute_reason_goods_not_received;
                break;
            case 7:
                i3 = C10421R.string.dispute_reason_defective;
                break;
            case 8:
                i3 = C10421R.string.dispute_reason_credit_not_processed;
                break;
            case 9:
                i3 = C10421R.string.dispute_reason_unauthorized_transaction;
                break;
            case 10:
                i3 = C10421R.string.dispute_reason_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.disputeReasonLabelResId = i3;
        int i5 = iArr2[dispute.getReason().ordinal()];
        if (i5 == 1) {
            i4 = C10421R.string.dispute_reason_timeline_funds_not_dispensed;
        } else if (i5 == 9) {
            i4 = C10421R.string.dispute_reason_timeline_unauthorized_transaction;
        } else {
            i4 = C10421R.string.dispute_reason_timeline_standard;
        }
        this.disputeReasonTimelineResId = i4;
    }

    public final Dispute getDispute() {
        return this.dispute;
    }

    public final boolean isSingle() {
        return this.isSingle;
    }

    public final UUID getId() {
        return this.id;
    }

    /* renamed from: isDisputeCancelButtonVisible, reason: from getter */
    public final boolean getIsDisputeCancelButtonVisible() {
        return this.isDisputeCancelButtonVisible;
    }

    public final int getDisputeStateLabelResId() {
        return this.disputeStateLabelResId;
    }

    public final int getDisputeStateDescResId() {
        return this.disputeStateDescResId;
    }

    public final int getDisputeReasonLabelResId() {
        return this.disputeReasonLabelResId;
    }

    public final int getDisputeReasonTimelineResId() {
        return this.disputeReasonTimelineResId;
    }
}
