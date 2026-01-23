package com.robinhood.android.trade.equity.p261ui.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.recurring.upsell.EquityRecurringOrderUpsellManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.MarginAccountUpsellStore;
import com.robinhood.android.lib.margin.MarginUpsellStore;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.notification.dagger.ProductUpsellManagerFactory;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;

/* compiled from: OrderConfirmationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB«\u0003\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0004\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0004\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004¢\u0006\u0004\b@\u0010AJ\b\u0010B\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "dayTradeWarningsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "recurringOrderUpsellManager", "Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager;", "recurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "marginUpsellStore", "Lcom/robinhood/android/lib/margin/MarginUpsellStore;", "productUpsellManagerFactory", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "slipPostTradeUpsellStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "marginAccountUpsellStore", "Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OrderConfirmationDuxo_Factory implements Factory<OrderConfirmationDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<TraderDayTradeStore> dayTradeStore;
    private final Provider<DayTradeWarningsStore> dayTradeWarningsStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IacUpsellStore> iacUpsellStore;
    private final Provider<InstantCashLogger> instantCashLogger;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<MarginAccountUpsellStore> marginAccountUpsellStore;
    private final Provider<MarginUpsellStore> marginUpsellStore;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<EquityOrderManager> orderManager;
    private final Provider<OrderStore> orderStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<PositionStore> positionStore;
    private final Provider<ProductUpsellManagerFactory> productUpsellManagerFactory;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<EquityRecurringOrderUpsellManager> recurringOrderUpsellManager;
    private final Provider<TraderRecurringTradabilityStore> recurringTradabilityStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SlipPostTradeUpsellStore> slipPostTradeUpsellStore;
    private final Provider<TaxLotsCachedService> taxLotsCachedService;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderConfirmationDuxo_Factory create(Provider<AccountProvider> provider, Provider<TraderDayTradeStore> provider2, Provider<BackupWithholdingStore> provider3, Provider<ExperimentsStore> provider4, Provider<InstrumentStore> provider5, Provider<MarketHoursStore> provider6, Provider<EquityOrderManager> provider7, Provider<OrderStore> provider8, Provider<DayTradeWarningsStore> provider9, Provider<PositionStore> provider10, Provider<QuoteStore> provider11, Provider<EquityRecurringOrderUpsellManager> provider12, Provider<TraderRecurringTradabilityStore> provider13, Provider<MarginUpsellStore> provider14, Provider<ProductUpsellManagerFactory> provider15, Provider<TraderEventLogger> provider16, Provider<InstantCashLogger> provider17, Provider<RegionGateProvider> provider18, Provider<SlipPostTradeUpsellStore> provider19, Provider<IacUpsellStore> provider20, Provider<PerformanceLogger> provider21, Provider<AccountAccessStore> provider22, Provider<TaxLotsCachedService> provider23, Provider<UserStore> provider24, Provider<MarginAccountUpsellStore> provider25, Provider<SavedStateHandle> provider26, Provider<MicrogramComponent.Factory> provider27, Provider<DispatcherProvider> provider28, Provider<RxFactory> provider29, Provider<RxGlobalErrorHandler> provider30) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30);
    }

    @JvmStatic
    public static final OrderConfirmationDuxo newInstance(AccountProvider accountProvider, TraderDayTradeStore traderDayTradeStore, BackupWithholdingStore backupWithholdingStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, MarketHoursStore marketHoursStore, EquityOrderManager equityOrderManager, OrderStore orderStore, DayTradeWarningsStore dayTradeWarningsStore, PositionStore positionStore, QuoteStore quoteStore, EquityRecurringOrderUpsellManager equityRecurringOrderUpsellManager, TraderRecurringTradabilityStore traderRecurringTradabilityStore, MarginUpsellStore marginUpsellStore, ProductUpsellManagerFactory productUpsellManagerFactory, TraderEventLogger traderEventLogger, InstantCashLogger instantCashLogger, RegionGateProvider regionGateProvider, SlipPostTradeUpsellStore slipPostTradeUpsellStore, IacUpsellStore iacUpsellStore, PerformanceLogger performanceLogger, AccountAccessStore accountAccessStore, TaxLotsCachedService taxLotsCachedService, UserStore userStore, MarginAccountUpsellStore marginAccountUpsellStore, SavedStateHandle savedStateHandle, MicrogramComponent.Factory factory) {
        return INSTANCE.newInstance(accountProvider, traderDayTradeStore, backupWithholdingStore, experimentsStore, instrumentStore, marketHoursStore, equityOrderManager, orderStore, dayTradeWarningsStore, positionStore, quoteStore, equityRecurringOrderUpsellManager, traderRecurringTradabilityStore, marginUpsellStore, productUpsellManagerFactory, traderEventLogger, instantCashLogger, regionGateProvider, slipPostTradeUpsellStore, iacUpsellStore, performanceLogger, accountAccessStore, taxLotsCachedService, userStore, marginAccountUpsellStore, savedStateHandle, factory);
    }

    public OrderConfirmationDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<TraderDayTradeStore> dayTradeStore, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<MarketHoursStore> marketHoursStore, Provider<EquityOrderManager> orderManager, Provider<OrderStore> orderStore, Provider<DayTradeWarningsStore> dayTradeWarningsStore, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<EquityRecurringOrderUpsellManager> recurringOrderUpsellManager, Provider<TraderRecurringTradabilityStore> recurringTradabilityStore, Provider<MarginUpsellStore> marginUpsellStore, Provider<ProductUpsellManagerFactory> productUpsellManagerFactory, Provider<TraderEventLogger> eventLogger, Provider<InstantCashLogger> instantCashLogger, Provider<RegionGateProvider> regionGateProvider, Provider<SlipPostTradeUpsellStore> slipPostTradeUpsellStore, Provider<IacUpsellStore> iacUpsellStore, Provider<PerformanceLogger> performanceLogger, Provider<AccountAccessStore> accountAccessStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<UserStore> userStore, Provider<MarginAccountUpsellStore> marginAccountUpsellStore, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "dayTradeWarningsStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(recurringOrderUpsellManager, "recurringOrderUpsellManager");
        Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
        Intrinsics.checkNotNullParameter(marginUpsellStore, "marginUpsellStore");
        Intrinsics.checkNotNullParameter(productUpsellManagerFactory, "productUpsellManagerFactory");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(slipPostTradeUpsellStore, "slipPostTradeUpsellStore");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(marginAccountUpsellStore, "marginAccountUpsellStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountProvider = accountProvider;
        this.dayTradeStore = dayTradeStore;
        this.backupWithholdingStore = backupWithholdingStore;
        this.experimentsStore = experimentsStore;
        this.instrumentStore = instrumentStore;
        this.marketHoursStore = marketHoursStore;
        this.orderManager = orderManager;
        this.orderStore = orderStore;
        this.dayTradeWarningsStore = dayTradeWarningsStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.recurringOrderUpsellManager = recurringOrderUpsellManager;
        this.recurringTradabilityStore = recurringTradabilityStore;
        this.marginUpsellStore = marginUpsellStore;
        this.productUpsellManagerFactory = productUpsellManagerFactory;
        this.eventLogger = eventLogger;
        this.instantCashLogger = instantCashLogger;
        this.regionGateProvider = regionGateProvider;
        this.slipPostTradeUpsellStore = slipPostTradeUpsellStore;
        this.iacUpsellStore = iacUpsellStore;
        this.performanceLogger = performanceLogger;
        this.accountAccessStore = accountAccessStore;
        this.taxLotsCachedService = taxLotsCachedService;
        this.userStore = userStore;
        this.marginAccountUpsellStore = marginAccountUpsellStore;
        this.savedStateHandle = savedStateHandle;
        this.microgramComponentFactory = microgramComponentFactory;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public OrderConfirmationDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        TraderDayTradeStore traderDayTradeStore = this.dayTradeStore.get();
        Intrinsics.checkNotNullExpressionValue(traderDayTradeStore, "get(...)");
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        EquityOrderManager equityOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderManager, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        DayTradeWarningsStore dayTradeWarningsStore = this.dayTradeWarningsStore.get();
        Intrinsics.checkNotNullExpressionValue(dayTradeWarningsStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        EquityRecurringOrderUpsellManager equityRecurringOrderUpsellManager = this.recurringOrderUpsellManager.get();
        Intrinsics.checkNotNullExpressionValue(equityRecurringOrderUpsellManager, "get(...)");
        TraderRecurringTradabilityStore traderRecurringTradabilityStore = this.recurringTradabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(traderRecurringTradabilityStore, "get(...)");
        MarginUpsellStore marginUpsellStore = this.marginUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(marginUpsellStore, "get(...)");
        MarginUpsellStore marginUpsellStore2 = marginUpsellStore;
        ProductUpsellManagerFactory productUpsellManagerFactory = this.productUpsellManagerFactory.get();
        Intrinsics.checkNotNullExpressionValue(productUpsellManagerFactory, "get(...)");
        ProductUpsellManagerFactory productUpsellManagerFactory2 = productUpsellManagerFactory;
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        TraderEventLogger traderEventLogger2 = traderEventLogger;
        InstantCashLogger instantCashLogger = this.instantCashLogger.get();
        Intrinsics.checkNotNullExpressionValue(instantCashLogger, "get(...)");
        InstantCashLogger instantCashLogger2 = instantCashLogger;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        SlipPostTradeUpsellStore slipPostTradeUpsellStore = this.slipPostTradeUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(slipPostTradeUpsellStore, "get(...)");
        SlipPostTradeUpsellStore slipPostTradeUpsellStore2 = slipPostTradeUpsellStore;
        IacUpsellStore iacUpsellStore = this.iacUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(iacUpsellStore, "get(...)");
        IacUpsellStore iacUpsellStore2 = iacUpsellStore;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountAccessStore accountAccessStore2 = accountAccessStore;
        TaxLotsCachedService taxLotsCachedService = this.taxLotsCachedService.get();
        Intrinsics.checkNotNullExpressionValue(taxLotsCachedService, "get(...)");
        TaxLotsCachedService taxLotsCachedService2 = taxLotsCachedService;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        UserStore userStore2 = userStore;
        MarginAccountUpsellStore marginAccountUpsellStore = this.marginAccountUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(marginAccountUpsellStore, "get(...)");
        MarginAccountUpsellStore marginAccountUpsellStore2 = marginAccountUpsellStore;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        OrderConfirmationDuxo orderConfirmationDuxoNewInstance = companion.newInstance(accountProvider, traderDayTradeStore, backupWithholdingStore, experimentsStore, instrumentStore, marketHoursStore, equityOrderManager, orderStore, dayTradeWarningsStore, positionStore, quoteStore, equityRecurringOrderUpsellManager, traderRecurringTradabilityStore, marginUpsellStore2, productUpsellManagerFactory2, traderEventLogger2, instantCashLogger2, regionGateProvider2, slipPostTradeUpsellStore2, iacUpsellStore2, performanceLogger2, accountAccessStore2, taxLotsCachedService2, userStore2, marginAccountUpsellStore2, savedStateHandle2, factory);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(orderConfirmationDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(orderConfirmationDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(orderConfirmationDuxoNewInstance, rxGlobalErrorHandler);
        return orderConfirmationDuxoNewInstance;
    }

    /* compiled from: OrderConfirmationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¬\u0003\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00072\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00072\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0007H\u0007Jà\u0001\u0010C\u001a\u00020D2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0007¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "dayTradeWarningsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "recurringOrderUpsellManager", "Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager;", "recurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "marginUpsellStore", "Lcom/robinhood/android/lib/margin/MarginUpsellStore;", "productUpsellManagerFactory", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "slipPostTradeUpsellStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "marginAccountUpsellStore", "Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderConfirmationDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<TraderDayTradeStore> dayTradeStore, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<MarketHoursStore> marketHoursStore, Provider<EquityOrderManager> orderManager, Provider<OrderStore> orderStore, Provider<DayTradeWarningsStore> dayTradeWarningsStore, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<EquityRecurringOrderUpsellManager> recurringOrderUpsellManager, Provider<TraderRecurringTradabilityStore> recurringTradabilityStore, Provider<MarginUpsellStore> marginUpsellStore, Provider<ProductUpsellManagerFactory> productUpsellManagerFactory, Provider<TraderEventLogger> eventLogger, Provider<InstantCashLogger> instantCashLogger, Provider<RegionGateProvider> regionGateProvider, Provider<SlipPostTradeUpsellStore> slipPostTradeUpsellStore, Provider<IacUpsellStore> iacUpsellStore, Provider<PerformanceLogger> performanceLogger, Provider<AccountAccessStore> accountAccessStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<UserStore> userStore, Provider<MarginAccountUpsellStore> marginAccountUpsellStore, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "dayTradeWarningsStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(recurringOrderUpsellManager, "recurringOrderUpsellManager");
            Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
            Intrinsics.checkNotNullParameter(marginUpsellStore, "marginUpsellStore");
            Intrinsics.checkNotNullParameter(productUpsellManagerFactory, "productUpsellManagerFactory");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(slipPostTradeUpsellStore, "slipPostTradeUpsellStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(marginAccountUpsellStore, "marginAccountUpsellStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OrderConfirmationDuxo_Factory(accountProvider, dayTradeStore, backupWithholdingStore, experimentsStore, instrumentStore, marketHoursStore, orderManager, orderStore, dayTradeWarningsStore, positionStore, quoteStore, recurringOrderUpsellManager, recurringTradabilityStore, marginUpsellStore, productUpsellManagerFactory, eventLogger, instantCashLogger, regionGateProvider, slipPostTradeUpsellStore, iacUpsellStore, performanceLogger, accountAccessStore, taxLotsCachedService, userStore, marginAccountUpsellStore, savedStateHandle, microgramComponentFactory, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final OrderConfirmationDuxo newInstance(AccountProvider accountProvider, TraderDayTradeStore dayTradeStore, BackupWithholdingStore backupWithholdingStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, MarketHoursStore marketHoursStore, EquityOrderManager orderManager, OrderStore orderStore, DayTradeWarningsStore dayTradeWarningsStore, PositionStore positionStore, QuoteStore quoteStore, EquityRecurringOrderUpsellManager recurringOrderUpsellManager, TraderRecurringTradabilityStore recurringTradabilityStore, MarginUpsellStore marginUpsellStore, ProductUpsellManagerFactory productUpsellManagerFactory, TraderEventLogger eventLogger, InstantCashLogger instantCashLogger, RegionGateProvider regionGateProvider, SlipPostTradeUpsellStore slipPostTradeUpsellStore, IacUpsellStore iacUpsellStore, PerformanceLogger performanceLogger, AccountAccessStore accountAccessStore, TaxLotsCachedService taxLotsCachedService, UserStore userStore, MarginAccountUpsellStore marginAccountUpsellStore, SavedStateHandle savedStateHandle, MicrogramComponent.Factory microgramComponentFactory) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(dayTradeWarningsStore, "dayTradeWarningsStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(recurringOrderUpsellManager, "recurringOrderUpsellManager");
            Intrinsics.checkNotNullParameter(recurringTradabilityStore, "recurringTradabilityStore");
            Intrinsics.checkNotNullParameter(marginUpsellStore, "marginUpsellStore");
            Intrinsics.checkNotNullParameter(productUpsellManagerFactory, "productUpsellManagerFactory");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(slipPostTradeUpsellStore, "slipPostTradeUpsellStore");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(marginAccountUpsellStore, "marginAccountUpsellStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            return new OrderConfirmationDuxo(accountProvider, dayTradeStore, backupWithholdingStore, experimentsStore, instrumentStore, marketHoursStore, orderManager, orderStore, dayTradeWarningsStore, positionStore, quoteStore, recurringOrderUpsellManager, recurringTradabilityStore, marginUpsellStore, productUpsellManagerFactory, eventLogger, instantCashLogger, regionGateProvider, slipPostTradeUpsellStore, iacUpsellStore, performanceLogger, accountAccessStore, taxLotsCachedService, userStore, marginAccountUpsellStore, savedStateHandle, microgramComponentFactory);
        }
    }
}
