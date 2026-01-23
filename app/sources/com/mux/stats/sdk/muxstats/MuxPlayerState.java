package com.mux.stats.sdk.muxstats;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MuxPlayerState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxPlayerState;", "", "(Ljava/lang/String;I)V", "BUFFERING", "REBUFFERING", "SEEKING", "SEEKED", "ERROR", "PAUSED", "PLAY", "PLAYING", "PLAYING_ADS", "FINISHED_PLAYING_ADS", "INIT", "ENDED", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class MuxPlayerState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MuxPlayerState[] $VALUES;
    public static final MuxPlayerState BUFFERING = new MuxPlayerState("BUFFERING", 0);
    public static final MuxPlayerState REBUFFERING = new MuxPlayerState("REBUFFERING", 1);
    public static final MuxPlayerState SEEKING = new MuxPlayerState("SEEKING", 2);
    public static final MuxPlayerState SEEKED = new MuxPlayerState("SEEKED", 3);
    public static final MuxPlayerState ERROR = new MuxPlayerState("ERROR", 4);
    public static final MuxPlayerState PAUSED = new MuxPlayerState("PAUSED", 5);
    public static final MuxPlayerState PLAY = new MuxPlayerState("PLAY", 6);
    public static final MuxPlayerState PLAYING = new MuxPlayerState("PLAYING", 7);
    public static final MuxPlayerState PLAYING_ADS = new MuxPlayerState("PLAYING_ADS", 8);
    public static final MuxPlayerState FINISHED_PLAYING_ADS = new MuxPlayerState("FINISHED_PLAYING_ADS", 9);
    public static final MuxPlayerState INIT = new MuxPlayerState("INIT", 10);
    public static final MuxPlayerState ENDED = new MuxPlayerState("ENDED", 11);

    private static final /* synthetic */ MuxPlayerState[] $values() {
        return new MuxPlayerState[]{BUFFERING, REBUFFERING, SEEKING, SEEKED, ERROR, PAUSED, PLAY, PLAYING, PLAYING_ADS, FINISHED_PLAYING_ADS, INIT, ENDED};
    }

    public static EnumEntries<MuxPlayerState> getEntries() {
        return $ENTRIES;
    }

    public static MuxPlayerState valueOf(String str) {
        return (MuxPlayerState) Enum.valueOf(MuxPlayerState.class, str);
    }

    public static MuxPlayerState[] values() {
        return (MuxPlayerState[]) $VALUES.clone();
    }

    private MuxPlayerState(String str, int i) {
    }

    static {
        MuxPlayerState[] muxPlayerStateArr$values = $values();
        $VALUES = muxPlayerStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(muxPlayerStateArr$values);
    }
}
