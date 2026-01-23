package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesOrderFormFragment$ComposeContent$3$1$8$1 extends FunctionReferenceImpl implements Function1<FuturesTimeInForce, Unit> {
    FuturesOrderFormFragment$ComposeContent$3$1$8$1(Object obj) {
        super(1, obj, FuturesOrderFormDuxo.class, "onTimeInForceSelected", "onTimeInForceSelected(Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FuturesTimeInForce futuresTimeInForce) {
        invoke2(futuresTimeInForce);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FuturesTimeInForce p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesOrderFormDuxo) this.receiver).onTimeInForceSelected(p0);
    }
}
