package org.threeten.extra.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.chrono.AbstractChronology;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.chrono.ChronoZonedDateTime;
import p479j$.time.chrono.Era;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class BritishCutoverChronology extends AbstractChronology implements Serializable {
    public static final BritishCutoverChronology INSTANCE = new BritishCutoverChronology();
    public static final LocalDate CUTOVER = LocalDate.m3377of(1752, 9, 14);
    static final ValueRange DOY_RANGE = ValueRange.m3599of(1, 355, 366);
    static final ValueRange ALIGNED_WOM_RANGE = ValueRange.m3599of(1, 3, 5);
    static final ValueRange ALIGNED_WOY_RANGE = ValueRange.m3599of(1, 51, 53);
    static final ValueRange YEAR_RANGE = ValueRange.m3598of(-999998, 999999);
    static final ValueRange YOE_RANGE = ValueRange.m3598of(1, 999999);
    static final ValueRange PROLEPTIC_MONTH_RANGE = ValueRange.m3598of(-11999976, 11999999);

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return null;
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public /* bridge */ /* synthetic */ ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<TemporalField, Long>) map, resolverStyle);
    }

    @Deprecated
    public BritishCutoverChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "BritishCutover";
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate date(int i, int i2, int i3) {
        return BritishCutoverDate.m3996of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate dateYearDay(int i, int i2) {
        return BritishCutoverDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate dateEpochDay(long j) {
        return BritishCutoverDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate dateNow() {
        return BritishCutoverDate.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate dateNow(ZoneId zoneId) {
        return BritishCutoverDate.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate dateNow(Clock clock) {
        return BritishCutoverDate.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public BritishCutoverDate date(TemporalAccessor temporalAccessor) {
        return BritishCutoverDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<BritishCutoverDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<BritishCutoverDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<BritishCutoverDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        if (j <= 1752) {
            return JulianChronology.INSTANCE.isLeapYear(j);
        }
        return IsoChronology.INSTANCE.isLeapYear(j);
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

    /* renamed from: org.threeten.extra.chrono.BritishCutoverChronology$1 */
    static /* synthetic */ class C480381 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // p479j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        switch (C480381.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
                return DOY_RANGE;
            case 2:
                return ALIGNED_WOM_RANGE;
            case 3:
                return ALIGNED_WOY_RANGE;
            case 4:
                return PROLEPTIC_MONTH_RANGE;
            case 5:
                return YOE_RANGE;
            case 6:
                return YEAR_RANGE;
            default:
                return chronoField.range();
        }
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public BritishCutoverDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        return (BritishCutoverDate) super.resolveDate(map, resolverStyle);
    }
}
