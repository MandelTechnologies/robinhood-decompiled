package com.robinhood.android.onboarding.p205ui.postusercreation;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.FundAccountScreenStore;
import com.robinhood.p2p.MatchaManager;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostUserCreationShimDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "app", "Landroid/app/Application;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "matchaManager", "Lcom/robinhood/p2p/MatchaManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "creditCardWaitlistResumeAppBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PostUserCreationShimDuxo_Factory implements Factory<PostUserCreationShimDuxo> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<Application> app;
    private final Provider<AppType> appType;
    private final Provider<BooleanPreference> creditCardWaitlistResumeAppBadgePref;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FundAccountScreenStore> fundAccountStore;
    private final Provider<GcmManager> gcmManager;
    private final Provider<MatchaManager> matchaManager;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<StringPreference> rhyReferralOnboardingDataPref;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PostUserCreationShimDuxo_Factory create(Provider<AnalyticsLogger> provider, Provider<Application> provider2, Provider<ExperimentsStore> provider3, Provider<FundAccountScreenStore> provider4, Provider<GcmManager> provider5, Provider<MatchaManager> provider6, Provider<RegionGateProvider> provider7, Provider<AppType> provider8, Provider<BooleanPreference> provider9, Provider<StringPreference> provider10, Provider<SavedStateHandle> provider11, Provider<DispatcherProvider> provider12, Provider<RxFactory> provider13, Provider<RxGlobalErrorHandler> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final PostUserCreationShimDuxo newInstance(AnalyticsLogger analyticsLogger, Application application, ExperimentsStore experimentsStore, FundAccountScreenStore fundAccountScreenStore, GcmManager gcmManager, MatchaManager matchaManager, RegionGateProvider regionGateProvider, AppType appType, BooleanPreference booleanPreference, StringPreference stringPreference, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(analyticsLogger, application, experimentsStore, fundAccountScreenStore, gcmManager, matchaManager, regionGateProvider, appType, booleanPreference, stringPreference, savedStateHandle);
    }

    public PostUserCreationShimDuxo_Factory(Provider<AnalyticsLogger> analytics, Provider<Application> app, Provider<ExperimentsStore> experimentsStore, Provider<FundAccountScreenStore> fundAccountStore, Provider<GcmManager> gcmManager, Provider<MatchaManager> matchaManager, Provider<RegionGateProvider> regionGateProvider, Provider<AppType> appType, Provider<BooleanPreference> creditCardWaitlistResumeAppBadgePref, Provider<StringPreference> rhyReferralOnboardingDataPref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
        Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
        Intrinsics.checkNotNullParameter(matchaManager, "matchaManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(creditCardWaitlistResumeAppBadgePref, "creditCardWaitlistResumeAppBadgePref");
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.analytics = analytics;
        this.app = app;
        this.experimentsStore = experimentsStore;
        this.fundAccountStore = fundAccountStore;
        this.gcmManager = gcmManager;
        this.matchaManager = matchaManager;
        this.regionGateProvider = regionGateProvider;
        this.appType = appType;
        this.creditCardWaitlistResumeAppBadgePref = creditCardWaitlistResumeAppBadgePref;
        this.rhyReferralOnboardingDataPref = rhyReferralOnboardingDataPref;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public PostUserCreationShimDuxo get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        FundAccountScreenStore fundAccountScreenStore = this.fundAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(fundAccountScreenStore, "get(...)");
        GcmManager gcmManager = this.gcmManager.get();
        Intrinsics.checkNotNullExpressionValue(gcmManager, "get(...)");
        MatchaManager matchaManager = this.matchaManager.get();
        Intrinsics.checkNotNullExpressionValue(matchaManager, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        BooleanPreference booleanPreference = this.creditCardWaitlistResumeAppBadgePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StringPreference stringPreference = this.rhyReferralOnboardingDataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        PostUserCreationShimDuxo postUserCreationShimDuxoNewInstance = companion.newInstance(analyticsLogger, application, experimentsStore, fundAccountScreenStore, gcmManager, matchaManager, regionGateProvider, appType, booleanPreference, stringPreference, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(postUserCreationShimDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(postUserCreationShimDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(postUserCreationShimDuxoNewInstance, rxGlobalErrorHandler);
        return postUserCreationShimDuxoNewInstance;
    }

    /* compiled from: PostUserCreationShimDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007J`\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "app", "Landroid/app/Application;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fundAccountStore", "Lcom/robinhood/librobinhood/data/store/FundAccountScreenStore;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "matchaManager", "Lcom/robinhood/p2p/MatchaManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "creditCardWaitlistResumeAppBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "rhyReferralOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimDuxo;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PostUserCreationShimDuxo_Factory create(Provider<AnalyticsLogger> analytics, Provider<Application> app, Provider<ExperimentsStore> experimentsStore, Provider<FundAccountScreenStore> fundAccountStore, Provider<GcmManager> gcmManager, Provider<MatchaManager> matchaManager, Provider<RegionGateProvider> regionGateProvider, Provider<AppType> appType, Provider<BooleanPreference> creditCardWaitlistResumeAppBadgePref, Provider<StringPreference> rhyReferralOnboardingDataPref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
            Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
            Intrinsics.checkNotNullParameter(matchaManager, "matchaManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(creditCardWaitlistResumeAppBadgePref, "creditCardWaitlistResumeAppBadgePref");
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new PostUserCreationShimDuxo_Factory(analytics, app, experimentsStore, fundAccountStore, gcmManager, matchaManager, regionGateProvider, appType, creditCardWaitlistResumeAppBadgePref, rhyReferralOnboardingDataPref, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final PostUserCreationShimDuxo newInstance(AnalyticsLogger analytics, Application app, ExperimentsStore experimentsStore, FundAccountScreenStore fundAccountStore, GcmManager gcmManager, MatchaManager matchaManager, RegionGateProvider regionGateProvider, AppType appType, BooleanPreference creditCardWaitlistResumeAppBadgePref, StringPreference rhyReferralOnboardingDataPref, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(fundAccountStore, "fundAccountStore");
            Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
            Intrinsics.checkNotNullParameter(matchaManager, "matchaManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(creditCardWaitlistResumeAppBadgePref, "creditCardWaitlistResumeAppBadgePref");
            Intrinsics.checkNotNullParameter(rhyReferralOnboardingDataPref, "rhyReferralOnboardingDataPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PostUserCreationShimDuxo(analytics, app, experimentsStore, fundAccountStore, gcmManager, matchaManager, regionGateProvider, appType, creditCardWaitlistResumeAppBadgePref, rhyReferralOnboardingDataPref, savedStateHandle);
        }
    }
}
