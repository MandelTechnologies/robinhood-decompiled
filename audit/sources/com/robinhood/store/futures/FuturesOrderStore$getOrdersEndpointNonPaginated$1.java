package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p189db.FuturesOrder;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.ceres.p284v1.GetOrdersRequestDto;
import com.robinhood.ceres.p284v1.GetOrdersResponseDto;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;", "args", "Lcom/robinhood/store/futures/FuturesOrderStore$PartialOrdersRequestArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getOrdersEndpointNonPaginated$1", m3645f = "FuturesOrderStore.kt", m3646l = {144}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$getOrdersEndpointNonPaginated$1 extends ContinuationImpl7 implements Function2<FuturesOrderStore.PartialOrdersRequestArgs, Continuation<? super GetOrdersResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$getOrdersEndpointNonPaginated$1(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$getOrdersEndpointNonPaginated$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$getOrdersEndpointNonPaginated$1 futuresOrderStore$getOrdersEndpointNonPaginated$1 = new FuturesOrderStore$getOrdersEndpointNonPaginated$1(this.this$0, continuation);
        futuresOrderStore$getOrdersEndpointNonPaginated$1.L$0 = obj;
        return futuresOrderStore$getOrdersEndpointNonPaginated$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesOrderStore.PartialOrdersRequestArgs partialOrdersRequestArgs, Continuation<? super GetOrdersResponseDto> continuation) {
        return ((FuturesOrderStore$getOrdersEndpointNonPaginated$1) create(partialOrdersRequestArgs, continuation)).invokeSuspend(Unit.INSTANCE);
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
        FuturesOrderStore.PartialOrdersRequestArgs partialOrdersRequestArgs = (FuturesOrderStore.PartialOrdersRequestArgs) this.L$0;
        Instant lastUpdatedAt = this.this$0.getLastUpdatedAtManager().getLastUpdatedAt(FuturesOrder.class);
        Ceres ceres = this.this$0.ceres;
        String strSafeToString = Uuids.safeToString(partialOrdersRequestArgs.getFuturesAccountId());
        UUID contractId = partialOrdersRequestArgs.getContractId();
        GetOrdersRequestDto getOrdersRequestDto = new GetOrdersRequestDto(strSafeToString, null, contractId != null ? Uuids.safeToString(contractId) : null, null, null, null, null, null, null, null, null, null, lastUpdatedAt != null ? lastUpdatedAt.toString() : null, null, null, null, FuturesContractTypeDto.OUTRIGHT, null, null, null, null, 2027514, null);
        this.label = 1;
        Object objGetOrders = ceres.GetOrders(getOrdersRequestDto, this);
        return objGetOrders == coroutine_suspended ? coroutine_suspended : objGetOrders;
    }
}
