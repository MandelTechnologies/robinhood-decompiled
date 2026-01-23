package com.robinhood.android.lib.pathfinder.views;

import android.view.View;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.lib.pathfinder.PathfinderUrlProvider;
import com.robinhood.android.lib.webview.WebAuthTokenManager;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.RxGlobalErrorHandler;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderWebViewDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bï\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\u0017\u0010\u0018\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u00130\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0018\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;", "releaseVersion", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/ReleaseVersion;", "hostView", "Landroid/view/View;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "installation", "Lcom/robinhood/prefs/Installation;", "pathfinderUrlProvider", "Lcom/robinhood/android/lib/pathfinder/PathfinderUrlProvider;", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "Lkotlin/jvm/JvmSuppressWildcards;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "webAuthTokenManager", "Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PathfinderWebViewDuxo_Factory implements Factory<PathfinderWebViewDuxo> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<ColorSchemeManager> colorSchemeManager;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<View> hostView;
    private final Provider<Installation> installation;
    private final Provider<LazyMoshi> moshi;
    private final Provider<NightModeManager> nightModeManager;
    private final Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref;
    private final Provider<PathfinderUrlProvider> pathfinderUrlProvider;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<EnumPreference<Theme>> themePref;
    private final Provider<WebAuthTokenManager> webAuthTokenManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PathfinderWebViewDuxo_Factory create(Provider<ReleaseVersion> provider, Provider<View> provider2, Provider<AnalyticsLogger> provider3, Provider<SharedEventLogger> provider4, Provider<Installation> provider5, Provider<PathfinderUrlProvider> provider6, Provider<MoshiSecurePreference<OAuthToken>> provider7, Provider<ColorSchemeManager> provider8, Provider<NightModeManager> provider9, Provider<EnumPreference<Theme>> provider10, Provider<WebAuthTokenManager> provider11, Provider<LazyMoshi> provider12, Provider<DispatcherProvider> provider13, Provider<RxFactory> provider14, Provider<RxGlobalErrorHandler> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final PathfinderWebViewDuxo newInstance(ReleaseVersion releaseVersion, View view, AnalyticsLogger analyticsLogger, SharedEventLogger sharedEventLogger, Installation installation, PathfinderUrlProvider pathfinderUrlProvider, MoshiSecurePreference<OAuthToken> moshiSecurePreference, ColorSchemeManager colorSchemeManager, NightModeManager nightModeManager, EnumPreference<Theme> enumPreference, WebAuthTokenManager webAuthTokenManager, LazyMoshi lazyMoshi) {
        return INSTANCE.newInstance(releaseVersion, view, analyticsLogger, sharedEventLogger, installation, pathfinderUrlProvider, moshiSecurePreference, colorSchemeManager, nightModeManager, enumPreference, webAuthTokenManager, lazyMoshi);
    }

    public PathfinderWebViewDuxo_Factory(Provider<ReleaseVersion> releaseVersion, Provider<View> hostView, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<Installation> installation, Provider<PathfinderUrlProvider> pathfinderUrlProvider, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<ColorSchemeManager> colorSchemeManager, Provider<NightModeManager> nightModeManager, Provider<EnumPreference<Theme>> themePref, Provider<WebAuthTokenManager> webAuthTokenManager, Provider<LazyMoshi> moshi, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
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
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.releaseVersion = releaseVersion;
        this.hostView = hostView;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.installation = installation;
        this.pathfinderUrlProvider = pathfinderUrlProvider;
        this.oAuthTokenPref = oAuthTokenPref;
        this.colorSchemeManager = colorSchemeManager;
        this.nightModeManager = nightModeManager;
        this.themePref = themePref;
        this.webAuthTokenManager = webAuthTokenManager;
        this.moshi = moshi;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public PathfinderWebViewDuxo get() {
        Companion companion = INSTANCE;
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        View view = this.hostView.get();
        Intrinsics.checkNotNullExpressionValue(view, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        PathfinderUrlProvider pathfinderUrlProvider = this.pathfinderUrlProvider.get();
        Intrinsics.checkNotNullExpressionValue(pathfinderUrlProvider, "get(...)");
        MoshiSecurePreference<OAuthToken> moshiSecurePreference = this.oAuthTokenPref.get();
        Intrinsics.checkNotNullExpressionValue(moshiSecurePreference, "get(...)");
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager.get();
        Intrinsics.checkNotNullExpressionValue(colorSchemeManager, "get(...)");
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        EnumPreference<Theme> enumPreference = this.themePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        WebAuthTokenManager webAuthTokenManager = this.webAuthTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(webAuthTokenManager, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        PathfinderWebViewDuxo pathfinderWebViewDuxoNewInstance = companion.newInstance(releaseVersion, view, analyticsLogger, sharedEventLogger, installation, pathfinderUrlProvider, moshiSecurePreference, colorSchemeManager, nightModeManager, enumPreference, webAuthTokenManager, lazyMoshi);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(pathfinderWebViewDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(pathfinderWebViewDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(pathfinderWebViewDuxoNewInstance, rxGlobalErrorHandler);
        return pathfinderWebViewDuxoNewInstance;
    }

    /* compiled from: PathfinderWebViewDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jð\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0017\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0017\u0010\u001b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u00160\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0007H\u0007J~\u0010(\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo_Factory;", "releaseVersion", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/ReleaseVersion;", "hostView", "Landroid/view/View;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "installation", "Lcom/robinhood/prefs/Installation;", "pathfinderUrlProvider", "Lcom/robinhood/android/lib/pathfinder/PathfinderUrlProvider;", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "Lkotlin/jvm/JvmSuppressWildcards;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "webAuthTokenManager", "Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PathfinderWebViewDuxo_Factory create(Provider<ReleaseVersion> releaseVersion, Provider<View> hostView, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<Installation> installation, Provider<PathfinderUrlProvider> pathfinderUrlProvider, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<ColorSchemeManager> colorSchemeManager, Provider<NightModeManager> nightModeManager, Provider<EnumPreference<Theme>> themePref, Provider<WebAuthTokenManager> webAuthTokenManager, Provider<LazyMoshi> moshi, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
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
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new PathfinderWebViewDuxo_Factory(releaseVersion, hostView, analytics, eventLogger, installation, pathfinderUrlProvider, oAuthTokenPref, colorSchemeManager, nightModeManager, themePref, webAuthTokenManager, moshi, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final PathfinderWebViewDuxo newInstance(ReleaseVersion releaseVersion, View hostView, AnalyticsLogger analytics, SharedEventLogger eventLogger, Installation installation, PathfinderUrlProvider pathfinderUrlProvider, MoshiSecurePreference<OAuthToken> oAuthTokenPref, ColorSchemeManager colorSchemeManager, NightModeManager nightModeManager, EnumPreference<Theme> themePref, WebAuthTokenManager webAuthTokenManager, LazyMoshi moshi) {
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
            return new PathfinderWebViewDuxo(releaseVersion, hostView, analytics, eventLogger, installation, pathfinderUrlProvider, oAuthTokenPref, colorSchemeManager, nightModeManager, themePref, webAuthTokenManager, moshi);
        }
    }
}
