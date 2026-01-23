package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.rhy.referral.RhyReferralBonfireApi;
import com.robinhood.models.rhy.referral.dao.RhyReferralAttributionDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralAttributionStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/rhy/referral/RhyReferralBonfireApi;", "dao", "Lcom/robinhood/models/rhy/referral/dao/RhyReferralAttributionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyReferralAttributionStore_Factory implements Factory<RhyReferralAttributionStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhyReferralBonfireApi> bonfireApi;
    private final Provider<RhyReferralAttributionDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final RhyReferralAttributionStore_Factory create(Provider<RhyReferralBonfireApi> provider, Provider<RhyReferralAttributionDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RhyReferralAttributionStore newInstance(RhyReferralBonfireApi rhyReferralBonfireApi, RhyReferralAttributionDao rhyReferralAttributionDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(rhyReferralBonfireApi, rhyReferralAttributionDao, storeBundle);
    }

    public RhyReferralAttributionStore_Factory(Provider<RhyReferralBonfireApi> bonfireApi, Provider<RhyReferralAttributionDao> dao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public RhyReferralAttributionStore get() {
        Companion companion = INSTANCE;
        RhyReferralBonfireApi rhyReferralBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralBonfireApi, "get(...)");
        RhyReferralAttributionDao rhyReferralAttributionDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralAttributionDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(rhyReferralBonfireApi, rhyReferralAttributionDao, storeBundle);
    }

    /* compiled from: RhyReferralAttributionStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore_Factory;", "bonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/rhy/referral/RhyReferralBonfireApi;", "dao", "Lcom/robinhood/models/rhy/referral/dao/RhyReferralAttributionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;", "lib-store-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyReferralAttributionStore_Factory create(Provider<RhyReferralBonfireApi> bonfireApi, Provider<RhyReferralAttributionDao> dao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhyReferralAttributionStore_Factory(bonfireApi, dao, storeBundle);
        }

        @JvmStatic
        public final RhyReferralAttributionStore newInstance(RhyReferralBonfireApi bonfireApi, RhyReferralAttributionDao dao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhyReferralAttributionStore(bonfireApi, dao, storeBundle);
        }
    }
}
