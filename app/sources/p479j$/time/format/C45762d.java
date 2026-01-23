package p479j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: j$.time.format.d */
/* loaded from: classes29.dex */
public final class C45762d implements InterfaceC45763e {

    /* renamed from: a */
    public final InterfaceC45763e[] f6828a;

    /* renamed from: b */
    public final boolean f6829b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C45762d(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC45763e[]) arrayList.toArray(new InterfaceC45763e[arrayList.size()]), z);
    }

    public C45762d(InterfaceC45763e[] interfaceC45763eArr, boolean z) {
        this.f6828a = interfaceC45763eArr;
        this.f6829b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f6829b;
        if (z) {
            c45782x.f6891c++;
        }
        try {
            for (InterfaceC45763e interfaceC45763e : this.f6828a) {
                if (!interfaceC45763e.mo3559c(c45782x, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z) {
                c45782x.f6891c--;
            }
        }
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        boolean z = this.f6829b;
        InterfaceC45763e[] interfaceC45763eArr = this.f6828a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = c45780v.f6883d;
            C45757B c45757bM3584c = c45780v.m3584c();
            c45757bM3584c.getClass();
            C45757B c45757b = new C45757B();
            ((HashMap) c45757b.f6782a).putAll(c45757bM3584c.f6782a);
            c45757b.f6783b = c45757bM3584c.f6783b;
            c45757b.f6784c = c45757bM3584c.f6784c;
            c45757b.f6785d = c45757bM3584c.f6785d;
            arrayList.add(c45757b);
            int length = interfaceC45763eArr.length;
            int iMo3560i = i;
            while (i2 < length) {
                iMo3560i = interfaceC45763eArr[i2].mo3560i(c45780v, charSequence, iMo3560i);
                if (iMo3560i < 0) {
                    c45780v.f6883d.remove(r8.size() - 1);
                    return i;
                }
                i2++;
            }
            c45780v.f6883d.remove(r8.size() - 2);
            return iMo3560i;
        }
        int length2 = interfaceC45763eArr.length;
        while (i2 < length2) {
            i = interfaceC45763eArr[i2].mo3560i(c45780v, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC45763e[] interfaceC45763eArr = this.f6828a;
        if (interfaceC45763eArr != null) {
            boolean z = this.f6829b;
            sb.append(z ? "[" : "(");
            for (InterfaceC45763e interfaceC45763e : interfaceC45763eArr) {
                sb.append(interfaceC45763e);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
