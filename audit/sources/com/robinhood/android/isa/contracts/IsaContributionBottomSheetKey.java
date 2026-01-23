package com.robinhood.android.isa.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionBottomSheetKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0006J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/isa/contracts/IsaContributionBottomSheetKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "taxYear", "", "<init>", "(Ljava/lang/String;I)V", "getAccountNumber", "()Ljava/lang/String;", "getTaxYear", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionBottomSheetKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<IsaContributionBottomSheetKey> CREATOR = new Creator();
    private final String accountNumber;
    private final int taxYear;

    /* compiled from: IsaContributionBottomSheetKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<IsaContributionBottomSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IsaContributionBottomSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IsaContributionBottomSheetKey(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IsaContributionBottomSheetKey[] newArray(int i) {
            return new IsaContributionBottomSheetKey[i];
        }
    }

    public static /* synthetic */ IsaContributionBottomSheetKey copy$default(IsaContributionBottomSheetKey isaContributionBottomSheetKey, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = isaContributionBottomSheetKey.accountNumber;
        }
        if ((i2 & 2) != 0) {
            i = isaContributionBottomSheetKey.taxYear;
        }
        return isaContributionBottomSheetKey.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTaxYear() {
        return this.taxYear;
    }

    public final IsaContributionBottomSheetKey copy(String accountNumber, int taxYear) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new IsaContributionBottomSheetKey(accountNumber, taxYear);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaContributionBottomSheetKey)) {
            return false;
        }
        IsaContributionBottomSheetKey isaContributionBottomSheetKey = (IsaContributionBottomSheetKey) other;
        return Intrinsics.areEqual(this.accountNumber, isaContributionBottomSheetKey.accountNumber) && this.taxYear == isaContributionBottomSheetKey.taxYear;
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + Integer.hashCode(this.taxYear);
    }

    public String toString() {
        return "IsaContributionBottomSheetKey(accountNumber=" + this.accountNumber + ", taxYear=" + this.taxYear + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeInt(this.taxYear);
    }

    public IsaContributionBottomSheetKey(String accountNumber, int i) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.taxYear = i;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final int getTaxYear() {
        return this.taxYear;
    }
}
