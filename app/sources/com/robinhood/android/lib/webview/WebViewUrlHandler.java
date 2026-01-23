package com.robinhood.android.lib.webview;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.adjust.sdk.Constants;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.android.lib.webview.extensions.Uris3;
import com.robinhood.rosetta.eventlogging.WebViewNavigationData;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.http.HttpUrls2;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: WebViewUrlHandler.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\f\u0010\u0018\u001a\u00020\u0015*\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebViewUrlHandler;", "", "screenName", "", "callbacks", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler$Callbacks;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/lib/webview/WebViewUrlHandler$Callbacks;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/SharedEventLogger;)V", "handleShouldOverrideUrlLoading", "", "request", "Landroid/webkit/WebResourceRequest;", "strategy", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData$Strategy;", "handleNewWindowShouldOverrideUrlLoading", "handleSpecialUrls", "url", "Landroid/net/Uri;", "handleRobinhoodDeeplink", "", "standardizeDeepLink", "Callbacks", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class WebViewUrlHandler {
    private final AnalyticsLogger analytics;
    private final Callbacks callbacks;
    private final SharedEventLogger eventLogger;
    private final String screenName;

    /* compiled from: WebViewUrlHandler.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebViewUrlHandler$Callbacks;", "", "backNavigationEnabled", "", "getBackNavigationEnabled", "()Z", "onMailTo", "", "uri", "Landroid/net/Uri;", "onDoneClick", "onDeeplink", "onExternalUrl", "url", "Lokhttp3/HttpUrl;", "onExternalUri", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean getBackNavigationEnabled();

        void onDeeplink(Uri uri);

        void onDoneClick();

        void onExternalUri(Uri uri);

        void onExternalUrl(HttpUrl url);

        void onMailTo(Uri uri);
    }

    public WebViewUrlHandler(String screenName, Callbacks callbacks, AnalyticsLogger analytics, SharedEventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.screenName = screenName;
        this.callbacks = callbacks;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
    }

    public static /* synthetic */ boolean handleShouldOverrideUrlLoading$default(WebViewUrlHandler webViewUrlHandler, WebResourceRequest webResourceRequest, WebViewNavigationData.Strategy strategy, int i, Object obj) {
        if ((i & 2) != 0) {
            strategy = WebViewNavigationData.Strategy.NAVIGATED;
        }
        return webViewUrlHandler.handleShouldOverrideUrlLoading(webResourceRequest, strategy);
    }

    public final boolean handleShouldOverrideUrlLoading(WebResourceRequest request, WebViewNavigationData.Strategy strategy) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        Uri uriStandardizeDeepLink = standardizeDeepLink(url);
        if (handleSpecialUrls(uriStandardizeDeepLink)) {
            return true;
        }
        SharedEventLogger sharedEventLogger = this.eventLogger;
        String string2 = uriStandardizeDeepLink.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sharedEventLogger.logWebViewNavigation(string2, strategy);
        if (Intrinsics.areEqual(uriStandardizeDeepLink.getScheme(), "http") || Intrinsics.areEqual(uriStandardizeDeepLink.getScheme(), Constants.SCHEME)) {
            HttpUrl httpUrl = HttpUrl2.toHttpUrl(uriStandardizeDeepLink);
            if (HttpUrls2.isRobinhoodDomain(httpUrl)) {
                return false;
            }
            this.callbacks.onExternalUrl(httpUrl);
            return true;
        }
        this.callbacks.onExternalUri(uriStandardizeDeepLink);
        return true;
    }

    public final boolean handleNewWindowShouldOverrideUrlLoading(WebResourceRequest request) {
        WebViewNavigationData.Strategy strategy;
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        if (Intrinsics.areEqual(standardizeDeepLink(url).getAuthority(), "support")) {
            strategy = WebViewNavigationData.Strategy.ARTICLE;
        } else {
            strategy = WebViewNavigationData.Strategy.NAVIGATED;
        }
        return handleShouldOverrideUrlLoading(request, strategy);
    }

    private final boolean handleSpecialUrls(Uri url) {
        if (Intrinsics.areEqual(url.getScheme(), "mailto")) {
            SharedEventLogger sharedEventLogger = this.eventLogger;
            String string2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            sharedEventLogger.logWebViewNavigation(string2, WebViewNavigationData.Strategy.MAIL_TO);
            this.callbacks.onMailTo(url);
            return true;
        }
        if (!Intrinsics.areEqual(url.getScheme(), DeeplinkConfig.INSTANCE.getScheme())) {
            return false;
        }
        SharedEventLogger sharedEventLogger2 = this.eventLogger;
        String string3 = url.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sharedEventLogger2.logWebViewNavigation(string3, WebViewNavigationData.Strategy.DEEP_LINK);
        if (Intrinsics.areEqual(url.getAuthority(), "profile") && !this.callbacks.getBackNavigationEnabled()) {
            this.callbacks.onDoneClick();
        } else {
            handleRobinhoodDeeplink(url);
        }
        return true;
    }

    private final void handleRobinhoodDeeplink(Uri url) {
        this.callbacks.onDeeplink(url);
    }

    private final Uri standardizeDeepLink(Uri uri) {
        Uri deepLink = Uris3.toDeepLink(uri);
        if (!Intrinsics.areEqual(deepLink, uri) && deepLink.getAuthority() == null) {
            this.analytics.logError(this.screenName, uri + ": applink Uri has no path");
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception(uri + ": applink Uri has no path!"), false, null, 6, null);
        }
        return deepLink;
    }
}
