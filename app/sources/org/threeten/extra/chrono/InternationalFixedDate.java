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
public final class InternationalFixedDate extends AbstractDate implements ChronoLocalDate, Serializable {
    private final int day;
    private final transient int dayOfYear;
    private final transient boolean isLeapDay;
    private final transient boolean isLeapYear;
    private final transient boolean isYearDay;
    private final int month;
    private final int prolepticYear;

    @Override // org.threeten.extra.chrono.AbstractDate
    int lengthOfYearInMonths() {
        return 13;
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

    public static InternationalFixedDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static InternationalFixedDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static InternationalFixedDate now(Clock clock) {
        return ofEpochDay(LocalDate.now(clock).toEpochDay());
    }

    /* renamed from: of */
    public static InternationalFixedDate m4003of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static InternationalFixedDate from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof InternationalFixedDate) {
            return (InternationalFixedDate) temporalAccessor;
        }
        return ofEpochDay(temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    static InternationalFixedDate ofYearDay(int i, int i2) {
        long j = i;
        InternationalFixedChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR_OF_ERA);
        ChronoField.DAY_OF_YEAR.checkValidValue(i2);
        boolean zIsLeapYear = InternationalFixedChronology.INSTANCE.isLeapYear(j);
        int i3 = (zIsLeapYear ? 1 : 0) + 365;
        if (i2 > i3) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        if (i2 == i3) {
            return new InternationalFixedDate(i, 13, 29);
        }
        if (i2 == 169 && zIsLeapYear) {
            return new InternationalFixedDate(i, 6, 29);
        }
        int i4 = i2 - 1;
        if (i2 >= 169 && zIsLeapYear) {
            i4 = i2 - 2;
        }
        return new InternationalFixedDate(i, (i4 / 28) + 1, (i4 % 28) + 1);
    }

    static InternationalFixedDate ofEpochDay(long j) {
        InternationalFixedChronology.EPOCH_DAY_RANGE.checkValidValue(j, ChronoField.EPOCH_DAY);
        long j2 = j + 719528;
        long j3 = (400 * j2) / 146097;
        long leapYearsBefore = j2 - ((365 * j3) + InternationalFixedChronology.getLeapYearsBefore(j3));
        boolean zIsLeapYear = InternationalFixedChronology.INSTANCE.isLeapYear(j3);
        if (leapYearsBefore == 366 && !zIsLeapYear) {
            j3++;
            leapYearsBefore = 1;
        }
        if (leapYearsBefore == 0) {
            j3--;
            leapYearsBefore = (zIsLeapYear ? 1 : 0) + 365;
        }
        return ofYearDay((int) j3, (int) leapYearsBefore);
    }

    private static InternationalFixedDate resolvePreviousValid(int i, int i2, int i3) {
        int iMin = Math.min(i2, 13);
        return create(i, iMin, Math.min(i3, (iMin == 13 || (iMin == 6 && InternationalFixedChronology.INSTANCE.isLeapYear((long) i))) ? 29 : 28));
    }

