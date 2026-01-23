package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$3$1$1$1 */
/* loaded from: classes12.dex */
/* synthetic */ class C40750x55613f5a extends FunctionReferenceImpl implements Function0<Unit> {
    C40750x55613f5a(Object obj) {
        super(0, obj, CryptoTaxLotSelectionDuxo.class, "onBackPressed", "onBackPressed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoTaxLotSelectionDuxo) this.receiver).onBackPressed();
    }
}
