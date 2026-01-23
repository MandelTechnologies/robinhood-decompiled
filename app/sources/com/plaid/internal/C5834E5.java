package com.plaid.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.plaid.internal.C5953R5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@TargetApi(24)
/* renamed from: com.plaid.internal.E5 */
/* loaded from: classes16.dex */
public final class C5834E5 extends C7236w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5834E5(C5996W3 urlInterceptor) {
        super(urlInterceptor);
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        int errorCode = errorResponse.getErrorCode();
        if (400 > errorCode || errorCode >= 500 || errorCode == 408 || errorCode == 404) {
            C5953R5.a.m1306b(C5953R5.f1671a, new C7097h5(C7099h7.m1524a(errorResponse)), "onReceivedError");
        } else {
            C5953R5.a.m1302a(C5953R5.f1671a, new C7097h5(C7099h7.m1524a(errorResponse)), "onReceivedError");
        }
        super.onReceivedError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        String path;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        if (!request.isForMainFrame() && (path = request.getUrl().getPath()) != null && StringsKt.endsWith$default(path, "/favicon.ico", false, 2, (Object) null)) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e) {
                C5953R5.a.m1302a(C5953R5.f1671a, e, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            C5996W3 c5996w3 = this.f3271a;
            String string2 = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return c5996w3.mo1142a(string2);
        } catch (Exception e) {
            C5953R5.a.m1301a(C5953R5.f1671a, e);
            return true;
        }
    }
}
