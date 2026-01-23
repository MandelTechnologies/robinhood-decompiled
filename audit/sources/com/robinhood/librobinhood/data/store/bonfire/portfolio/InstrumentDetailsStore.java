package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.InstrumentApi;
import com.robinhood.android.indexes.models.api.ApiIndexCloseDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.portfolio.InstrumentDetails;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.models.portfolio.InstrumentDetailsDao;
import com.robinhood.android.models.portfolio.OptionStrategyDetails;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: InstrumentDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002VWBq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b(\u0010)J-\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b,\u0010+J-\u0010.\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b.\u0010+Jw\u0010<\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u0002032\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\b\b\u0002\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J?\u0010@\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010?\u001a\u00020>2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010IR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010KR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010LR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010MR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020P0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020P0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/portfolio/InstrumentApi;", "instrumentApi", "Lcom/robinhood/android/models/portfolio/InstrumentDetailsDao;", "dao", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresContractStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "stockDetailStore", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/portfolio/InstrumentApi;Lcom/robinhood/android/models/portfolio/InstrumentDetailsDao;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "instrumentId", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "instrumentType", "", "displayType", "Lcom/robinhood/models/db/CuratedListItem;", "optionCuratedListItem", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", "streamOptionStrategyInstrumentDetails", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/lang/String;Lcom/robinhood/models/db/CuratedListItem;)Lkotlinx/coroutines/flow/Flow;", "streamFutureInstrumentDetails", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "streamEquityInstrumentDetails", "indexId", "streamIndexInstrumentDetails", "title", "subtitle", "value", "subValue", "", "isNonNegativeChange", "j$/time/Instant", "receivedAt", "filledTicker", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "strategyInfo", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "directionColor", "buildInstrumentDetails", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;ZLcom/robinhood/models/ui/UiOptionStrategyInfo;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;)Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", "", "pollingRate", "refreshAndStreamInstrumentDetails", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;JLcom/robinhood/models/db/CuratedListItem;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/api/portfolio/InstrumentApi;", "Lcom/robinhood/android/models/portfolio/InstrumentDetailsDao;", "Lcom/robinhood/android/indexes/store/IndexStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$Request;", "Lcom/robinhood/android/models/portfolio/InstrumentDetails;", "instrumentDetailsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "instrumentDetailsQuery", "Lcom/robinhood/android/moria/db/Query;", "Request", "QuoteMode", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InstrumentDetailsStore extends Store {
    private final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private final InstrumentDetailsDao dao;
    private final FuturesContractStore futuresContractStore;
    private final FuturesMarketDataStore futuresMarketDataStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final IndexStore indexStore;
    private final InstrumentApi instrumentApi;
    private final Endpoint<Request, InstrumentDetails> instrumentDetailsEndpoint;
    private final Query<Request, InstrumentDetails> instrumentDetailsQuery;
    private final InstrumentStore instrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final QuoteStore quoteStore;
    private final StockDetailStore stockDetailStore;

    /* compiled from: InstrumentDetailsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            try {
                iArr[InstrumentType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentType.CRYPTO_PERPETUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentType.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstrumentType.FUTURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstrumentType.OPTION_STRATEGY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InstrumentType.INDEX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InstrumentType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailsStore(InstrumentApi instrumentApi, InstrumentDetailsDao dao, IndexStore indexStore, InstrumentStore instrumentStore, QuoteStore quoteStore, FuturesContractStore futuresContractStore, FuturesMarketDataStore futuresMarketDataStore, FuturesQuoteStore futuresQuoteStore, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionMarketHoursStore optionMarketHoursStore, StockDetailStore stockDetailStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instrumentApi, "instrumentApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.instrumentApi = instrumentApi;
        this.dao = dao;
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.stockDetailStore = stockDetailStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        InstrumentDetailsStore2 instrumentDetailsStore2 = new InstrumentDetailsStore2(dao);
        this.instrumentDetailsEndpoint = Endpoint.Companion.create$default(companion, new InstrumentDetailsStore3(this, null), getLogoutKillswitch(), instrumentDetailsStore2, storeBundle.getClock(), null, 16, null);
        this.instrumentDetailsQuery = Store.create$default(this, Query.INSTANCE, "positionDetailsQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailsStore.instrumentDetailsQuery$lambda$0(this.f$0, (InstrumentDetailsStore.Request) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailsStore.instrumentDetailsQuery$lambda$1(this.f$0, (InstrumentDetailsStore.Request) obj);
            }
        }, false, 8, null);
    }

    /* compiled from: InstrumentDetailsStore.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$Request;", "", "instrumentId", "Ljava/util/UUID;", "displayType", "", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "pollingRate", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;J)V", "getInstrumentId", "()Ljava/util/UUID;", "getDisplayType", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "getPollingRate", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Request {
        private final String displayType;
        private final UUID instrumentId;
        private final InstrumentType instrumentType;
        private final long pollingRate;

        public static /* synthetic */ Request copy$default(Request request, UUID uuid, String str, InstrumentType instrumentType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = request.instrumentId;
            }
            if ((i & 2) != 0) {
                str = request.displayType;
            }
            if ((i & 4) != 0) {
                instrumentType = request.instrumentType;
            }
            if ((i & 8) != 0) {
                j = request.pollingRate;
            }
            InstrumentType instrumentType2 = instrumentType;
            return request.copy(uuid, str, instrumentType2, j);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayType() {
            return this.displayType;
        }

        /* renamed from: component3, reason: from getter */
        public final InstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        /* renamed from: component4, reason: from getter */
        public final long getPollingRate() {
            return this.pollingRate;
        }

        public final Request copy(UUID instrumentId, String displayType, InstrumentType instrumentType, long pollingRate) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new Request(instrumentId, displayType, instrumentType, pollingRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.instrumentId, request.instrumentId) && Intrinsics.areEqual(this.displayType, request.displayType) && this.instrumentType == request.instrumentType && this.pollingRate == request.pollingRate;
        }

        public int hashCode() {
            return (((((this.instrumentId.hashCode() * 31) + this.displayType.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + Long.hashCode(this.pollingRate);
        }

        public String toString() {
            return "Request(instrumentId=" + this.instrumentId + ", displayType=" + this.displayType + ", instrumentType=" + this.instrumentType + ", pollingRate=" + this.pollingRate + ")";
        }

        public Request(UUID instrumentId, String displayType, InstrumentType instrumentType, long j) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(displayType, "displayType");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentId = instrumentId;
            this.displayType = displayType;
            this.instrumentType = instrumentType;
            this.pollingRate = j;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getDisplayType() {
            return this.displayType;
        }

        public final InstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final long getPollingRate() {
            return this.pollingRate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object instrumentDetailsEndpoint$insert(InstrumentDetailsDao instrumentDetailsDao, InstrumentDetails instrumentDetails, Continuation continuation) {
        instrumentDetailsDao.insert((InstrumentDetailsDao) instrumentDetails);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow instrumentDetailsQuery$lambda$0(InstrumentDetailsStore instrumentDetailsStore, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Endpoint<Request, InstrumentDetails> endpoint = instrumentDetailsStore.instrumentDetailsEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(request.getPollingRate());
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, request, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow instrumentDetailsQuery$lambda$1(InstrumentDetailsStore instrumentDetailsStore, Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return instrumentDetailsStore.dao.getInstrumentDetail(request.getInstrumentId(), request.getDisplayType(), request.getInstrumentType());
    }

    public static /* synthetic */ Flow refreshAndStreamInstrumentDetails$default(InstrumentDetailsStore instrumentDetailsStore, UUID uuid, String str, InstrumentType instrumentType, long j, CuratedListItem curatedListItem, int i, Object obj) {
        if ((i & 16) != 0) {
            curatedListItem = null;
        }
        return instrumentDetailsStore.refreshAndStreamInstrumentDetails(uuid, str, instrumentType, j, curatedListItem);
    }

    public final Flow<InstrumentDetails3> refreshAndStreamInstrumentDetails(UUID instrumentId, String displayType, InstrumentType instrumentType, long pollingRate, CuratedListItem optionCuratedListItem) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        switch (WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                Request request = new Request(instrumentId, displayType, instrumentType, pollingRate);
                Endpoint.DefaultImpls.refresh$default(this.instrumentDetailsEndpoint, request, false, null, 6, null);
                return this.instrumentDetailsQuery.asFlow(request);
            case 4:
                return streamEquityInstrumentDetails(instrumentId, instrumentType, displayType);
            case 5:
                return streamFutureInstrumentDetails(instrumentId, instrumentType, displayType);
            case 6:
                return streamOptionStrategyInstrumentDetails(instrumentId, instrumentType, displayType, optionCuratedListItem);
            case 7:
                return streamIndexInstrumentDetails(instrumentId, instrumentType, displayType);
            case 8:
                return FlowKt.emptyFlow();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Flow<InstrumentDetails3> streamOptionStrategyInstrumentDetails(UUID instrumentId, InstrumentType instrumentType, String displayType, CuratedListItem optionCuratedListItem) {
        if ((optionCuratedListItem != null ? optionCuratedListItem.getStrategyCode() : null) == null) {
            return FlowKt.emptyFlow();
        }
        String strategyCode = optionCuratedListItem.getStrategyCode();
        if (strategyCode == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        OptionStrategyInfoStore.refresh$default(this.optionStrategyInfoStore, CollectionsKt.listOf(strategyCode), false, 2, null);
        Flow<UiOptionStrategyInfo> flowStreamUiStrategyInfo = this.optionStrategyInfoStore.streamUiStrategyInfo(strategyCode);
        return FlowKt.combine(flowStreamUiStrategyInfo, FlowKt.transformLatest(flowStreamUiStrategyInfo, new C34659x2867429(null, this)), FlowKt.transformLatest(flowStreamUiStrategyInfo, new C34660x286742a(null, this)), new C346653(optionCuratedListItem, displayType, this, instrumentId, instrumentType, null));
    }

    /* compiled from: InstrumentDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", "strategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "quote", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "isOptionTradingOpenHours", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamOptionStrategyInstrumentDetails$3", m3645f = "InstrumentDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamOptionStrategyInstrumentDetails$3 */
    static final class C346653 extends ContinuationImpl7 implements Function4<UiOptionStrategyInfo, AggregateOptionStrategyQuote, Boolean, Continuation<? super InstrumentDetails3>, Object> {
        final /* synthetic */ String $displayType;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ InstrumentType $instrumentType;
        final /* synthetic */ CuratedListItem $optionCuratedListItem;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ InstrumentDetailsStore this$0;

        /* compiled from: InstrumentDetailsStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamOptionStrategyInstrumentDetails$3$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderDirection.values().length];
                try {
                    iArr[OrderDirection.DEBIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderDirection.CREDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346653(CuratedListItem curatedListItem, String str, InstrumentDetailsStore instrumentDetailsStore, UUID uuid, InstrumentType instrumentType, Continuation<? super C346653> continuation) {
            super(4, continuation);
            this.$optionCuratedListItem = curatedListItem;
            this.$displayType = str;
            this.this$0 = instrumentDetailsStore;
            this.$instrumentId = uuid;
            this.$instrumentType = instrumentType;
        }

        public final Object invoke(UiOptionStrategyInfo uiOptionStrategyInfo, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, boolean z, Continuation<? super InstrumentDetails3> continuation) {
            C346653 c346653 = new C346653(this.$optionCuratedListItem, this.$displayType, this.this$0, this.$instrumentId, this.$instrumentType, continuation);
            c346653.L$0 = uiOptionStrategyInfo;
            c346653.L$1 = aggregateOptionStrategyQuote;
            c346653.Z$0 = z;
            return c346653.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(UiOptionStrategyInfo uiOptionStrategyInfo, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, Boolean bool, Continuation<? super InstrumentDetails3> continuation) {
            return invoke(uiOptionStrategyInfo, aggregateOptionStrategyQuote, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimalCompat;
            OptionPositionType optionPositionType;
            String str;
            String str2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) this.L$0;
            AggregateOptionStrategyQuote aggregateOptionStrategyQuote = (AggregateOptionStrategyQuote) this.L$1;
            boolean z = this.Z$0;
            String str3 = Formats.getPercentDeltaFormat().format(aggregateOptionStrategyQuote.getTodaysPercentChange());
            String displayName = this.$optionCuratedListItem.getDisplayName();
            if (Intrinsics.areEqual(this.$displayType, "last-price")) {
                str = Formats.getCurrencyFormat().format(aggregateOptionStrategyQuote.getAdjustedMarkPrice().getUnsignedValue());
            } else {
                if (Intrinsics.areEqual(this.$displayType, PositionsDisplayOptions.PERCENT_CHANGE)) {
                    str2 = str3;
                    return InstrumentDetailsStore.buildInstrumentDetails$default(this.this$0, this.$instrumentId, this.$instrumentType, this.$displayType, displayName, "", str2, str3, !BigDecimals7.isNegative(aggregateOptionStrategyQuote.getTodaysPercentChange()), aggregateOptionStrategyQuote.getReceivedAt(), z, uiOptionStrategyInfo, null, 2048, null);
                }
                OrderDirection optionOpenPriceDirection = this.$optionCuratedListItem.getOptionOpenPriceDirection();
                if (optionOpenPriceDirection == null) {
                    optionOpenPriceDirection = OrderDirection.DEBIT;
                }
                Money optionOpenPrice = this.$optionCuratedListItem.getOptionOpenPrice();
                if (optionOpenPrice == null || (bigDecimalCompat = Money3.getBigDecimalCompat(optionOpenPrice)) == null) {
                    bigDecimalCompat = BigDecimal.ZERO;
                }
                Intrinsics.checkNotNull(bigDecimalCompat);
                BigDecimal bigDecimalMultiply = bigDecimalCompat.multiply(optionOpenPriceDirection.getMultiplier());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                Instant MAX = Instant.MAX;
                Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                UUID id = uiOptionStrategyInfo.getOptionChain().getId();
                UUID uuidFromString2 = UUID.fromString("00000000-0000-0000-0000-00000000000");
                Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                int i = WhenMappings.$EnumSwitchMapping$0[optionOpenPriceDirection.ordinal()];
                if (i == 1) {
                    optionPositionType = OptionPositionType.LONG;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    optionPositionType = OptionPositionType.SHORT;
                }
                str = Formats.getPercentDeltaFormat().format(new OptionInstrumentPosition("", bigDecimalMultiply, MAX, null, null, null, null, null, null, ONE, uuidFromString, ZERO, ZERO, id, uuidFromString2, ZERO, ZERO, ZERO, ONE, optionPositionType).getTotalReturnPercentage(aggregateOptionStrategyQuote, uiOptionStrategyInfo.getOptionChain()));
            }
            str2 = str;
            return InstrumentDetailsStore.buildInstrumentDetails$default(this.this$0, this.$instrumentId, this.$instrumentType, this.$displayType, displayName, "", str2, str3, !BigDecimals7.isNegative(aggregateOptionStrategyQuote.getTodaysPercentChange()), aggregateOptionStrategyQuote.getReceivedAt(), z, uiOptionStrategyInfo, null, 2048, null);
        }
    }

    private final Flow<InstrumentDetails3> streamFutureInstrumentDetails(UUID instrumentId, InstrumentType instrumentType, String displayType) {
        InstrumentDisplayType instrumentDisplayTypeFromServerValue = InstrumentDisplayType.INSTANCE.fromServerValue(displayType);
        Flow<UiFuturesContract> flowStreamUiFuturesContract = this.futuresContractStore.streamUiFuturesContract(instrumentId);
        final Flow quote$default = FuturesQuoteStore.getQuote$default(this.futuresQuoteStore, instrumentId, null, 2, null);
        Flow<Tuples2<? extends BigDecimal, ? extends Instant>> flow = new Flow<Tuples2<? extends BigDecimal, ? extends Instant>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends BigDecimal, ? extends Instant>> flowCollector, Continuation continuation) {
                Object objCollect = quote$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$1$2", m3645f = "InstrumentDetailsStore.kt", m3646l = {54}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        FuturesQuote futuresQuote = (FuturesQuote) obj;
                        BigDecimal lastTradePrice = futuresQuote.getLastTradePrice();
                        Tuples2 tuples2M3642to = lastTradePrice != null ? Tuples4.m3642to(lastTradePrice, futuresQuote.getReceivedAt()) : null;
                        if (tuples2M3642to != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
        };
        final Flow<FuturesClosePrices> closePrices = this.futuresMarketDataStore.getClosePrices(instrumentId);
        return FlowKt.combine(flowStreamUiFuturesContract, flow, new Flow<BigDecimal>() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super BigDecimal> flowCollector, Continuation continuation) {
                Object objCollect = closePrices.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$2$2", m3645f = "InstrumentDetailsStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                        BigDecimal previousClosePrice = ((FuturesClosePrices) obj).getPreviousClosePrice();
                        if (previousClosePrice != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(previousClosePrice, anonymousClass1) == coroutine_suspended) {
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
        }, new C346633(instrumentId, instrumentType, displayType, instrumentDisplayTypeFromServerValue, null));
    }

    /* compiled from: InstrumentDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m3636d2 = {"Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;", "contract", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "j$/time/Instant", "<destruct>", PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE, "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", "<anonymous>", "(Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;Lkotlin/Pair;Ljava/math/BigDecimal;)Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$3", m3645f = "InstrumentDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamFutureInstrumentDetails$3 */
    static final class C346633 extends ContinuationImpl7 implements Function4<UiFuturesContract, Tuples2<? extends BigDecimal, ? extends Instant>, BigDecimal, Continuation<? super InstrumentDetails3>, Object> {
        final /* synthetic */ String $displayType;
        final /* synthetic */ InstrumentDisplayType $instrumentDisplayType;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346633(UUID uuid, InstrumentType instrumentType, String str, InstrumentDisplayType instrumentDisplayType, Continuation<? super C346633> continuation) {
            super(4, continuation);
            this.$instrumentId = uuid;
            this.$instrumentType = instrumentType;
            this.$displayType = str;
            this.$instrumentDisplayType = instrumentDisplayType;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(UiFuturesContract uiFuturesContract, Tuples2<? extends BigDecimal, Instant> tuples2, BigDecimal bigDecimal, Continuation<? super InstrumentDetails3> continuation) {
            C346633 c346633 = InstrumentDetailsStore.this.new C346633(this.$instrumentId, this.$instrumentType, this.$displayType, this.$instrumentDisplayType, continuation);
            c346633.L$0 = uiFuturesContract;
            c346633.L$1 = tuples2;
            c346633.L$2 = bigDecimal;
            return c346633.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(UiFuturesContract uiFuturesContract, Tuples2<? extends BigDecimal, ? extends Instant> tuples2, BigDecimal bigDecimal, Continuation<? super InstrumentDetails3> continuation) {
            return invoke2(uiFuturesContract, (Tuples2<? extends BigDecimal, Instant>) tuples2, bigDecimal, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String displayName;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UiFuturesContract uiFuturesContract = (UiFuturesContract) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            BigDecimal bigDecimal = (BigDecimal) this.L$2;
            BigDecimal bigDecimal2 = (BigDecimal) tuples2.component1();
            Instant instant = (Instant) tuples2.component2();
            BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            String str = Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(bigDecimalSubtract, bigDecimal));
            InstrumentDetailsStore instrumentDetailsStore = InstrumentDetailsStore.this;
            UUID uuid = this.$instrumentId;
            InstrumentType instrumentType = this.$instrumentType;
            String str2 = this.$displayType;
            String displaySymbol = uiFuturesContract.getContract().getDisplaySymbol();
            FuturesProduct product = uiFuturesContract.getProduct();
            if (product == null || (displayName = product.getSimpleName()) == null) {
                displayName = uiFuturesContract.getContract().getDisplayName();
            }
            return InstrumentDetailsStore.buildInstrumentDetails$default(instrumentDetailsStore, uuid, instrumentType, str2, displaySymbol, displayName, this.$instrumentDisplayType == InstrumentDisplayType.LAST_PRICE ? FuturesProduct5.format$default(uiFuturesContract.getProduct(), bigDecimal2, null, 2, null) : str, str, !BigDecimals7.isNegative(bigDecimalSubtract), instant, false, null, null, 3584, null);
        }
    }

    private final Flow<InstrumentDetails3> streamEquityInstrumentDetails(UUID instrumentId, InstrumentType instrumentType, String displayType) {
        this.instrumentStore.refresh(false, instrumentId);
        return FlowKt.filterNotNull(FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.instrumentStore.getInstrument(instrumentId)), Integer.MAX_VALUE, null, 2, null), FlowKt.transformLatest(this.stockDetailStore.isPreIpo(instrumentId), new C34654x9cda49a6(null, this, instrumentId)), new C346622(displayType, this, instrumentId, instrumentType, null)));
    }

    /* compiled from: InstrumentDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", "instrument", "Lcom/robinhood/models/db/Instrument;", "quoteMode", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamEquityInstrumentDetails$2", m3645f = "InstrumentDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamEquityInstrumentDetails$2 */
    static final class C346622 extends ContinuationImpl7 implements Function3<Instrument, QuoteMode, Continuation<? super InstrumentDetails3>, Object> {
        final /* synthetic */ String $displayType;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ InstrumentDetailsStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346622(String str, InstrumentDetailsStore instrumentDetailsStore, UUID uuid, InstrumentType instrumentType, Continuation<? super C346622> continuation) {
            super(3, continuation);
            this.$displayType = str;
            this.this$0 = instrumentDetailsStore;
            this.$instrumentId = uuid;
            this.$instrumentType = instrumentType;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Instrument instrument, QuoteMode quoteMode, Continuation<? super InstrumentDetails3> continuation) {
            C346622 c346622 = new C346622(this.$displayType, this.this$0, this.$instrumentId, this.$instrumentType, continuation);
            c346622.L$0 = instrument;
            c346622.L$1 = quoteMode;
            return c346622.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String lastPrice;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Instrument instrument = (Instrument) this.L$0;
            QuoteMode quoteMode = (QuoteMode) this.L$1;
            InstrumentDisplayType instrumentDisplayTypeFromServerValue = InstrumentDisplayType.INSTANCE.fromServerValue(this.$displayType);
            if (quoteMode instanceof QuoteMode.PreIpoQuote) {
                String symbol = instrument.getSymbol();
                String simpleName = instrument.getSimpleName();
                if (simpleName == null) {
                    simpleName = instrument.getName();
                }
                String str = simpleName;
                if (instrumentDisplayTypeFromServerValue == InstrumentDisplayType.LAST_PRICE) {
                    lastPrice = ((QuoteMode.PreIpoQuote) quoteMode).getLastPrice();
                } else {
                    lastPrice = "N/A";
                }
                String str2 = lastPrice;
                Color color = Color.f5853FG;
                ThemedColor themedColor = new ThemedColor(color, color);
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                return InstrumentDetailsStore.buildInstrumentDetails$default(this.this$0, this.$instrumentId, this.$instrumentType, this.$displayType, symbol, str, str2, "N/A", true, instantNow, false, null, themedColor, 1024, null);
            }
            if (!(quoteMode instanceof QuoteMode.PublicQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            QuoteMode.PublicQuote publicQuote = (QuoteMode.PublicQuote) quoteMode;
            String str3 = Formats.getPercentDeltaFormat().format(publicQuote.getQuote().getTodaysPercentChange());
            InstrumentDetailsStore instrumentDetailsStore = this.this$0;
            UUID uuid = this.$instrumentId;
            InstrumentType instrumentType = this.$instrumentType;
            String str4 = this.$displayType;
            String symbol2 = instrument.getSymbol();
            String simpleName2 = instrument.getSimpleName();
            if (simpleName2 == null) {
                simpleName2 = instrument.getName();
            }
            return InstrumentDetailsStore.buildInstrumentDetails$default(instrumentDetailsStore, uuid, instrumentType, str4, symbol2, simpleName2, instrumentDisplayTypeFromServerValue == InstrumentDisplayType.LAST_PRICE ? Formats.getCurrencyFormat().format(Money3.getBigDecimalCompat(publicQuote.getQuote().getLastTradePrice())) : str3, str3, publicQuote.getQuote().isUpForTheDay(), publicQuote.getQuote().getReceivedAt(), false, null, null, 3584, null);
        }
    }

    private final Flow<InstrumentDetails3> streamIndexInstrumentDetails(UUID indexId, InstrumentType instrumentType, String displayType) {
        return FlowKt.filterNotNull(FlowKt.combine(this.indexStore.streamIndex(indexId), this.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(indexId)), this.indexStore.streamIndexCloseValue(new ApiIndexCloseDetailRequest.ApiIndexCloseRequestById(indexId)), new C346641(indexId, instrumentType, displayType, InstrumentDisplayType.INSTANCE.fromServerValue(displayType), null)));
    }

    /* compiled from: InstrumentDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexClose", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamIndexInstrumentDetails$1", m3645f = "InstrumentDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$streamIndexInstrumentDetails$1 */
    static final class C346641 extends ContinuationImpl7 implements Function4<Index, IndexValue, IndexCloseValue, Continuation<? super InstrumentDetails3>, Object> {
        final /* synthetic */ String $displayType;
        final /* synthetic */ UUID $indexId;
        final /* synthetic */ InstrumentDisplayType $instrumentDisplayType;
        final /* synthetic */ InstrumentType $instrumentType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346641(UUID uuid, InstrumentType instrumentType, String str, InstrumentDisplayType instrumentDisplayType, Continuation<? super C346641> continuation) {
            super(4, continuation);
            this.$indexId = uuid;
            this.$instrumentType = instrumentType;
            this.$displayType = str;
            this.$instrumentDisplayType = instrumentDisplayType;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Index index, IndexValue indexValue, IndexCloseValue indexCloseValue, Continuation<? super InstrumentDetails3> continuation) {
            C346641 c346641 = InstrumentDetailsStore.this.new C346641(this.$indexId, this.$instrumentType, this.$displayType, this.$instrumentDisplayType, continuation);
            c346641.L$0 = index;
            c346641.L$1 = indexValue;
            c346641.L$2 = indexCloseValue;
            return c346641.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Index index = (Index) this.L$0;
            IndexValue indexValue = (IndexValue) this.L$1;
            String str = Formats.getPercentDeltaFormat().format(BigDecimals7.safeDivide(BigDecimals7.safeSubtract(indexValue.getValue(), ((IndexCloseValue) this.L$2).getCloseValue()), indexValue.getValue()));
            return InstrumentDetailsStore.buildInstrumentDetails$default(InstrumentDetailsStore.this, this.$indexId, this.$instrumentType, this.$displayType, index.getSymbol(), index.getSimpleName(), this.$instrumentDisplayType == InstrumentDisplayType.LAST_PRICE ? Formats.getValueFormat().format(indexValue.getValue()) : str, str, !BigDecimals7.isNegative(r3), indexValue.getReceivedAt(), false, null, null, 3584, null);
        }
    }

    static /* synthetic */ InstrumentDetails3 buildInstrumentDetails$default(InstrumentDetailsStore instrumentDetailsStore, UUID uuid, InstrumentType instrumentType, String str, String str2, String str3, String str4, String str5, boolean z, Instant instant, boolean z2, UiOptionStrategyInfo uiOptionStrategyInfo, ThemedColor themedColor, int i, Object obj) {
        ThemedColor themedColor2;
        ThemedColor themedColor3;
        boolean z3 = (i & 512) != 0 ? true : z2;
        UiOptionStrategyInfo uiOptionStrategyInfo2 = (i & 1024) != 0 ? null : uiOptionStrategyInfo;
        if ((i & 2048) != 0) {
            if (z) {
                Color color = Color.POSITIVE;
                themedColor3 = new ThemedColor(color, color);
            } else {
                Color color2 = Color.NEGATIVE;
                themedColor3 = new ThemedColor(color2, color2);
            }
            themedColor2 = themedColor3;
        } else {
            themedColor2 = themedColor;
        }
        return instrumentDetailsStore.buildInstrumentDetails(uuid, instrumentType, str, str2, str3, str4, str5, z, instant, z3, uiOptionStrategyInfo2, themedColor2);
    }

    private final InstrumentDetails3 buildInstrumentDetails(UUID instrumentId, InstrumentType instrumentType, String displayType, String title, String subtitle, String value, String subValue, boolean isNonNegativeChange, Instant receivedAt, boolean filledTicker, UiOptionStrategyInfo strategyInfo, ThemedColor directionColor) {
        ThemedColor themedColor;
        ThemedColor themedColor2;
        Color color = Color.f5853FG;
        InstrumentDetails3.TextDisplay textDisplay = new InstrumentDetails3.TextDisplay(title, new ThemedColor(color, color));
        if (filledTicker) {
            themedColor = directionColor;
        } else {
            Color color2 = Color.f5843BG;
            themedColor = new ThemedColor(color2, color2);
        }
        ThemedColor themedColor3 = filledTicker ? null : directionColor;
        if (filledTicker) {
            Color color3 = Color.f5843BG;
            themedColor2 = new ThemedColor(color3, color3);
        } else {
            themedColor2 = directionColor;
        }
        InstrumentDetails3.ValueDisplay valueDisplay = new InstrumentDetails3.ValueDisplay(new InstrumentDetails3.TextDisplay(value, themedColor2), themedColor, themedColor3);
        InstrumentDetails3.TextDisplay textDisplay2 = new InstrumentDetails3.TextDisplay(subValue, directionColor);
        switch (WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
                Color color4 = Color.FG2;
                return new InstrumentDetails(instrumentId, instrumentType, displayType, textDisplay, new InstrumentDetails3.TextDisplay(subtitle, new ThemedColor(color4, color4)), new InstrumentDetails3.Chart(CollectionsKt.emptyList(), CollectionsKt.emptyList(), Direction.f5855UP), valueDisplay, textDisplay2, receivedAt);
            case 6:
                if (strategyInfo != null) {
                    return new OptionStrategyDetails(instrumentId, instrumentType, displayType, textDisplay, strategyInfo, new InstrumentDetails3.Chart(CollectionsKt.emptyList(), CollectionsKt.emptyList(), Direction.f5855UP), valueDisplay, textDisplay2, receivedAt);
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: InstrumentDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode;", "", "PreIpoQuote", "PublicQuote", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode$PreIpoQuote;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode$PublicQuote;", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface QuoteMode {

        /* compiled from: InstrumentDetailsStore.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode$PreIpoQuote;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode;", "quote", "Lcom/robinhood/directipo/models/db/IpoQuote;", "<init>", "(Lcom/robinhood/directipo/models/db/IpoQuote;)V", "getQuote", "()Lcom/robinhood/directipo/models/db/IpoQuote;", "getLastPrice", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PreIpoQuote implements QuoteMode {
            private final IpoQuote quote;

            public static /* synthetic */ PreIpoQuote copy$default(PreIpoQuote preIpoQuote, IpoQuote ipoQuote, int i, Object obj) {
                if ((i & 1) != 0) {
                    ipoQuote = preIpoQuote.quote;
                }
                return preIpoQuote.copy(ipoQuote);
            }

            /* renamed from: component1, reason: from getter */
            public final IpoQuote getQuote() {
                return this.quote;
            }

            public final PreIpoQuote copy(IpoQuote quote) {
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new PreIpoQuote(quote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PreIpoQuote) && Intrinsics.areEqual(this.quote, ((PreIpoQuote) other).quote);
            }

            public int hashCode() {
                return this.quote.hashCode();
            }

            public String toString() {
                return "PreIpoQuote(quote=" + this.quote + ")";
            }

            public PreIpoQuote(IpoQuote quote) {
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.quote = quote;
            }

            public final IpoQuote getQuote() {
                return this.quote;
            }

            public final String getLastPrice() {
                Money estimatedPrice;
                if (this.quote.getFinalizedPrice() != null) {
                    Money finalizedPrice = this.quote.getFinalizedPrice();
                    if (finalizedPrice != null) {
                        str = Money.format$default(finalizedPrice, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                    }
                } else if (this.quote.getLowerPriceRange() != null && this.quote.getUpperPriceRange() != null) {
                    if (Intrinsics.areEqual(this.quote.getLowerPriceRange(), this.quote.getUpperPriceRange())) {
                        Money lowerPriceRange = this.quote.getLowerPriceRange();
                        if (lowerPriceRange != null) {
                            str = Money.format$default(lowerPriceRange, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                        }
                    } else {
                        Money lowerPriceRange2 = this.quote.getLowerPriceRange();
                        String str = lowerPriceRange2 != null ? Money.format$default(lowerPriceRange2, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null;
                        Money upperPriceRange = this.quote.getUpperPriceRange();
                        str = str + " - " + (upperPriceRange != null ? Money.format$default(upperPriceRange, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
                    }
                } else if (this.quote.getEstimatedPrice() != null && (estimatedPrice = this.quote.getEstimatedPrice()) != null) {
                    str = Money.format$default(estimatedPrice, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                }
                return str == null ? "—" : str;
            }
        }

        /* compiled from: InstrumentDetailsStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode$PublicQuote;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$QuoteMode;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/models/db/Quote;)V", "getQuote", "()Lcom/robinhood/models/db/Quote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PublicQuote implements QuoteMode {
            private final Quote quote;

            public static /* synthetic */ PublicQuote copy$default(PublicQuote publicQuote, Quote quote, int i, Object obj) {
                if ((i & 1) != 0) {
                    quote = publicQuote.quote;
                }
                return publicQuote.copy(quote);
            }

            /* renamed from: component1, reason: from getter */
            public final Quote getQuote() {
                return this.quote;
            }

            public final PublicQuote copy(Quote quote) {
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new PublicQuote(quote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PublicQuote) && Intrinsics.areEqual(this.quote, ((PublicQuote) other).quote);
            }

            public int hashCode() {
                return this.quote.hashCode();
            }

            public String toString() {
                return "PublicQuote(quote=" + this.quote + ")";
            }

            public PublicQuote(Quote quote) {
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.quote = quote;
            }

            public final Quote getQuote() {
                return this.quote;
            }
        }
    }
}
