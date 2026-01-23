package com.robinhood.android.common.recurring.agreement.paycheck;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment$onViewCreated$1$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class PaycheckRecurringInvestmentAgreementFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    PaycheckRecurringInvestmentAgreementFragment3(Object obj) {
        super(0, obj, PaycheckRecurringInvestmentAgreementDuxo.class, "acceptAgreement", "acceptAgreement()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PaycheckRecurringInvestmentAgreementDuxo) this.receiver).acceptAgreement();
    }
}
