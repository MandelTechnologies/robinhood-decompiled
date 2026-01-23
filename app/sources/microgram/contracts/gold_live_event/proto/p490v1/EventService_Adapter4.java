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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusResponseDto;", "request", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.gold_live_event.proto.v1.EventService_Adapter$UpdatePlaybackStatusEndpoint$call$1", m3645f = "EventService_Adapter.kt", m3646l = {105}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.gold_live_event.proto.v1.EventService_Adapter$UpdatePlaybackStatusEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class EventService_Adapter4 extends ContinuationImpl7 implements Function2<UpdatePlaybackStatusRequestDto, Continuation<? super UpdatePlaybackStatusResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventService_Adapter.UpdatePlaybackStatusEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventService_Adapter4(EventService_Adapter.UpdatePlaybackStatusEndpoint updatePlaybackStatusEndpoint, Continuation<? super EventService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = updatePlaybackStatusEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventService_Adapter4 eventService_Adapter4 = new EventService_Adapter4(this.this$0, continuation);
        eventService_Adapter4.L$0 = obj;
        return eventService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdatePlaybackStatusRequestDto updatePlaybackStatusRequestDto, Continuation<? super UpdatePlaybackStatusResponseDto> continuation) {
        return ((EventService_Adapter4) create(updatePlaybackStatusRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UpdatePlaybackStatusRequestDto updatePlaybackStatusRequestDto = (UpdatePlaybackStatusRequestDto) this.L$0;
        EventService eventService = this.this$0.service;
        this.label = 1;
        Object objUpdatePlaybackStatus = eventService.UpdatePlaybackStatus(updatePlaybackStatusRequestDto, this);
        return objUpdatePlaybackStatus == coroutine_suspended ? coroutine_suspended : objUpdatePlaybackStatus;
    }
}
