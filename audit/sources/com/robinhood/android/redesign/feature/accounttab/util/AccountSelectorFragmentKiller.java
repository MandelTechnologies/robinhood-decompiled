package com.robinhood.android.redesign.feature.accounttab.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.interop.AccountSelectorAndroidFragmentFromKey2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelectorFragmentKiller.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"killAllFragments", "", "accountTabInfo", "", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "feature-account-selector_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorFragmentKillerKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorFragmentKiller {
    public static final void killAllFragments(List<AccountTabInfo.Account> accountTabInfo, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(accountTabInfo, "accountTabInfo");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        for (AccountTabInfo.Account account : accountTabInfo) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(account.getId());
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
            }
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            AccountSelectorAndroidFragmentFromKey2.INSTANCE.remove(account.getId());
        }
    }
}
