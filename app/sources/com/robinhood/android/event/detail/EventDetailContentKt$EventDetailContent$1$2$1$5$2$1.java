package com.robinhood.android.event.detail;

import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EventDetailContentKt$EventDetailContent$1$2$1$5$2$1 extends FunctionReferenceImpl implements Function1<Point, Unit> {
    EventDetailContentKt$EventDetailContent$1$2$1$5$2$1(Object obj) {
        super(1, obj, EventDetailContentCallbacks.class, "onScrub", "onScrub(Lcom/robinhood/models/serverdriven/experimental/api/Point;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
        invoke2(point);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Point point) {
        ((EventDetailContentCallbacks) this.receiver).onScrub(point);
    }
}
