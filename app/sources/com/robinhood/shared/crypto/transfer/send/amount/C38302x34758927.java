package com.robinhood.shared.crypto.transfer.send.amount;

import com.robinhood.shared.formats.crypto.CryptoInputMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$9$3$1$1 */
/* loaded from: classes6.dex */
/* synthetic */ class C38302x34758927 extends FunctionReferenceImpl implements Function1<CryptoInputMode, Unit> {
    C38302x34758927(Object obj) {
        super(1, obj, CryptoTransferSendAmountDuxo.class, "changeCryptoInputMode", "changeCryptoInputMode(Lcom/robinhood/shared/formats/crypto/CryptoInputMode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoInputMode cryptoInputMode) {
        invoke2(cryptoInputMode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoInputMode p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTransferSendAmountDuxo) this.receiver).changeCryptoInputMode(p0);
    }
}
