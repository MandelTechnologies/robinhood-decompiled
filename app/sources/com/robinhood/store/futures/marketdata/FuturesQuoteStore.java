package com.robinhood.store.futures.marketdata;

import android.app.Application;
import android.os.PowerManager;
import com.robinhood.android.lib.api.futures.FuturesMarketdataApi;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesQuote;
import com.robinhood.android.models.futures.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.models.futures.marketdata.dao.FuturesQuoteDao;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote2;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.PowerManagers;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: FuturesQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00020\u0001:\u000221B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u001a0\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fRL\u0010\u001b\u001a:\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00120!\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0#0$0#0\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R@\u00100\u001a.\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00120!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/¨\u00063"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "marketdataApi", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesQuoteDao;", "quoteDao", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/os/PowerManager;", "powerManager", "Landroid/app/Application;", "application", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;Lcom/robinhood/android/models/futures/marketdata/dao/FuturesQuoteDao;Lj$/time/Clock;Landroid/os/PowerManager;Landroid/app/Application;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "contractId", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "location", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "getQuote", "(Ljava/util/UUID;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;)Lkotlinx/coroutines/flow/Flow;", "", "contractIds", "", "getQuotes", "(Ljava/util/Collection;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesQuoteDao;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lretrofit2/Response;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesQuote;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lio/reactivex/Observable;", "j$/time/Duration", "kotlin.jvm.PlatformType", "pollIntervalObs", "Lio/reactivex/Observable;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore$QuoteArg;", "queryQuote", "Lcom/robinhood/android/moria/db/Query;", "queryQuotes", "Companion", "QuoteArg", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesQuoteStore extends Store {
    public static final int MAX_BATCH_SIZE_BY_UUID = 125;
    private final Clock clock;
    private final Endpoint<Tuples2<Collection<UUID>, MarketdataPollLocation>, Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesQuote>>>>> getQuotes;
    private final FuturesMarketdataApi marketdataApi;
    private final Observable<Duration> pollIntervalObs;
    private final Query<QuoteArg, FuturesQuote> queryQuote;
    private final Query<Tuples2<? extends Collection<UUID>, ? extends MarketdataPollLocation>, Map<UUID, FuturesQuote>> queryQuotes;
    private final FuturesQuoteDao quoteDao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesQuoteStore(FuturesMarketdataApi marketdataApi, FuturesQuoteDao quoteDao, Clock clock, PowerManager powerManager, Application application, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(marketdataApi, "marketdataApi");
        Intrinsics.checkNotNullParameter(quoteDao, "quoteDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marketdataApi = marketdataApi;
        this.quoteDao = quoteDao;
        this.clock = clock;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        C415181 c415181 = new C415181(null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        C415192 c415192 = new C415192(null);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.getQuotes = companion.create(c415181, logoutKillswitch, c415192, clock2, new DefaultStaleDecider(durationOfSeconds, storeBundle.getClock()));
        Observable<Duration> observableRefCount = PowerManagers.powerSaveModeChanges(powerManager, application).map(new Function() { // from class: com.robinhood.store.futures.marketdata.FuturesQuoteStore$pollIntervalObs$1
            @Override // io.reactivex.functions.Function
            public final Duration apply(Boolean isInPowerSaveMode) {
                Intrinsics.checkNotNullParameter(isInPowerSaveMode, "isInPowerSaveMode");
                return Duration.ofSeconds(isInPowerSaveMode.booleanValue() ? 5L : 1L);
            }
        }).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.pollIntervalObs = observableRefCount;
        Query.Companion companion2 = Query.INSTANCE;
        this.queryQuote = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryFuturesQuote", CollectionsKt.listOf(new Batch(getStoreScope(), 125, false, 0L, new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesQuoteStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesQuoteStore.queryQuote$lambda$3(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesQuoteStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesQuoteStore.queryQuote$lambda$4(this.f$0, (FuturesQuoteStore.QuoteArg) obj);
            }
        }, false, 16, null);
        this.queryQuotes = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryFuturesQuotes", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesQuoteStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesQuoteStore.queryQuotes$lambda$6(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesQuoteStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesQuoteStore.queryQuotes$lambda$7(this.f$0, (Tuples2) obj);
            }
        }, false, 16, null);
    }

    /* compiled from: FuturesQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00030\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesQuote;", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesQuoteStore$getQuotes$1", m3645f = "FuturesQuoteStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesQuoteStore$getQuotes$1 */
    static final class C415181 extends ContinuationImpl7 implements Function2<Tuples2<? extends Collection<? extends UUID>, ? extends MarketdataPollLocation>, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiFuturesQuote>>>>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C415181(Continuation<? super C415181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415181 c415181 = FuturesQuoteStore.this.new C415181(continuation);
            c415181.L$0 = obj;
            return c415181;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Collection<? extends UUID>, ? extends MarketdataPollLocation> tuples2, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiFuturesQuote>>>>> continuation) {
            return invoke2((Tuples2<? extends Collection<UUID>, ? extends MarketdataPollLocation>) tuples2, (Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesQuote>>>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<? extends Collection<UUID>, ? extends MarketdataPollLocation> tuples2, Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesQuote>>>>> continuation) {
            return ((C415181) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Tuples2 tuples2 = (Tuples2) this.L$0;
            Collection collection = (Collection) tuples2.component1();
            MarketdataPollLocation marketdataPollLocation = (MarketdataPollLocation) tuples2.component2();
            FuturesMarketdataApi futuresMarketdataApi = FuturesQuoteStore.this.marketdataApi;
            String strJoinToString$default = CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, null, 62, null);
            String serverValue = marketdataPollLocation != null ? marketdataPollLocation.getServerValue() : null;
            this.label = 1;
            Object quotes = futuresMarketdataApi.getQuotes(strJoinToString$default, serverValue, this);
            return quotes == coroutine_suspended ? coroutine_suspended : quotes;
        }
    }

    /* compiled from: FuturesQuoteStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u00050\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesQuoteStore$getQuotes$2", m3645f = "FuturesQuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesQuoteStore$getQuotes$2 */
    static final class C415192 extends ContinuationImpl7 implements Function2<Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiFuturesQuote>>>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C415192(Continuation<? super C415192> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415192 c415192 = FuturesQuoteStore.this.new C415192(continuation);
            c415192.L$0 = obj;
            return c415192;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiFuturesQuote>>>> response, Continuation<? super Unit> continuation) {
            return invoke2((Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesQuote>>>>) response, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesQuote>>>> response, Continuation<? super Unit> continuation) {
            return ((C415192) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Collection collectionEmptyList;
            List list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ApiMarketdataResponse apiMarketdataResponse = (ApiMarketdataResponse) ((Response) this.L$0).body();
            if (apiMarketdataResponse == null || (list = (List) apiMarketdataResponse.getData()) == null) {
                collectionEmptyList = CollectionsKt.emptyList();
            } else {
                collectionEmptyList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ApiFuturesQuote apiFuturesQuote = (ApiFuturesQuote) ((ApiMarketdataResponse) it.next()).getData();
                    if (apiFuturesQuote != null) {
                        collectionEmptyList.add(apiFuturesQuote);
                    }
                }
            }
            if (!collectionEmptyList.isEmpty()) {
                FuturesQuoteDao futuresQuoteDao = FuturesQuoteStore.this.quoteDao;
                Collection<ApiFuturesQuote> collection = collectionEmptyList;
                FuturesQuoteStore futuresQuoteStore = FuturesQuoteStore.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
                for (ApiFuturesQuote apiFuturesQuote2 : collection) {
                    Instant instant = futuresQuoteStore.clock.instant();
                    Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                    arrayList.add(FuturesQuote2.toDbModel(apiFuturesQuote2, instant));
                }
                futuresQuoteDao.insert(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryQuote$lambda$3(FuturesQuoteStore futuresQuoteStore, Collection args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(futuresQuoteStore.pollIntervalObs), Integer.MAX_VALUE, null, 2, null), new FuturesQuoteStore$queryQuote$lambda$3$$inlined$flatMapLatest$1(null, args, futuresQuoteStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryQuote$lambda$4(FuturesQuoteStore futuresQuoteStore, QuoteArg quoteArg) {
        Intrinsics.checkNotNullParameter(quoteArg, "<destruct>");
        return futuresQuoteStore.quoteDao.getFuturesQuote(quoteArg.getContractId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryQuotes$lambda$6(FuturesQuoteStore futuresQuoteStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(futuresQuoteStore.pollIntervalObs), Integer.MAX_VALUE, null, 2, null), new FuturesQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1(null, futuresQuoteStore, (Collection) tuples2.component1(), (MarketdataPollLocation) tuples2.component2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryQuotes$lambda$7(FuturesQuoteStore futuresQuoteStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return FlowKt.filterNotNull(futuresQuoteStore.quoteDao.getFuturesQuotes((Collection) tuples2.component1()));
    }

    public static /* synthetic */ Flow getQuote$default(FuturesQuoteStore futuresQuoteStore, UUID uuid, MarketdataPollLocation marketdataPollLocation, int i, Object obj) {
        if ((i & 2) != 0) {
            marketdataPollLocation = null;
        }
        return futuresQuoteStore.getQuote(uuid, marketdataPollLocation);
    }

    public final Flow<FuturesQuote> getQuote(UUID contractId, MarketdataPollLocation location) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return this.queryQuote.asFlow(new QuoteArg(contractId, location));
    }

    public static /* synthetic */ Flow getQuotes$default(FuturesQuoteStore futuresQuoteStore, Collection collection, MarketdataPollLocation marketdataPollLocation, int i, Object obj) {
        if ((i & 2) != 0) {
            marketdataPollLocation = null;
        }
        return futuresQuoteStore.getQuotes(collection, marketdataPollLocation);
    }

    public final Flow<Map<UUID, FuturesQuote>> getQuotes(Collection<UUID> contractIds, MarketdataPollLocation location) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        return this.queryQuotes.asFlow(Tuples4.m3642to(contractIds, location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesQuoteStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\rHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore$QuoteArg;", "", "contractId", "Ljava/util/UUID;", "location", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;)V", "getContractId", "()Ljava/util/UUID;", "getLocation", "()Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "compareTo", "", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "toString", "", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    static final /* data */ class QuoteArg implements Comparable<QuoteArg> {
        private final UUID contractId;
        private final MarketdataPollLocation location;

        public static /* synthetic */ QuoteArg copy$default(QuoteArg quoteArg, UUID uuid, MarketdataPollLocation marketdataPollLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = quoteArg.contractId;
            }
            if ((i & 2) != 0) {
                marketdataPollLocation = quoteArg.location;
            }
            return quoteArg.copy(uuid, marketdataPollLocation);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final MarketdataPollLocation getLocation() {
            return this.location;
        }

        public final QuoteArg copy(UUID contractId, MarketdataPollLocation location) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return new QuoteArg(contractId, location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuoteArg)) {
                return false;
            }
            QuoteArg quoteArg = (QuoteArg) other;
            return Intrinsics.areEqual(this.contractId, quoteArg.contractId) && this.location == quoteArg.location;
        }

        public int hashCode() {
            int iHashCode = this.contractId.hashCode() * 31;
            MarketdataPollLocation marketdataPollLocation = this.location;
            return iHashCode + (marketdataPollLocation == null ? 0 : marketdataPollLocation.hashCode());
        }

        public String toString() {
            return "QuoteArg(contractId=" + this.contractId + ", location=" + this.location + ")";
        }

        public QuoteArg(UUID contractId, MarketdataPollLocation marketdataPollLocation) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            this.contractId = contractId;
            this.location = marketdataPollLocation;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final MarketdataPollLocation getLocation() {
            return this.location;
        }

        @Override // java.lang.Comparable
        public int compareTo(QuoteArg other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return ComparisonsKt.compareValues(this.contractId, other.contractId);
        }
    }
}
