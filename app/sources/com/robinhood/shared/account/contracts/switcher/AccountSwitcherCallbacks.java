package com.robinhood.shared.account.contracts.switcher;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", "", "onAccountSelected", "", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAllAccountsSelected", "onRefreshAccountsClicked", "onPendingApplicationClicked", "applicationId", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface AccountSwitcherCallbacks {

    /* compiled from: AccountSwitcherCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onAllAccountsSelected(AccountSwitcherCallbacks accountSwitcherCallbacks) {
        }

        public static void onPendingApplicationClicked(AccountSwitcherCallbacks accountSwitcherCallbacks, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        }
    }

    void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType);

    void onAllAccountsSelected();

    void onPendingApplicationClicked(String applicationId, BrokerageAccountType brokerageAccountType);

    void onRefreshAccountsClicked();
}
