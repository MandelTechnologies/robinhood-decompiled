package com.robinhood.android.futures.trade.p147ui.orderform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesOrderFormFragment$ComposeContent$3$1$5$1 extends FunctionReferenceImpl implements Function1<CaretType, Unit> {
    FuturesOrderFormFragment$ComposeContent$3$1$5$1(Object obj) {
        super(1, obj, FuturesOrderFormDuxo.class, "onCaretClicked", "onCaretClicked(Lcom/robinhood/android/futures/trade/ui/orderform/CaretType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CaretType caretType) {
        invoke2(caretType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CaretType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesOrderFormDuxo) this.receiver).onCaretClicked(p0);
    }
}
