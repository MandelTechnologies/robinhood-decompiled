package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTaxLotOrderInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CryptoTaxLotOrderInputComposableKt$MainContent$2$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoTaxLotOrderInputComposableKt$MainContent$2$1$2$1(Object obj) {
        super(0, obj, CryptoTaxLotOrderInputDuxo.class, "onViewTaxLotsClicked", "onViewTaxLotsClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoTaxLotOrderInputDuxo) this.receiver).onViewTaxLotsClicked();
    }
}
