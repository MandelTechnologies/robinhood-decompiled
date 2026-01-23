package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.event.p186db.dao.EventOrderDao;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetOrdersResponseDto;
import com.robinhood.idl.Response;
import com.robinhood.util.LastUpdatedAtManager;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "result", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$getOrdersEndpointPaginated$4", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, 271}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventOrderStore$getOrdersEndpointPaginated$4 extends ContinuationImpl7 implements Function3<Tuples2<? extends UUID, ? extends IdlPaginationCursor>, Response<? extends GetOrdersResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EventOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventOrderStore$getOrdersEndpointPaginated$4(EventOrderStore eventOrderStore, Continuation<? super EventOrderStore$getOrdersEndpointPaginated$4> continuation) {
        super(3, continuation);
        this.this$0 = eventOrderStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends IdlPaginationCursor> tuples2, Response<? extends GetOrdersResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<UUID, IdlPaginationCursor>) tuples2, (Response<GetOrdersResponseDto>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, IdlPaginationCursor> tuples2, Response<GetOrdersResponseDto> response, Continuation<? super Unit> continuation) {
        EventOrderStore$getOrdersEndpointPaginated$4 eventOrderStore$getOrdersEndpointPaginated$4 = new EventOrderStore$getOrdersEndpointPaginated$4(this.this$0, continuation);
        eventOrderStore$getOrdersEndpointPaginated$4.L$0 = tuples2;
        eventOrderStore$getOrdersEndpointPaginated$4.L$1 = response;
        return eventOrderStore$getOrdersEndpointPaginated$4.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r10 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Response response;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            response = (Response) this.L$1;
            List<FuturesOrderDto> results = ((GetOrdersResponseDto) response.getData()).getResults();
            EventOrderDao eventOrderDao = this.this$0.eventOrderDao;
            this.L$0 = response;
            this.label = 1;
            if (eventOrderDao.insert(results, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.eventStore.refreshEventContractList((List) obj);
            return Unit.INSTANCE;
        }
        response = (Response) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (((GetOrdersResponseDto) response.getData()).getNext() == null) {
            LastUpdatedAtManager.saveLastUpdatedAt$default(this.this$0.getLastUpdatedAtManager(), EventOrder.class, 0L, 2, null);
            EventOrderDao eventOrderDao2 = this.this$0.eventOrderDao;
            this.L$0 = null;
            this.label = 2;
            obj = eventOrderDao2.getOrderContractIdsWithoutEventId(this);
        }
        return Unit.INSTANCE;
    }
}
