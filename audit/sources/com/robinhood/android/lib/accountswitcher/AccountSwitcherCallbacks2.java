package com.robinhood.android.lib.accountswitcher;

import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherCallbacks;", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherCombinedCallbacks, reason: use source file name */
/* loaded from: classes8.dex */
public interface AccountSwitcherCallbacks2 extends AccountSwitcherCallbacks3, AccountSwitcherCallbacks {

    /* compiled from: AccountSwitcherCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherCombinedCallbacks$DefaultImpls */
    public static final class DefaultImpls {
        public static void onAllAccountsSelected(AccountSwitcherCallbacks2 accountSwitcherCallbacks2) {
            AccountSwitcherCallbacks.DefaultImpls.onAllAccountsSelected(accountSwitcherCallbacks2);
        }

        public static void onPendingApplicationClicked(AccountSwitcherCallbacks2 accountSwitcherCallbacks2, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            AccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(accountSwitcherCallbacks2, applicationId, brokerageAccountType);
        }

        public static void showSduiAccountSwitcher(AccountSwitcherCallbacks2 accountSwitcherCallbacks2, SurfaceDto surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            AccountSwitcherCallbacks3.DefaultImpls.showSduiAccountSwitcher(accountSwitcherCallbacks2, surface);
        }
    }
}
