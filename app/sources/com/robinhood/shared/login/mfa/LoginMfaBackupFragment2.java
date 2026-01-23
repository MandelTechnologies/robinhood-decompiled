package com.robinhood.shared.login.mfa;

import android.view.View;
import com.robinhood.shared.login.databinding.FragmentLoginMfaBackupBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginMfaBackupFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.mfa.LoginMfaBackupFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class LoginMfaBackupFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentLoginMfaBackupBinding> {
    public static final LoginMfaBackupFragment2 INSTANCE = new LoginMfaBackupFragment2();

    LoginMfaBackupFragment2() {
        super(1, FragmentLoginMfaBackupBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/login/databinding/FragmentLoginMfaBackupBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentLoginMfaBackupBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentLoginMfaBackupBinding.bind(p0);
    }
}
