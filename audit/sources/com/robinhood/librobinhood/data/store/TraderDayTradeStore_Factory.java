package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore_MembersInjector;
import com.robinhood.models.dao.EquityDayTradeDao;
import com.robinhood.models.dao.OptionDayTradeDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderDayTradeStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "brokeback", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Brokeback;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "equityDayTradeDao", "Lcom/robinhood/models/dao/EquityDayTradeDao;", "optionDayTradeDao", "Lcom/robinhood/models/dao/OptionDayTradeDao;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TraderDayTradeStore_Factory implements Factory<TraderDayTradeStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Brokeback> brokeback;
    private final Provider<EquitiesBrokeback> equitiesBrokeback;
    private final Provider<EquityDayTradeDao> equityDayTradeDao;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<OptionDayTradeDao> optionDayTradeDao;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<OrderStore> orderStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final TraderDayTradeStore_Factory create(Provider<Brokeback> provider, Provider<EquitiesBrokeback> provider2, Provider<StoreBundle> provider3, Provider<EquityDayTradeDao> provider4, Provider<OptionDayTradeDao> provider5, Provider<AccountProvider> provider6, Provider<InstrumentStore> provider7, Provider<OptionOrderStore> provider8, Provider<OrderStore> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final TraderDayTradeStore newInstance(Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, StoreBundle storeBundle, EquityDayTradeDao equityDayTradeDao, OptionDayTradeDao optionDayTradeDao) {
        return INSTANCE.newInstance(brokeback, equitiesBrokeback, storeBundle, equityDayTradeDao, optionDayTradeDao);
    }

    public TraderDayTradeStore_Factory(Provider<Brokeback> brokeback, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<StoreBundle> storeBundle, Provider<EquityDayTradeDao> equityDayTradeDao, Provider<OptionDayTradeDao> optionDayTradeDao, Provider<AccountProvider> accountProvider, Provider<InstrumentStore> instrumentStore, Provider<OptionOrderStore> optionOrderStore, Provider<OrderStore> orderStore) {
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(equityDayTradeDao, "equityDayTradeDao");
        Intrinsics.checkNotNullParameter(optionDayTradeDao, "optionDayTradeDao");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        this.brokeback = brokeback;
        this.equitiesBrokeback = equitiesBrokeback;
        this.storeBundle = storeBundle;
        this.equityDayTradeDao = equityDayTradeDao;
        this.optionDayTradeDao = optionDayTradeDao;
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.optionOrderStore = optionOrderStore;
        this.orderStore = orderStore;
    }

    @Override // javax.inject.Provider
    public TraderDayTradeStore get() {
        Companion companion = INSTANCE;
        Brokeback brokeback = this.brokeback.get();
        Intrinsics.checkNotNullExpressionValue(brokeback, "get(...)");
        EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback.get();
        Intrinsics.checkNotNullExpressionValue(equitiesBrokeback, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        EquityDayTradeDao equityDayTradeDao = this.equityDayTradeDao.get();
        Intrinsics.checkNotNullExpressionValue(equityDayTradeDao, "get(...)");
        OptionDayTradeDao optionDayTradeDao = this.optionDayTradeDao.get();
        Intrinsics.checkNotNullExpressionValue(optionDayTradeDao, "get(...)");
        TraderDayTradeStore traderDayTradeStoreNewInstance = companion.newInstance(brokeback, equitiesBrokeback, storeBundle, equityDayTradeDao, optionDayTradeDao);
        TraderDayTradeStore_MembersInjector.Companion companion2 = TraderDayTradeStore_MembersInjector.INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion2.injectAccountProvider(traderDayTradeStoreNewInstance, accountProvider);
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion2.injectInstrumentStore(traderDayTradeStoreNewInstance, instrumentStore);
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        companion2.injectOptionOrderStore(traderDayTradeStoreNewInstance, optionOrderStore);
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        companion2.injectOrderStore(traderDayTradeStoreNewInstance, orderStore);
        return traderDayTradeStoreNewInstance;
    }

    /* compiled from: TraderDayTradeStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007J0\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore_Factory;", "brokeback", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Brokeback;", "equitiesBrokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "equityDayTradeDao", "Lcom/robinhood/models/dao/EquityDayTradeDao;", "optionDayTradeDao", "Lcom/robinhood/models/dao/OptionDayTradeDao;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "newInstance", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderDayTradeStore_Factory create(Provider<Brokeback> brokeback, Provider<EquitiesBrokeback> equitiesBrokeback, Provider<StoreBundle> storeBundle, Provider<EquityDayTradeDao> equityDayTradeDao, Provider<OptionDayTradeDao> optionDayTradeDao, Provider<AccountProvider> accountProvider, Provider<InstrumentStore> instrumentStore, Provider<OptionOrderStore> optionOrderStore, Provider<OrderStore> orderStore) {
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(equityDayTradeDao, "equityDayTradeDao");
            Intrinsics.checkNotNullParameter(optionDayTradeDao, "optionDayTradeDao");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            return new TraderDayTradeStore_Factory(brokeback, equitiesBrokeback, storeBundle, equityDayTradeDao, optionDayTradeDao, accountProvider, instrumentStore, optionOrderStore, orderStore);
        }

        @JvmStatic
        public final TraderDayTradeStore newInstance(Brokeback brokeback, EquitiesBrokeback equitiesBrokeback, StoreBundle storeBundle, EquityDayTradeDao equityDayTradeDao, OptionDayTradeDao optionDayTradeDao) {
            Intrinsics.checkNotNullParameter(brokeback, "brokeback");
            Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(equityDayTradeDao, "equityDayTradeDao");
            Intrinsics.checkNotNullParameter(optionDayTradeDao, "optionDayTradeDao");
            return new TraderDayTradeStore(brokeback, equitiesBrokeback, storeBundle, equityDayTradeDao, optionDayTradeDao);
        }
    }
}
