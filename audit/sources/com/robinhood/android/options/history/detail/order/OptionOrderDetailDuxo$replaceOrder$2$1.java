package com.robinhood.android.options.history.detail.order;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$replaceOrder$2$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionOrderDetailDuxo$replaceOrder$2$1 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    OptionOrderDetailDuxo$replaceOrder$2$1(Continuation<? super OptionOrderDetailDuxo$replaceOrder$2$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOrderDetailDuxo$replaceOrder$2$1 optionOrderDetailDuxo$replaceOrder$2$1 = new OptionOrderDetailDuxo$replaceOrder$2$1(continuation);
        optionOrderDetailDuxo$replaceOrder$2$1.L$0 = obj;
        return optionOrderDetailDuxo$replaceOrder$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
        return ((OptionOrderDetailDuxo$replaceOrder$2$1) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, false, null, 1046527, null);
    }
}
