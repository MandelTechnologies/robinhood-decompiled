package com.robinhood.android.options.history.detail.order;

import com.robinhood.models.p320db.bonfire.WithholdingAmount;
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
@DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$17$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionOrderDetailDuxo$onStart$17$1 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
    final /* synthetic */ WithholdingAmount $withholdingAmountResponse;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOrderDetailDuxo$onStart$17$1(WithholdingAmount withholdingAmount, Continuation<? super OptionOrderDetailDuxo$onStart$17$1> continuation) {
        super(2, continuation);
        this.$withholdingAmountResponse = withholdingAmount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOrderDetailDuxo$onStart$17$1 optionOrderDetailDuxo$onStart$17$1 = new OptionOrderDetailDuxo$onStart$17$1(this.$withholdingAmountResponse, continuation);
        optionOrderDetailDuxo$onStart$17$1.L$0 = obj;
        return optionOrderDetailDuxo$onStart$17$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
        return ((OptionOrderDetailDuxo$onStart$17$1) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionOrderDetailDataState.copy$default((OptionOrderDetailDataState) this.L$0, null, false, null, null, null, null, null, null, null, null, null, false, null, null, this.$withholdingAmountResponse, null, false, false, false, null, 1032191, null);
    }
}
