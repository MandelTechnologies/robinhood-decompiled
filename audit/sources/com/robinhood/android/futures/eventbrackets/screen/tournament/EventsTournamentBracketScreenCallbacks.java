package com.robinhood.android.futures.eventbrackets.screen.tournament;

import com.robinhood.android.udf.event.Event;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: EventsTournamentBracketScreenCallbacks.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketScreenCallbacks;", "", "onBackClicked", "", "onNavigateToEdp", "eventId", "Ljava/util/UUID;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketEvent;", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EventsTournamentBracketScreenCallbacks {
    void handleEvent(Event<EventsTournamentBracketEvent> event);

    void onBackClicked();

    void onNavigateToEdp(UUID eventId);
}
