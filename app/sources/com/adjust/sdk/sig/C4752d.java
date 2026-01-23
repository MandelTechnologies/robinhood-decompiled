package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.adjust.sdk.sig.d */
/* loaded from: classes16.dex */
public final class C4752d {

    /* renamed from: a */
    public static boolean f573a = false;

    /* renamed from: a */
    public static void m766a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m765a(Context context, C4751c c4751c, InterfaceC4749a interfaceC4749a, Map map, String str, String str2) throws Exception {
        byte[] bArrM763a;
        if (f573a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.size() == 0 || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            if (i <= 0) {
                bArrM763a = null;
                break;
            }
            try {
                c4751c.m764b(context);
                bArrM763a = c4751c.m763a(context, map.toString().getBytes("UTF-8"));
                break;
            } catch (C4750b e) {
                Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                f573a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (InvalidKeyException e2) {
                e = e2;
            } catch (UnrecoverableKeyException e3) {
                e = e3;
            } catch (Exception e4) {
                Log.e("SignerInstance", "sign: Received an Exception: " + e4.getMessage(), e4);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e4;
            }
            Log.e("SignerInstance", "sign: Received a retriable exception: " + e.getMessage(), e);
            Log.e("SignerInstance", "sign: Attempting retry #" + i);
            i += -1;
            c4751c.m762a(context);
        }
        if (i == 0) {
            f573a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        byte[] bArrM760a = ((NativeLibHelper) interfaceC4749a).m760a(context, map, bArrM763a, c4751c.f572a);
        if (bArrM760a == null) {
            Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = bArrM760a.length;
        char[] cArr = AbstractC4753e.f574a;
        char[] cArr2 = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b = bArrM760a[i2];
            int i3 = i2 * 2;
            char[] cArr3 = AbstractC4753e.f574a;
            cArr2[i3] = cArr3[(b & 255) >>> 4];
            cArr2[i3 + 1] = cArr3[b & 15];
        }
        map.put("signature", new String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
    }
}
