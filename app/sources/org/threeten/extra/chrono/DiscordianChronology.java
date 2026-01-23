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
public final class DiscordianChronology extends AbstractChronology implements Serializable {
    public static final DiscordianChronology INSTANCE = new DiscordianChronology();
    static final ValueRange YEAR_RANGE = ValueRange.m3598of(1, 999999);
    static final ValueRange MONTH_OF_YEAR_RANGE = ValueRange.m3600of(0, 1, 5, 5);
    static final ValueRange DAY_OF_MONTH_RANGE = ValueRange.m3600of(0, 1, 0, 73);
    static final ValueRange EPOCH_DAY_RANGE = ValueRange.m3598of(-1145400, 365242134);
    private static final ValueRange PROLEPTIC_MONTH_RANGE = ValueRange.m3598of(0, 4999999);
    private static final ValueRange DAY_OF_WEEK_RANGE = ValueRange.m3600of(0, 1, 0, 5);
    private static final ValueRange ALIGNED_DOW_OF_YEAR_RANGE = ValueRange.m3600of(0, 1, 5, 5);
    private static final ValueRange WEEK_OF_MONTH_RANGE = ValueRange.m3600of(0, 1, 0, 15);
    private static final ValueRange WEEK_OF_YEAR_RANGE = ValueRange.m3600of(0, 1, 73, 73);
    private static final ValueRange ERA_RANGE = ValueRange.m3598of(1, 1);

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public /* bridge */ /* synthetic */ ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<TemporalField, Long>) map, resolverStyle);
    }

    @Deprecated
    public DiscordianChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "Discordian";
    }

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return "discordian";
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate date(int i, int i2, int i3) {
        return DiscordianDate.m3999of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate dateYearDay(int i, int i2) {
        return DiscordianDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate dateEpochDay(long j) {
        return DiscordianDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate dateNow() {
        return DiscordianDate.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate dateNow(ZoneId zoneId) {
        return DiscordianDate.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate dateNow(Clock clock) {
        return DiscordianDate.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianDate date(TemporalAccessor temporalAccessor) {
        return DiscordianDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<DiscordianDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<DiscordianDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<DiscordianDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        long j2 = j - 1166;
        if (j2 % 4 == 0) {
            return j2 % 400 == 0 || j2 % 100 != 0;
        }
        return false;
    }

    @Override // p479j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i) {
        if (!DiscordianEra.YOLD.equals(era)) {
            throw new ClassCastException("Era must be DiscordianEra.YOLD");
        }
        return YEAR_RANGE.checkValidIntValue(i, ChronoField.YEAR_OF_ERA);
    }

    @Override // p479j$.time.chrono.Chronology
    public DiscordianEra eraOf(int i) {
        return DiscordianEra.m4000of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(DiscordianEra.values());
    }

    /* renamed from: org.threeten.extra.chrono.DiscordianChronology$1 */
    static /* synthetic */ class C480401 {
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
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.EPOCH_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // p479j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        switch (C480401.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
                return ALIGNED_DOW_OF_YEAR_RANGE;
            case 2:
            case 3:
                return DAY_OF_WEEK_RANGE;
            case 4:
                return WEEK_OF_MONTH_RANGE;
            case 5:
                return WEEK_OF_YEAR_RANGE;
            case 6:
                return DAY_OF_MONTH_RANGE;
            case 7:
                return EPOCH_DAY_RANGE;
            case 8:
                return ERA_RANGE;
            case 9:
                return MONTH_OF_YEAR_RANGE;
            case 10:
                return PROLEPTIC_MONTH_RANGE;
            case 11:
            case 12:
                return YEAR_RANGE;
            default:
                return chronoField.range();
        }
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public DiscordianDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        return (DiscordianDate) super.resolveDate(map, resolverStyle);
    }
}
