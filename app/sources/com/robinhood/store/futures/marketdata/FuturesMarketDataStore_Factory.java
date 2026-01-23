package com.robinhood.store.futures.marketdata;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.api.futures.FuturesManagedMarketdataApi;
import com.robinhood.android.lib.api.futures.FuturesMarketdataApi;
import com.robinhood.android.models.futures.marketdata.dao.FuturesClosePricesDao;
import com.robinhood.android.models.futures.marketdata.dao.FuturesClosesRangeDao;
import com.robinhood.android.models.futures.marketdata.dao.FuturesFundamentalsDao;
import com.robinhood.android.models.futures.marketdata.dao.FuturesHistoricalDao;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.targetbackend.TargetBackend;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesMarketDataStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresManagedMarketdataApi", "Lcom/robinhood/android/lib/api/futures/FuturesManagedMarketdataApi;", "futuresMarketdataApi", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "closePricesDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosePricesDao;", "closesRangeDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosesRangeDao;", "fundamentalsDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesFundamentalsDao;", "historicalDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesHistoricalDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesMarketDataStore_Factory implements Factory<FuturesMarketDataStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<FuturesClosePricesDao> closePricesDao;
    private final Provider<FuturesClosesRangeDao> closesRangeDao;
    private final Provider<FuturesFundamentalsDao> fundamentalsDao;
    private final Provider<FuturesManagedMarketdataApi> futuresManagedMarketdataApi;
    private final Provider<FuturesMarketdataApi> futuresMarketdataApi;
    private final Provider<FuturesProductStore> futuresProductStore;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<FuturesHistoricalDao> historicalDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final FuturesMarketDataStore_Factory create(Provider<TargetBackend> provider, Provider<FuturesProductStore> provider2, Provider<FuturesManagedMarketdataApi> provider3, Provider<FuturesMarketdataApi> provider4, Provider<FuturesQuoteStore> provider5, Provider<FuturesClosePricesDao> provider6, Provider<FuturesClosesRangeDao> provider7, Provider<FuturesFundamentalsDao> provider8, Provider<FuturesHistoricalDao> provider9, Provider<StoreBundle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final FuturesMarketDataStore newInstance(TargetBackend targetBackend, FuturesProductStore futuresProductStore, FuturesManagedMarketdataApi futuresManagedMarketdataApi, FuturesMarketdataApi futuresMarketdataApi, FuturesQuoteStore futuresQuoteStore, FuturesClosePricesDao futuresClosePricesDao, FuturesClosesRangeDao futuresClosesRangeDao, FuturesFundamentalsDao futuresFundamentalsDao, FuturesHistoricalDao futuresHistoricalDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(targetBackend, futuresProductStore, futuresManagedMarketdataApi, futuresMarketdataApi, futuresQuoteStore, futuresClosePricesDao, futuresClosesRangeDao, futuresFundamentalsDao, futuresHistoricalDao, storeBundle);
    }

    public FuturesMarketDataStore_Factory(Provider<TargetBackend> targetBackend, Provider<FuturesProductStore> futuresProductStore, Provider<FuturesManagedMarketdataApi> futuresManagedMarketdataApi, Provider<FuturesMarketdataApi> futuresMarketdataApi, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesClosePricesDao> closePricesDao, Provider<FuturesClosesRangeDao> closesRangeDao, Provider<FuturesFundamentalsDao> fundamentalsDao, Provider<FuturesHistoricalDao> historicalDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(futuresManagedMarketdataApi, "futuresManagedMarketdataApi");
        Intrinsics.checkNotNullParameter(futuresMarketdataApi, "futuresMarketdataApi");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(closePricesDao, "closePricesDao");
        Intrinsics.checkNotNullParameter(closesRangeDao, "closesRangeDao");
        Intrinsics.checkNotNullParameter(fundamentalsDao, "fundamentalsDao");
        Intrinsics.checkNotNullParameter(historicalDao, "historicalDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.targetBackend = targetBackend;
        this.futuresProductStore = futuresProductStore;
        this.futuresManagedMarketdataApi = futuresManagedMarketdataApi;
        this.futuresMarketdataApi = futuresMarketdataApi;
        this.futuresQuoteStore = futuresQuoteStore;
        this.closePricesDao = closePricesDao;
        this.closesRangeDao = closesRangeDao;
        this.fundamentalsDao = fundamentalsDao;
        this.historicalDao = historicalDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FuturesMarketDataStore get() {
        Companion companion = INSTANCE;
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        FuturesProductStore futuresProductStore = this.futuresProductStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresProductStore, "get(...)");
        FuturesManagedMarketdataApi futuresManagedMarketdataApi = this.futuresManagedMarketdataApi.get();
        Intrinsics.checkNotNullExpressionValue(futuresManagedMarketdataApi, "get(...)");
        FuturesMarketdataApi futuresMarketdataApi = this.futuresMarketdataApi.get();
        Intrinsics.checkNotNullExpressionValue(futuresMarketdataApi, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        FuturesClosePricesDao futuresClosePricesDao = this.closePricesDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresClosePricesDao, "get(...)");
        FuturesClosesRangeDao futuresClosesRangeDao = this.closesRangeDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresClosesRangeDao, "get(...)");
        FuturesFundamentalsDao futuresFundamentalsDao = this.fundamentalsDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresFundamentalsDao, "get(...)");
        FuturesHistoricalDao futuresHistoricalDao = this.historicalDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresHistoricalDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(targetBackend, futuresProductStore, futuresManagedMarketdataApi, futuresMarketdataApi, futuresQuoteStore, futuresClosePricesDao, futuresClosesRangeDao, futuresFundamentalsDao, futuresHistoricalDao, storeBundle);
    }

    /* compiled from: FuturesMarketDataStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore_Factory;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresManagedMarketdataApi", "Lcom/robinhood/android/lib/api/futures/FuturesManagedMarketdataApi;", "futuresMarketdataApi", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "closePricesDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosePricesDao;", "closesRangeDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosesRangeDao;", "fundamentalsDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesFundamentalsDao;", "historicalDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesHistoricalDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesMarketDataStore_Factory create(Provider<TargetBackend> targetBackend, Provider<FuturesProductStore> futuresProductStore, Provider<FuturesManagedMarketdataApi> futuresManagedMarketdataApi, Provider<FuturesMarketdataApi> futuresMarketdataApi, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesClosePricesDao> closePricesDao, Provider<FuturesClosesRangeDao> closesRangeDao, Provider<FuturesFundamentalsDao> fundamentalsDao, Provider<FuturesHistoricalDao> historicalDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
            Intrinsics.checkNotNullParameter(futuresManagedMarketdataApi, "futuresManagedMarketdataApi");
            Intrinsics.checkNotNullParameter(futuresMarketdataApi, "futuresMarketdataApi");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(closePricesDao, "closePricesDao");
            Intrinsics.checkNotNullParameter(closesRangeDao, "closesRangeDao");
            Intrinsics.checkNotNullParameter(fundamentalsDao, "fundamentalsDao");
            Intrinsics.checkNotNullParameter(historicalDao, "historicalDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesMarketDataStore_Factory(targetBackend, futuresProductStore, futuresManagedMarketdataApi, futuresMarketdataApi, futuresQuoteStore, closePricesDao, closesRangeDao, fundamentalsDao, historicalDao, storeBundle);
        }

        @JvmStatic
        public final FuturesMarketDataStore newInstance(TargetBackend targetBackend, FuturesProductStore futuresProductStore, FuturesManagedMarketdataApi futuresManagedMarketdataApi, FuturesMarketdataApi futuresMarketdataApi, FuturesQuoteStore futuresQuoteStore, FuturesClosePricesDao closePricesDao, FuturesClosesRangeDao closesRangeDao, FuturesFundamentalsDao fundamentalsDao, FuturesHistoricalDao historicalDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
            Intrinsics.checkNotNullParameter(futuresManagedMarketdataApi, "futuresManagedMarketdataApi");
            Intrinsics.checkNotNullParameter(futuresMarketdataApi, "futuresMarketdataApi");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(closePricesDao, "closePricesDao");
            Intrinsics.checkNotNullParameter(closesRangeDao, "closesRangeDao");
            Intrinsics.checkNotNullParameter(fundamentalsDao, "fundamentalsDao");
            Intrinsics.checkNotNullParameter(historicalDao, "historicalDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesMarketDataStore(targetBackend, futuresProductStore, futuresManagedMarketdataApi, futuresMarketdataApi, futuresQuoteStore, closePricesDao, closesRangeDao, fundamentalsDao, historicalDao, storeBundle);
        }
    }
}
