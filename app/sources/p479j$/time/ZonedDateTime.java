package p479j$.time;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.models.card.p311db.Card;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p479j$.time.chrono.ChronoZonedDateTime;
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
import p479j$.time.temporal.ValueRange;
import p479j$.time.zone.C45809b;
import p479j$.time.zone.ZoneRules;

/* loaded from: classes29.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a */
    public final LocalDateTime f6706a;

    /* renamed from: b */
    public final ZoneOffset f6707b;

    /* renamed from: c */
    public final ZoneId f6708c;

    public static ZonedDateTime now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static ZonedDateTime now(Clock clock) {
        Objects.requireNonNull(clock, Card.Icon.CLOCK);
        return ofInstant(clock.instant(), clock.getZone());
    }

    /* renamed from: of */
    public static ZonedDateTime m3458of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return m3457j(LocalDateTime.m3393of(localDate, localTime), zoneId, null);
    }

    /* renamed from: j */
    public static ZonedDateTime m3457j(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listM3623e = rules.m3623e(localDateTime);
        if (listM3623e.size() == 1) {
            zoneOffset = (ZoneOffset) listM3623e.get(0);
        } else if (listM3623e.size() != 0) {
            if (zoneOffset == null || !listM3623e.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listM3623e.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objM3622d = rules.m3622d(localDateTime);
            C45809b c45809b = objM3622d instanceof C45809b ? (C45809b) objM3622d : null;
            localDateTime = localDateTime.m3400m(Duration.ofSeconds(c45809b.f6985d.getTotalSeconds() - c45809b.f6984c.getTotalSeconds()).getSeconds());
            zoneOffset = c45809b.f6985d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, GoldFeature.INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        return m3455c(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    /* renamed from: c */
    public static ZonedDateTime m3455c(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.ofEpochSecond(j, i, offset), zoneId, offset);
    }

    /* renamed from: i */
    public static ZonedDateTime m3456i(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdM3444c = ZoneId.m3444c(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (temporalAccessor.isSupported(chronoField)) {
                return m3455c(temporalAccessor.getLong(chronoField), temporalAccessor.get(ChronoField.NANO_OF_SECOND), zoneIdM3444c);
            }
            return m3458of(LocalDate.from(temporalAccessor), LocalTime.m3406i(temporalAccessor), zoneIdM3444c);
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static ZonedDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f6799i;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.parse(charSequence, new C45754e(5));
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f6706a = localDateTime;
        this.f6707b = zoneOffset;
        this.f6708c = zoneId;
    }

    /* renamed from: m */
    public final ZonedDateTime m3466m(LocalDateTime localDateTime) {
        return m3457j(localDateTime, this.f6708c, this.f6707b);
    }

    /* renamed from: l */
    public final ZonedDateTime m3465l(LocalDateTime localDateTime) {
        ZoneOffset zoneOffset = this.f6707b;
        ZoneId zoneId = this.f6708c;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().m3623e(localDateTime).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        return m3455c(localDateTime.toEpochSecond(zoneOffset), localDateTime.getNano(), zoneId);
    }

    /* renamed from: n */
    public final ZonedDateTime m3467n(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f6707b) || !this.f6708c.getRules().m3623e(this.f6706a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f6706a, this.f6708c, zoneOffset);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return this.f6706a.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45796r.f6912a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.f6706a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45796r.f6912a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return this.f6706a.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    public ZoneOffset getOffset() {
        return this.f6707b;
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: h */
    public final ZoneId mo3463h() {
        return this.f6708c;
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: f */
    public final ChronoZonedDateTime mo3462f(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f6708c.equals(zoneId) ? this : m3457j(this.f6706a, zoneId, this.f6707b);
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime mo3460b(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f6708c.equals(zoneId) ? this : m3455c(this.f6706a.toEpochSecond(this.f6707b), this.f6706a.getNano(), zoneId);
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime mo3461d() {
        return this.f6706a;
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate mo3459a() {
        return this.f6706a.mo3394a();
    }

    public int getYear() {
        return this.f6706a.getYear();
    }

    public Month getMonth() {
        return this.f6706a.f6673a.getMonth();
    }

    public int getDayOfMonth() {
        return this.f6706a.f6673a.getDayOfMonth();
    }

    public int getDayOfYear() {
        return this.f6706a.getDayOfYear();
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    public LocalTime toLocalTime() {
        return this.f6706a.toLocalTime();
    }

    public int getMinute() {
        return this.f6706a.getMinute();
    }

    @Override // p479j$.time.temporal.Temporal
    public ZonedDateTime with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return m3466m(LocalDateTime.m3393of((LocalDate) temporalAdjuster, this.f6706a.toLocalTime()));
        }
        if (temporalAdjuster instanceof LocalTime) {
            return m3466m(LocalDateTime.m3393of(this.f6706a.mo3394a(), (LocalTime) temporalAdjuster));
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return m3466m((LocalDateTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) temporalAdjuster;
            return m3457j(offsetDateTime.toLocalDateTime(), this.f6708c, offsetDateTime.f6687b);
        }
        if (temporalAdjuster instanceof Instant) {
            Instant instant = (Instant) temporalAdjuster;
            return m3455c(instant.getEpochSecond(), instant.getNano(), this.f6708c);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            return m3467n((ZoneOffset) temporalAdjuster);
        }
        return (ZonedDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = AbstractC45796r.f6912a[chronoField.ordinal()];
            if (i == 1) {
                return m3455c(j, this.f6706a.getNano(), this.f6708c);
            }
            if (i == 2) {
                return m3467n(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j)));
            }
            return m3466m(this.f6706a.with(temporalField, j));
        }
        return (ZonedDateTime) temporalField.adjustInto(this, j);
    }

    public ZonedDateTime withDayOfMonth(int i) {
        LocalDateTime localDateTime = this.f6706a;
        LocalDate localDateM3377of = localDateTime.f6673a;
        if (localDateM3377of.f6672c != i) {
            localDateM3377of = LocalDate.m3377of(localDateM3377of.f6670a, localDateM3377of.f6671b, i);
        }
        return m3457j(localDateTime.m3402o(localDateM3377of, localDateTime.f6674b), this.f6708c, this.f6707b);
    }

    public ZonedDateTime withHour(int i) {
        return m3466m(this.f6706a.withHour(i));
    }

    public ZonedDateTime withMinute(int i) {
        return m3466m(this.f6706a.withMinute(i));
    }

    public ZonedDateTime withSecond(int i) {
        return m3466m(this.f6706a.withSecond(i));
    }

    public ZonedDateTime withNano(int i) {
        return m3466m(this.f6706a.withNano(i));
    }

    public ZonedDateTime truncatedTo(TemporalUnit temporalUnit) {
        return m3466m(this.f6706a.truncatedTo(temporalUnit));
    }

    @Override // p479j$.time.temporal.Temporal
    public final ChronoZonedDateTime plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m3466m(this.f6706a.plus((Period) temporalAmount));
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (ZonedDateTime) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m3466m(this.f6706a.plus((Period) temporalAmount));
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (ZonedDateTime) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            if (((ChronoUnit) temporalUnit).isDateBased()) {
                return m3466m(this.f6706a.plus(j, temporalUnit));
            }
            return m3465l(this.f6706a.plus(j, temporalUnit));
        }
        return (ZonedDateTime) temporalUnit.addTo(this, j);
    }

    public ZonedDateTime plusYears(long j) {
        LocalDateTime localDateTime = this.f6706a;
        return m3457j(localDateTime.m3402o(localDateTime.f6673a.plusYears(j), localDateTime.f6674b), this.f6708c, this.f6707b);
    }

    public ZonedDateTime plusDays(long j) {
        return m3466m(this.f6706a.plusDays(j));
    }

    public ZonedDateTime plusHours(long j) {
        return m3465l(this.f6706a.plusHours(j));
    }

    public ZonedDateTime minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            ZonedDateTime zonedDateTimeM3465l = m3465l(this.f6706a.m3400m(Long.MAX_VALUE));
            return zonedDateTimeM3465l.m3465l(zonedDateTimeM3465l.f6706a.m3400m(1L));
        }
        return m3465l(this.f6706a.m3400m(-j));
    }

    @Override // p479j$.time.temporal.Temporal
    public final ChronoZonedDateTime minus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m3466m(this.f6706a.minus((Period) temporalAmount));
        }
        Objects.requireNonNull(temporalAmount, "amountToSubtract");
        return (ZonedDateTime) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m3466m(this.f6706a.minus((Period) temporalAmount));
        }
        Objects.requireNonNull(temporalAmount, "amountToSubtract");
        return (ZonedDateTime) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final ChronoZonedDateTime minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.localDate()) {
            return mo3459a();
        }
        return super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeM3456i = m3456i(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeMo3460b = zonedDateTimeM3456i.mo3460b(this.f6708c);
            if (((ChronoUnit) temporalUnit).isDateBased()) {
                return this.f6706a.until(zonedDateTimeMo3460b.f6706a, temporalUnit);
            }
            return new OffsetDateTime(this.f6706a, this.f6707b).until(new OffsetDateTime(zonedDateTimeMo3460b.f6706a, zonedDateTimeMo3460b.f6707b), temporalUnit);
        }
        return temporalUnit.between(this, zonedDateTimeM3456i);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f6706a.equals(zonedDateTime.f6706a) && this.f6707b.equals(zonedDateTime.f6707b) && this.f6708c.equals(zonedDateTime.f6708c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f6706a.hashCode() ^ this.f6707b.hashCode()) ^ Integer.rotateLeft(this.f6708c.hashCode(), 3);
    }

    public String toString() {
        String str = this.f6706a.toString() + this.f6707b.toString();
        ZoneOffset zoneOffset = this.f6707b;
        ZoneId zoneId = this.f6708c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new C45792n((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
