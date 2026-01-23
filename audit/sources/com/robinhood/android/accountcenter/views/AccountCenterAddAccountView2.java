package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterAddAccountBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterAddAccountView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterAddAccountView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterAddAccountView2 extends FunctionReferenceImpl implements Function1<View, IncludeAccountCenterAddAccountBinding> {
    public static final AccountCenterAddAccountView2 INSTANCE = new AccountCenterAddAccountView2();

    AccountCenterAddAccountView2() {
        super(1, IncludeAccountCenterAddAccountBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAddAccountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeAccountCenterAddAccountBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeAccountCenterAddAccountBinding.bind(p0);
    }
}
