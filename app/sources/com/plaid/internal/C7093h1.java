package com.plaid.internal;

import android.util.Base64;
import com.plaid.internal.C7173p;
import com.plaid.internal.InterfaceC7184q1;
import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.h1 */
/* loaded from: classes16.dex */
public final class C7093h1 implements InterfaceC7073f1 {

    /* renamed from: b */
    public static final C7237w0 f2824b;

    /* renamed from: a */
    public final String f2825a;

    public C7093h1(String str) {
        this.f2825a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r12 = com.plaid.internal.C7093h1.f2824b;
        r12.m1635a(com.plaid.internal.EnumC5943Q3.INFO, "error response code: %d %s", java.lang.Integer.valueOf(r7), r0.f3124c);
        r12.m1635a(com.plaid.internal.EnumC5943Q3.DEBUG, "error response body: %s", r0.f3122a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0178, code lost:
    
        if (r7 == 404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017c, code lost:
    
        if (r7 == 410) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0193, code lost:
    
        throw new com.plaid.internal.C7182q(com.plaid.internal.EnumC5957S0.AUTH_INVALID_RESPONSE, "Unsupported response status=" + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
    
        throw new com.plaid.internal.C7182q(com.plaid.internal.EnumC5957S0.AUTH_VFP_KEY_EXPIRED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a3, code lost:
    
        throw new com.plaid.internal.C7182q(com.plaid.internal.EnumC5957S0.AUTH_BAD_CREDENTIALS);
     */
    @Override // com.plaid.internal.InterfaceC7073f1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo1502a(InterfaceC7184q1 interfaceC7184q1, C7173p c7173p) throws C7182q {
        c7173p.f3082d = "v1";
        String str = this.f2825a;
        String str2 = (String) AbstractC7220u1.m1623b(str).get("cid");
        if (str2 == null) {
            LinkedHashMap linkedHashMapM1623b = AbstractC7220u1.m1623b(str);
            String str3 = (String) linkedHashMapM1623b.get("vfp");
            str2 = str3 == null ? (String) linkedHashMapM1623b.get("token") : str3;
        }
        c7173p.f3083e = str2;
        LinkedHashMap linkedHashMapM1623b2 = AbstractC7220u1.m1623b(this.f2825a);
        String str4 = (String) linkedHashMapM1623b2.get("vfp");
        if (str4 == null) {
            str4 = (String) linkedHashMapM1623b2.get("token");
        }
        int i = 0;
        while (true) {
            try {
                C7173p.a aVar = new C7173p.a(str);
                c7173p.f3081c.add(aVar);
                InterfaceC7184q1.b bVarMo1280a = interfaceC7184q1.mo1280a(new InterfaceC7184q1.a(str, false, null, ((Number) c7173p.f3084f.m1488a("connection-timeout", 10000, Number.class)).intValue()));
                int i2 = bVarMo1280a.f3123b;
                aVar.f3086b = i2;
                if (i2 >= 200 && i2 <= 202) {
                    if (c7173p.f3084f.m1490a("forward-mno-response")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", bVarMo1280a.f3123b);
                            jSONObject.put("statusText", bVarMo1280a.f3124c);
                            jSONObject.put("headers", new JSONObject((Map<?, ?>) bVarMo1280a.f3125d));
                            jSONObject.put(CarResultComposable2.BODY, bVarMo1280a.f3122a);
                            return Base64.encodeToString(("mno-resp:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
                        } catch (JSONException e) {
                            throw new C7182q(EnumC5957S0.GENERIC_UNKNOWN_REASON, e);
                        }
                    }
                    String str5 = bVarMo1280a.f3122a;
                    try {
                        String strM1520a = m1520a(new JSONObject(str5));
                        if (strM1520a != null) {
                            return strM1520a;
                        }
                        throw new C7182q(EnumC5957S0.AUTH_INVALID_RESPONSE, "Received unknown payload: " + str5);
                    } catch (JSONException e2) {
                        throw new C7182q(EnumC5957S0.AUTH_INVALID_RESPONSE, e2);
                    }
                }
                if (i2 < 300 || i2 >= 400) {
                    break;
                }
                i++;
                if (i > 10) {
                    throw new C7182q(EnumC5957S0.GENERIC_COMMUNICATION_ERROR, "too many redirects");
                }
                str = bVarMo1280a.f3125d.get("location");
                if (!c7173p.f3084f.m1490a("skip-vfp-detection")) {
                    LinkedHashMap linkedHashMapM1623b3 = AbstractC7220u1.m1623b(str);
                    String str6 = (String) linkedHashMapM1623b3.get("vfp");
                    String str7 = str6 == null ? (String) linkedHashMapM1623b3.get("token") : str6;
                    if (str4 == null) {
                        str4 = str7;
                    } else if (str7 != null && !str7.equals(str4)) {
                        f2824b.m1635a(EnumC5943Q3.DEBUG, "jumping out of redirect loop with different vfp: %s", str7);
                        return str7;
                    }
                }
            } catch (IOException e3) {
                throw new C7182q(EnumC5957S0.GENERIC_COMMUNICATION_ERROR, e3);
            }
        }
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f2824b = new C7237w0("flowV1");
    }

    /* renamed from: a */
    public static String m1520a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("vfp");
        if (!strOptString.isEmpty()) {
            return strOptString;
        }
        String strOptString2 = jSONObject.optString("token");
        String strOptString3 = jSONObject.optString("correlation_id");
        if (!strOptString2.isEmpty()) {
            if (strOptString3.isEmpty()) {
                return strOptString2;
            }
            return strOptString3 + "..." + strOptString2;
        }
        String strOptString4 = jSONObject.optString("reconcilation_token");
        if (strOptString4.isEmpty()) {
            return null;
        }
        if (strOptString3.isEmpty()) {
            return strOptString4;
        }
        return strOptString3 + "..." + strOptString4;
    }
}
