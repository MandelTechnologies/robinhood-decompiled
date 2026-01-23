package calendar_event.p045v1;

import calendar_event.p045v1.CalendarClientService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CalendarClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcalendar_event/v1/CreateCalendarEventResponseDto;", "request", "Lcalendar_event/v1/CreateCalendarEventRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "calendar_event.v1.CalendarClientService_Adapter$CreateCalendarEventEndpoint$call$1", m3645f = "CalendarClientService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: calendar_event.v1.CalendarClientService_Adapter$CreateCalendarEventEndpoint$call$1, reason: use source file name */
/* loaded from: classes16.dex */
final class CalendarClientService_Adapter2 extends ContinuationImpl7 implements Function2<CreateCalendarEventRequestDto, Continuation<? super CreateCalendarEventResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CalendarClientService_Adapter.CreateCalendarEventEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarClientService_Adapter2(CalendarClientService_Adapter.CreateCalendarEventEndpoint createCalendarEventEndpoint, Continuation<? super CalendarClientService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = createCalendarEventEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CalendarClientService_Adapter2 calendarClientService_Adapter2 = new CalendarClientService_Adapter2(this.this$0, continuation);
        calendarClientService_Adapter2.L$0 = obj;
        return calendarClientService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateCalendarEventRequestDto createCalendarEventRequestDto, Continuation<? super CreateCalendarEventResponseDto> continuation) {
        return ((CalendarClientService_Adapter2) create(createCalendarEventRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CreateCalendarEventRequestDto createCalendarEventRequestDto = (CreateCalendarEventRequestDto) this.L$0;
        CalendarClientService calendarClientService = this.this$0.service;
        this.label = 1;
        Object objCreateCalendarEvent = calendarClientService.CreateCalendarEvent(createCalendarEventRequestDto, this);
        return objCreateCalendarEvent == coroutine_suspended ? coroutine_suspended : objCreateCalendarEvent;
    }
}
