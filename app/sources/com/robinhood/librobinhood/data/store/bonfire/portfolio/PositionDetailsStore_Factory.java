package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.portfolio.PositionDetailsDao;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: PositionDetailsStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "portfolioApi", "Lcom/robinhood/android/models/portfolio/PositionDetailsDao;", "detailsDao", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "bonfirePortfolioService", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "Ljavax/inject/Provider;", "Companion", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PositionDetailsStore_Factory implements Factory<PositionDetailsStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BonfirePortfolioService> bonfirePortfolioService;
    private final Provider<Clock> clock;
    private final Provider<PositionDetailsDao> detailsDao;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<LazyMoshi> moshi;
    private final Provider<PortfolioApi> portfolioApi;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final PositionDetailsStore_Factory create(Provider<PortfolioApi> provider, Provider<PositionDetailsDao> provider2, Provider<ExperimentsStore> provider3, Provider<BonfirePortfolioService> provider4, Provider<LazyMoshi> provider5, Provider<Clock> provider6, Provider<StoreBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final PositionDetailsStore newInstance(PortfolioApi portfolioApi, PositionDetailsDao positionDetailsDao, ExperimentsStore experimentsStore, BonfirePortfolioService bonfirePortfolioService, LazyMoshi lazyMoshi, Clock clock, StoreBundle storeBundle) {
        return INSTANCE.newInstance(portfolioApi, positionDetailsDao, experimentsStore, bonfirePortfolioService, lazyMoshi, clock, storeBundle);
    }

    public PositionDetailsStore_Factory(Provider<PortfolioApi> portfolioApi, Provider<PositionDetailsDao> detailsDao, Provider<ExperimentsStore> experimentsStore, Provider<BonfirePortfolioService> bonfirePortfolioService, Provider<LazyMoshi> moshi, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(detailsDao, "detailsDao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.portfolioApi = portfolioApi;
        this.detailsDao = detailsDao;
        this.experimentsStore = experimentsStore;
        this.bonfirePortfolioService = bonfirePortfolioService;
        this.moshi = moshi;
        this.clock = clock;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public PositionDetailsStore get() {
        Companion companion = INSTANCE;
        PortfolioApi portfolioApi = this.portfolioApi.get();
        Intrinsics.checkNotNullExpressionValue(portfolioApi, "get(...)");
        PositionDetailsDao positionDetailsDao = this.detailsDao.get();
        Intrinsics.checkNotNullExpressionValue(positionDetailsDao, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BonfirePortfolioService bonfirePortfolioService = this.bonfirePortfolioService.get();
        Intrinsics.checkNotNullExpressionValue(bonfirePortfolioService, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(portfolioApi, positionDetailsDao, experimentsStore, bonfirePortfolioService, lazyMoshi, clock, storeBundle);
    }

    /* compiled from: PositionDetailsStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "portfolioApi", "Lcom/robinhood/android/models/portfolio/PositionDetailsDao;", "detailsDao", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "bonfirePortfolioService", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore_Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "newInstance", "(Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/android/models/portfolio/PositionDetailsDao;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;Lcom/robinhood/utils/moshi/LazyMoshi;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionDetailsStore;", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionDetailsStore_Factory create(Provider<PortfolioApi> portfolioApi, Provider<PositionDetailsDao> detailsDao, Provider<ExperimentsStore> experimentsStore, Provider<BonfirePortfolioService> bonfirePortfolioService, Provider<LazyMoshi> moshi, Provider<Clock> clock, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
            Intrinsics.checkNotNullParameter(detailsDao, "detailsDao");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PositionDetailsStore_Factory(portfolioApi, detailsDao, experimentsStore, bonfirePortfolioService, moshi, clock, storeBundle);
        }

        @JvmStatic
        public final PositionDetailsStore newInstance(PortfolioApi portfolioApi, PositionDetailsDao detailsDao, ExperimentsStore experimentsStore, BonfirePortfolioService bonfirePortfolioService, LazyMoshi moshi, Clock clock, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
            Intrinsics.checkNotNullParameter(detailsDao, "detailsDao");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PositionDetailsStore(portfolioApi, detailsDao, experimentsStore, bonfirePortfolioService, moshi, clock, storeBundle);
        }
    }
}
