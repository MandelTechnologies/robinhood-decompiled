package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.dao.bonfire.RhyAccountDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyAccountStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/RhyAccountDao;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyAccountStore_Factory implements Factory<RhyAccountStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhyBonfireApi> bonfireApi;
    private final Provider<RhyAccountDao> dao;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final RhyAccountStore_Factory create(Provider<RhyBonfireApi> provider, Provider<StoreBundle> provider2, Provider<RhyAccountDao> provider3, Provider<MinervaAccountStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RhyAccountStore newInstance(RhyBonfireApi rhyBonfireApi, StoreBundle storeBundle, RhyAccountDao rhyAccountDao, MinervaAccountStore minervaAccountStore) {
        return INSTANCE.newInstance(rhyBonfireApi, storeBundle, rhyAccountDao, minervaAccountStore);
    }

    public RhyAccountStore_Factory(Provider<RhyBonfireApi> bonfireApi, Provider<StoreBundle> storeBundle, Provider<RhyAccountDao> dao, Provider<MinervaAccountStore> minervaAccountStore) {
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        this.bonfireApi = bonfireApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.minervaAccountStore = minervaAccountStore;
    }

    @Override // javax.inject.Provider
    public RhyAccountStore get() {
        Companion companion = INSTANCE;
        RhyBonfireApi rhyBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(rhyBonfireApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        RhyAccountDao rhyAccountDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountDao, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        return companion.newInstance(rhyBonfireApi, storeBundle, rhyAccountDao, minervaAccountStore);
    }

    /* compiled from: RhyAccountStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore_Factory;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/RhyAccountDao;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyAccountStore_Factory create(Provider<RhyBonfireApi> bonfireApi, Provider<StoreBundle> storeBundle, Provider<RhyAccountDao> dao, Provider<MinervaAccountStore> minervaAccountStore) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            return new RhyAccountStore_Factory(bonfireApi, storeBundle, dao, minervaAccountStore);
        }

        @JvmStatic
        public final RhyAccountStore newInstance(RhyBonfireApi bonfireApi, StoreBundle storeBundle, RhyAccountDao dao, MinervaAccountStore minervaAccountStore) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            return new RhyAccountStore(bonfireApi, storeBundle, dao, minervaAccountStore);
        }
    }
}
