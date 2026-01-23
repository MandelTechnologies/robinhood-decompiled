package com.robinhood.android.lib.pathfinder.views;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.Relay;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.lib.pathfinder.PathfinderTimeout;
import com.robinhood.android.lib.pathfinder.PathfinderUrlProvider;
import com.robinhood.android.lib.pathfinder.PathfinderWebViewState;
import com.robinhood.android.lib.pathfinder.extensions.StateRelay;
import com.robinhood.android.lib.pathfinder.views.InternalPathfinderWebViewEvent;
import com.robinhood.android.lib.pathfinder.views.PathfinderWebViewEvent;
import com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener;
import com.robinhood.android.lib.webview.DefaultWebViewClient;
import com.robinhood.android.lib.webview.WebAuthTokenManager;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.WebViewUrlHandler;
import com.robinhood.android.lib.webview.data.DisplayInfo;
import com.robinhood.android.lib.webview.data.WebConfig;
import com.robinhood.android.lib.webview.view.WebErrorView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.models.p355ui.PathfinderStateError;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.test.idler.TrackedWebChromeClient;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.net.ActiveNetworkCounter;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p479j$.time.Duration;

/* compiled from: PathfinderWebViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0002\u008c\u0001\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004Bu\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)J/\u00100\u001a\u00020$2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0015\u00105\u001a\u0002042\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020$¢\u0006\u0004\b7\u0010)J\u0015\u00108\u001a\u00020$2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020$2\u0006\u0010:\u001a\u00020,¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020$H\u0016¢\u0006\u0004\b=\u0010)J\u000f\u0010>\u001a\u00020$H\u0016¢\u0006\u0004\b>\u0010)J\u0017\u0010A\u001a\u00020$2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020$H\u0016¢\u0006\u0004\bC\u0010)J\u0017\u0010D\u001a\u00020$2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bD\u0010BJ\u0017\u0010E\u001a\u00020$2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020$2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bG\u0010BJ\u0017\u0010I\u001a\u00020$2\u0006\u0010H\u001a\u00020,H\u0016¢\u0006\u0004\bI\u0010<J\u0019\u0010L\u001a\u00020$2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020$H\u0016¢\u0006\u0004\bN\u0010)J\u000f\u0010O\u001a\u00020$H\u0016¢\u0006\u0004\bO\u0010)J\u000f\u0010P\u001a\u00020$H\u0016¢\u0006\u0004\bP\u0010)J\u000f\u0010Q\u001a\u00020$H\u0016¢\u0006\u0004\bQ\u0010)J\u000f\u0010R\u001a\u00020$H\u0016¢\u0006\u0004\bR\u0010)J\u000f\u0010S\u001a\u00020$H\u0016¢\u0006\u0004\bS\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ZR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010]R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010^R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010_R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001e\u0010j\u001a\f\u0012\u0004\u0012\u00020h0gj\u0002`i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001e\u0010o\u001a\f\u0012\u0004\u0012\u00020m0lj\u0002`n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001e\u0010s\u001a\f\u0012\u0004\u0012\u00020q0lj\u0002`r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010pR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020h0t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020m0t8\u0006¢\u0006\f\n\u0004\by\u0010v\u001a\u0004\bz\u0010xR \u0010{\u001a\b\u0012\u0004\u0012\u00020q0t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010v\u001a\u0004\b|\u0010xR\u0019\u0010~\u001a\u00020}8\u0006¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020,8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewViewState;", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler$Callbacks;", "Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener$Callbacks;", "Lcom/robinhood/utils/ReleaseVersion;", "releaseVersion", "Landroid/view/View;", "hostView", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/android/lib/pathfinder/PathfinderUrlProvider;", "pathfinderUrlProvider", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "oAuthTokenPref", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "colorSchemeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "nightModeManager", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "themePref", "Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "webAuthTokenManager", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "<init>", "(Lcom/robinhood/utils/ReleaseVersion;Landroid/view/View;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/prefs/Installation;Lcom/robinhood/android/lib/pathfinder/PathfinderUrlProvider;Lcom/robinhood/prefs/MoshiSecurePreference;Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Lcom/robinhood/android/common/ui/daynight/NightModeManager;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/android/lib/webview/WebAuthTokenManager;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "j$/time/Duration", "duration", "Lkotlin/Function0;", "", "onTimeout", "startFallbackTimer", "(Lj$/time/Duration;Lkotlin/jvm/functions/Function0;)V", "stopFallbackTimer", "()V", "Ljava/util/UUID;", "inquiryId", "", "rawUserView", "Landroid/webkit/ValueCallback;", "callback", "renderUserView", "(Ljava/util/UUID;Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "Lokhttp3/HttpUrl;", "url", "Landroid/webkit/WebViewClient;", "newWebViewClient", "(Lokhttp3/HttpUrl;)Landroid/webkit/WebViewClient;", "updatePageData", "setInquiryId", "(Ljava/util/UUID;)V", "topicId", "setTopicId", "(Ljava/lang/String;)V", "onCreate", "onStart", "Landroid/net/Uri;", "uri", "onMailTo", "(Landroid/net/Uri;)V", "onDoneClick", "onDeeplink", "onExternalUrl", "(Lokhttp3/HttpUrl;)V", "onExternalUri", "message", "updateInquiry", "Lcom/robinhood/models/ui/PathfinderStateError;", "error", "updateInquiryWithError", "(Lcom/robinhood/models/ui/PathfinderStateError;)V", "getInitialConfig", "refreshToken", "onFirstInteraction", "disableBackNavigation", "dismissWebView", "goBack", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "Lcom/robinhood/prefs/Installation;", "Lcom/robinhood/android/lib/pathfinder/PathfinderUrlProvider;", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "Lio/reactivex/disposables/Disposable;", "fallbackTimerDisposable", "Lio/reactivex/disposables/Disposable;", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "networkCounter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "Lcom/robinhood/android/lib/pathfinder/extensions/StateRelay;", "webViewStateRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/jakewharton/rxrelay2/Relay;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "Lcom/robinhood/android/lib/pathfinder/views/EventRelay;", "webViewEventRelay", "Lcom/jakewharton/rxrelay2/Relay;", "Lcom/robinhood/android/lib/pathfinder/views/InternalPathfinderWebViewEvent;", "Lcom/robinhood/android/lib/pathfinder/views/InternalEventRelay;", "webViewInternalEventRelay", "Lio/reactivex/Observable;", "webViewState", "Lio/reactivex/Observable;", "getWebViewState", "()Lio/reactivex/Observable;", "webViewEvents", "getWebViewEvents", "internalWebViewEvents", "getInternalWebViewEvents$lib_pathfinder_externalDebug", "Lcom/robinhood/test/idler/TrackedWebChromeClient;", "webChromeClient", "Lcom/robinhood/test/idler/TrackedWebChromeClient;", "getWebChromeClient", "()Lcom/robinhood/test/idler/TrackedWebChromeClient;", "screenName", "Ljava/lang/String;", "Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener;", "webListener", "Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener;", "getWebListener", "()Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebListener;", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler;", "webUrlHandler", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler;", "com/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo$webResponder$1", "webResponder", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo$webResponder$1;", "", "getBackNavigationEnabled", "()Z", "backNavigationEnabled", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class PathfinderWebViewDuxo extends ViewDuxo<PathfinderWebViewViewState> implements WebViewUrlHandler.Callbacks, PathfinderWebListener.Callbacks {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final ColorSchemeManager colorSchemeManager;
    private final SharedEventLogger eventLogger;
    private Disposable fallbackTimerDisposable;
    private final Installation installation;
    private final Observable<InternalPathfinderWebViewEvent> internalWebViewEvents;
    private final LazyMoshi moshi;
    private final ActiveNetworkCounter networkCounter;
    private final NightModeManager nightModeManager;
    private final PathfinderUrlProvider pathfinderUrlProvider;
    private final String screenName;
    private final EnumPreference<Theme> themePref;
    private final WebAuthTokenManager webAuthTokenManager;
    private final TrackedWebChromeClient webChromeClient;
    private final PathfinderWebListener webListener;
    private final PathfinderWebViewDuxo3 webResponder;
    private final WebViewUrlHandler webUrlHandler;
    private final Relay<PathfinderWebViewEvent> webViewEventRelay;
    private final Observable<PathfinderWebViewEvent> webViewEvents;
    private final Relay<InternalPathfinderWebViewEvent> webViewInternalEventRelay;
    private final Observable<PathfinderWebViewState> webViewState;
    private final BehaviorRelay<PathfinderWebViewState> webViewStateRelay;

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onExternalUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    public final SharedEventLogger getEventLogger() {
        return this.eventLogger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PathfinderWebViewDuxo(ReleaseVersion releaseVersion, View hostView, AnalyticsLogger analytics, SharedEventLogger eventLogger, Installation installation, PathfinderUrlProvider pathfinderUrlProvider, MoshiSecurePreference<OAuthToken> oAuthTokenPref, ColorSchemeManager colorSchemeManager, NightModeManager nightModeManager, EnumPreference<Theme> themePref, WebAuthTokenManager webAuthTokenManager, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(pathfinderUrlProvider, "pathfinderUrlProvider");
        Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(themePref, "themePref");
        Intrinsics.checkNotNullParameter(webAuthTokenManager, "webAuthTokenManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Scheduler scheduler = null;
        super(hostView, new PathfinderWebViewViewState(pathfinderUrlProvider.getHostedUrl(), null, null, null, new WebConfig(oAuthTokenPref.getValue(), installation.mo2745id(), releaseVersion.getVersionName(), new DisplayInfo((Theme) themePref.getValue(), colorSchemeManager.getColorScheme(), nightModeManager.getDayNightMode())), null, 46, null), scheduler, 4, null);
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.installation = installation;
        this.pathfinderUrlProvider = pathfinderUrlProvider;
        this.colorSchemeManager = colorSchemeManager;
        this.nightModeManager = nightModeManager;
        this.themePref = themePref;
        this.webAuthTokenManager = webAuthTokenManager;
        this.moshi = moshi;
        this.networkCounter = new ActiveNetworkCounter();
        BehaviorRelay<PathfinderWebViewState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(PathfinderWebViewState.Uninitialized.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.webViewStateRelay = behaviorRelayCreateDefault;
        PublishRelay publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.webViewEventRelay = publishRelayCreate;
        PublishRelay publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.webViewInternalEventRelay = publishRelayCreate2;
        Observable<PathfinderWebViewState> observableHide = behaviorRelayCreateDefault.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.webViewState = observableHide;
        Observable observableHide2 = publishRelayCreate.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide2, "hide(...)");
        this.webViewEvents = observableHide2;
        Observable observableHide3 = publishRelayCreate2.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide3, "hide(...)");
        this.internalWebViewEvents = observableHide3;
        this.webChromeClient = new TrackedWebChromeClient() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$webChromeClient$1
            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
                this.this$0.webViewEventRelay.accept(new PathfinderWebViewEvent.LinkEvent.NewWebviewEvent(resultMsg));
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
                Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
                this.this$0.webViewEventRelay.accept(new PathfinderWebViewEvent.ShowFileChooserEvent(filePathCallback, fileChooserParams));
                return true;
            }
        };
        this.screenName = AnalyticsStrings.NATIVE_PATHFINDER_WEB;
        this.webListener = new PathfinderWebListener(analytics, AnalyticsStrings.NATIVE_PATHFINDER_WEB, this, moshi);
        this.webUrlHandler = new WebViewUrlHandler(AnalyticsStrings.NATIVE_PATHFINDER_WEB, this, analytics, eventLogger);
        this.webResponder = new PathfinderWebViewDuxo3(new Function2() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PathfinderWebViewDuxo.webResponder$lambda$0(this.f$0, (String) obj, (ValueCallback) obj2);
            }
        }, moshi);
    }

    public final Observable<PathfinderWebViewState> getWebViewState() {
        return this.webViewState;
    }

    public final Observable<PathfinderWebViewEvent> getWebViewEvents() {
        return this.webViewEvents;
    }

    public final Observable<InternalPathfinderWebViewEvent> getInternalWebViewEvents$lib_pathfinder_externalDebug() {
        return this.internalWebViewEvents;
    }

    public final TrackedWebChromeClient getWebChromeClient() {
        return this.webChromeClient;
    }

    public final PathfinderWebListener getWebListener() {
        return this.webListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webResponder$lambda$0(PathfinderWebViewDuxo pathfinderWebViewDuxo, String js, ValueCallback valueCallback) {
        Intrinsics.checkNotNullParameter(js, "js");
        pathfinderWebViewDuxo.webViewInternalEventRelay.accept(new InternalPathfinderWebViewEvent.JavascriptExecutionEvent(js, valueCallback));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void renderUserView$default(PathfinderWebViewDuxo pathfinderWebViewDuxo, UUID uuid, String str, ValueCallback valueCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            valueCallback = null;
        }
        pathfinderWebViewDuxo.renderUserView(uuid, str, valueCallback);
    }

    public final void renderUserView(UUID inquiryId, String rawUserView, ValueCallback<String> callback) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(rawUserView, "rawUserView");
        this.webResponder.renderUserView(this.moshi, inquiryId, rawUserView, callback);
    }

    public final WebViewClient newWebViewClient(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new DefaultWebViewClient(url, this.webUrlHandler, this.networkCounter, new Function2() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PathfinderWebViewDuxo.newWebViewClient$lambda$1(this.f$0, (WebError) obj, (WebErrorView.ErrorViewType) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit newWebViewClient$lambda$1(PathfinderWebViewDuxo pathfinderWebViewDuxo, WebError error, WebErrorView.ErrorViewType errorViewType) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (errorViewType != null) {
            pathfinderWebViewDuxo.stopFallbackTimer();
            StateRelay.setWebErrorState(pathfinderWebViewDuxo.webViewStateRelay, error, errorViewType);
        } else {
            pathfinderWebViewDuxo.analytics.logError(pathfinderWebViewDuxo.screenName, String.valueOf(error.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public final void updatePageData() {
        this.webResponder.updatePageData();
    }

    public final void setInquiryId(final UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        applyMutation(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.setInquiryId$lambda$2(inquiryId, (PathfinderWebViewViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderWebViewViewState setInquiryId$lambda$2(UUID uuid, PathfinderWebViewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PathfinderWebViewViewState.copy$default(applyMutation, null, null, uuid, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderWebViewViewState setTopicId$lambda$3(String str, PathfinderWebViewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PathfinderWebViewViewState.copy$default(applyMutation, null, str, null, null, null, null, 61, null);
    }

    public final void setTopicId(final String topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        applyMutation(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.setTopicId$lambda$3(topicId, (PathfinderWebViewViewState) obj);
            }
        });
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable observableSkip = getStates().map(new Function() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final DisplayInfo apply(PathfinderWebViewViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getWebConfig().getDisplayInfo();
            }
        }).distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSkip), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.onCreate$lambda$4(this.f$0, (DisplayInfo) obj);
            }
        });
        StateRelay.setInitializingState(this.webViewStateRelay, PathfinderTimeout.getDEFAULT_PATHFINDER_WEB_LOADING_TIMEOUT());
        startFallbackTimer(PathfinderTimeout.getDEFAULT_PATHFINDER_WEB_LOADING_TIMEOUT(), new Function0() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PathfinderWebViewDuxo.onCreate$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(PathfinderWebViewDuxo pathfinderWebViewDuxo, DisplayInfo displayInfo) {
        pathfinderWebViewDuxo.webResponder.setTheme(displayInfo.getTheme(), displayInfo.getDayNightMode());
        pathfinderWebViewDuxo.webResponder.setAccessibleColors(displayInfo.getColorScheme());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(PathfinderWebViewDuxo pathfinderWebViewDuxo) {
        if (pathfinderWebViewDuxo.webViewStateRelay.getValue() instanceof PathfinderWebViewState.Initializing) {
            StateRelay.setTimedOutState(pathfinderWebViewDuxo.webViewStateRelay);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.colorSchemeManager.getPreference().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.onStart$lambda$7(this.f$0, (ColorScheme) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.themePref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.onStart$lambda$9(this.f$0, (Theme) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(PathfinderWebViewDuxo pathfinderWebViewDuxo, final ColorScheme colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        pathfinderWebViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.onStart$lambda$7$lambda$6(colorScheme, (PathfinderWebViewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderWebViewViewState onStart$lambda$7$lambda$6(ColorScheme colorScheme, PathfinderWebViewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PathfinderWebViewViewState.copy$default(applyMutation, null, null, null, null, WebConfig.displayInfoCopy$default(applyMutation.getWebConfig(), null, colorScheme, null, 5, null), null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(final PathfinderWebViewDuxo pathfinderWebViewDuxo, final Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        pathfinderWebViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.onStart$lambda$9$lambda$8(theme, pathfinderWebViewDuxo, (PathfinderWebViewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderWebViewViewState onStart$lambda$9$lambda$8(Theme theme, PathfinderWebViewDuxo pathfinderWebViewDuxo, PathfinderWebViewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PathfinderWebViewViewState.copy$default(applyMutation, null, null, null, null, WebConfig.displayInfoCopy$default(applyMutation.getWebConfig(), theme, null, pathfinderWebViewDuxo.nightModeManager.getDayNightMode(), 2, null), null, 47, null);
    }

    private final void startFallbackTimer(Duration duration, final Function0<Unit> onTimeout) {
        Disposable disposable = this.fallbackTimerDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<Long> observableTimer = Observable.timer(duration.toMillis(), TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        this.fallbackTimerDisposable = LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.startFallbackTimer$lambda$10(onTimeout, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startFallbackTimer$lambda$10(Function0 function0, Long l) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void stopFallbackTimer() {
        Disposable disposable = this.fallbackTimerDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.fallbackTimerDisposable = null;
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public boolean getBackNavigationEnabled() {
        return this.webListener.getBackNavigationEnabled();
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onMailTo(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.webViewEventRelay.accept(new PathfinderWebViewEvent.MailToEvent(uri));
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onDoneClick() {
        this.webViewEventRelay.accept(PathfinderWebViewEvent.DoneClickEvent.INSTANCE);
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onDeeplink(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.webViewEventRelay.accept(new PathfinderWebViewEvent.LinkEvent.UriDeepLinkEvent(uri));
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onExternalUrl(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.webViewEventRelay.accept(new PathfinderWebViewEvent.LinkEvent.ExternalUrlEvent(url));
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void updateInquiry(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.webViewEventRelay.accept(new PathfinderWebViewEvent.NativePathfinderWebViewEvent.SendUserInput(message));
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void updateInquiryWithError(PathfinderStateError error) {
        this.webViewEventRelay.accept(new PathfinderWebViewEvent.NativePathfinderWebViewEvent.UserInputError(error));
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void getInitialConfig() throws Exception {
        if ((this.webViewStateRelay.getValue() instanceof PathfinderWebViewState.Initializing) || (this.webViewStateRelay.getValue() instanceof PathfinderWebViewState.Uninitialized)) {
            try {
                Single singleSingleOrError = getStates().map(new Function() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo.getInitialConfig.1
                    @Override // io.reactivex.functions.Function
                    public final WebConfig apply(PathfinderWebViewViewState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it.getWebConfig();
                    }
                }).take(1L).singleOrError();
                Intrinsics.checkNotNullExpressionValue(singleSingleOrError, "singleOrError(...)");
                LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleSingleOrError), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderWebViewDuxo.getInitialConfig$lambda$11(this.f$0, (WebConfig) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderWebViewDuxo.getInitialConfig$lambda$12(this.f$0, (Throwable) obj);
                    }
                });
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInitialConfig$lambda$11(PathfinderWebViewDuxo pathfinderWebViewDuxo, WebConfig webConfig) {
        PathfinderWebViewDuxo3 pathfinderWebViewDuxo3 = pathfinderWebViewDuxo.webResponder;
        Intrinsics.checkNotNull(webConfig);
        pathfinderWebViewDuxo3.setInitialConfig(webConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInitialConfig$lambda$12(PathfinderWebViewDuxo pathfinderWebViewDuxo, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        pathfinderWebViewDuxo.stopFallbackTimer();
        StateRelay.setWebErrorState(pathfinderWebViewDuxo.webViewStateRelay, new WebError.InitialConfigException(exception.getMessage()), WebErrorView.ErrorViewType.ROUTE_TO_EMAIL);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void refreshToken() {
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(this.webAuthTokenManager.refreshAuthToken(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.refreshToken$lambda$14(this.f$0, (OAuthToken) obj);
            }
        })), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.refreshToken$lambda$16(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.refreshToken$lambda$17(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshToken$lambda$14(PathfinderWebViewDuxo pathfinderWebViewDuxo, final OAuthToken newAuthToken) {
        Intrinsics.checkNotNullParameter(newAuthToken, "newAuthToken");
        pathfinderWebViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebViewDuxo.refreshToken$lambda$14$lambda$13(newAuthToken, (PathfinderWebViewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderWebViewViewState refreshToken$lambda$14$lambda$13(OAuthToken oAuthToken, PathfinderWebViewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PathfinderWebViewViewState.copy$default(applyMutation, null, null, null, null, WebConfig.copy$default(applyMutation.getWebConfig(), oAuthToken, null, null, null, 14, null), null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshToken$lambda$16(PathfinderWebViewDuxo pathfinderWebViewDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OAuthToken oAuthToken = (OAuthToken) optional.component1();
        if (oAuthToken != null) {
            pathfinderWebViewDuxo.webResponder.setToken(oAuthToken);
        } else {
            pathfinderWebViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PathfinderWebViewDuxo.refreshToken$lambda$16$lambda$15((PathfinderWebViewViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderWebViewViewState refreshToken$lambda$16$lambda$15(PathfinderWebViewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PathfinderWebViewViewState.copy$default(applyMutation, null, null, null, null, null, new UiEvent(Unit.INSTANCE), 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshToken$lambda$17(PathfinderWebViewDuxo pathfinderWebViewDuxo, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        pathfinderWebViewDuxo.stopFallbackTimer();
        StateRelay.setWebErrorState(pathfinderWebViewDuxo.webViewStateRelay, exception instanceof WebError ? (WebError) exception : new WebError.GenericAuthTokenException(exception.getMessage()), WebErrorView.ErrorViewType.ROUTE_TO_EMAIL);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void onFirstInteraction() {
        stopFallbackTimer();
        StateRelay.setLoadedState(this.webViewStateRelay);
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void disableBackNavigation() {
        this.webViewEventRelay.accept(PathfinderWebViewEvent.DisableBackNavigation.INSTANCE);
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void dismissWebView() {
        this.webViewEventRelay.accept(PathfinderWebViewEvent.DismissEvent.INSTANCE);
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebListener.Callbacks
    public void goBack() {
        this.webViewEventRelay.accept(PathfinderWebViewEvent.NativePathfinderWebViewEvent.GoBack.INSTANCE);
    }
}
