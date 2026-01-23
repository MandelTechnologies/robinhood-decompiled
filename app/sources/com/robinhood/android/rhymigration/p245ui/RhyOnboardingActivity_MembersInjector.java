package com.robinhood.android.rhymigration.p245ui;

import com.robinhood.android.common.mcduckling.prefs.RhyMigrationCmSunsetLastTime;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.prefs.RhyCmSunsetOptedOut;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.targetbackend.TargetBackend;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOnboardingActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyCmSunsetOptedOut", "Lcom/robinhood/prefs/BooleanPreference;", "rhyMigrationCmSunsetLastTimePref", "Lcom/robinhood/prefs/LongPreference;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyOnboardingActivity_MembersInjector implements MembersInjector<RhyOnboardingActivity> {
    private final Provider<BooleanPreference> rhyCmSunsetOptedOut;
    private final Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext;
    private final Provider<LongPreference> rhyMigrationCmSunsetLastTimePref;
    private final Provider<ScreenProtectManager> screenProtectManager;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TargetBackend> targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RhyOnboardingActivity> create(Provider<BaseActivitySingletons> provider, Provider<BooleanPreference> provider2, Provider<LongPreference> provider3, Provider<TargetBackend> provider4, Provider<RhyGlobalLoggingContext> provider5, Provider<ScreenProtectManager> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @RhyCmSunsetOptedOut
    @JvmStatic
    public static final void injectRhyCmSunsetOptedOut(RhyOnboardingActivity rhyOnboardingActivity, BooleanPreference booleanPreference) {
        INSTANCE.injectRhyCmSunsetOptedOut(rhyOnboardingActivity, booleanPreference);
    }

    @JvmStatic
    public static final void injectRhyGlobalLoggingContext(RhyOnboardingActivity rhyOnboardingActivity, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        INSTANCE.injectRhyGlobalLoggingContext(rhyOnboardingActivity, rhyGlobalLoggingContext);
    }

    @JvmStatic
    @RhyMigrationCmSunsetLastTime
    public static final void injectRhyMigrationCmSunsetLastTimePref(RhyOnboardingActivity rhyOnboardingActivity, LongPreference longPreference) {
        INSTANCE.injectRhyMigrationCmSunsetLastTimePref(rhyOnboardingActivity, longPreference);
    }

    @JvmStatic
    public static final void injectScreenProtectManager(RhyOnboardingActivity rhyOnboardingActivity, ScreenProtectManager screenProtectManager) {
        INSTANCE.injectScreenProtectManager(rhyOnboardingActivity, screenProtectManager);
    }

    @JvmStatic
    public static final void injectTargetBackend(RhyOnboardingActivity rhyOnboardingActivity, TargetBackend targetBackend) {
        INSTANCE.injectTargetBackend(rhyOnboardingActivity, targetBackend);
    }

    public RhyOnboardingActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<BooleanPreference> rhyCmSunsetOptedOut, Provider<LongPreference> rhyMigrationCmSunsetLastTimePref, Provider<TargetBackend> targetBackend, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<ScreenProtectManager> screenProtectManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(rhyCmSunsetOptedOut, "rhyCmSunsetOptedOut");
        Intrinsics.checkNotNullParameter(rhyMigrationCmSunsetLastTimePref, "rhyMigrationCmSunsetLastTimePref");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
        this.singletons = singletons;
        this.rhyCmSunsetOptedOut = rhyCmSunsetOptedOut;
        this.rhyMigrationCmSunsetLastTimePref = rhyMigrationCmSunsetLastTimePref;
        this.targetBackend = targetBackend;
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
        this.screenProtectManager = screenProtectManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyOnboardingActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        BooleanPreference booleanPreference = this.rhyCmSunsetOptedOut.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectRhyCmSunsetOptedOut(instance, booleanPreference);
        LongPreference longPreference = this.rhyMigrationCmSunsetLastTimePref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        companion2.injectRhyMigrationCmSunsetLastTimePref(instance, longPreference);
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        companion2.injectTargetBackend(instance, targetBackend);
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext.get();
        Intrinsics.checkNotNullExpressionValue(rhyGlobalLoggingContext, "get(...)");
        companion2.injectRhyGlobalLoggingContext(instance, rhyGlobalLoggingContext);
        ScreenProtectManager screenProtectManager = this.screenProtectManager.get();
        Intrinsics.checkNotNullExpressionValue(screenProtectManager, "get(...)");
        companion2.injectScreenProtectManager(instance, screenProtectManager);
    }

    /* compiled from: RhyOnboardingActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyCmSunsetOptedOut", "Lcom/robinhood/prefs/BooleanPreference;", "rhyMigrationCmSunsetLastTimePref", "Lcom/robinhood/prefs/LongPreference;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "injectRhyCmSunsetOptedOut", "", "instance", "injectRhyMigrationCmSunsetLastTimePref", "injectTargetBackend", "injectRhyGlobalLoggingContext", "injectScreenProtectManager", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RhyOnboardingActivity> create(Provider<BaseActivitySingletons> singletons, Provider<BooleanPreference> rhyCmSunsetOptedOut, Provider<LongPreference> rhyMigrationCmSunsetLastTimePref, Provider<TargetBackend> targetBackend, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<ScreenProtectManager> screenProtectManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(rhyCmSunsetOptedOut, "rhyCmSunsetOptedOut");
            Intrinsics.checkNotNullParameter(rhyMigrationCmSunsetLastTimePref, "rhyMigrationCmSunsetLastTimePref");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            return new RhyOnboardingActivity_MembersInjector(singletons, rhyCmSunsetOptedOut, rhyMigrationCmSunsetLastTimePref, targetBackend, rhyGlobalLoggingContext, screenProtectManager);
        }

        @RhyCmSunsetOptedOut
        @JvmStatic
        public final void injectRhyCmSunsetOptedOut(RhyOnboardingActivity instance, BooleanPreference rhyCmSunsetOptedOut) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyCmSunsetOptedOut, "rhyCmSunsetOptedOut");
            instance.setRhyCmSunsetOptedOut(rhyCmSunsetOptedOut);
        }

        @JvmStatic
        @RhyMigrationCmSunsetLastTime
        public final void injectRhyMigrationCmSunsetLastTimePref(RhyOnboardingActivity instance, LongPreference rhyMigrationCmSunsetLastTimePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyMigrationCmSunsetLastTimePref, "rhyMigrationCmSunsetLastTimePref");
            instance.setRhyMigrationCmSunsetLastTimePref(rhyMigrationCmSunsetLastTimePref);
        }

        @JvmStatic
        public final void injectTargetBackend(RhyOnboardingActivity instance, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            instance.setTargetBackend(targetBackend);
        }

        @JvmStatic
        public final void injectRhyGlobalLoggingContext(RhyOnboardingActivity instance, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            instance.setRhyGlobalLoggingContext(rhyGlobalLoggingContext);
        }

        @JvmStatic
        public final void injectScreenProtectManager(RhyOnboardingActivity instance, ScreenProtectManager screenProtectManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            instance.setScreenProtectManager(screenProtectManager);
        }
    }
}
