package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.ApiOptionPositionReturnRequest;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse;
import com.robinhood.models.p320db.OrderDirection;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionStrategyDetailStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponse;", "request", "Lcom/robinhood/models/api/ApiOptionPositionReturnRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionTodayTotalReturn$1", m3645f = "OptionStrategyDetailStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionTodayTotalReturn$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionStrategyDetailStore6 extends ContinuationImpl7 implements Function2<ApiOptionPositionReturnRequest, Continuation<? super ApiOptionTodayTotalReturnResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionStrategyDetailStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyDetailStore6(OptionStrategyDetailStore optionStrategyDetailStore, Continuation<? super OptionStrategyDetailStore6> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyDetailStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionStrategyDetailStore6 optionStrategyDetailStore6 = new OptionStrategyDetailStore6(this.this$0, continuation);
        optionStrategyDetailStore6.L$0 = obj;
        return optionStrategyDetailStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionPositionReturnRequest apiOptionPositionReturnRequest, Continuation<? super ApiOptionTodayTotalReturnResponse> continuation) {
        return ((OptionStrategyDetailStore6) create(apiOptionPositionReturnRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object optionTodayTotalReturn;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiOptionPositionReturnRequest apiOptionPositionReturnRequest = (ApiOptionPositionReturnRequest) this.L$0;
            OptionsBonfireApi optionsBonfireApi = this.this$0.optionsBonfireApi;
            int iIntValue = apiOptionPositionReturnRequest.getTradeValueMultiplier().intValue();
            BigDecimal markPrice = apiOptionPositionReturnRequest.getMarkPrice();
            OrderDirection markPriceDirection = apiOptionPositionReturnRequest.getMarkPriceDirection();
            BigDecimal previousClosePrice = apiOptionPositionReturnRequest.getPreviousClosePrice();
            OrderDirection previousClosePriceDirection = apiOptionPositionReturnRequest.getPreviousClosePriceDirection();
            int iIntValue2 = apiOptionPositionReturnRequest.getQuantity().intValue();
            BigDecimal costBasis = apiOptionPositionReturnRequest.getCostBasis();
            OrderDirection direction = apiOptionPositionReturnRequest.getDirection();
            int iIntValue3 = apiOptionPositionReturnRequest.getIntradayQuantity().intValue();
            BigDecimal intradayCostBasis = apiOptionPositionReturnRequest.getIntradayCostBasis();
            OrderDirection intradayDirection = apiOptionPositionReturnRequest.getIntradayDirection();
            this.label = 1;
            optionTodayTotalReturn = optionsBonfireApi.getOptionTodayTotalReturn(iIntValue, markPrice, markPriceDirection, previousClosePrice, previousClosePriceDirection, iIntValue2, costBasis, direction, iIntValue3, intradayCostBasis, intradayDirection, this);
            if (optionTodayTotalReturn == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            optionTodayTotalReturn = obj;
        }
        return (ApiOptionTodayTotalReturnResponse) optionTodayTotalReturn;
    }
}
