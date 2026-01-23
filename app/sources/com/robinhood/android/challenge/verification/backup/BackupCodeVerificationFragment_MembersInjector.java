package com.robinhood.android.challenge.verification.backup;

import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackupCodeVerificationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BackupCodeVerificationFragment_MembersInjector implements MembersInjector<BackupCodeVerificationFragment> {
    private final Provider<AuthManager> authManager;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SupportEmailHandler> supportEmailHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<BackupCodeVerificationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<SupportEmailHandler> provider2, Provider<AuthManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAuthManager(BackupCodeVerificationFragment backupCodeVerificationFragment, AuthManager authManager) {
        INSTANCE.injectAuthManager(backupCodeVerificationFragment, authManager);
    }

    @JvmStatic
    public static final void injectSupportEmailHandler(BackupCodeVerificationFragment backupCodeVerificationFragment, SupportEmailHandler supportEmailHandler) {
        INSTANCE.injectSupportEmailHandler(backupCodeVerificationFragment, supportEmailHandler);
    }

    public BackupCodeVerificationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<SupportEmailHandler> supportEmailHandler, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.singletons = singletons;
        this.supportEmailHandler = supportEmailHandler;
        this.authManager = authManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BackupCodeVerificationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler.get();
        Intrinsics.checkNotNullExpressionValue(supportEmailHandler, "get(...)");
        companion2.injectSupportEmailHandler(instance, supportEmailHandler);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
    }

    /* compiled from: BackupCodeVerificationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectSupportEmailHandler", "", "instance", "injectAuthManager", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<BackupCodeVerificationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<SupportEmailHandler> supportEmailHandler, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new BackupCodeVerificationFragment_MembersInjector(singletons, supportEmailHandler, authManager);
        }

        @JvmStatic
        public final void injectSupportEmailHandler(BackupCodeVerificationFragment instance, SupportEmailHandler supportEmailHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            instance.setSupportEmailHandler$feature_challenge_externalDebug(supportEmailHandler);
        }

        @JvmStatic
        public final void injectAuthManager(BackupCodeVerificationFragment instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }
    }
}
