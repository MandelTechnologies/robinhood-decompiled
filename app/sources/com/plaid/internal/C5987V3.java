package com.plaid.internal;

import com.plaid.internal.C5953R5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.V3 */
/* loaded from: classes16.dex */
public final class C5987V3 {
    /* renamed from: a */
    public static final String m1330a(Map<String, String> map, String key, String str) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        String str2 = map.get(key);
        if (str2 != null) {
            return str2;
        }
        C5953R5.a.m1304b(C5953R5.f1671a, "Missing field: " + key);
        return str;
    }
}
