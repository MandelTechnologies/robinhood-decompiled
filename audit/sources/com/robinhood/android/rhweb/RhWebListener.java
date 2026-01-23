package com.robinhood.android.rhweb;

import android.webkit.JavascriptInterface;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.webview.WebListener;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhWebListener.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0017J\b\u0010\f\u001a\u00020\u000bH\u0017J\b\u0010\r\u001a\u00020\u000bH\u0017J\b\u0010\u000e\u001a\u00020\u000bH\u0017J\b\u0010\u000f\u001a\u00020\u000bH\u0017J\b\u0010\u0010\u001a\u00020\u000bH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebListener;", "Lcom/robinhood/android/lib/webview/WebListener;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "callbacks", "Lcom/robinhood/android/rhweb/RhWebListener$Callbacks;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/rhweb/RhWebListener$Callbacks;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "readyToInteract", "", "getInitialConfig", "refreshToken", "disableBackNavigation", "dismissWebView", "dismissWebViewAndContinue", "Callbacks", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhWebListener extends WebListener {
    private final Callbacks callbacks;

    /* compiled from: RhWebListener.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebListener$Callbacks;", "", "onFirstInteraction", "", "getInitialConfig", "refreshToken", "disableBackNavigation", "dismissWebView", "dismissWebViewAndContinue", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void disableBackNavigation();

        void dismissWebView();

        void dismissWebViewAndContinue();

        void getInitialConfig();

        void onFirstInteraction();

        void refreshToken();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhWebListener(AnalyticsLogger analytics, Callbacks callbacks, LazyMoshi moshi) {
        super(analytics, AnalyticsStrings.RH_WEB_SCREEN_NAME, moshi);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.android.lib.webview.WebListener, com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void readyToInteract() {
        if (tryLogFirstInteraction()) {
            this.callbacks.onFirstInteraction();
        }
    }

    @Override // com.robinhood.android.lib.webview.WebListener, com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void getInitialConfig() {
        this.callbacks.getInitialConfig();
    }

    @Override // com.robinhood.android.lib.webview.WebListener, com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void refreshToken() {
        this.callbacks.refreshToken();
    }

    @Override // com.robinhood.android.lib.webview.WebListener, com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void disableBackNavigation() {
        super.disableBackNavigation();
        this.callbacks.disableBackNavigation();
    }

    @Override // com.robinhood.android.lib.webview.WebListener, com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void dismissWebView() {
        super.dismissWebView();
        this.callbacks.dismissWebView();
    }

    @Override // com.robinhood.android.lib.webview.WebListener, com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void dismissWebViewAndContinue() {
        super.dismissWebViewAndContinue();
        this.callbacks.dismissWebViewAndContinue();
    }
}
