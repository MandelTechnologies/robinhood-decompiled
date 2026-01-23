package p479j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.ChronoPeriod;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* loaded from: classes29.dex */
public final class Period implements ChronoPeriod, Serializable {
    public static final Period ZERO = new Period(0, 0, 0);

    /* renamed from: d */
    public static final List f6691d;
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a */
    public final int f6692a;

    /* renamed from: b */
    public final int f6693b;

    /* renamed from: c */
    public final int f6694c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        f6691d = AbstractC45723c.m3471b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        return localDate.until((ChronoLocalDate) localDate2);
    }

    /* renamed from: a */
    public static Period m3431a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return ZERO;
        }
        return new Period(i, i2, i3);
    }

    public Period(int i, int i2, int i3) {
        this.f6692a = i;
        this.f6693b = i2;
        this.f6694c = i3;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final long get(TemporalUnit temporalUnit) {
        int days;
        if (temporalUnit == ChronoUnit.YEARS) {
            days = getYears();
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            days = getMonths();
        } else if (temporalUnit == ChronoUnit.DAYS) {
            days = getDays();
        } else {
            throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
        return days;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final List getUnits() {
        return f6691d;
    }

    public boolean isZero() {
        return this == ZERO;
    }

    public boolean isNegative() {
        return this.f6692a < 0 || this.f6693b < 0 || this.f6694c < 0;
    }

    public int getYears() {
        return this.f6692a;
    }

    public int getMonths() {
        return this.f6693b;
    }

    public int getDays() {
        return this.f6694c;
    }

    public Period withDays(int i) {
        return i == this.f6694c ? this : m3431a(this.f6692a, this.f6693b, i);
    }

    public Period normalized() {
        long totalMonths = toTotalMonths();
        long j = totalMonths / 12;
        int i = (int) (totalMonths % 12);
        return (j == ((long) this.f6692a) && i == this.f6693b) ? this : m3431a(Math.toIntExact(j), i, this.f6694c);
    }

    public long toTotalMonths() {
        return (this.f6692a * 12) + this.f6693b;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final Temporal addTo(Temporal temporal) {
        m3432b(temporal);
        if (this.f6693b == 0) {
            int i = this.f6692a;
            if (i != 0) {
                temporal = temporal.plus(i, ChronoUnit.YEARS);
            }
        } else {
            long totalMonths = toTotalMonths();
            if (totalMonths != 0) {
                temporal = temporal.plus(totalMonths, ChronoUnit.MONTHS);
            }
        }
        int i2 = this.f6694c;
        return i2 != 0 ? temporal.plus(i2, ChronoUnit.DAYS) : temporal;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final Temporal subtractFrom(Temporal temporal) {
        m3432b(temporal);
        if (this.f6693b == 0) {
            int i = this.f6692a;
            if (i != 0) {
                temporal = temporal.minus(i, ChronoUnit.YEARS);
            }
        } else {
            long totalMonths = toTotalMonths();
            if (totalMonths != 0) {
                temporal = temporal.minus(totalMonths, ChronoUnit.MONTHS);
            }
        }
        int i2 = this.f6694c;
        return i2 != 0 ? temporal.minus(i2, ChronoUnit.DAYS) : temporal;
    }

    /* renamed from: b */
    public static void m3432b(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        Chronology chronology = (Chronology) temporal.query(TemporalQueries.chronology());
        if (chronology == null || IsoChronology.INSTANCE.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            if (this.f6692a == period.f6692a && this.f6693b == period.f6693b && this.f6694c == period.f6694c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f6694c, 16) + Integer.rotateLeft(this.f6693b, 8) + this.f6692a;
    }

    public String toString() {
        if (this == ZERO) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f6692a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f6693b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f6694c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
