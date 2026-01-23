package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.futures.dao.FuturesOrderDao;
import com.robinhood.android.models.futures.p189db.FuturesOrder;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetOrdersResponseDto;
import com.robinhood.idl.Response;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.util.LastUpdatedAtManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/store/futures/FuturesOrderStore$AllOrderRequestArgs;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "result", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getOrdersEndpointPaginated$4", m3645f = "FuturesOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$getOrdersEndpointPaginated$4 extends ContinuationImpl7 implements Function3<Tuples2<? extends FuturesOrderStore.AllOrderRequestArgs, ? extends IdlPaginationCursor>, Response<? extends GetOrdersResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$getOrdersEndpointPaginated$4(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$getOrdersEndpointPaginated$4> continuation) {
        super(3, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends FuturesOrderStore.AllOrderRequestArgs, ? extends IdlPaginationCursor> tuples2, Response<? extends GetOrdersResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<FuturesOrderStore.AllOrderRequestArgs, IdlPaginationCursor>) tuples2, (Response<GetOrdersResponseDto>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<FuturesOrderStore.AllOrderRequestArgs, IdlPaginationCursor> tuples2, Response<GetOrdersResponseDto> response, Continuation<? super Unit> continuation) {
        FuturesOrderStore$getOrdersEndpointPaginated$4 futuresOrderStore$getOrdersEndpointPaginated$4 = new FuturesOrderStore$getOrdersEndpointPaginated$4(this.this$0, continuation);
        futuresOrderStore$getOrdersEndpointPaginated$4.L$0 = tuples2;
        futuresOrderStore$getOrdersEndpointPaginated$4.L$1 = response;
        return futuresOrderStore$getOrdersEndpointPaginated$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Response response;
        FuturesOrderStore.AllOrderRequestArgs allOrderRequestArgs;
        List<FuturesOrderDto> list;
        String next;
        String previous;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            response = (Response) this.L$1;
            allOrderRequestArgs = (FuturesOrderStore.AllOrderRequestArgs) tuples2.component1();
            List<FuturesOrderDto> results = ((GetOrdersResponseDto) response.getData()).getResults();
            FuturesOrderDao futuresOrderDao = this.this$0.futuresOrderDao;
            this.L$0 = response;
            this.L$1 = allOrderRequestArgs;
            this.L$2 = results;
            this.label = 1;
            if (futuresOrderDao.insert(results, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = results;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$2;
            allOrderRequestArgs = (FuturesOrderStore.AllOrderRequestArgs) this.L$1;
            response = (Response) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Long l = (Long) this.this$0.requestIdsToMaxUpdatedAts.get(allOrderRequestArgs.getRequestId());
        long jMax = Math.max(l != null ? l.longValue() : 0L, this.this$0.getMaxUpdatedAt(list));
        this.this$0.requestIdsToMaxUpdatedAts.put(allOrderRequestArgs.getRequestId(), boxing.boxLong(jMax));
        if ((!((GetOrdersResponseDto) response.getData()).getResults().isEmpty() || ((previous = ((GetOrdersResponseDto) response.getData()).getPrevious()) != null && previous.length() != 0)) && ((next = ((GetOrdersResponseDto) response.getData()).getNext()) == null || next.length() == 0)) {
            LastUpdatedAtManager lastUpdatedAtManager = this.this$0.getLastUpdatedAtManager();
            Duration.Companion companion = Duration.INSTANCE;
            lastUpdatedAtManager.saveLastUpdatedAt(FuturesOrder.class, jMax - Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(1, DurationUnitJvm.MINUTES)));
            this.this$0.requestIdsToMaxUpdatedAts.remove(allOrderRequestArgs.getRequestId());
        }
        return Unit.INSTANCE;
    }
}
