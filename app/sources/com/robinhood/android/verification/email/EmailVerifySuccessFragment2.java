package com.robinhood.android.verification.email;

import android.view.View;
import com.robinhood.android.verification.databinding.FragmentEmailVerifySuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailVerifySuccessFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.EmailVerifySuccessFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EmailVerifySuccessFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmailVerifySuccessBinding> {
    public static final EmailVerifySuccessFragment2 INSTANCE = new EmailVerifySuccessFragment2();

    EmailVerifySuccessFragment2() {
        super(1, FragmentEmailVerifySuccessBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/verification/databinding/FragmentEmailVerifySuccessBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmailVerifySuccessBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmailVerifySuccessBinding.bind(p0);
    }
}
