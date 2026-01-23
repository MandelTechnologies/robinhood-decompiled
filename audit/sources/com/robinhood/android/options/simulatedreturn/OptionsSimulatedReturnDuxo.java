package com.robinhood.android.options.simulatedreturn;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.data.prefs.ShowSimulatedReturnDollarUnit;
import com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelper;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggings;
import com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.api.OptionTooltipDisplayBehavior;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import kotlinx.datetime.Clock2;

/* compiled from: OptionsSimulatedReturnDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00016Bs\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020$J\u0006\u0010*\u001a\u00020$J\u0018\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0002J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201J\u0015\u00102\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u000104¢\u0006\u0002\u00105R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "showSimulatedReturnDollarUnitPref", "Lcom/robinhood/prefs/BooleanPreference;", "stateProvider", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStop", "onChartTypeIconClicked", "onSliderTooltipClicked", "onInfoIconClicked", "onInfoIconTooltipClicked", "onToolbarMenuItemTapped", "onTooltipAppear", "receiptId", "", "tooltipIdentifier", "onTradebarHeightUpdated", "newHeight", "", "onEstimatedContractPriceUpdated", "newPrice", "", "(Ljava/lang/Double;)V", "Companion", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnDuxo extends BaseDuxo<OptionsSimulatedReturnDataState, OptionsSimulatedReturnViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final InstrumentStore equityInstrumentStore;
    private final EventLogger eventLogger;
    private final IndexStore indexStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final OptionTooltipStore optionTooltipStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference showSimulatedReturnDollarUnitPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionsSimulatedReturnDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, InstrumentStore equityInstrumentStore, EventLogger eventLogger, IndexStore indexStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionPositionStore optionPositionStore, OptionTooltipStore optionTooltipStore, OptionsWatchlistStore optionsWatchlistStore, @ShowSimulatedReturnDollarUnit BooleanPreference showSimulatedReturnDollarUnitPref, OptionsSimulatedReturnStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(showSimulatedReturnDollarUnitPref, "showSimulatedReturnDollarUnitPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new OptionsSimulatedReturnDataState(null, null, null, null, null, null, ((OptionsSimulatedReturnFragment.Args) companion.getArgs(savedStateHandle)).getKey().getFixedAccountNumber(), null, null, ((OptionsSimulatedReturnFragment.Args) companion.getArgs(savedStateHandle)).getKey().isLegContext(), null, 0L, null, null, null, null, null, ((OptionsSimulatedReturnFragment.Args) companion.getArgs(savedStateHandle)).getKey().getUseWatchlist(), 0, ((OptionsSimulatedReturnFragment.Args) companion.getArgs(savedStateHandle)).getKey().getStrategyCode(), 392639, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.equityInstrumentStore = equityInstrumentStore;
        this.eventLogger = eventLogger;
        this.indexStore = indexStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.optionPositionStore = optionPositionStore;
        this.optionTooltipStore = optionTooltipStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.showSimulatedReturnDollarUnitPref = showSimulatedReturnDollarUnitPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237291(null), 3, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C237362(null));
        Companion companion = INSTANCE;
        final Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow = OptionsDetailPageDuxoHelper.getUiStrategyInfoToIndexFlow(FlowKt.flowOf(Tuples4.m3642to(((OptionsSimulatedReturnFragment.Args) companion.getArgs((HasSavedState) this)).getKey().getStrategyCode(), 0)), this.optionStrategyInfoStore);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237373(uiStrategyInfoToIndexFlow, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237384(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237395(null));
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(((OptionsSimulatedReturnFragment.Args) companion.getArgs((HasSavedState) this)).getKey().getFixedAccountNumber())), Integer.MAX_VALUE, null, 2, null);
        Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> uiAggregateOptionPositionToIndexFlow = OptionsDetailPageDuxoHelper.getUiAggregateOptionPositionToIndexFlow(new Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiStrategyInfoToIndexFlow.collect(new C237072(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$1$2 */
            public static final class C237072<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return C237072.this.emit(null, this);
                    }
                }

                public C237072(FlowCollector flowCollector, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = optionsSimulatedReturnDuxo;
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
                        if (!((UiOptionStrategyInfo) ((Tuples2) obj).getFirst()).isSingleLeg() || !((OptionsSimulatedReturnFragment.Args) OptionsSimulatedReturnDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getKey().isLegContext()) {
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
        }, FlowKt.flowOf(Tuples4.m3642to(Tuples4.m3642to(((OptionsSimulatedReturnFragment.Args) companion.getArgs((HasSavedState) this)).getKey().getFixedAccountNumber(), ((OptionsSimulatedReturnFragment.Args) companion.getArgs((HasSavedState) this)).getKey().getStrategyCode()), 0)), this.aggregateOptionPositionStore);
        Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> uiOptionInstrumentPositionToIndexFlow = OptionsDetailPageDuxoHelper.getUiOptionInstrumentPositionToIndexFlow(new Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiStrategyInfoToIndexFlow.collect(new C237082(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$2$2 */
            public static final class C237082<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$2$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$filter$2$2$1, reason: invalid class name */
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
                        return C237082.this.emit(null, this);
                    }
                }

                public C237082(FlowCollector flowCollector, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = optionsSimulatedReturnDuxo;
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
                        if (((UiOptionStrategyInfo) ((Tuples2) obj).getFirst()).isSingleLeg() && ((OptionsSimulatedReturnFragment.Args) OptionsSimulatedReturnDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getKey().isLegContext()) {
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
        }, FlowKt.flowOf(((OptionsSimulatedReturnFragment.Args) companion.getArgs((HasSavedState) this)).getKey().getFixedAccountNumber()), this.optionPositionStore);
        Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> curatedListItemToUiStrategyInfoToIndexFlow = OptionsDetailPageDuxoHelper.getCuratedListItemToUiStrategyInfoToIndexFlow(FlowKt.flowOf(Tuples4.m3642to(Boolean.FALSE, 0)), uiStrategyInfoToIndexFlow, new Flow<Tuples2<? extends Account, ? extends Integer>>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Account, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C237092(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$map$1$2 */
            public static final class C237092<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$map$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C237092.this.emit(null, this);
                    }
                }

                public C237092(FlowCollector flowCollector) {
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
                        Tuples2 tuples2M3642to = Tuples4.m3642to((Account) obj, boxing.boxInt(0));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
        }, this.optionsWatchlistStore);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237406(uiAggregateOptionPositionToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237417(uiOptionInstrumentPositionToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237428(curatedListItemToUiStrategyInfoToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C237439(uiStrategyInfoToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2373010(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2373111(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2373212(uiAggregateOptionPositionToIndexFlow, uiOptionInstrumentPositionToIndexFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2373313(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2373414(flowBuffer$default, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2373515(null));
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$1 */
    static final class C237291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237291(Continuation<? super C237291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionsSimulatedReturnDuxo.this.showSimulatedReturnDollarUnitPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showChartInDollarUnit", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
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

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$1$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503421 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ boolean $showChartInDollarUnit;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503421(boolean z, Continuation<? super C503421> continuation) {
                    super(2, continuation);
                    this.$showChartInDollarUnit = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503421 c503421 = new C503421(this.$showChartInDollarUnit, continuation);
                    c503421.L$0 = obj;
                    return c503421;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503421) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, this.$showChartInDollarUnit ? OptionsSimulatedReturnChartViewState3.DOLLAR : OptionsSimulatedReturnChartViewState3.PERCENT, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1048571, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503421(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$2 */
    static final class C237362 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237362(Continuation<? super C237362> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237362(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionsSimulatedReturnDuxo.this.accountProvider.streamAllSelfDirectedAccounts()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accounts", "", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$2$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends Account>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, Continuation<? super Unit> continuation) {
                return invoke2((List<Account>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<Account> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$2$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503461 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ List<Account> $accounts;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503461(List<Account> list, Continuation<? super C503461> continuation) {
                    super(2, continuation);
                    this.$accounts = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503461 c503461 = new C503461(this.$accounts, continuation);
                    c503461.L$0 = obj;
                    return c503461;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503461) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, this.$accounts, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1048573, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503461((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3 */
    static final class C237373 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237373(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, Continuation<? super C237373> continuation) {
            super(2, continuation);
            this.$strategyInfoFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237373(this.$strategyInfoFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237373) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.take(FlowKt.transformLatest(new Flow<OptionsSimulatedReturnViewState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnViewState optionsSimulatedReturnViewState = (OptionsSimulatedReturnViewState) obj;
                                if (optionsSimulatedReturnViewState.getNuxInfoTooltip() == null && optionsSimulatedReturnViewState.getNuxSliderTooltip() == null) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C23716x8bc628a(null, this.$strategyInfoFlow)), 1), new C23717x8bc628b(null, OptionsSimulatedReturnDuxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(OptionsSimulatedReturnDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OptionTooltip;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$4", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionTooltip, ? extends OptionTooltip>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionTooltip, ? extends OptionTooltip> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<OptionTooltip, OptionTooltip>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<OptionTooltip, OptionTooltip> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$4$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ OptionTooltip $infoTooltip;
                final /* synthetic */ OptionTooltip $sliderTooltip;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionTooltip optionTooltip, OptionTooltip optionTooltip2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sliderTooltip = optionTooltip;
                    this.$infoTooltip = optionTooltip2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sliderTooltip, this.$infoTooltip, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, this.$sliderTooltip, this.$infoTooltip, null, null, null, false, 0, null, 1036287, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1((OptionTooltip) tuples2.component1(), (OptionTooltip) tuples2.component2(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4 */
    static final class C237384 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237384(Continuation<? super C237384> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237384(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237384) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionTooltip>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionTooltip> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionTooltip nuxSliderTooltip = ((OptionsSimulatedReturnViewState) obj).getNuxSliderTooltip();
                                if (nuxSliderTooltip != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(nuxSliderTooltip, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "nuxSliderTooltip", "Lcom/robinhood/models/db/OptionTooltip;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {144}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionTooltip, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionTooltip optionTooltip, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionTooltip, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionTooltip optionTooltip = (OptionTooltip) this.L$0;
                    this.this$0.onTooltipAppear(optionTooltip.getReceiptId(), OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_SLIDER_TOOLTIP_IDENTIFIER);
                    OptionTooltipDisplayBehavior displayBehavior = optionTooltip.getDisplayBehavior();
                    Long displayMilliseconds = displayBehavior != null ? displayBehavior.getDisplayMilliseconds() : null;
                    if (displayMilliseconds != null) {
                        long jLongValue = displayMilliseconds.longValue();
                        this.label = 1;
                        if (DelayKt.delay(jLongValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$2$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$4$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
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
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1044479, null);
                }
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5 */
    static final class C237395 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237395(Continuation<? super C237395> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237395(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237395) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionTooltip>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionTooltip> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionTooltip nuxInfoTooltip = ((OptionsSimulatedReturnViewState) obj).getNuxInfoTooltip();
                                if (nuxInfoTooltip != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(nuxInfoTooltip, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "nuxInfoTooltip", "Lcom/robinhood/models/db/OptionTooltip;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionTooltip, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionTooltip optionTooltip, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionTooltip, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionTooltip optionTooltip = (OptionTooltip) this.L$0;
                    this.this$0.onTooltipAppear(optionTooltip.getReceiptId(), OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_INFO_TOOLTIP_IDENTIFIER);
                    OptionTooltipDisplayBehavior displayBehavior = optionTooltip.getDisplayBehavior();
                    Long displayMilliseconds = displayBehavior != null ? displayBehavior.getDisplayMilliseconds() : null;
                    if (displayMilliseconds != null) {
                        long jLongValue = displayMilliseconds.longValue();
                        this.label = 1;
                        if (DelayKt.delay(jLongValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$2$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$5$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
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
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1040383, null);
                }
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$6", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$6 */
    static final class C237406 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
        int label;
        final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C237406(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super C237406> continuation) {
            super(2, continuation);
            this.$uiAggregateOptionPositionFlow = flow;
            this.this$0 = optionsSimulatedReturnDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C237406(this.$uiAggregateOptionPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237406) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$6$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiAggregateOptionPositionFull>, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
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

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$6$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503471 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ Optional<UiAggregateOptionPositionFull> $uiPosition;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503471(Optional<UiAggregateOptionPositionFull> optional, Continuation<? super C503471> continuation) {
                    super(2, continuation);
                    this.$uiPosition = optional;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503471 c503471 = new C503471(this.$uiPosition, continuation);
                    c503471.L$0 = obj;
                    return c503471;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503471) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, this.$uiPosition.getOrNull(), null, null, false, 0, null, 1032191, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503471((Optional) ((Tuples2) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$7", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$7 */
    static final class C237417 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
        int label;
        final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C237417(Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super C237417> continuation) {
            super(2, continuation);
            this.$uiOptionInstrumentPositionFlow = flow;
            this.this$0 = optionsSimulatedReturnDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C237417(this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237417) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$7$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiOptionInstrumentPosition>, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
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

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$7$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503481 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ Optional<UiOptionInstrumentPosition> $uiPosition;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503481(Optional<UiOptionInstrumentPosition> optional, Continuation<? super C503481> continuation) {
                    super(2, continuation);
                    this.$uiPosition = optional;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503481 c503481 = new C503481(this.$uiPosition, continuation);
                    c503481.L$0 = obj;
                    return c503481;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503481) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, this.$uiPosition.getOrNull(), null, false, 0, null, 1015807, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503481((Optional) ((Tuples2) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8 */
    static final class C237428 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> $curatedListItemToUiStrategyInfoFlow;
        int label;
        final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C237428(Flow<? extends Tuples2<? extends Tuples2<? extends Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> flow, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super C237428> continuation) {
            super(2, continuation);
            this.$curatedListItemToUiStrategyInfoFlow = flow;
            this.this$0 = optionsSimulatedReturnDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C237428(this.$curatedListItemToUiStrategyInfoFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237428) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> flow = this.$curatedListItemToUiStrategyInfoFlow;
                Flow<CuratedListItem> flow2 = new Flow<CuratedListItem>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CuratedListItem> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Object orNull = ((Optional) ((Tuples2) ((Tuples2) obj).getFirst()).getFirst()).getOrNull();
                                if (orNull != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CuratedListItem, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CuratedListItem curatedListItem, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(curatedListItem, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$2$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$8$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ CuratedListItem $curatedListItem;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CuratedListItem curatedListItem, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$curatedListItem = curatedListItem;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$curatedListItem, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, this.$curatedListItem, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1048567, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((CuratedListItem) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$9", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$9 */
    static final class C237439 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
        int label;
        final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237439(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super C237439> continuation) {
            super(2, continuation);
            this.$strategyInfoFlow = flow;
            this.this$0 = optionsSimulatedReturnDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C237439(this.$strategyInfoFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237439) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$9$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
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

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$9$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503491 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ UiOptionStrategyInfo $uiStrategyInfo;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503491(UiOptionStrategyInfo uiOptionStrategyInfo, Continuation<? super C503491> continuation) {
                    super(2, continuation);
                    this.$uiStrategyInfo = uiOptionStrategyInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503491 c503491 = new C503491(this.$uiStrategyInfo, continuation);
                    c503491.L$0 = obj;
                    return c503491;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503491) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, this.$uiStrategyInfo, false, 0, null, 983039, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503491((UiOptionStrategyInfo) ((Tuples2) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10 */
    static final class C2373010 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2373010(Continuation<? super C2373010> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C2373010(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2373010) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                UUID equityInstrumentId = ((OptionsSimulatedReturnViewState) obj).getEquityInstrumentId();
                                if (equityInstrumentId != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(equityInstrumentId, anonymousClass1) == coroutine_suspended) {
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
                }), new C23710x720c3980(null, OptionsSimulatedReturnDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$3", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$3$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$10$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ Instrument $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Instrument instrument, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = instrument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, this.$it, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1048559, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Instrument) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11 */
    static final class C2373111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2373111(Continuation<? super C2373111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C2373111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2373111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                UUID indexInstrumentId = ((OptionsSimulatedReturnViewState) obj).getIndexInstrumentId();
                                if (indexInstrumentId != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(indexInstrumentId, anonymousClass1) == coroutine_suspended) {
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
                }), new C23712xc92a2a5f(null, OptionsSimulatedReturnDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$3", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Index, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Index index, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(index, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$3$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$11$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ Index $index;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Index index, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$index = index;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$index, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, this.$index, false, null, 0L, null, null, null, null, null, false, 0, null, 1048319, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Index) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$12", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$12 */
    static final class C2373212 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
        final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
        int label;
        final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2373212(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow2, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super C2373212> continuation) {
            super(2, continuation);
            this.$uiAggregateOptionPositionFlow = flow;
            this.$uiOptionInstrumentPositionFlow = flow2;
            this.this$0 = optionsSimulatedReturnDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2373212(this.$uiAggregateOptionPositionFlow, this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2373212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Boolean, Integer>> hasRealPositionToIndexFlow = OptionsDetailPageDuxoHelper.getHasRealPositionToIndexFlow(this.$uiAggregateOptionPositionFlow, this.$uiOptionInstrumentPositionFlow);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(hasRealPositionToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$12$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$12$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
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

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$12$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$12$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503431 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ boolean $hasRealPosition;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503431(boolean z, Continuation<? super C503431> continuation) {
                    super(2, continuation);
                    this.$hasRealPosition = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503431 c503431 = new C503431(this.$hasRealPosition, continuation);
                    c503431.L$0 = obj;
                    return c503431;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503431) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, boxing.boxBoolean(this.$hasRealPosition), null, false, null, 0L, null, null, null, null, null, false, 0, null, 1048447, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503431(((Boolean) ((Tuples2) this.L$0).component1()).booleanValue(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$13", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$13 */
    static final class C2373313 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2373313(Continuation<? super C2373313> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C2373313(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2373313) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<Boolean, Integer>> isWatchingToIndexFlow = OptionsDetailPageDuxoHelper.getIsWatchingToIndexFlow(FlowKt.flowOf(Tuples4.m3642to(((OptionsSimulatedReturnFragment.Args) OptionsSimulatedReturnDuxo.INSTANCE.getArgs((HasSavedState) OptionsSimulatedReturnDuxo.this)).getKey().getStrategyCode(), boxing.boxInt(0))), OptionsSimulatedReturnDuxo.this.optionsWatchlistStore);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsSimulatedReturnDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(isWatchingToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$13$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$13$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
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

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$13$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$13$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503441 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ boolean $isWatching;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503441(boolean z, Continuation<? super C503441> continuation) {
                    super(2, continuation);
                    this.$isWatching = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503441 c503441 = new C503441(this.$isWatching, continuation);
                    c503441.L$0 = obj;
                    return c503441;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503441) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, boxing.boxBoolean(this.$isWatching), 0L, null, null, null, null, null, false, 0, null, 1047551, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503441(((Boolean) ((Tuples2) this.L$0).component1()).booleanValue(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$14", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$14 */
    static final class C2373414 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $accountFlow;
        int label;
        final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2373414(Flow<Account> flow, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super C2373414> continuation) {
            super(2, continuation);
            this.$accountFlow = flow;
            this.this$0 = optionsSimulatedReturnDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2373414(this.$accountFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2373414) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$14$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$14$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$14$1$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$14$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503451 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
                final /* synthetic */ Account $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503451(Account account, Continuation<? super C503451> continuation) {
                    super(2, continuation);
                    this.$it = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503451 c503451 = new C503451(this.$it, continuation);
                    c503451.L$0 = obj;
                    return c503451;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((C503451) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, this.$it.getBrokerageAccountType(), null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1048574, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503451((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Account> flow = this.$accountFlow;
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

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {280}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15 */
    static final class C2373515 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2373515(Continuation<? super C2373515> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C2373515(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2373515) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnAppear(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0);
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: OptionsSimulatedReturnDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$2$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$15$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
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
                public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
                    return ((AnonymousClass1) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, Clock2.INSTANCE.now().toEpochMilliseconds(), null, null, null, null, null, false, 0, null, 1046527, null);
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237501(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1 */
    static final class C237501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237501(Continuation<? super C237501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onStop$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnDisappear(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1 */
    static final class C237281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237281(Continuation<? super C237281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<Tuples2<? extends OptionsSimulatedReturnChartViewState3, ? extends OptionsSimulatedReturnLoggingState>>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends OptionsSimulatedReturnChartViewState3, ? extends OptionsSimulatedReturnLoggingState>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnViewState optionsSimulatedReturnViewState = (OptionsSimulatedReturnViewState) obj;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(optionsSimulatedReturnViewState.getChartType(), optionsSimulatedReturnViewState.getLoggingState());
                                if (tuples2M3642to != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onChartTypeIconClicked$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionsSimulatedReturnChartViewState3, ? extends OptionsSimulatedReturnLoggingState>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionsSimulatedReturnChartViewState3, ? extends OptionsSimulatedReturnLoggingState> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends OptionsSimulatedReturnChartViewState3, OptionsSimulatedReturnLoggingState>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends OptionsSimulatedReturnChartViewState3, OptionsSimulatedReturnLoggingState> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3 = (OptionsSimulatedReturnChartViewState3) tuples2.component1();
                    OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = (OptionsSimulatedReturnLoggingState) tuples2.component2();
                    if (optionsSimulatedReturnLoggingState != null) {
                        OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnButtonTap(this.this$0.eventLogger, optionsSimulatedReturnLoggingState, optionsSimulatedReturnChartViewState3.getButtonIdentifier());
                    }
                    this.this$0.showSimulatedReturnDollarUnitPref.set(!this.this$0.showSimulatedReturnDollarUnitPref.get());
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onChartTypeIconClicked() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237281(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$1 */
    static final class C237481 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C237481(Continuation<? super C237481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C237481 c237481 = new C237481(continuation);
            c237481.L$0 = obj;
            return c237481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
            return ((C237481) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1044479, null);
        }
    }

    public final void onSliderTooltipClicked() {
        applyMutation(new C237481(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237492(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2 */
    static final class C237492 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237492(Continuation<? super C237492> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237492(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237492) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onSliderTooltipClicked$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnTooltipTap(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0, OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_SLIDER_TOOLTIP_IDENTIFIER);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {331}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1 */
    static final class C237451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237451(Continuation<? super C237451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconClicked$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnButtonTap(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0, OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_INFO_ICON_IDENTIFIER);
                return Unit.INSTANCE;
            }
        }
    }

    public final void onInfoIconClicked() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237451(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$1 */
    static final class C237461 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C237461(Continuation<? super C237461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C237461 c237461 = new C237461(continuation);
            c237461.L$0 = obj;
            return c237461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
            return ((C237461) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1040383, null);
        }
    }

    public final void onInfoIconTooltipClicked() {
        applyMutation(new C237461(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237472(null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {346}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2 */
    static final class C237472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237472(Continuation<? super C237472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onInfoIconTooltipClicked$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnTooltipTap(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0, OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_INFO_TOOLTIP_IDENTIFIER);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {359}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1 */
    static final class C237511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C237511(Continuation<? super C237511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onToolbarMenuItemTapped$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnButtonTap(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0, OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_VIEW_UNDERLIER_IDENTIFIER);
                return Unit.INSTANCE;
            }
        }
    }

    public final void onToolbarMenuItemTapped() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237511(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTooltipAppear(String receiptId, String tooltipIdentifier) {
        this.optionTooltipStore.recordOptionTooltipSeen(receiptId, ((OptionsSimulatedReturnFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getKey().getFixedAccountNumber());
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C237521(tooltipIdentifier, null), 3, null);
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {374}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1 */
    static final class C237521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $tooltipIdentifier;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237521(String str, Continuation<? super C237521> continuation) {
            super(2, continuation);
            this.$tooltipIdentifier = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSimulatedReturnDuxo.this.new C237521(this.$tooltipIdentifier, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C237521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSimulatedReturnViewState> stateFlow = OptionsSimulatedReturnDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsSimulatedReturnViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSimulatedReturnDuxo.this, this.$tooltipIdentifier, null);
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

        /* compiled from: OptionsSimulatedReturnDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTooltipAppear$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $tooltipIdentifier;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSimulatedReturnDuxo;
                this.$tooltipIdentifier = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$tooltipIdentifier, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnTooltipAppear(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0, this.$tooltipIdentifier);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTradebarHeightUpdated$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onTradebarHeightUpdated$1 */
    static final class C237531 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
        final /* synthetic */ int $newHeight;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237531(int i, Continuation<? super C237531> continuation) {
            super(2, continuation);
            this.$newHeight = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C237531 c237531 = new C237531(this.$newHeight, continuation);
            c237531.L$0 = obj;
            return c237531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
            return ((C237531) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, null, 0L, null, null, null, null, null, false, this.$newHeight, null, 786431, null);
        }
    }

    public final void onTradebarHeightUpdated(int newHeight) {
        applyMutation(new C237531(newHeight, null));
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onEstimatedContractPriceUpdated$1", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onEstimatedContractPriceUpdated$1 */
    static final class C237441 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState>, Object> {
        final /* synthetic */ Double $newPrice;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C237441(Double d, Continuation<? super C237441> continuation) {
            super(2, continuation);
            this.$newPrice = d;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C237441 c237441 = new C237441(this.$newPrice, continuation);
            c237441.L$0 = obj;
            return c237441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsSimulatedReturnDataState optionsSimulatedReturnDataState, Continuation<? super OptionsSimulatedReturnDataState> continuation) {
            return ((C237441) create(optionsSimulatedReturnDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsSimulatedReturnDataState.copy$default((OptionsSimulatedReturnDataState) this.L$0, null, null, null, null, null, this.$newPrice, null, null, null, false, null, 0L, null, null, null, null, null, false, 0, null, 1048543, null);
        }
    }

    public final void onEstimatedContractPriceUpdated(Double newPrice) {
        applyMutation(new C237441(newPrice, null));
    }

    /* compiled from: OptionsSimulatedReturnDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnDuxo;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment$Args;", "<init>", "()V", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionsSimulatedReturnDuxo, OptionsSimulatedReturnFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsSimulatedReturnFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionsSimulatedReturnFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsSimulatedReturnFragment.Args getArgs(OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo) {
            return (OptionsSimulatedReturnFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionsSimulatedReturnDuxo);
        }
    }
}
