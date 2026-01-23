package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.dao.CryptoHoldingDao;
import com.robinhood.models.crypto.dao.CurrencyDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHoldingStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoHoldingDao", "Lcom/robinhood/models/crypto/dao/CryptoHoldingDao;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CryptoHoldingStore_Factory implements Factory<CryptoHoldingStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoHoldingDao> cryptoHoldingDao;
    private final Provider<CurrencyDao> currencyDao;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<NummusApi> nummus;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoHoldingStore_Factory create(Provider<StoreBundle> provider, Provider<CryptoAccountProvider> provider2, Provider<CryptoExperimentsStore> provider3, Provider<CryptoHoldingDao> provider4, Provider<CurrencyDao> provider5, Provider<CryptoAccountStore> provider6, Provider<NummusApi> provider7, Provider<CurrencyPairV2Store> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CryptoHoldingStore newInstance(StoreBundle storeBundle, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoHoldingDao cryptoHoldingDao, CurrencyDao currencyDao, CryptoAccountStore cryptoAccountStore, NummusApi nummusApi, CurrencyPairV2Store currencyPairV2Store) {
        return INSTANCE.newInstance(storeBundle, cryptoAccountProvider, cryptoExperimentsStore, cryptoHoldingDao, currencyDao, cryptoAccountStore, nummusApi, currencyPairV2Store);
    }

    public CryptoHoldingStore_Factory(Provider<StoreBundle> storeBundle, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHoldingDao> cryptoHoldingDao, Provider<CurrencyDao> currencyDao, Provider<CryptoAccountStore> cryptoAccountStore, Provider<NummusApi> nummus2, Provider<CurrencyPairV2Store> currencyPairStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingDao, "cryptoHoldingDao");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        this.storeBundle = storeBundle;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoHoldingDao = cryptoHoldingDao;
        this.currencyDao = currencyDao;
        this.cryptoAccountStore = cryptoAccountStore;
        this.nummus = nummus2;
        this.currencyPairStore = currencyPairStore;
    }

    @Override // javax.inject.Provider
    public CryptoHoldingStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoHoldingDao cryptoHoldingDao = this.cryptoHoldingDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingDao, "get(...)");
        CurrencyDao currencyDao = this.currencyDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyDao, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        NummusApi nummusApi = this.nummus.get();
        Intrinsics.checkNotNullExpressionValue(nummusApi, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        return companion.newInstance(storeBundle, cryptoAccountProvider, cryptoExperimentsStore, cryptoHoldingDao, currencyDao, cryptoAccountStore, nummusApi, currencyPairV2Store);
    }

    /* compiled from: CryptoHoldingStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoHoldingDao", "Lcom/robinhood/models/crypto/dao/CryptoHoldingDao;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHoldingStore_Factory create(Provider<StoreBundle> storeBundle, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHoldingDao> cryptoHoldingDao, Provider<CurrencyDao> currencyDao, Provider<CryptoAccountStore> cryptoAccountStore, Provider<NummusApi> nummus2, Provider<CurrencyPairV2Store> currencyPairStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoHoldingDao, "cryptoHoldingDao");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            return new CryptoHoldingStore_Factory(storeBundle, cryptoAccountProvider, cryptoExperimentsStore, cryptoHoldingDao, currencyDao, cryptoAccountStore, nummus2, currencyPairStore);
        }

        @JvmStatic
        public final CryptoHoldingStore newInstance(StoreBundle storeBundle, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoHoldingDao cryptoHoldingDao, CurrencyDao currencyDao, CryptoAccountStore cryptoAccountStore, NummusApi nummus2, CurrencyPairV2Store currencyPairStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoHoldingDao, "cryptoHoldingDao");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            return new CryptoHoldingStore(storeBundle, cryptoAccountProvider, cryptoExperimentsStore, cryptoHoldingDao, currencyDao, cryptoAccountStore, nummus2, currencyPairStore);
        }
    }
}
