package com.robinhood.shared.security.auth.interceptor;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OAuth401Interceptor_Factory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OAuth401Interceptor_Factory implements Factory<OAuth401Interceptor> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> application;
    private final Provider<AuthManager> authManager;
    private final Provider<AuthTokenManager> authTokenManager;

    @JvmStatic
    public static final OAuth401Interceptor_Factory create(Provider<Application> provider, Provider<AuthTokenManager> provider2, Provider<AuthManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final OAuth401Interceptor newInstance(Application application, Lazy<AuthTokenManager> lazy, Lazy<AuthManager> lazy2) {
        return INSTANCE.newInstance(application, lazy, lazy2);
    }

    public OAuth401Interceptor_Factory(Provider<Application> application, Provider<AuthTokenManager> authTokenManager, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.application = application;
        this.authTokenManager = authTokenManager;
        this.authManager = authManager;
    }

    @Override // javax.inject.Provider
    public OAuth401Interceptor get() {
        Companion companion = INSTANCE;
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        Lazy<AuthTokenManager> lazy = DoubleCheck.lazy(this.authTokenManager);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<AuthManager> lazy2 = DoubleCheck.lazy(this.authManager);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        return companion.newInstance(application, lazy, lazy2);
    }

    /* compiled from: OAuth401Interceptor_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00072\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000b0\u0007H\u0007J6\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00102\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000b0\u0010H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor_Factory;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "newInstance", "Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor;", "Ldagger/Lazy;", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OAuth401Interceptor_Factory create(Provider<Application> application, Provider<AuthTokenManager> authTokenManager, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new OAuth401Interceptor_Factory(application, authTokenManager, authManager);
        }

        @JvmStatic
        public final OAuth401Interceptor newInstance(Application application, Lazy<AuthTokenManager> authTokenManager, Lazy<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new OAuth401Interceptor(application, authTokenManager, authManager);
        }
    }
}
