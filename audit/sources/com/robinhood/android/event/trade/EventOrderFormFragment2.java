package com.robinhood.android.event.trade;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: EventOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventOrderFormFragment2 extends AdaptedFunctionReference implements Function0<Unit> {
    EventOrderFormFragment2(Object obj) {
        super(0, obj, EventOrderFormFragment.class, "onBackPressed", "onBackPressed()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventOrderFormFragment) this.receiver).onBackPressed();
    }
}
