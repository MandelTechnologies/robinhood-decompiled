package com.robinhood.android.onboarding.p205ui.postfundupsell;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$displayRetirementUpsellPage$replaceFragmentFun$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class OnboardingUpsellActivity2 extends FunctionReferenceImpl implements Function1<Fragment, Integer> {
    OnboardingUpsellActivity2(Object obj) {
        super(1, obj, OnboardingUpsellActivity.class, "replaceFragmentWithoutBackStack", "replaceFragmentWithoutBackStack(Landroidx/fragment/app/Fragment;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Fragment p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Integer.valueOf(((OnboardingUpsellActivity) this.receiver).replaceFragmentWithoutBackStack(p0));
    }
}
