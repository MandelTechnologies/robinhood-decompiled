package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.singular.sdk.internal.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes16.dex */
public class Signer {

    /* renamed from: a */
    public boolean f568a = false;

    /* renamed from: b */
    public C4752d f569b;

    /* renamed from: c */
    public InterfaceC4749a f570c;

    /* renamed from: d */
    public C4751c f571d;

    public static String getVersion() {
        return "3.35.2";
    }

    /* renamed from: a */
    public final synchronized void m761a() {
        if (this.f568a) {
            return;
        }
        this.f569b = new C4752d();
        this.f571d = new C4751c(Build.VERSION.SDK_INT);
        this.f570c = new NativeLibHelper();
        this.f568a = true;
    }

    public synchronized void onResume() {
        m761a();
        C4752d c4752d = this.f569b;
        InterfaceC4749a interfaceC4749a = this.f570c;
        c4752d.getClass();
        if (!C4752d.f573a) {
            ((NativeLibHelper) interfaceC4749a).m759a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        m761a();
        C4752d c4752d = this.f569b;
        C4751c c4751c = this.f571d;
        InterfaceC4749a interfaceC4749a = this.f570c;
        c4752d.getClass();
        C4752d.m765a(context, c4751c, interfaceC4749a, map, str, str2);
    }

    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        try {
            m761a();
            C4752d c4752d = this.f569b;
            C4751c c4751c = this.f571d;
            InterfaceC4749a interfaceC4749a = this.f570c;
            c4752d.getClass();
            if (map == null || map.size() == 0 || map2 == null || map3 == null) {
                Log.e("SignerInstance", "sign: One or more parameters are null");
            } else {
                HashMap map4 = new HashMap();
                C4752d.m766a(map.keySet(), map, map4);
                String str = map2.get("activity_kind");
                String str2 = map2.get("client_sdk");
                if ("b".equals(map2.get(Constants.RequestParamsKeys.DEVELOPER_API_KEY))) {
                    C4752d.m766a(map.keySet(), map, map3);
                    C4752d.m766a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                } else {
                    C4752d.m765a(context, c4751c, interfaceC4749a, map4, str, str2);
                    if (map4.containsKey("signature") && map4.containsKey("adj_signing_id") && map4.containsKey("headers_id") && map4.containsKey("algorithm") && map4.containsKey("native_version")) {
                        String str3 = (String) map4.get("adj_signing_id");
                        String str4 = (String) map4.get("headers_id");
                        String str5 = (String) map4.get("signature");
                        String str6 = (String) map4.get("algorithm");
                        String str7 = (String) map4.get("native_version");
                        Locale locale = Locale.US;
                        String str8 = "algorithm=\"" + str6 + "\"";
                        map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str8 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + str7 + "\""));
                        C4752d.m766a(map.keySet(), map, map3);
                        C4752d.m766a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                    }
                    Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
