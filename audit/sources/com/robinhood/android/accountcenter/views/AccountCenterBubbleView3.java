package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterBubbleViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterBubbleView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.AccountCenterBubbleView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountCenterBubbleView3 extends FunctionReferenceImpl implements Function1<View, IncludeAccountCenterBubbleViewBinding> {
    public static final AccountCenterBubbleView3 INSTANCE = new AccountCenterBubbleView3();

    AccountCenterBubbleView3() {
        super(1, IncludeAccountCenterBubbleViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterBubbleViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeAccountCenterBubbleViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeAccountCenterBubbleViewBinding.bind(p0);
    }
}
