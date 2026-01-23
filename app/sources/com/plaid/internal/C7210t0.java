package com.plaid.internal;

import com.plaid.internal.InterfaceC7184q1;
import java.io.IOException;

/* renamed from: com.plaid.internal.t0 */
/* loaded from: classes16.dex */
public final class C7210t0 implements InterfaceC5946Q6 {

    /* renamed from: a */
    public final String f3209a = "https://device.payfone.com:4443/whatismyipaddress";

    @Override // com.plaid.internal.InterfaceC5946Q6
    /* renamed from: a */
    public final C7091h mo1296a(Object obj, C7173p c7173p) {
        InterfaceC5829E0 interfaceC5829E0 = (InterfaceC5829E0) obj;
        C5811C0 c5811c0Mo1183b = interfaceC5829E0.mo1183b();
        if (c5811c0Mo1183b != null && c5811c0Mo1183b.f1290b != null) {
            return C7091h.m1518a(c5811c0Mo1183b);
        }
        if (c5811c0Mo1183b != null && !"_auto_detect_".equals(c5811c0Mo1183b.f1289a)) {
            return C7091h.m1518a(c5811c0Mo1183b);
        }
        try {
            return C7091h.m1518a(m1614a(c5811c0Mo1183b, interfaceC5829E0.mo1182a()));
        } catch (C7182q e) {
            return C7091h.m1517a((Exception) e);
        }
    }

    /* renamed from: a */
    public final C5811C0 m1614a(C5811C0 c5811c0, InterfaceC7184q1 interfaceC7184q1) throws C7182q {
        String strReplaceAll;
        try {
            InterfaceC7184q1.b bVarMo1280a = interfaceC7184q1.mo1280a(new InterfaceC7184q1.a(this.f3209a, false, null, -1));
            int i = bVarMo1280a.f3123b;
            if (i < 200 || i >= 300) {
                strReplaceAll = null;
            } else {
                strReplaceAll = bVarMo1280a.f3122a;
                if (strReplaceAll != null) {
                    strReplaceAll = strReplaceAll.replaceAll("[^0-9.:a-fA-F]", "");
                }
            }
            if (strReplaceAll == null || strReplaceAll.length() > 64) {
                throw new C7182q(EnumC5957S0.GENERIC_COMMUNICATION_ERROR, "API failed to provide a valid device IP address");
            }
            if (c5811c0 == null) {
                return new C5811C0(strReplaceAll, null, null);
            }
            return new C5811C0(strReplaceAll, c5811c0.f1290b, c5811c0.f1291c);
        } catch (IOException unused) {
            throw new C7182q(EnumC5957S0.GENERIC_COMMUNICATION_ERROR, "No response received from URL.");
        }
    }
}
