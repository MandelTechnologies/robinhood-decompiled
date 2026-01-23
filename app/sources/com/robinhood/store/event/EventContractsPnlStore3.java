package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.ceres.EventContractRealizedPnlByContract2;
import com.robinhood.ceres.p284v1.GetEventContractRealizedPnlByContractResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventContractsPnlStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventContractsPnlStore$getEventContractRealizedPnlByContractEndpoint$2", m3645f = "EventContractsPnlStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.EventContractsPnlStore$getEventContractRealizedPnlByContractEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class EventContractsPnlStore3 extends ContinuationImpl7 implements Function2<GetEventContractRealizedPnlByContractResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventContractsPnlStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventContractsPnlStore3(EventContractsPnlStore eventContractsPnlStore, Continuation<? super EventContractsPnlStore3> continuation) {
        super(2, continuation);
        this.this$0 = eventContractsPnlStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventContractsPnlStore3 eventContractsPnlStore3 = new EventContractsPnlStore3(this.this$0, continuation);
        eventContractsPnlStore3.L$0 = obj;
        return eventContractsPnlStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetEventContractRealizedPnlByContractResponseDto getEventContractRealizedPnlByContractResponseDto, Continuation<? super Unit> continuation) {
        return ((EventContractsPnlStore3) create(getEventContractRealizedPnlByContractResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.eventContractRealizedPnlDao.insert(EventContractRealizedPnlByContract2.toDbModel((GetEventContractRealizedPnlByContractResponseDto) this.L$0));
        return Unit.INSTANCE;
    }
}
