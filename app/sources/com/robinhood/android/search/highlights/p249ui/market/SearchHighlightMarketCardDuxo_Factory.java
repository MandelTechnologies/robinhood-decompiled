package com.robinhood.android.search.highlights.p249ui.market;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.indexes.store.IndexHistoricalChartStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoDescriptionStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchHighlightMarketCardDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BÙ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo;", "quoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexHistoricalChartStore", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "stockDetailHistoricalChartDataStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightMarketCardDuxo_Factory implements Factory<SearchHighlightMarketCardDuxo> {
    private final Provider<CryptoDescriptionStore> cryptoDescriptionStore;
    private final Provider<CryptoHistoricalChartStore> cryptoHistoricalChartStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<CurrencyPairStore> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FuturesChartsServiceManager> futuresChartsServiceManager;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<FuturesMarketDataStore> futuresMarketDataStore;
    private final Provider<FuturesProductStore> futuresProductStore;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<IndexHistoricalChartStore> indexHistoricalChartStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<StockDetailHistoricalChartDataStore> stockDetailHistoricalChartDataStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SearchHighlightMarketCardDuxo_Factory create(Provider<QuoteStore> provider, Provider<IndexStore> provider2, Provider<IndexHistoricalChartStore> provider3, Provider<CryptoQuoteStore> provider4, Provider<CurrencyPairStore> provider5, Provider<CryptoHistoricalChartStore> provider6, Provider<CryptoDescriptionStore> provider7, Provider<StockDetailHistoricalChartDataStore> provider8, Provider<FuturesContractStore> provider9, Provider<FuturesProductStore> provider10, Provider<FuturesQuoteStore> provider11, Provider<FuturesChartsServiceManager> provider12, Provider<FuturesMarketDataStore> provider13, Provider<DuxoBundle> provider14, Provider<SavedStateHandle> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final SearchHighlightMarketCardDuxo newInstance(QuoteStore quoteStore, IndexStore indexStore, IndexHistoricalChartStore indexHistoricalChartStore, CryptoQuoteStore cryptoQuoteStore, CurrencyPairStore currencyPairStore, CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoDescriptionStore cryptoDescriptionStore, StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, FuturesContractStore futuresContractStore, FuturesProductStore futuresProductStore, FuturesQuoteStore futuresQuoteStore, FuturesChartsServiceManager futuresChartsServiceManager, FuturesMarketDataStore futuresMarketDataStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(quoteStore, indexStore, indexHistoricalChartStore, cryptoQuoteStore, currencyPairStore, cryptoHistoricalChartStore, cryptoDescriptionStore, stockDetailHistoricalChartDataStore, futuresContractStore, futuresProductStore, futuresQuoteStore, futuresChartsServiceManager, futuresMarketDataStore, duxoBundle, savedStateHandle);
    }

    public SearchHighlightMarketCardDuxo_Factory(Provider<QuoteStore> quoteStore, Provider<IndexStore> indexStore, Provider<IndexHistoricalChartStore> indexHistoricalChartStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoHistoricalChartStore> cryptoHistoricalChartStore, Provider<CryptoDescriptionStore> cryptoDescriptionStore, Provider<StockDetailHistoricalChartDataStore> stockDetailHistoricalChartDataStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesProductStore> futuresProductStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
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
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public SearchHighlightMarketCardDuxo get() {
        Companion companion = INSTANCE;
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        IndexHistoricalChartStore indexHistoricalChartStore = this.indexHistoricalChartStore.get();
        Intrinsics.checkNotNullExpressionValue(indexHistoricalChartStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        CurrencyPairStore currencyPairStore = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        CryptoHistoricalChartStore cryptoHistoricalChartStore = this.cryptoHistoricalChartStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalChartStore, "get(...)");
        CryptoDescriptionStore cryptoDescriptionStore = this.cryptoDescriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDescriptionStore, "get(...)");
        StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore = this.stockDetailHistoricalChartDataStore.get();
        Intrinsics.checkNotNullExpressionValue(stockDetailHistoricalChartDataStore, "get(...)");
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        FuturesProductStore futuresProductStore = this.futuresProductStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresProductStore, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        FuturesChartsServiceManager futuresChartsServiceManager = this.futuresChartsServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresChartsServiceManager, "get(...)");
        FuturesMarketDataStore futuresMarketDataStore = this.futuresMarketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketDataStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(quoteStore, indexStore, indexHistoricalChartStore, cryptoQuoteStore, currencyPairStore, cryptoHistoricalChartStore, cryptoDescriptionStore, stockDetailHistoricalChartDataStore, futuresContractStore, futuresProductStore, futuresQuoteStore, futuresChartsServiceManager, futuresMarketDataStore, duxoBundle2, savedStateHandle);
    }

    /* compiled from: SearchHighlightMarketCardDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÚ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0007H\u0007J\u0080\u0001\u0010%\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo_Factory;", "quoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexHistoricalChartStore", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "cryptoHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "stockDetailHistoricalChartDataStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardDuxo;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SearchHighlightMarketCardDuxo_Factory create(Provider<QuoteStore> quoteStore, Provider<IndexStore> indexStore, Provider<IndexHistoricalChartStore> indexHistoricalChartStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<CurrencyPairStore> currencyPairStore, Provider<CryptoHistoricalChartStore> cryptoHistoricalChartStore, Provider<CryptoDescriptionStore> cryptoDescriptionStore, Provider<StockDetailHistoricalChartDataStore> stockDetailHistoricalChartDataStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesProductStore> futuresProductStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
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
            return new SearchHighlightMarketCardDuxo_Factory(quoteStore, indexStore, indexHistoricalChartStore, cryptoQuoteStore, currencyPairStore, cryptoHistoricalChartStore, cryptoDescriptionStore, stockDetailHistoricalChartDataStore, futuresContractStore, futuresProductStore, futuresQuoteStore, futuresChartsServiceManager, futuresMarketDataStore, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final SearchHighlightMarketCardDuxo newInstance(QuoteStore quoteStore, IndexStore indexStore, IndexHistoricalChartStore indexHistoricalChartStore, CryptoQuoteStore cryptoQuoteStore, CurrencyPairStore currencyPairStore, CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoDescriptionStore cryptoDescriptionStore, StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, FuturesContractStore futuresContractStore, FuturesProductStore futuresProductStore, FuturesQuoteStore futuresQuoteStore, FuturesChartsServiceManager futuresChartsServiceManager, FuturesMarketDataStore futuresMarketDataStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
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
            return new SearchHighlightMarketCardDuxo(quoteStore, indexStore, indexHistoricalChartStore, cryptoQuoteStore, currencyPairStore, cryptoHistoricalChartStore, cryptoDescriptionStore, stockDetailHistoricalChartDataStore, futuresContractStore, futuresProductStore, futuresQuoteStore, futuresChartsServiceManager, futuresMarketDataStore, duxoBundle, savedStateHandle);
        }
    }
}
