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
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class EthiopicDate extends AbstractNileDate implements ChronoLocalDate, Serializable {
    private final short day;
    private final short month;
    private final int prolepticYear;

    @Override // org.threeten.extra.chrono.AbstractNileDate
    int getEpochDayDifference() {
        return 716367;
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

    @Override // org.threeten.extra.chrono.AbstractNileDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ int lengthOfMonth() {
        return super.lengthOfMonth();
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public /* bridge */ /* synthetic */ ValueRange range(TemporalField temporalField) {
        return super.range(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractNileDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ long toEpochDay() {
        return super.toEpochDay();
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static EthiopicDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static EthiopicDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static EthiopicDate now(Clock clock) {
        return ofEpochDay(LocalDate.now(clock).toEpochDay());
    }

    /* renamed from: of */
    public static EthiopicDate m4001of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static EthiopicDate from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof EthiopicDate) {
            return (EthiopicDate) temporalAccessor;
        }
        return ofEpochDay(temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    static EthiopicDate ofYearDay(int i, int i2) {
        long j = i;
        AbstractNileChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR);
        TemporalField temporalField = ChronoField.DAY_OF_YEAR;
        temporalField.range().checkValidValue(i2, temporalField);
        if (i2 == 366 && !EthiopicChronology.INSTANCE.isLeapYear(j)) {
            throw new DateTimeException("Invalid date 'Pagumen 6' as '" + i + "' is not a leap year");
        }
        int i3 = i2 - 1;
        return new EthiopicDate(i, (i3 / 30) + 1, (i3 % 30) + 1);
    }

    static EthiopicDate ofEpochDay(long j) {
        int i;
        TemporalField temporalField = ChronoField.EPOCH_DAY;
        temporalField.range().checkValidValue(j, temporalField);
        long j2 = 716367 + j;
        if (j2 < 0) {
            j2 = 365966367 + j;
            i = -1000000;
        } else {
            i = 0;
        }
        int i2 = (int) (((4 * j2) + 1463) / 1461);
        int i3 = (int) (j2 - (((i2 - 1) * 365) + (i2 / 4)));
        return new EthiopicDate(i2 + i, (i3 / 30) + 1, (i3 % 30) + 1);
    }

    private static EthiopicDate resolvePreviousValid(int i, int i2, int i3) {
        if (i2 == 13 && i3 > 5) {
            i3 = EthiopicChronology.INSTANCE.isLeapYear((long) i) ? 6 : 5;
        }
        return new EthiopicDate(i, i2, i3);
    }

    static EthiopicDate create(int i, int i2, int i3) {
        long j = i;
        AbstractNileChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR);
        AbstractNileChronology.MOY_RANGE.checkValidValue(i2, ChronoField.MONTH_OF_YEAR);
        AbstractNileChronology.DOM_RANGE.checkValidValue(i3, ChronoField.DAY_OF_MONTH);
        if (i2 == 13 && i3 > 5) {
            if (!EthiopicChronology.INSTANCE.isLeapYear(j)) {
                if (i3 == 6) {
                    throw new DateTimeException("Invalid date 'Pagumen 6' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date 'Pagumen " + i3 + "', valid range from 1 to 5, or 1 to 6 in a leap year");
            }
            if (i3 > 6) {
                throw new DateTimeException("Invalid date 'Pagumen " + i3 + "', valid range from 1 to 5, or 1 to 6 in a leap year");
            }
        }
        return new EthiopicDate(i, i2, i3);
    }

    private EthiopicDate(int i, int i2, int i3) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public EthiopicDate resolvePrevious(int i, int i2, int i3) {
        return resolvePreviousValid(i, i2, i3);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public EthiopicChronology getChronology() {
        return EthiopicChronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public EthiopicEra getEra() {
        return this.prolepticYear >= 1 ? EthiopicEra.INCARNATION : EthiopicEra.BEFORE_INCARNATION;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public EthiopicDate with(TemporalAdjuster temporalAdjuster) {
        return (EthiopicDate) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public EthiopicDate with(TemporalField temporalField, long j) {
        return (EthiopicDate) super.with(temporalField, j);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public EthiopicDate plus(TemporalAmount temporalAmount) {
        return (EthiopicDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public EthiopicDate plus(long j, TemporalUnit temporalUnit) {
        return (EthiopicDate) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public EthiopicDate minus(TemporalAmount temporalAmount) {
        return (EthiopicDate) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public EthiopicDate minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<EthiopicDate> atTime(LocalTime localTime) {
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
}
