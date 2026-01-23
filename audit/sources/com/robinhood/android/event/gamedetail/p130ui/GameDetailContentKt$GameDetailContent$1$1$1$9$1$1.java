package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailContentKt$GameDetailContent$1$1$1$9$1$1 extends FunctionReferenceImpl implements Function1<AboutEventType, Unit> {
    GameDetailContentKt$GameDetailContent$1$1$1$9$1$1(Object obj) {
        super(1, obj, GdpCommonCallbacks.class, "onAboutEventTypeSelected", "onAboutEventTypeSelected(Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AboutEventType aboutEventType) {
        invoke2(aboutEventType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AboutEventType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GdpCommonCallbacks) this.receiver).onAboutEventTypeSelected(p0);
    }
}
