package com.robinhood.android.indexes.store;

import com.robinhood.android.charts.models.api.ApiIndexHistoricalChart;
import com.robinhood.android.charts.models.api.ApiIndexHistoricalChartRequest;
import com.robinhood.android.charts.models.dao.IndexHistoricalChartDao;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.api.IndexBonfireApi;
import com.robinhood.android.indexes.models.p159db.IndexChartNormalizer;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: IndexHistoricalChartStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "Lcom/robinhood/store/Store;", "indexBonfireApi", "Lcom/robinhood/android/indexes/models/api/IndexBonfireApi;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "chartDao", "Lcom/robinhood/android/charts/models/dao/IndexHistoricalChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/indexes/models/api/IndexBonfireApi;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/android/charts/models/dao/IndexHistoricalChartDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/charts/models/api/ApiIndexHistoricalChartRequest;", "Lretrofit2/Response;", "Lcom/robinhood/android/charts/models/api/ApiIndexHistoricalChart;", "indexHistoricalChartBackendPollQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", "streamNormalizedIndexHistoricalChartWithQuote", "Lkotlinx/coroutines/flow/Flow;", "request", "Companion", "lib-store-indexes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexHistoricalChartStore extends Store {
    private static final long DEFAULT_BACKEND_POLL_INTERVAL_MINUTES = 1;
    private final IndexHistoricalChartDao chartDao;
    private final Endpoint<ApiIndexHistoricalChartRequest, Response<ApiIndexHistoricalChart>> endpoint;
    private final IndexBonfireApi indexBonfireApi;
    private final Query<ApiIndexHistoricalChartRequest, IndexHistoricalChartModel> indexHistoricalChartBackendPollQuery;
    private final IndexStore indexStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexHistoricalChartStore(IndexBonfireApi indexBonfireApi, IndexStore indexStore, IndexHistoricalChartDao chartDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(indexBonfireApi, "indexBonfireApi");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(chartDao, "chartDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.indexBonfireApi = indexBonfireApi;
        this.indexStore = indexStore;
        this.chartDao = chartDao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new IndexHistoricalChartStore2(this, null), getLogoutKillswitch(), new IndexHistoricalChartStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.indexHistoricalChartBackendPollQuery = Store.create$default(this, Query.INSTANCE, "indexHistoricalChartBackendPollQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.indexes.store.IndexHistoricalChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexHistoricalChartStore.indexHistoricalChartBackendPollQuery$lambda$0(this.f$0, (ApiIndexHistoricalChartRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.indexes.store.IndexHistoricalChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexHistoricalChartStore.indexHistoricalChartBackendPollQuery$lambda$1(this.f$0, (ApiIndexHistoricalChartRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexHistoricalChartBackendPollQuery$lambda$0(IndexHistoricalChartStore indexHistoricalChartStore, ApiIndexHistoricalChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<ApiIndexHistoricalChartRequest, Response<ApiIndexHistoricalChart>> endpoint = indexHistoricalChartStore.endpoint;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint8.backendPoll$default(endpoint, request, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexHistoricalChartBackendPollQuery$lambda$1(IndexHistoricalChartStore indexHistoricalChartStore, ApiIndexHistoricalChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        IndexHistoricalChartDao indexHistoricalChartDao = indexHistoricalChartStore.chartDao;
        UUID index_id = request.getIndex_id();
        DisplaySpan display_span = request.getDisplay_span();
        Boolean show_candlesticks = request.getShow_candlesticks();
        return indexHistoricalChartDao.getIndexHistoricalChartModel(index_id, display_span, show_candlesticks != null ? show_candlesticks.booleanValue() : false);
    }

    public final Flow<IndexHistoricalChartModel> streamNormalizedIndexHistoricalChartWithQuote(ApiIndexHistoricalChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final Flow flowCombine = Operators.combine(this.indexHistoricalChartBackendPollQuery.asFlow(request), FlowKt.distinctUntilChanged(this.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(request.getIndex_id()))));
        return new Flow<IndexHistoricalChartModel>() { // from class: com.robinhood.android.indexes.store.IndexHistoricalChartStore$streamNormalizedIndexHistoricalChartWithQuote$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.indexes.store.IndexHistoricalChartStore$streamNormalizedIndexHistoricalChartWithQuote$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexHistoricalChartStore$streamNormalizedIndexHistoricalChartWithQuote$$inlined$map$1$2", m3645f = "IndexHistoricalChartStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.indexes.store.IndexHistoricalChartStore$streamNormalizedIndexHistoricalChartWithQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        Tuples2 tuples2 = (Tuples2) obj;
                        IndexHistoricalChartModel indexHistoricalChartModelNormalize$default = IndexChartNormalizer.normalize$default((IndexHistoricalChartModel) tuples2.component1(), (IndexValue) tuples2.component2(), null, 2, null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(indexHistoricalChartModelNormalize$default, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super IndexHistoricalChartModel> flowCollector, Continuation continuation) {
                Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
