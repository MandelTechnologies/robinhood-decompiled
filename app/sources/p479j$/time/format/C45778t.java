package p479j$.time.format;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import p479j$.time.DateTimeException;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.zone.C45815h;

/* renamed from: j$.time.format.t */
/* loaded from: classes29.dex */
public class C45778t implements InterfaceC45763e {

    /* renamed from: c */
    public static volatile Map.Entry f6871c;

    /* renamed from: d */
    public static volatile Map.Entry f6872d;

    /* renamed from: a */
    public final TemporalQuery f6873a;

    /* renamed from: b */
    public final String f6874b;

    /* renamed from: a */
    public C45772n mo3581a(C45780v c45780v) {
        Set<String> set = C45815h.f7000d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = c45780v.f6881b ? f6871c : f6872d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = c45780v.f6881b ? f6871c : f6872d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        C45772n c45772n = c45780v.f6881b ? new C45772n("", null, null) : new C45771m("", null, null);
                        for (String str : set) {
                            c45772n.m3577a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c45772n);
                        if (c45780v.f6881b) {
                            f6871c = simpleImmutableEntry;
                        } else {
                            f6872d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (C45772n) simpleImmutableEntry.getValue();
    }

    public C45778t(TemporalQuery temporalQuery, String str) {
        this.f6873a = temporalQuery;
        this.f6874b = str;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) c45782x.m3591b(this.f6873a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return m3580b(c45780v, charSequence, i, i, C45769k.f6844e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (c45780v.m3583a(cCharAt, Matrix.MATRIX_TYPE_RANDOM_UT) && c45780v.m3583a(cCharAt2, 'T')) {
                int i4 = i + 3;
                if (length >= i4 && c45780v.m3583a(charSequence.charAt(i3), 'C')) {
                    return m3580b(c45780v, charSequence, i, i4, C45769k.f6845f);
                }
                return m3580b(c45780v, charSequence, i, i3, C45769k.f6845f);
            }
            if (c45780v.m3583a(cCharAt, 'G') && length >= (i2 = i + 3) && c45780v.m3583a(cCharAt2, 'M') && c45780v.m3583a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length >= i5 && c45780v.m3583a(charSequence.charAt(i2), '0')) {
                    c45780v.m3587f(ZoneId.m3448of("GMT0"));
                    return i5;
                }
                return m3580b(c45780v, charSequence, i, i2, C45769k.f6845f);
            }
        }
        C45772n c45772nMo3581a = mo3581a(c45780v);
        ParsePosition parsePosition = new ParsePosition(i);
        String strM3578c = c45772nMo3581a.m3578c(charSequence, parsePosition);
        if (strM3578c == null) {
            if (!c45780v.m3583a(cCharAt, Matrix.MATRIX_TYPE_ZERO)) {
                return ~i;
            }
            c45780v.m3587f(ZoneOffset.UTC);
            return i + 1;
        }
        c45780v.m3587f(ZoneId.m3448of(strM3578c));
        return parsePosition.getIndex();
    }

    /* renamed from: b */
    public static int m3580b(C45780v c45780v, CharSequence charSequence, int i, int i2, C45769k c45769k) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            c45780v.m3587f(ZoneId.m3448of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !c45780v.m3583a(charSequence.charAt(i2), Matrix.MATRIX_TYPE_ZERO)) {
            C45780v c45780v2 = new C45780v(c45780v.f6880a);
            c45780v2.f6881b = c45780v.f6881b;
            c45780v2.f6882c = c45780v.f6882c;
            int iMo3560i = c45769k.mo3560i(c45780v2, charSequence, i2);
            try {
                if (iMo3560i < 0) {
                    if (c45769k == C45769k.f6844e) {
                        return ~i;
                    }
                    c45780v.m3587f(ZoneId.m3448of(upperCase));
                    return i2;
                }
                c45780v.m3587f(ZoneId.m3446j(upperCase, ZoneOffset.ofTotalSeconds((int) c45780v2.m3586e(ChronoField.OFFSET_SECONDS).longValue())));
                return iMo3560i;
            } catch (DateTimeException unused) {
                return ~i;
            }
        }
        c45780v.m3587f(ZoneId.m3448of(upperCase));
        return i2;
    }

    public final String toString() {
        return this.f6874b;
    }
}
