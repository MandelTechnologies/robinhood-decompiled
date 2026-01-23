package p479j$.time.chrono;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.p320db.Instrument;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* renamed from: j$.time.chrono.b */
/* loaded from: classes29.dex */
public abstract class AbstractC45728b implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* renamed from: j */
    public abstract ChronoLocalDate mo3480j(long j);

    /* renamed from: k */
    public abstract ChronoLocalDate mo3481k(long j);

    /* renamed from: l */
    public abstract ChronoLocalDate mo3482l(long j);

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal minus(long j, TemporalUnit temporalUnit) {
        return minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal minus(TemporalAmount temporalAmount) {
        return minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal plus(TemporalAmount temporalAmount) {
        return plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal with(TemporalAdjuster temporalAdjuster) {
        return with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal with(TemporalField temporalField, long j) {
        return with(temporalField, j);
    }

    /* renamed from: c */
    public static ChronoLocalDate m3488c(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.getId() + ", actual: " + chronoLocalDate.getChronology().getId());
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.plus(j, temporalUnit);
        }
        switch (AbstractC45727a.f6720a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo3480j(j);
            case 2:
                return mo3480j(Math.multiplyExact(j, 7));
            case 3:
                return mo3481k(j);
            case 4:
                return mo3482l(j);
            case 5:
                return mo3482l(Math.multiplyExact(j, 10));
            case 6:
                return mo3482l(Math.multiplyExact(j, 100));
            case 7:
                return mo3482l(Math.multiplyExact(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return with((TemporalField) chronoField, Math.addExact(getLong(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateDate = getChronology().date(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, Instrument.TYPE_UNIT);
            return temporalUnit.between(this, chronoLocalDateDate);
        }
        switch (AbstractC45727a.f6720a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateDate.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateDate.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return m3489i(chronoLocalDateDate);
            case 4:
                return m3489i(chronoLocalDateDate) / 12;
            case 5:
                return m3489i(chronoLocalDateDate) / 120;
            case 6:
                return m3489i(chronoLocalDateDate) / 1200;
            case 7:
                return m3489i(chronoLocalDateDate) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return chronoLocalDateDate.getLong(chronoField) - getLong(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: i */
    public final long m3489i(ChronoLocalDate chronoLocalDate) {
        if (getChronology().range(ChronoField.MONTH_OF_YEAR).getMaximum() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j = getLong(chronoField) * 32;
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((chronoLocalDate.getLong(chronoField) * 32) + chronoLocalDate.get(chronoField2)) - (j + get(chronoField2))) / 32;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ getChronology().hashCode();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long j = getLong(ChronoField.YEAR_OF_ERA);
        long j2 = getLong(ChronoField.MONTH_OF_YEAR);
        long j3 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(getEra());
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 < 10 ? "-0" : "-");
        sb.append(j3);
        return sb.toString();
    }
}
