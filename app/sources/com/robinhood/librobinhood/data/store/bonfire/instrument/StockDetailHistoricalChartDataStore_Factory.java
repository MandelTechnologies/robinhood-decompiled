package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.dao.StockDetailHistoricalChartDataDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StockDetailHistoricalChartDataStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "historicalChartDataDao", "Lcom/robinhood/models/dao/StockDetailHistoricalChartDataDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class StockDetailHistoricalChartDataStore_Factory implements Factory<StockDetailHistoricalChartDataStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<StockDetailHistoricalChartDataDao> historicalChartDataDao;
    private final Provider<InstrumentsApi> instrumentsApi;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final StockDetailHistoricalChartDataStore_Factory create(Provider<InstrumentsApi> provider, Provider<QuoteStore> provider2, Provider<StockDetailHistoricalChartDataDao> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final StockDetailHistoricalChartDataStore newInstance(InstrumentsApi instrumentsApi, QuoteStore quoteStore, StockDetailHistoricalChartDataDao stockDetailHistoricalChartDataDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(instrumentsApi, quoteStore, stockDetailHistoricalChartDataDao, storeBundle);
    }

    public StockDetailHistoricalChartDataStore_Factory(Provider<InstrumentsApi> instrumentsApi, Provider<QuoteStore> quoteStore, Provider<StockDetailHistoricalChartDataDao> historicalChartDataDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(historicalChartDataDao, "historicalChartDataDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.instrumentsApi = instrumentsApi;
        this.quoteStore = quoteStore;
        this.historicalChartDataDao = historicalChartDataDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public StockDetailHistoricalChartDataStore get() {
        Companion companion = INSTANCE;
        InstrumentsApi instrumentsApi = this.instrumentsApi.get();
        Intrinsics.checkNotNullExpressionValue(instrumentsApi, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        StockDetailHistoricalChartDataDao stockDetailHistoricalChartDataDao = this.historicalChartDataDao.get();
        Intrinsics.checkNotNullExpressionValue(stockDetailHistoricalChartDataDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(instrumentsApi, quoteStore, stockDetailHistoricalChartDataDao, storeBundle);
    }

    /* compiled from: StockDetailHistoricalChartDataStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore_Factory;", "instrumentsApi", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "historicalChartDataDao", "Lcom/robinhood/models/dao/StockDetailHistoricalChartDataDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StockDetailHistoricalChartDataStore_Factory create(Provider<InstrumentsApi> instrumentsApi, Provider<QuoteStore> quoteStore, Provider<StockDetailHistoricalChartDataDao> historicalChartDataDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(historicalChartDataDao, "historicalChartDataDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new StockDetailHistoricalChartDataStore_Factory(instrumentsApi, quoteStore, historicalChartDataDao, storeBundle);
        }

        @JvmStatic
        public final StockDetailHistoricalChartDataStore newInstance(InstrumentsApi instrumentsApi, QuoteStore quoteStore, StockDetailHistoricalChartDataDao historicalChartDataDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(historicalChartDataDao, "historicalChartDataDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new StockDetailHistoricalChartDataStore(instrumentsApi, quoteStore, historicalChartDataDao, storeBundle);
        }
    }
}
