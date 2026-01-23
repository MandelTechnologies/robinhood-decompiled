package com.robinhood.android.event.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.EventDetailScreenKt$EventDetailScreen$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventDetailScreen2 extends FunctionReferenceImpl implements Function0<Unit> {
    EventDetailScreen2(Object obj) {
        super(0, obj, EventDetailFragment2.class, "onExitScreen", "onExitScreen()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventDetailFragment2) this.receiver).onExitScreen();
    }
}
