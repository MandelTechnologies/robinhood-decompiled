package org.threeten.extra;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.joda.convert.ToString;
import p479j$.time.Duration;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.Period;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* loaded from: classes25.dex */
public final class PeriodDuration implements TemporalAmount, Serializable {
    private final Duration duration;
    private final Period period;
    public static final PeriodDuration ZERO = new PeriodDuration(Period.ZERO, Duration.ZERO);
    private static final List<TemporalUnit> SUPPORTED_UNITS = Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS, ChronoUnit.SECONDS, ChronoUnit.NANOS));

    /* renamed from: of */
    public static PeriodDuration m3993of(Period period, Duration duration) {
        Objects.requireNonNull(period, "The period must not be null");
        Objects.requireNonNull(duration, "The duration must not be null");
        return new PeriodDuration(period, duration);
    }

    public static PeriodDuration between(Temporal temporal, Temporal temporal2) {
        LocalDate localDate = (LocalDate) temporal.query(TemporalQueries.localDate());
        LocalDate localDate2 = (LocalDate) temporal2.query(TemporalQueries.localDate());
        Period periodBetween = Period.ZERO;
        if (localDate != null && localDate2 != null) {
            periodBetween = Period.between(localDate, localDate2);
        }
        LocalTime localTime = (LocalTime) temporal.query(TemporalQueries.localTime());
        LocalTime localTime2 = (LocalTime) temporal2.query(TemporalQueries.localTime());
        if (localTime == null) {
            localTime = LocalTime.MIDNIGHT;
        }
        if (localTime2 == null) {
            localTime2 = LocalTime.MIDNIGHT;
        }
        return m3993of(periodBetween, Duration.between(localTime, localTime2));
    }

    private PeriodDuration(Period period, Duration duration) {
        this.period = period;
        this.duration = duration;
    }

    /* renamed from: org.threeten.extra.PeriodDuration$1 */
    static /* synthetic */ class C480281 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.NANOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public long get(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i = C480281.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return this.period.getYears();
            }
            if (i == 2) {
                return this.period.getMonths();
            }
            if (i == 3) {
                return this.period.getDays();
            }
            if (i == 4) {
                return this.duration.getSeconds();
            }
            if (i == 5) {
                return this.duration.getNano();
            }
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public List<TemporalUnit> getUnits() {
        return SUPPORTED_UNITS;
    }

    public PeriodDuration withPeriod(Period period) {
        return m3993of(period, this.duration);
    }

    public PeriodDuration normalizedYears() {
        return withPeriod(this.period.normalized());
    }

    public PeriodDuration normalizedStandardDays() {
        long days = (this.period.getDays() * 86400) + this.duration.getSeconds();
        int intExact = Math.toIntExact(days / 86400);
        long j = days % 86400;
        return (intExact == this.period.getDays() && j == this.duration.getSeconds()) ? this : m3993of(this.period.withDays(intExact), this.duration.withSeconds(j));
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        return temporal.plus(this.period).plus(this.duration);
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public Temporal subtractFrom(Temporal temporal) {
        return temporal.minus(this.period).minus(this.duration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PeriodDuration) {
            PeriodDuration periodDuration = (PeriodDuration) obj;
            if (this.period.equals(periodDuration.period) && this.duration.equals(periodDuration.duration)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.period.hashCode() ^ this.duration.hashCode();
    }

    @ToString
    public String toString() {
        if (this.period.isZero()) {
            return this.duration.toString();
        }
        if (this.duration.isZero()) {
            return this.period.toString();
        }
        return this.period.toString() + this.duration.toString().substring(1);
    }
}
