package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterAccountTotalViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterAccountTotalView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterAccountTotalView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterAccountTotalView2 extends FunctionReferenceImpl implements Function1<View, IncludeAccountCenterAccountTotalViewBinding> {
    public static final AccountCenterAccountTotalView2 INSTANCE = new AccountCenterAccountTotalView2();

    AccountCenterAccountTotalView2() {
        super(1, IncludeAccountCenterAccountTotalViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterAccountTotalViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeAccountCenterAccountTotalViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeAccountCenterAccountTotalViewBinding.bind(p0);
    }
}
