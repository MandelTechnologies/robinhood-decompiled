package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import bonfire.proto.idl.portfolio.p037v1.BonfirePortfolioService;
import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.portfolio.PositionListItemV2Dao;
import com.robinhood.android.models.portfolio.PositionsSortOptionsDao;
import com.robinhood.android.models.portfolio.PositionsV2Dao;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsV2Store_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "portfolioApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "positionsV2Dao", "Lcom/robinhood/android/models/portfolio/PositionsV2Dao;", "positionListItemV2Dao", "Lcom/robinhood/android/models/portfolio/PositionListItemV2Dao;", "sortOptionsDao", "Lcom/robinhood/android/models/portfolio/PositionsSortOptionsDao;", "positionsDisplayOptionsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "bonfirePortfolioService", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PositionsV2Store_Factory implements Factory<PositionsV2Store> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BonfirePortfolioService> bonfirePortfolioService;
    private final Provider<LazyMoshi> moshi;
    private final Provider<PortfolioApi> portfolioApi;
    private final Provider<PositionListItemV2Dao> positionListItemV2Dao;
    private final Provider<PositionsDisplayOptionsStore> positionsDisplayOptionsStore;
    private final Provider<PositionsV2Dao> positionsV2Dao;
    private final Provider<PositionsSortOptionsDao> sortOptionsDao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final PositionsV2Store_Factory create(Provider<PortfolioApi> provider, Provider<PositionsV2Dao> provider2, Provider<PositionListItemV2Dao> provider3, Provider<PositionsSortOptionsDao> provider4, Provider<PositionsDisplayOptionsStore> provider5, Provider<BonfirePortfolioService> provider6, Provider<LazyMoshi> provider7, Provider<StoreBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final PositionsV2Store newInstance(PortfolioApi portfolioApi, PositionsV2Dao positionsV2Dao, PositionListItemV2Dao positionListItemV2Dao, PositionsSortOptionsDao positionsSortOptionsDao, PositionsDisplayOptionsStore positionsDisplayOptionsStore, BonfirePortfolioService bonfirePortfolioService, LazyMoshi lazyMoshi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(portfolioApi, positionsV2Dao, positionListItemV2Dao, positionsSortOptionsDao, positionsDisplayOptionsStore, bonfirePortfolioService, lazyMoshi, storeBundle);
    }

    public PositionsV2Store_Factory(Provider<PortfolioApi> portfolioApi, Provider<PositionsV2Dao> positionsV2Dao, Provider<PositionListItemV2Dao> positionListItemV2Dao, Provider<PositionsSortOptionsDao> sortOptionsDao, Provider<PositionsDisplayOptionsStore> positionsDisplayOptionsStore, Provider<BonfirePortfolioService> bonfirePortfolioService, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(positionsV2Dao, "positionsV2Dao");
        Intrinsics.checkNotNullParameter(positionListItemV2Dao, "positionListItemV2Dao");
        Intrinsics.checkNotNullParameter(sortOptionsDao, "sortOptionsDao");
        Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
        Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.portfolioApi = portfolioApi;
        this.positionsV2Dao = positionsV2Dao;
        this.positionListItemV2Dao = positionListItemV2Dao;
        this.sortOptionsDao = sortOptionsDao;
        this.positionsDisplayOptionsStore = positionsDisplayOptionsStore;
        this.bonfirePortfolioService = bonfirePortfolioService;
        this.moshi = moshi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public PositionsV2Store get() {
        Companion companion = INSTANCE;
        PortfolioApi portfolioApi = this.portfolioApi.get();
        Intrinsics.checkNotNullExpressionValue(portfolioApi, "get(...)");
        PositionsV2Dao positionsV2Dao = this.positionsV2Dao.get();
        Intrinsics.checkNotNullExpressionValue(positionsV2Dao, "get(...)");
        PositionListItemV2Dao positionListItemV2Dao = this.positionListItemV2Dao.get();
        Intrinsics.checkNotNullExpressionValue(positionListItemV2Dao, "get(...)");
        PositionsSortOptionsDao positionsSortOptionsDao = this.sortOptionsDao.get();
        Intrinsics.checkNotNullExpressionValue(positionsSortOptionsDao, "get(...)");
        PositionsDisplayOptionsStore positionsDisplayOptionsStore = this.positionsDisplayOptionsStore.get();
        Intrinsics.checkNotNullExpressionValue(positionsDisplayOptionsStore, "get(...)");
        BonfirePortfolioService bonfirePortfolioService = this.bonfirePortfolioService.get();
        Intrinsics.checkNotNullExpressionValue(bonfirePortfolioService, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(portfolioApi, positionsV2Dao, positionListItemV2Dao, positionsSortOptionsDao, positionsDisplayOptionsStore, bonfirePortfolioService, lazyMoshi, storeBundle);
    }

    /* compiled from: PositionsV2Store_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store_Factory;", "portfolioApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "positionsV2Dao", "Lcom/robinhood/android/models/portfolio/PositionsV2Dao;", "positionListItemV2Dao", "Lcom/robinhood/android/models/portfolio/PositionListItemV2Dao;", "sortOptionsDao", "Lcom/robinhood/android/models/portfolio/PositionsSortOptionsDao;", "positionsDisplayOptionsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "bonfirePortfolioService", "Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionsV2Store_Factory create(Provider<PortfolioApi> portfolioApi, Provider<PositionsV2Dao> positionsV2Dao, Provider<PositionListItemV2Dao> positionListItemV2Dao, Provider<PositionsSortOptionsDao> sortOptionsDao, Provider<PositionsDisplayOptionsStore> positionsDisplayOptionsStore, Provider<BonfirePortfolioService> bonfirePortfolioService, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
            Intrinsics.checkNotNullParameter(positionsV2Dao, "positionsV2Dao");
            Intrinsics.checkNotNullParameter(positionListItemV2Dao, "positionListItemV2Dao");
            Intrinsics.checkNotNullParameter(sortOptionsDao, "sortOptionsDao");
            Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
            Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PositionsV2Store_Factory(portfolioApi, positionsV2Dao, positionListItemV2Dao, sortOptionsDao, positionsDisplayOptionsStore, bonfirePortfolioService, moshi, storeBundle);
        }

        @JvmStatic
        public final PositionsV2Store newInstance(PortfolioApi portfolioApi, PositionsV2Dao positionsV2Dao, PositionListItemV2Dao positionListItemV2Dao, PositionsSortOptionsDao sortOptionsDao, PositionsDisplayOptionsStore positionsDisplayOptionsStore, BonfirePortfolioService bonfirePortfolioService, LazyMoshi moshi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
            Intrinsics.checkNotNullParameter(positionsV2Dao, "positionsV2Dao");
            Intrinsics.checkNotNullParameter(positionListItemV2Dao, "positionListItemV2Dao");
            Intrinsics.checkNotNullParameter(sortOptionsDao, "sortOptionsDao");
            Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
            Intrinsics.checkNotNullParameter(bonfirePortfolioService, "bonfirePortfolioService");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PositionsV2Store(portfolioApi, positionsV2Dao, positionListItemV2Dao, sortOptionsDao, positionsDisplayOptionsStore, bonfirePortfolioService, moshi, storeBundle);
        }
    }
}
