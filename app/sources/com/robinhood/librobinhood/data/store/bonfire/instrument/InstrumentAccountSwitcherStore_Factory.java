package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libs.tab.CurrentTabManager;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.dao.bonfire.instrument.InstrumentAccountSwitcherDao;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentAccountSwitcherStore_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountNumberPreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "dao", "Lcom/robinhood/models/dao/bonfire/instrument/InstrumentAccountSwitcherDao;", "tradeEquityApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "currentTabManager", "Lcom/robinhood/android/libs/tab/CurrentTabManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InstrumentAccountSwitcherStore_Factory implements Factory<InstrumentAccountSwitcherStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<StringPreference> accountNumberPreference;
    private final Provider<CurrentTabManager> currentTabManager;
    private final Provider<InstrumentAccountSwitcherDao> dao;
    private final Provider<LazyMoshi> moshi;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TradeEquityBonfireApi> tradeEquityApi;

    @JvmStatic
    public static final InstrumentAccountSwitcherStore_Factory create(Provider<StringPreference> provider, Provider<InstrumentAccountSwitcherDao> provider2, Provider<TradeEquityBonfireApi> provider3, Provider<CurrentTabManager> provider4, Provider<LazyMoshi> provider5, Provider<StoreBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final InstrumentAccountSwitcherStore newInstance(StringPreference stringPreference, InstrumentAccountSwitcherDao instrumentAccountSwitcherDao, TradeEquityBonfireApi tradeEquityBonfireApi, CurrentTabManager currentTabManager, LazyMoshi lazyMoshi, StoreBundle storeBundle) {
        return INSTANCE.newInstance(stringPreference, instrumentAccountSwitcherDao, tradeEquityBonfireApi, currentTabManager, lazyMoshi, storeBundle);
    }

    public InstrumentAccountSwitcherStore_Factory(Provider<StringPreference> accountNumberPreference, Provider<InstrumentAccountSwitcherDao> dao, Provider<TradeEquityBonfireApi> tradeEquityApi, Provider<CurrentTabManager> currentTabManager, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(accountNumberPreference, "accountNumberPreference");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(tradeEquityApi, "tradeEquityApi");
        Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountNumberPreference = accountNumberPreference;
        this.dao = dao;
        this.tradeEquityApi = tradeEquityApi;
        this.currentTabManager = currentTabManager;
        this.moshi = moshi;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public InstrumentAccountSwitcherStore get() {
        Companion companion = INSTANCE;
        StringPreference stringPreference = this.accountNumberPreference.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        InstrumentAccountSwitcherDao instrumentAccountSwitcherDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherDao, "get(...)");
        TradeEquityBonfireApi tradeEquityBonfireApi = this.tradeEquityApi.get();
        Intrinsics.checkNotNullExpressionValue(tradeEquityBonfireApi, "get(...)");
        CurrentTabManager currentTabManager = this.currentTabManager.get();
        Intrinsics.checkNotNullExpressionValue(currentTabManager, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(stringPreference, instrumentAccountSwitcherDao, tradeEquityBonfireApi, currentTabManager, lazyMoshi, storeBundle);
    }

    /* compiled from: InstrumentAccountSwitcherStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore_Factory;", "accountNumberPreference", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "dao", "Lcom/robinhood/models/dao/bonfire/instrument/InstrumentAccountSwitcherDao;", "tradeEquityApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "currentTabManager", "Lcom/robinhood/android/libs/tab/CurrentTabManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentAccountSwitcherStore_Factory create(Provider<StringPreference> accountNumberPreference, Provider<InstrumentAccountSwitcherDao> dao, Provider<TradeEquityBonfireApi> tradeEquityApi, Provider<CurrentTabManager> currentTabManager, Provider<LazyMoshi> moshi, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(accountNumberPreference, "accountNumberPreference");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(tradeEquityApi, "tradeEquityApi");
            Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new InstrumentAccountSwitcherStore_Factory(accountNumberPreference, dao, tradeEquityApi, currentTabManager, moshi, storeBundle);
        }

        @JvmStatic
        public final InstrumentAccountSwitcherStore newInstance(StringPreference accountNumberPreference, InstrumentAccountSwitcherDao dao, TradeEquityBonfireApi tradeEquityApi, CurrentTabManager currentTabManager, LazyMoshi moshi, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(accountNumberPreference, "accountNumberPreference");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(tradeEquityApi, "tradeEquityApi");
            Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new InstrumentAccountSwitcherStore(accountNumberPreference, dao, tradeEquityApi, currentTabManager, moshi, storeBundle);
        }
    }
}
