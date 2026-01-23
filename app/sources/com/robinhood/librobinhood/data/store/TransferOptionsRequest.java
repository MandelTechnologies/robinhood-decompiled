package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.transfer.CryptoTransferAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TransferOptionsRequest;", "", "accountNumber", "", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "entryPointIdentifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/transfer/CryptoTransferAction;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "getEntryPointIdentifier", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class TransferOptionsRequest {
    private final String accountNumber;
    private final CryptoTransferAction action;
    private final String entryPointIdentifier;

    public static /* synthetic */ TransferOptionsRequest copy$default(TransferOptionsRequest transferOptionsRequest, String str, CryptoTransferAction cryptoTransferAction, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferOptionsRequest.accountNumber;
        }
        if ((i & 2) != 0) {
            cryptoTransferAction = transferOptionsRequest.action;
        }
        if ((i & 4) != 0) {
            str2 = transferOptionsRequest.entryPointIdentifier;
        }
        return transferOptionsRequest.copy(str, cryptoTransferAction, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoTransferAction getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final TransferOptionsRequest copy(String accountNumber, CryptoTransferAction action, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new TransferOptionsRequest(accountNumber, action, entryPointIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferOptionsRequest)) {
            return false;
        }
        TransferOptionsRequest transferOptionsRequest = (TransferOptionsRequest) other;
        return Intrinsics.areEqual(this.accountNumber, transferOptionsRequest.accountNumber) && this.action == transferOptionsRequest.action && Intrinsics.areEqual(this.entryPointIdentifier, transferOptionsRequest.entryPointIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        CryptoTransferAction cryptoTransferAction = this.action;
        int iHashCode2 = (iHashCode + (cryptoTransferAction == null ? 0 : cryptoTransferAction.hashCode())) * 31;
        String str = this.entryPointIdentifier;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TransferOptionsRequest(accountNumber=" + this.accountNumber + ", action=" + this.action + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    public TransferOptionsRequest(String accountNumber, CryptoTransferAction cryptoTransferAction, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.action = cryptoTransferAction;
        this.entryPointIdentifier = str;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final CryptoTransferAction getAction() {
        return this.action;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }
}
