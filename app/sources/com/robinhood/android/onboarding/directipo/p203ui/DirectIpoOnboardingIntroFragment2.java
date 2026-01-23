package com.robinhood.android.onboarding.directipo.p203ui;

import android.view.View;
import com.robinhood.android.onboarding.directipo.databinding.FragmentDirectIpoOnboardingIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class DirectIpoOnboardingIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoOnboardingIntroBinding> {
    public static final DirectIpoOnboardingIntroFragment2 INSTANCE = new DirectIpoOnboardingIntroFragment2();

    DirectIpoOnboardingIntroFragment2() {
        super(1, FragmentDirectIpoOnboardingIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/onboarding/directipo/databinding/FragmentDirectIpoOnboardingIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoOnboardingIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoOnboardingIntroBinding.bind(p0);
    }
}
