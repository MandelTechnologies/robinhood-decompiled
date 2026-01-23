package com.robinhood.android.lib.webview;

import android.webkit.JavascriptInterface;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.shared.legacy.models.AnalyticsRequest;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebListener.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0007J\b\u0010\u001b\u001a\u00020\u0019H'J\b\u0010\u001c\u001a\u00020\u0019H'J\b\u0010\u001d\u001a\u00020\u0019H'J\b\u0010\u001e\u001a\u00020\u0019H\u0017J\b\u0010\u001f\u001a\u00020\u0019H\u0017J\b\u0010 \u001a\u00020\u0019H\u0017J\b\u0010!\u001a\u00020\u000bH\u0007J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0005H\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebListener;", "Lcom/robinhood/android/lib/webview/WebListenerContract;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "screenName", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Ljava/lang/String;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "backNavigationEnabled", "", "getBackNavigationEnabled", "()Z", "setBackNavigationEnabled", "(Z)V", "webStartMillis", "", "webReadyMillis", "Ljava/lang/Long;", "analyticsRequestAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/shared/legacy/models/AnalyticsRequest;", "isWebReady", "log", "", "message", "readyToInteract", "getInitialConfig", "refreshToken", "disableBackNavigation", "dismissWebView", "dismissWebViewAndContinue", "tryLogFirstInteraction", "logError", "tag", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class WebListener implements WebContracts {
    private final AnalyticsLogger analytics;
    private final JsonAdapter<AnalyticsRequest> analyticsRequestAdapter;
    private volatile boolean backNavigationEnabled;
    private final LazyMoshi moshi;
    private final String screenName;
    private volatile Long webReadyMillis;
    private final long webStartMillis;

    @Override // com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public abstract void getInitialConfig();

    @Override // com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public abstract void readyToInteract();

    @Override // com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public abstract void refreshToken();

    public WebListener(AnalyticsLogger analytics, String screenName, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.analytics = analytics;
        this.screenName = screenName;
        this.moshi = moshi;
        this.backNavigationEnabled = true;
        this.webStartMillis = System.currentTimeMillis();
        this.analyticsRequestAdapter = moshi.adapter(AnalyticsRequest.class);
    }

    public final boolean getBackNavigationEnabled() {
        return this.backNavigationEnabled;
    }

    public final void setBackNavigationEnabled(boolean z) {
        this.backNavigationEnabled = z;
    }

    public final boolean isWebReady() {
        return this.webReadyMillis != null;
    }

    @Override // com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public final void log(String message) throws IOException {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            AnalyticsRequest analyticsRequestFromJson = this.analyticsRequestAdapter.fromJson(message);
            if (analyticsRequestFromJson != null) {
                this.analytics.forwardWebRequest(analyticsRequestFromJson);
            } else {
                logError("Event parsed correctly but value is null");
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new NullPointerException("Event parsed correctly but value is null"), false, null, 6, null);
            }
        } catch (JsonDataException e) {
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = JsonDataException.class.getSimpleName();
            }
            Intrinsics.checkNotNull(message2);
            logError(message2);
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
    }

    @Override // com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void disableBackNavigation() {
        this.backNavigationEnabled = false;
    }

    @Override // com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void dismissWebView() {
        this.backNavigationEnabled = false;
    }

    @Override // com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void dismissWebViewAndContinue() {
        this.backNavigationEnabled = false;
    }

    public final boolean tryLogFirstInteraction() {
        if (this.webReadyMillis == null) {
            this.webReadyMillis = Long.valueOf(System.currentTimeMillis());
            Long l = this.webReadyMillis;
            Intrinsics.checkNotNull(l);
            this.analytics.logPathfinderTimeToInteraction(l.longValue() - this.webStartMillis);
            return true;
        }
        this.analytics.logError(this.screenName, "TTFI logged more than once");
        return false;
    }

    protected final void logError(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.analytics.logError(this.screenName, tag);
    }
}
