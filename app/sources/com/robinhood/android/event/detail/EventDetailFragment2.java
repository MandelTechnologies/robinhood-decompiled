package com.robinhood.android.event.detail;

import com.robinhood.android.udf.event.Event;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: EventDetailFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&J&\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailCallbacks;", "", "onExitScreen", "", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "onStartPipMode", "eventId", "Ljava/util/UUID;", "contractIds", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.EventDetailCallbacks, reason: use source file name */
/* loaded from: classes3.dex */
public interface EventDetailFragment2 {
    void handleEvent(Event<EventDetailScreenEvent> event);

    void onExitScreen();

    void onStartPipMode(UUID eventId, List<UUID> contractIds, DisplaySpan span);
}
