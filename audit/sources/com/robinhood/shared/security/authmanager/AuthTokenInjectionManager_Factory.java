package com.robinhood.shared.security.authmanager;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthTokenInjectionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AuthTokenInjectionManager_Factory implements Factory<AuthTokenInjectionManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RealAuthManager> authManager;

    @JvmStatic
    public static final AuthTokenInjectionManager_Factory create(Provider<RealAuthManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final AuthTokenInjectionManager newInstance(RealAuthManager realAuthManager) {
        return INSTANCE.newInstance(realAuthManager);
    }

    public AuthTokenInjectionManager_Factory(Provider<RealAuthManager> authManager) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.authManager = authManager;
    }

    @Override // javax.inject.Provider
    public AuthTokenInjectionManager get() {
        Companion companion = INSTANCE;
        RealAuthManager realAuthManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(realAuthManager, "get(...)");
        return companion.newInstance(realAuthManager);
    }

    /* compiled from: AuthTokenInjectionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager_Factory;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "newInstance", "Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager;", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AuthTokenInjectionManager_Factory create(Provider<RealAuthManager> authManager) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new AuthTokenInjectionManager_Factory(authManager);
        }

        @JvmStatic
        public final AuthTokenInjectionManager newInstance(RealAuthManager authManager) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new AuthTokenInjectionManager(authManager);
        }
    }
}
