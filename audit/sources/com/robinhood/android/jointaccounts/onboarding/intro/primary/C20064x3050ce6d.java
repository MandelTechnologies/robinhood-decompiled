package com.robinhood.android.jointaccounts.onboarding.intro.primary;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$AnimatedLoadedScreen$1$1$1 */
/* loaded from: classes10.dex */
/* synthetic */ class C20064x3050ce6d extends FunctionReferenceImpl implements Function0<Unit> {
    C20064x3050ce6d(Object obj) {
        super(0, obj, PrimaryUserIntroScreenCallbacks.class, "onExitClick", "onExitClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PrimaryUserIntroScreenCallbacks) this.receiver).onExitClick();
    }
}
