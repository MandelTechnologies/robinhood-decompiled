package com.robinhood.android.verification.email;

import android.view.View;
import com.robinhood.android.verification.databinding.FragmentEmailExceededNumberOfAttemptsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailExceededNumberOfAttemptsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.EmailExceededNumberOfAttemptsFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EmailExceededNumberOfAttemptsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmailExceededNumberOfAttemptsBinding> {
    public static final EmailExceededNumberOfAttemptsFragment2 INSTANCE = new EmailExceededNumberOfAttemptsFragment2();

    EmailExceededNumberOfAttemptsFragment2() {
        super(1, FragmentEmailExceededNumberOfAttemptsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/verification/databinding/FragmentEmailExceededNumberOfAttemptsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmailExceededNumberOfAttemptsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmailExceededNumberOfAttemptsBinding.bind(p0);
    }
}
