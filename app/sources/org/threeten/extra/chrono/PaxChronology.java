package org.threeten.extra.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.chrono.AbstractChronology;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.chrono.ChronoZonedDateTime;
import p479j$.time.chrono.Era;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class PaxChronology extends AbstractChronology implements Serializable {
    public static final PaxChronology INSTANCE = new PaxChronology();
    static final ValueRange ALIGNED_WEEK_OF_MONTH_RANGE = ValueRange.m3599of(1, 1, 4);
    static final ValueRange ALIGNED_WEEK_OF_YEAR_RANGE = ValueRange.m3599of(1, 52, 53);
    static final ValueRange DAY_OF_MONTH_RANGE = ValueRange.m3599of(1, 7, 28);
    static final ValueRange DAY_OF_YEAR_RANGE = ValueRange.m3599of(1, 364, 371);
    static final ValueRange MONTH_OF_YEAR_RANGE = ValueRange.m3599of(1, 13, 14);

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public /* bridge */ /* synthetic */ ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<TemporalField, Long>) map, resolverStyle);
    }

    @Deprecated
    public PaxChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "Pax";
    }

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return "pax";
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate date(int i, int i2, int i3) {
        return PaxDate.m4007of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate dateYearDay(int i, int i2) {
        return PaxDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate dateEpochDay(long j) {
        return PaxDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate dateNow() {
        return PaxDate.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate dateNow(ZoneId zoneId) {
        return PaxDate.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate dateNow(Clock clock) {
        return PaxDate.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxDate date(TemporalAccessor temporalAccessor) {
        return PaxDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<PaxDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<PaxDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<PaxDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        long j2 = j % 100;
        if (Math.abs(j2) == 99) {
            return true;
        }
        if (j % 400 != 0) {
            return j2 == 0 || j2 % 6 == 0;
        }
        return false;
    }

    @Override // p479j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i) {
        if (era instanceof PaxEra) {
            return era == PaxEra.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be PaxEra");
    }

    @Override // p479j$.time.chrono.Chronology
    public PaxEra eraOf(int i) {
        return PaxEra.m4008of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(PaxEra.values());
    }

    /* renamed from: org.threeten.extra.chrono.PaxChronology$1 */
    static /* synthetic */ class C480451 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // p479j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        int i = C480451.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            return ALIGNED_WEEK_OF_MONTH_RANGE;
        }
        if (i == 2) {
            return ALIGNED_WEEK_OF_YEAR_RANGE;
        }
        if (i == 3) {
            return DAY_OF_MONTH_RANGE;
        }
        if (i == 4) {
            return DAY_OF_YEAR_RANGE;
        }
        if (i == 5) {
            return MONTH_OF_YEAR_RANGE;
        }
        return chronoField.range();
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public PaxDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        return (PaxDate) super.resolveDate(map, resolverStyle);
    }
}
