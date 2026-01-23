package com.robinhood.android.advisory.onboarding.retirement.contribution;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RetirementOnboardingContributionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment$ComposeContent$2$2$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RetirementOnboardingContributionFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    RetirementOnboardingContributionFragment3(Object obj) {
        super(0, obj, RetirementOnboardingContributionDuxo.class, "onSubmitClicked", "onSubmitClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RetirementOnboardingContributionDuxo) this.receiver).onSubmitClicked();
    }
}
