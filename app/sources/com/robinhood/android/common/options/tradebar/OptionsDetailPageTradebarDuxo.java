package com.robinhood.android.common.options.tradebar;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartData;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.common.options.accountswitcher.AccountSwitchers;
import com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelper;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarEvent;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.experiments.TradeOptionsSduiAccountSwitcherExperiment;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore6;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionHistoricalChartStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionRollingStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.accountswitcher.ApiOptionsAccountSwitcherModel;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: OptionsDetailPageTradebarDuxo.kt */
@Metadata(m3635d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 P2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001PB\u0099\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)¢\u0006\u0004\b*\u0010+J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020/H\u0016J.\u00101\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u0002H30205H\u0002J!\u00107\u001a\u00020/2\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020905¢\u0006\u0002\b:H\u0002J\u000e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020/J\u0006\u0010?\u001a\u00020/J\u0010\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020CJ\u001c\u0010D\u001a\u00020/2\n\u0010E\u001a\u00060Fj\u0002`G2\u0006\u0010H\u001a\u00020=H\u0002J\u0018\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020LH\u0002J\u000e\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020OR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "stateProvider", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionRollingStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStart", "flowIfSelfFetchMode", "Lkotlinx/coroutines/flow/Flow;", "T", "flow", "Lkotlin/Function1;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "copyPageSpecificDerivedData", "pageSpecificDerivedDataCopy", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "Lkotlin/ExtensionFunctionType;", "onAccountSelected", "accountNumber", "", "refreshAccountSwitcher", "onTradeClicked", "onTradebarActionClicked", "Lcom/robinhood/android/navigation/keys/IntentKey;", "action", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "logTradebarErrorMessageAppear", "tradebarErrorComponentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "strategyCode", "logTradebarButtonTap", "buttonIdentifier", "timeSpent", "", "setData", "mode", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode;", "Companion", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsDetailPageTradebarDuxo extends BaseDuxo3<OptionsDetailPageTradebarDataState, OptionsDetailPageTradebarViewState, OptionsDetailPageTradebarEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final IndexStore indexStore;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionChainStore optionChainStore;
    private final OptionHistoricalChartStore optionHistoricalChartStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionRollingStore optionRollingStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiOptionStrategyInfo onCreate$lambda$13$lambda$11(Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return (UiOptionStrategyInfo) tuples2.component1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$2$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiOptionStrategyInfo onCreate$lambda$8$lambda$5(Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return (UiOptionStrategyInfo) tuples2.component1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 onCreate$lambda$8$lambda$7(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionsDetailPageTradebarDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, EventLogger eventLogger, ExperimentsStore experimentsStore, IndexStore indexStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainStore optionChainStore, OptionHistoricalChartStore optionHistoricalChartStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionRollingStore optionRollingStore, OptionSettingsStore optionSettingsStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionsWatchlistStore optionsWatchlistStore, QuoteStore quoteStore, OptionsDetailPageTradebarStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionHistoricalChartStore, "optionHistoricalChartStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new OptionsDetailPageTradebarDataState(null, null, null, null, ((OptionsDetailPageTradebarFragment.Args) companion.getArgs(savedStateHandle)).getFixedAccountNumber(), ((OptionsDetailPageTradebarFragment.Args) companion.getArgs(savedStateHandle)).getShouldHideErrorBanner(), ((OptionsDetailPageTradebarFragment.Args) companion.getArgs(savedStateHandle)).getShouldHideStatLabelForSingleAccount(), ((OptionsDetailPageTradebarFragment.Args) companion.getArgs(savedStateHandle)).getAnalyticsSource(), false, 271, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.indexStore = indexStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainStore = optionChainStore;
        this.optionHistoricalChartStore = optionHistoricalChartStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionPositionStore = optionPositionStore;
        this.optionRollingStore = optionRollingStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.quoteStore = quoteStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow onCreate$lambda$13(final Flow flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch) {
        Intrinsics.checkNotNullParameter(selfFetch, "<destruct>");
        final Flow flowCombine = Operators.combine(new Flow<UiOptionStrategyInfo>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiOptionStrategyInfo> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C114032(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$map$1$2 */
            public static final class C114032<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$map$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C114032.this.emit(null, this);
                    }
                }

                public C114032(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object first = ((Tuples2) obj).getFirst();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(first, anonymousClass1) == coroutine_suspended) {
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
        }, FlowKt.flowOf(Boolean.valueOf(selfFetch.getIsLegContext())));
        Flow flowMapNotNullToTradebarIndex = OptionsDetailPageTradebarDuxo7.mapNotNullToTradebarIndex(new Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Boolean>>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UiOptionStrategyInfo, ? extends Boolean>> flowCollector, Continuation continuation) {
                Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$filter$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples2.component1();
                        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
                        if (uiOptionStrategyInfo.isSingleLeg() && zBooleanValue) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
        }, new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$13$lambda$11((Tuples2) obj);
            }
        });
        final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = optionsDetailPageTradebarDuxo.getStateFlow();
        return OptionsDetailPageDuxoHelper.getUiOptionInstrumentPositionToIndexFlow(flowMapNotNullToTradebarIndex, new Flow<String>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$13$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        Account currentAccount = ((OptionsDetailPageTradebarViewState) obj).getCurrentAccount();
                        String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
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
        }, optionsDetailPageTradebarDuxo.optionPositionStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow onCreate$lambda$8(final Flow flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch) {
        Intrinsics.checkNotNullParameter(selfFetch, "<destruct>");
        final String strategyCode = selfFetch.getStrategyCode();
        final Flow flowCombine = Operators.combine(new Flow<UiOptionStrategyInfo>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UiOptionStrategyInfo> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C114062(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$map$1$2 */
            public static final class C114062<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$map$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C114062.this.emit(null, this);
                    }
                }

                public C114062(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object first = ((Tuples2) obj).getFirst();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(first, anonymousClass1) == coroutine_suspended) {
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
        }, FlowKt.flowOf(Boolean.valueOf(selfFetch.getIsLegContext())));
        Flow flowMapNotNullToTradebarIndex = OptionsDetailPageTradebarDuxo7.mapNotNullToTradebarIndex(new Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Boolean>>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UiOptionStrategyInfo, ? extends Boolean>> flowCollector, Continuation continuation) {
                Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$filter$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples2.component1();
                        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
                        if (!uiOptionStrategyInfo.isSingleLeg() || !zBooleanValue) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
        }, new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$8$lambda$5((Tuples2) obj);
            }
        });
        final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = optionsDetailPageTradebarDuxo.getStateFlow();
        return OptionsDetailPageDuxoHelper.getUiAggregateOptionPositionToIndexFlow(flowMapNotNullToTradebarIndex, OptionsDetailPageTradebarDuxo7.mapNotNullToTradebarIndex(new Flow<Tuples2<? extends String, ? extends String>>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends String>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, strategyCode), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $strategyCode$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$lambda$8$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$strategyCode$inlined = str;
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
                        Account currentAccount = ((OptionsDetailPageTradebarViewState) obj).getCurrentAccount();
                        Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(currentAccount != null ? currentAccount.getAccountNumber() : null, this.$strategyCode$inlined));
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
        }, new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$8$lambda$7((Tuples2) obj);
            }
        }), optionsDetailPageTradebarDuxo.aggregateOptionPositionStore);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsSelloutImprovementExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$0(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C114302(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C114313(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C114324(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C114335(null));
        final Flow flowFlowIfSelfFetchMode = flowIfSelfFetchMode(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$2(this.f$0, (OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch) obj);
            }
        });
        Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> uiOptionUnderlierToIndexFlow = OptionsDetailPageDuxoHelper.getUiOptionUnderlierToIndexFlow(flowFlowIfSelfFetchMode, this.optionChainStore);
        Flow flowFlowIfSelfFetchMode2 = flowIfSelfFetchMode(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$8(flowFlowIfSelfFetchMode, this, (OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch) obj);
            }
        });
        Flow flowFlowIfSelfFetchMode3 = flowIfSelfFetchMode(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$13(flowFlowIfSelfFetchMode, this, (OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch) obj);
            }
        });
        Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> curatedListItemToUiStrategyInfoToIndexFlow = OptionsDetailPageDuxoHelper.getCuratedListItemToUiStrategyInfoToIndexFlow(OptionsDetailPageDuxoHelper.getHasRealPositionToIndexFlow(flowFlowIfSelfFetchMode2, flowFlowIfSelfFetchMode3), flowFlowIfSelfFetchMode, OptionsDetailPageTradebarDuxo7.mapNotNullToTradebarIndex(getStateFlow(), new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$14((OptionsDetailPageTradebarViewState) obj);
            }
        }), this.optionsWatchlistStore);
        Flow<Iterable<Quote>> equityQuotePollingFlow = OptionsDetailPageDuxoHelper.getEquityQuotePollingFlow(uiOptionUnderlierToIndexFlow, this.quoteStore);
        Flow<Tuples2<Quote, Integer>> equityQuoteToIndexFlow = OptionsDetailPageDuxoHelper.getEquityQuoteToIndexFlow(uiOptionUnderlierToIndexFlow, this.quoteStore);
        Flow<Tuples2<IndexValue, Integer>> indexValueToIndexFlow = OptionsDetailPageDuxoHelper.getIndexValueToIndexFlow(flowFlowIfSelfFetchMode, this.indexStore);
        Flow<Tuples2<Optional<Index>, Integer>> indexInstrumentToIndexFlow = OptionsDetailPageDuxoHelper.getIndexInstrumentToIndexFlow(flowFlowIfSelfFetchMode, this.indexStore);
        Flow<Tuples2<OptionHistoricalChartModel, Integer>> historicalChartToIndexFlow = OptionsDetailPageDuxoHelper.getHistoricalChartToIndexFlow(FlowKt.transformLatest(FlowKt.transformLatest(flowFlowIfSelfFetchMode, new OptionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$1(null, this)), new OptionsDetailPageTradebarDuxo$onCreate$$inlined$flatMapLatest$2(null, this)), this.optionHistoricalChartStore);
        final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = getStateFlow();
        Flow<Tuples2<Boolean, Integer>> showRollingActionItemToIndexFlow = OptionsDetailPageDuxoHelper.getShowRollingActionItemToIndexFlow(flowFlowIfSelfFetchMode, new Flow<String>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C113802(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$1$2 */
            public static final class C113802<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C113802.this.emit(null, this);
                    }
                }

                public C113802(FlowCollector flowCollector) {
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
                        Account currentAccount = ((OptionsDetailPageTradebarViewState) obj).getCurrentAccount();
                        String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
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
        }, this.optionRollingStore);
        final StateFlow<OptionsDetailPageTradebarViewState> stateFlow2 = getStateFlow();
        Flow<Tuples2<OptionInstrumentPosition, Integer>> oppositePositionFromWatchlistToIndexFlow = OptionsDetailPageDuxoHelper.getOppositePositionFromWatchlistToIndexFlow(curatedListItemToUiStrategyInfoToIndexFlow, new Flow<String>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C113812(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$2$2 */
            public static final class C113812<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$2$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                        return C113812.this.emit(null, this);
                    }
                }

                public C113812(FlowCollector flowCollector) {
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
                        Account currentAccount = ((OptionsDetailPageTradebarViewState) obj).getCurrentAccount();
                        String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
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
        }, this.optionPositionStore);
        Flow<Tuples2<OptionsAccountSwitcher, Integer>> optionsAccountSwitcherToIndexFlow = OptionsDetailPageDuxoHelper.getOptionsAccountSwitcherToIndexFlow(OptionsDetailPageTradebarDuxo7.mapNotNullToTradebarIndex(getStateFlow(), new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$19((OptionsDetailPageTradebarViewState) obj);
            }
        }), this.optionAccountSwitcherStore);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C114346(historicalChartToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C114357(equityQuotePollingFlow, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C114368(equityQuoteToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C114379(indexValueToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142010(indexInstrumentToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142111(indexInstrumentToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142212(oppositePositionFromWatchlistToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142313(optionsAccountSwitcherToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142414(showRollingActionItemToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142515(flowFlowIfSelfFetchMode2, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142616(flowFlowIfSelfFetchMode3, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142717(uiOptionUnderlierToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142818(flowFlowIfSelfFetchMode, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C1142919(flowFlowIfSelfFetchMode, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Boolean bool) {
        optionsDetailPageTradebarDuxo.applyMutation(new OptionsDetailPageTradebarDuxo2(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2 */
    static final class C114302 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C114302(Continuation<? super C114302> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsDetailPageTradebarDuxo.this.new C114302(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = OptionsDetailPageTradebarDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Account currentAccount = ((OptionsDetailPageTradebarViewState) obj).getCurrentAccount();
                                String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
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
                }), new C11395xb9c3c7a6(null, OptionsDetailPageTradebarDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsDetailPageTradebarDuxo.this, null);
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$3", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OptionSettings, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSettings optionSettings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(optionSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsDetailPageTradebarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$3$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
                final /* synthetic */ OptionSettings $optionSettings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSettings optionSettings, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$optionSettings = optionSettings;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionSettings, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
                    return ((AnonymousClass1) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
                    final OptionSettings optionSettings = this.$optionSettings;
                    return optionsDetailPageTradebarDataState.copyGlobalData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$2$3$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C114302.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(optionSettings, (OptionsDetailPageTradebarDataState.GlobalData) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionsDetailPageTradebarDataState.GlobalData invokeSuspend$lambda$0(OptionSettings optionSettings, OptionsDetailPageTradebarDataState.GlobalData globalData) {
                    return OptionsDetailPageTradebarDataState.GlobalData.copy$default(globalData, null, null, optionSettings, null, false, false, 59, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((OptionSettings) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$3", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$3 */
    static final class C114313 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C114313(Continuation<? super C114313> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsDetailPageTradebarDuxo.this.new C114313(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114313) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionsDetailPageTradebarDuxo.this.optionMarketHoursStore.streamCurrentOrNextMarketDates()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsDetailPageTradebarDuxo.this, null);
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$3$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionCurrentOrNextMarketDates, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionCurrentOrNextMarketDates, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsDetailPageTradebarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$3$1$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496831 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
                final /* synthetic */ OptionCurrentOrNextMarketDates $dates;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496831(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Continuation<? super C496831> continuation) {
                    super(2, continuation);
                    this.$dates = optionCurrentOrNextMarketDates;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496831 c496831 = new C496831(this.$dates, continuation);
                    c496831.L$0 = obj;
                    return c496831;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
                    return ((C496831) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
                    final OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.$dates;
                    return optionsDetailPageTradebarDataState.copyGlobalData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$3$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C114313.AnonymousClass1.C496831.invokeSuspend$lambda$0(optionCurrentOrNextMarketDates, (OptionsDetailPageTradebarDataState.GlobalData) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionsDetailPageTradebarDataState.GlobalData invokeSuspend$lambda$0(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionsDetailPageTradebarDataState.GlobalData globalData) {
                    return OptionsDetailPageTradebarDataState.GlobalData.copy$default(globalData, null, null, null, optionCurrentOrNextMarketDates, false, false, 55, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496831((OptionCurrentOrNextMarketDates) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4 */
    static final class C114324 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C114324(Continuation<? super C114324> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsDetailPageTradebarDuxo.this.new C114324(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114324) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = OptionsDetailPageTradebarDuxo.this.getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends Component.ComponentType, ? extends String>>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends Component.ComponentType, ? extends String>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsDetailPageTradebarViewState optionsDetailPageTradebarViewState = (OptionsDetailPageTradebarViewState) obj;
                                Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(optionsDetailPageTradebarViewState.getTradebarErrorComponentType(), optionsDetailPageTradebarViewState.getStrategyCode()));
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
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageTradebarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Component.ComponentType, ? extends String>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Component.ComponentType, ? extends String> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends Component.ComponentType, String>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends Component.ComponentType, String> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.logTradebarErrorMessageAppear((Component.ComponentType) tuples2.component1(), (String) tuples2.component2());
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$5", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {150}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$5 */
    static final class C114335 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C114335(Continuation<? super C114335> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsDetailPageTradebarDuxo.this.new C114335(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114335) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionsDetailPageTradebarDuxo.this.experimentsStore, new Experiment[]{TradeOptionsSduiAccountSwitcherExperiment.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsDetailPageTradebarDuxo.this, null);
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "useSduiAccountSwitcher", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$5$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
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

            /* compiled from: OptionsDetailPageTradebarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$5$1$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496841 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
                final /* synthetic */ boolean $useSduiAccountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496841(boolean z, Continuation<? super C496841> continuation) {
                    super(2, continuation);
                    this.$useSduiAccountSwitcher = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496841 c496841 = new C496841(this.$useSduiAccountSwitcher, continuation);
                    c496841.L$0 = obj;
                    return c496841;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
                    return ((C496841) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsDetailPageTradebarDataState.copy$default((OptionsDetailPageTradebarDataState) this.L$0, null, null, null, null, null, false, false, null, this.$useSduiAccountSwitcher, 255, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496841(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow onCreate$lambda$2(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetch) {
        Intrinsics.checkNotNullParameter(selfFetch, "<destruct>");
        return OptionsDetailPageDuxoHelper.getUiStrategyInfoToIndexFlow(OptionsDetailPageTradebarDuxo7.mapNotNullToTradebarIndex(FlowKt.flowOf(selfFetch.getStrategyCode()), new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onCreate$lambda$2$lambda$1((String) obj);
            }
        }), optionsDetailPageTradebarDuxo.optionStrategyInfoStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Account onCreate$lambda$14(OptionsDetailPageTradebarViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCurrentAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsAccountSwitcherId onCreate$lambda$19(OptionsDetailPageTradebarViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOptionsAccountSwitcherId();
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$6", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$6 */
    static final class C114346 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<OptionHistoricalChartModel, Integer>> $historicalChartFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114346(Flow<Tuples2<OptionHistoricalChartModel, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C114346> continuation) {
            super(2, continuation);
            this.$historicalChartFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C114346(this.$historicalChartFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114346) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$6$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionHistoricalChartModel, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionHistoricalChartModel, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<OptionHistoricalChartModel, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<OptionHistoricalChartModel, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$6$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C114346.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                Direction pageDirection;
                OptionHistoricalChartData chartData = ((OptionHistoricalChartModel) tuples2.getFirst()).getChartData();
                if (chartData == null || (pageDirection = chartData.getPageDirection()) == null) {
                    pageDirection = Direction.f5855UP;
                }
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, pageDirection, null, null, null, null, null, false, null, null, null, null, null, 4094, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<OptionHistoricalChartModel, Integer>> flow = this.$historicalChartFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$7", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$7 */
    static final class C114357 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Iterable<Quote>> $equityQuotePollingFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C114357(Flow<? extends Iterable<Quote>> flow, Continuation<? super C114357> continuation) {
            super(2, continuation);
            this.$equityQuotePollingFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C114357(this.$equityQuotePollingFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114357) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Iterable<Quote>> flow = this.$equityQuotePollingFlow;
                this.label = 1;
                if (FlowKt.collect(flow, this) == coroutine_suspended) {
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

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$8", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$8 */
    static final class C114368 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Quote, Integer>> $equityQuoteFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114368(Flow<Tuples2<Quote, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C114368> continuation) {
            super(2, continuation);
            this.$equityQuoteFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C114368(this.$equityQuoteFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114368) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Quote;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$8$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Quote, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Quote, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Quote, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Quote, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$8$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C114368.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, (Quote) tuples2.getFirst(), null, null, null, false, null, null, null, null, null, 4091, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Quote, Integer>> flow = this.$equityQuoteFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$9", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {280}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$9 */
    static final class C114379 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<IndexValue, Integer>> $indexValueFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114379(Flow<Tuples2<IndexValue, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C114379> continuation) {
            super(2, continuation);
            this.$indexValueFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C114379(this.$indexValueFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114379) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/android/indexes/models/db/IndexValue;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$9$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends IndexValue, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends IndexValue, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<IndexValue, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<IndexValue, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$9$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C114379.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, (IndexValue) tuples2.getFirst(), null, null, false, null, null, null, null, null, 4087, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<IndexValue, Integer>> flow = this.$indexValueFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$10", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.f2777x89a9e432}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$10 */
    static final class C1142010 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<Index>, Integer>> $indexInstrumentFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1142010(Flow<? extends Tuples2<? extends Optional<Index>, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142010> continuation) {
            super(2, continuation);
            this.$indexInstrumentFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142010(this.$indexInstrumentFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142010) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/indexes/models/db/Index;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$10$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends Index>, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends Index>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends Optional<Index>, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends Optional<Index>, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$10$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142010.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, (Index) ((Optional) tuples2.getFirst()).getOrNull(), null, null, null, null, false, null, null, null, null, null, 4093, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Optional<Index>, Integer>> flow = this.$indexInstrumentFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$11", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$11 */
    static final class C1142111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<Index>, Integer>> $indexInstrumentFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1142111(Flow<? extends Tuples2<? extends Optional<Index>, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142111> continuation) {
            super(2, continuation);
            this.$indexInstrumentFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142111(this.$indexInstrumentFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$indexInstrumentFlow, new C11384xc5af93c4(null, this.this$0));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/ui/UiOptionChain;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$11$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$11$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends UiOptionChain>, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiOptionChain> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiOptionChain>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiOptionChain> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$12", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$12 */
    static final class C1142212 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<OptionInstrumentPosition, Integer>> $oppositePositionFromWatchlistFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1142212(Flow<Tuples2<OptionInstrumentPosition, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142212> continuation) {
            super(2, continuation);
            this.$oppositePositionFromWatchlistFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142212(this.$oppositePositionFromWatchlistFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OptionInstrumentPosition;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$12$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$12$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionInstrumentPosition, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionInstrumentPosition, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<OptionInstrumentPosition, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<OptionInstrumentPosition, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$12$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142212.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, (OptionInstrumentPosition) tuples2.getFirst(), null, false, null, null, null, null, null, 4079, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<OptionInstrumentPosition, Integer>> flow = this.$oppositePositionFromWatchlistFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$13", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$13 */
    static final class C1142313 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<OptionsAccountSwitcher, Integer>> $optionsAccountSwitcherFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1142313(Flow<Tuples2<OptionsAccountSwitcher, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142313> continuation) {
            super(2, continuation);
            this.$optionsAccountSwitcherFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142313(this.$optionsAccountSwitcherFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142313) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$13$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$13$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionsAccountSwitcher, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionsAccountSwitcher, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<OptionsAccountSwitcher, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<OptionsAccountSwitcher, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$13$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142313.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, (OptionsAccountSwitcher) tuples2.getFirst(), false, null, null, null, null, null, 4063, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<OptionsAccountSwitcher, Integer>> flow = this.$optionsAccountSwitcherFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$14", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$14 */
    static final class C1142414 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Boolean, Integer>> $showRollingActionItemFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1142414(Flow<Tuples2<Boolean, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142414> continuation) {
            super(2, continuation);
            this.$showRollingActionItemFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142414(this.$showRollingActionItemFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142414) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$14$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$14$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Boolean, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Boolean, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$14$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142414.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, null, ((Boolean) tuples2.getFirst()).booleanValue(), null, null, null, null, null, 4031, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Boolean, Integer>> flow = this.$showRollingActionItemFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$15", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$15 */
    static final class C1142515 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1142515(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142515> continuation) {
            super(2, continuation);
            this.$uiAggregateOptionPositionFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142515(this.$uiAggregateOptionPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142515) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$15$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$15$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiAggregateOptionPositionFull>, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends UiAggregateOptionPositionFull>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$15$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142515.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, null, false, (UiAggregateOptionPositionFull) ((Optional) tuples2.getFirst()).getOrNull(), null, null, null, null, 3967, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> flow = this.$uiAggregateOptionPositionFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$16", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$16 */
    static final class C1142616 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1142616(Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142616> continuation) {
            super(2, continuation);
            this.$uiOptionInstrumentPositionFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142616(this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142616) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$16$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$16$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiOptionInstrumentPosition>, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends UiOptionInstrumentPosition>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$16$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142616.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, null, false, null, (UiOptionInstrumentPosition) ((Optional) tuples2.getFirst()).getOrNull(), null, null, null, 3839, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> flow = this.$uiOptionInstrumentPositionFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$17", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {335}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$17 */
    static final class C1142717 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> $optionUnderlierFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1142717(Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142717> continuation) {
            super(2, continuation);
            this.$optionUnderlierFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142717(this.$optionUnderlierFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142717) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionUnderlier;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$17$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$17$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiOptionUnderlier>, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends UiOptionUnderlier>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends Optional<UiOptionUnderlier>, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends Optional<UiOptionUnderlier>, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$17$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142717.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, null, false, null, null, (UiOptionUnderlier) ((Optional) tuples2.getFirst()).getOrNull(), null, null, 3583, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> flow = this.$optionUnderlierFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$18", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {341}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$18 */
    static final class C1142818 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1142818(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142818> continuation) {
            super(2, continuation);
            this.$strategyInfoFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142818(this.$strategyInfoFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142818) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$18$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$18$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UiOptionStrategyInfo, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<UiOptionStrategyInfo, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<UiOptionStrategyInfo, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$18$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142818.AnonymousClass1.invokeSuspend$lambda$0(tuples2, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(Tuples2 tuples2, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, null, false, null, null, null, (UiOptionStrategyInfo) tuples2.getFirst(), null, 3071, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow = this.$strategyInfoFlow;
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
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$19", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {349}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$19 */
    static final class C1142919 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
        int label;
        final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1142919(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super C1142919> continuation) {
            super(2, continuation);
            this.$strategyInfoFlow = flow;
            this.this$0 = optionsDetailPageTradebarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1142919(this.$strategyInfoFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1142919) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$strategyInfoFlow, new C11393x7e9f1abc(null, this.this$0));
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$19$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$19$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiOptionChain, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiOptionChain uiOptionChain, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(uiOptionChain, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final UiOptionChain uiOptionChain = (UiOptionChain) this.L$0;
                    this.this$0.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$19$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C1142919.AnonymousClass2.invokeSuspend$lambda$0(uiOptionChain, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$0(UiOptionChain uiOptionChain, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, null, false, null, null, null, null, uiOptionChain, 2047, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable<String> observableStreamActiveAccountNumber;
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAllSelfDirectedAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onStart$lambda$20(this.f$0, (List) obj);
            }
        });
        String fixedAccountNumber = ((OptionsDetailPageTradebarFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getFixedAccountNumber();
        if (fixedAccountNumber == null || fixedAccountNumber.length() == 0) {
            observableStreamActiveAccountNumber = this.optionAccountSwitcherStore.streamActiveAccountNumber();
        } else {
            observableStreamActiveAccountNumber = Observable.just(fixedAccountNumber);
            Intrinsics.checkNotNull(observableStreamActiveAccountNumber);
        }
        Observable<R> observableSwitchMap = observableStreamActiveAccountNumber.switchMap(new Function() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionsDetailPageTradebarDuxo.this.accountProvider.streamAccount(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarDuxo.onStart$lambda$21(this.f$0, (Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$20(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        optionsDetailPageTradebarDuxo.applyMutation(new OptionsDetailPageTradebarDuxo4(accounts2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$21(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Account account) {
        optionsDetailPageTradebarDuxo.applyMutation(new OptionsDetailPageTradebarDuxo5(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Flow<T> flowIfSelfFetchMode(Function1<? super OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch, ? extends Flow<? extends T>> flow) {
        final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = getStateFlow();
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$flowIfSelfFetchMode$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$flowIfSelfFetchMode$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$flowIfSelfFetchMode$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$flowIfSelfFetchMode$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch selfFetchMode = ((OptionsDetailPageTradebarViewState) obj).getSelfFetchMode();
                        if (selfFetchMode != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(selfFetchMode, anonymousClass1) == coroutine_suspended) {
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
        }), new C11377xaed4b027(null, flow));
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$copyPageSpecificDerivedData$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$copyPageSpecificDerivedData$1 */
    static final class C114181 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
        final /* synthetic */ Function1<OptionsDetailPageTradebarDataState.PageSpecificDerivedData, OptionsDetailPageTradebarDataState.PageSpecificDerivedData> $pageSpecificDerivedDataCopy;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C114181(Function1<? super OptionsDetailPageTradebarDataState.PageSpecificDerivedData, OptionsDetailPageTradebarDataState.PageSpecificDerivedData> function1, Continuation<? super C114181> continuation) {
            super(2, continuation);
            this.$pageSpecificDerivedDataCopy = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114181 c114181 = new C114181(this.$pageSpecificDerivedDataCopy, continuation);
            c114181.L$0 = obj;
            return c114181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
            return ((C114181) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
            return OptionsDetailPageTradebarDataState.copy$default(optionsDetailPageTradebarDataState, null, this.$pageSpecificDerivedDataCopy.invoke(optionsDetailPageTradebarDataState.getPageSpecificDerivedData()), null, null, null, false, false, null, false, 509, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyPageSpecificDerivedData(Function1<? super OptionsDetailPageTradebarDataState.PageSpecificDerivedData, OptionsDetailPageTradebarDataState.PageSpecificDerivedData> pageSpecificDerivedDataCopy) {
        applyMutation(new C114181(pageSpecificDerivedDataCopy, null));
    }

    public final void onAccountSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.optionAccountSwitcherStore.setActiveAccountNumber(accountNumber);
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {409}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1 */
    static final class C114421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C114421(Continuation<? super C114421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsDetailPageTradebarDuxo.this.new C114421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = OptionsDetailPageTradebarDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.take(new Flow<OptionsAccountSwitcherId>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsAccountSwitcherId> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsAccountSwitcherId optionsAccountSwitcherId = ((OptionsDetailPageTradebarViewState) obj).getOptionsAccountSwitcherId();
                                if (optionsAccountSwitcherId != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionsAccountSwitcherId, anonymousClass1) == coroutine_suspended) {
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
                }, 1), new C11416x1145a3ef(null, OptionsDetailPageTradebarDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsDetailPageTradebarDuxo.this, null);
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0015\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/OptionsAccountSwitcherRefreshState;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionAccountSwitcherStore6, ? extends OptionsAccountSwitcherId>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Tuples2<? extends OptionAccountSwitcherStore6, ? extends OptionsAccountSwitcherId> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsDetailPageTradebarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
                final /* synthetic */ OptionsAccountSwitcherId $optionsAccountSwitcherId;
                final /* synthetic */ OptionAccountSwitcherStore6 $state;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsAccountSwitcherId optionsAccountSwitcherId, OptionAccountSwitcherStore6 optionAccountSwitcherStore6, OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$optionsAccountSwitcherId = optionsAccountSwitcherId;
                    this.$state = optionAccountSwitcherStore6;
                    this.this$0 = optionsDetailPageTradebarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionsAccountSwitcherId, this.$state, this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
                    return ((AnonymousClass1) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
                    if (!Intrinsics.areEqual(optionsDetailPageTradebarDataState.getPageSpecificDerivedData().getOptionsAccountSwitcherId(), this.$optionsAccountSwitcherId)) {
                        return optionsDetailPageTradebarDataState;
                    }
                    OptionAccountSwitcherStore6 optionAccountSwitcherStore6 = this.$state;
                    if (optionAccountSwitcherStore6 instanceof OptionAccountSwitcherStore6.Failure) {
                        this.this$0.submit(new OptionsDetailPageTradebarEvent.AccountSwitcherRefreshed(this.$optionsAccountSwitcherId, new Either.Right(((OptionAccountSwitcherStore6.Failure) this.$state).getThrowable())));
                        return optionsDetailPageTradebarDataState.copyPageSpecificData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageTradebarDuxo.C114421.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0((OptionsDetailPageTradebarDataState.PageSpecificData) obj2);
                            }
                        });
                    }
                    if (Intrinsics.areEqual(optionAccountSwitcherStore6, OptionAccountSwitcherStore6.Loading.INSTANCE)) {
                        return optionsDetailPageTradebarDataState.copyPageSpecificData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageTradebarDuxo.C114421.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$1((OptionsDetailPageTradebarDataState.PageSpecificData) obj2);
                            }
                        });
                    }
                    if (!(optionAccountSwitcherStore6 instanceof OptionAccountSwitcherStore6.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ApiOptionsAccountSwitcherModel tradeBar = ((OptionAccountSwitcherStore6.Success) this.$state).getSwitcher().getTradeBar();
                    Account currentAccount = optionsDetailPageTradebarDataState.getGlobalData().getCurrentAccount();
                    if (currentAccount != null && tradeBar != null) {
                        this.this$0.submit(new OptionsDetailPageTradebarEvent.AccountSwitcherRefreshed(this.$optionsAccountSwitcherId, new Either.Left(AccountSwitchers.toAccountSwitcherData(tradeBar, currentAccount.getAccountNumber(), new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, null, null, 14, null)))));
                    }
                    optionsDetailPageTradebarDataState.copyPageSpecificData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C114421.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$2((OptionsDetailPageTradebarDataState.PageSpecificData) obj2);
                        }
                    });
                    final OptionAccountSwitcherStore6 optionAccountSwitcherStore62 = this.$state;
                    return optionsDetailPageTradebarDataState.copyPageSpecificDerivedData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$refreshAccountSwitcher$1$3$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageTradebarDuxo.C114421.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$3(optionAccountSwitcherStore62, (OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionsDetailPageTradebarDataState.PageSpecificData invokeSuspend$lambda$0(OptionsDetailPageTradebarDataState.PageSpecificData pageSpecificData) {
                    return OptionsDetailPageTradebarDataState.PageSpecificData.copy$default(pageSpecificData, false, 0L, 2, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionsDetailPageTradebarDataState.PageSpecificData invokeSuspend$lambda$1(OptionsDetailPageTradebarDataState.PageSpecificData pageSpecificData) {
                    return OptionsDetailPageTradebarDataState.PageSpecificData.copy$default(pageSpecificData, true, 0L, 2, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionsDetailPageTradebarDataState.PageSpecificData invokeSuspend$lambda$2(OptionsDetailPageTradebarDataState.PageSpecificData pageSpecificData) {
                    return OptionsDetailPageTradebarDataState.PageSpecificData.copy$default(pageSpecificData, false, 0L, 2, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionsDetailPageTradebarDataState.PageSpecificDerivedData invokeSuspend$lambda$3(OptionAccountSwitcherStore6 optionAccountSwitcherStore6, OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData) {
                    return OptionsDetailPageTradebarDataState.PageSpecificDerivedData.copy$default(pageSpecificDerivedData, null, null, null, null, null, ((OptionAccountSwitcherStore6.Success) optionAccountSwitcherStore6).getSwitcher(), false, null, null, null, null, null, 4063, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                Object objComponent1 = tuples2.component1();
                Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
                OptionsAccountSwitcherId optionsAccountSwitcherId = (OptionsAccountSwitcherId) tuples2.component2();
                OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo = this.this$0;
                optionsDetailPageTradebarDuxo.applyMutation(new AnonymousClass1(optionsAccountSwitcherId, (OptionAccountSwitcherStore6) objComponent1, optionsDetailPageTradebarDuxo, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void refreshAccountSwitcher() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C114421(null), 3, null);
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradeClicked$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradeClicked$1 */
    static final class C114401 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C114401(Continuation<? super C114401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114401 c114401 = new C114401(continuation);
            c114401.L$0 = obj;
            return c114401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
            return ((C114401) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((OptionsDetailPageTradebarDataState) this.L$0).copyPageSpecificData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradeClicked$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionsDetailPageTradebarDuxo.C114401.invokeSuspend$lambda$0((OptionsDetailPageTradebarDataState.PageSpecificData) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionsDetailPageTradebarDataState.PageSpecificData invokeSuspend$lambda$0(OptionsDetailPageTradebarDataState.PageSpecificData pageSpecificData) {
            return OptionsDetailPageTradebarDataState.PageSpecificData.copy$default(pageSpecificData, false, Instant.now().toEpochMilli(), 1, null);
        }
    }

    public final void onTradeClicked() {
        applyMutation(new C114401(null));
        logTradebarButtonTap(TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, 0L);
    }

    public final IntentKey onTradebarActionClicked(AbstractTradeBarOverlayView.ExpandAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        OptionsDetailPageTradebarViewState.ActionType actionType = OptionsDetailPageTradebarViewState.ActionType.values()[action.getId()];
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C114411(actionType, null), 3, null);
        return getStateFlow().getValue().getActionKeys().get(actionType);
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {475}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1 */
    static final class C114411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionsDetailPageTradebarViewState.ActionType $actionType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114411(OptionsDetailPageTradebarViewState.ActionType actionType, Continuation<? super C114411> continuation) {
            super(2, continuation);
            this.$actionType = actionType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsDetailPageTradebarDuxo.this.new C114411(this.$actionType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = OptionsDetailPageTradebarDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<Long>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Long lBoxLong = boxing.boxLong(((OptionsDetailPageTradebarViewState) obj).getTimestampTradeButtonTapped());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(lBoxLong, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageTradebarDuxo.this, this.$actionType, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "timestampTradeButtonTapped", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onTradebarActionClicked$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Long, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionsDetailPageTradebarViewState.ActionType $actionType;
            /* synthetic */ long J$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, OptionsDetailPageTradebarViewState.ActionType actionType, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
                this.$actionType = actionType;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$actionType, continuation);
                anonymousClass2.J$0 = ((Number) obj).longValue();
                return anonymousClass2;
            }

            public final Object invoke(long j, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
                return invoke(l.longValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.logTradebarButtonTap(this.$actionType.toEventButtonIdentifier(), Instant.now().toEpochMilli() - this.J$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTradebarErrorMessageAppear(Component.ComponentType tradebarErrorComponentType, String strategyCode) {
        OptionsDetailPageTradebarLoggings.logOptionsDetailPageTradebarErrorMessageAppear(this.eventLogger, ((OptionsDetailPageTradebarFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAnalyticsSource(), tradebarErrorComponentType, strategyCode);
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {508}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1 */
    static final class C114191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $buttonIdentifier;
        final /* synthetic */ long $timeSpent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114191(String str, long j, Continuation<? super C114191> continuation) {
            super(2, continuation);
            this.$buttonIdentifier = str;
            this.$timeSpent = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsDetailPageTradebarDuxo.this.new C114191(this.$buttonIdentifier, this.$timeSpent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = OptionsDetailPageTradebarDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<Tuples2<? extends String, ? extends BrokerageAccountType>>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends BrokerageAccountType>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsDetailPageTradebarViewState optionsDetailPageTradebarViewState = (OptionsDetailPageTradebarViewState) obj;
                                String strategyCode = optionsDetailPageTradebarViewState.getStrategyCode();
                                Account currentAccount = optionsDetailPageTradebarViewState.getCurrentAccount();
                                Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(strategyCode, currentAccount != null ? currentAccount.getBrokerageAccountType() : null));
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageTradebarDuxo.this, this.$buttonIdentifier, this.$timeSpent, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsDetailPageTradebarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/BrokerageAccountType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$logTradebarButtonTap$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends BrokerageAccountType>, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $buttonIdentifier;
            final /* synthetic */ long $timeSpent;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsDetailPageTradebarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo, String str, long j, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarDuxo;
                this.$buttonIdentifier = str;
                this.$timeSpent = j;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$buttonIdentifier, this.$timeSpent, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends BrokerageAccountType> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<String, ? extends BrokerageAccountType>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<String, ? extends BrokerageAccountType> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                OptionsDetailPageTradebarLoggings.logOptionsDetailPageTradebarButtonTap(this.this$0.eventLogger, ((OptionsDetailPageTradebarFragment.Args) OptionsDetailPageTradebarDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAnalyticsSource(), this.$buttonIdentifier, this.$timeSpent, (String) tuples2.component1(), (BrokerageAccountType) tuples2.component2());
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTradebarButtonTap(String buttonIdentifier, long timeSpent) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C114191(buttonIdentifier, timeSpent, null), 3, null);
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$setData$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$setData$1 */
    static final class C114431 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
        final /* synthetic */ OptionsDetailPageTradebarDataState.DataFetchMode $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114431(OptionsDetailPageTradebarDataState.DataFetchMode dataFetchMode, Continuation<? super C114431> continuation) {
            super(2, continuation);
            this.$mode = dataFetchMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114431 c114431 = new C114431(this.$mode, continuation);
            c114431.L$0 = obj;
            return c114431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
            return ((C114431) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
            return OptionsDetailPageTradebarDataState.copy$default(optionsDetailPageTradebarDataState, OptionsDetailPageTradebarDataState.GlobalData.copy$default(optionsDetailPageTradebarDataState.getGlobalData(), null, null, null, null, ((OptionsDetailPageTradebarDataState.DataFetchMode.PassIn) this.$mode).getIsLegContext(), false, 47, null), ((OptionsDetailPageTradebarDataState.DataFetchMode.PassIn) this.$mode).getPageSpecificDerivedData(), null, null, null, false, false, null, false, 508, null);
        }
    }

    public final void setData(OptionsDetailPageTradebarDataState.DataFetchMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (mode instanceof OptionsDetailPageTradebarDataState.DataFetchMode.PassIn) {
            applyMutation(new C114431(mode, null));
        } else {
            if (!(mode instanceof OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch)) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C114442(mode, null));
        }
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$setData$2", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$setData$2 */
    static final class C114442 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
        final /* synthetic */ OptionsDetailPageTradebarDataState.DataFetchMode $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C114442(OptionsDetailPageTradebarDataState.DataFetchMode dataFetchMode, Continuation<? super C114442> continuation) {
            super(2, continuation);
            this.$mode = dataFetchMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114442 c114442 = new C114442(this.$mode, continuation);
            c114442.L$0 = obj;
            return c114442;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
            return ((C114442) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
            return OptionsDetailPageTradebarDataState.copy$default(optionsDetailPageTradebarDataState, OptionsDetailPageTradebarDataState.GlobalData.copy$default(optionsDetailPageTradebarDataState.getGlobalData(), null, null, null, null, ((OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch) this.$mode).getIsLegContext(), false, 47, null), null, null, (OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch) this.$mode, null, false, false, null, false, HttpStatusCode.BAD_GATEWAY_502, null);
        }
    }

    /* compiled from: OptionsDetailPageTradebarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDuxo;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Args;", "<init>", "()V", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionsDetailPageTradebarDuxo, OptionsDetailPageTradebarFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsDetailPageTradebarFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionsDetailPageTradebarFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsDetailPageTradebarFragment.Args getArgs(OptionsDetailPageTradebarDuxo optionsDetailPageTradebarDuxo) {
            return (OptionsDetailPageTradebarFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionsDetailPageTradebarDuxo);
        }
    }
}
