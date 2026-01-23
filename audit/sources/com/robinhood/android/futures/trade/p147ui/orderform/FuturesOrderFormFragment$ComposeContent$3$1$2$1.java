package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesOrderFormFragment$ComposeContent$3$1$2$1 extends FunctionReferenceImpl implements Function1<FuturesOrderFormDataState.FocusedText, Unit> {
    FuturesOrderFormFragment$ComposeContent$3$1$2$1(Object obj) {
        super(1, obj, FuturesOrderFormDuxo.class, "onFocusChanged", "onFocusChanged(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FuturesOrderFormDataState.FocusedText focusedText) {
        invoke2(focusedText);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FuturesOrderFormDataState.FocusedText p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesOrderFormDuxo) this.receiver).onFocusChanged(p0);
    }
}
