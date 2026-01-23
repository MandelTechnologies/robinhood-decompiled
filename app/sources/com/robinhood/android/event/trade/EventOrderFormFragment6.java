package com.robinhood.android.event.trade;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1$5$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventOrderFormFragment6 extends FunctionReferenceImpl implements Function0<Unit> {
    EventOrderFormFragment6(Object obj) {
        super(0, obj, EventOrderFormDuxo.class, "onPriceFieldFocused", "onPriceFieldFocused()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventOrderFormDuxo) this.receiver).onPriceFieldFocused();
    }
}
