package p479j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import p479j$.time.AbstractC45722b;
import p479j$.time.DateTimeException;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.l */
/* loaded from: classes29.dex */
public final class C45738l extends AbstractC45728b {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a */
    public final transient C45736j f6748a;

    /* renamed from: b */
    public final transient int f6749b;

    /* renamed from: c */
    public final transient int f6750c;

    /* renamed from: d */
    public final transient int f6751d;

    public C45738l(C45736j c45736j, int i, int i2, int i3) {
        c45736j.m3507t(i, i2, i3);
        this.f6748a = c45736j;
        this.f6749b = i;
        this.f6750c = i2;
        this.f6751d = i3;
    }

    public C45738l(C45736j c45736j, long j) {
        int i = (int) j;
        c45736j.m3502o();
        if (i < c45736j.f6740h || i >= c45736j.f6741i) {
            throw new DateTimeException("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(c45736j.f6739g, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {c45736j.m3506s(iBinarySearch), ((c45736j.f6742j + iBinarySearch) % 12) + 1, (i - c45736j.f6739g[iBinarySearch]) + 1};
        this.f6748a = c45736j;
        this.f6749b = iArr[0];
        this.f6750c = iArr[1];
        this.f6751d = iArr[2];
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return this.f6748a;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        C45738l c45738lDate = this.f6748a.date(chronoLocalDate);
        long j = (c45738lDate.f6750c - this.f6750c) + ((c45738lDate.f6749b - this.f6749b) * 12);
        int iLengthOfMonth = c45738lDate.f6751d - this.f6751d;
        if (j > 0 && iLengthOfMonth < 0) {
            j--;
            iLengthOfMonth = (int) (c45738lDate.toEpochDay() - mo3481k(j).toEpochDay());
        } else if (j < 0 && iLengthOfMonth > 0) {
            j++;
            iLengthOfMonth -= c45738lDate.lengthOfMonth();
        }
        return this.f6748a.period(Math.toIntExact(j / 12), (int) (j % 12), iLengthOfMonth);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Era getEra() {
        return EnumC45739m.f6752AH;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return this.f6748a.m3508u(this.f6749b, this.f6750c);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        return this.f6748a.m3509w(this.f6749b, 12);
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
        int i = AbstractC45737k.f6747a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.f6748a.range(chronoField) : ValueRange.m3598of(1L, 5L) : ValueRange.m3598of(1L, lengthOfYear()) : ValueRange.m3598of(1L, lengthOfMonth());
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        switch (AbstractC45737k.f6747a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f6751d;
            case 2:
                return m3510m();
            case 3:
                return ((this.f6751d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((this.f6751d - 1) % 7) + 1;
            case 6:
                return ((m3510m() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((m3510m() - 1) / 7) + 1;
            case 9:
                return this.f6750c;
            case 10:
                return ((this.f6749b * 12) + this.f6750c) - 1;
            case 11:
                return this.f6749b;
            case 12:
                return this.f6749b;
            case 13:
                return this.f6749b <= 1 ? 0 : 1;
            default:
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final C45738l with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (C45738l) super.with(temporalField, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.f6748a.range(chronoField).checkValidValue(j, chronoField);
        int i = (int) j;
        switch (AbstractC45737k.f6747a[chronoField.ordinal()]) {
            case 1:
                return m3513p(this.f6749b, this.f6750c, i);
            case 2:
                return mo3480j(Math.min(i, lengthOfYear()) - m3510m());
            case 3:
                return mo3480j((j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return mo3480j(j - (((int) Math.floorMod(toEpochDay() + 3, 7)) + 1));
            case 5:
                return mo3480j(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return mo3480j(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C45738l(this.f6748a, j);
            case 8:
                return mo3480j((j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return m3513p(this.f6749b, i, this.f6751d);
            case 10:
                return mo3481k(j - (((this.f6749b * 12) + this.f6750c) - 1));
            case 11:
                if (this.f6749b < 1) {
                    i = 1 - i;
                }
                return m3513p(i, this.f6750c, this.f6751d);
            case 12:
                return m3513p(i, this.f6750c, this.f6751d);
            case 13:
                return m3513p(1 - this.f6749b, this.f6750c, this.f6751d);
            default:
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
    }

    /* renamed from: p */
    public final C45738l m3513p(int i, int i2, int i3) {
        int iM3508u = this.f6748a.m3508u(i, i2);
        if (i3 > iM3508u) {
            i3 = iM3508u;
        }
        return new C45738l(this.f6748a, i, i2, i3);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate with(TemporalAdjuster temporalAdjuster) {
        return (C45738l) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        return (C45738l) super.with(temporalAdjuster);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(TemporalAmount temporalAmount) {
        return (C45738l) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (C45738l) super.plus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(TemporalAmount temporalAmount) {
        return (C45738l) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (C45738l) super.minus(temporalAmount);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f6748a.m3507t(this.f6749b, this.f6750c, this.f6751d);
    }

    /* renamed from: m */
    public final int m3510m() {
        return this.f6748a.m3509w(this.f6749b, this.f6750c - 1) + this.f6751d;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return this.f6748a.isLeapYear(this.f6749b);
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: l */
    public final ChronoLocalDate mo3482l(long j) {
        return j == 0 ? this : m3513p(Math.addExact(this.f6749b, (int) j), this.f6750c, this.f6751d);
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final C45738l mo3481k(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.f6749b * 12) + (this.f6750c - 1) + j;
        C45736j c45736j = this.f6748a;
        long jFloorDiv = Math.floorDiv(j2, 12L);
        if (jFloorDiv >= c45736j.m3506s(0) && jFloorDiv <= c45736j.m3506s(c45736j.f6739g.length - 1) - 1) {
            return m3513p((int) jFloorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.f6751d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // p479j$.time.chrono.AbstractC45728b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C45738l mo3480j(long j) {
        return new C45738l(this.f6748a, toEpochDay() + j);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate plus(long j, TemporalUnit temporalUnit) {
        return (C45738l) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal plus(long j, TemporalUnit temporalUnit) {
        return (C45738l) super.plus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final ChronoLocalDate minus(long j, TemporalUnit temporalUnit) {
        return (C45738l) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return (C45738l) super.minus(j, temporalUnit);
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45738l) {
            C45738l c45738l = (C45738l) obj;
            if (this.f6749b == c45738l.f6749b && this.f6750c == c45738l.f6750c && this.f6751d == c45738l.f6751d && this.f6748a.equals(c45738l.f6748a)) {
                return true;
            }
        }
        return false;
    }

    @Override // p479j$.time.chrono.AbstractC45728b, p479j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.f6749b;
        int i2 = this.f6750c;
        int i3 = this.f6751d;
        return (((i << 11) + (i2 << 6)) + i3) ^ (this.f6748a.f6736d.hashCode() ^ (i & (-2048)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45750x((byte) 6, this);
    }
}
