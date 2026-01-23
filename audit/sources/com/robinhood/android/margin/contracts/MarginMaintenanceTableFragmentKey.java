package com.robinhood.android.margin.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginMaintenanceTableFragmentKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/MarginMaintenanceTableFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "entryPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getEntryPoint", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginMaintenanceTableFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<MarginMaintenanceTableFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String entryPoint;

    /* compiled from: MarginMaintenanceTableFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginMaintenanceTableFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginMaintenanceTableFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginMaintenanceTableFragmentKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginMaintenanceTableFragmentKey[] newArray(int i) {
            return new MarginMaintenanceTableFragmentKey[i];
        }
    }

    public static /* synthetic */ MarginMaintenanceTableFragmentKey copy$default(MarginMaintenanceTableFragmentKey marginMaintenanceTableFragmentKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginMaintenanceTableFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = marginMaintenanceTableFragmentKey.entryPoint;
        }
        return marginMaintenanceTableFragmentKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final MarginMaintenanceTableFragmentKey copy(String accountNumber, String entryPoint) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new MarginMaintenanceTableFragmentKey(accountNumber, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginMaintenanceTableFragmentKey)) {
            return false;
        }
        MarginMaintenanceTableFragmentKey marginMaintenanceTableFragmentKey = (MarginMaintenanceTableFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, marginMaintenanceTableFragmentKey.accountNumber) && Intrinsics.areEqual(this.entryPoint, marginMaintenanceTableFragmentKey.entryPoint);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        String str = this.entryPoint;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MarginMaintenanceTableFragmentKey(accountNumber=" + this.accountNumber + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.entryPoint);
    }

    public MarginMaintenanceTableFragmentKey(String accountNumber, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.entryPoint = str;
    }

    public /* synthetic */ MarginMaintenanceTableFragmentKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }
}
