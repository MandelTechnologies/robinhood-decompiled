package com.robinhood.analytics;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionManagerModule_ProvideSessionManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/analytics/SessionManagerModule_ProvideSessionManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/SessionManager;", "realSessionManager", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/RealSessionManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SessionManagerModule_ProvideSessionManagerFactory implements Factory<SessionManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RealSessionManager> realSessionManager;

    @JvmStatic
    public static final SessionManagerModule_ProvideSessionManagerFactory create(Provider<RealSessionManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final SessionManager provideSessionManager(RealSessionManager realSessionManager) {
        return INSTANCE.provideSessionManager(realSessionManager);
    }

    public SessionManagerModule_ProvideSessionManagerFactory(Provider<RealSessionManager> realSessionManager) {
        Intrinsics.checkNotNullParameter(realSessionManager, "realSessionManager");
        this.realSessionManager = realSessionManager;
    }

    @Override // javax.inject.Provider
    public SessionManager get() {
        Companion companion = INSTANCE;
        RealSessionManager realSessionManager = this.realSessionManager.get();
        Intrinsics.checkNotNullExpressionValue(realSessionManager, "get(...)");
        return companion.provideSessionManager(realSessionManager);
    }

    /* compiled from: SessionManagerModule_ProvideSessionManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/analytics/SessionManagerModule_ProvideSessionManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/analytics/SessionManagerModule_ProvideSessionManagerFactory;", "realSessionManager", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/RealSessionManager;", "provideSessionManager", "Lcom/robinhood/analytics/SessionManager;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SessionManagerModule_ProvideSessionManagerFactory create(Provider<RealSessionManager> realSessionManager) {
            Intrinsics.checkNotNullParameter(realSessionManager, "realSessionManager");
            return new SessionManagerModule_ProvideSessionManagerFactory(realSessionManager);
        }

        @JvmStatic
        public final SessionManager provideSessionManager(RealSessionManager realSessionManager) {
            Intrinsics.checkNotNullParameter(realSessionManager, "realSessionManager");
            Object objCheckNotNull = Preconditions.checkNotNull(SessionManagerModule.INSTANCE.provideSessionManager(realSessionManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (SessionManager) objCheckNotNull;
        }
    }
}
