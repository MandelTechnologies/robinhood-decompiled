package org.threeten.extra.chrono;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.io.Serializable;
import p479j$.time.Clock;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.Month;
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
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class JulianDate extends AbstractDate implements ChronoLocalDate, Serializable {
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

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public /* bridge */ /* synthetic */ ValueRange range(TemporalField temporalField) {
        return super.range(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static JulianDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static JulianDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static JulianDate now(Clock clock) {
        return ofEpochDay(LocalDate.now(clock).toEpochDay());
    }

    /* renamed from: of */
    public static JulianDate m4005of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static JulianDate from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof JulianDate) {
            return (JulianDate) temporalAccessor;
        }
        return ofEpochDay(temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    static JulianDate ofYearDay(int i, int i2) {
        long j = i;
        JulianChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR);
        ChronoField.DAY_OF_YEAR.checkValidValue(i2);
        boolean zIsLeapYear = JulianChronology.INSTANCE.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        Month monthM3422of = Month.m3422of(((i2 - 1) / 31) + 1);
        if (i2 > (monthM3422of.firstDayOfYear(zIsLeapYear) + monthM3422of.length(zIsLeapYear)) - 1) {
            monthM3422of = monthM3422of.plus(1L);
        }
        return new JulianDate(i, monthM3422of.getValue(), (i2 - monthM3422of.firstDayOfYear(zIsLeapYear)) + 1);
    }

    static JulianDate ofEpochDay(long j) {
        TemporalField temporalField = ChronoField.EPOCH_DAY;
        temporalField.range().checkValidValue(j, temporalField);
        long j2 = j + 719164;
        long jFloorDiv = Math.floorDiv(j2, 1461L);
        long jFloorMod = Math.floorMod(j2, 1461L);
        if (jFloorMod == 1460) {
            return ofYearDay((int) ((jFloorDiv * 4) + 4), 366);
        }
        return ofYearDay((int) ((jFloorDiv * 4) + (jFloorMod / 365) + 1), (int) ((jFloorMod % 365) + 1));
    }

    private static JulianDate resolvePreviousValid(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, JulianChronology.INSTANCE.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new JulianDate(i, i2, i3);
    }

    static JulianDate create(int i, int i2, int i3) {
        long j = i;
        JulianChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        ChronoField.DAY_OF_MONTH.checkValidValue(i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (JulianChronology.INSTANCE.isLeapYear(j)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.m3422of(i2).name() + PlaceholderUtils.XXShortPlaceholderText + i3 + "'");
            }
        }
        return new JulianDate(i, i2, i3);
    }

    private JulianDate(int i, int i2, int i3) {
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
        return (Month.m3422of(this.month).firstDayOfYear(isLeapYear()) + this.day) - 1;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    ValueRange rangeAlignedWeekOfMonth() {
        return ValueRange.m3598of(1L, (this.month != 2 || isLeapYear()) ? 5L : 4L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public JulianDate resolvePrevious(int i, int i2, int i3) {
        return resolvePreviousValid(i, i2, i3);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public JulianChronology getChronology() {
        return JulianChronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public JulianEra getEra() {
        return this.prolepticYear >= 1 ? JulianEra.AD : JulianEra.BC;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        short s = this.month;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public JulianDate with(TemporalAdjuster temporalAdjuster) {
        return (JulianDate) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public JulianDate with(TemporalField temporalField, long j) {
        return (JulianDate) super.with(temporalField, j);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public JulianDate plus(TemporalAmount temporalAmount) {
        return (JulianDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public JulianDate plus(long j, TemporalUnit temporalUnit) {
        return (JulianDate) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public JulianDate minus(TemporalAmount temporalAmount) {
        return (JulianDate) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public JulianDate minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<JulianDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        return super.until((AbstractDate) from(temporal), temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        return super.doUntil(from(chronoLocalDate));
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.prolepticYear - 1;
        return (((365 * j) + Math.floorDiv(j, 4L)) + (getDayOfYear() - 1)) - 719164;
    }
}
