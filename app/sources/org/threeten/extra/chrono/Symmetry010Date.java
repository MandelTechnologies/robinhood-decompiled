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
public final class Symmetry010Date extends AbstractDate implements ChronoLocalDate, Serializable {
    private static final int[] dayOfMonthOffset = {5, 0, 2};
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

    public static Symmetry010Date now() {
        return now(Clock.systemDefaultZone());
    }

    public static Symmetry010Date now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static Symmetry010Date now(Clock clock) {
        return ofEpochDay(LocalDate.now(clock).toEpochDay());
    }

    /* renamed from: of */
    public static Symmetry010Date m4009of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static Symmetry010Date from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Symmetry010Date) {
            return (Symmetry010Date) temporalAccessor;
        }
        return ofEpochDay(temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    static Symmetry010Date ofYearDay(int i, int i2) {
        long j = i;
        Symmetry010Chronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR_OF_ERA);
        Symmetry010Chronology.DAY_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.DAY_OF_YEAR);
        boolean zIsLeapYear = Symmetry010Chronology.INSTANCE.isLeapYear(j);
        if (i2 > 364 && !zIsLeapYear) {
            throw new DateTimeException("Invalid date 'DayOfYear " + i2 + "' as '" + i + "' is not a leap year");
        }
        int iMin = (Math.min(i2, 364) - 1) / 91;
        int i3 = (i2 - 1) - (iMin * 91);
        int i4 = i3 + 1;
        int i5 = iMin * 3;
        int i6 = i5 + 1;
        if (i4 > 61) {
            i6 = i5 + 3;
            i4 = i3 - 60;
        } else if (i4 > 30) {
            i6 = i5 + 2;
            i4 = i3 - 29;
        }
        return new Symmetry010Date(i, i6, i4);
    }

    static Symmetry010Date ofEpochDay(long j) {
        Symmetry010Chronology.EPOCH_DAY_RANGE.checkValidValue(3 + j, ChronoField.EPOCH_DAY);
        long j2 = j + 719163;
        long j3 = (293 * j2) / 107016;
        long j4 = j3 + 1;
        long leapYearsBefore = j2 - ((j3 * 364) + (Symmetry010Chronology.getLeapYearsBefore(j4) * 7));
        if (leapYearsBefore < 1) {
            leapYearsBefore += Symmetry010Chronology.INSTANCE.isLeapYear(j3) ? 371L : 364L;
        } else {
            j3 = j4;
        }
        long j5 = Symmetry010Chronology.INSTANCE.isLeapYear(j3) ? 371 : 364;
        if (leapYearsBefore > j5) {
            leapYearsBefore -= j5;
            j3++;
        }
        return ofYearDay((int) j3, (int) leapYearsBefore);
    }

    private static Symmetry010Date resolvePreviousValid(int i, int i2, int i3) {
        int i4;
        int iMin = Math.min(i2, 12);
        if (iMin == 12 && Symmetry010Chronology.INSTANCE.isLeapYear(i)) {
            i4 = 37;
        } else {
            i4 = iMin % 3 == 2 ? 31 : 30;
        }
        return create(i, iMin, Math.min(i3, i4));
    }

    static Symmetry010Date create(int i, int i2, int i3) {
        long j = i;
        Symmetry010Chronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR_OF_ERA);
        Symmetry010Chronology.MONTH_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.MONTH_OF_YEAR);
        Symmetry010Chronology.DAY_OF_MONTH_RANGE.checkValidValue(i3, ChronoField.DAY_OF_MONTH);
        if (i3 > 30) {
            if (i2 == 12) {
                if (!Symmetry010Chronology.INSTANCE.isLeapYear(j)) {
                    throw new DateTimeException("Invalid Leap Day as '" + i + "' is not a leap year");
                }
            } else {
                int i4 = i2 % 3;
                if ((i4 == 2 && i3 > 31) || i4 != 2) {
                    throw new DateTimeException("Invalid date: " + i + '/' + i2 + '/' + i3);
                }
            }
        }
        return new Symmetry010Date(i, i2, i3);
    }

    private Symmetry010Date(int i, int i2, int i3) {
        this.prolepticYear = i;
        this.month = i2;
        this.day = i3;
        this.dayOfYear = ((i2 - 1) * 30) + (i2 / 3) + i3;
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
    int getDayOfWeek() {
        return (((this.dayOfYear - 1) + getDayOfMonthOffset()) % 7) + 1;
    }

    long getProlepticWeek() {
        return (((r0 * 52) + Symmetry010Chronology.getLeapYearsBefore(this.prolepticYear)) + ((this.dayOfYear - 1) / 7)) - 1;
    }

    private int getDayOfMonthOffset() {
        return dayOfMonthOffset[this.month % 3];
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (isSupported(temporalField)) {
                switch (C480481.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return ValueRange.m3598of(1L, 7L);
                    case 4:
                        return ValueRange.m3598of(1L, lengthOfMonth() / 7);
                    case 5:
                        return ValueRange.m3598of(1L, (isLeapYear() ? 1 : 0) + 52);
                    case 6:
                        return ValueRange.m3598of(1L, lengthOfMonth());
                    case 7:
                        return ValueRange.m3598of(1L, lengthOfYear());
                    case 8:
                        return Symmetry010Chronology.EPOCH_DAY_RANGE;
                    case 9:
                        return Symmetry010Chronology.ERA_RANGE;
                    case 10:
                        return Symmetry010Chronology.MONTH_OF_YEAR_RANGE;
                }
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return super.range(temporalField);
    }

    /* renamed from: org.threeten.extra.chrono.Symmetry010Date$1 */
    static /* synthetic */ class C480481 {
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
    public Symmetry010Date resolvePrevious(int i, int i2, int i3) {
        return resolvePreviousValid(i, i2, i3);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public Symmetry010Chronology getChronology() {
        return Symmetry010Chronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public IsoEra getEra() {
        return this.prolepticYear >= 1 ? IsoEra.f6718CE : IsoEra.BCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        if (isLeapYear() && this.month == 12) {
            return 37;
        }
        return this.month % 3 == 2 ? 31 : 30;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return isLeapYear() ? 371 : 364;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry010Date with(TemporalAdjuster temporalAdjuster) {
        return (Symmetry010Date) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry010Date with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (j == 0) {
                return this;
            }
            ChronoField chronoField = (ChronoField) temporalField;
            getChronology().range(chronoField).checkValidValue(j, chronoField);
            int i = (int) j;
            int i2 = C480481.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i2 == 3) {
                return ofYearDay(this.prolepticYear, (((this.dayOfYear - 1) / 7) * 7) + i);
            }
            if (i2 == 6) {
                return create(this.prolepticYear, this.month, i);
            }
        }
        return (Symmetry010Date) super.with(temporalField, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public Symmetry010Date withDayOfYear(int i) {
        return ofYearDay(this.prolepticYear, i);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry010Date plus(TemporalAmount temporalAmount) {
        return (Symmetry010Date) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry010Date plus(long j, TemporalUnit temporalUnit) {
        return (Symmetry010Date) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry010Date minus(TemporalAmount temporalAmount) {
        return (Symmetry010Date) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public Symmetry010Date minus(long j, TemporalUnit temporalUnit) {
        return (Symmetry010Date) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<Symmetry010Date> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        return until((AbstractDate) from(temporal), temporalUnit);
    }

    long yearsUntil(Symmetry010Date symmetry010Date) {
        return (((symmetry010Date.prolepticYear * 512) + symmetry010Date.getDayOfYear()) - ((this.prolepticYear * 512) + getDayOfYear())) / 512;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        Symmetry010Date symmetry010DateFrom = from(chronoLocalDate);
        int intExact = Math.toIntExact(yearsUntil(symmetry010DateFrom));
        Symmetry010Date symmetry010Date = (Symmetry010Date) plusYears(intExact);
        int iMonthsUntil = (int) symmetry010Date.monthsUntil(symmetry010DateFrom);
        return getChronology().period(intExact, iMonthsUntil, (int) symmetry010Date.plusMonths(iMonthsUntil).daysUntil(symmetry010DateFrom));
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
        return ((((r0 - 1) * 364) + (Symmetry010Chronology.getLeapYearsBefore(this.prolepticYear) * 7)) + this.dayOfYear) - 719163;
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
