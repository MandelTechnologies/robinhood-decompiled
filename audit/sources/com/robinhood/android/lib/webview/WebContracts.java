package com.robinhood.android.lib.webview;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;

/* compiled from: WebContracts.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'J\b\u0010\u0007\u001a\u00020\u0003H'J\b\u0010\b\u001a\u00020\u0003H'J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H'J\b\u0010\u000b\u001a\u00020\u0003H'¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebListenerContract;", "", "log", "", "message", "", "readyToInteract", "disableBackNavigation", "dismissWebView", "dismissWebViewAndContinue", "getInitialConfig", "refreshToken", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.webview.WebListenerContract, reason: use source file name */
/* loaded from: classes8.dex */
public interface WebContracts {
    @JavascriptInterface
    void disableBackNavigation();

    @JavascriptInterface
    void dismissWebView();

    @JavascriptInterface
    void dismissWebViewAndContinue();

    @JavascriptInterface
    void getInitialConfig();

    @JavascriptInterface
    void log(String message);

    @JavascriptInterface
    void readyToInteract();

    @JavascriptInterface
    void refreshToken();
}
