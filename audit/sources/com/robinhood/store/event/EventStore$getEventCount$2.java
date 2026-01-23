package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.arsenal.proto.p281v1.idl.CountEventsResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$getEventCount$2", m3645f = "EventStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventStore$getEventCount$2 extends ContinuationImpl7 implements Function2<CountEventsResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventStore$getEventCount$2(EventStore eventStore, Continuation<? super EventStore$getEventCount$2> continuation) {
        super(2, continuation);
        this.this$0 = eventStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventStore$getEventCount$2 eventStore$getEventCount$2 = new EventStore$getEventCount$2(this.this$0, continuation);
        eventStore$getEventCount$2.L$0 = obj;
        return eventStore$getEventCount$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CountEventsResponseDto countEventsResponseDto, Continuation<? super Unit> continuation) {
        return ((EventStore$getEventCount$2) create(countEventsResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CountEventsResponseDto countEventsResponseDto = (CountEventsResponseDto) this.L$0;
            SharedFlow2 sharedFlow2 = this.this$0.eventCountFlow;
            Long lBoxLong = boxing.boxLong(countEventsResponseDto.getCount());
            this.label = 1;
            if (sharedFlow2.emit(lBoxLong, this) == coroutine_suspended) {
                return coroutine_suspended;
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
