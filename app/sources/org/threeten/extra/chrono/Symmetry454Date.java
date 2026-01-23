package org.threeten.extra.chrono;

import java.io.Serializable;
import p479j$.time.Clock;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.chrono.ChronoPeriod;
import p479j$.time.chrono.IsoEra;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class Symmetry454Date extends AbstractDate implements ChronoLocalDate, Serializable {
    private final int day;
    private final transient int dayOfYear;
    private final int month;
    private final int prolepticYear;

    @Override // org.threeten.extra.chrono.AbstractDate
    int lengthOfYearInMonths() {
        return 12;
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public /* bridge */ /* synthetic */ long getLong(TemporalField temporalField) {
        return super.getLong(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public static Symmetry454Date now() {
        return now(Clock.systemDefaultZone());
    }

    public static Symmetry454Date now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static Symmetry454Date now(Clock clock) {
        return ofEpochDay(LocalDate.now(clock).toEpochDay());
    }

    /* renamed from: of */
    public static Symmetry454Date m4010of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static Symmetry454Date from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Symmetry454Date) {
            return (Symmetry454Date) temporalAccessor;
        }
        return ofEpochDay(temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    static Symmetry454Date ofYearDay(int i, int i2) {
        long j = i;
        Symmetry454Chronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR_OF_ERA);
        Symmetry454Chronology.DAY_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.DAY_OF_YEAR);
        boolean zIsLeapYear = Symmetry454Chronology.INSTANCE.isLeapYear(j);
        if (i2 > 364 && !zIsLeapYear) {
            throw new DateTimeException("Invalid date 'DayOfYear " + i2 + "' as '" + i + "' is not a leap year");
        }
        int iMin = (Math.min(i2, 364) - 1) / 91;
        int i3 = i2 - (iMin * 91);
        int i4 = iMin * 3;
        int i5 = i4 + 1;
        if (i3 > 63) {
            i5 = i4 + 3;
            i3 -= 63;
        } else if (i3 > 28) {
            i5 = i4 + 2;
            i3 -= 28;
        }
        return new Symmetry454Date(i, i5, i3);
    }

    static Symmetry454Date ofEpochDay(long j) {
        Symmetry454Chronology.EPOCH_DAY_RANGE.checkValidValue(3 + j, ChronoField.EPOCH_DAY);
        long j2 = j + 719163;
        long j3 = (293 * j2) / 107016;
        long j4 = j3 + 1;
        long leapYearsBefore = j2 - ((j3 * 364) + (Symmetry454Chronology.getLeapYearsBefore(j4) * 7));
        if (leapYearsBefore < 1) {
            leapYearsBefore += Symmetry454Chronology.INSTANCE.isLeapYear(j3) ? 371L : 364L;
        } else {
            j3 = j4;
        }
        long j5 = Symmetry454Chronology.INSTANCE.isLeapYear(j3) ? 371 : 364;
        if (leapYearsBefore > j5) {
            leapYearsBefore -= j5;
            j3++;
        }
        return ofYearDay((int) j3, (int) leapYearsBefore);
    }

    private static Symmetry454Date resolvePreviousValid(int i, int i2, int i3) {
        int iMin = Math.min(i2, 12);
        return create(i, iMin, Math.min(i3, (iMin % 3 == 2 || (iMin == 12 && Symmetry454Chronology.INSTANCE.isLeapYear((long) i))) ? 35 : 28));
    }

    static Symmetry454Date create(int i, int i2, int i3) {
        long j = i;
        Symmetry454Chronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR_OF_ERA);
        Symmetry454Chronology.MONTH_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.MONTH_OF_YEAR);
        Symmetry454Chronology.DAY_OF_MONTH_RANGE.checkValidValue(i3, ChronoField.DAY_OF_MONTH);
        if (i3 > 28) {
            if (i2 == 12) {
                if (!Symmetry454Chronology.INSTANCE.isLeapYear(j)) {
                    throw new DateTimeException("Invalid Leap Day as '" + i + "' is not a leap year");
                }
            } else if (i2 % 3 != 2) {
                throw new DateTimeException("Invalid date: " + i + '/' + i2 + '/' + i3);
            }
        }
        return new Symmetry454Date(i, i2, i3);
    }

    private Symmetry454Date(int i, int i2, int i3) {
        this.prolepticYear = i;
        this.month = i2;
        this.day = i3;
        this.dayOfYear = ((i2 - 1) * 28) + ((i2 / 3) * 7) + i3;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getProlepticYear() {
        return this.prolepticYear;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getMonth() {
        return this.month;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfMonth() {
        return this.day;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfYear() {
        return this.dayOfYear;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getAlignedDayOfWeekInMonth() {
        return getDayOfWeek();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getAlignedDayOfWeekInYear() {
        return getDayOfWeek();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getAlignedWeekOfMonth() {
        return ((this.day - 1) / 7) + 1;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getAlignedWeekOfYear() {
        return ((this.dayOfYear - 1) / 7) + 1;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfWeek() {
        return ((this.day - 1) % 7) + 1;
    }

    long getProlepticWeek() {
        return ((getProlepticMonth() * 4) + ((getDayOfMonth() - 1) / 7)) - 1;
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (isSupported(temporalField)) {
                switch (C480501.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return ValueRange.m3598of(1L, 7L);
                    case 4:
                        return ValueRange.m3598of(1L, (isLongMonth() ? 1 : 0) + 4);
                    case 5:
                        return ValueRange.m3598of(1L, (isLeapYear() ? 1 : 0) + 52);
                    case 6:
                        return ValueRange.m3598of(1L, lengthOfMonth());
                    case 7:
                        return ValueRange.m3598of(1L, lengthOfYear());
                    case 8:
                        return Symmetry454Chronology.EPOCH_DAY_RANGE;
                    case 9:
                        return Symmetry454Chronology.ERA_RANGE;
                    case 10:
                        return Symmetry454Chronology.MONTH_OF_YEAR_RANGE;
                }
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return super.range(temporalField);
    }

    /* renamed from: org.threeten.extra.chrono.Symmetry454Date$1 */
    static /* synthetic */ class C480501 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 2;
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
        }
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    ValueRange rangeAlignedWeekOfMonth() {
        return ValueRange.m3598of(1L, 4L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public Symmetry454Date resolvePrevious(int i, int i2, int i3) {
        return resolvePreviousValid(i, i2, i3);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public Symmetry454Chronology getChronology() {
        return Symmetry454Chronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public IsoEra getEra() {
        return this.prolepticYear >= 1 ? IsoEra.f6718CE : IsoEra.BCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        return isLongMonth() ? 35 : 28;
    }

    private boolean isLongMonth() {
        if (this.month % 3 != 2) {
            return isLeapYear() && this.month == 12;
        }
        return true;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return (isLeapYear() ? 7 : 0) + 364;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry454Date with(TemporalAdjuster temporalAdjuster) {
        return (Symmetry454Date) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry454Date with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (j == 0) {
                return this;
            }
            ChronoField chronoField = (ChronoField) temporalField;
            getChronology().range(chronoField).checkValidValue(j, chronoField);
            int i = (int) j;
            switch (C480501.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    range(chronoField).checkValidValue(j, temporalField);
                    return resolvePreviousValid(this.prolepticYear, this.month, (((getDayOfMonth() - 1) / 7) * 7) + i);
                case 4:
                    range(chronoField).checkValidValue(j, temporalField);
                    return resolvePreviousValid(this.prolepticYear, this.month, ((i - 1) * 7) + (this.day % 7));
                case 5:
                    range(chronoField).checkValidValue(j, temporalField);
                    int i2 = i - 1;
                    return resolvePreviousValid(this.prolepticYear, (i2 / 4) + 1, ((i2 % 4) * 7) + 1 + ((this.day - 1) % 7));
                case 6:
                    return create(this.prolepticYear, this.month, i);
            }
        }
        return (Symmetry454Date) super.with(temporalField, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public Symmetry454Date withDayOfYear(int i) {
        return ofYearDay(this.prolepticYear, i);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry454Date plus(TemporalAmount temporalAmount) {
        return (Symmetry454Date) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry454Date plus(long j, TemporalUnit temporalUnit) {
        return (Symmetry454Date) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry454Date minus(TemporalAmount temporalAmount) {
        return (Symmetry454Date) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry454Date minus(long j, TemporalUnit temporalUnit) {
        return (Symmetry454Date) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<Symmetry454Date> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        return until((AbstractDate) from(temporal), temporalUnit);
    }

    long yearsUntil(Symmetry454Date symmetry454Date) {
        return (((symmetry454Date.prolepticYear * 512) + symmetry454Date.getDayOfYear()) - ((this.prolepticYear * 512) + getDayOfYear())) / 512;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        Symmetry454Date symmetry454DateFrom = from(chronoLocalDate);
        int intExact = Math.toIntExact(yearsUntil(symmetry454DateFrom));
        Symmetry454Date symmetry454Date = (Symmetry454Date) plusYears(intExact);
        int iMonthsUntil = (int) symmetry454Date.monthsUntil(symmetry454DateFrom);
        return getChronology().period(intExact, iMonthsUntil, (int) symmetry454Date.plusMonths(iMonthsUntil).daysUntil(symmetry454DateFrom));
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long weeksUntil(AbstractDate abstractDate) {
        return (((from(abstractDate).getProlepticWeek() * 8) + r9.getDayOfWeek()) - ((getProlepticWeek() * 8) + getDayOfWeek())) / 8;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long monthsUntil(AbstractDate abstractDate) {
        return (((from(abstractDate).getProlepticMonth() * 64) + r9.getDayOfMonth()) - ((getProlepticMonth() * 64) + getDayOfMonth())) / 64;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return ((((r0 - 1) * 364) + (Symmetry454Chronology.getLeapYearsBefore(this.prolepticYear) * 7)) + this.dayOfYear) - 719163;
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(' ');
        sb.append(getEra());
        sb.append(' ');
        sb.append(getYearOfEra());
        int i = this.month;
        sb.append((i >= 10 || i <= 0) ? str : "/0");
        sb.append(this.month);
        sb.append(this.day < 10 ? "/0" : '/');
        sb.append(this.day);
        return sb.toString();
    }
}
