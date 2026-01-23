package p479j$.time.format;

/* renamed from: j$.time.format.m */
/* loaded from: classes29.dex */
public final class C45771m extends C45772n {
    @Override // p479j$.time.format.C45772n
    /* renamed from: d */
    public final C45772n mo3575d(String str, String str2, C45772n c45772n) {
        return new C45771m(str, str2, c45772n);
    }

    @Override // p479j$.time.format.C45772n
    /* renamed from: b */
    public final boolean mo3574b(char c, char c2) {
        return C45780v.m3582b(c, c2);
    }

    @Override // p479j$.time.format.C45772n
    /* renamed from: e */
    public final boolean mo3576e(CharSequence charSequence, int i, int i2) {
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
            if (!C45780v.m3582b(this.f6852a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
