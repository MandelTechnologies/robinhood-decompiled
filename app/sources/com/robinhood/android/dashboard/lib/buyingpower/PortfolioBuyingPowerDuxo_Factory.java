package com.robinhood.android.dashboard.lib.buyingpower;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.api.futures.FuturesBrokebackApi;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioBuyingPowerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo;", "educationToolTipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationToolTipStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "portfolioBuyingPowerNavigationDestinationProvider", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "futuresBrokebackApi", "Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PortfolioBuyingPowerDuxo_Factory implements Factory<PortfolioBuyingPowerDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<IntPreference> displayCurrencySelectionPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EducationToolTipStore> educationToolTipStore;
    private final Provider<FuturesBrokebackApi> futuresBrokebackApi;
    private final Provider<McwFxRatesProvider> fxRatesProvider;
    private final Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore;
    private final Provider<PortfolioBuyingPowerNavigationDestinationProvider> portfolioBuyingPowerNavigationDestinationProvider;
    private final Provider<BooleanPreference> portfolioPrivacyPref;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PortfolioBuyingPowerDuxo_Factory create(Provider<EducationToolTipStore> provider, Provider<UnifiedAccountStore> provider2, Provider<GoldDepositBoostMaxAwarenessStore> provider3, Provider<PortfolioBuyingPowerNavigationDestinationProvider> provider4, Provider<AccountProvider> provider5, Provider<FuturesBrokebackApi> provider6, Provider<BooleanPreference> provider7, Provider<IntPreference> provider8, Provider<McwFxRatesProvider> provider9, Provider<RegionGateProvider> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final PortfolioBuyingPowerDuxo newInstance(EducationToolTipStore educationToolTipStore, UnifiedAccountStore unifiedAccountStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, PortfolioBuyingPowerNavigationDestinationProvider portfolioBuyingPowerNavigationDestinationProvider, AccountProvider accountProvider, FuturesBrokebackApi futuresBrokebackApi, BooleanPreference booleanPreference, IntPreference intPreference, McwFxRatesProvider mcwFxRatesProvider, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(educationToolTipStore, unifiedAccountStore, goldDepositBoostMaxAwarenessStore, portfolioBuyingPowerNavigationDestinationProvider, accountProvider, futuresBrokebackApi, booleanPreference, intPreference, mcwFxRatesProvider, regionGateProvider, duxoBundle);
    }

    public PortfolioBuyingPowerDuxo_Factory(Provider<EducationToolTipStore> educationToolTipStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<PortfolioBuyingPowerNavigationDestinationProvider> portfolioBuyingPowerNavigationDestinationProvider, Provider<AccountProvider> accountProvider, Provider<FuturesBrokebackApi> futuresBrokebackApi, Provider<BooleanPreference> portfolioPrivacyPref, Provider<IntPreference> displayCurrencySelectionPref, Provider<McwFxRatesProvider> fxRatesProvider, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(educationToolTipStore, "educationToolTipStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(portfolioBuyingPowerNavigationDestinationProvider, "portfolioBuyingPowerNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(futuresBrokebackApi, "futuresBrokebackApi");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.educationToolTipStore = educationToolTipStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
        this.portfolioBuyingPowerNavigationDestinationProvider = portfolioBuyingPowerNavigationDestinationProvider;
        this.accountProvider = accountProvider;
        this.futuresBrokebackApi = futuresBrokebackApi;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.displayCurrencySelectionPref = displayCurrencySelectionPref;
        this.fxRatesProvider = fxRatesProvider;
        this.regionGateProvider = regionGateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PortfolioBuyingPowerDuxo get() {
        Companion companion = INSTANCE;
        EducationToolTipStore educationToolTipStore = this.educationToolTipStore.get();
        Intrinsics.checkNotNullExpressionValue(educationToolTipStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore = this.goldDepositBoostMaxAwarenessStore.get();
        Intrinsics.checkNotNullExpressionValue(goldDepositBoostMaxAwarenessStore, "get(...)");
        PortfolioBuyingPowerNavigationDestinationProvider portfolioBuyingPowerNavigationDestinationProvider = this.portfolioBuyingPowerNavigationDestinationProvider.get();
        Intrinsics.checkNotNullExpressionValue(portfolioBuyingPowerNavigationDestinationProvider, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        FuturesBrokebackApi futuresBrokebackApi = this.futuresBrokebackApi.get();
        Intrinsics.checkNotNullExpressionValue(futuresBrokebackApi, "get(...)");
        BooleanPreference booleanPreference = this.portfolioPrivacyPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        IntPreference intPreference = this.displayCurrencySelectionPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        McwFxRatesProvider mcwFxRatesProvider = this.fxRatesProvider.get();
        Intrinsics.checkNotNullExpressionValue(mcwFxRatesProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(educationToolTipStore, unifiedAccountStore, goldDepositBoostMaxAwarenessStore, portfolioBuyingPowerNavigationDestinationProvider, accountProvider, futuresBrokebackApi, booleanPreference, intPreference, mcwFxRatesProvider, regionGateProvider, duxoBundle);
    }

    /* compiled from: PortfolioBuyingPowerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007J`\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo_Factory;", "educationToolTipStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationToolTipStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "portfolioBuyingPowerNavigationDestinationProvider", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerNavigationDestinationProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "futuresBrokebackApi", "Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/dashboard/lib/buyingpower/PortfolioBuyingPowerDuxo;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioBuyingPowerDuxo_Factory create(Provider<EducationToolTipStore> educationToolTipStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<PortfolioBuyingPowerNavigationDestinationProvider> portfolioBuyingPowerNavigationDestinationProvider, Provider<AccountProvider> accountProvider, Provider<FuturesBrokebackApi> futuresBrokebackApi, Provider<BooleanPreference> portfolioPrivacyPref, Provider<IntPreference> displayCurrencySelectionPref, Provider<McwFxRatesProvider> fxRatesProvider, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(educationToolTipStore, "educationToolTipStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(portfolioBuyingPowerNavigationDestinationProvider, "portfolioBuyingPowerNavigationDestinationProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(futuresBrokebackApi, "futuresBrokebackApi");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PortfolioBuyingPowerDuxo_Factory(educationToolTipStore, unifiedAccountStore, goldDepositBoostMaxAwarenessStore, portfolioBuyingPowerNavigationDestinationProvider, accountProvider, futuresBrokebackApi, portfolioPrivacyPref, displayCurrencySelectionPref, fxRatesProvider, regionGateProvider, duxoBundle);
        }

        @JvmStatic
        public final PortfolioBuyingPowerDuxo newInstance(EducationToolTipStore educationToolTipStore, UnifiedAccountStore unifiedAccountStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, PortfolioBuyingPowerNavigationDestinationProvider portfolioBuyingPowerNavigationDestinationProvider, AccountProvider accountProvider, FuturesBrokebackApi futuresBrokebackApi, BooleanPreference portfolioPrivacyPref, IntPreference displayCurrencySelectionPref, McwFxRatesProvider fxRatesProvider, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(educationToolTipStore, "educationToolTipStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(portfolioBuyingPowerNavigationDestinationProvider, "portfolioBuyingPowerNavigationDestinationProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(futuresBrokebackApi, "futuresBrokebackApi");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PortfolioBuyingPowerDuxo(educationToolTipStore, unifiedAccountStore, goldDepositBoostMaxAwarenessStore, portfolioBuyingPowerNavigationDestinationProvider, accountProvider, futuresBrokebackApi, portfolioPrivacyPref, displayCurrencySelectionPref, fxRatesProvider, regionGateProvider, duxoBundle);
        }
    }
}
