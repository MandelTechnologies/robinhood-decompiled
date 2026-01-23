package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoFeeTierStatusComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt$CryptoFeeTierStatusComposable$1$1$1 */
/* loaded from: classes12.dex */
/* synthetic */ class C40380xd11f3398 extends FunctionReferenceImpl implements Function0<Unit> {
    C40380xd11f3398(Object obj) {
        super(0, obj, CryptoFeeTierStatusDuxo.class, "onTryAgainClick", "onTryAgainClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoFeeTierStatusDuxo) this.receiver).onTryAgainClick();
    }
}
