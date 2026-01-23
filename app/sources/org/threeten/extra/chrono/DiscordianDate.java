package org.threeten.extra.chrono;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
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
public final class DiscordianDate extends AbstractDate implements ChronoLocalDate, Serializable {
    private final short day;
    private final short month;
    private final int prolepticYear;

    @Override // org.threeten.extra.chrono.AbstractDate
    int lengthOfWeek() {
        return 5;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int lengthOfYearInMonths() {
        return 5;
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public static DiscordianDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static DiscordianDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static DiscordianDate now(Clock clock) {
        return ofEpochDay(LocalDate.now(clock).toEpochDay());
    }

    /* renamed from: of */
    public static DiscordianDate m3999of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static DiscordianDate from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof DiscordianDate) {
            return (DiscordianDate) temporalAccessor;
        }
        return ofEpochDay(temporalAccessor.getLong(ChronoField.EPOCH_DAY));
    }

    static DiscordianDate ofYearDay(int i, int i2) {
        long j = i;
        DiscordianChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR);
        ChronoField.DAY_OF_YEAR.checkValidValue(i2);
        boolean zIsLeapYear = DiscordianChronology.INSTANCE.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        if (zIsLeapYear) {
            if (i2 == 60) {
                return new DiscordianDate(i, 0, 0);
            }
            if (i2 > 60) {
                i2--;
            }
        }
        int i3 = i2 - 1;
        return new DiscordianDate(i, (i3 / 73) + 1, (i3 % 73) + 1);
    }

    static DiscordianDate ofEpochDay(long j) {
        DiscordianChronology.EPOCH_DAY_RANGE.checkValidValue(j, ChronoField.EPOCH_DAY);
        long j2 = j + 719162;
        long jFloorDiv = Math.floorDiv(j2, 146097L);
        long jFloorMod = Math.floorMod(j2, 146097L);
        if (jFloorMod == 146096) {
            return ofYearDay(((int) (jFloorDiv * 400)) + 1566, 366);
        }
        int i = (int) jFloorMod;
        int i2 = i / 36524;
        int i3 = i % 36524;
        int i4 = i3 / 1461;
        int i5 = i3 % 1461;
        if (i5 == 1460) {
            return ofYearDay(((int) (jFloorDiv * 400)) + (i2 * 100) + (i4 * 4) + 1170, 366);
        }
        return ofYearDay(((int) (jFloorDiv * 400)) + (i2 * 100) + (i4 * 4) + (i5 / 365) + 1167, (i5 % 365) + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static DiscordianDate resolvePreviousValid(int i, int i2, int i3) {
        int i4;
        if (i2 != 0) {
            i4 = i3 != 0 ? 60 : i3;
        } else {
            i4 = 0;
            if (!DiscordianChronology.INSTANCE.isLeapYear(i)) {
                i2 = 1;
                i3 = 0;
                if (i3 != 0) {
                }
            }
        }
        return new DiscordianDate(i, i2, i4);
    }

    private static long getLeapYearsBefore(long j) {
        long j2 = j - 1167;
        return (Math.floorDiv(j2, 4L) - Math.floorDiv(j2, 100L)) + Math.floorDiv(j2, 400L);
    }

    static DiscordianDate create(int i, int i2, int i3) {
        long j = i;
        DiscordianChronology.YEAR_RANGE.checkValidValue(j, ChronoField.YEAR);
        DiscordianChronology.MONTH_OF_YEAR_RANGE.checkValidValue(i2, ChronoField.MONTH_OF_YEAR);
        DiscordianChronology.DAY_OF_MONTH_RANGE.checkValidValue(i3, ChronoField.DAY_OF_MONTH);
        if (i2 == 0 || i3 == 0) {
            if (i2 != 0 || i3 != 0) {
                throw new DateTimeException("Invalid date '" + i2 + PlaceholderUtils.XXShortPlaceholderText + i3 + "' as St. Tib's Day is the only special day inserted in a non-existent month.");
            }
            if (!DiscordianChronology.INSTANCE.isLeapYear(j)) {
                throw new DateTimeException("Invalid date 'St. Tibs Day' as '" + i + "' is not a leap year");
            }
        }
        return new DiscordianDate(i, i2, i3);
    }

    private DiscordianDate(int i, int i2, int i3) {
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
        if (s == 0 && this.day == 0) {
            return 60;
        }
        int i = ((s - 1) * 73) + this.day;
        return i + ((i < 60 || !isLeapYear()) ? 0 : 1);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    AbstractDate withDayOfYear(int i) {
        return plusDays(i - getDayOfYear());
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    ValueRange rangeAlignedWeekOfMonth() {
        return this.month == 0 ? ValueRange.m3598of(0L, 0L) : ValueRange.m3598of(1L, 15L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public DiscordianDate resolvePrevious(int i, int i2, int i3) {
        return resolvePreviousValid(i, i2, i3);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if ((temporalField instanceof ChronoField) && isSupported(temporalField)) {
            switch (C480411.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
                case 1:
                    return this.month == 0 ? ValueRange.m3598of(0L, 0L) : ValueRange.m3598of(1L, 5L);
                case 2:
                    return ValueRange.m3598of(isLeapYear() ? 0L : 1L, 5L);
                case 3:
                    return ValueRange.m3598of(isLeapYear() ? 0L : 1L, 73L);
                case 4:
                    return this.month == 0 ? ValueRange.m3598of(0L, 0L) : ValueRange.m3598of(1L, 73L);
                case 5:
                    return this.month == 0 ? ValueRange.m3598of(0L, 0L) : ValueRange.m3598of(1L, 5L);
                case 6:
                    return ValueRange.m3598of(isLeapYear() ? 0L : 1L, 5L);
            }
        }
        return super.range(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int dayOfWeek;
        if (temporalField instanceof ChronoField) {
            int i = C480411.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                if (this.month == 0) {
                    return 0L;
                }
                return super.getLong(temporalField);
            }
            if (i == 2) {
                dayOfWeek = getDayOfWeek();
            } else if (i != 3) {
                if (i == 7) {
                    if (this.month == 0) {
                        return 0L;
                    }
                    return super.getLong(temporalField);
                }
            } else {
                if (this.month == 0) {
                    return 0L;
                }
                dayOfWeek = (((getDayOfYear() - ((getDayOfYear() < 60 || !isLeapYear()) ? 0 : 1)) - 1) / 5) + 1;
            }
            return dayOfWeek;
        }
        return super.getLong(temporalField);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfWeek() {
        int i = 0;
        if (this.month == 0) {
            return 0;
        }
        int dayOfYear = getDayOfYear();
        if (getDayOfYear() >= 60 && isLeapYear()) {
            i = 1;
        }
        return (((dayOfYear - i) - 1) % 5) + 1;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long getProlepticMonth() {
        int i = this.prolepticYear * 5;
        short s = this.month;
        if (s == 0) {
            s = 1;
        }
        return (i + s) - 1;
    }

    long getProlepticWeek() {
        return ((this.prolepticYear * 73) + (this.month == 0 ? 12L : getLong(ChronoField.ALIGNED_WEEK_OF_YEAR))) - 1;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public DiscordianChronology getChronology() {
        return DiscordianChronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public DiscordianEra getEra() {
        return DiscordianEra.YOLD;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        return this.month == 0 ? 1 : 73;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public DiscordianDate with(TemporalAdjuster temporalAdjuster) {
        return (DiscordianDate) temporalAdjuster.adjustInto(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DiscordianDate with(TemporalField temporalField, long j) {
        short s;
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            DiscordianChronology discordianChronology = DiscordianChronology.INSTANCE;
            discordianChronology.range(chronoField).checkValidValue(j, chronoField);
            int i = (int) j;
            if (i == 0 && isLeapYear()) {
                switch (C480411.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return this.month == 0 ? this : create(this.prolepticYear, 0, 0);
                }
            }
            if (this.month == 0) {
                int i2 = C480411.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
                if ((i2 == 8 || i2 == 9) && discordianChronology.isLeapYear(i)) {
                    return create(i, 0, 0);
                }
                return create(this.prolepticYear, 1, 60).with(temporalField, j);
            }
            range(chronoField).checkValidValue(j, chronoField);
            int i3 = C480411.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i3 == 1 || i3 == 2) {
                if (this.month == 1 && (s = this.day) >= 56 && s < 61 && isLeapYear()) {
                    int dayOfWeek = getDayOfWeek();
                    if (dayOfWeek < 5 && i == 5) {
                        return (DiscordianDate) plusDays((i - dayOfWeek) + 1);
                    }
                    if (dayOfWeek == 5 && i < 5) {
                        return (DiscordianDate) plusDays((i - dayOfWeek) - 1);
                    }
                }
            } else if (i3 == 3) {
                if ((this.month == 1 || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) && isLeapYear()) {
                    int i4 = (int) getLong(temporalField);
                    int dayOfWeek2 = getDayOfWeek();
                    if ((i4 > 12 || (i4 == 12 && dayOfWeek2 == 5)) && (i < 12 || (i == 12 && dayOfWeek2 < 5))) {
                        return (DiscordianDate) plusDays(((j - i4) * 5) - 1);
                    }
                    if ((i > 12 || (i == 12 && dayOfWeek2 == 5)) && (i4 < 12 || (i4 == 12 && dayOfWeek2 < 5))) {
                        return (DiscordianDate) plusDays(((j - i4) * lengthOfWeek()) + 1);
                    }
                }
            } else if (i3 != 5) {
                if (i3 == 7) {
                }
            }
        }
        return (DiscordianDate) super.with(temporalField, j);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public DiscordianDate plus(TemporalAmount temporalAmount) {
        return (DiscordianDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public DiscordianDate plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i = C480411.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return plusWeeks(j);
            }
            if (i == 2) {
                return plusMonths(j);
            }
        }
        return (DiscordianDate) super.plus(j, temporalUnit);
    }

    /* renamed from: org.threeten.extra.chrono.DiscordianDate$1 */
    static /* synthetic */ class C480411 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.WEEKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public DiscordianDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long jAddExact = Math.addExact(getProlepticMonth(), j);
        int intExact = Math.toIntExact(Math.floorDiv(jAddExact, 5L));
        int iFloorMod = (int) (Math.floorMod(jAddExact, 5L) + 1);
        if (this.month == 0 && iFloorMod == 1) {
            iFloorMod = 0;
        }
        return resolvePrevious(intExact, iFloorMod, (int) this.day);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.extra.chrono.AbstractDate
    public DiscordianDate plusWeeks(long j) {
        if (j == 0) {
            return this;
        }
        long jAddExact = Math.addExact(getProlepticWeek(), j);
        int intExact = Math.toIntExact(Math.floorDiv(jAddExact, 73L));
        int iFloorMod = (((int) Math.floorMod(jAddExact, 73L)) * 5) + (this.month != 0 ? get(ChronoField.DAY_OF_WEEK) : 5);
        if (DiscordianChronology.INSTANCE.isLeapYear(intExact) && (iFloorMod > 60 || (iFloorMod == 60 && this.month != 0))) {
            iFloorMod++;
        }
        return ofYearDay(intExact, iFloorMod);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public DiscordianDate minus(TemporalAmount temporalAmount) {
        return (DiscordianDate) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public DiscordianDate minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime<DiscordianDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        return until((AbstractDate) from(temporal), temporalUnit);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long until(AbstractDate abstractDate, TemporalUnit temporalUnit) {
        if ((temporalUnit instanceof ChronoUnit) && C480411.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()] == 1) {
            return weeksUntil(from(abstractDate));
        }
        return super.until(abstractDate, temporalUnit);
    }

    long weeksUntil(DiscordianDate discordianDate) {
        long prolepticWeek = getProlepticWeek() * 8;
        long prolepticWeek2 = discordianDate.getProlepticWeek() * 8;
        int dayOfWeek = 4;
        long dayOfWeek2 = ((this.month != 0 || discordianDate.month == 0) ? getDayOfWeek() : prolepticWeek2 > prolepticWeek ? 5 : 4) + prolepticWeek;
        if (discordianDate.month != 0 || this.month == 0) {
            dayOfWeek = discordianDate.getDayOfWeek();
        } else if (prolepticWeek > prolepticWeek2) {
            dayOfWeek = 5;
        }
        return ((prolepticWeek2 + dayOfWeek) - dayOfWeek2) / 8;
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    long monthsUntil(AbstractDate abstractDate) {
        DiscordianDate discordianDateFrom = from(abstractDate);
        long prolepticMonth = getProlepticMonth() * 128;
        long prolepticMonth2 = discordianDateFrom.getProlepticMonth() * 128;
        int dayOfMonth = 59;
        long dayOfMonth2 = ((this.month != 0 || discordianDateFrom.month == 0) ? getDayOfMonth() : prolepticMonth2 > prolepticMonth ? 60 : 59) + prolepticMonth;
        if (discordianDateFrom.month != 0 || this.month == 0) {
            dayOfMonth = abstractDate.getDayOfMonth();
        } else if (prolepticMonth > prolepticMonth2) {
            dayOfMonth = 60;
        }
        return ((prolepticMonth2 + dayOfMonth) - dayOfMonth2) / 128;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        long jMonthsUntil = monthsUntil(from(chronoLocalDate));
        return DiscordianChronology.INSTANCE.period(Math.toIntExact(jMonthsUntil / 5), (int) (jMonthsUntil % 5), (int) plusMonths(jMonthsUntil).daysUntil(chronoLocalDate));
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.prolepticYear;
        return ((((j - 1167) * 365) + getLeapYearsBefore(j)) + (getDayOfYear() - 1)) - 719162;
    }

    @Override // org.threeten.extra.chrono.AbstractDate, p479j$.time.chrono.ChronoLocalDate
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append(DiscordianChronology.INSTANCE.toString());
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(DiscordianEra.YOLD);
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(this.prolepticYear);
        if (this.month == 0) {
            sb.append(" St. Tib's Day");
        } else {
            sb.append("-");
            sb.append((int) this.month);
            sb.append(this.day < 10 ? "-0" : "-");
            sb.append((int) this.day);
        }
        return sb.toString();
    }
}
