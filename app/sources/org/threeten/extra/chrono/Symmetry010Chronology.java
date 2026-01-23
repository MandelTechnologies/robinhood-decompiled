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
import p479j$.time.chrono.IsoEra;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class Symmetry010Chronology extends AbstractChronology implements Serializable {
    public static final Symmetry010Chronology INSTANCE = new Symmetry010Chronology();
    static final ValueRange YEAR_RANGE = ValueRange.m3598of(-1000000, 1000000);
    static final ValueRange EPOCH_DAY_RANGE = ValueRange.m3598of((-364719162) - (getLeapYearsBefore(1000000) * 7), (getLeapYearsBefore(1000000) * 7) + 363280838);
    private static final ValueRange PROLEPTIC_MONTH_RANGE = ValueRange.m3598of(-12000000, 11999999);
    static final ValueRange DAY_OF_MONTH_RANGE = ValueRange.m3599of(1, 30, 37);
    static final ValueRange DAY_OF_YEAR_RANGE = ValueRange.m3599of(1, 364, 371);
    static final ValueRange MONTH_OF_YEAR_RANGE = ValueRange.m3598of(1, 12);
    static final ValueRange ERA_RANGE = ValueRange.m3598of(0, 1);
    static final ValueRange EMPTY_RANGE = ValueRange.m3598of(0, 0);

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return null;
    }

    @Deprecated
    public Symmetry010Chronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "Sym010";
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date date(int i, int i2, int i3) {
        return Symmetry010Date.m4009of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date dateYearDay(int i, int i2) {
        return Symmetry010Date.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date dateEpochDay(long j) {
        return Symmetry010Date.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date dateNow() {
        return Symmetry010Date.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date dateNow(ZoneId zoneId) {
        return Symmetry010Date.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date dateNow(Clock clock) {
        return Symmetry010Date.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public Symmetry010Date date(TemporalAccessor temporalAccessor) {
        return Symmetry010Date.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<Symmetry010Date> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<Symmetry010Date> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<Symmetry010Date> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        return 52 > ((j * 52) + 146) % 293;
    }

    @Override // p479j$.time.chrono.Chronology
    public IsoEra eraOf(int i) {
        return IsoEra.m3487of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(IsoEra.values());
    }

    /* renamed from: org.threeten.extra.chrono.Symmetry010Chronology$1 */
    static /* synthetic */ class C480471 {
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
        switch (C480471.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return ValueRange.m3598of(1L, 7L);
            case 4:
                return ValueRange.m3599of(1L, 4L, 5L);
            case 5:
                return ValueRange.m3599of(1L, 52L, 53L);
            case 6:
                return DAY_OF_MONTH_RANGE;
            case 7:
                return DAY_OF_YEAR_RANGE;
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
        if (!(era instanceof IsoEra)) {
            throw new ClassCastException("Invalid era: " + era);
        }
        return YEAR_RANGE.checkValidIntValue(i, ChronoField.YEAR_OF_ERA);
    }

    public static long getLeapYearsBefore(long j) {
        return Math.floorDiv(((j - 1) * 52) + 146, 293L);
    }
}
