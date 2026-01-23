package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.librobinhood.data.util.InstrumentChartNormalizer;
import com.robinhood.models.api.bonfire.instrument.ApiStockDetailHistoricalChartData;
import com.robinhood.models.dao.StockDetailHistoricalChartDataDao;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.p320db.bonfire.instrument.StockDetailHistoricalChartData;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.UUID;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: StockDetailHistoricalChartDataStore.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0010J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J \u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001e2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010 \u0011*\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "Lcom/robinhood/store/Store;", "instrumentsApi", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "historicalChartDataDao", "Lcom/robinhood/models/dao/StockDetailHistoricalChartDataDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/models/dao/StockDetailHistoricalChartDataDao;Lcom/robinhood/store/StoreBundle;)V", "lastRequestMap", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Ljava/util/UUID;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore$RequestParams;", "kotlin.jvm.PlatformType", "historicalChartDataEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/instrument/ApiStockDetailHistoricalChartData;", "streamStockDetailsHistoricalChartData", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/instrument/StockDetailHistoricalChartData;", "streamStockDetailChartQuery", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "params", "internalStreamStockDetailChartQuery", "Lio/reactivex/Observable;", "internalStreamStockDetailChartQueryFlow", "streamChartV3", "updateLastRequestMap", "", "observeChartTypeWithFallback", "instrument", "Lcom/robinhood/models/db/Instrument;", "fallbackRequest", "RequestParams", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class StockDetailHistoricalChartDataStore extends Store {
    private static final long CHART_POLL_INTERVAL_SECONDS = 300;
    private final StockDetailHistoricalChartDataDao historicalChartDataDao;
    private final Endpoint<RequestParams, Response<ApiStockDetailHistoricalChartData>> historicalChartDataEndpoint;
    private final InstrumentsApi instrumentsApi;
    private final BehaviorRelay<Map<UUID, RequestParams>> lastRequestMap;
    private final QuoteStore quoteStore;
    private final Query<RequestParams, StockDetailHistoricalChartData> streamStockDetailsHistoricalChartData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockDetailHistoricalChartDataStore(InstrumentsApi instrumentsApi, QuoteStore quoteStore, StockDetailHistoricalChartDataDao historicalChartDataDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(historicalChartDataDao, "historicalChartDataDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.instrumentsApi = instrumentsApi;
        this.quoteStore = quoteStore;
        this.historicalChartDataDao = historicalChartDataDao;
        BehaviorRelay<Map<UUID, RequestParams>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(MapsKt.emptyMap());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.lastRequestMap = behaviorRelayCreateDefault;
        this.historicalChartDataEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new StockDetailHistoricalChartDataStore2(this, null), getLogoutKillswitch(), new StockDetailHistoricalChartDataStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.streamStockDetailsHistoricalChartData = Store.create$default(this, Query.INSTANCE, "querySduiInstrumentChart", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StockDetailHistoricalChartDataStore.streamStockDetailsHistoricalChartData$lambda$0(this.f$0, (StockDetailHistoricalChartDataStore.RequestParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StockDetailHistoricalChartDataStore.streamStockDetailsHistoricalChartData$lambda$1(this.f$0, (StockDetailHistoricalChartDataStore.RequestParams) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: StockDetailHistoricalChartDataStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\t\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore$RequestParams;", "", "instrumentId", "Ljava/util/UUID;", "span", "", "hideExtendedHours", "", "showCandlesticks", "isAllDayTrading", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSpan", "()Ljava/lang/String;", "getHideExtendedHours", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowCandlesticks", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore$RequestParams;", "equals", "other", "hashCode", "", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestParams {
        private final Boolean hideExtendedHours;
        private final UUID instrumentId;
        private final Boolean isAllDayTrading;
        private final Boolean showCandlesticks;
        private final String span;

        public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, UUID uuid, String str, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = requestParams.instrumentId;
            }
            if ((i & 2) != 0) {
                str = requestParams.span;
            }
            if ((i & 4) != 0) {
                bool = requestParams.hideExtendedHours;
            }
            if ((i & 8) != 0) {
                bool2 = requestParams.showCandlesticks;
            }
            if ((i & 16) != 0) {
                bool3 = requestParams.isAllDayTrading;
            }
            Boolean bool4 = bool3;
            Boolean bool5 = bool;
            return requestParams.copy(uuid, str, bool5, bool2, bool4);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSpan() {
            return this.span;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getHideExtendedHours() {
            return this.hideExtendedHours;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getShowCandlesticks() {
            return this.showCandlesticks;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsAllDayTrading() {
            return this.isAllDayTrading;
        }

        public final RequestParams copy(UUID instrumentId, String span, Boolean hideExtendedHours, Boolean showCandlesticks, Boolean isAllDayTrading) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(span, "span");
            return new RequestParams(instrumentId, span, hideExtendedHours, showCandlesticks, isAllDayTrading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestParams)) {
                return false;
            }
            RequestParams requestParams = (RequestParams) other;
            return Intrinsics.areEqual(this.instrumentId, requestParams.instrumentId) && Intrinsics.areEqual(this.span, requestParams.span) && Intrinsics.areEqual(this.hideExtendedHours, requestParams.hideExtendedHours) && Intrinsics.areEqual(this.showCandlesticks, requestParams.showCandlesticks) && Intrinsics.areEqual(this.isAllDayTrading, requestParams.isAllDayTrading);
        }

        public int hashCode() {
            int iHashCode = ((this.instrumentId.hashCode() * 31) + this.span.hashCode()) * 31;
            Boolean bool = this.hideExtendedHours;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.showCandlesticks;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isAllDayTrading;
            return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public String toString() {
            return "RequestParams(instrumentId=" + this.instrumentId + ", span=" + this.span + ", hideExtendedHours=" + this.hideExtendedHours + ", showCandlesticks=" + this.showCandlesticks + ", isAllDayTrading=" + this.isAllDayTrading + ")";
        }

        public RequestParams(UUID instrumentId, String span, Boolean bool, Boolean bool2, Boolean bool3) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(span, "span");
            this.instrumentId = instrumentId;
            this.span = span;
            this.hideExtendedHours = bool;
            this.showCandlesticks = bool2;
            this.isAllDayTrading = bool3;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSpan() {
            return this.span;
        }

        public final Boolean getHideExtendedHours() {
            return this.hideExtendedHours;
        }

        public final Boolean getShowCandlesticks() {
            return this.showCandlesticks;
        }

        public final Boolean isAllDayTrading() {
            return this.isAllDayTrading;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamStockDetailsHistoricalChartData$lambda$0(StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, RequestParams request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<RequestParams, Response<ApiStockDetailHistoricalChartData>> endpoint = stockDetailHistoricalChartDataStore.historicalChartDataEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(300L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint8.backendPoll$default(endpoint, request, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamStockDetailsHistoricalChartData$lambda$1(StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, RequestParams request) {
        Intrinsics.checkNotNullParameter(request, "request");
        StockDetailHistoricalChartDataDao stockDetailHistoricalChartDataDao = stockDetailHistoricalChartDataStore.historicalChartDataDao;
        UUID instrumentId = request.getInstrumentId();
        String span = request.getSpan();
        Boolean showCandlesticks = request.getShowCandlesticks();
        return stockDetailHistoricalChartDataDao.getInstrumentChart(instrumentId, span, showCandlesticks != null ? showCandlesticks.booleanValue() : false);
    }

    public final Flow<SduiInstrumentChart> streamStockDetailChartQuery(RequestParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        updateLastRequestMap(params);
        return internalStreamStockDetailChartQueryFlow(params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<SduiInstrumentChart> internalStreamStockDetailChartQuery(RequestParams params) {
        return asObservable(streamChartV3(params));
    }

    private final Flow<SduiInstrumentChart> internalStreamStockDetailChartQueryFlow(RequestParams params) {
        return streamChartV3(params);
    }

    private final Flow<SduiInstrumentChart> streamChartV3(RequestParams params) {
        Flow<Quote> flowStreamQuote = this.quoteStore.streamQuote(params.getInstrumentId());
        final Flow<StockDetailHistoricalChartData> flowAsFlow = this.streamStockDetailsHistoricalChartData.asFlow(params);
        return FlowKt.combine(flowStreamQuote, new Flow<SduiInstrumentChart>() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$streamChartV3$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$streamChartV3$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$streamChartV3$$inlined$mapNotNull$1$2", m3645f = "StockDetailHistoricalChartDataStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$streamChartV3$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        SduiInstrumentChart chartData = ((StockDetailHistoricalChartData) obj).getChartData();
                        if (chartData != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(chartData, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super SduiInstrumentChart> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new C346452(params, null));
    }

    /* compiled from: StockDetailHistoricalChartDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "quote", "Lcom/robinhood/models/db/Quote;", "chart"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$streamChartV3$2", m3645f = "StockDetailHistoricalChartDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$streamChartV3$2 */
    static final class C346452 extends ContinuationImpl7 implements Function3<Quote, SduiInstrumentChart, Continuation<? super SduiInstrumentChart>, Object> {
        final /* synthetic */ RequestParams $params;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346452(RequestParams requestParams, Continuation<? super C346452> continuation) {
            super(3, continuation);
            this.$params = requestParams;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Quote quote, SduiInstrumentChart sduiInstrumentChart, Continuation<? super SduiInstrumentChart> continuation) {
            C346452 c346452 = new C346452(this.$params, continuation);
            c346452.L$0 = quote;
            c346452.L$1 = sduiInstrumentChart;
            return c346452.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Quote quote = (Quote) this.L$0;
            SduiInstrumentChart sduiInstrumentChart = (SduiInstrumentChart) this.L$1;
            DisplaySpan displaySpanFromServerValue = DisplaySpan.INSTANCE.fromServerValue(this.$params.getSpan());
            if (displaySpanFromServerValue == null) {
                displaySpanFromServerValue = DisplaySpan.DAY;
            }
            return InstrumentChartNormalizer.renormalizeIfNecessary$default(sduiInstrumentChart, quote, displaySpanFromServerValue, null, 4, null);
        }
    }

    private final void updateLastRequestMap(RequestParams params) {
        Map<UUID, RequestParams> value = this.lastRequestMap.getValue();
        Map<UUID, RequestParams> mutableMap = value != null ? MapsKt.toMutableMap(value) : null;
        if (mutableMap != null) {
            mutableMap.put(params.getInstrumentId(), params);
        }
        if (mutableMap != null) {
            this.lastRequestMap.accept(mutableMap);
        }
    }

    public static /* synthetic */ Observable observeChartTypeWithFallback$default(StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, Instrument instrument, RequestParams requestParams, int i, Object obj) {
        if ((i & 2) != 0) {
            UUID id = instrument.getId();
            String serverValue = InstrumentChartSpansStore4.getDefaultSelectedSpan().getServerValue();
            Boolean bool = Boolean.FALSE;
            requestParams = new RequestParams(id, serverValue, bool, bool, Boolean.valueOf(Instrument4.isAllDayTradable(instrument)));
        }
        return stockDetailHistoricalChartDataStore.observeChartTypeWithFallback(instrument, requestParams);
    }

    public final Observable<SduiInstrumentChart> observeChartTypeWithFallback(final Instrument instrument, final RequestParams fallbackRequest) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(fallbackRequest, "fallbackRequest");
        Observable observableSwitchMap = this.lastRequestMap.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore.observeChartTypeWithFallback.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends SduiInstrumentChart> apply(Map<UUID, RequestParams> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore = StockDetailHistoricalChartDataStore.this;
                RequestParams requestParams = it.get(instrument.getId());
                if (requestParams == null) {
                    requestParams = fallbackRequest;
                }
                return stockDetailHistoricalChartDataStore.internalStreamStockDetailChartQuery(requestParams);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
