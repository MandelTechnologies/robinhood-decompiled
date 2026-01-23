package com.plaid.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.plaid.internal.C5953R5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.w */
/* loaded from: classes16.dex */
public class C7236w extends WebViewClient {

    /* renamed from: a */
    public final C5996W3 f3271a;

    /* renamed from: b */
    public String f3272b;

    @DebugMetadata(m3644c = "com.plaid.core.webview.BasePlaidWebViewClient$onPageFinished$1", m3645f = "WebViewClients.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.w$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CookieManager.getInstance().flush();
            return Unit.INSTANCE;
        }
    }

    public C7236w(C5996W3 urlInterceptor) {
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
        this.f3271a = urlInterceptor;
        this.f3272b = "";
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            cookie = "";
        }
        if (Intrinsics.areEqual(cookie, this.f3272b)) {
            return;
        }
        this.f3272b = cookie;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getIO(), null, new a(null), 2, null);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        int statusCode = errorResponse.getStatusCode();
        if (400 > statusCode || statusCode >= 500 || statusCode == 408 || statusCode == 404) {
            C5953R5.a.m1306b(C5953R5.f1671a, new C7097h5(C7109i7.m1532a(errorResponse)), "onReceivedHttpError");
        } else {
            C5953R5.a.m1306b(C5953R5.f1671a, new C7097h5(C7109i7.m1532a(errorResponse)), "onReceivedHttpError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        C5953R5.a.m1309e(C5953R5.f1671a, "onReceivedSslError " + error);
    }
}
