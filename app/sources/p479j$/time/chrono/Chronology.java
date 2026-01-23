package p479j$.time.chrono;

import com.robinhood.models.card.p311db.Card;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import p479j$.time.Clock;
import p479j$.time.DateTimeException;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes29.dex */
public interface Chronology extends Comparable<Chronology> {
    ChronoLocalDate date(int i, int i2, int i3);

    ChronoLocalDate date(TemporalAccessor temporalAccessor);

    ChronoLocalDate dateEpochDay(long j);

    ChronoLocalDate dateYearDay(int i, int i2);

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);

    boolean equals(Object obj);

    Era eraOf(int i);

    List<Era> eras();

    String getCalendarType();

    String getId();

    int hashCode();

    boolean isLeapYear(long j);

    int prolepticYear(Era era, int i);

    ValueRange range(ChronoField chronoField);

    ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle);

    String toString();

    static Chronology from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(isoChronology, "defaultObj");
        return isoChronology;
    }

    static Chronology ofLocale(Locale locale) {
        return AbstractChronology.ofLocale(locale);
    }

    /* renamed from: of */
    static Chronology m3486of(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractChronology.f6712a;
        Objects.requireNonNull(str, "id");
        do {
            Chronology chronology = (Chronology) AbstractChronology.f6712a.get(str);
            if (chronology == null) {
                chronology = (Chronology) AbstractChronology.f6713b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (AbstractChronology.m3473i());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (str.equals(chronology2.getId()) || str.equals(chronology2.getCalendarType())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown chronology: ".concat(str));
    }

    default ChronoLocalDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    default ChronoLocalDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    default ChronoLocalDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    default ChronoLocalDate dateNow(ZoneId zoneId) {
        return dateNow(Clock.system(zoneId));
    }

    default ChronoLocalDate dateNow(Clock clock) {
        Objects.requireNonNull(clock, Card.Icon.CLOCK);
        return date(LocalDate.now(clock));
    }

    default ChronoLocalDateTime<? extends ChronoLocalDate> localDateTime(TemporalAccessor temporalAccessor) {
        try {
            return date(temporalAccessor).atTime(LocalTime.m3406i(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime, j$.time.chrono.ChronoZonedDateTime<? extends j$.time.chrono.ChronoLocalDate>] */
    default ChronoZonedDateTime<? extends ChronoLocalDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdM3444c = ZoneId.m3444c(temporalAccessor);
            try {
                temporalAccessor = zonedDateTime(Instant.from(temporalAccessor), zoneIdM3444c);
                return temporalAccessor;
            } catch (DateTimeException unused) {
                return C45734h.m3499i(zoneIdM3444c, null, C45730d.m3490c(this, localDateTime(temporalAccessor)));
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    default ChronoZonedDateTime<? extends ChronoLocalDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return C45734h.m3500j(this, instant, zoneId);
    }

    default ChronoPeriod period(int i, int i2, int i3) {
        return new C45731e(this, i, i2, i3);
    }
}
