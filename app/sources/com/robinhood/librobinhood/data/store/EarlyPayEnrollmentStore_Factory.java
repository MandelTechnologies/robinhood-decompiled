package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore;
import com.robinhood.models.dao.EarlyPayEnrollmentDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayEnrollmentStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabCarouselStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTabCarouselStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/EarlyPayEnrollmentDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EarlyPayEnrollmentStore_Factory implements Factory<EarlyPayEnrollmentStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<TransfersBonfireApi> bonfireApi;
    private final Provider<EarlyPayEnrollmentDao> dao;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RhyTabCarouselStore> rhyTabCarouselStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final EarlyPayEnrollmentStore_Factory create(Provider<TransfersBonfireApi> provider, Provider<RhyAccountStore> provider2, Provider<RhyTabCarouselStore> provider3, Provider<StoreBundle> provider4, Provider<EarlyPayEnrollmentDao> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final EarlyPayEnrollmentStore newInstance(TransfersBonfireApi transfersBonfireApi, RhyAccountStore rhyAccountStore, RhyTabCarouselStore rhyTabCarouselStore, StoreBundle storeBundle, EarlyPayEnrollmentDao earlyPayEnrollmentDao) {
        return INSTANCE.newInstance(transfersBonfireApi, rhyAccountStore, rhyTabCarouselStore, storeBundle, earlyPayEnrollmentDao);
    }

    public EarlyPayEnrollmentStore_Factory(Provider<TransfersBonfireApi> bonfireApi, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyTabCarouselStore> rhyTabCarouselStore, Provider<StoreBundle> storeBundle, Provider<EarlyPayEnrollmentDao> dao) {
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyTabCarouselStore, "rhyTabCarouselStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfireApi = bonfireApi;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyTabCarouselStore = rhyTabCarouselStore;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public EarlyPayEnrollmentStore get() {
        Companion companion = INSTANCE;
        TransfersBonfireApi transfersBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        RhyTabCarouselStore rhyTabCarouselStore = this.rhyTabCarouselStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyTabCarouselStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        EarlyPayEnrollmentDao earlyPayEnrollmentDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(earlyPayEnrollmentDao, "get(...)");
        return companion.newInstance(transfersBonfireApi, rhyAccountStore, rhyTabCarouselStore, storeBundle, earlyPayEnrollmentDao);
    }

    /* compiled from: EarlyPayEnrollmentStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore_Factory;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabCarouselStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyTabCarouselStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/EarlyPayEnrollmentDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EarlyPayEnrollmentStore_Factory create(Provider<TransfersBonfireApi> bonfireApi, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyTabCarouselStore> rhyTabCarouselStore, Provider<StoreBundle> storeBundle, Provider<EarlyPayEnrollmentDao> dao) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyTabCarouselStore, "rhyTabCarouselStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new EarlyPayEnrollmentStore_Factory(bonfireApi, rhyAccountStore, rhyTabCarouselStore, storeBundle, dao);
        }

        @JvmStatic
        public final EarlyPayEnrollmentStore newInstance(TransfersBonfireApi bonfireApi, RhyAccountStore rhyAccountStore, RhyTabCarouselStore rhyTabCarouselStore, StoreBundle storeBundle, EarlyPayEnrollmentDao dao) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyTabCarouselStore, "rhyTabCarouselStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new EarlyPayEnrollmentStore(bonfireApi, rhyAccountStore, rhyTabCarouselStore, storeBundle, dao);
        }
    }
}
