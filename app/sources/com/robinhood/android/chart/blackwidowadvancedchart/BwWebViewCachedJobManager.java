package com.robinhood.android.chart.blackwidowadvancedchart;

import android.content.Context;
import black_widow_bff.service.p026v1.BlackWidowBffService;
import com.robinhood.android.chart.sharedchartspan.SharedSpanService;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.coroutines.job.CachedJobManager2;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BwWebViewCachedJobManager.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0081\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0004H\u0014J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewCachedJobManager;", "Lcom/robinhood/coroutines/job/AbstractCachedJobManager;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "blackWidowBffService", "Lblack_widow_bff/service/v1/BlackWidowBffService;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "cachedChartUrl", "Lcom/robinhood/prefs/StringPreference;", "cachedChartVersion", "cachedSpanInterval", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lblack_widow_bff/service/v1/BlackWidowBffService;Lcom/robinhood/shared/user/agent/UserAgentProvider;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "getParentScope", "()Lkotlinx/coroutines/CoroutineScope;", "launchComponent", "scope", "onComponentDestroyed", "", "component", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BwWebViewCachedJobManager extends CachedJobManager2<BwWebViewComponent> {
    public static final int $stable = 8;
    private final AuthManager authManager;
    private final AuthTokenManager authTokenManager;
    private final BlackWidowBffService blackWidowBffService;
    private final StringPreference cachedChartUrl;
    private final StringPreference cachedChartVersion;
    private final StringPreference cachedSpanInterval;
    private final ColorSchemeManager colorSchemeManager;
    private final Context context;
    private final ExperimentsStore experimentsStore;
    private final LazyMoshi moshi;
    private final CoroutineScope parentScope;
    private final PerformanceLogger performanceLogger;
    private final SharedSpanService sharedSpanService;
    private final UserAgentProvider userAgentProvider;

    @Override // com.robinhood.coroutines.job.CachedJobManager2
    public /* bridge */ /* synthetic */ Object onComponentDestroyed(BwWebViewComponent bwWebViewComponent, Continuation continuation) {
        return onComponentDestroyed2(bwWebViewComponent, (Continuation<? super Unit>) continuation);
    }

    @Override // com.robinhood.coroutines.job.CachedJobManager2
    protected CoroutineScope getParentScope() {
        return this.parentScope;
    }

    public BwWebViewCachedJobManager(@RootCoroutineScope CoroutineScope parentScope, Context context, AuthManager authManager, AuthTokenManager authTokenManager, LazyMoshi moshi, BlackWidowBffService blackWidowBffService, UserAgentProvider userAgentProvider, @BwChartPrefModule2 StringPreference cachedChartUrl, @BwChartPrefModule3 StringPreference cachedChartVersion, @BwChartPrefModule5 StringPreference cachedSpanInterval, ColorSchemeManager colorSchemeManager, ExperimentsStore experimentsStore, SharedSpanService sharedSpanService, PerformanceLogger performanceLogger) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.coroutines.job.CachedJobManager2
    public BwWebViewComponent launchComponent(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        LazyMoshi lazyMoshi = this.moshi;
        Context context = this.context;
        AuthManager authManager = this.authManager;
        AuthTokenManager authTokenManager = this.authTokenManager;
        CoroutineScope coroutineScopePlus = CoroutineScope2.plus(scope, Dispatchers.getMain());
        BlackWidowBffService blackWidowBffService = this.blackWidowBffService;
        UserAgentProvider userAgentProvider = this.userAgentProvider;
        StringPreference stringPreference = this.cachedChartUrl;
        StringPreference stringPreference2 = this.cachedChartVersion;
        return new BwWebViewComponent(lazyMoshi, blackWidowBffService, context, authTokenManager, authManager, userAgentProvider, coroutineScopePlus, this.colorSchemeManager, this.experimentsStore, this.sharedSpanService, this.performanceLogger, stringPreference, stringPreference2, this.cachedSpanInterval);
    }

    /* renamed from: onComponentDestroyed, reason: avoid collision after fix types in other method */
    public Object onComponentDestroyed2(BwWebViewComponent bwWebViewComponent, Continuation<? super Unit> continuation) {
        Object objDestroyWebView = bwWebViewComponent.destroyWebView(continuation);
        return objDestroyWebView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDestroyWebView : Unit.INSTANCE;
    }
}
