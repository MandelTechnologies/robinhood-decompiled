package com.robinhood.shared.history.accounts;

import android.view.View;
import com.robinhood.shared.history.accounts.databinding.FragmentAccountsHistoryBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountsHistoryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.accounts.AccountsHistoryFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class AccountsHistoryFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAccountsHistoryBinding> {
    public static final AccountsHistoryFragment2 INSTANCE = new AccountsHistoryFragment2();

    AccountsHistoryFragment2() {
        super(1, FragmentAccountsHistoryBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAccountsHistoryBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAccountsHistoryBinding.bind(p0);
    }
}
