package com.robinhood.shared.trade.crypto.p397ui.orderDetail.views;

import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoOrderDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$10$2$2$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderDetailComposable5 extends FunctionReferenceImpl implements Function0<Unit> {
    CryptoOrderDetailComposable5(Object obj) {
        super(0, obj, CryptoOrderDetailDuxo.class, "onCancelOrderTapped", "onCancelOrderTapped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CryptoOrderDetailDuxo) this.receiver).onCancelOrderTapped();
    }
}
