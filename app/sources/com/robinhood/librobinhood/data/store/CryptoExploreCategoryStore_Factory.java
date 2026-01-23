package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.dao.CryptoExploreCategoryDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoExploreCategoryStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoExploreCategoryDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoExploreCategoryStore_Factory implements Factory<CryptoExploreCategoryStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoService> cryptoService;
    private final Provider<CryptoExploreCategoryDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoExploreCategoryStore_Factory create(Provider<StoreBundle> provider, Provider<CryptoService> provider2, Provider<CryptoExploreCategoryDao> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoExploreCategoryStore newInstance(StoreBundle storeBundle, CryptoService cryptoService, CryptoExploreCategoryDao cryptoExploreCategoryDao) {
        return INSTANCE.newInstance(storeBundle, cryptoService, cryptoExploreCategoryDao);
    }

    public CryptoExploreCategoryStore_Factory(Provider<StoreBundle> storeBundle, Provider<CryptoService> cryptoService, Provider<CryptoExploreCategoryDao> dao) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.storeBundle = storeBundle;
        this.cryptoService = cryptoService;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public CryptoExploreCategoryStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        CryptoService cryptoService = this.cryptoService.get();
        Intrinsics.checkNotNullExpressionValue(cryptoService, "get(...)");
        CryptoExploreCategoryDao cryptoExploreCategoryDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExploreCategoryDao, "get(...)");
        return companion.newInstance(storeBundle, cryptoService, cryptoExploreCategoryDao);
    }

    /* compiled from: CryptoExploreCategoryStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoExploreCategoryDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoExploreCategoryStore_Factory create(Provider<StoreBundle> storeBundle, Provider<CryptoService> cryptoService, Provider<CryptoExploreCategoryDao> dao) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new CryptoExploreCategoryStore_Factory(storeBundle, cryptoService, dao);
        }

        @JvmStatic
        public final CryptoExploreCategoryStore newInstance(StoreBundle storeBundle, CryptoService cryptoService, CryptoExploreCategoryDao dao) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new CryptoExploreCategoryStore(storeBundle, cryptoService, dao);
        }
    }
}
