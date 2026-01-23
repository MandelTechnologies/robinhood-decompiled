package com.robinhood.android.event.calendar;

import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import calendar_event.p045v1.CalendarClientService;
import calendar_event.p045v1.CreateCalendarEventRequestDto;
import calendar_event.p045v1.CreateCalendarEventResponseDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RealCalendarClientService.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/event/calendar/RealCalendarClientService;", "Lcalendar_event/v1/CalendarClientService;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "CreateCalendarEvent", "Lcalendar_event/v1/CreateCalendarEventResponseDto;", "request", "Lcalendar_event/v1/CreateCalendarEventRequestDto;", "(Lcalendar_event/v1/CreateCalendarEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCalendarEvent", "", "title", "", "description", "startTimeInEpochMillis", "", "endTimeInEpochMillis", "lib-event-calendar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class RealCalendarClientService implements CalendarClientService {
    private final Context context;

    public Object CreateCalendarEvent(Request<CreateCalendarEventRequestDto> request, Continuation<? super Response<CreateCalendarEventResponseDto>> continuation) {
        return CalendarClientService.DefaultImpls.CreateCalendarEvent(this, request, continuation);
    }

    public RealCalendarClientService(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // calendar_event.p045v1.CalendarClientService
    public Object CreateCalendarEvent(CreateCalendarEventRequestDto createCalendarEventRequestDto, Continuation<? super CreateCalendarEventResponseDto> continuation) {
        Instant start_time = createCalendarEventRequestDto.getStart_time();
        if (start_time == null) {
            return new CreateCalendarEventResponseDto(false);
        }
        long epochMilli = start_time.toEpochMilli();
        Instant end_time = createCalendarEventRequestDto.getEnd_time();
        if (end_time == null) {
            return new CreateCalendarEventResponseDto(false);
        }
        return new CreateCalendarEventResponseDto(createCalendarEvent(createCalendarEventRequestDto.getTitle(), createCalendarEventRequestDto.getDescription(), epochMilli, end_time.toEpochMilli()));
    }

    private final boolean createCalendarEvent(String title, String description, long startTimeInEpochMillis, long endTimeInEpochMillis) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setData(CalendarContract.Events.CONTENT_URI);
            intent.addFlags(268435456);
            intent.putExtra("title", title);
            intent.putExtra("description", description);
            intent.putExtra("beginTime", startTimeInEpochMillis);
            intent.putExtra("endTime", endTimeInEpochMillis);
            intent.putExtra("availability", 0);
            if (intent.resolveActivity(this.context.getPackageManager()) != null) {
                this.context.startActivity(intent);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m28556isSuccessimpl(objM28550constructorimpl);
    }
}
