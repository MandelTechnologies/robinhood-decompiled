package com.robinhood.prefs;

import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LockscreenTimeout.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/prefs/LockscreenTimeout;", "", "j$/time/Duration", "duration", "<init>", "(Ljava/lang/String;ILj$/time/Duration;)V", "Lj$/time/Duration;", "getDuration", "()Lj$/time/Duration;", "IMMEDIATELY", "FIVE_SECONDS", "ONE_MINUTE", "FIVE_MINUTES", "FIFTEEN_MINUTES", "ONE_HOUR", "FOUR_HOURS", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LockscreenTimeout {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LockscreenTimeout[] $VALUES;
    public static final LockscreenTimeout FIFTEEN_MINUTES;
    public static final LockscreenTimeout FIVE_MINUTES;
    public static final LockscreenTimeout FIVE_SECONDS;
    public static final LockscreenTimeout FOUR_HOURS;
    public static final LockscreenTimeout IMMEDIATELY;
    public static final LockscreenTimeout ONE_HOUR;
    public static final LockscreenTimeout ONE_MINUTE;
    private final Duration duration;

    private static final /* synthetic */ LockscreenTimeout[] $values() {
        return new LockscreenTimeout[]{IMMEDIATELY, FIVE_SECONDS, ONE_MINUTE, FIVE_MINUTES, FIFTEEN_MINUTES, ONE_HOUR, FOUR_HOURS};
    }

    public static EnumEntries<LockscreenTimeout> getEntries() {
        return $ENTRIES;
    }

    private LockscreenTimeout(String str, int i, Duration duration) {
        this.duration = duration;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    static {
        Duration ZERO = Duration.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        IMMEDIATELY = new LockscreenTimeout("IMMEDIATELY", 0, ZERO);
        Durations durations = Durations.INSTANCE;
        FIVE_SECONDS = new LockscreenTimeout("FIVE_SECONDS", 1, durations.getFIVE_SECONDS());
        ONE_MINUTE = new LockscreenTimeout("ONE_MINUTE", 2, durations.getONE_MINUTE());
        FIVE_MINUTES = new LockscreenTimeout("FIVE_MINUTES", 3, Durations.FIVE_MINUTES);
        FIFTEEN_MINUTES = new LockscreenTimeout("FIFTEEN_MINUTES", 4, durations.getFIFTEEN_MINUTES());
        ONE_HOUR = new LockscreenTimeout("ONE_HOUR", 5, durations.getONE_HOUR());
        Duration durationOfHours = Duration.ofHours(4L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        FOUR_HOURS = new LockscreenTimeout("FOUR_HOURS", 6, durationOfHours);
        LockscreenTimeout[] lockscreenTimeoutArr$values = $values();
        $VALUES = lockscreenTimeoutArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lockscreenTimeoutArr$values);
    }

    public static LockscreenTimeout valueOf(String str) {
        return (LockscreenTimeout) Enum.valueOf(LockscreenTimeout.class, str);
    }

    public static LockscreenTimeout[] values() {
        return (LockscreenTimeout[]) $VALUES.clone();
    }
}
