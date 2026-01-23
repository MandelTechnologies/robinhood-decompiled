package com.plaid.internal;

import com.plaid.internal.C5990V6;
import com.plaid.internal.C7164o;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.plaid.internal.W6 */
/* loaded from: classes16.dex */
public final class C5999W6 implements C5990V6.c<String> {

    /* renamed from: a */
    public final /* synthetic */ C7173p f1809a;

    /* renamed from: b */
    public final /* synthetic */ C5990V6 f1810b;

    public C5999W6(C5990V6 c5990v6, C7173p c7173p) {
        this.f1810b = c5990v6;
        this.f1809a = c7173p;
    }

    @Override // com.plaid.internal.C5990V6.c
    public final String call() throws JSONException, C7191r {
        C7164o<R> c7164o = this.f1810b.f1774a;
        C7173p c7173p = this.f1809a;
        InterfaceC7184q1 interfaceC7184q1 = (InterfaceC7184q1) C7164o.m1567a(EnumC5954R6.PRE_CHECK, c7164o.f3029a, new C7111j(c7164o), c7173p);
        c7164o.f3034f.m1514a(interfaceC7184q1);
        C7164o.a aVar = new C7164o.a((C5811C0) C7164o.m1567a(EnumC5954R6.DEVICE_DESCRIPTOR, c7164o.f3030b, new C7120k(interfaceC7184q1), c7173p), interfaceC7184q1);
        C5811C0 c5811c0 = aVar.f3036b;
        InterfaceC7184q1 interfaceC7184q12 = aVar.f3035a;
        C5811C0 c5811c0M1170a = this.f1810b.f1777d.m1170a(c5811c0);
        C7164o<R> c7164o2 = this.f1810b.f1774a;
        C7173p c7173p2 = this.f1809a;
        c7164o2.getClass();
        try {
            C7237w0 c7237w0 = C7164o.f3028g;
            EnumC5943Q3 enumC5943Q3 = EnumC5943Q3.INFO;
            c7237w0.m1635a(enumC5943Q3, "device descriptor=" + c5811c0M1170a, new Object[0]);
            String str = (String) C7164o.m1567a(EnumC5954R6.START, c7164o2.f3031c, new C7129l(c5811c0M1170a), c7173p2);
            c7237w0.m1635a(enumC5943Q3, "auth url=" + str, new Object[0]);
            if (c5811c0M1170a.f1290b != null) {
                throw new C7191r(EnumC5954R6.AUTHENTICATION);
            }
            HashMap mapM1619a = C7216t6.m1619a(str);
            if (mapM1619a != null) {
                c7237w0.m1635a(enumC5943Q3, "use remote features: " + mapM1619a, new Object[0]);
                c7173p2.f3084f = c7173p2.f3084f.m1487a(mapM1619a);
            }
            String str2 = (String) C7164o.m1567a(EnumC5954R6.AUTHENTICATION, c7164o2.f3032d, new C7146m(interfaceC7184q12, str), c7173p2);
            c7237w0.m1635a(enumC5943Q3, "vfp=" + str2, new Object[0]);
            return str2;
        } catch (C7191r e) {
            c7164o2.f3034f.m1513a();
            throw e;
        }
    }
}
