package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidSdk.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/PlaidSdk;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "bankAccountId", "", "transferId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBankAccountId", "()Ljava/lang/String;", "getTransferId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PlaidSdk implements IntentKey, Parcelable {
    public static final Parcelable.Creator<PlaidSdk> CREATOR = new Creator();
    private final String bankAccountId;
    private final String transferId;

    /* compiled from: PlaidSdk.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PlaidSdk> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidSdk createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlaidSdk(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidSdk[] newArray(int i) {
            return new PlaidSdk[i];
        }
    }

    public static /* synthetic */ PlaidSdk copy$default(PlaidSdk plaidSdk, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidSdk.bankAccountId;
        }
        if ((i & 2) != 0) {
            str2 = plaidSdk.transferId;
        }
        return plaidSdk.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBankAccountId() {
        return this.bankAccountId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    public final PlaidSdk copy(String bankAccountId, String transferId) {
        Intrinsics.checkNotNullParameter(bankAccountId, "bankAccountId");
        return new PlaidSdk(bankAccountId, transferId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaidSdk)) {
            return false;
        }
        PlaidSdk plaidSdk = (PlaidSdk) other;
        return Intrinsics.areEqual(this.bankAccountId, plaidSdk.bankAccountId) && Intrinsics.areEqual(this.transferId, plaidSdk.transferId);
    }

    public int hashCode() {
        int iHashCode = this.bankAccountId.hashCode() * 31;
        String str = this.transferId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PlaidSdk(bankAccountId=" + this.bankAccountId + ", transferId=" + this.transferId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bankAccountId);
        dest.writeString(this.transferId);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public PlaidSdk(String bankAccountId, String str) {
        Intrinsics.checkNotNullParameter(bankAccountId, "bankAccountId");
        this.bankAccountId = bankAccountId;
        this.transferId = str;
    }

    public final String getBankAccountId() {
        return this.bankAccountId;
    }

    public final String getTransferId() {
        return this.transferId;
    }
}
