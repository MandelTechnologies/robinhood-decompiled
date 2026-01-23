package com.plaid.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.plaid.internal.C5953R5;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.plaid.internal.J4 */
/* loaded from: classes16.dex */
public final class C5878J4 extends C7236w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5878J4(C5996W3 urlInterceptor) {
        super(urlInterceptor);
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(view, i, description, failingUrl);
        if (400 > i || i >= 500 || i == 408 || i == 404) {
            C5953R5.a.m1306b(C5953R5.f1671a, new C7097h5(description), "onReceivedError");
        } else {
            C5953R5.a.m1302a(C5953R5.f1671a, new C7097h5(description), "onReceivedError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = url.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "/favicon.ico", false, 2, (Object) null)) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e) {
                C5953R5.a.m1302a(C5953R5.f1671a, e, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null) {
            return false;
        }
        try {
            return this.f3271a.mo1142a(str);
        } catch (Exception e) {
            C5953R5.a.m1301a(C5953R5.f1671a, e);
            return true;
        }
    }
}
