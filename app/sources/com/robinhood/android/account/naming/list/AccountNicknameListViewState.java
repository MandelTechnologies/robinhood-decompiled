package com.robinhood.android.account.naming.list;

import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameListState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/naming/list/AccountNicknameListViewState;", "", "accountSelectorData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "<init>", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;)V", "getAccountSelectorData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountNicknameListViewState {
    public static final int $stable = 8;
    private final AccountSelectorData accountSelectorData;

    public static /* synthetic */ AccountNicknameListViewState copy$default(AccountNicknameListViewState accountNicknameListViewState, AccountSelectorData accountSelectorData, int i, Object obj) {
        if ((i & 1) != 0) {
            accountSelectorData = accountNicknameListViewState.accountSelectorData;
        }
        return accountNicknameListViewState.copy(accountSelectorData);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountSelectorData getAccountSelectorData() {
        return this.accountSelectorData;
    }

    public final AccountNicknameListViewState copy(AccountSelectorData accountSelectorData) {
        Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
        return new AccountNicknameListViewState(accountSelectorData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountNicknameListViewState) && Intrinsics.areEqual(this.accountSelectorData, ((AccountNicknameListViewState) other).accountSelectorData);
    }

    public int hashCode() {
        return this.accountSelectorData.hashCode();
    }

    public String toString() {
        return "AccountNicknameListViewState(accountSelectorData=" + this.accountSelectorData + ")";
    }

    public AccountNicknameListViewState(AccountSelectorData accountSelectorData) {
        Intrinsics.checkNotNullParameter(accountSelectorData, "accountSelectorData");
        this.accountSelectorData = accountSelectorData;
    }

    public final AccountSelectorData getAccountSelectorData() {
        return this.accountSelectorData;
    }
}
