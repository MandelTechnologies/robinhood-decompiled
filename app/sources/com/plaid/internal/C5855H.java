package com.plaid.internal;

import android.util.Base64;
import com.singular.sdk.internal.Constants;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.H */
/* loaded from: classes16.dex */
public final class C5855H {
    /* renamed from: a */
    public static String m1208a(C7191r c7191r, C7173p c7173p) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (InterfaceC7200s interfaceC7200s : c7173p.f3081c) {
                jSONArray.put(new JSONObject().put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, C7059d7.m1492a(interfaceC7200s.mo1573b())).put(Constants.RequestParamsKeys.SESSION_ID_KEY, interfaceC7200s.mo1572a()));
            }
            String str = c7173p.f3083e;
            if (str != null) {
                jSONObject.put("cid", C7059d7.m1492a(str));
            }
            EnumC5954R6 enumC5954R6 = c7191r.f3144a;
            if (enumC5954R6 != null) {
                jSONObject.put("st", enumC5954R6.getCode());
            }
            if (c7191r.m1577a() != null) {
                jSONObject.put("er", c7191r.m1577a().getCode());
            }
            jSONObject.put("os", "and").put("v", 20901).put("fl", c7173p.f3082d).put("rq", jSONArray);
        } catch (JSONException unused) {
        }
        return Base64.encodeToString(("client-error:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
    }
}
