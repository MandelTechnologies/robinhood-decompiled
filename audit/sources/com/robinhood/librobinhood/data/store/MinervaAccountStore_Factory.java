package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.api.rhy.RhyCardShipmentEligibilityApi;
import com.robinhood.api.rhy.RhyCmSunsetApi;
import com.robinhood.models.dao.MinervaAccountDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MinervaAccountStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MinervaAccountDao;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "rhyCmSunsetApi", "Lcom/robinhood/api/rhy/RhyCmSunsetApi;", "rhyCardShipmentEligibilityApi", "Lcom/robinhood/api/rhy/RhyCardShipmentEligibilityApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MinervaAccountStore_Factory implements Factory<MinervaAccountStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MinervaAccountDao> dao;
    private final Provider<Minerva> minerva;
    private final Provider<RhyCardShipmentEligibilityApi> rhyCardShipmentEligibilityApi;
    private final Provider<RhyCmSunsetApi> rhyCmSunsetApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final MinervaAccountStore_Factory create(Provider<StoreBundle> provider, Provider<MinervaAccountDao> provider2, Provider<Minerva> provider3, Provider<RhyCmSunsetApi> provider4, Provider<RhyCardShipmentEligibilityApi> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final MinervaAccountStore newInstance(StoreBundle storeBundle, MinervaAccountDao minervaAccountDao, Minerva minerva, RhyCmSunsetApi rhyCmSunsetApi, RhyCardShipmentEligibilityApi rhyCardShipmentEligibilityApi) {
        return INSTANCE.newInstance(storeBundle, minervaAccountDao, minerva, rhyCmSunsetApi, rhyCardShipmentEligibilityApi);
    }

    public MinervaAccountStore_Factory(Provider<StoreBundle> storeBundle, Provider<MinervaAccountDao> dao, Provider<Minerva> minerva, Provider<RhyCmSunsetApi> rhyCmSunsetApi, Provider<RhyCardShipmentEligibilityApi> rhyCardShipmentEligibilityApi) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(rhyCmSunsetApi, "rhyCmSunsetApi");
        Intrinsics.checkNotNullParameter(rhyCardShipmentEligibilityApi, "rhyCardShipmentEligibilityApi");
        this.storeBundle = storeBundle;
        this.dao = dao;
        this.minerva = minerva;
        this.rhyCmSunsetApi = rhyCmSunsetApi;
        this.rhyCardShipmentEligibilityApi = rhyCardShipmentEligibilityApi;
    }

    @Override // javax.inject.Provider
    public MinervaAccountStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        MinervaAccountDao minervaAccountDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountDao, "get(...)");
        Minerva minerva = this.minerva.get();
        Intrinsics.checkNotNullExpressionValue(minerva, "get(...)");
        RhyCmSunsetApi rhyCmSunsetApi = this.rhyCmSunsetApi.get();
        Intrinsics.checkNotNullExpressionValue(rhyCmSunsetApi, "get(...)");
        RhyCardShipmentEligibilityApi rhyCardShipmentEligibilityApi = this.rhyCardShipmentEligibilityApi.get();
        Intrinsics.checkNotNullExpressionValue(rhyCardShipmentEligibilityApi, "get(...)");
        return companion.newInstance(storeBundle, minervaAccountDao, minerva, rhyCmSunsetApi, rhyCardShipmentEligibilityApi);
    }

    /* compiled from: MinervaAccountStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MinervaAccountStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MinervaAccountDao;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "rhyCmSunsetApi", "Lcom/robinhood/api/rhy/RhyCmSunsetApi;", "rhyCardShipmentEligibilityApi", "Lcom/robinhood/api/rhy/RhyCardShipmentEligibilityApi;", "newInstance", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "lib-store-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MinervaAccountStore_Factory create(Provider<StoreBundle> storeBundle, Provider<MinervaAccountDao> dao, Provider<Minerva> minerva, Provider<RhyCmSunsetApi> rhyCmSunsetApi, Provider<RhyCardShipmentEligibilityApi> rhyCardShipmentEligibilityApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(rhyCmSunsetApi, "rhyCmSunsetApi");
            Intrinsics.checkNotNullParameter(rhyCardShipmentEligibilityApi, "rhyCardShipmentEligibilityApi");
            return new MinervaAccountStore_Factory(storeBundle, dao, minerva, rhyCmSunsetApi, rhyCardShipmentEligibilityApi);
        }

        @JvmStatic
        public final MinervaAccountStore newInstance(StoreBundle storeBundle, MinervaAccountDao dao, Minerva minerva, RhyCmSunsetApi rhyCmSunsetApi, RhyCardShipmentEligibilityApi rhyCardShipmentEligibilityApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(minerva, "minerva");
            Intrinsics.checkNotNullParameter(rhyCmSunsetApi, "rhyCmSunsetApi");
            Intrinsics.checkNotNullParameter(rhyCardShipmentEligibilityApi, "rhyCardShipmentEligibilityApi");
            return new MinervaAccountStore(storeBundle, dao, minerva, rhyCmSunsetApi, rhyCardShipmentEligibilityApi);
        }
    }
}
