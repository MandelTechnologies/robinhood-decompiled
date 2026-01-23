package com.robinhood.shared.crypto.transfer.send.review;

import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendReviewEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent;", "", "CompletedWithdrawal", "InputError", "MustShowWarningSheet", "StartSuv", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$CompletedWithdrawal;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$InputError;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$MustShowWarningSheet;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$StartSuv;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoTransferSendReviewEvent {

    /* compiled from: CryptoTransferSendReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$CompletedWithdrawal;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent;", "withdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "<init>", "(Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;)V", "getWithdrawal", "()Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CompletedWithdrawal implements CryptoTransferSendReviewEvent {
        public static final int $stable = 8;
        private final CryptoTransferWithdrawal withdrawal;

        public static /* synthetic */ CompletedWithdrawal copy$default(CompletedWithdrawal completedWithdrawal, CryptoTransferWithdrawal cryptoTransferWithdrawal, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoTransferWithdrawal = completedWithdrawal.withdrawal;
            }
            return completedWithdrawal.copy(cryptoTransferWithdrawal);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferWithdrawal getWithdrawal() {
            return this.withdrawal;
        }

        public final CompletedWithdrawal copy(CryptoTransferWithdrawal withdrawal) {
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            return new CompletedWithdrawal(withdrawal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CompletedWithdrawal) && Intrinsics.areEqual(this.withdrawal, ((CompletedWithdrawal) other).withdrawal);
        }

        public int hashCode() {
            return this.withdrawal.hashCode();
        }

        public String toString() {
            return "CompletedWithdrawal(withdrawal=" + this.withdrawal + ")";
        }

        public CompletedWithdrawal(CryptoTransferWithdrawal withdrawal) {
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            this.withdrawal = withdrawal;
        }

        public final CryptoTransferWithdrawal getWithdrawal() {
            return this.withdrawal;
        }
    }

    /* compiled from: CryptoTransferSendReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$InputError;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputError implements CryptoTransferSendReviewEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ InputError copy$default(InputError inputError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = inputError.throwable;
            }
            return inputError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final InputError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new InputError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InputError) && Intrinsics.areEqual(this.throwable, ((InputError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "InputError(throwable=" + this.throwable + ")";
        }

        public InputError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: CryptoTransferSendReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$MustShowWarningSheet;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MustShowWarningSheet implements CryptoTransferSendReviewEvent {
        public static final int $stable = 0;
        public static final MustShowWarningSheet INSTANCE = new MustShowWarningSheet();

        public boolean equals(Object other) {
            return this == other || (other instanceof MustShowWarningSheet);
        }

        public int hashCode() {
            return -782010173;
        }

        public String toString() {
            return "MustShowWarningSheet";
        }

        private MustShowWarningSheet() {
        }
    }

    /* compiled from: CryptoTransferSendReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent$StartSuv;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartSuv implements CryptoTransferSendReviewEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ StartSuv copy$default(StartSuv startSuv, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = startSuv.workflowId;
            }
            if ((i & 2) != 0) {
                z = startSuv.isMigrated;
            }
            return startSuv.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final StartSuv copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new StartSuv(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartSuv)) {
                return false;
            }
            StartSuv startSuv = (StartSuv) other;
            return Intrinsics.areEqual(this.workflowId, startSuv.workflowId) && this.isMigrated == startSuv.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "StartSuv(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public StartSuv(UUID workflowId, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        public final boolean isMigrated() {
            return this.isMigrated;
        }
    }
}
