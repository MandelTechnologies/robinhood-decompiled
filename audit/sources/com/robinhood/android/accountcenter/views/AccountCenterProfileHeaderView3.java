package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterProfileHeaderViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterProfileHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterProfileHeaderView3 extends FunctionReferenceImpl implements Function1<View, IncludeAccountCenterProfileHeaderViewBinding> {
    public static final AccountCenterProfileHeaderView3 INSTANCE = new AccountCenterProfileHeaderView3();

    AccountCenterProfileHeaderView3() {
        super(1, IncludeAccountCenterProfileHeaderViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterProfileHeaderViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeAccountCenterProfileHeaderViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeAccountCenterProfileHeaderViewBinding.bind(p0);
    }
}
