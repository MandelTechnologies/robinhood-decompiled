package com.robinhood.shared.account.contracts.switcher;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalAccountSwitcherCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/LocalAccountSwitcherCallbacks;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", "onRefreshAccountsClicked", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface LocalAccountSwitcherCallbacks extends AccountSwitcherCallbacks {
    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    void onRefreshAccountsClicked();

    /* compiled from: LocalAccountSwitcherCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onRefreshAccountsClicked(LocalAccountSwitcherCallbacks localAccountSwitcherCallbacks) {
        }

        public static void onAllAccountsSelected(LocalAccountSwitcherCallbacks localAccountSwitcherCallbacks) {
            AccountSwitcherCallbacks.DefaultImpls.onAllAccountsSelected(localAccountSwitcherCallbacks);
        }

        public static void onPendingApplicationClicked(LocalAccountSwitcherCallbacks localAccountSwitcherCallbacks, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            AccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(localAccountSwitcherCallbacks, applicationId, brokerageAccountType);
        }
    }
}
