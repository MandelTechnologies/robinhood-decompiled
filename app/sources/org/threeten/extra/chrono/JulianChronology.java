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
public final class JulianChronology extends AbstractChronology implements Serializable {
    public static final JulianChronology INSTANCE = new JulianChronology();
    static final ValueRange YEAR_RANGE = ValueRange.m3598of(-999998, 999999);
    static final ValueRange YOE_RANGE = ValueRange.m3598of(1, 999999);
    static final ValueRange PROLEPTIC_MONTH_RANGE = ValueRange.m3598of(-11999976, 11999999);

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public /* bridge */ /* synthetic */ ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<TemporalField, Long>) map, resolverStyle);
    }

    @Deprecated
    public JulianChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "Julian";
    }

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return "julian";
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate date(int i, int i2, int i3) {
        return JulianDate.m4005of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate dateYearDay(int i, int i2) {
        return JulianDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate dateEpochDay(long j) {
        return JulianDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate dateNow() {
        return JulianDate.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate dateNow(ZoneId zoneId) {
        return JulianDate.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate dateNow(Clock clock) {
        return JulianDate.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianDate date(TemporalAccessor temporalAccessor) {
        return JulianDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<JulianDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<JulianDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<JulianDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        return j % 4 == 0;
    }

    @Override // p479j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i) {
        if (era instanceof JulianEra) {
            return era == JulianEra.AD ? i : 1 - i;
        }
        throw new ClassCastException("Era must be JulianEra");
    }

    @Override // p479j$.time.chrono.Chronology
    public JulianEra eraOf(int i) {
        return JulianEra.m4006of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(JulianEra.values());
    }

    /* renamed from: org.threeten.extra.chrono.JulianChronology$1 */
    static /* synthetic */ class C480441 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // p479j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        int i = C480441.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            return PROLEPTIC_MONTH_RANGE;
        }
        if (i == 2) {
            return YOE_RANGE;
        }
        if (i == 3) {
            return YEAR_RANGE;
        }
        return chronoField.range();
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public JulianDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        return (JulianDate) super.resolveDate(map, resolverStyle);
    }
}
