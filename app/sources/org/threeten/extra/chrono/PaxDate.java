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
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class PaxDate extends AbstractDate implements ChronoLocalDate, Serializable {
    private final short day;
    private final short month;
    private final int prolepticYear;

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

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static PaxDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static PaxDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static PaxDate now(Clock clock) {
        return ofEpochDay(LocalDate.now(clock).toEpochDay());
    }

    /* renamed from: of */
    public static PaxDate m4007of(int i, int i2, int i3) {
        long j = i;
        ChronoField.YEAR.checkValidValue(j);
        PaxChronology.MONTH_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.MONTH_OF_YEAR);
        PaxChronology.DAY_OF_MONTH_RANGE.checkValidValue(i3, ChronoField.DAY_OF_MONTH);
        if (i2 == 14 && !PaxChronology.INSTANCE.isLeapYear(j)) {
            throw new DateTimeException("Invalid month 14 as " + i + "is not a leap year");
        }
        if (i3 > 7 && i2 == 13 && PaxChronology.INSTANCE.isLeapYear(j)) {
            throw new DateTimeException("Invalid date during Pax as " + i + " is a leap year");
        }
        return new PaxDate(i, i2, i3);
    }

    public static PaxDate from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof PaxDate) {
            return (PaxDate) temporalAccessor;
        }
        return ofEpochDay(temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    static PaxDate ofYearDay(int i, int i2) {
        long j = i;
        ChronoField.YEAR.checkValidValue(j);
        PaxChronology.DAY_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.DAY_OF_YEAR);
        boolean zIsLeapYear = PaxChronology.INSTANCE.isLeapYear(j);
        if (i2 > 364 && !zIsLeapYear) {
            throw new DateTimeException("Invalid date 'DayOfYear " + i2 + "' as '" + i + "' is not a leap year");
        }
        int i3 = (i2 - 1) / 28;
        int i4 = i3 + 1;
        if (zIsLeapYear && i4 == 13 && i2 >= 344) {
            i4 = i3 + 2;
        }
        int i5 = i2 - ((i4 - 1) * 28);
        if (i4 == 14) {
            i5 += 21;
        }
        return m4007of(i, i4, i5);
    }

    static PaxDate ofEpochDay(long j) {
        TemporalField temporalField = ChronoField.EPOCH_DAY;
        temporalField.range().checkValidValue(j, temporalField);
        long j2 = j + 719163;
        int iFloorDiv = (int) Math.floorDiv(j2, 146097L);
        long j3 = j2 - (146097 * iFloorDiv);
        int i = ((int) j3) / 36526;
        int iFloorMod = (int) Math.floorMod(j3, 36526L);
        if (iFloorMod >= 36155) {
            return ofYearDay((iFloorDiv * 400) + (i * 100) + 100, iFloorMod - 36154);
        }
        if (j2 >= 0) {
            if (iFloorMod >= 35784) {
                return ofYearDay((iFloorDiv * 400) + (i * 100) + 99, iFloorMod - 35783);
            }
            int i2 = iFloorMod / 2191;
            int i3 = iFloorMod % 2191;
            int i4 = i3 / 364;
            int i5 = i4 + 1;
            int i6 = i3 % 364;
            int i7 = i6 + 1;
            if (i5 == 7) {
                i7 = i6 + 365;
            } else {
                i4 = i5;
            }
            return ofYearDay((iFloorDiv * 400) + (i * 100) + (i2 * 6) + i4, i7);
        }
        if (iFloorMod < 371) {
            return ofYearDay((iFloorDiv * 400) + (i * 100) + 1, iFloorMod + 1);
        }
        int i8 = iFloorMod + 721;
        int i9 = i8 / 2191;
        int i10 = i8 % 2191;
        int i11 = i10 / 364;
        int i12 = i11 + 1;
        int i13 = i10 % 364;
        int i14 = i13 + 1;
        if (i12 == 7) {
            i14 = i13 + 365;
        } else {
            i11 = i12;
        }
        return ofYearDay((((iFloorDiv * 400) + (i * 100)) - 2) + (i9 * 6) + i11, i14);
    }

    private static PaxDate resolvePreviousValid(int i, int i2, int i3) {
        PaxChronology paxChronology = PaxChronology.INSTANCE;
        long j = i;
        return m4007of(i, Math.min(i2, (paxChronology.isLeapYear(j) ? 1 : 0) + 13), Math.min(i3, (i2 == 13 && paxChronology.isLeapYear(j)) ? 7 : 28));
    }

    private static long getLeapMonthsBefore(long j) {
        long j2 = j - (j <= 0 ? 13 : 12);
        return ((Math.floorDiv(j2, 1318L) * 18) - Math.floorDiv(j2, 5272L)) + ((Math.floorMod(j2, 1318L) - (j2 <= 0 ? 1317 : 0)) / 1304) + (j2 <= 0 ? 1 : 0) + ((Math.floorMod(j2, 1318L) + (j2 <= 0 ? 25 : 0)) / 79);
    }

    private static long getLeapYearsBefore(long j) {
        long j2 = j - 1;
        return ((Math.floorDiv(j2, 100L) * 18) - Math.floorDiv(j2, 400L)) + ((Math.floorMod(j2, 100L) - (j <= 0 ? 99 : 0)) / 99) + (j <= 0 ? 1 : 0) + ((Math.floorMod(j2, 100L) + (j <= 0 ? 2 : 0)) / 6);
    }

    private PaxDate(int i, int i2, int i3) {
        this.prolepticYear = i;
        this.month = (short) i2;
        this.day = (short) i3;
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
        short s = this.month;
        return (((s - 1) * 28) - (s == 14 ? 21 : 0)) + getDayOfMonth();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int lengthOfYearInMonths() {
        return (isLeapYear() ? 1 : 0) + 13;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    ValueRange rangeAlignedWeekOfMonth() {
        return ValueRange.m3598of(1L, (this.month == 13 && isLeapYear()) ? 1L : 4L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public PaxDate resolvePrevious(int i, int i2, int i3) {
        return resolvePreviousValid(i, i2, i3);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return ValueRange.m3598of(1L, (isLeapYear() ? 1 : 0) + 52);
        }
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return ValueRange.m3598of(1L, (isLeapYear() ? 1 : 0) + 13);
        }
        return super.range(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long getProlepticMonth() {
        return (((getProlepticYear() * 13) + getLeapYearsBefore(getProlepticYear())) + this.month) - 1;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public PaxChronology getChronology() {
        return PaxChronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public PaxEra getEra() {
        return this.prolepticYear >= 1 ? PaxEra.CE : PaxEra.BCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        return (this.month == 13 && isLeapYear()) ? 7 : 28;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return (isLeapYear() ? 7 : 0) + 364;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public PaxDate with(TemporalAdjuster temporalAdjuster) {
        return (PaxDate) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public PaxDate with(TemporalField temporalField, long j) {
        if (temporalField == ChronoField.YEAR) {
            return plusYears(Math.subtractExact(j, getProlepticYear()));
        }
        return (PaxDate) super.with(temporalField, j);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public PaxDate plus(TemporalAmount temporalAmount) {
        return (PaxDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public PaxDate plus(long j, TemporalUnit temporalUnit) {
        return (PaxDate) super.plus(j, temporalUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public PaxDate plusYears(long j) {
        if (j == 0) {
            return this;
        }
        int iCheckValidIntValue = ChronoField.YEAR.checkValidIntValue(getProlepticYear() + j);
        if (this.month == 13 && !isLeapYear() && PaxChronology.INSTANCE.isLeapYear(iCheckValidIntValue)) {
            return m4007of(iCheckValidIntValue, 14, getDayOfMonth());
        }
        return resolvePreviousValid(iCheckValidIntValue, this.month, this.day);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public PaxDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long jAddExact = Math.addExact(getProlepticMonth(), j);
        int iCheckValidIntValue = ChronoField.YEAR.checkValidIntValue(Math.floorDiv(jAddExact - getLeapMonthsBefore(jAddExact), 13L));
        long j2 = iCheckValidIntValue;
        return resolvePreviousValid(iCheckValidIntValue, Math.toIntExact((jAddExact - ((13 * j2) + getLeapYearsBefore(j2))) + 1), getDayOfMonth());
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public PaxDate minus(TemporalAmount temporalAmount) {
        return (PaxDate) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public PaxDate minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<PaxDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        return until((AbstractDate) from(temporal), temporalUnit);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long until(AbstractDate abstractDate, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            PaxDate paxDateFrom = from(abstractDate);
            int i = C480461.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return yearsUntil(paxDateFrom);
            }
            if (i == 2) {
                return yearsUntil(paxDateFrom) / 10;
            }
            if (i == 3) {
                return yearsUntil(paxDateFrom) / 100;
            }
            if (i == 4) {
                return yearsUntil(paxDateFrom) / 1000;
            }
        }
        return super.until(abstractDate, temporalUnit);
    }

    /* renamed from: org.threeten.extra.chrono.PaxDate$1 */
    static /* synthetic */ class C480461 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    long yearsUntil(PaxDate paxDate) {
        int i = 0;
        long prolepticYear = (getProlepticYear() * 512) + getDayOfYear() + ((this.month == 13 && !isLeapYear() && paxDate.isLeapYear()) ? 7 : 0);
        long prolepticYear2 = (paxDate.getProlepticYear() * 512) + paxDate.getDayOfYear();
        if (paxDate.month == 13 && !paxDate.isLeapYear() && isLeapYear()) {
            i = 7;
        }
        return ((prolepticYear2 + i) - prolepticYear) / 512;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        PaxDate paxDateFrom = from(chronoLocalDate);
        int intExact = Math.toIntExact(yearsUntil(paxDateFrom));
        PaxDate paxDatePlusYears = plusYears(intExact);
        int iMonthsUntil = (int) paxDatePlusYears.monthsUntil(paxDateFrom);
        return getChronology().period(intExact, iMonthsUntil, (int) paxDatePlusYears.plusMonths(iMonthsUntil).daysUntil(paxDateFrom));
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return ((((getProlepticYear() - 1) * 364) + (getLeapYearsBefore(getProlepticYear()) * 7)) + getDayOfYear()) - 719164;
    }
}
