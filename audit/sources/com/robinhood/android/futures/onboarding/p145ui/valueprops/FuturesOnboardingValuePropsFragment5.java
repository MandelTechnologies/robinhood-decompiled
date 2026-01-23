package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import com.robinhood.android.futures.onboarding.p145ui.valueprops.FuturesOnboardingValuePropsFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesOnboardingValuePropsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesOnboardingValuePropsFragment5 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesOnboardingValuePropsFragment5(Object obj) {
        super(0, obj, FuturesOnboardingValuePropsFragment.Callbacks.class, "onSignupClicked", "onSignupClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesOnboardingValuePropsFragment.Callbacks) this.receiver).onSignupClicked();
    }
}
