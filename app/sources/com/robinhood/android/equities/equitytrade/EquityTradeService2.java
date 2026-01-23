package com.robinhood.android.equities.equitytrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradeService.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/EquityOrderState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$pdtWarningCheck$hasExecutions$2", m3645f = "EquityTradeService.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$pdtWarningCheck$hasExecutions$2, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeService2 extends ContinuationImpl7 implements Function2<com.robinhood.models.api.EquityOrderState, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    EquityTradeService2(Continuation<? super EquityTradeService2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeService2 equityTradeService2 = new EquityTradeService2(continuation);
        equityTradeService2.L$0 = obj;
        return equityTradeService2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(com.robinhood.models.api.EquityOrderState equityOrderState, Continuation<? super Boolean> continuation) {
        return ((EquityTradeService2) create(equityOrderState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.robinhood.models.api.EquityOrderState equityOrderState = (com.robinhood.models.api.EquityOrderState) this.L$0;
        return boxing.boxBoolean(equityOrderState.hasExecutions() || equityOrderState.isFinal());
    }
}
