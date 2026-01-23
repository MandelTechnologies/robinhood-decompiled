package p479j$.time;

import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import com.robinhood.android.remoteconfig.RealRemoteConfigHelper;
import com.robinhood.models.card.p311db.Card;
import com.squareup.wire.internal.MathMethods;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.format.DateTimeFormatter;
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

/* loaded from: classes29.dex */
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a */
    public final long f6668a;

    /* renamed from: b */
    public final int f6669b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant now(Clock clock) {
        Objects.requireNonNull(clock, Card.Icon.CLOCK);
        return clock.instant();
    }

    public static Instant ofEpochSecond(long j) {
        return m3372c(j, 0);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return m3372c(Math.addExact(j, Math.floorDiv(j2, MathMethods.NANOS_PER_SECOND)), (int) Math.floorMod(j2, MathMethods.NANOS_PER_SECOND));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return m3372c(Math.floorDiv(j, j2), ((int) Math.floorMod(j, j2)) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.getLong(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.ISO_INSTANT.parse(charSequence, new C45754e(0));
    }

    /* renamed from: c */
    public static Instant m3372c(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public Instant(long j, int i) {
        this.f6668a = j;
        this.f6669b = i;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? ((ChronoUnit) temporalUnit).isTimeBased() || temporalUnit == ChronoUnit.DAYS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.range(temporalField).checkValidIntValue(temporalField.getFrom(this), temporalField);
        }
        int i = AbstractC45755f.f6777a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.f6669b;
        }
        if (i == 2) {
            return this.f6669b / 1000;
        }
        if (i == 3) {
            return this.f6669b / InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
        }
        if (i == 4) {
            ChronoField.INSTANT_SECONDS.checkValidIntValue(this.f6668a);
        }
        throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        int i2 = AbstractC45755f.f6777a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.f6669b;
        } else if (i2 == 2) {
            i = this.f6669b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.f6668a;
                }
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
            }
            i = this.f6669b / InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.f6668a;
    }

    public int getNano() {
        return this.f6669b;
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (Instant) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.checkValidValue(j);
        int i = AbstractC45755f.f6777a[chronoField.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.f6669b) {
                    return m3372c(this.f6668a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
                if (i3 != this.f6669b) {
                    return m3372c(this.f6668a, i3);
                }
            } else {
                if (i != 4) {
                    throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
                }
                if (j != this.f6668a) {
                    return m3372c(j, this.f6669b);
                }
            }
        } else if (j != this.f6669b) {
            return m3372c(this.f6668a, (int) j);
        }
        return this;
    }

    @Override // p479j$.time.temporal.Temporal
    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Instant plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.addTo(this, j);
        }
        switch (AbstractC45755f.f6778b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return m3373i(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(Math.multiplyExact(j, 60));
            case 6:
                return plusSeconds(Math.multiplyExact(j, OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC));
            case 7:
                return plusSeconds(Math.multiplyExact(j, 43200));
            case 8:
                return plusSeconds(Math.multiplyExact(j, OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    public Instant plusSeconds(long j) {
        return m3373i(j, 0L);
    }

    public Instant plusMillis(long j) {
        return m3373i(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusNanos(long j) {
        return m3373i(0L, j);
    }

    /* renamed from: i */
    public final Instant m3373i(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f6668a, j), j2 / MathMethods.NANOS_PER_SECOND), this.f6669b + (j2 % MathMethods.NANOS_PER_SECOND));
    }

    @Override // p479j$.time.temporal.Temporal
    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public Instant minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public Instant minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            return plusSeconds(Long.MAX_VALUE).plusSeconds(1L);
        }
        return plusSeconds(-j);
    }

    public Instant minusMillis(long j) {
        if (j == Long.MIN_VALUE) {
            return plusMillis(Long.MAX_VALUE).plusMillis(1L);
        }
        return plusMillis(-j);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.f6924a || temporalQuery == TemporalQueries.f6928e || temporalQuery == TemporalQueries.f6927d || temporalQuery == TemporalQueries.localDate() || temporalQuery == TemporalQueries.localTime()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.INSTANT_SECONDS, this.f6668a).with(ChronoField.NANO_OF_SECOND, this.f6669b);
    }

    @Override // p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantFrom);
        }
        switch (AbstractC45755f.f6778b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.f6668a, this.f6668a), MathMethods.NANOS_PER_SECOND), instantFrom.f6669b - this.f6669b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.f6668a, this.f6668a), MathMethods.NANOS_PER_SECOND), instantFrom.f6669b - this.f6669b) / 1000;
            case 3:
                return Math.subtractExact(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return m3375k(instantFrom);
            case 5:
                return m3375k(instantFrom) / 60;
            case 6:
                return m3375k(instantFrom) / 3600;
            case 7:
                return m3375k(instantFrom) / RealRemoteConfigHelper.MIN_FETCH_INTERVAL_IN_SECONDS;
            case 8:
                return m3375k(instantFrom) / 86400;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: k */
    public final long m3375k(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.f6668a, this.f6668a);
        long j = instant.f6669b - this.f6669b;
        return (jSubtractExact <= 0 || j >= 0) ? (jSubtractExact >= 0 || j <= 0) ? jSubtractExact : jSubtractExact + 1 : jSubtractExact - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m3425i(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public long toEpochMilli() {
        long j = this.f6668a;
        return (j >= 0 || this.f6669b <= 0) ? Math.addExact(Math.multiplyExact(j, 1000), this.f6669b / InvestFlowConstants.MAX_ONE_TIME_AMOUNT) : Math.addExact(Math.multiplyExact(j + 1, 1000), (this.f6669b / InvestFlowConstants.MAX_ONE_TIME_AMOUNT) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.f6668a, instant.f6668a);
        return iCompare != 0 ? iCompare : this.f6669b - instant.f6669b;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f6668a == instant.f6668a && this.f6669b == instant.f6669b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f6668a;
        return (this.f6669b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new C45792n((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
