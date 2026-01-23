package p479j$.time.format;

import p479j$.time.DateTimeException;

/* renamed from: j$.time.format.l */
/* loaded from: classes29.dex */
public final class C45770l implements InterfaceC45763e {

    /* renamed from: a */
    public final InterfaceC45763e f6849a;

    /* renamed from: b */
    public final int f6850b;

    /* renamed from: c */
    public final char f6851c;

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        boolean z = c45780v.f6882c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.f6850b + i;
        if (length > charSequence.length()) {
            if (z) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && c45780v.m3583a(charSequence.charAt(i2), this.f6851c)) {
            i2++;
        }
        int iMo3560i = this.f6849a.mo3560i(c45780v, charSequence.subSequence(0, length), i2);
        return (iMo3560i == length || !z) ? iMo3560i : ~(i + i2);
    }

    public C45770l(InterfaceC45763e interfaceC45763e, int i, char c) {
        this.f6849a = interfaceC45763e;
        this.f6850b = i;
        this.f6851c = c;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        int length = sb.length();
        if (!this.f6849a.mo3559c(c45782x, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.f6850b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.f6851c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        char c = this.f6851c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.f6849a + "," + this.f6850b + str;
    }
}
