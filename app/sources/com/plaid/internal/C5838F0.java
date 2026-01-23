package com.plaid.internal;

import android.app.Application;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.F0 */
/* loaded from: classes16.dex */
public final class C5838F0 {
    /* renamed from: a */
    public static String m1193a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return Settings.Secure.getString(application.getApplicationContext().getContentResolver(), "android_id");
    }
}
