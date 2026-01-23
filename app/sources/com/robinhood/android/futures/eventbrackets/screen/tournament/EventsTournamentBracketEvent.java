package com.robinhood.android.futures.eventbrackets.screen.tournament;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EventsTournamentBracketEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketEvent;", "", "<init>", "()V", "NavigateToInvestingTab", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketEvent$NavigateToInvestingTab;", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class EventsTournamentBracketEvent {
    public static final int $stable = 0;

    public /* synthetic */ EventsTournamentBracketEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: EventsTournamentBracketEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketEvent$NavigateToInvestingTab;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToInvestingTab extends EventsTournamentBracketEvent {
        public static final int $stable = 0;
        public static final NavigateToInvestingTab INSTANCE = new NavigateToInvestingTab();

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToInvestingTab);
        }

        public int hashCode() {
            return -1649881712;
        }

        public String toString() {
            return "NavigateToInvestingTab";
        }

        private NavigateToInvestingTab() {
            super(null);
        }
    }

    private EventsTournamentBracketEvent() {
    }
}
