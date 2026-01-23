package com.robinhood.android.indexes.detail.components.tradebar;

import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageTradeBarStates.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010'\u001a\u00020\tHÆ\u0003Jn\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;", "", "accountSwitcher", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "currentAccount", "hasAccessToOptions", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "loadingAccountSwitcher", "shouldShowOptionsUpgrade", "useSduiAccountSwitcher", "<init>", "(Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;Ljava/util/List;Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;Lcom/robinhood/android/indexes/models/db/Index;ZLjava/lang/Boolean;Z)V", "getAccountSwitcher", "()Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "getAllAccounts", "()Ljava/util/List;", "getCurrentAccount", "()Lcom/robinhood/models/db/Account;", "getHasAccessToOptions", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIndex", "()Lcom/robinhood/android/indexes/models/db/Index;", "getLoadingAccountSwitcher", "()Z", "getShouldShowOptionsUpgrade", "getUseSduiAccountSwitcher", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;Ljava/util/List;Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;Lcom/robinhood/android/indexes/models/db/Index;ZLjava/lang/Boolean;Z)Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexDetailPageTradeBarDataState {
    public static final int $stable = 8;
    private final AccountSwitcher accountSwitcher;
    private final List<Account> allAccounts;
    private final Account currentAccount;
    private final Boolean hasAccessToOptions;
    private final Index index;
    private final boolean loadingAccountSwitcher;
    private final Boolean shouldShowOptionsUpgrade;
    private final boolean useSduiAccountSwitcher;

    public IndexDetailPageTradeBarDataState() {
        this(null, null, null, null, null, false, null, false, 255, null);
    }

    public static /* synthetic */ IndexDetailPageTradeBarDataState copy$default(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, AccountSwitcher accountSwitcher, List list, Account account, Boolean bool, Index index, boolean z, Boolean bool2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            accountSwitcher = indexDetailPageTradeBarDataState.accountSwitcher;
        }
        if ((i & 2) != 0) {
            list = indexDetailPageTradeBarDataState.allAccounts;
        }
        if ((i & 4) != 0) {
            account = indexDetailPageTradeBarDataState.currentAccount;
        }
        if ((i & 8) != 0) {
            bool = indexDetailPageTradeBarDataState.hasAccessToOptions;
        }
        if ((i & 16) != 0) {
            index = indexDetailPageTradeBarDataState.index;
        }
        if ((i & 32) != 0) {
            z = indexDetailPageTradeBarDataState.loadingAccountSwitcher;
        }
        if ((i & 64) != 0) {
            bool2 = indexDetailPageTradeBarDataState.shouldShowOptionsUpgrade;
        }
        if ((i & 128) != 0) {
            z2 = indexDetailPageTradeBarDataState.useSduiAccountSwitcher;
        }
        Boolean bool3 = bool2;
        boolean z3 = z2;
        Index index2 = index;
        boolean z4 = z;
        return indexDetailPageTradeBarDataState.copy(accountSwitcher, list, account, bool, index2, z4, bool3, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    public final List<Account> component2() {
        return this.allAccounts;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getHasAccessToOptions() {
        return this.hasAccessToOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final Index getIndex() {
        return this.index;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getShouldShowOptionsUpgrade() {
        return this.shouldShowOptionsUpgrade;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    public final IndexDetailPageTradeBarDataState copy(AccountSwitcher accountSwitcher, List<Account> allAccounts, Account currentAccount, Boolean hasAccessToOptions, Index index, boolean loadingAccountSwitcher, Boolean shouldShowOptionsUpgrade, boolean useSduiAccountSwitcher) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        return new IndexDetailPageTradeBarDataState(accountSwitcher, allAccounts, currentAccount, hasAccessToOptions, index, loadingAccountSwitcher, shouldShowOptionsUpgrade, useSduiAccountSwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageTradeBarDataState)) {
            return false;
        }
        IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState = (IndexDetailPageTradeBarDataState) other;
        return Intrinsics.areEqual(this.accountSwitcher, indexDetailPageTradeBarDataState.accountSwitcher) && Intrinsics.areEqual(this.allAccounts, indexDetailPageTradeBarDataState.allAccounts) && Intrinsics.areEqual(this.currentAccount, indexDetailPageTradeBarDataState.currentAccount) && Intrinsics.areEqual(this.hasAccessToOptions, indexDetailPageTradeBarDataState.hasAccessToOptions) && Intrinsics.areEqual(this.index, indexDetailPageTradeBarDataState.index) && this.loadingAccountSwitcher == indexDetailPageTradeBarDataState.loadingAccountSwitcher && Intrinsics.areEqual(this.shouldShowOptionsUpgrade, indexDetailPageTradeBarDataState.shouldShowOptionsUpgrade) && this.useSduiAccountSwitcher == indexDetailPageTradeBarDataState.useSduiAccountSwitcher;
    }

    public int hashCode() {
        AccountSwitcher accountSwitcher = this.accountSwitcher;
        int iHashCode = (((accountSwitcher == null ? 0 : accountSwitcher.hashCode()) * 31) + this.allAccounts.hashCode()) * 31;
        Account account = this.currentAccount;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        Boolean bool = this.hasAccessToOptions;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Index index = this.index;
        int iHashCode4 = (((iHashCode3 + (index == null ? 0 : index.hashCode())) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31;
        Boolean bool2 = this.shouldShowOptionsUpgrade;
        return ((iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher);
    }

    public String toString() {
        return "IndexDetailPageTradeBarDataState(accountSwitcher=" + this.accountSwitcher + ", allAccounts=" + this.allAccounts + ", currentAccount=" + this.currentAccount + ", hasAccessToOptions=" + this.hasAccessToOptions + ", index=" + this.index + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", shouldShowOptionsUpgrade=" + this.shouldShowOptionsUpgrade + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ")";
    }

    public IndexDetailPageTradeBarDataState(AccountSwitcher accountSwitcher, List<Account> allAccounts, Account account, Boolean bool, Index index, boolean z, Boolean bool2, boolean z2) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        this.accountSwitcher = accountSwitcher;
        this.allAccounts = allAccounts;
        this.currentAccount = account;
        this.hasAccessToOptions = bool;
        this.index = index;
        this.loadingAccountSwitcher = z;
        this.shouldShowOptionsUpgrade = bool2;
        this.useSduiAccountSwitcher = z2;
    }

    public final AccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    public /* synthetic */ IndexDetailPageTradeBarDataState(AccountSwitcher accountSwitcher, List list, Account account, Boolean bool, Index index, boolean z, Boolean bool2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountSwitcher, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : account, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : index, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? false : z2);
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final Account getCurrentAccount() {
        return this.currentAccount;
    }

    public final Boolean getHasAccessToOptions() {
        return this.hasAccessToOptions;
    }

    public final Index getIndex() {
        return this.index;
    }

    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    public final Boolean getShouldShowOptionsUpgrade() {
        return this.shouldShowOptionsUpgrade;
    }

    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }
}
