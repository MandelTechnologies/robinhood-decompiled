package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.predictionmarkets.ContractSideExtensions;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetOrderFormDisplayDetailsRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetOrderFormDisplayDetailsResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.store.event.OrderDisplayStore;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "params", "Lcom/robinhood/store/event/OrderDisplayStore$OrderFormDisplayDetailsParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.OrderDisplayStore$getOrderFormDisplayDetailsEndpoint$1", m3645f = "OrderDisplayStore.kt", m3646l = {58, 49}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.OrderDisplayStore$getOrderFormDisplayDetailsEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class OrderDisplayStore2 extends ContinuationImpl7 implements Function2<OrderDisplayStore.OrderFormDisplayDetailsParams, Continuation<? super Response<? extends GetOrderFormDisplayDetailsResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OrderDisplayStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDisplayStore2(OrderDisplayStore orderDisplayStore, Continuation<? super OrderDisplayStore2> continuation) {
        super(2, continuation);
        this.this$0 = orderDisplayStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderDisplayStore2 orderDisplayStore2 = new OrderDisplayStore2(this.this$0, continuation);
        orderDisplayStore2.L$0 = obj;
        return orderDisplayStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(OrderDisplayStore.OrderFormDisplayDetailsParams orderFormDisplayDetailsParams, Continuation<? super Response<GetOrderFormDisplayDetailsResponseDto>> continuation) {
        return ((OrderDisplayStore2) create(orderFormDisplayDetailsParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(OrderDisplayStore.OrderFormDisplayDetailsParams orderFormDisplayDetailsParams, Continuation<? super Response<? extends GetOrderFormDisplayDetailsResponseDto>> continuation) {
        return invoke2(orderFormDisplayDetailsParams, (Continuation<? super Response<GetOrderFormDisplayDetailsResponseDto>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        InstrumentService instrumentService;
        GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OrderDisplayStore.OrderFormDisplayDetailsParams orderFormDisplayDetailsParams = (OrderDisplayStore.OrderFormDisplayDetailsParams) this.L$0;
            InstrumentService instrumentService2 = this.this$0.instrumentService;
            GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto2 = new GetOrderFormDisplayDetailsRequestDto(Uuids.safeToString(orderFormDisplayDetailsParams.getContractId()), ContractSideExtensions.toYesNoDto(orderFormDisplayDetailsParams.getSide()), orderFormDisplayDetailsParams.getPositionEffect().toIdlModel(), orderFormDisplayDetailsParams.getOrderFormOrderType().toIdlModel());
            PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.this$0.requestHeaderPlugin;
            this.L$0 = instrumentService2;
            this.L$1 = getOrderFormDisplayDetailsRequestDto2;
            this.label = 1;
            obj = predictionMarketsRequestHeaderDelegate2.buildRequestHeader(this);
            if (obj != coroutine_suspended) {
                instrumentService = instrumentService2;
                getOrderFormDisplayDetailsRequestDto = getOrderFormDisplayDetailsRequestDto2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        getOrderFormDisplayDetailsRequestDto = (GetOrderFormDisplayDetailsRequestDto) this.L$1;
        instrumentService = (InstrumentService) this.L$0;
        ResultKt.throwOnFailure(obj);
        Request<GetOrderFormDisplayDetailsRequestDto> request = new Request<>(getOrderFormDisplayDetailsRequestDto, (Map) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objGetOrderFormDisplayDetails = instrumentService.GetOrderFormDisplayDetails(request, this);
        return objGetOrderFormDisplayDetails == coroutine_suspended ? coroutine_suspended : objGetOrderFormDisplayDetails;
    }
}
