package com.robinhood.librobinhood.data.store;

import bff_crypto_trading.service.p018v1.BffCryptoTradingService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.dao.CryptoExploreStateDao;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoExploreStateStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "bffCryptoTradingApi", "Lbff_crypto_trading/service/v1/BffCryptoTradingService;", "cryptoExploreStateDao", "Lcom/robinhood/models/crypto/dao/CryptoExploreStateDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoExploreStateStore_Factory implements Factory<CryptoExploreStateStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<BffCryptoTradingService> bffCryptoTradingApi;
    private final Provider<CryptoExploreStateDao> cryptoExploreStateDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoExploreStateStore_Factory create(Provider<AuthManager> provider, Provider<BffCryptoTradingService> provider2, Provider<CryptoExploreStateDao> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoExploreStateStore newInstance(AuthManager authManager, BffCryptoTradingService bffCryptoTradingService, CryptoExploreStateDao cryptoExploreStateDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(authManager, bffCryptoTradingService, cryptoExploreStateDao, storeBundle);
    }

    public CryptoExploreStateStore_Factory(Provider<AuthManager> authManager, Provider<BffCryptoTradingService> bffCryptoTradingApi, Provider<CryptoExploreStateDao> cryptoExploreStateDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(bffCryptoTradingApi, "bffCryptoTradingApi");
        Intrinsics.checkNotNullParameter(cryptoExploreStateDao, "cryptoExploreStateDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.authManager = authManager;
        this.bffCryptoTradingApi = bffCryptoTradingApi;
        this.cryptoExploreStateDao = cryptoExploreStateDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoExploreStateStore get() {
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        BffCryptoTradingService bffCryptoTradingService = this.bffCryptoTradingApi.get();
        Intrinsics.checkNotNullExpressionValue(bffCryptoTradingService, "get(...)");
        CryptoExploreStateDao cryptoExploreStateDao = this.cryptoExploreStateDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExploreStateDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(authManager, bffCryptoTradingService, cryptoExploreStateDao, storeBundle);
    }

    /* compiled from: CryptoExploreStateStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore_Factory;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "bffCryptoTradingApi", "Lbff_crypto_trading/service/v1/BffCryptoTradingService;", "cryptoExploreStateDao", "Lcom/robinhood/models/crypto/dao/CryptoExploreStateDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoExploreStateStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoExploreStateStore_Factory create(Provider<AuthManager> authManager, Provider<BffCryptoTradingService> bffCryptoTradingApi, Provider<CryptoExploreStateDao> cryptoExploreStateDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(bffCryptoTradingApi, "bffCryptoTradingApi");
            Intrinsics.checkNotNullParameter(cryptoExploreStateDao, "cryptoExploreStateDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoExploreStateStore_Factory(authManager, bffCryptoTradingApi, cryptoExploreStateDao, storeBundle);
        }

        @JvmStatic
        public final CryptoExploreStateStore newInstance(AuthManager authManager, BffCryptoTradingService bffCryptoTradingApi, CryptoExploreStateDao cryptoExploreStateDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(bffCryptoTradingApi, "bffCryptoTradingApi");
            Intrinsics.checkNotNullParameter(cryptoExploreStateDao, "cryptoExploreStateDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoExploreStateStore(authManager, bffCryptoTradingApi, cryptoExploreStateDao, storeBundle);
        }
    }
}
