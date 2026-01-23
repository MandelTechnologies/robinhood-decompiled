package com.robinhood.android.challenge.verification;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeVerificationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "supportBreadcrumbTracker", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ChallengeVerificationFragment_MembersInjector implements MembersInjector<ChallengeVerificationFragment> {
    private final Provider<AuthManager> authManager;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SupportBreadcrumbTracker> supportBreadcrumbTracker;
    private final Provider<SupportEmailHandler> supportEmailHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ChallengeVerificationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<SupportBreadcrumbTracker> provider2, Provider<SupportEmailHandler> provider3, Provider<EventLogger> provider4, Provider<AuthManager> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectAuthManager(ChallengeVerificationFragment challengeVerificationFragment, AuthManager authManager) {
        INSTANCE.injectAuthManager(challengeVerificationFragment, authManager);
    }

    @JvmStatic
    public static final void injectEventLogger(ChallengeVerificationFragment challengeVerificationFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(challengeVerificationFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectSupportBreadcrumbTracker(ChallengeVerificationFragment challengeVerificationFragment, SupportBreadcrumbTracker supportBreadcrumbTracker) {
        INSTANCE.injectSupportBreadcrumbTracker(challengeVerificationFragment, supportBreadcrumbTracker);
    }

    @JvmStatic
    public static final void injectSupportEmailHandler(ChallengeVerificationFragment challengeVerificationFragment, SupportEmailHandler supportEmailHandler) {
        INSTANCE.injectSupportEmailHandler(challengeVerificationFragment, supportEmailHandler);
    }

    public ChallengeVerificationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<SupportBreadcrumbTracker> supportBreadcrumbTracker, Provider<SupportEmailHandler> supportEmailHandler, Provider<EventLogger> eventLogger, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(supportBreadcrumbTracker, "supportBreadcrumbTracker");
        Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.singletons = singletons;
        this.supportBreadcrumbTracker = supportBreadcrumbTracker;
        this.supportEmailHandler = supportEmailHandler;
        this.eventLogger = eventLogger;
        this.authManager = authManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChallengeVerificationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        SupportBreadcrumbTracker supportBreadcrumbTracker = this.supportBreadcrumbTracker.get();
        Intrinsics.checkNotNullExpressionValue(supportBreadcrumbTracker, "get(...)");
        companion2.injectSupportBreadcrumbTracker(instance, supportBreadcrumbTracker);
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler.get();
        Intrinsics.checkNotNullExpressionValue(supportEmailHandler, "get(...)");
        companion2.injectSupportEmailHandler(instance, supportEmailHandler);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
    }

    /* compiled from: ChallengeVerificationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "supportBreadcrumbTracker", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectSupportBreadcrumbTracker", "", "instance", "injectSupportEmailHandler", "injectEventLogger", "injectAuthManager", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ChallengeVerificationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<SupportBreadcrumbTracker> supportBreadcrumbTracker, Provider<SupportEmailHandler> supportEmailHandler, Provider<EventLogger> eventLogger, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(supportBreadcrumbTracker, "supportBreadcrumbTracker");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new ChallengeVerificationFragment_MembersInjector(singletons, supportBreadcrumbTracker, supportEmailHandler, eventLogger, authManager);
        }

        @JvmStatic
        public final void injectSupportBreadcrumbTracker(ChallengeVerificationFragment instance, SupportBreadcrumbTracker supportBreadcrumbTracker) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(supportBreadcrumbTracker, "supportBreadcrumbTracker");
            instance.setSupportBreadcrumbTracker(supportBreadcrumbTracker);
        }

        @JvmStatic
        public final void injectSupportEmailHandler(ChallengeVerificationFragment instance, SupportEmailHandler supportEmailHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            instance.setSupportEmailHandler(supportEmailHandler);
        }

        @JvmStatic
        public final void injectEventLogger(ChallengeVerificationFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectAuthManager(ChallengeVerificationFragment instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }
    }
}
