package com.robinhood.android.history.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.shared.models.history.shared.TransactionReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashManagementCardTransactionDetailV2FragmentKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/CashManagementCardTransactionDetailV2FragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "fromDeepLink", "", "<init>", "(Lcom/robinhood/shared/models/history/shared/TransactionReference;Z)V", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getFromDeepLink", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CashManagementCardTransactionDetailV2FragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<CashManagementCardTransactionDetailV2FragmentKey> CREATOR = new Creator();
    private final boolean fromDeepLink;
    private final TransactionReference transactionReference;

    /* compiled from: CashManagementCardTransactionDetailV2FragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<CashManagementCardTransactionDetailV2FragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashManagementCardTransactionDetailV2FragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashManagementCardTransactionDetailV2FragmentKey((TransactionReference) parcel.readParcelable(CashManagementCardTransactionDetailV2FragmentKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashManagementCardTransactionDetailV2FragmentKey[] newArray(int i) {
            return new CashManagementCardTransactionDetailV2FragmentKey[i];
        }
    }

    public static /* synthetic */ CashManagementCardTransactionDetailV2FragmentKey copy$default(CashManagementCardTransactionDetailV2FragmentKey cashManagementCardTransactionDetailV2FragmentKey, TransactionReference transactionReference, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionReference = cashManagementCardTransactionDetailV2FragmentKey.transactionReference;
        }
        if ((i & 2) != 0) {
            z = cashManagementCardTransactionDetailV2FragmentKey.fromDeepLink;
        }
        return cashManagementCardTransactionDetailV2FragmentKey.copy(transactionReference, z);
    }

    /* renamed from: component1, reason: from getter */
    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    public final CashManagementCardTransactionDetailV2FragmentKey copy(TransactionReference transactionReference, boolean fromDeepLink) {
        Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
        return new CashManagementCardTransactionDetailV2FragmentKey(transactionReference, fromDeepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashManagementCardTransactionDetailV2FragmentKey)) {
            return false;
        }
        CashManagementCardTransactionDetailV2FragmentKey cashManagementCardTransactionDetailV2FragmentKey = (CashManagementCardTransactionDetailV2FragmentKey) other;
        return Intrinsics.areEqual(this.transactionReference, cashManagementCardTransactionDetailV2FragmentKey.transactionReference) && this.fromDeepLink == cashManagementCardTransactionDetailV2FragmentKey.fromDeepLink;
    }

    public int hashCode() {
        return (this.transactionReference.hashCode() * 31) + Boolean.hashCode(this.fromDeepLink);
    }

    public String toString() {
        return "CashManagementCardTransactionDetailV2FragmentKey(transactionReference=" + this.transactionReference + ", fromDeepLink=" + this.fromDeepLink + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.transactionReference, flags);
        dest.writeInt(this.fromDeepLink ? 1 : 0);
    }

    public CashManagementCardTransactionDetailV2FragmentKey(TransactionReference transactionReference, boolean z) {
        Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
        this.transactionReference = transactionReference;
        this.fromDeepLink = z;
    }

    public final TransactionReference getTransactionReference() {
        return this.transactionReference;
    }

    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SPENDING;
    }
}
