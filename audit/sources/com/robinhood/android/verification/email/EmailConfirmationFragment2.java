package com.robinhood.android.verification.email;

import android.view.View;
import com.robinhood.android.verification.databinding.FragmentEmailConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.EmailConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EmailConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmailConfirmationBinding> {
    public static final EmailConfirmationFragment2 INSTANCE = new EmailConfirmationFragment2();

    EmailConfirmationFragment2() {
        super(1, FragmentEmailConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/verification/databinding/FragmentEmailConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmailConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmailConfirmationBinding.bind(p0);
    }
}
