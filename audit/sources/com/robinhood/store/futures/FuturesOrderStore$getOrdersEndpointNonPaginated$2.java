package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesOrderDao;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetOrdersResponseDto;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getOrdersEndpointNonPaginated$2", m3645f = "FuturesOrderStore.kt", m3646l = {155}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$getOrdersEndpointNonPaginated$2 extends ContinuationImpl7 implements Function2<GetOrdersResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$getOrdersEndpointNonPaginated$2(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$getOrdersEndpointNonPaginated$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$getOrdersEndpointNonPaginated$2 futuresOrderStore$getOrdersEndpointNonPaginated$2 = new FuturesOrderStore$getOrdersEndpointNonPaginated$2(this.this$0, continuation);
        futuresOrderStore$getOrdersEndpointNonPaginated$2.L$0 = obj;
        return futuresOrderStore$getOrdersEndpointNonPaginated$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetOrdersResponseDto getOrdersResponseDto, Continuation<? super Unit> continuation) {
        return ((FuturesOrderStore$getOrdersEndpointNonPaginated$2) create(getOrdersResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetOrdersResponseDto getOrdersResponseDto = (GetOrdersResponseDto) this.L$0;
            FuturesOrderDao futuresOrderDao = this.this$0.futuresOrderDao;
            List<FuturesOrderDto> results = getOrdersResponseDto.getResults();
            this.label = 1;
            if (futuresOrderDao.insert(results, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
