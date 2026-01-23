package p479j$.time.temporal;

import p479j$.time.DayOfWeek;

/* loaded from: classes29.dex */
public final class TemporalAdjusters {
    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        return new C45806j(dayOfWeek.getValue(), 0);
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        return new C45806j(dayOfWeek.getValue(), 1);
    }
}
