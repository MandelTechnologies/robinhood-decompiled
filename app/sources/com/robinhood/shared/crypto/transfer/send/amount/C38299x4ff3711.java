package com.robinhood.shared.crypto.transfer.send.amount;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$2$1$1 */
/* loaded from: classes6.dex */
/* synthetic */ class C38299x4ff3711 extends FunctionReferenceImpl implements Function0<Unit> {
    C38299x4ff3711(Object obj) {
        super(0, obj, CryptoTransferSendAmountDuxo.class, "sendAll", "sendAll()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoTransferSendAmountDuxo) this.receiver).sendAll();
    }
}
