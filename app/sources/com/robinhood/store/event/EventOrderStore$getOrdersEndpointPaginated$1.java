package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.ceres.p284v1.GetOrdersRequestDto;
import com.robinhood.ceres.p284v1.GetOrdersResponseDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$getOrdersEndpointPaginated$1", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventOrderStore$getOrdersEndpointPaginated$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends IdlPaginationCursor>, Continuation<? super Response<? extends GetOrdersResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventOrderStore$getOrdersEndpointPaginated$1(EventOrderStore eventOrderStore, Continuation<? super EventOrderStore$getOrdersEndpointPaginated$1> continuation) {
        super(2, continuation);
        this.this$0 = eventOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventOrderStore$getOrdersEndpointPaginated$1 eventOrderStore$getOrdersEndpointPaginated$1 = new EventOrderStore$getOrdersEndpointPaginated$1(this.this$0, continuation);
        eventOrderStore$getOrdersEndpointPaginated$1.L$0 = obj;
        return eventOrderStore$getOrdersEndpointPaginated$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends IdlPaginationCursor> tuples2, Continuation<? super Response<? extends GetOrdersResponseDto>> continuation) {
        return invoke2((Tuples2<UUID, IdlPaginationCursor>) tuples2, (Continuation<? super Response<GetOrdersResponseDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, IdlPaginationCursor> tuples2, Continuation<? super Response<GetOrdersResponseDto>> continuation) {
        return ((EventOrderStore$getOrdersEndpointPaginated$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
        Instant lastUpdatedAt = this.this$0.getLastUpdatedAtManager().getLastUpdatedAt(EventOrder.class);
        Ceres ceres = this.this$0.ceres;
        Request<GetOrdersRequestDto> request = new Request<>(new GetOrdersRequestDto(null, null, null, idlPaginationCursor != null ? idlPaginationCursor.getValue() : null, null, null, null, null, null, null, null, null, lastUpdatedAt != null ? lastUpdatedAt.toString() : null, null, null, null, FuturesContractTypeDto.EVENT_CONTRACT, null, null, null, null, 2027511, null), null, 2, null);
        this.label = 1;
        Object objGetOrders = ceres.GetOrders(request, this);
        return objGetOrders == coroutine_suspended ? coroutine_suspended : objGetOrders;
    }
}
