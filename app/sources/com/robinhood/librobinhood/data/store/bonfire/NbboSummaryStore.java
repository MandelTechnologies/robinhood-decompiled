package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.dao.NbboSummaryDao;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: NbboSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001b2\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/NbboSummaryDao;", "<init>", "(Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/NbboSummaryDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lretrofit2/Response;", "Lcom/robinhood/nbbo/models/api/ApiNbboSummary;", "stream", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "getStream", "()Lcom/robinhood/android/moria/db/Query;", "streamNbboSummaryQuery", "streamNbboSummary", "Lio/reactivex/Observable;", "instrumentId", "streamCache", "getStreamCache", "refresh", "Lio/reactivex/Single;", "Companion", "lib-store-nbbo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class NbboSummaryStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long NBBO_DEFAULT_POLL_DURATION = TimeUnit.SECONDS.toMillis(5);
    public static final long NBBO_POLLING_INTERVAL_MILLIS = 5000;
    private final NbboSummaryDao dao;
    private final Endpoint<UUID, Response<ApiNbboSummary>> endpoint;
    private final Query<UUID, NbboSummary> stream;
    private final Query<UUID, NbboSummary> streamCache;
    private final Query<UUID, NbboSummary> streamNbboSummaryQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NbboSummaryStore(TradeEquityBonfireApi bonfireApi, StoreBundle storeBundle, NbboSummaryDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.endpoint = Endpoint.INSTANCE.create(new NbboSummaryStore2(bonfireApi), getLogoutKillswitch(), new NbboSummaryStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(NbboSummary.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion = Query.INSTANCE;
        this.stream = Store.create$default(this, companion, "queryNbboSummary", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NbboSummaryStore.stream$lambda$0(this.f$0, (UUID) obj);
            }
        })), new NbboSummaryStore4(dao), false, 8, null);
        this.streamNbboSummaryQuery = Store.create$default(this, companion, CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NbboSummaryStore.streamNbboSummaryQuery$lambda$1(this.f$0, (UUID) obj);
            }
        })), new NbboSummaryStore7(dao), false, 4, null);
        this.streamCache = Store.create$default(this, companion, "queryNbboSummaryCache", CollectionsKt.emptyList(), new NbboSummaryStore5(dao), false, 8, null);
    }

    public final Query<UUID, NbboSummary> getStream() {
        return this.stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow stream$lambda$0(NbboSummaryStore nbboSummaryStore, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Endpoint<UUID, Response<ApiNbboSummary>> endpoint = nbboSummaryStore.endpoint;
        Duration durationOfSeconds = Duration.ofSeconds(NBBO_DEFAULT_POLL_DURATION);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint8.backendPoll$default(endpoint, orderId, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamNbboSummaryQuery$lambda$1(NbboSummaryStore nbboSummaryStore, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return FlowKt.flow(new NbboSummaryStore6(nbboSummaryStore, instrumentId, null));
    }

    public final Observable<NbboSummary> streamNbboSummary(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.streamNbboSummaryQuery.asObservable(instrumentId);
    }

    public final Query<UUID, NbboSummary> getStreamCache() {
        return this.streamCache;
    }

    /* compiled from: NbboSummaryStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/nbbo/models/api/ApiNbboSummary;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$refresh$1", m3645f = "NbboSummaryStore.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$refresh$1 */
    static final class C345131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiNbboSummary>>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345131(UUID uuid, Continuation<? super C345131> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NbboSummaryStore.this.new C345131(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiNbboSummary>> continuation) {
            return ((C345131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = NbboSummaryStore.this.endpoint;
            UUID uuid = this.$instrumentId;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<Response<ApiNbboSummary>> refresh(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C345131(instrumentId, null), 1, null);
    }

    /* compiled from: NbboSummaryStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore$Companion;", "", "<init>", "()V", "NBBO_DEFAULT_POLL_DURATION", "", "getNBBO_DEFAULT_POLL_DURATION", "()J", "NBBO_POLLING_INTERVAL_MILLIS", "lib-store-nbbo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long getNBBO_DEFAULT_POLL_DURATION() {
            return NbboSummaryStore.NBBO_DEFAULT_POLL_DURATION;
        }
    }
}
