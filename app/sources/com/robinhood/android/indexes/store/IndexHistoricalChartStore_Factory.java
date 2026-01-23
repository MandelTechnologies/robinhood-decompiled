package com.robinhood.android.indexes.store;

import com.robinhood.android.charts.models.dao.IndexHistoricalChartDao;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.models.api.IndexBonfireApi;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChartStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "indexBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/models/api/IndexBonfireApi;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "chartDao", "Lcom/robinhood/android/charts/models/dao/IndexHistoricalChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-indexes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexHistoricalChartStore_Factory implements Factory<IndexHistoricalChartStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IndexHistoricalChartDao> chartDao;
    private final Provider<IndexBonfireApi> indexBonfireApi;
    private final Provider<IndexStore> indexStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final IndexHistoricalChartStore_Factory create(Provider<IndexBonfireApi> provider, Provider<IndexStore> provider2, Provider<IndexHistoricalChartDao> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final IndexHistoricalChartStore newInstance(IndexBonfireApi indexBonfireApi, IndexStore indexStore, IndexHistoricalChartDao indexHistoricalChartDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(indexBonfireApi, indexStore, indexHistoricalChartDao, storeBundle);
    }

    public IndexHistoricalChartStore_Factory(Provider<IndexBonfireApi> indexBonfireApi, Provider<IndexStore> indexStore, Provider<IndexHistoricalChartDao> chartDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(indexBonfireApi, "indexBonfireApi");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(chartDao, "chartDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.indexBonfireApi = indexBonfireApi;
        this.indexStore = indexStore;
        this.chartDao = chartDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IndexHistoricalChartStore get() {
        Companion companion = INSTANCE;
        IndexBonfireApi indexBonfireApi = this.indexBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(indexBonfireApi, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        IndexHistoricalChartDao indexHistoricalChartDao = this.chartDao.get();
        Intrinsics.checkNotNullExpressionValue(indexHistoricalChartDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(indexBonfireApi, indexStore, indexHistoricalChartDao, storeBundle);
    }

    /* compiled from: IndexHistoricalChartStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore_Factory;", "indexBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/models/api/IndexBonfireApi;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "chartDao", "Lcom/robinhood/android/charts/models/dao/IndexHistoricalChartDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "lib-store-indexes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexHistoricalChartStore_Factory create(Provider<IndexBonfireApi> indexBonfireApi, Provider<IndexStore> indexStore, Provider<IndexHistoricalChartDao> chartDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(indexBonfireApi, "indexBonfireApi");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(chartDao, "chartDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IndexHistoricalChartStore_Factory(indexBonfireApi, indexStore, chartDao, storeBundle);
        }

        @JvmStatic
        public final IndexHistoricalChartStore newInstance(IndexBonfireApi indexBonfireApi, IndexStore indexStore, IndexHistoricalChartDao chartDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(indexBonfireApi, "indexBonfireApi");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(chartDao, "chartDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IndexHistoricalChartStore(indexBonfireApi, indexStore, chartDao, storeBundle);
        }
    }
}
