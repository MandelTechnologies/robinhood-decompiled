package com.robinhood.android.search.selector;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cortex.models.asset.AssetDigestPopularInstruments;
import com.robinhood.android.cortex.store.asset.AssetDigestPopularInstrumentsStore;
import com.robinhood.android.equities.companyfinancials.microgram.CompanyFinancialsCachedService;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesProductSearchItem;
import com.robinhood.android.regiongate.AssetDigestsCryptoRegionGate;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.search.selector.SearchSelectorDuxo;
import com.robinhood.android.search.selector.SearchSelectorViewState3;
import com.robinhood.android.search.selector.SearchSelectorViewState4;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.librobinhood.data.store.OptionChainSearchItemStore;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.models.api.search.SearchResponse;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.InstrumentPosition;
import com.robinhood.models.p355ui.UiIndexOptionChainSearchItem;
import com.robinhood.models.p355ui.UiOptionChainSearchItem;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.search.SearchStore;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import equity_company_financials.proto.p457v1.StreamSupportedInstrumentsResponseDto;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SearchSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001BBa\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010#\u001a\u00020$H\u0016J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&2\u0006\u0010)\u001a\u00020*H\u0002J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020!J(\u0010-\u001a\b\u0012\u0004\u0012\u00020.0'*\b\u0012\u0004\u0012\u00020/0'2\u0006\u00100\u001a\u00020!2\u0006\u0010)\u001a\u000201H\u0002J(\u00102\u001a\b\u0012\u0004\u0012\u0002030'*\b\u0012\u0004\u0012\u0002040'2\u0006\u00100\u001a\u00020!2\u0006\u0010)\u001a\u000201H\u0002J\u0006\u00105\u001a\u00020$J\u0016\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u000209J\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;*\b\u0012\u0004\u0012\u00020=0;H\u0002J\u001a\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@2\n\u00108\u001a\u000609j\u0002`AR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/search/selector/SearchSelectorViewState;", "", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "optionChainSearchItemStore", "Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "assetDigestPopularInstrumentsStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestPopularInstrumentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "tradingTrendsCachedService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "companyFinancialsCachedService", "Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore;Lcom/robinhood/store/search/SearchStore;Lcom/robinhood/android/cortex/store/asset/AssetDigestPopularInstrumentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;Lcom/robinhood/android/equities/companyfinancials/microgram/CompanyFinancialsCachedService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "searchRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "onCreate", "", "streamContentTypes", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/api/search/SearchContentType;", "launchMode", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode;", "searchTextChanged", "newText", "toOptionsSearchItems", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$OptionsSearchResultItem;", "Lcom/robinhood/models/ui/UiOptionChainSearchItem;", "accountNumber", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "toIndexOptionsSearchItems", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$IndexOptionsSearchResultItem;", "Lcom/robinhood/models/ui/UiIndexOptionChainSearchItem;", "logSearchSelectorAppear", "logOptionSearchItemTap", "chainId", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "mapToCopilotSearchItems", "Lkotlin/sequences/Sequence;", "Lcom/robinhood/android/search/selector/SearchItem;", "Lcom/robinhood/models/api/search/SearchResponse;", "logLadderSearchItemTap", "searchItem", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow$LadderChartResultItem;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "Companion", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchSelectorDuxo extends BaseDuxo5<SearchSelectorViewState, Throwable> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AccountProvider accountProvider;
    private final AssetDigestPopularInstrumentsStore assetDigestPopularInstrumentsStore;
    private final CompanyFinancialsCachedService companyFinancialsCachedService;
    private final EventLogger eventLogger;
    private final InstrumentPositionStore instrumentPositionStore;
    private final OptionChainSearchItemStore optionChainSearchItemStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final PublishRelay<String> searchRelay;
    private final SearchStore searchStore;
    private final TradingTrendsCachedService tradingTrendsCachedService;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSelectorDuxo(AccountProvider accountProvider, EventLogger eventLogger, InstrumentPositionStore instrumentPositionStore, OptionChainSearchItemStore optionChainSearchItemStore, SearchStore searchStore, AssetDigestPopularInstrumentsStore assetDigestPopularInstrumentsStore, RegionGateProvider regionGateProvider, TradingTrendsCachedService tradingTrendsCachedService, CompanyFinancialsCachedService companyFinancialsCachedService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new SearchSelectorViewState(false, null, null, null, null, false, 63, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        Intrinsics.checkNotNullParameter(optionChainSearchItemStore, "optionChainSearchItemStore");
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(assetDigestPopularInstrumentsStore, "assetDigestPopularInstrumentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(tradingTrendsCachedService, "tradingTrendsCachedService");
        Intrinsics.checkNotNullParameter(companyFinancialsCachedService, "companyFinancialsCachedService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.instrumentPositionStore = instrumentPositionStore;
        this.optionChainSearchItemStore = optionChainSearchItemStore;
        this.searchStore = searchStore;
        this.assetDigestPopularInstrumentsStore = assetDigestPopularInstrumentsStore;
        this.regionGateProvider = regionGateProvider;
        this.tradingTrendsCachedService = tradingTrendsCachedService;
        this.companyFinancialsCachedService = companyFinancialsCachedService;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<String> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.searchRelay = publishRelayCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, io.reactivex.Observable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [T, io.reactivex.Observable, java.lang.Object] */
    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        Observable<String> observableStreamIndividualAccountNumber;
        Observable map;
        super.onCreate();
        Companion companion = INSTANCE;
        final SearchSelectorLaunchMode searchSelectorLaunchMode = ((SearchSelector) companion.getArgs((HasSavedState) this)).getSearchSelectorLaunchMode();
        applyMutation(new C281491(searchSelectorLaunchMode, null));
        boolean z = searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options;
        if (z) {
            SearchSelectorLaunchMode.Options options = (SearchSelectorLaunchMode.Options) searchSelectorLaunchMode;
            if (options.getAccountNumber() != null) {
                String accountNumber = options.getAccountNumber();
                Intrinsics.checkNotNull(accountNumber);
                observableStreamIndividualAccountNumber = Observable.just(accountNumber);
                Intrinsics.checkNotNull(observableStreamIndividualAccountNumber);
            } else {
                observableStreamIndividualAccountNumber = this.accountProvider.streamIndividualAccountNumber();
            }
        }
        if (Intrinsics.areEqual(searchSelectorLaunchMode, SearchSelectorLaunchMode.TradingTrends.INSTANCE)) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C281502(null));
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? Just = Observable.just(SetsKt.emptySet());
        Intrinsics.checkNotNullExpressionValue(Just, "just(...)");
        objectRef.element = Just;
        if (Intrinsics.areEqual(searchSelectorLaunchMode, SearchSelectorLaunchMode.CompanyFinancials.INSTANCE)) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C281513(null));
            final Flow<StreamSupportedInstrumentsResponseDto> flowStreamSupportedInstruments = this.companyFinancialsCachedService.streamSupportedInstruments();
            ?? RefCount = asObservable(new Flow<Set<? extends String>>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$$inlined$map$1$2 */
                public static final class C281432<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$$inlined$map$1$2", m3645f = "SearchSelectorDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C281432.this.emit(null, this);
                        }
                    }

                    public C281432(FlowCollector flowCollector) {
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
                            Set set = CollectionsKt.toSet(((StreamSupportedInstrumentsResponseDto) obj).getSupported_instrument_ids());
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(set, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Set<? extends String>> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamSupportedInstruments.collect(new C281432(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }).replay(1).refCount();
            Intrinsics.checkNotNullExpressionValue(RefCount, "refCount(...)");
            objectRef.element = RefCount;
        }
        if (z) {
            map = observableStreamIndividualAccountNumber.switchMap(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends List<SearchSelectorViewState3>> apply(final String accountNumber2) {
                    Observable observableJust;
                    Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                    Observables observables = Observables.INSTANCE;
                    Observable<List<UiOptionChainSearchItem>> observableAsObservable = this.this$0.optionChainSearchItemStore.getStreamUiOptionChainSearchItemsByHoldingInstrumentPositions().asObservable(accountNumber2);
                    final SearchSelectorDuxo searchSelectorDuxo = this.this$0;
                    final SearchSelectorLaunchMode searchSelectorLaunchMode2 = searchSelectorLaunchMode;
                    Observable<R> map2 = observableAsObservable.map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$1.1
                        @Override // io.reactivex.functions.Function
                        public final List<SearchSelectorViewState3.SecurityRow.OptionsSearchResultItem> apply(List<UiOptionChainSearchItem> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            SearchSelectorDuxo searchSelectorDuxo2 = searchSelectorDuxo;
                            String str = accountNumber2;
                            Intrinsics.checkNotNull(str);
                            return searchSelectorDuxo2.toOptionsSearchItems(it, str, (SearchSelectorLaunchMode.Options) searchSelectorLaunchMode2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                    if (((SearchSelectorLaunchMode.Options) searchSelectorLaunchMode).getUseOptionHoldings()) {
                        Observable<List<UiOptionChainSearchItem>> observableAsObservable2 = this.this$0.optionChainSearchItemStore.m2617xc5330f78().asObservable(accountNumber2);
                        final SearchSelectorDuxo searchSelectorDuxo2 = this.this$0;
                        final SearchSelectorLaunchMode searchSelectorLaunchMode3 = searchSelectorLaunchMode;
                        Observable<R> map3 = observableAsObservable2.map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$1.2
                            @Override // io.reactivex.functions.Function
                            public final List<SearchSelectorViewState3.SecurityRow.OptionsSearchResultItem> apply(List<UiOptionChainSearchItem> it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                SearchSelectorDuxo searchSelectorDuxo3 = searchSelectorDuxo2;
                                String str = accountNumber2;
                                Intrinsics.checkNotNull(str);
                                return searchSelectorDuxo3.toOptionsSearchItems(it, str, (SearchSelectorLaunchMode.Options) searchSelectorLaunchMode3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                        Observable<List<UiIndexOptionChainSearchItem>> observableAsObservable3 = this.this$0.optionChainSearchItemStore.m2616x7c9ba654().asObservable(accountNumber2);
                        final SearchSelectorDuxo searchSelectorDuxo3 = this.this$0;
                        final SearchSelectorLaunchMode searchSelectorLaunchMode4 = searchSelectorLaunchMode;
                        Observable<R> map4 = observableAsObservable3.map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$1.3
                            @Override // io.reactivex.functions.Function
                            public final List<SearchSelectorViewState3.SecurityRow.IndexOptionsSearchResultItem> apply(List<UiIndexOptionChainSearchItem> it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                SearchSelectorDuxo searchSelectorDuxo4 = searchSelectorDuxo3;
                                String str = accountNumber2;
                                Intrinsics.checkNotNull(str);
                                return searchSelectorDuxo4.toIndexOptionsSearchItems(it, str, (SearchSelectorLaunchMode.Options) searchSelectorLaunchMode4);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
                        observableJust = Observable.combineLatest(map3, map4, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$1$apply$$inlined$combineLatest$1
                            @Override // io.reactivex.functions.BiFunction
                            public final R apply(T1 t1, T2 t2) {
                                Intrinsics.checkParameterIsNotNull(t1, "t1");
                                Intrinsics.checkParameterIsNotNull(t2, "t2");
                                return (R) CollectionsKt.plus((Collection) t1, (Iterable) t2);
                            }
                        });
                        Intrinsics.checkExpressionValueIsNotNull(observableJust, "Observable.combineLatest…ombineFunction(t1, t2) })");
                    } else {
                        observableJust = Observable.just(CollectionsKt.emptyList());
                        Intrinsics.checkNotNull(observableJust);
                    }
                    Observable observableCombineLatest = Observable.combineLatest(map2, observableJust, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$1$apply$$inlined$combineLatest$2
                        /* JADX WARN: Type inference failed for: r0v2, types: [R, java.util.ArrayList] */
                        @Override // io.reactivex.functions.BiFunction
                        public final R apply(T1 t1, T2 t2) {
                            Intrinsics.checkParameterIsNotNull(t1, "t1");
                            Intrinsics.checkParameterIsNotNull(t2, "t2");
                            List listPlus = CollectionsKt.plus((Collection) t2, (Iterable) t1);
                            HashSet hashSet = new HashSet();
                            ?? r0 = (R) new ArrayList();
                            for (Object obj : listPlus) {
                                if (hashSet.add(((SearchSelectorViewState3.SecurityRow) obj).getSymbol())) {
                                    r0.add(obj);
                                }
                            }
                            return r0;
                        }
                    });
                    Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
                    return observableCombineLatest;
                }
            });
            Intrinsics.checkNotNull(map);
        } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.AdvancedChart) {
            this.instrumentPositionStore.refreshIndividualAccountHoldingInstrumentPositions(false);
            map = this.instrumentPositionStore.getIndividualAccountHoldingInstrumentPositions().map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$2
                @Override // io.reactivex.functions.Function
                public final List<SearchSelectorViewState3> apply(List<InstrumentPosition> instrumentPositions) {
                    Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
                    List<InstrumentPosition> list = instrumentPositions;
                    SearchSelectorLaunchMode searchSelectorLaunchMode2 = searchSelectorLaunchMode;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SearchSelectorViewState3.SecurityRow.AdvancedChartResultItem(((InstrumentPosition) it.next()).getInstrument(), ((SearchSelectorLaunchMode.AdvancedChart) searchSelectorLaunchMode2).getBackToStockDetailPage()));
                    }
                    return arrayList;
                }
            });
            Intrinsics.checkNotNull(map);
        } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Copilot) {
            map = RxFactory.DefaultImpls.rxSingle$default(this, null, new SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$3(this, null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$4
                @Override // io.reactivex.functions.Function
                public final List<AssetDigestPopularInstruments.Item> apply(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 4, null);
                    return CollectionsKt.emptyList();
                }
            }).toObservable().map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$5
                @Override // io.reactivex.functions.Function
                public final List<SearchSelectorViewState3> apply(List<AssetDigestPopularInstruments.Item> instruments) {
                    Intrinsics.checkNotNullParameter(instruments, "instruments");
                    List<AssetDigestPopularInstruments.Item> list = instruments;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SearchSelectorViewState3.SecurityRow.CopilotResultItem((AssetDigestPopularInstruments.Item) it.next()));
                    }
                    return arrayList;
                }
            });
            Intrinsics.checkNotNull(map);
        } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.TradingTrends) {
            this.instrumentPositionStore.refreshIndividualAccountHoldingInstrumentPositions(false);
            map = this.instrumentPositionStore.getIndividualAccountHoldingInstrumentPositions().map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$6
                @Override // io.reactivex.functions.Function
                public final List<SearchSelectorViewState3> apply(List<InstrumentPosition> instrumentPositions) {
                    Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
                    ArrayList arrayList = new ArrayList();
                    for (T t : instrumentPositions) {
                        if (Intrinsics.areEqual(((InstrumentPosition) t).getInstrument().getType(), "stock")) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new SearchSelectorViewState3.SecurityRow.TradingTrendsChartResultItem(((InstrumentPosition) it.next()).getInstrument()));
                    }
                    return arrayList2;
                }
            });
            Intrinsics.checkNotNull(map);
        } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.CompanyFinancials) {
            this.instrumentPositionStore.refreshIndividualAccountHoldingInstrumentPositions(false);
            Observables observables = Observables.INSTANCE;
            map = Observable.combineLatest(this.instrumentPositionStore.getIndividualAccountHoldingInstrumentPositions(), (Observable) objectRef.element, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$$inlined$combineLatest$1
                /* JADX WARN: Type inference failed for: r4v4, types: [R, java.util.ArrayList, java.util.Collection] */
                @Override // io.reactivex.functions.BiFunction
                public final R apply(T1 t1, T2 t2) {
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    Set set = (Set) t2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (List) t1) {
                        if (set.contains(((InstrumentPosition) obj).getInstrument().getId().toString())) {
                            arrayList.add(obj);
                        }
                    }
                    ?? r4 = (R) new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        r4.add(new SearchSelectorViewState3.SecurityRow.CompanyFinancialsResultItem(((InstrumentPosition) it.next()).getInstrument()));
                    }
                    return r4;
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "Observable.combineLatest…ombineFunction(t1, t2) })");
        } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.BwAdvanceChart) {
            this.instrumentPositionStore.refreshIndividualAccountHoldingInstrumentPositions(false);
            map = this.instrumentPositionStore.getIndividualAccountHoldingInstrumentPositions().map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$8
                @Override // io.reactivex.functions.Function
                public final List<SearchSelectorViewState3> apply(List<InstrumentPosition> instrumentPositions) {
                    Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
                    List<InstrumentPosition> list = instrumentPositions;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.Equity(((InstrumentPosition) it.next()).getInstrument()));
                    }
                    return arrayList;
                }
            });
            Intrinsics.checkNotNull(map);
        } else {
            if (!(searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Ladder)) {
                throw new NoWhenBranchMatchedException();
            }
            this.instrumentPositionStore.refreshIndividualAccountHoldingInstrumentPositions(false);
            map = this.instrumentPositionStore.getIndividualAccountHoldingInstrumentPositions().map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$stocksChipsSearchItemsObs$9
                @Override // io.reactivex.functions.Function
                public final List<SearchSelectorViewState3> apply(List<InstrumentPosition> instrumentPositions) {
                    Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
                    List<InstrumentPosition> list = instrumentPositions;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SearchSelectorViewState3.SecurityRow.LadderChartResultItem.Equity(((InstrumentPosition) it.next()).getInstrument()));
                    }
                    return arrayList;
                }
            });
            Intrinsics.checkNotNull(map);
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorDuxo.onCreate$lambda$4(this.f$0, (List) obj);
            }
        });
        Observables observables2 = Observables.INSTANCE;
        Observable<String> observableDistinctUntilChanged = this.searchRelay.debounce(500L, TimeUnit.MILLISECONDS).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableSwitchMap = observables2.combineLatest(observableDistinctUntilChanged, streamContentTypes(((SearchSelector) companion.getArgs((HasSavedState) this)).getSearchSelectorLaunchMode())).switchMap(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo.onCreate.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends SearchStore3> apply(Tuples2<String, ? extends List<? extends SearchContentType>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                String strComponent1 = tuples2.component1();
                List<? extends SearchContentType> listComponent2 = tuples2.component2();
                SearchStore searchStore = SearchSelectorDuxo.this.searchStore;
                Intrinsics.checkNotNull(strComponent1);
                return SearchStore.search$default(searchStore, strComponent1, listComponent2, searchSelectorLaunchMode.getSearchQueryContext(), null, false, null, 56, null);
            }
        }).switchMap(new C281537(searchSelectorLaunchMode, observableStreamIndividualAccountNumber, this, objectRef));
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorDuxo.onCreate$lambda$5(this.f$0, (SearchSelectorViewState4) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorDuxo.onCreate$lambda$6(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* compiled from: SearchSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/selector/SearchSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$1", m3645f = "SearchSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$1 */
    static final class C281491 extends ContinuationImpl7 implements Function2<SearchSelectorViewState, Continuation<? super SearchSelectorViewState>, Object> {
        final /* synthetic */ SearchSelectorLaunchMode $launchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C281491(SearchSelectorLaunchMode searchSelectorLaunchMode, Continuation<? super C281491> continuation) {
            super(2, continuation);
            this.$launchMode = searchSelectorLaunchMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C281491 c281491 = new C281491(this.$launchMode, continuation);
            c281491.L$0 = obj;
            return c281491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchSelectorViewState searchSelectorViewState, Continuation<? super SearchSelectorViewState> continuation) {
            return ((C281491) create(searchSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SearchSelectorViewState.copy$default((SearchSelectorViewState) this.L$0, false, null, null, null, this.$launchMode, false, 47, null);
        }
    }

    /* compiled from: SearchSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$2", m3645f = "SearchSelectorDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$2 */
    static final class C281502 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C281502(Continuation<? super C281502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchSelectorDuxo.this.new C281502(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C281502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TradingTrendsCachedService tradingTrendsCachedService = SearchSelectorDuxo.this.tradingTrendsCachedService;
                this.label = 1;
                if (tradingTrendsCachedService.retainUntilCanceled(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: SearchSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$3", m3645f = "SearchSelectorDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$3 */
    static final class C281513 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C281513(Continuation<? super C281513> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchSelectorDuxo.this.new C281513(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C281513) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompanyFinancialsCachedService companyFinancialsCachedService = SearchSelectorDuxo.this.companyFinancialsCachedService;
                this.label = 1;
                if (companyFinancialsCachedService.retainUntilCanceled(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(SearchSelectorDuxo searchSelectorDuxo, List stockChipsSearchItems) {
        Intrinsics.checkNotNullParameter(stockChipsSearchItems, "stockChipsSearchItems");
        searchSelectorDuxo.applyMutation(new SearchSelectorDuxo$onCreate$5$1(stockChipsSearchItems, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SearchSelectorDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7 */
    static final class C281537<T, R> implements Function {
        final /* synthetic */ Observable<String> $accountNumberObs;
        final /* synthetic */ SearchSelectorLaunchMode $launchMode;
        final /* synthetic */ Ref.ObjectRef<Observable<Set<String>>> $supportedInstrumentIdsObs;
        final /* synthetic */ SearchSelectorDuxo this$0;

        C281537(SearchSelectorLaunchMode searchSelectorLaunchMode, Observable<String> observable, SearchSelectorDuxo searchSelectorDuxo, Ref.ObjectRef<Observable<Set<String>>> objectRef) {
            this.$launchMode = searchSelectorLaunchMode;
            this.$accountNumberObs = observable;
            this.this$0 = searchSelectorDuxo;
            this.$supportedInstrumentIdsObs = objectRef;
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends SearchSelectorViewState4> apply(SearchStore3 result) {
            Observable<R> observableJust;
            Intrinsics.checkNotNullParameter(result, "result");
            if (result instanceof SearchStore3.Error) {
                return Observable.just(new SearchSelectorViewState4.Error(((SearchStore3.Error) result).getThrowable()));
            }
            if (Intrinsics.areEqual(result, SearchStore3.Loading.INSTANCE)) {
                return Observable.just(SearchSelectorViewState4.Loading.INSTANCE);
            }
            if (!(result instanceof SearchStore3.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            SearchStore3.Success success = (SearchStore3.Success) result;
            Sequence sequenceAsSequence = CollectionsKt.asSequence(success.getResponses());
            Sequence sequenceFilter = SequencesKt.filter(sequenceAsSequence, new Function1<Object, Boolean>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$apply$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof SearchResponse.Instruments);
                }
            });
            Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            final Sequence sequenceFlattenSequenceOfIterable = SequencesKt.flattenSequenceOfIterable(SequencesKt.map(sequenceFilter, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSelectorDuxo.C281537.apply$lambda$0((SearchResponse.Instruments) obj);
                }
            }));
            List<SearchResponse> responses = success.getResponses();
            ArrayList arrayList = new ArrayList();
            for (T t : responses) {
                if (t instanceof SearchResponse.MarketIndexes) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SearchResponse.MarketIndexes) it.next()).getMarketIndexes());
            }
            final List listFlatten = CollectionsKt.flatten(arrayList2);
            Sequence sequenceFilter2 = SequencesKt.filter(sequenceAsSequence, new Function1<Object, Boolean>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$apply$$inlined$filterIsInstance$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof SearchResponse.CurrencyPairs);
                }
            });
            Intrinsics.checkNotNull(sequenceFilter2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Sequence sequenceFlattenSequenceOfIterable2 = SequencesKt.flattenSequenceOfIterable(SequencesKt.map(sequenceFilter2, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSelectorDuxo.C281537.apply$lambda$2((SearchResponse.CurrencyPairs) obj);
                }
            }));
            Sequence sequenceFilter3 = SequencesKt.filter(sequenceAsSequence, new Function1<Object, Boolean>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$apply$$inlined$filterIsInstance$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof SearchResponse.FuturesResponse);
                }
            });
            Intrinsics.checkNotNull(sequenceFilter3, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Sequence sequenceFlattenSequenceOfIterable3 = SequencesKt.flattenSequenceOfIterable(SequencesKt.mapNotNull(sequenceFilter3, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSelectorDuxo.C281537.apply$lambda$3((SearchResponse.FuturesResponse) obj);
                }
            }));
            Sequence sequenceFilter4 = SequencesKt.filter(sequenceAsSequence, new Function1<Object, Boolean>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$apply$$inlined$filterIsInstance$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof SearchResponse.FuturesResponse.FuturesProducts);
                }
            });
            Intrinsics.checkNotNull(sequenceFilter4, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Sequence sequenceFlattenSequenceOfIterable4 = SequencesKt.flattenSequenceOfIterable(SequencesKt.map(sequenceFilter4, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSelectorDuxo.C281537.apply$lambda$4((SearchResponse.FuturesResponse.FuturesProducts) obj);
                }
            }));
            final SearchSelectorLaunchMode searchSelectorLaunchMode = this.$launchMode;
            if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options) {
                Observable<String> observable = this.$accountNumberObs;
                final SearchSelectorDuxo searchSelectorDuxo = this.this$0;
                observableJust = observable.switchMap(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$searchItemsObs$1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends List<SearchSelectorViewState3.SecurityRow>> apply(final String accountNumber) {
                        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                        Observables observables = Observables.INSTANCE;
                        SearchSelectorDuxo searchSelectorDuxo2 = searchSelectorDuxo;
                        List<Index> list = listFlatten;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new UiIndexOptionChainSearchItem((Index) it2.next()));
                        }
                        Observable observableJust2 = Observable.just(searchSelectorDuxo2.toIndexOptionsSearchItems(arrayList3, accountNumber, (SearchSelectorLaunchMode.Options) searchSelectorLaunchMode));
                        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                        Observable<List<UiOptionChainSearchItem>> observableAsObservable = searchSelectorDuxo.optionChainSearchItemStore.getStreamUiOptionChainSearchItemsByInstruments().asObservable(SequencesKt.toList(sequenceFlattenSequenceOfIterable));
                        final SearchSelectorDuxo searchSelectorDuxo3 = searchSelectorDuxo;
                        final SearchSelectorLaunchMode searchSelectorLaunchMode2 = searchSelectorLaunchMode;
                        Observable<R> map = observableAsObservable.map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$searchItemsObs$1.2
                            @Override // io.reactivex.functions.Function
                            public final List<SearchSelectorViewState3.SecurityRow.OptionsSearchResultItem> apply(List<UiOptionChainSearchItem> it3) {
                                Intrinsics.checkNotNullParameter(it3, "it");
                                SearchSelectorDuxo searchSelectorDuxo4 = searchSelectorDuxo3;
                                String str = accountNumber;
                                Intrinsics.checkNotNull(str);
                                return searchSelectorDuxo4.toOptionsSearchItems(it3, str, (SearchSelectorLaunchMode.Options) searchSelectorLaunchMode2);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        Observable observableCombineLatest = Observable.combineLatest(observableJust2, map, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$searchItemsObs$1$apply$$inlined$combineLatest$1
                            /* JADX WARN: Type inference failed for: r0v2, types: [R, java.util.ArrayList] */
                            @Override // io.reactivex.functions.BiFunction
                            public final R apply(T1 t1, T2 t2) {
                                Intrinsics.checkParameterIsNotNull(t1, "t1");
                                Intrinsics.checkParameterIsNotNull(t2, "t2");
                                List listPlus = CollectionsKt.plus((Collection) t1, (Iterable) t2);
                                HashSet hashSet = new HashSet();
                                ?? r0 = (R) new ArrayList();
                                for (Object obj : listPlus) {
                                    if (hashSet.add(((SearchSelectorViewState3.SecurityRow) obj).getSymbol())) {
                                        r0.add(obj);
                                    }
                                }
                                return r0;
                            }
                        });
                        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
                        return observableCombineLatest;
                    }
                });
            } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.AdvancedChart) {
                observableJust = Observable.just(SequencesKt.toList(SequencesKt.map(sequenceFlattenSequenceOfIterable, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchSelectorDuxo.C281537.apply$lambda$5(searchSelectorLaunchMode, (Instrument) obj);
                    }
                })));
            } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Copilot) {
                observableJust = Observable.just(SequencesKt.toList(this.this$0.mapToCopilotSearchItems(sequenceAsSequence)));
            } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.TradingTrends) {
                observableJust = Observable.just(SequencesKt.toList(SequencesKt.map(SequencesKt.filter(sequenceFlattenSequenceOfIterable, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SearchSelectorDuxo.C281537.apply$lambda$6((Instrument) obj));
                    }
                }), new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchSelectorDuxo.C281537.apply$lambda$7((Instrument) obj);
                    }
                })));
            } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.CompanyFinancials) {
                observableJust = this.$supportedInstrumentIdsObs.element.take(1L).map(new SearchSelectorDuxo$onCreate$7$searchItemsObs$5(sequenceFlattenSequenceOfIterable));
            } else if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.BwAdvanceChart) {
                Sequence map = SequencesKt.map(SequencesKt.filter(sequenceFlattenSequenceOfIterable, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SearchSelectorDuxo.C281537.apply$lambda$8((Instrument) obj));
                    }
                }), new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchSelectorDuxo.C281537.apply$lambda$9((Instrument) obj);
                    }
                });
                Sequence map2 = SequencesKt.map(sequenceFlattenSequenceOfIterable2, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchSelectorDuxo.C281537.apply$lambda$10((UiCurrencyPair) obj);
                    }
                });
                Sequence map3 = SequencesKt.map(sequenceFlattenSequenceOfIterable3, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchSelectorDuxo.C281537.apply$lambda$11((ApiFuturesContractSearchItem) obj);
                    }
                });
                observableJust = Observable.just(SequencesKt.toList(SequencesKt.plus(SequencesKt.plus(SequencesKt.plus(map, map2), map3), SequencesKt.map(sequenceFlattenSequenceOfIterable4, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchSelectorDuxo.C281537.apply$lambda$12((ApiFuturesProductSearchItem) obj);
                    }
                }))));
            } else {
                if (!(searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Ladder)) {
                    throw new NoWhenBranchMatchedException();
                }
                observableJust = Observable.just(SequencesKt.toList(SequencesKt.map(SequencesKt.filter(sequenceFlattenSequenceOfIterable, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SearchSelectorDuxo.C281537.apply$lambda$13((Instrument) obj));
                    }
                }), new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$onCreate$7$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchSelectorDuxo.C281537.apply$lambda$14((Instrument) obj);
                    }
                })));
            }
            return observableJust.map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo.onCreate.7.1
                @Override // io.reactivex.functions.Function
                public final SearchSelectorViewState4.Success apply(List<? extends SearchSelectorViewState3> p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return new SearchSelectorViewState4.Success(p0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List apply$lambda$0(SearchResponse.Instruments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getInstruments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List apply$lambda$2(SearchResponse.CurrencyPairs it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCurrencyPairs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List apply$lambda$3(SearchResponse.FuturesResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof SearchResponse.FuturesResponse.ActiveFutures) {
                return ((SearchResponse.FuturesResponse.ActiveFutures) it).getFuturesItems();
            }
            if (it instanceof SearchResponse.FuturesResponse.FuturesContracts) {
                return ((SearchResponse.FuturesResponse.FuturesContracts) it).getFuturesItems();
            }
            if (it instanceof SearchResponse.FuturesResponse.NonActiveFutures) {
                return ((SearchResponse.FuturesResponse.NonActiveFutures) it).getFuturesItems();
            }
            if (it instanceof SearchResponse.FuturesResponse.FuturesProducts) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List apply$lambda$4(SearchResponse.FuturesResponse.FuturesProducts it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getFuturesItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchSelectorViewState3.SecurityRow.AdvancedChartResultItem apply$lambda$5(SearchSelectorLaunchMode searchSelectorLaunchMode, Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SearchSelectorViewState3.SecurityRow.AdvancedChartResultItem(it, ((SearchSelectorLaunchMode.AdvancedChart) searchSelectorLaunchMode).getBackToStockDetailPage());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean apply$lambda$6(Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Intrinsics.areEqual(it.getType(), "stock");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchSelectorViewState3.SecurityRow.TradingTrendsChartResultItem apply$lambda$7(Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SearchSelectorViewState3.SecurityRow.TradingTrendsChartResultItem(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean apply$lambda$8(Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return !it.isPreIpo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.Equity apply$lambda$9(Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.Equity(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.Crypto apply$lambda$10(UiCurrencyPair it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.Crypto(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.FuturesContractItem apply$lambda$11(ApiFuturesContractSearchItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.FuturesContractItem(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.FuturesProductItem apply$lambda$12(ApiFuturesProductSearchItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.FuturesProductItem(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean apply$lambda$13(Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return !it.isPreIpo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchSelectorViewState3.SecurityRow.LadderChartResultItem.Equity apply$lambda$14(Instrument it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SearchSelectorViewState3.SecurityRow.LadderChartResultItem.Equity(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(SearchSelectorDuxo searchSelectorDuxo, SearchSelectorViewState4 searchSelectorViewState4) {
        if (searchSelectorViewState4 instanceof SearchSelectorViewState4.Error) {
            searchSelectorDuxo.applyMutation(new SearchSelectorDuxo$onCreate$8$1(null));
            searchSelectorDuxo.submit(((SearchSelectorViewState4.Error) searchSelectorViewState4).getThrowable());
        } else if (Intrinsics.areEqual(searchSelectorViewState4, SearchSelectorViewState4.Loading.INSTANCE)) {
            searchSelectorDuxo.applyMutation(new SearchSelectorDuxo$onCreate$8$2(null));
        } else {
            if (!(searchSelectorViewState4 instanceof SearchSelectorViewState4.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            searchSelectorDuxo.applyMutation(new SearchSelectorDuxo$onCreate$8$3(searchSelectorViewState4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(SearchSelectorDuxo searchSelectorDuxo, boolean z) {
        searchSelectorDuxo.applyMutation(new SearchSelectorDuxo$onCreate$9$1(z, null));
        return Unit.INSTANCE;
    }

    private final Observable<List<SearchContentType>> streamContentTypes(final SearchSelectorLaunchMode launchMode) {
        Observable<List<SearchContentType>> map = Observables.INSTANCE.combineLatest(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, OptionsRegionGate.INSTANCE, false, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, AssetDigestsCryptoRegionGate.INSTANCE, false, 2, null)).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo.streamContentTypes.1
            @Override // io.reactivex.functions.Function
            public final List<SearchContentType> apply(Tuples2<Boolean, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                boolean zBooleanValue = tuples2.component1().booleanValue();
                boolean zBooleanValue2 = tuples2.component2().booleanValue();
                SearchSelectorLaunchMode searchSelectorLaunchMode = launchMode;
                if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.BwAdvanceChart) {
                    return ((SearchSelectorLaunchMode.BwAdvanceChart) searchSelectorLaunchMode).getSearchContentTypes();
                }
                if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Ladder) {
                    return ((SearchSelectorLaunchMode.Ladder) searchSelectorLaunchMode).getSearchContentTypes();
                }
                if (searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Copilot) {
                    return CollectionsKt.plus((Collection) CollectionsKt.listOf(SearchContentType.INSTRUMENTS), (Iterable) (zBooleanValue2 ? CollectionsKt.listOf(SearchContentType.CURRENCY_PAIRS) : CollectionsKt.emptyList()));
                }
                if (zBooleanValue) {
                    return CollectionsKt.listOf((Object[]) new SearchContentType[]{SearchContentType.INSTRUMENTS, SearchContentType.MARKET_INDEXES});
                }
                return CollectionsKt.listOf(SearchContentType.INSTRUMENTS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: SearchSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/selector/SearchSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorDuxo$searchTextChanged$1", m3645f = "SearchSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.selector.SearchSelectorDuxo$searchTextChanged$1 */
    static final class C281581 extends ContinuationImpl7 implements Function2<SearchSelectorViewState, Continuation<? super SearchSelectorViewState>, Object> {
        final /* synthetic */ String $newText;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C281581(String str, Continuation<? super C281581> continuation) {
            super(2, continuation);
            this.$newText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C281581 c281581 = new C281581(this.$newText, continuation);
            c281581.L$0 = obj;
            return c281581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SearchSelectorViewState searchSelectorViewState, Continuation<? super SearchSelectorViewState> continuation) {
            return ((C281581) create(searchSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SearchSelectorViewState.copy$default((SearchSelectorViewState) this.L$0, false, null, null, this.$newText, null, false, 55, null);
        }
    }

    public final void searchTextChanged(String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        applyMutation(new C281581(newText, null));
        this.searchRelay.accept(newText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SearchSelectorViewState3.SecurityRow.OptionsSearchResultItem> toOptionsSearchItems(List<UiOptionChainSearchItem> list, String str, SearchSelectorLaunchMode.Options options) {
        List<UiOptionChainSearchItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new SearchSelectorViewState3.SecurityRow.OptionsSearchResultItem(str, options, (UiOptionChainSearchItem) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SearchSelectorViewState3.SecurityRow.IndexOptionsSearchResultItem> toIndexOptionsSearchItems(List<UiIndexOptionChainSearchItem> list, String str, SearchSelectorLaunchMode.Options options) {
        List<UiIndexOptionChainSearchItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new SearchSelectorViewState3.SecurityRow.IndexOptionsSearchResultItem(str, options, (UiIndexOptionChainSearchItem) it.next()));
        }
        return arrayList;
    }

    public final void logSearchSelectorAppear() {
        EventLogger eventLogger = this.eventLogger;
        Companion companion = INSTANCE;
        Screen screen = ((SearchSelector) companion.getArgs((HasSavedState) this)).getScreen();
        String entryPointIdentifier = ((SearchSelector) companion.getArgs((HasSavedState) this)).getEntryPointIdentifier();
        if (entryPointIdentifier == null) {
            entryPointIdentifier = "";
        }
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), 13, null);
    }

    public final void logOptionSearchItemTap(String chainId, Component.ComponentType componentType) {
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Companion companion = INSTANCE;
        Screen screen = ((SearchSelector) companion.getArgs((HasSavedState) this)).getScreen();
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Component component = new Component(componentType, null, null, 6, null);
        String entryPointIdentifier = ((SearchSelector) companion.getArgs((HasSavedState) this)).getEntryPointIdentifier();
        if (entryPointIdentifier == null) {
            entryPointIdentifier = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(chainId, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -4194305, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sequence<SearchSelectorViewState3> mapToCopilotSearchItems(Sequence<? extends SearchResponse> sequence) {
        return SequencesKt.flatten(SequencesKt.map(sequence, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorDuxo.mapToCopilotSearchItems$lambda$13((SearchResponse) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence mapToCopilotSearchItems$lambda$13(SearchResponse response) {
        Sequence sequenceEmptySequence;
        Sequence sequenceEmptySequence2;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof SearchResponse.Instruments) {
            SearchResponse.Instruments instruments = (SearchResponse.Instruments) response;
            if (instruments.getInstruments().isEmpty()) {
                return SequencesKt.emptySequence();
            }
            String displayTitle = instruments.getDisplayTitle();
            if (displayTitle == null || (sequenceEmptySequence2 = SequencesKt.sequenceOf(new SearchSelectorViewState3.Header(displayTitle))) == null) {
                sequenceEmptySequence2 = SequencesKt.emptySequence();
            }
            return SequencesKt.plus(sequenceEmptySequence2, SequencesKt.map(CollectionsKt.asSequence(instruments.getInstruments()), new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSelectorDuxo.mapToCopilotSearchItems$lambda$13$lambda$10((Instrument) obj);
                }
            }));
        }
        if (response instanceof SearchResponse.CurrencyPairs) {
            SearchResponse.CurrencyPairs currencyPairs = (SearchResponse.CurrencyPairs) response;
            if (currencyPairs.getCurrencyPairs().isEmpty()) {
                return SequencesKt.emptySequence();
            }
            String displayTitle2 = currencyPairs.getDisplayTitle();
            if (displayTitle2 == null || (sequenceEmptySequence = SequencesKt.sequenceOf(new SearchSelectorViewState3.Header(displayTitle2))) == null) {
                sequenceEmptySequence = SequencesKt.emptySequence();
            }
            return SequencesKt.plus(sequenceEmptySequence, SequencesKt.map(CollectionsKt.asSequence(currencyPairs.getCurrencyPairs()), new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSelectorDuxo.mapToCopilotSearchItems$lambda$13$lambda$12((UiCurrencyPair) obj);
                }
            }));
        }
        return SequencesKt.emptySequence();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchSelectorViewState3.SecurityRow.CopilotResultItem mapToCopilotSearchItems$lambda$13$lambda$10(Instrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SearchSelectorViewState3.SecurityRow.CopilotResultItem(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchSelectorViewState3.SecurityRow.CopilotResultItem mapToCopilotSearchItems$lambda$13$lambda$12(UiCurrencyPair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SearchSelectorViewState3.SecurityRow.CopilotResultItem(it);
    }

    public final void logLadderSearchItemTap(SearchSelectorViewState3.SecurityRow.LadderChartResultItem searchItem, Component.ComponentType componentType) {
        Intrinsics.checkNotNullParameter(searchItem, "searchItem");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        if (!(searchItem instanceof SearchSelectorViewState3.SecurityRow.LadderChartResultItem.Equity)) {
            throw new NoWhenBranchMatchedException();
        }
        EventLogger eventLogger = this.eventLogger;
        Screen screen = ((SearchSelector) INSTANCE.getArgs((HasSavedState) this)).getScreen();
        Component component = new Component(componentType, "LADDER_MARKETING_SEARCH", null, 4, null);
        String string2 = ((SearchSelectorViewState3.SecurityRow.LadderChartResultItem.Equity) searchItem).getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(i, i2, i3, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, Asset.AssetType.INSTRUMENT, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    /* compiled from: SearchSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/search/selector/SearchSelectorDuxo;", "Lcom/robinhood/android/search/contracts/SearchSelector;", "<init>", "()V", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SearchSelectorDuxo, SearchSelector> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SearchSelector getArgs(SavedStateHandle savedStateHandle) {
            return (SearchSelector) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SearchSelector getArgs(SearchSelectorDuxo searchSelectorDuxo) {
            return (SearchSelector) DuxoCompanion.DefaultImpls.getArgs(this, searchSelectorDuxo);
        }
    }
}
