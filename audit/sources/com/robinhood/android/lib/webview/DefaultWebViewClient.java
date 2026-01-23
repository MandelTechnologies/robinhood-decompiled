package com.robinhood.android.lib.webview;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.view.WebErrorView;
import com.robinhood.utils.net.ActiveNetworkCounter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: DefaultWebViewClient.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J*\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/DefaultWebViewClient;", "Landroid/webkit/WebViewClient;", "initialUrl", "Lokhttp3/HttpUrl;", "webViewUrlHandler", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler;", "networkCounter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "onError", "Lkotlin/Function2;", "Lcom/robinhood/android/lib/webview/WebError;", "Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "", "Lcom/robinhood/android/lib/webview/ErrorCallback;", "<init>", "(Lokhttp3/HttpUrl;Lcom/robinhood/android/lib/webview/WebViewUrlHandler;Lcom/robinhood/utils/net/ActiveNetworkCounter;Lkotlin/jvm/functions/Function2;)V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "onReceivedError", "error", "Landroid/webkit/WebResourceError;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onWebException", "showEmailError", "Companion", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DefaultWebViewClient extends WebViewClient {
    private static final List<Integer> recoverableErrors = CollectionsKt.listOf((Object[]) new Integer[]{-6, -7, -8});
    private final HttpUrl initialUrl;
    private final ActiveNetworkCounter networkCounter;
    private final Function2<WebError, WebErrorView.ErrorViewType, Unit> onError;
    private final WebViewUrlHandler webViewUrlHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultWebViewClient(HttpUrl initialUrl, WebViewUrlHandler webViewUrlHandler, ActiveNetworkCounter networkCounter, Function2<? super WebError, ? super WebErrorView.ErrorViewType, Unit> onError) {
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(webViewUrlHandler, "webViewUrlHandler");
        Intrinsics.checkNotNullParameter(networkCounter, "networkCounter");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.initialUrl = initialUrl;
        this.webViewUrlHandler = webViewUrlHandler;
        this.networkCounter = networkCounter;
        this.onError = onError;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        return WebViewUrlHandler.handleShouldOverrideUrlLoading$default(this.webViewUrlHandler, request, null, 2, null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        String str;
        boolean zContains;
        super.onReceivedError(view, request, error);
        if (error != null) {
            Uri url = request != null ? request.getUrl() : null;
            str = "Error: " + url + " (" + error.getErrorCode() + "): " + ((Object) error.getDescription());
        } else {
            str = "Unknown error: onReceivedError(), " + (request != null ? request.getUrl() : null);
        }
        if (error != null && error.getErrorCode() == -2) {
            zContains = !this.networkCounter.getHasAvailableNetwork();
        } else {
            zContains = CollectionsKt.contains(recoverableErrors, error != null ? Integer.valueOf(error.getErrorCode()) : null);
        }
        onWebException(new WebError.AndroidWebError(str, error != null ? Integer.valueOf(error.getErrorCode()) : null), request, this.initialUrl, !zContains);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        String str;
        int statusCode;
        super.onReceivedHttpError(view, request, errorResponse);
        if (errorResponse != null) {
            Uri url = request != null ? request.getUrl() : null;
            str = "Error: " + url + " (" + errorResponse.getStatusCode() + "): " + errorResponse.getReasonPhrase();
        } else {
            str = "Unknown error: onReceivedHttpError(), " + (request != null ? request.getUrl() : null);
        }
        boolean z = true;
        if (errorResponse != null && (400 > (statusCode = errorResponse.getStatusCode()) || statusCode >= 600)) {
            z = false;
        }
        onWebException(new WebError.HttpError(str, errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null), request, this.initialUrl, z);
    }

    private final void onWebException(WebError error, WebResourceRequest request, HttpUrl initialUrl, boolean showEmailError) {
        Uri url;
        WebErrorView.ErrorViewType errorViewType = null;
        if (StringsKt.equals$default((request == null || (url = request.getUrl()) == null) ? null : url.toString(), initialUrl.uri().toString(), false, 2, null)) {
            if (showEmailError) {
                errorViewType = WebErrorView.ErrorViewType.ROUTE_TO_EMAIL;
            } else {
                errorViewType = WebErrorView.ErrorViewType.RETRY;
            }
        }
        this.onError.invoke(error, errorViewType);
    }
}
