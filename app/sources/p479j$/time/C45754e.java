package p479j$.time;

import p479j$.time.chrono.Chronology;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.e */
/* loaded from: classes29.dex */
public final /* synthetic */ class C45754e implements TemporalQuery, TemporalAdjuster {

    /* renamed from: a */
    public final /* synthetic */ int f6776a;

    public /* synthetic */ C45754e(int i) {
        this.f6776a = i;
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.with(chronoField, temporal.range(chronoField).getMaximum());
    }

    @Override // p479j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = this.f6776a;
        C45754e c45754e = TemporalQueries.f6924a;
        switch (i) {
            case 0:
                return Instant.from(temporalAccessor);
            case 1:
                return LocalDate.from(temporalAccessor);
            case 2:
                return LocalDateTime.m3390i(temporalAccessor);
            case 3:
                return LocalTime.m3406i(temporalAccessor);
            case 4:
                return OffsetDateTime.m3424c(temporalAccessor);
            case 5:
                return ZonedDateTime.m3456i(temporalAccessor);
            case 6:
                C45754e c45754e2 = DateTimeFormatterBuilder.f6806h;
                ZoneId zoneId = (ZoneId) temporalAccessor.query(c45754e);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 7:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.isSupported(chronoField)) {
                    return LocalTime.m3407k(temporalAccessor.getLong(chronoField));
                }
                return null;
            case 8:
                return (ZoneId) temporalAccessor.query(c45754e);
            case 9:
                return (Chronology) temporalAccessor.query(TemporalQueries.f6925b);
            case 10:
                return (TemporalUnit) temporalAccessor.query(TemporalQueries.f6926c);
            case 11:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.isSupported(chronoField2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.get(chronoField2));
                }
                return null;
            case 12:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.query(c45754e);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.query(TemporalQueries.f6927d);
            case 13:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.isSupported(chronoField3)) {
                    return LocalDate.ofEpochDay(temporalAccessor.getLong(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f6776a) {
            case 8:
                return "ZoneId";
            case 9:
                return "Chronology";
            case 10:
                return "Precision";
            case 11:
                return "ZoneOffset";
            case 12:
                return "Zone";
            case 13:
                return "LocalDate";
            case 14:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
