package com.robinhood.android.chart.blackwidowadvancedchart;

import android.content.Context;
import black_widow_bff.service.p026v1.BlackWidowBffService;
import com.robinhood.android.chart.sharedchartspan.SharedSpanService;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BwWebViewManagerModule.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0082\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerModule;", "", "<init>", "()V", "bindService", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "blackWidowBffService", "Lblack_widow_bff/service/v1/BlackWidowBffService;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "cachedChartUrl", "Lcom/robinhood/prefs/StringPreference;", "cachedChartVersion", "cachedSpanInterval", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BwWebViewManagerModule {
    public static final int $stable = 0;
    public static final BwWebViewManagerModule INSTANCE = new BwWebViewManagerModule();

    private BwWebViewManagerModule() {
    }

    public final BwWebViewManager bindService(@RootCoroutineScope CoroutineScope parentScope, Context context, AuthManager authManager, AuthTokenManager authTokenManager, LazyMoshi moshi, BlackWidowBffService blackWidowBffService, UserAgentProvider userAgentProvider, @BwChartPrefModule2 StringPreference cachedChartUrl, @BwChartPrefModule3 StringPreference cachedChartVersion, @BwChartPrefModule5 StringPreference cachedSpanInterval, ColorSchemeManager colorSchemeManager, ExperimentsStore experimentsStore, SharedSpanService sharedSpanService, PerformanceLogger performanceLogger) {
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
        return new RealBwWebViewManager(new BwWebViewCachedJobManager(parentScope, context, authManager, authTokenManager, moshi, blackWidowBffService, userAgentProvider, cachedChartUrl, cachedChartVersion, cachedSpanInterval, colorSchemeManager, experimentsStore, sharedSpanService, performanceLogger));
    }
}
