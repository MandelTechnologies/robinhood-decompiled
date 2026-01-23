package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.trade.equity.p261ui.configuration.timeinforce.OrderTimeInForceDuxo_MembersInjector;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTimeInForceDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "marketHoursStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "defaultTimeInForcePref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OrderTimeInForceDuxo_Factory implements Factory<OrderTimeInForceDuxo> {
    private final Provider<StringPreference> defaultTimeInForcePref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<EquityOrderExpireDateStore> orderExpireDateStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OrderTimeInForceStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderTimeInForceDuxo_Factory create(Provider<MarketHoursStore> provider, Provider<TraderMarketHoursManager> provider2, Provider<EquityOrderExpireDateStore> provider3, Provider<OrderTimeInForceStateProvider> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6, Provider<StringPreference> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final OrderTimeInForceDuxo newInstance(MarketHoursStore marketHoursStore, TraderMarketHoursManager traderMarketHoursManager, EquityOrderExpireDateStore equityOrderExpireDateStore, OrderTimeInForceStateProvider orderTimeInForceStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(marketHoursStore, traderMarketHoursManager, equityOrderExpireDateStore, orderTimeInForceStateProvider, duxoBundle, savedStateHandle);
    }

    public OrderTimeInForceDuxo_Factory(Provider<MarketHoursStore> marketHoursStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<OrderTimeInForceStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<StringPreference> defaultTimeInForcePref) {
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
        this.marketHoursStore = marketHoursStore;
        this.marketHoursManager = marketHoursManager;
        this.orderExpireDateStore = orderExpireDateStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.defaultTimeInForcePref = defaultTimeInForcePref;
    }

    @Override // javax.inject.Provider
    public OrderTimeInForceDuxo get() {
        Companion companion = INSTANCE;
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        EquityOrderExpireDateStore equityOrderExpireDateStore = this.orderExpireDateStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderExpireDateStore, "get(...)");
        OrderTimeInForceStateProvider orderTimeInForceStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(orderTimeInForceStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OrderTimeInForceDuxo orderTimeInForceDuxoNewInstance = companion.newInstance(marketHoursStore, traderMarketHoursManager, equityOrderExpireDateStore, orderTimeInForceStateProvider, duxoBundle, savedStateHandle);
        OrderTimeInForceDuxo_MembersInjector.Companion companion2 = OrderTimeInForceDuxo_MembersInjector.INSTANCE;
        StringPreference stringPreference = this.defaultTimeInForcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectDefaultTimeInForcePref(orderTimeInForceDuxoNewInstance, stringPreference);
        return orderTimeInForceDuxoNewInstance;
    }

    /* compiled from: OrderTimeInForceDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J8\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo_Factory;", "marketHoursStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "defaultTimeInForcePref", "Lcom/robinhood/prefs/StringPreference;", "newInstance", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderTimeInForceDuxo_Factory create(Provider<MarketHoursStore> marketHoursStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<OrderTimeInForceStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<StringPreference> defaultTimeInForcePref) {
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
            return new OrderTimeInForceDuxo_Factory(marketHoursStore, marketHoursManager, orderExpireDateStore, stateProvider, duxoBundle, savedStateHandle, defaultTimeInForcePref);
        }

        @JvmStatic
        public final OrderTimeInForceDuxo newInstance(MarketHoursStore marketHoursStore, TraderMarketHoursManager marketHoursManager, EquityOrderExpireDateStore orderExpireDateStore, OrderTimeInForceStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OrderTimeInForceDuxo(marketHoursStore, marketHoursManager, orderExpireDateStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
