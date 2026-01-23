package com.robinhood.android.verification.email;

import android.view.View;
import com.robinhood.android.verification.databinding.FragmentEmailLinkSentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailLinkSentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.EmailLinkSentFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EmailLinkSentFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmailLinkSentBinding> {
    public static final EmailLinkSentFragment2 INSTANCE = new EmailLinkSentFragment2();

    EmailLinkSentFragment2() {
        super(1, FragmentEmailLinkSentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/verification/databinding/FragmentEmailLinkSentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmailLinkSentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmailLinkSentBinding.bind(p0);
    }
}
