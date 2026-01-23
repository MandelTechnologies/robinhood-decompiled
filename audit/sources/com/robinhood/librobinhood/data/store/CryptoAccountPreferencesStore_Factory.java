package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.dao.CryptoAccountPreferenceDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoAccountPreferencesStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountPreferencesDao", "Lcom/robinhood/models/crypto/dao/CryptoAccountPreferenceDao;", "nummusService", "Lnummus/v1/RestNummusService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CryptoAccountPreferencesStore_Factory implements Factory<CryptoAccountPreferencesStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CryptoAccountPreferenceDao> cryptoAccountPreferencesDao;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<RestNummusService> nummusService;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoAccountPreferencesStore_Factory create(Provider<CryptoAccountStore> provider, Provider<CryptoAccountPreferenceDao> provider2, Provider<RestNummusService> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoAccountPreferencesStore newInstance(CryptoAccountStore cryptoAccountStore, CryptoAccountPreferenceDao cryptoAccountPreferenceDao, RestNummusService restNummusService, StoreBundle storeBundle) {
        return INSTANCE.newInstance(cryptoAccountStore, cryptoAccountPreferenceDao, restNummusService, storeBundle);
    }

    public CryptoAccountPreferencesStore_Factory(Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoAccountPreferenceDao> cryptoAccountPreferencesDao, Provider<RestNummusService> nummusService, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesDao, "cryptoAccountPreferencesDao");
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoAccountPreferencesDao = cryptoAccountPreferencesDao;
        this.nummusService = nummusService;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoAccountPreferencesStore get() {
        Companion companion = INSTANCE;
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoAccountPreferenceDao cryptoAccountPreferenceDao = this.cryptoAccountPreferencesDao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountPreferenceDao, "get(...)");
        RestNummusService restNummusService = this.nummusService.get();
        Intrinsics.checkNotNullExpressionValue(restNummusService, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(cryptoAccountStore, cryptoAccountPreferenceDao, restNummusService, storeBundle);
    }

    /* compiled from: CryptoAccountPreferencesStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore_Factory;", "cryptoAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountPreferencesDao", "Lcom/robinhood/models/crypto/dao/CryptoAccountPreferenceDao;", "nummusService", "Lnummus/v1/RestNummusService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoAccountPreferencesStore_Factory create(Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoAccountPreferenceDao> cryptoAccountPreferencesDao, Provider<RestNummusService> nummusService, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesDao, "cryptoAccountPreferencesDao");
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoAccountPreferencesStore_Factory(cryptoAccountStore, cryptoAccountPreferencesDao, nummusService, storeBundle);
        }

        @JvmStatic
        public final CryptoAccountPreferencesStore newInstance(CryptoAccountStore cryptoAccountStore, CryptoAccountPreferenceDao cryptoAccountPreferencesDao, RestNummusService nummusService, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesDao, "cryptoAccountPreferencesDao");
            Intrinsics.checkNotNullParameter(nummusService, "nummusService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoAccountPreferencesStore(cryptoAccountStore, cryptoAccountPreferencesDao, nummusService, storeBundle);
        }
    }
}
