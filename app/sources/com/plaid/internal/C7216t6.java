package com.plaid.internal;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.plaid.internal.t6 */
/* loaded from: classes16.dex */
public final class C7216t6 {
    /* renamed from: a */
    public static HashMap m1619a(String str) {
        String str2;
        if (str != null && (str2 = (String) AbstractC7220u1.m1623b(str).get("pfcfg")) != null) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str2, 8)));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.get(next));
                }
                return map;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
