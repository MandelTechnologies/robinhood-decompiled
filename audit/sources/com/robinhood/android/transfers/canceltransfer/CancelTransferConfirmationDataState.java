package com.robinhood.android.transfers.canceltransfer;

import com.robinhood.shared.models.history.MinervaTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CancelTransferConfirmationDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDataState;", "", "transaction", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "isCancelingTransfer", "", "<init>", "(Lcom/robinhood/shared/models/history/MinervaTransaction;Z)V", "getTransaction", "()Lcom/robinhood/shared/models/history/MinervaTransaction;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CancelTransferConfirmationDataState {
    public static final int $stable = 8;
    private final boolean isCancelingTransfer;
    private final MinervaTransaction transaction;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelTransferConfirmationDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CancelTransferConfirmationDataState copy$default(CancelTransferConfirmationDataState cancelTransferConfirmationDataState, MinervaTransaction minervaTransaction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            minervaTransaction = cancelTransferConfirmationDataState.transaction;
        }
        if ((i & 2) != 0) {
            z = cancelTransferConfirmationDataState.isCancelingTransfer;
        }
        return cancelTransferConfirmationDataState.copy(minervaTransaction, z);
    }

    /* renamed from: component1, reason: from getter */
    public final MinervaTransaction getTransaction() {
        return this.transaction;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCancelingTransfer() {
        return this.isCancelingTransfer;
    }

    public final CancelTransferConfirmationDataState copy(MinervaTransaction transaction, boolean isCancelingTransfer) {
        return new CancelTransferConfirmationDataState(transaction, isCancelingTransfer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelTransferConfirmationDataState)) {
            return false;
        }
        CancelTransferConfirmationDataState cancelTransferConfirmationDataState = (CancelTransferConfirmationDataState) other;
        return Intrinsics.areEqual(this.transaction, cancelTransferConfirmationDataState.transaction) && this.isCancelingTransfer == cancelTransferConfirmationDataState.isCancelingTransfer;
    }

    public int hashCode() {
        MinervaTransaction minervaTransaction = this.transaction;
        return ((minervaTransaction == null ? 0 : minervaTransaction.hashCode()) * 31) + Boolean.hashCode(this.isCancelingTransfer);
    }

    public String toString() {
        return "CancelTransferConfirmationDataState(transaction=" + this.transaction + ", isCancelingTransfer=" + this.isCancelingTransfer + ")";
    }

    public CancelTransferConfirmationDataState(MinervaTransaction minervaTransaction, boolean z) {
        this.transaction = minervaTransaction;
        this.isCancelingTransfer = z;
    }

    public /* synthetic */ CancelTransferConfirmationDataState(MinervaTransaction minervaTransaction, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : minervaTransaction, (i & 2) != 0 ? false : z);
    }

    public final MinervaTransaction getTransaction() {
        return this.transaction;
    }

    public final boolean isCancelingTransfer() {
        return this.isCancelingTransfer;
    }
}
