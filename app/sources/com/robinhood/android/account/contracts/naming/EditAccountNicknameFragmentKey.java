package com.robinhood.android.account.contracts.naming;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameKeys.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/naming/EditAccountNicknameFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class EditAccountNicknameFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<EditAccountNicknameFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String source;

    /* compiled from: AccountNicknameKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EditAccountNicknameFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditAccountNicknameFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditAccountNicknameFragmentKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditAccountNicknameFragmentKey[] newArray(int i) {
            return new EditAccountNicknameFragmentKey[i];
        }
    }

    public static /* synthetic */ EditAccountNicknameFragmentKey copy$default(EditAccountNicknameFragmentKey editAccountNicknameFragmentKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editAccountNicknameFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = editAccountNicknameFragmentKey.source;
        }
        return editAccountNicknameFragmentKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final EditAccountNicknameFragmentKey copy(String accountNumber, String source) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new EditAccountNicknameFragmentKey(accountNumber, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditAccountNicknameFragmentKey)) {
            return false;
        }
        EditAccountNicknameFragmentKey editAccountNicknameFragmentKey = (EditAccountNicknameFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, editAccountNicknameFragmentKey.accountNumber) && Intrinsics.areEqual(this.source, editAccountNicknameFragmentKey.source);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        String str = this.source;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EditAccountNicknameFragmentKey(accountNumber=" + this.accountNumber + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.source);
    }

    public EditAccountNicknameFragmentKey(String accountNumber, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.source = str;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getSource() {
        return this.source;
    }
}
