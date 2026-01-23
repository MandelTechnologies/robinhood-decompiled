package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterErrorViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterErrorView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterErrorView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterErrorView2 extends FunctionReferenceImpl implements Function1<View, IncludeAccountCenterErrorViewBinding> {
    public static final AccountCenterErrorView2 INSTANCE = new AccountCenterErrorView2();

    AccountCenterErrorView2() {
        super(1, IncludeAccountCenterErrorViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterErrorViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeAccountCenterErrorViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeAccountCenterErrorViewBinding.bind(p0);
    }
}
