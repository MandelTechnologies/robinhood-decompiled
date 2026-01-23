package com.robinhood.android.account.p060ui;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelector.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountSelectorCallbacks;", "Lcom/robinhood/shared/account/contracts/switcher/LocalAccountSwitcherCallbacks;", "onAccountSelectionDropdownClicked", "", "state", "Lcom/robinhood/android/account/ui/AccountSelectorState;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.AccountSelectorCallbacks, reason: use source file name */
/* loaded from: classes24.dex */
public interface AccountSelector2 extends LocalAccountSwitcherCallbacks {
    void onAccountSelectionDropdownClicked(AccountSelectorState state);

    /* compiled from: AccountSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.AccountSelectorCallbacks$DefaultImpls */
    public static final class DefaultImpls {
        public static void onAllAccountsSelected(AccountSelector2 accountSelector2) {
            LocalAccountSwitcherCallbacks.DefaultImpls.onAllAccountsSelected(accountSelector2);
        }

        public static void onPendingApplicationClicked(AccountSelector2 accountSelector2, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            LocalAccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(accountSelector2, applicationId, brokerageAccountType);
        }

        public static void onRefreshAccountsClicked(AccountSelector2 accountSelector2) {
            LocalAccountSwitcherCallbacks.DefaultImpls.onRefreshAccountsClicked(accountSelector2);
        }
    }
}
