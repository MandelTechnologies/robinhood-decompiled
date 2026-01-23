package com.robinhood.android.lib.accountswitcher;

import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;", "", "onAccountSwitcherCtaClicked", "", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "showSduiAccountSwitcher", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherCtaCallbacks, reason: use source file name */
/* loaded from: classes8.dex */
public interface AccountSwitcherCallbacks3 {

    /* compiled from: AccountSwitcherCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherCtaCallbacks$DefaultImpls */
    public static final class DefaultImpls {
        public static void showSduiAccountSwitcher(AccountSwitcherCallbacks3 accountSwitcherCallbacks3, SurfaceDto surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
        }
    }

    void onAccountSwitcherCtaClicked(AccountSwitcherData args);

    void showSduiAccountSwitcher(SurfaceDto surface);
}
