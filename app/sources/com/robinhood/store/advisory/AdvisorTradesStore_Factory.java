package com.robinhood.store.advisory;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.models.advisory.dao.AdvisorTradesDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yoda.service.RestYoda;

/* compiled from: AdvisorTradesStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisorTradesStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/advisory/AdvisorTradesStore;", "dao", "Ljavax/inject/Provider;", "Lcom/robinhood/models/advisory/dao/AdvisorTradesDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "yodaApi", "Lyoda/service/RestYoda;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AdvisorTradesStore_Factory implements Factory<AdvisorTradesStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdvisorTradesDao> dao;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<RestYoda> yodaApi;

    @JvmStatic
    public static final AdvisorTradesStore_Factory create(Provider<AdvisorTradesDao> provider, Provider<RegionGateProvider> provider2, Provider<RestYoda> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AdvisorTradesStore newInstance(AdvisorTradesDao advisorTradesDao, RegionGateProvider regionGateProvider, RestYoda restYoda, StoreBundle storeBundle) {
        return INSTANCE.newInstance(advisorTradesDao, regionGateProvider, restYoda, storeBundle);
    }

    public AdvisorTradesStore_Factory(Provider<AdvisorTradesDao> dao, Provider<RegionGateProvider> regionGateProvider, Provider<RestYoda> yodaApi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(yodaApi, "yodaApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        this.regionGateProvider = regionGateProvider;
        this.yodaApi = yodaApi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public AdvisorTradesStore get() {
        Companion companion = INSTANCE;
        AdvisorTradesDao advisorTradesDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(advisorTradesDao, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RestYoda restYoda = this.yodaApi.get();
        Intrinsics.checkNotNullExpressionValue(restYoda, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(advisorTradesDao, regionGateProvider, restYoda, storeBundle);
    }

    /* compiled from: AdvisorTradesStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisorTradesStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/advisory/AdvisorTradesStore_Factory;", "dao", "Ljavax/inject/Provider;", "Lcom/robinhood/models/advisory/dao/AdvisorTradesDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "yodaApi", "Lyoda/service/RestYoda;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/advisory/AdvisorTradesStore;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisorTradesStore_Factory create(Provider<AdvisorTradesDao> dao, Provider<RegionGateProvider> regionGateProvider, Provider<RestYoda> yodaApi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(yodaApi, "yodaApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisorTradesStore_Factory(dao, regionGateProvider, yodaApi, storeBundle);
        }

        @JvmStatic
        public final AdvisorTradesStore newInstance(AdvisorTradesDao dao, RegionGateProvider regionGateProvider, RestYoda yodaApi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(yodaApi, "yodaApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new AdvisorTradesStore(dao, regionGateProvider, yodaApi, storeBundle);
        }
    }
}
