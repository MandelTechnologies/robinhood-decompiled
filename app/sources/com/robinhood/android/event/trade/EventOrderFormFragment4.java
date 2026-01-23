package com.robinhood.android.event.trade;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1$3$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventOrderFormFragment4 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    EventOrderFormFragment4(Object obj) {
        super(1, obj, EventOrderFormDuxo.class, "onKeyPressed", "onKeyPressed(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventOrderFormDuxo) this.receiver).onKeyPressed(p0);
    }
}
