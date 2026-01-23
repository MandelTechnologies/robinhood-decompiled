package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorAssetItemDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo;", "equityQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingMonitorAssetItemDuxo_Factory implements Factory<InvestingMonitorAssetDuxo> {
    private final Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<QuoteStore> equityQuoteStore;
    private final Provider<FuturesChartsServiceManager> futuresChartsServiceManager;
    private final Provider<FuturesMarketDataStore> futuresMarketDataStore;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<IndexStore> indexStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InvestingMonitorAssetItemDuxo_Factory create(Provider<QuoteStore> provider, Provider<CryptoQuoteStore> provider2, Provider<FuturesQuoteStore> provider3, Provider<FuturesMarketDataStore> provider4, Provider<FuturesChartsServiceManager> provider5, Provider<IndexStore> provider6, Provider<AggregateOptionStrategyQuoteStore> provider7, Provider<DuxoBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final InvestingMonitorAssetDuxo newInstance(QuoteStore quoteStore, CryptoQuoteStore cryptoQuoteStore, FuturesQuoteStore futuresQuoteStore, FuturesMarketDataStore futuresMarketDataStore, FuturesChartsServiceManager futuresChartsServiceManager, IndexStore indexStore, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(quoteStore, cryptoQuoteStore, futuresQuoteStore, futuresMarketDataStore, futuresChartsServiceManager, indexStore, aggregateOptionStrategyQuoteStore, duxoBundle);
    }

    public InvestingMonitorAssetItemDuxo_Factory(Provider<QuoteStore> equityQuoteStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<IndexStore> indexStore, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.equityQuoteStore = equityQuoteStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresMarketDataStore = futuresMarketDataStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.indexStore = indexStore;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public InvestingMonitorAssetDuxo get() {
        Companion companion = INSTANCE;
        QuoteStore quoteStore = this.equityQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        FuturesMarketDataStore futuresMarketDataStore = this.futuresMarketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketDataStore, "get(...)");
        FuturesChartsServiceManager futuresChartsServiceManager = this.futuresChartsServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresChartsServiceManager, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionStrategyQuoteStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(quoteStore, cryptoQuoteStore, futuresQuoteStore, futuresMarketDataStore, futuresChartsServiceManager, indexStore, aggregateOptionStrategyQuoteStore, duxoBundle);
    }

    /* compiled from: InvestingMonitorAssetItemDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo_Factory;", "equityQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/item/InvestingMonitorAssetItemDuxo;", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestingMonitorAssetItemDuxo_Factory create(Provider<QuoteStore> equityQuoteStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesMarketDataStore> futuresMarketDataStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<IndexStore> indexStore, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InvestingMonitorAssetItemDuxo_Factory(equityQuoteStore, cryptoQuoteStore, futuresQuoteStore, futuresMarketDataStore, futuresChartsServiceManager, indexStore, aggregateOptionStrategyQuoteStore, duxoBundle);
        }

        @JvmStatic
        public final InvestingMonitorAssetDuxo newInstance(QuoteStore equityQuoteStore, CryptoQuoteStore cryptoQuoteStore, FuturesQuoteStore futuresQuoteStore, FuturesMarketDataStore futuresMarketDataStore, FuturesChartsServiceManager futuresChartsServiceManager, IndexStore indexStore, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InvestingMonitorAssetDuxo(equityQuoteStore, cryptoQuoteStore, futuresQuoteStore, futuresMarketDataStore, futuresChartsServiceManager, indexStore, aggregateOptionStrategyQuoteStore, duxoBundle);
        }
    }
}
