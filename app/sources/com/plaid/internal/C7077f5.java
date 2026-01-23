package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.plaid.internal.C5953R5;
import com.plaid.internal.EnumC6054c5;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.f5 */
/* loaded from: classes16.dex */
public final class C7077f5 implements InterfaceC6001X {

    /* renamed from: a */
    public final Application f2769a;

    /* renamed from: b */
    public final Lazy f2770b;

    public C7077f5(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2769a = context;
        this.f2770b = LazyKt.lazy(new C7067e5(this));
    }

    /* renamed from: a */
    public final void m1503a(EnumC6054c5 environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        ((SharedPreferences) this.f2770b.getValue()).edit().putString("plaid_environment", environment.getJson()).apply();
    }

    /* renamed from: b */
    public final EnumC6054c5 m1504b() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2770b.getValue();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "<get-sharedPrefs>(...)");
        String strM1212a = C5862H6.m1212a(sharedPreferences, EnumC6054c5.SANDBOX.getJson());
        try {
            EnumC6054c5.Companion.getClass();
            return EnumC6054c5.a.m1379a(strM1212a);
        } catch (Exception e) {
            C5953R5.a.m1305b(C5953R5.f1671a, "Unknown value was stored in shared prefs: " + strM1212a, new Object[]{e});
            return EnumC6054c5.SANDBOX;
        }
    }

    @Override // com.plaid.internal.InterfaceC6001X
    /* renamed from: a */
    public final String mo1349a() {
        return m1504b().name();
    }
}
