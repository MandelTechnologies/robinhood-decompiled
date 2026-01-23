package p479j$.time.chrono;

import com.robinhood.models.p320db.Instrument;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.zone.C45809b;
import p479j$.time.zone.ZoneRules;

/* renamed from: j$.time.chrono.h */
/* loaded from: classes29.dex */
public final class C45734h implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a */
    public final transient C45730d f6731a;

    /* renamed from: b */
    public final transient ZoneOffset f6732b;

    /* renamed from: c */
    public final transient ZoneId f6733c;

    /* renamed from: i */
    public static C45734h m3499i(ZoneId zoneId, ZoneOffset zoneOffset, C45730d c45730d) {
        Objects.requireNonNull(c45730d, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new C45734h(zoneId, (ZoneOffset) zoneId, c45730d);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeM3390i = LocalDateTime.m3390i(c45730d);
        List listM3623e = rules.m3623e(localDateTimeM3390i);
        if (listM3623e.size() == 1) {
            zoneOffset = (ZoneOffset) listM3623e.get(0);
        } else if (listM3623e.size() != 0) {
            if (zoneOffset == null || !listM3623e.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listM3623e.get(0);
            }
            c45730d = c45730d;
        } else {
            Object objM3622d = rules.m3622d(localDateTimeM3390i);
            C45809b c45809b = objM3622d instanceof C45809b ? (C45809b) objM3622d : null;
            c45730d = c45730d.m3492j(c45730d.f6722a, 0L, 0L, Duration.ofSeconds(c45809b.f6985d.getTotalSeconds() - c45809b.f6984c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = c45809b.f6985d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new C45734h(zoneId, zoneOffset, c45730d);
    }

    /* renamed from: j */
    public static C45734h m3500j(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new C45734h(zoneId, offset, (C45730d) chronology.localDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset)));
    }

    /* renamed from: c */
    public static C45734h m3498c(Chronology chronology, Temporal temporal) {
        C45734h c45734h = (C45734h) temporal;
        if (chronology.equals(c45734h.getChronology())) {
            return c45734h;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + c45734h.getChronology().getId());
    }

    public C45734h(ZoneId zoneId, ZoneOffset zoneOffset, C45730d c45730d) {
        Objects.requireNonNull(c45730d, "dateTime");
        this.f6731a = c45730d;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f6732b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f6733c = zoneId;
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.f6732b;
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: d */
    public final ChronoLocalDateTime mo3461d() {
        return this.f6731a;
    }

    public final int hashCode() {
        return (this.f6731a.hashCode() ^ this.f6732b.hashCode()) ^ Integer.rotateLeft(this.f6733c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f6731a.toString() + this.f6732b.toString();
        ZoneOffset zoneOffset = this.f6732b;
        ZoneId zoneId = this.f6733c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: h */
    public final ZoneId mo3463h() {
        return this.f6733c;
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: f */
    public final ChronoZonedDateTime mo3462f(ZoneId zoneId) {
        return m3499i(zoneId, this.f6732b, this.f6731a);
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime
    /* renamed from: b */
    public final ChronoZonedDateTime mo3460b(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f6733c.equals(zoneId)) {
            return this;
        }
        return m3500j(getChronology(), this.f6731a.toInstant(this.f6732b), zoneId);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime, p479j$.time.temporal.Temporal
    public final ChronoZonedDateTime with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = AbstractC45733g.f6730a[chronoField.ordinal()];
            if (i == 1) {
                return plus(j - toEpochSecond(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            if (i == 2) {
                return m3500j(getChronology(), this.f6731a.toInstant(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))), this.f6733c);
            }
            return m3499i(this.f6733c, this.f6732b, this.f6731a.with(temporalField, j));
        }
        return m3498c(getChronology(), temporalField.adjustInto(this, j));
    }

    @Override // p479j$.time.chrono.ChronoZonedDateTime, p479j$.time.temporal.Temporal
    public final ChronoZonedDateTime plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return with((TemporalAdjuster) this.f6731a.plus(j, temporalUnit));
        }
        return m3498c(getChronology(), temporalUnit.addTo(this, j));
    }

    @Override // p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime<? extends ChronoLocalDate> chronoZonedDateTimeZonedDateTime = getChronology().zonedDateTime(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f6731a.until(chronoZonedDateTimeZonedDateTime.mo3460b(this.f6732b).mo3461d(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, Instrument.TYPE_UNIT);
        return temporalUnit.between(this, chronoZonedDateTimeZonedDateTime);
    }

    private Object writeReplace() {
        return new C45750x((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime<?>) obj) == 0;
    }
}
