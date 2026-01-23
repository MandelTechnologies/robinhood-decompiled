package com.robinhood.android.cash.disputes.p070ui.submitted;

import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeSubmittedViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÂ\u0003J+\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0016HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState;", "", "disputeReason", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "minervaAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "<init>", "(Lcom/robinhood/models/api/minerva/ApiDispute$Reason;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "isTemporaryCreditAvailable", "", "isDoneButtonLoading", "()Z", "doneButtonAction", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction;", "getDoneButtonAction", "()Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction;", "isTemporaryCreditTextVisible", "isTemporaryCreditPogVisible", "isStatusChangePogVisible", "statusChangeTextGravity", "", "getStatusChangeTextGravity", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "PrimaryAction", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DisputeSubmittedViewState {
    public static final int $stable = 8;
    private final ApiDispute.Reason disputeReason;
    private final boolean isTemporaryCreditAvailable;
    private final MinervaAccount minervaAccount;
    private final PaymentCard paymentCard;

    /* compiled from: DisputeSubmittedViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiDispute.Reason.values().length];
            try {
                iArr[ApiDispute.Reason.FUNDS_NOT_DISPENSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDispute.Reason.DUPLICATE_CHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDispute.Reason.INCORRECTLY_BILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiDispute.Reason.ALREADY_PAID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiDispute.Reason.CANCELLED_RECURRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiDispute.Reason.UNAUTHORIZED_TRANSACTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiDispute.Reason.GOODS_NOT_RECEIVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiDispute.Reason.DEFECTIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiDispute.Reason.CREDIT_NOT_PROCESSED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiDispute.Reason.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final ApiDispute.Reason getDisputeReason() {
        return this.disputeReason;
    }

    /* renamed from: component2, reason: from getter */
    private final MinervaAccount getMinervaAccount() {
        return this.minervaAccount;
    }

    /* renamed from: component3, reason: from getter */
    private final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    public static /* synthetic */ DisputeSubmittedViewState copy$default(DisputeSubmittedViewState disputeSubmittedViewState, ApiDispute.Reason reason, MinervaAccount minervaAccount, PaymentCard paymentCard, int i, Object obj) {
        if ((i & 1) != 0) {
            reason = disputeSubmittedViewState.disputeReason;
        }
        if ((i & 2) != 0) {
            minervaAccount = disputeSubmittedViewState.minervaAccount;
        }
        if ((i & 4) != 0) {
            paymentCard = disputeSubmittedViewState.paymentCard;
        }
        return disputeSubmittedViewState.copy(reason, minervaAccount, paymentCard);
    }

    public final DisputeSubmittedViewState copy(ApiDispute.Reason disputeReason, MinervaAccount minervaAccount, PaymentCard paymentCard) {
        Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
        return new DisputeSubmittedViewState(disputeReason, minervaAccount, paymentCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisputeSubmittedViewState)) {
            return false;
        }
        DisputeSubmittedViewState disputeSubmittedViewState = (DisputeSubmittedViewState) other;
        return this.disputeReason == disputeSubmittedViewState.disputeReason && Intrinsics.areEqual(this.minervaAccount, disputeSubmittedViewState.minervaAccount) && Intrinsics.areEqual(this.paymentCard, disputeSubmittedViewState.paymentCard);
    }

    public int hashCode() {
        int iHashCode = this.disputeReason.hashCode() * 31;
        MinervaAccount minervaAccount = this.minervaAccount;
        int iHashCode2 = (iHashCode + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31;
        PaymentCard paymentCard = this.paymentCard;
        return iHashCode2 + (paymentCard != null ? paymentCard.hashCode() : 0);
    }

    public String toString() {
        return "DisputeSubmittedViewState(disputeReason=" + this.disputeReason + ", minervaAccount=" + this.minervaAccount + ", paymentCard=" + this.paymentCard + ")";
    }

    public DisputeSubmittedViewState(ApiDispute.Reason disputeReason, MinervaAccount minervaAccount, PaymentCard paymentCard) {
        boolean z;
        Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
        this.disputeReason = disputeReason;
        this.minervaAccount = minervaAccount;
        this.paymentCard = paymentCard;
        switch (WhenMappings.$EnumSwitchMapping$0[disputeReason.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z = true;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                z = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.isTemporaryCreditAvailable = z;
    }

    public /* synthetic */ DisputeSubmittedViewState(ApiDispute.Reason reason, MinervaAccount minervaAccount, PaymentCard paymentCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? null : minervaAccount, (i & 4) != 0 ? null : paymentCard);
    }

    public final boolean isDoneButtonLoading() {
        return this.minervaAccount == null || this.paymentCard == null;
    }

    public final PrimaryAction getDoneButtonAction() {
        PaymentCard paymentCard;
        if (this.disputeReason == ApiDispute.Reason.UNAUTHORIZED_TRANSACTION) {
            MinervaAccount minervaAccount = this.minervaAccount;
            if ((minervaAccount != null ? minervaAccount.getEnrollmentState() : null) == ApiMinervaAccount.EnrollmentState.UPGRADED && (paymentCard = this.paymentCard) != null && paymentCard.getCanReportStolen()) {
                return new PrimaryAction.StartNewCardFlow(this.paymentCard.getId());
            }
        }
        return PrimaryAction.CompleteDispute.INSTANCE;
    }

    public final boolean isTemporaryCreditTextVisible() {
        return this.isTemporaryCreditAvailable;
    }

    public final boolean isTemporaryCreditPogVisible() {
        return isTemporaryCreditTextVisible();
    }

    /* renamed from: isStatusChangePogVisible, reason: from getter */
    public final boolean getIsTemporaryCreditAvailable() {
        return this.isTemporaryCreditAvailable;
    }

    public final int getStatusChangeTextGravity() {
        return this.isTemporaryCreditAvailable ? 8388611 : 1;
    }

    /* compiled from: DisputeSubmittedViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction;", "", "<init>", "()V", "CompleteDispute", "StartNewCardFlow", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction$CompleteDispute;", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction$StartNewCardFlow;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PrimaryAction {
        public static final int $stable = 0;

        public /* synthetic */ PrimaryAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PrimaryAction() {
        }

        /* compiled from: DisputeSubmittedViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction$CompleteDispute;", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CompleteDispute extends PrimaryAction {
            public static final int $stable = 0;
            public static final CompleteDispute INSTANCE = new CompleteDispute();

            private CompleteDispute() {
                super(null);
            }
        }

        /* compiled from: DisputeSubmittedViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction$StartNewCardFlow;", "Lcom/robinhood/android/cash/disputes/ui/submitted/DisputeSubmittedViewState$PrimaryAction;", "cardId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCardId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StartNewCardFlow extends PrimaryAction {
            public static final int $stable = 8;
            private final UUID cardId;

            public static /* synthetic */ StartNewCardFlow copy$default(StartNewCardFlow startNewCardFlow, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = startNewCardFlow.cardId;
                }
                return startNewCardFlow.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCardId() {
                return this.cardId;
            }

            public final StartNewCardFlow copy(UUID cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return new StartNewCardFlow(cardId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StartNewCardFlow) && Intrinsics.areEqual(this.cardId, ((StartNewCardFlow) other).cardId);
            }

            public int hashCode() {
                return this.cardId.hashCode();
            }

            public String toString() {
                return "StartNewCardFlow(cardId=" + this.cardId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartNewCardFlow(UUID cardId) {
                super(null);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.cardId = cardId;
            }

            public final UUID getCardId() {
                return this.cardId;
            }
        }
    }
}
