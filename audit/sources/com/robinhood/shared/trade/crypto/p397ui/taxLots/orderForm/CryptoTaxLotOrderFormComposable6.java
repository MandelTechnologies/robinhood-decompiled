package com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm;

import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotOrderFormComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoTaxLotOrderFormComposable6 extends FunctionReferenceImpl implements Function1<CryptoOrderContext.RequestData, Unit> {
    CryptoTaxLotOrderFormComposable6(Object obj) {
        super(1, obj, CryptoTaxLotOrderFormDuxo.class, "submitOrder", "submitOrder(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderContext.RequestData requestData) {
        invoke2(requestData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoOrderContext.RequestData p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CryptoTaxLotOrderFormDuxo) this.receiver).submitOrder(p0);
    }
}
