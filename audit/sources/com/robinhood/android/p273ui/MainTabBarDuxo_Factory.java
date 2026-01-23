package com.robinhood.android.p273ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.tab.GoldTabExperimentStore;
import com.robinhood.android.libs.tab.CurrentTabManager;
import com.robinhood.android.p273ui.tooltip.WatchlistTabTooltipService;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.McDucklingBadgeStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;

/* compiled from: MainTabBarDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabBarDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/ui/MainTabBarDuxo;", "goldTabExperimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/tab/GoldTabExperimentStore;", "redesignInvestingExperimentStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "mcDucklingBadgeStore", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "watchlistTabTooltipService", "Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "homeTabShouldBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "currentTabManager", "Lcom/robinhood/android/libs/tab/CurrentTabManager;", "stateProvider", "Lcom/robinhood/android/ui/MainTabBarStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MainTabBarDuxo_Factory implements Factory<MainTabBarDuxo> {
    private final Provider<AccountSelectorHomeManager> accountSelectorHomeManager;
    private final Provider<CurrentTabManager> currentTabManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentStore;
    private final Provider<GoldTabExperimentStore> goldTabExperimentsStore;
    private final Provider<BooleanPreference> homeTabShouldBadgePref;
    private final Provider<McDucklingBadgeStore> mcDucklingBadgeStore;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<RedesignInvestingExperimentStore> redesignInvestingExperimentStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MainTabBarStateProvider> stateProvider;
    private final Provider<UserStore> userStore;
    private final Provider<WatchlistTabTooltipService> watchlistTabTooltipService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MainTabBarDuxo_Factory create(Provider<GoldTabExperimentStore> provider, Provider<RedesignInvestingExperimentStore> provider2, Provider<UserStore> provider3, Provider<McDucklingBadgeStore> provider4, Provider<RegionGateProvider> provider5, Provider<ExperimentsStore> provider6, Provider<AccountSelectorHomeManager> provider7, Provider<WatchlistTabTooltipService> provider8, Provider<MicrogramComponent.Factory> provider9, Provider<BooleanPreference> provider10, Provider<CurrentTabManager> provider11, Provider<MainTabBarStateProvider> provider12, Provider<SavedStateHandle> provider13, Provider<DuxoBundle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final MainTabBarDuxo newInstance(GoldTabExperimentStore goldTabExperimentStore, RedesignInvestingExperimentStore redesignInvestingExperimentStore, UserStore userStore, McDucklingBadgeStore mcDucklingBadgeStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, AccountSelectorHomeManager accountSelectorHomeManager, WatchlistTabTooltipService watchlistTabTooltipService, MicrogramComponent.Factory factory, BooleanPreference booleanPreference, CurrentTabManager currentTabManager, MainTabBarStateProvider mainTabBarStateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(goldTabExperimentStore, redesignInvestingExperimentStore, userStore, mcDucklingBadgeStore, regionGateProvider, experimentsStore, accountSelectorHomeManager, watchlistTabTooltipService, factory, booleanPreference, currentTabManager, mainTabBarStateProvider, savedStateHandle, duxoBundle);
    }

    public MainTabBarDuxo_Factory(Provider<GoldTabExperimentStore> goldTabExperimentsStore, Provider<RedesignInvestingExperimentStore> redesignInvestingExperimentStore, Provider<UserStore> userStore, Provider<McDucklingBadgeStore> mcDucklingBadgeStore, Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentStore, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<WatchlistTabTooltipService> watchlistTabTooltipService, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<BooleanPreference> homeTabShouldBadgePref, Provider<CurrentTabManager> currentTabManager, Provider<MainTabBarStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(goldTabExperimentsStore, "goldTabExperimentsStore");
        Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "mcDucklingBadgeStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(watchlistTabTooltipService, "watchlistTabTooltipService");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(homeTabShouldBadgePref, "homeTabShouldBadgePref");
        Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldTabExperimentsStore = goldTabExperimentsStore;
        this.redesignInvestingExperimentStore = redesignInvestingExperimentStore;
        this.userStore = userStore;
        this.mcDucklingBadgeStore = mcDucklingBadgeStore;
        this.regionGateProvider = regionGateProvider;
        this.experimentStore = experimentStore;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.watchlistTabTooltipService = watchlistTabTooltipService;
        this.microgramComponentFactory = microgramComponentFactory;
        this.homeTabShouldBadgePref = homeTabShouldBadgePref;
        this.currentTabManager = currentTabManager;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public MainTabBarDuxo get() {
        Companion companion = INSTANCE;
        GoldTabExperimentStore goldTabExperimentStore = this.goldTabExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(goldTabExperimentStore, "get(...)");
        RedesignInvestingExperimentStore redesignInvestingExperimentStore = this.redesignInvestingExperimentStore.get();
        Intrinsics.checkNotNullExpressionValue(redesignInvestingExperimentStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        McDucklingBadgeStore mcDucklingBadgeStore = this.mcDucklingBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(mcDucklingBadgeStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        ExperimentsStore experimentsStore = this.experimentStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager.get();
        Intrinsics.checkNotNullExpressionValue(accountSelectorHomeManager, "get(...)");
        WatchlistTabTooltipService watchlistTabTooltipService = this.watchlistTabTooltipService.get();
        Intrinsics.checkNotNullExpressionValue(watchlistTabTooltipService, "get(...)");
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        BooleanPreference booleanPreference = this.homeTabShouldBadgePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        CurrentTabManager currentTabManager = this.currentTabManager.get();
        Intrinsics.checkNotNullExpressionValue(currentTabManager, "get(...)");
        MainTabBarStateProvider mainTabBarStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(mainTabBarStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(goldTabExperimentStore, redesignInvestingExperimentStore, userStore, mcDucklingBadgeStore, regionGateProvider, experimentsStore, accountSelectorHomeManager, watchlistTabTooltipService, factory, booleanPreference, currentTabManager, mainTabBarStateProvider, savedStateHandle, duxoBundle);
    }

    /* compiled from: MainTabBarDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabBarDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/ui/MainTabBarDuxo_Factory;", "goldTabExperimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/tab/GoldTabExperimentStore;", "redesignInvestingExperimentStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "mcDucklingBadgeStore", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "watchlistTabTooltipService", "Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "homeTabShouldBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "currentTabManager", "Lcom/robinhood/android/libs/tab/CurrentTabManager;", "stateProvider", "Lcom/robinhood/android/ui/MainTabBarStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/ui/MainTabBarDuxo;", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MainTabBarDuxo_Factory create(Provider<GoldTabExperimentStore> goldTabExperimentsStore, Provider<RedesignInvestingExperimentStore> redesignInvestingExperimentStore, Provider<UserStore> userStore, Provider<McDucklingBadgeStore> mcDucklingBadgeStore, Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentStore, Provider<AccountSelectorHomeManager> accountSelectorHomeManager, Provider<WatchlistTabTooltipService> watchlistTabTooltipService, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<BooleanPreference> homeTabShouldBadgePref, Provider<CurrentTabManager> currentTabManager, Provider<MainTabBarStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(goldTabExperimentsStore, "goldTabExperimentsStore");
            Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "mcDucklingBadgeStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(watchlistTabTooltipService, "watchlistTabTooltipService");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(homeTabShouldBadgePref, "homeTabShouldBadgePref");
            Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MainTabBarDuxo_Factory(goldTabExperimentsStore, redesignInvestingExperimentStore, userStore, mcDucklingBadgeStore, regionGateProvider, experimentStore, accountSelectorHomeManager, watchlistTabTooltipService, microgramComponentFactory, homeTabShouldBadgePref, currentTabManager, stateProvider, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final MainTabBarDuxo newInstance(GoldTabExperimentStore goldTabExperimentsStore, RedesignInvestingExperimentStore redesignInvestingExperimentStore, UserStore userStore, McDucklingBadgeStore mcDucklingBadgeStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentStore, AccountSelectorHomeManager accountSelectorHomeManager, WatchlistTabTooltipService watchlistTabTooltipService, MicrogramComponent.Factory microgramComponentFactory, BooleanPreference homeTabShouldBadgePref, CurrentTabManager currentTabManager, MainTabBarStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(goldTabExperimentsStore, "goldTabExperimentsStore");
            Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "mcDucklingBadgeStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
            Intrinsics.checkNotNullParameter(watchlistTabTooltipService, "watchlistTabTooltipService");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(homeTabShouldBadgePref, "homeTabShouldBadgePref");
            Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MainTabBarDuxo(goldTabExperimentsStore, redesignInvestingExperimentStore, userStore, mcDucklingBadgeStore, regionGateProvider, experimentStore, accountSelectorHomeManager, watchlistTabTooltipService, microgramComponentFactory, homeTabShouldBadgePref, currentTabManager, stateProvider, savedStateHandle, duxoBundle);
        }
    }
}
