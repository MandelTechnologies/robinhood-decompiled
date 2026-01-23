package p479j$.time.temporal;

import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;

/* loaded from: classes29.dex */
public final class IsoFields {
    public static final TemporalField DAY_OF_QUARTER = EnumC45802f.DAY_OF_QUARTER;
    public static final TemporalField QUARTER_OF_YEAR = EnumC45802f.QUARTER_OF_YEAR;

    /* renamed from: a */
    public static final EnumC45802f f6921a = EnumC45802f.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: b */
    public static final EnumC45802f f6922b = EnumC45802f.WEEK_BASED_YEAR;

    /* renamed from: c */
    public static final EnumC45803g f6923c = EnumC45803g.WEEK_BASED_YEARS;
    public static final TemporalUnit QUARTER_YEARS = EnumC45803g.QUARTER_YEARS;

    /* renamed from: a */
    public static boolean m3596a(TemporalAccessor temporalAccessor) {
        return Chronology.from(temporalAccessor).equals(IsoChronology.INSTANCE);
    }
}
