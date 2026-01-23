package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.arsenal.proto.p281v1.idl.CountEventsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.CountEventsResponseDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponseDto;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$getEventCount$1", m3645f = "EventStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventStore$getEventCount$1 extends ContinuationImpl7 implements Function2<CountEventsRequestDto, Continuation<? super CountEventsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventStore$getEventCount$1(EventStore eventStore, Continuation<? super EventStore$getEventCount$1> continuation) {
        super(2, continuation);
        this.this$0 = eventStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventStore$getEventCount$1 eventStore$getEventCount$1 = new EventStore$getEventCount$1(this.this$0, continuation);
        eventStore$getEventCount$1.L$0 = obj;
        return eventStore$getEventCount$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CountEventsRequestDto countEventsRequestDto, Continuation<? super CountEventsResponseDto> continuation) {
        return ((EventStore$getEventCount$1) create(countEventsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CountEventsRequestDto countEventsRequestDto = (CountEventsRequestDto) this.L$0;
        InstrumentService instrumentService = this.this$0.instrumentService;
        this.label = 1;
        Object objCountEvents = instrumentService.CountEvents(countEventsRequestDto, this);
        return objCountEvents == coroutine_suspended ? coroutine_suspended : objCountEvents;
    }
}
