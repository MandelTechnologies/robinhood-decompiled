package com.stripe.hcaptcha.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.IHCaptchaVerifier;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import com.stripe.hcaptcha.webview.HCaptchaWebViewHelper;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: HCaptchaWebViewHelper.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00020\u0001:\u0003 !\"B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;", "", "handler", "Landroid/os/Handler;", "context", "Landroid/content/Context;", "config", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "internalConfig", "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "captchaVerifier", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "listener", "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "webView", "Landroid/webkit/WebView;", "(Landroid/os/Handler;Landroid/content/Context;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;Lcom/stripe/hcaptcha/HCaptchaStateListener;Landroid/webkit/WebView;)V", "getConfig$hcaptcha_release", "()Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "getListener$hcaptcha_release", "()Lcom/stripe/hcaptcha/HCaptchaStateListener;", "getWebView$hcaptcha_release", "()Landroid/webkit/WebView;", "destroy", "", "reset", "resetAndExecute", "setupWebView", "shouldRetry", "", "exception", "Lcom/stripe/hcaptcha/HCaptchaException;", "Companion", "HCaptchaWebChromeClient", "HCaptchaWebClient", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class HCaptchaWebViewHelper {
    private static final Companion Companion = new Companion(null);
    private final IHCaptchaVerifier captchaVerifier;
    private final HCaptchaConfig config;
    private final Context context;
    private final HCaptchaInternalConfig internalConfig;
    private final HCaptchaStateListener listener;
    private final WebView webView;

    public HCaptchaWebViewHelper(Handler handler, Context context, HCaptchaConfig config, HCaptchaInternalConfig internalConfig, IHCaptchaVerifier captchaVerifier, HCaptchaStateListener listener, WebView webView) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(captchaVerifier, "captchaVerifier");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.context = context;
        this.config = config;
        this.internalConfig = internalConfig;
        this.captchaVerifier = captchaVerifier;
        this.listener = listener;
        this.webView = webView;
        setupWebView(handler);
    }

    /* renamed from: getConfig$hcaptcha_release, reason: from getter */
    public final HCaptchaConfig getConfig() {
        return this.config;
    }

    /* renamed from: getListener$hcaptcha_release, reason: from getter */
    public final HCaptchaStateListener getListener() {
        return this.listener;
    }

    /* renamed from: getWebView$hcaptcha_release, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private final void setupWebView(Handler handler) {
        HCaptchaJSInterface hCaptchaJSInterface = new HCaptchaJSInterface(handler, this.config, this.captchaVerifier);
        HCaptchaDebugInfo hCaptchaDebugInfo = new HCaptchaDebugInfo(this.context);
        WebSettings settings = this.webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(-1);
        settings.setGeolocationEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        this.webView.setWebViewClient(new HCaptchaWebClient(this, handler, this.listener));
        this.webView.setWebChromeClient(new HCaptchaWebChromeClient());
        this.webView.setBackgroundColor(0);
        if (this.config.getDisableHardwareAcceleration()) {
            this.webView.setLayerType(1, null);
        }
        this.webView.addJavascriptInterface(hCaptchaJSInterface, "JSInterface");
        this.webView.addJavascriptInterface(hCaptchaDebugInfo, "JSDI");
        this.webView.loadDataWithBaseURL(this.config.getHost(), this.internalConfig.getHtmlProvider().invoke(), "text/html", "UTF-8", null);
    }

    public final void destroy() {
        this.webView.removeJavascriptInterface("JSInterface");
        this.webView.removeJavascriptInterface("JSDI");
        ViewParent parent = this.webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.webView);
        }
        this.webView.destroy();
    }

    public final void resetAndExecute() {
        this.webView.loadUrl("javascript:resetAndExecute();");
    }

    public final void reset() {
        this.webView.loadUrl("javascript:reset();");
    }

    public final boolean shouldRetry(HCaptchaException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Function2<HCaptchaConfig, HCaptchaException, Boolean> retryPredicate = this.config.getRetryPredicate();
        if (retryPredicate != null) {
            return retryPredicate.invoke(this.config, exception).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HCaptchaWebViewHelper.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper$HCaptchaWebClient;", "Landroid/webkit/WebViewClient;", "handler", "Landroid/os/Handler;", "listener", "Lcom/stripe/hcaptcha/HCaptchaStateListener;", "(Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper;Landroid/os/Handler;Lcom/stripe/hcaptcha/HCaptchaStateListener;)V", "onLoadResource", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "stripUrl", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    final class HCaptchaWebClient extends WebViewClient {
        private final Handler handler;
        private final HCaptchaStateListener listener;
        final /* synthetic */ HCaptchaWebViewHelper this$0;

        public HCaptchaWebClient(HCaptchaWebViewHelper hCaptchaWebViewHelper, Handler handler, HCaptchaStateListener listener) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.this$0 = hCaptchaWebViewHelper;
            this.handler = handler;
            this.listener = listener;
        }

        private final String stripUrl(String url) {
            List listEmptyList;
            if (url != null) {
                List<String> listSplit = new Regex("[?#]").split(url, 0);
                if (!listSplit.isEmpty()) {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                String str = ((String[]) listEmptyList.toArray(new String[0]))[0] + "...";
                return str == null ? "null" : str;
            }
            return "null";
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            final Uri url = request.getUrl();
            if (url != null && url.getScheme() != null && Intrinsics.areEqual(url.getScheme(), "http")) {
                Handler handler = this.handler;
                final HCaptchaWebViewHelper hCaptchaWebViewHelper = this.this$0;
                handler.post(new Runnable() { // from class: com.stripe.hcaptcha.webview.HCaptchaWebViewHelper$HCaptchaWebClient$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        HCaptchaWebViewHelper.HCaptchaWebClient.shouldInterceptRequest$lambda$2(hCaptchaWebViewHelper, this, url);
                    }
                });
            }
            return super.shouldInterceptRequest(view, request);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void shouldInterceptRequest$lambda$2(HCaptchaWebViewHelper this$0, HCaptchaWebClient this$1, Uri uri) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getWebView().removeJavascriptInterface("JSInterface");
            this$0.getWebView().removeJavascriptInterface("JSDI");
            this$1.listener.getOnFailure().invoke(new HCaptchaException(HCaptchaError.INSECURE_HTTP_REQUEST_ERROR, "Insecure resource " + uri + " requested"));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            super.onReceivedHttpError(view, request, errorResponse);
            Log.d("hCaptchaWebView", "[webview] onReceivedHttpError");
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            Log.d("hCaptchaWebView", "[webview] onPageStarted " + stripUrl(url));
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            Log.d("hCaptchaWebView", "[webview] onLoadResource " + stripUrl(url));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            Log.d("hCaptchaWebView", "[webview] onPageFinished " + stripUrl(url));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onReceivedError(view, request, error);
            CharSequence description = error != null ? error.getDescription() : null;
            Log.d("hCaptchaWebView", "[webview] onReceivedError \"" + ((Object) description) + "\" (" + (error != null ? Integer.valueOf(error.getErrorCode()) : null) + ")");
        }
    }

    /* compiled from: HCaptchaWebViewHelper.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper$HCaptchaWebChromeClient;", "Landroid/webkit/WebChromeClient;", "()V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class HCaptchaWebChromeClient extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
            Log.d("hCaptchaWebView", "[webview] onConsoleMessage " + consoleMessage.message());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            Intrinsics.checkNotNullParameter(view, "view");
            Log.d("hCaptchaWebView", "[webview] onProgressChanged " + newProgress + "%");
        }
    }

    /* compiled from: HCaptchaWebViewHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaWebViewHelper$Companion;", "", "()V", "LOG_TAG", "", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
