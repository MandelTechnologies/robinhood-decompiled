package com.robinhood.android.futures.trade.p147ui.orderform;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesOrderFormFragment$ComposeContent$3$1$1$1 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    FuturesOrderFormFragment$ComposeContent$3$1$1$1(Object obj) {
        super(1, obj, FuturesOrderFormDuxo.class, "onKeyPressed", "onKeyPressed(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesOrderFormDuxo) this.receiver).onKeyPressed(p0);
    }
}
