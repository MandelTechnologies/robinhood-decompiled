package com.plaid.internal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.plaid.internal.d1 */
/* loaded from: classes16.dex */
public final class C7053d1 {

    /* renamed from: b */
    public static final C7237w0 f2719b;

    /* renamed from: c */
    public static final C7053d1 f2720c;

    /* renamed from: a */
    public final LinkedHashMap f2721a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1489a(String str, Object obj) {
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            f2719b.m1635a(EnumC5943Q3.INFO, "set feature %s=%s", str, obj);
            this.f2721a.put(str, obj);
        } else {
            f2719b.m1635a(EnumC5943Q3.WARN, "ignore feature %s of type %s", str, obj == null ? "null" : obj.getClass().getSimpleName());
        }
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f2719b = new C7237w0("features");
        f2720c = new C7053d1();
    }

    /* renamed from: a */
    public final boolean m1490a(String str) {
        Object objM1488a = m1488a(str, null, Object.class);
        if (objM1488a instanceof Boolean) {
            return Boolean.TRUE.equals(objM1488a);
        }
        return objM1488a instanceof Number ? ((Number) objM1488a).intValue() != 0 : objM1488a != null;
    }

    /* renamed from: a */
    public final Object m1488a(String str, Object obj, Class<?> cls) {
        Object obj2 = !str.startsWith("android.") ? this.f2721a.get("android.".concat(str)) : null;
        if (obj2 == null) {
            obj2 = this.f2721a.get(str);
        }
        return cls.isInstance(obj2) ? obj2 : obj;
    }

    /* renamed from: a */
    public final C7053d1 m1487a(HashMap map) {
        C7053d1 c7053d1 = new C7053d1();
        LinkedHashMap linkedHashMap = this.f2721a;
        c7053d1.f2721a.clear();
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c7053d1.m1489a((String) entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            c7053d1.m1489a((String) entry2.getKey(), entry2.getValue());
        }
        return c7053d1;
    }
}
