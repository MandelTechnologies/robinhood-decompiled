package com.robinhood.android.indexes.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.dao.IndexFundamentalsDao;
import com.robinhood.android.indexes.models.api.IndexApi;
import com.robinhood.android.indexes.models.dao.IndexCloseValueDao;
import com.robinhood.android.indexes.models.dao.IndexDao;
import com.robinhood.android.indexes.models.dao.IndexValueDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/indexes/store/IndexStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/models/api/IndexApi;", "indexCloseValueDao", "Lcom/robinhood/android/indexes/models/dao/IndexCloseValueDao;", "indexDao", "Lcom/robinhood/android/indexes/models/dao/IndexDao;", "indexValueDao", "Lcom/robinhood/android/indexes/models/dao/IndexValueDao;", "indexFundamentalsDao", "Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-indexes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexStore_Factory implements Factory<IndexStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IndexApi> indexApi;
    private final Provider<IndexCloseValueDao> indexCloseValueDao;
    private final Provider<IndexDao> indexDao;
    private final Provider<IndexFundamentalsDao> indexFundamentalsDao;
    private final Provider<IndexValueDao> indexValueDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final IndexStore_Factory create(Provider<IndexApi> provider, Provider<IndexCloseValueDao> provider2, Provider<IndexDao> provider3, Provider<IndexValueDao> provider4, Provider<IndexFundamentalsDao> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final IndexStore newInstance(IndexApi indexApi, IndexCloseValueDao indexCloseValueDao, IndexDao indexDao, IndexValueDao indexValueDao, IndexFundamentalsDao indexFundamentalsDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(indexApi, indexCloseValueDao, indexDao, indexValueDao, indexFundamentalsDao, storeBundle);
    }

    public IndexStore_Factory(Provider<IndexApi> indexApi, Provider<IndexCloseValueDao> indexCloseValueDao, Provider<IndexDao> indexDao, Provider<IndexValueDao> indexValueDao, Provider<IndexFundamentalsDao> indexFundamentalsDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(indexApi, "indexApi");
        Intrinsics.checkNotNullParameter(indexCloseValueDao, "indexCloseValueDao");
        Intrinsics.checkNotNullParameter(indexDao, "indexDao");
        Intrinsics.checkNotNullParameter(indexValueDao, "indexValueDao");
        Intrinsics.checkNotNullParameter(indexFundamentalsDao, "indexFundamentalsDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.indexApi = indexApi;
        this.indexCloseValueDao = indexCloseValueDao;
        this.indexDao = indexDao;
        this.indexValueDao = indexValueDao;
        this.indexFundamentalsDao = indexFundamentalsDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public IndexStore get() {
        Companion companion = INSTANCE;
        IndexApi indexApi = this.indexApi.get();
        Intrinsics.checkNotNullExpressionValue(indexApi, "get(...)");
        IndexCloseValueDao indexCloseValueDao = this.indexCloseValueDao.get();
        Intrinsics.checkNotNullExpressionValue(indexCloseValueDao, "get(...)");
        IndexDao indexDao = this.indexDao.get();
        Intrinsics.checkNotNullExpressionValue(indexDao, "get(...)");
        IndexValueDao indexValueDao = this.indexValueDao.get();
        Intrinsics.checkNotNullExpressionValue(indexValueDao, "get(...)");
        IndexFundamentalsDao indexFundamentalsDao = this.indexFundamentalsDao.get();
        Intrinsics.checkNotNullExpressionValue(indexFundamentalsDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(indexApi, indexCloseValueDao, indexDao, indexValueDao, indexFundamentalsDao, storeBundle);
    }

    /* compiled from: IndexStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/indexes/store/IndexStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/store/IndexStore_Factory;", "indexApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/indexes/models/api/IndexApi;", "indexCloseValueDao", "Lcom/robinhood/android/indexes/models/dao/IndexCloseValueDao;", "indexDao", "Lcom/robinhood/android/indexes/models/dao/IndexDao;", "indexValueDao", "Lcom/robinhood/android/indexes/models/dao/IndexValueDao;", "indexFundamentalsDao", "Lcom/robinhood/android/indexes/dao/IndexFundamentalsDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/android/indexes/store/IndexStore;", "lib-store-indexes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexStore_Factory create(Provider<IndexApi> indexApi, Provider<IndexCloseValueDao> indexCloseValueDao, Provider<IndexDao> indexDao, Provider<IndexValueDao> indexValueDao, Provider<IndexFundamentalsDao> indexFundamentalsDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(indexApi, "indexApi");
            Intrinsics.checkNotNullParameter(indexCloseValueDao, "indexCloseValueDao");
            Intrinsics.checkNotNullParameter(indexDao, "indexDao");
            Intrinsics.checkNotNullParameter(indexValueDao, "indexValueDao");
            Intrinsics.checkNotNullParameter(indexFundamentalsDao, "indexFundamentalsDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IndexStore_Factory(indexApi, indexCloseValueDao, indexDao, indexValueDao, indexFundamentalsDao, storeBundle);
        }

        @JvmStatic
        public final IndexStore newInstance(IndexApi indexApi, IndexCloseValueDao indexCloseValueDao, IndexDao indexDao, IndexValueDao indexValueDao, IndexFundamentalsDao indexFundamentalsDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(indexApi, "indexApi");
            Intrinsics.checkNotNullParameter(indexCloseValueDao, "indexCloseValueDao");
            Intrinsics.checkNotNullParameter(indexDao, "indexDao");
            Intrinsics.checkNotNullParameter(indexValueDao, "indexValueDao");
            Intrinsics.checkNotNullParameter(indexFundamentalsDao, "indexFundamentalsDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new IndexStore(indexApi, indexCloseValueDao, indexDao, indexValueDao, indexFundamentalsDao, storeBundle);
        }
    }
}
