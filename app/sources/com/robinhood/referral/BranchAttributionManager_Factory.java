package com.robinhood.referral;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.referral.ReferralApi;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.referral.branch.BranchManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BranchAttributionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB½\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/referral/BranchAttributionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/referral/BranchAttributionManager;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "installation", "Lcom/robinhood/prefs/Installation;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "referredDataPref", "Lcom/robinhood/prefs/StringPreference;", "referredDataForAnalyticsPref", "engagementTimeForAnalyticsPref", "Lcom/robinhood/prefs/LongPreference;", "referredDataOrganicPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasEverLoggedInPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BranchAttributionManager_Factory implements Factory<BranchAttributionManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AuthManager> authManager;
    private final Provider<BranchManager> branchManager;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<LongPreference> engagementTimeForAnalyticsPref;
    private final Provider<BooleanPreference> hasEverLoggedInPref;
    private final Provider<Installation> installation;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ReferralApi> referralApi;
    private final Provider<StringPreference> referredDataForAnalyticsPref;
    private final Provider<BooleanPreference> referredDataOrganicPref;
    private final Provider<StringPreference> referredDataPref;
    private final Provider<UserRegionStore> userRegionStore;

    @JvmStatic
    public static final BranchAttributionManager_Factory create(Provider<LazyMoshi> provider, Provider<AuthManager> provider2, Provider<BranchManager> provider3, Provider<ReferralApi> provider4, Provider<Installation> provider5, Provider<AnalyticsLogger> provider6, Provider<UserRegionStore> provider7, Provider<CoroutineScope> provider8, Provider<StringPreference> provider9, Provider<StringPreference> provider10, Provider<LongPreference> provider11, Provider<BooleanPreference> provider12, Provider<BooleanPreference> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final BranchAttributionManager newInstance(LazyMoshi lazyMoshi, AuthManager authManager, BranchManager branchManager, ReferralApi referralApi, Installation installation, AnalyticsLogger analyticsLogger, UserRegionStore userRegionStore, CoroutineScope coroutineScope, StringPreference stringPreference, StringPreference stringPreference2, LongPreference longPreference, BooleanPreference booleanPreference, BooleanPreference booleanPreference2) {
        return INSTANCE.newInstance(lazyMoshi, authManager, branchManager, referralApi, installation, analyticsLogger, userRegionStore, coroutineScope, stringPreference, stringPreference2, longPreference, booleanPreference, booleanPreference2);
    }

    public BranchAttributionManager_Factory(Provider<LazyMoshi> moshi, Provider<AuthManager> authManager, Provider<BranchManager> branchManager, Provider<ReferralApi> referralApi, Provider<Installation> installation, Provider<AnalyticsLogger> analytics, Provider<UserRegionStore> userRegionStore, Provider<CoroutineScope> coroutineScope, Provider<StringPreference> referredDataPref, Provider<StringPreference> referredDataForAnalyticsPref, Provider<LongPreference> engagementTimeForAnalyticsPref, Provider<BooleanPreference> referredDataOrganicPref, Provider<BooleanPreference> hasEverLoggedInPref) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(branchManager, "branchManager");
        Intrinsics.checkNotNullParameter(referralApi, "referralApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(referredDataPref, "referredDataPref");
        Intrinsics.checkNotNullParameter(referredDataForAnalyticsPref, "referredDataForAnalyticsPref");
        Intrinsics.checkNotNullParameter(engagementTimeForAnalyticsPref, "engagementTimeForAnalyticsPref");
        Intrinsics.checkNotNullParameter(referredDataOrganicPref, "referredDataOrganicPref");
        Intrinsics.checkNotNullParameter(hasEverLoggedInPref, "hasEverLoggedInPref");
        this.moshi = moshi;
        this.authManager = authManager;
        this.branchManager = branchManager;
        this.referralApi = referralApi;
        this.installation = installation;
        this.analytics = analytics;
        this.userRegionStore = userRegionStore;
        this.coroutineScope = coroutineScope;
        this.referredDataPref = referredDataPref;
        this.referredDataForAnalyticsPref = referredDataForAnalyticsPref;
        this.engagementTimeForAnalyticsPref = engagementTimeForAnalyticsPref;
        this.referredDataOrganicPref = referredDataOrganicPref;
        this.hasEverLoggedInPref = hasEverLoggedInPref;
    }

    @Override // javax.inject.Provider
    public BranchAttributionManager get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        BranchManager branchManager = this.branchManager.get();
        Intrinsics.checkNotNullExpressionValue(branchManager, "get(...)");
        ReferralApi referralApi = this.referralApi.get();
        Intrinsics.checkNotNullExpressionValue(referralApi, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        UserRegionStore userRegionStore = this.userRegionStore.get();
        Intrinsics.checkNotNullExpressionValue(userRegionStore, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        StringPreference stringPreference = this.referredDataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.referredDataForAnalyticsPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        LongPreference longPreference = this.engagementTimeForAnalyticsPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        BooleanPreference booleanPreference = this.referredDataOrganicPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.hasEverLoggedInPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        return companion.newInstance(lazyMoshi, authManager, branchManager, referralApi, installation, analyticsLogger, userRegionStore, coroutineScope, stringPreference, stringPreference2, longPreference, booleanPreference, booleanPreference2);
    }

    /* compiled from: BranchAttributionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0007Jp\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/referral/BranchAttributionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/referral/BranchAttributionManager_Factory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "referralApi", "Lcom/robinhood/api/referral/ReferralApi;", "installation", "Lcom/robinhood/prefs/Installation;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "referredDataPref", "Lcom/robinhood/prefs/StringPreference;", "referredDataForAnalyticsPref", "engagementTimeForAnalyticsPref", "Lcom/robinhood/prefs/LongPreference;", "referredDataOrganicPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasEverLoggedInPref", "newInstance", "Lcom/robinhood/referral/BranchAttributionManager;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BranchAttributionManager_Factory create(Provider<LazyMoshi> moshi, Provider<AuthManager> authManager, Provider<BranchManager> branchManager, Provider<ReferralApi> referralApi, Provider<Installation> installation, Provider<AnalyticsLogger> analytics, Provider<UserRegionStore> userRegionStore, Provider<CoroutineScope> coroutineScope, Provider<StringPreference> referredDataPref, Provider<StringPreference> referredDataForAnalyticsPref, Provider<LongPreference> engagementTimeForAnalyticsPref, Provider<BooleanPreference> referredDataOrganicPref, Provider<BooleanPreference> hasEverLoggedInPref) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(branchManager, "branchManager");
            Intrinsics.checkNotNullParameter(referralApi, "referralApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(referredDataPref, "referredDataPref");
            Intrinsics.checkNotNullParameter(referredDataForAnalyticsPref, "referredDataForAnalyticsPref");
            Intrinsics.checkNotNullParameter(engagementTimeForAnalyticsPref, "engagementTimeForAnalyticsPref");
            Intrinsics.checkNotNullParameter(referredDataOrganicPref, "referredDataOrganicPref");
            Intrinsics.checkNotNullParameter(hasEverLoggedInPref, "hasEverLoggedInPref");
            return new BranchAttributionManager_Factory(moshi, authManager, branchManager, referralApi, installation, analytics, userRegionStore, coroutineScope, referredDataPref, referredDataForAnalyticsPref, engagementTimeForAnalyticsPref, referredDataOrganicPref, hasEverLoggedInPref);
        }

        @JvmStatic
        public final BranchAttributionManager newInstance(LazyMoshi moshi, AuthManager authManager, BranchManager branchManager, ReferralApi referralApi, Installation installation, AnalyticsLogger analytics, UserRegionStore userRegionStore, CoroutineScope coroutineScope, StringPreference referredDataPref, StringPreference referredDataForAnalyticsPref, LongPreference engagementTimeForAnalyticsPref, BooleanPreference referredDataOrganicPref, BooleanPreference hasEverLoggedInPref) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(branchManager, "branchManager");
            Intrinsics.checkNotNullParameter(referralApi, "referralApi");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(referredDataPref, "referredDataPref");
            Intrinsics.checkNotNullParameter(referredDataForAnalyticsPref, "referredDataForAnalyticsPref");
            Intrinsics.checkNotNullParameter(engagementTimeForAnalyticsPref, "engagementTimeForAnalyticsPref");
            Intrinsics.checkNotNullParameter(referredDataOrganicPref, "referredDataOrganicPref");
            Intrinsics.checkNotNullParameter(hasEverLoggedInPref, "hasEverLoggedInPref");
            return new BranchAttributionManager(moshi, authManager, branchManager, referralApi, installation, analytics, userRegionStore, coroutineScope, referredDataPref, referredDataForAnalyticsPref, engagementTimeForAnalyticsPref, referredDataOrganicPref, hasEverLoggedInPref);
        }
    }
}
