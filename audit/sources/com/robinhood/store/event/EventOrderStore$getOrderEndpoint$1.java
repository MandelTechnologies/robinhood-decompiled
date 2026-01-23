package com.robinhood.store.event;

import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetOrderByIDRequestDto;
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

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "orderId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$getOrderEndpoint$1", m3645f = "EventOrderStore.kt", m3646l = {102}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventOrderStore$getOrderEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super FuturesOrderDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventOrderStore$getOrderEndpoint$1(EventOrderStore eventOrderStore, Continuation<? super EventOrderStore$getOrderEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = eventOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventOrderStore$getOrderEndpoint$1 eventOrderStore$getOrderEndpoint$1 = new EventOrderStore$getOrderEndpoint$1(this.this$0, continuation);
        eventOrderStore$getOrderEndpoint$1.L$0 = obj;
        return eventOrderStore$getOrderEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super FuturesOrderDto> continuation) {
        return ((EventOrderStore$getOrderEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        Ceres ceres = this.this$0.ceres;
        GetOrderByIDRequestDto getOrderByIDRequestDto = new GetOrderByIDRequestDto(null, Uuids.safeToString(uuid), 1, null);
        this.label = 1;
        Object objGetOrderByID = ceres.GetOrderByID(getOrderByIDRequestDto, this);
        return objGetOrderByID == coroutine_suspended ? coroutine_suspended : objGetOrderByID;
    }
}
