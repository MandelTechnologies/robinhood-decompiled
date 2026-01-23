package com.robinhood.android.event.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EventDetailContentKt$EventDetailContent$1$2$1$14 extends FunctionReferenceImpl implements Function0<Unit> {
    EventDetailContentKt$EventDetailContent$1$2$1$14(Object obj) {
        super(0, obj, EventDetailContentCallbacks.class, "onEventFaqClick", "onEventFaqClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventDetailContentCallbacks) this.receiver).onEventFaqClick();
    }
}
