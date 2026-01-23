package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferEnrollmentMfaFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.CryptoTransferEnrollmentMfaFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class CryptoTransferEnrollmentMfaFragment2 extends FunctionReferenceImpl implements Function1<CryptoTransferEnrollmentMfaEvent.Navigate, Unit> {
    CryptoTransferEnrollmentMfaFragment2(Object obj) {
        super(1, obj, CryptoTransferEnrollmentMfaFragment.class, "navigate", "navigate(Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoTransferEnrollmentMfaEvent.Navigate navigate) {
        invoke2(navigate);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoTransferEnrollmentMfaEvent.Navigate p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTransferEnrollmentMfaFragment) this.receiver).navigate(p0);
    }
}
