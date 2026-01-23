package com.robinhood.android.search.highlights.p249ui.market;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.api.ApiIndexHistoricalChartRequest;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartData;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.indexes.models.api.ApiIndexCloseDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexHistoricalChartStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.librobinhood.data.store.CryptoDescriptionStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import search_coprocessor.p542v1.AssetTypeDto;

/* compiled from: SearchHighlightMarketCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0003EFGB\u0081\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0006\u0010'\u001a\u00020(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J$\u0010/\u001a\u000200*\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:H\u0002J\u0014\u0010/\u001a\u000200*\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J&\u0010/\u001a\u000200*\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$InitialArgs;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexHistoricalChartStore", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "stockDetailHistoricalChartDataStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/arsenal/FuturesProductStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "bind", "Lkotlinx/coroutines/Job;", "queryFuturesContract", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$FuturesChartData;", "contractId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toHighlightChartData", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "toCryptoHighlightChartData", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote;", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;", "quote", "Lcom/robinhood/models/db/Quote;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;", "futuresQuote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "futuresClosePrice", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "FuturesChartData", "InitialArgs", "Companion", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightMarketCardDuxo extends BaseDuxo4<SearchHighlightMarketCardViewState> implements HasArgs<InitialArgs> {
    private final CryptoDescriptionStore cryptoDescriptionStore;
    private final CryptoHistoricalChartStore cryptoHistoricalChartStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CurrencyPairStore currencyPairStore;
    private final FuturesChartsServiceManager futuresChartsServiceManager;
    private final FuturesContractStore futuresContractStore;
    private final FuturesMarketDataStore futuresMarketDataStore;
    private final FuturesProductStore futuresProductStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final IndexHistoricalChartStore indexHistoricalChartStore;
    private final IndexStore indexStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;
    private final StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AssetTypeDto.values().length];
            try {
                iArr[AssetTypeDto.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetTypeDto.CRYPTOCURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetTypeDto.EQUITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssetTypeDto.FUTURES_PRODUCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AssetTypeDto.FUTURES_CONTRACT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AssetTypeDto.TYPE_UNSPECIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Direction.values().length];
            try {
                iArr2[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m3647m = "queryFuturesContract")
    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$queryFuturesContract$1 */
    static final class C279721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C279721(Continuation<? super C279721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SearchHighlightMarketCardDuxo.this.queryFuturesContract(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public InitialArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitialArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightMarketCardDuxo(QuoteStore quoteStore, IndexStore indexStore, IndexHistoricalChartStore indexHistoricalChartStore, CryptoQuoteStore cryptoQuoteStore, CurrencyPairStore currencyPairStore, CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoDescriptionStore cryptoDescriptionStore, StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, FuturesContractStore futuresContractStore, FuturesProductStore futuresProductStore, FuturesQuoteStore futuresQuoteStore, FuturesChartsServiceManager futuresChartsServiceManager, FuturesMarketDataStore futuresMarketDataStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SearchHighlightMarketCardViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(indexHistoricalChartStore, "indexHistoricalChartStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalChartStore, "cryptoHistoricalChartStore");
        Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
        Intrinsics.checkNotNullParameter(stockDetailHistoricalChartDataStore, "stockDetailHistoricalChartDataStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.quoteStore = quoteStore;
        this.indexStore = indexStore;
        this.indexHistoricalChartStore = indexHistoricalChartStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.currencyPairStore = currencyPairStore;
        this.cryptoHistoricalChartStore = cryptoHistoricalChartStore;
        this.cryptoDescriptionStore = cryptoDescriptionStore;
        this.stockDetailHistoricalChartDataStore = stockDetailHistoricalChartDataStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresProductStore = futuresProductStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final Job bind() {
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        Companion companion = INSTANCE;
        UUID uuid = StringsKt.toUuid(((InitialArgs) companion.getArgs((HasArgs) this)).getUuid());
        switch (WhenMappings.$EnumSwitchMapping$0[((InitialArgs) companion.getArgs((HasArgs) this)).getAssetType().ordinal()]) {
            case 1:
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C279671(uuid, this, null), 2, null);
                return completableJobSupervisorJob$default;
            case 2:
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C279682(uuid, null), 2, null);
                return completableJobSupervisorJob$default;
            case 3:
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C279693(uuid, this, null), 2, null);
                return completableJobSupervisorJob$default;
            case 4:
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C279704(uuid, null), 2, null);
                return completableJobSupervisorJob$default;
            case 5:
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C279715(uuid, null), 2, null);
                return completableJobSupervisorJob$default;
            case 6:
                Unit unit = Unit.INSTANCE;
                return completableJobSupervisorJob$default;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1 */
    static final class C279671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $assetUuid;
        int label;
        final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279671(UUID uuid, SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super C279671> continuation) {
            super(2, continuation);
            this.$assetUuid = uuid;
            this.this$0 = searchHighlightMarketCardDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C279671(this.$assetUuid, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.this$0.indexStore.streamIndex(this.$assetUuid), this.this$0.indexHistoricalChartStore.streamNormalizedIndexHistoricalChartWithQuote(new ApiIndexHistoricalChartRequest(this.$assetUuid, DisplaySpan.DAY, boxing.boxBoolean(false))), this.this$0.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(this.$assetUuid)), this.this$0.indexStore.streamIndexCloseValue(new ApiIndexCloseDetailRequest.ApiIndexCloseRequestById(this.$assetUuid)), new AnonymousClass1(this.this$0, null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "historicalChart", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function5<Index, IndexHistoricalChartModel, IndexValue, IndexCloseValue, Continuation<? super SearchHighlightChartData>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ Object L$3;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(5, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Index index, IndexHistoricalChartModel indexHistoricalChartModel, IndexValue indexValue, IndexCloseValue indexCloseValue, Continuation<? super SearchHighlightChartData> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = index;
                anonymousClass1.L$1 = indexHistoricalChartModel;
                anonymousClass1.L$2 = indexValue;
                anonymousClass1.L$3 = indexCloseValue;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Index index = (Index) this.L$0;
                    return this.this$0.toHighlightChartData((IndexHistoricalChartModel) this.L$1, index, (IndexValue) this.L$2, (IndexCloseValue) this.L$3);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartData", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1$2", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SearchHighlightChartData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SearchHighlightChartData searchHighlightChartData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(searchHighlightChartData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightMarketCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1$2$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState>, Object> {
                final /* synthetic */ SearchHighlightChartData $chartData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SearchHighlightChartData searchHighlightChartData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chartData = searchHighlightChartData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartData, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightMarketCardViewState searchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState> continuation) {
                    return ((AnonymousClass1) create(searchHighlightMarketCardViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((SearchHighlightMarketCardViewState) this.L$0).copy(this.$chartData);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((SearchHighlightChartData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2 */
    static final class C279682 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $assetUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279682(UUID uuid, Continuation<? super C279682> continuation) {
            super(2, continuation);
            this.$assetUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightMarketCardDuxo.this.new C279682(this.$assetUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(SearchHighlightMarketCardDuxo.this.currencyPairStore.streamCurrencyPair(this.$assetUuid)), Integer.MAX_VALUE, null, 2, null), SearchHighlightMarketCardDuxo.this.cryptoDescriptionStore.getStreamCryptoDescription().asFlow(this.$assetUuid), SearchHighlightMarketCardDuxo.this.cryptoQuoteStore.getStreamCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(this.$assetUuid, null, null, 6, null)), new AnonymousClass1(SearchHighlightMarketCardDuxo.this, null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SearchHighlightMarketCardDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoDescription", "Lcom/robinhood/models/crypto/db/CryptoDescription;", "quote", "Lcom/robinhood/models/crypto/db/CryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<UiCurrencyPair, CryptoDescription, CryptoQuote, Continuation<? super SearchHighlightChartData>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(UiCurrencyPair uiCurrencyPair, CryptoDescription cryptoDescription, CryptoQuote cryptoQuote, Continuation<? super SearchHighlightChartData> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = uiCurrencyPair;
                anonymousClass1.L$1 = cryptoDescription;
                anonymousClass1.L$2 = cryptoQuote;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) this.L$0;
                    CryptoDescription cryptoDescription = (CryptoDescription) this.L$1;
                    return this.this$0.toCryptoHighlightChartData(new AssetQuote.Crypto((CryptoQuote) this.L$2, cryptoDescription, uiCurrencyPair.getAssetCurrency()));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartData", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2$2", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SearchHighlightChartData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SearchHighlightChartData searchHighlightChartData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(searchHighlightChartData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightMarketCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2$2$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState>, Object> {
                final /* synthetic */ SearchHighlightChartData $chartData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SearchHighlightChartData searchHighlightChartData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chartData = searchHighlightChartData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartData, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightMarketCardViewState searchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState> continuation) {
                    return ((AnonymousClass1) create(searchHighlightMarketCardViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((SearchHighlightMarketCardViewState) this.L$0).copy(this.$chartData);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((SearchHighlightChartData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {EnumC7081g.f2773x8d9721ad}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3 */
    static final class C279693 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $assetUuid;
        int label;
        final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279693(UUID uuid, SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super C279693> continuation) {
            super(2, continuation);
            this.$assetUuid = uuid;
            this.this$0 = searchHighlightMarketCardDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C279693(this.$assetUuid, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279693) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(FlowKt.filterNotNull(this.this$0.quoteStore.streamQuote(this.$assetUuid)), this.this$0.stockDetailHistoricalChartDataStore.streamStockDetailChartQuery(new StockDetailHistoricalChartDataStore.RequestParams(this.$assetUuid, DisplaySpan.DAY.getServerValue(), boxing.boxBoolean(false), boxing.boxBoolean(false), boxing.boxBoolean(true))), new AnonymousClass1(this.this$0, null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", "quote", "Lcom/robinhood/models/db/Quote;", "instrumentChart", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Quote, SduiInstrumentChart, Continuation<? super SearchHighlightChartData>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Quote quote, SduiInstrumentChart sduiInstrumentChart, Continuation<? super SearchHighlightChartData> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = quote;
                anonymousClass1.L$1 = sduiInstrumentChart;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Quote quote = (Quote) this.L$0;
                    return this.this$0.toHighlightChartData((SduiInstrumentChart) this.L$1, quote);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartData", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3$2", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SearchHighlightChartData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SearchHighlightChartData searchHighlightChartData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(searchHighlightChartData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightMarketCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3$2$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState>, Object> {
                final /* synthetic */ SearchHighlightChartData $chartData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SearchHighlightChartData searchHighlightChartData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chartData = searchHighlightChartData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartData, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightMarketCardViewState searchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState> continuation) {
                    return ((AnonymousClass1) create(searchHighlightMarketCardViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((SearchHighlightMarketCardViewState) this.L$0).copy(this.$chartData);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((SearchHighlightChartData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4 */
    static final class C279704 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $assetUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279704(UUID uuid, Continuation<? super C279704> continuation) {
            super(2, continuation);
            this.$assetUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightMarketCardDuxo.this.new C279704(this.$assetUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279704) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<FuturesProduct> flowStreamFuturesProduct = SearchHighlightMarketCardDuxo.this.futuresProductStore.streamFuturesProduct(this.$assetUuid);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Flow<UUID>() { // from class: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamFuturesProduct.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                UUID activeFuturesContractId = ((FuturesProduct) obj).getActiveFuturesContractId();
                                if (activeFuturesContractId != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(activeFuturesContractId, anonymousClass1) == coroutine_suspended) {
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
                }, new C27965x991edb4d(null, SearchHighlightMarketCardDuxo.this)));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(SearchHighlightMarketCardDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$FuturesChartData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$3", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FuturesChartData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesChartData futuresChartData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(futuresChartData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightMarketCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$3$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState>, Object> {
                final /* synthetic */ FuturesChartData $data;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, FuturesChartData futuresChartData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = searchHighlightMarketCardDuxo;
                    this.$data = futuresChartData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$data, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightMarketCardViewState searchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState> continuation) {
                    return ((AnonymousClass1) create(searchHighlightMarketCardViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SearchHighlightMarketCardViewState searchHighlightMarketCardViewState = (SearchHighlightMarketCardViewState) this.L$0;
                    SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo = this.this$0;
                    Object objM18638getChartResultd1pmJ48 = this.$data.m18638getChartResultd1pmJ48();
                    if (Result.m28555isFailureimpl(objM18638getChartResultd1pmJ48)) {
                        objM18638getChartResultd1pmJ48 = null;
                    }
                    return searchHighlightMarketCardViewState.copy(searchHighlightMarketCardDuxo.toHighlightChartData((FuturesChartResult) objM18638getChartResultd1pmJ48, this.$data.getQuote(), this.$data.getClosePrice(), this.$data.getFutureContract()));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FuturesChartData futuresChartData = (FuturesChartData) this.L$0;
                SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo = this.this$0;
                searchHighlightMarketCardDuxo.applyMutation(new AnonymousClass1(searchHighlightMarketCardDuxo, futuresChartData, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$5", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$5 */
    static final class C279715 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $assetUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C279715(UUID uuid, Continuation<? super C279715> continuation) {
            super(2, continuation);
            this.$assetUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchHighlightMarketCardDuxo.this.new C279715(this.$assetUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C279715) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo = SearchHighlightMarketCardDuxo.this;
                UUID uuid = this.$assetUuid;
                this.label = 1;
                obj = searchHighlightMarketCardDuxo.queryFuturesContract(uuid, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged((Flow) obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchHighlightMarketCardDuxo.this, null);
            this.label = 2;
        }

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$FuturesChartData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$5$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesChartData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchHighlightMarketCardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesChartData futuresChartData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(futuresChartData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchHighlightMarketCardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$5$1$1", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$bind$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505291 extends ContinuationImpl7 implements Function2<SearchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState>, Object> {
                final /* synthetic */ FuturesChartData $data;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchHighlightMarketCardDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505291(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo, FuturesChartData futuresChartData, Continuation<? super C505291> continuation) {
                    super(2, continuation);
                    this.this$0 = searchHighlightMarketCardDuxo;
                    this.$data = futuresChartData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505291 c505291 = new C505291(this.this$0, this.$data, continuation);
                    c505291.L$0 = obj;
                    return c505291;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightMarketCardViewState searchHighlightMarketCardViewState, Continuation<? super SearchHighlightMarketCardViewState> continuation) {
                    return ((C505291) create(searchHighlightMarketCardViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SearchHighlightMarketCardViewState searchHighlightMarketCardViewState = (SearchHighlightMarketCardViewState) this.L$0;
                    SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo = this.this$0;
                    Object objM18638getChartResultd1pmJ48 = this.$data.m18638getChartResultd1pmJ48();
                    if (Result.m28555isFailureimpl(objM18638getChartResultd1pmJ48)) {
                        objM18638getChartResultd1pmJ48 = null;
                    }
                    return searchHighlightMarketCardViewState.copy(searchHighlightMarketCardDuxo.toHighlightChartData((FuturesChartResult) objM18638getChartResultd1pmJ48, this.$data.getQuote(), this.$data.getClosePrice(), this.$data.getFutureContract()));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FuturesChartData futuresChartData = (FuturesChartData) this.L$0;
                SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo = this.this$0;
                searchHighlightMarketCardDuxo.applyMutation(new C505291(searchHighlightMarketCardDuxo, futuresChartData, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queryFuturesContract(UUID uuid, Continuation<? super Flow<FuturesChartData>> continuation) {
        C279721 c279721;
        Flow flow;
        Flow flow2;
        Flow flow3;
        if (continuation instanceof C279721) {
            c279721 = (C279721) continuation;
            int i = c279721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c279721.label = i - Integer.MIN_VALUE;
            } else {
                c279721 = new C279721(continuation);
            }
        }
        C279721 c2797212 = c279721;
        Object obj = c2797212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2797212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.futuresQuoteStore.getQuote(uuid, MarketdataPollLocation.SEARCH_HIGHLIGHTS));
            Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(this.futuresMarketDataStore.getClosePrices(uuid));
            Flow flowDistinctUntilChanged3 = FlowKt.distinctUntilChanged(this.futuresContractStore.streamFuturesContract(uuid));
            FuturesChartsServiceManager futuresChartsServiceManager = this.futuresChartsServiceManager;
            DisplaySpan displaySpan = DisplaySpan.DAY;
            ChartType chartType = ChartType.LINE;
            c2797212.L$0 = flowDistinctUntilChanged;
            c2797212.L$1 = flowDistinctUntilChanged2;
            c2797212.L$2 = flowDistinctUntilChanged3;
            c2797212.label = 1;
            Object objStreamFuturesChartResult = futuresChartsServiceManager.streamFuturesChartResult(uuid, displaySpan, chartType, true, true, c2797212);
            if (objStreamFuturesChartResult == coroutine_suspended) {
                return coroutine_suspended;
            }
            flow = flowDistinctUntilChanged;
            flow2 = flowDistinctUntilChanged2;
            obj = objStreamFuturesChartResult;
            flow3 = flowDistinctUntilChanged3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flow3 = (Flow) c2797212.L$2;
            flow2 = (Flow) c2797212.L$1;
            flow = (Flow) c2797212.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return FlowKt.combine(flow, flow2, FlowKt.distinctUntilChanged((Flow) obj), flow3, new C279732(null));
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$FuturesChartData;", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE, "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "chartResult", "Lkotlin/Result;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;", "futureContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$queryFuturesContract$2", m3645f = "SearchHighlightMarketCardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.market.SearchHighlightMarketCardDuxo$queryFuturesContract$2 */
    static final class C279732 extends ContinuationImpl7 implements Function5<FuturesQuote, FuturesClosePrices, Result<? extends FuturesChartResult>, FuturesContract, Continuation<? super FuturesChartData>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;

        C279732(Continuation<? super C279732> continuation) {
            super(5, continuation);
        }

        public final Object invoke(FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, Object obj, FuturesContract futuresContract, Continuation<? super FuturesChartData> continuation) {
            C279732 c279732 = new C279732(continuation);
            c279732.L$0 = futuresQuote;
            c279732.L$1 = futuresClosePrices;
            c279732.L$2 = Result.m28549boximpl(obj);
            c279732.L$3 = futuresContract;
            return c279732.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, Result<? extends FuturesChartResult> result, FuturesContract futuresContract, Continuation<? super FuturesChartData> continuation) {
            return invoke(futuresQuote, futuresClosePrices, result.getValue(), futuresContract, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new FuturesChartData((FuturesQuote) this.L$0, (FuturesClosePrices) this.L$1, ((Result) this.L$2).getValue(), (FuturesContract) this.L$3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$FuturesChartData;", "", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE, "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "chartResult", "Lkotlin/Result;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;", "futureContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "<init>", "(Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;Ljava/lang/Object;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;)V", "getQuote", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "getClosePrice", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "getChartResult-d1pmJ48", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFutureContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "component1", "component2", "component3", "component3-d1pmJ48", "component4", "copy", "(Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;Ljava/lang/Object;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;)Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$FuturesChartData;", "equals", "", "other", "hashCode", "", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class FuturesChartData {
        private final Object chartResult;
        private final FuturesClosePrices closePrice;
        private final FuturesContract futureContract;
        private final FuturesQuote quote;

        public static /* synthetic */ FuturesChartData copy$default(FuturesChartData futuresChartData, FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, Result result, FuturesContract futuresContract, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresQuote = futuresChartData.quote;
            }
            if ((i & 2) != 0) {
                futuresClosePrices = futuresChartData.closePrice;
            }
            if ((i & 4) != 0) {
                result = Result.m28549boximpl(futuresChartData.chartResult);
            }
            if ((i & 8) != 0) {
                futuresContract = futuresChartData.futureContract;
            }
            return futuresChartData.copy(futuresQuote, futuresClosePrices, result.getValue(), futuresContract);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesQuote getQuote() {
            return this.quote;
        }

        /* renamed from: component2, reason: from getter */
        public final FuturesClosePrices getClosePrice() {
            return this.closePrice;
        }

        /* renamed from: component3-d1pmJ48, reason: not valid java name and from getter */
        public final Object getChartResult() {
            return this.chartResult;
        }

        /* renamed from: component4, reason: from getter */
        public final FuturesContract getFutureContract() {
            return this.futureContract;
        }

        public final FuturesChartData copy(FuturesQuote quote, FuturesClosePrices closePrice, Object chartResult, FuturesContract futureContract) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(closePrice, "closePrice");
            Intrinsics.checkNotNullParameter(futureContract, "futureContract");
            return new FuturesChartData(quote, closePrice, chartResult, futureContract);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FuturesChartData)) {
                return false;
            }
            FuturesChartData futuresChartData = (FuturesChartData) other;
            return Intrinsics.areEqual(this.quote, futuresChartData.quote) && Intrinsics.areEqual(this.closePrice, futuresChartData.closePrice) && Result.m28552equalsimpl0(this.chartResult, futuresChartData.chartResult) && Intrinsics.areEqual(this.futureContract, futuresChartData.futureContract);
        }

        public int hashCode() {
            return (((((this.quote.hashCode() * 31) + this.closePrice.hashCode()) * 31) + Result.m28554hashCodeimpl(this.chartResult)) * 31) + this.futureContract.hashCode();
        }

        public String toString() {
            return "FuturesChartData(quote=" + this.quote + ", closePrice=" + this.closePrice + ", chartResult=" + Result.m28557toStringimpl(this.chartResult) + ", futureContract=" + this.futureContract + ")";
        }

        public FuturesChartData(FuturesQuote quote, FuturesClosePrices closePrice, Object obj, FuturesContract futureContract) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(closePrice, "closePrice");
            Intrinsics.checkNotNullParameter(futureContract, "futureContract");
            this.quote = quote;
            this.closePrice = closePrice;
            this.chartResult = obj;
            this.futureContract = futureContract;
        }

        public final FuturesQuote getQuote() {
            return this.quote;
        }

        public final FuturesClosePrices getClosePrice() {
            return this.closePrice;
        }

        /* renamed from: getChartResult-d1pmJ48, reason: not valid java name */
        public final Object m18638getChartResultd1pmJ48() {
            return this.chartResult;
        }

        public final FuturesContract getFutureContract() {
            return this.futureContract;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHighlightChartData toHighlightChartData(IndexHistoricalChartModel indexHistoricalChartModel, Index index, IndexValue indexValue, IndexCloseValue indexCloseValue) {
        BentoTheme4 bentoTheme4;
        IndexHistoricalChartData chartData = indexHistoricalChartModel.getChartData();
        if (chartData == null) {
            return new SearchHighlightChartData(null, null, null, null, null, null, null, null, null, true, null, null, null, 7679, null);
        }
        CursorData defaultDisplay = chartData.getDefaultDisplay();
        String symbol = index.getSymbol();
        int i = WhenMappings.$EnumSwitchMapping$1[chartData.getPageDirection().ordinal()];
        if (i == 1) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        BentoTheme4 bentoTheme42 = bentoTheme4;
        ImmutableList immutableList = extensions2.toImmutableList(chartData.getChart().getLines());
        ImmutableList immutableList2 = extensions2.toImmutableList(chartData.getChart().getFills());
        Iterable overlays = chartData.getChart().getOverlays();
        if (overlays == null) {
            overlays = CollectionsKt.emptyList();
        }
        return new SearchHighlightChartData(symbol, null, null, defaultDisplay, bentoTheme42, immutableList, immutableList2, extensions2.toImmutableList(overlays), extensions2.toImmutableList(CollectionsKt.emptyList()), false, new AssetQuote.Index(indexValue, indexCloseValue), ((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getAssetType(), null, 4102, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHighlightChartData toCryptoHighlightChartData(AssetQuote assetQuote) {
        BentoTheme4 bentoTheme4;
        String displayName = assetQuote.getDisplayName();
        boolean isUp = assetQuote.getIsUp();
        if (isUp) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (isUp) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        return new SearchHighlightChartData(displayName, null, null, null, bentoTheme4, null, null, null, null, false, assetQuote, ((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getAssetType(), new OneDayMiniChartDetails(assetQuote.getId(), InstrumentType.CRYPTO), 494, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHighlightChartData toHighlightChartData(SduiInstrumentChart sduiInstrumentChart, Quote quote) {
        BentoTheme4 bentoTheme4;
        AssetQuote.Equity equity = new AssetQuote.Equity(quote, null, 2, null);
        CursorData defaultDisplay = sduiInstrumentChart.getDefaultDisplay();
        String symbol = quote.getSymbol();
        int i = WhenMappings.$EnumSwitchMapping$1[sduiInstrumentChart.getPageDirection().ordinal()];
        if (i == 1) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        return new SearchHighlightChartData(symbol, null, null, defaultDisplay, bentoTheme4, extensions2.toImmutableList(sduiInstrumentChart.getChart().getLines()), extensions2.toImmutableList(sduiInstrumentChart.getChart().getFills()), extensions2.toImmutableList(sduiInstrumentChart.getOverlays()), null, false, equity, ((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getAssetType(), null, 4102, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHighlightChartData toHighlightChartData(FuturesChartResult futuresChartResult, FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, FuturesContract futuresContract) {
        BentoTheme4 bentoTheme4;
        if (futuresChartResult == null) {
            return new SearchHighlightChartData(null, null, null, null, null, null, null, null, null, true, null, null, null, 7679, null);
        }
        Chart<Parcelable> chart = futuresChartResult.getChart();
        if (chart == null) {
            return new SearchHighlightChartData(null, null, null, null, null, null, null, null, null, true, null, null, null, 7679, null);
        }
        AssetQuote.Future future = new AssetQuote.Future(futuresQuote.getContractId(), futuresQuote, futuresClosePrices);
        String displaySymbol = futuresContract.getDisplaySymbol();
        if (futuresChartResult.isChartPositive()) {
            bentoTheme4 = BentoTheme4.POSITIVE;
        } else {
            bentoTheme4 = BentoTheme4.NEGATIVE;
        }
        return new SearchHighlightChartData(null, displaySymbol, null, null, bentoTheme4, extensions2.toImmutableList(chart.getLines()), extensions2.toImmutableList(chart.getFills()), extensions2.toImmutableList(CollectionsKt.emptyList()), null, false, future, ((InitialArgs) INSTANCE.getArgs((HasArgs) this)).getAssetType(), null, 4101, null);
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$InitialArgs;", "Landroid/os/Parcelable;", "uuid", "", "assetType", "Lsearch_coprocessor/v1/AssetTypeDto;", "<init>", "(Ljava/lang/String;Lsearch_coprocessor/v1/AssetTypeDto;)V", "getUuid", "()Ljava/lang/String;", "getAssetType", "()Lsearch_coprocessor/v1/AssetTypeDto;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitialArgs> CREATOR = new Creator();
        private final AssetTypeDto assetType;
        private final String uuid;

        /* compiled from: SearchHighlightMarketCardDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitialArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitialArgs(parcel.readString(), (AssetTypeDto) parcel.readParcelable(InitialArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitialArgs[] newArray(int i) {
                return new InitialArgs[i];
            }
        }

        public static /* synthetic */ InitialArgs copy$default(InitialArgs initialArgs, String str, AssetTypeDto assetTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initialArgs.uuid;
            }
            if ((i & 2) != 0) {
                assetTypeDto = initialArgs.assetType;
            }
            return initialArgs.copy(str, assetTypeDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component2, reason: from getter */
        public final AssetTypeDto getAssetType() {
            return this.assetType;
        }

        public final InitialArgs copy(String uuid, AssetTypeDto assetType) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            return new InitialArgs(uuid, assetType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitialArgs)) {
                return false;
            }
            InitialArgs initialArgs = (InitialArgs) other;
            return Intrinsics.areEqual(this.uuid, initialArgs.uuid) && this.assetType == initialArgs.assetType;
        }

        public int hashCode() {
            return (this.uuid.hashCode() * 31) + this.assetType.hashCode();
        }

        public String toString() {
            return "InitialArgs(uuid=" + this.uuid + ", assetType=" + this.assetType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.uuid);
            dest.writeParcelable(this.assetType, flags);
        }

        public InitialArgs(String uuid, AssetTypeDto assetType) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.uuid = uuid;
            this.assetType = assetType;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final AssetTypeDto getAssetType() {
            return this.assetType;
        }
    }

    /* compiled from: SearchHighlightMarketCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo;", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo$InitialArgs;", "<init>", "()V", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<SearchHighlightMarketCardDuxo, InitialArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitialArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitialArgs getArgs(SearchHighlightMarketCardDuxo searchHighlightMarketCardDuxo) {
            return (InitialArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, searchHighlightMarketCardDuxo);
        }
    }
}
