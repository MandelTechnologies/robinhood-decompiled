package com.robinhood.shared.crypto.transfer.unified;

import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferUnifiedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class CryptoTransferUnifiedComposable5 extends FunctionReferenceImpl implements Function2<ApiCryptoTransferConfig.TransferStates.EnrollmentState, CryptoTransferAction, Unit> {
    CryptoTransferUnifiedComposable5(Object obj) {
        super(2, obj, CryptoTransferUnifiedFragment.Callbacks.class, "navigateToEnrollment", "navigateToEnrollment(Lcom/robinhood/models/api/transfer/ApiCryptoTransferConfig$TransferStates$EnrollmentState;Lcom/robinhood/models/api/transfer/CryptoTransferAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ApiCryptoTransferConfig.TransferStates.EnrollmentState enrollmentState, CryptoTransferAction cryptoTransferAction) {
        invoke2(enrollmentState, cryptoTransferAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiCryptoTransferConfig.TransferStates.EnrollmentState p0, CryptoTransferAction p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((CryptoTransferUnifiedFragment.Callbacks) this.receiver).navigateToEnrollment(p0, p1);
    }
}
