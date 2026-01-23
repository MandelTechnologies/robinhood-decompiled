package com.robinhood.android.trade.equity.p261ui.share;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityShareOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$generateSummary$1$readyState$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class EquityShareOrderDuxo$generateSummary$1$readyState$1 extends ContinuationImpl7 implements Function2<EquityShareOrderViewState, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    EquityShareOrderDuxo$generateSummary$1$readyState$1(Continuation<? super EquityShareOrderDuxo$generateSummary$1$readyState$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityShareOrderDuxo$generateSummary$1$readyState$1 equityShareOrderDuxo$generateSummary$1$readyState$1 = new EquityShareOrderDuxo$generateSummary$1$readyState$1(continuation);
        equityShareOrderDuxo$generateSummary$1$readyState$1.L$0 = obj;
        return equityShareOrderDuxo$generateSummary$1$readyState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityShareOrderViewState equityShareOrderViewState, Continuation<? super Boolean> continuation) {
        return ((EquityShareOrderDuxo$generateSummary$1$readyState$1) create(equityShareOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(((EquityShareOrderViewState) this.L$0).getUseMicrogramOrderSummary());
    }
}
