package com.robinhood.android.options.history.detail.order;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import wormhole.service.p554v1.GetRealizedGainLossItemResponseDto;
import wormhole.service.p554v1.RealizedGainLossItemDto;

/* compiled from: OptionOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.order.OptionOrderDetailDuxo$onStart$5$1", m3645f = "OptionOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionOrderDetailDuxo$onStart$5$1 extends ContinuationImpl7 implements Function2<OptionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState>, Object> {
    final /* synthetic */ GetRealizedGainLossItemResponseDto $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOrderDetailDuxo$onStart$5$1(GetRealizedGainLossItemResponseDto getRealizedGainLossItemResponseDto, Continuation<? super OptionOrderDetailDuxo$onStart$5$1> continuation) {
        super(2, continuation);
        this.$response = getRealizedGainLossItemResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOrderDetailDuxo$onStart$5$1 optionOrderDetailDuxo$onStart$5$1 = new OptionOrderDetailDuxo$onStart$5$1(this.$response, continuation);
        optionOrderDetailDuxo$onStart$5$1.L$0 = obj;
        return optionOrderDetailDuxo$onStart$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionOrderDetailDataState optionOrderDetailDataState, Continuation<? super OptionOrderDetailDataState> continuation) {
        return ((OptionOrderDetailDuxo$onStart$5$1) create(optionOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OptionOrderDetailDataState optionOrderDetailDataState = (OptionOrderDetailDataState) this.L$0;
        RealizedGainLossItemDto item = this.$response.getItem();
        return OptionOrderDetailDataState.copy$default(optionOrderDetailDataState, null, false, null, null, null, null, null, null, null, null, item != null ? ProfitAndLossTradeItem2.toDbModel(item, null, null) : null, false, null, null, null, null, false, false, false, null, 1047551, null);
    }
}
