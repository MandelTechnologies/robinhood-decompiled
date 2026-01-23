package p479j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.a */
/* loaded from: classes29.dex */
public final class C45721a extends Clock implements Serializable {

    /* renamed from: b */
    public static final C45721a f6709b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a */
    public final ZoneId f6710a;

    static {
        System.currentTimeMillis();
        f6709b = new C45721a(ZoneOffset.UTC);
    }

    public C45721a(ZoneId zoneId) {
        this.f6710a = zoneId;
    }

    @Override // p479j$.time.Clock
    public final ZoneId getZone() {
        return this.f6710a;
    }

    @Override // p479j$.time.Clock
    public final Clock withZone(ZoneId zoneId) {
        return zoneId.equals(this.f6710a) ? this : new C45721a(zoneId);
    }

    @Override // p479j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    @Override // p479j$.time.Clock
    public final long millis() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C45721a) {
            return this.f6710a.equals(((C45721a) obj).f6710a);
        }
        return false;
    }

    @Override // p479j$.time.Clock
    public final int hashCode() {
        return this.f6710a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f6710a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
