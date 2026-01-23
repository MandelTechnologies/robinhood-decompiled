package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.CryptoStakingBonfireApi;
import com.robinhood.models.crypto.dao.CryptoStakingHistoryItemDao;
import com.robinhood.models.crypto.dao.CryptoStakingOverviewDao;
import com.robinhood.models.crypto.dao.CryptoStakingPositionDao;
import com.robinhood.models.crypto.dao.CryptoStakingSummaryModelDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoStakingStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "cryptoStakingOverviewDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingOverviewDao;", "cryptoStakingSummaryModelDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingSummaryModelDao;", "cryptoStakingBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoStakingBonfireApi;", "historyItemDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingHistoryItemDao;", "positionDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingPositionDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoStakingStore_Factory implements Factory<CryptoStakingStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoStakingBonfireApi> cryptoStakingBonfireApi;
    private final Provider<CryptoStakingOverviewDao> cryptoStakingOverviewDao;
    private final Provider<CryptoStakingSummaryModelDao> cryptoStakingSummaryModelDao;
    private final Provider<CryptoStakingHistoryItemDao> historyItemDao;
    private final Provider<CryptoStakingPositionDao> positionDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoStakingStore_Factory create(Provider<StoreBundle> provider, Provider<CryptoStakingOverviewDao> provider2, Provider<CryptoStakingSummaryModelDao> provider3, Provider<CryptoStakingBonfireApi> provider4, Provider<CryptoStakingHistoryItemDao> provider5, Provider<CryptoStakingPositionDao> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoStakingStore newInstance(StoreBundle storeBundle, CryptoStakingOverviewDao cryptoStakingOverviewDao, CryptoStakingSummaryModelDao cryptoStakingSummaryModelDao, CryptoStakingBonfireApi cryptoStakingBonfireApi, CryptoStakingHistoryItemDao cryptoStakingHistoryItemDao, CryptoStakingPositionDao cryptoStakingPositionDao) {
        return INSTANCE.newInstance(storeBundle, cryptoStakingOverviewDao, cryptoStakingSummaryModelDao, cryptoStakingBonfireApi, cryptoStakingHistoryItemDao, cryptoStakingPositionDao);
    }

    public CryptoStakingStore_Factory(Provider<StoreBundle> storeBundle, Provider<CryptoStakingOverviewDao> cryptoStakingOverviewDao, Provider<CryptoStakingSummaryModelDao> cryptoStakingSummaryModelDao, Provider<CryptoStakingBonfireApi> cryptoStakingBonfireApi, Provider<CryptoStakingHistoryItemDao> historyItemDao, Provider<CryptoStakingPositionDao> positionDao) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoStakingOverviewDao, "cryptoStakingOverviewDao");
        Intrinsics.checkNotNullParameter(cryptoStakingSummaryModelDao, "cryptoStakingSummaryModelDao");
        Intrinsics.checkNotNullParameter(cryptoStakingBonfireApi, "cryptoStakingBonfireApi");
        Intrinsics.checkNotNullParameter(historyItemDao, "historyItemDao");
        Intrinsics.checkNotNullParameter(positionDao, "positionDao");
        this.storeBundle = storeBundle;
        this.cryptoStakingOverviewDao = cryptoStakingOverviewDao;
        this.cryptoStakingSummaryModelDao = cryptoStakingSummaryModelDao;
        this.cryptoStakingBonfireApi = cryptoStakingBonfireApi;
        this.historyItemDao = historyItemDao;
        this.positionDao = positionDao;
    }

    @Override // javax.inject.Provider
    public CryptoStakingStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CryptoStakingOverviewDao cryptoStakingOverviewDao = this.cryptoStakingOverviewDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingOverviewDao, "get(...)");
        CryptoStakingSummaryModelDao cryptoStakingSummaryModelDao = this.cryptoStakingSummaryModelDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingSummaryModelDao, "get(...)");
        CryptoStakingBonfireApi cryptoStakingBonfireApi = this.cryptoStakingBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingBonfireApi, "get(...)");
        CryptoStakingHistoryItemDao cryptoStakingHistoryItemDao = this.historyItemDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingHistoryItemDao, "get(...)");
        CryptoStakingPositionDao cryptoStakingPositionDao = this.positionDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingPositionDao, "get(...)");
        return companion.newInstance(storeBundle, cryptoStakingOverviewDao, cryptoStakingSummaryModelDao, cryptoStakingBonfireApi, cryptoStakingHistoryItemDao, cryptoStakingPositionDao);
    }

    /* compiled from: CryptoStakingStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoStakingStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "cryptoStakingOverviewDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingOverviewDao;", "cryptoStakingSummaryModelDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingSummaryModelDao;", "cryptoStakingBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoStakingBonfireApi;", "historyItemDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingHistoryItemDao;", "positionDao", "Lcom/robinhood/models/crypto/dao/CryptoStakingPositionDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoStakingStore_Factory create(Provider<StoreBundle> storeBundle, Provider<CryptoStakingOverviewDao> cryptoStakingOverviewDao, Provider<CryptoStakingSummaryModelDao> cryptoStakingSummaryModelDao, Provider<CryptoStakingBonfireApi> cryptoStakingBonfireApi, Provider<CryptoStakingHistoryItemDao> historyItemDao, Provider<CryptoStakingPositionDao> positionDao) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptoStakingOverviewDao, "cryptoStakingOverviewDao");
            Intrinsics.checkNotNullParameter(cryptoStakingSummaryModelDao, "cryptoStakingSummaryModelDao");
            Intrinsics.checkNotNullParameter(cryptoStakingBonfireApi, "cryptoStakingBonfireApi");
            Intrinsics.checkNotNullParameter(historyItemDao, "historyItemDao");
            Intrinsics.checkNotNullParameter(positionDao, "positionDao");
            return new CryptoStakingStore_Factory(storeBundle, cryptoStakingOverviewDao, cryptoStakingSummaryModelDao, cryptoStakingBonfireApi, historyItemDao, positionDao);
        }

        @JvmStatic
        public final CryptoStakingStore newInstance(StoreBundle storeBundle, CryptoStakingOverviewDao cryptoStakingOverviewDao, CryptoStakingSummaryModelDao cryptoStakingSummaryModelDao, CryptoStakingBonfireApi cryptoStakingBonfireApi, CryptoStakingHistoryItemDao historyItemDao, CryptoStakingPositionDao positionDao) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptoStakingOverviewDao, "cryptoStakingOverviewDao");
            Intrinsics.checkNotNullParameter(cryptoStakingSummaryModelDao, "cryptoStakingSummaryModelDao");
            Intrinsics.checkNotNullParameter(cryptoStakingBonfireApi, "cryptoStakingBonfireApi");
            Intrinsics.checkNotNullParameter(historyItemDao, "historyItemDao");
            Intrinsics.checkNotNullParameter(positionDao, "positionDao");
            return new CryptoStakingStore(storeBundle, cryptoStakingOverviewDao, cryptoStakingSummaryModelDao, cryptoStakingBonfireApi, historyItemDao, positionDao);
        }
    }
}
