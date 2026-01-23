package com.robinhood.android.hyperextendedonboarding;

import android.view.View;
import com.robinhood.android.hyperextendedonboarding.databinding.FragmentHyperExtendedOnboardingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HyperExtendedOnboardingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.hyperextendedonboarding.HyperExtendedOnboardingFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class HyperExtendedOnboardingFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentHyperExtendedOnboardingBinding> {
    public static final HyperExtendedOnboardingFragment2 INSTANCE = new HyperExtendedOnboardingFragment2();

    HyperExtendedOnboardingFragment2() {
        super(1, FragmentHyperExtendedOnboardingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/hyperextendedonboarding/databinding/FragmentHyperExtendedOnboardingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentHyperExtendedOnboardingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentHyperExtendedOnboardingBinding.bind(p0);
    }
}
