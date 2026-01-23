package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.ceres.p284v1.GetCurrentPositionsResponseDto;
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
import kotlin.jvm.functions.Function3;

/* compiled from: EventContractPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "result", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventContractPositionStore$allPositionsEndpoint$4", m3645f = "EventContractPositionStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventContractPositionStore$allPositionsEndpoint$4, reason: use source file name */
/* loaded from: classes12.dex */
final class EventContractPositionStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends UUID, ? extends IdlPaginationCursor>, Response<? extends GetCurrentPositionsResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventContractPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventContractPositionStore3(EventContractPositionStore eventContractPositionStore, Continuation<? super EventContractPositionStore3> continuation) {
        super(3, continuation);
        this.this$0 = eventContractPositionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends IdlPaginationCursor> tuples2, Response<? extends GetCurrentPositionsResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<UUID, IdlPaginationCursor>) tuples2, (Response<GetCurrentPositionsResponseDto>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, IdlPaginationCursor> tuples2, Response<GetCurrentPositionsResponseDto> response, Continuation<? super Unit> continuation) {
        EventContractPositionStore3 eventContractPositionStore3 = new EventContractPositionStore3(this.this$0, continuation);
        eventContractPositionStore3.L$0 = response;
        return eventContractPositionStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Response response = (Response) this.L$0;
            this.this$0.eventContractPositionDao.insertPaginated((GetCurrentPositionsResponseDto) response.getData());
            if (((GetCurrentPositionsResponseDto) response.getData()).getNext() == null) {
                EventContractPositionStore eventContractPositionStore = this.this$0;
                this.label = 1;
                if (eventContractPositionStore.refreshForMissingEventContracts(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
