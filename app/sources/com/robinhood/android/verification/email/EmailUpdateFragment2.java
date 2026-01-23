package com.robinhood.android.verification.email;

import android.view.View;
import com.robinhood.android.verification.databinding.FragmentEmailUpdateBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailUpdateFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.EmailUpdateFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EmailUpdateFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmailUpdateBinding> {
    public static final EmailUpdateFragment2 INSTANCE = new EmailUpdateFragment2();

    EmailUpdateFragment2() {
        super(1, FragmentEmailUpdateBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/verification/databinding/FragmentEmailUpdateBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmailUpdateBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmailUpdateBinding.bind(p0);
    }
}
