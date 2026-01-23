package com.plaid.internal;

import android.util.Base64;
import com.plaid.internal.C7173p;
import com.plaid.internal.InterfaceC7184q1;
import com.robinhood.android.doc.DocUploadParentFragment;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.i1 */
/* loaded from: classes16.dex */
public final class C7103i1 implements InterfaceC7073f1 {

    /* renamed from: e */
    public static final C7237w0 f2845e;

    /* renamed from: a */
    public final String f2846a;

    /* renamed from: b */
    public final String f2847b;

    /* renamed from: c */
    public final JSONObject f2848c;

    /* renamed from: d */
    public final JSONObject f2849d;

    public C7103i1(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f2846a = str;
        this.f2847b = str2;
        this.f2848c = jSONObject;
        this.f2849d = jSONObject2;
    }

    /* renamed from: a */
    public static C7103i1 m1526a(String str) {
        String str2 = (String) AbstractC7220u1.m1623b(str).get(WebsocketGatewayConstants.DATA_KEY);
        if (str2 == null) {
            throw new C7182q(EnumC5957S0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing in url");
        }
        try {
            String str3 = new String(Base64.decode(str2, 8));
            f2845e.m1635a(EnumC5943Q3.TRACE, "decoded data: %s", str3);
            JSONObject jSONObject = new JSONObject(str3);
            try {
                String string2 = jSONObject.getString("url");
                try {
                    String string3 = jSONObject.getString("vfp");
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(WebsocketGatewayConstants.DATA_KEY);
                        try {
                            new URL(string2);
                            return new C7103i1(string2, string3, jSONObject2, jSONObject.optJSONObject("att-1004"));
                        } catch (MalformedURLException unused) {
                            throw new C7182q(EnumC5957S0.AUTH_MALFORMED_INPUT_DATA, "Malformed url " + string2);
                        }
                    } catch (JSONException unused2) {
                        throw new C7182q(EnumC5957S0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing data field");
                    }
                } catch (JSONException unused3) {
                    throw new C7182q(EnumC5957S0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing vfp field");
                }
            } catch (JSONException unused4) {
                throw new C7182q(EnumC5957S0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - missing url field");
            }
        } catch (Exception unused5) {
            throw new C7182q(EnumC5957S0.AUTH_MALFORMED_INPUT_DATA, "Invalid flow.v2 data - cannot parse as json");
        }
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f2845e = new C7237w0("flowV2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        if (r6 < 300) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010c, code lost:
    
        if (r6 < 400) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        throw new com.plaid.internal.C7182q(com.plaid.internal.EnumC5957S0.AUTH_INVALID_RESPONSE, "Unexpected redirect in flow v2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        r5.m1635a(com.plaid.internal.EnumC5943Q3.INFO, "error response code: %i %s", java.lang.Integer.valueOf(r6), r3.f3124c);
        r5.m1635a(com.plaid.internal.EnumC5943Q3.DEBUG, "error response body: %s", r3.f3122a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
    
        if (r6 == 404) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        if (r6 == 410) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        throw new com.plaid.internal.C7182q(com.plaid.internal.EnumC5957S0.AUTH_INVALID_RESPONSE, "Unsupported response status=" + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
    
        throw new com.plaid.internal.C7182q(com.plaid.internal.EnumC5957S0.AUTH_VFP_KEY_EXPIRED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
    
        throw new com.plaid.internal.C7182q(com.plaid.internal.EnumC5957S0.AUTH_BAD_CREDENTIALS);
     */
    @Override // com.plaid.internal.InterfaceC7073f1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo1502a(InterfaceC7184q1 interfaceC7184q1, C7173p c7173p) throws C7182q {
        String str;
        c7173p.f3082d = DocUploadParentFragment.V2_TAG;
        String str2 = this.f2846a;
        String str3 = (String) AbstractC7220u1.m1623b(str2).get("cid");
        if (str3 == null) {
            LinkedHashMap linkedHashMapM1623b = AbstractC7220u1.m1623b(str2);
            str3 = (String) linkedHashMapM1623b.get("vfp");
            if (str3 == null) {
                str3 = (String) linkedHashMapM1623b.get("token");
            }
        }
        c7173p.f3083e = str3;
        JSONObject jSONObject = this.f2848c;
        boolean z = false;
        while (true) {
            C7173p.a aVar = new C7173p.a(this.f2846a);
            c7173p.f3081c.add(aVar);
            try {
                String string2 = jSONObject.toString();
                C7237w0 c7237w0 = f2845e;
                EnumC5943Q3 enumC5943Q3 = EnumC5943Q3.TRACE;
                c7237w0.m1635a(enumC5943Q3, "att request body: %s", string2);
                InterfaceC7184q1.b bVarMo1280a = interfaceC7184q1.mo1280a(new InterfaceC7184q1.a(this.f2846a, true, string2, ((Number) c7173p.f3084f.m1488a("connection-timeout-att", 10000, Number.class)).intValue()));
                int i = bVarMo1280a.f3123b;
                aVar.f3086b = i;
                if (i >= 200 && i <= 202) {
                    str = bVarMo1280a.f3122a;
                    c7237w0.m1635a(enumC5943Q3, "att response body: %s", str);
                    if (z) {
                        break;
                    }
                    try {
                        if (new JSONObject(str).optInt("status", -1) != 1004) {
                            break;
                        }
                        JSONObject jSONObject2 = this.f2849d;
                        String strOptString = jSONObject2 == null ? null : jSONObject2.optString("application-id");
                        if (strOptString == null) {
                            c7237w0.m1635a(EnumC5943Q3.DEBUG, "missing att1004.application-id, continue flow v2", new Object[0]);
                            break;
                        }
                        c7237w0.m1635a(EnumC5943Q3.DEBUG, "flow v2.5 detected, use application-id: %s", strOptString);
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
                            try {
                                jSONObject3.putOpt("application-id", strOptString);
                                jSONObject = jSONObject3;
                                z = true;
                            } catch (JSONException e) {
                                throw new IllegalStateException(e);
                            }
                        } catch (JSONException e2) {
                            throw new IllegalStateException(e2);
                        }
                    } catch (JSONException unused) {
                    }
                } else {
                    break;
                }
            } catch (IOException e3) {
                throw new C7182q(EnumC5957S0.GENERIC_COMMUNICATION_ERROR, e3);
            }
        }
        String strEncodeToString = Base64.encodeToString(str.getBytes(), 10);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2847b);
        sb.append("___");
        sb.append(strEncodeToString);
        sb.append(z ? "___R2" : "");
        return sb.toString();
    }
}
