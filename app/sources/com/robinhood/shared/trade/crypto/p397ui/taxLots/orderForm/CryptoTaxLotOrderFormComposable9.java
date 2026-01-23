package com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotOrderFormComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$3$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoTaxLotOrderFormComposable9 extends FunctionReferenceImpl implements Function1<CryptoOrderReviewRowState.TapAction, Unit> {
    CryptoTaxLotOrderFormComposable9(Object obj) {
        super(1, obj, CryptoTaxLotOrderFormDuxo.class, "onOrderReviewRowTapped", "onOrderReviewRowTapped(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderReviewRowState.TapAction tapAction) {
        invoke2(tapAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoOrderReviewRowState.TapAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTaxLotOrderFormDuxo) this.receiver).onOrderReviewRowTapped(p0);
    }
}
