package com.plaid.internal;

import com.plaid.internal.C5953R5;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.K5 */
/* loaded from: classes16.dex */
public final class RunnableC5888K5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5927O5 f1434a;

    public RunnableC5888K5(C5927O5 c5927o5) {
        this.f1434a = c5927o5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5927O5 webView = this.f1434a;
        webView.f1592b.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("JS send Link is shown", true);
        webView.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"open\", \"data\": {}}')");
    }
}
