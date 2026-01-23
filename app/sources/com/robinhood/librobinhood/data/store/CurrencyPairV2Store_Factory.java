package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.crypto.dao.CurrencyDao;
import com.robinhood.models.crypto.dao.CurrencyPairDao;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyPairV2Store_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "currencyRhRoomDao", "Lcom/robinhood/models/dao/CurrencyDao;", "currencyPairDao", "Lcom/robinhood/models/crypto/dao/CurrencyPairDao;", "currencyPairRhRoomDao", "Lcom/robinhood/models/dao/CurrencyPairDao;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CurrencyPairV2Store_Factory implements Factory<CurrencyPairV2Store> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManager;
    private final Provider<CurrencyDao> currencyDao;
    private final Provider<CurrencyPairDao> currencyPairDao;
    private final Provider<com.robinhood.models.dao.CurrencyPairDao> currencyPairRhRoomDao;
    private final Provider<com.robinhood.models.dao.CurrencyDao> currencyRhRoomDao;
    private final Provider<NummusApi> nummus;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final CurrencyPairV2Store_Factory create(Provider<StoreBundle> provider, Provider<AuthManager> provider2, Provider<CurrencyDao> provider3, Provider<com.robinhood.models.dao.CurrencyDao> provider4, Provider<CurrencyPairDao> provider5, Provider<com.robinhood.models.dao.CurrencyPairDao> provider6, Provider<NummusApi> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CurrencyPairV2Store newInstance(StoreBundle storeBundle, AuthManager authManager, CurrencyDao currencyDao, com.robinhood.models.dao.CurrencyDao currencyDao2, CurrencyPairDao currencyPairDao, com.robinhood.models.dao.CurrencyPairDao currencyPairDao2, NummusApi nummusApi) {
        return INSTANCE.newInstance(storeBundle, authManager, currencyDao, currencyDao2, currencyPairDao, currencyPairDao2, nummusApi);
    }

    public CurrencyPairV2Store_Factory(Provider<StoreBundle> storeBundle, Provider<AuthManager> authManager, Provider<CurrencyDao> currencyDao, Provider<com.robinhood.models.dao.CurrencyDao> currencyRhRoomDao, Provider<CurrencyPairDao> currencyPairDao, Provider<com.robinhood.models.dao.CurrencyPairDao> currencyPairRhRoomDao, Provider<NummusApi> nummus2) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(currencyRhRoomDao, "currencyRhRoomDao");
        Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
        Intrinsics.checkNotNullParameter(currencyPairRhRoomDao, "currencyPairRhRoomDao");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        this.storeBundle = storeBundle;
        this.authManager = authManager;
        this.currencyDao = currencyDao;
        this.currencyRhRoomDao = currencyRhRoomDao;
        this.currencyPairDao = currencyPairDao;
        this.currencyPairRhRoomDao = currencyPairRhRoomDao;
        this.nummus = nummus2;
    }

    @Override // javax.inject.Provider
    public CurrencyPairV2Store get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        CurrencyDao currencyDao = this.currencyDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyDao, "get(...)");
        com.robinhood.models.dao.CurrencyDao currencyDao2 = this.currencyRhRoomDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyDao2, "get(...)");
        CurrencyPairDao currencyPairDao = this.currencyPairDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairDao, "get(...)");
        com.robinhood.models.dao.CurrencyPairDao currencyPairDao2 = this.currencyPairRhRoomDao.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairDao2, "get(...)");
        NummusApi nummusApi = this.nummus.get();
        Intrinsics.checkNotNullExpressionValue(nummusApi, "get(...)");
        return companion.newInstance(storeBundle, authManager, currencyDao, currencyDao2, currencyPairDao, currencyPairDao2, nummusApi);
    }

    /* compiled from: CurrencyPairV2Store_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "currencyRhRoomDao", "Lcom/robinhood/models/dao/CurrencyDao;", "currencyPairDao", "Lcom/robinhood/models/crypto/dao/CurrencyPairDao;", "currencyPairRhRoomDao", "Lcom/robinhood/models/dao/CurrencyPairDao;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "newInstance", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CurrencyPairV2Store_Factory create(Provider<StoreBundle> storeBundle, Provider<AuthManager> authManager, Provider<CurrencyDao> currencyDao, Provider<com.robinhood.models.dao.CurrencyDao> currencyRhRoomDao, Provider<CurrencyPairDao> currencyPairDao, Provider<com.robinhood.models.dao.CurrencyPairDao> currencyPairRhRoomDao, Provider<NummusApi> nummus2) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(currencyRhRoomDao, "currencyRhRoomDao");
            Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
            Intrinsics.checkNotNullParameter(currencyPairRhRoomDao, "currencyPairRhRoomDao");
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            return new CurrencyPairV2Store_Factory(storeBundle, authManager, currencyDao, currencyRhRoomDao, currencyPairDao, currencyPairRhRoomDao, nummus2);
        }

        @JvmStatic
        public final CurrencyPairV2Store newInstance(StoreBundle storeBundle, AuthManager authManager, CurrencyDao currencyDao, com.robinhood.models.dao.CurrencyDao currencyRhRoomDao, CurrencyPairDao currencyPairDao, com.robinhood.models.dao.CurrencyPairDao currencyPairRhRoomDao, NummusApi nummus2) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
            Intrinsics.checkNotNullParameter(currencyRhRoomDao, "currencyRhRoomDao");
            Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
            Intrinsics.checkNotNullParameter(currencyPairRhRoomDao, "currencyPairRhRoomDao");
            Intrinsics.checkNotNullParameter(nummus2, "nummus");
            return new CurrencyPairV2Store(storeBundle, authManager, currencyDao, currencyRhRoomDao, currencyPairDao, currencyPairRhRoomDao, nummus2);
        }
    }
}
