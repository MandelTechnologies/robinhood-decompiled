package com.plaid.internal;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.plaid.internal.q1 */
/* loaded from: classes16.dex */
public interface InterfaceC7184q1 {

    /* renamed from: com.plaid.internal.q1$a */
    public static class a {

        /* renamed from: a */
        public final String f3118a;

        /* renamed from: b */
        public final boolean f3119b;

        /* renamed from: c */
        public final int f3120c;

        /* renamed from: d */
        public final String f3121d;

        public a(String str, boolean z, String str2, int i) {
            this.f3118a = str;
            this.f3119b = z;
            this.f3121d = str2;
            this.f3120c = i;
        }
    }

    /* renamed from: com.plaid.internal.q1$b */
    public static class b {

        /* renamed from: a */
        public final String f3122a;

        /* renamed from: b */
        public final int f3123b;

        /* renamed from: c */
        public final String f3124c;

        /* renamed from: d */
        public final Map<String, String> f3125d;

        public b(int i, String str, String str2, Map<String, List<String>> map) {
            this.f3122a = str2;
            this.f3123b = i;
            this.f3124c = str;
            HashMap map2 = new HashMap();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    map2.put(entry.getKey().toLowerCase(), TextUtils.join(", ", entry.getValue()));
                }
            }
            this.f3125d = Collections.unmodifiableMap(map2);
        }
    }

    /* renamed from: a */
    b mo1280a(a aVar);

    /* renamed from: a */
    void mo1281a();

    EnumC7264z isConnected();
}
