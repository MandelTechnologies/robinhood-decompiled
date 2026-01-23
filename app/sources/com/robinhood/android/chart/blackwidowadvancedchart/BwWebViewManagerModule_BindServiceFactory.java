package com.robinhood.android.chart.blackwidowadvancedchart;

import android.content.Context;
import black_widow_bff.service.p026v1.BlackWidowBffService;
import com.robinhood.android.chart.sharedchartspan.SharedSpanService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BwWebViewManagerModule_BindServiceFactory.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerModule_BindServiceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "parentScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "blackWidowBffService", "Lblack_widow_bff/service/v1/BlackWidowBffService;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "cachedChartUrl", "Lcom/robinhood/prefs/StringPreference;", "cachedChartVersion", "cachedSpanInterval", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BwWebViewManagerModule_BindServiceFactory implements Factory<BwWebViewManager> {
    private final Provider<AuthManager> authManager;
    private final Provider<AuthTokenManager> authTokenManager;
    private final Provider<BlackWidowBffService> blackWidowBffService;
    private final Provider<StringPreference> cachedChartUrl;
    private final Provider<StringPreference> cachedChartVersion;
    private final Provider<StringPreference> cachedSpanInterval;
    private final Provider<ColorSchemeManager> colorSchemeManager;
    private final Provider<Context> context;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<LazyMoshi> moshi;
    private final Provider<CoroutineScope> parentScope;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<SharedSpanService> sharedSpanService;
    private final Provider<UserAgentProvider> userAgentProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BwWebViewManager bindService(CoroutineScope coroutineScope, Context context, AuthManager authManager, AuthTokenManager authTokenManager, LazyMoshi lazyMoshi, BlackWidowBffService blackWidowBffService, UserAgentProvider userAgentProvider, StringPreference stringPreference, StringPreference stringPreference2, StringPreference stringPreference3, ColorSchemeManager colorSchemeManager, ExperimentsStore experimentsStore, SharedSpanService sharedSpanService, PerformanceLogger performanceLogger) {
        return INSTANCE.bindService(coroutineScope, context, authManager, authTokenManager, lazyMoshi, blackWidowBffService, userAgentProvider, stringPreference, stringPreference2, stringPreference3, colorSchemeManager, experimentsStore, sharedSpanService, performanceLogger);
    }

    @JvmStatic
    public static final BwWebViewManagerModule_BindServiceFactory create(Provider<CoroutineScope> provider, Provider<Context> provider2, Provider<AuthManager> provider3, Provider<AuthTokenManager> provider4, Provider<LazyMoshi> provider5, Provider<BlackWidowBffService> provider6, Provider<UserAgentProvider> provider7, Provider<StringPreference> provider8, Provider<StringPreference> provider9, Provider<StringPreference> provider10, Provider<ColorSchemeManager> provider11, Provider<ExperimentsStore> provider12, Provider<SharedSpanService> provider13, Provider<PerformanceLogger> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public BwWebViewManagerModule_BindServiceFactory(Provider<CoroutineScope> parentScope, Provider<Context> context, Provider<AuthManager> authManager, Provider<AuthTokenManager> authTokenManager, Provider<LazyMoshi> moshi, Provider<BlackWidowBffService> blackWidowBffService, Provider<UserAgentProvider> userAgentProvider, Provider<StringPreference> cachedChartUrl, Provider<StringPreference> cachedChartVersion, Provider<StringPreference> cachedSpanInterval, Provider<ColorSchemeManager> colorSchemeManager, Provider<ExperimentsStore> experimentsStore, Provider<SharedSpanService> sharedSpanService, Provider<PerformanceLogger> performanceLogger) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(blackWidowBffService, "blackWidowBffService");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(cachedChartUrl, "cachedChartUrl");
        Intrinsics.checkNotNullParameter(cachedChartVersion, "cachedChartVersion");
        Intrinsics.checkNotNullParameter(cachedSpanInterval, "cachedSpanInterval");
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        this.parentScope = parentScope;
        this.context = context;
        this.authManager = authManager;
        this.authTokenManager = authTokenManager;
        this.moshi = moshi;
        this.blackWidowBffService = blackWidowBffService;
        this.userAgentProvider = userAgentProvider;
        this.cachedChartUrl = cachedChartUrl;
        this.cachedChartVersion = cachedChartVersion;
        this.cachedSpanInterval = cachedSpanInterval;
        this.colorSchemeManager = colorSchemeManager;
        this.experimentsStore = experimentsStore;
        this.sharedSpanService = sharedSpanService;
        this.performanceLogger = performanceLogger;
    }

    @Override // javax.inject.Provider
    public BwWebViewManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.parentScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        AuthTokenManager authTokenManager = this.authTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(authTokenManager, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        BlackWidowBffService blackWidowBffService = this.blackWidowBffService.get();
        Intrinsics.checkNotNullExpressionValue(blackWidowBffService, "get(...)");
        UserAgentProvider userAgentProvider = this.userAgentProvider.get();
        Intrinsics.checkNotNullExpressionValue(userAgentProvider, "get(...)");
        StringPreference stringPreference = this.cachedChartUrl.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.cachedChartVersion.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        StringPreference stringPreference3 = this.cachedSpanInterval.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager.get();
        Intrinsics.checkNotNullExpressionValue(colorSchemeManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SharedSpanService sharedSpanService = this.sharedSpanService.get();
        Intrinsics.checkNotNullExpressionValue(sharedSpanService, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        return companion.bindService(coroutineScope, context, authManager, authTokenManager, lazyMoshi, blackWidowBffService, userAgentProvider, stringPreference, stringPreference2, stringPreference3, colorSchemeManager, experimentsStore, sharedSpanService, performanceLogger);
    }

    /* compiled from: BwWebViewManagerModule_BindServiceFactory.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007H\u0007Jx\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerModule_BindServiceFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerModule_BindServiceFactory;", "parentScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "blackWidowBffService", "Lblack_widow_bff/service/v1/BlackWidowBffService;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "cachedChartUrl", "Lcom/robinhood/prefs/StringPreference;", "cachedChartVersion", "cachedSpanInterval", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "bindService", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BwWebViewManagerModule_BindServiceFactory create(Provider<CoroutineScope> parentScope, Provider<Context> context, Provider<AuthManager> authManager, Provider<AuthTokenManager> authTokenManager, Provider<LazyMoshi> moshi, Provider<BlackWidowBffService> blackWidowBffService, Provider<UserAgentProvider> userAgentProvider, Provider<StringPreference> cachedChartUrl, Provider<StringPreference> cachedChartVersion, Provider<StringPreference> cachedSpanInterval, Provider<ColorSchemeManager> colorSchemeManager, Provider<ExperimentsStore> experimentsStore, Provider<SharedSpanService> sharedSpanService, Provider<PerformanceLogger> performanceLogger) {
            Intrinsics.checkNotNullParameter(parentScope, "parentScope");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(blackWidowBffService, "blackWidowBffService");
            Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
            Intrinsics.checkNotNullParameter(cachedChartUrl, "cachedChartUrl");
            Intrinsics.checkNotNullParameter(cachedChartVersion, "cachedChartVersion");
            Intrinsics.checkNotNullParameter(cachedSpanInterval, "cachedSpanInterval");
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            return new BwWebViewManagerModule_BindServiceFactory(parentScope, context, authManager, authTokenManager, moshi, blackWidowBffService, userAgentProvider, cachedChartUrl, cachedChartVersion, cachedSpanInterval, colorSchemeManager, experimentsStore, sharedSpanService, performanceLogger);
        }

        @JvmStatic
        public final BwWebViewManager bindService(CoroutineScope parentScope, Context context, AuthManager authManager, AuthTokenManager authTokenManager, LazyMoshi moshi, BlackWidowBffService blackWidowBffService, UserAgentProvider userAgentProvider, StringPreference cachedChartUrl, StringPreference cachedChartVersion, StringPreference cachedSpanInterval, ColorSchemeManager colorSchemeManager, ExperimentsStore experimentsStore, SharedSpanService sharedSpanService, PerformanceLogger performanceLogger) {
            Intrinsics.checkNotNullParameter(parentScope, "parentScope");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(blackWidowBffService, "blackWidowBffService");
            Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
            Intrinsics.checkNotNullParameter(cachedChartUrl, "cachedChartUrl");
            Intrinsics.checkNotNullParameter(cachedChartVersion, "cachedChartVersion");
            Intrinsics.checkNotNullParameter(cachedSpanInterval, "cachedSpanInterval");
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Object objCheckNotNull = Preconditions.checkNotNull(BwWebViewManagerModule.INSTANCE.bindService(parentScope, context, authManager, authTokenManager, moshi, blackWidowBffService, userAgentProvider, cachedChartUrl, cachedChartVersion, cachedSpanInterval, colorSchemeManager, experimentsStore, sharedSpanService, performanceLogger), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (BwWebViewManager) objCheckNotNull;
        }
    }
}
