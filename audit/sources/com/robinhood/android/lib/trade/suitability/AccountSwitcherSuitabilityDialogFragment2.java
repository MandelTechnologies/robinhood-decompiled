package com.robinhood.android.lib.trade.suitability;

import android.view.View;
import com.robinhood.android.lib.trade.databinding.FragmentAccountSwitcherSuitabilityDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherSuitabilityDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.suitability.AccountSwitcherSuitabilityDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class AccountSwitcherSuitabilityDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAccountSwitcherSuitabilityDialogBinding> {
    public static final AccountSwitcherSuitabilityDialogFragment2 INSTANCE = new AccountSwitcherSuitabilityDialogFragment2();

    AccountSwitcherSuitabilityDialogFragment2() {
        super(1, FragmentAccountSwitcherSuitabilityDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/trade/databinding/FragmentAccountSwitcherSuitabilityDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAccountSwitcherSuitabilityDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAccountSwitcherSuitabilityDialogBinding.bind(p0);
    }
}
