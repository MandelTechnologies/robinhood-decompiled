package com.robinhood.android.account.p060ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory;
import com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.store.instant.InstantDepositsCardStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountOverviewStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOnboardingStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;Bó\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/account/ui/AccountOverviewDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountOverviewStore", "Lcom/robinhood/librobinhood/data/store/AccountOverviewStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "dripSettingsStore", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "instantDepositsCardStore", "Lcom/robinhood/android/lib/store/instant/InstantDepositsCardStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "markwon", "Lio/noties/markwon/Markwon;", "slipHubCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "sweepInterestContextFactory", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountMarketValuesLiveStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore;", "buildAccountOverviewRhdDataState", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/BuildAccountOverviewRhdDataStateUseCase;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/account/ui/AccountOverviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountOverviewDuxo_Factory implements Factory<AccountOverviewDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountMarketValuesLiveStore> accountMarketValuesLiveStore;
    private final Provider<AccountOverviewStore> accountOverviewStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<IntPreference> accountTabCurrencyPref;
    private final Provider<BalancesStore> balancesStore;
    private final Provider<BrokerageResourceManager> brokerageResourceManager;
    private final Provider<BuildAccountOverviewRhdDataStateUseCase> buildAccountOverviewRhdDataState;
    private final Provider<DripSettingsStore> dripSettingsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstantDepositsCardStore> instantDepositsCardStore;
    private final Provider<TraderInvestmentScheduleStore> investmentScheduleStore;
    private final Provider<MarginEligibilityStore> marginEligibilityStore;
    private final Provider<MarginInvestingInfoStore> marginInvestingInfoStore;
    private final Provider<LeveredMarginSettingsStore> marginSettingsStore;
    private final Provider<Markwon> markwon;
    private final Provider<OptionOnboardingStore> optionOnboardingStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SlipHubCardStore> slipHubCardStore;
    private final Provider<SlipStatusStore> slipStatusStore;
    private final Provider<AccountOverviewStateProvider> stateProvider;
    private final Provider<SweepInterestContextFactory> sweepInterestContextFactory;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountOverviewDuxo_Factory create(Provider<AccountProvider> provider, Provider<AccountOverviewStore> provider2, Provider<BalancesStore> provider3, Provider<BrokerageResourceManager> provider4, Provider<DripSettingsStore> provider5, Provider<InstantDepositsCardStore> provider6, Provider<TraderInvestmentScheduleStore> provider7, Provider<LeveredMarginSettingsStore> provider8, Provider<MarginEligibilityStore> provider9, Provider<Markwon> provider10, Provider<SlipHubCardStore> provider11, Provider<SlipStatusStore> provider12, Provider<SweepInterestContextFactory> provider13, Provider<UnifiedAccountStore> provider14, Provider<RegionGateProvider> provider15, Provider<UserStore> provider16, Provider<AccountAccessStore> provider17, Provider<AccountMarketValuesLiveStore> provider18, Provider<BuildAccountOverviewRhdDataStateUseCase> provider19, Provider<OptionOnboardingStore> provider20, Provider<ExperimentsStore> provider21, Provider<MarginInvestingInfoStore> provider22, Provider<IntPreference> provider23, Provider<AccountOverviewStateProvider> provider24, Provider<DuxoBundle> provider25, Provider<SavedStateHandle> provider26) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26);
    }

    @JvmStatic
    public static final AccountOverviewDuxo newInstance(AccountProvider accountProvider, AccountOverviewStore accountOverviewStore, BalancesStore balancesStore, BrokerageResourceManager brokerageResourceManager, DripSettingsStore dripSettingsStore, InstantDepositsCardStore instantDepositsCardStore, TraderInvestmentScheduleStore traderInvestmentScheduleStore, LeveredMarginSettingsStore leveredMarginSettingsStore, MarginEligibilityStore marginEligibilityStore, Markwon markwon, SlipHubCardStore slipHubCardStore, SlipStatusStore slipStatusStore, SweepInterestContextFactory sweepInterestContextFactory, UnifiedAccountStore unifiedAccountStore, RegionGateProvider regionGateProvider, UserStore userStore, AccountAccessStore accountAccessStore, AccountMarketValuesLiveStore accountMarketValuesLiveStore, BuildAccountOverviewRhdDataStateUseCase buildAccountOverviewRhdDataStateUseCase, OptionOnboardingStore optionOnboardingStore, ExperimentsStore experimentsStore, MarginInvestingInfoStore marginInvestingInfoStore, IntPreference intPreference, AccountOverviewStateProvider accountOverviewStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, accountOverviewStore, balancesStore, brokerageResourceManager, dripSettingsStore, instantDepositsCardStore, traderInvestmentScheduleStore, leveredMarginSettingsStore, marginEligibilityStore, markwon, slipHubCardStore, slipStatusStore, sweepInterestContextFactory, unifiedAccountStore, regionGateProvider, userStore, accountAccessStore, accountMarketValuesLiveStore, buildAccountOverviewRhdDataStateUseCase, optionOnboardingStore, experimentsStore, marginInvestingInfoStore, intPreference, accountOverviewStateProvider, duxoBundle, savedStateHandle);
    }

    public AccountOverviewDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AccountOverviewStore> accountOverviewStore, Provider<BalancesStore> balancesStore, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<DripSettingsStore> dripSettingsStore, Provider<InstantDepositsCardStore> instantDepositsCardStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<MarginEligibilityStore> marginEligibilityStore, Provider<Markwon> markwon, Provider<SlipHubCardStore> slipHubCardStore, Provider<SlipStatusStore> slipStatusStore, Provider<SweepInterestContextFactory> sweepInterestContextFactory, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<RegionGateProvider> regionGateProvider, Provider<UserStore> userStore, Provider<AccountAccessStore> accountAccessStore, Provider<AccountMarketValuesLiveStore> accountMarketValuesLiveStore, Provider<BuildAccountOverviewRhdDataStateUseCase> buildAccountOverviewRhdDataState, Provider<OptionOnboardingStore> optionOnboardingStore, Provider<ExperimentsStore> experimentsStore, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<IntPreference> accountTabCurrencyPref, Provider<AccountOverviewStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountOverviewStore, "accountOverviewStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(dripSettingsStore, "dripSettingsStore");
        Intrinsics.checkNotNullParameter(instantDepositsCardStore, "instantDepositsCardStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(slipHubCardStore, "slipHubCardStore");
        Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
        Intrinsics.checkNotNullParameter(sweepInterestContextFactory, "sweepInterestContextFactory");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(accountMarketValuesLiveStore, "accountMarketValuesLiveStore");
        Intrinsics.checkNotNullParameter(buildAccountOverviewRhdDataState, "buildAccountOverviewRhdDataState");
        Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.accountOverviewStore = accountOverviewStore;
        this.balancesStore = balancesStore;
        this.brokerageResourceManager = brokerageResourceManager;
        this.dripSettingsStore = dripSettingsStore;
        this.instantDepositsCardStore = instantDepositsCardStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.marginSettingsStore = marginSettingsStore;
        this.marginEligibilityStore = marginEligibilityStore;
        this.markwon = markwon;
        this.slipHubCardStore = slipHubCardStore;
        this.slipStatusStore = slipStatusStore;
        this.sweepInterestContextFactory = sweepInterestContextFactory;
        this.unifiedAccountStore = unifiedAccountStore;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        this.accountAccessStore = accountAccessStore;
        this.accountMarketValuesLiveStore = accountMarketValuesLiveStore;
        this.buildAccountOverviewRhdDataState = buildAccountOverviewRhdDataState;
        this.optionOnboardingStore = optionOnboardingStore;
        this.experimentsStore = experimentsStore;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.accountTabCurrencyPref = accountTabCurrencyPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public AccountOverviewDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountOverviewStore accountOverviewStore = this.accountOverviewStore.get();
        Intrinsics.checkNotNullExpressionValue(accountOverviewStore, "get(...)");
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager.get();
        Intrinsics.checkNotNullExpressionValue(brokerageResourceManager, "get(...)");
        DripSettingsStore dripSettingsStore = this.dripSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(dripSettingsStore, "get(...)");
        InstantDepositsCardStore instantDepositsCardStore = this.instantDepositsCardStore.get();
        Intrinsics.checkNotNullExpressionValue(instantDepositsCardStore, "get(...)");
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(traderInvestmentScheduleStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        MarginEligibilityStore marginEligibilityStore = this.marginEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(marginEligibilityStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        SlipHubCardStore slipHubCardStore = this.slipHubCardStore.get();
        Intrinsics.checkNotNullExpressionValue(slipHubCardStore, "get(...)");
        SlipStatusStore slipStatusStore = this.slipStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(slipStatusStore, "get(...)");
        SweepInterestContextFactory sweepInterestContextFactory = this.sweepInterestContextFactory.get();
        Intrinsics.checkNotNullExpressionValue(sweepInterestContextFactory, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore2 = unifiedAccountStore;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        UserStore userStore2 = userStore;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountAccessStore accountAccessStore2 = accountAccessStore;
        AccountMarketValuesLiveStore accountMarketValuesLiveStore = this.accountMarketValuesLiveStore.get();
        Intrinsics.checkNotNullExpressionValue(accountMarketValuesLiveStore, "get(...)");
        AccountMarketValuesLiveStore accountMarketValuesLiveStore2 = accountMarketValuesLiveStore;
        BuildAccountOverviewRhdDataStateUseCase buildAccountOverviewRhdDataStateUseCase = this.buildAccountOverviewRhdDataState.get();
        Intrinsics.checkNotNullExpressionValue(buildAccountOverviewRhdDataStateUseCase, "get(...)");
        BuildAccountOverviewRhdDataStateUseCase buildAccountOverviewRhdDataStateUseCase2 = buildAccountOverviewRhdDataStateUseCase;
        OptionOnboardingStore optionOnboardingStore = this.optionOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOnboardingStore, "get(...)");
        OptionOnboardingStore optionOnboardingStore2 = optionOnboardingStore;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStore experimentsStore2 = experimentsStore;
        MarginInvestingInfoStore marginInvestingInfoStore = this.marginInvestingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(marginInvestingInfoStore, "get(...)");
        MarginInvestingInfoStore marginInvestingInfoStore2 = marginInvestingInfoStore;
        IntPreference intPreference = this.accountTabCurrencyPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        IntPreference intPreference2 = intPreference;
        AccountOverviewStateProvider accountOverviewStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountOverviewStateProvider, "get(...)");
        AccountOverviewStateProvider accountOverviewStateProvider2 = accountOverviewStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, accountOverviewStore, balancesStore, brokerageResourceManager, dripSettingsStore, instantDepositsCardStore, traderInvestmentScheduleStore, leveredMarginSettingsStore, marginEligibilityStore, markwon, slipHubCardStore, slipStatusStore, sweepInterestContextFactory, unifiedAccountStore2, regionGateProvider2, userStore2, accountAccessStore2, accountMarketValuesLiveStore2, buildAccountOverviewRhdDataStateUseCase2, optionOnboardingStore2, experimentsStore2, marginInvestingInfoStore2, intPreference2, accountOverviewStateProvider2, duxoBundle2, savedStateHandle);
    }

    /* compiled from: AccountOverviewDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jô\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0007H\u0007JØ\u0001\u0010;\u001a\u00020<2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0007¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/account/ui/AccountOverviewDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountOverviewStore", "Lcom/robinhood/librobinhood/data/store/AccountOverviewStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "dripSettingsStore", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "instantDepositsCardStore", "Lcom/robinhood/android/lib/store/instant/InstantDepositsCardStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "markwon", "Lio/noties/markwon/Markwon;", "slipHubCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "sweepInterestContextFactory", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountMarketValuesLiveStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore;", "buildAccountOverviewRhdDataState", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/BuildAccountOverviewRhdDataStateUseCase;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/account/ui/AccountOverviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/account/ui/AccountOverviewDuxo;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountOverviewDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AccountOverviewStore> accountOverviewStore, Provider<BalancesStore> balancesStore, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<DripSettingsStore> dripSettingsStore, Provider<InstantDepositsCardStore> instantDepositsCardStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<MarginEligibilityStore> marginEligibilityStore, Provider<Markwon> markwon, Provider<SlipHubCardStore> slipHubCardStore, Provider<SlipStatusStore> slipStatusStore, Provider<SweepInterestContextFactory> sweepInterestContextFactory, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<RegionGateProvider> regionGateProvider, Provider<UserStore> userStore, Provider<AccountAccessStore> accountAccessStore, Provider<AccountMarketValuesLiveStore> accountMarketValuesLiveStore, Provider<BuildAccountOverviewRhdDataStateUseCase> buildAccountOverviewRhdDataState, Provider<OptionOnboardingStore> optionOnboardingStore, Provider<ExperimentsStore> experimentsStore, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<IntPreference> accountTabCurrencyPref, Provider<AccountOverviewStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountOverviewStore, "accountOverviewStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(dripSettingsStore, "dripSettingsStore");
            Intrinsics.checkNotNullParameter(instantDepositsCardStore, "instantDepositsCardStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(slipHubCardStore, "slipHubCardStore");
            Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
            Intrinsics.checkNotNullParameter(sweepInterestContextFactory, "sweepInterestContextFactory");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountMarketValuesLiveStore, "accountMarketValuesLiveStore");
            Intrinsics.checkNotNullParameter(buildAccountOverviewRhdDataState, "buildAccountOverviewRhdDataState");
            Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AccountOverviewDuxo_Factory(accountProvider, accountOverviewStore, balancesStore, brokerageResourceManager, dripSettingsStore, instantDepositsCardStore, investmentScheduleStore, marginSettingsStore, marginEligibilityStore, markwon, slipHubCardStore, slipStatusStore, sweepInterestContextFactory, unifiedAccountStore, regionGateProvider, userStore, accountAccessStore, accountMarketValuesLiveStore, buildAccountOverviewRhdDataState, optionOnboardingStore, experimentsStore, marginInvestingInfoStore, accountTabCurrencyPref, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final AccountOverviewDuxo newInstance(AccountProvider accountProvider, AccountOverviewStore accountOverviewStore, BalancesStore balancesStore, BrokerageResourceManager brokerageResourceManager, DripSettingsStore dripSettingsStore, InstantDepositsCardStore instantDepositsCardStore, TraderInvestmentScheduleStore investmentScheduleStore, LeveredMarginSettingsStore marginSettingsStore, MarginEligibilityStore marginEligibilityStore, Markwon markwon, SlipHubCardStore slipHubCardStore, SlipStatusStore slipStatusStore, SweepInterestContextFactory sweepInterestContextFactory, UnifiedAccountStore unifiedAccountStore, RegionGateProvider regionGateProvider, UserStore userStore, AccountAccessStore accountAccessStore, AccountMarketValuesLiveStore accountMarketValuesLiveStore, BuildAccountOverviewRhdDataStateUseCase buildAccountOverviewRhdDataState, OptionOnboardingStore optionOnboardingStore, ExperimentsStore experimentsStore, MarginInvestingInfoStore marginInvestingInfoStore, IntPreference accountTabCurrencyPref, AccountOverviewStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountOverviewStore, "accountOverviewStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(dripSettingsStore, "dripSettingsStore");
            Intrinsics.checkNotNullParameter(instantDepositsCardStore, "instantDepositsCardStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(slipHubCardStore, "slipHubCardStore");
            Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
            Intrinsics.checkNotNullParameter(sweepInterestContextFactory, "sweepInterestContextFactory");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountMarketValuesLiveStore, "accountMarketValuesLiveStore");
            Intrinsics.checkNotNullParameter(buildAccountOverviewRhdDataState, "buildAccountOverviewRhdDataState");
            Intrinsics.checkNotNullParameter(optionOnboardingStore, "optionOnboardingStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AccountOverviewDuxo(accountProvider, accountOverviewStore, balancesStore, brokerageResourceManager, dripSettingsStore, instantDepositsCardStore, investmentScheduleStore, marginSettingsStore, marginEligibilityStore, markwon, slipHubCardStore, slipStatusStore, sweepInterestContextFactory, unifiedAccountStore, regionGateProvider, userStore, accountAccessStore, accountMarketValuesLiveStore, buildAccountOverviewRhdDataState, optionOnboardingStore, experimentsStore, marginInvestingInfoStore, accountTabCurrencyPref, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
