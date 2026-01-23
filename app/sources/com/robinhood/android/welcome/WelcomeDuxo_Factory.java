package com.robinhood.android.welcome;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.api.swipeycontent.SwipeyContentApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.shared.common.singular.SingularSdkWrapper;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¬\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/welcome/WelcomeDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "regionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "swipeyContentApi", "Lcom/robinhood/android/api/swipeycontent/SwipeyContentApi;", "singularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "marketingConsent", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "Lkotlin/jvm/JvmSuppressWildcards;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WelcomeDuxo_Factory implements Factory<WelcomeDuxo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AttributionManager> attributionManager;
    private final Provider<AuthManager> authManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<EnumPreference<GdprConsentStatus>> marketingConsent;
    private final Provider<UserRegionStore> regionStore;
    private final Provider<SingularSdkWrapper> singularSdkWrapper;
    private final Provider<SwipeyContentApi> swipeyContentApi;

    @JvmStatic
    public static final WelcomeDuxo_Factory create(Provider<AccountProvider> provider, Provider<AnalyticsLogger> provider2, Provider<AuthManager> provider3, Provider<SharedEventLogger> provider4, Provider<AttributionManager> provider5, Provider<UserRegionStore> provider6, Provider<ExperimentsStore> provider7, Provider<SwipeyContentApi> provider8, Provider<SingularSdkWrapper> provider9, Provider<EnumPreference<GdprConsentStatus>> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final WelcomeDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analyticsLogger, AuthManager authManager, SharedEventLogger sharedEventLogger, AttributionManager attributionManager, UserRegionStore userRegionStore, ExperimentsStore experimentsStore, SwipeyContentApi swipeyContentApi, SingularSdkWrapper singularSdkWrapper, EnumPreference<GdprConsentStatus> enumPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, analyticsLogger, authManager, sharedEventLogger, attributionManager, userRegionStore, experimentsStore, swipeyContentApi, singularSdkWrapper, enumPreference, duxoBundle);
    }

    public WelcomeDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<AuthManager> authManager, Provider<SharedEventLogger> eventLogger, Provider<AttributionManager> attributionManager, Provider<UserRegionStore> regionStore, Provider<ExperimentsStore> experimentsStore, Provider<SwipeyContentApi> swipeyContentApi, Provider<SingularSdkWrapper> singularSdkWrapper, Provider<EnumPreference<GdprConsentStatus>> marketingConsent, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
        Intrinsics.checkNotNullParameter(regionStore, "regionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(swipeyContentApi, "swipeyContentApi");
        Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
        Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.authManager = authManager;
        this.eventLogger = eventLogger;
        this.attributionManager = attributionManager;
        this.regionStore = regionStore;
        this.experimentsStore = experimentsStore;
        this.swipeyContentApi = swipeyContentApi;
        this.singularSdkWrapper = singularSdkWrapper;
        this.marketingConsent = marketingConsent;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public WelcomeDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        AttributionManager attributionManager = this.attributionManager.get();
        Intrinsics.checkNotNullExpressionValue(attributionManager, "get(...)");
        UserRegionStore userRegionStore = this.regionStore.get();
        Intrinsics.checkNotNullExpressionValue(userRegionStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        SwipeyContentApi swipeyContentApi = this.swipeyContentApi.get();
        Intrinsics.checkNotNullExpressionValue(swipeyContentApi, "get(...)");
        SingularSdkWrapper singularSdkWrapper = this.singularSdkWrapper.get();
        Intrinsics.checkNotNullExpressionValue(singularSdkWrapper, "get(...)");
        EnumPreference<GdprConsentStatus> enumPreference = this.marketingConsent.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, analyticsLogger, authManager, sharedEventLogger, attributionManager, userRegionStore, experimentsStore, swipeyContentApi, singularSdkWrapper, enumPreference, duxoBundle);
    }

    /* compiled from: WelcomeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u00ad\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0017\u0010\u0019\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jk\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/welcome/WelcomeDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "regionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "swipeyContentApi", "Lcom/robinhood/android/api/swipeycontent/SwipeyContentApi;", "singularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "marketingConsent", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "Lkotlin/jvm/JvmSuppressWildcards;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/welcome/WelcomeDuxo;", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WelcomeDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<AuthManager> authManager, Provider<SharedEventLogger> eventLogger, Provider<AttributionManager> attributionManager, Provider<UserRegionStore> regionStore, Provider<ExperimentsStore> experimentsStore, Provider<SwipeyContentApi> swipeyContentApi, Provider<SingularSdkWrapper> singularSdkWrapper, Provider<EnumPreference<GdprConsentStatus>> marketingConsent, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            Intrinsics.checkNotNullParameter(regionStore, "regionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(swipeyContentApi, "swipeyContentApi");
            Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
            Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new WelcomeDuxo_Factory(accountProvider, analytics, authManager, eventLogger, attributionManager, regionStore, experimentsStore, swipeyContentApi, singularSdkWrapper, marketingConsent, duxoBundle);
        }

        @JvmStatic
        public final WelcomeDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analytics, AuthManager authManager, SharedEventLogger eventLogger, AttributionManager attributionManager, UserRegionStore regionStore, ExperimentsStore experimentsStore, SwipeyContentApi swipeyContentApi, SingularSdkWrapper singularSdkWrapper, EnumPreference<GdprConsentStatus> marketingConsent, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
            Intrinsics.checkNotNullParameter(regionStore, "regionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(swipeyContentApi, "swipeyContentApi");
            Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
            Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new WelcomeDuxo(accountProvider, analytics, authManager, eventLogger, attributionManager, regionStore, experimentsStore, swipeyContentApi, singularSdkWrapper, marketingConsent, duxoBundle);
        }
    }
}
