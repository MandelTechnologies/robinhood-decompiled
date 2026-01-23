package com.robinhood.android.p273ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.data.prefs.HasVisitedBrokerageWatchlistHomePref;
import com.robinhood.android.common.data.prefs.HasVisitedEquityDetailPref;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeTabFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/ui/HomeTabFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/HomeTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "suggestedAmountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "hasVisitedBrokerageWatchlistHomePref", "Lcom/robinhood/prefs/BooleanPreference;", "hasVisitedEquityDetailPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class HomeTabFragment_MembersInjector implements MembersInjector<HomeTabFragment> {
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasVisitedBrokerageWatchlistHomePref;
    private final Provider<BooleanPreference> hasVisitedEquityDetailPref;
    private final Provider<HomeDashboardStore> homeDashboardStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SuggestedAmountsStore> suggestedAmountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<HomeTabFragment> create(Provider<BaseFragmentSingletons> provider, Provider<ExperimentsStore> provider2, Provider<PositionStore> provider3, Provider<SuggestedAmountsStore> provider4, Provider<AnalyticsLogger> provider5, Provider<HomeDashboardStore> provider6, Provider<AccountSelectorHomeManager> provider7, Provider<BooleanPreference> provider8, Provider<BooleanPreference> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final void injectAccountSelectorHomeManager(HomeTabFragment homeTabFragment, AccountSelectorHomeManager accountSelectorHomeManager) {
        INSTANCE.injectAccountSelectorHomeManager(homeTabFragment, accountSelectorHomeManager);
    }

    @JvmStatic
    public static final void injectAnalytics(HomeTabFragment homeTabFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(homeTabFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(HomeTabFragment homeTabFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(homeTabFragment, experimentsStore);
    }

    @JvmStatic
    @HasVisitedBrokerageWatchlistHomePref
    public static final void injectHasVisitedBrokerageWatchlistHomePref(HomeTabFragment homeTabFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectHasVisitedBrokerageWatchlistHomePref(homeTabFragment, booleanPreference);
    }

    @JvmStatic
    @HasVisitedEquityDetailPref
    public static final void injectHasVisitedEquityDetailPref(HomeTabFragment homeTabFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectHasVisitedEquityDetailPref(homeTabFragment, booleanPreference);
    }

    @JvmStatic
    public static final void injectHomeDashboardStore(HomeTabFragment homeTabFragment, HomeDashboardStore homeDashboardStore) {
        INSTANCE.injectHomeDashboardStore(homeTabFragment, homeDashboardStore);
    }

    @JvmStatic
    public static final void injectPositionStore(HomeTabFragment homeTabFragment, PositionStore positionStore) {
        INSTANCE.injectPositionStore(homeTabFragment, positionStore);
    }

    @JvmStatic
    public static final void injectSuggestedAmountStore(HomeTabFragment homeTabFragment, SuggestedAmountsStore suggestedAmountsStore) {
        INSTANCE.injectSuggestedAmountStore(homeTabFragment, suggestedAmountsStore);
    }

    public HomeTabFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<PositionStore> positionStore, Provider<SuggestedAmountsStore> suggestedAmountStore, Provider<AnalyticsLogger> analytics, Provider<HomeDashboardStore> homeDashboardStore, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<BooleanPreference> hasVisitedBrokerageWatchlistHomePref, Provider<BooleanPreference> hasVisitedEquityDetailPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(suggestedAmountStore, "suggestedAmountStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(hasVisitedBrokerageWatchlistHomePref, "hasVisitedBrokerageWatchlistHomePref");
        Intrinsics.checkNotNullParameter(hasVisitedEquityDetailPref, "hasVisitedEquityDetailPref");
        this.singletons = singletons;
        this.experimentsStore = experimentsStore;
        this.positionStore = positionStore;
        this.suggestedAmountStore = suggestedAmountStore;
        this.analytics = analytics;
        this.homeDashboardStore = homeDashboardStore;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.hasVisitedBrokerageWatchlistHomePref = hasVisitedBrokerageWatchlistHomePref;
        this.hasVisitedEquityDetailPref = hasVisitedEquityDetailPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HomeTabFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        companion2.injectPositionStore(instance, positionStore);
        SuggestedAmountsStore suggestedAmountsStore = this.suggestedAmountStore.get();
        Intrinsics.checkNotNullExpressionValue(suggestedAmountsStore, "get(...)");
        companion2.injectSuggestedAmountStore(instance, suggestedAmountsStore);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        HomeDashboardStore homeDashboardStore = this.homeDashboardStore.get();
        Intrinsics.checkNotNullExpressionValue(homeDashboardStore, "get(...)");
        companion2.injectHomeDashboardStore(instance, homeDashboardStore);
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        companion2.injectAccountSelectorHomeManager(instance, accountSelectorHomeManager);
        BooleanPreference booleanPreference = this.hasVisitedBrokerageWatchlistHomePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectHasVisitedBrokerageWatchlistHomePref(instance, booleanPreference);
        BooleanPreference booleanPreference2 = this.hasVisitedEquityDetailPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion2.injectHasVisitedEquityDetailPref(instance, booleanPreference2);
    }

    /* compiled from: HomeTabFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008c\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/ui/HomeTabFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/ui/HomeTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "suggestedAmountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "hasVisitedBrokerageWatchlistHomePref", "Lcom/robinhood/prefs/BooleanPreference;", "hasVisitedEquityDetailPref", "injectExperimentsStore", "", "instance", "injectPositionStore", "injectSuggestedAmountStore", "injectAnalytics", "injectHomeDashboardStore", "injectAccountSelectorHomeManager", "injectHasVisitedBrokerageWatchlistHomePref", "injectHasVisitedEquityDetailPref", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<HomeTabFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<ExperimentsStore> experimentsStore, Provider<PositionStore> positionStore, Provider<SuggestedAmountsStore> suggestedAmountStore, Provider<AnalyticsLogger> analytics, Provider<HomeDashboardStore> homeDashboardStore, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<BooleanPreference> hasVisitedBrokerageWatchlistHomePref, Provider<BooleanPreference> hasVisitedEquityDetailPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(suggestedAmountStore, "suggestedAmountStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(hasVisitedBrokerageWatchlistHomePref, "hasVisitedBrokerageWatchlistHomePref");
            Intrinsics.checkNotNullParameter(hasVisitedEquityDetailPref, "hasVisitedEquityDetailPref");
            return new HomeTabFragment_MembersInjector(singletons, experimentsStore, positionStore, suggestedAmountStore, analytics, homeDashboardStore, accountSelectorHomeManager, hasVisitedBrokerageWatchlistHomePref, hasVisitedEquityDetailPref);
        }

        @JvmStatic
        public final void injectExperimentsStore(HomeTabFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectPositionStore(HomeTabFragment instance, PositionStore positionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            instance.setPositionStore(positionStore);
        }

        @JvmStatic
        public final void injectSuggestedAmountStore(HomeTabFragment instance, SuggestedAmountsStore suggestedAmountStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(suggestedAmountStore, "suggestedAmountStore");
            instance.setSuggestedAmountStore(suggestedAmountStore);
        }

        @JvmStatic
        public final void injectAnalytics(HomeTabFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectHomeDashboardStore(HomeTabFragment instance, HomeDashboardStore homeDashboardStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            instance.setHomeDashboardStore(homeDashboardStore);
        }

        @JvmStatic
        public final void injectAccountSelectorHomeManager(HomeTabFragment instance, AccountSelectorHomeManager accountSelectorHomeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            instance.setAccountSelectorHomeManager(accountSelectorHomeManager);
        }

        @JvmStatic
        @HasVisitedBrokerageWatchlistHomePref
        public final void injectHasVisitedBrokerageWatchlistHomePref(HomeTabFragment instance, BooleanPreference hasVisitedBrokerageWatchlistHomePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasVisitedBrokerageWatchlistHomePref, "hasVisitedBrokerageWatchlistHomePref");
            instance.setHasVisitedBrokerageWatchlistHomePref(hasVisitedBrokerageWatchlistHomePref);
        }

        @JvmStatic
        @HasVisitedEquityDetailPref
        public final void injectHasVisitedEquityDetailPref(HomeTabFragment instance, BooleanPreference hasVisitedEquityDetailPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasVisitedEquityDetailPref, "hasVisitedEquityDetailPref");
            instance.setHasVisitedEquityDetailPref(hasVisitedEquityDetailPref);
        }
    }
}
