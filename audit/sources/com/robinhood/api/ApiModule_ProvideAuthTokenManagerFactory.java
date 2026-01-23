package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.RealAuthTokenManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModule_ProvideAuthTokenManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/api/ApiModule_ProvideAuthTokenManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "authTokenManager", "Ljavax/inject/Provider;", "Lcom/robinhood/api/utils/RealAuthTokenManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ApiModule_ProvideAuthTokenManagerFactory implements Factory<AuthTokenManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RealAuthTokenManager> authTokenManager;

    @JvmStatic
    public static final ApiModule_ProvideAuthTokenManagerFactory create(Provider<RealAuthTokenManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final AuthTokenManager provideAuthTokenManager(RealAuthTokenManager realAuthTokenManager) {
        return INSTANCE.provideAuthTokenManager(realAuthTokenManager);
    }

    public ApiModule_ProvideAuthTokenManagerFactory(Provider<RealAuthTokenManager> authTokenManager) {
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        this.authTokenManager = authTokenManager;
    }

    @Override // javax.inject.Provider
    public AuthTokenManager get() {
        Companion companion = INSTANCE;
        RealAuthTokenManager realAuthTokenManager = this.authTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(realAuthTokenManager, "get(...)");
        return companion.provideAuthTokenManager(realAuthTokenManager);
    }

    /* compiled from: ApiModule_ProvideAuthTokenManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/ApiModule_ProvideAuthTokenManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/ApiModule_ProvideAuthTokenManagerFactory;", "authTokenManager", "Ljavax/inject/Provider;", "Lcom/robinhood/api/utils/RealAuthTokenManager;", "provideAuthTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApiModule_ProvideAuthTokenManagerFactory create(Provider<RealAuthTokenManager> authTokenManager) {
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            return new ApiModule_ProvideAuthTokenManagerFactory(authTokenManager);
        }

        @JvmStatic
        public final AuthTokenManager provideAuthTokenManager(RealAuthTokenManager authTokenManager) {
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Object objCheckNotNull = Preconditions.checkNotNull(ApiModule.INSTANCE.provideAuthTokenManager(authTokenManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (AuthTokenManager) objCheckNotNull;
        }
    }
}
