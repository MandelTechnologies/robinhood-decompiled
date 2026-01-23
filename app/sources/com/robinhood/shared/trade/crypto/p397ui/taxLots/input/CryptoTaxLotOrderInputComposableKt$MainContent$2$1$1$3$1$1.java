package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotOrderInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CryptoTaxLotOrderInputComposableKt$MainContent$2$1$1$3$1$1 extends FunctionReferenceImpl implements Function1<CryptoOrderInputRowState.TapAction, Unit> {
    CryptoTaxLotOrderInputComposableKt$MainContent$2$1$1$3$1$1(Object obj) {
        super(1, obj, CryptoTaxLotOrderInputDuxo.class, "onOrderInputRowTapped", "onOrderInputRowTapped(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderInputRowState.TapAction tapAction) {
        invoke2(tapAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoOrderInputRowState.TapAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTaxLotOrderInputDuxo) this.receiver).onOrderInputRowTapped(p0);
    }
}
