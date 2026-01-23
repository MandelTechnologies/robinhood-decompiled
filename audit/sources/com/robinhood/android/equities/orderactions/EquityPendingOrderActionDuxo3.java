package com.robinhood.android.equities.orderactions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityPendingOrderActionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$cancelOrder$3$1", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$cancelOrder$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityPendingOrderActionDuxo3 extends ContinuationImpl7 implements Function2<EquityPendingOrderActionDataState, Continuation<? super EquityPendingOrderActionDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    EquityPendingOrderActionDuxo3(Continuation<? super EquityPendingOrderActionDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityPendingOrderActionDuxo3 equityPendingOrderActionDuxo3 = new EquityPendingOrderActionDuxo3(continuation);
        equityPendingOrderActionDuxo3.L$0 = obj;
        return equityPendingOrderActionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityPendingOrderActionDataState equityPendingOrderActionDataState, Continuation<? super EquityPendingOrderActionDataState> continuation) {
        return ((EquityPendingOrderActionDuxo3) create(equityPendingOrderActionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityPendingOrderActionDataState.copy$default((EquityPendingOrderActionDataState) this.L$0, true, null, null, 6, null);
    }
}