    static InternationalFixedDate create(int i, int i2, int i3) {
        long j = i;
        InternationalFixedChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR_OF_ERA);
        InternationalFixedChronology.MONTH_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.MONTH_OF_YEAR);
        InternationalFixedChronology.DAY_OF_MONTH_RANGE.checkValidValue(i3, ChronoField.DAY_OF_MONTH);
        if (i3 == 29 && i2 != 6 && i2 != 13) {
            throw new DateTimeException("Invalid date: " + i + '/' + i2 + '/' + i3);
        }
        if (i2 == 6 && i3 == 29 && !InternationalFixedChronology.INSTANCE.isLeapYear(j)) {
            throw new DateTimeException("Invalid Leap Day as '" + i + "' is not a leap year");
        }
        return new InternationalFixedDate(i, i2, i3);
    }

    private InternationalFixedDate(int i, int i2, int i3) {
        this.prolepticYear = i;
        this.month = i2;
        this.day = i3;
        boolean zIsLeapYear = InternationalFixedChronology.INSTANCE.isLeapYear(i);
        this.isLeapYear = zIsLeapYear;
        int i4 = 0;
        this.isLeapDay = i2 == 6 && i3 == 29;
        this.isYearDay = i2 == 13 && i3 == 29;
        int i5 = ((i2 - 1) * 28) + i3;
        if (i2 > 6 && zIsLeapYear) {
            i4 = 1;
        }
        this.dayOfYear = i5 + i4;
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
        if (isSpecialDay()) {
            return 0;
        }
        return ((this.day - 1) / 7) + 1;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getAlignedWeekOfYear() {
        if (isSpecialDay()) {
            return 0;
        }
        return ((this.month - 1) * 4) + ((this.day - 1) / 7) + 1;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfWeek() {
        if (isSpecialDay()) {
            return 0;
        }
        return ((this.day - 1) % 7) + 1;
    }

    long getProlepticWeek() {
        return ((getProlepticMonth() * 4) + ((getDayOfMonth() - 1) / 7)) - 1;
    }

    private boolean isSpecialDay() {
        return this.day == 29;
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (isSupported(temporalField)) {
                switch (C480431.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return isSpecialDay() ? InternationalFixedChronology.EMPTY_RANGE : ValueRange.m3598of(1L, 7L);
                    case 4:
                        return isSpecialDay() ? InternationalFixedChronology.EMPTY_RANGE : ValueRange.m3598of(1L, 4L);
                    case 5:
                        return isSpecialDay() ? InternationalFixedChronology.EMPTY_RANGE : ValueRange.m3598of(1L, 52L);
                    case 6:
                        return ValueRange.m3598of(1L, lengthOfMonth());
                    case 7:
                        return this.isLeapYear ? InternationalFixedChronology.DAY_OF_YEAR_LEAP_RANGE : InternationalFixedChronology.DAY_OF_YEAR_NORMAL_RANGE;
                    case 8:
                        return InternationalFixedChronology.EPOCH_DAY_RANGE;
                    case 9:
                        return InternationalFixedChronology.ERA_RANGE;
                    case 10:
                        return InternationalFixedChronology.MONTH_OF_YEAR_RANGE;
                }
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return super.range(temporalField);
    }

    /* renamed from: org.threeten.extra.chrono.InternationalFixedDate$1 */
    static /* synthetic */ class C480431 {
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
        return isSpecialDay() ? InternationalFixedChronology.EMPTY_RANGE : ValueRange.m3598of(1L, 4L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public InternationalFixedDate resolvePrevious(int i, int i2, int i3) {
        return resolvePreviousValid(i, i2, i3);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public InternationalFixedChronology getChronology() {
        return InternationalFixedChronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public InternationalFixedEra getEra() {
        return InternationalFixedEra.CE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        return isLongMonth() ? 29 : 28;
    }

    private boolean isLongMonth() {
        int i = this.month;
        if (i != 13) {
            return i == 6 && this.isLeapYear;
        }
        return true;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return (this.isLeapYear ? 1 : 0) + 365;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public InternationalFixedDate with(TemporalAdjuster temporalAdjuster) {
        return (InternationalFixedDate) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public InternationalFixedDate with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (j == 0 && isSpecialDay()) {
                return this;
            }
            ChronoField chronoField = (ChronoField) temporalField;
            getChronology().range(chronoField).checkValidValue(j, chronoField);
            int i = (int) j;
            switch (C480431.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (j == 0 && !isSpecialDay()) {
                        range(chronoField).checkValidValue(j, temporalField);
                    }
                    return resolvePreviousValid(this.prolepticYear, this.month, (isSpecialDay() ? 21 : ((getDayOfMonth() - 1) / 7) * 7) + i);
                case 4:
                    if (j == 0 && !isSpecialDay()) {
                        range(chronoField).checkValidValue(j, temporalField);
                    }
                    return resolvePreviousValid(this.prolepticYear, this.month, ((i - 1) * 7) + (isSpecialDay() ? 1 : this.day % 7));
                case 5:
                    if (j == 0 && !isSpecialDay()) {
                        range(chronoField).checkValidValue(j, temporalField);
                    }
                    int i2 = i - 1;
                    return resolvePreviousValid(this.prolepticYear, (i2 / 4) + 1, ((i2 % 4) * 7) + 1 + ((this.day - 1) % 7));
                case 6:
                    return create(this.prolepticYear, this.month, i);
            }
        }
        return (InternationalFixedDate) super.with(temporalField, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public InternationalFixedDate withDayOfYear(int i) {
        return ofYearDay(this.prolepticYear, i);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public InternationalFixedDate plus(TemporalAmount temporalAmount) {
        return (InternationalFixedDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public InternationalFixedDate plus(long j, TemporalUnit temporalUnit) {
        return (InternationalFixedDate) super.plus(j, temporalUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public InternationalFixedDate plusWeeks(long j) {
        if (j == 0) {
            return this;
        }
        if (j % 4 == 0) {
            return plusMonths(j / 4);
        }
        long jAddExact = Math.addExact(getProlepticWeek(), j);
        return create(Math.toIntExact(Math.floorDiv(jAddExact, 52L)), Math.floorDiv(Math.toIntExact(Math.floorMod(jAddExact, 52L)), 4) + 1, (((((r7 * 7) + 8) + (this.isLeapDay ? 0 : this.isYearDay ? -1 : (this.day - 1) % 7)) - 1) % 28) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public InternationalFixedDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        if (j % 13 == 0) {
            return plusYears(j / 13);
        }
        int iAddExact = (int) Math.addExact(getProlepticMonth(), j);
        return resolvePreviousValid(iAddExact / 13, (iAddExact % 13) + 1, this.day);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public InternationalFixedDate plusYears(long j) {
        return j == 0 ? this : resolvePreviousValid(InternationalFixedChronology.YEAR_RANGE.checkValidIntValue(Math.addExact(this.prolepticYear, j), ChronoField.YEAR), this.month, this.day);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public InternationalFixedDate minus(TemporalAmount temporalAmount) {
        return (InternationalFixedDate) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public InternationalFixedDate minus(long j, TemporalUnit temporalUnit) {
        return (InternationalFixedDate) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<InternationalFixedDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        return until((AbstractDate) from(temporal), temporalUnit);
    }

    long yearsUntil(InternationalFixedDate internationalFixedDate) {
        return (((internationalFixedDate.prolepticYear * 512) + internationalFixedDate.getInternalDayOfYear()) - ((this.prolepticYear * 512) + getInternalDayOfYear())) / 512;
    }

    private int getInternalDayOfYear() {
        return (!this.isLeapYear || this.month <= 6) ? this.dayOfYear : this.dayOfYear - 1;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        InternationalFixedDate internationalFixedDateFrom = from(chronoLocalDate);
        int intExact = Math.toIntExact(yearsUntil(internationalFixedDateFrom));
        InternationalFixedDate internationalFixedDatePlusYears = plusYears(intExact);
        int iMonthsUntil = (int) internationalFixedDatePlusYears.monthsUntil(internationalFixedDateFrom);
        int iDaysUntil = (int) internationalFixedDatePlusYears.plusMonths(iMonthsUntil).daysUntil(internationalFixedDateFrom);
        if (!this.isYearDay && !this.isLeapDay && (!internationalFixedDateFrom.isYearDay || internationalFixedDateFrom.isLeapDay)) {
            if (iDaysUntil == 28) {
                iMonthsUntil++;
                iDaysUntil = 0;
            }
            if (iDaysUntil == -28) {
                iMonthsUntil--;
                iDaysUntil = 0;
            }
        }
        return getChronology().period(intExact, iMonthsUntil, iDaysUntil);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long weeksUntil(AbstractDate abstractDate) {
        InternationalFixedDate internationalFixedDateFrom = from(abstractDate);
        int i = this.day;
        int i2 = 1;
        if ((i >= 1 && internationalFixedDateFrom.day >= 1) || i == internationalFixedDateFrom.day || !this.isLeapYear || !internationalFixedDateFrom.isLeapYear) {
            i2 = 0;
        } else if (!isBefore(internationalFixedDateFrom)) {
            i2 = -1;
        }
        return ((((internationalFixedDateFrom.getProlepticWeek() * 8) + abstractDate.getDayOfWeek()) - ((getProlepticWeek() * 8) + getDayOfWeek())) - i2) / 8;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long monthsUntil(AbstractDate abstractDate) {
        return (((from(abstractDate).getProlepticMonth() * 32) + r9.getDayOfMonth()) - ((getProlepticMonth() * 32) + getDayOfMonth())) / 32;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        int i = this.prolepticYear;
        return (((i * 365) + InternationalFixedChronology.getLeapYearsBefore(i)) + this.dayOfYear) - 719528;
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
