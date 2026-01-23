package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.dao.PaycheckV2Dao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "paycheckDaoV2", "Lcom/robinhood/models/dao/PaycheckV2Dao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PaycheckStore_Factory implements Factory<PaycheckStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<RhyBonfireApi> bonfireApi;
    private final Provider<PaycheckV2Dao> paycheckDaoV2;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final PaycheckStore_Factory create(Provider<AccountProvider> provider, Provider<RhyBonfireApi> provider2, Provider<RhyAccountStore> provider3, Provider<StoreBundle> provider4, Provider<PaycheckV2Dao> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final PaycheckStore newInstance(AccountProvider accountProvider, RhyBonfireApi rhyBonfireApi, RhyAccountStore rhyAccountStore, StoreBundle storeBundle, PaycheckV2Dao paycheckV2Dao) {
        return INSTANCE.newInstance(accountProvider, rhyBonfireApi, rhyAccountStore, storeBundle, paycheckV2Dao);
    }

    public PaycheckStore_Factory(Provider<AccountProvider> accountProvider, Provider<RhyBonfireApi> bonfireApi, Provider<RhyAccountStore> rhyAccountStore, Provider<StoreBundle> storeBundle, Provider<PaycheckV2Dao> paycheckDaoV2) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(paycheckDaoV2, "paycheckDaoV2");
        this.accountProvider = accountProvider;
        this.bonfireApi = bonfireApi;
        this.rhyAccountStore = rhyAccountStore;
        this.storeBundle = storeBundle;
        this.paycheckDaoV2 = paycheckDaoV2;
    }

    @Override // javax.inject.Provider
    public PaycheckStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RhyBonfireApi rhyBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(rhyBonfireApi, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        PaycheckV2Dao paycheckV2Dao = this.paycheckDaoV2.get();
        Intrinsics.checkNotNullExpressionValue(paycheckV2Dao, "get(...)");
        return companion.newInstance(accountProvider, rhyBonfireApi, rhyAccountStore, storeBundle, paycheckV2Dao);
    }

    /* compiled from: PaycheckStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "paycheckDaoV2", "Lcom/robinhood/models/dao/PaycheckV2Dao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaycheckStore_Factory create(Provider<AccountProvider> accountProvider, Provider<RhyBonfireApi> bonfireApi, Provider<RhyAccountStore> rhyAccountStore, Provider<StoreBundle> storeBundle, Provider<PaycheckV2Dao> paycheckDaoV2) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(paycheckDaoV2, "paycheckDaoV2");
            return new PaycheckStore_Factory(accountProvider, bonfireApi, rhyAccountStore, storeBundle, paycheckDaoV2);
        }

        @JvmStatic
        public final PaycheckStore newInstance(AccountProvider accountProvider, RhyBonfireApi bonfireApi, RhyAccountStore rhyAccountStore, StoreBundle storeBundle, PaycheckV2Dao paycheckDaoV2) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(paycheckDaoV2, "paycheckDaoV2");
            return new PaycheckStore(accountProvider, bonfireApi, rhyAccountStore, storeBundle, paycheckDaoV2);
        }
    }
}
