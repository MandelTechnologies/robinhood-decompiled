package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetCashSettlementExecutionsRequestDto;
import com.robinhood.ceres.p284v1.GetCashSettlementExecutionsResponseDto;
import com.robinhood.store.event.EventCashSettlementStore;
import com.robinhood.utils.extensions.Uuids;
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

/* compiled from: EventCashSettlementStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponseDto;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/store/event/EventCashSettlementStore$GetAllPayoutArg;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventCashSettlementStore$getCashSettlementsEndpoint$1", m3645f = "EventCashSettlementStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventCashSettlementStore$getCashSettlementsEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EventCashSettlementStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends EventCashSettlementStore.GetAllPayoutArg, ? extends IdlPaginationCursor>, Continuation<? super GetCashSettlementExecutionsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventCashSettlementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventCashSettlementStore2(EventCashSettlementStore eventCashSettlementStore, Continuation<? super EventCashSettlementStore2> continuation) {
        super(2, continuation);
        this.this$0 = eventCashSettlementStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventCashSettlementStore2 eventCashSettlementStore2 = new EventCashSettlementStore2(this.this$0, continuation);
        eventCashSettlementStore2.L$0 = obj;
        return eventCashSettlementStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends EventCashSettlementStore.GetAllPayoutArg, ? extends IdlPaginationCursor> tuples2, Continuation<? super GetCashSettlementExecutionsResponseDto> continuation) {
        return invoke2((Tuples2<EventCashSettlementStore.GetAllPayoutArg, IdlPaginationCursor>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<EventCashSettlementStore.GetAllPayoutArg, IdlPaginationCursor> tuples2, Continuation<? super GetCashSettlementExecutionsResponseDto> continuation) {
        return ((EventCashSettlementStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EventCashSettlementStore.GetAllPayoutArg getAllPayoutArg = (EventCashSettlementStore.GetAllPayoutArg) tuples2.component1();
        IdlPaginationCursor idlPaginationCursor = (IdlPaginationCursor) tuples2.component2();
        Ceres ceres = this.this$0.ceres;
        UUID swapAccountId = getAllPayoutArg.getSwapAccountId();
        String strSafeToString = swapAccountId != null ? Uuids.safeToString(swapAccountId) : null;
        UUID contractId = getAllPayoutArg.getContractId();
        GetCashSettlementExecutionsRequestDto getCashSettlementExecutionsRequestDto = new GetCashSettlementExecutionsRequestDto(strSafeToString, idlPaginationCursor != null ? idlPaginationCursor.getValue() : null, null, contractId != null ? Uuids.safeToString(contractId) : null, null, null, null, 116, null);
        this.label = 1;
        Object objGetCashSettlementExecutions = ceres.GetCashSettlementExecutions(getCashSettlementExecutionsRequestDto, this);
        return objGetCashSettlementExecutions == coroutine_suspended ? coroutine_suspended : objGetCashSettlementExecutions;
    }
}
