package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesOrderFormFragment$ComposeContent$3$1$6$1 extends FunctionReferenceImpl implements Function1<UiFuturesOrderContext, Unit> {
    FuturesOrderFormFragment$ComposeContent$3$1$6$1(Object obj) {
        super(1, obj, FuturesOrderFormDuxo.class, "submitOrder", "submitOrder(Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UiFuturesOrderContext uiFuturesOrderContext) {
        invoke2(uiFuturesOrderContext);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiFuturesOrderContext p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesOrderFormDuxo) this.receiver).submitOrder(p0);
    }
}
