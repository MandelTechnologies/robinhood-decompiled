package com.robinhood.android.lib.pathfinder.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.DownloadListener;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.robinhood.android.lib.webview.WebViewUrlHandler;
import com.robinhood.android.utils.web.WebUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderUnprivlegedWebView.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderUnprivlegedWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "webViewUrlHandler", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/robinhood/android/lib/webview/WebViewUrlHandler;)V", "onAttachedToWindow", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PathfinderUnprivlegedWebView extends WebView {
    public static final int $stable = 8;
    private final WebViewUrlHandler webViewUrlHandler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PathfinderUnprivlegedWebView(Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PathfinderUnprivlegedWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PathfinderUnprivlegedWebView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PathfinderUnprivlegedWebView(Context context, AttributeSet attributeSet, int i, WebViewUrlHandler webViewUrlHandler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : webViewUrlHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PathfinderUnprivlegedWebView(Context context, AttributeSet attributeSet, int i, WebViewUrlHandler webViewUrlHandler) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.webViewUrlHandler = webViewUrlHandler;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebSettings settings = getSettings();
        settings.setDomStorageEnabled(false);
        settings.setAllowFileAccess(false);
        setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderUnprivlegedWebView.onAttachedToWindow.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                WebViewUrlHandler webViewUrlHandler = PathfinderUnprivlegedWebView.this.webViewUrlHandler;
                if (webViewUrlHandler != null) {
                    return webViewUrlHandler.handleNewWindowShouldOverrideUrlLoading(request);
                }
                return false;
            }
        });
        setDownloadListener(new DownloadListener() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderUnprivlegedWebView.onAttachedToWindow.3
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebUtils.viewUrl$default(PathfinderUnprivlegedWebView.this.getContext(), str, 0, 4, (Object) null);
            }
        });
    }
}
