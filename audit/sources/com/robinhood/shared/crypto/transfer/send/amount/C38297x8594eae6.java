package com.robinhood.shared.crypto.transfer.send.amount;

import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$15$1$1$1 */
/* loaded from: classes6.dex */
/* synthetic */ class C38297x8594eae6 extends FunctionReferenceImpl implements Function1<CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper, Unit> {
    C38297x8594eae6(Object obj) {
        super(1, obj, CryptoTransferSendAmountFragment.Callbacks.class, "errorWithAddress", "errorWithAddress(Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper cryptoValidationErrorWrapper) {
        invoke2(cryptoValidationErrorWrapper);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTransferSendAmountFragment.Callbacks) this.receiver).errorWithAddress(p0);
    }
}
