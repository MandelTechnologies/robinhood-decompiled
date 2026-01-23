package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionComposableKt$CryptoTaxLotSelectionComposable$2$2$1$1 */
/* loaded from: classes12.dex */
/* synthetic */ class C40756x24cf57f extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    C40756x24cf57f(Object obj) {
        super(1, obj, CryptoTaxLotSelectionDuxo.class, "onKeyPressed", "onKeyPressed(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTaxLotSelectionDuxo) this.receiver).onKeyPressed(p0);
    }
}
