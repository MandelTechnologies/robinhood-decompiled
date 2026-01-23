package com.robinhood.android.trade.equity.p261ui.confirmation;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.recurring.upsell.EquityRecurringOrderUpsellManager;
import com.robinhood.android.common.recurring.upsell.RecurringOrderUpsellManager;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.TaxLotsM1Experiment;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.instant.p160ui.InstantCashLogger2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.MarginAccountUpsellStore;
import com.robinhood.android.lib.margin.MarginUpsellStore;
import com.robinhood.android.lib.margin.api.ApiMarginUpsell;
import com.robinhood.android.lib.margin.api.models.EnableMarginUpsellOrderType;
import com.robinhood.android.margin.contracts.SlipUpsellKey;
import com.robinhood.android.margin.experiments.PdtRevampExpV2;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.notification.dagger.ProductUpsellManagerFactory;
import com.robinhood.android.notification.data.ProductUpsellManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.android.recurring.experiments.RecurringJointAccountsExperiment;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.trade.equity.EquitiesOrderConfirmationMicrogram;
import com.robinhood.android.trade.equity.p261ui.confirmation.OrderConfirmationDuxo;
import com.robinhood.android.trade.equity.p261ui.confirmation.OrderConfirmationFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiPosition;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.EquityOrderExecutionData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import equity_order_summary.proto.p459v1.StreamOrderConfirmationResponseDto;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponse;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.Monitoring;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: OrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001[Bá\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\u0006\u00108\u001a\u000209¢\u0006\u0004\b:\u0010;J\b\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020LH\u0016J\b\u0010N\u001a\u00020LH\u0016J\u000e\u0010O\u001a\u00020L2\u0006\u0010P\u001a\u00020QJ\u000e\u0010R\u001a\u00020L2\u0006\u0010P\u001a\u00020QJ\u0006\u0010S\u001a\u00020LJ\u0006\u0010T\u001a\u00020LJ\u0006\u0010U\u001a\u00020LJ\u0006\u0010V\u001a\u00020LJ\u0006\u0010W\u001a\u00020LJ\u0006\u0010X\u001a\u00020LJ\u0006\u0010Y\u001a\u00020LJ\u0006\u0010Z\u001a\u00020LR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u000207X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010@\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bB\u0010CR\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bH\u0010I¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "dayTradeWarningsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "recurringOrderUpsellManager", "Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager;", "recurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "marginUpsellStore", "Lcom/robinhood/android/lib/margin/MarginUpsellStore;", "productUpsellManagerFactory", "Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "slipPostTradeUpsellStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "marginAccountUpsellStore", "Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/android/equity/submission/EquityOrderManager;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/librobinhood/data/store/bonfire/daytrades/store/DayTradeWarningsStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager;Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;Lcom/robinhood/android/lib/margin/MarginUpsellStore;Lcom/robinhood/android/notification/dagger/ProductUpsellManagerFactory;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/android/instant/ui/InstantCashLogger;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore;Lcom/robinhood/shared/data/store/iac/IacUpsellStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/margin/MarginAccountUpsellStore;Landroidx/lifecycle/SavedStateHandle;Lmicrogram/android/inject/MicrogramComponent$Factory;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "confirmationComponent", "Lmicrogram/android/inject/MicrogramComponent;", "orderConfirmationService", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "getOrderConfirmationService", "()Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "orderConfirmationService$delegate", "Lkotlin/Lazy;", "notificationUpsellManager", "Lcom/robinhood/android/notification/data/ProductUpsellManager;", "getNotificationUpsellManager", "()Lcom/robinhood/android/notification/data/ProductUpsellManager;", "notificationUpsellManager$delegate", "onCreate", "", "onStart", "onResume", "onOrderReceived", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "onOrderUpdated", "markUpsellViewCount", "logRecurringUpsellAppear", "logRecurringUpsellTap", "logRecurringUpsellGetStartedTap", "seenMarginUpsell", "logLaunchMarginUpgrade", "logDismissMarginUpsell", "logConfirmationShown", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfirmationDuxo extends OldBaseDuxo<OrderConfirmationViewState> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final BackupWithholdingStore backupWithholdingStore;
    private final MicrogramComponent confirmationComponent;
    private final TraderDayTradeStore dayTradeStore;
    private final DayTradeWarningsStore dayTradeWarningsStore;
    private final TraderEventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final IacUpsellStore iacUpsellStore;
    private final InstantCashLogger instantCashLogger;
    private final InstrumentStore instrumentStore;
    private final MarginAccountUpsellStore marginAccountUpsellStore;
    private final MarginUpsellStore marginUpsellStore;
    private final MarketHoursStore marketHoursStore;

    /* renamed from: notificationUpsellManager$delegate, reason: from kotlin metadata */
    private final Lazy notificationUpsellManager;

    /* renamed from: orderConfirmationService$delegate, reason: from kotlin metadata */
    private final Lazy orderConfirmationService;
    private final EquityOrderManager orderManager;
    private final OrderStore orderStore;
    private final PerformanceLogger performanceLogger;
    private final PositionStore positionStore;
    private final ProductUpsellManagerFactory productUpsellManagerFactory;
    private final QuoteStore quoteStore;
    private final EquityRecurringOrderUpsellManager recurringOrderUpsellManager;
    private final TraderRecurringTradabilityStore recurringTradabilityStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final SlipPostTradeUpsellStore slipPostTradeUpsellStore;
    private final TaxLotsCachedService taxLotsCachedService;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ComponentHierarchy MARGIN_UPSELL_COMPONENT_HIERARCHY = new ComponentHierarchy(new Component(Component.ComponentType.INFO_BANNER, InstantCashLogger2.EQUITY_TRADE_FLOW_MARGIN_UPSELL.getValue(), null, 4, null), null, null, null, null, 30, null);

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderConfirmationDuxo(AccountProvider accountProvider, TraderDayTradeStore dayTradeStore, BackupWithholdingStore backupWithholdingStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, MarketHoursStore marketHoursStore, EquityOrderManager orderManager, OrderStore orderStore, DayTradeWarningsStore dayTradeWarningsStore, PositionStore positionStore, QuoteStore quoteStore, EquityRecurringOrderUpsellManager recurringOrderUpsellManager, TraderRecurringTradabilityStore recurringTradabilityStore, MarginUpsellStore marginUpsellStore, ProductUpsellManagerFactory productUpsellManagerFactory, TraderEventLogger eventLogger, InstantCashLogger instantCashLogger, RegionGateProvider regionGateProvider, SlipPostTradeUpsellStore slipPostTradeUpsellStore, IacUpsellStore iacUpsellStore, PerformanceLogger performanceLogger, AccountAccessStore accountAccessStore, TaxLotsCachedService taxLotsCachedService, UserStore userStore, MarginAccountUpsellStore marginAccountUpsellStore, SavedStateHandle savedStateHandle, MicrogramComponent.Factory microgramComponentFactory) {
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
        Companion companion = INSTANCE;
        super(new OrderConfirmationViewState(null, null, ((OrderConfirmationFragment.Args) companion.getArgs(savedStateHandle)).isPreIpo(), false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, ((OrderConfirmationFragment.Args) companion.getArgs(savedStateHandle)).isTaxLots(), false, 805306363, null), null, 2, null);
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
        this.confirmationComponent = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-equity-order-summary", null, 2, null), null, 4, null);
        this.orderConfirmationService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationDuxo.orderConfirmationService_delegate$lambda$0(this.f$0);
            }
        });
        this.notificationUpsellManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderConfirmationDuxo.notificationUpsellManager_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderSummaryService getOrderConfirmationService() {
        return (EquityOrderSummaryService) this.orderConfirmationService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderSummaryService orderConfirmationService_delegate$lambda$0(OrderConfirmationDuxo orderConfirmationDuxo) {
        return (EquityOrderSummaryService) orderConfirmationDuxo.confirmationComponent.getServiceLocator().getClient(EquityOrderSummaryService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductUpsellManager getNotificationUpsellManager() {
        return (ProductUpsellManager) this.notificationUpsellManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductUpsellManager notificationUpsellManager_delegate$lambda$1(OrderConfirmationDuxo orderConfirmationDuxo) {
        return orderConfirmationDuxo.productUpsellManagerFactory.create(ProductUpsellKey.INSTANCE.getUpsellNotificationPostEquityTrade());
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C294621(null));
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1", m3645f = "OrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1 */
    static final class C294621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294621(Continuation<? super C294621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfirmationDuxo.this.new C294621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OrderConfirmationDuxo.this.experimentsStore, new Experiment[]{PdtRevampExpV2.INSTANCE}, false, null, 6, null);
                final OrderConfirmationDuxo orderConfirmationDuxo = OrderConfirmationDuxo.this;
                Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamStateFlow$default.collect(new C294572(flowCollector, orderConfirmationDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C294572<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ OrderConfirmationDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "OrderConfirmationDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C294572.this.emit(null, this);
                            }
                        }

                        public C294572(FlowCollector flowCollector, OrderConfirmationDuxo orderConfirmationDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = orderConfirmationDuxo;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Boolean boolBoxBoolean = boxing.boxBoolean(((Boolean) obj).booleanValue() ? this.this$0.marginAccountUpsellStore.showMarginAccountUpsell() : false);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showMarginAccountUpsell", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1$2", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = orderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final boolean z = this.Z$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onCreate$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OrderConfirmationDuxo.C294621.AnonymousClass2.invokeSuspend$lambda$0(z, (OrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderConfirmationViewState invokeSuspend$lambda$0(boolean z, OrderConfirmationViewState orderConfirmationViewState) {
                return OrderConfirmationViewState.copy$default(orderConfirmationViewState, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, z, null, null, null, false, false, null, false, false, false, 1072693247, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onStart$lambda$3(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(OrderConfirmationDuxo orderConfirmationDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onStart$lambda$3$lambda$2(user, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onStart$lambda$3$lambda$2(User user, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, user.getIsUk(), 536870911, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OrderConfirmationViewState) it).getCurrentOrder());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OrderConfirmationDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableRefCount = ObservablesKt.filterIsPresent(map).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableRefCount2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$orderSubzeroStatusObservable$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return Boolean.valueOf(order.isBuyToClose() || order.getSide() == EquityOrderSide.SELL_SHORT);
            }
        }).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        Observable observableRefCount3 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$accountObservable$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                this.this$0.accountProvider.refresh(false);
                return this.this$0.accountProvider.streamAccount(order.getAccountNumber());
            }
        }).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount3, "refCount(...)");
        Observables observables = Observables.INSTANCE;
        Observable observableSwitchMap = observableRefCount3.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$isRecurringSupportedObservable$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                OrderConfirmationDuxo orderConfirmationDuxo = this.this$0;
                return orderConfirmationDuxo.asObservable(orderConfirmationDuxo.accountAccessStore.getFeatureAccess(account.getAccountNumber(), AccountFeature.RECURRING));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        Observable observableCombineLatest = Observable.combineLatest(observableSwitchMap, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null), observableRefCount2, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) Boolean.valueOf(((Boolean) t1).booleanValue() && ((Boolean) t2).booleanValue() && !((Boolean) t3).booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable observableRefCount4 = observableCombineLatest.distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount4, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$6(this.f$0, (Account) obj);
            }
        });
        Observable observableSwitchMap2 = observableRefCount3.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                if (account.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                    return ExperimentsProvider.DefaultImpls.streamVariant$default(OrderConfirmationDuxo.this.experimentsStore, RecurringJointAccountsExperiment.INSTANCE, RecurringJointAccountsExperiment.Variants.INSTANCE.getDefault(), false, 4, null).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.2.1
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(RecurringJointAccountsExperiment.Variants it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Boolean.valueOf(RecurringJointAccountsExperiment.INSTANCE.isMemberAboveHoldout(it));
                        }
                    });
                }
                return Observable.just(Boolean.TRUE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$8(this.f$0, (Boolean) obj);
            }
        });
        Observable observableRefCount5 = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$instrumentIdObservable$1
            @Override // io.reactivex.functions.Function
            public final UUID apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return order.getInstrument();
            }
        }).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount5, "refCount(...)");
        Observable observableSwitchMap3 = observableRefCount5.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return OrderConfirmationDuxo.this.instrumentStore.getInstrument(instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$10(this.f$0, (Instrument) obj);
            }
        });
        Observable observableSwitchMap4 = observableRefCount5.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return OrderConfirmationDuxo.this.quoteStore.getStreamQuote().asObservable(instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$12(this.f$0, (Quote) obj);
            }
        });
        Observable observableSwitchMap5 = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.8
            @Override // io.reactivex.functions.Function
            public final Tuples2<UUID, Boolean> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return Tuples4.m3642to(order.getId(), Boolean.valueOf(OrderConfirmationDuxo.this.orderManager.isFinal(order)));
            }
        }).distinctUntilChanged(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.9
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Tuples2<UUID, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Boolean boolComponent2 = tuples2.component2();
                boolComponent2.booleanValue();
                return boolComponent2;
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.10
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Order> apply(Tuples2<UUID, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                UUID uuidComponent1 = tuples2.component1();
                if (!tuples2.component2().booleanValue()) {
                    return OrderConfirmationDuxo.this.orderStore.poll(uuidComponent1, Durations.INSTANCE.getONE_SECOND());
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap5, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$14(this.f$0, (Order) obj);
            }
        });
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableRefCount), Integer.MAX_VALUE, null, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(FlowKt.mapLatest(new Flow<Order>() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Order> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C294582(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$$inlined$filter$1$2 */
            public static final class C294582<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$$inlined$filter$1$2", m3645f = "OrderConfirmationDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C294582.this.emit(null, this);
                    }
                }

                public C294582(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((Order) obj).getSide() == EquityOrderSide.BUY) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new C2946413(null))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$17(this.f$0, (Result) obj);
            }
        });
        Observable observableSwitchMapSingle = observableRefCount.switchMapSingle(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.15
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends RecurringOrderUpsellManager.RecurringUpsell> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OrderConfirmationDuxo.this.recurringOrderUpsellManager.getEquityRecurringUpsell(order);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMapSingle, observableRefCount4, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$19(this.f$0, (RecurringOrderUpsellManager.RecurringUpsell) obj);
            }
        });
        Observable observableSwitchMap6 = observableRefCount.filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.17
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getState().isFinal();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.18
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiPosition> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return PositionStore.pollForAccount$default(OrderConfirmationDuxo.this.positionStore, order.getInstrument(), order.getAccountNumber(), null, 4, null).take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap6, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap6, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        final C2946819 c2946819 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.19
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Order) obj).getAccountNumber();
            }
        };
        Observable observableSwitchMap7 = observableRefCount.map(new Function(c2946819) { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c2946819, "function");
                this.function = c2946819;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.20
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Integer> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return OrderConfirmationDuxo.this.orderStore.getOrderCount(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap7, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap7, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$21(this.f$0, ((Integer) obj).intValue());
            }
        });
        Observable observableDistinctUntilChanged = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.22
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OrderConfirmationViewState state) {
                EquityOrderSide side;
                Intrinsics.checkNotNullParameter(state, "state");
                Order currentOrder = state.getCurrentOrder();
                return (currentOrder == null || (side = currentOrder.getSide()) == null || !side.isSell()) ? false : true;
            }
        }).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.23

            /* compiled from: OrderConfirmationDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$23$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Order.Configuration.values().length];
                    try {
                        iArr[Order.Configuration.MARKET.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Order.Configuration.LIMIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Order.Configuration.STOP_LOSS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final Tuples3<BigDecimal, String, UUID> apply(OrderConfirmationViewState state) {
                BigDecimal decimalValue;
                Money lastTradePrice;
                Intrinsics.checkNotNullParameter(state, "state");
                Order currentOrder = state.getCurrentOrder();
                Intrinsics.checkNotNull(currentOrder);
                BigDecimal bigDecimalMultiply = null;
                if (currentOrder.isDollarBased()) {
                    Money dollarBasedAmount = currentOrder.getDollarBasedAmount();
                    if (dollarBasedAmount != null) {
                        bigDecimalMultiply = dollarBasedAmount.getDecimalValue();
                    }
                } else {
                    switch (WhenMappings.$EnumSwitchMapping$0[currentOrder.getConfiguration().ordinal()]) {
                        case 1:
                        case 2:
                            Quote quote = state.getQuote();
                            if (quote != null && (lastTradePrice = quote.getLastTradePrice()) != null) {
                                decimalValue = lastTradePrice.getDecimalValue();
                                break;
                            } else {
                                decimalValue = null;
                                break;
                            }
                        case 3:
                            decimalValue = currentOrder.getPrice();
                            break;
                        case 4:
                        case 5:
                        case 6:
                            decimalValue = currentOrder.getStopPrice();
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (decimalValue != null) {
                        BigDecimal quantity = currentOrder.getQuantity();
                        if (quantity == null) {
                            quantity = BigDecimal.ZERO;
                        }
                        bigDecimalMultiply = decimalValue.multiply(quantity);
                    }
                }
                return new Tuples3<>(bigDecimalMultiply, currentOrder.getAccountNumber(), currentOrder.getInstrument());
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.24
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples3<? extends BigDecimal, String, UUID> pair) {
                Intrinsics.checkNotNullParameter(pair, "pair");
                return !BigDecimals7.isZero(pair.getFirst());
            }
        }).distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.25
            @Override // io.reactivex.functions.Function
            public final EquitiesMlpWithholdingParams apply(Tuples3<? extends BigDecimal, String, UUID> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                return new EquitiesMlpWithholdingParams(tuples3.component1(), tuples3.component2(), tuples3.component3());
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.26
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingEstimatedAmount>> apply(EquitiesMlpWithholdingParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                BigDecimal amount = params.getAmount();
                if (amount == null) {
                    throw new IllegalStateException("Amount should not be null");
                }
                return OrderConfirmationDuxo.this.backupWithholdingStore.streamTaxWithholdingEstimatedAmount(amount, params.getAccount(), params.getInstrumentId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$23(this.f$0, (Optional) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2947628(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2947729(observableRefCount, null), 3, null);
        Observable observableSwitchMap8 = observableRefCount5.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.30
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InstrumentRecurringTradability> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                TraderRecurringTradabilityStore.refresh$default(OrderConfirmationDuxo.this.recurringTradabilityStore, instrumentId, false, 2, null);
                OrderConfirmationDuxo orderConfirmationDuxo = OrderConfirmationDuxo.this;
                return orderConfirmationDuxo.asObservable(orderConfirmationDuxo.recurringTradabilityStore.streamRecurringInstrumentTradable(instrumentId));
            }
        });
        final C2947931 c2947931 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.31
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((InstrumentRecurringTradability) obj).isRecurringTradable());
            }
        };
        Observable map2 = observableSwitchMap8.map(new Function(c2947931) { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c2947931, "function");
                this.function = c2947931;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(map2, observableRefCount4, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$25(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, MarketHoursStore.getAndRefreshNextOpenMarketHours$default(this.marketHoursStore, false, false, 3, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$27(this.f$0, (MarketHours) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = observableRefCount.filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.34
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getState().hasExecutions();
            }
        }).distinctUntilChanged().switchMapMaybe(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.35

            /* compiled from: OrderConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/ClientComponentAlert;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$35$1", m3645f = "OrderConfirmationDuxo.kt", m3646l = {463}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$35$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ClientComponentAlert>, Object> {
                final /* synthetic */ Order $order;
                int label;
                final /* synthetic */ OrderConfirmationDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OrderConfirmationDuxo orderConfirmationDuxo, Order order, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = orderConfirmationDuxo;
                    this.$order = order;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$order, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ClientComponentAlert> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    DayTradeWarningsStore dayTradeWarningsStore = this.this$0.dayTradeWarningsStore;
                    UUID id = this.$order.getId();
                    String accountNumber = this.$order.getAccountNumber();
                    this.label = 1;
                    Object equitiesWarning = dayTradeWarningsStore.getEquitiesWarning(id, accountNumber, this);
                    return equitiesWarning == coroutine_suspended ? coroutine_suspended : equitiesWarning;
                }
            }

            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ClientComponentAlert> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                OrderConfirmationDuxo orderConfirmationDuxo = OrderConfirmationDuxo.this;
                return RxFactory.DefaultImpls.rxMaybe$default(orderConfirmationDuxo, null, new AnonymousClass1(orderConfirmationDuxo, order, null), 1, null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$29(this.f$0, (ClientComponentAlert) obj);
            }
        });
        Observable observableFilter = observableRefCount.filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.37
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getState() == EquityOrderState.FILLED;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable observableConnectWhen$default = ObservablesKt.connectWhen$default(observableFilter, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, LeveredMarginRegionGate.INSTANCE, false, 2, null), null, 2, null);
        Observable map3 = observableRefCount2.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.38
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableSwitchMapSingle2 = ObservablesKt.connectWhen$default(observableConnectWhen$default, map3, null, 2, null).switchMapSingle(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.39
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiMarginUpsell> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OrderConfirmationDuxo.this.marginUpsellStore.getMarginUpsell(order.getAccountNumber(), EnableMarginUpsellOrderType.EQUITY, order.getId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle2, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle2, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$31(this.f$0, (ApiMarginUpsell) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$32((Throwable) obj);
            }
        }, null, null, 12, null);
        Observable observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C2948642(null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable map4 = observableRefCount2.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.43
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observable, map4, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$34(this.f$0, (Boolean) obj);
            }
        });
        Observable observableFlatMapSingle = observableRefCount.take(1L).flatMapSingle(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.45
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<IacUpsell>> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OrderConfirmationDuxo.this.iacUpsellStore.getPostTradeUpsell(order.getInstrument(), order.getId(), order.getAccountNumber(), OrderConfirmationDuxo.this.getNotificationUpsellManager().notificationsEnabled());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
        Observable map5 = observableRefCount2.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.46
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableFlatMapSingle, map5, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$36(this.f$0, (Optional) obj);
            }
        });
        Observable observableSwitchMapMaybe = observableRefCount.take(1L).switchMapMaybe(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.48
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends SlipUpsellKey> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                SlipPostTradeUpsellStore slipPostTradeUpsellStore = OrderConfirmationDuxo.this.slipPostTradeUpsellStore;
                String accountNumber = order.getAccountNumber();
                String string2 = order.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return slipPostTradeUpsellStore.getSlipUpsell(accountNumber, string2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapMaybe, "switchMapMaybe(...)");
        Observable observableConnectWhen$default2 = ObservablesKt.connectWhen$default(observableSwitchMapMaybe, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, SlipRegionGate.INSTANCE, false, 2, null), null, 2, null);
        Observable map6 = observableRefCount2.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.49
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableConnectWhen$default2, map6, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$38(this.f$0, (SlipUpsellKey) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = observableRefCount.distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.51
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(Order previous, Order current) {
                Intrinsics.checkNotNullParameter(previous, "previous");
                Intrinsics.checkNotNullParameter(current, "current");
                return previous.getState() == current.getState() && Intrinsics.areEqual(previous.getExecutionIds(), current.getExecutionIds());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.withPrevious(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$40(this.f$0, (Tuples2) obj);
            }
        });
        Observable map7 = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((Order) it).getReplaces());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OrderConfirmationDuxo$onResume$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(map7).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        final OrderStore orderStore = this.orderStore;
        Observable observableSwitchMap9 = observableDistinctUntilChanged4.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.onResume.54
            @Override // io.reactivex.functions.Function
            public final Observable<Order> apply(UUID p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return OrderStore.poll$default(orderStore, p0, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap9, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap9, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$43(this.f$0, (Order) obj);
            }
        });
        Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{EquitiesOrderConfirmationMicrogram.INSTANCE}, false, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2949456(flowStreamStateFlow$default, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2949557(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2949658(observableRefCount, flowStreamStateFlow$default, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2949759(observableRefCount, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(OrderConfirmationDuxo orderConfirmationDuxo, final Account account) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$6$lambda$5(account, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$6$lambda$5(Account account, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, account, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741822, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(OrderConfirmationDuxo orderConfirmationDuxo, final Boolean bool) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$8$lambda$7(bool, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$8$lambda$7(Boolean bool, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, bool.booleanValue(), false, false, 939524095, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(OrderConfirmationDuxo orderConfirmationDuxo, final Instrument instrument) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$10$lambda$9(instrument, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$10$lambda$9(Instrument instrument, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, instrument, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741821, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(OrderConfirmationDuxo orderConfirmationDuxo, final Quote quote) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$12$lambda$11(quote, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$12$lambda$11(Quote quote, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, quote, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(OrderConfirmationDuxo orderConfirmationDuxo, final Order order) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$14$lambda$13(order, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$14$lambda$13(Order order, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, order, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741791, null);
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Ljava/math/BigDecimal;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$13", m3645f = "OrderConfirmationDuxo.kt", m3646l = {300, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$13 */
    static final class C2946413 extends ContinuationImpl7 implements Function2<Order, Continuation<? super Result<? extends BigDecimal>>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$13$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C2946413(Continuation<? super C2946413> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2946413 c2946413 = OrderConfirmationDuxo.this.new C2946413(continuation);
            c2946413.L$0 = obj;
            return c2946413;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Order order, Continuation<? super Result<? extends BigDecimal>> continuation) {
            return ((C2946413) create(order, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OrderStore orderStore;
            UUID instrument;
            Order order;
            Object objM22706estimateFeeshUnOzRk;
            Order order2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Order order3 = (Order) this.L$0;
                orderStore = OrderConfirmationDuxo.this.orderStore;
                instrument = order3.getInstrument();
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OrderConfirmationDuxo.this.instrumentStore.getInstrument(order3.getInstrument())), Integer.MAX_VALUE, null, 2, null);
                this.L$0 = order3;
                this.L$1 = orderStore;
                this.L$2 = instrument;
                this.label = 1;
                Object objFirst = FlowKt.first(flowBuffer$default, this);
                if (objFirst != coroutine_suspended) {
                    order = order3;
                    obj = objFirst;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                order2 = (Order) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM22706estimateFeeshUnOzRk = ((Result) obj).getValue();
                if (Result.m28556isSuccessimpl(objM22706estimateFeeshUnOzRk)) {
                    BigDecimal totalFee = ((ApiEstimatedFees) objM22706estimateFeeshUnOzRk).getTotalFee();
                    int i3 = WhenMappings.$EnumSwitchMapping$0[order2.getSide().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("SELL_SHORT is not a valid order side for estimating fees");
                        }
                        i2 = -1;
                    }
                    objM22706estimateFeeshUnOzRk = BigDecimals7.times(totalFee, i2);
                }
                return Result.m28549boximpl(Result.m28550constructorimpl(objM22706estimateFeeshUnOzRk));
            }
            instrument = (UUID) this.L$2;
            orderStore = (OrderStore) this.L$1;
            order = (Order) this.L$0;
            ResultKt.throwOnFailure(obj);
            UUID uuid = instrument;
            OrderStore orderStore2 = orderStore;
            boolean zIsOtc = ((Instrument) obj).isOtc();
            BigDecimal remainingQuantity = order.getRemainingQuantity();
            EquityOrderSide side = order.getSide();
            BigDecimal averagePrice = order.getAveragePrice();
            if (averagePrice == null) {
                Order.Companion companion = Order.INSTANCE;
                Intrinsics.checkNotNull(order);
                averagePrice = companion.getEstimatedCost(order, null);
                if (averagePrice == null) {
                    averagePrice = BigDecimal.ZERO;
                }
            }
            BigDecimal bigDecimal = averagePrice;
            Intrinsics.checkNotNull(bigDecimal);
            this.L$0 = order;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            objM22706estimateFeeshUnOzRk = orderStore2.m22706estimateFeeshUnOzRk(uuid, zIsOtc, remainingQuantity, side, bigDecimal, this);
            if (objM22706estimateFeeshUnOzRk != coroutine_suspended) {
                order2 = order;
                if (Result.m28556isSuccessimpl(objM22706estimateFeeshUnOzRk)) {
                }
                return Result.m28549boximpl(Result.m28550constructorimpl(objM22706estimateFeeshUnOzRk));
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(OrderConfirmationDuxo orderConfirmationDuxo, final Result result) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$17$lambda$16(result, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$17$lambda$16(Result result, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Object value = result.getValue();
        if (Result.m28555isFailureimpl(value)) {
            value = null;
        }
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, BigDecimals7.orZero((BigDecimal) value), null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073739775, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$19(OrderConfirmationDuxo orderConfirmationDuxo, final RecurringOrderUpsellManager.RecurringUpsell recurringUpsell) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$19$lambda$18(recurringUpsell, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$19$lambda$18(RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, recurringUpsell, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741695, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$21(OrderConfirmationDuxo orderConfirmationDuxo, final int i) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$21$lambda$20(i, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$21$lambda$20(int i, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, Integer.valueOf(i), false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741567, null);
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000/\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"com/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo$onResume$EquitiesMlpWithholdingParams", "", "amount", "Ljava/math/BigDecimal;", "account", "", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/UUID;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAccount", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/UUID;)Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo$onResume$EquitiesMlpWithholdingParams;", "equals", "", "other", "hashCode", "", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EquitiesMlpWithholdingParams {
        private final String account;
        private final BigDecimal amount;
        private final UUID instrumentId;

        public static /* synthetic */ EquitiesMlpWithholdingParams copy$default(EquitiesMlpWithholdingParams equitiesMlpWithholdingParams, BigDecimal bigDecimal, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = equitiesMlpWithholdingParams.amount;
            }
            if ((i & 2) != 0) {
                str = equitiesMlpWithholdingParams.account;
            }
            if ((i & 4) != 0) {
                uuid = equitiesMlpWithholdingParams.instrumentId;
            }
            return equitiesMlpWithholdingParams.copy(bigDecimal, str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final EquitiesMlpWithholdingParams copy(BigDecimal amount, String account, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new EquitiesMlpWithholdingParams(amount, account, instrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EquitiesMlpWithholdingParams)) {
                return false;
            }
            EquitiesMlpWithholdingParams equitiesMlpWithholdingParams = (EquitiesMlpWithholdingParams) other;
            return Intrinsics.areEqual(this.amount, equitiesMlpWithholdingParams.amount) && Intrinsics.areEqual(this.account, equitiesMlpWithholdingParams.account) && Intrinsics.areEqual(this.instrumentId, equitiesMlpWithholdingParams.instrumentId);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.amount;
            int iHashCode = (((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.account.hashCode()) * 31;
            UUID uuid = this.instrumentId;
            return iHashCode + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "EquitiesMlpWithholdingParams(amount=" + this.amount + ", account=" + this.account + ", instrumentId=" + this.instrumentId + ")";
        }

        public EquitiesMlpWithholdingParams(BigDecimal bigDecimal, String account, UUID uuid) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.amount = bigDecimal;
            this.account = account;
            this.instrumentId = uuid;
        }

        public final String getAccount() {
            return this.account;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$23(OrderConfirmationDuxo orderConfirmationDuxo, Optional optional) {
        final WithholdingEstimatedAmount withholdingEstimatedAmount = (WithholdingEstimatedAmount) optional.component1();
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$23$lambda$22(withholdingEstimatedAmount, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$23$lambda$22(WithholdingEstimatedAmount withholdingEstimatedAmount, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, withholdingEstimatedAmount, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073737727, null);
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$28", m3645f = "OrderConfirmationDuxo.kt", m3646l = {423}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$28 */
    static final class C2947628 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2947628(Continuation<? super C2947628> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfirmationDuxo.this.new C2947628(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2947628) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Order;", "it", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$28$1", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$28$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderConfirmationViewState, Continuation<? super Order>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OrderConfirmationViewState orderConfirmationViewState, Continuation<? super Order> continuation) {
                return ((AnonymousClass1) create(orderConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((OrderConfirmationViewState) this.L$0).getCurrentOrder();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.mapLatest(Context7.buffer$default(RxConvert.asFlow(OrderConfirmationDuxo.this.getStates()), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)), new C29459x7e877579(null, OrderConfirmationDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$28$3", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$28$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Optional<? extends WithholdingStatus>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = orderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<WithholdingStatus> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends WithholdingStatus> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<WithholdingStatus>) optional, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final WithholdingStatus withholdingStatus = (WithholdingStatus) ((Optional) this.L$0).component1();
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$28$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OrderConfirmationDuxo.C2947628.AnonymousClass3.invokeSuspend$lambda$0(withholdingStatus, (OrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderConfirmationViewState invokeSuspend$lambda$0(WithholdingStatus withholdingStatus, OrderConfirmationViewState orderConfirmationViewState) {
                return OrderConfirmationViewState.copy$default(orderConfirmationViewState, null, null, false, false, null, null, null, null, null, false, null, null, null, null, withholdingStatus, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073725439, null);
            }
        }
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$29", m3645f = "OrderConfirmationDuxo.kt", m3646l = {430}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$29 */
    static final class C2947729 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<Order> $orderObservable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2947729(Observable<Order> observable, Continuation<? super C2947729> continuation) {
            super(2, continuation);
            this.$orderObservable = observable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfirmationDuxo.this.new C2947729(this.$orderObservable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2947729) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<WithholdingAmount> flowPollOrderWithholdingAmount = OrderConfirmationDuxo.this.backupWithholdingStore.pollOrderWithholdingAmount(this.$orderObservable);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPollOrderWithholdingAmount, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$29$1", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$29$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WithholdingAmount, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WithholdingAmount withholdingAmount, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(withholdingAmount, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final WithholdingAmount withholdingAmount = (WithholdingAmount) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$29$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OrderConfirmationDuxo.C2947729.AnonymousClass1.invokeSuspend$lambda$0(withholdingAmount, (OrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderConfirmationViewState invokeSuspend$lambda$0(WithholdingAmount withholdingAmount, OrderConfirmationViewState orderConfirmationViewState) {
                return OrderConfirmationViewState.copy$default(orderConfirmationViewState, null, null, false, false, null, null, null, null, null, false, null, null, null, withholdingAmount, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073733631, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$25(OrderConfirmationDuxo orderConfirmationDuxo, final Boolean bool) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$25$lambda$24(bool, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$25$lambda$24(Boolean bool, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, bool.booleanValue(), null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741815, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$27(OrderConfirmationDuxo orderConfirmationDuxo, final MarketHours marketHours) {
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$27$lambda$26(marketHours, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$27$lambda$26(MarketHours marketHours, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, marketHours, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741807, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$29(OrderConfirmationDuxo orderConfirmationDuxo, final ClientComponentAlert clientComponentAlert) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$29$lambda$28(clientComponentAlert, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$29$lambda$28(ClientComponentAlert clientComponentAlert, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, new UiEvent(clientComponentAlert), null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073740799, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$31(OrderConfirmationDuxo orderConfirmationDuxo, final ApiMarginUpsell apiMarginUpsell) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$31$lambda$30(apiMarginUpsell, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$31$lambda$30(ApiMarginUpsell apiMarginUpsell, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, apiMarginUpsell, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073676287, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$32(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, false, null, 4, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$42", m3645f = "OrderConfirmationDuxo.kt", m3646l = {503}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$42 */
    static final class C2948642 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C2948642(Continuation<? super C2948642> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfirmationDuxo.this.new C2948642(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C2948642) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ProductUpsellManager notificationUpsellManager = OrderConfirmationDuxo.this.getNotificationUpsellManager();
            this.label = 1;
            Object objIsUpsellAllowed = notificationUpsellManager.isUpsellAllowed(this);
            return objIsUpsellAllowed == coroutine_suspended ? coroutine_suspended : objIsUpsellAllowed;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$34(OrderConfirmationDuxo orderConfirmationDuxo, final Boolean bool) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$34$lambda$33(bool, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$34$lambda$33(Boolean bool, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, bool.booleanValue(), null, null, false, null, null, null, false, false, null, false, false, false, 1073610751, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$36(OrderConfirmationDuxo orderConfirmationDuxo, final Optional optional) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$36$lambda$35(optional, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$36$lambda$35(Optional optional, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, (IacUpsell) optional.getOrNull(), false, null, null, null, false, false, null, false, false, false, 1073217535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$38(OrderConfirmationDuxo orderConfirmationDuxo, final SlipUpsellKey slipUpsellKey) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$38$lambda$37(slipUpsellKey, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$38$lambda$37(SlipUpsellKey slipUpsellKey, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, slipUpsellKey, null, false, null, null, null, false, false, null, false, false, false, 1073479679, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$40(OrderConfirmationDuxo orderConfirmationDuxo, Tuples2 tuples2) {
        EquityOrderState state;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Optional optional = (Optional) tuples2.component1();
        Order order = (Order) tuples2.component2();
        Order order2 = (Order) optional.getOrNull();
        if (order2 != null && (state = order2.getState()) != null && !state.isFinal()) {
            TraderEventLogger traderEventLogger = orderConfirmationDuxo.eventLogger;
            boolean zIsFinal = order.getState().isFinal();
            UUID id = order.getId();
            List<UUID> executionIds = order.getExecutionIds();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executionIds, 10));
            Iterator<T> it = executionIds.iterator();
            while (it.hasNext()) {
                String string2 = ((UUID) it.next()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                arrayList.add(new EquityOrderExecutionData(string2, null, 2, null));
            }
            traderEventLogger.logEquityOrderExecution(zIsFinal, arrayList, id);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$43(OrderConfirmationDuxo orderConfirmationDuxo, final Order order) {
        orderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onResume$lambda$43$lambda$42(order, (OrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onResume$lambda$43$lambda$42(Order order, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, order, null, null, false, false, null, false, false, false, 1071644671, null);
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$56", m3645f = "OrderConfirmationDuxo.kt", m3646l = {582}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$56 */
    static final class C2949456 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $microgramExperimentFlow;
        int label;
        final /* synthetic */ OrderConfirmationDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2949456(Flow<Boolean> flow, OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super C2949456> continuation) {
            super(2, continuation);
            this.$microgramExperimentFlow = flow;
            this.this$0 = orderConfirmationDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2949456(this.$microgramExperimentFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2949456) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$56$1", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$56$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final boolean z = this.Z$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$56$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OrderConfirmationDuxo.C2949456.AnonymousClass1.invokeSuspend$lambda$0(z, (OrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderConfirmationViewState invokeSuspend$lambda$0(boolean z, OrderConfirmationViewState orderConfirmationViewState) {
                return OrderConfirmationViewState.copy$default(orderConfirmationViewState, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, z, false, null, false, false, false, 1056964607, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flow = this.$microgramExperimentFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$57", m3645f = "OrderConfirmationDuxo.kt", m3646l = {587}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$57 */
    static final class C2949557 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2949557(Continuation<? super C2949557> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfirmationDuxo.this.new C2949557(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2949557) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$57$1", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$57$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Monitoring monitoring, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(monitoring, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Monitoring monitoring = (Monitoring) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$57$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OrderConfirmationDuxo.C2949557.AnonymousClass1.invokeSuspend$lambda$0(monitoring, (OrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderConfirmationViewState invokeSuspend$lambda$0(Monitoring monitoring, OrderConfirmationViewState orderConfirmationViewState) {
                return OrderConfirmationViewState.copy$default(orderConfirmationViewState, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, monitoring, null, false, false, null, false, false, false, 1069547519, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Monitoring> state = OrderConfirmationDuxo.this.confirmationComponent.getMicrogramMonitor().getState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$58", m3645f = "OrderConfirmationDuxo.kt", m3646l = {609}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$58 */
    static final class C2949658 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $microgramExperimentFlow;
        final /* synthetic */ Observable<Order> $orderObservable;
        int label;
        final /* synthetic */ OrderConfirmationDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2949658(Observable<Order> observable, Flow<Boolean> flow, OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super C2949658> continuation) {
            super(2, continuation);
            this.$orderObservable = observable;
            this.$microgramExperimentFlow = flow;
            this.this$0 = orderConfirmationDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2949658(this.$orderObservable, this.$microgramExperimentFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2949658) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.$orderObservable), Integer.MAX_VALUE, null, 2, null), new C29460x2467f67c(null, this.this$0)), this.$microgramExperimentFlow, null, 2, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lequity_order_summary/proto/v1/StreamOrderConfirmationResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$58$2", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$58$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<StreamOrderConfirmationResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = orderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(streamOrderConfirmationResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto = (StreamOrderConfirmationResponseDto) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$58$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OrderConfirmationDuxo.C2949658.AnonymousClass2.invokeSuspend$lambda$0(streamOrderConfirmationResponseDto, (OrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderConfirmationViewState invokeSuspend$lambda$0(StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto, OrderConfirmationViewState orderConfirmationViewState) {
                return OrderConfirmationViewState.copy$default(orderConfirmationViewState, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, streamOrderConfirmationResponseDto, false, false, null, false, false, false, 1065353215, null);
            }
        }
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59", m3645f = "OrderConfirmationDuxo.kt", m3646l = {634}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59 */
    static final class C2949759 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<Order> $orderObservable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2949759(Observable<Order> observable, Continuation<? super C2949759> continuation) {
            super(2, continuation);
            this.$orderObservable = observable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderConfirmationDuxo.this.new C2949759(this.$orderObservable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2949759) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(Observables.INSTANCE.combineLatest(ExperimentsProvider.DefaultImpls.streamState$default(OrderConfirmationDuxo.this.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 4, null), this.$orderObservable)), Integer.MAX_VALUE, null, 2, null), new C29461x7b85e75b(null, OrderConfirmationDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "taxLotsSummary", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59$2", m3645f = "OrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<StreamTaxLotsSummaryResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OrderConfirmationDuxo orderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = orderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(streamTaxLotsSummaryResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse = (StreamTaxLotsSummaryResponse) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OrderConfirmationDuxo.C2949759.AnonymousClass2.invokeSuspend$lambda$0(streamTaxLotsSummaryResponse, (OrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderConfirmationViewState invokeSuspend$lambda$0(StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, OrderConfirmationViewState orderConfirmationViewState) {
                return OrderConfirmationViewState.copy$default(orderConfirmationViewState, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, streamTaxLotsSummaryResponse, false, false, false, 1006632959, null);
            }
        }
    }

    public final void onOrderReceived(final Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.performanceLogger.completeMetric(new ContextActionEvent.Action(UserInteractionEventData.Action.SUBMIT_ORDER));
        this.dayTradeStore.refresh(order.getAccountNumber(), true);
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onOrderReceived$lambda$44(order, (OrderConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onOrderReceived$lambda$44(Order order, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, order, null, null, null, true, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741279, null);
    }

    public final void onOrderUpdated(final Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.onOrderUpdated$lambda$45(order, (OrderConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderConfirmationViewState onOrderUpdated$lambda$45(Order order, OrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, order, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741791, null);
    }

    public final void markUpsellViewCount() {
        this.recurringOrderUpsellManager.markUpsellViewCount();
    }

    public final void logRecurringUpsellAppear() {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(Screen.Name.EQUITY_ORDER_RECEIPT, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, 24, null);
    }

    public final void logRecurringUpsellTap() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(Screen.Name.EQUITY_ORDER_RECEIPT, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(i, i2, i3, null, null, null, str, productTag, i4, str2, str3, str4, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, null, null, 0.0d, null, RecurringContext.UpsellType.QUIET, 0.0d, null, null, 1919, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public final void logRecurringUpsellGetStartedTap() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(Screen.Name.EQUITY_ORDER_RECEIPT, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(i, i2, i3, null, null, null, str, productTag, i4, str2, str3, str4, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, null, null, 0.0d, null, RecurringContext.UpsellType.AGGRESSIVE, 0.0d, null, null, 1919, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public final void seenMarginUpsell() {
        InstantCashLogger.logScreenAppear$default(this.instantCashLogger, null, null, MARGIN_UPSELL_COMPONENT_HIERARCHY, false, 3, null);
        Observable<R> map = getStates().take(1L).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo.seenMarginUpsell.1
            @Override // io.reactivex.functions.Function
            public final String apply(OrderConfirmationViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Order currentOrder = it.getCurrentOrder();
                Intrinsics.checkNotNull(currentOrder);
                return currentOrder.getAccountNumber();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationDuxo.seenMarginUpsell$lambda$46(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit seenMarginUpsell$lambda$46(OrderConfirmationDuxo orderConfirmationDuxo, String str) {
        MarginUpsellStore marginUpsellStore = orderConfirmationDuxo.marginUpsellStore;
        Intrinsics.checkNotNull(str);
        marginUpsellStore.seenMarginUpsell(str, EnableMarginUpsellOrderType.EQUITY);
        return Unit.INSTANCE;
    }

    public final void logLaunchMarginUpgrade() {
        InstantCashLogger instantCashLogger = this.instantCashLogger;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String value = InstantCashLogger2.LEARN_MORE.getValue();
        ComponentHierarchy componentHierarchy = MARGIN_UPSELL_COMPONENT_HIERARCHY;
        InstantCashLogger.logTap$default(instantCashLogger, null, null, null, componentType, value, componentHierarchy, false, 7, null);
        InstantCashLogger.logScreenDisappear$default(this.instantCashLogger, null, null, componentHierarchy, false, 3, null);
    }

    public final void logDismissMarginUpsell() {
        InstantCashLogger instantCashLogger = this.instantCashLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String value = InstantCashLogger2.NOT_NOW.getValue();
        ComponentHierarchy componentHierarchy = MARGIN_UPSELL_COMPONENT_HIERARCHY;
        InstantCashLogger.logTap$default(instantCashLogger, null, action, null, componentType, value, componentHierarchy, false, 5, null);
        InstantCashLogger.logScreenDisappear$default(this.instantCashLogger, null, null, componentHierarchy, false, 3, null);
    }

    public final void logConfirmationShown() {
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_EQUITY_CONFIRM, null, 2, null);
    }

    /* compiled from: OrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationDuxo;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Args;", "<init>", "()V", "MARGIN_UPSELL_COMPONENT_HIERARCHY", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OrderConfirmationDuxo, OrderConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OrderConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderConfirmationFragment.Args getArgs(OrderConfirmationDuxo orderConfirmationDuxo) {
            return (OrderConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, orderConfirmationDuxo);
        }
    }
}
