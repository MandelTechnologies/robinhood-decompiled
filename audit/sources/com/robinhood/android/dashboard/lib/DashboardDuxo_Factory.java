package com.robinhood.android.dashboard.lib;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/dashboard/lib/DashboardDuxo;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "hasSeenFxSwitcherFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DashboardDuxo_Factory implements Factory<DashboardDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<IntPreference> displayCurrencySelectionPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasSeenFxSwitcherFtuxPref;
    private final Provider<HomeDashboardStore> homeDashboardStore;
    private final Provider<PerformanceChartStore> performanceChartStore;
    private final Provider<RegionGateProvider> regionGateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DashboardDuxo_Factory create(Provider<AccountAccessStore> provider, Provider<AccountProvider> provider2, Provider<HomeDashboardStore> provider3, Provider<PerformanceChartStore> provider4, Provider<RegionGateProvider> provider5, Provider<ExperimentsStore> provider6, Provider<BooleanPreference> provider7, Provider<IntPreference> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final DashboardDuxo newInstance(AccountAccessStore accountAccessStore, AccountProvider accountProvider, HomeDashboardStore homeDashboardStore, PerformanceChartStore performanceChartStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, BooleanPreference booleanPreference, IntPreference intPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountAccessStore, accountProvider, homeDashboardStore, performanceChartStore, regionGateProvider, experimentsStore, booleanPreference, intPreference, duxoBundle);
    }

    public DashboardDuxo_Factory(Provider<AccountAccessStore> accountAccessStore, Provider<AccountProvider> accountProvider, Provider<HomeDashboardStore> homeDashboardStore, Provider<PerformanceChartStore> performanceChartStore, Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> hasSeenFxSwitcherFtuxPref, Provider<IntPreference> displayCurrencySelectionPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
        Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountAccessStore = accountAccessStore;
        this.accountProvider = accountProvider;
        this.homeDashboardStore = homeDashboardStore;
        this.performanceChartStore = performanceChartStore;
        this.regionGateProvider = regionGateProvider;
        this.experimentsStore = experimentsStore;
        this.hasSeenFxSwitcherFtuxPref = hasSeenFxSwitcherFtuxPref;
        this.displayCurrencySelectionPref = displayCurrencySelectionPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DashboardDuxo get() {
        Companion companion = INSTANCE;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        HomeDashboardStore homeDashboardStore = this.homeDashboardStore.get();
        Intrinsics.checkNotNullExpressionValue(homeDashboardStore, "get(...)");
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenFxSwitcherFtuxPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        IntPreference intPreference = this.displayCurrencySelectionPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountAccessStore, accountProvider, homeDashboardStore, performanceChartStore, regionGateProvider, experimentsStore, booleanPreference, intPreference, duxoBundle);
    }

    /* compiled from: DashboardDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/DashboardDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dashboard/lib/DashboardDuxo_Factory;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "hasSeenFxSwitcherFtuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/dashboard/lib/DashboardDuxo;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DashboardDuxo_Factory create(Provider<AccountAccessStore> accountAccessStore, Provider<AccountProvider> accountProvider, Provider<HomeDashboardStore> homeDashboardStore, Provider<PerformanceChartStore> performanceChartStore, Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> hasSeenFxSwitcherFtuxPref, Provider<IntPreference> displayCurrencySelectionPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
            Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardDuxo_Factory(accountAccessStore, accountProvider, homeDashboardStore, performanceChartStore, regionGateProvider, experimentsStore, hasSeenFxSwitcherFtuxPref, displayCurrencySelectionPref, duxoBundle);
        }

        @JvmStatic
        public final DashboardDuxo newInstance(AccountAccessStore accountAccessStore, AccountProvider accountProvider, HomeDashboardStore homeDashboardStore, PerformanceChartStore performanceChartStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, BooleanPreference hasSeenFxSwitcherFtuxPref, IntPreference displayCurrencySelectionPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(hasSeenFxSwitcherFtuxPref, "hasSeenFxSwitcherFtuxPref");
            Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DashboardDuxo(accountAccessStore, accountProvider, homeDashboardStore, performanceChartStore, regionGateProvider, experimentsStore, hasSeenFxSwitcherFtuxPref, displayCurrencySelectionPref, duxoBundle);
        }
    }
}
