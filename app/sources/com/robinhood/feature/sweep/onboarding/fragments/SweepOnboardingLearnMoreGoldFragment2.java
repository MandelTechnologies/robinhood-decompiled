package com.robinhood.feature.sweep.onboarding.fragments;

import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SweepOnboardingLearnMoreGoldFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class SweepOnboardingLearnMoreGoldFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    SweepOnboardingLearnMoreGoldFragment2(Object obj) {
        super(0, obj, SweepOnboardingLearnMoreGoldFragment.Callbacks.class, "onLearnMoreGoldContinue", "onLearnMoreGoldContinue()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SweepOnboardingLearnMoreGoldFragment.Callbacks) this.receiver).onLearnMoreGoldContinue();
    }
}
