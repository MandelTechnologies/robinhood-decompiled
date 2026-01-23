package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$1$5$2$1 */
/* loaded from: classes12.dex */
/* synthetic */ class C40753x6e37bcd0 extends FunctionReferenceImpl implements Function1<String, Unit> {
    C40753x6e37bcd0(Object obj) {
        super(1, obj, CryptoTaxLotSelectionDuxo.class, "onInputFieldFocused", "onInputFieldFocused(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((CryptoTaxLotSelectionDuxo) this.receiver).onInputFieldFocused(str);
    }
}
