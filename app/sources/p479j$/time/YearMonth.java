package p479j$.time;

import com.squareup.wire.internal.MathMethods;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.format.SignStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
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

/* loaded from: classes29.dex */
public final class YearMonth implements Temporal, TemporalAdjuster, Comparable<YearMonth>, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f6697c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a */
    public final int f6698a;

    /* renamed from: b */
    public final int f6699b;

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.f6698a - yearMonth2.f6698a;
        return i == 0 ? this.f6699b - yearMonth2.f6699b : i;
    }

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    }

    /* renamed from: of */
    public static YearMonth m3437of(int i, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.from(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return m3437of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public YearMonth(int i, int i2) {
        this.f6698a = i;
        this.f6699b = i2;
    }

    /* renamed from: l */
    public final YearMonth m3442l(int i, int i2) {
        return (this.f6698a == i && this.f6699b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit == ChronoUnit.MONTHS || temporalUnit == ChronoUnit.YEARS || temporalUnit == ChronoUnit.DECADES || temporalUnit == ChronoUnit.CENTURIES || temporalUnit == ChronoUnit.MILLENNIA || temporalUnit == ChronoUnit.ERAS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.m3598of(1L, this.f6698a <= 0 ? MathMethods.NANOS_PER_SECOND : 999999999L);
        }
        return super.range(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        int i2 = AbstractC45794p.f6907a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.f6699b;
        } else {
            if (i2 == 2) {
                return m3438c();
            }
            if (i2 == 3) {
                int i3 = this.f6698a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.f6698a < 1 ? 0 : 1;
                }
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
            }
            i = this.f6698a;
        }
        return i;
    }

    /* renamed from: c */
    public final long m3438c() {
        return ((this.f6698a * 12) + this.f6699b) - 1;
    }

    public Month getMonth() {
        return Month.m3422of(this.f6699b);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (YearMonth) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final YearMonth with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.checkValidValue(j);
        int i = AbstractC45794p.f6907a[chronoField.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
            return m3442l(this.f6698a, i2);
        }
        if (i == 2) {
            return m3440j(j - m3438c());
        }
        if (i == 3) {
            if (this.f6698a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            ChronoField.YEAR.checkValidValue(i3);
            return m3442l(i3, this.f6699b);
        }
        if (i == 4) {
            int i4 = (int) j;
            ChronoField.YEAR.checkValidValue(i4);
            return m3442l(i4, this.f6699b);
        }
        if (i != 5) {
            throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
        if (getLong(ChronoField.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.f6698a;
        ChronoField.YEAR.checkValidValue(i5);
        return m3442l(i5, this.f6699b);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (YearMonth) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final YearMonth plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (YearMonth) temporalUnit.addTo(this, j);
        }
        switch (AbstractC45794p.f6908b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m3440j(j);
            case 2:
                return m3441k(j);
            case 3:
                return m3441k(Math.multiplyExact(j, 10));
            case 4:
                return m3441k(Math.multiplyExact(j, 100));
            case 5:
                return m3441k(Math.multiplyExact(j, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return with(chronoField, Math.addExact(getLong(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: k */
    public final YearMonth m3441k(long j) {
        return j == 0 ? this : m3442l(ChronoField.YEAR.checkValidIntValue(this.f6698a + j), this.f6699b);
    }

    /* renamed from: j */
    public final YearMonth m3440j(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.f6698a * 12) + (this.f6699b - 1) + j;
        long j3 = 12;
        return m3442l(ChronoField.YEAR.checkValidIntValue(Math.floorDiv(j2, j3)), ((int) Math.floorMod(j2, j3)) + 1);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (YearMonth) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.MONTHS;
        }
        return super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        if (!Chronology.from(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.with(ChronoField.PROLEPTIC_MONTH, m3438c());
    }

    @Override // p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth yearMonthFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jM3438c = yearMonthFrom.m3438c() - m3438c();
            switch (AbstractC45794p.f6908b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM3438c;
                case 2:
                    return jM3438c / 12;
                case 3:
                    return jM3438c / 120;
                case 4:
                    return jM3438c / 1200;
                case 5:
                    return jM3438c / 12000;
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return yearMonthFrom.getLong(chronoField) - getLong(chronoField);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, yearMonthFrom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.f6698a == yearMonth.f6698a && this.f6699b == yearMonth.f6699b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6698a ^ (this.f6699b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f6698a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.f6698a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.f6698a);
        }
        sb.append(this.f6699b < 10 ? "-0" : "-");
        sb.append(this.f6699b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
