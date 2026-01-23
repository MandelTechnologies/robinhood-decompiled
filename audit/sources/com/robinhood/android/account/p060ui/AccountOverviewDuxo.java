package com.robinhood.android.account.p060ui;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityContextDto;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewEvent;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageOtherMarkdown;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.feature.lib.sweep.interest.SweepInterestContextFactory;
import com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase;
import com.robinhood.android.futures.lib.rhd.accountoverview.RhdAccountDataState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.accounts.MultipleIndividualAccountsExperiment;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs;
import com.robinhood.android.lib.store.instant.InstantDepositsCardStore;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.android.models.accountoverview.p184db.DayTradeCard;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.regiongate.CustodialRegionOrExperimentGate;
import com.robinhood.android.regiongate.InstantDepositRegionGate;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.RetryOnError;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.AccountOverviewStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.DripEligibility;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOnboardingStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AppointmentData;
import com.robinhood.models.p320db.OptionsStatus;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p320db.SlipHubCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.IntPreference;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.Share3;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AccountOverviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 F2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001FBÛ\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\b\b\u0001\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\u0006\u00108\u001a\u000209¢\u0006\u0004\b:\u0010;J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020BH\u0016J\u000e\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020@R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u000209X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;", "Lcom/robinhood/android/account/ui/AccountOverviewViewState;", "Lcom/robinhood/android/account/ui/AccountOverviewEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountOverviewStore", "Lcom/robinhood/librobinhood/data/store/AccountOverviewStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "dripSettingsStore", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "instantDepositsCardStore", "Lcom/robinhood/android/lib/store/instant/InstantDepositsCardStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "markwon", "Lio/noties/markwon/Markwon;", "slipHubCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "sweepInterestContextFactory", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountMarketValuesLiveStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore;", "buildAccountOverviewRhdDataState", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/BuildAccountOverviewRhdDataStateUseCase;", "optionOnboardingStore", "Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "stateProvider", "Lcom/robinhood/android/account/ui/AccountOverviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AccountOverviewStore;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lcom/robinhood/librobinhood/data/store/DripSettingsStore;Lcom/robinhood/android/lib/store/instant/InstantDepositsCardStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lio/noties/markwon/Markwon;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore;Lcom/robinhood/android/futures/lib/rhd/accountoverview/BuildAccountOverviewRhdDataStateUseCase;Lcom/robinhood/librobinhood/data/store/OptionOnboardingStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/account/ui/AccountOverviewStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "activeAccountNumberRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "onCreate", "", "onResume", "onAccountSelected", "accountNumber", "Companion", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountOverviewDuxo extends BaseDuxo3<AccountOverviewDataState, AccountOverviewViewState, AccountOverviewEvent> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountMarketValuesLiveStore accountMarketValuesLiveStore;
    private final AccountOverviewStore accountOverviewStore;
    private final AccountProvider accountProvider;
    private final IntPreference accountTabCurrencyPref;
    private final BehaviorRelay<String> activeAccountNumberRelay;
    private final BalancesStore balancesStore;
    private final BrokerageResourceManager brokerageResourceManager;
    private final BuildAccountOverviewRhdDataStateUseCase buildAccountOverviewRhdDataState;
    private final DripSettingsStore dripSettingsStore;
    private final ExperimentsStore experimentsStore;
    private final InstantDepositsCardStore instantDepositsCardStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final MarginEligibilityStore marginEligibilityStore;
    private final MarginInvestingInfoStore marginInvestingInfoStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final Markwon markwon;
    private final OptionOnboardingStore optionOnboardingStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final SlipHubCardStore slipHubCardStore;
    private final SlipStatusStore slipStatusStore;
    private final SweepInterestContextFactory sweepInterestContextFactory;
    private final UnifiedAccountStore unifiedAccountStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountOverviewDuxo(AccountProvider accountProvider, AccountOverviewStore accountOverviewStore, BalancesStore balancesStore, BrokerageResourceManager brokerageResourceManager, DripSettingsStore dripSettingsStore, InstantDepositsCardStore instantDepositsCardStore, TraderInvestmentScheduleStore investmentScheduleStore, LeveredMarginSettingsStore marginSettingsStore, MarginEligibilityStore marginEligibilityStore, Markwon markwon, SlipHubCardStore slipHubCardStore, SlipStatusStore slipStatusStore, SweepInterestContextFactory sweepInterestContextFactory, UnifiedAccountStore unifiedAccountStore, RegionGateProvider regionGateProvider, UserStore userStore, AccountAccessStore accountAccessStore, AccountMarketValuesLiveStore accountMarketValuesLiveStore, BuildAccountOverviewRhdDataStateUseCase buildAccountOverviewRhdDataState, OptionOnboardingStore optionOnboardingStore, ExperimentsStore experimentsStore, MarginInvestingInfoStore marginInvestingInfoStore, @DisplayCurrencySelectionPrefs IntPreference accountTabCurrencyPref, AccountOverviewStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AccountOverviewDataState(null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -1, 7, null), stateProvider, duxoBundle);
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
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<String> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.activeAccountNumberRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        String accountNumber = ((LegacyFragmentKey.AccountOverview) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber != null) {
            this.activeAccountNumberRelay.accept(accountNumber);
        } else {
            Single<String> singleFirstOrError = this.accountProvider.streamIndividualAccountNumber().firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C81941(this.activeAccountNumberRelay), new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountOverviewDuxo.onCreate$lambda$0(this.f$0, (Throwable) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onCreate$lambda$1(this.f$0, (User) obj);
            }
        });
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C81954(null));
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, OptionsRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null);
        Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Experiments.OptionsKnowledgeCheckM1Experiment.INSTANCE}, false, null, 6, null);
        Flow flowStreamStateFlow$default2 = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Experiments.OptionsInJointAccountPreSetupExperiment.INSTANCE}, false, null, 6, null);
        Flow flowStreamStateFlow$default3 = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{Experiments.OptionsLevel3EntryPointOptionSettings.INSTANCE}, false, null, 6, null);
        final Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null);
        Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default2.collect(new C81832(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$$inlined$map$1$2 */
            public static final class C81832<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AccountOverviewDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$$inlined$map$1$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {51, 52, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    boolean Z$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C81832.this.emit(null, this);
                    }
                }

                public C81832(FlowCollector flowCollector, AccountOverviewDuxo accountOverviewDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = accountOverviewDuxo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
                
                    if (r1.emit(r11, r4) != r0) goto L35;
                 */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    FlowCollector flowCollector2;
                    boolean z;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    Object obj2 = anonymousClass12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass12.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector3 = this.$this_unsafeFlow;
                        String str = (String) obj;
                        AccountProvider accountProvider = this.this$0.accountProvider;
                        Intrinsics.checkNotNull(str);
                        anonymousClass12.L$0 = flowCollector3;
                        anonymousClass12.label = 1;
                        Object accountForced = accountProvider.getAccountForced(str, anonymousClass12);
                        if (accountForced != coroutine_suspended) {
                            obj2 = accountForced;
                            flowCollector = flowCollector3;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 == 1) {
                        flowCollector = (FlowCollector) anonymousClass12.L$0;
                        ResultKt.throwOnFailure(obj2);
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        z = anonymousClass12.Z$0;
                        flowCollector2 = (FlowCollector) anonymousClass12.L$0;
                        ResultKt.throwOnFailure(obj2);
                        Boolean boolBoxBoolean = boxing.boxBoolean(!z && ((Boolean) obj2).booleanValue());
                        anonymousClass12.L$0 = null;
                        anonymousClass12.label = 3;
                    }
                    boolean zIsCustodial = ((Account) obj2).getBrokerageAccountType().isCustodial();
                    RegionGateProvider regionGateProvider = this.this$0.regionGateProvider;
                    CustodialRegionOrExperimentGate custodialRegionOrExperimentGate = CustodialRegionOrExperimentGate.INSTANCE;
                    anonymousClass12.L$0 = flowCollector;
                    anonymousClass12.Z$0 = zIsCustodial;
                    anonymousClass12.label = 2;
                    Object regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, custodialRegionOrExperimentGate, false, anonymousClass12, 2, null);
                    if (regionGateState$default != coroutine_suspended) {
                        flowCollector2 = flowCollector;
                        z = zIsCustodial;
                        obj2 = regionGateState$default;
                        Boolean boolBoxBoolean2 = boxing.boxBoolean(!z && ((Boolean) obj2).booleanValue());
                        anonymousClass12.L$0 = null;
                        anonymousClass12.label = 3;
                    }
                    return coroutine_suspended;
                }
            }
        };
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C81965(FlowKt.combine(flowBuffer$default, flowStreamStateFlow$default, flowStreamStateFlow$default2, flowStreamStateFlow$default3, flow, new AccountOverviewDuxo$onCreate$shouldPollForPendingSection$1(null)), flowStreamStateFlow$default, flowStreamStateFlow$default2, flowStreamStateFlow$default3, flow, null));
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$1 */
    /* synthetic */ class C81941 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C81941(Object obj) {
            super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BehaviorRelay) this.receiver).accept(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(AccountOverviewDuxo accountOverviewDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        accountOverviewDuxo.submit(new AccountOverviewEvent.Error(t));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AccountOverviewDuxo accountOverviewDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onCreate$3$1(user, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4 */
    static final class C81954 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C81954(Continuation<? super C81954> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C81954 c81954 = AccountOverviewDuxo.this.new C81954(continuation);
            c81954.L$0 = obj;
            return c81954;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C81954) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowConnectWhen$default = Operators.connectWhen$default(Context7.buffer$default(RxConvert.asFlow(this.this$0.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{MultipleIndividualAccountsExperiment.INSTANCE}, false, null, 6, null), null, 2, null);
                    final AccountOverviewDuxo accountOverviewDuxo = this.this$0;
                    Flow<GetMultiAccountEligibilityResponseDto> flow = new Flow<GetMultiAccountEligibilityResponseDto>() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super GetMultiAccountEligibilityResponseDto> flowCollector, Continuation continuation) {
                            Object objCollect = flowConnectWhen$default.collect(new C81842(flowCollector, accountOverviewDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1$2 */
                        public static final class C81842<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AccountOverviewDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {54, 50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C81842.this.emit(null, this);
                                }
                            }

                            public C81842(FlowCollector flowCollector, AccountOverviewDuxo accountOverviewDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = accountOverviewDuxo;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
                            
                                if (r8.emit(r9, r0) != r1) goto L36;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                Throwable th;
                                FlowCollector flowCollector;
                                Object objM28550constructorimpl;
                                FlowCollector flowCollector2;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector3 = this.$this_unsafeFlow;
                                    String str = (String) obj;
                                    try {
                                        Result.Companion companion = Result.INSTANCE;
                                        MarginEligibilityStore marginEligibilityStore = this.this$0.marginEligibilityStore;
                                        Intrinsics.checkNotNull(str);
                                        MultiAccountEligibilityContextDto multiAccountEligibilityContextDto = MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD;
                                        anonymousClass1.L$0 = flowCollector3;
                                        anonymousClass1.label = 1;
                                        Object multiAccountMarginEligibility = marginEligibilityStore.getMultiAccountMarginEligibility(str, multiAccountEligibilityContextDto, anonymousClass1);
                                        if (multiAccountMarginEligibility != coroutine_suspended) {
                                            obj2 = multiAccountMarginEligibility;
                                            flowCollector = flowCollector3;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        flowCollector = flowCollector3;
                                        Throwables.rethrowIfNotNetworkRelated(th);
                                        Result.Companion companion2 = Result.INSTANCE;
                                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                                        flowCollector2 = flowCollector;
                                        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                                        }
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj2);
                                    flowCollector = flowCollector;
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwables.rethrowIfNotNetworkRelated(th);
                                    Result.Companion companion22 = Result.INSTANCE;
                                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                                    flowCollector2 = flowCollector;
                                    if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                                    }
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                }
                                objM28550constructorimpl = Result.m28550constructorimpl((GetMultiAccountEligibilityResponseDto) obj2);
                                flowCollector2 = flowCollector;
                                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                                    objM28550constructorimpl = null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GetMultiAccountEligibilityResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(getMultiAccountEligibilityResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C495131 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ GetMultiAccountEligibilityResponseDto $marginEligibility;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495131(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super C495131> continuation) {
                        super(2, continuation);
                        this.$marginEligibility = getMultiAccountEligibilityResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495131 c495131 = new C495131(this.$marginEligibility, continuation);
                        c495131.L$0 = obj;
                        return c495131;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((C495131) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, this.$marginEligibility, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -65, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495131((GetMultiAccountEligibilityResponseDto) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AccountOverviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AccountOverviewDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowConnectWhen$default = Operators.connectWhen$default(Context7.buffer$default(RxConvert.asFlow(this.this$0.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{MultipleIndividualAccountsExperiment.INSTANCE}, false, null, 6, null), null, 2, null);
                    final AccountOverviewDuxo accountOverviewDuxo = this.this$0;
                    Flow<GetMultiAccountEligibilityResponseDto> flow = new Flow<GetMultiAccountEligibilityResponseDto>() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super GetMultiAccountEligibilityResponseDto> flowCollector, Continuation continuation) {
                            Object objCollect = flowConnectWhen$default.collect(new C81852(flowCollector, accountOverviewDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C81852<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AccountOverviewDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$invokeSuspend$$inlined$map$1$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {54, 50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C81852.this.emit(null, this);
                                }
                            }

                            public C81852(FlowCollector flowCollector, AccountOverviewDuxo accountOverviewDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = accountOverviewDuxo;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
                            
                                if (r8.emit(r9, r0) != r1) goto L36;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                Throwable th;
                                FlowCollector flowCollector;
                                Object objM28550constructorimpl;
                                FlowCollector flowCollector2;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector3 = this.$this_unsafeFlow;
                                    String str = (String) obj;
                                    try {
                                        Result.Companion companion = Result.INSTANCE;
                                        MarginEligibilityStore marginEligibilityStore = this.this$0.marginEligibilityStore;
                                        Intrinsics.checkNotNull(str);
                                        MultiAccountEligibilityContextDto multiAccountEligibilityContextDto = MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS;
                                        anonymousClass1.L$0 = flowCollector3;
                                        anonymousClass1.label = 1;
                                        Object multiAccountMarginEligibility = marginEligibilityStore.getMultiAccountMarginEligibility(str, multiAccountEligibilityContextDto, anonymousClass1);
                                        if (multiAccountMarginEligibility != coroutine_suspended) {
                                            obj2 = multiAccountMarginEligibility;
                                            flowCollector = flowCollector3;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        flowCollector = flowCollector3;
                                        Throwables.rethrowIfNotNetworkRelated(th);
                                        Result.Companion companion2 = Result.INSTANCE;
                                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                                        flowCollector2 = flowCollector;
                                        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                                        }
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj2);
                                    flowCollector = flowCollector;
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwables.rethrowIfNotNetworkRelated(th);
                                    Result.Companion companion22 = Result.INSTANCE;
                                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                                    flowCollector2 = flowCollector;
                                    if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                                    }
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                }
                                objM28550constructorimpl = Result.m28550constructorimpl((GetMultiAccountEligibilityResponseDto) obj2);
                                flowCollector2 = flowCollector;
                                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                                    objM28550constructorimpl = null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }
                    };
                    C495142 c495142 = new C495142(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c495142, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountTypeEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$2, reason: invalid class name and collision with other inner class name */
            static final class C495142 extends ContinuationImpl7 implements Function2<GetMultiAccountEligibilityResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495142(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super C495142> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495142 c495142 = new C495142(this.this$0, continuation);
                    c495142.L$0 = obj;
                    return c495142;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super Unit> continuation) {
                    return ((C495142) create(getMultiAccountEligibilityResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$4$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ GetMultiAccountEligibilityResponseDto $accountTypeEligibility;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$accountTypeEligibility = getMultiAccountEligibilityResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountTypeEligibility, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, this.$accountTypeEligibility, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -129, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((GetMultiAccountEligibilityResponseDto) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5 */
    static final class C81965 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $isInOptionsInJointAccountPreSetupExperiment;
        final /* synthetic */ Flow<Boolean> $isInOptionsKnowledgeCheckExperiment;
        final /* synthetic */ Flow<Boolean> $isInOptionsLevel3EntryPointOptionsSettingsExperiment;
        final /* synthetic */ Flow<Boolean> $shouldPollForPendingSection;
        final /* synthetic */ Flow<Boolean> $showOptionsCardForced;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C81965(Flow<Boolean> flow, Flow<Boolean> flow2, Flow<Boolean> flow3, Flow<Boolean> flow4, Flow<Boolean> flow5, Continuation<? super C81965> continuation) {
            super(2, continuation);
            this.$shouldPollForPendingSection = flow;
            this.$isInOptionsKnowledgeCheckExperiment = flow2;
            this.$isInOptionsInJointAccountPreSetupExperiment = flow3;
            this.$isInOptionsLevel3EntryPointOptionsSettingsExperiment = flow4;
            this.$showOptionsCardForced = flow5;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C81965 c81965 = AccountOverviewDuxo.this.new C81965(this.$shouldPollForPendingSection, this.$isInOptionsKnowledgeCheckExperiment, this.$isInOptionsInJointAccountPreSetupExperiment, this.$isInOptionsLevel3EntryPointOptionsSettingsExperiment, this.$showOptionsCardForced, continuation);
            c81965.L$0 = obj;
            return c81965;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C81965) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $isInOptionsKnowledgeCheckExperiment;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<Boolean> flow, AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isInOptionsKnowledgeCheckExperiment = flow;
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$isInOptionsKnowledgeCheckExperiment, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$isInOptionsKnowledgeCheckExperiment;
                    C495151 c495151 = new C495151(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c495151, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$1$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495151 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495151(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super C495151> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495151 c495151 = new C495151(this.this$0, continuation);
                    c495151.Z$0 = ((Boolean) obj).booleanValue();
                    return c495151;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C495151) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$1$1$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495161 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495161(boolean z, Continuation<? super C495161> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495161 c495161 = new C495161(this.$inExperiment, continuation);
                        c495161.L$0 = obj;
                        return c495161;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((C495161) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, this.$inExperiment, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -524289, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495161(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$isInOptionsKnowledgeCheckExperiment, AccountOverviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$isInOptionsInJointAccountPreSetupExperiment, AccountOverviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$isInOptionsLevel3EntryPointOptionsSettingsExperiment, AccountOverviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.$showOptionsCardForced, AccountOverviewDuxo.this, null), 3, null);
                SharedFlow sharedFlowShareIn$default = Share3.shareIn$default(Operators.connectWhen$default(FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(AccountOverviewDuxo.this.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null), new C8187x45cb323c(null, AccountOverviewDuxo.this)), this.$shouldPollForPendingSection, null, 2, null), AccountOverviewDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 0, 4, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(sharedFlowShareIn$default, AccountOverviewDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(AccountOverviewDuxo.this, sharedFlowShareIn$default, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(AccountOverviewDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $isInOptionsInJointAccountPreSetupExperiment;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<Boolean> flow, AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$isInOptionsInJointAccountPreSetupExperiment = flow;
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$isInOptionsInJointAccountPreSetupExperiment, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$isInOptionsInJointAccountPreSetupExperiment;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$2$1$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495171 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495171(boolean z, Continuation<? super C495171> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495171 c495171 = new C495171(this.$inExperiment, continuation);
                        c495171.L$0 = obj;
                        return c495171;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((C495171) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, this.$inExperiment, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -262145, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495171(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$3", m3645f = "AccountOverviewDuxo.kt", m3646l = {239}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $isInOptionsLevel3EntryPointOptionsSettingsExperiment;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<Boolean> flow, AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$isInOptionsLevel3EntryPointOptionsSettingsExperiment = flow;
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$isInOptionsLevel3EntryPointOptionsSettingsExperiment, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$isInOptionsLevel3EntryPointOptionsSettingsExperiment;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$3$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$3$1$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495181 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495181(boolean z, Continuation<? super C495181> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495181 c495181 = new C495181(this.$inExperiment, continuation);
                        c495181.L$0 = obj;
                        return c495181;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((C495181) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, this.$inExperiment, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -1048577, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495181(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$4", m3645f = "AccountOverviewDuxo.kt", m3646l = {250}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $showOptionsCardForced;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Flow<Boolean> flow, AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$showOptionsCardForced = flow;
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$showOptionsCardForced, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$showOptionsCardForced;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showOptionsCard", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$4$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$4$1$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495191 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ boolean $showOptionsCard;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495191(boolean z, Continuation<? super C495191> continuation) {
                        super(2, continuation);
                        this.$showOptionsCard = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495191 c495191 = new C495191(this.$showOptionsCard, continuation);
                        c495191.L$0 = obj;
                        return c495191;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((C495191) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, this.$showOptionsCard, null, null, false, Integer.MAX_VALUE, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495191(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$5", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<OptionsStatus> $optionsStatusFlow;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(SharedFlow<? extends OptionsStatus> sharedFlow, AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$optionsStatusFlow = sharedFlow;
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$optionsStatusFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<OptionsStatus> sharedFlow = this.$optionsStatusFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionsPendingSectionState", "Lcom/robinhood/models/db/OptionsStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$5$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsStatus, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsStatus optionsStatus, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optionsStatus, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$5$1$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495201 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ OptionsStatus $optionsPendingSectionState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495201(OptionsStatus optionsStatus, Continuation<? super C495201> continuation) {
                        super(2, continuation);
                        this.$optionsPendingSectionState = optionsStatus;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495201 c495201 = new C495201(this.$optionsPendingSectionState, continuation);
                        c495201.L$0 = obj;
                        return c495201;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((C495201) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, this.$optionsPendingSectionState, false, null, null, false, -1073741825, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495201((OptionsStatus) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<OptionsStatus> $optionsStatusFlow;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass6(AccountOverviewDuxo accountOverviewDuxo, SharedFlow<? extends OptionsStatus> sharedFlow, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
                this.$optionsStatusFlow = sharedFlow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$optionsStatusFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null);
                    final SharedFlow<OptionsStatus> sharedFlow = this.$optionsStatusFlow;
                    Flow flowConnectWhen$default = Operators.connectWhen$default(FlowKt.combine(flowBuffer$default, FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new C81862(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$invokeSuspend$$inlined$map$1$2 */
                        public static final class C81862<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$invokeSuspend$$inlined$map$1$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C81862.this.emit(null, this);
                                }
                            }

                            public C81862(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Boolean boolBoxBoolean = boxing.boxBoolean(CollectionsKt.contains(SetsKt.setOf((Object[]) new OptionsStatus[]{OptionsStatus.PENDING_APPOINTMENT_SCHEDULED, OptionsStatus.L2_PENDING_APPOINTMENT_SCHEDULED}), (OptionsStatus) obj));
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }), new AnonymousClass2(this.this$0, null)), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{Experiments.OptionsKnowledgeCheckM1Experiment.INSTANCE}, false, null, 6, null), null, 2, null);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/AppointmentData;", "accountNumber", "", "kotlin.jvm.PlatformType", "isAppointmentScheduled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<String, Boolean, Continuation<? super AppointmentData>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(String str, Boolean bool, Continuation<? super AppointmentData> continuation) {
                    return invoke(str, bool.booleanValue(), continuation);
                }

                public final Object invoke(String str, boolean z, Continuation<? super AppointmentData> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = str;
                    anonymousClass2.Z$0 = z;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        String str = (String) this.L$0;
                        if (!this.Z$0) {
                            return null;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, str, null);
                        this.label = 1;
                        obj = RetryOnError.runCatchingNetworkExceptionsWithRetryExponential(3, anonymousClass1, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (AppointmentData) obj;
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/AppointmentData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super AppointmentData>, Object> {
                    final /* synthetic */ String $accountNumber;
                    int label;
                    final /* synthetic */ AccountOverviewDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                        super(1, continuation);
                        this.this$0 = accountOverviewDuxo;
                        this.$accountNumber = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$accountNumber, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Continuation<? super AppointmentData> continuation) {
                        return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionOnboardingStore optionOnboardingStore = this.this$0.optionOnboardingStore;
                        String str = this.$accountNumber;
                        Intrinsics.checkNotNull(str);
                        this.label = 1;
                        Object appointmentData = optionOnboardingStore.getAppointmentData(str, this);
                        return appointmentData == coroutine_suspended ? coroutine_suspended : appointmentData;
                    }
                }
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "appointmentData", "Lcom/robinhood/models/db/AppointmentData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$3", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<AppointmentData, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AppointmentData appointmentData, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(appointmentData, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$3$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$6$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ AppointmentData $appointmentData;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AppointmentData appointmentData, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$appointmentData = appointmentData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$appointmentData, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        AccountOverviewDataState accountOverviewDataState = (AccountOverviewDataState) this.L$0;
                        AppointmentData appointmentData = this.$appointmentData;
                        return AccountOverviewDataState.copy$default(accountOverviewDataState, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, appointmentData != null ? appointmentData.getAppointmentId() : null, null, false, -1, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((AppointmentData) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$7", m3645f = "AccountOverviewDuxo.kt", m3646l = {302}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$7$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AccountOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$7$1$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onCreate$5$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495211 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                    final /* synthetic */ boolean $isMember;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495211(boolean z, Continuation<? super C495211> continuation) {
                        super(2, continuation);
                        this.$isMember = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495211 c495211 = new C495211(this.$isMember, continuation);
                        c495211.L$0 = obj;
                        return c495211;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                        return ((C495211) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, this.$isMember, -1, 3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495211(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.accountProvider.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(this.accountProvider.streamAllSelfDirectedAccounts(), this.accountProvider.streamAllManagedAccounts()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
        BehaviorRelay<String> behaviorRelay = this.activeAccountNumberRelay;
        final AccountProvider accountProvider = this.accountProvider;
        Observable observableRefCount = behaviorRelay.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$accountObservable$1
            @Override // io.reactivex.functions.Function
            public final Observable<Account> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return accountProvider.streamAccount(p0);
            }
        }).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$4(this.f$0, (Account) obj);
            }
        });
        Observable<R> observableSwitchMap = this.activeAccountNumberRelay.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Unit> apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AccountOverviewDuxo accountOverviewDuxo = AccountOverviewDuxo.this;
                return accountOverviewDuxo.asObservable(accountOverviewDuxo.balancesStore.pollAccount(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_OVERVIEW_LOAD_BALANCES, true);
        Observable observableSwitchMap2 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UnifiedBalances> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                BalancesStore.refreshAccount$default(AccountOverviewDuxo.this.balancesStore, account.getAccountNumber(), false, 2, null);
                AccountOverviewDuxo accountOverviewDuxo = AccountOverviewDuxo.this;
                return accountOverviewDuxo.asObservable(accountOverviewDuxo.balancesStore.streamSelectedAccountUnifiedBalances(account));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$5(this.f$0, (UnifiedBalances) obj);
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_OVERVIEW_LOAD_UNIFIED_ACCOUNT, true);
        UnifiedAccountStore.refresh$default(this.unifiedAccountStore, false, 1, null);
        BehaviorRelay<String> behaviorRelay2 = this.activeAccountNumberRelay;
        final UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore;
        Observable<R> observableSwitchMap3 = behaviorRelay2.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final Observable<Optional<UnifiedAccountV2>> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return unifiedAccountStore.streamAccount(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(observableSwitchMap3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$6(this.f$0, (UnifiedAccountV2) obj);
            }
        });
        Observable<R> observableSwitchMap4 = this.activeAccountNumberRelay.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.8

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/models/accountoverview/db/DayTradeCard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$8$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {382, 382}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Produce4<? super DayTradeCard>, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $accountNumber;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AccountOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountOverviewDuxo accountOverviewDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = accountOverviewDuxo;
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$accountNumber, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Produce4<? super DayTradeCard> produce4, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
                
                    if (r1.send(r6, r5) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Produce4 produce4;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        produce4 = (Produce4) this.L$0;
                        AccountOverviewStore accountOverviewStore = this.this$0.accountOverviewStore;
                        String str = this.$accountNumber;
                        Intrinsics.checkNotNull(str);
                        this.L$0 = produce4;
                        this.label = 1;
                        obj = accountOverviewStore.getDayTradeCard(str, this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    produce4 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 2;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DayTradeCard> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                AccountOverviewDuxo accountOverviewDuxo = AccountOverviewDuxo.this;
                return RxFactory.DefaultImpls.rxObservable$default(accountOverviewDuxo, null, new AnonymousClass1(accountOverviewDuxo, accountNumber, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$7(this.f$0, (DayTradeCard) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$8(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C819711(null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.RESUMED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C819812(null));
        Observable observable = this.brokerageResourceManager.loadResource(BrokerageOtherMarkdown.DAY_TRADE).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$9(this.f$0, (OtherMarkdown) obj);
            }
        });
        Observable map = this.activeAccountNumberRelay.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.14
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<InvestmentSchedule>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                AccountOverviewDuxo.this.investmentScheduleStore.refreshAccount(false, accountNumber);
                return AccountOverviewDuxo.this.investmentScheduleStore.getStreamAccountInvestmentSchedules().asObservable(accountNumber);
            }
        }).map(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.15
            @Override // io.reactivex.functions.Function
            public final List<InvestmentSchedule> apply(List<InvestmentSchedule> schedules) {
                Intrinsics.checkNotNullParameter(schedules, "schedules");
                ArrayList arrayList = new ArrayList();
                for (T t : schedules) {
                    if (!((InvestmentSchedule) t).isBrokerageCashTransfer()) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(map, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null), null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$10(this.f$0, (List) obj);
            }
        });
        Observable<R> observableSwitchMapSingle = this.activeAccountNumberRelay.switchMapSingle(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.17
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends DripSettingsStore.DripCardType> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return AccountOverviewDuxo.this.dripSettingsStore.getDripCardType(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$11(this.f$0, (DripSettingsStore.DripCardType) obj);
            }
        });
        Observable<R> observableSwitchMap5 = this.activeAccountNumberRelay.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.19
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                AccountOverviewDuxo accountOverviewDuxo = AccountOverviewDuxo.this;
                final Flow<DripEligibility> flowStreamDripOnboardingEligibility = accountOverviewDuxo.dripSettingsStore.streamDripOnboardingEligibility(accountNumber);
                return accountOverviewDuxo.asObservable(new Flow<Boolean>() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$19$apply$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamDripOnboardingEligibility.collect(new C81902(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$19$apply$$inlined$map$1$2 */
                    public static final class C81902<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$19$apply$$inlined$map$1$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$19$apply$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C81902.this.emit(null, this);
                            }
                        }

                        public C81902(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Boolean boolBoxBoolean = boxing.boxBoolean(((DripEligibility) obj) instanceof DripEligibility.AlreadyOnboarded);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap5, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$12(this.f$0, (Boolean) obj);
            }
        });
        Observable<R> observableSwitchMap6 = this.activeAccountNumberRelay.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.21
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<SlipHubCard>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return AccountOverviewDuxo.this.slipHubCardStore.streamHubCard(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap6, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMap6, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, SlipRegionGate.INSTANCE, false, 2, null), null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$13(this.f$0, (Optional) obj);
            }
        });
        Observable<R> observableSwitchMap7 = this.activeAccountNumberRelay.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.23
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                AccountOverviewDuxo.this.slipStatusStore.refreshSlipAccountsStatusResponse(false);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.24
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<SlipEnabledResponse>> apply(final String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                AccountOverviewDuxo accountOverviewDuxo = AccountOverviewDuxo.this;
                return accountOverviewDuxo.asObservable(accountOverviewDuxo.slipStatusStore.streamAccountsStatus()).map(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.24.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<SlipEnabledResponse> apply(List<SlipEnabledResponse> statuses) {
                        Object next;
                        Intrinsics.checkNotNullParameter(statuses, "statuses");
                        String str = accountNumber;
                        Iterator<T> it = statuses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(((SlipEnabledResponse) next).getAccountNumber(), str)) {
                                break;
                            }
                        }
                        return Optional3.asOptional(next);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap7, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap7, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$14(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(Operators.toOptionals(this.buildAccountOverviewRhdDataState.invoke(Context7.buffer$default(RxConvert.asFlow(this.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null)))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$15(this.f$0, (Optional) obj);
            }
        });
        Observable observableSwitchMapSingle2 = observableRefCount.switchMapSingle(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.27
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Disclosure> apply(Account account) {
                BrokerageDisclosure brokerageDisclosure;
                Intrinsics.checkNotNullParameter(account, "account");
                if (account.isManaged()) {
                    brokerageDisclosure = BrokerageDisclosure.ADVISORY_CASH;
                } else {
                    brokerageDisclosure = BrokerageDisclosure.CASH_SWEEP_INTEREST_EARNING_DISCLOSURE;
                }
                return AccountOverviewDuxo.this.brokerageResourceManager.loadResource(brokerageDisclosure);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle2, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$16(this.f$0, (Disclosure) obj);
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_OVERVIEW_LOAD_SWEEP_SECTION, true);
        Observable<R> observableSwitchMap8 = this.activeAccountNumberRelay.distinctUntilChanged().doOnNext(new Consumer() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.29

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$29$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$29$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                    return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -8193, 7, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(String str) {
                AccountOverviewDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.30
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<SweepEnrollmentData>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return AccountOverviewDuxo.this.sweepInterestContextFactory.getSweepEnrollmentData(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap8, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap8, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$17(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.brokerageResourceManager.loadResource(BrokerageOtherMarkdown.LIMITED_MARGIN_RISK), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$18(this.f$0, (OtherMarkdown) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C821033(null));
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, InstantDepositRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$19(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$20(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> observableSwitchMap9 = this.activeAccountNumberRelay.switchMap(new Function() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo.onResume.36
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CardOrder> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return AccountOverviewDuxo.this.accountOverviewStore.streamCardOrder(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap9, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap9, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$21(this.f$0, (CardOrder) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewDuxo.onResume$lambda$22(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C821239(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C821440(observableRefCount, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C821541(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(AccountOverviewDuxo accountOverviewDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$1$1((List) tuples2.component1(), (List) tuples2.component2(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(AccountOverviewDuxo accountOverviewDuxo, Account account) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$2$1(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(AccountOverviewDuxo accountOverviewDuxo, UnifiedBalances unifiedBalances) {
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_OVERVIEW_LOAD_BALANCES, false);
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$5$1(unifiedBalances, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(AccountOverviewDuxo accountOverviewDuxo, UnifiedAccountV2 unifiedAccount) {
        Intrinsics.checkNotNullParameter(unifiedAccount, "unifiedAccount");
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$7$1(unifiedAccount, null));
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_OVERVIEW_LOAD_UNIFIED_ACCOUNT, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(AccountOverviewDuxo accountOverviewDuxo, DayTradeCard dayTradeCard) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$9$1(dayTradeCard, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(AccountOverviewDuxo accountOverviewDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        accountOverviewDuxo.submit(new AccountOverviewEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11", m3645f = "AccountOverviewDuxo.kt", m3646l = {408}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11 */
    static final class C819711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C819711(Continuation<? super C819711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewDuxo.this.new C819711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C819711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(AccountOverviewDuxo.this.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null), new C8188x650294dc(null, AccountOverviewDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(AccountOverviewDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instantCard", "Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InstantDepositCard, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstantDepositCard instantDepositCard, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(instantDepositCard, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$11$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                final /* synthetic */ InstantDepositCard $instantCard;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstantDepositCard instantDepositCard, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$instantCard = instantDepositCard;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instantCard, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                    return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, this.$instantCard, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -131073, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((InstantDepositCard) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$12", m3645f = "AccountOverviewDuxo.kt", m3646l = {419, CompanyFinancialsSection.BAR_ANIMATION_DURATION}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$12 */
    static final class C819812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C819812(Continuation<? super C819812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewDuxo.this.new C819812(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C819812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r11, r1, r10) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C819812 c819812;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RegionGateProvider regionGateProvider = AccountOverviewDuxo.this.regionGateProvider;
                LeveredMarginRegionGate leveredMarginRegionGate = LeveredMarginRegionGate.INSTANCE;
                this.label = 1;
                c819812 = this;
                obj = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, leveredMarginRegionGate, false, c819812, 2, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c819812 = this;
            if (((Boolean) obj).booleanValue()) {
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(AccountOverviewDuxo.this.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null), new C8189xbc2085bb(null, AccountOverviewDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(AccountOverviewDuxo.this, null);
                c819812.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$12$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$12$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginSettings, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginSettings marginSettings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(marginSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$12$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$12$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                final /* synthetic */ MarginSettings $marginSettings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MarginSettings marginSettings, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$marginSettings = marginSettings;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$marginSettings, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                    return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, this.$marginSettings, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, null, false, -33, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((MarginSettings) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(AccountOverviewDuxo accountOverviewDuxo, OtherMarkdown otherMarkdown) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$13$1(accountOverviewDuxo, otherMarkdown, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(AccountOverviewDuxo accountOverviewDuxo, List list) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$16$1(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(AccountOverviewDuxo accountOverviewDuxo, DripSettingsStore.DripCardType dripCardType) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$18$1(dripCardType, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(AccountOverviewDuxo accountOverviewDuxo, Boolean bool) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$20$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(AccountOverviewDuxo accountOverviewDuxo, Optional optional) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$22$1((SlipHubCard) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(AccountOverviewDuxo accountOverviewDuxo, Optional optional) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$25$1(optional, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(AccountOverviewDuxo accountOverviewDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$26$1((RhdAccountDataState) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(AccountOverviewDuxo accountOverviewDuxo, Disclosure disclosure) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$28$1(disclosure, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(AccountOverviewDuxo accountOverviewDuxo, Optional optional) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$31$1((SweepEnrollmentData) optional.component1(), null));
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACCOUNT_OVERVIEW_LOAD_SWEEP_SECTION, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(AccountOverviewDuxo accountOverviewDuxo, OtherMarkdown content) {
        Intrinsics.checkNotNullParameter(content, "content");
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$32$1(content, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$33", m3645f = "AccountOverviewDuxo.kt", m3646l = {583}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$33 */
    static final class C821033 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C821033(Continuation<? super C821033> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewDuxo.this.new C821033(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C821033) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BrokerageResourceManager brokerageResourceManager = AccountOverviewDuxo.this.brokerageResourceManager;
                BrokerageDisclosure brokerageDisclosure = BrokerageDisclosure.MCW_CASH_EXPLAINER;
                this.label = 1;
                obj = brokerageResourceManager.loadResourceSuspend(brokerageDisclosure, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AccountOverviewDuxo.this.applyMutation(new AnonymousClass1((Disclosure) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$33$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$33$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
            final /* synthetic */ Disclosure $content;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Disclosure disclosure, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = disclosure;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, this.$content, null, null, null, false, null, null, false, -134217729, 7, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$19(AccountOverviewDuxo accountOverviewDuxo, boolean z) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$34$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$20(AccountOverviewDuxo accountOverviewDuxo, boolean z) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$35$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$21(AccountOverviewDuxo accountOverviewDuxo, CardOrder cardOrder) {
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$37$1(cardOrder, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$22(AccountOverviewDuxo accountOverviewDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        accountOverviewDuxo.applyMutation(new AccountOverviewDuxo$onResume$38$1(null));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39", m3645f = "AccountOverviewDuxo.kt", m3646l = {635}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39 */
    static final class C821239 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C821239(Continuation<? super C821239> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewDuxo.this.new C821239(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C821239) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(AccountOverviewDuxo.this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null), Context7.buffer$default(RxConvert.asFlow(AccountOverviewDuxo.this.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(DisplayCurrencyExtensions.displayCurrencyObservable(AccountOverviewDuxo.this.accountTabCurrencyPref)), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)), new C8191x373271d6(null, AccountOverviewDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(AccountOverviewDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "isMcwEnabled", "", "accountNumber", "currency"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<Boolean, String, DisplayCurrency, Continuation<? super Tuples2<? extends String, ? extends DisplayCurrency>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, DisplayCurrency displayCurrency, Continuation<? super Tuples2<? extends String, ? extends DisplayCurrency>> continuation) {
                return invoke(bool.booleanValue(), str, displayCurrency, (Continuation<? super Tuples2<String, ? extends DisplayCurrency>>) continuation);
            }

            public final Object invoke(boolean z, String str, DisplayCurrency displayCurrency, Continuation<? super Tuples2<String, ? extends DisplayCurrency>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z;
                anonymousClass1.L$0 = str;
                anonymousClass1.L$1 = displayCurrency;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                String str = (String) this.L$0;
                DisplayCurrency displayCurrency = (DisplayCurrency) this.L$1;
                if (!z) {
                    displayCurrency = DisplayCurrency.USD;
                }
                return Tuples4.m3642to(str, displayCurrency);
            }
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountMarketValuesLive", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39$3", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<AccountMarketValuesLive, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountMarketValuesLive accountMarketValuesLive, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(accountMarketValuesLive, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39$3$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$39$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                final /* synthetic */ AccountMarketValuesLive $accountMarketValuesLive;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountMarketValuesLive accountMarketValuesLive, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$accountMarketValuesLive = accountMarketValuesLive;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountMarketValuesLive, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                    return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, this.$accountMarketValuesLive, null, null, false, null, null, false, -268435457, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AccountMarketValuesLive) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$40", m3645f = "AccountOverviewDuxo.kt", m3646l = {647}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$40 */
    static final class C821440 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<Account> $accountObservable;
        int label;
        final /* synthetic */ AccountOverviewDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C821440(Observable<Account> observable, AccountOverviewDuxo accountOverviewDuxo, Continuation<? super C821440> continuation) {
            super(2, continuation);
            this.$accountObservable = observable;
            this.this$0 = accountOverviewDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C821440(this.$accountObservable, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C821440) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.$accountObservable), Integer.MAX_VALUE, null, 2, null), new C8192xb3c52500(null, this.this$0));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "features", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$40$2", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$40$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Set<? extends AccountFeature>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Set<? extends AccountFeature> set, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$40$2$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$40$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                final /* synthetic */ Set<AccountFeature> $features;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Set<? extends AccountFeature> set, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$features = set;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$features, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                    return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, this.$features, false, null, null, null, null, false, null, null, false, -33554433, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Set) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41", m3645f = "AccountOverviewDuxo.kt", m3646l = {663}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41 */
    static final class C821541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C821541(Continuation<? super C821541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewDuxo.this.new C821541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C821541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(AccountOverviewDuxo.this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null), Context7.buffer$default(RxConvert.asFlow(AccountOverviewDuxo.this.activeAccountNumberRelay), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(DisplayCurrencyExtensions.displayCurrencyObservable(AccountOverviewDuxo.this.accountTabCurrencyPref)), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)), new C8193xae315df(null, AccountOverviewDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(AccountOverviewDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "isMcwEnabled", "", "accountNumber", "currency"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<Boolean, String, DisplayCurrency, Continuation<? super Tuples2<? extends String, ? extends DisplayCurrency>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, DisplayCurrency displayCurrency, Continuation<? super Tuples2<? extends String, ? extends DisplayCurrency>> continuation) {
                return invoke(bool.booleanValue(), str, displayCurrency, (Continuation<? super Tuples2<String, ? extends DisplayCurrency>>) continuation);
            }

            public final Object invoke(boolean z, String str, DisplayCurrency displayCurrency, Continuation<? super Tuples2<String, ? extends DisplayCurrency>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z;
                anonymousClass1.L$0 = str;
                anonymousClass1.L$1 = displayCurrency;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                String str = (String) this.L$0;
                DisplayCurrency displayCurrency = (DisplayCurrency) this.L$1;
                if (!z) {
                    displayCurrency = DisplayCurrency.USD;
                }
                return Tuples4.m3642to(str, displayCurrency);
            }
        }

        /* compiled from: AccountOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "res", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41$3", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ApiMarginInvestingInfo, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AccountOverviewDuxo accountOverviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = accountOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiMarginInvestingInfo apiMarginInvestingInfo, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(apiMarginInvestingInfo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AccountOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41$3$1", m3645f = "AccountOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.account.ui.AccountOverviewDuxo$onResume$41$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountOverviewDataState, Continuation<? super AccountOverviewDataState>, Object> {
                final /* synthetic */ ApiMarginInvestingInfo $res;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ApiMarginInvestingInfo apiMarginInvestingInfo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$res = apiMarginInvestingInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$res, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AccountOverviewDataState accountOverviewDataState, Continuation<? super AccountOverviewDataState> continuation) {
                    return ((AnonymousClass1) create(accountOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AccountOverviewDataState.copy$default((AccountOverviewDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, false, false, false, false, null, null, null, false, null, null, null, null, false, null, this.$res, false, -1, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ApiMarginInvestingInfo) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onAccountSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.activeAccountNumberRelay.accept(accountNumber);
    }

    /* compiled from: AccountOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/account/ui/AccountOverviewDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AccountOverview;", "<init>", "()V", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountOverviewDuxo, LegacyFragmentKey.AccountOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.AccountOverview getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.AccountOverview) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.AccountOverview getArgs(AccountOverviewDuxo accountOverviewDuxo) {
            return (LegacyFragmentKey.AccountOverview) DuxoCompanion.DefaultImpls.getArgs(this, accountOverviewDuxo);
        }
    }
}
