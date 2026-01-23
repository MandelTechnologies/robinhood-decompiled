package com.robinhood.android.rhweb;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhWebFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhweb/RhWebFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhWebFragment_MembersInjector implements MembersInjector<RhWebFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AuthManager> authManager;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<LazyMoshi> moshi;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final MembersInjector<RhWebFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<SharedEventLogger> provider3, Provider<AuthManager> provider4, Provider<TargetBackend> provider5, Provider<LazyMoshi> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAnalytics(RhWebFragment rhWebFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(rhWebFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectAuthManager(RhWebFragment rhWebFragment, AuthManager authManager) {
        INSTANCE.injectAuthManager(rhWebFragment, authManager);
    }

    @JvmStatic
    public static final void injectEventLogger(RhWebFragment rhWebFragment, SharedEventLogger sharedEventLogger) {
        INSTANCE.injectEventLogger(rhWebFragment, sharedEventLogger);
    }

    @JvmStatic
    public static final void injectMoshi(RhWebFragment rhWebFragment, LazyMoshi lazyMoshi) {
        INSTANCE.injectMoshi(rhWebFragment, lazyMoshi);
    }

    @JvmStatic
    public static final void injectTargetBackend(RhWebFragment rhWebFragment, TargetBackend targetBackend) {
        INSTANCE.injectTargetBackend(rhWebFragment, targetBackend);
    }

    public RhWebFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<AuthManager> authManager, Provider<TargetBackend> targetBackend, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.singletons = singletons;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.authManager = authManager;
        this.targetBackend = targetBackend;
        this.moshi = moshi;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhWebFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        companion2.injectEventLogger(instance, sharedEventLogger);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        companion2.injectTargetBackend(instance, targetBackend);
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        companion2.injectMoshi(instance, lazyMoshi);
    }

    /* compiled from: RhWebFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhweb/RhWebFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "injectAnalytics", "", "instance", "injectEventLogger", "injectAuthManager", "injectTargetBackend", "injectMoshi", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RhWebFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<AuthManager> authManager, Provider<TargetBackend> targetBackend, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new RhWebFragment_MembersInjector(singletons, analytics, eventLogger, authManager, targetBackend, moshi);
        }

        @JvmStatic
        public final void injectAnalytics(RhWebFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(RhWebFragment instance, SharedEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectAuthManager(RhWebFragment instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }

        @JvmStatic
        public final void injectTargetBackend(RhWebFragment instance, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            instance.setTargetBackend(targetBackend);
        }

        @JvmStatic
        public final void injectMoshi(RhWebFragment instance, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            instance.setMoshi(moshi);
        }
    }
}
