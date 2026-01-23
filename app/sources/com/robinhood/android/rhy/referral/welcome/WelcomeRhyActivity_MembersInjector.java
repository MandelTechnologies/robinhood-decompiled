package com.robinhood.android.rhy.referral.welcome;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.rhy.referral.RhyReferralOnboardingDataPref;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRhyActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WelcomeRhyActivity_MembersInjector implements MembersInjector<WelcomeRhyActivity> {
    private final Provider<AttributionManager> attributionManager;
    private final Provider<AuthManager> authManager;
    private final Provider<StringPreference> rhyReferralOnboardingDataPref;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<WelcomeRhyActivity> create(Provider<BaseActivitySingletons> provider, Provider<StringPreference> provider2, Provider<AttributionManager> provider3, Provider<AuthManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAttributionManager(WelcomeRhyActivity welcomeRhyActivity, AttributionManager attributionManager) {
        INSTANCE.injectAttributionManager(welcomeRhyActivity, attributionManager);
    }

    @JvmStatic
    public static final void injectAuthManager(WelcomeRhyActivity welcomeRhyActivity, AuthManager authManager) {
        INSTANCE.injectAuthManager(welcomeRhyActivity, authManager);
    }

    @JvmStatic
    @RhyReferralOnboardingDataPref
    public static final void injectRhyReferralOnboardingDataPref(WelcomeRhyActivity welcomeRhyActivity, StringPreference stringPreference) {
        INSTANCE.injectRhyReferralOnboardingDataPref(welcomeRhyActivity, stringPreference);
    }

    public WelcomeRhyActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<StringPreference> rhyReferralOnboardingDataPref, Provider<AttributionManager> attributionManager, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
        Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.singletons = singletons;
        this.rhyReferralOnboardingDataPref = rhyReferralOnboardingDataPref;
        this.attributionManager = attributionManager;
        this.authManager = authManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WelcomeRhyActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        StringPreference stringPreference = this.rhyReferralOnboardingDataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectRhyReferralOnboardingDataPref(instance, stringPreference);
        AttributionManager attributionManager = this.attributionManager.get();
        Intrinsics.checkNotNullExpressionValue(attributionManager, "get(...)");
        companion2.injectAttributionManager(instance, attributionManager);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
    }

    /* compiled from: WelcomeRhyActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectRhyReferralOnboardingDataPref", "", "instance", "injectAttributionManager", "injectAuthManager", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<WelcomeRhyActivity> create(Provider<BaseActivitySingletons> singletons, Provider<StringPreference> rhyReferralOnboardingDataPref, Provider<AttributionManager> attributionManager, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new WelcomeRhyActivity_MembersInjector(singletons, rhyReferralOnboardingDataPref, attributionManager, authManager);
        }

        @JvmStatic
        @RhyReferralOnboardingDataPref
        public final void injectRhyReferralOnboardingDataPref(WelcomeRhyActivity instance, StringPreference rhyReferralOnboardingDataPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
            instance.setRhyReferralOnboardingDataPref(rhyReferralOnboardingDataPref);
        }

        @JvmStatic
        public final void injectAttributionManager(WelcomeRhyActivity instance, AttributionManager attributionManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            instance.setAttributionManager(attributionManager);
        }

        @JvmStatic
        public final void injectAuthManager(WelcomeRhyActivity instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }
    }
}
