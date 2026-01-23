package com.plaid.internal;

import androidx.browser.customtabs.CustomTabsCallback;
import com.plaid.internal.InterfaceC7184q1;
import java.io.IOException;

/* renamed from: com.plaid.internal.s0 */
/* loaded from: classes16.dex */
public final class C7201s0 {

    /* renamed from: a */
    public final C7237w0 f3169a;

    /* renamed from: b */
    public final String f3170b;

    /* renamed from: c */
    public final int f3171c;

    public C7201s0() {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        this.f3169a = new C7237w0("connectivity-validator");
        this.f3170b = "https://clients3.google.com/generate_204";
        this.f3171c = 10000;
    }

    /* renamed from: a */
    public final boolean m1601a(C6038b c6038b) {
        boolean z;
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            z = false;
            try {
                InterfaceC7184q1.b bVarMo1280a = c6038b.mo1280a(new InterfaceC7184q1.a(this.f3170b, false, null, -1));
                this.f3169a.m1635a(EnumC5943Q3.TRACE, "response status " + bVarMo1280a.f3123b, new Object[0]);
                int i2 = bVarMo1280a.f3123b;
                if (i2 >= 200 && i2 < 300) {
                    z = true;
                }
            } catch (IOException e) {
                this.f3169a.m1636a(e, "cannot reach test endpoint");
            }
            if (z || ((i = this.f3171c) > 0 && i + jCurrentTimeMillis <= System.currentTimeMillis())) {
                break;
            }
        }
        this.f3169a.m1635a(EnumC5943Q3.TRACE, "httpclient %s", z ? CustomTabsCallback.ONLINE_EXTRAS_KEY : "offline");
        return z;
    }
}
