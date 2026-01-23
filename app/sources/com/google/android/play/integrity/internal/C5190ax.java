package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.ax */
/* loaded from: classes27.dex */
public final class C5190ax implements InterfaceC5195bb {

    /* renamed from: a */
    private static final Object f849a = new Object();

    /* renamed from: b */
    private volatile InterfaceC5195bb f850b;

    /* renamed from: c */
    private volatile Object f851c = f849a;

    private C5190ax(InterfaceC5195bb interfaceC5195bb) {
        this.f850b = interfaceC5195bb;
    }

    /* renamed from: b */
    public static InterfaceC5195bb m963b(InterfaceC5195bb interfaceC5195bb) {
        return interfaceC5195bb instanceof C5190ax ? interfaceC5195bb : new C5190ax(interfaceC5195bb);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5196bd
    /* renamed from: a */
    public final Object mo857a() {
        Object objMo857a;
        Object obj = this.f851c;
        Object obj2 = f849a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo857a = this.f851c;
                if (objMo857a == obj2) {
                    objMo857a = this.f850b.mo857a();
                    Object obj3 = this.f851c;
                    if (obj3 != obj2 && obj3 != objMo857a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo857a + ". This is likely due to a circular dependency.");
                    }
                    this.f851c = objMo857a;
                    this.f850b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objMo857a;
    }
}
