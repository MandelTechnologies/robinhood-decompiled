package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.dao.CryptoClawbackDao;
import com.robinhood.models.crypto.dao.CryptoClawbackDetailsDao;
import com.robinhood.models.crypto.dao.CurrencyDao;
import com.robinhood.models.crypto.dao.CurrencyPairDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoClawbackStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoClawbackStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoClawbackStore;", "nummus", "Ljavax/inject/Provider;", "Lcom/robinhood/models/api/retrofit/NummusApi;", "clawbackDao", "Lcom/robinhood/models/crypto/dao/CryptoClawbackDao;", "clawbackDetailsDao", "Lcom/robinhood/models/crypto/dao/CryptoClawbackDetailsDao;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "currencyPairDao", "Lcom/robinhood/models/crypto/dao/CurrencyPairDao;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoClawbackStore_Factory implements Factory<CryptoClawbackStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoClawbackDao> clawbackDao;
    private final Provider<CryptoClawbackDetailsDao> clawbackDetailsDao;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CurrencyDao> currencyDao;
    private final Provider<CurrencyPairDao> currencyPairDao;
    private final Provider<NummusApi> nummus;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoClawbackStore_Factory create(Provider<NummusApi> provider, Provider<CryptoClawbackDao> provider2, Provider<CryptoClawbackDetailsDao> provider3, Provider<CurrencyDao> provider4, Provider<CurrencyPairDao> provider5, Provider<CryptoExperimentsStore> provider6, Provider<StoreBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoClawbackStore newInstance(NummusApi nummusApi, CryptoClawbackDao cryptoClawbackDao, CryptoClawbackDetailsDao cryptoClawbackDetailsDao, CurrencyDao currencyDao, CurrencyPairDao currencyPairDao, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(nummusApi, cryptoClawbackDao, cryptoClawbackDetailsDao, currencyDao, currencyPairDao, cryptoExperimentsStore, storeBundle);
    }

    public CryptoClawbackStore_Factory(Provider<NummusApi> nummus2, Provider<CryptoClawbackDao> clawbackDao, Provider<CryptoClawbackDetailsDao> clawbackDetailsDao, Provider<CurrencyDao> currencyDao, Provider<CurrencyPairDao> currencyPairDao, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(clawbackDao, "clawbackDao");
        Intrinsics.checkNotNullParameter(clawbackDetailsDao, "clawbackDetailsDao");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummus = nummus2;
        this.clawbackDao = clawbackDao;
        this.clawbackDetailsDao = clawbackDetailsDao;
        this.currencyDao = currencyDao;
        this.currencyPairDao = currencyPairDao;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoClawbackStore get() {
        Companion companion = INSTANCE;
        NummusApi nummusApi = this.nummus.get();
        Intrinsics.checkNotNullExpressionValue(nummusApi, "get(...)");
        CryptoClawbackDao cryptoClawbackDao = this.clawbackDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoClawbackDao, "get(...)");
        CryptoClawbackDetailsDao cryptoClawbackDetailsDao = this.clawbackDetailsDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoClawbackDetailsDao, "get(...)");
        CurrencyDao currencyDao = this.currencyDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyDao, "get(...)");
        CurrencyPairDao currencyPairDao = this.currencyPairDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairDao, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(nummusApi, cryptoClawbackDao, cryptoClawbackDetailsDao, currencyDao, currencyPairDao, cryptoExperimentsStore, storeBundle);
    }

    /* compiled from: CryptoClawbackStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoClawbackStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoClawbackStore_Factory;", "nummus", "Ljavax/inject/Provider;", "Lcom/robinhood/models/api/retrofit/NummusApi;", "clawbackDao", "Lcom/robinhood/models/crypto/dao/CryptoClawbackDao;", "clawbackDetailsDao", "Lcom/robinhood/models/crypto/dao/CryptoClawbackDetailsDao;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "currencyPairDao", "Lcom/robinhood/models/crypto/dao/CurrencyPairDao;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoClawbackStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoClawbackStore_Factory create(Provider<NummusApi> nummus2, Provider<CryptoClawbackDao> clawbackDao, Provider<CryptoClawbackDetailsDao> clawbackDetailsDao, Provider<CurrencyDao> currencyDao, Provider<CurrencyPairDao> currencyPairDao, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            Intrinsics.checkNotNullParameter(clawbackDao, "clawbackDao");
            Intrinsics.checkNotNullParameter(clawbackDetailsDao, "clawbackDetailsDao");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoClawbackStore_Factory(nummus2, clawbackDao, clawbackDetailsDao, currencyDao, currencyPairDao, cryptoExperimentsStore, storeBundle);
        }

        @JvmStatic
        public final CryptoClawbackStore newInstance(NummusApi nummus2, CryptoClawbackDao clawbackDao, CryptoClawbackDetailsDao clawbackDetailsDao, CurrencyDao currencyDao, CurrencyPairDao currencyPairDao, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            Intrinsics.checkNotNullParameter(clawbackDao, "clawbackDao");
            Intrinsics.checkNotNullParameter(clawbackDetailsDao, "clawbackDetailsDao");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoClawbackStore(nummus2, clawbackDao, clawbackDetailsDao, currencyDao, currencyPairDao, cryptoExperimentsStore, storeBundle);
        }
    }
}
