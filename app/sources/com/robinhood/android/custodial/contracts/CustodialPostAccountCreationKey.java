package com.robinhood.android.custodial.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustodialOnboardingKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/custodial/contracts/CustodialPostAccountCreationKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "editNickname", "", "microgramApp", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getEditNickname", "()Z", "getMicrogramApp", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustodialPostAccountCreationKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<CustodialPostAccountCreationKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean editNickname;
    private final String microgramApp;

    /* compiled from: CustodialOnboardingKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CustodialPostAccountCreationKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustodialPostAccountCreationKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustodialPostAccountCreationKey(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustodialPostAccountCreationKey[] newArray(int i) {
            return new CustodialPostAccountCreationKey[i];
        }
    }

    public static /* synthetic */ CustodialPostAccountCreationKey copy$default(CustodialPostAccountCreationKey custodialPostAccountCreationKey, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = custodialPostAccountCreationKey.accountNumber;
        }
        if ((i & 2) != 0) {
            z = custodialPostAccountCreationKey.editNickname;
        }
        if ((i & 4) != 0) {
            str2 = custodialPostAccountCreationKey.microgramApp;
        }
        return custodialPostAccountCreationKey.copy(str, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEditNickname() {
        return this.editNickname;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMicrogramApp() {
        return this.microgramApp;
    }

    public final CustodialPostAccountCreationKey copy(String accountNumber, boolean editNickname, String microgramApp) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(microgramApp, "microgramApp");
        return new CustodialPostAccountCreationKey(accountNumber, editNickname, microgramApp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustodialPostAccountCreationKey)) {
            return false;
        }
        CustodialPostAccountCreationKey custodialPostAccountCreationKey = (CustodialPostAccountCreationKey) other;
        return Intrinsics.areEqual(this.accountNumber, custodialPostAccountCreationKey.accountNumber) && this.editNickname == custodialPostAccountCreationKey.editNickname && Intrinsics.areEqual(this.microgramApp, custodialPostAccountCreationKey.microgramApp);
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.editNickname)) * 31) + this.microgramApp.hashCode();
    }

    public String toString() {
        return "CustodialPostAccountCreationKey(accountNumber=" + this.accountNumber + ", editNickname=" + this.editNickname + ", microgramApp=" + this.microgramApp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeInt(this.editNickname ? 1 : 0);
        dest.writeString(this.microgramApp);
    }

    public CustodialPostAccountCreationKey(String accountNumber, boolean z, String microgramApp) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(microgramApp, "microgramApp");
        this.accountNumber = accountNumber;
        this.editNickname = z;
        this.microgramApp = microgramApp;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getEditNickname() {
        return this.editNickname;
    }

    public final String getMicrogramApp() {
        return this.microgramApp;
    }
}
