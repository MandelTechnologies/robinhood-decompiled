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

/* renamed from: j$.time.chrono.B */
/* loaded from: classes29.dex */
public final class C45725B extends AbstractC45728b {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a */
    public final transient LocalDate f6715a;

    public C45725B(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f6715a = localDate;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return C45752z.f6774d;
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C45752z.f6774d.getClass();
        return this.f6715a.hashCode() ^ 146118545;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Era getEra() {
        return m3483m() >= 1 ? EnumC45726C.f6716BE : EnumC45726C.BEFORE_BE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return this.f6715a.lengthOfMonth();
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
        int i = AbstractC45724A.f6711a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f6715a.range(temporalField);
        }
        if (i != 4) {
            return C45752z.f6774d.range(chronoField);
        }
        ValueRange valueRangeRange = ChronoField.YEAR.range();
        return ValueRange.m3598of(1L, m3483m() <= 0 ? (-(valueRangeRange.f6931a + 543)) + 1 : 543 + valueRangeRange.getMaximum());
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC45724A.f6711a[((ChronoField) temporalField).ordinal()];
            if (i == 4) {
                int iM3483m = m3483m();
                if (iM3483m < 1) {
                    iM3483m = 1 - iM3483m;
                }
                return iM3483m;
            }
            if (i == 5) {
                return ((m3483m() * 12) + this.f6715a.getMonthValue()) - 1;
            }
            if (i == 6) {
                return m3483m();
            }
            if (i != 7) {
                return this.f6715a.getLong(temporalField);
            }
            return m3483m() < 1 ? 0 : 1;
        }
        return temporalField.getFrom(this);
    }

    /* renamed from: m */
    public final int m3483m() {
        return this.f6715a.getYear() + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C45725B with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (getLong(chronoField) == j) {
                return this;
            }
            int[] iArr = AbstractC45724A.f6711a;
            int i = iArr[chronoField.ordinal()];
            if (i == 4) {
                int iCheckValidIntValue = C45752z.f6774d.range(chronoField).checkValidIntValue(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 4) {
                    LocalDate localDate = this.f6715a;
                    if (m3483m() < 1) {
                        iCheckValidIntValue = 1 - iCheckValidIntValue;
                    }
                    return m3484n(localDate.m3389s(iCheckValidIntValue - 543));
                }
                if (i2 == 6) {
                    return m3484n(this.f6715a.m3389s(iCheckValidIntValue - 543));
                }
                if (i2 == 7) {
                    return m3484n(this.f6715a.m3389s((-542) - m3483m()));
                }
            } else {
                if (i == 5) {
                    C45752z.f6774d.range(chronoField).checkValidValue(j, chronoField);
                    return m3484n(this.f6715a.plusMonths(j - (((m3483m() * 12) + this.f6715a.getMonthValue()) - 1)));
                }
                if (i == 6 || i == 7) {
                }
            }
            return m3484n(this.f6715a.with(temporalField, j));
        }
        return (C45725B) super.with(temporalField, j);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return (C45725B) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (C45725B) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return (C45725B) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (C45725B) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(TemporalAmount temporalAmount) {
        return (C45725B) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (C45725B) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: l */
    public final ChronoLocalDate mo3482l(long j) {
        return m3484n(this.f6715a.plusYears(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: k */
    public final ChronoLocalDate mo3481k(long j) {
        return m3484n(this.f6715a.plusMonths(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: j */
    public final ChronoLocalDate mo3480j(long j) {
        return m3484n(this.f6715a.plusDays(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        return (C45725B) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(long j, TemporalUnit temporalUnit) {
        return (C45725B) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(long j, TemporalUnit temporalUnit) {
        return (C45725B) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return (C45725B) super.minus(j, temporalUnit);
    }

    /* renamed from: n */
    public final C45725B m3484n(LocalDate localDate) {
        return localDate.equals(this.f6715a) ? this : new C45725B(localDate);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        Period periodUntil = this.f6715a.until(chronoLocalDate);
        return C45752z.f6774d.period(periodUntil.getYears(), periodUntil.getMonths(), periodUntil.getDays());
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f6715a.toEpochDay();
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45725B) {
            return this.f6715a.equals(((C45725B) obj).f6715a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45750x((byte) 8, this);
    }
}
