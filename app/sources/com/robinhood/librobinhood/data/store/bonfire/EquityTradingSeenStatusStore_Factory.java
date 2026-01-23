package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.dao.EquityTradingSeenStatusDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradingSeenStatusStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "tradeEquityBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "dao", "Lcom/robinhood/models/dao/EquityTradingSeenStatusDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityTradingSeenStatusStore_Factory implements Factory<EquityTradingSeenStatusStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EquityTradingSeenStatusDao> dao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TradeEquityBonfireApi> tradeEquityBonfireApi;

    @JvmStatic
    public static final EquityTradingSeenStatusStore_Factory create(Provider<TradeEquityBonfireApi> provider, Provider<EquityTradingSeenStatusDao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final EquityTradingSeenStatusStore newInstance(TradeEquityBonfireApi tradeEquityBonfireApi, EquityTradingSeenStatusDao equityTradingSeenStatusDao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(tradeEquityBonfireApi, equityTradingSeenStatusDao, storeBundle);
    }

    public EquityTradingSeenStatusStore_Factory(Provider<TradeEquityBonfireApi> tradeEquityBonfireApi, Provider<EquityTradingSeenStatusDao> dao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.dao = dao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public EquityTradingSeenStatusStore get() {
        Companion companion = INSTANCE;
        TradeEquityBonfireApi tradeEquityBonfireApi = this.tradeEquityBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(tradeEquityBonfireApi, "get(...)");
        EquityTradingSeenStatusDao equityTradingSeenStatusDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSeenStatusDao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(tradeEquityBonfireApi, equityTradingSeenStatusDao, storeBundle);
    }

    /* compiled from: EquityTradingSeenStatusStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore_Factory;", "tradeEquityBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "dao", "Lcom/robinhood/models/dao/EquityTradingSeenStatusDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityTradingSeenStatusStore_Factory create(Provider<TradeEquityBonfireApi> tradeEquityBonfireApi, Provider<EquityTradingSeenStatusDao> dao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityTradingSeenStatusStore_Factory(tradeEquityBonfireApi, dao, storeBundle);
        }

        @JvmStatic
        public final EquityTradingSeenStatusStore newInstance(TradeEquityBonfireApi tradeEquityBonfireApi, EquityTradingSeenStatusDao dao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new EquityTradingSeenStatusStore(tradeEquityBonfireApi, dao, storeBundle);
        }
    }
}
