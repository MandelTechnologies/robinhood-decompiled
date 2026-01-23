package com.robinhood.shared.trade.crypto.p397ui.price;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoOrderPriceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$2$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoOrderPriceComposableKt$CryptoOrderPriceComposable$2$2$1$1(Object obj) {
        super(0, obj, CryptoOrderPriceDuxo.class, "handleInfoPressed", "handleInfoPressed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoOrderPriceDuxo) this.receiver).handleInfoPressed();
    }
}
