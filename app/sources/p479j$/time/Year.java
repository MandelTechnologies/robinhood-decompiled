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
public final class Year implements Temporal, TemporalAdjuster, Comparable<Year>, Serializable {

    /* renamed from: b */
    public static final /* synthetic */ int f6695b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a */
    public final int f6696a;

    @Override // java.lang.Comparable
    public final int compareTo(Year year) {
        return this.f6696a - year.f6696a;
    }

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    }

    public static Year now() {
        return now(Clock.systemDefaultZone());
    }

    public static Year now(Clock clock) {
        return m3433of(LocalDate.now(clock).getYear());
    }

    /* renamed from: of */
    public static Year m3433of(int i) {
        ChronoField.YEAR.checkValidValue(i);
        return new Year(i);
    }

    public static Year from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Year) {
            return (Year) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.from(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return m3433of(temporalAccessor.get(ChronoField.YEAR));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static boolean isLeap(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    public Year(int i) {
        this.f6696a = i;
    }

    public int getValue() {
        return this.f6696a;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit == ChronoUnit.YEARS || temporalUnit == ChronoUnit.DECADES || temporalUnit == ChronoUnit.CENTURIES || temporalUnit == ChronoUnit.MILLENNIA || temporalUnit == ChronoUnit.ERAS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.m3598of(1L, this.f6696a <= 0 ? MathMethods.NANOS_PER_SECOND : 999999999L);
        }
        return super.range(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        int i = AbstractC45793o.f6905a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            int i2 = this.f6696a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.f6696a;
        }
        if (i == 3) {
            return this.f6696a < 1 ? 0 : 1;
        }
        throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (Year) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Year with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (Year) temporalField.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.checkValidValue(j);
        int i = AbstractC45793o.f6905a[chronoField.ordinal()];
        if (i == 1) {
            if (this.f6696a < 1) {
                j = 1 - j;
            }
            return m3433of((int) j);
        }
        if (i == 2) {
            return m3433of((int) j);
        }
        if (i == 3) {
            return getLong(ChronoField.ERA) == j ? this : m3433of(1 - this.f6696a);
        }
        throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (Year) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Year plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Year) temporalUnit.addTo(this, j);
        }
        int i = AbstractC45793o.f6906b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return m3435i(j);
        }
        if (i == 2) {
            return m3435i(Math.multiplyExact(j, 10));
        }
        if (i == 3) {
            return m3435i(Math.multiplyExact(j, 100));
        }
        if (i == 4) {
            return m3435i(Math.multiplyExact(j, 1000));
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return with(chronoField, Math.addExact(getLong(chronoField), j));
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
    }

    /* renamed from: i */
    public final Year m3435i(long j) {
        return j == 0 ? this : m3433of(ChronoField.YEAR.checkValidIntValue(this.f6696a + j));
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (Year) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public Year minusYears(long j) {
        return j == Long.MIN_VALUE ? m3435i(Long.MAX_VALUE).m3435i(1L) : m3435i(-j);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.YEARS;
        }
        return super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        if (!Chronology.from(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.with(ChronoField.YEAR, this.f6696a);
    }

    @Override // p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Year yearFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long j = yearFrom.f6696a - this.f6696a;
            int i = AbstractC45793o.f6906b[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return j;
            }
            if (i == 2) {
                return j / 10;
            }
            if (i == 3) {
                return j / 100;
            }
            if (i == 4) {
                return j / 1000;
            }
            if (i == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return yearFrom.getLong(chronoField) - getLong(chronoField);
            }
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, yearFrom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Year) && this.f6696a == ((Year) obj).f6696a;
    }

    public int hashCode() {
        return this.f6696a;
    }

    public String toString() {
        return Integer.toString(this.f6696a);
    }

    private Object writeReplace() {
        return new C45792n((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
