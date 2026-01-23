package com.robinhood.android.onboarding.p205ui.postfundupsell;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$displayRetirementUpsellPage$replaceFragmentFun$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class OnboardingUpsellActivity3 extends FunctionReferenceImpl implements Function1<Fragment, Unit> {
    OnboardingUpsellActivity3(Object obj) {
        super(1, obj, OnboardingUpsellActivity.class, "replaceFragmentWithoutAnimationAndBackStack", "replaceFragmentWithoutAnimationAndBackStack(Landroidx/fragment/app/Fragment;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Fragment fragment) {
        invoke2(fragment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Fragment p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OnboardingUpsellActivity) this.receiver).replaceFragmentWithoutAnimationAndBackStack(p0);
    }
}
