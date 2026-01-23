package p479j$.time.chrono;

import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import com.robinhood.models.p320db.Instrument;
import com.squareup.wire.internal.MathMethods;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.LocalTime;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.d */
/* loaded from: classes29.dex */
public final class C45730d implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a */
    public final transient ChronoLocalDate f6722a;

    /* renamed from: b */
    public final transient LocalTime f6723b;

    /* renamed from: c */
    public static C45730d m3490c(Chronology chronology, Temporal temporal) {
        C45730d c45730d = (C45730d) temporal;
        if (chronology.equals(c45730d.getChronology())) {
            return c45730d;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + c45730d.getChronology().getId());
    }

    public C45730d(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.f6722a = chronoLocalDate;
        this.f6723b = localTime;
    }

    /* renamed from: k */
    public final C45730d m3493k(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.f6722a;
        return (chronoLocalDate == temporal && this.f6723b == localTime) ? this : new C45730d(AbstractC45728b.m3488c(chronoLocalDate.getChronology(), temporal), localTime);
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime
    /* renamed from: a */
    public final ChronoLocalDate mo3394a() {
        return this.f6722a;
    }

    public final int hashCode() {
        return this.f6722a.hashCode() ^ this.f6723b.hashCode();
    }

    public final String toString() {
        return this.f6722a.toString() + "T" + this.f6723b.toString();
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.f6723b;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.m3595i();
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (((ChronoField) temporalField).m3595i() ? this.f6723b : this.f6722a).range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).m3595i() ? this.f6723b.get(temporalField) : this.f6722a.get(temporalField);
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).m3595i() ? this.f6723b.getLong(temporalField) : this.f6722a.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime, p479j$.time.temporal.Temporal
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C45730d with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof ChronoLocalDate) {
            return m3493k((ChronoLocalDate) temporalAdjuster, this.f6723b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return m3493k(this.f6722a, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof C45730d) {
            return m3490c(this.f6722a.getChronology(), (C45730d) temporalAdjuster);
        }
        return m3490c(this.f6722a.getChronology(), (C45730d) temporalAdjuster.adjustInto(this));
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime, p479j$.time.temporal.Temporal
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final C45730d with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).m3595i()) {
                return m3493k(this.f6722a, this.f6723b.with(temporalField, j));
            }
            return m3493k(this.f6722a.with(temporalField, j), this.f6723b);
        }
        return m3490c(this.f6722a.getChronology(), temporalField.adjustInto(this, j));
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime, p479j$.time.temporal.Temporal
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C45730d plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return m3490c(this.f6722a.getChronology(), temporalUnit.addTo(this, j));
        }
        switch (AbstractC45729c.f6721a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m3492j(this.f6722a, 0L, 0L, 0L, j);
            case 2:
                C45730d c45730dM3493k = m3493k(this.f6722a.plus(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.f6723b);
                return c45730dM3493k.m3492j(c45730dM3493k.f6722a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C45730d c45730dM3493k2 = m3493k(this.f6722a.plus(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.f6723b);
                return c45730dM3493k2.m3492j(c45730dM3493k2.f6722a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m3492j(this.f6722a, 0L, 0L, j, 0L);
            case 5:
                return m3492j(this.f6722a, 0L, j, 0L, 0L);
            case 6:
                return m3492j(this.f6722a, j, 0L, 0L, 0L);
            case 7:
                C45730d c45730dM3493k3 = m3493k(this.f6722a.plus(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.f6723b);
                return c45730dM3493k3.m3492j(c45730dM3493k3.f6722a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m3493k(this.f6722a.plus(j, temporalUnit), this.f6723b);
        }
    }

    /* renamed from: j */
    public final C45730d m3492j(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return m3493k(chronoLocalDate, this.f6723b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * MathMethods.NANOS_PER_SECOND) + (j4 % 86400000000000L);
        long jM3417r = this.f6723b.m3417r();
        long j7 = j6 + jM3417r;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return m3493k(chronoLocalDate.plus(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == jM3417r ? this.f6723b : LocalTime.m3407k(jFloorMod));
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime
    /* renamed from: g */
    public final ChronoZonedDateTime mo3396g(ZoneId zoneId) {
        return C45734h.m3499i(zoneId, null, this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime<? extends ChronoLocalDate> chronoLocalDateTimeLocalDateTime = getChronology().localDateTime(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, Instrument.TYPE_UNIT);
            return temporalUnit.between(this, chronoLocalDateTimeLocalDateTime);
        }
        if (!((ChronoUnit) temporalUnit).isTimeBased()) {
            ChronoLocalDate chronoLocalDateMo3394a = chronoLocalDateTimeLocalDateTime.mo3394a();
            if (chronoLocalDateTimeLocalDateTime.toLocalTime().compareTo(this.f6723b) < 0) {
                chronoLocalDateMo3394a = chronoLocalDateMo3394a.minus(1L, (TemporalUnit) ChronoUnit.DAYS);
            }
            return this.f6722a.until(chronoLocalDateMo3394a, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long jMultiplyExact = chronoLocalDateTimeLocalDateTime.getLong(chronoField) - this.f6722a.getLong(chronoField);
        switch (AbstractC45729c.f6721a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC);
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                break;
        }
        return Math.addExact(jMultiplyExact, this.f6723b.until(chronoLocalDateTimeLocalDateTime.toLocalTime(), temporalUnit));
    }

    private Object writeReplace() {
        return new C45750x((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }
}
