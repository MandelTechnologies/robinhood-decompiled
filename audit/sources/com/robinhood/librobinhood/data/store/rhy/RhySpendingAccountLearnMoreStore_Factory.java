package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.dao.RhySpendingAccountLearnMoreDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhySpendingAccountLearnMoreStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore;", "dao", "Ljavax/inject/Provider;", "Lcom/robinhood/models/dao/RhySpendingAccountLearnMoreDao;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhySpendingAccountLearnMoreStore_Factory implements Factory<RhySpendingAccountLearnMoreStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhyBonfireApi> bonfireApi;
    private final Provider<RhySpendingAccountLearnMoreDao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final RhySpendingAccountLearnMoreStore_Factory create(Provider<RhySpendingAccountLearnMoreDao> provider, Provider<RhyBonfireApi> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RhySpendingAccountLearnMoreStore newInstance(RhySpendingAccountLearnMoreDao rhySpendingAccountLearnMoreDao, RhyBonfireApi rhyBonfireApi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(rhySpendingAccountLearnMoreDao, rhyBonfireApi, storeBundle);
    }

    public RhySpendingAccountLearnMoreStore_Factory(Provider<RhySpendingAccountLearnMoreDao> dao, Provider<RhyBonfireApi> bonfireApi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        this.bonfireApi = bonfireApi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public RhySpendingAccountLearnMoreStore get() {
        Companion companion = INSTANCE;
        RhySpendingAccountLearnMoreDao rhySpendingAccountLearnMoreDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(rhySpendingAccountLearnMoreDao, "get(...)");
        RhyBonfireApi rhyBonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(rhyBonfireApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(rhySpendingAccountLearnMoreDao, rhyBonfireApi, storeBundle);
    }

    /* compiled from: RhySpendingAccountLearnMoreStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore_Factory;", "dao", "Ljavax/inject/Provider;", "Lcom/robinhood/models/dao/RhySpendingAccountLearnMoreDao;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhySpendingAccountLearnMoreStore_Factory create(Provider<RhySpendingAccountLearnMoreDao> dao, Provider<RhyBonfireApi> bonfireApi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhySpendingAccountLearnMoreStore_Factory(dao, bonfireApi, storeBundle);
        }

        @JvmStatic
        public final RhySpendingAccountLearnMoreStore newInstance(RhySpendingAccountLearnMoreDao dao, RhyBonfireApi bonfireApi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new RhySpendingAccountLearnMoreStore(dao, bonfireApi, storeBundle);
        }
    }
}
