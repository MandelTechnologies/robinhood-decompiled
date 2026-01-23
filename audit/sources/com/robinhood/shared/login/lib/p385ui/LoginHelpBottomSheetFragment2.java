package com.robinhood.shared.login.lib.p385ui;

import android.view.View;
import com.robinhood.shared.login.lib.databinding.FragmentLoginHelpBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginHelpBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.lib.ui.LoginHelpBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class LoginHelpBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentLoginHelpBottomSheetBinding> {
    public static final LoginHelpBottomSheetFragment2 INSTANCE = new LoginHelpBottomSheetFragment2();

    LoginHelpBottomSheetFragment2() {
        super(1, FragmentLoginHelpBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/login/lib/databinding/FragmentLoginHelpBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentLoginHelpBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentLoginHelpBottomSheetBinding.bind(p0);
    }
}
