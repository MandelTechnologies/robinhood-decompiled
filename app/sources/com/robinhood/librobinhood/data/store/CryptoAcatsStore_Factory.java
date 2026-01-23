package com.robinhood.librobinhood.data.store;

import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.dao.CryptoMigrationResultDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAcatsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoAcatsStore;", "cryptoService", "Ljavax/inject/Provider;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;", "cryptoMigrationResultDao", "Lcom/robinhood/models/crypto/dao/CryptoMigrationResultDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoAcatsStore_Factory implements Factory<CryptoAcatsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoMigrationResultDao> cryptoMigrationResultDao;
    private final Provider<CryptoService> cryptoService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoAcatsStore_Factory create(Provider<CryptoService> provider, Provider<CryptoMigrationResultDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoAcatsStore newInstance(CryptoService cryptoService, CryptoMigrationResultDao cryptoMigrationResultDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(cryptoService, cryptoMigrationResultDao, storeBundle);
    }

    public CryptoAcatsStore_Factory(Provider<CryptoService> cryptoService, Provider<CryptoMigrationResultDao> cryptoMigrationResultDao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(cryptoMigrationResultDao, "cryptoMigrationResultDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoService = cryptoService;
        this.cryptoMigrationResultDao = cryptoMigrationResultDao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoAcatsStore get() {
        Companion companion = INSTANCE;
        CryptoService cryptoService = this.cryptoService.get();
        Intrinsics.checkNotNullExpressionValue(cryptoService, "get(...)");
        CryptoMigrationResultDao cryptoMigrationResultDao = this.cryptoMigrationResultDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoMigrationResultDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(cryptoService, cryptoMigrationResultDao, storeBundle);
    }

    /* compiled from: CryptoAcatsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAcatsStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoAcatsStore_Factory;", "cryptoService", "Ljavax/inject/Provider;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;", "cryptoMigrationResultDao", "Lcom/robinhood/models/crypto/dao/CryptoMigrationResultDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoAcatsStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoAcatsStore_Factory create(Provider<CryptoService> cryptoService, Provider<CryptoMigrationResultDao> cryptoMigrationResultDao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
            Intrinsics.checkNotNullParameter(cryptoMigrationResultDao, "cryptoMigrationResultDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoAcatsStore_Factory(cryptoService, cryptoMigrationResultDao, storeBundle);
        }

        @JvmStatic
        public final CryptoAcatsStore newInstance(CryptoService cryptoService, CryptoMigrationResultDao cryptoMigrationResultDao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
            Intrinsics.checkNotNullParameter(cryptoMigrationResultDao, "cryptoMigrationResultDao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoAcatsStore(cryptoService, cryptoMigrationResultDao, storeBundle);
        }
    }
}
