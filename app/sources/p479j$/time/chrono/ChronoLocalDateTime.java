package p479j$.time.chrono;

import java.util.Objects;
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

/* loaded from: classes29.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: a */
    ChronoLocalDate mo3394a();

    /* renamed from: g */
    ChronoZonedDateTime mo3396g(ZoneId zoneId);

    @Override // p479j$.time.temporal.Temporal
    ChronoLocalDateTime plus(long j, TemporalUnit temporalUnit);

    LocalTime toLocalTime();

    @Override // p479j$.time.temporal.Temporal
    ChronoLocalDateTime with(TemporalField temporalField, long j);

    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ default int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    default Chronology getChronology() {
        return mo3394a().getChronology();
    }

    @Override // p479j$.time.temporal.Temporal
    default boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit != ChronoUnit.FOREVER : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDateTime with(TemporalAdjuster temporalAdjuster) {
        return C45730d.m3490c(getChronology(), super.with(temporalAdjuster));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDateTime plus(TemporalAmount temporalAmount) {
        return C45730d.m3490c(getChronology(), super.plus(temporalAmount));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDateTime minus(TemporalAmount temporalAmount) {
        return C45730d.m3490c(getChronology(), super.minus(temporalAmount));
    }

    @Override // p479j$.time.temporal.Temporal
    default ChronoLocalDateTime minus(long j, TemporalUnit temporalUnit) {
        return C45730d.m3490c(getChronology(), super.minus(j, temporalUnit));
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.f6924a || temporalQuery == TemporalQueries.f6928e || temporalQuery == TemporalQueries.f6927d) {
            return null;
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

    @Override // p479j$.time.temporal.TemporalAdjuster
    default Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.EPOCH_DAY, mo3394a().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().m3417r());
    }

    default Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().f6679d);
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((mo3394a().toEpochDay() * 86400) + toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = mo3394a().compareTo(chronoLocalDateTime.mo3394a());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? getChronology().compareTo(chronoLocalDateTime.getChronology()) : iCompareTo;
    }
}
