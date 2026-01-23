package com.robinhood.android.engagement.goldevent;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveEventStreamViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldevent/PlaybackState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZING", "PLAYING", "PAUSED", "BUFFERING", "ENDED", "feature-live-event-stream_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.engagement.goldevent.PlaybackState, reason: use source file name */
/* loaded from: classes7.dex */
public final class LiveEventStreamViewState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LiveEventStreamViewState3[] $VALUES;
    public static final LiveEventStreamViewState3 INITIALIZING = new LiveEventStreamViewState3("INITIALIZING", 0);
    public static final LiveEventStreamViewState3 PLAYING = new LiveEventStreamViewState3("PLAYING", 1);
    public static final LiveEventStreamViewState3 PAUSED = new LiveEventStreamViewState3("PAUSED", 2);
    public static final LiveEventStreamViewState3 BUFFERING = new LiveEventStreamViewState3("BUFFERING", 3);
    public static final LiveEventStreamViewState3 ENDED = new LiveEventStreamViewState3("ENDED", 4);

    private static final /* synthetic */ LiveEventStreamViewState3[] $values() {
        return new LiveEventStreamViewState3[]{INITIALIZING, PLAYING, PAUSED, BUFFERING, ENDED};
    }

    public static EnumEntries<LiveEventStreamViewState3> getEntries() {
        return $ENTRIES;
    }

    private LiveEventStreamViewState3(String str, int i) {
    }

    static {
        LiveEventStreamViewState3[] liveEventStreamViewState3Arr$values = $values();
        $VALUES = liveEventStreamViewState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(liveEventStreamViewState3Arr$values);
    }

    public static LiveEventStreamViewState3 valueOf(String str) {
        return (LiveEventStreamViewState3) Enum.valueOf(LiveEventStreamViewState3.class, str);
    }

    public static LiveEventStreamViewState3[] values() {
        return (LiveEventStreamViewState3[]) $VALUES.clone();
    }
}
