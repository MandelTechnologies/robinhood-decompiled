package com.robinhood.shared.crypto.transfer.enrollment.agreement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EnrollmentAgreementComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.agreement.EnrollmentAgreementComposableKt$EnrollmentAgreementComposable$1$2$2$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EnrollmentAgreementComposable7 extends FunctionReferenceImpl implements Function0<Unit> {
    EnrollmentAgreementComposable7(Object obj) {
        super(0, obj, EnrollmentAgreementDuxo.class, "skipAgreement", "skipAgreement()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EnrollmentAgreementDuxo) this.receiver).skipAgreement();
    }
}
