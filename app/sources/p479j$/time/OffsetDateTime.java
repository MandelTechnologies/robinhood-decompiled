package p479j$.time;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.models.card.p311db.Card;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.chrono.IsoChronology;
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

/* loaded from: classes29.dex */
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f6685c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a */
    public final LocalDateTime f6686a;

    /* renamed from: b */
    public final ZoneOffset f6687b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f6687b.equals(offsetDateTime2.f6687b)) {
            iCompare = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(toEpochSecond(), offsetDateTime2.toEpochSecond());
            if (iCompare == 0) {
                iCompare = this.f6686a.toLocalTime().f6679d - offsetDateTime2.f6686a.toLocalTime().f6679d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime.MIN.atOffset(ZoneOffset.f6703f);
        LocalDateTime.MAX.atOffset(ZoneOffset.f6702e);
    }

    public static OffsetDateTime now() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, Card.Icon.CLOCK);
        Instant instant = clockSystemDefaultZone.instant();
        return m3425i(instant, clockSystemDefaultZone.getZone().getRules().getOffset(instant));
    }

    public static OffsetDateTime now(ZoneId zoneId) {
        Clock clockSystem = Clock.system(zoneId);
        Objects.requireNonNull(clockSystem, Card.Icon.CLOCK);
        Instant instant = clockSystem.instant();
        return m3425i(instant, clockSystem.getZone().getRules().getOffset(instant));
    }

    /* renamed from: i */
    public static OffsetDateTime m3425i(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, GoldFeature.INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    /* renamed from: c */
    public static OffsetDateTime m3424c(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset zoneOffsetFrom = ZoneOffset.from(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.query(TemporalQueries.localDate());
            LocalTime localTime = (LocalTime) temporalAccessor.query(TemporalQueries.localTime());
            if (localDate != null && localTime != null) {
                return new OffsetDateTime(LocalDateTime.m3393of(localDate, localTime), zoneOffsetFrom);
            }
            return m3425i(Instant.from(temporalAccessor), zoneOffsetFrom);
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.parse(charSequence, new C45754e(4));
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f6686a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f6687b = zoneOffset;
    }

    /* renamed from: k */
    public final OffsetDateTime m3427k(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f6686a == localDateTime && this.f6687b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit != ChronoUnit.FOREVER : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return this.f6686a.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45790l.f6901a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f6687b.getTotalSeconds();
            }
            return this.f6686a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45790l.f6901a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return this.f6687b.getTotalSeconds();
            }
            return this.f6686a.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f6686a;
    }

    public LocalDate toLocalDate() {
        return this.f6686a.mo3394a();
    }

    public int getYear() {
        return this.f6686a.getYear();
    }

    public Month getMonth() {
        return this.f6686a.f6673a.getMonth();
    }

    public int getDayOfMonth() {
        return this.f6686a.f6673a.getDayOfMonth();
    }

    public int getHour() {
        return this.f6686a.getHour();
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        if ((temporalAdjuster instanceof LocalDate) || (temporalAdjuster instanceof LocalTime) || (temporalAdjuster instanceof LocalDateTime)) {
            return m3427k(this.f6686a.with(temporalAdjuster), this.f6687b);
        }
        if (temporalAdjuster instanceof Instant) {
            return m3425i((Instant) temporalAdjuster, this.f6687b);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            return m3427k(this.f6686a, (ZoneOffset) temporalAdjuster);
        }
        if (temporalAdjuster instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAdjuster;
        }
        return (OffsetDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = AbstractC45790l.f6901a[chronoField.ordinal()];
            if (i == 1) {
                return m3425i(Instant.ofEpochSecond(j, this.f6686a.getNano()), this.f6687b);
            }
            if (i == 2) {
                return m3427k(this.f6686a, ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j)));
            }
            return m3427k(this.f6686a.with(temporalField, j), this.f6687b);
        }
        return (OffsetDateTime) temporalField.adjustInto(this, j);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (OffsetDateTime) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m3427k(this.f6686a.plus(j, temporalUnit), this.f6687b);
        }
        return (OffsetDateTime) temporalUnit.addTo(this, j);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (OffsetDateTime) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.f6927d || temporalQuery == TemporalQueries.f6928e) {
            return this.f6687b;
        }
        if (temporalQuery == TemporalQueries.f6924a) {
            return null;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            return toLocalDate();
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return this.f6686a.toLocalTime();
        }
        if (temporalQuery == TemporalQueries.chronology()) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, this.f6686a.toLocalTime().m3417r()).with(ChronoField.OFFSET_SECONDS, this.f6687b.getTotalSeconds());
    }

    @Override // p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTimeM3424c = m3424c(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.f6687b;
            if (!zoneOffset.equals(offsetDateTimeM3424c.f6687b)) {
                offsetDateTimeM3424c = new OffsetDateTime(offsetDateTimeM3424c.f6686a.m3400m(zoneOffset.getTotalSeconds() - offsetDateTimeM3424c.f6687b.getTotalSeconds()), zoneOffset);
            }
            return this.f6686a.until(offsetDateTimeM3424c.f6686a, temporalUnit);
        }
        return temporalUnit.between(this, offsetDateTimeM3424c);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public Instant toInstant() {
        return this.f6686a.toInstant(this.f6687b);
    }

    public long toEpochSecond() {
        return this.f6686a.toEpochSecond(this.f6687b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f6686a.equals(offsetDateTime.f6686a) && this.f6687b.equals(offsetDateTime.f6687b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6686a.hashCode() ^ this.f6687b.hashCode();
    }

    public String toString() {
        return this.f6686a.toString() + this.f6687b.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
