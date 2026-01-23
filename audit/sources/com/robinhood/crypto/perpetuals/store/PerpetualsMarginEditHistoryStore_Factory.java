package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualMarginEditDao;
import com.robinhood.store.StoreBundle;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualsMarginEditHistoryStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "contractStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "dao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualMarginEditDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualAccountStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PerpetualsMarginEditHistoryStore_Factory implements Factory<PerpetualMarginEditHistoryStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PerpetualAccountStore> accountStore;
    private final Provider<PerpetualContractStore> contractStore;
    private final Provider<PerpetualMarginEditDao> dao;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<CryptoPerpetualsService> service;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final PerpetualsMarginEditHistoryStore_Factory create(Provider<StoreBundle> provider, Provider<PerpetualContractStore> provider2, Provider<CryptoPerpetualsService> provider3, Provider<PerpetualMarginEditDao> provider4, Provider<RegionGateProvider> provider5, Provider<PerpetualAccountStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final PerpetualMarginEditHistoryStore newInstance(StoreBundle storeBundle, PerpetualContractStore perpetualContractStore, CryptoPerpetualsService cryptoPerpetualsService, PerpetualMarginEditDao perpetualMarginEditDao, RegionGateProvider regionGateProvider, PerpetualAccountStore perpetualAccountStore) {
        return INSTANCE.newInstance(storeBundle, perpetualContractStore, cryptoPerpetualsService, perpetualMarginEditDao, regionGateProvider, perpetualAccountStore);
    }

    public PerpetualsMarginEditHistoryStore_Factory(Provider<StoreBundle> storeBundle, Provider<PerpetualContractStore> contractStore, Provider<CryptoPerpetualsService> service, Provider<PerpetualMarginEditDao> dao, Provider<RegionGateProvider> regionGateProvider, Provider<PerpetualAccountStore> accountStore) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(contractStore, "contractStore");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        this.storeBundle = storeBundle;
        this.contractStore = contractStore;
        this.service = service;
        this.dao = dao;
        this.regionGateProvider = regionGateProvider;
        this.accountStore = accountStore;
    }

    @Override // javax.inject.Provider
    public PerpetualMarginEditHistoryStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        PerpetualContractStore perpetualContractStore = this.contractStore.get();
        Intrinsics.checkNotNullExpressionValue(perpetualContractStore, "get(...)");
        CryptoPerpetualsService cryptoPerpetualsService = this.service.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPerpetualsService, "get(...)");
        PerpetualMarginEditDao perpetualMarginEditDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(perpetualMarginEditDao, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        PerpetualAccountStore perpetualAccountStore = this.accountStore.get();
        Intrinsics.checkNotNullExpressionValue(perpetualAccountStore, "get(...)");
        return companion.newInstance(storeBundle, perpetualContractStore, cryptoPerpetualsService, perpetualMarginEditDao, regionGateProvider, perpetualAccountStore);
    }

    /* compiled from: PerpetualsMarginEditHistoryStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "contractStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "dao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualMarginEditDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualAccountStore;", "newInstance", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore;", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PerpetualsMarginEditHistoryStore_Factory create(Provider<StoreBundle> storeBundle, Provider<PerpetualContractStore> contractStore, Provider<CryptoPerpetualsService> service, Provider<PerpetualMarginEditDao> dao, Provider<RegionGateProvider> regionGateProvider, Provider<PerpetualAccountStore> accountStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(contractStore, "contractStore");
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            return new PerpetualsMarginEditHistoryStore_Factory(storeBundle, contractStore, service, dao, regionGateProvider, accountStore);
        }

        @JvmStatic
        public final PerpetualMarginEditHistoryStore newInstance(StoreBundle storeBundle, PerpetualContractStore contractStore, CryptoPerpetualsService service, PerpetualMarginEditDao dao, RegionGateProvider regionGateProvider, PerpetualAccountStore accountStore) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(contractStore, "contractStore");
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            return new PerpetualMarginEditHistoryStore(storeBundle, contractStore, service, dao, regionGateProvider, accountStore);
        }
    }
}
