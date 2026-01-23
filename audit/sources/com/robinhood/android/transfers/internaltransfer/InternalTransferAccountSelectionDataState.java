package com.robinhood.android.transfers.internaltransfer;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalTransferAccountSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDataState;", "", "accounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternalTransferAccountSelectionDataState {
    public static final int $stable = 8;
    private final List<TransferAccount> accounts;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalTransferAccountSelectionDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InternalTransferAccountSelectionDataState copy$default(InternalTransferAccountSelectionDataState internalTransferAccountSelectionDataState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = internalTransferAccountSelectionDataState.accounts;
        }
        return internalTransferAccountSelectionDataState.copy(list);
    }

    public final List<TransferAccount> component1() {
        return this.accounts;
    }

    public final InternalTransferAccountSelectionDataState copy(List<TransferAccount> accounts2) {
        return new InternalTransferAccountSelectionDataState(accounts2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InternalTransferAccountSelectionDataState) && Intrinsics.areEqual(this.accounts, ((InternalTransferAccountSelectionDataState) other).accounts);
    }

    public int hashCode() {
        List<TransferAccount> list = this.accounts;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "InternalTransferAccountSelectionDataState(accounts=" + this.accounts + ")";
    }

    public InternalTransferAccountSelectionDataState(List<TransferAccount> list) {
        this.accounts = list;
    }

    public /* synthetic */ InternalTransferAccountSelectionDataState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<TransferAccount> getAccounts() {
        return this.accounts;
    }
}
