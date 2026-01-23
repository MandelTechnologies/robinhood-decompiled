package com.robinhood.android.lib.accountswitcher.sdui;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;

/* compiled from: SduiAccountSwitcher.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherCallbacks;", "", "onAccountSelected", "", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onDismiss", "onShowAllAccounts", "onRefresh", "onDeeplink", "url", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherCallbacks, reason: use source file name */
/* loaded from: classes8.dex */
public interface SduiAccountSwitcher {
    void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType);

    void onDeeplink(String url);

    void onDismiss();

    void onRefresh();

    void onShowAllAccounts();
}
