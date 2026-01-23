package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.options.portfolioriskanalyzer.extensions.Flow5;
import com.robinhood.android.options.portfolioriskanalyzer.extensions.UtilsKt;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002=>Ba\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00102\u001a\u000203H\u0016J\u000e\u00104\u001a\u0002032\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u000203J\u001e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;J \u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0#0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000RD\u0010(\u001a8\u00124\u00122\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*0)0&X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*0&X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010.\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*0&X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002010*00X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDataState;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo$Args;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pnlFlowMap", "", "Ljava/util/UUID;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;", "accountFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/models/db/Account;", "underlyingIdToAggregateOptionPositionsFlow", "Lkotlin/Pair;", "", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "equityUnderlyingIdToAggregateOptionPositionsFlow", "indexUnderlyingIdToAggregateOptionPositionsFlow", "equityUnderlyingIdToEquityPositionFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Position;", "onCreate", "", "query", "newQuery", "", "clearQuery", "pnlFlow", "underlyingId", "isEquity", "", "getPnlFlow", "Args", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerSearchDuxo extends BaseDuxo<OptionsPortfolioRiskAnalyzerSearchDataState, OptionsPortfolioRiskAnalyzerSearchViewState> implements HasArgs<Args> {
    private final SharedFlow<Account> accountFlow;
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final AggregateOptionQuoteStore aggregateOptionQuoteStore;
    private final SharedFlow<Map<UUID, List<UiAggregateOptionPositionFull>>> equityUnderlyingIdToAggregateOptionPositionsFlow;
    private final Flow<Map<UUID, Position>> equityUnderlyingIdToEquityPositionFlow;
    private final IndexStore indexStore;
    private final SharedFlow<Map<UUID, List<UiAggregateOptionPositionFull>>> indexUnderlyingIdToAggregateOptionPositionsFlow;
    private final InstrumentStore instrumentStore;
    private final Map<UUID, StateFlow<PnLUiState>> pnlFlowMap;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;
    private final SharedFlow<Tuples2<Map<UUID, List<UiAggregateOptionPositionFull>>, Map<UUID, List<UiAggregateOptionPositionFull>>>> underlyingIdToAggregateOptionPositionsFlow;
    private final UnrealizedProfitAndLossStore unrealizedProfitAndLossStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public Args getArgs(SavedStateHandle savedStateHandle) {
        return (Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsPortfolioRiskAnalyzerSearchDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionQuoteStore aggregateOptionQuoteStore, IndexStore indexStore, InstrumentStore instrumentStore, PositionStore positionStore, QuoteStore quoteStore, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, OptionsPortfolioRiskAnalyzerSearchStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionsPortfolioRiskAnalyzerSearchDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.aggregateOptionQuoteStore = aggregateOptionQuoteStore;
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.unrealizedProfitAndLossStore = unrealizedProfitAndLossStore;
        this.savedStateHandle = savedStateHandle;
        this.pnlFlowMap = new LinkedHashMap();
        Companion companion = INSTANCE;
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(accountProvider.streamAccount(((Args) companion.getArgs((HasArgs) this)).getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        SharingStarted.Companion companion2 = SharingStarted.INSTANCE;
        this.accountFlow = FlowKt.shareIn(flowBuffer$default, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion2, 0L, 0L, 3, null), 1);
        final SharedFlow<Tuples2<Map<UUID, List<UiAggregateOptionPositionFull>>, Map<UUID, List<UiAggregateOptionPositionFull>>>> sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.mapLatest(aggregateOptionPositionStore.streamUiAggregateOptionPositionsFlow(((Args) companion.getArgs((HasArgs) this)).getAccountNumber()), new C23614x4a53ba59(null))), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion2, 0L, 0L, 3, null), 1);
        this.underlyingIdToAggregateOptionPositionsFlow = sharedFlowShareIn;
        final SharedFlow<Map<UUID, List<UiAggregateOptionPositionFull>>> sharedFlowShareIn2 = FlowKt.shareIn(new Flow<Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$1$2 */
            public static final class C235972<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$1$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C235972.this.emit(null, this);
                    }
                }

                public C235972(FlowCollector flowCollector) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlowShareIn.collect(new C235972(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion2, 0L, 0L, 3, null), 1);
        this.equityUnderlyingIdToAggregateOptionPositionsFlow = sharedFlowShareIn2;
        this.indexUnderlyingIdToAggregateOptionPositionsFlow = FlowKt.shareIn(new Flow<Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$2$2 */
            public static final class C235982<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$2$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C235982.this.emit(null, this);
                    }
                }

                public C235982(FlowCollector flowCollector) {
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
                        Object second = ((Tuples2) obj).getSecond();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(second, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends List<? extends UiAggregateOptionPositionFull>>> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlowShareIn.collect(new C235982(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion2, 0L, 0L, 3, null), 1);
        this.equityUnderlyingIdToEquityPositionFlow = FlowKt.distinctUntilChanged(FlowKt.mapLatest(FlowKt.transformLatest(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlowShareIn2.collect(new C235992(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$3$2 */
            public static final class C235992<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$3$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$special$$inlined$map$3$2$1, reason: invalid class name */
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
                        return C235992.this.emit(null, this);
                    }
                }

                public C235992(FlowCollector flowCollector) {
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
                        List list = CollectionsKt.toList(((Map) obj).keySet());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
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
        }, new C23596x34933f3a(null, this)), new C23601x116cab98(null)));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C236081(null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1 */
    static final class C236081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C236081(Continuation<? super C236081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsPortfolioRiskAnalyzerSearchDuxo.this.new C236081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C236081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final SharedFlow sharedFlow = OptionsPortfolioRiskAnalyzerSearchDuxo.this.equityUnderlyingIdToAggregateOptionPositionsFlow;
                Flow flowMapLatest = FlowKt.mapLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                        Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                List list = CollectionsKt.toList(((Map) obj).keySet());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
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
                }, new C23592xcd1f8201(null, OptionsPortfolioRiskAnalyzerSearchDuxo.this))), new C23609xfcea8486(null));
                final SharedFlow sharedFlow2 = OptionsPortfolioRiskAnalyzerSearchDuxo.this.indexUnderlyingIdToAggregateOptionPositionsFlow;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(FlowKt.combine(OptionsPortfolioRiskAnalyzerSearchDuxo.this.equityUnderlyingIdToAggregateOptionPositionsFlow, OptionsPortfolioRiskAnalyzerSearchDuxo.this.equityUnderlyingIdToEquityPositionFlow, flowMapLatest, new C23610x980de512(null)), FlowKt.combine(OptionsPortfolioRiskAnalyzerSearchDuxo.this.indexUnderlyingIdToAggregateOptionPositionsFlow, FlowKt.mapLatest(FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                        Object objCollect = sharedFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                List list = CollectionsKt.toList(((Map) obj).keySet());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
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
                }, new C23593xcd1f8202(null, OptionsPortfolioRiskAnalyzerSearchDuxo.this))), new C23611x566933c7(null)), new C23612xa8310bd3(null)), new AnonymousClass1(null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsPortfolioRiskAnalyzerSearchDuxo.this, null);
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

        /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/SearchRowItemDataState;", "equityUnderlyingsRowDataState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/EquityRowItemDataState;", "indexUnderlyingsRowDataState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/IndexRowItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<List<? extends EquityRowItemDataState>, List<? extends IndexRowItemDataState>, Continuation<? super List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(List<? extends EquityRowItemDataState> list, List<? extends IndexRowItemDataState> list2, Continuation<? super List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4>> continuation) {
                return invoke2((List<EquityRowItemDataState>) list, (List<IndexRowItemDataState>) list2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<EquityRowItemDataState> list, List<IndexRowItemDataState> list2, Continuation<? super List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = list;
                anonymousClass1.L$1 = list2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CollectionsKt.sortedWith(CollectionsKt.plus((Collection) this.L$0, (Iterable) this.L$1), new Comparator() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((OptionsPortfolioRiskAnalyzerSearchDataState4) t).getDisplayName(), ((OptionsPortfolioRiskAnalyzerSearchDataState4) t2).getDisplayName());
                    }
                });
            }
        }

        /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "searchRowItemsDataState", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/SearchRowItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsPortfolioRiskAnalyzerSearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsPortfolioRiskAnalyzerSearchDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$2$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerSearchDataState, Continuation<? super OptionsPortfolioRiskAnalyzerSearchDataState>, Object> {
                final /* synthetic */ List<OptionsPortfolioRiskAnalyzerSearchDataState4> $searchRowItemsDataState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$searchRowItemsDataState = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$searchRowItemsDataState, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsPortfolioRiskAnalyzerSearchDataState optionsPortfolioRiskAnalyzerSearchDataState, Continuation<? super OptionsPortfolioRiskAnalyzerSearchDataState> continuation) {
                    return ((AnonymousClass1) create(optionsPortfolioRiskAnalyzerSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsPortfolioRiskAnalyzerSearchDataState.copy$default((OptionsPortfolioRiskAnalyzerSearchDataState) this.L$0, null, null, this.$searchRowItemsDataState, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$query$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$query$1 */
    static final class C236131 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerSearchDataState, Continuation<? super OptionsPortfolioRiskAnalyzerSearchDataState>, Object> {
        final /* synthetic */ String $newQuery;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C236131(String str, Continuation<? super C236131> continuation) {
            super(2, continuation);
            this.$newQuery = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C236131 c236131 = new C236131(this.$newQuery, continuation);
            c236131.L$0 = obj;
            return c236131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerSearchDataState optionsPortfolioRiskAnalyzerSearchDataState, Continuation<? super OptionsPortfolioRiskAnalyzerSearchDataState> continuation) {
            return ((C236131) create(optionsPortfolioRiskAnalyzerSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsPortfolioRiskAnalyzerSearchDataState.copy$default((OptionsPortfolioRiskAnalyzerSearchDataState) this.L$0, null, this.$newQuery, null, 5, null);
        }
    }

    public final void query(String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        applyMutation(new C236131(newQuery, null));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$clearQuery$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$clearQuery$1 */
    static final class C236001 extends ContinuationImpl7 implements Function2<OptionsPortfolioRiskAnalyzerSearchDataState, Continuation<? super OptionsPortfolioRiskAnalyzerSearchDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C236001(Continuation<? super C236001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C236001 c236001 = new C236001(continuation);
            c236001.L$0 = obj;
            return c236001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsPortfolioRiskAnalyzerSearchDataState optionsPortfolioRiskAnalyzerSearchDataState, Continuation<? super OptionsPortfolioRiskAnalyzerSearchDataState> continuation) {
            return ((C236001) create(optionsPortfolioRiskAnalyzerSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionsPortfolioRiskAnalyzerSearchDataState.copy$default((OptionsPortfolioRiskAnalyzerSearchDataState) this.L$0, null, "", null, 5, null);
        }
    }

    public final void clearQuery() {
        applyMutation(new C236001(null));
    }

    public final StateFlow<PnLUiState> pnlFlow(UUID underlyingId, boolean isEquity) {
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Map<UUID, StateFlow<PnLUiState>> map = this.pnlFlowMap;
        StateFlow<PnLUiState> pnlFlow = map.get(underlyingId);
        if (pnlFlow == null) {
            pnlFlow = getPnlFlow(underlyingId, isEquity);
            map.put(underlyingId, pnlFlow);
        }
        return pnlFlow;
    }

    private final StateFlow<PnLUiState> getPnlFlow(final UUID underlyingId, boolean isEquity) {
        final SharedFlow<Map<UUID, List<UiAggregateOptionPositionFull>>> sharedFlow = this.equityUnderlyingIdToAggregateOptionPositionsFlow;
        Flow<List<? extends UiAggregateOptionPositionFull>> flow = new Flow<List<? extends UiAggregateOptionPositionFull>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UiAggregateOptionPositionFull>> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlow.collect(new C235892(flowCollector, underlyingId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$1$2 */
            public static final class C235892<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ UUID $underlyingId$inlined;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$1$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C235892.this.emit(null, this);
                    }
                }

                public C235892(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$underlyingId$inlined = uuid;
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
                        List listEmptyList = (List) ((Map) obj).get(this.$underlyingId$inlined);
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(listEmptyList, anonymousClass1) == coroutine_suspended) {
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
        };
        final SharedFlow<Map<UUID, List<UiAggregateOptionPositionFull>>> sharedFlow2 = this.indexUnderlyingIdToAggregateOptionPositionsFlow;
        Flow<? extends List<? extends UiAggregateOptionPosition>> flowCombine = FlowKt.combine(flow, new Flow<List<? extends UiAggregateOptionPositionFull>>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UiAggregateOptionPositionFull>> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlow2.collect(new C235902(flowCollector, underlyingId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$2$2 */
            public static final class C235902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ UUID $underlyingId$inlined;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$2$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C235902.this.emit(null, this);
                    }
                }

                public C235902(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$underlyingId$inlined = uuid;
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
                        List listEmptyList = (List) ((Map) obj).get(this.$underlyingId$inlined);
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(listEmptyList, anonymousClass1) == coroutine_suspended) {
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
        }, new C23603xc3a3ebdc(null));
        Flow flowCombine2 = FlowKt.combine(this.accountFlow, flowCombine, this.aggregateOptionQuoteStore.pollAndStreamMap(flowCombine), new C23605x45a0eef4(null));
        if (isEquity) {
            return FlowKt.stateIn(FlowKt.combine(FlowKt.mapLatest(FlowKt.distinctUntilChanged(FlowKt.onStart(Flow5.withFallbackAfter(this.unrealizedProfitAndLossStore.getUnrealizedProfitAndLossDataForInstrument(((Args) INSTANCE.getArgs((HasArgs) this)).getAccountNumber(), underlyingId), 2000L, new C23606xf2b9cfe1(null)), new C23607xf2b9cfe2(null))), new C23604x66b2c17b(null)), flowCombine2, new C236021(null)), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 1000L, 0L, 2, null), null);
        }
        return FlowKt.stateIn(flowCombine2, getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 1000L, 0L, 2, null), null);
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;", "equityPnL", "optionPnL"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$1 */
    static final class C236021 extends ContinuationImpl7 implements Function3<PnLUiState, PnLUiState, Continuation<? super PnLUiState>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C236021(Continuation<? super C236021> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PnLUiState pnLUiState, PnLUiState pnLUiState2, Continuation<? super PnLUiState> continuation) {
            C236021 c236021 = new C236021(continuation);
            c236021.L$0 = pnLUiState;
            c236021.L$1 = pnLUiState2;
            return c236021.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PnLUiState pnLUiState = (PnLUiState) this.L$0;
            PnLUiState pnLUiState2 = (PnLUiState) this.L$1;
            return new PnLUiState(UtilsKt.sumOrNull(pnLUiState.getPnlNumeric(), pnLUiState2.getPnlNumeric()), UtilsKt.sumOrNull(pnLUiState.getPnlPercentage(), pnLUiState2.getPnlPercentage()));
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.accountNumber, ((Args) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public Args(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo$Args;", "<init>", "()V", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<OptionsPortfolioRiskAnalyzerSearchDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public Args getArgs(OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo) {
            return (Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, optionsPortfolioRiskAnalyzerSearchDuxo);
        }
    }
}
