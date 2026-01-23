package p479j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneOffset;

/* renamed from: j$.time.zone.b */
/* loaded from: classes29.dex */
public final class C45809b implements Comparable, Serializable {

    /* renamed from: e */
    public static final /* synthetic */ int f6981e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a */
    public final long f6982a;

    /* renamed from: b */
    public final LocalDateTime f6983b;

    /* renamed from: c */
    public final ZoneOffset f6984c;

    /* renamed from: d */
    public final ZoneOffset f6985d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f6982a, ((C45809b) obj).f6982a);
    }

    public C45809b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f6982a = localDateTime.toEpochSecond(zoneOffset);
        this.f6983b = localDateTime;
        this.f6984c = zoneOffset;
        this.f6985d = zoneOffset2;
    }

    public C45809b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f6982a = j;
        this.f6983b = LocalDateTime.ofEpochSecond(j, 0, zoneOffset);
        this.f6984c = zoneOffset;
        this.f6985d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45808a((byte) 2, this);
    }

    /* renamed from: c */
    public final boolean m3629c() {
        return this.f6985d.getTotalSeconds() > this.f6984c.getTotalSeconds();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45809b) {
            C45809b c45809b = (C45809b) obj;
            if (this.f6982a == c45809b.f6982a && this.f6984c.equals(c45809b.f6984c) && this.f6985d.equals(c45809b.f6985d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6983b.hashCode() ^ this.f6984c.hashCode()) ^ Integer.rotateLeft(this.f6985d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m3629c() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f6983b);
        sb.append(this.f6984c);
        sb.append(" to ");
        sb.append(this.f6985d);
        sb.append(']');
        return sb.toString();
    }
}
