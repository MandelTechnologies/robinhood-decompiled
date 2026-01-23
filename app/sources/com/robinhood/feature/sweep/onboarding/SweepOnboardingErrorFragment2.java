package com.robinhood.feature.sweep.onboarding;

import android.view.View;
import com.robinhood.feature.sweep.onboarding.databinding.SweepOnboardingErrorFragmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingErrorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.feature.sweep.onboarding.SweepOnboardingErrorFragment$binding$2, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class SweepOnboardingErrorFragment2 extends FunctionReferenceImpl implements Function1<View, SweepOnboardingErrorFragmentBinding> {
    public static final SweepOnboardingErrorFragment2 INSTANCE = new SweepOnboardingErrorFragment2();

    SweepOnboardingErrorFragment2() {
        super(1, SweepOnboardingErrorFragmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/feature/sweep/onboarding/databinding/SweepOnboardingErrorFragmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SweepOnboardingErrorFragmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return SweepOnboardingErrorFragmentBinding.bind(p0);
    }
}
