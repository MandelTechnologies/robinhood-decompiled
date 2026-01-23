package com.robinhood.shared.history.accounts;

import android.view.View;
import com.robinhood.shared.history.accounts.databinding.FragmentAccountsHistoryFilterBottomsheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountsHistoryFilterBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.accounts.AccountsHistoryFilterBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class AccountsHistoryFilterBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAccountsHistoryFilterBottomsheetBinding> {
    public static final AccountsHistoryFilterBottomSheetFragment2 INSTANCE = new AccountsHistoryFilterBottomSheetFragment2();

    AccountsHistoryFilterBottomSheetFragment2() {
        super(1, FragmentAccountsHistoryFilterBottomsheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryFilterBottomsheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAccountsHistoryFilterBottomsheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAccountsHistoryFilterBottomsheetBinding.bind(p0);
    }
}
