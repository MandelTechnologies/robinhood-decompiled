package com.robinhood.android.event.trade;

import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventOrderFormFragment3 extends FunctionReferenceImpl implements Function1<UiEventOrderContext, Unit> {
    EventOrderFormFragment3(Object obj) {
        super(1, obj, EventOrderFormDuxo.class, "submitOrder", "submitOrder(Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UiEventOrderContext uiEventOrderContext) {
        invoke2(uiEventOrderContext);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiEventOrderContext p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventOrderFormDuxo) this.receiver).submitOrder(p0);
    }
}
