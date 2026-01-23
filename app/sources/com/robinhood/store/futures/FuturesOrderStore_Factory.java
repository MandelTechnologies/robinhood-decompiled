package com.robinhood.store.futures;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.futures.dao.FuturesOrderDao;
import com.robinhood.android.models.futures.marketdata.dao.UiFuturesOrderEventDao;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.websocket.gateway.WebsocketGatewaySource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/futures/FuturesOrderStore;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresOrderDao", "Lcom/robinhood/android/models/futures/dao/FuturesOrderDao;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "uiFuturesOrderEventDao", "Lcom/robinhood/android/models/futures/marketdata/dao/UiFuturesOrderEventDao;", "websocketGatewaySource", "Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesOrderStore_Factory implements Factory<FuturesOrderStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Ceres> ceres;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<FuturesOrderDao> futuresOrderDao;
    private final Provider<RhdCostBasisStore> rhdCostBasisStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<UiFuturesOrderEventDao> uiFuturesOrderEventDao;
    private final Provider<WebsocketGatewaySource> websocketGatewaySource;

    @JvmStatic
    public static final FuturesOrderStore_Factory create(Provider<Ceres> provider, Provider<FuturesAccountStore> provider2, Provider<FuturesContractStore> provider3, Provider<FuturesOrderDao> provider4, Provider<RhdCostBasisStore> provider5, Provider<UiFuturesOrderEventDao> provider6, Provider<WebsocketGatewaySource> provider7, Provider<StoreBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final FuturesOrderStore newInstance(Ceres ceres, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesOrderDao futuresOrderDao, RhdCostBasisStore rhdCostBasisStore, UiFuturesOrderEventDao uiFuturesOrderEventDao, WebsocketGatewaySource websocketGatewaySource, StoreBundle storeBundle) {
        return INSTANCE.newInstance(ceres, futuresAccountStore, futuresContractStore, futuresOrderDao, rhdCostBasisStore, uiFuturesOrderEventDao, websocketGatewaySource, storeBundle);
    }

    public FuturesOrderStore_Factory(Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesOrderDao> futuresOrderDao, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<UiFuturesOrderEventDao> uiFuturesOrderEventDao, Provider<WebsocketGatewaySource> websocketGatewaySource, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresOrderDao, "futuresOrderDao");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(uiFuturesOrderEventDao, "uiFuturesOrderEventDao");
        Intrinsics.checkNotNullParameter(websocketGatewaySource, "websocketGatewaySource");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresOrderDao = futuresOrderDao;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.uiFuturesOrderEventDao = uiFuturesOrderEventDao;
        this.websocketGatewaySource = websocketGatewaySource;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public FuturesOrderStore get() {
        Companion companion = INSTANCE;
        Ceres ceres = this.ceres.get();
        Intrinsics.checkNotNullExpressionValue(ceres, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        FuturesOrderDao futuresOrderDao = this.futuresOrderDao.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderDao, "get(...)");
        RhdCostBasisStore rhdCostBasisStore = this.rhdCostBasisStore.get();
        Intrinsics.checkNotNullExpressionValue(rhdCostBasisStore, "get(...)");
        UiFuturesOrderEventDao uiFuturesOrderEventDao = this.uiFuturesOrderEventDao.get();
        Intrinsics.checkNotNullExpressionValue(uiFuturesOrderEventDao, "get(...)");
        WebsocketGatewaySource websocketGatewaySource = this.websocketGatewaySource.get();
        Intrinsics.checkNotNullExpressionValue(websocketGatewaySource, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(ceres, futuresAccountStore, futuresContractStore, futuresOrderDao, rhdCostBasisStore, uiFuturesOrderEventDao, websocketGatewaySource, storeBundle);
    }

    /* compiled from: FuturesOrderStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/FuturesOrderStore_Factory;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresOrderDao", "Lcom/robinhood/android/models/futures/dao/FuturesOrderDao;", "rhdCostBasisStore", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "uiFuturesOrderEventDao", "Lcom/robinhood/android/models/futures/marketdata/dao/UiFuturesOrderEventDao;", "websocketGatewaySource", "Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/futures/FuturesOrderStore;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesOrderStore_Factory create(Provider<Ceres> ceres, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesOrderDao> futuresOrderDao, Provider<RhdCostBasisStore> rhdCostBasisStore, Provider<UiFuturesOrderEventDao> uiFuturesOrderEventDao, Provider<WebsocketGatewaySource> websocketGatewaySource, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresOrderDao, "futuresOrderDao");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(uiFuturesOrderEventDao, "uiFuturesOrderEventDao");
            Intrinsics.checkNotNullParameter(websocketGatewaySource, "websocketGatewaySource");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesOrderStore_Factory(ceres, futuresAccountStore, futuresContractStore, futuresOrderDao, rhdCostBasisStore, uiFuturesOrderEventDao, websocketGatewaySource, storeBundle);
        }

        @JvmStatic
        public final FuturesOrderStore newInstance(Ceres ceres, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesOrderDao futuresOrderDao, RhdCostBasisStore rhdCostBasisStore, UiFuturesOrderEventDao uiFuturesOrderEventDao, WebsocketGatewaySource websocketGatewaySource, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresOrderDao, "futuresOrderDao");
            Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
            Intrinsics.checkNotNullParameter(uiFuturesOrderEventDao, "uiFuturesOrderEventDao");
            Intrinsics.checkNotNullParameter(websocketGatewaySource, "websocketGatewaySource");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new FuturesOrderStore(ceres, futuresAccountStore, futuresContractStore, futuresOrderDao, rhdCostBasisStore, uiFuturesOrderEventDao, websocketGatewaySource, storeBundle);
        }
    }
}
