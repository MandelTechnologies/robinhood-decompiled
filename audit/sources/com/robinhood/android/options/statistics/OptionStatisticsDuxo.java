package com.robinhood.android.options.statistics;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.android.options.statistics.OptionStatisticsFragment;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.prefs.OptionPreTradeSimulatedReturnChartShownPref;
import com.robinhood.librobinhood.data.prefs.OptionPreTradeStatNuxDotShownPref;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnPreTradeStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lists.quickadd.extensions.OptionInstruments3;
import com.robinhood.utils.Optional;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionStatisticsDuxo.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001.B\u0085\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0016J\u0006\u0010*\u001a\u00020'J\u0006\u0010+\u001a\u00020'J\u0006\u0010,\u001a\u00020'J\u0006\u0010-\u001a\u00020'R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;", "Lcom/robinhood/android/options/statistics/OptionStatisticsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionSimulatedReturnPreTradeStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "optionPreTradeSimulatedReturnChartShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "optionPreTradeStatNuxDotShownPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/options/statistics/OptionStatisticsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/options/statistics/OptionStatisticsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "onDestroy", "logSwipeDismiss", "logTrade", "onPreTradeSimulatedReturnShown", "onSimulatedReturnSegmentTapped", "Companion", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionStatisticsDuxo extends BaseDuxo<OptionStatisticsDataState, OptionStatisticsViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final EventLogger eventLogger;
    private final OptionChainStore optionChainStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final BooleanPreference optionPreTradeSimulatedReturnChartShownPref;
    private final BooleanPreference optionPreTradeStatNuxDotShownPref;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final PerformanceLogger performanceLogger;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionStatisticsDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, EventLogger eventLogger, PerformanceLogger performanceLogger, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionsWatchlistStore optionsWatchlistStore, OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore, @OptionPreTradeSimulatedReturnChartShownPref BooleanPreference optionPreTradeSimulatedReturnChartShownPref, @OptionPreTradeStatNuxDotShownPref BooleanPreference optionPreTradeStatNuxDotShownPref, SavedStateHandle savedStateHandle, OptionStatisticsStateProvider stateProvider, DuxoBundle duxoBundle) {
        String longStrategyCode;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
        Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
        Intrinsics.checkNotNullParameter(optionPreTradeStatNuxDotShownPref, "optionPreTradeStatNuxDotShownPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        OptionOrderIntentKey optionOrderIntentKey = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionOrderIntentKey();
        String initialAccountNumber = optionOrderIntentKey != null ? optionOrderIntentKey.getInitialAccountNumber() : null;
        OptionOrderIntentKey optionOrderIntentKey2 = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionOrderIntentKey();
        OptionSettings.DefaultPricingSetting defaultPricingSettingOverride = optionOrderIntentKey2 instanceof OptionOrderIntentKey.FromOptionOrderBundle ? ((OptionOrderIntentKey.FromOptionOrderBundle) optionOrderIntentKey2).getDefaultPricingSettingOverride() : null;
        OptionStatisticsLaunchMode launchMode = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getLaunchMode();
        boolean shouldDefaultToSimulatedReturnTab = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getShouldDefaultToSimulatedReturnTab();
        OptionOrderIntentKey optionOrderIntentKey3 = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionOrderIntentKey();
        boolean shouldIgnoreDefaultPricing = optionOrderIntentKey3 instanceof OptionOrderIntentKey.FromOptionOrderBundle ? ((OptionOrderIntentKey.FromOptionOrderBundle) optionOrderIntentKey3).getShouldIgnoreDefaultPricing() : false;
        int i = WhenMappings.$EnumSwitchMapping$0[((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionSide().ordinal()];
        if (i == 1) {
            longStrategyCode = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle().getOptionInstrument().getLongStrategyCode();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            longStrategyCode = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle().getOptionInstrument().getShortStrategyCode();
        }
        String str = longStrategyCode;
        OptionStatisticsTradableState tradableState = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getTradableState();
        OptionLegBundle optionLegBundle = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle();
        OptionChain.UnderlyingType underlyingType = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain().getUnderlyingType();
        UiOptionChain uiOptionChain = ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain();
        UUID indexUnderlyingId = uiOptionChain.getIndexUnderlyingId();
        super(new OptionStatisticsDataState(null, initialAccountNumber, null, defaultPricingSettingOverride, false, shouldDefaultToSimulatedReturnTab, shouldIgnoreDefaultPricing, str, optionLegBundle, launchMode, tradableState, underlyingType, indexUnderlyingId == null ? uiOptionChain.getSingleEquityUnderlyingId() : indexUnderlyingId, ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionSide(), null, null, null, null, ((OptionStatisticsFragment.Args) companion.getArgs(savedStateHandle)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain(), null, false, 1818645, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.eventLogger = eventLogger;
        this.performanceLogger = performanceLogger;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.optionSimulatedReturnPreTradeStore = optionSimulatedReturnPreTradeStore;
        this.optionPreTradeSimulatedReturnChartShownPref = optionPreTradeSimulatedReturnChartShownPref;
        this.optionPreTradeStatNuxDotShownPref = optionPreTradeStatNuxDotShownPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), null, null, null, 29, null);
        UUID id = ((OptionStatisticsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getStatisticFragmentKey().getOptionLegBundle().getOptionInstrument().getId();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C237791(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237812(id, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237823(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237834(id, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237845(id, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237856(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237867(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237878(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237889(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2378010(null));
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1 */
    static final class C237791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237791(Continuation<? super C237791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionStatisticsViewState> stateFlow = OptionStatisticsDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionStatisticsDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
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
                                String accountNumber = ((OptionStatisticsViewState) obj).getAccountNumber();
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                }), new C23772x388efa32(null, OptionStatisticsDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionStatisticsDuxo.this, null);
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$3", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$3$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ Account $account;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$account = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((AnonymousClass1) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, this.$account, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 2097150, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$2", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$2 */
    static final class C237812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $optionInstrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237812(UUID uuid, Continuation<? super C237812> continuation) {
            super(2, continuation);
            this.$optionInstrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237812(this.$optionInstrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UiOptionInstrument> flowAsFlow = OptionStatisticsDuxo.this.optionInstrumentStore.getStreamUiOptionInstrument().asFlow(this.$optionInstrumentId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionStatisticsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$2$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiOptionInstrument, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiOptionInstrument uiOptionInstrument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiOptionInstrument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$2$1$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503511 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ UiOptionInstrument $uiOptionInstrument;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503511(UiOptionInstrument uiOptionInstrument, Continuation<? super C503511> continuation) {
                    super(2, continuation);
                    this.$uiOptionInstrument = uiOptionInstrument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503511 c503511 = new C503511(this.$uiOptionInstrument, continuation);
                    c503511.L$0 = obj;
                    return c503511;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((C503511) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, this.$uiOptionInstrument, null, null, false, 1966079, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503511((UiOptionInstrument) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$3", m3645f = "OptionStatisticsDuxo.kt", m3646l = {144}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$3 */
    static final class C237823 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237823(Continuation<? super C237823> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237823(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237823) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<UiOptionUnderlier>> flowAsFlow = OptionStatisticsDuxo.this.optionChainStore.getStreamUiOptionUnderliersByOptionChain().asFlow(((OptionStatisticsFragment.Args) OptionStatisticsDuxo.INSTANCE.getArgs((HasSavedState) OptionStatisticsDuxo.this)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain().getOptionChain().getId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionStatisticsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/ui/UiOptionUnderlier;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$3$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiOptionUnderlier>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiOptionUnderlier> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiOptionUnderlier>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiOptionUnderlier> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$3$1$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503521 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ List<UiOptionUnderlier> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503521(List<UiOptionUnderlier> list, Continuation<? super C503521> continuation) {
                    super(2, continuation);
                    this.$it = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503521 c503521 = new C503521(this.$it, continuation);
                    c503521.L$0 = obj;
                    return c503521;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((C503521) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, extensions2.toImmutableList(this.$it), false, 1572863, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503521((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$4", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$4 */
    static final class C237834 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $optionInstrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237834(UUID uuid, Continuation<? super C237834> continuation) {
            super(2, continuation);
            this.$optionInstrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237834(this.$optionInstrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237834) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionStatisticsDuxo.this.optionQuoteStore.pollQuote(this.$optionInstrumentId)), Integer.MAX_VALUE, null, 2, null);
                this.label = 1;
                if (FlowKt.collect(flowBuffer$default, this) == coroutine_suspended) {
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
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$5", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$5 */
    static final class C237845 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $optionInstrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237845(UUID uuid, Continuation<? super C237845> continuation) {
            super(2, continuation);
            this.$optionInstrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237845(this.$optionInstrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237845) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionStatisticsDuxo.this.optionQuoteStore.getOptionQuote(this.$optionInstrumentId)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionStatisticsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionInstrumentQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$5$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionInstrumentQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionInstrumentQuote optionInstrumentQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionInstrumentQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$5$1$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503531 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ OptionInstrumentQuote $optionInstrumentQuote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503531(OptionInstrumentQuote optionInstrumentQuote, Continuation<? super C503531> continuation) {
                    super(2, continuation);
                    this.$optionInstrumentQuote = optionInstrumentQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503531 c503531 = new C503531(this.$optionInstrumentQuote, continuation);
                    c503531.L$0 = obj;
                    return c503531;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((C503531) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, null, null, false, false, false, null, null, null, null, null, null, null, this.$optionInstrumentQuote, null, null, null, null, null, false, 2080767, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503531((OptionInstrumentQuote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6 */
    static final class C237856 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237856(Continuation<? super C237856> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237856(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237856) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionStatisticsViewState> stateFlow = OptionStatisticsDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<String>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionStatisticsDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
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
                                String accountNumber = ((OptionStatisticsViewState) obj).getAccountNumber();
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                }, new C23774xec24ae8d(null, OptionStatisticsDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionStatisticsDuxo.this, null);
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$3", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OptionSettings.DefaultPricingSetting, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSettings.DefaultPricingSetting defaultPricingSetting, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(defaultPricingSetting, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$3$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$6$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ OptionSettings.DefaultPricingSetting $defaultPricingSetting;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSettings.DefaultPricingSetting defaultPricingSetting, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$defaultPricingSetting = defaultPricingSetting;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$defaultPricingSetting, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((AnonymousClass1) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, this.$defaultPricingSetting, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 2097147, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((OptionSettings.DefaultPricingSetting) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$7", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$7 */
    static final class C237867 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237867(Continuation<? super C237867> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237867(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237867) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow flowFlowOf;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Companion companion = OptionStatisticsDuxo.INSTANCE;
                String openPositionStrategyCode = OptionInstruments3.getOpenPositionStrategyCode(((OptionStatisticsFragment.Args) companion.getArgs((HasSavedState) OptionStatisticsDuxo.this)).getStatisticFragmentKey().getOptionLegBundle().getOptionInstrument(), ((OptionStatisticsFragment.Args) companion.getArgs((HasSavedState) OptionStatisticsDuxo.this)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionSide());
                if (((OptionStatisticsFragment.Args) companion.getArgs((HasSavedState) OptionStatisticsDuxo.this)).getStatisticFragmentKey().getLaunchMode().getWatchlistActionsAvailable()) {
                    flowFlowOf = Context7.buffer$default(RxConvert.asFlow(OptionStatisticsDuxo.this.optionsWatchlistStore.streamWatchlistItemState(openPositionStrategyCode)), Integer.MAX_VALUE, null, 2, null);
                } else {
                    flowFlowOf = FlowKt.flowOf(OptionWatchlistItemState.NOT_AVAILABLE);
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionStatisticsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowOf, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "watchlistItemState", "Lcom/robinhood/models/ui/OptionWatchlistItemState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$7$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionWatchlistItemState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionWatchlistItemState optionWatchlistItemState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionWatchlistItemState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$7$1$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503541 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ OptionWatchlistItemState $watchlistItemState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503541(OptionWatchlistItemState optionWatchlistItemState, Continuation<? super C503541> continuation) {
                    super(2, continuation);
                    this.$watchlistItemState = optionWatchlistItemState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503541 c503541 = new C503541(this.$watchlistItemState, continuation);
                    c503541.L$0 = obj;
                    return c503541;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((C503541) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, this.$watchlistItemState, null, null, null, false, 2031615, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503541((OptionWatchlistItemState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$8", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$8 */
    static final class C237878 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237878(Continuation<? super C237878> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237878(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237878) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionStatisticsDuxo.this.optionSimulatedReturnPreTradeStore.streamOptionChainSettingsPnlChartType());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionStatisticsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$8$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainSettingsPnlChartType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionChainSettingsPnlChartType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$8$1$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$8$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503551 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ OptionChainSettingsPnlChartType $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503551(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super C503551> continuation) {
                    super(2, continuation);
                    this.$it = optionChainSettingsPnlChartType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503551 c503551 = new C503551(this.$it, continuation);
                    c503551.L$0 = obj;
                    return c503551;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((C503551) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, this.$it, null, null, null, null, false, 2064383, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503551((OptionChainSettingsPnlChartType) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9 */
    static final class C237889 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237889(Continuation<? super C237889> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C237889(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237889) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionStatisticsViewState> stateFlow = OptionStatisticsDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Tuples2<? extends String, ? extends String>>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends String>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionStatisticsDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
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
                                OptionStatisticsViewState optionStatisticsViewState = (OptionStatisticsViewState) obj;
                                Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(optionStatisticsViewState.getStrategyCode(), optionStatisticsViewState.getAccountNumber()));
                                if (nullable != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(nullable, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                }, new C23777xf17e812a(null, OptionStatisticsDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionStatisticsDuxo.this, null);
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$3", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Optional<? extends UiAggregateOptionPositionFull>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<UiAggregateOptionPositionFull> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UiAggregateOptionPositionFull> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<UiAggregateOptionPositionFull>) optional, continuation);
            }

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$3$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$9$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ UiAggregateOptionPositionFull $position;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UiAggregateOptionPositionFull uiAggregateOptionPositionFull, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$position = uiAggregateOptionPositionFull;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((AnonymousClass1) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, null, null, this.$position != null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 2097135, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((UiAggregateOptionPositionFull) ((Optional) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$10", m3645f = "OptionStatisticsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$10 */
    static final class C2378010 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2378010(Continuation<? super C2378010> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStatisticsDuxo.this.new C2378010(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2378010) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(OptionStatisticsDuxo.this.optionPreTradeStatNuxDotShownPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionStatisticsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionStatisticsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isShown", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$10$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionStatisticsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionStatisticsDuxo optionStatisticsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionStatisticsDuxo;
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

            /* compiled from: OptionStatisticsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$10$1$1", m3645f = "OptionStatisticsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503501 extends ContinuationImpl7 implements Function2<OptionStatisticsDataState, Continuation<? super OptionStatisticsDataState>, Object> {
                final /* synthetic */ boolean $isShown;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503501(boolean z, Continuation<? super C503501> continuation) {
                    super(2, continuation);
                    this.$isShown = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503501 c503501 = new C503501(this.$isShown, continuation);
                    c503501.L$0 = obj;
                    return c503501;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionStatisticsDataState optionStatisticsDataState, Continuation<? super OptionStatisticsDataState> continuation) {
                    return ((C503501) create(optionStatisticsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionStatisticsDataState.copy$default((OptionStatisticsDataState) this.L$0, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$isShown, 1048575, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503501(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_CONTRACT_BUY_BUTTON, null, 2, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onDestroy() {
        EventLogger.DefaultImpls.logDisappear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), null, null, null, 29, null);
    }

    public final void logSwipeDismiss() {
        EventLogger.DefaultImpls.logSwipe$default(this.eventLogger, UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), null, null, null, false, 60, null);
    }

    public final void logTrade() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.TRADE, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), null, null, null, false, 60, null);
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.BUY_OPTION_TRADE_DETAILS, null, null, null, 14, null);
    }

    public final void onPreTradeSimulatedReturnShown() {
        this.optionPreTradeSimulatedReturnChartShownPref.set(true);
        this.optionPreTradeStatNuxDotShownPref.set(true);
    }

    public final void onSimulatedReturnSegmentTapped() {
        UserInteractionEventDescriptor segmentedControlEventDescriptor = OptionStatisticsLoggings.getSegmentedControlEventDescriptor(((OptionStatisticsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getStatisticFragmentKey().getOptionLegBundle().getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain().getOptionChain().getId());
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.SELECT, segmentedControlEventDescriptor.getScreen(), segmentedControlEventDescriptor.getComponent(), null, segmentedControlEventDescriptor.getContext(), false, 40, null);
    }

    /* compiled from: OptionStatisticsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;", "Lcom/robinhood/android/options/statistics/OptionStatisticsFragment$Args;", "<init>", "()V", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionStatisticsDuxo, OptionStatisticsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionStatisticsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionStatisticsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionStatisticsFragment.Args getArgs(OptionStatisticsDuxo optionStatisticsDuxo) {
            return (OptionStatisticsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionStatisticsDuxo);
        }
    }
}
