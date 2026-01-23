package p479j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p479j$.time.AbstractC45723c;
import p479j$.time.DateTimeException;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.e */
/* loaded from: classes29.dex */
public final class C45731e implements ChronoPeriod, Serializable {

    /* renamed from: e */
    public static final List f6724e = AbstractC45723c.m3471b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a */
    public final Chronology f6725a;

    /* renamed from: b */
    public final int f6726b;

    /* renamed from: c */
    public final int f6727c;

    /* renamed from: d */
    public final int f6728d;

    public C45731e(Chronology chronology, int i, int i2, int i3) {
        this.f6725a = chronology;
        this.f6726b = i;
        this.f6727c = i2;
        this.f6728d = i3;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final long get(TemporalUnit temporalUnit) {
        int i;
        if (temporalUnit == ChronoUnit.YEARS) {
            i = this.f6726b;
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            i = this.f6727c;
        } else if (temporalUnit == ChronoUnit.DAYS) {
            i = this.f6728d;
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
        return i;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final List getUnits() {
        return f6724e;
    }

    public final String toString() {
        if (this.f6726b == 0 && this.f6727c == 0 && this.f6728d == 0) {
            return this.f6725a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6725a.toString());
        sb.append(" P");
        int i = this.f6726b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f6727c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f6728d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final long m3496a() {
        ValueRange valueRangeRange = this.f6725a.range(ChronoField.MONTH_OF_YEAR);
        if (valueRangeRange.f6931a == valueRangeRange.f6932b && valueRangeRange.f6933c == valueRangeRange.f6934d && valueRangeRange.m3602b()) {
            return (valueRangeRange.getMaximum() - valueRangeRange.f6931a) + 1;
        }
        return -1L;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final Temporal addTo(Temporal temporal) {
        m3497b(temporal);
        if (this.f6727c == 0) {
            int i = this.f6726b;
            if (i != 0) {
                temporal = temporal.plus(i, ChronoUnit.YEARS);
            }
        } else {
            long jM3496a = m3496a();
            if (jM3496a > 0) {
                temporal = temporal.plus((this.f6726b * jM3496a) + this.f6727c, ChronoUnit.MONTHS);
            } else {
                int i2 = this.f6726b;
                if (i2 != 0) {
                    temporal = temporal.plus(i2, ChronoUnit.YEARS);
                }
                temporal = temporal.plus(this.f6727c, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.f6728d;
        return i3 != 0 ? temporal.plus(i3, ChronoUnit.DAYS) : temporal;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final Temporal subtractFrom(Temporal temporal) {
        m3497b(temporal);
        if (this.f6727c == 0) {
            int i = this.f6726b;
            if (i != 0) {
                temporal = temporal.minus(i, ChronoUnit.YEARS);
            }
        } else {
            long jM3496a = m3496a();
            if (jM3496a > 0) {
                temporal = temporal.minus((this.f6726b * jM3496a) + this.f6727c, ChronoUnit.MONTHS);
            } else {
                int i2 = this.f6726b;
                if (i2 != 0) {
                    temporal = temporal.minus(i2, ChronoUnit.YEARS);
                }
                temporal = temporal.minus(this.f6727c, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.f6728d;
        return i3 != 0 ? temporal.minus(i3, ChronoUnit.DAYS) : temporal;
    }

    /* renamed from: b */
    public final void m3497b(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        Chronology chronology = (Chronology) temporal.query(TemporalQueries.chronology());
        if (chronology == null || this.f6725a.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + this.f6725a.getId() + ", actual: " + chronology.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45731e) {
            C45731e c45731e = (C45731e) obj;
            if (this.f6726b == c45731e.f6726b && this.f6727c == c45731e.f6727c && this.f6728d == c45731e.f6728d && this.f6725a.equals(c45731e.f6725a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f6728d, 16) + (Integer.rotateLeft(this.f6727c, 8) + this.f6726b)) ^ this.f6725a.hashCode();
    }

    public Object writeReplace() {
        return new C45750x((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
