package com.robinhood.android.redesign.accounttab.deeplink;

import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabTarget.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabTarget;", "", "accountTabTarget", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "<init>", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;)V", "getAccountTabTarget", "()Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "consumed", "", "getConsumed", "()Z", "setConsumed", "(Z)V", "consume", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountTabTarget {
    public static final int $stable = 8;
    private final AccountTabInfo.Account accountTabTarget;
    private boolean consumed;

    public static /* synthetic */ AccountTabTarget copy$default(AccountTabTarget accountTabTarget, AccountTabInfo.Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            account = accountTabTarget.accountTabTarget;
        }
        return accountTabTarget.copy(account);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountTabInfo.Account getAccountTabTarget() {
        return this.accountTabTarget;
    }

    public final AccountTabTarget copy(AccountTabInfo.Account accountTabTarget) {
        Intrinsics.checkNotNullParameter(accountTabTarget, "accountTabTarget");
        return new AccountTabTarget(accountTabTarget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountTabTarget) && Intrinsics.areEqual(this.accountTabTarget, ((AccountTabTarget) other).accountTabTarget);
    }

    public int hashCode() {
        return this.accountTabTarget.hashCode();
    }

    public String toString() {
        return "AccountTabTarget(accountTabTarget=" + this.accountTabTarget + ")";
    }

    public AccountTabTarget(AccountTabInfo.Account accountTabTarget) {
        Intrinsics.checkNotNullParameter(accountTabTarget, "accountTabTarget");
        this.accountTabTarget = accountTabTarget;
    }

    public final AccountTabInfo.Account getAccountTabTarget() {
        return this.accountTabTarget;
    }

    public final boolean getConsumed() {
        return this.consumed;
    }

    public final void setConsumed(boolean z) {
        this.consumed = z;
    }

    public final AccountTabInfo.Account consume() {
        if (this.consumed) {
            return null;
        }
        return this.accountTabTarget;
    }
}
