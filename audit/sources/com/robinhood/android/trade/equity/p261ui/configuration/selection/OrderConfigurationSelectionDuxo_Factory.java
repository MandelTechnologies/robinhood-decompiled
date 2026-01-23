package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.EquityOrderTypeSelectorStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TaxLotEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BÙ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityOrderTypeSelectorStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderTypeSelectorStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderConfigurationContextFactory", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "taxLotEligibilityStore", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OrderConfigurationSelectionDuxo_Factory implements Factory<OrderConfigurationSelectionDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityOrderTypeSelectorStore> equityOrderTypeSelectorStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<OrderConfigurationContextFactory> orderConfigurationContextFactory;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OrderConfigurationSelectionStateProvider> stateProvider;
    private final Provider<TaxLotEligibilityStore> taxLotEligibilityStore;
    private final Provider<TaxLotsCachedService> taxLotsCachedService;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderConfigurationSelectionDuxo_Factory create(Provider<AccountProvider> provider, Provider<EquityOrderTypeSelectorStore> provider2, Provider<InstrumentStore> provider3, Provider<TraderRecurringTradabilityStore> provider4, Provider<TraderMarketHoursManager> provider5, Provider<OrderConfigurationContextFactory> provider6, Provider<EventLogger> provider7, Provider<RegionGateProvider> provider8, Provider<AccountAccessStore> provider9, Provider<TaxLotEligibilityStore> provider10, Provider<TaxLotsCachedService> provider11, Provider<UserStore> provider12, Provider<OrderConfigurationSelectionStateProvider> provider13, Provider<DuxoBundle> provider14, Provider<SavedStateHandle> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final OrderConfigurationSelectionDuxo newInstance(AccountProvider accountProvider, EquityOrderTypeSelectorStore equityOrderTypeSelectorStore, InstrumentStore instrumentStore, TraderRecurringTradabilityStore traderRecurringTradabilityStore, TraderMarketHoursManager traderMarketHoursManager, OrderConfigurationContextFactory orderConfigurationContextFactory, EventLogger eventLogger, RegionGateProvider regionGateProvider, AccountAccessStore accountAccessStore, TaxLotEligibilityStore taxLotEligibilityStore, TaxLotsCachedService taxLotsCachedService, UserStore userStore, OrderConfigurationSelectionStateProvider orderConfigurationSelectionStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, equityOrderTypeSelectorStore, instrumentStore, traderRecurringTradabilityStore, traderMarketHoursManager, orderConfigurationContextFactory, eventLogger, regionGateProvider, accountAccessStore, taxLotEligibilityStore, taxLotsCachedService, userStore, orderConfigurationSelectionStateProvider, duxoBundle, savedStateHandle);
    }

    public OrderConfigurationSelectionDuxo_Factory(Provider<AccountProvider> accountStore, Provider<EquityOrderTypeSelectorStore> equityOrderTypeSelectorStore, Provider<InstrumentStore> instrumentStore, Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<OrderConfigurationContextFactory> orderConfigurationContextFactory, Provider<EventLogger> eventLogger, Provider<RegionGateProvider> regionGateProvider, Provider<AccountAccessStore> accountAccessStore, Provider<TaxLotEligibilityStore> taxLotEligibilityStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<UserStore> userStore, Provider<OrderConfigurationSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(equityOrderTypeSelectorStore, "equityOrderTypeSelectorStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "orderConfigurationContextFactory");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountStore = accountStore;
        this.equityOrderTypeSelectorStore = equityOrderTypeSelectorStore;
        this.instrumentStore = instrumentStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.marketHoursManager = marketHoursManager;
        this.orderConfigurationContextFactory = orderConfigurationContextFactory;
        this.eventLogger = eventLogger;
        this.regionGateProvider = regionGateProvider;
        this.accountAccessStore = accountAccessStore;
        this.taxLotEligibilityStore = taxLotEligibilityStore;
        this.taxLotsCachedService = taxLotsCachedService;
        this.userStore = userStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OrderConfigurationSelectionDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountStore.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        EquityOrderTypeSelectorStore equityOrderTypeSelectorStore = this.equityOrderTypeSelectorStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderTypeSelectorStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        TraderRecurringTradabilityStore traderRecurringTradabilityStore = this.instrumentRecurringTradabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(traderRecurringTradabilityStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        OrderConfigurationContextFactory orderConfigurationContextFactory = this.orderConfigurationContextFactory.get();
        Intrinsics.checkNotNullExpressionValue(orderConfigurationContextFactory, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        TaxLotEligibilityStore taxLotEligibilityStore = this.taxLotEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(taxLotEligibilityStore, "get(...)");
        TaxLotsCachedService taxLotsCachedService = this.taxLotsCachedService.get();
        Intrinsics.checkNotNullExpressionValue(taxLotsCachedService, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        OrderConfigurationSelectionStateProvider orderConfigurationSelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(orderConfigurationSelectionStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, equityOrderTypeSelectorStore, instrumentStore, traderRecurringTradabilityStore, traderMarketHoursManager, orderConfigurationContextFactory, eventLogger, regionGateProvider, accountAccessStore, taxLotEligibilityStore, taxLotsCachedService, userStore, orderConfigurationSelectionStateProvider, duxoBundle2, savedStateHandle);
    }

    /* compiled from: OrderConfigurationSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÚ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0007H\u0007J\u0080\u0001\u0010%\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo_Factory;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityOrderTypeSelectorStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderTypeSelectorStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderConfigurationContextFactory", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "taxLotEligibilityStore", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDuxo;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderConfigurationSelectionDuxo_Factory create(Provider<AccountProvider> accountStore, Provider<EquityOrderTypeSelectorStore> equityOrderTypeSelectorStore, Provider<InstrumentStore> instrumentStore, Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<OrderConfigurationContextFactory> orderConfigurationContextFactory, Provider<EventLogger> eventLogger, Provider<RegionGateProvider> regionGateProvider, Provider<AccountAccessStore> accountAccessStore, Provider<TaxLotEligibilityStore> taxLotEligibilityStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<UserStore> userStore, Provider<OrderConfigurationSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(equityOrderTypeSelectorStore, "equityOrderTypeSelectorStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "orderConfigurationContextFactory");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OrderConfigurationSelectionDuxo_Factory(accountStore, equityOrderTypeSelectorStore, instrumentStore, instrumentRecurringTradabilityStore, marketHoursManager, orderConfigurationContextFactory, eventLogger, regionGateProvider, accountAccessStore, taxLotEligibilityStore, taxLotsCachedService, userStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final OrderConfigurationSelectionDuxo newInstance(AccountProvider accountStore, EquityOrderTypeSelectorStore equityOrderTypeSelectorStore, InstrumentStore instrumentStore, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, TraderMarketHoursManager marketHoursManager, OrderConfigurationContextFactory orderConfigurationContextFactory, EventLogger eventLogger, RegionGateProvider regionGateProvider, AccountAccessStore accountAccessStore, TaxLotEligibilityStore taxLotEligibilityStore, TaxLotsCachedService taxLotsCachedService, UserStore userStore, OrderConfigurationSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(equityOrderTypeSelectorStore, "equityOrderTypeSelectorStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderConfigurationContextFactory, "orderConfigurationContextFactory");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OrderConfigurationSelectionDuxo(accountStore, equityOrderTypeSelectorStore, instrumentStore, instrumentRecurringTradabilityStore, marketHoursManager, orderConfigurationContextFactory, eventLogger, regionGateProvider, accountAccessStore, taxLotEligibilityStore, taxLotsCachedService, userStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
