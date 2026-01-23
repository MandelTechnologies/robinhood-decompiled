package com.robinhood.android.redesign.accounttab.deeplink;

import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabDeeplinkCoordinatorImpl.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J+\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinatorImpl;", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "accountTabMatcher", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabMatcher;", "<init>", "(Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabMatcher;)V", "findMatchingTab", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "availableTabs", "", "getTabIndex", "", "targetTab", "tabInfoIndexMap", "", "", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;Ljava/util/Map;)Ljava/lang/Integer;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabDeeplinkCoordinatorImpl implements AccountTabDeeplinkCoordinator {
    public static final int $stable = 0;
    private final AccountTabMatcher accountTabMatcher;

    public AccountTabDeeplinkCoordinatorImpl(AccountTabMatcher accountTabMatcher) {
        Intrinsics.checkNotNullParameter(accountTabMatcher, "accountTabMatcher");
        this.accountTabMatcher = accountTabMatcher;
    }

    @Override // com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCoordinator
    public AccountTabInfo.Account findMatchingTab(TabLinkIntentKey tabIntentKey, List<AccountTabInfo.Account> availableTabs) {
        Intrinsics.checkNotNullParameter(tabIntentKey, "tabIntentKey");
        Intrinsics.checkNotNullParameter(availableTabs, "availableTabs");
        if (tabIntentKey instanceof TabLinkIntentKey.Retirement) {
            return this.accountTabMatcher.findRetirementTab((TabLinkIntentKey.Retirement) tabIntentKey, availableTabs);
        }
        if (tabIntentKey instanceof TabLinkIntentKey.McDuckling) {
            return this.accountTabMatcher.findSpendingTab(availableTabs);
        }
        if (tabIntentKey instanceof TabLinkIntentKey.Home.Dashboard) {
            return this.accountTabMatcher.findIndividualAccountTab((TabLinkIntentKey.Home.Dashboard) tabIntentKey, availableTabs);
        }
        if (tabIntentKey instanceof TabLinkIntentKey.Home.Legacy) {
            return (AccountTabInfo.Account) CollectionsKt.firstOrNull((List) availableTabs);
        }
        return null;
    }

    @Override // com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCoordinator
    public Integer getTabIndex(AccountTabInfo.Account targetTab, Map<String, Integer> tabInfoIndexMap) {
        Intrinsics.checkNotNullParameter(targetTab, "targetTab");
        Intrinsics.checkNotNullParameter(tabInfoIndexMap, "tabInfoIndexMap");
        return tabInfoIndexMap.get(targetTab.getId());
    }
}
