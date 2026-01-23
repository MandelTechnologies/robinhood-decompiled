package com.robinhood.android.onboarding.directipo.p203ui;

import com.robinhood.android.onboarding.directipo.p203ui.DirectIpoOnboardingStepsFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DirectIpoOnboardingStepsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingStepsFragment$onStart$6$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class DirectIpoOnboardingStepsFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    DirectIpoOnboardingStepsFragment3(Object obj) {
        super(0, obj, DirectIpoOnboardingStepsFragment.Callbacks.class, "onViewAvailableIpos", "onViewAvailableIpos()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DirectIpoOnboardingStepsFragment.Callbacks) this.receiver).onViewAvailableIpos();
    }
}
