package com.robinhood.android.onboarding.directipo.p203ui;

import android.view.View;
import com.robinhood.android.onboarding.directipo.databinding.FragmentDirectIpoOnboardingStepsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingStepsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class DirectIpoOnboardingStepsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoOnboardingStepsBinding> {
    public static final DirectIpoOnboardingStepsFragment2 INSTANCE = new DirectIpoOnboardingStepsFragment2();

    DirectIpoOnboardingStepsFragment2() {
        super(1, FragmentDirectIpoOnboardingStepsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoOnboardingStepsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoOnboardingStepsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoOnboardingStepsBinding.bind(p0);
    }
}
