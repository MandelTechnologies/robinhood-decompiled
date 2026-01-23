package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.G4 */
/* loaded from: classes16.dex */
public final class C5851G4 {
    /* renamed from: a */
    public static String m1207a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("link_persistent_uuid", 0);
        String string2 = sharedPreferences.getString("link_persistent_uuid", "");
        if (string2 != null && string2.length() != 0) {
            return string2;
        }
        String string3 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sharedPreferences.edit().putString("link_persistent_uuid", string3).apply();
        return string3;
    }
}
