package com.robinhood.shared.login.mfa;

import android.view.View;
import com.robinhood.shared.login.databinding.FragmentLoginMfaV2BottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginMfaV2BottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.mfa.LoginMfaV2BottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class LoginMfaV2BottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentLoginMfaV2BottomSheetBinding> {
    public static final LoginMfaV2BottomSheetFragment2 INSTANCE = new LoginMfaV2BottomSheetFragment2();

    LoginMfaV2BottomSheetFragment2() {
        super(1, FragmentLoginMfaV2BottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/login/databinding/FragmentLoginMfaV2BottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentLoginMfaV2BottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentLoginMfaV2BottomSheetBinding.bind(p0);
    }
}
