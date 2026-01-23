package p479j$.time.temporal;

import p479j$.time.C45754e;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.chrono.Chronology;

/* loaded from: classes29.dex */
public final class TemporalQueries {

    /* renamed from: a */
    public static final C45754e f6924a = new C45754e(8);

    /* renamed from: b */
    public static final C45754e f6925b = new C45754e(9);

    /* renamed from: c */
    public static final C45754e f6926c = new C45754e(10);

    /* renamed from: d */
    public static final C45754e f6927d = new C45754e(11);

    /* renamed from: e */
    public static final C45754e f6928e = new C45754e(12);

    /* renamed from: f */
    public static final C45754e f6929f = new C45754e(13);

    /* renamed from: g */
    public static final C45754e f6930g = new C45754e(14);

    public static TemporalQuery<Chronology> chronology() {
        return f6925b;
    }

    public static TemporalQuery<TemporalUnit> precision() {
        return f6926c;
    }

    public static TemporalQuery<LocalDate> localDate() {
        return f6929f;
    }

    public static TemporalQuery<LocalTime> localTime() {
        return f6930g;
    }
}
