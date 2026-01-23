package org.threeten.extra.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.chrono.AbstractChronology;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.chrono.ChronoZonedDateTime;
import p479j$.time.chrono.Era;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class InternationalFixedChronology extends AbstractChronology implements Serializable {
    public static final InternationalFixedChronology INSTANCE = new InternationalFixedChronology();
    static final ValueRange YEAR_RANGE = ValueRange.m3598of(1, 1000000);
    static final ValueRange EPOCH_DAY_RANGE = ValueRange.m3598of(-719528, getLeapYearsBefore(1000000) + 364280472);
    private static final ValueRange PROLEPTIC_MONTH_RANGE = ValueRange.m3598of(13, 12999999);
    static final ValueRange DAY_OF_MONTH_RANGE = ValueRange.m3598of(1, 29);
    static final ValueRange DAY_OF_YEAR_NORMAL_RANGE = ValueRange.m3598of(1, 365);
    static final ValueRange DAY_OF_YEAR_LEAP_RANGE = ValueRange.m3598of(1, 366);
    static final ValueRange MONTH_OF_YEAR_RANGE = ValueRange.m3598of(1, 13);
    static final ValueRange ERA_RANGE = ValueRange.m3598of(1, 1);
    static final ValueRange EMPTY_RANGE = ValueRange.m3598of(0, 0);

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return null;
    }

    @Deprecated
    public InternationalFixedChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "Ifc";
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate date(int i, int i2, int i3) {
        return InternationalFixedDate.m4003of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate dateYearDay(int i, int i2) {
        return InternationalFixedDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate dateEpochDay(long j) {
        return InternationalFixedDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate dateNow() {
        return InternationalFixedDate.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate dateNow(ZoneId zoneId) {
        return InternationalFixedDate.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate dateNow(Clock clock) {
        return InternationalFixedDate.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedDate date(TemporalAccessor temporalAccessor) {
        return InternationalFixedDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<InternationalFixedDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<InternationalFixedDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<InternationalFixedDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // p479j$.time.chrono.Chronology
    public InternationalFixedEra eraOf(int i) {
        return InternationalFixedEra.m4004of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(InternationalFixedEra.values());
    }

    /* renamed from: org.threeten.extra.chrono.InternationalFixedChronology$1 */
    static /* synthetic */ class C480421 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p479j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        switch (C480421.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return ValueRange.m3600of(0L, 1L, 0L, 7L);
            case 4:
                return ValueRange.m3600of(0L, 1L, 0L, 4L);
            case 5:
                return ValueRange.m3600of(0L, 1L, 0L, 52L);
            case 6:
                return DAY_OF_MONTH_RANGE;
            case 7:
                return ChronoField.DAY_OF_YEAR.range();
            case 8:
                return EPOCH_DAY_RANGE;
            case 9:
                return ERA_RANGE;
            case 10:
                return MONTH_OF_YEAR_RANGE;
            case 11:
                return PROLEPTIC_MONTH_RANGE;
            case 12:
            case 13:
                return YEAR_RANGE;
            default:
                return chronoField.range();
        }
    }

    @Override // p479j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i) {
        if (!(era instanceof InternationalFixedEra)) {
            throw new ClassCastException("Invalid era: " + era);
        }
        return YEAR_RANGE.checkValidIntValue(i, ChronoField.YEAR_OF_ERA);
    }

    static long getLeapYearsBefore(long j) {
        long j2 = j - 1;
        return ((j2 / 4) - (j2 / 100)) + (j2 / 400);
    }
}
