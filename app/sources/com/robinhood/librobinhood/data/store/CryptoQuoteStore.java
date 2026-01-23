package com.robinhood.librobinhood.data.store;

import android.content.Context;
import android.os.PowerManager;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.models.api.ApiCryptoQuote;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.dao.CryptoQuoteDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.PowerManagers;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: CryptoQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u00017B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00170\u00170\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010'\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00140&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R/\u0010)\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00198\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R5\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00198\u0006¢\u0006\u0012\n\u0004\b\u001d\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010,R&\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R#\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u00198\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u00198\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,¨\u00068"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "Lcom/robinhood/store/Store;", "Landroid/content/Context;", "context", "Landroid/os/PowerManager;", "powerManager", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/api/retrofit/Brokeback;", "brokeback", "Lcom/robinhood/models/dao/CryptoQuoteDao;", "dao", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "<init>", "(Landroid/content/Context;Landroid/os/PowerManager;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/models/dao/CryptoQuoteDao;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore$CryptoQuoteArgs;", "args", "Lkotlinx/coroutines/flow/Flow;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoQuote;", "handlePoller", "(Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore$CryptoQuoteArgs;)Lkotlinx/coroutines/flow/Flow;", "j$/time/Duration", "interval", "Lcom/robinhood/android/moria/db/Query;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "pollCryptoQuotes", "(Lj$/time/Duration;)Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/api/retrofit/Brokeback;", "Lcom/robinhood/models/dao/CryptoQuoteDao;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Lkotlinx/coroutines/flow/SharedFlow;", "kotlin.jvm.PlatformType", "pollIntervalFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/api/PaginatedEndpoint;", "fetchQuotes", "Lcom/robinhood/api/PaginatedEndpoint;", "streamCryptoQuotes", "Lcom/robinhood/android/moria/db/Query;", "getStreamCryptoQuotes", "()Lcom/robinhood/android/moria/db/Query;", "getPollCryptoQuotes", "getPollCryptoQuotes$annotations", "()V", "Lcom/robinhood/android/moria/network/Endpoint;", "fetchQuote", "Lcom/robinhood/android/moria/network/Endpoint;", "streamCryptoQuote", "getStreamCryptoQuote", "pollCryptoQuote", "getPollCryptoQuote", "CryptoQuoteArgs", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoQuoteStore extends Store {
    private final Brokeback brokeback;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoQuoteDao dao;
    private final Endpoint<CryptoQuoteArgs, Response<ApiCryptoQuote>> fetchQuote;
    private final PaginatedEndpoint<List<UUID>, ApiCryptoQuote> fetchQuotes;
    private final Query<CryptoQuoteArgs, CryptoQuote> pollCryptoQuote;
    private final Query<List<UUID>, List<CryptoQuote>> pollCryptoQuotes;
    private final SharedFlow<Duration> pollIntervalFlow;
    private final Query<CryptoQuoteArgs, CryptoQuote> streamCryptoQuote;
    private final Query<List<UUID>, List<CryptoQuote>> streamCryptoQuotes;

    /* compiled from: CryptoQuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuoteTouchPoint.values().length];
            try {
                iArr[QuoteTouchPoint.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuoteTouchPoint.TRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getPollCryptoQuotes$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoQuoteStore(Context context, PowerManager powerManager, StoreBundle storeBundle, Brokeback brokeback, CryptoQuoteDao dao, CryptoExperimentsStore cryptoExperimentsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        this.brokeback = brokeback;
        this.dao = dao;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        ObservableSource map = PowerManagers.powerSaveModeChanges(powerManager, context).map(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoQuoteStore$pollIntervalFlow$1
            @Override // io.reactivex.functions.Function
            public final Duration apply(Boolean isInPowerSaveMode) {
                Intrinsics.checkNotNullParameter(isInPowerSaveMode, "isInPowerSaveMode");
                return isInPowerSaveMode.booleanValue() ? CryptoQuote.INSTANCE.getNormalStaleTimeout() : Duration.ofSeconds(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.pollIntervalFlow = FlowKt.shareIn(Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null), getStoreScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
        PaginatedEndpoint<List<UUID>, ApiCryptoQuote> paginatedEndpointCreate$default = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new CryptoQuoteStore$fetchQuotes$1(this, null), getLogoutKillswitch(), new CryptoQuoteStore$fetchQuotes$2(dao), storeBundle.getClock(), null, 16, null);
        this.fetchQuotes = paginatedEndpointCreate$default;
        Query.Companion companion = Query.INSTANCE;
        this.streamCryptoQuotes = Store.create$default(this, companion, "streamCryptoQuotes", CollectionsKt.listOf(new RefreshEach(new CryptoQuoteStore$streamCryptoQuotes$1(paginatedEndpointCreate$default))), new CryptoQuoteStore$streamCryptoQuotes$2(dao), false, 8, null);
        this.pollCryptoQuotes = Store.create$default(this, companion, "pollCryptoQuotes", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoQuoteStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteStore.pollCryptoQuotes$lambda$1(this.f$0, (List) obj);
            }
        })), new C337492(dao), false, 8, null);
        Endpoint<CryptoQuoteArgs, Response<ApiCryptoQuote>> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoQuoteStore$fetchQuote$1(this, null), getLogoutKillswitch(), new CryptoQuoteStore$fetchQuote$2(this, null), storeBundle.getClock(), null, 16, null);
        this.fetchQuote = endpointCreate$default;
        this.streamCryptoQuote = Store.create$default(this, companion, "streamCryptoQuote", CollectionsKt.listOf(new RefreshEach(new CryptoQuoteStore$streamCryptoQuote$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoQuoteStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteStore.streamCryptoQuote$lambda$3(this.f$0, (CryptoQuoteStore.CryptoQuoteArgs) obj);
            }
        }, false, 8, null);
        this.pollCryptoQuote = Store.create$default(this, companion, "pollCryptoQuote", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoQuoteStore$pollCryptoQuote$1(this))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoQuoteStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteStore.pollCryptoQuote$lambda$5(this.f$0, (CryptoQuoteStore.CryptoQuoteArgs) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object fetchQuotes$insert(CryptoQuoteDao cryptoQuoteDao, Iterable iterable, Continuation continuation) {
        cryptoQuoteDao.insert((Iterable<ApiCryptoQuote>) iterable);
        return Unit.INSTANCE;
    }

    public final Query<List<UUID>, List<CryptoQuote>> getStreamCryptoQuotes() {
        return this.streamCryptoQuotes;
    }

    public final Query<List<UUID>, List<CryptoQuote>> getPollCryptoQuotes() {
        return this.pollCryptoQuotes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollCryptoQuotes$lambda$1(CryptoQuoteStore cryptoQuoteStore, List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        if (ids.isEmpty()) {
            return FlowKt.emptyFlow();
        }
        return FlowKt.transformLatest(cryptoQuoteStore.pollIntervalFlow, new C33748x1e25dbbb(null, cryptoQuoteStore, ids));
    }

    /* compiled from: CryptoQuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoQuoteStore$pollCryptoQuotes$2 */
    /* synthetic */ class C337492 extends FunctionReferenceImpl implements Function1<List<? extends UUID>, Flow<? extends List<? extends CryptoQuote>>> {
        C337492(Object obj) {
            super(1, obj, CryptoQuoteDao.class, "getQuotesForIds", "getQuotesForIds(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Flow<? extends List<? extends CryptoQuote>> invoke(List<? extends UUID> list) {
            return invoke2((List<UUID>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Flow<List<CryptoQuote>> invoke2(List<UUID> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CryptoQuoteDao) this.receiver).getQuotesForIds(p0);
        }
    }

    public final Query<List<UUID>, List<CryptoQuote>> pollCryptoQuotes(final Duration interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        return Store.create$default(this, Query.INSTANCE, "pollCryptoQuotesWithInterval", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoQuoteStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteStore.pollCryptoQuotes$lambda$2(this.f$0, interval, (List) obj);
            }
        })), new C337504(this.dao), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollCryptoQuotes$lambda$2(CryptoQuoteStore cryptoQuoteStore, Duration duration, List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        if (!ids.isEmpty()) {
            return cryptoQuoteStore.fetchQuotes.pollAllPages(ids, duration);
        }
        return FlowKt.emptyFlow();
    }

    /* compiled from: CryptoQuoteStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoQuoteStore$pollCryptoQuotes$4 */
    /* synthetic */ class C337504 extends FunctionReferenceImpl implements Function1<List<? extends UUID>, Flow<? extends List<? extends CryptoQuote>>> {
        C337504(Object obj) {
            super(1, obj, CryptoQuoteDao.class, "getQuotesForIds", "getQuotesForIds(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Flow<? extends List<? extends CryptoQuote>> invoke(List<? extends UUID> list) {
            return invoke2((List<UUID>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Flow<List<CryptoQuote>> invoke2(List<UUID> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CryptoQuoteDao) this.receiver).getQuotesForIds(p0);
        }
    }

    public final Query<CryptoQuoteArgs, CryptoQuote> getStreamCryptoQuote() {
        return this.streamCryptoQuote;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoQuote$lambda$3(CryptoQuoteStore cryptoQuoteStore, CryptoQuoteArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return cryptoQuoteStore.dao.getQuoteForIdAndRoutingGroup(args.getCurrencyPairId(), args.getRoutingGroup());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Response<ApiCryptoQuote>> handlePoller(CryptoQuoteArgs args) {
        int i = WhenMappings.$EnumSwitchMapping$0[args.getQuoteTouchPoint().ordinal()];
        if (i == 1) {
            return Endpoint8.backendPoll$default(this.fetchQuote, args, null, null, 6, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoTradeQuotePollingIntervalExperiment(), new CryptoQuoteStore$handlePoller$$inlined$flatMapLatest$1(null, this, args));
    }

    public final Query<CryptoQuoteArgs, CryptoQuote> getPollCryptoQuote() {
        return this.pollCryptoQuote;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollCryptoQuote$lambda$5(CryptoQuoteStore cryptoQuoteStore, CryptoQuoteArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return cryptoQuoteStore.dao.getQuoteForIdAndRoutingGroup(args.getCurrencyPairId(), args.getRoutingGroup());
    }

    /* compiled from: CryptoQuoteStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore$CryptoQuoteArgs;", "", "currencyPairId", "Ljava/util/UUID;", "routingGroup", "Lcom/robinhood/models/api/fee/MonetizationModel;", "quoteTouchPoint", "Lcom/robinhood/librobinhood/data/store/QuoteTouchPoint;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/fee/MonetizationModel;Lcom/robinhood/librobinhood/data/store/QuoteTouchPoint;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getRoutingGroup", "()Lcom/robinhood/models/api/fee/MonetizationModel;", "getQuoteTouchPoint", "()Lcom/robinhood/librobinhood/data/store/QuoteTouchPoint;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoQuoteArgs {
        private final UUID currencyPairId;
        private final QuoteTouchPoint quoteTouchPoint;
        private final MonetizationModel routingGroup;

        public static /* synthetic */ CryptoQuoteArgs copy$default(CryptoQuoteArgs cryptoQuoteArgs, UUID uuid, MonetizationModel monetizationModel, QuoteTouchPoint quoteTouchPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = cryptoQuoteArgs.currencyPairId;
            }
            if ((i & 2) != 0) {
                monetizationModel = cryptoQuoteArgs.routingGroup;
            }
            if ((i & 4) != 0) {
                quoteTouchPoint = cryptoQuoteArgs.quoteTouchPoint;
            }
            return cryptoQuoteArgs.copy(uuid, monetizationModel, quoteTouchPoint);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final MonetizationModel getRoutingGroup() {
            return this.routingGroup;
        }

        /* renamed from: component3, reason: from getter */
        public final QuoteTouchPoint getQuoteTouchPoint() {
            return this.quoteTouchPoint;
        }

        public final CryptoQuoteArgs copy(UUID currencyPairId, MonetizationModel routingGroup, QuoteTouchPoint quoteTouchPoint) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(routingGroup, "routingGroup");
            Intrinsics.checkNotNullParameter(quoteTouchPoint, "quoteTouchPoint");
            return new CryptoQuoteArgs(currencyPairId, routingGroup, quoteTouchPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoQuoteArgs)) {
                return false;
            }
            CryptoQuoteArgs cryptoQuoteArgs = (CryptoQuoteArgs) other;
            return Intrinsics.areEqual(this.currencyPairId, cryptoQuoteArgs.currencyPairId) && this.routingGroup == cryptoQuoteArgs.routingGroup && this.quoteTouchPoint == cryptoQuoteArgs.quoteTouchPoint;
        }

        public int hashCode() {
            return (((this.currencyPairId.hashCode() * 31) + this.routingGroup.hashCode()) * 31) + this.quoteTouchPoint.hashCode();
        }

        public String toString() {
            return "CryptoQuoteArgs(currencyPairId=" + this.currencyPairId + ", routingGroup=" + this.routingGroup + ", quoteTouchPoint=" + this.quoteTouchPoint + ")";
        }

        public CryptoQuoteArgs(UUID currencyPairId, MonetizationModel routingGroup, QuoteTouchPoint quoteTouchPoint) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(routingGroup, "routingGroup");
            Intrinsics.checkNotNullParameter(quoteTouchPoint, "quoteTouchPoint");
            this.currencyPairId = currencyPairId;
            this.routingGroup = routingGroup;
            this.quoteTouchPoint = quoteTouchPoint;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public /* synthetic */ CryptoQuoteArgs(UUID uuid, MonetizationModel monetizationModel, QuoteTouchPoint quoteTouchPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? MonetizationModel.REBATE : monetizationModel, (i & 4) != 0 ? QuoteTouchPoint.OTHER : quoteTouchPoint);
        }

        public final MonetizationModel getRoutingGroup() {
            return this.routingGroup;
        }

        public final QuoteTouchPoint getQuoteTouchPoint() {
            return this.quoteTouchPoint;
        }
    }
}
