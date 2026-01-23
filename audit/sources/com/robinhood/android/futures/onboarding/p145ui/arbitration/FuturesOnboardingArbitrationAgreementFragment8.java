package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesOnboardingArbitrationAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$ComposeContent$1$1$3$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesOnboardingArbitrationAgreementFragment8 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesOnboardingArbitrationAgreementFragment8(Object obj) {
        super(0, obj, FuturesOnboardingArbitrationAgreementDuxo.class, "consumeSubmissionError", "consumeSubmissionError()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesOnboardingArbitrationAgreementDuxo) this.receiver).consumeSubmissionError();
    }
}
