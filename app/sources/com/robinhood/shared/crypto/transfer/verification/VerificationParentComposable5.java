package com.robinhood.shared.crypto.transfer.verification;

import com.robinhood.models.api.transfer.verification.TransferCategory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationParentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class VerificationParentComposable5 extends FunctionReferenceImpl implements Function1<TransferCategory, Unit> {
    VerificationParentComposable5(Object obj) {
        super(1, obj, VerificationParentContentDuxo.class, "update", "update(Lcom/robinhood/models/api/transfer/verification/TransferCategory;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TransferCategory transferCategory) {
        invoke2(transferCategory);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TransferCategory p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((VerificationParentContentDuxo) this.receiver).update(p0);
    }
}
