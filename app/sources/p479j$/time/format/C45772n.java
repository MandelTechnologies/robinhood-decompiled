package p479j$.time.format;

import java.text.ParsePosition;

/* renamed from: j$.time.format.n */
/* loaded from: classes29.dex */
public class C45772n {

    /* renamed from: a */
    public String f6852a;

    /* renamed from: b */
    public String f6853b;

    /* renamed from: c */
    public final char f6854c;

    /* renamed from: d */
    public C45772n f6855d;

    /* renamed from: e */
    public C45772n f6856e;

    /* renamed from: b */
    public boolean mo3574b(char c, char c2) {
        return c == c2;
    }

    public C45772n(String str, String str2, C45772n c45772n) {
        this.f6852a = str;
        this.f6853b = str2;
        this.f6855d = c45772n;
        if (str.isEmpty()) {
            this.f6854c = (char) 65535;
        } else {
            this.f6854c = this.f6852a.charAt(0);
        }
    }

    /* renamed from: c */
    public final String m3578c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo3576e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f6852a.length() + index;
        C45772n c45772n = this.f6855d;
        if (c45772n != null && length2 != length) {
            while (true) {
                if (mo3574b(c45772n.f6854c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strM3578c = c45772n.m3578c(charSequence, parsePosition);
                    if (strM3578c != null) {
                        return strM3578c;
                    }
                } else {
                    c45772n = c45772n.f6856e;
                    if (c45772n == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f6853b;
    }

    /* renamed from: d */
    public C45772n mo3575d(String str, String str2, C45772n c45772n) {
        return new C45772n(str, str2, c45772n);
    }

    /* renamed from: e */
    public boolean mo3576e(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f6852a, i);
        }
        int length = this.f6852a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!mo3574b(this.f6852a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }

    /* renamed from: a */
    public final boolean m3577a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f6852a.length() && mo3574b(str.charAt(i), this.f6852a.charAt(i))) {
            i++;
        }
        if (i == this.f6852a.length()) {
            if (i < str.length()) {
                String strSubstring = str.substring(i);
                for (C45772n c45772n = this.f6855d; c45772n != null; c45772n = c45772n.f6856e) {
                    if (mo3574b(c45772n.f6854c, strSubstring.charAt(0))) {
                        return c45772n.m3577a(strSubstring, str2);
                    }
                }
                C45772n c45772nMo3575d = mo3575d(strSubstring, str2, null);
                c45772nMo3575d.f6856e = this.f6855d;
                this.f6855d = c45772nMo3575d;
                return true;
            }
            this.f6853b = str2;
            return true;
        }
        C45772n c45772nMo3575d2 = mo3575d(this.f6852a.substring(i), this.f6853b, this.f6855d);
        this.f6852a = str.substring(0, i);
        this.f6855d = c45772nMo3575d2;
        if (i < str.length()) {
            this.f6855d.f6856e = mo3575d(str.substring(i), str2, null);
            this.f6853b = null;
            return true;
        }
        this.f6853b = str2;
        return true;
    }
}
