package com.plaid.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.plaid.link.C7279R;
import com.plaid.link.Plaid;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.C5 */
/* loaded from: classes16.dex */
public final class C5816C5 {

    /* renamed from: a */
    public final Application f1299a;

    public C5816C5(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f1299a = application;
    }

    /* renamed from: a */
    public final String m1169a() {
        Bundle bundle = this.f1299a.getPackageManager().getApplicationInfo(this.f1299a.getPackageName(), 128).metaData;
        String string2 = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        if (string2 != null) {
            String string3 = this.f1299a.getString(C7279R.string.plaid_user_agent_string_format_react_native, string2, Plaid.getVERSION_NAME(), this.f1299a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = this.f1299a.getString(C7279R.string.plaid_user_agent_string_format_android, Plaid.getVERSION_NAME(), this.f1299a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }
}
