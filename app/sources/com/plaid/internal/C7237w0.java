package com.plaid.internal;

/* renamed from: com.plaid.internal.w0 */
/* loaded from: classes16.dex */
public final class C7237w0 {

    /* renamed from: a */
    public final String f3273a;

    public C7237w0(String str) {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        this.f3273a = str.concat(": ");
    }

    /* renamed from: a */
    public final String m1634a(String str, Object... objArr) {
        if (objArr.length == 0) {
            return this.f3273a + str;
        }
        try {
            return this.f3273a + String.format(str, objArr);
        } catch (Exception e) {
            return this.f3273a + str + "... {format error " + e.getMessage() + "}";
        }
    }

    /* renamed from: a */
    public final void m1635a(EnumC5943Q3 enumC5943Q3, String str, Object... objArr) {
        EnumC5943Q3 enumC5943Q32 = C5969T3.f1714a;
        if (enumC5943Q3.f1654a <= C5969T3.f1714a.f1654a) {
            C5969T3.f1716c.mo1260a(enumC5943Q3, m1634a(str, objArr));
        }
    }

    /* renamed from: a */
    public final void m1636a(Exception exc, String str) {
        EnumC5943Q3 enumC5943Q3 = EnumC5943Q3.ERROR;
        EnumC5943Q3 enumC5943Q32 = C5969T3.f1714a;
        if (enumC5943Q3.f1654a <= C5969T3.f1714a.f1654a) {
            C5969T3.f1716c.mo1261a(enumC5943Q3, m1634a(str, new Object[0]), exc);
        }
    }
}
