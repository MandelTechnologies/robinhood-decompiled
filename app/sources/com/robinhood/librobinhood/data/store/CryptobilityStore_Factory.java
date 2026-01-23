package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.dao.CryptobilityDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptobilityStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptobilityStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoAccountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptobilityDao", "Lcom/robinhood/models/crypto/dao/CryptobilityDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CryptobilityStore_Factory implements Factory<CryptobilityStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoBonfireApi> cryptoBonfireApi;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptobilityDao> cryptobilityDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptobilityStore_Factory create(Provider<CryptoAccountProvider> provider, Provider<CryptoBonfireApi> provider2, Provider<CryptoExperimentsStore> provider3, Provider<StoreBundle> provider4, Provider<CryptobilityDao> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptobilityStore newInstance(CryptoAccountProvider cryptoAccountProvider, CryptoBonfireApi cryptoBonfireApi, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle, CryptobilityDao cryptobilityDao) {
        return INSTANCE.newInstance(cryptoAccountProvider, cryptoBonfireApi, cryptoExperimentsStore, storeBundle, cryptobilityDao);
    }

    public CryptobilityStore_Factory(Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoBonfireApi> cryptoBonfireApi, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StoreBundle> storeBundle, Provider<CryptobilityDao> cryptobilityDao) {
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptobilityDao, "cryptobilityDao");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.storeBundle = storeBundle;
        this.cryptobilityDao = cryptobilityDao;
    }

    @Override // javax.inject.Provider
    public CryptobilityStore get() {
        Companion companion = INSTANCE;
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoBonfireApi cryptoBonfireApi = this.cryptoBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(cryptoBonfireApi, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CryptobilityDao cryptobilityDao = this.cryptobilityDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptobilityDao, "get(...)");
        return companion.newInstance(cryptoAccountProvider, cryptoBonfireApi, cryptoExperimentsStore, storeBundle, cryptobilityDao);
    }

    /* compiled from: CryptobilityStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptobilityStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptobilityStore_Factory;", "cryptoAccountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptobilityDao", "Lcom/robinhood/models/crypto/dao/CryptobilityDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptobilityStore_Factory create(Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoBonfireApi> cryptoBonfireApi, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<StoreBundle> storeBundle, Provider<CryptobilityDao> cryptobilityDao) {
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptobilityDao, "cryptobilityDao");
            return new CryptobilityStore_Factory(cryptoAccountProvider, cryptoBonfireApi, cryptoExperimentsStore, storeBundle, cryptobilityDao);
        }

        @JvmStatic
        public final CryptobilityStore newInstance(CryptoAccountProvider cryptoAccountProvider, CryptoBonfireApi cryptoBonfireApi, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle, CryptobilityDao cryptobilityDao) {
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptobilityDao, "cryptobilityDao");
            return new CryptobilityStore(cryptoAccountProvider, cryptoBonfireApi, cryptoExperimentsStore, storeBundle, cryptobilityDao);
        }
    }
}
