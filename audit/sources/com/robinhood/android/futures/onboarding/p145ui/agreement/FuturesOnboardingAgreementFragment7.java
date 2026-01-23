package com.robinhood.android.futures.onboarding.p145ui.agreement;

import com.robinhood.android.common.p088ui.BaseActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesOnboardingAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementFragment$ComposeContent$1$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesOnboardingAgreementFragment7 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesOnboardingAgreementFragment7(Object obj) {
        super(0, obj, BaseActivity.class, "onBackPressed", "onBackPressed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BaseActivity) this.receiver).onBackPressed();
    }
}
