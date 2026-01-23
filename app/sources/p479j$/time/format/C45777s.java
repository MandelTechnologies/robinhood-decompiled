package p479j$.time.format;

import java.util.Locale;
import p479j$.time.temporal.C45807k;
import p479j$.time.temporal.WeekFields;

/* renamed from: j$.time.format.s */
/* loaded from: classes29.dex */
public final class C45777s extends C45768j {

    /* renamed from: g */
    public final char f6869g;

    /* renamed from: h */
    public final int f6870h;

    @Override // p479j$.time.format.C45768j, p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        return m3579g(c45780v.f6880a.f6801b).mo3560i(c45780v, charSequence, i);
    }

    @Override // p479j$.time.format.C45768j, p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        return m3579g(c45782x.f6890b.f6801b).mo3559c(c45782x, sb);
    }

    public C45777s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, SignStyle.NOT_NEGATIVE, i4);
        this.f6869g = c;
        this.f6870h = i;
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: e */
    public final C45768j mo3562e() {
        if (this.f6842e == -1) {
            return this;
        }
        return new C45777s(this.f6869g, this.f6870h, this.f6839b, this.f6840c, -1);
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: f */
    public final C45768j mo3563f(int i) {
        return new C45777s(this.f6869g, this.f6870h, this.f6839b, this.f6840c, this.f6842e + i);
    }

    /* renamed from: g */
    public final C45768j m3579g(Locale locale) {
        C45807k c45807k;
        WeekFields weekFieldsM3605of = WeekFields.m3605of(locale);
        char c = this.f6869g;
        if (c == 'W') {
            c45807k = weekFieldsM3605of.f6940d;
        } else {
            if (c == 'Y') {
                C45807k c45807k2 = weekFieldsM3605of.f6942f;
                int i = this.f6870h;
                if (i == 2) {
                    return new C45774p(c45807k2, 2, 2, C45774p.f6862h, this.f6842e);
                }
                return new C45768j(c45807k2, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.f6842e);
            }
            if (c == 'c' || c == 'e') {
                c45807k = weekFieldsM3605of.f6939c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                c45807k = weekFieldsM3605of.f6941e;
            }
        }
        return new C45768j(c45807k, this.f6839b, this.f6840c, SignStyle.NOT_NEGATIVE, this.f6842e);
    }

    @Override // p479j$.time.format.C45768j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.f6870h;
        char c = this.f6869g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
