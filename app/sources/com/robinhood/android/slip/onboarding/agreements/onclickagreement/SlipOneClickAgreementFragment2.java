package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SlipOneClickAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SlipOneClickAgreementFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    SlipOneClickAgreementFragment2(Object obj) {
        super(0, obj, SlipOneClickAgreementFragment.class, "onClickDone", "onClickDone()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SlipOneClickAgreementFragment) this.receiver).onClickDone();
    }
}
