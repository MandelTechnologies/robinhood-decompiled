package com.robinhood.android.redesign.accounttab.deeplink;

import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AccountTabDeeplinkCoordinator.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J+\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "", "findMatchingTab", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "availableTabs", "", "getTabIndex", "", "targetTab", "tabInfoIndexMap", "", "", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;Ljava/util/Map;)Ljava/lang/Integer;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface AccountTabDeeplinkCoordinator {
    AccountTabInfo.Account findMatchingTab(TabLinkIntentKey tabIntentKey, List<AccountTabInfo.Account> availableTabs);

    Integer getTabIndex(AccountTabInfo.Account targetTab, Map<String, Integer> tabInfoIndexMap);
}
