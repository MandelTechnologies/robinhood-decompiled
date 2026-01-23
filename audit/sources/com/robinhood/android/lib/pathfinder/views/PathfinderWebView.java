package com.robinhood.android.lib.pathfinder.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.pathfinder.PathfinderWebViewState;
import com.robinhood.android.lib.pathfinder.views.InternalPathfinderWebViewEvent;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.http.HttpUrls2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.net.HttpCookie;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: PathfinderWebView.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)J(\u0010*\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010+\u001a\u00020)2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010-J\b\u00102\u001a\u00020#H\u0014J\b\u00103\u001a\u00020#H\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;", "getDuxo", "()Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;", "setDuxo", "(Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "installation", "Lcom/robinhood/prefs/Installation;", "getInstallation", "()Lcom/robinhood/prefs/Installation;", "setInstallation", "(Lcom/robinhood/prefs/Installation;)V", "state", "Lio/reactivex/Observable;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "getState", "()Lio/reactivex/Observable;", "events", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewEvent;", "getEvents", "updatePageData", "", "setInquiryId", "inquiryId", "Ljava/util/UUID;", "setTopicId", "topicId", "", "renderUserView", "rawUserView", "callback", "Landroid/webkit/ValueCallback;", "backNavigationEnabled", "", "getBackNavigationEnabled", "()Z", "onAttachedToWindow", "onDetachedFromWindow", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PathfinderWebView extends Hammer_PathfinderWebView {
    private static final String DEVICE_ID_COOKIE_KEY = "device_id";
    private static final String JS_INTERFACE_NAME = "RhAndroid";
    public AuthManager authManager;
    public PathfinderWebViewDuxo duxo;
    public Installation installation;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PathfinderWebView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PathfinderWebView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PathfinderWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setSupportMultipleWindows(true);
    }

    public final PathfinderWebViewDuxo getDuxo() {
        PathfinderWebViewDuxo pathfinderWebViewDuxo = this.duxo;
        if (pathfinderWebViewDuxo != null) {
            return pathfinderWebViewDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(PathfinderWebViewDuxo pathfinderWebViewDuxo) {
        Intrinsics.checkNotNullParameter(pathfinderWebViewDuxo, "<set-?>");
        this.duxo = pathfinderWebViewDuxo;
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    public final Installation getInstallation() {
        Installation installation = this.installation;
        if (installation != null) {
            return installation;
        }
        Intrinsics.throwUninitializedPropertyAccessException("installation");
        return null;
    }

    public final void setInstallation(Installation installation) {
        Intrinsics.checkNotNullParameter(installation, "<set-?>");
        this.installation = installation;
    }

    public final Observable<PathfinderWebViewState> getState() {
        return getDuxo().getWebViewState();
    }

    public final Observable<PathfinderWebViewEvent> getEvents() {
        return getDuxo().getWebViewEvents();
    }

    public final void updatePageData() {
        getDuxo().updatePageData();
    }

    public final void setInquiryId(UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        getDuxo().setInquiryId(inquiryId);
    }

    public final void setTopicId(String topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        getDuxo().setTopicId(topicId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void renderUserView$default(PathfinderWebView pathfinderWebView, UUID uuid, String str, ValueCallback valueCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            valueCallback = null;
        }
        pathfinderWebView.renderUserView(uuid, str, valueCallback);
    }

    public final void renderUserView(UUID inquiryId, String rawUserView, ValueCallback<String> callback) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(rawUserView, "rawUserView");
        getDuxo().renderUserView(inquiryId, rawUserView, callback);
    }

    public final boolean getBackNavigationEnabled() {
        return getDuxo().getBackNavigationEnabled();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<InternalPathfinderWebViewEvent> observableDistinctUntilChanged = getDuxo().getInternalWebViewEvents$lib_pathfinder_externalDebug().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebView.onAttachedToWindow$lambda$1(this.f$0, (InternalPathfinderWebViewEvent) obj);
            }
        });
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final String apply(PathfinderWebViewViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getUserAgentSuffix();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableTake), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebView.onAttachedToWindow$lambda$3(this.f$0, (String) obj);
            }
        });
        Observable<PathfinderWebViewState> observableFilter = getState().filter(new Predicate() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView.onAttachedToWindow.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(PathfinderWebViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof PathfinderWebViewState.Initializing;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableFilter), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebView.onAttachedToWindow$lambda$4(this.f$0, (PathfinderWebViewState) obj);
            }
        });
        Observable<R> observableSwitchMap = getState().filter(new Predicate() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView.onAttachedToWindow.6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(PathfinderWebViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof PathfinderWebViewState.Initializing;
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView.onAttachedToWindow.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends HttpUrl> apply(PathfinderWebViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Observable<R> map = PathfinderWebView.this.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView$onAttachedToWindow$7$apply$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Optional3.asOptional(((PathfinderWebViewViewState) it2).getHostedUrl());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((C20457xec3f3b85<T, R>) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebView.onAttachedToWindow$lambda$5(this.f$0, (HttpUrl) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView$onAttachedToWindow$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<Unit> logout = ((PathfinderWebViewViewState) it).getLogout();
                return Optional3.asOptional(logout != null ? logout.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((PathfinderWebView$onAttachedToWindow$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewDisposerKt.bindTo$default(ObservablesKt.filterIsPresent(map), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.views.PathfinderWebView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderWebView.onAttachedToWindow$lambda$7(this.f$0, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(PathfinderWebView pathfinderWebView, InternalPathfinderWebViewEvent internalPathfinderWebViewEvent) {
        if (!(internalPathfinderWebViewEvent instanceof InternalPathfinderWebViewEvent.JavascriptExecutionEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        InternalPathfinderWebViewEvent.JavascriptExecutionEvent javascriptExecutionEvent = (InternalPathfinderWebViewEvent.JavascriptExecutionEvent) internalPathfinderWebViewEvent;
        pathfinderWebView.evaluateJavascript(javascriptExecutionEvent.getJavascriptString(), javascriptExecutionEvent.getCallback());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(PathfinderWebView pathfinderWebView, String str) {
        WebSettings settings = pathfinderWebView.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + PlaceholderUtils.XXShortPlaceholderText + str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(PathfinderWebView pathfinderWebView, PathfinderWebViewState pathfinderWebViewState) {
        pathfinderWebView.addJavascriptInterface(pathfinderWebView.getDuxo().getWebListener(), JS_INTERFACE_NAME);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$5(PathfinderWebView pathfinderWebView, HttpUrl httpUrl) {
        if (httpUrl.getIsHttps()) {
            Intrinsics.checkNotNull(httpUrl);
            if (HttpUrls2.isRobinhoodDomain(httpUrl)) {
                HttpCookie httpCookie = new HttpCookie(DEVICE_ID_COOKIE_KEY, pathfinderWebView.getInstallation().mo2745id());
                httpCookie.setSecure(true);
                httpCookie.setDomain(httpUrl.topPrivateDomain());
                CookieManager.getInstance().setCookie(httpUrl.getUrl(), httpCookie.toString());
                pathfinderWebView.clearHistory();
                pathfinderWebView.loadUrl(httpUrl.getUrl());
                pathfinderWebView.setWebChromeClient(pathfinderWebView.getDuxo().getWebChromeClient());
                PathfinderWebViewDuxo duxo = pathfinderWebView.getDuxo();
                Intrinsics.checkNotNull(httpUrl);
                pathfinderWebView.setWebViewClient(duxo.newWebViewClient(httpUrl));
                return Unit.INSTANCE;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(PathfinderWebView pathfinderWebView, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AuthManager authManager = pathfinderWebView.getAuthManager();
        Context context = pathfinderWebView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AuthManager.DefaultImpls.initiateLogout$default(authManager, context, LogoutType.HTTP_401, null, false, null, "pathfinder_web_token_refresh_fail", 28, null);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeJavascriptInterface(JS_INTERFACE_NAME);
        setWebChromeClient(null);
    }
}
