package p479j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p479j$.time.ZoneId;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.v */
/* loaded from: classes29.dex */
public final class C45780v {

    /* renamed from: a */
    public final DateTimeFormatter f6880a;

    /* renamed from: b */
    public boolean f6881b = true;

    /* renamed from: c */
    public boolean f6882c = true;

    /* renamed from: d */
    public final ArrayList f6883d;

    /* renamed from: e */
    public ArrayList f6884e;

    public C45780v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f6883d = arrayList;
        this.f6884e = null;
        this.f6880a = dateTimeFormatter;
        arrayList.add(new C45757B());
    }

    /* renamed from: d */
    public final Chronology m3585d() {
        Chronology chronology = m3584c().f6784c;
        if (chronology != null) {
            return chronology;
        }
        Chronology chronology2 = this.f6880a.f6804e;
        return chronology2 == null ? IsoChronology.INSTANCE : chronology2;
    }

    /* renamed from: a */
    public final boolean m3583a(char c, char c2) {
        if (this.f6881b) {
            return c == c2;
        }
        return m3582b(c, c2);
    }

    /* renamed from: h */
    public final boolean m3589h(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.f6881b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3582b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* renamed from: c */
    public final C45757B m3584c() {
        return (C45757B) this.f6883d.get(r0.size() - 1);
    }

    /* renamed from: e */
    public final Long m3586e(ChronoField chronoField) {
        return (Long) ((HashMap) m3584c().f6782a).get(chronoField);
    }

    /* renamed from: g */
    public final int m3588g(TemporalField temporalField, long j, int i, int i2) {
        Objects.requireNonNull(temporalField, "field");
        Long l = (Long) ((HashMap) m3584c().f6782a).put(temporalField, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    /* renamed from: f */
    public final void m3587f(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        m3584c().f6783b = zoneId;
    }

    public final String toString() {
        return m3584c().toString();
    }
}
