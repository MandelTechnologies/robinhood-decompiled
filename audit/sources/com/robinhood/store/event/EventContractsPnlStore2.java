package com.robinhood.store.event;

import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetEventContractRealizedPnlByContractRequestDto;
import com.robinhood.ceres.p284v1.GetEventContractRealizedPnlByContractResponseDto;
import com.robinhood.store.event.EventContractsPnlStore;
import com.robinhood.utils.extensions.Uuids;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventContractsPnlStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponseDto;", "params", "Lcom/robinhood/store/event/EventContractsPnlStore$EventContractRealizedPnlByContractParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventContractsPnlStore$getEventContractRealizedPnlByContractEndpoint$1", m3645f = "EventContractsPnlStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventContractsPnlStore$getEventContractRealizedPnlByContractEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class EventContractsPnlStore2 extends ContinuationImpl7 implements Function2<EventContractsPnlStore.EventContractRealizedPnlByContractParams, Continuation<? super GetEventContractRealizedPnlByContractResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventContractsPnlStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventContractsPnlStore2(EventContractsPnlStore eventContractsPnlStore, Continuation<? super EventContractsPnlStore2> continuation) {
        super(2, continuation);
        this.this$0 = eventContractsPnlStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventContractsPnlStore2 eventContractsPnlStore2 = new EventContractsPnlStore2(this.this$0, continuation);
        eventContractsPnlStore2.L$0 = obj;
        return eventContractsPnlStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EventContractsPnlStore.EventContractRealizedPnlByContractParams eventContractRealizedPnlByContractParams, Continuation<? super GetEventContractRealizedPnlByContractResponseDto> continuation) {
        return ((EventContractsPnlStore2) create(eventContractRealizedPnlByContractParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EventContractsPnlStore.EventContractRealizedPnlByContractParams eventContractRealizedPnlByContractParams = (EventContractsPnlStore.EventContractRealizedPnlByContractParams) this.L$0;
        Ceres ceres = this.this$0.ceres;
        GetEventContractRealizedPnlByContractRequestDto getEventContractRealizedPnlByContractRequestDto = new GetEventContractRealizedPnlByContractRequestDto(Uuids.safeToString(eventContractRealizedPnlByContractParams.getAccountId()));
        this.label = 1;
        Object objGetEventContractRealizedPnlByContract = ceres.GetEventContractRealizedPnlByContract(getEventContractRealizedPnlByContractRequestDto, this);
        return objGetEventContractRealizedPnlByContract == coroutine_suspended ? coroutine_suspended : objGetEventContractRealizedPnlByContract;
    }
}
