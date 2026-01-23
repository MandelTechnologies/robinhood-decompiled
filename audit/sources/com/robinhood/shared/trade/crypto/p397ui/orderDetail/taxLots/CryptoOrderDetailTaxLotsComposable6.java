package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$1$3$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderDetailTaxLotsComposable6 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoOrderDetailTaxLotsComposable6(Object obj) {
        super(0, obj, CryptoOrderDetailTaxLotsDuxo.class, "fetchNextPage", "fetchNextPage()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoOrderDetailTaxLotsDuxo) this.receiver).fetchNextPage();
    }
}
