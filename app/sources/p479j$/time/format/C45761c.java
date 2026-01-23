package p479j$.time.format;

/* renamed from: j$.time.format.c */
/* loaded from: classes29.dex */
public final class C45761c implements InterfaceC45763e {

    /* renamed from: a */
    public final char f6827a;

    public C45761c(char c) {
        this.f6827a = c;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        sb.append(this.f6827a);
        return true;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.f6827a;
        return (cCharAt == c || (!c45780v.f6881b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.f6827a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
