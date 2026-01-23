package p479j$.time.format;

import java.util.Objects;
import p479j$.time.DateTimeException;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.format.x */
/* loaded from: classes29.dex */
public final class C45782x {

    /* renamed from: a */
    public final TemporalAccessor f6889a;

    /* renamed from: b */
    public final DateTimeFormatter f6890b;

    /* renamed from: c */
    public int f6891c;

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C45782x(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.f6804e;
        ZoneId zoneId = dateTimeFormatter.f6805f;
        if (chronology != null || zoneId != null) {
            Chronology chronology2 = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
            ZoneId zoneId2 = (ZoneId) temporalAccessor.query(TemporalQueries.f6924a);
            ChronoLocalDate chronoLocalDateDate = null;
            chronology = Objects.equals(chronology, chronology2) ? null : chronology;
            zoneId = Objects.equals(zoneId, zoneId2) ? null : zoneId;
            if (chronology != null || zoneId != null) {
                Chronology chronology3 = chronology != null ? chronology : chronology2;
                if (zoneId == null) {
                    zoneId2 = zoneId != null ? zoneId : zoneId2;
                    if (chronology != null) {
                        if (temporalAccessor.isSupported(ChronoField.EPOCH_DAY)) {
                            chronoLocalDateDate = chronology3.date(temporalAccessor);
                        } else if (chronology != IsoChronology.INSTANCE || chronology2 != null) {
                            for (ChronoField chronoField : ChronoField.values()) {
                                if (chronoField.isDateBased() && temporalAccessor.isSupported(chronoField)) {
                                    throw new DateTimeException("Unable to apply override chronology '" + chronology + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                                }
                            }
                        }
                    }
                    temporalAccessor = new C45781w(chronoLocalDateDate, temporalAccessor, chronology3, zoneId2);
                } else if (temporalAccessor.isSupported(ChronoField.INSTANT_SECONDS)) {
                    IsoChronology isoChronology = IsoChronology.INSTANCE;
                    if (chronology3 == null) {
                        Objects.requireNonNull(isoChronology, "defaultObj");
                        chronology3 = isoChronology;
                    }
                    temporalAccessor = chronology3.zonedDateTime(Instant.from(temporalAccessor), zoneId);
                } else {
                    if (zoneId.normalized() instanceof ZoneOffset) {
                        ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                        if (temporalAccessor.isSupported(chronoField2) && temporalAccessor.get(chronoField2) != zoneId.getRules().getOffset(Instant.EPOCH).getTotalSeconds()) {
                            throw new DateTimeException("Unable to apply override zone '" + zoneId + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                    if (zoneId != null) {
                    }
                    if (chronology != null) {
                    }
                    temporalAccessor = new C45781w(chronoLocalDateDate, temporalAccessor, chronology3, zoneId2);
                }
            }
        }
        this.f6889a = temporalAccessor;
        this.f6890b = dateTimeFormatter;
    }

    /* renamed from: b */
    public final Object m3591b(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.f6889a;
        Object objQuery = temporalAccessor.query(temporalQuery);
        if (objQuery != null || this.f6891c != 0) {
            return objQuery;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    /* renamed from: a */
    public final Long m3590a(TemporalField temporalField) {
        int i = this.f6891c;
        TemporalAccessor temporalAccessor = this.f6889a;
        if (i <= 0 || temporalAccessor.isSupported(temporalField)) {
            return Long.valueOf(temporalAccessor.getLong(temporalField));
        }
        return null;
    }

    public final String toString() {
        return this.f6889a.toString();
    }
}
