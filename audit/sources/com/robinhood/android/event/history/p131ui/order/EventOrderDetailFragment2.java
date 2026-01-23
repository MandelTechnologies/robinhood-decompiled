package com.robinhood.android.event.history.p131ui.order;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventOrderDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventOrderDetailFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    EventOrderDetailFragment2(Object obj) {
        super(0, obj, EventOrderDetailDuxo.class, "cancelOrder", "cancelOrder()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventOrderDetailDuxo) this.receiver).cancelOrder();
    }
}
