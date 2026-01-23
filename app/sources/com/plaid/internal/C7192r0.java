package com.plaid.internal;

import com.singular.sdk.internal.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

/* renamed from: com.plaid.internal.r0 */
/* loaded from: classes16.dex */
public final class C7192r0 implements InterfaceC5946Q6 {

    /* renamed from: a */
    public static final C7237w0 f3145a;

    @Override // com.plaid.internal.InterfaceC5946Q6
    /* renamed from: a */
    public final C7091h mo1296a(Object obj, C7173p c7173p) {
        try {
            return C7091h.m1518a(m1578a((InterfaceC7209t) obj, c7173p));
        } catch (Exception e) {
            return C7091h.m1517a(e);
        }
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f3145a = new C7237w0("auth");
    }

    /* renamed from: a */
    public static String m1578a(InterfaceC7209t interfaceC7209t, C7173p c7173p) throws C7182q, NumberFormatException {
        InterfaceC7073f1 c7093h1;
        long j;
        String strMo1561b = interfaceC7209t.mo1561b();
        LinkedHashMap linkedHashMapM1623b = AbstractC7220u1.m1623b(strMo1561b);
        if (linkedHashMapM1623b.containsKey("testVfp")) {
            LinkedHashMap linkedHashMapM1623b2 = AbstractC7220u1.m1623b(strMo1561b);
            try {
                j = Long.parseLong((String) linkedHashMapM1623b2.get("delay"));
            } catch (Exception unused) {
                j = 0;
            }
            String str = (String) linkedHashMapM1623b2.get("testVfp");
            String str2 = (String) AbstractC7220u1.m1623b(strMo1561b).get("cid");
            if (str2 == null) {
                LinkedHashMap linkedHashMapM1623b3 = AbstractC7220u1.m1623b(strMo1561b);
                str2 = (String) linkedHashMapM1623b3.get("vfp");
                if (str2 == null) {
                    str2 = (String) linkedHashMapM1623b3.get("token");
                }
            }
            c7093h1 = new C7083g1(j, str, str2);
        } else if (Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED.equals((String) linkedHashMapM1623b.get("pfflow"))) {
            f3145a.m1635a(EnumC5943Q3.INFO, "flow v2 detected", new Object[0]);
            c7093h1 = C7103i1.m1526a(strMo1561b);
        } else {
            f3145a.m1635a(EnumC5943Q3.INFO, "flow v1 detected", new Object[0]);
            C7237w0 c7237w0 = C7093h1.f2824b;
            if (!"f".equals(AbstractC7220u1.m1623b(strMo1561b).get(Constants.REVENUE_AMOUNT_KEY))) {
                StringBuilder sb = new StringBuilder();
                sb.append(strMo1561b);
                sb.append(strMo1561b.indexOf(63) == -1 ? "?" : "&");
                sb.append("r=f");
                strMo1561b = sb.toString();
            }
            try {
                new URL(strMo1561b);
                c7093h1 = new C7093h1(strMo1561b);
            } catch (MalformedURLException unused2) {
                throw new C7182q(EnumC5957S0.AUTH_MALFORMED_INPUT_DATA, "Malformed url " + strMo1561b);
            }
        }
        return c7093h1.mo1502a(interfaceC7209t.mo1560a(), c7173p);
    }
}
