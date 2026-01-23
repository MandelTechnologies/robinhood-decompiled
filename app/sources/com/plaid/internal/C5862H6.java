package com.plaid.internal;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.H6 */
/* loaded from: classes16.dex */
public final class C5862H6 {
    /* renamed from: a */
    public static final String m1212a(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter("plaid_environment", "key");
        Intrinsics.checkNotNullParameter(str, "default");
        String string2 = sharedPreferences.getString("plaid_environment", str);
        return string2 == null ? str : string2;
    }
}
