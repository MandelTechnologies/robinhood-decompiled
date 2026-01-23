package p479j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
import p479j$.time.AbstractC45722b;
import p479j$.time.LocalDate;
import p479j$.time.Period;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.v */
/* loaded from: classes29.dex */
public final class C45748v extends AbstractC45728b {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a */
    public final transient LocalDate f6769a;

    public C45748v(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f6769a = localDate;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return C45746t.f6767d;
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C45746t.f6767d.getClass();
        return this.f6769a.hashCode() ^ (-1990173233);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Era getEra() {
        return m3524m() >= 1 ? EnumC45749w.ROC : EnumC45749w.BEFORE_ROC;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return this.f6769a.lengthOfMonth();
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.rangeRefinedBy(this);
        }
        if (!isSupported(temporalField)) {
            throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = AbstractC45747u.f6768a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f6769a.range(temporalField);
        }
        if (i != 4) {
            return C45746t.f6767d.range(chronoField);
        }
        ValueRange valueRangeRange = ChronoField.YEAR.range();
        return ValueRange.m3598of(1L, m3524m() <= 0 ? (-valueRangeRange.f6931a) + 1912 : valueRangeRange.getMaximum() - 1911);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45747u.f6768a[((ChronoField) temporalField).ordinal()];
            if (i == 4) {
                int iM3524m = m3524m();
                if (iM3524m < 1) {
                    iM3524m = 1 - iM3524m;
                }
                return iM3524m;
            }
            if (i == 5) {
                return ((m3524m() * 12) + this.f6769a.getMonthValue()) - 1;
            }
            if (i == 6) {
                return m3524m();
            }
            if (i != 7) {
                return this.f6769a.getLong(temporalField);
            }
            return m3524m() < 1 ? 0 : 1;
        }
        return temporalField.getFrom(this);
    }

    /* renamed from: m */
    public final int m3524m() {
        return this.f6769a.getYear() - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C45748v with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (getLong(chronoField) == j) {
                return this;
            }
            int[] iArr = AbstractC45747u.f6768a;
            int i = iArr[chronoField.ordinal()];
            if (i == 4) {
                int iCheckValidIntValue = C45746t.f6767d.range(chronoField).checkValidIntValue(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 4) {
                    return m3525n(this.f6769a.m3389s(m3524m() >= 1 ? iCheckValidIntValue + 1911 : 1912 - iCheckValidIntValue));
                }
                if (i2 == 6) {
                    return m3525n(this.f6769a.m3389s(iCheckValidIntValue + 1911));
                }
                if (i2 == 7) {
                    return m3525n(this.f6769a.m3389s(1912 - m3524m()));
                }
            } else {
                if (i == 5) {
                    C45746t.f6767d.range(chronoField).checkValidValue(j, chronoField);
                    return m3525n(this.f6769a.plusMonths(j - (((m3524m() * 12) + this.f6769a.getMonthValue()) - 1)));
                }
                if (i == 6 || i == 7) {
                }
            }
            return m3525n(this.f6769a.with(temporalField, j));
        }
        return (C45748v) super.with(temporalField, j);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return (C45748v) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (C45748v) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return (C45748v) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (C45748v) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(TemporalAmount temporalAmount) {
        return (C45748v) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (C45748v) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: l */
    public final ChronoLocalDate mo3482l(long j) {
        return m3525n(this.f6769a.plusYears(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: k */
    public final ChronoLocalDate mo3481k(long j) {
        return m3525n(this.f6769a.plusMonths(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: j */
    public final ChronoLocalDate mo3480j(long j) {
        return m3525n(this.f6769a.plusDays(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        return (C45748v) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(long j, TemporalUnit temporalUnit) {
        return (C45748v) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(long j, TemporalUnit temporalUnit) {
        return (C45748v) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return (C45748v) super.minus(j, temporalUnit);
    }

    /* renamed from: n */
    public final C45748v m3525n(LocalDate localDate) {
        return localDate.equals(this.f6769a) ? this : new C45748v(localDate);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        Period periodUntil = this.f6769a.until(chronoLocalDate);
        return C45746t.f6767d.period(periodUntil.getYears(), periodUntil.getMonths(), periodUntil.getDays());
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f6769a.toEpochDay();
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45748v) {
            return this.f6769a.equals(((C45748v) obj).f6769a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45750x((byte) 7, this);
    }
}
