package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.dao.InstrumentBuyingPowerDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentBuyingPowerStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentBuyingPowerDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InstrumentBuyingPowerStore_Factory implements Factory<InstrumentBuyingPowerStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<InstrumentBuyingPowerDao> dao;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TradeEquityBonfireApi> tradeEquityBonfireApi;

    @JvmStatic
    public static final InstrumentBuyingPowerStore_Factory create(Provider<AccountProvider> provider, Provider<TradeEquityBonfireApi> provider2, Provider<StoreBundle> provider3, Provider<InstrumentBuyingPowerDao> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final InstrumentBuyingPowerStore newInstance(AccountProvider accountProvider, TradeEquityBonfireApi tradeEquityBonfireApi, StoreBundle storeBundle, InstrumentBuyingPowerDao instrumentBuyingPowerDao) {
        return INSTANCE.newInstance(accountProvider, tradeEquityBonfireApi, storeBundle, instrumentBuyingPowerDao);
    }

    public InstrumentBuyingPowerStore_Factory(Provider<AccountProvider> accountProvider, Provider<TradeEquityBonfireApi> tradeEquityBonfireApi, Provider<StoreBundle> storeBundle, Provider<InstrumentBuyingPowerDao> dao) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.accountProvider = accountProvider;
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public InstrumentBuyingPowerStore get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        TradeEquityBonfireApi tradeEquityBonfireApi = this.tradeEquityBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(tradeEquityBonfireApi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        InstrumentBuyingPowerDao instrumentBuyingPowerDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerDao, "get(...)");
        return companion.newInstance(accountProvider, tradeEquityBonfireApi, storeBundle, instrumentBuyingPowerDao);
    }

    /* compiled from: InstrumentBuyingPowerStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentBuyingPowerDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentBuyingPowerStore_Factory create(Provider<AccountProvider> accountProvider, Provider<TradeEquityBonfireApi> tradeEquityBonfireApi, Provider<StoreBundle> storeBundle, Provider<InstrumentBuyingPowerDao> dao) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new InstrumentBuyingPowerStore_Factory(accountProvider, tradeEquityBonfireApi, storeBundle, dao);
        }

        @JvmStatic
        public final InstrumentBuyingPowerStore newInstance(AccountProvider accountProvider, TradeEquityBonfireApi tradeEquityBonfireApi, StoreBundle storeBundle, InstrumentBuyingPowerDao dao) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new InstrumentBuyingPowerStore(accountProvider, tradeEquityBonfireApi, storeBundle, dao);
        }
    }
}
