package com.robinhood.android.slip.onboarding.faqs;

import android.view.View;
import com.robinhood.android.slip.databinding.FragmentSlipFaqsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipFaqsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.faqs.SlipFaqsFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipFaqsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSlipFaqsBinding> {
    public static final SlipFaqsFragment2 INSTANCE = new SlipFaqsFragment2();

    SlipFaqsFragment2() {
        super(1, FragmentSlipFaqsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/slip/databinding/FragmentSlipFaqsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSlipFaqsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSlipFaqsBinding.bind(p0);
    }
}
