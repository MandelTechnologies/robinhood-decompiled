package com.robinhood.android.futures.eventbrackets.screen.tournament;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventsTournamentBracketViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/AllDataViewMode;", "", "<init>", "(Ljava/lang/String;I)V", "LIST", "BRACKET", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.AllDataViewMode, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventsTournamentBracketViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventsTournamentBracketViewState2[] $VALUES;
    public static final EventsTournamentBracketViewState2 LIST = new EventsTournamentBracketViewState2("LIST", 0);
    public static final EventsTournamentBracketViewState2 BRACKET = new EventsTournamentBracketViewState2("BRACKET", 1);

    private static final /* synthetic */ EventsTournamentBracketViewState2[] $values() {
        return new EventsTournamentBracketViewState2[]{LIST, BRACKET};
    }

    public static EnumEntries<EventsTournamentBracketViewState2> getEntries() {
        return $ENTRIES;
    }

    private EventsTournamentBracketViewState2(String str, int i) {
    }

    static {
        EventsTournamentBracketViewState2[] eventsTournamentBracketViewState2Arr$values = $values();
        $VALUES = eventsTournamentBracketViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventsTournamentBracketViewState2Arr$values);
    }

    public static EventsTournamentBracketViewState2 valueOf(String str) {
        return (EventsTournamentBracketViewState2) Enum.valueOf(EventsTournamentBracketViewState2.class, str);
    }

    public static EventsTournamentBracketViewState2[] values() {
        return (EventsTournamentBracketViewState2[]) $VALUES.clone();
    }
}
