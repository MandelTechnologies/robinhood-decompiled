package com.robinhood.store.search;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.search.SearchBonfireApi;
import com.robinhood.api.search.SearchCryptoBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.api.search.ApiSearchContent;
import com.robinhood.models.api.search.ApiSearchItem;
import com.robinhood.models.api.search.ApiSearchResult;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.models.api.search.SearchQueryContext;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Currency4;
import com.robinhood.models.dao.CurrencyDao;
import com.robinhood.models.dao.CurrencyPairDao;
import com.robinhood.models.dao.InstrumentDao;
import com.robinhood.models.p320db.recentSearch.RecentSearch;
import com.robinhood.models.p320db.recentSearch.RecentSearchDao;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.search.SearchStore3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SearchStore.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013JV\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0(JV\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0*2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0(J\u0016\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0002J\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001f0*2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020/J\u0016\u00104\u001a\u00020,2\u0006\u00103\u001a\u00020/H\u0086@¢\u0006\u0002\u00105R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/store/search/SearchStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "instrumentDao", "Lcom/robinhood/models/dao/InstrumentDao;", "currencyPairDao", "Lcom/robinhood/models/dao/CurrencyPairDao;", "currencyDao", "Lcom/robinhood/models/dao/CurrencyDao;", "recentSearchDao", "Lcom/robinhood/models/db/recentSearch/RecentSearchDao;", "bonfire", "Lcom/robinhood/api/search/SearchBonfireApi;", "searchCryptoBonfireApi", "Lcom/robinhood/api/search/SearchCryptoBonfireApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InstrumentDao;Lcom/robinhood/models/dao/CurrencyPairDao;Lcom/robinhood/models/dao/CurrencyDao;Lcom/robinhood/models/db/recentSearch/RecentSearchDao;Lcom/robinhood/api/search/SearchBonfireApi;Lcom/robinhood/api/search/SearchCryptoBonfireApi;Lcom/robinhood/shared/security/auth/AuthManager;)V", "searchEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/search/SearchParams;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/search/ApiSearchResult;", "search", "Lio/reactivex/Observable;", "Lcom/robinhood/store/search/SearchResult;", "query", "", "contentTypes", "", "Lcom/robinhood/models/api/search/SearchContentType;", "queryContext", "Lcom/robinhood/models/api/search/SearchQueryContext;", "searchSource", "Lcom/robinhood/store/search/SearchSource;", "ignoreEmptyQuery", "", "additionalParams", "", "pollSearch", "Lkotlinx/coroutines/flow/Flow;", "saveInstrumentsAndCurrencyPairs", "", "results", "streamRecentSearches", "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;", "count", "", "saveRecentSearch", "recentSearch", "deleteRecentSearch", "(Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SearchStore extends Store {
    private final AuthManager authManager;
    private final SearchBonfireApi bonfire;
    private final CurrencyDao currencyDao;
    private final CurrencyPairDao currencyPairDao;
    private final InstrumentDao instrumentDao;
    private final RecentSearchDao recentSearchDao;
    private final SearchCryptoBonfireApi searchCryptoBonfireApi;
    private final Endpoint<SearchParams, PaginatedResult<ApiSearchResult>> searchEndpoint;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean searchEndpoint$lambda$0(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchStore(StoreBundle storeBundle, InstrumentDao instrumentDao, CurrencyPairDao currencyPairDao, CurrencyDao currencyDao, RecentSearchDao recentSearchDao, SearchBonfireApi bonfire2, SearchCryptoBonfireApi searchCryptoBonfireApi, AuthManager authManager) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(instrumentDao, "instrumentDao");
        Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(recentSearchDao, "recentSearchDao");
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(searchCryptoBonfireApi, "searchCryptoBonfireApi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.instrumentDao = instrumentDao;
        this.currencyPairDao = currencyPairDao;
        this.currencyDao = currencyDao;
        this.recentSearchDao = recentSearchDao;
        this.bonfire = bonfire2;
        this.searchCryptoBonfireApi = searchCryptoBonfireApi;
        this.authManager = authManager;
        this.searchEndpoint = Endpoint.INSTANCE.create(new SearchStore6(this, null), getLogoutKillswitch(), new SearchStore7(this, null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.store.search.SearchStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SearchStore.searchEndpoint$lambda$0((Long) obj));
            }
        });
    }

    public static /* synthetic */ Observable search$default(SearchStore searchStore, String str, List list, SearchQueryContext searchQueryContext, SearchStore4 searchStore4, boolean z, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            searchQueryContext = SearchQueryContext.DEFAULT;
        }
        SearchQueryContext searchQueryContext2 = searchQueryContext;
        if ((i & 8) != 0) {
            searchStore4 = SearchStore4.UNIVERSAL;
        }
        SearchStore4 searchStore42 = searchStore4;
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            map = MapsKt.emptyMap();
        }
        return searchStore.search(str, list, searchQueryContext2, searchStore42, z2, map);
    }

    public final Observable<SearchStore3> search(String query, List<? extends SearchContentType> contentTypes, SearchQueryContext queryContext, SearchStore4 searchSource, boolean ignoreEmptyQuery, Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(contentTypes, "contentTypes");
        Intrinsics.checkNotNullParameter(queryContext, "queryContext");
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        if (query.length() == 0 && ignoreEmptyQuery) {
            Observable<SearchStore3> observableJust = Observable.just(new SearchStore3.Success(CollectionsKt.emptyList()));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        SearchContentType.Companion companion = SearchContentType.INSTANCE;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = contentTypes.iterator();
        while (it.hasNext()) {
            String serverValue = companion.toServerValue((SearchContentType) it.next());
            if (serverValue != null) {
                arrayList.add(serverValue);
            }
        }
        Observable<SearchStore3> observableStartWith = RxFactory.DefaultImpls.rxSingle$default(this, null, new C415691(query, CommaSeparatedList2.toCommaSeparatedList(arrayList), queryContext, searchSource, additionalParams, null), 1, null).map(new Function() { // from class: com.robinhood.store.search.SearchStore.search.2
            @Override // io.reactivex.functions.Function
            public final SearchStore3 apply(PaginatedResult<ApiSearchResult> apiSearchResult) {
                Intrinsics.checkNotNullParameter(apiSearchResult, "apiSearchResult");
                return new SearchStore3.Success(SearchStore8.toSearchResponse(apiSearchResult.getResults()));
            }
        }).subscribeOn(Schedulers.m3346io()).toObservable().onErrorReturn(new Function() { // from class: com.robinhood.store.search.SearchStore.search.3
            @Override // io.reactivex.functions.Function
            public final SearchStore3 apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return new SearchStore3.Error(t);
            }
        }).startWith((Observable) SearchStore3.Loading.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        return observableStartWith;
    }

    /* compiled from: SearchStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/search/ApiSearchResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.search.SearchStore$search$1", m3645f = "SearchStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.search.SearchStore$search$1 */
    static final class C415691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiSearchResult>>, Object> {
        final /* synthetic */ Map<String, String> $additionalParams;
        final /* synthetic */ CommaSeparatedList<String> $commaSeparatedContentTypes;
        final /* synthetic */ String $query;
        final /* synthetic */ SearchQueryContext $queryContext;
        final /* synthetic */ SearchStore4 $searchSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415691(String str, CommaSeparatedList<String> commaSeparatedList, SearchQueryContext searchQueryContext, SearchStore4 searchStore4, Map<String, String> map, Continuation<? super C415691> continuation) {
            super(2, continuation);
            this.$query = str;
            this.$commaSeparatedContentTypes = commaSeparatedList;
            this.$queryContext = searchQueryContext;
            this.$searchSource = searchStore4;
            this.$additionalParams = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchStore.this.new C415691(this.$query, this.$commaSeparatedContentTypes, this.$queryContext, this.$searchSource, this.$additionalParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiSearchResult>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiSearchResult>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiSearchResult>> continuation) {
            return ((C415691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = SearchStore.this.searchEndpoint;
            SearchParams searchParams = new SearchParams(this.$query, this.$commaSeparatedContentTypes, this.$queryContext.getServerValue(), this.$searchSource, this.$additionalParams);
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, searchParams, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public static /* synthetic */ Flow pollSearch$default(SearchStore searchStore, String str, List list, SearchQueryContext searchQueryContext, SearchStore4 searchStore4, boolean z, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            searchQueryContext = SearchQueryContext.DEFAULT;
        }
        SearchQueryContext searchQueryContext2 = searchQueryContext;
        if ((i & 8) != 0) {
            searchStore4 = SearchStore4.UNIVERSAL;
        }
        SearchStore4 searchStore42 = searchStore4;
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            map = MapsKt.emptyMap();
        }
        return searchStore.pollSearch(str, list, searchQueryContext2, searchStore42, z2, map);
    }

    public final Flow<SearchStore3> pollSearch(String query, List<? extends SearchContentType> contentTypes, SearchQueryContext queryContext, SearchStore4 searchSource, boolean ignoreEmptyQuery, Map<String, String> additionalParams) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(contentTypes, "contentTypes");
        Intrinsics.checkNotNullParameter(queryContext, "queryContext");
        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        if (query.length() == 0 && ignoreEmptyQuery) {
            return FlowKt.flowOf(new SearchStore3.Success(CollectionsKt.emptyList()));
        }
        SearchContentType.Companion companion = SearchContentType.INSTANCE;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = contentTypes.iterator();
        while (it.hasNext()) {
            String serverValue = companion.toServerValue((SearchContentType) it.next());
            if (serverValue != null) {
                arrayList.add(serverValue);
            }
        }
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.searchEndpoint, new SearchParams(query, CommaSeparatedList2.toCommaSeparatedList(arrayList), queryContext.getServerValue(), searchSource, additionalParams), null, null, 6, null);
        return FlowKt.onStart(new Flow<SearchStore3>() { // from class: com.robinhood.store.search.SearchStore$pollSearch$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SearchStore3> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C415642(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.search.SearchStore$pollSearch$$inlined$map$1$2 */
            public static final class C415642<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.search.SearchStore$pollSearch$$inlined$map$1$2", m3645f = "SearchStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.search.SearchStore$pollSearch$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C415642.this.emit(null, this);
                    }
                }

                public C415642(FlowCollector flowCollector) {
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
                        SearchStore3.Success success = new SearchStore3.Success(SearchStore8.toSearchResponse(((PaginatedResult) obj).getResults()));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(success, anonymousClass1) == coroutine_suspended) {
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
        }, new C415672(null));
    }

    /* compiled from: SearchStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/search/SearchResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.search.SearchStore$pollSearch$2", m3645f = "SearchStore.kt", m3646l = {150}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.search.SearchStore$pollSearch$2 */
    static final class C415672 extends ContinuationImpl7 implements Function2<FlowCollector<? super SearchStore3>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C415672(Continuation<? super C415672> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415672 c415672 = new C415672(continuation);
            c415672.L$0 = obj;
            return c415672;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super SearchStore3> flowCollector, Continuation<? super Unit> continuation) {
            return ((C415672) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                SearchStore3.Loading loading = SearchStore3.Loading.INSTANCE;
                this.label = 1;
                if (flowCollector.emit(loading, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveInstrumentsAndCurrencyPairs(List<ApiSearchResult> results) {
        List<ApiSearchResult> list = results;
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.store.search.SearchStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchStore.saveInstrumentsAndCurrencyPairs$lambda$3((ApiSearchResult) obj);
            }
        }), new Function1<Object, Boolean>() { // from class: com.robinhood.store.search.SearchStore$saveInstrumentsAndCurrencyPairs$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ApiSearchContent.InstrumentContent);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        List list2 = SequencesKt.toList(SequencesKt.flatMapIterable(sequenceFilter, new Function1() { // from class: com.robinhood.store.search.SearchStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchStore.saveInstrumentsAndCurrencyPairs$lambda$5((ApiSearchContent.InstrumentContent) obj);
            }
        }));
        Sequence sequenceFilter2 = SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.store.search.SearchStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchStore.saveInstrumentsAndCurrencyPairs$lambda$6((ApiSearchResult) obj);
            }
        }), new Function1<Object, Boolean>() { // from class: com.robinhood.store.search.SearchStore$saveInstrumentsAndCurrencyPairs$$inlined$filterIsInstance$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ApiSearchContent.CurrencyPairContent);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Sequence sequenceFlatMapIterable = SequencesKt.flatMapIterable(sequenceFilter2, new Function1() { // from class: com.robinhood.store.search.SearchStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchStore.saveInstrumentsAndCurrencyPairs$lambda$8((ApiSearchContent.CurrencyPairContent) obj);
            }
        });
        List list3 = SequencesKt.toList(SequencesKt.map(sequenceFlatMapIterable, SearchStore5.INSTANCE));
        List list4 = SequencesKt.toList(SequencesKt.flatMapIterable(sequenceFlatMapIterable, new Function1() { // from class: com.robinhood.store.search.SearchStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchStore.saveInstrumentsAndCurrencyPairs$lambda$9((ApiCurrencyPair) obj);
            }
        }));
        this.instrumentDao.insert(list2);
        this.currencyDao.insert(list4);
        this.currencyPairDao.insert((Iterable) list3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiSearchContent saveInstrumentsAndCurrencyPairs$lambda$3(ApiSearchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable saveInstrumentsAndCurrencyPairs$lambda$5(ApiSearchContent.InstrumentContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        List<ApiSearchItem.InstrumentItem> data = content.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiSearchItem.InstrumentItem) it.next()).getInstrument());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiSearchContent saveInstrumentsAndCurrencyPairs$lambda$6(ApiSearchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable saveInstrumentsAndCurrencyPairs$lambda$8(ApiSearchContent.CurrencyPairContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        List<ApiSearchItem.CurrencyPairItem> data = content.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiSearchItem.CurrencyPairItem) it.next()).getCurrencyPair());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable saveInstrumentsAndCurrencyPairs$lambda$9(ApiCurrencyPair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf((Object[]) new Currency[]{Currency4.toDbModel(it.getAssetCurrency()), Currency4.toDbModel(it.getQuoteCurrency())});
    }

    public final Flow<List<RecentSearch.RecentSearchResult>> streamRecentSearches(int count) {
        return this.recentSearchDao.get(count);
    }

    /* compiled from: SearchStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.search.SearchStore$saveRecentSearch$1", m3645f = "SearchStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.search.SearchStore$saveRecentSearch$1 */
    static final class C415681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecentSearch.RecentSearchResult $recentSearch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415681(RecentSearch.RecentSearchResult recentSearchResult, Continuation<? super C415681> continuation) {
            super(2, continuation);
            this.$recentSearch = recentSearchResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchStore.this.new C415681(this.$recentSearch, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C415681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SearchStore.this.recentSearchDao.insert((RecentSearchDao) this.$recentSearch);
                RecentSearchDao recentSearchDao = SearchStore.this.recentSearchDao;
                this.label = 1;
                if (recentSearchDao.resize(15, this) == coroutine_suspended) {
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

    public final void saveRecentSearch(RecentSearch.RecentSearchResult recentSearch) {
        Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C415681(recentSearch, null), 3, null);
    }

    public final Object deleteRecentSearch(RecentSearch.RecentSearchResult recentSearchResult, Continuation<? super Unit> continuation) {
        Object objDelete = this.recentSearchDao.delete(recentSearchResult, continuation);
        return objDelete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }
}
