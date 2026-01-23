package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.dao.CryptoAccountDao;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAccountStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAccountStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoExperimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoAccountDao;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CryptoAccountStore_Factory implements Factory<CryptoAccountStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<AuthManager> authManager;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoAccountDao> dao;
    private final Provider<NummusApi> nummus;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CryptoAccountStore_Factory create(Provider<CryptoExperimentsStore> provider, Provider<CryptoAccountDao> provider2, Provider<NummusApi> provider3, Provider<AuthManager> provider4, Provider<AppType> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoAccountStore newInstance(CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountDao cryptoAccountDao, NummusApi nummusApi, AuthManager authManager, AppType appType, StoreBundle storeBundle) {
        return INSTANCE.newInstance(cryptoExperimentsStore, cryptoAccountDao, nummusApi, authManager, appType, storeBundle);
    }

    public CryptoAccountStore_Factory(Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountDao> dao, Provider<NummusApi> nummus2, Provider<AuthManager> authManager, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.dao = dao;
        this.nummus = nummus2;
        this.authManager = authManager;
        this.appType = appType;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoAccountStore get() {
        Companion companion = INSTANCE;
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoAccountDao cryptoAccountDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountDao, "get(...)");
        NummusApi nummusApi = this.nummus.get();
        Intrinsics.checkNotNullExpressionValue(nummusApi, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(cryptoExperimentsStore, cryptoAccountDao, nummusApi, authManager, appType, storeBundle);
    }

    /* compiled from: CryptoAccountStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAccountStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore_Factory;", "cryptoExperimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "dao", "Lcom/robinhood/models/crypto/dao/CryptoAccountDao;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoAccountStore_Factory create(Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountDao> dao, Provider<NummusApi> nummus2, Provider<AuthManager> authManager, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoAccountStore_Factory(cryptoExperimentsStore, dao, nummus2, authManager, appType, storeBundle);
        }

        @JvmStatic
        public final CryptoAccountStore newInstance(CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountDao dao, NummusApi nummus2, AuthManager authManager, AppType appType, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoAccountStore(cryptoExperimentsStore, dao, nummus2, authManager, appType, storeBundle);
        }
    }
}
