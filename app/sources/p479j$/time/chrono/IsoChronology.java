package p479j$.time.chrono;

import com.robinhood.models.card.p311db.Card;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p479j$.time.AbstractC45723c;
import p479j$.time.Clock;
import p479j$.time.DateTimeException;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.Month;
import p479j$.time.Period;
import p479j$.time.Year;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes29.dex */
public final class IsoChronology extends AbstractChronology implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    private IsoChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getId() {
        return "ISO";
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "iso8601";
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(Era era, int i, int i2, int i3) {
        return LocalDate.m3377of(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return LocalDate.m3377of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(Era era, int i, int i2) {
        return LocalDate.ofYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoPeriod period(int i, int i2, int i3) {
        return Period.m3431a(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return LocalDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(TemporalAccessor temporalAccessor) {
        return LocalDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDateTime localDateTime(TemporalAccessor temporalAccessor) {
        return LocalDateTime.m3390i(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoZonedDateTime zonedDateTime(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.m3456i(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, Card.Icon.CLOCK);
        return LocalDate.from(LocalDate.now(clockSystemDefaultZone));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(ZoneId zoneId) {
        Clock clockSystem = Clock.system(zoneId);
        Objects.requireNonNull(clockSystem, Card.Icon.CLOCK);
        return LocalDate.from(LocalDate.now(clockSystem));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(Clock clock) {
        Objects.requireNonNull(clock, Card.Icon.CLOCK);
        return LocalDate.from(LocalDate.now(clock));
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // p479j$.time.chrono.Chronology
    public final int prolepticYear(Era era, int i) {
        if (era instanceof IsoEra) {
            return era == IsoEra.f6718CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // p479j$.time.chrono.Chronology
    public final Era eraOf(int i) {
        return IsoEra.m3487of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public final List eras() {
        return AbstractC45723c.m3471b(IsoEra.values());
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public final ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (LocalDate) super.resolveDate(map, resolverStyle);
    }

    @Override // p479j$.time.chrono.AbstractChronology
    /* renamed from: l */
    public final void mo3477l(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l.longValue());
            }
            AbstractChronology.m3472c(map, ChronoField.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), r4)) + 1);
            AbstractChronology.m3472c(map, ChronoField.YEAR, Math.floorDiv(l.longValue(), 12));
        }
    }

    @Override // p479j$.time.chrono.AbstractChronology
    /* renamed from: n */
    public final ChronoLocalDate mo3479n(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l.longValue());
            }
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (l2 != null) {
                if (l2.longValue() == 1) {
                    AbstractChronology.m3472c(map, ChronoField.YEAR, l.longValue());
                    return null;
                }
                if (l2.longValue() == 0) {
                    AbstractChronology.m3472c(map, ChronoField.YEAR, Math.subtractExact(1L, l.longValue()));
                    return null;
                }
                throw new DateTimeException("Invalid value for era: " + l2);
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            Long l3 = (Long) map.get(chronoField2);
            if (resolverStyle != ResolverStyle.STRICT) {
                AbstractChronology.m3472c(map, chronoField2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                return null;
            }
            if (l3 != null) {
                long jLongValue = l3.longValue();
                long jLongValue2 = l.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractChronology.m3472c(map, chronoField2, jLongValue2);
                return null;
            }
            map.put(chronoField, l);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        chronoField3.checkValidValue(((Long) map.get(chronoField3)).longValue());
        return null;
    }

    @Override // p479j$.time.chrono.AbstractChronology
    /* renamed from: m */
    public final ChronoLocalDate mo3478m(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = chronoField.checkValidIntValue(((Long) map.remove(chronoField)).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            return LocalDate.m3377of(iCheckValidIntValue, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iCheckValidIntValue2 = chronoField2.checkValidIntValue(((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iCheckValidIntValue3 = chronoField3.checkValidIntValue(((Long) map.remove(chronoField3)).longValue());
        if (resolverStyle == ResolverStyle.SMART) {
            if (iCheckValidIntValue2 == 4 || iCheckValidIntValue2 == 6 || iCheckValidIntValue2 == 9 || iCheckValidIntValue2 == 11) {
                iCheckValidIntValue3 = Math.min(iCheckValidIntValue3, 30);
            } else if (iCheckValidIntValue2 == 2) {
                iCheckValidIntValue3 = Math.min(iCheckValidIntValue3, Month.FEBRUARY.length(Year.isLeap(iCheckValidIntValue)));
            }
        }
        return LocalDate.m3377of(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ValueRange range(ChronoField chronoField) {
        return chronoField.range();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C45750x((byte) 1, this);
    }
}
