package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.models.crypto.dao.CryptoFeeTierInfoDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoFeeTierStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "cryptoAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "nummusService", "Lnummus/v1/RestNummusService;", "cryptoFeeTierInfoDao", "Lcom/robinhood/models/crypto/dao/CryptoFeeTierInfoDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoFeeTierStore_Factory implements Factory<CryptoFeeTierStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoFeeTierInfoDao> cryptoFeeTierInfoDao;
    private final Provider<RestNummusService> nummusService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoFeeTierStore_Factory create(Provider<CryptoAccountStore> provider, Provider<RestNummusService> provider2, Provider<CryptoFeeTierInfoDao> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoFeeTierStore newInstance(CryptoAccountStore cryptoAccountStore, RestNummusService restNummusService, CryptoFeeTierInfoDao cryptoFeeTierInfoDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(cryptoAccountStore, restNummusService, cryptoFeeTierInfoDao, storeBundle);
    }

    public CryptoFeeTierStore_Factory(Provider<CryptoAccountStore> cryptoAccountStore, Provider<RestNummusService> nummusService, Provider<CryptoFeeTierInfoDao> cryptoFeeTierInfoDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(cryptoFeeTierInfoDao, "cryptoFeeTierInfoDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoAccountStore = cryptoAccountStore;
        this.nummusService = nummusService;
        this.cryptoFeeTierInfoDao = cryptoFeeTierInfoDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoFeeTierStore get() {
        Companion companion = INSTANCE;
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        RestNummusService restNummusService = this.nummusService.get();
        Intrinsics.checkNotNullExpressionValue(restNummusService, "get(...)");
        CryptoFeeTierInfoDao cryptoFeeTierInfoDao = this.cryptoFeeTierInfoDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierInfoDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(cryptoAccountStore, restNummusService, cryptoFeeTierInfoDao, storeBundle);
    }

    /* compiled from: CryptoFeeTierStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore_Factory;", "cryptoAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "nummusService", "Lnummus/v1/RestNummusService;", "cryptoFeeTierInfoDao", "Lcom/robinhood/models/crypto/dao/CryptoFeeTierInfoDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoFeeTierStore_Factory create(Provider<CryptoAccountStore> cryptoAccountStore, Provider<RestNummusService> nummusService, Provider<CryptoFeeTierInfoDao> cryptoFeeTierInfoDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(cryptoFeeTierInfoDao, "cryptoFeeTierInfoDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoFeeTierStore_Factory(cryptoAccountStore, nummusService, cryptoFeeTierInfoDao, storeBundle);
        }

        @JvmStatic
        public final CryptoFeeTierStore newInstance(CryptoAccountStore cryptoAccountStore, RestNummusService nummusService, CryptoFeeTierInfoDao cryptoFeeTierInfoDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(cryptoFeeTierInfoDao, "cryptoFeeTierInfoDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoFeeTierStore(cryptoAccountStore, nummusService, cryptoFeeTierInfoDao, storeBundle);
        }
    }
}
