package p479j$.time;

import com.squareup.wire.internal.MathMethods;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes29.dex */
public final class OffsetTime implements Temporal, TemporalAdjuster, Comparable<OffsetTime>, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f6688c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a */
    public final LocalTime f6689a;

    /* renamed from: b */
    public final ZoneOffset f6690b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetTime offsetTime) {
        OffsetTime offsetTime2 = offsetTime;
        if (this.f6690b.equals(offsetTime2.f6690b)) {
            return this.f6689a.compareTo(offsetTime2.f6689a);
        }
        int iCompare = Long.compare(m3429i(), offsetTime2.m3429i());
        return iCompare == 0 ? this.f6689a.compareTo(offsetTime2.f6689a) : iCompare;
    }

    static {
        LocalTime.MIN.atOffset(ZoneOffset.f6703f);
        LocalTime.MAX.atOffset(ZoneOffset.f6702e);
    }

    @Override // p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetTime offsetTime;
        if (temporal instanceof OffsetTime) {
            offsetTime = (OffsetTime) temporal;
        } else {
            try {
                offsetTime = new OffsetTime(LocalTime.m3406i(temporal), ZoneOffset.from(temporal));
            } catch (DateTimeException e) {
                throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jM3429i = offsetTime.m3429i() - m3429i();
            switch (AbstractC45791m.f6902a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM3429i;
                case 2:
                    return jM3429i / 1000;
                case 3:
                    return jM3429i / 1000000;
                case 4:
                    return jM3429i / MathMethods.NANOS_PER_SECOND;
                case 5:
                    return jM3429i / 60000000000L;
                case 6:
                    return jM3429i / 3600000000000L;
                case 7:
                    return jM3429i / 43200000000000L;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, offsetTime);
    }

    public OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.f6689a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f6690b = zoneOffset;
    }

    /* renamed from: j */
    public final OffsetTime m3430j(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f6689a == localTime && this.f6690b.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).m3595i() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return ((ChronoUnit) temporalUnit).isTimeBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return this.f6689a.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.f6690b.getTotalSeconds();
            }
            return this.f6689a.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalTime) {
            return m3430j((LocalTime) temporalAdjuster, this.f6690b);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            return m3430j(this.f6689a, (ZoneOffset) temporalAdjuster);
        }
        if (temporalAdjuster instanceof OffsetTime) {
            return (OffsetTime) temporalAdjuster;
        }
        return (OffsetTime) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return m3430j(this.f6689a, ZoneOffset.ofTotalSeconds(((ChronoField) temporalField).checkValidIntValue(j)));
            }
            return m3430j(this.f6689a.with(temporalField, j), this.f6690b);
        }
        return (OffsetTime) temporalField.adjustInto(this, j);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (OffsetTime) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final OffsetTime plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m3430j(this.f6689a.plus(j, temporalUnit), this.f6690b);
        }
        return (OffsetTime) temporalUnit.addTo(this, j);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (OffsetTime) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.f6927d || temporalQuery == TemporalQueries.f6928e) {
            return this.f6690b;
        }
        if (((temporalQuery == TemporalQueries.f6924a) || (temporalQuery == TemporalQueries.chronology())) || temporalQuery == TemporalQueries.localDate()) {
            return null;
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return this.f6689a;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.NANO_OF_DAY, this.f6689a.m3417r()).with(ChronoField.OFFSET_SECONDS, this.f6690b.getTotalSeconds());
    }

    /* renamed from: i */
    public final long m3429i() {
        return this.f6689a.m3417r() - (this.f6690b.getTotalSeconds() * MathMethods.NANOS_PER_SECOND);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetTime) {
            OffsetTime offsetTime = (OffsetTime) obj;
            if (this.f6689a.equals(offsetTime.f6689a) && this.f6690b.equals(offsetTime.f6690b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6689a.hashCode() ^ this.f6690b.hashCode();
    }

    public final String toString() {
        return this.f6689a.toString() + this.f6690b.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
