package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDao;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.StoreBundle;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualContractStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "contractDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PerpetualContractStore_Factory implements Factory<PerpetualContractStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<PerpetualContractDao> contractDao;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<CryptoPerpetualsService> service;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final PerpetualContractStore_Factory create(Provider<StoreBundle> provider, Provider<AppType> provider2, Provider<CryptoPerpetualsService> provider3, Provider<PerpetualContractDao> provider4, Provider<RegionGateProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final PerpetualContractStore newInstance(StoreBundle storeBundle, AppType appType, CryptoPerpetualsService cryptoPerpetualsService, PerpetualContractDao perpetualContractDao, RegionGateProvider regionGateProvider) {
        return INSTANCE.newInstance(storeBundle, appType, cryptoPerpetualsService, perpetualContractDao, regionGateProvider);
    }

    public PerpetualContractStore_Factory(Provider<StoreBundle> storeBundle, Provider<AppType> appType, Provider<CryptoPerpetualsService> service, Provider<PerpetualContractDao> contractDao, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(contractDao, "contractDao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.storeBundle = storeBundle;
        this.appType = appType;
        this.service = service;
        this.contractDao = contractDao;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // javax.inject.Provider
    public PerpetualContractStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoPerpetualsService cryptoPerpetualsService = this.service.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPerpetualsService, "get(...)");
        PerpetualContractDao perpetualContractDao = this.contractDao.get();
        Intrinsics.checkNotNullExpressionValue(perpetualContractDao, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        return companion.newInstance(storeBundle, appType, cryptoPerpetualsService, perpetualContractDao, regionGateProvider);
    }

    /* compiled from: PerpetualContractStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "contractDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "newInstance", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PerpetualContractStore_Factory create(Provider<StoreBundle> storeBundle, Provider<AppType> appType, Provider<CryptoPerpetualsService> service, Provider<PerpetualContractDao> contractDao, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(contractDao, "contractDao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new PerpetualContractStore_Factory(storeBundle, appType, service, contractDao, regionGateProvider);
        }

        @JvmStatic
        public final PerpetualContractStore newInstance(StoreBundle storeBundle, AppType appType, CryptoPerpetualsService service, PerpetualContractDao contractDao, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(contractDao, "contractDao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new PerpetualContractStore(storeBundle, appType, service, contractDao, regionGateProvider);
        }
    }
}
