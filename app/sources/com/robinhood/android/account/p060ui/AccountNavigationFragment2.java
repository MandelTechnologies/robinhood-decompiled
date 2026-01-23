package com.robinhood.android.account.p060ui;

import android.view.View;
import com.robinhood.android.account.databinding.FragmentAccountNavigationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNavigationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.AccountNavigationFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountNavigationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAccountNavigationBinding> {
    public static final AccountNavigationFragment2 INSTANCE = new AccountNavigationFragment2();

    AccountNavigationFragment2() {
        super(1, FragmentAccountNavigationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/account/databinding/FragmentAccountNavigationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAccountNavigationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAccountNavigationBinding.bind(p0);
    }
}
