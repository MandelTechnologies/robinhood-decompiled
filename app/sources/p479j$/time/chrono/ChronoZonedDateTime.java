package p479j$.time.chrono;

import p479j$.time.Instant;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.chrono.ChronoLocalDate;
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
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    /* renamed from: b */
    ChronoZonedDateTime mo3460b(ZoneId zoneId);

    /* renamed from: d */
    ChronoLocalDateTime mo3461d();

    /* renamed from: f */
    ChronoZonedDateTime mo3462f(ZoneId zoneId);

    ZoneOffset getOffset();

    /* renamed from: h */
    ZoneId mo3463h();

    @Override // p479j$.time.temporal.Temporal
    ChronoZonedDateTime plus(long j, TemporalUnit temporalUnit);

    @Override // p479j$.time.temporal.Temporal
    ChronoZonedDateTime with(TemporalField temporalField, long j);

    @Override // p479j$.time.temporal.TemporalAccessor
    default ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return mo3461d().range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45732f.f6729a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return mo3461d().get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45732f.f6729a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return mo3461d().getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    /* renamed from: a */
    default ChronoLocalDate mo3459a() {
        return mo3461d().mo3394a();
    }

    default LocalTime toLocalTime() {
        return mo3461d().toLocalTime();
    }

    default Chronology getChronology() {
        return mo3459a().getChronology();
    }

    @Override // p479j$.time.temporal.Temporal
    default boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit != ChronoUnit.FOREVER : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoZonedDateTime with(TemporalAdjuster temporalAdjuster) {
        return C45734h.m3498c(getChronology(), super.with(temporalAdjuster));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoZonedDateTime plus(TemporalAmount temporalAmount) {
        return C45734h.m3498c(getChronology(), super.plus(temporalAmount));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoZonedDateTime minus(TemporalAmount temporalAmount) {
        return C45734h.m3498c(getChronology(), super.minus(temporalAmount));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoZonedDateTime minus(long j, TemporalUnit temporalUnit) {
        return C45734h.m3498c(getChronology(), super.minus(j, temporalUnit));
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.f6928e || temporalQuery == TemporalQueries.f6924a) {
            return mo3463h();
        }
        if (temporalQuery == TemporalQueries.f6927d) {
            return getOffset();
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return toLocalTime();
        }
        if (temporalQuery == TemporalQueries.chronology()) {
            return getChronology();
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().f6679d);
    }

    default long toEpochSecond() {
        return ((mo3459a().toEpochDay() * 86400) + toLocalTime().toSecondOfDay()) - getOffset().getTotalSeconds();
    }

    @Override // java.lang.Comparable
    default int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        int iCompare = Long.compare(toEpochSecond(), chronoZonedDateTime.toEpochSecond());
        return (iCompare == 0 && (iCompare = toLocalTime().f6679d - chronoZonedDateTime.toLocalTime().f6679d) == 0 && (iCompare = mo3461d().compareTo(chronoZonedDateTime.mo3461d())) == 0 && (iCompare = mo3463h().getId().compareTo(chronoZonedDateTime.mo3463h().getId())) == 0) ? getChronology().compareTo(chronoZonedDateTime.getChronology()) : iCompare;
    }

    default boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        if (epochSecond >= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().f6679d < chronoZonedDateTime.toLocalTime().f6679d;
        }
        return true;
    }

    default boolean isAfter(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        if (epochSecond <= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().f6679d > chronoZonedDateTime.toLocalTime().f6679d;
        }
        return true;
    }
}
