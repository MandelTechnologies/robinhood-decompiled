package com.robinhood.android.event.trade;

import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1$8$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventOrderFormFragment7 extends FunctionReferenceImpl implements Function1<OrderFormTimeInForce, Unit> {
    EventOrderFormFragment7(Object obj) {
        super(1, obj, EventOrderFormDuxo.class, "onTimeInForceChanged", "onTimeInForceChanged(Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderFormTimeInForce orderFormTimeInForce) {
        invoke2(orderFormTimeInForce);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderFormTimeInForce p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventOrderFormDuxo) this.receiver).onTimeInForceChanged(p0);
    }
}
