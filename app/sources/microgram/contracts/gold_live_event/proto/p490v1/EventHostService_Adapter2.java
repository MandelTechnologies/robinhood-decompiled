package microgram.contracts.gold_live_event.proto.p490v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.gold_live_event.proto.p490v1.EventHostService_Adapter;

/* compiled from: EventHostService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/gold_live_event/proto/v1/DismissResponseDto;", "request", "Lmicrogram/contracts/gold_live_event/proto/v1/DismissRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.gold_live_event.proto.v1.EventHostService_Adapter$DismissEndpoint$call$1", m3645f = "EventHostService_Adapter.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.gold_live_event.proto.v1.EventHostService_Adapter$DismissEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class EventHostService_Adapter2 extends ContinuationImpl7 implements Function2<DismissRequestDto, Continuation<? super DismissResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventHostService_Adapter.DismissEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventHostService_Adapter2(EventHostService_Adapter.DismissEndpoint dismissEndpoint, Continuation<? super EventHostService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = dismissEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventHostService_Adapter2 eventHostService_Adapter2 = new EventHostService_Adapter2(this.this$0, continuation);
        eventHostService_Adapter2.L$0 = obj;
        return eventHostService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DismissRequestDto dismissRequestDto, Continuation<? super DismissResponseDto> continuation) {
        return ((EventHostService_Adapter2) create(dismissRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DismissRequestDto dismissRequestDto = (DismissRequestDto) this.L$0;
        EventHostService eventHostService = this.this$0.service;
        this.label = 1;
        Object objDismiss = eventHostService.Dismiss(dismissRequestDto, this);
        return objDismiss == coroutine_suspended ? coroutine_suspended : objDismiss;
    }
}
