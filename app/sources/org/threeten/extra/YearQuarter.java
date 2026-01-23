package org.threeten.extra;

import com.squareup.wire.internal.MathMethods;
import java.io.Serializable;
import java.util.Objects;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.Month;
import p479j$.time.Year;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.format.SignStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.IsoFields;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class YearQuarter implements Temporal, TemporalAdjuster, Comparable<YearQuarter>, Serializable {
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendLiteral('Q').appendValue(IsoFields.QUARTER_OF_YEAR, 1).toFormatter();
    private final Quarter quarter;
    private final int year;

    /* renamed from: of */
    public static YearQuarter m3995of(int i, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        return new YearQuarter(i, Quarter.m3994of(i2));
    }

    public static YearQuarter from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearQuarter) {
            return (YearQuarter) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            TemporalAccessor temporalAccessorFrom = !IsoChronology.INSTANCE.equals(Chronology.from(temporalAccessor)) ? LocalDate.from(temporalAccessor) : temporalAccessor;
            return m3995of(Math.toIntExact(temporalAccessorFrom.getLong(ChronoField.YEAR)), Math.toIntExact(temporalAccessorFrom.getLong(IsoFields.QUARTER_OF_YEAR)));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain YearQuarter from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    @FromString
    public static YearQuarter parse(CharSequence charSequence) {
        return parse(charSequence, PARSER);
    }

    public static YearQuarter parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (YearQuarter) dateTimeFormatter.parse(charSequence, new TemporalQuery() { // from class: org.threeten.extra.YearQuarter$$ExternalSyntheticLambda0
            @Override // p479j$.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return YearQuarter.from(temporalAccessor);
            }
        });
    }

    private YearQuarter(int i, Quarter quarter) {
        this.year = i;
        this.quarter = quarter;
    }

    private YearQuarter with(int i, Quarter quarter) {
        return (this.year == i && this.quarter == quarter) ? this : new YearQuarter(i, quarter);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (temporalField == IsoFields.QUARTER_OF_YEAR) {
            return true;
        }
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit == IsoFields.QUARTER_YEARS) {
            return true;
        }
        return temporalUnit instanceof ChronoUnit ? temporalUnit == ChronoUnit.YEARS || temporalUnit == ChronoUnit.DECADES || temporalUnit == ChronoUnit.CENTURIES || temporalUnit == ChronoUnit.MILLENNIA || temporalUnit == ChronoUnit.ERAS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        TemporalField temporalField2 = IsoFields.QUARTER_OF_YEAR;
        if (temporalField == temporalField2) {
            return temporalField2.range();
        }
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.m3598of(1L, getYear() <= 0 ? MathMethods.NANOS_PER_SECOND : 999999999L);
        }
        return super.range(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField == IsoFields.QUARTER_OF_YEAR) {
            return this.quarter.getValue();
        }
        if (temporalField instanceof ChronoField) {
            int i = C480351.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                int i2 = this.year;
                return i2 < 1 ? 1 - i2 : i2;
            }
            if (i == 2) {
                return this.year;
            }
            if (i == 3) {
                return this.year < 1 ? 0 : 1;
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int value;
        if (temporalField == IsoFields.QUARTER_OF_YEAR) {
            value = this.quarter.getValue();
        } else if (temporalField instanceof ChronoField) {
            int i = C480351.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                int i2 = this.year;
                if (i2 < 1) {
                    i2 = 1 - i2;
                }
                return i2;
            }
            if (i != 2) {
                if (i == 3) {
                    return this.year < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
            value = this.year;
        } else {
            return temporalField.getFrom(this);
        }
        return value;
    }

    private long getProlepticQuarter() {
        return (this.year * 4) + (this.quarter.getValue() - 1);
    }

    public int getYear() {
        return this.year;
    }

    public int getQuarterValue() {
        return this.quarter.getValue();
    }

    public boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.year);
    }

    public int lengthOfQuarter() {
        return this.quarter.length(isLeapYear());
    }

    @Override // p479j$.time.temporal.Temporal
    public YearQuarter with(TemporalAdjuster temporalAdjuster) {
        return (YearQuarter) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public YearQuarter with(TemporalField temporalField, long j) {
        TemporalField temporalField2 = IsoFields.QUARTER_OF_YEAR;
        if (temporalField == temporalField2) {
            return withQuarter(temporalField2.range().checkValidIntValue(j, temporalField2));
        }
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = C480351.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
            if (i == 1) {
                if (this.year < 1) {
                    j = 1 - j;
                }
                return withYear((int) j);
            }
            if (i == 2) {
                return withYear((int) j);
            }
            if (i == 3) {
                return getLong(ChronoField.ERA) == j ? this : withYear(1 - this.year);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return (YearQuarter) temporalField.adjustInto(this, j);
    }

    public YearQuarter withYear(int i) {
        ChronoField.YEAR.checkValidValue(i);
        return with(i, this.quarter);
    }

    public YearQuarter withQuarter(int i) {
        TemporalField temporalField = IsoFields.QUARTER_OF_YEAR;
        temporalField.range().checkValidValue(i, temporalField);
        return with(this.year, Quarter.m3994of(i));
    }

    @Override // p479j$.time.temporal.Temporal
    public YearQuarter plus(TemporalAmount temporalAmount) {
        return (YearQuarter) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public YearQuarter plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit == IsoFields.QUARTER_YEARS) {
            return plusQuarters(j);
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = C480351.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return plusYears(j);
            }
            if (i == 2) {
                return plusYears(Math.multiplyExact(j, 10L));
            }
            if (i == 3) {
                return plusYears(Math.multiplyExact(j, 100L));
            }
            if (i == 4) {
                return plusYears(Math.multiplyExact(j, 1000L));
            }
            if (i == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return with((TemporalField) chronoField, Math.addExact(getLong(chronoField), j));
            }
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
        return (YearQuarter) temporalUnit.addTo(this, j);
    }

    /* renamed from: org.threeten.extra.YearQuarter$1 */
    static /* synthetic */ class C480351 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
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
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public YearQuarter plusYears(long j) {
        return j == 0 ? this : with(ChronoField.YEAR.checkValidIntValue(this.year + j), this.quarter);
    }

    public YearQuarter plusQuarters(long j) {
        if (j == 0) {
            return this;
        }
        long value = (this.year * 4) + (this.quarter.getValue() - 1) + j;
        return with(ChronoField.YEAR.checkValidIntValue(Math.floorDiv(value, 4L)), Quarter.m3994of(((int) Math.floorMod(value, 4L)) + 1));
    }

    @Override // p479j$.time.temporal.Temporal
    public YearQuarter minus(TemporalAmount temporalAmount) {
        return (YearQuarter) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public YearQuarter minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public YearQuarter minusQuarters(long j) {
        return j == Long.MIN_VALUE ? plusQuarters(Long.MAX_VALUE).plusQuarters(1L) : plusQuarters(-j);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return (R) IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) IsoFields.QUARTER_YEARS;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        if (!Chronology.from(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.plus(getProlepticQuarter() - ((temporal.get(ChronoField.YEAR) * 4) + (temporal.get(IsoFields.QUARTER_OF_YEAR) - 1)), IsoFields.QUARTER_YEARS);
    }

    @Override // p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearQuarter yearQuarterFrom = from(temporal);
        long prolepticQuarter = yearQuarterFrom.getProlepticQuarter() - getProlepticQuarter();
        if (temporalUnit == IsoFields.QUARTER_YEARS) {
            return prolepticQuarter;
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = C480351.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return prolepticQuarter / 4;
            }
            if (i == 2) {
                return prolepticQuarter / 40;
            }
            if (i == 3) {
                return prolepticQuarter / 400;
            }
            if (i == 4) {
                return prolepticQuarter / 4000;
            }
            if (i == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return yearQuarterFrom.getLong(chronoField) - getLong(chronoField);
            }
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, yearQuarterFrom);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public LocalDate atDay(int i) {
        ValueRange.m3598of(1L, lengthOfQuarter()).checkValidValue(i, IsoFields.DAY_OF_QUARTER);
        boolean zIsLeap = Year.isLeap(this.year);
        Month monthFirstMonth = this.quarter.firstMonth();
        while (i > monthFirstMonth.length(zIsLeap)) {
            i -= monthFirstMonth.length(zIsLeap);
            monthFirstMonth = monthFirstMonth.plus(1L);
        }
        return LocalDate.m3378of(this.year, monthFirstMonth, i);
    }

    public LocalDate atEndOfQuarter() {
        Month monthPlus = this.quarter.firstMonth().plus(2L);
        return LocalDate.m3378of(this.year, monthPlus, monthPlus.maxLength());
    }

    @Override // java.lang.Comparable
    public int compareTo(YearQuarter yearQuarter) {
        int i = this.year - yearQuarter.year;
        return i == 0 ? this.quarter.compareTo(yearQuarter.quarter) : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearQuarter) {
            YearQuarter yearQuarter = (YearQuarter) obj;
            if (this.year == yearQuarter.year && this.quarter == yearQuarter.quarter) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.year ^ (this.quarter.getValue() << 27);
    }

    @ToString
    public String toString() {
        int iAbs = Math.abs(this.year);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs < 1000) {
            int i = this.year;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            if (this.year > 9999) {
                sb.append('+');
            }
            sb.append(this.year);
        }
        sb.append('-');
        sb.append(this.quarter);
        return sb.toString();
    }
}
