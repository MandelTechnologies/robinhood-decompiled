package com.robinhood.android.listsoptions.optionwatchlist;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentFragment;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.OptionHistoricalStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedList3;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.models.p355ui.UiOptionHistorical;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.Instant;

/* compiled from: OptionWatchlistHubContentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000289Ba\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010#\u001a\u00020$H\u0016J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020 J\u0016\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u00020$2\u0006\u00100\u001a\u0002012\u0006\u00103\u001a\u00020)J\b\u00104\u001a\u00020$H\u0002J\u000e\u00105\u001a\u00020$2\u0006\u00100\u001a\u000201J\u000e\u00106\u001a\u00020$2\u0006\u00100\u001a\u000201J\u000e\u00107\u001a\u00020$2\u0006\u00100\u001a\u000201R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "eligibleItemsFetcher", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "optionHistoricalStore", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/OptionHistoricalStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "graphSelectionRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/ui/GraphSelection;", "selectedItemIndexRelay", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentDuxo$WatchlistIndex;", "onCreate", "", "setGraphSelection", "graphSelection", "setSelectedRowIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "isExpired", "", "sortList", "sortOption", "Lcom/robinhood/models/ui/SortOption;", "synchronizeListDeleteItem", "strategyCode", "", "synchronizeActiveListPositionChange", "newPosition", "onQuoteLoaded", "logActiveRowTap", "logExpiredDialogAppear", "logExpiredDialogDisappear", "WatchlistIndex", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OptionWatchlistHubContentDuxo extends OldBaseDuxo<OptionWatchlistHubContentViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final CuratedListEligibleItemsFetcher eligibleItemsFetcher;
    private final EventLogger eventLogger;
    private final BehaviorRelay<GraphSelection> graphSelectionRelay;
    private final TraderMarketHoursManager marketHoursManager;
    private final OptionHistoricalStore optionHistoricalStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final PerformanceLogger performanceLogger;
    private final SavedStateHandle savedStateHandle;
    private final BehaviorRelay<WatchlistIndex> selectedItemIndexRelay;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionWatchlistHubContentDuxo(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, CuratedListItemsStore curatedListItemsStore, CuratedListStore curatedListStore, CuratedListEligibleItemsFetcher eligibleItemsFetcher, EventLogger eventLogger, TraderMarketHoursManager marketHoursManager, OptionHistoricalStore optionHistoricalStore, OptionsWatchlistStore optionsWatchlistStore, OptionMarketHoursStore optionMarketHoursStore, PerformanceLogger performanceLogger, SavedStateHandle savedStateHandle) {
        super(new OptionWatchlistHubContentViewState(null, null, false, null, null, null, 63, null), null, 2, null);
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(eligibleItemsFetcher, "eligibleItemsFetcher");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(optionHistoricalStore, "optionHistoricalStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListStore = curatedListStore;
        this.eligibleItemsFetcher = eligibleItemsFetcher;
        this.eventLogger = eventLogger;
        this.marketHoursManager = marketHoursManager;
        this.optionHistoricalStore = optionHistoricalStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.performanceLogger = performanceLogger;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<GraphSelection> behaviorRelayCreateDefault = BehaviorRelay.createDefault(GraphSelection.DAY);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.graphSelectionRelay = behaviorRelayCreateDefault;
        BehaviorRelay<WatchlistIndex> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.selectedItemIndexRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB, null, null, null, 14, null);
        CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher = this.eligibleItemsFetcher;
        Companion companion = INSTANCE;
        Observable map = CuratedListEligibleItemsFetcher.streamCuratedListEligibleItems$default(curatedListEligibleItemsFetcher, ((OptionWatchlistHubContentFragment.Args) companion.getArgs((HasSavedState) this)).getOptionsWatchlistId(), null, false, 6, null).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final List<OptionStrategyCuratedListEligible> apply(List<? extends CuratedListEligible> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(it), new Function1<Object, Boolean>() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$onCreate$1$apply$$inlined$filterIsInstance$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(obj instanceof OptionStrategyCuratedListEligible);
                    }
                });
                Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
                return SequencesKt.toList(sequenceFilter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$1(this.f$0, (List) obj);
            }
        });
        Observable<R> map2 = this.curatedListStore.streamCuratedList(((OptionWatchlistHubContentFragment.Args) companion.getArgs((HasSavedState) this)).getOptionsWatchlistId()).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final SortOption apply(CuratedList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new SortOption(it.getChildSortOrder(), it.getChildSortDirection());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$3(this.f$0, (SortOption) obj);
            }
        });
        Observable<MarketHours> observableDistinctUntilChanged = this.marketHoursManager.getCurrentMarketHoursObservable().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$5(this.f$0, (MarketHours) obj);
            }
        });
        Observable map3 = Observables.INSTANCE.combineLatest(this.selectedItemIndexRelay, getStates()).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$onCreate$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Tuples2 tuples2 = (Tuples2) it;
                OptionWatchlistHubContentDuxo.WatchlistIndex watchlistIndex = (OptionWatchlistHubContentDuxo.WatchlistIndex) tuples2.component1();
                OptionWatchlistHubContentViewState optionWatchlistHubContentViewState = (OptionWatchlistHubContentViewState) tuples2.component2();
                OptionStrategyCuratedListEligible item = optionWatchlistHubContentViewState.getItem(watchlistIndex.getIndex(), watchlistIndex.isExpired());
                Tuples3 tuples3 = null;
                if (item != null) {
                    if (item.getOptionStrategyInfo() == null) {
                        item = null;
                    }
                    if (item != null) {
                        tuples3 = new Tuples3(item, optionWatchlistHubContentViewState.getMarketHours(), Integer.valueOf(optionWatchlistHubContentViewState.getOptionWatchlistItems().size()));
                    }
                }
                return Optional3.asOptional(tuples3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C20947xd398703<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableSwitchMap = observableDistinctUntilChanged2.debounce(500L, TimeUnit.MILLISECONDS).switchMap(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo.onCreate.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionWatchlistGraphViewState> apply(Tuples3<OptionStrategyCuratedListEligible, MarketHours, Integer> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                OptionStrategyCuratedListEligible optionStrategyCuratedListEligibleComponent1 = tuples3.component1();
                final MarketHours marketHoursComponent2 = tuples3.component2();
                final int iIntValue = tuples3.component3().intValue();
                final UiOptionStrategyInfo optionStrategyInfo = optionStrategyCuratedListEligibleComponent1.getOptionStrategyInfo();
                Intrinsics.checkNotNull(optionStrategyInfo);
                OptionStrategyInfo optionStrategyInfo2 = optionStrategyInfo.getOptionStrategyInfo();
                final Instant createdAt = optionStrategyCuratedListEligibleComponent1.getCuratedListItem().getCreatedAt();
                final OptionInstrument optionInstrument = ((UiOptionStrategyLeg) CollectionsKt.single((List) optionStrategyInfo.getLegs())).getOptionInstrument();
                final OptionChain.UnderlyingType underlyingType = optionStrategyInfo.getUnderlyingType();
                BehaviorRelay behaviorRelay = OptionWatchlistHubContentDuxo.this.graphSelectionRelay;
                final OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo = OptionWatchlistHubContentDuxo.this;
                Observable<R> observableSwitchMap2 = behaviorRelay.switchMap(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$onCreate$7$historicalObs$1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends UiOptionHistorical> apply(GraphSelection graphSelection) {
                        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                        OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo2 = optionWatchlistHubContentDuxo;
                        return optionWatchlistHubContentDuxo2.asObservable(optionWatchlistHubContentDuxo2.optionHistoricalStore.streamOptionHistorical(optionInstrument.getId(), graphSelection, optionStrategyInfo.getOptionChain(), optionStrategyInfo.getUnderlyingType(), optionInstrument.getExpirationDate()));
                    }
                });
                Observable<AggregateOptionStrategyQuote> observableStreamAndPollQuoteObservable = OptionWatchlistHubContentDuxo.this.aggregateOptionStrategyQuoteStore.streamAndPollQuoteObservable(optionStrategyInfo2);
                Observables observables = Observables.INSTANCE;
                Intrinsics.checkNotNull(observableSwitchMap2);
                final OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo2 = OptionWatchlistHubContentDuxo.this;
                Observable observableCombineLatest = Observable.combineLatest(observableSwitchMap2, observableStreamAndPollQuoteObservable, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$onCreate$7$apply$$inlined$combineLatest$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.BiFunction
                    public final R apply(T1 t1, T2 t2) {
                        Intrinsics.checkParameterIsNotNull(t1, "t1");
                        Intrinsics.checkParameterIsNotNull(t2, "t2");
                        AggregateOptionStrategyQuote aggregateOptionStrategyQuote = (AggregateOptionStrategyQuote) t2;
                        UiOptionHistorical uiOptionHistorical = (UiOptionHistorical) t1;
                        optionWatchlistHubContentDuxo2.onQuoteLoaded();
                        return (R) new OptionWatchlistGraphViewState(createdAt, uiOptionHistorical, optionStrategyInfo.getOptionChain().getLateCloseState(), iIntValue, marketHoursComponent2, optionStrategyInfo.getOptionChain(), optionInstrument, aggregateOptionStrategyQuote, ((OptionWatchlistHubContentFragment.Args) OptionWatchlistHubContentDuxo.INSTANCE.getArgs((HasSavedState) optionWatchlistHubContentDuxo2)).getOptionsWatchlistId(), underlyingType);
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
                return observableCombineLatest;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$9(this.f$0, (OptionWatchlistGraphViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, final List list) {
        optionWatchlistHubContentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$1$lambda$0(list, (OptionWatchlistHubContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionWatchlistHubContentViewState onCreate$lambda$1$lambda$0(List list, OptionWatchlistHubContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, null, false, null, list, null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, final SortOption sortOption) {
        optionWatchlistHubContentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$3$lambda$2(sortOption, (OptionWatchlistHubContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionWatchlistHubContentViewState onCreate$lambda$3$lambda$2(SortOption sortOption, OptionWatchlistHubContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(sortOption);
        return OptionWatchlistHubContentViewState.copy$default(applyMutation, sortOption, null, false, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, final MarketHours marketHours) {
        optionWatchlistHubContentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$5$lambda$4(marketHours, (OptionWatchlistHubContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionWatchlistHubContentViewState onCreate$lambda$5$lambda$4(MarketHours marketHours, OptionWatchlistHubContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, null, false, marketHours, null, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, final OptionWatchlistGraphViewState optionWatchlistGraphViewState) {
        optionWatchlistHubContentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.onCreate$lambda$9$lambda$8(optionWatchlistGraphViewState, (OptionWatchlistHubContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionWatchlistHubContentViewState onCreate$lambda$9$lambda$8(OptionWatchlistGraphViewState optionWatchlistGraphViewState, OptionWatchlistHubContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(optionWatchlistGraphViewState);
        return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, optionWatchlistGraphViewState, false, null, null, null, 61, null);
    }

    public final void setGraphSelection(GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        this.graphSelectionRelay.accept(graphSelection);
    }

    public final void setSelectedRowIndex(int index, boolean isExpired) {
        this.selectedItemIndexRelay.accept(new WatchlistIndex(index, isExpired));
    }

    public final void sortList(final SortOption sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Observable observableSwitchMapSingle = getStates().take(1L).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo.sortList.1
            @Override // io.reactivex.functions.Function
            public final Tuples2<SortOption, Integer> apply(OptionWatchlistHubContentViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it.getLocalSortOption(), Integer.valueOf(it.getOptionWatchlistItems().size()));
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo.sortList.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<SortOption, Integer> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                SortOption sortOptionComponent1 = tuples2.component1();
                if (Intrinsics.areEqual(sortOption, sortOptionComponent1)) {
                    return false;
                }
                ApiCuratedList.SortDirection sortDirection = sortOption.getSortDirection();
                ApiCuratedList.SortDirection sortDirection2 = ApiCuratedList.SortDirection.EMPTY;
                return (sortDirection == sortDirection2 && sortOptionComponent1.getSortDirection() == sortDirection2) ? false : true;
            }
        }).switchMapSingle(new C209593(sortOption, this));
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.sortList$lambda$10(this.f$0, sortOption, (CuratedList) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.sortList$lambda$12(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: OptionWatchlistHubContentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$sortList$3 */
    static final class C209593<T, R> implements Function {
        final /* synthetic */ SortOption $sortOption;
        final /* synthetic */ OptionWatchlistHubContentDuxo this$0;

        C209593(SortOption sortOption, OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo) {
            this.$sortOption = sortOption;
            this.this$0 = optionWatchlistHubContentDuxo;
        }

        @Override // io.reactivex.functions.Function
        public final SingleSource<? extends CuratedList> apply(Tuples2<SortOption, Integer> tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            int iIntValue = tuples2.component2().intValue();
            SortOption serverValue = SortOptions.getServerValue(this.$sortOption);
            EventLogger eventLogger = this.this$0.eventLogger;
            Companion companion = OptionWatchlistHubContentDuxo.INSTANCE;
            EventLoggers3.logOptionWatchlistSorting(eventLogger, ((OptionWatchlistHubContentFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getOptionsWatchlistId(), iIntValue, serverValue);
            PerformanceLogger.DefaultImpls.beginMetric$default(this.this$0.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB_SORT, null, null, new PerformanceMetricEventData.Context(false, false, false, null, EventLoggers3.getOptionWatchlistListContext(iIntValue, serverValue), null, null, null, null, null, null, null, 4079, null), 6, null);
            this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$sortList$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionWatchlistHubContentDuxo.C209593.apply$lambda$0((OptionWatchlistHubContentViewState) obj);
                }
            });
            return CuratedListStore.updateList$default(this.this$0.curatedListStore, ((OptionWatchlistHubContentFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getOptionsWatchlistId(), null, null, serverValue.getSortOrder(), serverValue.getSortDirection(), 6, null).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo.sortList.3.2
                @Override // io.reactivex.functions.Function
                public final CuratedList apply(ApiCuratedList p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return CuratedList3.toDbModel(p0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionWatchlistHubContentViewState apply$lambda$0(OptionWatchlistHubContentViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, null, true, null, null, null, 59, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortList$lambda$10(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, SortOption sortOption, CuratedList curatedList) {
        CuratedListItemsStore.refreshListItems$default(optionWatchlistHubContentDuxo.curatedListItemsStore, true, curatedList.getId(), curatedList.getOwnerType(), SortOptions.getServerValue(sortOption).getSortOrder(), SortOptions.getServerValue(sortOption).getSortDirection(), null, 32, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortList$lambda$12(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        optionWatchlistHubContentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.sortList$lambda$12$lambda$11(throwable, (OptionWatchlistHubContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionWatchlistHubContentViewState sortList$lambda$12$lambda$11(Throwable th, OptionWatchlistHubContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, null, false, null, null, new UiEvent(th), 27, null);
    }

    public final void synchronizeListDeleteItem(String strategyCode) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Completable completableSwitchMapCompletable = getStates().take(1L).switchMapCompletable(new C209621(strategyCode));
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* compiled from: OptionWatchlistHubContentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$synchronizeListDeleteItem$1 */
    static final class C209621<T, R> implements Function {
        final /* synthetic */ String $strategyCode;

        C209621(String str) {
            this.$strategyCode = str;
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(OptionWatchlistHubContentViewState state) {
            T next;
            Intrinsics.checkNotNullParameter(state, "state");
            EventLoggers3.logOptionWatchlistListItemRemoval(OptionWatchlistHubContentDuxo.this.eventLogger, ((OptionWatchlistHubContentFragment.Args) OptionWatchlistHubContentDuxo.INSTANCE.getArgs((HasSavedState) OptionWatchlistHubContentDuxo.this)).getOptionsWatchlistId(), this.$strategyCode);
            List<OptionStrategyCuratedListEligible> optionWatchlistItems = state.getOptionWatchlistItems();
            List<OptionStrategyCuratedListEligible> optionWatchlistItems2 = state.getOptionWatchlistItems();
            String str = this.$strategyCode;
            Iterator<T> it = optionWatchlistItems2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((OptionStrategyCuratedListEligible) next).getStrategyCode(), str)) {
                    break;
                }
            }
            OptionStrategyCuratedListEligible optionStrategyCuratedListEligible = next;
            if (optionStrategyCuratedListEligible != null) {
                final List listMinus = CollectionsKt.minus(optionWatchlistItems, optionStrategyCuratedListEligible);
                OptionWatchlistHubContentDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$synchronizeListDeleteItem$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionWatchlistHubContentDuxo.C209621.apply$lambda$1(listMinus, (OptionWatchlistHubContentViewState) obj);
                    }
                });
                return OptionWatchlistHubContentDuxo.this.optionsWatchlistStore.removeItem(optionStrategyCuratedListEligible.getStrategyCode(), ((OptionWatchlistHubContentFragment.Args) OptionWatchlistHubContentDuxo.INSTANCE.getArgs((HasSavedState) OptionWatchlistHubContentDuxo.this)).getOptionsWatchlistId()).doOnError(new AnonymousClass2(OptionWatchlistHubContentDuxo.this, optionWatchlistItems));
            }
            return Completable.complete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionWatchlistHubContentViewState apply$lambda$1(List list, OptionWatchlistHubContentViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, null, true, null, list, null, 43, null);
        }

        /* compiled from: OptionWatchlistHubContentDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$synchronizeListDeleteItem$1$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements Consumer {
            final /* synthetic */ List<OptionStrategyCuratedListEligible> $previousList;
            final /* synthetic */ OptionWatchlistHubContentDuxo this$0;

            AnonymousClass2(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, List<OptionStrategyCuratedListEligible> list) {
                this.this$0 = optionWatchlistHubContentDuxo;
                this.$previousList = list;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(final Throwable th) {
                OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo = this.this$0;
                final List<OptionStrategyCuratedListEligible> list = this.$previousList;
                optionWatchlistHubContentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$synchronizeListDeleteItem$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionWatchlistHubContentDuxo.C209621.AnonymousClass2.accept$lambda$0(list, th, (OptionWatchlistHubContentViewState) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionWatchlistHubContentViewState accept$lambda$0(List list, Throwable th, OptionWatchlistHubContentViewState applyMutation) {
                Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, null, false, null, list, new UiEvent(th), 15, null);
            }
        }
    }

    public final void synchronizeActiveListPositionChange(String strategyCode, int newPosition) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Completable completableSwitchMapCompletable = getStates().take(1L).map(new Function() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo.synchronizeActiveListPositionChange.1
            @Override // io.reactivex.functions.Function
            public final Tuples2<List<OptionStrategyCuratedListEligible>, List<OptionStrategyCuratedListEligible>> apply(OptionWatchlistHubContentViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it.getActiveWatchlistItems(), it.getExpiredWatchlistItems());
            }
        }).switchMapCompletable(new C209612(newPosition, this, strategyCode));
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.synchronizeActiveListPositionChange$lambda$15(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: OptionWatchlistHubContentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$synchronizeActiveListPositionChange$2 */
    static final class C209612<T, R> implements Function {
        final /* synthetic */ int $newPosition;
        final /* synthetic */ String $strategyCode;
        final /* synthetic */ OptionWatchlistHubContentDuxo this$0;

        C209612(int i, OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, String str) {
            this.$newPosition = i;
            this.this$0 = optionWatchlistHubContentDuxo;
            this.$strategyCode = str;
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(Tuples2<? extends List<OptionStrategyCuratedListEligible>, ? extends List<OptionStrategyCuratedListEligible>> tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            List<OptionStrategyCuratedListEligible> listComponent1 = tuples2.component1();
            List<OptionStrategyCuratedListEligible> listComponent2 = tuples2.component2();
            List mutableList = CollectionsKt.toMutableList((Collection) listComponent1);
            String str = this.$strategyCode;
            Iterator<OptionStrategyCuratedListEligible> it = listComponent1.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().getStrategyCode(), str)) {
                    break;
                }
                i++;
            }
            int i2 = this.$newPosition;
            if (i2 < 0 || i2 >= listComponent1.size() || this.$newPosition == i) {
                return Completable.complete();
            }
            mutableList.add(this.$newPosition, (OptionStrategyCuratedListEligible) mutableList.remove(i));
            final List<? extends CuratedListEligible> listPlus = CollectionsKt.plus((Collection) mutableList, (Iterable) listComponent2);
            EventLogger eventLogger = this.this$0.eventLogger;
            Companion companion = OptionWatchlistHubContentDuxo.INSTANCE;
            EventLoggers3.logOptionWatchlistRearrangeItems(eventLogger, ((OptionWatchlistHubContentFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getOptionsWatchlistId(), listPlus.size());
            this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$synchronizeActiveListPositionChange$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionWatchlistHubContentDuxo.C209612.apply$lambda$1(listPlus, (OptionWatchlistHubContentViewState) obj);
                }
            });
            OptionsWatchlistStore.refreshItems$default(this.this$0.optionsWatchlistStore, false, 1, null);
            return this.this$0.curatedListItemsStore.updateListItems(((OptionWatchlistHubContentFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getOptionsWatchlistId(), ApiCuratedList.OwnerType.CUSTOM, listPlus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionWatchlistHubContentViewState apply$lambda$1(List list, OptionWatchlistHubContentViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OptionWatchlistHubContentViewState.copy$default(applyMutation, new SortOption(ApiCuratedList.SortOrder.CUSTOM, ApiCuratedList.SortDirection.ASCENDING), null, true, null, list, null, 42, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit synchronizeActiveListPositionChange$lambda$15(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionWatchlistHubContentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistHubContentDuxo.synchronizeActiveListPositionChange$lambda$15$lambda$14((OptionWatchlistHubContentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionWatchlistHubContentViewState synchronizeActiveListPositionChange$lambda$15$lambda$14(OptionWatchlistHubContentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionWatchlistHubContentViewState.copy$default(applyMutation, null, null, false, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onQuoteLoaded() {
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB, null, 2, null);
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_WATCHLIST_HUB_SORT, null, 2, null);
    }

    public final void logActiveRowTap(String strategyCode) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        EventLoggers3.logOptionWatchlistActiveRowTap(this.eventLogger, ((OptionWatchlistHubContentFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOptionsWatchlistId(), strategyCode);
    }

    public final void logExpiredDialogAppear(String strategyCode) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        EventLoggers3.logOptionWatchlistExpiredDialogAppear(this.eventLogger, ((OptionWatchlistHubContentFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOptionsWatchlistId(), strategyCode);
    }

    public final void logExpiredDialogDisappear(String strategyCode) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        EventLoggers3.logOptionWatchlistExpiredDialogDisappear(this.eventLogger, ((OptionWatchlistHubContentFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOptionsWatchlistId(), strategyCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionWatchlistHubContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentDuxo$WatchlistIndex;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "isExpired", "", "<init>", "(IZ)V", "getIndex", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class WatchlistIndex {
        private final int index;
        private final boolean isExpired;

        public static /* synthetic */ WatchlistIndex copy$default(WatchlistIndex watchlistIndex, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = watchlistIndex.index;
            }
            if ((i2 & 2) != 0) {
                z = watchlistIndex.isExpired;
            }
            return watchlistIndex.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsExpired() {
            return this.isExpired;
        }

        public final WatchlistIndex copy(int index, boolean isExpired) {
            return new WatchlistIndex(index, isExpired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WatchlistIndex)) {
                return false;
            }
            WatchlistIndex watchlistIndex = (WatchlistIndex) other;
            return this.index == watchlistIndex.index && this.isExpired == watchlistIndex.isExpired;
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + Boolean.hashCode(this.isExpired);
        }

        public String toString() {
            return "WatchlistIndex(index=" + this.index + ", isExpired=" + this.isExpired + ")";
        }

        public WatchlistIndex(int i, boolean z) {
            this.index = i;
            this.isExpired = z;
        }

        public final int getIndex() {
            return this.index;
        }

        public final boolean isExpired() {
            return this.isExpired;
        }
    }

    /* compiled from: OptionWatchlistHubContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentDuxo;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentFragment$Args;", "<init>", "()V", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionWatchlistHubContentDuxo, OptionWatchlistHubContentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionWatchlistHubContentFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionWatchlistHubContentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionWatchlistHubContentFragment.Args getArgs(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo) {
            return (OptionWatchlistHubContentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionWatchlistHubContentDuxo);
        }
    }
}
