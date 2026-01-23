package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J-\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementTabFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabKey;", "accountNumber", "", "entryPoint", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;)V", "getAccountNumber", "()Ljava/lang/String;", "getEntryPoint", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RetirementTabFragmentKey implements FragmentKey, TabFragmentKey, AccountSelectorTabKey {
    public static final Parcelable.Creator<RetirementTabFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final AccountSelectorTabArgs accountSelectorTabArgs;
    private final String entryPoint;

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RetirementTabFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementTabFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetirementTabFragmentKey(parcel.readString(), parcel.readString(), (AccountSelectorTabArgs) parcel.readParcelable(RetirementTabFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementTabFragmentKey[] newArray(int i) {
            return new RetirementTabFragmentKey[i];
        }
    }

    public RetirementTabFragmentKey() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RetirementTabFragmentKey copy$default(RetirementTabFragmentKey retirementTabFragmentKey, String str, String str2, AccountSelectorTabArgs accountSelectorTabArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementTabFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = retirementTabFragmentKey.entryPoint;
        }
        if ((i & 4) != 0) {
            accountSelectorTabArgs = retirementTabFragmentKey.accountSelectorTabArgs;
        }
        return retirementTabFragmentKey.copy(str, str2, accountSelectorTabArgs);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }

    public final RetirementTabFragmentKey copy(String accountNumber, String entryPoint, AccountSelectorTabArgs accountSelectorTabArgs) {
        return new RetirementTabFragmentKey(accountNumber, entryPoint, accountSelectorTabArgs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementTabFragmentKey)) {
            return false;
        }
        RetirementTabFragmentKey retirementTabFragmentKey = (RetirementTabFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, retirementTabFragmentKey.accountNumber) && Intrinsics.areEqual(this.entryPoint, retirementTabFragmentKey.entryPoint) && Intrinsics.areEqual(this.accountSelectorTabArgs, retirementTabFragmentKey.accountSelectorTabArgs);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entryPoint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccountSelectorTabArgs accountSelectorTabArgs = this.accountSelectorTabArgs;
        return iHashCode2 + (accountSelectorTabArgs != null ? accountSelectorTabArgs.hashCode() : 0);
    }

    public String toString() {
        return "RetirementTabFragmentKey(accountNumber=" + this.accountNumber + ", entryPoint=" + this.entryPoint + ", accountSelectorTabArgs=" + this.accountSelectorTabArgs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.entryPoint);
        dest.writeParcelable(this.accountSelectorTabArgs, flags);
    }

    public RetirementTabFragmentKey(String str, String str2, AccountSelectorTabArgs accountSelectorTabArgs) {
        this.accountNumber = str;
        this.entryPoint = str2;
        this.accountSelectorTabArgs = accountSelectorTabArgs;
    }

    public /* synthetic */ RetirementTabFragmentKey(String str, String str2, AccountSelectorTabArgs accountSelectorTabArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : accountSelectorTabArgs);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    @Override // com.robinhood.android.redesign.accounttab.AccountSelectorTabKey
    public AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.RETIREMENT;
    }
}
