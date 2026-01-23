package com.robinhood.android.lib.pathfinder.webview;

import android.webkit.JavascriptInterface;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.lib.webview.WebListener;
import com.robinhood.models.p355ui.PathfinderStateError;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderWebListener.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0015H\u0017J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006H\u0017J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006H\u0017J\b\u0010\u001a\u001a\u00020\u0015H\u0017J\b\u0010\u001b\u001a\u00020\u0015H\u0017J\b\u0010\u001c\u001a\u00020\u0015H\u0017J\b\u0010\u001d\u001a\u00020\u0015H\u0017J\b\u0010\u001e\u001a\u00020\u0015H\u0017J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0002\b R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener;", "Lcom/robinhood/android/lib/webview/WebListener;", "Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebTwoWayListenerContract;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "screenName", "", "callbacks", "Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener$Callbacks;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Ljava/lang/String;Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener$Callbacks;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "getCallbacks", "()Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener$Callbacks;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "errorMessageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/ui/PathfinderStateError;", "readyToInteract", "", "getUserView", "updateInquiry", "message", "updateInquiryWithError", "getInitialConfig", "refreshToken", "disableBackNavigation", "dismissWebView", "goBack", "parseError", "parseError$lib_pathfinder_externalDebug", "Callbacks", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PathfinderWebListener extends WebListener implements PathfinderWebTwoWayListenerContract {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final JsonAdapter<PathfinderStateError> errorMessageAdapter;
    private final LazyMoshi moshi;

    /* compiled from: PathfinderWebListener.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener$Callbacks;", "", "onFirstInteraction", "", "updateInquiry", "message", "", "updateInquiryWithError", "error", "Lcom/robinhood/models/ui/PathfinderStateError;", "getInitialConfig", "refreshToken", "disableBackNavigation", "dismissWebView", "goBack", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void disableBackNavigation();

        void dismissWebView();

        void getInitialConfig();

        void goBack();

        void onFirstInteraction();

        void refreshToken();

        void updateInquiry(String message);

        void updateInquiryWithError(PathfinderStateError error);
    }

    @Override // com.robinhood.android.lib.webview.WebListener, com.robinhood.android.lib.webview.WebContracts
    @JavascriptInterface
    public void readyToInteract() {
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final LazyMoshi getMoshi() {
        return this.moshi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathfinderWebListener(AnalyticsLogger analytics, String screenName, Callbacks callbacks, LazyMoshi moshi) {
        super(analytics, screenName, moshi);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.callbacks = callbacks;
        this.moshi = moshi;
        this.errorMessageAdapter = moshi.adapter(PathfinderStateError.class);
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebTwoWayListenerContract
    @JavascriptInterface
    public void getUserView() {
        if (tryLogFirstInteraction()) {
            this.callbacks.onFirstInteraction();
        }
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebTwoWayListenerContract
    @JavascriptInterface
    public void updateInquiry(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.callbacks.updateInquiry(message);
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebTwoWayListenerContract
    @JavascriptInterface
    public void updateInquiryWithError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        PathfinderStateError error$lib_pathfinder_externalDebug = parseError$lib_pathfinder_externalDebug(message);
        if (error$lib_pathfinder_externalDebug == null) {
            logError("Failed to deserialize updateInquiryWithError");
        }
        this.callbacks.updateInquiryWithError(error$lib_pathfinder_externalDebug);
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

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebTwoWayListenerContract
    @JavascriptInterface
    public void goBack() {
        this.callbacks.goBack();
    }

    public final PathfinderStateError parseError$lib_pathfinder_externalDebug(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.errorMessageAdapter.fromJson(message);
    }
}
