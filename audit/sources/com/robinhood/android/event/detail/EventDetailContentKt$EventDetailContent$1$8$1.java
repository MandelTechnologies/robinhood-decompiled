package com.robinhood.android.event.detail;

import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EventDetailContentKt$EventDetailContent$1$8$1 extends FunctionReferenceImpl implements Function1<EventDetailDisplayDataBottomSheet, Unit> {
    EventDetailContentKt$EventDetailContent$1$8$1(Object obj) {
        super(1, obj, EventDetailContentCallbacks.class, "onDisplayModeChange", "onDisplayModeChange(Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet) {
        invoke2(eventDetailDisplayDataBottomSheet);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EventDetailDisplayDataBottomSheet p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventDetailContentCallbacks) this.receiver).onDisplayModeChange(p0);
    }
}
