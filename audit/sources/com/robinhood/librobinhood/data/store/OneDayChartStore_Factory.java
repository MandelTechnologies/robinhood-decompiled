package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.onedaycharts.api.InstrumentApi;
import com.robinhood.models.onedaycharts.dao.InstrumentOneDayChartDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OneDayChartStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0085\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OneDayChartStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/models/onedaycharts/api/InstrumentApi;", "instrumentApi", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/onedaycharts/dao/InstrumentOneDayChartDao;", "instrumentOneDayChartDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OneDayChartStore_Factory implements Factory<OneDayChartStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<CryptoQuoteStore> cryptoQuoteStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<InstrumentApi> instrumentApi;
    private final Provider<InstrumentOneDayChartDao> instrumentOneDayChartDao;
    private final Provider<MarketDataProxyStore> marketDataProxyStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OneDayChartStore_Factory create(Provider<IndexStore> provider, Provider<InstrumentApi> provider2, Provider<QuoteStore> provider3, Provider<CryptoQuoteStore> provider4, Provider<MarketDataProxyStore> provider5, Provider<ExperimentsStore> provider6, Provider<InstrumentOneDayChartDao> provider7, Provider<Clock> provider8, Provider<StoreBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final OneDayChartStore newInstance(IndexStore indexStore, InstrumentApi instrumentApi, QuoteStore quoteStore, CryptoQuoteStore cryptoQuoteStore, MarketDataProxyStore marketDataProxyStore, ExperimentsStore experimentsStore, InstrumentOneDayChartDao instrumentOneDayChartDao, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(indexStore, instrumentApi, quoteStore, cryptoQuoteStore, marketDataProxyStore, experimentsStore, instrumentOneDayChartDao, clock, storeBundle);
    }

    public OneDayChartStore_Factory(Provider<IndexStore> indexStore, Provider<InstrumentApi> instrumentApi, Provider<QuoteStore> quoteStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<MarketDataProxyStore> marketDataProxyStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentOneDayChartDao> instrumentOneDayChartDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
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
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OneDayChartStore get() {
        Companion companion = INSTANCE;
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        InstrumentApi instrumentApi = this.instrumentApi.get();
        Intrinsics.checkNotNullExpressionValue(instrumentApi, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoQuoteStore, "get(...)");
        MarketDataProxyStore marketDataProxyStore = this.marketDataProxyStore.get();
        Intrinsics.checkNotNullExpressionValue(marketDataProxyStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        InstrumentOneDayChartDao instrumentOneDayChartDao = this.instrumentOneDayChartDao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentOneDayChartDao, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(indexStore, instrumentApi, quoteStore, cryptoQuoteStore, marketDataProxyStore, experimentsStore, instrumentOneDayChartDao, clock, storeBundle);
    }

    /* compiled from: OneDayChartStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OneDayChartStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/models/onedaycharts/api/InstrumentApi;", "instrumentApi", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/models/onedaycharts/dao/InstrumentOneDayChartDao;", "instrumentOneDayChartDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/OneDayChartStore_Factory;", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "newInstance", "(Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/models/onedaycharts/api/InstrumentApi;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/models/onedaycharts/dao/InstrumentOneDayChartDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "lib-store-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OneDayChartStore_Factory create(Provider<IndexStore> indexStore, Provider<InstrumentApi> instrumentApi, Provider<QuoteStore> quoteStore, Provider<CryptoQuoteStore> cryptoQuoteStore, Provider<MarketDataProxyStore> marketDataProxyStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentOneDayChartDao> instrumentOneDayChartDao, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(instrumentApi, "instrumentApi");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentOneDayChartDao, "instrumentOneDayChartDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OneDayChartStore_Factory(indexStore, instrumentApi, quoteStore, cryptoQuoteStore, marketDataProxyStore, experimentsStore, instrumentOneDayChartDao, clock, storeBundle);
        }

        @JvmStatic
        public final OneDayChartStore newInstance(IndexStore indexStore, InstrumentApi instrumentApi, QuoteStore quoteStore, CryptoQuoteStore cryptoQuoteStore, MarketDataProxyStore marketDataProxyStore, ExperimentsStore experimentsStore, InstrumentOneDayChartDao instrumentOneDayChartDao, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(instrumentApi, "instrumentApi");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
            Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentOneDayChartDao, "instrumentOneDayChartDao");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OneDayChartStore(indexStore, instrumentApi, quoteStore, cryptoQuoteStore, marketDataProxyStore, experimentsStore, instrumentOneDayChartDao, clock, storeBundle);
        }
    }
}
