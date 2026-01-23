package com.robinhood.android.settings.p254ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.RhDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogoutConfirmationDialog_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/LogoutConfirmationDialog_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/settings/ui/LogoutConfirmationDialog;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LogoutConfirmationDialog_MembersInjector implements MembersInjector<LogoutConfirmationDialog> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AuthManager> authManager;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<LogoutConfirmationDialog> create(Provider<BaseDialogSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<AuthManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAuthManager(LogoutConfirmationDialog logoutConfirmationDialog, AuthManager authManager) {
        INSTANCE.injectAuthManager(logoutConfirmationDialog, authManager);
    }

    public LogoutConfirmationDialog_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.singletons = singletons;
        this.analytics = analytics;
        this.authManager = authManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LogoutConfirmationDialog instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        RhDialogFragment_MembersInjector.Companion companion2 = RhDialogFragment_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        Companion companion3 = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion3.injectAuthManager(instance, authManager);
    }

    /* compiled from: LogoutConfirmationDialog_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/LogoutConfirmationDialog_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/settings/ui/LogoutConfirmationDialog;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectAuthManager", "", "instance", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<LogoutConfirmationDialog> create(Provider<BaseDialogSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new LogoutConfirmationDialog_MembersInjector(singletons, analytics, authManager);
        }

        @JvmStatic
        public final void injectAuthManager(LogoutConfirmationDialog instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }
    }
}
