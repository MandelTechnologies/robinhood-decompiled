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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: EquityPendingOrderActionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Order;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$replaceOrder$2$1", m3645f = "EquityPendingOrderActionDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.orderactions.EquityPendingOrderActionDuxo$replaceOrder$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityPendingOrderActionDuxo6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Order>, Object> {
    final /* synthetic */ EquityPendingOrderActionDuxo $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityPendingOrderActionDuxo6(EquityPendingOrderActionDuxo equityPendingOrderActionDuxo, Continuation<? super EquityPendingOrderActionDuxo6> continuation) {
        super(2, continuation);
        this.$this_runCatching = equityPendingOrderActionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityPendingOrderActionDuxo6(this.$this_runCatching, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Order> continuation) {
        return ((EquityPendingOrderActionDuxo6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.$this_runCatching.orderStore.getOrder(this.$this_runCatching.args.getEquityOrderId())), Integer.MAX_VALUE, null, 2, null);
        this.label = 1;
        Object objFirst = FlowKt.first(flowBuffer$default, this);
        return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
    }
}
