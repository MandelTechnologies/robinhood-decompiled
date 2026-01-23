package p479j$.time.temporal;

import com.plaid.internal.EnumC7081g;
import java.util.Map;
import p479j$.time.DateTimeException;
import p479j$.time.DayOfWeek;
import p479j$.time.LocalDate;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.format.C45757B;
import p479j$.time.format.ResolverStyle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.temporal.f */
/* loaded from: classes29.dex */
public abstract class EnumC45802f implements TemporalField {
    public static final EnumC45802f DAY_OF_QUARTER;
    public static final EnumC45802f QUARTER_OF_YEAR;
    public static final EnumC45802f WEEK_BASED_YEAR;
    public static final EnumC45802f WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    public static final int[] f6944a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC45802f[] f6945b;

    @Override // p479j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC45802f valueOf(String str) {
        return (EnumC45802f) Enum.valueOf(EnumC45802f.class, str);
    }

    public static EnumC45802f[] values() {
        return (EnumC45802f[]) f6945b.clone();
    }

    static {
        EnumC45802f enumC45802f = new EnumC45802f() { // from class: j$.time.temporal.b
            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ValueRange.m3599of(1L, 90L, 92L);
            }

            @Override // p479j$.time.temporal.TemporalField
            public final boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR) && temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && temporalAccessor.isSupported(ChronoField.YEAR) && IsoFields.m3596a(temporalAccessor);
            }

            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long j = temporalAccessor.getLong(EnumC45802f.QUARTER_OF_YEAR);
                if (j == 1) {
                    return IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? ValueRange.m3598of(1L, 91L) : ValueRange.m3598of(1L, 90L);
                }
                if (j == 2) {
                    return ValueRange.m3598of(1L, 91L);
                }
                if (j == 3 || j == 4) {
                    return ValueRange.m3598of(1L, 92L);
                }
                return range();
            }

            @Override // p479j$.time.temporal.TemporalField
            public final long getFrom(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(ChronoField.DAY_OF_YEAR) - EnumC45802f.f6944a[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // p479j$.time.temporal.TemporalField
            public final Temporal adjustInto(Temporal temporal, long j) {
                long from = getFrom(temporal);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.with(chronoField, (j - from) + temporal.getLong(chronoField));
            }

            @Override // p479j$.time.temporal.TemporalField
            /* renamed from: c */
            public final TemporalAccessor mo3597c(Map map, C45757B c45757b, ResolverStyle resolverStyle) {
                long jSubtractExact;
                LocalDate localDatePlusMonths;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                TemporalField temporalField = EnumC45802f.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iCheckValidIntValue = chronoField.checkValidIntValue(l.longValue());
                long jLongValue = ((Long) map.get(EnumC45802f.DAY_OF_QUARTER)).longValue();
                if (!IsoFields.m3596a(c45757b)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (resolverStyle == ResolverStyle.LENIENT) {
                    localDatePlusMonths = LocalDate.m3377of(iCheckValidIntValue, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateM3377of = LocalDate.m3377of(iCheckValidIntValue, ((temporalField.range().checkValidIntValue(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (resolverStyle == ResolverStyle.STRICT) {
                            rangeRefinedBy(localDateM3377of).checkValidValue(jLongValue, this);
                        } else {
                            range().checkValidValue(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDatePlusMonths = localDateM3377of;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDatePlusMonths.plusDays(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC45802f;
        EnumC45802f enumC45802f2 = new EnumC45802f() { // from class: j$.time.temporal.c
            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ValueRange.m3598of(1L, 4L);
            }

            @Override // p479j$.time.temporal.TemporalField
            public final boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && IsoFields.m3596a(temporalAccessor);
            }

            @Override // p479j$.time.temporal.TemporalField
            public final long getFrom(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
                }
                return range();
            }

            @Override // p479j$.time.temporal.TemporalField
            public final Temporal adjustInto(Temporal temporal, long j) {
                long from = getFrom(temporal);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.with(chronoField, ((j - from) * 3) + temporal.getLong(chronoField));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC45802f2;
        EnumC45802f enumC45802f3 = new EnumC45802f() { // from class: j$.time.temporal.d
            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ValueRange.m3599of(1L, 52L, 53L);
            }

            @Override // p479j$.time.temporal.TemporalField
            public final boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && IsoFields.m3596a(temporalAccessor);
            }

            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return EnumC45802f.m3609l(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p479j$.time.temporal.TemporalField
            public final long getFrom(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC45802f.m3606i(LocalDate.from(temporalAccessor));
            }

            @Override // p479j$.time.temporal.TemporalField
            public final Temporal adjustInto(Temporal temporal, long j) {
                range().checkValidValue(j, this);
                return temporal.plus(Math.subtractExact(j, getFrom(temporal)), ChronoUnit.WEEKS);
            }

            @Override // p479j$.time.temporal.TemporalField
            /* renamed from: c */
            public final TemporalAccessor mo3597c(Map map, C45757B c45757b, ResolverStyle resolverStyle) {
                LocalDate localDateWith;
                long j;
                long j2;
                TemporalField temporalField = EnumC45802f.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iCheckValidIntValue = temporalField.range().checkValidIntValue(l.longValue(), temporalField);
                long jLongValue = ((Long) map.get(EnumC45802f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                if (!IsoFields.m3596a(c45757b)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate localDateM3377of = LocalDate.m3377of(iCheckValidIntValue, 1, 4);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        j = 1;
                        localDateM3377of = localDateM3377of.m3388q(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateM3377of = localDateM3377of.m3388q(Math.subtractExact(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        localDateWith = localDateM3377of.m3388q(Math.subtractExact(jLongValue, j)).with((TemporalField) chronoField, jLongValue2);
                    }
                    jLongValue2 = j2 + j;
                    localDateWith = localDateM3377of.m3388q(Math.subtractExact(jLongValue, j)).with((TemporalField) chronoField, jLongValue2);
                } else {
                    int iCheckValidIntValue2 = chronoField.checkValidIntValue(l2.longValue());
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (resolverStyle == ResolverStyle.STRICT) {
                            EnumC45802f.m3609l(localDateM3377of).checkValidValue(jLongValue, this);
                        } else {
                            range().checkValidValue(jLongValue, this);
                        }
                    }
                    localDateWith = localDateM3377of.m3388q(jLongValue - 1).with((TemporalField) chronoField, iCheckValidIntValue2);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateWith;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC45802f3;
        EnumC45802f enumC45802f4 = new EnumC45802f() { // from class: j$.time.temporal.e
            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ChronoField.YEAR.range();
            }

            @Override // p479j$.time.temporal.TemporalField
            public final boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && IsoFields.m3596a(temporalAccessor);
            }

            @Override // p479j$.time.temporal.TemporalField
            public final long getFrom(TemporalAccessor temporalAccessor) {
                if (isSupportedBy(temporalAccessor)) {
                    return EnumC45802f.m3607j(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // p479j$.time.temporal.TemporalField
            public final ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!isSupportedBy(temporalAccessor)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                return range();
            }

            @Override // p479j$.time.temporal.TemporalField
            public final Temporal adjustInto(Temporal temporal, long j) {
                if (!isSupportedBy(temporal)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int iCheckValidIntValue = ChronoField.YEAR.range().checkValidIntValue(j, EnumC45802f.WEEK_BASED_YEAR);
                LocalDate localDateFrom = LocalDate.from(temporal);
                int i = localDateFrom.get(ChronoField.DAY_OF_WEEK);
                int iM3606i = EnumC45802f.m3606i(localDateFrom);
                if (iM3606i == 53 && EnumC45802f.m3608k(iCheckValidIntValue) == 52) {
                    iM3606i = 52;
                }
                return temporal.with(LocalDate.m3377of(iCheckValidIntValue, 1, 4).plusDays(((iM3606i - 1) * 7) + (i - r6.get(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC45802f4;
        f6945b = new EnumC45802f[]{enumC45802f, enumC45802f2, enumC45802f3, enumC45802f4};
        f6944a = new int[]{0, 90, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 0, 91, 182, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE};
    }

    /* renamed from: l */
    public static ValueRange m3609l(LocalDate localDate) {
        return ValueRange.m3598of(1L, m3608k(m3607j(localDate)));
    }

    /* renamed from: k */
    public static int m3608k(int i) {
        LocalDate localDateM3377of = LocalDate.m3377of(i, 1, 1);
        if (localDateM3377of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateM3377of.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateM3377of.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    /* renamed from: i */
    public static int m3606i(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int dayOfYear = localDate.getDayOfYear() - 1;
        int i = (3 - iOrdinal) + dayOfYear;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (dayOfYear < i3) {
            return (int) m3609l(localDate.withDayOfYear(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE).minusYears(1L)).getMaximum();
        }
        int i4 = ((dayOfYear - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
            return i4;
        }
        return 1;
    }

    /* renamed from: j */
    public static int m3607j(LocalDate localDate) {
        int year = localDate.getYear();
        int dayOfYear = localDate.getDayOfYear();
        if (dayOfYear <= 3) {
            return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (dayOfYear >= 363) {
            return ((dayOfYear - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
