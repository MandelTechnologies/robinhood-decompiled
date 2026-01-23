package com.robinhood.librobinhood.data.store;

import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationQuote2;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.OneDayChartStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.onedaycharts.api.ApiInstrumentOneDayChart;
import com.robinhood.models.onedaycharts.api.InstrumentApi;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import com.robinhood.models.onedaycharts.dao.InstrumentOneDayChartDao;
import com.robinhood.models.onedaycharts.p336db.InstrumentOneDayChart;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import md_server_proxy.service.p483v1.CurrencyCodeDto;
import md_server_proxy.service.p483v1.PerpetualQuoteDto;
import md_server_proxy.service.p483v1.QuoteDetailDataDto;
import md_server_proxy.service.p483v1.TokenizedStockQuoteDto;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: OneDayChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002BABQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001dJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001dJ%\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001a2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010\u001dJ#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b%\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R&\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0012\u0004\u0012\u0002010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00104\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0012\u0004\u0012\u0002010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0012\u0004\u0012\u0002010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R&\u00109\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0012\u0004\u0012\u0002010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R \u0010;\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R \u0010>\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R \u0010@\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<¨\u0006C"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/models/onedaycharts/api/InstrumentApi;", "instrumentApi", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/onedaycharts/dao/InstrumentOneDayChartDao;", "instrumentOneDayChartDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/models/onedaycharts/api/InstrumentApi;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/models/onedaycharts/dao/InstrumentOneDayChartDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "metadataId", "Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "instrumentType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "streamEquityMiniChart", "(Ljava/util/UUID;Lcom/robinhood/models/onedaycharts/api/InstrumentType;)Lkotlinx/coroutines/flow/Flow;", "streamCryptoMiniChart", "streamTokenizedStockMiniChart", "streamPerpetualsStockMiniChart", "streamIndexMiniChart", "instrumentId", "Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;", "streamInstrumentOneDayChart", "streamOneDayMiniChart", "Lcom/robinhood/android/indexes/store/IndexStore;", "Lcom/robinhood/models/onedaycharts/api/InstrumentApi;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/models/onedaycharts/dao/InstrumentOneDayChartDao;", "Lj$/time/Clock;", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore$InstrumentOneDayChartRequest;", "Lcom/robinhood/models/onedaycharts/api/ApiInstrumentOneDayChart;", "equityOneDayChartBatchedEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "cryptoOneDayChartBatchedEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "perpetualsOneDayChartEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "tokenizedStockOneDayChartBatchedEndpoint", "indexOneDayChartBatchedEndpoint", "Lcom/robinhood/android/moria/db/Query;", "equityOneDayChartBatchedQuery", "Lcom/robinhood/android/moria/db/Query;", "cryptoOneDayChartBatchedQuery", "perpetualsOneDayChartBatchedQuery", "tokenizedStockOneDayChartBatchedQuery", "indexOneDayChartBatchedQuery", "Companion", "InstrumentOneDayChartRequest", "lib-store-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OneDayChartStore extends Store {
    private static final int MAX_BATCH_SIZE = 64;
    private final Clock clock;
    private final PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> cryptoOneDayChartBatchedEndpoint;
    private final Query<InstrumentOneDayChartRequest, InstrumentOneDayChart> cryptoOneDayChartBatchedQuery;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> equityOneDayChartBatchedEndpoint;
    private final Query<InstrumentOneDayChartRequest, InstrumentOneDayChart> equityOneDayChartBatchedQuery;
    private final ExperimentsStore experimentsStore;
    private final PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> indexOneDayChartBatchedEndpoint;
    private final Query<InstrumentOneDayChartRequest, InstrumentOneDayChart> indexOneDayChartBatchedQuery;
    private final IndexStore indexStore;
    private final InstrumentApi instrumentApi;
    private final InstrumentOneDayChartDao instrumentOneDayChartDao;
    private final MarketDataProxyStore marketDataProxyStore;
    private final Query<InstrumentOneDayChartRequest, InstrumentOneDayChart> perpetualsOneDayChartBatchedQuery;
    private final Endpoint<InstrumentOneDayChartRequest, ApiInstrumentOneDayChart> perpetualsOneDayChartEndpoint;
    private final QuoteStore quoteStore;
    private final PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> tokenizedStockOneDayChartBatchedEndpoint;
    private final Query<InstrumentOneDayChartRequest, InstrumentOneDayChart> tokenizedStockOneDayChartBatchedQuery;

    /* compiled from: OneDayChartStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            try {
                iArr[InstrumentType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentType.CRYPTO_PERPETUALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstrumentType.INDEX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstrumentType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDayChartStore(IndexStore indexStore, InstrumentApi instrumentApi, QuoteStore quoteStore, CryptoQuoteStore cryptoQuoteStore, MarketDataProxyStore marketDataProxyStore, ExperimentsStore experimentsStore, InstrumentOneDayChartDao instrumentOneDayChartDao, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentApi, "instrumentApi");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentOneDayChartDao, "instrumentOneDayChartDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.indexStore = indexStore;
        this.instrumentApi = instrumentApi;
        this.quoteStore = quoteStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.marketDataProxyStore = marketDataProxyStore;
        this.experimentsStore = experimentsStore;
        this.instrumentOneDayChartDao = instrumentOneDayChartDao;
        this.clock = clock;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.equityOneDayChartBatchedEndpoint = PaginatedEndpoint.Companion.createBatched$default(companion, 64, new OneDayChartStore$equityOneDayChartBatchedEndpoint$1(this, null), getLogoutKillswitch(), new OneDayChartStore$equityOneDayChartBatchedEndpoint$2(this, null), storeBundle.getClock(), null, 32, null);
        this.cryptoOneDayChartBatchedEndpoint = PaginatedEndpoint.Companion.createBatched$default(companion, 64, new OneDayChartStore$cryptoOneDayChartBatchedEndpoint$1(this, null), getLogoutKillswitch(), new OneDayChartStore$cryptoOneDayChartBatchedEndpoint$2(this, null), storeBundle.getClock(), null, 32, null);
        this.perpetualsOneDayChartEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new OneDayChartStore$perpetualsOneDayChartEndpoint$1(this, null), getLogoutKillswitch(), new OneDayChartStore$perpetualsOneDayChartEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.tokenizedStockOneDayChartBatchedEndpoint = PaginatedEndpoint.Companion.createBatched$default(companion, 64, new OneDayChartStore$tokenizedStockOneDayChartBatchedEndpoint$1(this, null), getLogoutKillswitch(), new OneDayChartStore$tokenizedStockOneDayChartBatchedEndpoint$2(this, null), storeBundle.getClock(), null, 32, null);
        this.indexOneDayChartBatchedEndpoint = PaginatedEndpoint.Companion.createBatched$default(companion, 64, new OneDayChartStore$indexOneDayChartBatchedEndpoint$1(this, null), getLogoutKillswitch(), new OneDayChartStore$indexOneDayChartBatchedEndpoint$2(this, null), storeBundle.getClock(), null, 32, null);
        Query.Companion companion2 = Query.INSTANCE;
        CoroutineScope storeScope = getStoreScope();
        boolean z = false;
        long j = 0;
        this.equityOneDayChartBatchedQuery = Store.create$default(this, companion2, "equityOneDayChartBatchedQuery", CollectionsKt.listOf(new Batch(storeScope, 64, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.equityOneDayChartBatchedQuery$lambda$0(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.equityOneDayChartBatchedQuery$lambda$1(this.f$0, (OneDayChartStore.InstrumentOneDayChartRequest) obj);
            }
        }, false, 8, null);
        this.cryptoOneDayChartBatchedQuery = Store.create$default(this, companion2, "cryptoOneDayChartBatchedQuery", CollectionsKt.listOf(new Batch(getStoreScope(), 64, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.cryptoOneDayChartBatchedQuery$lambda$2(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.cryptoOneDayChartBatchedQuery$lambda$3(this.f$0, (OneDayChartStore.InstrumentOneDayChartRequest) obj);
            }
        }, false, 8, null);
        this.perpetualsOneDayChartBatchedQuery = Store.create$default(this, companion2, "perpetualsOneDayChartBatchedQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.perpetualsOneDayChartBatchedQuery$lambda$4(this.f$0, (OneDayChartStore.InstrumentOneDayChartRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.perpetualsOneDayChartBatchedQuery$lambda$5(this.f$0, (OneDayChartStore.InstrumentOneDayChartRequest) obj);
            }
        }, false, 8, null);
        this.tokenizedStockOneDayChartBatchedQuery = Store.create$default(this, companion2, "tokenizedStockOneDayChartBatchedQuery", CollectionsKt.listOf(new Batch(getStoreScope(), 64, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.tokenizedStockOneDayChartBatchedQuery$lambda$6(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.tokenizedStockOneDayChartBatchedQuery$lambda$7(this.f$0, (OneDayChartStore.InstrumentOneDayChartRequest) obj);
            }
        }, false, 8, null);
        this.indexOneDayChartBatchedQuery = Store.create$default(this, companion2, "indexOneDayChartBatchedQuery", CollectionsKt.listOf(new Batch(getStoreScope(), 64, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.indexOneDayChartBatchedQuery$lambda$8(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OneDayChartStore.indexOneDayChartBatchedQuery$lambda$9(this.f$0, (OneDayChartStore.InstrumentOneDayChartRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OneDayChartStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\rHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OneDayChartStore$InstrumentOneDayChartRequest;", "", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/onedaycharts/api/InstrumentType;)V", "getInstrumentId", "()Ljava/util/UUID;", "getInstrumentType", "()Lcom/robinhood/models/onedaycharts/api/InstrumentType;", "compareTo", "", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "toString", "", "lib-store-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class InstrumentOneDayChartRequest implements Comparable<InstrumentOneDayChartRequest> {
        private final UUID instrumentId;
        private final InstrumentType instrumentType;

        public static /* synthetic */ InstrumentOneDayChartRequest copy$default(InstrumentOneDayChartRequest instrumentOneDayChartRequest, UUID uuid, InstrumentType instrumentType, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = instrumentOneDayChartRequest.instrumentId;
            }
            if ((i & 2) != 0) {
                instrumentType = instrumentOneDayChartRequest.instrumentType;
            }
            return instrumentOneDayChartRequest.copy(uuid, instrumentType);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final InstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final InstrumentOneDayChartRequest copy(UUID instrumentId, InstrumentType instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new InstrumentOneDayChartRequest(instrumentId, instrumentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentOneDayChartRequest)) {
                return false;
            }
            InstrumentOneDayChartRequest instrumentOneDayChartRequest = (InstrumentOneDayChartRequest) other;
            return Intrinsics.areEqual(this.instrumentId, instrumentOneDayChartRequest.instrumentId) && this.instrumentType == instrumentOneDayChartRequest.instrumentType;
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "InstrumentOneDayChartRequest(instrumentId=" + this.instrumentId + ", instrumentType=" + this.instrumentType + ")";
        }

        public InstrumentOneDayChartRequest(UUID instrumentId, InstrumentType instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentId = instrumentId;
            this.instrumentType = instrumentType;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final InstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable compareTo$lambda$0(InstrumentOneDayChartRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.instrumentId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable compareTo$lambda$1(InstrumentOneDayChartRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.instrumentType;
        }

        @Override // java.lang.Comparable
        public int compareTo(InstrumentOneDayChartRequest other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return ComparisonsKt.compareValuesBy(this, other, new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$InstrumentOneDayChartRequest$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OneDayChartStore.InstrumentOneDayChartRequest.compareTo$lambda$0((OneDayChartStore.InstrumentOneDayChartRequest) obj);
                }
            }, new Function1() { // from class: com.robinhood.librobinhood.data.store.OneDayChartStore$InstrumentOneDayChartRequest$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OneDayChartStore.InstrumentOneDayChartRequest.compareTo$lambda$1((OneDayChartStore.InstrumentOneDayChartRequest) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow equityOneDayChartBatchedQuery$lambda$0(OneDayChartStore oneDayChartStore, Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> paginatedEndpoint = oneDayChartStore.equityOneDayChartBatchedEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return paginatedEndpoint.pollAllPages(requests, durationOfSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow equityOneDayChartBatchedQuery$lambda$1(OneDayChartStore oneDayChartStore, InstrumentOneDayChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return oneDayChartStore.instrumentOneDayChartDao.streamInstrumentOneDayChart(request.getInstrumentId(), request.getInstrumentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cryptoOneDayChartBatchedQuery$lambda$2(OneDayChartStore oneDayChartStore, Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> paginatedEndpoint = oneDayChartStore.cryptoOneDayChartBatchedEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return paginatedEndpoint.pollAllPages(requests, durationOfSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cryptoOneDayChartBatchedQuery$lambda$3(OneDayChartStore oneDayChartStore, InstrumentOneDayChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return oneDayChartStore.instrumentOneDayChartDao.streamInstrumentOneDayChart(request.getInstrumentId(), request.getInstrumentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow perpetualsOneDayChartBatchedQuery$lambda$4(OneDayChartStore oneDayChartStore, InstrumentOneDayChartRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<InstrumentOneDayChartRequest, ApiInstrumentOneDayChart> endpoint = oneDayChartStore.perpetualsOneDayChartEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow perpetualsOneDayChartBatchedQuery$lambda$5(OneDayChartStore oneDayChartStore, InstrumentOneDayChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return oneDayChartStore.instrumentOneDayChartDao.streamInstrumentOneDayChart(request.getInstrumentId(), request.getInstrumentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow tokenizedStockOneDayChartBatchedQuery$lambda$6(OneDayChartStore oneDayChartStore, Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> paginatedEndpoint = oneDayChartStore.tokenizedStockOneDayChartBatchedEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return paginatedEndpoint.pollAllPages(requests, durationOfSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow tokenizedStockOneDayChartBatchedQuery$lambda$7(OneDayChartStore oneDayChartStore, InstrumentOneDayChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return oneDayChartStore.instrumentOneDayChartDao.streamInstrumentOneDayChart(request.getInstrumentId(), request.getInstrumentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexOneDayChartBatchedQuery$lambda$8(OneDayChartStore oneDayChartStore, Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        PaginatedEndpoint<Iterable<InstrumentOneDayChartRequest>, ApiInstrumentOneDayChart> paginatedEndpoint = oneDayChartStore.indexOneDayChartBatchedEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return paginatedEndpoint.pollAllPages(requests, durationOfSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indexOneDayChartBatchedQuery$lambda$9(OneDayChartStore oneDayChartStore, InstrumentOneDayChartRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return oneDayChartStore.instrumentOneDayChartDao.streamInstrumentOneDayChart(request.getInstrumentId(), request.getInstrumentType());
    }

    public final Flow<OneDayChartData> streamOneDayMiniChart(UUID metadataId, InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        switch (WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
            case 1:
                return streamEquityMiniChart(metadataId, instrumentType);
            case 2:
                return streamCryptoMiniChart(metadataId, instrumentType);
            case 3:
                return streamPerpetualsStockMiniChart(metadataId, instrumentType);
            case 4:
                return streamTokenizedStockMiniChart(metadataId, instrumentType);
            case 5:
                return streamIndexMiniChart(metadataId, instrumentType);
            case 6:
                List listEmptyList = CollectionsKt.emptyList();
                List listEmptyList2 = CollectionsKt.emptyList();
                Instant instant = this.clock.instant();
                Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                return FlowKt.flowOf(new OneDayChartData(listEmptyList, listEmptyList2, instant));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Flow<OneDayChartData> streamEquityMiniChart(UUID metadataId, InstrumentType instrumentType) {
        return FlowKt.combine(this.quoteStore.streamQuote(metadataId), streamInstrumentOneDayChart(metadataId, instrumentType), FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{MiniChartSyncExperiment.INSTANCE}, false, null, 6, null)), new C339801(instrumentType, null));
    }

    /* compiled from: OneDayChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "quote", "Lcom/robinhood/models/db/Quote;", "oneDayChart", "Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;", "inMiniChartSyncExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OneDayChartStore$streamEquityMiniChart$1", m3645f = "OneDayChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OneDayChartStore$streamEquityMiniChart$1 */
    static final class C339801 extends ContinuationImpl7 implements Function4<Quote, InstrumentOneDayChart, Boolean, Continuation<? super OneDayChartData>, Object> {
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339801(InstrumentType instrumentType, Continuation<? super C339801> continuation) {
            super(4, continuation);
            this.$instrumentType = instrumentType;
        }

        public final Object invoke(Quote quote, InstrumentOneDayChart instrumentOneDayChart, boolean z, Continuation<? super OneDayChartData> continuation) {
            C339801 c339801 = OneDayChartStore.this.new C339801(this.$instrumentType, continuation);
            c339801.L$0 = quote;
            c339801.L$1 = instrumentOneDayChart;
            c339801.Z$0 = z;
            return c339801.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Quote quote, InstrumentOneDayChart instrumentOneDayChart, Boolean bool, Continuation<? super OneDayChartData> continuation) {
            return invoke(quote, instrumentOneDayChart, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Quote quote = (Quote) this.L$0;
            InstrumentOneDayChart instrumentOneDayChart = (InstrumentOneDayChart) this.L$1;
            boolean z = this.Z$0;
            if (quote != null) {
                OneDayChartData oneDayChartDataRenormalizeIfNecessary = OneDayChartNormalizer.renormalizeIfNecessary(instrumentOneDayChart, OneDayChartNormalizer.toNormalizationQuote(quote), DisplaySpan.DAY, this.$instrumentType, z, OneDayChartStore.this.clock);
                if (oneDayChartDataRenormalizeIfNecessary != null) {
                    return oneDayChartDataRenormalizeIfNecessary;
                }
            }
            List listEmptyList = CollectionsKt.emptyList();
            List listEmptyList2 = CollectionsKt.emptyList();
            Instant instant = OneDayChartStore.this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return new OneDayChartData(listEmptyList, listEmptyList2, instant);
        }
    }

    private final Flow<OneDayChartData> streamCryptoMiniChart(UUID metadataId, InstrumentType instrumentType) {
        return FlowKt.combine(this.cryptoQuoteStore.getPollCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(metadataId, null, null, 6, null)), streamInstrumentOneDayChart(metadataId, instrumentType), FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{MiniChartSyncExperiment.INSTANCE}, false, null, 6, null)), new C339791(instrumentType, this, null));
    }

    /* compiled from: OneDayChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "quote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "oneDayChart", "Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;", "inMiniChartSyncExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OneDayChartStore$streamCryptoMiniChart$1", m3645f = "OneDayChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OneDayChartStore$streamCryptoMiniChart$1 */
    static final class C339791 extends ContinuationImpl7 implements Function4<CryptoQuote, InstrumentOneDayChart, Boolean, Continuation<? super OneDayChartData>, Object> {
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ OneDayChartStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339791(InstrumentType instrumentType, OneDayChartStore oneDayChartStore, Continuation<? super C339791> continuation) {
            super(4, continuation);
            this.$instrumentType = instrumentType;
            this.this$0 = oneDayChartStore;
        }

        public final Object invoke(CryptoQuote cryptoQuote, InstrumentOneDayChart instrumentOneDayChart, boolean z, Continuation<? super OneDayChartData> continuation) {
            C339791 c339791 = new C339791(this.$instrumentType, this.this$0, continuation);
            c339791.L$0 = cryptoQuote;
            c339791.L$1 = instrumentOneDayChart;
            c339791.Z$0 = z;
            return c339791.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(CryptoQuote cryptoQuote, InstrumentOneDayChart instrumentOneDayChart, Boolean bool, Continuation<? super OneDayChartData> continuation) {
            return invoke(cryptoQuote, instrumentOneDayChart, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoQuote cryptoQuote = (CryptoQuote) this.L$0;
            return OneDayChartNormalizer.renormalizeIfNecessary((InstrumentOneDayChart) this.L$1, OneDayChartNormalizer.toNormalizationQuote(cryptoQuote), DisplaySpan.DAY, this.$instrumentType, this.Z$0, this.this$0.clock);
        }
    }

    private final Flow<OneDayChartData> streamTokenizedStockMiniChart(UUID metadataId, InstrumentType instrumentType) {
        return FlowKt.combine(this.marketDataProxyStore.pollQuoteWithTimestamp(metadataId, CurrencyCodeDto.USD), streamInstrumentOneDayChart(metadataId, instrumentType), FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{MiniChartSyncExperiment.INSTANCE}, false, null, 6, null)), new C339831(instrumentType, null));
    }

    /* compiled from: OneDayChartStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m3636d2 = {"Lkotlin/Pair;", "j$/time/Instant", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "quote", "Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;", "oneDayChart", "", "inMiniChartSyncExperiment", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "<anonymous>", "(Lkotlin/Pair;Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;Z)Lcom/robinhood/librobinhood/data/store/OneDayChartData;"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OneDayChartStore$streamTokenizedStockMiniChart$1", m3645f = "OneDayChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OneDayChartStore$streamTokenizedStockMiniChart$1 */
    static final class C339831 extends ContinuationImpl7 implements Function4<Tuples2<? extends Instant, ? extends QuoteDetailDataDto>, InstrumentOneDayChart, Boolean, Continuation<? super OneDayChartData>, Object> {
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339831(InstrumentType instrumentType, Continuation<? super C339831> continuation) {
            super(4, continuation);
            this.$instrumentType = instrumentType;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Instant, ? extends QuoteDetailDataDto> tuples2, InstrumentOneDayChart instrumentOneDayChart, Boolean bool, Continuation<? super OneDayChartData> continuation) {
            return invoke((Tuples2<Instant, QuoteDetailDataDto>) tuples2, instrumentOneDayChart, bool.booleanValue(), continuation);
        }

        public final Object invoke(Tuples2<Instant, QuoteDetailDataDto> tuples2, InstrumentOneDayChart instrumentOneDayChart, boolean z, Continuation<? super OneDayChartData> continuation) {
            C339831 c339831 = OneDayChartStore.this.new C339831(this.$instrumentType, continuation);
            c339831.L$0 = tuples2;
            c339831.L$1 = instrumentOneDayChart;
            c339831.Z$0 = z;
            return c339831.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            NormalizationQuote normalizationQuote;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            InstrumentOneDayChart instrumentOneDayChart = (InstrumentOneDayChart) this.L$1;
            boolean z = this.Z$0;
            TokenizedStockQuoteDto tokenized_stock_quote = ((QuoteDetailDataDto) tuples2.getSecond()).getTokenized_stock_quote();
            if (tokenized_stock_quote != null && (normalizationQuote = OneDayChartNormalizer.toNormalizationQuote(tokenized_stock_quote, (Instant) tuples2.getFirst())) != null) {
                OneDayChartData oneDayChartDataRenormalizeIfNecessary = OneDayChartNormalizer.renormalizeIfNecessary(instrumentOneDayChart, normalizationQuote, DisplaySpan.DAY, this.$instrumentType, z, OneDayChartStore.this.clock);
                if (oneDayChartDataRenormalizeIfNecessary != null) {
                    return oneDayChartDataRenormalizeIfNecessary;
                }
            }
            List listEmptyList = CollectionsKt.emptyList();
            List listEmptyList2 = CollectionsKt.emptyList();
            Instant instant = OneDayChartStore.this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return new OneDayChartData(listEmptyList, listEmptyList2, instant);
        }
    }

    private final Flow<OneDayChartData> streamPerpetualsStockMiniChart(UUID metadataId, InstrumentType instrumentType) {
        return FlowKt.combine(this.marketDataProxyStore.pollQuoteWithTimestamp(metadataId, CurrencyCodeDto.USD), streamInstrumentOneDayChart(metadataId, instrumentType), FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{MiniChartSyncExperiment.INSTANCE}, false, null, 6, null)), new C339821(instrumentType, null));
    }

    /* compiled from: OneDayChartStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m3636d2 = {"Lkotlin/Pair;", "j$/time/Instant", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;", "quote", "Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;", "oneDayChart", "", "inMiniChartSyncExperiment", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "<anonymous>", "(Lkotlin/Pair;Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;Z)Lcom/robinhood/librobinhood/data/store/OneDayChartData;"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OneDayChartStore$streamPerpetualsStockMiniChart$1", m3645f = "OneDayChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OneDayChartStore$streamPerpetualsStockMiniChart$1 */
    static final class C339821 extends ContinuationImpl7 implements Function4<Tuples2<? extends Instant, ? extends QuoteDetailDataDto>, InstrumentOneDayChart, Boolean, Continuation<? super OneDayChartData>, Object> {
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339821(InstrumentType instrumentType, Continuation<? super C339821> continuation) {
            super(4, continuation);
            this.$instrumentType = instrumentType;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Instant, ? extends QuoteDetailDataDto> tuples2, InstrumentOneDayChart instrumentOneDayChart, Boolean bool, Continuation<? super OneDayChartData> continuation) {
            return invoke((Tuples2<Instant, QuoteDetailDataDto>) tuples2, instrumentOneDayChart, bool.booleanValue(), continuation);
        }

        public final Object invoke(Tuples2<Instant, QuoteDetailDataDto> tuples2, InstrumentOneDayChart instrumentOneDayChart, boolean z, Continuation<? super OneDayChartData> continuation) {
            C339821 c339821 = OneDayChartStore.this.new C339821(this.$instrumentType, continuation);
            c339821.L$0 = tuples2;
            c339821.L$1 = instrumentOneDayChart;
            c339821.Z$0 = z;
            return c339821.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            NormalizationQuote normalizationQuote;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            InstrumentOneDayChart instrumentOneDayChart = (InstrumentOneDayChart) this.L$1;
            boolean z = this.Z$0;
            PerpetualQuoteDto perpetual_quote = ((QuoteDetailDataDto) tuples2.getSecond()).getPerpetual_quote();
            if (perpetual_quote != null && (normalizationQuote = OneDayChartNormalizer.toNormalizationQuote(perpetual_quote, (Instant) tuples2.getFirst())) != null) {
                OneDayChartData oneDayChartDataRenormalizeIfNecessary = OneDayChartNormalizer.renormalizeIfNecessary(instrumentOneDayChart, normalizationQuote, DisplaySpan.DAY, this.$instrumentType, z, OneDayChartStore.this.clock);
                if (oneDayChartDataRenormalizeIfNecessary != null) {
                    return oneDayChartDataRenormalizeIfNecessary;
                }
            }
            List listEmptyList = CollectionsKt.emptyList();
            List listEmptyList2 = CollectionsKt.emptyList();
            Instant instant = OneDayChartStore.this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return new OneDayChartData(listEmptyList, listEmptyList2, instant);
        }
    }

    private final Flow<OneDayChartData> streamIndexMiniChart(UUID metadataId, InstrumentType instrumentType) {
        return FlowKt.combine(this.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(metadataId)), streamInstrumentOneDayChart(metadataId, instrumentType), FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{MiniChartSyncExperiment.INSTANCE}, false, null, 6, null)), new C339811(instrumentType, null));
    }

    /* compiled from: OneDayChartStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "oneDayChart", "Lcom/robinhood/models/onedaycharts/db/InstrumentOneDayChart;", "inMiniChartSyncExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OneDayChartStore$streamIndexMiniChart$1", m3645f = "OneDayChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OneDayChartStore$streamIndexMiniChart$1 */
    static final class C339811 extends ContinuationImpl7 implements Function4<IndexValue, InstrumentOneDayChart, Boolean, Continuation<? super OneDayChartData>, Object> {
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C339811(InstrumentType instrumentType, Continuation<? super C339811> continuation) {
            super(4, continuation);
            this.$instrumentType = instrumentType;
        }

        public final Object invoke(IndexValue indexValue, InstrumentOneDayChart instrumentOneDayChart, boolean z, Continuation<? super OneDayChartData> continuation) {
            C339811 c339811 = OneDayChartStore.this.new C339811(this.$instrumentType, continuation);
            c339811.L$0 = indexValue;
            c339811.L$1 = instrumentOneDayChart;
            c339811.Z$0 = z;
            return c339811.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(IndexValue indexValue, InstrumentOneDayChart instrumentOneDayChart, Boolean bool, Continuation<? super OneDayChartData> continuation) {
            return invoke(indexValue, instrumentOneDayChart, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IndexValue indexValue = (IndexValue) this.L$0;
            InstrumentOneDayChart instrumentOneDayChart = (InstrumentOneDayChart) this.L$1;
            boolean z = this.Z$0;
            return OneDayChartNormalizer.renormalizeIfNecessary(instrumentOneDayChart, new NormalizationQuote(indexValue.getValue(), indexValue.getValue(), NormalizationQuote2.Value.INSTANCE, false, indexValue.getReceivedAt()), DisplaySpan.DAY, this.$instrumentType, z, OneDayChartStore.this.clock);
        }
    }

    private final Flow<InstrumentOneDayChart> streamInstrumentOneDayChart(UUID instrumentId, InstrumentType instrumentType) {
        switch (WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
            case 1:
                return this.equityOneDayChartBatchedQuery.asFlow(new InstrumentOneDayChartRequest(instrumentId, instrumentType));
            case 2:
                return this.cryptoOneDayChartBatchedQuery.asFlow(new InstrumentOneDayChartRequest(instrumentId, instrumentType));
            case 3:
                return this.perpetualsOneDayChartBatchedQuery.asFlow(new InstrumentOneDayChartRequest(instrumentId, instrumentType));
            case 4:
                return this.tokenizedStockOneDayChartBatchedQuery.asFlow(new InstrumentOneDayChartRequest(instrumentId, instrumentType));
            case 5:
                return this.indexOneDayChartBatchedQuery.asFlow(new InstrumentOneDayChartRequest(instrumentId, instrumentType));
            case 6:
                return FlowKt.flowOf((Object[]) new InstrumentOneDayChart[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
