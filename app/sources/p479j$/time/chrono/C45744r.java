package p479j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.r */
/* loaded from: classes29.dex */
public final class C45744r implements Era, Serializable {

    /* renamed from: d */
    public static final C45744r f6761d;

    /* renamed from: e */
    public static final C45744r[] f6762e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a */
    public final transient int f6763a;

    /* renamed from: b */
    public final transient LocalDate f6764b;

    /* renamed from: c */
    public final transient String f6765c;

    static {
        C45744r c45744r = new C45744r(-1, LocalDate.m3377of(1868, 1, 1), "Meiji");
        f6761d = c45744r;
        f6762e = new C45744r[]{c45744r, new C45744r(0, LocalDate.m3377of(1912, 7, 30), "Taisho"), new C45744r(1, LocalDate.m3377of(1926, 12, 25), "Showa"), new C45744r(2, LocalDate.m3377of(1989, 1, 8), "Heisei"), new C45744r(3, LocalDate.m3377of(2019, 5, 1), "Reiwa")};
    }

    /* renamed from: e */
    public final C45744r m3523e() {
        if (this == f6762e[r0.length - 1]) {
            return null;
        }
        return m3522i(this.f6763a + 1);
    }

    public C45744r(int i, LocalDate localDate, String str) {
        this.f6763a = i;
        this.f6764b = localDate;
        this.f6765c = str;
    }

    /* renamed from: i */
    public static C45744r m3522i(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            C45744r[] c45744rArr = f6762e;
            if (i2 < c45744rArr.length) {
                return c45744rArr[i2];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    /* renamed from: c */
    public static C45744r m3521c(LocalDate localDate) {
        if (localDate.isBefore(C45743q.f6757d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f6762e.length - 1; length >= 0; length--) {
            C45744r c45744r = f6762e[length];
            if (localDate.compareTo((ChronoLocalDate) c45744r.f6764b) >= 0) {
                return c45744r;
            }
        }
        return null;
    }

    @Override // p479j$.time.chrono.Era
    public final int getValue() {
        return this.f6763a;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return C45741o.f6755d.range(chronoField);
        }
        return super.range(temporalField);
    }

    public final String toString() {
        return this.f6765c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C45750x((byte) 5, this);
    }
}
