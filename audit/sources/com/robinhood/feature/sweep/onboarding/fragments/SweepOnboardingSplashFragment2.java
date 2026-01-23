package com.robinhood.feature.sweep.onboarding.fragments;

import android.view.View;
import com.robinhood.feature.sweep.onboarding.databinding.SweepOnboardingSplashFragmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class SweepOnboardingSplashFragment2 extends FunctionReferenceImpl implements Function1<View, SweepOnboardingSplashFragmentBinding> {
    public static final SweepOnboardingSplashFragment2 INSTANCE = new SweepOnboardingSplashFragment2();

    SweepOnboardingSplashFragment2() {
        super(1, SweepOnboardingSplashFragmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/feature/sweep/onboarding/databinding/SweepOnboardingSplashFragmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SweepOnboardingSplashFragmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return SweepOnboardingSplashFragmentBinding.bind(p0);
    }
}
