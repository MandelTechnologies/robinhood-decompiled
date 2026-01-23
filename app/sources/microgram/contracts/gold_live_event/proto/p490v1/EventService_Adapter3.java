package microgram.contracts.gold_live_event.proto.p490v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.gold_live_event.proto.p490v1.EventService_Adapter;

/* compiled from: EventService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityResponseDto;", "request", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.gold_live_event.proto.v1.EventService_Adapter$UpdateEventPageVisibilityEndpoint$call$1", m3645f = "EventService_Adapter.kt", m3646l = {96}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.gold_live_event.proto.v1.EventService_Adapter$UpdateEventPageVisibilityEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class EventService_Adapter3 extends ContinuationImpl7 implements Function2<UpdateEventPageVisibilityRequestDto, Continuation<? super UpdateEventPageVisibilityResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventService_Adapter.UpdateEventPageVisibilityEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventService_Adapter3(EventService_Adapter.UpdateEventPageVisibilityEndpoint updateEventPageVisibilityEndpoint, Continuation<? super EventService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = updateEventPageVisibilityEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventService_Adapter3 eventService_Adapter3 = new EventService_Adapter3(this.this$0, continuation);
        eventService_Adapter3.L$0 = obj;
        return eventService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateEventPageVisibilityRequestDto updateEventPageVisibilityRequestDto, Continuation<? super UpdateEventPageVisibilityResponseDto> continuation) {
        return ((EventService_Adapter3) create(updateEventPageVisibilityRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UpdateEventPageVisibilityRequestDto updateEventPageVisibilityRequestDto = (UpdateEventPageVisibilityRequestDto) this.L$0;
        EventService eventService = this.this$0.service;
        this.label = 1;
        Object objUpdateEventPageVisibility = eventService.UpdateEventPageVisibility(updateEventPageVisibilityRequestDto, this);
        return objUpdateEventPageVisibility == coroutine_suspended ? coroutine_suspended : objUpdateEventPageVisibility;
    }
}
