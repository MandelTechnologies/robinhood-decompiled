package com.robinhood.shared.account.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNavigationTabFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/AccountNavigationTabFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "isCrypto", "", "canShowGoldBadge", "quickActions", "", "Lcom/robinhood/shared/account/contracts/QuickAction;", "accountNumber", "", "<init>", "(ZZLjava/util/List;Ljava/lang/String;)V", "()Z", "getCanShowGoldBadge", "getQuickActions", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class AccountNavigationTabFragmentKey implements TabFragmentKey {
    public static final Parcelable.Creator<AccountNavigationTabFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean canShowGoldBadge;
    private final boolean isCrypto;
    private final List<QuickAction> quickActions;

    /* compiled from: AccountNavigationTabFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<AccountNavigationTabFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationTabFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(QuickAction.CREATOR.createFromParcel(parcel));
            }
            return new AccountNavigationTabFragmentKey(z, z2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationTabFragmentKey[] newArray(int i) {
            return new AccountNavigationTabFragmentKey[i];
        }
    }

    public AccountNavigationTabFragmentKey() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountNavigationTabFragmentKey copy$default(AccountNavigationTabFragmentKey accountNavigationTabFragmentKey, boolean z, boolean z2, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountNavigationTabFragmentKey.isCrypto;
        }
        if ((i & 2) != 0) {
            z2 = accountNavigationTabFragmentKey.canShowGoldBadge;
        }
        if ((i & 4) != 0) {
            list = accountNavigationTabFragmentKey.quickActions;
        }
        if ((i & 8) != 0) {
            str = accountNavigationTabFragmentKey.accountNumber;
        }
        return accountNavigationTabFragmentKey.copy(z, z2, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanShowGoldBadge() {
        return this.canShowGoldBadge;
    }

    public final List<QuickAction> component3() {
        return this.quickActions;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final AccountNavigationTabFragmentKey copy(boolean isCrypto, boolean canShowGoldBadge, List<QuickAction> quickActions, String accountNumber) {
        Intrinsics.checkNotNullParameter(quickActions, "quickActions");
        return new AccountNavigationTabFragmentKey(isCrypto, canShowGoldBadge, quickActions, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountNavigationTabFragmentKey)) {
            return false;
        }
        AccountNavigationTabFragmentKey accountNavigationTabFragmentKey = (AccountNavigationTabFragmentKey) other;
        return this.isCrypto == accountNavigationTabFragmentKey.isCrypto && this.canShowGoldBadge == accountNavigationTabFragmentKey.canShowGoldBadge && Intrinsics.areEqual(this.quickActions, accountNavigationTabFragmentKey.quickActions) && Intrinsics.areEqual(this.accountNumber, accountNavigationTabFragmentKey.accountNumber);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isCrypto) * 31) + Boolean.hashCode(this.canShowGoldBadge)) * 31) + this.quickActions.hashCode()) * 31;
        String str = this.accountNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AccountNavigationTabFragmentKey(isCrypto=" + this.isCrypto + ", canShowGoldBadge=" + this.canShowGoldBadge + ", quickActions=" + this.quickActions + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isCrypto ? 1 : 0);
        dest.writeInt(this.canShowGoldBadge ? 1 : 0);
        List<QuickAction> list = this.quickActions;
        dest.writeInt(list.size());
        Iterator<QuickAction> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.accountNumber);
    }

    public AccountNavigationTabFragmentKey(boolean z, boolean z2, List<QuickAction> quickActions, String str) {
        Intrinsics.checkNotNullParameter(quickActions, "quickActions");
        this.isCrypto = z;
        this.canShowGoldBadge = z2;
        this.quickActions = quickActions;
        this.accountNumber = str;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final boolean getCanShowGoldBadge() {
        return this.canShowGoldBadge;
    }

    public /* synthetic */ AccountNavigationTabFragmentKey(boolean z, boolean z2, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str);
    }

    public final List<QuickAction> getQuickActions() {
        return this.quickActions;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }
}
