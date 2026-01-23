package com.robinhood.android.equities.orderactions;

import com.robinhood.models.p320db.Order;
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
@DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$replaceOrder$3$1", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$replaceOrder$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityPendingOrderActionDuxo7 extends ContinuationImpl7 implements Function2<EquityPendingOrderActionDataState, Continuation<? super EquityPendingOrderActionDataState>, Object> {
    final /* synthetic */ Order $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityPendingOrderActionDuxo7(Order order, Continuation<? super EquityPendingOrderActionDuxo7> continuation) {
        super(2, continuation);
        this.$it = order;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityPendingOrderActionDuxo7 equityPendingOrderActionDuxo7 = new EquityPendingOrderActionDuxo7(this.$it, continuation);
        equityPendingOrderActionDuxo7.L$0 = obj;
        return equityPendingOrderActionDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityPendingOrderActionDataState equityPendingOrderActionDataState, Continuation<? super EquityPendingOrderActionDataState> continuation) {
        return ((EquityPendingOrderActionDuxo7) create(equityPendingOrderActionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityPendingOrderActionDataState.copy$default((EquityPendingOrderActionDataState) this.L$0, true, this.$it, null, 4, null);
    }
}
