package com.robinhood.android.welcome;

import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.referral.AttributionManager;
import com.robinhood.shared.home.deeplink.prompt.BlockedExternalDeeplinkPrompt;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/welcome/WelcomeActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "blockedDeeplinkPrompt", "Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WelcomeActivity_MembersInjector implements MembersInjector<WelcomeActivity> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AttributionManager> attributionManager;
    private final Provider<AuthManager> authManager;
    private final Provider<BiometricAuthManager> biometricAuthManager;
    private final Provider<BlockedExternalDeeplinkPrompt> blockedDeeplinkPrompt;
    private final Provider<PinManager> pinManager;
    private final Provider<BaseActivitySingletons> singletons;

    @JvmStatic
    public static final MembersInjector<WelcomeActivity> create(Provider<BaseActivitySingletons> provider, Provider<AttributionManager> provider2, Provider<PinManager> provider3, Provider<BiometricAuthManager> provider4, Provider<BlockedExternalDeeplinkPrompt> provider5, Provider<AuthManager> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAttributionManager(WelcomeActivity welcomeActivity, AttributionManager attributionManager) {
        INSTANCE.injectAttributionManager(welcomeActivity, attributionManager);
    }

    @JvmStatic
    public static final void injectAuthManager(WelcomeActivity welcomeActivity, AuthManager authManager) {
        INSTANCE.injectAuthManager(welcomeActivity, authManager);
    }

    @JvmStatic
    public static final void injectBiometricAuthManager(WelcomeActivity welcomeActivity, BiometricAuthManager biometricAuthManager) {
        INSTANCE.injectBiometricAuthManager(welcomeActivity, biometricAuthManager);
    }

    @JvmStatic
    public static final void injectBlockedDeeplinkPrompt(WelcomeActivity welcomeActivity, BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt) {
        INSTANCE.injectBlockedDeeplinkPrompt(welcomeActivity, blockedExternalDeeplinkPrompt);
    }

    @JvmStatic
    public static final void injectPinManager(WelcomeActivity welcomeActivity, PinManager pinManager) {
        INSTANCE.injectPinManager(welcomeActivity, pinManager);
    }

    public WelcomeActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<AttributionManager> attributionManager, Provider<PinManager> pinManager, Provider<BiometricAuthManager> biometricAuthManager, Provider<BlockedExternalDeeplinkPrompt> blockedDeeplinkPrompt, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(blockedDeeplinkPrompt, "blockedDeeplinkPrompt");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.singletons = singletons;
        this.attributionManager = attributionManager;
        this.pinManager = pinManager;
        this.biometricAuthManager = biometricAuthManager;
        this.blockedDeeplinkPrompt = blockedDeeplinkPrompt;
        this.authManager = authManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WelcomeActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        AttributionManager attributionManager = this.attributionManager.get();
        Intrinsics.checkNotNullExpressionValue(attributionManager, "get(...)");
        companion2.injectAttributionManager(instance, attributionManager);
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        companion2.injectPinManager(instance, pinManager);
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricAuthManager, "get(...)");
        companion2.injectBiometricAuthManager(instance, biometricAuthManager);
        BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt = this.blockedDeeplinkPrompt.get();
        Intrinsics.checkNotNullExpressionValue(blockedExternalDeeplinkPrompt, "get(...)");
        companion2.injectBlockedDeeplinkPrompt(instance, blockedExternalDeeplinkPrompt);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
    }

    /* compiled from: WelcomeActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/welcome/WelcomeActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "blockedDeeplinkPrompt", "Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectAttributionManager", "", "instance", "injectPinManager", "injectBiometricAuthManager", "injectBlockedDeeplinkPrompt", "injectAuthManager", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<WelcomeActivity> create(Provider<BaseActivitySingletons> singletons, Provider<AttributionManager> attributionManager, Provider<PinManager> pinManager, Provider<BiometricAuthManager> biometricAuthManager, Provider<BlockedExternalDeeplinkPrompt> blockedDeeplinkPrompt, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(blockedDeeplinkPrompt, "blockedDeeplinkPrompt");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new WelcomeActivity_MembersInjector(singletons, attributionManager, pinManager, biometricAuthManager, blockedDeeplinkPrompt, authManager);
        }

        @JvmStatic
        public final void injectAttributionManager(WelcomeActivity instance, AttributionManager attributionManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            instance.setAttributionManager(attributionManager);
        }

        @JvmStatic
        public final void injectPinManager(WelcomeActivity instance, PinManager pinManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            instance.setPinManager(pinManager);
        }

        @JvmStatic
        public final void injectBiometricAuthManager(WelcomeActivity instance, BiometricAuthManager biometricAuthManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            instance.setBiometricAuthManager(biometricAuthManager);
        }

        @JvmStatic
        public final void injectBlockedDeeplinkPrompt(WelcomeActivity instance, BlockedExternalDeeplinkPrompt blockedDeeplinkPrompt) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(blockedDeeplinkPrompt, "blockedDeeplinkPrompt");
            instance.setBlockedDeeplinkPrompt(blockedDeeplinkPrompt);
        }

        @JvmStatic
        public final void injectAuthManager(WelcomeActivity instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }
    }
}
