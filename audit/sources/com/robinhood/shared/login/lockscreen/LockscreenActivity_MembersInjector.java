package com.robinhood.shared.login.lockscreen;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger;
import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.p099di.LockscreenScarletOverlay;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.resumeapplication.ResumeApplicationManager;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.prefs.annotation.LockscreenTimeoutPref;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.targetbackend.TargetBackend;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LockscreenActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#Bº\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0017\u0010\u001a\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d0\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/LockscreenActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/LockscreenActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "resumeApplicationManager", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LockscreenActivity_MembersInjector implements MembersInjector<LockscreenActivity> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BiometricAuthManager> biometricAuthManager;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<LockscreenManager> lockscreenManager;
    private final Provider<ScarletOverlay> lockscreenOverlay;
    private final Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref;
    private final Provider<PinManager> pinManager;
    private final Provider<ResumeApplicationManager> resumeApplicationManager;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<StartupPerformanceLogger> startupPerformanceLogger;
    private final Provider<TargetBackend> targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<LockscreenActivity> create(Provider<BaseActivitySingletons> provider, Provider<AnalyticsLogger> provider2, Provider<SharedEventLogger> provider3, Provider<PinManager> provider4, Provider<BiometricAuthManager> provider5, Provider<LockscreenManager> provider6, Provider<StartupPerformanceLogger> provider7, Provider<AccountProvider> provider8, Provider<ResumeApplicationManager> provider9, Provider<TargetBackend> provider10, Provider<ScarletOverlay> provider11, Provider<EnumPreference<LockscreenTimeout>> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final void injectAccountProvider(LockscreenActivity lockscreenActivity, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(lockscreenActivity, accountProvider);
    }

    @JvmStatic
    public static final void injectAnalytics(LockscreenActivity lockscreenActivity, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(lockscreenActivity, analyticsLogger);
    }

    @JvmStatic
    public static final void injectBiometricAuthManager(LockscreenActivity lockscreenActivity, BiometricAuthManager biometricAuthManager) {
        INSTANCE.injectBiometricAuthManager(lockscreenActivity, biometricAuthManager);
    }

    @JvmStatic
    public static final void injectEventLogger(LockscreenActivity lockscreenActivity, SharedEventLogger sharedEventLogger) {
        INSTANCE.injectEventLogger(lockscreenActivity, sharedEventLogger);
    }

    @JvmStatic
    public static final void injectLockscreenManager(LockscreenActivity lockscreenActivity, LockscreenManager lockscreenManager) {
        INSTANCE.injectLockscreenManager(lockscreenActivity, lockscreenManager);
    }

    @LockscreenScarletOverlay
    @JvmStatic
    public static final void injectLockscreenOverlay(LockscreenActivity lockscreenActivity, ScarletOverlay scarletOverlay) {
        INSTANCE.injectLockscreenOverlay(lockscreenActivity, scarletOverlay);
    }

    @LockscreenTimeoutPref
    @JvmStatic
    public static final void injectLockscreenTimeoutPref(LockscreenActivity lockscreenActivity, EnumPreference<LockscreenTimeout> enumPreference) {
        INSTANCE.injectLockscreenTimeoutPref(lockscreenActivity, enumPreference);
    }

    @JvmStatic
    public static final void injectPinManager(LockscreenActivity lockscreenActivity, PinManager pinManager) {
        INSTANCE.injectPinManager(lockscreenActivity, pinManager);
    }

    @JvmStatic
    public static final void injectResumeApplicationManager(LockscreenActivity lockscreenActivity, ResumeApplicationManager resumeApplicationManager) {
        INSTANCE.injectResumeApplicationManager(lockscreenActivity, resumeApplicationManager);
    }

    @JvmStatic
    public static final void injectStartupPerformanceLogger(LockscreenActivity lockscreenActivity, StartupPerformanceLogger startupPerformanceLogger) {
        INSTANCE.injectStartupPerformanceLogger(lockscreenActivity, startupPerformanceLogger);
    }

    @JvmStatic
    public static final void injectTargetBackend(LockscreenActivity lockscreenActivity, TargetBackend targetBackend) {
        INSTANCE.injectTargetBackend(lockscreenActivity, targetBackend);
    }

    public LockscreenActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<PinManager> pinManager, Provider<BiometricAuthManager> biometricAuthManager, Provider<LockscreenManager> lockscreenManager, Provider<StartupPerformanceLogger> startupPerformanceLogger, Provider<AccountProvider> accountProvider, Provider<ResumeApplicationManager> resumeApplicationManager, Provider<TargetBackend> targetBackend, Provider<ScarletOverlay> lockscreenOverlay, Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(startupPerformanceLogger, "startupPerformanceLogger");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(resumeApplicationManager, "resumeApplicationManager");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
        Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
        this.singletons = singletons;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.pinManager = pinManager;
        this.biometricAuthManager = biometricAuthManager;
        this.lockscreenManager = lockscreenManager;
        this.startupPerformanceLogger = startupPerformanceLogger;
        this.accountProvider = accountProvider;
        this.resumeApplicationManager = resumeApplicationManager;
        this.targetBackend = targetBackend;
        this.lockscreenOverlay = lockscreenOverlay;
        this.lockscreenTimeoutPref = lockscreenTimeoutPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LockscreenActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        companion2.injectEventLogger(instance, sharedEventLogger);
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        companion2.injectPinManager(instance, pinManager);
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricAuthManager, "get(...)");
        companion2.injectBiometricAuthManager(instance, biometricAuthManager);
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        companion2.injectLockscreenManager(instance, lockscreenManager);
        StartupPerformanceLogger startupPerformanceLogger = this.startupPerformanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(startupPerformanceLogger, "get(...)");
        companion2.injectStartupPerformanceLogger(instance, startupPerformanceLogger);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(instance, accountProvider);
        ResumeApplicationManager resumeApplicationManager = this.resumeApplicationManager.get();
        Intrinsics.checkNotNullExpressionValue(resumeApplicationManager, "get(...)");
        companion2.injectResumeApplicationManager(instance, resumeApplicationManager);
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        companion2.injectTargetBackend(instance, targetBackend);
        ScarletOverlay scarletOverlay = this.lockscreenOverlay.get();
        Intrinsics.checkNotNullExpressionValue(scarletOverlay, "get(...)");
        companion2.injectLockscreenOverlay(instance, scarletOverlay);
        EnumPreference<LockscreenTimeout> enumPreference = this.lockscreenTimeoutPref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        companion2.injectLockscreenTimeoutPref(instance, enumPreference);
    }

    /* compiled from: LockscreenActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÁ\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\u0017\u0010\u001e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0002\b!0\bH\u0007J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010(\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010,\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010-\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J#\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0002\b!H\u0007¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/login/lockscreen/LockscreenActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/login/lockscreen/LockscreenActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "lockscreenManager", "Lcom/robinhood/android/util/LockscreenManager;", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "resumeApplicationManager", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "lockscreenOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "Lkotlin/jvm/JvmSuppressWildcards;", "injectAnalytics", "", "instance", "injectEventLogger", "injectPinManager", "injectBiometricAuthManager", "injectLockscreenManager", "injectStartupPerformanceLogger", "injectAccountProvider", "injectResumeApplicationManager", "injectTargetBackend", "injectLockscreenOverlay", "injectLockscreenTimeoutPref", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<LockscreenActivity> create(Provider<BaseActivitySingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<SharedEventLogger> eventLogger, Provider<PinManager> pinManager, Provider<BiometricAuthManager> biometricAuthManager, Provider<LockscreenManager> lockscreenManager, Provider<StartupPerformanceLogger> startupPerformanceLogger, Provider<AccountProvider> accountProvider, Provider<ResumeApplicationManager> resumeApplicationManager, Provider<TargetBackend> targetBackend, Provider<ScarletOverlay> lockscreenOverlay, Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Intrinsics.checkNotNullParameter(startupPerformanceLogger, "startupPerformanceLogger");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(resumeApplicationManager, "resumeApplicationManager");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
            Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
            return new LockscreenActivity_MembersInjector(singletons, analytics, eventLogger, pinManager, biometricAuthManager, lockscreenManager, startupPerformanceLogger, accountProvider, resumeApplicationManager, targetBackend, lockscreenOverlay, lockscreenTimeoutPref);
        }

        @JvmStatic
        public final void injectAnalytics(LockscreenActivity instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(LockscreenActivity instance, SharedEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectPinManager(LockscreenActivity instance, PinManager pinManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            instance.setPinManager(pinManager);
        }

        @JvmStatic
        public final void injectBiometricAuthManager(LockscreenActivity instance, BiometricAuthManager biometricAuthManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            instance.setBiometricAuthManager(biometricAuthManager);
        }

        @JvmStatic
        public final void injectLockscreenManager(LockscreenActivity instance, LockscreenManager lockscreenManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            instance.setLockscreenManager(lockscreenManager);
        }

        @JvmStatic
        public final void injectStartupPerformanceLogger(LockscreenActivity instance, StartupPerformanceLogger startupPerformanceLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(startupPerformanceLogger, "startupPerformanceLogger");
            instance.setStartupPerformanceLogger(startupPerformanceLogger);
        }

        @JvmStatic
        public final void injectAccountProvider(LockscreenActivity instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectResumeApplicationManager(LockscreenActivity instance, ResumeApplicationManager resumeApplicationManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(resumeApplicationManager, "resumeApplicationManager");
            instance.setResumeApplicationManager(resumeApplicationManager);
        }

        @JvmStatic
        public final void injectTargetBackend(LockscreenActivity instance, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            instance.setTargetBackend(targetBackend);
        }

        @LockscreenScarletOverlay
        @JvmStatic
        public final void injectLockscreenOverlay(LockscreenActivity instance, ScarletOverlay lockscreenOverlay) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lockscreenOverlay, "lockscreenOverlay");
            instance.setLockscreenOverlay(lockscreenOverlay);
        }

        @LockscreenTimeoutPref
        @JvmStatic
        public final void injectLockscreenTimeoutPref(LockscreenActivity instance, EnumPreference<LockscreenTimeout> lockscreenTimeoutPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
            instance.setLockscreenTimeoutPref(lockscreenTimeoutPref);
        }
    }
}
