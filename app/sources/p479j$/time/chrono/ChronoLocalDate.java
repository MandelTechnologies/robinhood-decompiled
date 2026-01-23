package p479j$.time.chrono;

import p479j$.time.AbstractC45722b;
import p479j$.time.LocalTime;
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

/* loaded from: classes29.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    Chronology getChronology();

    int hashCode();

    int lengthOfMonth();

    String toString();

    @Override // p479j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    ChronoPeriod until(ChronoLocalDate chronoLocalDate);

    default ChronoLocalDateTime<?> atTime(LocalTime localTime) {
        return new C45730d(this, localTime);
    }

    default Era getEra() {
        return getChronology().eraOf(get(ChronoField.ERA));
    }

    default boolean isLeapYear() {
        return getChronology().isLeapYear(getLong(ChronoField.YEAR));
    }

    default int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    default boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return ((ChronoUnit) temporalUnit).isDateBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return AbstractC45728b.m3488c(getChronology(), super.with(temporalAdjuster));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDate with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
        return AbstractC45728b.m3488c(getChronology(), temporalField.adjustInto(this, j));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return AbstractC45728b.m3488c(getChronology(), super.plus(temporalAmount));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
        return AbstractC45728b.m3488c(getChronology(), temporalUnit.addTo(this, j));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDate minus(TemporalAmount temporalAmount) {
        return AbstractC45728b.m3488c(getChronology(), super.minus(temporalAmount));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDate minus(long j, TemporalUnit temporalUnit) {
        return AbstractC45728b.m3488c(getChronology(), super.minus(j, temporalUnit));
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.f6924a || temporalQuery == TemporalQueries.f6928e || temporalQuery == TemporalQueries.f6927d || temporalQuery == TemporalQueries.localTime()) {
            return null;
        }
        if (temporalQuery == TemporalQueries.chronology()) {
            return (R) getChronology();
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) ChronoUnit.DAYS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    default Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.EPOCH_DAY, toEpochDay());
    }

    default long toEpochDay() {
        return getLong(ChronoField.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        return iCompare == 0 ? getChronology().compareTo(chronoLocalDate.getChronology()) : iCompare;
    }

    default boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }
}
