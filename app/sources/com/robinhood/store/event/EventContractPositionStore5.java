package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.ceres.p284v1.GetCurrentPositionsByContractIDResponseDto;
import com.robinhood.idl.Response;
import com.robinhood.store.event.EventContractPositionStore;
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
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/store/event/EventContractPositionStore$ContractPositionArgs;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "positions", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventContractPositionStore$positionsByContractEndpoint$4", m3645f = "EventContractPositionStore.kt", m3646l = {92}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventContractPositionStore$positionsByContractEndpoint$4, reason: use source file name */
/* loaded from: classes12.dex */
final class EventContractPositionStore5 extends ContinuationImpl7 implements Function3<Tuples2<? extends EventContractPositionStore.ContractPositionArgs, ? extends IdlPaginationCursor>, Response<? extends GetCurrentPositionsByContractIDResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EventContractPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventContractPositionStore5(EventContractPositionStore eventContractPositionStore, Continuation<? super EventContractPositionStore5> continuation) {
        super(3, continuation);
        this.this$0 = eventContractPositionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EventContractPositionStore.ContractPositionArgs, ? extends IdlPaginationCursor> tuples2, Response<? extends GetCurrentPositionsByContractIDResponseDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<EventContractPositionStore.ContractPositionArgs, IdlPaginationCursor>) tuples2, (Response<GetCurrentPositionsByContractIDResponseDto>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<EventContractPositionStore.ContractPositionArgs, IdlPaginationCursor> tuples2, Response<GetCurrentPositionsByContractIDResponseDto> response, Continuation<? super Unit> continuation) {
        EventContractPositionStore5 eventContractPositionStore5 = new EventContractPositionStore5(this.this$0, continuation);
        eventContractPositionStore5.L$0 = tuples2;
        eventContractPositionStore5.L$1 = response;
        return eventContractPositionStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            Response response = (Response) this.L$1;
            this.this$0.eventContractPositionDao.insertPaginatedByContract(((EventContractPositionStore.ContractPositionArgs) tuples2.component1()).getContractId(), (GetCurrentPositionsByContractIDResponseDto) response.getData());
            if (((GetCurrentPositionsByContractIDResponseDto) response.getData()).getNext() == null) {
                EventContractPositionStore eventContractPositionStore = this.this$0;
                this.L$0 = null;
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
