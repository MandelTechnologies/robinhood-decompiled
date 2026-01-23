package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.android.models.portfolio.AccountMarketValuesLiveDao;
import com.robinhood.android.models.portfolio.PerformanceChartDao;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.api.ApiAccountMarketValuesLive;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.util.Money;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: PerformanceChartStore.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002ABB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00060\fj\u0002`\u00122\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010$\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010#0!0\u00172\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000f\u001a\u00020 2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J5\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00172\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000f\u001a\u00020 2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b&\u0010%J\u001a\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R*\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\fj\u0002`\u0012\u0012\u0004\u0012\u00020\u00150,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R,\u00100\u001a\u001a\u0012\b\u0012\u00060\fj\u0002`\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010#0+0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0018068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010@\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020?0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>¨\u0006C"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "portfolioApi", "Lcom/robinhood/android/models/portfolio/PerformanceChartDao;", "chartDao", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLiveDao;", "accountMarketValuesLiveDao", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/android/models/portfolio/PerformanceChartDao;Lcom/robinhood/android/models/portfolio/AccountMarketValuesLiveDao;Lcom/robinhood/store/StoreBundle;)V", "", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountNumber;", "accountNumber", "chartType", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "displayCurrency", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/ChartKey;", "getChartKey", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)Ljava/lang/String;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "chartQuery", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshChart", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;Z)Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "Lkotlin/Pair;", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "streamAccountMarketValuesAndDirection", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)Lkotlinx/coroutines/flow/Flow;", "streamDirection", "refreshChartIfStale", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/portfolio/PerformanceChartDao;", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLiveDao;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "lastRequestMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "directionMap", "Ljava/util/Map;", "j$/time/Duration", "kotlin.jvm.PlatformType", "staleDuration", "Lj$/time/Duration;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$AccountMarketValuesLiveRequest;", "Lcom/robinhood/android/models/portfolio/api/ApiAccountMarketValuesLive;", "accountMarketValuesLiveEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "chartEndpoint", "Lcom/robinhood/android/moria/db/Query;", "internalChartQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "accountMarketValuesLiveQuery", "AccountMarketValuesLiveRequest", "PerformanceChartRequest", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PerformanceChartStore extends Store {
    private final AccountMarketValuesLiveDao accountMarketValuesLiveDao;
    private final Endpoint<AccountMarketValuesLiveRequest, ApiAccountMarketValuesLive> accountMarketValuesLiveEndpoint;
    private final Query<AccountMarketValuesLiveRequest, AccountMarketValuesLive> accountMarketValuesLiveQuery;
    private final PerformanceChartDao chartDao;
    private final Endpoint<PerformanceChartRequest, PerformanceChartModel> chartEndpoint;
    private final Map<String, StateFlow2<Direction>> directionMap;
    private final Query<PerformanceChartRequest, PerformanceChartModel> internalChartQuery;
    private final StateFlow2<Map<String, PerformanceChartRequest>> lastRequestMap;
    private final Duration staleDuration;

    /* compiled from: PerformanceChartStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore", m3645f = "PerformanceChartStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "refreshChartIfStale")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$refreshChartIfStale$1 */
    static final class C346771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C346771(Continuation<? super C346771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PerformanceChartStore.this.refreshChartIfStale(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceChartStore(PortfolioApi portfolioApi, PerformanceChartDao chartDao, AccountMarketValuesLiveDao accountMarketValuesLiveDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(chartDao, "chartDao");
        Intrinsics.checkNotNullParameter(accountMarketValuesLiveDao, "accountMarketValuesLiveDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.chartDao = chartDao;
        this.accountMarketValuesLiveDao = accountMarketValuesLiveDao;
        this.lastRequestMap = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.directionMap = new LinkedHashMap();
        this.staleDuration = Duration.ofMinutes(30L);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<AccountMarketValuesLiveRequest, ApiAccountMarketValuesLive> endpointCreate$default = Endpoint.Companion.create$default(companion, new PerformanceChartStore2(portfolioApi, null), getLogoutKillswitch(), new PerformanceChartStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.accountMarketValuesLiveEndpoint = endpointCreate$default;
        Endpoint<PerformanceChartRequest, PerformanceChartModel> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(companion, new PerformanceChartStore5(portfolioApi, null), getLogoutKillswitch(), new PerformanceChartStore6(this, null), storeBundle.getClock(), null, 16, null);
        this.chartEndpoint = endpointCreateWithParams$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.internalChartQuery = Store.create$default(this, companion2, "queryPerformanceChart", CollectionsKt.listOf(new PollEach(getStoreScope(), new PerformanceChartStore7(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartStore.internalChartQuery$lambda$1(this.f$0, (PerformanceChartStore.PerformanceChartRequest) obj);
            }
        }, false, 8, null);
        this.accountMarketValuesLiveQuery = Store.create$default(this, companion2, "queryAccountMarketValuesLive", CollectionsKt.listOf(new PollEach(getStoreScope(), new PerformanceChartStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartStore.accountMarketValuesLiveQuery$lambda$3(this.f$0, (PerformanceChartStore.AccountMarketValuesLiveRequest) obj);
            }
        }, false, 8, null);
    }

    public final Flow<PerformanceChartModel> chartQuery(PerformanceChartRequest request) {
        Map<String, PerformanceChartRequest> value;
        Intrinsics.checkNotNullParameter(request, "request");
        String chartKey = getChartKey(request.getAccountNumber(), request.getChartType(), request.getDisplayCurrency());
        StateFlow2<Map<String, PerformanceChartRequest>> stateFlow2 = this.lastRequestMap;
        do {
            value = stateFlow2.getValue();
        } while (!stateFlow2.compareAndSet(value, MapsKt.plus(value, Tuples4.m3642to(chartKey, request))));
        return FlowKt.onCompletion(FlowKt.onEach(this.internalChartQuery.asFlow(request), new C346752(chartKey, null)), new C346763(chartKey, null));
    }

    /* compiled from: PerformanceChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartQuery$2", m3645f = "PerformanceChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartQuery$2 */
    static final class C346752 extends ContinuationImpl7 implements Function2<PerformanceChartModel, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346752(String str, Continuation<? super C346752> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C346752 c346752 = PerformanceChartStore.this.new C346752(this.$key, continuation);
            c346752.L$0 = obj;
            return c346752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PerformanceChartModel performanceChartModel, Continuation<? super Unit> continuation) {
            return ((C346752) create(performanceChartModel, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceChartModel performanceChartModel = (PerformanceChartModel) this.L$0;
                if (!PerformanceChartStore.this.directionMap.containsKey(this.$key)) {
                    PerformanceChartStore.this.directionMap.put(this.$key, StateFlow4.MutableStateFlow(performanceChartModel.getPageDirection()));
                } else {
                    StateFlow2 stateFlow2 = (StateFlow2) PerformanceChartStore.this.directionMap.get(this.$key);
                    if (stateFlow2 != null) {
                        do {
                            value = stateFlow2.getValue();
                        } while (!stateFlow2.compareAndSet(value, performanceChartModel.getPageDirection()));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PerformanceChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartQuery$3", m3645f = "PerformanceChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$chartQuery$3 */
    static final class C346763 extends ContinuationImpl7 implements Function3<FlowCollector<? super PerformanceChartModel>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346763(String str, Continuation<? super C346763> continuation) {
            super(3, continuation);
            this.$key = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super PerformanceChartModel> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return PerformanceChartStore.this.new C346763(this.$key, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = PerformanceChartStore.this.lastRequestMap;
                String str = this.$key;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, MapsKt.minus((Map<? extends String, ? extends V>) value, str)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow internalChartQuery$lambda$1(PerformanceChartStore performanceChartStore, PerformanceChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return performanceChartStore.chartDao.getPerformanceChart(request.getAccountNumber(), request.getChartType(), request.getChartStyleOrDefault(), request.getDisplaySpanOrDefault(), request.getIncludeAllHoursOrDefault(), request.isForWidget(), request.isPrivacyEnabled(), request.getDisplayCurrency());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow accountMarketValuesLiveQuery$lambda$3(PerformanceChartStore performanceChartStore, AccountMarketValuesLiveRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return performanceChartStore.accountMarketValuesLiveDao.streamAccountMarketValuesLive(request.getAccountNumber(), request.getDisplayCurrency());
    }

    public static /* synthetic */ Job refreshChart$default(PerformanceChartStore performanceChartStore, PerformanceChartRequest performanceChartRequest, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return performanceChartStore.refreshChart(performanceChartRequest, z);
    }

    public final Job refreshChart(PerformanceChartRequest request, boolean force) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.refresh$default(this.chartEndpoint, request, force, null, 4, null);
    }

    public static /* synthetic */ Flow streamAccountMarketValuesAndDirection$default(PerformanceChartStore performanceChartStore, String str, PerformanceChartType performanceChartType, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 4) != 0) {
            displayCurrency = DisplayCurrency.USD;
        }
        return performanceChartStore.streamAccountMarketValuesAndDirection(str, performanceChartType, displayCurrency);
    }

    public final Flow<Tuples2<Money, Direction>> streamAccountMarketValuesAndDirection(String accountNumber, PerformanceChartType chartType, DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return FlowKt.transformLatest(this.lastRequestMap, new C34672x71b39ffc(null, getChartKey$default(this, accountNumber, chartType.getServerValue(), null, 4, null), this, accountNumber, displayCurrency, chartType));
    }

    public static /* synthetic */ Flow streamDirection$default(PerformanceChartStore performanceChartStore, String str, PerformanceChartType performanceChartType, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 4) != 0) {
            displayCurrency = null;
        }
        return performanceChartStore.streamDirection(str, performanceChartType, displayCurrency);
    }

    public final Flow<Direction> streamDirection(String accountNumber, PerformanceChartType chartType, DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        return FlowKt.transformLatest(this.lastRequestMap, new PerformanceChartStore$streamDirection$$inlined$flatMapLatest$1(null, getChartKey(accountNumber, chartType.getServerValue(), displayCurrency), this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshChartIfStale(PerformanceChartRequest performanceChartRequest, Continuation<? super Job> continuation) {
        C346771 c346771;
        if (continuation instanceof C346771) {
            c346771 = (C346771) continuation;
            int i = c346771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346771.label = i - Integer.MIN_VALUE;
            } else {
                c346771 = new C346771(continuation);
            }
        }
        Object objFirst = c346771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<PerformanceChartModel> performanceChart = this.chartDao.getPerformanceChart(performanceChartRequest.getAccountNumber(), performanceChartRequest.getChartType(), performanceChartRequest.getChartStyleOrDefault(), performanceChartRequest.getDisplaySpanOrDefault(), performanceChartRequest.getIncludeAllHoursOrDefault(), performanceChartRequest.isForWidget(), performanceChartRequest.isPrivacyEnabled(), performanceChartRequest.getDisplayCurrency());
            c346771.L$0 = performanceChartRequest;
            c346771.label = 1;
            objFirst = FlowKt.first(performanceChart, c346771);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            performanceChartRequest = (PerformanceChartRequest) c346771.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        PerformanceChartModel performanceChartModel = (PerformanceChartModel) objFirst;
        if (performanceChartModel == null || Instant.now().minus((TemporalAmount) this.staleDuration).isAfter(performanceChartModel.getReceivedAt())) {
            return refreshChart$default(this, performanceChartRequest, false, 2, null);
        }
        return null;
    }

    static /* synthetic */ String getChartKey$default(PerformanceChartStore performanceChartStore, String str, String str2, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 4) != 0) {
            displayCurrency = null;
        }
        return performanceChartStore.getChartKey(str, str2, displayCurrency);
    }

    private final String getChartKey(String accountNumber, String chartType, DisplayCurrency displayCurrency) {
        return accountNumber + chartType + displayCurrency;
    }

    /* compiled from: PerformanceChartStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$AccountMarketValuesLiveRequest;", "", "accountNumber", "", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountNumber;", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "getAccountNumber", "()Ljava/lang/String;", "getDisplayCurrency", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountMarketValuesLiveRequest {
        private final String accountNumber;
        private final DisplayCurrency displayCurrency;

        public static /* synthetic */ AccountMarketValuesLiveRequest copy$default(AccountMarketValuesLiveRequest accountMarketValuesLiveRequest, String str, DisplayCurrency displayCurrency, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountMarketValuesLiveRequest.accountNumber;
            }
            if ((i & 2) != 0) {
                displayCurrency = accountMarketValuesLiveRequest.displayCurrency;
            }
            return accountMarketValuesLiveRequest.copy(str, displayCurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final AccountMarketValuesLiveRequest copy(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            return new AccountMarketValuesLiveRequest(accountNumber, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountMarketValuesLiveRequest)) {
                return false;
            }
            AccountMarketValuesLiveRequest accountMarketValuesLiveRequest = (AccountMarketValuesLiveRequest) other;
            return Intrinsics.areEqual(this.accountNumber, accountMarketValuesLiveRequest.accountNumber) && this.displayCurrency == accountMarketValuesLiveRequest.displayCurrency;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.displayCurrency.hashCode();
        }

        public String toString() {
            return "AccountMarketValuesLiveRequest(accountNumber=" + this.accountNumber + ", displayCurrency=" + this.displayCurrency + ")";
        }

        public AccountMarketValuesLiveRequest(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            this.accountNumber = accountNumber;
            this.displayCurrency = displayCurrency;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }
    }

    /* compiled from: PerformanceChartStore.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010%\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010,\u001a\u00020\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J|\u0010.\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u0014\u0010#\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013¨\u00065"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "", "accountNumber", "", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountNumber;", "chartType", "chartStyle", "displaySpan", "isForWidget", "", "benchmarkIds", "", "includeAllHours", "isPrivacyEnabled", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;ZLcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "getChartStyle", "getDisplaySpan", "()Z", "getBenchmarkIds", "()Ljava/util/List;", "getIncludeAllHours", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayCurrency", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "displaySpanOrDefault", "getDisplaySpanOrDefault$lib_store_portfolio_externalDebug", "chartStyleOrDefault", "getChartStyleOrDefault$lib_store_portfolio_externalDebug", "includeAllHoursOrDefault", "getIncludeAllHoursOrDefault$lib_store_portfolio_externalDebug", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;ZLcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "equals", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PerformanceChartRequest {
        private final String accountNumber;
        private final List<String> benchmarkIds;
        private final String chartStyle;
        private final String chartStyleOrDefault;
        private final String chartType;
        private final DisplayCurrency displayCurrency;
        private final String displaySpan;
        private final String displaySpanOrDefault;
        private final Boolean includeAllHours;
        private final String includeAllHoursOrDefault;
        private final boolean isForWidget;
        private final boolean isPrivacyEnabled;

        public static /* synthetic */ PerformanceChartRequest copy$default(PerformanceChartRequest performanceChartRequest, String str, String str2, String str3, String str4, boolean z, List list, Boolean bool, boolean z2, DisplayCurrency displayCurrency, int i, Object obj) {
            if ((i & 1) != 0) {
                str = performanceChartRequest.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = performanceChartRequest.chartType;
            }
            if ((i & 4) != 0) {
                str3 = performanceChartRequest.chartStyle;
            }
            if ((i & 8) != 0) {
                str4 = performanceChartRequest.displaySpan;
            }
            if ((i & 16) != 0) {
                z = performanceChartRequest.isForWidget;
            }
            if ((i & 32) != 0) {
                list = performanceChartRequest.benchmarkIds;
            }
            if ((i & 64) != 0) {
                bool = performanceChartRequest.includeAllHours;
            }
            if ((i & 128) != 0) {
                z2 = performanceChartRequest.isPrivacyEnabled;
            }
            if ((i & 256) != 0) {
                displayCurrency = performanceChartRequest.displayCurrency;
            }
            boolean z3 = z2;
            DisplayCurrency displayCurrency2 = displayCurrency;
            List list2 = list;
            Boolean bool2 = bool;
            boolean z4 = z;
            String str5 = str3;
            return performanceChartRequest.copy(str, str2, str5, str4, z4, list2, bool2, z3, displayCurrency2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChartType() {
            return this.chartType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChartStyle() {
            return this.chartStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplaySpan() {
            return this.displaySpan;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsForWidget() {
            return this.isForWidget;
        }

        public final List<String> component6() {
            return this.benchmarkIds;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getIncludeAllHours() {
            return this.includeAllHours;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsPrivacyEnabled() {
            return this.isPrivacyEnabled;
        }

        /* renamed from: component9, reason: from getter */
        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final PerformanceChartRequest copy(String accountNumber, String chartType, String chartStyle, String displaySpan, boolean isForWidget, List<String> benchmarkIds, Boolean includeAllHours, boolean isPrivacyEnabled, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            return new PerformanceChartRequest(accountNumber, chartType, chartStyle, displaySpan, isForWidget, benchmarkIds, includeAllHours, isPrivacyEnabled, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PerformanceChartRequest)) {
                return false;
            }
            PerformanceChartRequest performanceChartRequest = (PerformanceChartRequest) other;
            return Intrinsics.areEqual(this.accountNumber, performanceChartRequest.accountNumber) && Intrinsics.areEqual(this.chartType, performanceChartRequest.chartType) && Intrinsics.areEqual(this.chartStyle, performanceChartRequest.chartStyle) && Intrinsics.areEqual(this.displaySpan, performanceChartRequest.displaySpan) && this.isForWidget == performanceChartRequest.isForWidget && Intrinsics.areEqual(this.benchmarkIds, performanceChartRequest.benchmarkIds) && Intrinsics.areEqual(this.includeAllHours, performanceChartRequest.includeAllHours) && this.isPrivacyEnabled == performanceChartRequest.isPrivacyEnabled && this.displayCurrency == performanceChartRequest.displayCurrency;
        }

        public int hashCode() {
            int iHashCode = ((this.accountNumber.hashCode() * 31) + this.chartType.hashCode()) * 31;
            String str = this.chartStyle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.displaySpan;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isForWidget)) * 31;
            List<String> list = this.benchmarkIds;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.includeAllHours;
            int iHashCode5 = (((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isPrivacyEnabled)) * 31;
            DisplayCurrency displayCurrency = this.displayCurrency;
            return iHashCode5 + (displayCurrency != null ? displayCurrency.hashCode() : 0);
        }

        public String toString() {
            return "PerformanceChartRequest(accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ", chartStyle=" + this.chartStyle + ", displaySpan=" + this.displaySpan + ", isForWidget=" + this.isForWidget + ", benchmarkIds=" + this.benchmarkIds + ", includeAllHours=" + this.includeAllHours + ", isPrivacyEnabled=" + this.isPrivacyEnabled + ", displayCurrency=" + this.displayCurrency + ")";
        }

        public PerformanceChartRequest(String accountNumber, String chartType, String str, String str2, boolean z, List<String> list, Boolean bool, boolean z2, DisplayCurrency displayCurrency) {
            String string2;
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            this.accountNumber = accountNumber;
            this.chartType = chartType;
            this.chartStyle = str;
            this.displaySpan = str2;
            this.isForWidget = z;
            this.benchmarkIds = list;
            this.includeAllHours = bool;
            this.isPrivacyEnabled = z2;
            this.displayCurrency = displayCurrency;
            String str3 = AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT;
            this.displaySpanOrDefault = str2 == null ? AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT : str2;
            this.chartStyleOrDefault = str == null ? AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT : str;
            if (bool != null && (string2 = bool.toString()) != null) {
                str3 = string2;
            }
            this.includeAllHoursOrDefault = str3;
        }

        public /* synthetic */ PerformanceChartRequest(String str, String str2, String str3, String str4, boolean z, List list, Boolean bool, boolean z2, DisplayCurrency displayCurrency, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : displayCurrency);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getChartType() {
            return this.chartType;
        }

        public final String getChartStyle() {
            return this.chartStyle;
        }

        public final String getDisplaySpan() {
            return this.displaySpan;
        }

        public final boolean isForWidget() {
            return this.isForWidget;
        }

        public final List<String> getBenchmarkIds() {
            return this.benchmarkIds;
        }

        public final Boolean getIncludeAllHours() {
            return this.includeAllHours;
        }

        public final boolean isPrivacyEnabled() {
            return this.isPrivacyEnabled;
        }

        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        /* renamed from: getDisplaySpanOrDefault$lib_store_portfolio_externalDebug, reason: from getter */
        public final String getDisplaySpanOrDefault() {
            return this.displaySpanOrDefault;
        }

        /* renamed from: getChartStyleOrDefault$lib_store_portfolio_externalDebug, reason: from getter */
        public final String getChartStyleOrDefault() {
            return this.chartStyleOrDefault;
        }

        /* renamed from: getIncludeAllHoursOrDefault$lib_store_portfolio_externalDebug, reason: from getter */
        public final String getIncludeAllHoursOrDefault() {
            return this.includeAllHoursOrDefault;
        }
    }
}
