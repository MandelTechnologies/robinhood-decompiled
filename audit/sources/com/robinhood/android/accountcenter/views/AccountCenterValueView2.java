package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterValueViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterValueView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterValueView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterValueView2 extends FunctionReferenceImpl implements Function1<View, IncludeAccountCenterValueViewBinding> {
    public static final AccountCenterValueView2 INSTANCE = new AccountCenterValueView2();

    AccountCenterValueView2() {
        super(1, IncludeAccountCenterValueViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterValueViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeAccountCenterValueViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeAccountCenterValueViewBinding.bind(p0);
    }
}
