package com.robinhood.librobinhood.data.store.costbasis;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.dao.CryptoCostBasisDetailsDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoCostBasisStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "nummusService", "Ljavax/inject/Provider;", "Lnummus/v1/RestNummusService;", "costBasisDetailsDao", "Lcom/robinhood/models/crypto/dao/CryptoCostBasisDetailsDao;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoCostBasisStore_Factory implements Factory<CryptoCostBasisStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoCostBasisDetailsDao> costBasisDetailsDao;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<RestNummusService> nummusService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoCostBasisStore_Factory create(Provider<RestNummusService> provider, Provider<CryptoCostBasisDetailsDao> provider2, Provider<CurrencyPairV2Store> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoCostBasisStore newInstance(RestNummusService restNummusService, CryptoCostBasisDetailsDao cryptoCostBasisDetailsDao, CurrencyPairV2Store currencyPairV2Store, StoreBundle storeBundle) {
        return INSTANCE.newInstance(restNummusService, cryptoCostBasisDetailsDao, currencyPairV2Store, storeBundle);
    }

    public CryptoCostBasisStore_Factory(Provider<RestNummusService> nummusService, Provider<CryptoCostBasisDetailsDao> costBasisDetailsDao, Provider<CurrencyPairV2Store> currencyPairStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(costBasisDetailsDao, "costBasisDetailsDao");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummusService = nummusService;
        this.costBasisDetailsDao = costBasisDetailsDao;
        this.currencyPairStore = currencyPairStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoCostBasisStore get() {
        Companion companion = INSTANCE;
        RestNummusService restNummusService = this.nummusService.get();
        Intrinsics.checkNotNullExpressionValue(restNummusService, "get(...)");
        CryptoCostBasisDetailsDao cryptoCostBasisDetailsDao = this.costBasisDetailsDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCostBasisDetailsDao, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(restNummusService, cryptoCostBasisDetailsDao, currencyPairV2Store, storeBundle);
    }

    /* compiled from: CryptoCostBasisStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore_Factory;", "nummusService", "Ljavax/inject/Provider;", "Lnummus/v1/RestNummusService;", "costBasisDetailsDao", "Lcom/robinhood/models/crypto/dao/CryptoCostBasisDetailsDao;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoCostBasisStore_Factory create(Provider<RestNummusService> nummusService, Provider<CryptoCostBasisDetailsDao> costBasisDetailsDao, Provider<CurrencyPairV2Store> currencyPairStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(costBasisDetailsDao, "costBasisDetailsDao");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoCostBasisStore_Factory(nummusService, costBasisDetailsDao, currencyPairStore, storeBundle);
        }

        @JvmStatic
        public final CryptoCostBasisStore newInstance(RestNummusService nummusService, CryptoCostBasisDetailsDao costBasisDetailsDao, CurrencyPairV2Store currencyPairStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(costBasisDetailsDao, "costBasisDetailsDao");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoCostBasisStore(nummusService, costBasisDetailsDao, currencyPairStore, storeBundle);
        }
    }
}
