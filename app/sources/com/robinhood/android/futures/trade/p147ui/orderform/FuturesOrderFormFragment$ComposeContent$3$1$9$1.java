package com.robinhood.android.futures.trade.p147ui.orderform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesOrderFormFragment$ComposeContent$3$1$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesOrderFormFragment$ComposeContent$3$1$9$1(Object obj) {
        super(0, obj, FuturesOrderFormDuxo.class, "onTimeInForceSelectorDismissed", "onTimeInForceSelectorDismissed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesOrderFormDuxo) this.receiver).onTimeInForceSelectorDismissed();
    }
}
