package com.plaid.internal;

import android.app.Application;
import android.webkit.WebView;
import com.plaid.internal.C5953R5;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.H5 */
/* loaded from: classes16.dex */
public final class C5861H5 {

    /* renamed from: a */
    public final Application f1376a;

    /* renamed from: b */
    public C5927O5 f1377b;

    public C5861H5(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f1376a = application;
    }

    /* renamed from: a */
    public final void m1209a() {
        C5953R5.a.m1308d(C5953R5.f1671a, "Destroying webview " + this.f1377b);
        C5927O5 c5927o5 = this.f1377b;
        if (c5927o5 != null && !c5927o5.m1277a().getAndSet(true)) {
            c5927o5.destroy();
        }
        this.f1377b = null;
    }

    /* renamed from: b */
    public final C5927O5 m1210b() {
        C5953R5.a.m1308d(C5953R5.f1671a, "Creating webview");
        if ((this.f1376a.getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C5927O5 c5927o5 = new C5927O5(this.f1376a);
        this.f1377b = c5927o5;
        Intrinsics.checkNotNull(c5927o5);
        return c5927o5;
    }

    /* renamed from: c */
    public final C5927O5 m1211c() {
        C5953R5.a.m1308d(C5953R5.f1671a, "Returning webview " + this.f1377b);
        C5927O5 c5927o5M1210b = this.f1377b;
        if (c5927o5M1210b == null) {
            c5927o5M1210b = m1210b();
        }
        this.f1377b = null;
        return c5927o5M1210b;
    }
}
