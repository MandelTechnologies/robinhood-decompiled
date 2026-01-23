package p479j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p479j$.time.AbstractC45722b;
import p479j$.time.C45754e;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.Period;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.q */
/* loaded from: classes29.dex */
public final class C45743q extends AbstractC45728b {

    /* renamed from: d */
    public static final LocalDate f6757d = LocalDate.m3377of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a */
    public final transient LocalDate f6758a;

    /* renamed from: b */
    public final transient C45744r f6759b;

    /* renamed from: c */
    public final transient int f6760c;

    public C45743q(LocalDate localDate) {
        if (localDate.isBefore(f6757d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        C45744r c45744rM3521c = C45744r.m3521c(localDate);
        this.f6759b = c45744rM3521c;
        this.f6760c = (localDate.getYear() - c45744rM3521c.f6764b.getYear()) + 1;
        this.f6758a = localDate;
    }

    public C45743q(C45744r c45744r, int i, LocalDate localDate) {
        if (localDate.isBefore(f6757d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f6759b = c45744r;
        this.f6760c = i;
        this.f6758a = localDate;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return C45741o.f6755d;
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C45741o.f6755d.getClass();
        return this.f6758a.hashCode() ^ (-688086063);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Era getEra() {
        return this.f6759b;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return this.f6758a.lengthOfMonth();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        int iLengthOfYear;
        C45744r c45744rM3523e = this.f6759b.m3523e();
        if (c45744rM3523e != null && c45744rM3523e.f6764b.getYear() == this.f6758a.getYear()) {
            iLengthOfYear = c45744rM3523e.f6764b.getDayOfYear() - 1;
        } else {
            iLengthOfYear = this.f6758a.lengthOfYear();
        }
        return this.f6760c == 1 ? iLengthOfYear - (this.f6759b.f6764b.getDayOfYear() - 1) : iLengthOfYear;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (temporalField != ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH && temporalField != ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR && temporalField != ChronoField.ALIGNED_WEEK_OF_MONTH && temporalField != ChronoField.ALIGNED_WEEK_OF_YEAR) {
            if (temporalField instanceof ChronoField) {
                return ((ChronoField) temporalField).isDateBased();
            }
            if (temporalField != null && temporalField.isSupportedBy(this)) {
                return true;
            }
        }
        return false;
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
        int i = AbstractC45742p.f6756a[chronoField.ordinal()];
        if (i == 1) {
            return ValueRange.m3598of(1L, this.f6758a.lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.m3598of(1L, lengthOfYear());
        }
        if (i != 3) {
            return C45741o.f6755d.range(chronoField);
        }
        int year = this.f6759b.f6764b.getYear();
        return this.f6759b.m3523e() != null ? ValueRange.m3598of(1L, (r0.f6764b.getYear() - year) + 1) : ValueRange.m3598of(1L, 999999999 - year);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        switch (AbstractC45742p.f6756a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.f6760c == 1 ? (this.f6758a.getDayOfYear() - this.f6759b.f6764b.getDayOfYear()) + 1 : this.f6758a.getDayOfYear();
            case 3:
                return this.f6760c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
            case 8:
                return this.f6759b.f6763a;
            default:
                return this.f6758a.getLong(temporalField);
        }
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final C45743q with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (getLong(chronoField) == j) {
                return this;
            }
            int[] iArr = AbstractC45742p.f6756a;
            int i = iArr[chronoField.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                C45741o c45741o = C45741o.f6755d;
                int iCheckValidIntValue = c45741o.range(chronoField).checkValidIntValue(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 3) {
                    return m3519o(this.f6758a.m3389s(c45741o.prolepticYear(this.f6759b, iCheckValidIntValue)));
                }
                if (i2 == 8) {
                    return m3519o(this.f6758a.m3389s(c45741o.prolepticYear(C45744r.m3522i(iCheckValidIntValue), this.f6760c)));
                }
                if (i2 == 9) {
                    return m3519o(this.f6758a.m3389s(iCheckValidIntValue));
                }
            }
            return m3519o(this.f6758a.with(temporalField, j));
        }
        return (C45743q) super.with(temporalField, j);
    }

    /* renamed from: n */
    public final C45743q m3518n(C45754e c45754e) {
        return (C45743q) super.with((TemporalAdjuster) c45754e);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return (C45743q) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (C45743q) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return (C45743q) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (C45743q) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(TemporalAmount temporalAmount) {
        return (C45743q) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (C45743q) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: l */
    public final ChronoLocalDate mo3482l(long j) {
        return m3519o(this.f6758a.plusYears(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: k */
    public final ChronoLocalDate mo3481k(long j) {
        return m3519o(this.f6758a.plusMonths(j));
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: j */
    public final ChronoLocalDate mo3480j(long j) {
        return m3519o(this.f6758a.plusDays(j));
    }

    /* renamed from: m */
    public final C45743q m3517m(long j, ChronoUnit chronoUnit) {
        return (C45743q) super.plus(j, (TemporalUnit) chronoUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        return (C45743q) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(long j, TemporalUnit temporalUnit) {
        return (C45743q) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(long j, TemporalUnit temporalUnit) {
        return (C45743q) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return (C45743q) super.minus(j, temporalUnit);
    }

    /* renamed from: o */
    public final C45743q m3519o(LocalDate localDate) {
        return localDate.equals(this.f6758a) ? this : new C45743q(localDate);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        Period periodUntil = this.f6758a.until(chronoLocalDate);
        return C45741o.f6755d.period(periodUntil.getYears(), periodUntil.getMonths(), periodUntil.getDays());
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f6758a.toEpochDay();
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45743q) {
            return this.f6758a.equals(((C45743q) obj).f6758a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45750x((byte) 4, this);
    }
}
