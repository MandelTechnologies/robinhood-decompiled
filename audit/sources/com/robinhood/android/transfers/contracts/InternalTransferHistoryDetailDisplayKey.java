package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.shared.models.history.shared.TransactionReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalTransferHistoryDetailDisplayKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/InternalTransferHistoryDetailDisplayKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "<init>", "(Lcom/robinhood/shared/models/history/shared/TransactionReference;)V", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class InternalTransferHistoryDetailDisplayKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<InternalTransferHistoryDetailDisplayKey> CREATOR = new Creator();
    private final TransactionReference transactionReference;

    /* compiled from: InternalTransferHistoryDetailDisplayKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<InternalTransferHistoryDetailDisplayKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalTransferHistoryDetailDisplayKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InternalTransferHistoryDetailDisplayKey((TransactionReference) parcel.readParcelable(InternalTransferHistoryDetailDisplayKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalTransferHistoryDetailDisplayKey[] newArray(int i) {
            return new InternalTransferHistoryDetailDisplayKey[i];
        }
    }

    public static /* synthetic */ InternalTransferHistoryDetailDisplayKey copy$default(InternalTransferHistoryDetailDisplayKey internalTransferHistoryDetailDisplayKey, TransactionReference transactionReference, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionReference = internalTransferHistoryDetailDisplayKey.transactionReference;
        }
        return internalTransferHistoryDetailDisplayKey.copy(transactionReference);
    }

    /* renamed from: component1, reason: from getter */
    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    public final InternalTransferHistoryDetailDisplayKey copy(TransactionReference transactionReference) {
        Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
        return new InternalTransferHistoryDetailDisplayKey(transactionReference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InternalTransferHistoryDetailDisplayKey) && Intrinsics.areEqual(this.transactionReference, ((InternalTransferHistoryDetailDisplayKey) other).transactionReference);
    }

    public int hashCode() {
        return this.transactionReference.hashCode();
    }

    public String toString() {
        return "InternalTransferHistoryDetailDisplayKey(transactionReference=" + this.transactionReference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.transactionReference, flags);
    }

    public InternalTransferHistoryDetailDisplayKey(TransactionReference transactionReference) {
        Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
        this.transactionReference = transactionReference;
    }

    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
