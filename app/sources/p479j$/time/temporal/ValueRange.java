package p479j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p479j$.time.DateTimeException;

/* loaded from: classes29.dex */
public final class ValueRange implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a */
    public final long f6931a;

    /* renamed from: b */
    public final long f6932b;

    /* renamed from: c */
    public final long f6933c;

    /* renamed from: d */
    public final long f6934d;

    /* renamed from: of */
    public static ValueRange m3598of(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new ValueRange(j, j, j2, j2);
    }

    /* renamed from: of */
    public static ValueRange m3599of(long j, long j2, long j3) {
        return m3600of(j, j, j2, j3);
    }

    /* renamed from: of */
    public static ValueRange m3600of(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new ValueRange(j, j2, j3, j4);
    }

    public ValueRange(long j, long j2, long j3, long j4) {
        this.f6931a = j;
        this.f6932b = j2;
        this.f6933c = j3;
        this.f6934d = j4;
    }

    /* renamed from: b */
    public final boolean m3602b() {
        return this.f6931a >= -2147483648L && getMaximum() <= 2147483647L;
    }

    /* renamed from: c */
    public final boolean m3603c(long j) {
        return j >= this.f6931a && j <= getMaximum();
    }

    public long getMaximum() {
        return this.f6934d;
    }

    public int checkValidIntValue(long j, TemporalField temporalField) {
        if (m3602b() && m3603c(j)) {
            return (int) j;
        }
        throw new DateTimeException(m3601a(temporalField, j));
    }

    public long checkValidValue(long j, TemporalField temporalField) {
        if (m3603c(j)) {
            return j;
        }
        throw new DateTimeException(m3601a(temporalField, j));
    }

    /* renamed from: a */
    public final String m3601a(TemporalField temporalField, long j) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.f6931a;
        long j2 = this.f6932b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.f6933c;
        long j4 = this.f6934d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueRange) {
            ValueRange valueRange = (ValueRange) obj;
            if (this.f6931a == valueRange.f6931a && this.f6932b == valueRange.f6932b && this.f6933c == valueRange.f6933c && this.f6934d == valueRange.f6934d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6931a;
        long j2 = this.f6932b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.f6933c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f6934d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6931a);
        if (this.f6931a != this.f6932b) {
            sb.append('/');
            sb.append(this.f6932b);
        }
        sb.append(" - ");
        sb.append(this.f6933c);
        if (this.f6933c != this.f6934d) {
            sb.append('/');
            sb.append(this.f6934d);
        }
        return sb.toString();
    }
}
