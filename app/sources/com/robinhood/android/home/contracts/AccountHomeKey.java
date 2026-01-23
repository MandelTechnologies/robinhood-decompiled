package com.robinhood.android.home.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountHomeKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/home/contracts/AccountHomeKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabKey;", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "<init>", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;)V", "getDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getAccountSelectorTabArgs", "()Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AccountHomeKey implements FragmentKey, AccountSelectorTabKey {
    public static final Parcelable.Creator<AccountHomeKey> CREATOR = new Creator();
    private final AccountSelectorTabArgs accountSelectorTabArgs;
    private final HomeDashboardType dashboardType;

    /* compiled from: AccountHomeKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<AccountHomeKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountHomeKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountHomeKey((HomeDashboardType) parcel.readParcelable(AccountHomeKey.class.getClassLoader()), (AccountSelectorTabArgs) parcel.readParcelable(AccountHomeKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountHomeKey[] newArray(int i) {
            return new AccountHomeKey[i];
        }
    }

    public static /* synthetic */ AccountHomeKey copy$default(AccountHomeKey accountHomeKey, HomeDashboardType homeDashboardType, AccountSelectorTabArgs accountSelectorTabArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDashboardType = accountHomeKey.dashboardType;
        }
        if ((i & 2) != 0) {
            accountSelectorTabArgs = accountHomeKey.accountSelectorTabArgs;
        }
        return accountHomeKey.copy(homeDashboardType, accountSelectorTabArgs);
    }

    /* renamed from: component1, reason: from getter */
    public final HomeDashboardType getDashboardType() {
        return this.dashboardType;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }

    public final AccountHomeKey copy(HomeDashboardType dashboardType, AccountSelectorTabArgs accountSelectorTabArgs) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        return new AccountHomeKey(dashboardType, accountSelectorTabArgs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountHomeKey)) {
            return false;
        }
        AccountHomeKey accountHomeKey = (AccountHomeKey) other;
        return Intrinsics.areEqual(this.dashboardType, accountHomeKey.dashboardType) && Intrinsics.areEqual(this.accountSelectorTabArgs, accountHomeKey.accountSelectorTabArgs);
    }

    public int hashCode() {
        int iHashCode = this.dashboardType.hashCode() * 31;
        AccountSelectorTabArgs accountSelectorTabArgs = this.accountSelectorTabArgs;
        return iHashCode + (accountSelectorTabArgs == null ? 0 : accountSelectorTabArgs.hashCode());
    }

    public String toString() {
        return "AccountHomeKey(dashboardType=" + this.dashboardType + ", accountSelectorTabArgs=" + this.accountSelectorTabArgs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.dashboardType, flags);
        dest.writeParcelable(this.accountSelectorTabArgs, flags);
    }

    public AccountHomeKey(HomeDashboardType dashboardType, AccountSelectorTabArgs accountSelectorTabArgs) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        this.dashboardType = dashboardType;
        this.accountSelectorTabArgs = accountSelectorTabArgs;
    }

    public /* synthetic */ AccountHomeKey(HomeDashboardType homeDashboardType, AccountSelectorTabArgs accountSelectorTabArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(homeDashboardType, (i & 2) != 0 ? null : accountSelectorTabArgs);
    }

    public final HomeDashboardType getDashboardType() {
        return this.dashboardType;
    }

    @Override // com.robinhood.android.redesign.accounttab.AccountSelectorTabKey
    public AccountSelectorTabArgs getAccountSelectorTabArgs() {
        return this.accountSelectorTabArgs;
    }
}
