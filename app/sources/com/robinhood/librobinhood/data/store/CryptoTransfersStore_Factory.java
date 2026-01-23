package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import com.robinhood.models.crypto.dao.CryptoTransferAccountItemDao;
import com.robinhood.models.crypto.dao.CryptoTransferConfigDao;
import com.robinhood.models.crypto.dao.CryptoTransferHistoryItemDao;
import com.robinhood.models.crypto.dao.CryptoTransferLimitsDao;
import com.robinhood.models.crypto.dao.CryptoTransferOptionsDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransfersStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "accountDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferAccountItemDao;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoTransferConfigDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferConfigDao;", "cryptoTransfersApi", "Lcom/robinhood/models/api/retrofit/CryptoTransfersApi;", "historyItemsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferHistoryItemDao;", "limitsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferLimitsDao;", "transferOptionsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferOptionsDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CryptoTransfersStore_Factory implements Factory<CryptoTransfersStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoTransferAccountItemDao> accountDao;
    private final Provider<CryptoBonfireApi> cryptoBonfireApi;
    private final Provider<CryptoTransferConfigDao> cryptoTransferConfigDao;
    private final Provider<CryptoTransfersApi> cryptoTransfersApi;
    private final Provider<CryptoTransferHistoryItemDao> historyItemsDao;
    private final Provider<CryptoTransferLimitsDao> limitsDao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<CryptoTransferOptionsDao> transferOptionsDao;

    @JvmStatic
    public static final CryptoTransfersStore_Factory create(Provider<StoreBundle> provider, Provider<CryptoTransferAccountItemDao> provider2, Provider<CryptoBonfireApi> provider3, Provider<CryptoTransferConfigDao> provider4, Provider<CryptoTransfersApi> provider5, Provider<CryptoTransferHistoryItemDao> provider6, Provider<CryptoTransferLimitsDao> provider7, Provider<CryptoTransferOptionsDao> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CryptoTransfersStore newInstance(StoreBundle storeBundle, CryptoTransferAccountItemDao cryptoTransferAccountItemDao, CryptoBonfireApi cryptoBonfireApi, CryptoTransferConfigDao cryptoTransferConfigDao, CryptoTransfersApi cryptoTransfersApi, CryptoTransferHistoryItemDao cryptoTransferHistoryItemDao, CryptoTransferLimitsDao cryptoTransferLimitsDao, CryptoTransferOptionsDao cryptoTransferOptionsDao) {
        return INSTANCE.newInstance(storeBundle, cryptoTransferAccountItemDao, cryptoBonfireApi, cryptoTransferConfigDao, cryptoTransfersApi, cryptoTransferHistoryItemDao, cryptoTransferLimitsDao, cryptoTransferOptionsDao);
    }

    public CryptoTransfersStore_Factory(Provider<StoreBundle> storeBundle, Provider<CryptoTransferAccountItemDao> accountDao, Provider<CryptoBonfireApi> cryptoBonfireApi, Provider<CryptoTransferConfigDao> cryptoTransferConfigDao, Provider<CryptoTransfersApi> cryptoTransfersApi, Provider<CryptoTransferHistoryItemDao> historyItemsDao, Provider<CryptoTransferLimitsDao> limitsDao, Provider<CryptoTransferOptionsDao> transferOptionsDao) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountDao, "accountDao");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(cryptoTransferConfigDao, "cryptoTransferConfigDao");
        Intrinsics.checkNotNullParameter(cryptoTransfersApi, "cryptoTransfersApi");
        Intrinsics.checkNotNullParameter(historyItemsDao, "historyItemsDao");
        Intrinsics.checkNotNullParameter(limitsDao, "limitsDao");
        Intrinsics.checkNotNullParameter(transferOptionsDao, "transferOptionsDao");
        this.storeBundle = storeBundle;
        this.accountDao = accountDao;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.cryptoTransferConfigDao = cryptoTransferConfigDao;
        this.cryptoTransfersApi = cryptoTransfersApi;
        this.historyItemsDao = historyItemsDao;
        this.limitsDao = limitsDao;
        this.transferOptionsDao = transferOptionsDao;
    }

    @Override // javax.inject.Provider
    public CryptoTransfersStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CryptoTransferAccountItemDao cryptoTransferAccountItemDao = this.accountDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferAccountItemDao, "get(...)");
        CryptoBonfireApi cryptoBonfireApi = this.cryptoBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(cryptoBonfireApi, "get(...)");
        CryptoTransferConfigDao cryptoTransferConfigDao = this.cryptoTransferConfigDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferConfigDao, "get(...)");
        CryptoTransfersApi cryptoTransfersApi = this.cryptoTransfersApi.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersApi, "get(...)");
        CryptoTransferHistoryItemDao cryptoTransferHistoryItemDao = this.historyItemsDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferHistoryItemDao, "get(...)");
        CryptoTransferLimitsDao cryptoTransferLimitsDao = this.limitsDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferLimitsDao, "get(...)");
        CryptoTransferOptionsDao cryptoTransferOptionsDao = this.transferOptionsDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferOptionsDao, "get(...)");
        return companion.newInstance(storeBundle, cryptoTransferAccountItemDao, cryptoBonfireApi, cryptoTransferConfigDao, cryptoTransfersApi, cryptoTransferHistoryItemDao, cryptoTransferLimitsDao, cryptoTransferOptionsDao);
    }

    /* compiled from: CryptoTransfersStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "accountDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferAccountItemDao;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoTransferConfigDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferConfigDao;", "cryptoTransfersApi", "Lcom/robinhood/models/api/retrofit/CryptoTransfersApi;", "historyItemsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferHistoryItemDao;", "limitsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferLimitsDao;", "transferOptionsDao", "Lcom/robinhood/models/crypto/dao/CryptoTransferOptionsDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTransfersStore_Factory create(Provider<StoreBundle> storeBundle, Provider<CryptoTransferAccountItemDao> accountDao, Provider<CryptoBonfireApi> cryptoBonfireApi, Provider<CryptoTransferConfigDao> cryptoTransferConfigDao, Provider<CryptoTransfersApi> cryptoTransfersApi, Provider<CryptoTransferHistoryItemDao> historyItemsDao, Provider<CryptoTransferLimitsDao> limitsDao, Provider<CryptoTransferOptionsDao> transferOptionsDao) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(accountDao, "accountDao");
            Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
            Intrinsics.checkNotNullParameter(cryptoTransferConfigDao, "cryptoTransferConfigDao");
            Intrinsics.checkNotNullParameter(cryptoTransfersApi, "cryptoTransfersApi");
            Intrinsics.checkNotNullParameter(historyItemsDao, "historyItemsDao");
            Intrinsics.checkNotNullParameter(limitsDao, "limitsDao");
            Intrinsics.checkNotNullParameter(transferOptionsDao, "transferOptionsDao");
            return new CryptoTransfersStore_Factory(storeBundle, accountDao, cryptoBonfireApi, cryptoTransferConfigDao, cryptoTransfersApi, historyItemsDao, limitsDao, transferOptionsDao);
        }

        @JvmStatic
        public final CryptoTransfersStore newInstance(StoreBundle storeBundle, CryptoTransferAccountItemDao accountDao, CryptoBonfireApi cryptoBonfireApi, CryptoTransferConfigDao cryptoTransferConfigDao, CryptoTransfersApi cryptoTransfersApi, CryptoTransferHistoryItemDao historyItemsDao, CryptoTransferLimitsDao limitsDao, CryptoTransferOptionsDao transferOptionsDao) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(accountDao, "accountDao");
            Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
            Intrinsics.checkNotNullParameter(cryptoTransferConfigDao, "cryptoTransferConfigDao");
            Intrinsics.checkNotNullParameter(cryptoTransfersApi, "cryptoTransfersApi");
            Intrinsics.checkNotNullParameter(historyItemsDao, "historyItemsDao");
            Intrinsics.checkNotNullParameter(limitsDao, "limitsDao");
            Intrinsics.checkNotNullParameter(transferOptionsDao, "transferOptionsDao");
            return new CryptoTransfersStore(storeBundle, accountDao, cryptoBonfireApi, cryptoTransferConfigDao, cryptoTransfersApi, historyItemsDao, limitsDao, transferOptionsDao);
        }
    }
}
