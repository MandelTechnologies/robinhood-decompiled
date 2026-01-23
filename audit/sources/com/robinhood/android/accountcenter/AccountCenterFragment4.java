package com.robinhood.android.accountcenter;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.FragmentAccountCenterBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.AccountCenterFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentAccountCenterBinding> {
    public static final AccountCenterFragment4 INSTANCE = new AccountCenterFragment4();

    AccountCenterFragment4() {
        super(1, FragmentAccountCenterBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/FragmentAccountCenterBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAccountCenterBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAccountCenterBinding.bind(p0);
    }
}
