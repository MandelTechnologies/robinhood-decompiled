package com.robinhood.shared.crypto.transfer.unified;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTransferUnifiedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$1$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class CryptoTransferUnifiedComposable4 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    CryptoTransferUnifiedComposable4(Object obj) {
        super(1, obj, CryptoTransferUnifiedDuxo.class, "changeActivePageIndex", "changeActivePageIndex(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((CryptoTransferUnifiedDuxo) this.receiver).changeActivePageIndex(i);
    }
}
