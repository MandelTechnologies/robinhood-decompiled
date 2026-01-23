package org.threeten.extra.chrono;

import java.io.Serializable;
import java.util.Objects;
import p479j$.time.Clock;
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
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class BritishCutoverDate extends AbstractDate implements ChronoLocalDate, Serializable {
    private final LocalDate isoDate;
    private final transient JulianDate julianDate;

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public /* bridge */ /* synthetic */ long getLong(TemporalField temporalField) {
        return super.getLong(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public /* bridge */ /* synthetic */ ValueRange range(TemporalField temporalField) {
        return super.range(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static BritishCutoverDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static BritishCutoverDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static BritishCutoverDate now(Clock clock) {
        return new BritishCutoverDate(LocalDate.now(clock));
    }

    /* renamed from: of */
    public static BritishCutoverDate m3996of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static BritishCutoverDate from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof BritishCutoverDate) {
            return (BritishCutoverDate) temporalAccessor;
        }
        return new BritishCutoverDate(LocalDate.from(temporalAccessor));
    }

    static BritishCutoverDate ofYearDay(int i, int i2) {
        if (i < 1752 || (i == 1752 && i2 <= 246)) {
            return new BritishCutoverDate(JulianDate.ofYearDay(i, i2));
        }
        if (i == 1752) {
            return new BritishCutoverDate(LocalDate.ofYearDay(i, i2 + 11));
        }
        return new BritishCutoverDate(LocalDate.ofYearDay(i, i2));
    }

    static BritishCutoverDate ofEpochDay(long j) {
        return new BritishCutoverDate(LocalDate.ofEpochDay(j));
    }

    static BritishCutoverDate create(int i, int i2, int i3) {
        if (i < 1752) {
            return new BritishCutoverDate(JulianDate.m4005of(i, i2, i3));
        }
        LocalDate localDateM3377of = LocalDate.m3377of(i, i2, i3);
        if (localDateM3377of.isBefore(BritishCutoverChronology.CUTOVER)) {
            return new BritishCutoverDate(JulianDate.m4005of(i, i2, i3));
        }
        return new BritishCutoverDate(localDateM3377of);
    }

    BritishCutoverDate(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.isoDate = localDate;
        this.julianDate = localDate.isBefore(BritishCutoverChronology.CUTOVER) ? JulianDate.from(localDate) : null;
    }

    BritishCutoverDate(JulianDate julianDate) {
        Objects.requireNonNull(julianDate, "julianDate");
        LocalDate localDateFrom = LocalDate.from(julianDate);
        this.isoDate = localDateFrom;
        this.julianDate = localDateFrom.isBefore(BritishCutoverChronology.CUTOVER) ? julianDate : null;
    }

    private boolean isCutoverYear() {
        return this.isoDate.getYear() == 1752 && this.isoDate.getDayOfYear() > 11;
    }

    private boolean isCutoverMonth() {
        return this.isoDate.getYear() == 1752 && this.isoDate.getMonthValue() == 9 && this.isoDate.getDayOfMonth() > 11;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getAlignedDayOfWeekInMonth() {
        if (isCutoverMonth() && this.julianDate == null) {
            return ((getDayOfMonth() - 12) % lengthOfWeek()) + 1;
        }
        return super.getAlignedDayOfWeekInMonth();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getAlignedWeekOfMonth() {
        if (isCutoverMonth() && this.julianDate == null) {
            return ((getDayOfMonth() - 12) / lengthOfWeek()) + 1;
        }
        return super.getAlignedWeekOfMonth();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getProlepticYear() {
        JulianDate julianDate = this.julianDate;
        return julianDate != null ? julianDate.getProlepticYear() : this.isoDate.getYear();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getMonth() {
        JulianDate julianDate = this.julianDate;
        return julianDate != null ? julianDate.getMonth() : this.isoDate.getMonthValue();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfMonth() {
        JulianDate julianDate = this.julianDate;
        return julianDate != null ? julianDate.getDayOfMonth() : this.isoDate.getDayOfMonth();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfYear() {
        JulianDate julianDate = this.julianDate;
        if (julianDate != null) {
            return julianDate.getDayOfYear();
        }
        if (this.isoDate.getYear() == 1752) {
            return this.isoDate.getDayOfYear() - 11;
        }
        return this.isoDate.getDayOfYear();
    }

    /* renamed from: org.threeten.extra.chrono.BritishCutoverDate$1 */
    static /* synthetic */ class C480391 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    public ValueRange rangeChrono(ChronoField chronoField) {
        int i = C480391.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            if (isCutoverMonth()) {
                return ValueRange.m3598of(1L, 30L);
            }
            return ValueRange.m3598of(1L, lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.m3598of(1L, lengthOfYear());
        }
        if (i == 3) {
            return rangeAlignedWeekOfMonth();
        }
        if (i == 4) {
            if (isCutoverYear()) {
                return ValueRange.m3598of(1L, 51L);
            }
            return ChronoField.ALIGNED_WEEK_OF_YEAR.range();
        }
        return getChronology().range(chronoField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    ValueRange rangeAlignedWeekOfMonth() {
        if (isCutoverMonth()) {
            return ValueRange.m3598of(1L, 3L);
        }
        return ValueRange.m3598of(1L, (getMonth() != 2 || isLeapYear()) ? 5L : 4L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public BritishCutoverDate resolvePrevious(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, getChronology().isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return create(i, i2, i3);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public BritishCutoverChronology getChronology() {
        return BritishCutoverChronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public JulianEra getEra() {
        return getProlepticYear() >= 1 ? JulianEra.AD : JulianEra.BC;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        if (isCutoverMonth()) {
            return 19;
        }
        JulianDate julianDate = this.julianDate;
        return julianDate != null ? julianDate.lengthOfMonth() : this.isoDate.lengthOfMonth();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        if (isCutoverYear()) {
            return 355;
        }
        JulianDate julianDate = this.julianDate;
        return julianDate != null ? julianDate.lengthOfYear() : this.isoDate.lengthOfYear();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public BritishCutoverDate with(TemporalAdjuster temporalAdjuster) {
        return (BritishCutoverDate) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public BritishCutoverDate with(TemporalField temporalField, long j) {
        return (BritishCutoverDate) super.with(temporalField, j);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public BritishCutoverDate plus(TemporalAmount temporalAmount) {
        return (BritishCutoverDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public BritishCutoverDate plus(long j, TemporalUnit temporalUnit) {
        return (BritishCutoverDate) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public BritishCutoverDate minus(TemporalAmount temporalAmount) {
        return (BritishCutoverDate) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public BritishCutoverDate minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<BritishCutoverDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        return super.until((AbstractDate) from(temporal), temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        long epochDay;
        long epochDay2;
        BritishCutoverDate britishCutoverDateFrom = from(chronoLocalDate);
        long prolepticMonth = britishCutoverDateFrom.getProlepticMonth() - getProlepticMonth();
        int dayOfMonth = britishCutoverDateFrom.getDayOfMonth() - getDayOfMonth();
        if (prolepticMonth == 0 && isCutoverMonth()) {
            JulianDate julianDate = this.julianDate;
            if (julianDate != null && britishCutoverDateFrom.julianDate == null) {
                dayOfMonth -= 11;
            } else if (julianDate == null && britishCutoverDateFrom.julianDate != null) {
                dayOfMonth += 11;
            }
        } else if (prolepticMonth > 0) {
            if (this.julianDate != null && britishCutoverDateFrom.julianDate == null) {
                dayOfMonth = (int) (britishCutoverDateFrom.toEpochDay() - plusMonths(prolepticMonth).toEpochDay());
            }
            if (dayOfMonth < 0) {
                prolepticMonth--;
                AbstractDate abstractDatePlusMonths = plusMonths(prolepticMonth);
                epochDay = britishCutoverDateFrom.toEpochDay();
                epochDay2 = abstractDatePlusMonths.toEpochDay();
                dayOfMonth = (int) (epochDay - epochDay2);
            }
        } else if (prolepticMonth < 0 && dayOfMonth > 0) {
            prolepticMonth++;
            AbstractDate abstractDatePlusMonths2 = plusMonths(prolepticMonth);
            epochDay = britishCutoverDateFrom.toEpochDay();
            epochDay2 = abstractDatePlusMonths2.toEpochDay();
            dayOfMonth = (int) (epochDay - epochDay2);
        }
        return getChronology().period(Math.toIntExact(prolepticMonth / lengthOfYearInMonths()), (int) (prolepticMonth % lengthOfYearInMonths()), dayOfMonth);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.localDate()) {
            return (R) this.isoDate;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BritishCutoverDate) {
            return this.isoDate.equals(((BritishCutoverDate) obj).isoDate);
        }
        return false;
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.isoDate.hashCode();
    }
}
