package com.robinhood.api.interceptor;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.ApiExperimentManager;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.targetbackend.TargetBackend;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RobinhoodRequestInterceptor_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "localeConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "apiExperimentManager", "Lcom/robinhood/api/utils/ApiExperimentManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RobinhoodRequestInterceptor_Factory implements Factory<RobinhoodRequestInterceptor> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ApiExperimentManager> apiExperimentManager;
    private final Provider<AuthTokenManager> authTokenManager;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<LocaleConfiguration> localeConfiguration;
    private final Provider<TargetBackend> targetBackend;
    private final Provider<UserAgentProvider> userAgentProvider;

    @JvmStatic
    public static final RobinhoodRequestInterceptor_Factory create(Provider<CoroutineScope> provider, Provider<UserAgentProvider> provider2, Provider<AuthTokenManager> provider3, Provider<LocaleConfiguration> provider4, Provider<ApiExperimentManager> provider5, Provider<TargetBackend> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final RobinhoodRequestInterceptor newInstance(CoroutineScope coroutineScope, UserAgentProvider userAgentProvider, AuthTokenManager authTokenManager, LocaleConfiguration localeConfiguration, ApiExperimentManager apiExperimentManager, TargetBackend targetBackend) {
        return INSTANCE.newInstance(coroutineScope, userAgentProvider, authTokenManager, localeConfiguration, apiExperimentManager, targetBackend);
    }

    public RobinhoodRequestInterceptor_Factory(Provider<CoroutineScope> coroutineScope, Provider<UserAgentProvider> userAgentProvider, Provider<AuthTokenManager> authTokenManager, Provider<LocaleConfiguration> localeConfiguration, Provider<ApiExperimentManager> apiExperimentManager, Provider<TargetBackend> targetBackend) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
        Intrinsics.checkNotNullParameter(apiExperimentManager, "apiExperimentManager");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.coroutineScope = coroutineScope;
        this.userAgentProvider = userAgentProvider;
        this.authTokenManager = authTokenManager;
        this.localeConfiguration = localeConfiguration;
        this.apiExperimentManager = apiExperimentManager;
        this.targetBackend = targetBackend;
    }

    @Override // javax.inject.Provider
    public RobinhoodRequestInterceptor get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        UserAgentProvider userAgentProvider = this.userAgentProvider.get();
        Intrinsics.checkNotNullExpressionValue(userAgentProvider, "get(...)");
        AuthTokenManager authTokenManager = this.authTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(authTokenManager, "get(...)");
        LocaleConfiguration localeConfiguration = this.localeConfiguration.get();
        Intrinsics.checkNotNullExpressionValue(localeConfiguration, "get(...)");
        ApiExperimentManager apiExperimentManager = this.apiExperimentManager.get();
        Intrinsics.checkNotNullExpressionValue(apiExperimentManager, "get(...)");
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        return companion.newInstance(coroutineScope, userAgentProvider, authTokenManager, localeConfiguration, apiExperimentManager, targetBackend);
    }

    /* compiled from: RobinhoodRequestInterceptor_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "localeConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "apiExperimentManager", "Lcom/robinhood/api/utils/ApiExperimentManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "newInstance", "Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RobinhoodRequestInterceptor_Factory create(Provider<CoroutineScope> coroutineScope, Provider<UserAgentProvider> userAgentProvider, Provider<AuthTokenManager> authTokenManager, Provider<LocaleConfiguration> localeConfiguration, Provider<ApiExperimentManager> apiExperimentManager, Provider<TargetBackend> targetBackend) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
            Intrinsics.checkNotNullParameter(apiExperimentManager, "apiExperimentManager");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            return new RobinhoodRequestInterceptor_Factory(coroutineScope, userAgentProvider, authTokenManager, localeConfiguration, apiExperimentManager, targetBackend);
        }

        @JvmStatic
        public final RobinhoodRequestInterceptor newInstance(CoroutineScope coroutineScope, UserAgentProvider userAgentProvider, AuthTokenManager authTokenManager, LocaleConfiguration localeConfiguration, ApiExperimentManager apiExperimentManager, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
            Intrinsics.checkNotNullParameter(apiExperimentManager, "apiExperimentManager");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            return new RobinhoodRequestInterceptor(coroutineScope, userAgentProvider, authTokenManager, localeConfiguration, apiExperimentManager, targetBackend);
        }
    }
}
