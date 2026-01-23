package calendar_event.p045v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import microgram.annotation.ManagedServices;

/* compiled from: CalendarClientService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcalendar_event/v1/CalendarClientService;", "", "Lcalendar_event/v1/CreateCalendarEventRequestDto;", "request", "Lcalendar_event/v1/CreateCalendarEventResponseDto;", "CreateCalendarEvent", "(Lcalendar_event/v1/CreateCalendarEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calendar_event.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "calendar_event.v1.CalendarClientService")
/* loaded from: classes16.dex */
public interface CalendarClientService {

    /* compiled from: CalendarClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "calendar_event.v1.CalendarClientService$DefaultImpls", m3645f = "CalendarClientService.kt", m3646l = {24}, m3647m = "CreateCalendarEvent")
    /* renamed from: calendar_event.v1.CalendarClientService$CreateCalendarEvent$1 */
    static final class C45421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C45421(Continuation<? super C45421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CreateCalendarEvent(null, null, this);
        }
    }

    Object CreateCalendarEvent(CreateCalendarEventRequestDto createCalendarEventRequestDto, Continuation<? super CreateCalendarEventResponseDto> continuation);

    /* compiled from: CalendarClientService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CreateCalendarEvent(CalendarClientService calendarClientService, Request<CreateCalendarEventRequestDto> request, Continuation<? super Response<CreateCalendarEventResponseDto>> continuation) {
            C45421 c45421;
            if (continuation instanceof C45421) {
                c45421 = (C45421) continuation;
                int i = c45421.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c45421.label = i - Integer.MIN_VALUE;
                } else {
                    c45421 = new C45421(continuation);
                }
            }
            Object objCreateCalendarEvent = c45421.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c45421.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateCalendarEvent);
                CreateCalendarEventRequestDto data = request.getData();
                c45421.label = 1;
                objCreateCalendarEvent = calendarClientService.CreateCalendarEvent(data, c45421);
                if (objCreateCalendarEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateCalendarEvent);
            }
            return new Response(objCreateCalendarEvent, null, 2, null);
        }
    }
}
