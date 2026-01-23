package p479j$.time.format;

import p479j$.time.ZoneId;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.Chronology;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.format.w */
/* loaded from: classes29.dex */
public final class C45781w implements TemporalAccessor {

    /* renamed from: a */
    public final /* synthetic */ ChronoLocalDate f6885a;

    /* renamed from: b */
    public final /* synthetic */ TemporalAccessor f6886b;

    /* renamed from: c */
    public final /* synthetic */ Chronology f6887c;

    /* renamed from: d */
    public final /* synthetic */ ZoneId f6888d;

    public C45781w(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f6885a = chronoLocalDate;
        this.f6886b = temporalAccessor;
        this.f6887c = chronology;
        this.f6888d = zoneId;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f6885a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.isSupported(temporalField);
        }
        return this.f6886b.isSupported(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f6885a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.range(temporalField);
        }
        return this.f6886b.range(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f6885a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.getLong(temporalField);
        }
        return this.f6886b.getLong(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return this.f6887c;
        }
        if (temporalQuery == TemporalQueries.f6924a) {
            return this.f6888d;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return this.f6886b.query(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        Chronology chronology = this.f6887c;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f6888d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f6886b + str + str2;
    }
}
