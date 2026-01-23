package com.robinhood.shared.login.lockscreen;

import android.graphics.drawable.Drawable;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.p099di.BrandLogo;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BiometricAuthFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0082\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0017\u0010\u0012\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/BiometricAuthFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/BiometricAuthFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "brandLogo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class BiometricAuthFragment_MembersInjector implements MembersInjector<BiometricAuthFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BiometricAuthManager> biometricAuthManager;
    private final Provider<DirectResourceReference<Drawable>> brandLogo;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<LockscreenManager> lockscreenManager;
    private final Provider<ScarletOverlay> lockscreenOverlay;
    private final Provider<PinManager> pinManager;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<BiometricAuthFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<SharedEventLogger> provider3, Provider<BiometricAuthManager> provider4, Provider<PinManager> provider5, Provider<LockscreenManager> provider6, Provider<ScarletOverlay> provider7, Provider<DirectResourceReference<Drawable>> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final void injectAnalytics(BiometricAuthFragment biometricAuthFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(biometricAuthFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectBiometricAuthManager(BiometricAuthFragment biometricAuthFragment, BiometricAuthManager biometricAuthManager) {
        INSTANCE.injectBiometricAuthManager(biometricAuthFragment, biometricAuthManager);
    }

    @JvmStatic
    @BrandLogo
    public static final void injectBrandLogo(BiometricAuthFragment biometricAuthFragment, DirectResourceReference<Drawable> directResourceReference) {
        INSTANCE.injectBrandLogo(biometricAuthFragment, directResourceReference);
    }

    @JvmStatic
    public static final void injectEventLogger(BiometricAuthFragment biometricAuthFragment, SharedEventLogger sharedEventLogger) {
        INSTANCE.injectEventLogger(biometricAuthFragment, sharedEventLogger);
    }

    @JvmStatic
    public static final void injectLockscreenManager(BiometricAuthFragment biometricAuthFragment, LockscreenManager lockscreenManager) {
        INSTANCE.injectLockscreenManager(biometricAuthFragment, lockscreenManager);
    }

    @LockscreenScarletOverlay
    @JvmStatic
    public static final void injectLockscreenOverlay(BiometricAuthFragment biometricAuthFragment, ScarletOverlay scarletOverlay) {
        INSTANCE.injectLockscreenOverlay(biometricAuthFragment, scarletOverlay);
    }

    @JvmStatic
    public static final void injectPinManager(BiometricAuthFragment biometricAuthFragment, PinManager pinManager) {
        INSTANCE.injectPinManager(biometricAuthFragment, pinManager);
    }

    public BiometricAuthFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<BiometricAuthManager> biometricAuthManager, Provider<PinManager> pinManager, Provider<LockscreenManager> lockscreenManager, Provider<ScarletOverlay> lockscreenOverlay, Provider<DirectResourceReference<Drawable>> brandLogo) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
        Intrinsics.checkNotNullParameter(brandLogo, "brandLogo");
        this.singletons = singletons;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.biometricAuthManager = biometricAuthManager;
        this.pinManager = pinManager;
        this.lockscreenManager = lockscreenManager;
        this.lockscreenOverlay = lockscreenOverlay;
        this.brandLogo = brandLogo;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BiometricAuthFragment instance) {
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
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricAuthManager, "get(...)");
        companion2.injectBiometricAuthManager(instance, biometricAuthManager);
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        companion2.injectPinManager(instance, pinManager);
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        companion2.injectLockscreenManager(instance, lockscreenManager);
        ScarletOverlay scarletOverlay = this.lockscreenOverlay.get();
        Intrinsics.checkNotNullExpressionValue(scarletOverlay, "get(...)");
        companion2.injectLockscreenOverlay(instance, scarletOverlay);
        DirectResourceReference<Drawable> directResourceReference = this.brandLogo.get();
        Intrinsics.checkNotNullExpressionValue(directResourceReference, "get(...)");
        companion2.injectBrandLogo(instance, directResourceReference);
    }

    /* compiled from: BiometricAuthFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0089\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0017\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u00190\bH\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J#\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/BiometricAuthFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/BiometricAuthFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "brandLogo", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/JvmSuppressWildcards;", "injectAnalytics", "", "instance", "injectEventLogger", "injectBiometricAuthManager", "injectPinManager", "injectLockscreenManager", "injectLockscreenOverlay", "injectBrandLogo", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<BiometricAuthFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<BiometricAuthManager> biometricAuthManager, Provider<PinManager> pinManager, Provider<LockscreenManager> lockscreenManager, Provider<ScarletOverlay> lockscreenOverlay, Provider<DirectResourceReference<Drawable>> brandLogo) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
            Intrinsics.checkNotNullParameter(brandLogo, "brandLogo");
            return new BiometricAuthFragment_MembersInjector(singletons, analytics, eventLogger, biometricAuthManager, pinManager, lockscreenManager, lockscreenOverlay, brandLogo);
        }

        @JvmStatic
        public final void injectAnalytics(BiometricAuthFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(BiometricAuthFragment instance, SharedEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectBiometricAuthManager(BiometricAuthFragment instance, BiometricAuthManager biometricAuthManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            instance.setBiometricAuthManager(biometricAuthManager);
        }

        @JvmStatic
        public final void injectPinManager(BiometricAuthFragment instance, PinManager pinManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            instance.setPinManager(pinManager);
        }

        @JvmStatic
        public final void injectLockscreenManager(BiometricAuthFragment instance, LockscreenManager lockscreenManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            instance.setLockscreenManager(lockscreenManager);
        }

        @LockscreenScarletOverlay
        @JvmStatic
        public final void injectLockscreenOverlay(BiometricAuthFragment instance, ScarletOverlay lockscreenOverlay) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
            instance.setLockscreenOverlay(lockscreenOverlay);
        }

        @JvmStatic
        @BrandLogo
        public final void injectBrandLogo(BiometricAuthFragment instance, DirectResourceReference<Drawable> brandLogo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(brandLogo, "brandLogo");
            instance.setBrandLogo(brandLogo);
        }
    }
}
