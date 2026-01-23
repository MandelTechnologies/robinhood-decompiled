package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesLadderScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesLadderScreenKt$LadderScaffold$11$1$1 extends FunctionReferenceImpl implements Function1<FuturesTimeInForce, Unit> {
    FuturesLadderScreenKt$LadderScaffold$11$1$1(Object obj) {
        super(1, obj, LadderCallbacks.class, "onTimeInForceChanged", "onTimeInForceChanged(Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FuturesTimeInForce futuresTimeInForce) {
        invoke2(futuresTimeInForce);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FuturesTimeInForce p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((LadderCallbacks) this.receiver).onTimeInForceChanged(p0);
    }
}
