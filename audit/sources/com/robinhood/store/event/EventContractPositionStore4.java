package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetCurrentPositionsByContractIDRequestDto;
import com.robinhood.ceres.p284v1.GetCurrentPositionsByContractIDResponseDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.utils.extensions.Uuids;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventContractPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponseDto;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/store/event/EventContractPositionStore$ContractPositionArgs;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventContractPositionStore$positionsByContractEndpoint$1", m3645f = "EventContractPositionStore.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventContractPositionStore$positionsByContractEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EventContractPositionStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends EventContractPositionStore.ContractPositionArgs, ? extends IdlPaginationCursor>, Continuation<? super Response<? extends GetCurrentPositionsByContractIDResponseDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventContractPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventContractPositionStore4(EventContractPositionStore eventContractPositionStore, Continuation<? super EventContractPositionStore4> continuation) {
        super(2, continuation);
        this.this$0 = eventContractPositionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventContractPositionStore4 eventContractPositionStore4 = new EventContractPositionStore4(this.this$0, continuation);
        eventContractPositionStore4.L$0 = obj;
        return eventContractPositionStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EventContractPositionStore.ContractPositionArgs, ? extends IdlPaginationCursor> tuples2, Continuation<? super Response<? extends GetCurrentPositionsByContractIDResponseDto>> continuation) {
        return invoke2((Tuples2<EventContractPositionStore.ContractPositionArgs, IdlPaginationCursor>) tuples2, (Continuation<? super Response<GetCurrentPositionsByContractIDResponseDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<EventContractPositionStore.ContractPositionArgs, IdlPaginationCursor> tuples2, Continuation<? super Response<GetCurrentPositionsByContractIDResponseDto>> continuation) {
        return ((EventContractPositionStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EventContractPositionStore.ContractPositionArgs contractPositionArgs = (EventContractPositionStore.ContractPositionArgs) tuples2.component1();
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
        Ceres ceres = this.this$0.ceres;
        Request<GetCurrentPositionsByContractIDRequestDto> request = new Request<>(new GetCurrentPositionsByContractIDRequestDto(Uuids.safeToString(contractPositionArgs.getAccountId()), Uuids.safeToString(contractPositionArgs.getContractId()), idlPaginationCursor != null ? idlPaginationCursor.getValue() : null, null, 8, null), null, 2, null);
        this.label = 1;
        Object objGetCurrentPositionsByContractID = ceres.GetCurrentPositionsByContractID(request, this);
        return objGetCurrentPositionsByContractID == coroutine_suspended ? coroutine_suspended : objGetCurrentPositionsByContractID;
    }
}
