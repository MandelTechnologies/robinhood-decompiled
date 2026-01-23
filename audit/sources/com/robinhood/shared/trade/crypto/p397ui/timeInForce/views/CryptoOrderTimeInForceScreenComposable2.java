package com.robinhood.shared.trade.crypto.p397ui.timeInForce.views;

import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoOrderTimeInForceScreenComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.views.CryptoOrderTimeInForceScreenComposableKt$CryptoOrderTimeInForceScreenComposable$2$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderTimeInForceScreenComposable2 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoOrderTimeInForceScreenComposable2(Object obj) {
        super(0, obj, CryptoOrderTimeInForceDuxo.class, "onTimeInForceConfirmClicked", "onTimeInForceConfirmClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoOrderTimeInForceDuxo) this.receiver).onTimeInForceConfirmClicked();
    }
}
