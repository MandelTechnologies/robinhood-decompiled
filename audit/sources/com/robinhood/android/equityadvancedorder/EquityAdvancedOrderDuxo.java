package com.robinhood.android.equityadvancedorder;

import androidx.compose.p011ui.focus.FocusManager;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.equities.taxlots.SelectLotsKey;
import com.robinhood.android.equities.taxlots.UtilsKt;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equity.EquityOrderSourceLogging;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.equity.FeeEstimation2;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.equity.TaxLotsM1Experiment;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.ValidateAndReviewEquityOrder;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equity.validation.event.TextField;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.UserCanHideDefaultLimitPrice;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.ILimit;
import com.robinhood.android.equityadvancedorder.datastate.IMarket;
import com.robinhood.android.equityadvancedorder.datastate.ITaxLots;
import com.robinhood.android.equityadvancedorder.datastate.InitialDataStateHelper;
import com.robinhood.android.equityadvancedorder.datastate.InitialDataStateHelper2;
import com.robinhood.android.equityadvancedorder.datastate.LimitStandard;
import com.robinhood.android.equityadvancedorder.datastate.LimitTaxLots;
import com.robinhood.android.equityadvancedorder.datastate.MarketStandard;
import com.robinhood.android.equityadvancedorder.datastate.MarketTaxLots;
import com.robinhood.android.equityadvancedorder.prefs.DefaultTimeInForcePref;
import com.robinhood.android.equityadvancedorder.prefs.DefaultTradingHoursPref;
import com.robinhood.android.equityadvancedorder.prefs.StreamlinedLimitOrderOnboardingSeenPref;
import com.robinhood.android.equityadvancedorder.prefs.StreamlinedLimitOrderOnboardingSeenPref2;
import com.robinhood.android.equityadvancedorder.utils.EquityAdvancedOrderLoggingManager;
import com.robinhood.android.equityadvancedorder.utils.EquityOrderContexts;
import com.robinhood.android.equityordercontext.microgram.RealEquityOrderContextService;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.experiments.TradeEquitiesSduiAccountSwitcherExperiment;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherState;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder2;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore2;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiOrderExpireDate;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.TradingSession2;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.SuitabilityStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.math.BigDecimals7;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import equity_order_summary.proto.p459v1.WarmupRequestDto;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import equity_trading_tax_lots.proto.p460v1.SetTaxLotsSelectionMethodResponse;
import equity_trading_tax_lots.proto.p460v1.StreamSelectedTaxLotsResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategyResponse;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.Monitoring;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.contracts.equity_order_context.proto.p487v1.EquityOrderContextService;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponse;
import p479j$.time.Clock;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000°\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  \u00022\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002 \u0002B\u0081\u0002\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001c\u0012\b\b\u0001\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010!\u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ7\u0010M\u001a\u00020L2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ%\u0010S\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020F0QH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020LH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020LH\u0002¢\u0006\u0004\bW\u0010VJ\u0017\u0010Z\u001a\u00020L2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020L2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\b\\\u0010[J\u000f\u0010]\u001a\u00020LH\u0002¢\u0006\u0004\b]\u0010VJ\u001f\u0010`\u001a\u00020L2\u0006\u0010C\u001a\u00020B2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020L2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ-\u0010l\u001a\u00020L2\b\u0010g\u001a\u0004\u0018\u00010f2\b\u0010i\u001a\u0004\u0018\u00010h2\b\b\u0002\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u0018\u0010n\u001a\u00020L2\u0006\u0010G\u001a\u00020FH\u0082@¢\u0006\u0004\bn\u0010oJ\u001d\u0010r\u001a\u00020L2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020f0pH\u0002¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020L2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020F0QH\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020LH\u0002¢\u0006\u0004\bv\u0010VJ\u000f\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\bx\u0010yJ\u0015\u0010{\u001a\u0004\u0018\u00010\u001f*\u00020zH\u0002¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020LH\u0002¢\u0006\u0004\b}\u0010VJ\u000f\u0010~\u001a\u00020LH\u0002¢\u0006\u0004\b~\u0010VJ\u0018\u0010\u007f\u001a\u00020L2\u0006\u0010G\u001a\u00020FH\u0082@¢\u0006\u0004\b\u007f\u0010oJ\u0011\u0010\u0080\u0001\u001a\u00020LH\u0002¢\u0006\u0005\b\u0080\u0001\u0010VJ!\u0010\u0082\u0001\u001a\u00020L2\r\u0010R\u001a\t\u0012\u0004\u0012\u00020F0\u0081\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u00020L2\r\u0010R\u001a\t\u0012\u0004\u0012\u00020F0\u0081\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J!\u0010\u0085\u0001\u001a\u00020L2\r\u0010R\u001a\t\u0012\u0004\u0012\u00020F0\u0081\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0083\u0001J\u0016\u0010\u0086\u0001\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u008a\u0001\u001a\u00020L2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J9\u0010\u008d\u0001\u001a\u00020L2\u0006\u0010I\u001a\u00020H2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010K\u001a\u00020J2\t\b\u0002\u0010\u008c\u0001\u001a\u00020J¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J$\u0010\u0091\u0001\u001a\u00020L2\u0007\u0010\u008f\u0001\u001a\u00020B2\u0007\u0010\u0090\u0001\u001a\u00020FH\u0007¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001a\u0010\u0095\u0001\u001a\u00020L2\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020LH\u0016¢\u0006\u0005\b\u0097\u0001\u0010VJ\u0011\u0010\u0098\u0001\u001a\u00020LH\u0016¢\u0006\u0005\b\u0098\u0001\u0010VJ#\u0010\u009a\u0001\u001a\u00020L2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010B2\u0006\u0010Y\u001a\u00020X¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0018\u0010\u009d\u0001\u001a\u00020L2\u0007\u0010\u009c\u0001\u001a\u00020X¢\u0006\u0005\b\u009d\u0001\u0010[J\u0018\u0010\u009e\u0001\u001a\u00020L2\u0006\u0010I\u001a\u00020H¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001a\u0010¢\u0001\u001a\u00020L2\b\u0010¡\u0001\u001a\u00030 \u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J=\u0010§\u0001\u001a\u00020L2\b\b\u0002\u0010k\u001a\u00020j2\u000b\b\u0002\u0010¤\u0001\u001a\u0004\u0018\u00010f2\t\b\u0002\u0010¥\u0001\u001a\u00020J2\t\b\u0002\u0010¦\u0001\u001a\u00020J¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001a\u0010«\u0001\u001a\u00020L2\b\u0010ª\u0001\u001a\u00030©\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0019\u0010®\u0001\u001a\u00020L2\u0007\u0010\u00ad\u0001\u001a\u00020f¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0019\u0010±\u0001\u001a\u00020L2\u0007\u0010°\u0001\u001a\u00020O¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0011\u0010´\u0001\u001a\u00020LH\u0001¢\u0006\u0005\b³\u0001\u0010VJ\u001e\u0010·\u0001\u001a\u00020L2\f\b\u0002\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001d\u0010º\u0001\u001a\u00020L2\u000b\b\u0002\u0010¹\u0001\u001a\u0004\u0018\u00010F¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0018\u0010¼\u0001\u001a\u00020L2\u0006\u0010G\u001a\u00020F¢\u0006\u0006\b¼\u0001\u0010»\u0001J\u000f\u0010½\u0001\u001a\u00020L¢\u0006\u0005\b½\u0001\u0010VJ\u000f\u0010¾\u0001\u001a\u00020L¢\u0006\u0005\b¾\u0001\u0010VJ\u000f\u0010¿\u0001\u001a\u00020L¢\u0006\u0005\b¿\u0001\u0010VJ \u0010Â\u0001\u001a\u00020L2\u000e\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020F0À\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0011\u0010Å\u0001\u001a\u00020LH\u0001¢\u0006\u0005\bÄ\u0001\u0010VJ\u0011\u0010Ç\u0001\u001a\u00020LH\u0000¢\u0006\u0005\bÆ\u0001\u0010VJ\u001c\u0010É\u0001\u001a\u00020L2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0000¢\u0006\u0006\bÈ\u0001\u0010\u008b\u0001J\u001b\u0010Í\u0001\u001a\u00020L2\u0007\u0010Ê\u0001\u001a\u00020BH\u0000¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001e\u0010Ò\u0001\u001a\u00020w2\n\b\u0002\u0010Ï\u0001\u001a\u00030Î\u0001H\u0000¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001c\u0010×\u0001\u001a\u00020L2\b\u0010Ô\u0001\u001a\u00030Ó\u0001H\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0011\u0010Ù\u0001\u001a\u00020LH\u0000¢\u0006\u0005\bØ\u0001\u0010VJ\u0011\u0010Û\u0001\u001a\u00020LH\u0000¢\u0006\u0005\bÚ\u0001\u0010VJ#\u0010ß\u0001\u001a\u00020L2\u0006\u0010G\u001a\u00020F2\u0007\u0010Ü\u0001\u001a\u00020BH\u0000¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u001a\u0010á\u0001\u001a\u00020L2\u0006\u0010g\u001a\u00020fH\u0000¢\u0006\u0006\bà\u0001\u0010¯\u0001J\u001c\u0010æ\u0001\u001a\u00020L2\b\u0010ã\u0001\u001a\u00030â\u0001H\u0000¢\u0006\u0006\bä\u0001\u0010å\u0001J\u000f\u0010ç\u0001\u001a\u00020L¢\u0006\u0005\bç\u0001\u0010VJ\u001d\u0010ì\u0001\u001a\u00020L2\b\u0010é\u0001\u001a\u00030è\u0001H\u0081@¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u000f\u0010í\u0001\u001a\u00020L¢\u0006\u0005\bí\u0001\u0010VJ\u000f\u0010î\u0001\u001a\u00020L¢\u0006\u0005\bî\u0001\u0010VJ\u000f\u0010ï\u0001\u001a\u00020L¢\u0006\u0005\bï\u0001\u0010VJ\u000f\u0010ð\u0001\u001a\u00020L¢\u0006\u0005\bð\u0001\u0010VJ\u0019\u0010ò\u0001\u001a\u00020L2\u0007\u0010ñ\u0001\u001a\u00020F¢\u0006\u0006\bò\u0001\u0010»\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010ó\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010ô\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010õ\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010ö\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010÷\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010ø\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010ù\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010ú\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010û\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010ü\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010ý\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010þ\u0001R\u0015\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010þ\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010ÿ\u0001R\u0015\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010ÿ\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0080\u0002R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0081\u0002R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0082\u0002R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0083\u0002R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010\u0084\u0002R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0085\u0002R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u0086\u0002R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010\u0087\u0002R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010\u0088\u0002R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u0089\u0002R\u001d\u0010;\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b;\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0015\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010\u008d\u0002RI\u0010\u0091\u0002\u001a,\u0012'\u0012%\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0p \u0090\u0002*\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0p\u0018\u00010\u008f\u00020\u008f\u00020\u008e\u00028\u0000X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0018\u0010\u0096\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R!\u0010\u009d\u0002\u001a\u00030\u0098\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001b\u0010\u009e\u0002\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002¨\u0006¡\u0002"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Advanced;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountSwitcherStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/store/base/BackupWithholdingStore;", "backupWithholdingStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "nbboSummaryStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "tradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/prefs/StringPreference;", "defaultTradingHoursPref", "defaultTimeInForcePref", "Lcom/robinhood/prefs/BooleanPreference;", "streamlinedLimitOrderBuyOnboardingSeenPref", "streamlinedLimitOrderSellOnboardingSeenPref", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityOrderCheckValidator", "Lcom/robinhood/store/base/SuitabilityStore;", "suitabilityStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/analytics/TraderEventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "taxLotsCachedService", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "shortingInfoStore", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "equityOrderManager", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;Lcom/robinhood/store/base/SuitabilityStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Lcom/robinhood/android/equity/submission/EquityOrderManager;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderStateProvider;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)V", "Ljava/math/BigDecimal;", "numberOfShares", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "taxLotsState", "", "accountNumber", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "selectionStrategy", "", "navigateOnSuccess", "", "setSelectionMethod", "(Ljava/math/BigDecimal;Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Z)V", "Ljava/util/UUID;", "instrumentId", "Lio/reactivex/Observable;", "accountNumberStream", "getPosition", "(Ljava/util/UUID;Lio/reactivex/Observable;)V", "logOrderTypeTap", "()V", "logSelectionStrategyBottomSheetDone", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "editingField", "modifyWithKeyboard", "(Lcom/robinhood/android/advancedorderbottomsheet/EditingField;)V", "modifyWithBottomSheet", "logSelectionStrategyRowTap", "Lcom/robinhood/android/equity/validation/event/TextField;", "textField", "setNumberOfSharesRowText", "(Ljava/math/BigDecimal;Lcom/robinhood/android/equity/validation/event/TextField;)V", "Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "originEditMode", "logButtonPress", "(Lcom/robinhood/android/trading/contracts/configuration/EditMode;)V", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "context", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lkotlinx/coroutines/CoroutineScope;", "scope", "validateAndReviewOrder", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;Lkotlinx/coroutines/CoroutineScope;)V", "clearSelectedTaxLots", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "retryWhen", "setRetryWhen", "(Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;)V", "getInstrumentBuyingPowerForActiveAccount", "(Lio/reactivex/Observable;)V", "launchOrderTypeJobs", "Lkotlinx/coroutines/Job;", "launchLimitJobs", "()Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "limitOrderFtuxTooltipShownpref", "(Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;)Lcom/robinhood/prefs/BooleanPreference;", "updateMicrogramEquityOrderContextService", "fetchTaxLotsExperiment", "fetchSelectedTaxLots", "fetchTaxLotsDisposalOptions", "Lkotlinx/coroutines/flow/Flow;", "fetchStrategySummary", "(Lkotlinx/coroutines/flow/Flow;)V", "startTaxLots", "streamSelectionStrategy", "illegalMutation", "(Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;)Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "Lcom/robinhood/models/db/OrderMarketHours;", "orderMarketHours", "setTradingHours", "(Lcom/robinhood/models/db/OrderMarketHours;)V", "skipMaxSharesDialog", "setStrategy", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategy;Ljava/math/BigDecimal;ZZ)V", "maxAvailableShares", "symbol", "showTaxLotsNotEnoughSharesDialog", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "setTimeInForce", "(Lcom/robinhood/models/db/OrderTimeInForce;)V", "onCreate", "onResume", "value", "handleNumberChange", "(Ljava/math/BigDecimal;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;)V", "rowType", "handleRowClicked", "logSelectionStrategyTap", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategy;)V", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "result", "handleSelectLotsComplete", "(Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;)V", "overrideContext", "allowReview", "log", "handlePrimaryButtonPress", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/equity/validation/EquityOrderContext;ZZ)V", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "action", "recordSilentAlert", "(Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;)V", "equityOrderContext", "onSwipeToTrade", "(Lcom/robinhood/android/equity/validation/EquityOrderContext;)V", "orderUuid", "handleOrderSubmissionUpdates", "(Ljava/util/UUID;)V", "showKeyboard$lib_equity_advanced_order_externalDebug", "showKeyboard", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "hideKeyboard", "(Landroidx/compose/ui/focus/FocusManager;)V", "initialAccountNumber", "refreshAccountSwitcher", "(Ljava/lang/String;)V", "setAccountNumber", "hideBottomSheet", "overrideToExecuteInMarketHoursOnlyAndValidate", "overrideFlipIpoAccessSharesAndValidate", "", "overridesToAppend", "appendOverridesAndValidate", "(Ljava/util/List;)V", "showAccountSwitcher$lib_equity_advanced_order_externalDebug", "showAccountSwitcher", "showTaxLotsSelection$lib_equity_advanced_order_externalDebug", "showTaxLotsSelection", "setMarketHours$lib_equity_advanced_order_externalDebug", "setMarketHours", "shareQuantity", "setShareQuantity$lib_equity_advanced_order_externalDebug", "(Ljava/math/BigDecimal;)V", "setShareQuantity", "", "minTimeInFlight", "cancelPendingCryptoOrders$lib_equity_advanced_order_externalDebug", "(J)Lkotlinx/coroutines/Job;", "cancelPendingCryptoOrders", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;", "iconId", "handleRowIconClick$lib_equity_advanced_order_externalDebug", "(Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;)V", "handleRowIconClick", "showMarketDataDisclosureDialog$lib_equity_advanced_order_externalDebug", "showMarketDataDisclosureDialog", "showBackupWithholdingDialog$lib_equity_advanced_order_externalDebug", "showBackupWithholdingDialog", "amount", "setLimitOrderConfiguration$lib_equity_advanced_order_externalDebug", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "setLimitOrderConfiguration", "editLimitOrder$lib_equity_advanced_order_externalDebug", "editLimitOrder", "Lcom/robinhood/models/db/Order$Configuration;", "incomingConfiguration", "onSwitchOrderConfiguration$lib_equity_advanced_order_externalDebug", "(Lcom/robinhood/models/db/Order$Configuration;)V", "onSwitchOrderConfiguration", "clearTaxLotSelection", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;", "orderContext", "setMicrogramEquityOrderContext$lib_equity_advanced_order_externalDebug", "(Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMicrogramEquityOrderContext", "selectionStrategyUpdateCanceled", "handleSellAllButtonClick", "handleTwentyFourHourButtonClick", "dismissTradingSessionChangeAlert", "loggingIdentifier", "logOrderCheckAction", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/store/base/BackupWithholdingStore;", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "Lcom/robinhood/store/base/SuitabilityStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/analytics/TraderEventLogger;", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lj$/time/Clock;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "kotlin.jvm.PlatformType", "retryWhenRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "getRetryWhenRelay$lib_equity_advanced_order_externalDebug", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lmicrogram/android/inject/MicrogramComponent;", "summaryComponent", "Lmicrogram/android/inject/MicrogramComponent;", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "idlOrderSummaryService$delegate", "Lkotlin/Lazy;", "getIdlOrderSummaryService", "()Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "idlOrderSummaryService", "orderTypeJobs", "Lkotlinx/coroutines/Job;", "Companion", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderDuxo extends BaseDuxo3<EquityAdvancedOrderDataState, EquityAdvancedOrderViewState, EquityOrderEvent.Advanced> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final InstrumentAccountSwitcherStore accountSwitcherStore;
    private final BackupWithholdingStore backupWithholdingStore;
    private final Clock clock;
    private final StringPreference defaultTimeInForcePref;
    private final StringPreference defaultTradingHoursPref;
    private final EquityOrderCheckValidator equityOrderCheckValidator;
    private final EquityOrderManager equityOrderManager;
    private final TraderEventLogger eventLogger;
    private final ExperimentsStore experimentsStore;

    /* renamed from: idlOrderSummaryService$delegate, reason: from kotlin metadata */
    private final Lazy idlOrderSummaryService;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final NbboSummaryStore nbboSummaryStore;
    private final EquityOrderExpireDateStore orderExpireDateStore;
    private final OrderStore orderStore;
    private Job orderTypeJobs;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> retryWhenRelay;
    private final SavedStateHandle savedStateHandle;
    private final ShortingInfoStore shortingInfoStore;
    private final BooleanPreference streamlinedLimitOrderBuyOnboardingSeenPref;
    private final BooleanPreference streamlinedLimitOrderSellOnboardingSeenPref;
    private final SuitabilityStore suitabilityStore;
    private final MicrogramComponent summaryComponent;
    private final TaxLotsCachedService taxLotsCachedService;
    private final EquityTradingSessionChangedStore tradingSessionChangedStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[EditingField.values().length];
            try {
                iArr[EditingField.NUMBER_OF_WHOLE_SHARES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditingField.NUMBER_OF_FRACTIONAL_SHARES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditingField.LIMIT_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EditingField.STRATEGY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EditingField.TRADING_SESSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EditingField.TIME_IN_FORCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EditingField.TRADING_SESSION_SETTINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EditingField.ACCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EditingField.SELECT_LOTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EditingField.ORDER_TYPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EquityOrderFormRowState.Icon.IconId.values().length];
            try {
                iArr3[EquityOrderFormRowState.Icon.IconId.MARKET_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[EquityOrderFormRowState.Icon.IconId.BACKUP_WITHHOLDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[EquityOrderFormRowState.Icon.IconId.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EquityOrderSide.values().length];
            try {
                iArr4[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1379, 1382}, m3647m = "clearSelectedTaxLots")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$clearSelectedTaxLots$1 */
    static final class C151651 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C151651(Continuation<? super C151651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityAdvancedOrderDuxo.this.clearSelectedTaxLots(null, this);
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1925}, m3647m = "fetchSelectedTaxLots")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchSelectedTaxLots$1 */
    static final class C151681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C151681(Continuation<? super C151681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityAdvancedOrderDuxo.this.fetchSelectedTaxLots(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public EquityAdvancedOrderDuxo(InstrumentAccountSwitcherStore accountSwitcherStore, AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, EquityOrderExpireDateStore orderExpireDateStore, InstrumentStore instrumentStore, NbboSummaryStore nbboSummaryStore, TraderMarketHoursManager marketHoursManager, EquityTradingSessionChangedStore tradingSessionChangedStore, PositionStore positionStore, QuoteStore quoteStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, @DefaultTradingHoursPref StringPreference defaultTradingHoursPref, @DefaultTimeInForcePref StringPreference defaultTimeInForcePref, @StreamlinedLimitOrderOnboardingSeenPref BooleanPreference streamlinedLimitOrderBuyOnboardingSeenPref, @StreamlinedLimitOrderOnboardingSeenPref2 BooleanPreference streamlinedLimitOrderSellOnboardingSeenPref, EquityOrderCheckValidator equityOrderCheckValidator, SuitabilityStore suitabilityStore, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, TraderEventLogger eventLogger, OrderStore orderStore, TaxLotsCachedService taxLotsCachedService, ShortingInfoStore shortingInfoStore, EquityOrderManager equityOrderManager, AccountAccessStore accountAccessStore, MicrogramComponent.Factory microgramComponentFactory, EquityAdvancedOrderStateProvider stateProvider, SavedStateHandle savedStateHandle, Clock clock, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(tradingSessionChangedStore, "tradingSessionChangedStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(defaultTradingHoursPref, "defaultTradingHoursPref");
        Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
        Intrinsics.checkNotNullParameter(streamlinedLimitOrderBuyOnboardingSeenPref, "streamlinedLimitOrderBuyOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(streamlinedLimitOrderSellOnboardingSeenPref, "streamlinedLimitOrderSellOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        InitialDataStateHelper initialDataStateHelper = new InitialDataStateHelper(defaultTimeInForcePref, clock);
        Companion companion = INSTANCE;
        super(initialDataStateHelper.create((EquityAdvancedOrderFragment.Args) companion.getArgs(savedStateHandle)), stateProvider, duxoBundle);
        this.accountSwitcherStore = accountSwitcherStore;
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.orderExpireDateStore = orderExpireDateStore;
        this.instrumentStore = instrumentStore;
        this.nbboSummaryStore = nbboSummaryStore;
        this.marketHoursManager = marketHoursManager;
        this.tradingSessionChangedStore = tradingSessionChangedStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.defaultTradingHoursPref = defaultTradingHoursPref;
        this.defaultTimeInForcePref = defaultTimeInForcePref;
        this.streamlinedLimitOrderBuyOnboardingSeenPref = streamlinedLimitOrderBuyOnboardingSeenPref;
        this.streamlinedLimitOrderSellOnboardingSeenPref = streamlinedLimitOrderSellOnboardingSeenPref;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.suitabilityStore = suitabilityStore;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.eventLogger = eventLogger;
        this.orderStore = orderStore;
        this.taxLotsCachedService = taxLotsCachedService;
        this.shortingInfoStore = shortingInfoStore;
        this.equityOrderManager = equityOrderManager;
        this.accountAccessStore = accountAccessStore;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        applyMutation(new C151621(null));
        AdvancedOrder configuration = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getConfiguration();
        AdvancedOrder.Draft draft = configuration instanceof AdvancedOrder.Draft ? (AdvancedOrder.Draft) configuration : null;
        if (draft != null && draft.getAutoValidate()) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151632(null), 3, null);
        }
        BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.retryWhenRelay = behaviorRelayCreate;
        this.summaryComponent = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-equity-order-summary", null, 2, null), null, 4, null);
        this.idlOrderSummaryService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityAdvancedOrderDuxo.idlOrderSummaryService_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$1 */
    static final class C151621 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C151621(Continuation<? super C151621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151621 c151621 = EquityAdvancedOrderDuxo.this.new C151621(continuation);
            c151621.L$0 = obj;
            return c151621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151621) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = EquityAdvancedOrderDuxo.this;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : new EquityAdvancedOrderDuxo$1$1$1(equityAdvancedOrderDuxo), (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : new EquityAdvancedOrderDuxo$1$1$1(equityAdvancedOrderDuxo), (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : new EquityAdvancedOrderDuxo$1$1$1(equityAdvancedOrderDuxo), (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : new EquityAdvancedOrderDuxo$1$1$1(equityAdvancedOrderDuxo), (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$2 */
    static final class C151632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151632(Continuation<? super C151632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$2$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$2$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499311 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderViewState, Continuation<? super Boolean>, Object> {
                /* synthetic */ Object L$0;
                int label;

                C499311(Continuation<? super C499311> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499311 c499311 = new C499311(continuation);
                    c499311.L$0 = obj;
                    return c499311;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderViewState equityAdvancedOrderViewState, Continuation<? super Boolean> continuation) {
                    return ((C499311) create(equityAdvancedOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderViewState equityAdvancedOrderViewState = (EquityAdvancedOrderViewState) this.L$0;
                    return boxing.boxBoolean((equityAdvancedOrderViewState.getEquityOrderContext() == null || equityAdvancedOrderViewState.getEditMode() != EquityOrderConfiguration2.DETAIL || equityAdvancedOrderViewState.getNumpadState().isKeyboardVisible()) ? false : true);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<EquityAdvancedOrderViewState> stateFlow = this.this$0.getStateFlow();
                    C499311 c499311 = new C499311(null);
                    this.label = 1;
                    if (FlowKt.first(stateFlow, c499311, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                EquityAdvancedOrderDuxo.handlePrimaryButtonPress$default(this.this$0, null, null, true, false, 3, null);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (Timeout6.withTimeout(1000L, anonymousClass1, this) == coroutine_suspended) {
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

    public final BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> getRetryWhenRelay$lib_equity_advanced_order_externalDebug() {
        return this.retryWhenRelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderSummaryService getIdlOrderSummaryService() {
        return (EquityOrderSummaryService) this.idlOrderSummaryService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderSummaryService idlOrderSummaryService_delegate$lambda$0(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo) {
        return (EquityOrderSummaryService) equityAdvancedOrderDuxo.summaryComponent.getServiceLocator().getClient(EquityOrderSummaryService.class);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setTradingHours$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setTradingHours$1 */
    static final class C152111 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ OrderMarketHours $orderMarketHours;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152111(OrderMarketHours orderMarketHours, Continuation<? super C152111> continuation) {
            super(2, continuation);
            this.$orderMarketHours = orderMarketHours;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C152111 c152111 = EquityAdvancedOrderDuxo.this.new C152111(this.$orderMarketHours, continuation);
            c152111.L$0 = obj;
            return c152111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C152111) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (equityAdvancedOrderDataState instanceof ILimit) {
                EquityAdvancedOrderDuxo.this.defaultTradingHoursPref.set(this.$orderMarketHours.getServerValue());
                ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
                OrderMarketHours orderMarketHours = this.$orderMarketHours;
                if (iLimit instanceof LimitStandard) {
                    LimitStandard limitStandard = (LimitStandard) iLimit;
                    return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, null, orderMarketHours, null, null, null, false, false, null, false, 1019, null), 1, null);
                }
                if (!(iLimit instanceof LimitTaxLots)) {
                    throw new NoWhenBranchMatchedException();
                }
                LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
                return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, null, orderMarketHours, null, null, null, false, false, null, false, 1019, null), 1, null), null, 2, null);
            }
            return EquityAdvancedOrderDuxo.this.illegalMutation(equityAdvancedOrderDataState);
        }
    }

    public final void setTradingHours(OrderMarketHours orderMarketHours) {
        Intrinsics.checkNotNullParameter(orderMarketHours, "orderMarketHours");
        applyMutation(new C152111(orderMarketHours, null));
    }

    public static /* synthetic */ void setStrategy$default(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, SelectionStrategy selectionStrategy, BigDecimal bigDecimal, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            bigDecimal = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        equityAdvancedOrderDuxo.setStrategy(selectionStrategy, bigDecimal, z, z2);
    }

    public final void setStrategy(final SelectionStrategy selectionStrategy, final BigDecimal numberOfShares, final boolean navigateOnSuccess, final boolean skipMaxSharesDialog) {
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        if (selectionStrategy != SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
            withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.setStrategy$lambda$1(skipMaxSharesDialog, this, numberOfShares, selectionStrategy, navigateOnSuccess, (EquityAdvancedOrderDataState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setStrategy$lambda$1(boolean z, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, BigDecimal bigDecimal, SelectionStrategy selectionStrategy, boolean z2, EquityAdvancedOrderDataState it) {
        BigDecimal sharesAvailableForSellsTaxLots;
        String symbol;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof ITaxLots)) {
            return Unit.INSTANCE;
        }
        Position position = it.getCommonState().getPosition();
        if (position == null || (sharesAvailableForSellsTaxLots = position.getSharesAvailableForSellsTaxLots()) == null) {
            sharesAvailableForSellsTaxLots = BigDecimal.ZERO;
        }
        if (it.getNumberOfShares().compareTo(sharesAvailableForSellsTaxLots) <= 0) {
            if (bigDecimal == null) {
                bigDecimal = it.getNumberOfShares();
            }
            equityAdvancedOrderDuxo.setSelectionMethod(bigDecimal, ((ITaxLots) it).getTaxLotsState(), it.getCommonState().getAccountNumber(), selectionStrategy, z2);
        } else if (z) {
            BuildersKt__Builders_commonKt.launch$default(equityAdvancedOrderDuxo.getLifecycleScope(), null, null, new EquityAdvancedOrderDuxo$setStrategy$1$1(equityAdvancedOrderDuxo, it, null), 3, null);
        } else {
            Intrinsics.checkNotNull(sharesAvailableForSellsTaxLots);
            Instrument instrument = it.getCommonState().getInstrument();
            if (instrument == null || (symbol = instrument.getSymbol()) == null) {
                symbol = "";
            }
            equityAdvancedOrderDuxo.showTaxLotsNotEnoughSharesDialog(sharesAvailableForSellsTaxLots, symbol);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setSelectionMethod$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setSelectionMethod$1 */
    static final class C152091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $navigateOnSuccess;
        final /* synthetic */ BigDecimal $numberOfShares;
        final /* synthetic */ SelectionStrategy $selectionStrategy;
        final /* synthetic */ ITaxLots.TaxLotsState $taxLotsState;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152091(String str, SelectionStrategy selectionStrategy, BigDecimal bigDecimal, boolean z, ITaxLots.TaxLotsState taxLotsState, Continuation<? super C152091> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$selectionStrategy = selectionStrategy;
            this.$numberOfShares = bigDecimal;
            this.$navigateOnSuccess = z;
            this.$taxLotsState = taxLotsState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C152091(this.$accountNumber, this.$selectionStrategy, this.$numberOfShares, this.$navigateOnSuccess, this.$taxLotsState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        
            if (r13.fetchSelectedTaxLots(r1, r12) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C152091 c152091;
            SelectionStrategySummary strategySummary;
            EquityAdvancedOrderDuxo equityAdvancedOrderDuxo;
            SelectionStrategy selectionStrategy;
            ITaxLots.TaxLotsState taxLotsState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TaxLotsCachedService taxLotsCachedService = EquityAdvancedOrderDuxo.this.taxLotsCachedService;
                String str = this.$accountNumber;
                Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                UUID refId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getRefId();
                UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId();
                SelectionStrategy selectionStrategy2 = this.$selectionStrategy;
                BigDecimal bigDecimal = this.$numberOfShares;
                this.label = 1;
                c152091 = this;
                obj = taxLotsCachedService.setTaxLotsSelectionMethod(str, refId, instrumentId, selectionStrategy2, bigDecimal, c152091);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    c152091 = this;
                    if (c152091.$navigateOnSuccess) {
                        EquityAdvancedOrderDuxo equityAdvancedOrderDuxo2 = EquityAdvancedOrderDuxo.this;
                        String str2 = c152091.$accountNumber;
                        Companion companion2 = EquityAdvancedOrderDuxo.INSTANCE;
                        equityAdvancedOrderDuxo2.submit(new EquityOrderEvent.Advanced.ShowTaxLotsSelection(str2, ((EquityAdvancedOrderFragment.Args) companion2.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getRefId(), ((EquityAdvancedOrderFragment.Args) companion2.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId(), null));
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                equityAdvancedOrderDuxo = (EquityAdvancedOrderDuxo) this.L$3;
                strategySummary = (SelectionStrategySummary) this.L$2;
                selectionStrategy = (SelectionStrategy) this.L$1;
                taxLotsState = (ITaxLots.TaxLotsState) this.L$0;
                ResultKt.throwOnFailure(obj);
                equityAdvancedOrderDuxo.submit(new EquityOrderEvent.Advanced.ShowTaxLotMaxLotsDialog(strategySummary, selectionStrategy, ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext(), taxLotsState.getMaxNumberOfTaxLots()));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c152091 = this;
            if (((SetTaxLotsSelectionMethodResponse) obj).getFailure_reason() == null) {
                EquityAdvancedOrderDuxo.this.setShareQuantity$lib_equity_advanced_order_externalDebug(c152091.$numberOfShares);
                EquityAdvancedOrderDuxo.this.setNumberOfSharesRowText(c152091.$numberOfShares, TextField.NUMBER_OF_SHARES);
                if (c152091.$numberOfShares.compareTo(BigDecimal.ZERO) > 0) {
                    EquityAdvancedOrderDuxo equityAdvancedOrderDuxo3 = EquityAdvancedOrderDuxo.this;
                    String str3 = c152091.$accountNumber;
                    c152091.label = 2;
                }
                if (c152091.$navigateOnSuccess) {
                }
                return Unit.INSTANCE;
            }
            EquityAdvancedOrderDuxo.this.hideBottomSheet();
            strategySummary = c152091.$taxLotsState.getStrategySummary(c152091.$selectionStrategy);
            if (strategySummary != null) {
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo4 = EquityAdvancedOrderDuxo.this;
                SelectionStrategy selectionStrategy3 = c152091.$selectionStrategy;
                ITaxLots.TaxLotsState taxLotsState2 = c152091.$taxLotsState;
                StateFlow<EquityAdvancedOrderViewState> stateFlow = equityAdvancedOrderDuxo4.getStateFlow();
                c152091.L$0 = taxLotsState2;
                c152091.L$1 = selectionStrategy3;
                c152091.L$2 = strategySummary;
                c152091.L$3 = equityAdvancedOrderDuxo4;
                c152091.label = 3;
                Object objFirst = FlowKt.first(stateFlow, this);
                if (objFirst != coroutine_suspended) {
                    equityAdvancedOrderDuxo = equityAdvancedOrderDuxo4;
                    obj = objFirst;
                    selectionStrategy = selectionStrategy3;
                    taxLotsState = taxLotsState2;
                    equityAdvancedOrderDuxo.submit(new EquityOrderEvent.Advanced.ShowTaxLotMaxLotsDialog(strategySummary, selectionStrategy, ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext(), taxLotsState.getMaxNumberOfTaxLots()));
                }
            }
            return Unit.INSTANCE;
            return coroutine_suspended;
        }
    }

    private final void setSelectionMethod(BigDecimal numberOfShares, ITaxLots.TaxLotsState taxLotsState, String accountNumber, SelectionStrategy selectionStrategy, boolean navigateOnSuccess) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152091(accountNumber, selectionStrategy, numberOfShares, navigateOnSuccess, taxLotsState, null), 3, null);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$showTaxLotsNotEnoughSharesDialog$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {344}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$showTaxLotsNotEnoughSharesDialog$1 */
    static final class C152121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C152121(Continuation<? super C152121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C152121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.first(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventLogger.DefaultImpls.logTap$default(EquityAdvancedOrderDuxo.this.eventLogger, null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, "OVER_ALLOWED_SHARES_ALERT", null, 4, null), null, ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext(), false, 41, null);
            return Unit.INSTANCE;
        }
    }

    public final void showTaxLotsNotEnoughSharesDialog(BigDecimal maxAvailableShares, String symbol) {
        Intrinsics.checkNotNullParameter(maxAvailableShares, "maxAvailableShares");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152121(null), 3, null);
        submit(new EquityOrderEvent.Advanced.ShowNotEnoughSharesDialog(maxAvailableShares, symbol));
        hideBottomSheet();
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setTimeInForce$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setTimeInForce$1 */
    static final class C152101 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ OrderTimeInForce $timeInForce;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152101(OrderTimeInForce orderTimeInForce, Continuation<? super C152101> continuation) {
            super(2, continuation);
            this.$timeInForce = orderTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C152101 c152101 = EquityAdvancedOrderDuxo.this.new C152101(this.$timeInForce, continuation);
            c152101.L$0 = obj;
            return c152101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C152101) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (!(equityAdvancedOrderDataState instanceof ILimit)) {
                return EquityAdvancedOrderDuxo.this.illegalMutation(equityAdvancedOrderDataState);
            }
            ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
            OrderTimeInForce orderTimeInForce = this.$timeInForce;
            if (iLimit instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) iLimit;
                return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, orderTimeInForce, null, null, null, null, false, false, null, false, 1021, null), 1, null);
            }
            if (!(iLimit instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, orderTimeInForce, null, null, null, null, false, false, null, false, 1021, null), 1, null), null, 2, null);
        }
    }

    public final void setTimeInForce(OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        applyMutation(new C152101(timeInForce, null));
        this.defaultTimeInForcePref.set(timeInForce.getServerValue());
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$1 */
    static final class C151891 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C151891(Continuation<? super C151891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151891 c151891 = new C151891(continuation);
            c151891.L$0 = obj;
            return c151891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151891) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : commonState.getClock(), (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : commonState2.getClock(), (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : commonState3.getClock(), (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : commonState4.getClock(), (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C151891(null));
        Single singleFirstOrError = asObservable(this.marketHoursManager.getCurrentTradingSession()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onCreate$lambda$2(this.f$0, (TradingSession) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C151903(null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.RESUMED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C151914(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C151925(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C151936(null));
        Companion companion = INSTANCE;
        if (((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide() == EquityOrderSide.SELL_SHORT) {
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C151947(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C151958(null));
        }
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C151969(null));
        if (((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getConfiguration().getTaxLots()) {
            startTaxLots(Context7.buffer$default(RxConvert.asFlow(ObservablesKt.filterIsPresent(this.accountSwitcherStore.streamActiveAccountNumber())), Integer.MAX_VALUE, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onCreate$lambda$2(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, TradingSession tradingSession) {
        Companion companion = INSTANCE;
        if (((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getConfiguration().getTaxLots() && ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getConfiguration().getShareQuantity() == null) {
            AdvancedOrder configuration = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getConfiguration();
            DirectOrder2 directOrder2 = configuration instanceof DirectOrder2 ? (DirectOrder2) configuration : null;
            if ((directOrder2 != null ? directOrder2.getLimitPrice() : null) == null) {
                if (tradingSession instanceof TradingSession.Regular) {
                    equityAdvancedOrderDuxo.m1958xf90208f1(Order.Configuration.MARKET);
                } else {
                    equityAdvancedOrderDuxo.m1958xf90208f1(Order.Configuration.LIMIT);
                }
            }
        } else {
            Intrinsics.checkNotNull(tradingSession);
            if (!TradingSession2.allowsRegularHoursShorting(tradingSession) && ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getSide() == EquityOrderSide.SELL_SHORT) {
                equityAdvancedOrderDuxo.m1958xf90208f1(Order.Configuration.LIMIT);
                equityAdvancedOrderDuxo.setMarketHours$lib_equity_advanced_order_externalDebug(OrderMarketHours.EXTENDED_HOURS);
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$3", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {413}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$3 */
    static final class C151903 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151903(Continuation<? super C151903> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151903(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151903) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
                Flow<EquityOrderContext> flow = new Flow<EquityOrderContext>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
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
                                EquityOrderContext equityOrderContext = ((EquityAdvancedOrderViewState) obj).getEquityOrderContext();
                                if (equityOrderContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(equityOrderContext, anonymousClass1) == coroutine_suspended) {
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
                };
                this.label = 1;
                obj = FlowKt.first(flow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityOrderContext equityOrderContext = (EquityOrderContext) obj;
            TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(EquityAdvancedOrderDuxo.this.eventLogger, OrderFormStep.INITIAL_LOAD, equityOrderContext.toOrderPayload(), equityOrderContext.getBrokerageAccountType(), EquityOrderSourceLogging.toMetaSource(((EquityAdvancedOrderFragment.Args) EquityAdvancedOrderDuxo.INSTANCE.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getFlowSource()), null, null, null, 112, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$4", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {423, 424}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$4 */
    static final class C151914 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151914(Continuation<? super C151914> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151914(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151914) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$4$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Boolean>, Object> {
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
            public final Object invoke(Monitoring monitoring, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(monitoring, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(((Monitoring) this.L$0) instanceof Monitoring.Ready);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
        
            if (r6.Warmup(r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Monitoring> state = EquityAdvancedOrderDuxo.this.summaryComponent.getMicrogramMonitor().getState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (FlowKt.first(state, anonymousClass1, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EquityOrderSummaryService idlOrderSummaryService = EquityAdvancedOrderDuxo.this.getIdlOrderSummaryService();
            String string2 = ((EquityAdvancedOrderFragment.Args) EquityAdvancedOrderDuxo.INSTANCE.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            WarmupRequestDto warmupRequestDto = new WarmupRequestDto(string2);
            this.label = 2;
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {432}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5 */
    static final class C151925 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151925(Continuation<? super C151925> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151925(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151925) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OrderStore orderStore = EquityAdvancedOrderDuxo.this.orderStore;
                final StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
                Flow<Result<ApiEstimatedFees>> flowEstimateFees = FeeEstimation2.estimateFees(orderStore, new Flow<EquityOrderContext>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C151572(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2 */
                    public static final class C151572<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C151572.this.emit(null, this);
                            }
                        }

                        public C151572(FlowCollector flowCollector) {
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
                                EquityOrderContext equityOrderContext = ((EquityAdvancedOrderViewState) obj).getEquityOrderContext();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(equityOrderContext, anonymousClass1) == coroutine_suspended) {
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
                }, EquityAdvancedOrderDuxo.this.regionGateProvider);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowEstimateFees, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiEstimatedFees;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends ApiEstimatedFees>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends ApiEstimatedFees> result, Continuation<? super Unit> continuation) {
                return invoke2((Result<ApiEstimatedFees>) result, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Result<ApiEstimatedFees> result, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$2$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$5$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ Result<ApiEstimatedFees> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Result<ApiEstimatedFees> result, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = result;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    Result<ApiEstimatedFees> result = this.$it;
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : result, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : result, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : result, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : result, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Result) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {451}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6 */
    static final class C151936 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151936(Continuation<? super C151936> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151936(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151936) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingSessionChangedStore equityTradingSessionChangedStore = EquityAdvancedOrderDuxo.this.tradingSessionChangedStore;
                Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                Flow<GenericAlertContent<GenericAction>> flowTradingSessionChangedAlerts = equityTradingSessionChangedStore.tradingSessionChangedAlerts(((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId(), ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getSide(), new AnonymousClass1(EquityAdvancedOrderDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTradingSessionChangedAlerts, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {446}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super DirectOrder>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super DirectOrder> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                this.L$0 = equityAdvancedOrderDuxo;
                this.label = 1;
                final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(this));
                equityAdvancedOrderDuxo.withDataState(new Function1<EquityAdvancedOrderDataState, Unit>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
                        invoke2(equityAdvancedOrderDataState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EquityAdvancedOrderDataState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Continuation<DirectOrder> continuation = safeContinuationJvm;
                        Result.Companion companion = Result.INSTANCE;
                        continuation.resumeWith(Result.m28550constructorimpl(it.getWorkingConfiguration()));
                    }
                });
                Object orThrow = safeContinuationJvm.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(this);
                }
                return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GenericAlertContent<? extends GenericAction>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GenericAlertContent<? extends GenericAction> genericAlertContent, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(genericAlertContent, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GenericAlertContent genericAlertContent = (GenericAlertContent) this.L$0;
                if (genericAlertContent != null) {
                    this.this$0.applyMutation(new AnonymousClass1(genericAlertContent, null));
                } else {
                    this.this$0.dismissTradingSessionChangeAlert();
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6$2$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$6$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ GenericAlertContent<GenericAction> $alertContent;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(GenericAlertContent<? extends GenericAction> genericAlertContent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$alertContent = genericAlertContent;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$alertContent, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    GenericAlertContent<GenericAction> genericAlertContent = this.$alertContent;
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : genericAlertContent, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : genericAlertContent, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : genericAlertContent, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : genericAlertContent, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
            }
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {481}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7 */
    static final class C151947 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151947(Continuation<? super C151947> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151947(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151947) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnEach = FlowKt.onEach(FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(EquityAdvancedOrderDuxo.this.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null), new C15158x5c95f7fb(null, EquityAdvancedOrderDuxo.this)), new AnonymousClass2(EquityAdvancedOrderDuxo.this, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowOnEach, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Result;", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends ShortingInfo>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends ShortingInfo> result, Continuation<? super Unit> continuation) {
                return invoke2((Result<ShortingInfo>) result, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Result<ShortingInfo> result, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Result result = (Result) this.L$0;
                if (result != null && Result.m28555isFailureimpl(result.getValue())) {
                    Map<UUID, Boolean> borrowFeeFailureShown = this.this$0.shortingInfoStore.getBorrowFeeFailureShown();
                    Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                    if (!Intrinsics.areEqual(borrowFeeFailureShown.get(((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId()), boxing.boxBoolean(true))) {
                        this.this$0.shortingInfoStore.getBorrowFeeFailureShown().put(((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId(), boxing.boxBoolean(true));
                        this.this$0.submit(EquityOrderEvent.Advanced.ShowBorrowFeesUnavailableDialog.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Result;", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7$3", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Result<? extends ShortingInfo>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends ShortingInfo> result, Continuation<? super Unit> continuation) {
                return invoke2((Result<ShortingInfo>) result, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Result<ShortingInfo> result, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7$3$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$7$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ Result<ShortingInfo> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Result<ShortingInfo> result, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = result;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    Result<ShortingInfo> result = this.$it;
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : result, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : result, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : result, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : result, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Result) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$8", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {488}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$8 */
    static final class C151958 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151958(Continuation<? super C151958> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151958(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151958) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<TradingSession> currentTradingSession = EquityAdvancedOrderDuxo.this.marketHoursManager.getCurrentTradingSession();
                this.label = 1;
                obj = FlowKt.first(currentTradingSession, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!TradingSession2.allowsShorting((TradingSession) obj)) {
                EquityAdvancedOrderDuxo.this.applyMutation(new AnonymousClass1(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$8$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
            private /* synthetic */ Object L$0;
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
            public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                if (equityAdvancedOrderDataState instanceof MarketStandard) {
                    MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                    EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                    return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : true, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                }
                if (equityAdvancedOrderDataState instanceof LimitStandard) {
                    LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                    EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                    return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : true, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                }
                if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                    MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                    MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                    EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                    return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : true, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                }
                if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                    throw new NoWhenBranchMatchedException();
                }
                LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : true, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
            }
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$9", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {499}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$9 */
    static final class C151969 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151969(Continuation<? super C151969> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151969(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151969) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(EquityAdvancedOrderDuxo.this.experimentsStore, new Experiment[]{TradeEquitiesSduiAccountSwitcherExperiment.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "useSduiAccountSwitcher", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$9$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
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

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$9$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499351 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ boolean $useSduiAccountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499351(boolean z, Continuation<? super C499351> continuation) {
                    super(2, continuation);
                    this.$useSduiAccountSwitcher = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499351 c499351 = new C499351(this.$useSduiAccountSwitcher, continuation);
                    c499351.L$0 = obj;
                    return c499351;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((C499351) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    boolean z = this.$useSduiAccountSwitcher;
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : z, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : z, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : z, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : z, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499351(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        launchOrderTypeJobs();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151971(null), 3, null);
        Companion companion = INSTANCE;
        final UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId();
        Observable observableFilter = Observables.INSTANCE.combineLatest(this.retryWhenRelay, asObservable(getStateFlow())).map(new Function() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.onResume.2
            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            @Override // io.reactivex.functions.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean apply(Tuples2<? extends Optional<? extends Validator.Action.RetryWhen<? super EquityOrderContext>>, EquityAdvancedOrderViewState> tuples2) {
                boolean zBooleanValue;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<? extends Validator.Action.RetryWhen<? super EquityOrderContext>> optionalComponent1 = tuples2.component1();
                EquityAdvancedOrderViewState equityAdvancedOrderViewStateComponent2 = tuples2.component2();
                Validator.Action.RetryWhen<? super EquityOrderContext> orNull = optionalComponent1.getOrNull();
                if (orNull == null) {
                    zBooleanValue = false;
                } else {
                    EquityOrderContext equityOrderContext = equityAdvancedOrderViewStateComponent2.getEquityOrderContext();
                    Boolean boolValueOf = equityOrderContext != null ? Boolean.valueOf(orNull.matches(equityOrderContext)) : null;
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            }
        }).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.onResume.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean shouldRetryValidation) {
                Intrinsics.checkNotNullParameter(shouldRetryValidation, "shouldRetryValidation");
                return shouldRetryValidation.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$4(this.f$0, (Boolean) obj);
            }
        });
        this.instrumentStore.refresh(true, instrumentId);
        Observable<Instrument> observableDistinctUntilChanged = this.instrumentStore.getInstrument(instrumentId).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$5(this.f$0, (Instrument) obj);
            }
        });
        Observable<List<Account>> observableStreamAllSelfDirectedAccounts = this.accountProvider.streamAllSelfDirectedAccounts();
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamAllSelfDirectedAccounts, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$6(this.f$0, (List) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152017(observableStreamAllSelfDirectedAccounts, this, null), 3, null);
        refreshAccountSwitcher(((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getConfiguration().getAccountNumber());
        Observable<String> observableFilterIsPresent = ObservablesKt.filterIsPresent(this.accountSwitcherStore.streamActiveAccountNumber());
        LifecycleHost.DefaultImpls.bind$default(this, observableFilterIsPresent, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$7(this.f$0, (String) obj);
            }
        });
        if (((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide().isSell()) {
            Observable<R> observableSwitchMap = observableFilterIsPresent.switchMap(new Function() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.onResume.9
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Optional<WithholdingStatus>> apply(String accountNumber) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    return EquityAdvancedOrderDuxo.this.backupWithholdingStore.streamWithholdingStatus(accountNumber, instrumentId);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.onResume$lambda$8(this.f$0, (Optional) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.marketHoursManager.getCurrentTradingSession()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$9(this.f$0, (TradingSession) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.quoteStore.getStreamQuote().asObservable(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$10(this.f$0, (Quote) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursManager.nextOpenMarketHoursObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$11(this.f$0, (MarketHours) obj);
            }
        });
        UUID orderToReplaceId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getOrderToReplaceId();
        if (orderToReplaceId != null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.orderStore.getOrder(orderToReplaceId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.onResume$lambda$13$lambda$12(this.f$0, (Order) obj);
                }
            });
        }
        getPosition(instrumentId, observableFilterIsPresent);
        getInstrumentBuyingPowerForActiveAccount(observableFilterIsPresent);
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AdvancedMarketOrdersExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$14(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$15(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        if (!((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getConfiguration().getTaxLots()) {
            LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{EquitiesAdvancedOrderSubmission.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.onResume$lambda$16(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsKt.streamWithExperiment(this.regionGateProvider, this.experimentsStore, SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, false), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$17(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        if (((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide() == EquityOrderSide.BUY) {
            Observable observableTake = observableFilterIsPresent.switchMap(new Function() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.onResume.19
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Position> apply(String accountNumber) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    EquityAdvancedOrderDuxo.this.positionStore.refreshAccount(accountNumber, false);
                    return PositionStore.getPositionForAccount$default(EquityAdvancedOrderDuxo.this.positionStore, instrumentId, accountNumber, false, 4, null);
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.onResume$lambda$18(this.f$0, (Position) obj);
                }
            });
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {520}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$1 */
    static final class C151971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151971(Continuation<? super C151971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCoStreamVariant = EquityAdvancedOrderDuxo.this.experimentsStore.coStreamVariant(TradingSessionSubtitleExperiment.INSTANCE, TradingSessionSubtitleExperiment.Variant.CONTROL, true);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCoStreamVariant, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradingSessionSubtitleExperiment.Variant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TradingSessionSubtitleExperiment.Variant variant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499361 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ TradingSessionSubtitleExperiment.Variant $variant;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499361(TradingSessionSubtitleExperiment.Variant variant, Continuation<? super C499361> continuation) {
                    super(2, continuation);
                    this.$variant = variant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499361 c499361 = new C499361(this.$variant, continuation);
                    c499361.L$0 = obj;
                    return c499361;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((C499361) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    TradingSessionSubtitleExperiment.Variant variant = this.$variant;
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : variant));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : variant), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : variant)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : variant), null, 2, null), null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499361((TradingSessionSubtitleExperiment.Variant) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(final EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Boolean bool) {
        equityAdvancedOrderDuxo.withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.onResume$lambda$4$lambda$3(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4$lambda$3(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        validateAndReviewOrder$default(equityAdvancedOrderDuxo, dataState.getEquityOrderContext(), dataState.getCompletedConfiguration(), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Instrument instrument) {
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$5$1(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, List allAccounts) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$6$1(allAccounts, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$7", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$7 */
    static final class C152017 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<List<Account>> $allAccountsStream;
        int label;
        final /* synthetic */ EquityAdvancedOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152017(Observable<List<Account>> observable, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super C152017> continuation) {
            super(2, continuation);
            this.$allAccountsStream = observable;
            this.this$0 = equityAdvancedOrderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C152017(this.$allAccountsStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152017) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.$allAccountsStream), Integer.MAX_VALUE, null, 2, null), new C15159x3e24dbea(null, this.this$0));
                final EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.onResume.7.2

                    /* compiled from: EquityAdvancedOrderDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$7$2$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onResume$7$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                        final /* synthetic */ List<Account> $accountsWithMargin;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(List<Account> list, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$accountsWithMargin = list;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountsWithMargin, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                            return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                            List<Account> list = this.$accountsWithMargin;
                            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : list, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                            }
                            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : list, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                            }
                            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : list, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                            }
                            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : list, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Account>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<Account> list, Continuation<? super Unit> continuation) {
                        equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(list, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowTransformLatest.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, String activeAccountNumber) {
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$8$1(activeAccountNumber, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Optional optional) {
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$10$1((WithholdingStatus) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, TradingSession tradingSession) {
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$11$1(tradingSession, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$12$1(quote, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, MarketHours nextMarketHours) {
        Intrinsics.checkNotNullParameter(nextMarketHours, "nextMarketHours");
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$13$1(nextMarketHours, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13$lambda$12(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$14$1$1(order, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z) {
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$15$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z) {
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$16$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z) {
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$17$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z) {
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$18$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Position position) {
        EditingField editingField;
        if (Position5.isShortPosition(position)) {
            if (position.getSharesAvailableForClosingShortPosition().compareTo(BigDecimal.ZERO) <= 0 && ((EquityAdvancedOrderFragment.Args) INSTANCE.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getOrderToReplaceId() == null) {
                equityAdvancedOrderDuxo.submit(EquityOrderEvent.Advanced.ShowNoAvailableSharesDialog.INSTANCE);
            }
            if (!BigDecimals7.isInteger(position.getDisplayQuantity())) {
                editingField = EditingField.NUMBER_OF_FRACTIONAL_SHARES;
            } else {
                editingField = EditingField.NUMBER_OF_WHOLE_SHARES;
            }
            equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$onResume$20$1(editingField, null));
        }
        return Unit.INSTANCE;
    }

    private final void getPosition(final UUID instrumentId, Observable<String> accountNumberStream) {
        Observable observableTake = accountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.getPosition.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Position> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                EquityAdvancedOrderDuxo.this.positionStore.refreshAccount(accountNumber, false);
                return PositionStore.getPositionForAccount$default(EquityAdvancedOrderDuxo.this.positionStore, instrumentId, accountNumber, false, 4, null);
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.getPosition$lambda$19(this.f$0, (Position) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPosition$lambda$19(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Position position) {
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$getPosition$2$1(position, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleNumberChange$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleNumberChange$1 */
    static final class C151761 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ EditingField $editingField;
        final /* synthetic */ BigDecimal $value;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityAdvancedOrderDuxo this$0;

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleNumberChange$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EditingField.values().length];
                try {
                    iArr[EditingField.NUMBER_OF_WHOLE_SHARES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EditingField.NUMBER_OF_FRACTIONAL_SHARES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EditingField.LIMIT_PRICE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EditingField.TIME_IN_FORCE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EditingField.TRADING_SESSION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EditingField.TRADING_SESSION_SETTINGS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EditingField.ACCOUNT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EditingField.SELECT_LOTS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EditingField.STRATEGY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EditingField.ORDER_TYPE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151761(EditingField editingField, BigDecimal bigDecimal, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super C151761> continuation) {
            super(2, continuation);
            this.$editingField = editingField;
            this.$value = bigDecimal;
            this.this$0 = equityAdvancedOrderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151761 c151761 = new C151761(this.$editingField, this.$value, this.this$0, continuation);
            c151761.L$0 = obj;
            return c151761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151761) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ILimit.LimitState limitStateCopy$default;
            ILimit.LimitState limitStateCopy$default2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            switch (WhenMappings.$EnumSwitchMapping$0[this.$editingField.ordinal()]) {
                case 1:
                case 2:
                    String sharesQuantityText = InitialDataStateHelper2.toSharesQuantityText(this.$value);
                    if (!Intrinsics.areEqual(equityAdvancedOrderDataState.getCommonState().getNumberOfSharesString(), sharesQuantityText) && (equityAdvancedOrderDataState instanceof ITaxLots) && ((ITaxLots) equityAdvancedOrderDataState).getTaxLotsState().getCurrentSelectionStrategy() == SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
                        this.this$0.clearTaxLotSelection();
                    }
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : sharesQuantityText, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : sharesQuantityText, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : sharesQuantityText, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : sharesQuantityText, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                case 3:
                    if (!(equityAdvancedOrderDataState instanceof ILimit)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
                    BigDecimal bigDecimal = this.$value;
                    if (iLimit instanceof LimitStandard) {
                        LimitStandard limitStandard3 = (LimitStandard) iLimit;
                        ILimit.LimitState limitState = limitStandard3.getLimitState();
                        if (limitState.getUserLimitPriceString() == null || limitState.isFirstLimitPriceInteraction()) {
                            limitStateCopy$default2 = ILimit.LimitState.copy$default(limitState, bigDecimal == 0 ? (String) bigDecimal : bigDecimal.toString(), null, null, null, null, null, false, false, null, false, 510, null);
                        } else {
                            limitStateCopy$default2 = ILimit.LimitState.copy$default(limitState, bigDecimal == 0 ? (String) bigDecimal : bigDecimal.toString(), null, null, null, null, null, false, false, null, false, 1022, null);
                        }
                        return LimitStandard.copy$default(limitStandard3, null, limitStateCopy$default2, 1, null);
                    }
                    if (!(iLimit instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots2 = (LimitTaxLots) iLimit;
                    LimitStandard limitStandard4 = limitTaxLots2.getLimitStandard();
                    ILimit.LimitState limitState2 = limitTaxLots2.getLimitState();
                    if (limitState2.getUserLimitPriceString() == null || limitState2.isFirstLimitPriceInteraction()) {
                        limitStateCopy$default = ILimit.LimitState.copy$default(limitState2, bigDecimal == 0 ? (String) bigDecimal : bigDecimal.toString(), null, null, null, null, null, false, false, null, false, 510, null);
                    } else {
                        limitStateCopy$default = ILimit.LimitState.copy$default(limitState2, bigDecimal == 0 ? (String) bigDecimal : bigDecimal.toString(), null, null, null, null, null, false, false, null, false, 1022, null);
                    }
                    return LimitTaxLots.copy$default(limitTaxLots2, LimitStandard.copy$default(limitStandard4, null, limitStateCopy$default, 1, null), null, 2, null);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    throw new IllegalStateException(("should not be editing field " + this.$editingField + " with the keyboard").toString());
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void handleNumberChange(BigDecimal value, EditingField editingField) {
        Intrinsics.checkNotNullParameter(editingField, "editingField");
        applyMutation(new C151761(editingField, value, this, null));
    }

    public final void handleRowClicked(EditingField rowType) {
        Intrinsics.checkNotNullParameter(rowType, "rowType");
        switch (WhenMappings.$EnumSwitchMapping$0[rowType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                modifyWithKeyboard(rowType);
                return;
            case 4:
                logSelectionStrategyRowTap();
                modifyWithBottomSheet(rowType);
                return;
            case 5:
            case 6:
            case 7:
                modifyWithBottomSheet(rowType);
                return;
            case 8:
                showAccountSwitcher$lib_equity_advanced_order_externalDebug();
                return;
            case 9:
                showTaxLotsSelection$lib_equity_advanced_order_externalDebug();
                return;
            case 10:
                logOrderTypeTap();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$logOrderTypeTap$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {806}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$logOrderTypeTap$1 */
    static final class C151841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151841(Continuation<? super C151841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.first(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventLogger.DefaultImpls.logTap$default(EquityAdvancedOrderDuxo.this.eventLogger, null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.ROW, "ORDER_TYPE", null, 4, null), null, ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext(), false, 41, null);
            return Unit.INSTANCE;
        }
    }

    private final void logOrderTypeTap() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151841(null), 3, null);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$logSelectionStrategyTap$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {821}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$logSelectionStrategyTap$1 */
    static final class C151861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SelectionStrategy $selectionStrategy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151861(SelectionStrategy selectionStrategy, Continuation<? super C151861> continuation) {
            super(2, continuation);
            this.$selectionStrategy = selectionStrategy;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151861(this.$selectionStrategy, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
                this.label = 1;
                objFirst = FlowKt.first(stateFlow, this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objFirst = obj;
            }
            Context loggingEquityOrderContext = ((EquityAdvancedOrderViewState) objFirst).getLoggingEquityOrderContext();
            TraderEventLogger traderEventLogger = EquityAdvancedOrderDuxo.this.eventLogger;
            Screen screen = new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null);
            Component component = new Component(Component.ComponentType.ROW, "LOT_SELECTION_METHOD", null, 4, null);
            Context contextCopy$default = null;
            com.robinhood.rosetta.eventlogging.EquityOrderContext equityOrderContextCopy = null;
            if (loggingEquityOrderContext != null) {
                com.robinhood.rosetta.eventlogging.EquityOrderContext equity_order_context = loggingEquityOrderContext.getEquity_order_context();
                if (equity_order_context != null) {
                    equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : new TaxLotsContext(null, null, null, null, 0.0d, 0.0d, 0.0d, UtilsKt.toLoggingStrategy(this.$selectionStrategy), null, 383, null), (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
                }
                contextCopy$default = Context.copy$default(loggingEquityOrderContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
            }
            EventLogger.DefaultImpls.logTap$default(traderEventLogger, null, screen, component, null, contextCopy$default, false, 41, null);
            return Unit.INSTANCE;
        }
    }

    public final void logSelectionStrategyTap(SelectionStrategy selectionStrategy) {
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151861(selectionStrategy, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logSelectionStrategyBottomSheetDone() {
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.logSelectionStrategyBottomSheetDone$lambda$20(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logSelectionStrategyBottomSheetDone$lambda$20(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SelectionStrategy currentSelectionStrategy = ((ITaxLots) it).getTaxLotsState().getCurrentSelectionStrategy();
        if (currentSelectionStrategy == null) {
            currentSelectionStrategy = SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
        }
        BuildersKt__Builders_commonKt.launch$default(equityAdvancedOrderDuxo.getLifecycleScope(), null, null, new EquityAdvancedOrderDuxo$logSelectionStrategyBottomSheetDone$1$1(equityAdvancedOrderDuxo, currentSelectionStrategy, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$modifyWithKeyboard$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$modifyWithKeyboard$1 */
    static final class C151881 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ EditingField $editingField;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151881(EditingField editingField, Continuation<? super C151881> continuation) {
            super(2, continuation);
            this.$editingField = editingField;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151881 c151881 = new C151881(this.$editingField, continuation);
            c151881.L$0 = obj;
            return c151881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151881) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            EditingField editingField = this.$editingField;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    private final void modifyWithKeyboard(EditingField editingField) {
        applyMutation(new C151881(editingField, null));
        showKeyboard$lib_equity_advanced_order_externalDebug();
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$modifyWithBottomSheet$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$modifyWithBottomSheet$1 */
    static final class C151871 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ EditingField $editingField;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151871(EditingField editingField, Continuation<? super C151871> continuation) {
            super(2, continuation);
            this.$editingField = editingField;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151871 c151871 = new C151871(this.$editingField, continuation);
            c151871.L$0 = obj;
            return c151871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151871) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            EditingField editingField = this.$editingField;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : editingField, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    private final void modifyWithBottomSheet(EditingField editingField) {
        applyMutation(new C151871(editingField, null));
        hideKeyboard$default(this, null, 1, null);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$logSelectionStrategyRowTap$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {879}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$logSelectionStrategyRowTap$1 */
    static final class C151851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151851(Continuation<? super C151851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.first(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventLogger.DefaultImpls.logTap$default(EquityAdvancedOrderDuxo.this.eventLogger, null, new Screen(Screen.Name.EQUITY_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.ROW, "SELECT_LOTS_BY", null, 4, null), null, ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext(), false, 41, null);
            return Unit.INSTANCE;
        }
    }

    private final void logSelectionStrategyRowTap() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151851(null), 3, null);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleSelectLotsComplete$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleSelectLotsComplete$1 */
    static final class C151791 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ SelectLotsKey.Result $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151791(SelectLotsKey.Result result, Continuation<? super C151791> continuation) {
            super(2, continuation);
            this.$result = result;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151791 c151791 = new C151791(this.$result, continuation);
            c151791.L$0 = obj;
            return c151791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151791) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            Intrinsics.checkNotNull(equityAdvancedOrderDataState, "null cannot be cast to non-null type com.robinhood.android.equityadvancedorder.datastate.ITaxLots");
            final SelectLotsKey.Result result = this.$result;
            EquityAdvancedOrderDataState equityAdvancedOrderDataStateMutateTaxLots = ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleSelectLotsComplete$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityAdvancedOrderDuxo.C151791.invokeSuspend$lambda$0(result, (ITaxLots.TaxLotsState) obj2);
                }
            });
            SelectLotsKey.Result result2 = this.$result;
            if (equityAdvancedOrderDataStateMutateTaxLots instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataStateMutateTaxLots;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                SelectLotsKey.Result.Complete complete = (SelectLotsKey.Result.Complete) result2;
                if (complete.getNumberOfShares().compareTo(BigDecimal.ZERO) > 0) {
                    commonState = commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(complete.getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null);
                }
                return marketStandard.copy(commonState);
            }
            if (equityAdvancedOrderDataStateMutateTaxLots instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataStateMutateTaxLots;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                SelectLotsKey.Result.Complete complete2 = (SelectLotsKey.Result.Complete) result2;
                if (complete2.getNumberOfShares().compareTo(BigDecimal.ZERO) > 0) {
                    commonState2 = commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(complete2.getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null);
                }
                return LimitStandard.copy$default(limitStandard, commonState2, null, 2, null);
            }
            if (equityAdvancedOrderDataStateMutateTaxLots instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataStateMutateTaxLots;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                SelectLotsKey.Result.Complete complete3 = (SelectLotsKey.Result.Complete) result2;
                if (complete3.getNumberOfShares().compareTo(BigDecimal.ZERO) > 0) {
                    commonState3 = commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(complete3.getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null);
                }
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3), null, 2, null);
            }
            if (!(equityAdvancedOrderDataStateMutateTaxLots instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataStateMutateTaxLots;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            SelectLotsKey.Result.Complete complete4 = (SelectLotsKey.Result.Complete) result2;
            if (complete4.getNumberOfShares().compareTo(BigDecimal.ZERO) > 0) {
                commonState4 = commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(complete4.getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null);
            }
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4, null, 2, null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(SelectLotsKey.Result result, ITaxLots.TaxLotsState taxLotsState) {
            SelectLotsKey.Result.Complete complete = (SelectLotsKey.Result.Complete) result;
            return ITaxLots.TaxLotsState.copy$default(taxLotsState, complete.getSelectedLots(), null, false, null, complete.getNumberOfShares().compareTo(BigDecimal.ZERO) > 0 ? true : taxLotsState.getUserSelectedTaxLot(), null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, null);
        }
    }

    public final void handleSelectLotsComplete(SelectLotsKey.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof SelectLotsKey.Result.Complete) {
            applyMutation(new C151791(result, null));
            withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.handleSelectLotsComplete$lambda$21(this.f$0, (EquityAdvancedOrderDataState) obj);
                }
            });
        } else if (result instanceof SelectLotsKey.Result.Review) {
            applyMutation(new C151803(result, null));
            setNumberOfSharesRowText(((SelectLotsKey.Result.Review) result).getNumberOfShares(), TextField.NUMBER_OF_SHARES);
            withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.handleSelectLotsComplete$lambda$22(this.f$0, (EquityAdvancedOrderDataState) obj);
                }
            });
        } else if (!Intrinsics.areEqual(result, SelectLotsKey.Result.Canceled.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSelectLotsComplete$lambda$21(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ITaxLots) {
            handlePrimaryButtonPress$default(equityAdvancedOrderDuxo, null, null, false, false, 3, null);
        } else {
            CrashReporter.INSTANCE.log("returning from select lots for non tax lots?");
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleSelectLotsComplete$3", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleSelectLotsComplete$3 */
    static final class C151803 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ SelectLotsKey.Result $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151803(SelectLotsKey.Result result, Continuation<? super C151803> continuation) {
            super(2, continuation);
            this.$result = result;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151803 c151803 = new C151803(this.$result, continuation);
            c151803.L$0 = obj;
            return c151803;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151803) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            Intrinsics.checkNotNull(equityAdvancedOrderDataState, "null cannot be cast to non-null type com.robinhood.android.equityadvancedorder.datastate.ITaxLots");
            final SelectLotsKey.Result result = this.$result;
            EquityAdvancedOrderDataState equityAdvancedOrderDataStateMutateTaxLots = ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleSelectLotsComplete$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityAdvancedOrderDuxo.C151803.invokeSuspend$lambda$0(result, (ITaxLots.TaxLotsState) obj2);
                }
            });
            SelectLotsKey.Result result2 = this.$result;
            if (equityAdvancedOrderDataStateMutateTaxLots instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataStateMutateTaxLots;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(((SelectLotsKey.Result.Review) result2).getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataStateMutateTaxLots instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataStateMutateTaxLots;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(((SelectLotsKey.Result.Review) result2).getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataStateMutateTaxLots instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataStateMutateTaxLots;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(((SelectLotsKey.Result.Review) result2).getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataStateMutateTaxLots instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataStateMutateTaxLots;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : InitialDataStateHelper2.toSharesQuantityText(((SelectLotsKey.Result.Review) result2).getNumberOfShares()), (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(SelectLotsKey.Result result, ITaxLots.TaxLotsState taxLotsState) {
            SelectLotsKey.Result.Review review = (SelectLotsKey.Result.Review) result;
            return ITaxLots.TaxLotsState.copy$default(taxLotsState, review.getSelectedLots(), null, false, null, review.getNumberOfShares().compareTo(BigDecimal.ZERO) > 0 ? true : taxLotsState.getUserSelectedTaxLot(), null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSelectLotsComplete$lambda$22(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        validateAndReviewOrder$default(equityAdvancedOrderDuxo, dataState.getEquityOrderContext(), dataState.getCompletedConfiguration(), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNumberOfSharesRowText(BigDecimal numberOfShares, TextField textField) {
        String sharesQuantityText;
        String str = "";
        if (!BigDecimals7.isZero(numberOfShares) && (sharesQuantityText = InitialDataStateHelper2.toSharesQuantityText(numberOfShares)) != null) {
            str = sharesQuantityText;
        }
        submit(new EquityOrderEvent.Advanced.SetEditingFieldText(textField, str));
    }

    public static /* synthetic */ void handlePrimaryButtonPress$default(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, CoroutineScope coroutineScope, EquityOrderContext equityOrderContext, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = equityAdvancedOrderDuxo.getLifecycleScope();
        }
        if ((i & 2) != 0) {
            equityOrderContext = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        equityAdvancedOrderDuxo.handlePrimaryButtonPress(coroutineScope, equityOrderContext, z, z2);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1081}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1 */
    static final class C151781 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ boolean $allowReview;
        final /* synthetic */ boolean $log;
        final /* synthetic */ EquityOrderContext $overrideContext;
        final /* synthetic */ CoroutineScope $scope;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityAdvancedOrderDuxo this$0;

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[SelectionStrategy.values().length];
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_FIRST_IN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_LAST_IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_HIGHEST_COST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_LOWEST_COST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SelectionStrategy.SELECTION_STRATEGY_CUSTOM.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[EquityOrderConfiguration2.values().length];
                try {
                    iArr2[EquityOrderConfiguration2.SIMPLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[EquityOrderConfiguration2.DETAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151781(boolean z, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z2, EquityOrderContext equityOrderContext, CoroutineScope coroutineScope, Continuation<? super C151781> continuation) {
            super(2, continuation);
            this.$log = z;
            this.this$0 = equityAdvancedOrderDuxo;
            this.$allowReview = z2;
            this.$overrideContext = equityOrderContext;
            this.$scope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151781 c151781 = new C151781(this.$log, this.this$0, this.$allowReview, this.$overrideContext, this.$scope, continuation);
            c151781.L$0 = obj;
            return c151781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151781) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityAdvancedOrderDataState equityAdvancedOrderDataStateCopy$default;
            Object objFirst;
            EquityAdvancedOrderDataState equityAdvancedOrderDataState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityAdvancedOrderDataState equityAdvancedOrderDataState2 = (EquityAdvancedOrderDataState) this.L$0;
                if (this.$log) {
                    this.this$0.logButtonPress(equityAdvancedOrderDataState2.getCommonState().getEditMode());
                }
                int i2 = WhenMappings.$EnumSwitchMapping$1[equityAdvancedOrderDataState2.getCommonState().getEditMode().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (equityAdvancedOrderDataState2.getCommonState().isKeyboardVisible() && !(equityAdvancedOrderDataState2 instanceof MarketStandard)) {
                        EquityAdvancedOrderDuxo.hideKeyboard$default(this.this$0, null, 1, null);
                        return equityAdvancedOrderDataState2;
                    }
                    if (this.$allowReview && (equityAdvancedOrderDataState2 instanceof ITaxLots)) {
                        ITaxLots iTaxLots = (ITaxLots) equityAdvancedOrderDataState2;
                        if (iTaxLots.getTaxLotsState().getTaxLotM1ExperimentMember()) {
                            if ((equityAdvancedOrderDataState2 instanceof LimitTaxLots) && BigDecimals7.isZero(((LimitTaxLots) equityAdvancedOrderDataState2).getLimitPrice())) {
                                this.this$0.submit(EquityOrderEvent.Advanced.ShowMissingLimitPriceDialog.INSTANCE);
                                return equityAdvancedOrderDataState2;
                            }
                            BuildersKt__Builders_commonKt.launch$default(this.this$0.getLifecycleScope(), null, null, new AnonymousClass3(this.this$0, null), 3, null);
                            SelectionStrategy currentSelectionStrategy = iTaxLots.getTaxLotsState().getCurrentSelectionStrategy();
                            switch (currentSelectionStrategy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currentSelectionStrategy.ordinal()]) {
                                case -1:
                                case 5:
                                case 6:
                                    this.this$0.submit(new EquityOrderEvent.Advanced.ShowTaxLotsSelection(equityAdvancedOrderDataState2.getCommonState().getAccountNumber(), equityAdvancedOrderDataState2.getCommonState().getRefId(), ((EquityAdvancedOrderFragment.Args) EquityAdvancedOrderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInstrumentId(), equityAdvancedOrderDataState2.getNumberOfShares()));
                                    return equityAdvancedOrderDataState2;
                                case 0:
                                default:
                                    throw new NoWhenBranchMatchedException();
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    this.this$0.setStrategy(currentSelectionStrategy, equityAdvancedOrderDataState2.getNumberOfShares(), true, true);
                                    return equityAdvancedOrderDataState2;
                            }
                        }
                    }
                    boolean z = this.$allowReview;
                    if (z && (equityAdvancedOrderDataState2 instanceof ITaxLots)) {
                        BigDecimal bigDecimalShareQuantityOrNull = equityAdvancedOrderDataState2.getQuantityOrAmount().shareQuantityOrNull();
                        if (bigDecimalShareQuantityOrNull != null && !BigDecimals7.isInteger(bigDecimalShareQuantityOrNull) && (equityAdvancedOrderDataState2 instanceof ILimit)) {
                            this.this$0.submit(EquityOrderEvent.Advanced.ShowTaxLotLimitOrderFractionalLotsAlert.INSTANCE);
                            return equityAdvancedOrderDataState2;
                        }
                        TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
                        String accountNumber = equityAdvancedOrderDataState2.getCommonState().getAccountNumber();
                        Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                        Flow<StreamSelectedTaxLotsResponse> flowStreamSelectedTaxLots = taxLotsCachedService.streamSelectedTaxLots(accountNumber, ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getRefId(), ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId());
                        this.L$0 = equityAdvancedOrderDataState2;
                        this.label = 1;
                        objFirst = FlowKt.first(flowStreamSelectedTaxLots, this);
                        if (objFirst == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        equityAdvancedOrderDataState = equityAdvancedOrderDataState2;
                    } else if (z) {
                        EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                        EquityOrderContext equityOrderContext = this.$overrideContext;
                        if (equityOrderContext == null) {
                            equityOrderContext = equityAdvancedOrderDataState2.getEquityOrderContext();
                        }
                        equityAdvancedOrderDuxo.validateAndReviewOrder(equityOrderContext, equityAdvancedOrderDataState2.getCompletedConfiguration(), this.$scope);
                        return equityAdvancedOrderDataState2;
                    }
                } else if (equityAdvancedOrderDataState2.getReadyToAdvanceToDetailEdit()) {
                    EquityAdvancedOrderDuxo.hideKeyboard$default(this.this$0, null, 1, null);
                    if (!(equityAdvancedOrderDataState2 instanceof IMarket)) {
                        if (!(equityAdvancedOrderDataState2 instanceof ILimit)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ILimit iLimit = (ILimit) equityAdvancedOrderDataState2;
                        if (iLimit instanceof LimitStandard) {
                            LimitStandard limitStandard = (LimitStandard) iLimit;
                            ILimit.LimitState limitState = limitStandard.getLimitState();
                            String strNullIfEmpty = StringsKt.nullIfEmpty(limitState.getUserLimitPriceString());
                            if (strNullIfEmpty == null) {
                                strNullIfEmpty = iLimit.getDefaultLimitPriceString();
                            }
                            equityAdvancedOrderDataStateCopy$default = LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitState, strNullIfEmpty, null, null, null, null, null, false, false, null, false, 1022, null), 1, null);
                        } else {
                            if (!(iLimit instanceof LimitTaxLots)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
                            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                            ILimit.LimitState limitState2 = limitTaxLots.getLimitState();
                            String strNullIfEmpty2 = StringsKt.nullIfEmpty(limitState2.getUserLimitPriceString());
                            if (strNullIfEmpty2 == null) {
                                strNullIfEmpty2 = iLimit.getDefaultLimitPriceString();
                            }
                            equityAdvancedOrderDataStateCopy$default = LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, null, ILimit.LimitState.copy$default(limitState2, strNullIfEmpty2, null, null, null, null, null, false, false, null, false, 1022, null), 1, null), null, 2, null);
                        }
                        equityAdvancedOrderDataState2 = equityAdvancedOrderDataStateCopy$default;
                    }
                    if (equityAdvancedOrderDataState2 instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState2;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : EquityOrderConfiguration2.DETAIL, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState2 instanceof LimitStandard) {
                        LimitStandard limitStandard3 = (LimitStandard) equityAdvancedOrderDataState2;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard3.getCommonState();
                        return LimitStandard.copy$default(limitStandard3, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : EquityOrderConfiguration2.DETAIL, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState2 instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState2;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : EquityOrderConfiguration2.DETAIL, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState2 instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots2 = (LimitTaxLots) equityAdvancedOrderDataState2;
                    LimitStandard limitStandard4 = limitTaxLots2.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots2.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots2, LimitStandard.copy$default(limitStandard4, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : EquityOrderConfiguration2.DETAIL, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
                return equityAdvancedOrderDataState2;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            ResultKt.throwOnFailure(obj);
            objFirst = obj;
            List<TaxLotSelection> lots = ((StreamSelectedTaxLotsResponse) objFirst).getLots();
            EquityAdvancedOrderDuxo equityAdvancedOrderDuxo2 = this.this$0;
            equityAdvancedOrderDuxo2.applyMutation(new AnonymousClass4(equityAdvancedOrderDuxo2, this.$overrideContext, this.$scope, lots, null));
            return equityAdvancedOrderDataState;
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1$3", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1032}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<EquityAdvancedOrderViewState> stateFlow = this.this$0.getStateFlow();
                    this.label = 1;
                    obj = FlowKt.first(stateFlow, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                EventLogger.DefaultImpls.logTap$default(this.this$0.eventLogger, null, new Screen(Screen.Name.EQUITY_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.ROW, "VIEW_TAX_LOTS", null, 4, null), null, ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext(), false, 41, null);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1$4", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
            final /* synthetic */ EquityOrderContext $overrideContext;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ List<TaxLotSelection> $selectedTaxLots;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityOrderContext equityOrderContext, CoroutineScope coroutineScope, List<TaxLotSelection> list, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
                this.$overrideContext = equityOrderContext;
                this.$scope = coroutineScope;
                this.$selectedTaxLots = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$overrideContext, this.$scope, this.$selectedTaxLots, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                return ((AnonymousClass4) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EquityAdvancedOrderDataState equityAdvancedOrderDataStateMutateTaxLots;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                if (equityAdvancedOrderDataState instanceof ITaxLots) {
                    final List<TaxLotSelection> list = this.$selectedTaxLots;
                    equityAdvancedOrderDataStateMutateTaxLots = ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handlePrimaryButtonPress$1$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return EquityAdvancedOrderDuxo.C151781.AnonymousClass4.invokeSuspend$lambda$0(list, (ITaxLots.TaxLotsState) obj2);
                        }
                    });
                } else {
                    equityAdvancedOrderDataStateMutateTaxLots = equityAdvancedOrderDataState;
                }
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                EquityOrderContext equityOrderContext = this.$overrideContext;
                if (equityOrderContext == null) {
                    equityOrderContext = equityAdvancedOrderDataStateMutateTaxLots.getEquityOrderContext();
                }
                equityAdvancedOrderDuxo.validateAndReviewOrder(equityOrderContext, equityAdvancedOrderDataState.getCompletedConfiguration(), this.$scope);
                return equityAdvancedOrderDataStateMutateTaxLots;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(List list, ITaxLots.TaxLotsState taxLotsState) {
                return ITaxLots.TaxLotsState.copy$default(taxLotsState, list, null, false, null, false, null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
            }
        }
    }

    public final void handlePrimaryButtonPress(CoroutineScope scope, EquityOrderContext overrideContext, boolean allowReview, boolean log) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        applyMutation(new C151781(log, this, allowReview, overrideContext, scope, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logButtonPress(EquityOrderConfiguration2 originEditMode) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.EQUITY_ENTER_LIMIT_PRICE_PAGE, null, "LIMIT", null, 10, null), new Component(Component.ComponentType.BUTTON, EquityAdvancedOrderLoggingManager.INSTANCE.getStreamlineButtonPressIdentifier(originEditMode), null, 4, null), null, null, false, 57, null);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$recordSilentAlert$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$recordSilentAlert$1 */
    static final class C152071 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ GenericOrderCheckAction $action;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152071(GenericOrderCheckAction genericOrderCheckAction, Continuation<? super C152071> continuation) {
            super(2, continuation);
            this.$action = genericOrderCheckAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C152071 c152071 = new C152071(this.$action, continuation);
            c152071.L$0 = obj;
            return c152071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C152071) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            GenericOrderCheckAction genericOrderCheckAction = this.$action;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : commonState.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : CollectionsKt.plus((Collection<? extends GenericOrderCheckAction>) commonState.getSilentActionsTaken(), genericOrderCheckAction), (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : commonState2.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : CollectionsKt.plus((Collection<? extends GenericOrderCheckAction>) commonState2.getSilentActionsTaken(), genericOrderCheckAction), (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : commonState3.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : CollectionsKt.plus((Collection<? extends GenericOrderCheckAction>) commonState3.getSilentActionsTaken(), genericOrderCheckAction), (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : commonState4.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : CollectionsKt.plus((Collection<? extends GenericOrderCheckAction>) commonState4.getSilentActionsTaken(), genericOrderCheckAction), (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    public final void recordSilentAlert(GenericOrderCheckAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        applyMutation(new C152071(action, null));
    }

    public final void onSwipeToTrade(EquityOrderContext equityOrderContext) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "equityOrderContext");
        DirectOrderRequestDraft orderRequestDraft = equityOrderContext.getOrderRequestDraft();
        OrderSubmissionManager.submit$default(this.equityOrderManager, orderRequestDraft, null, false, 6, null);
        handleOrderSubmissionUpdates(orderRequestDraft.getRefId());
        applyMutation(new C152031(null));
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onSwipeToTrade$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$onSwipeToTrade$1 */
    static final class C152031 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C152031(Continuation<? super C152031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C152031 c152031 = new C152031(continuation);
            c152031.L$0 = obj;
            return c152031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C152031) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1150}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1 */
    static final class C151771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $orderUuid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151771(UUID uuid, Continuation<? super C151771> continuation) {
            super(2, continuation);
            this.$orderUuid = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151771(this.$orderUuid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(EquityAdvancedOrderDuxo.this.equityOrderManager.orderStateChanges(this.$orderUuid)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result;", "Lcom/robinhood/models/db/Order;", "Lcom/robinhood/models/db/DirectOrderRequestDraft;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderSubmissionManager.Result<? extends Order, ? extends DirectOrderRequestDraft>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(OrderSubmissionManager.Result<Order, DirectOrderRequestDraft> result, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(OrderSubmissionManager.Result<? extends Order, ? extends DirectOrderRequestDraft> result, Continuation<? super Unit> continuation) {
                return invoke2((OrderSubmissionManager.Result<Order, DirectOrderRequestDraft>) result, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OrderSubmissionManager.Result result = (OrderSubmissionManager.Result) this.L$0;
                if (result instanceof OrderSubmissionManager.Result.Sending) {
                    this.this$0.applyMutation(new C499331(null));
                } else if (result instanceof OrderSubmissionManager.Result.Submitted) {
                    this.this$0.submit(new EquityOrderEvent.Advanced.ConfirmOrderEvent((Order) ((OrderSubmissionManager.Result.Submitted) result).getData()));
                } else if (result instanceof OrderSubmissionManager.Result.Failure) {
                    this.this$0.applyMutation(new AnonymousClass2(null));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499331 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C499331(Continuation<? super C499331> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499331 c499331 = new C499331(continuation);
                    c499331.L$0 = obj;
                    return c499331;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((C499331) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : OrderForm6.SUBMITTING, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1$1$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$handleOrderSubmissionUpdates$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass2) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (equityAdvancedOrderDataState instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : OrderForm6.EDITING, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : OrderForm6.EDITING, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : OrderForm6.EDITING, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : OrderForm6.EDITING, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
            }
        }
    }

    public final void handleOrderSubmissionUpdates(UUID orderUuid) {
        Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151771(orderUuid, null), 3, null);
    }

    static /* synthetic */ void validateAndReviewOrder$default(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityOrderContext equityOrderContext, AdvancedOrder.Complete complete, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 4) != 0) {
            coroutineScope = equityAdvancedOrderDuxo.getLifecycleScope();
        }
        equityAdvancedOrderDuxo.validateAndReviewOrder(equityOrderContext, complete, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateAndReviewOrder(final EquityOrderContext context, final AdvancedOrder.Complete configuration, final CoroutineScope scope) {
        Function1 function1 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.validateAndReviewOrder$lambda$24(this.f$0, scope, configuration, context, (ValidationState) obj);
            }
        };
        if (context != null) {
            ValidateAndReviewEquityOrder.validateAndReviewEquityOrder(this, this.retryWhenRelay, context, ((EquityAdvancedOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getFlowSource(), this.equityOrderCheckValidator, function1, new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.validateAndReviewOrder$lambda$25(this.f$0, (EquityOrderEvent.OrderCheckEvent) obj);
                }
            }, scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAndReviewOrder$lambda$24(final EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, final CoroutineScope coroutineScope, final AdvancedOrder.Complete complete, final EquityOrderContext equityOrderContext, ValidationState validationState) {
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        if (Intrinsics.areEqual(validationState, ValidationState.Validated.INSTANCE)) {
            equityAdvancedOrderDuxo.withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDuxo.validateAndReviewOrder$lambda$24$lambda$23(coroutineScope, equityAdvancedOrderDuxo, complete, equityOrderContext, (EquityAdvancedOrderDataState) obj);
                }
            });
        } else {
            equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$validateAndReviewOrder$handleNoAlert$1$2(validationState, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAndReviewOrder$lambda$24$lambda$23(CoroutineScope coroutineScope, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, AdvancedOrder.Complete complete, EquityOrderContext equityOrderContext, EquityAdvancedOrderDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15216x146a9500(equityAdvancedOrderDuxo, state, complete, equityOrderContext, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAndReviewOrder$lambda$25(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityOrderEvent.OrderCheckEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        equityAdvancedOrderDuxo.submit(event);
        return Unit.INSTANCE;
    }

    public final void showKeyboard$lib_equity_advanced_order_externalDebug() {
        applyMutation(new EquityAdvancedOrderDuxo$showKeyboard$1(null));
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$hideKeyboard$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1275}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$hideKeyboard$1 */
    static final class C151821 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ FocusManager $focusManager;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151821(FocusManager focusManager, Continuation<? super C151821> continuation) {
            super(2, continuation);
            this.$focusManager = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151821 c151821 = new C151821(this.$focusManager, continuation);
            c151821.L$0 = obj;
            return c151821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151821) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityAdvancedOrderDataState equityAdvancedOrderDataState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityAdvancedOrderDataState equityAdvancedOrderDataState2 = (EquityAdvancedOrderDataState) this.L$0;
                if (equityAdvancedOrderDataState2.getCommonState().getEditMode() != EquityOrderConfiguration2.DETAIL) {
                    if (equityAdvancedOrderDataState2 instanceof MarketStandard) {
                        MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState2;
                        EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                        return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : commonState.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
                    }
                    if (equityAdvancedOrderDataState2 instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState2;
                        EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                        return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : commonState2.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
                    }
                    if (equityAdvancedOrderDataState2 instanceof MarketTaxLots) {
                        MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState2;
                        MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                        EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                        return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : commonState3.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState2 instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState2;
                    LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                    EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : commonState4.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$focusManager, null);
                this.L$0 = equityAdvancedOrderDataState2;
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                equityAdvancedOrderDataState = equityAdvancedOrderDataState2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard3 = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState5 = marketStandard3.getCommonState();
                return marketStandard3.copy(commonState5.copy((Integer.MAX_VALUE & 1) != 0 ? commonState5.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState5.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState5.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState5.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState5.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState5.editingField : commonState5.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState5.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState5.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState5.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState5.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState5.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState5.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState5.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState5.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState5.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState5.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState5.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState5.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState5.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState5.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState5.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState5.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState5.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState5.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState5.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState5.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState5.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState5.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState5.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState5.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState5.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState5.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState5.refId : null, (511 & 2) != 0 ? commonState5.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState5.orderFormState : null, (511 & 8) != 0 ? commonState5.subzeroEnabled : false, (511 & 16) != 0 ? commonState5.shortingInfo : null, (511 & 32) != 0 ? commonState5.clock : null, (511 & 64) != 0 ? commonState5.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState5.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState5.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard3 = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState6 = limitStandard3.getCommonState();
                return LimitStandard.copy$default(limitStandard3, commonState6.copy((Integer.MAX_VALUE & 1) != 0 ? commonState6.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState6.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState6.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState6.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState6.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState6.editingField : commonState6.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState6.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState6.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState6.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState6.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState6.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState6.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState6.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState6.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState6.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState6.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState6.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState6.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState6.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState6.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState6.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState6.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState6.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState6.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState6.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState6.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState6.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState6.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState6.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState6.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState6.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState6.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState6.refId : null, (511 & 2) != 0 ? commonState6.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState6.orderFormState : null, (511 & 8) != 0 ? commonState6.subzeroEnabled : false, (511 & 16) != 0 ? commonState6.shortingInfo : null, (511 & 32) != 0 ? commonState6.clock : null, (511 & 64) != 0 ? commonState6.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState6.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState6.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots2 = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard4 = marketTaxLots2.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState7 = marketTaxLots2.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots2, marketStandard4.copy(commonState7.copy((Integer.MAX_VALUE & 1) != 0 ? commonState7.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState7.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState7.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState7.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState7.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState7.editingField : commonState7.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState7.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState7.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState7.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState7.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState7.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState7.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState7.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState7.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState7.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState7.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState7.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState7.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState7.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState7.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState7.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState7.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState7.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState7.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState7.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState7.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState7.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState7.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState7.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState7.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState7.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState7.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState7.refId : null, (511 & 2) != 0 ? commonState7.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState7.orderFormState : null, (511 & 8) != 0 ? commonState7.subzeroEnabled : false, (511 & 16) != 0 ? commonState7.shortingInfo : null, (511 & 32) != 0 ? commonState7.clock : null, (511 & 64) != 0 ? commonState7.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState7.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState7.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots2 = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard4 = limitTaxLots2.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState8 = limitTaxLots2.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots2, LimitStandard.copy$default(limitStandard4, commonState8.copy((Integer.MAX_VALUE & 1) != 0 ? commonState8.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState8.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState8.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState8.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState8.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState8.editingField : commonState8.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState8.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState8.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState8.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState8.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState8.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState8.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState8.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState8.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState8.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState8.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState8.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState8.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState8.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState8.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState8.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState8.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState8.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState8.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState8.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState8.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState8.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState8.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState8.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState8.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState8.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState8.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState8.refId : null, (511 & 2) != 0 ? commonState8.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState8.orderFormState : null, (511 & 8) != 0 ? commonState8.subzeroEnabled : false, (511 & 16) != 0 ? commonState8.shortingInfo : null, (511 & 32) != 0 ? commonState8.clock : null, (511 & 64) != 0 ? commonState8.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState8.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState8.experimentVariant : null), null, 2, null), null, 2, null);
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$hideKeyboard$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$hideKeyboard$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FocusManager $focusManager;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FocusManager focusManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$focusManager = focusManager;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$focusManager, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FocusManager focusManager = this.$focusManager;
                if (focusManager == null) {
                    return null;
                }
                focusManager.clearFocus(true);
                return Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void hideKeyboard$default(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, FocusManager focusManager, int i, Object obj) {
        if ((i & 1) != 0) {
            focusManager = null;
        }
        equityAdvancedOrderDuxo.hideKeyboard(focusManager);
    }

    public final void hideKeyboard(FocusManager focusManager) {
        applyMutation(new C151821(focusManager, null));
    }

    public static /* synthetic */ void refreshAccountSwitcher$default(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        equityAdvancedOrderDuxo.refreshAccountSwitcher(str);
    }

    public final void refreshAccountSwitcher(String initialAccountNumber) {
        List list = CollectionsKt.toList(CollectionsKt.minus(BrokerageAccountType.getEntries(), BrokerageAccountType.ISA_STOCKS_AND_SHARES));
        if (((EquityAdvancedOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getConfiguration().getTaxLots()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((BrokerageAccountType) obj).isRetirement()) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            switch (WhenMappings.$EnumSwitchMapping$1[((BrokerageAccountType) obj2).ordinal()]) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    arrayList2.add(obj2);
                    break;
                case 8:
                    throw new IllegalStateException("ISA stocks and share brokerage type not supported");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.accountSwitcherStore;
        Companion companion = INSTANCE;
        InstrumentAccountSwitcherStore.refresh$default(instrumentAccountSwitcherStore, ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), arrayList2, false, 4, null);
        if (initialAccountNumber != null) {
            this.accountSwitcherStore.setActiveAccountNumber(initialAccountNumber);
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.accountSwitcherStore.forceFetchAccountSwitcher(((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), arrayList2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return EquityAdvancedOrderDuxo.refreshAccountSwitcher$lambda$29(this.f$0, (InstrumentAccountSwitcherStore2) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAccountSwitcher$lambda$29(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, InstrumentAccountSwitcherStore2 accountSwitcherRefreshState) {
        Intrinsics.checkNotNullParameter(accountSwitcherRefreshState, "accountSwitcherRefreshState");
        if (accountSwitcherRefreshState instanceof InstrumentAccountSwitcherStore2.Failure) {
            equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$refreshAccountSwitcher$2$1(null));
        } else if (Intrinsics.areEqual(accountSwitcherRefreshState, InstrumentAccountSwitcherStore2.Loading.INSTANCE)) {
            equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$refreshAccountSwitcher$2$2(null));
        } else {
            if (!(accountSwitcherRefreshState instanceof InstrumentAccountSwitcherStore2.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$refreshAccountSwitcher$2$3(accountSwitcherRefreshState, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setAccountNumber$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1358, 1361, 1359, 1362}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setAccountNumber$1 */
    static final class C152081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152081(String str, Continuation<? super C152081> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C152081(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (r8 != r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[PHI: r8
          0x0077: PHI (r8v10 java.lang.Object) = (r8v9 java.lang.Object), (r8v0 java.lang.Object) binds: [B:22:0x0074, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            SuitabilityStore suitabilityStore;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = EquityAdvancedOrderDuxo.this;
                String str2 = this.$accountNumber;
                this.label = 1;
                if (equityAdvancedOrderDuxo.clearSelectedTaxLots(str2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    str = (String) this.L$1;
                    suitabilityStore = (SuitabilityStore) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    OrderPositionEffect positionEffect = ((EquityAdvancedOrderViewState) obj).getPositionEffect();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    obj = suitabilityStore.shouldForceSuitability(str, positionEffect, this);
                    if (obj != coroutine_suspended) {
                        this.label = 4;
                        obj = FlowKt.first((Flow) obj, this);
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) ((Tuples2) obj).getFirst()).booleanValue()) {
                        EquityAdvancedOrderDuxo.this.accountSwitcherStore.setActiveAccountNumber(this.$accountNumber);
                    } else {
                        EquityAdvancedOrderDuxo.this.submit(new EquityOrderEvent.Advanced.ShowSuitabilityEvent(this.$accountNumber));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 4;
                obj = FlowKt.first((Flow) obj, this);
            }
            SuitabilityStore suitabilityStore2 = EquityAdvancedOrderDuxo.this.suitabilityStore;
            str = this.$accountNumber;
            StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
            this.L$0 = suitabilityStore2;
            this.L$1 = str;
            this.label = 2;
            Object objFirst = FlowKt.first(stateFlow, this);
            if (objFirst != coroutine_suspended) {
                suitabilityStore = suitabilityStore2;
                obj = objFirst;
                OrderPositionEffect positionEffect2 = ((EquityAdvancedOrderViewState) obj).getPositionEffect();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                obj = suitabilityStore.shouldForceSuitability(str, positionEffect2, this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C152081(accountNumber, null), 3, null);
        UUID instrumentId = ((EquityAdvancedOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId();
        Observable<String> observableJust = Observable.just(accountNumber);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        getPosition(instrumentId, observableJust);
        Observable<String> observableJust2 = Observable.just(accountNumber);
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        getInstrumentBuyingPowerForActiveAccount(observableJust2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (r1.setSelectedTaxLots(r2, r8, r9, r5, r6) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearSelectedTaxLots(String str, Continuation<? super Unit> continuation) {
        C151651 c151651;
        if (continuation instanceof C151651) {
            c151651 = (C151651) continuation;
            int i = c151651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c151651.label = i - Integer.MIN_VALUE;
            } else {
                c151651 = new C151651(continuation);
            }
        }
        C151651 c1516512 = c151651;
        Object objFirst = c1516512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1516512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.filterIsPresent(this.accountSwitcherStore.streamActiveAccountNumber())), Integer.MAX_VALUE, null, 2, null);
            c1516512.L$0 = str;
            c1516512.label = 1;
            objFirst = FlowKt.first(flowBuffer$default, c1516512);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
            return Unit.INSTANCE;
        }
        str = (String) c1516512.L$0;
        ResultKt.throwOnFailure(objFirst);
        String str2 = (String) objFirst;
        Companion companion = INSTANCE;
        if (!((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getConfiguration().getTaxLots() || Intrinsics.areEqual(str, str2)) {
            return Unit.INSTANCE;
        }
        TaxLotsCachedService taxLotsCachedService = this.taxLotsCachedService;
        UUID refId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getRefId();
        UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId();
        List<TaxLotSelection> listEmptyList = CollectionsKt.emptyList();
        c1516512.L$0 = null;
        c1516512.label = 2;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$hideBottomSheet$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$hideBottomSheet$1 */
    static final class C151811 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C151811(Continuation<? super C151811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151811 c151811 = EquityAdvancedOrderDuxo.this.new C151811(continuation);
            c151811.L$0 = obj;
            return c151811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151811) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if ((equityAdvancedOrderDataState instanceof ITaxLots) && ((ITaxLots) equityAdvancedOrderDataState).getTaxLotsState().getTaxLotM1ExperimentMember()) {
                EquityAdvancedOrderDuxo.this.logSelectionStrategyBottomSheetDone();
            }
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                EditingField editingField = commonState.getEditingField();
                if (editingField != null && editingField.getUsesBottomSheet()) {
                    commonState = commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null);
                }
                return marketStandard.copy(commonState);
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                EditingField editingField2 = commonState2.getEditingField();
                if (editingField2 != null && editingField2.getUsesBottomSheet()) {
                    commonState2 = commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null);
                }
                return LimitStandard.copy$default(limitStandard, commonState2, null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                EditingField editingField3 = commonState3.getEditingField();
                if (editingField3 != null && editingField3.getUsesBottomSheet()) {
                    commonState3 = commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null);
                }
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            EditingField editingField4 = commonState4.getEditingField();
            if (editingField4 != null && editingField4.getUsesBottomSheet()) {
                commonState4 = commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null);
            }
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4, null, 2, null), null, 2, null);
        }
    }

    public final void hideBottomSheet() {
        applyMutation(new C151811(null));
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$overrideToExecuteInMarketHoursOnlyAndValidate$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$overrideToExecuteInMarketHoursOnlyAndValidate$1 */
    static final class C152061 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C152061(Continuation<? super C152061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C152061 c152061 = new C152061(continuation);
            c152061.L$0 = obj;
            return c152061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C152061) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : true, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : true, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : true, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : true, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    public final void overrideToExecuteInMarketHoursOnlyAndValidate() {
        setMarketHours$lib_equity_advanced_order_externalDebug(OrderMarketHours.REGULAR_HOURS);
        applyMutation(new C152061(null));
        setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityAdvancedOrderDuxo.overrideToExecuteInMarketHoursOnlyAndValidate$lambda$30((EquityOrderContext) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overrideToExecuteInMarketHoursOnlyAndValidate$lambda$30(EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOnlyRegularHours();
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$overrideFlipIpoAccessSharesAndValidate$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$overrideFlipIpoAccessSharesAndValidate$1 */
    static final class C152051 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C152051(Continuation<? super C152051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C152051 c152051 = new C152051(continuation);
            c152051.L$0 = obj;
            return c152051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C152051) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : true, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : true, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : true, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : true, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    public final void overrideFlipIpoAccessSharesAndValidate() {
        applyMutation(new C152051(null));
        setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityAdvancedOrderDuxo.overrideFlipIpoAccessSharesAndValidate$lambda$31((EquityOrderContext) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overrideFlipIpoAccessSharesAndValidate$lambda$31(EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRequestContext().getOverrideFlipIpoAccessShares();
    }

    public final void appendOverridesAndValidate(final List<String> overridesToAppend) {
        Intrinsics.checkNotNullParameter(overridesToAppend, "overridesToAppend");
        Single singleFirstOrError = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.appendOverridesAndValidate.1
            @Override // io.reactivex.functions.Function
            public final List<String> apply(EquityAdvancedOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCheckOverrides();
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.appendOverridesAndValidate$lambda$33(overridesToAppend, this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendOverridesAndValidate$lambda$33(List list, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, List list2) {
        Intrinsics.checkNotNull(list2);
        final List listPlus = CollectionsKt.plus((Collection) list2, (Iterable) list);
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$appendOverridesAndValidate$2$1(listPlus, null));
        equityAdvancedOrderDuxo.setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityAdvancedOrderDuxo.appendOverridesAndValidate$lambda$33$lambda$32(listPlus, (EquityOrderContext) obj));
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean appendOverridesAndValidate$lambda$33$lambda$32(List list, EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getCheckOverrides(), list);
    }

    private final void setRetryWhen(Validator.Action.RetryWhen<? super EquityOrderContext> retryWhen) {
        this.retryWhenRelay.accept(Optional3.asOptional(retryWhen));
    }

    private final void getInstrumentBuyingPowerForActiveAccount(Observable<String> accountNumberStream) {
        Observable observableTake = accountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.getInstrumentBuyingPowerForActiveAccount.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InstrumentBuyingPower> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                UUID orderToReplaceId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getOrderToReplaceId();
                if (orderToReplaceId == null) {
                    EquityAdvancedOrderDuxo.this.instrumentBuyingPowerStore.refreshSelectedAccount(true, ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId(), accountNumber);
                    return EquityAdvancedOrderDuxo.this.instrumentBuyingPowerStore.getStreamSelectedAccountBuyingPowerForInstrument().asObservable(Tuples4.m3642to(((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId(), accountNumber));
                }
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = EquityAdvancedOrderDuxo.this;
                return equityAdvancedOrderDuxo.asObservable(equityAdvancedOrderDuxo.instrumentBuyingPowerStore.streamSelectedAccountBuyingPowerForInstrumentReplace(((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId(), accountNumber, orderToReplaceId));
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.getInstrumentBuyingPowerForActiveAccount$lambda$34(this.f$0, (InstrumentBuyingPower) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInstrumentBuyingPowerForActiveAccount$lambda$34(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, InstrumentBuyingPower instrumentBuyingPower) {
        equityAdvancedOrderDuxo.applyMutation(new C15174x6b9ed29a(instrumentBuyingPower, null));
        return Unit.INSTANCE;
    }

    public final void showAccountSwitcher$lib_equity_advanced_order_externalDebug() {
        hideKeyboard$default(this, null, 1, null);
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.showAccountSwitcher$lambda$36(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
        modifyWithBottomSheet(EditingField.ACCOUNT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAccountSwitcher$lambda$36(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState dataState) {
        TradeAccountSwitcherState.LoadedState loadedState;
        AccountSwitcherData data;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        InstrumentAccountSwitcherState accountSwitcherState = dataState.getAccountSwitcherState();
        if (accountSwitcherState != null && (loadedState = accountSwitcherState.getLoadedState()) != null && (data = loadedState.getData()) != null) {
            equityAdvancedOrderDuxo.submit(new EquityOrderEvent.Advanced.ShowAccountSwitcher(data));
        }
        return Unit.INSTANCE;
    }

    public final void showTaxLotsSelection$lib_equity_advanced_order_externalDebug() {
        applyMutation(new EquityAdvancedOrderDuxo$showTaxLotsSelection$1(null));
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.showTaxLotsSelection$lambda$37(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTaxLotsSelection$lambda$37(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState dataState) {
        String accountNumber;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BuildersKt__Builders_commonKt.launch$default(equityAdvancedOrderDuxo.getLifecycleScope(), null, null, new EquityAdvancedOrderDuxo$showTaxLotsSelection$2$1(dataState, equityAdvancedOrderDuxo, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(equityAdvancedOrderDuxo.getLifecycleScope(), null, null, new EquityAdvancedOrderDuxo$showTaxLotsSelection$2$2(equityAdvancedOrderDuxo, null), 3, null);
        Account activeAccount = dataState.getActiveAccount();
        if (activeAccount == null || (accountNumber = activeAccount.getAccountNumber()) == null) {
            throw new IllegalStateException("cannot start tax lots selection without an active account");
        }
        Companion companion = INSTANCE;
        equityAdvancedOrderDuxo.submit(new EquityOrderEvent.Advanced.ShowTaxLotsSelection(accountNumber, ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getRefId(), ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getInstrumentId(), null));
        return Unit.INSTANCE;
    }

    public final void setMarketHours$lib_equity_advanced_order_externalDebug(OrderMarketHours orderMarketHours) {
        Intrinsics.checkNotNullParameter(orderMarketHours, "orderMarketHours");
        applyMutation(new EquityAdvancedOrderDuxo$setMarketHours$1(this, orderMarketHours, null));
    }

    public final void setShareQuantity$lib_equity_advanced_order_externalDebug(BigDecimal shareQuantity) {
        Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
        String string2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(shareQuantity).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        applyMutation(new EquityAdvancedOrderDuxo$setShareQuantity$1(string2, null));
        submit(new EquityOrderEvent.Advanced.SetEditingFieldText(TextField.NUMBER_OF_SHARES, string2));
    }

    /* renamed from: cancelPendingCryptoOrders$lib_equity_advanced_order_externalDebug$default */
    public static /* synthetic */ Job m1956x36015f56(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return equityAdvancedOrderDuxo.m1957x10f102b9(j);
    }

    /* renamed from: cancelPendingCryptoOrders$lib_equity_advanced_order_externalDebug */
    public final Job m1957x10f102b9(long minTimeInFlight) {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new EquityAdvancedOrderDuxo$cancelPendingCryptoOrders$1(this, minTimeInFlight, null), 3, null);
    }

    public final void handleRowIconClick$lib_equity_advanced_order_externalDebug(EquityOrderFormRowState.Icon.IconId iconId) {
        Intrinsics.checkNotNullParameter(iconId, "iconId");
        int i = WhenMappings.$EnumSwitchMapping$2[iconId.ordinal()];
        if (i == 1) {
            m1962xfe13acee();
        } else if (i == 2) {
            m1961x1f153bdc();
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: showMarketDataDisclosureDialog$lib_equity_advanced_order_externalDebug */
    public final void m1962xfe13acee() {
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.showMarketDataDisclosureDialog$lambda$38(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMarketDataDisclosureDialog$lambda$38(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityAdvancedOrderDuxo.submit(new EquityOrderEvent.Advanced.ShowMarketDataDisclosureDialog(it.getCommonState().getQuote(), it.getWorkingConfiguration().getOrderConfiguration()));
        return Unit.INSTANCE;
    }

    /* renamed from: showBackupWithholdingDialog$lib_equity_advanced_order_externalDebug */
    public final void m1961x1f153bdc() {
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.showBackupWithholdingDialog$lambda$39(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showBackupWithholdingDialog$lambda$39(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityAdvancedOrderDuxo.submit(EquityOrderEvent.Advanced.ShowBackupWithholdingDialog.INSTANCE);
        return Unit.INSTANCE;
    }

    /* renamed from: setLimitOrderConfiguration$lib_equity_advanced_order_externalDebug */
    public final void m1959x1ad033f7(String accountNumber, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new EquityAdvancedOrderDuxo$setLimitOrderConfiguration$1(this, amount, accountNumber, null));
    }

    public final void editLimitOrder$lib_equity_advanced_order_externalDebug(EquityOrderContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        applyMutation(new EquityAdvancedOrderDuxo$editLimitOrder$1(this, context, null));
    }

    /* renamed from: onSwitchOrderConfiguration$lib_equity_advanced_order_externalDebug */
    public final void m1958xf90208f1(Order.Configuration incomingConfiguration) {
        Intrinsics.checkNotNullParameter(incomingConfiguration, "incomingConfiguration");
        applyMutation(new EquityAdvancedOrderDuxo$onSwitchOrderConfiguration$1(incomingConfiguration, this, null));
        launchOrderTypeJobs();
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$clearTaxLotSelection$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1717, 1718, 1724}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$clearTaxLotSelection$1 */
    static final class C151661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C151661(Continuation<? super C151661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
        
            if (r0.setTaxLotsSelectionMethod(r1, r3, r2, r4, r9, r10) != r7) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.filterIsPresent(EquityAdvancedOrderDuxo.this.accountSwitcherStore.streamActiveAccountNumber())), Integer.MAX_VALUE, null, 2, null);
                this.label = 1;
                objFirst = FlowKt.first(flowBuffer$default, this);
                if (objFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objFirst = obj;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                String str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                TaxLotsCachedService taxLotsCachedService = EquityAdvancedOrderDuxo.this.taxLotsCachedService;
                Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                UUID refId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getRefId();
                UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId();
                SelectionStrategy selectionStrategy = SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                BigDecimal bigDecimal = BigDecimal.ZERO;
                this.L$0 = null;
                this.label = 3;
            }
            str = (String) objFirst;
            TaxLotsCachedService taxLotsCachedService2 = EquityAdvancedOrderDuxo.this.taxLotsCachedService;
            Companion companion2 = EquityAdvancedOrderDuxo.INSTANCE;
            UUID refId2 = ((EquityAdvancedOrderFragment.Args) companion2.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getRefId();
            UUID instrumentId2 = ((EquityAdvancedOrderFragment.Args) companion2.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId();
            List<TaxLotSelection> listEmptyList = CollectionsKt.emptyList();
            this.L$0 = str;
            this.label = 2;
            if (taxLotsCachedService2.setSelectedTaxLots(str, refId2, instrumentId2, listEmptyList, this) != coroutine_suspended) {
                TaxLotsCachedService taxLotsCachedService3 = EquityAdvancedOrderDuxo.this.taxLotsCachedService;
                Companion companion3 = EquityAdvancedOrderDuxo.INSTANCE;
                UUID refId3 = ((EquityAdvancedOrderFragment.Args) companion3.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getRefId();
                UUID instrumentId3 = ((EquityAdvancedOrderFragment.Args) companion3.getArgs((HasSavedState) EquityAdvancedOrderDuxo.this)).getInstrumentId();
                SelectionStrategy selectionStrategy2 = SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                this.L$0 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final void clearTaxLotSelection() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151661(null), 3, null);
    }

    private final void launchOrderTypeJobs() {
        Job job = this.orderTypeJobs;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.launchOrderTypeJobs$lambda$40(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOrderTypeJobs$lambda$40(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState it) {
        Job jobLaunchLimitJobs;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof IMarket) {
            jobLaunchLimitJobs = null;
        } else {
            if (!(it instanceof ILimit)) {
                throw new NoWhenBranchMatchedException();
            }
            jobLaunchLimitJobs = equityAdvancedOrderDuxo.launchLimitJobs();
        }
        equityAdvancedOrderDuxo.orderTypeJobs = jobLaunchLimitJobs;
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1759}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1 */
    static final class C151831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C151831(Continuation<? super C151831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151831 c151831 = EquityAdvancedOrderDuxo.this.new C151831(continuation);
            c151831.L$0 = obj;
            return c151831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Job[] jobArr = {BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(EquityAdvancedOrderDuxo.this, null), 3, null), BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(EquityAdvancedOrderDuxo.this, null), 3, null), BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(EquityAdvancedOrderDuxo.this, null), 3, null), BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(EquityAdvancedOrderDuxo.this, null), 3, null), FlowKt.launchIn(FlowKt.onEach(Context7.buffer$default(RxConvert.asFlow(EquityAdvancedOrderDuxo.this.marketHoursManager.streamIsAdtHours()), Integer.MAX_VALUE, null, 2, null), new AnonymousClass5(EquityAdvancedOrderDuxo.this, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(EquityAdvancedOrderDuxo.this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null), new AnonymousClass6(EquityAdvancedOrderDuxo.this, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(ExperimentsProvider.DefaultImpls.coStreamVariant$default(EquityAdvancedOrderDuxo.this.experimentsStore, UserCanHideDefaultLimitPrice.INSTANCE, UserCanHideDefaultLimitPrice.Variant.CONTROL, false, 4, null), new AnonymousClass7(EquityAdvancedOrderDuxo.this, null)), coroutineScope)};
                this.label = 1;
                if (Await2.joinAll(jobArr, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1769}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                    if (((EquityAdvancedOrderFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getSide() != EquityOrderSide.SELL_SHORT) {
                        AdvancedOrder configuration = ((EquityAdvancedOrderFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getConfiguration();
                        DirectOrder2 directOrder2 = configuration instanceof DirectOrder2 ? (DirectOrder2) configuration : null;
                        if ((directOrder2 != null ? directOrder2.getMarketHours() : null) == null && ((EquityAdvancedOrderFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getOrderToReplaceId() == null && !((EquityAdvancedOrderFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getConfiguration().getTaxLots()) {
                            Observable<Instrument> observableDistinctUntilChanged = this.this$0.instrumentStore.getInstrument(((EquityAdvancedOrderFragment.Args) companion.getArgs(this.this$0.getSavedStateHandle())).getInstrumentId()).distinctUntilChanged();
                            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                            C499341 c499341 = new C499341(this.this$0, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(flowBuffer$default, c499341, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499341 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499341(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super C499341> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499341 c499341 = new C499341(this.this$0, continuation);
                    c499341.L$0 = obj;
                    return c499341;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                    return ((C499341) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Instrument instrument = (Instrument) this.L$0;
                    OrderMarketHours.Companion companion = OrderMarketHours.INSTANCE;
                    String str = this.this$0.defaultTradingHoursPref.get();
                    OrderMarketHours orderMarketHoursFromServerValue = companion.fromServerValue(str != null ? com.robinhood.android.equities.tradesettings.utils.StringsKt.blankToNull(str) : null);
                    if (orderMarketHoursFromServerValue != null) {
                        if (!Instrument4.isAllDayTradable(instrument) && orderMarketHoursFromServerValue == OrderMarketHours.ALL_DAY_HOURS) {
                            orderMarketHoursFromServerValue = null;
                        }
                        if (orderMarketHoursFromServerValue != null) {
                            EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                            equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$launchLimitJobs$1$1$1$2$1(equityAdvancedOrderDuxo, orderMarketHoursFromServerValue, null));
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$2$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (equityAdvancedOrderDataState instanceof LimitStandard) {
                        BooleanPreference booleanPreferenceLimitOrderFtuxTooltipShownpref = this.this$0.limitOrderFtuxTooltipShownpref((LimitStandard) equityAdvancedOrderDataState);
                        ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
                        if (iLimit instanceof LimitStandard) {
                            LimitStandard limitStandard = (LimitStandard) iLimit;
                            return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, null, null, null, booleanPreferenceLimitOrderFtuxTooltipShownpref != null ? boxing.boxBoolean(booleanPreferenceLimitOrderFtuxTooltipShownpref.get()) : null, null, false, false, null, false, ErrorCodes.IO_EXCEPTION, null), 1, null);
                        }
                        if (!(iLimit instanceof LimitTaxLots)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
                        return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, null, null, null, booleanPreferenceLimitOrderFtuxTooltipShownpref != null ? boxing.boxBoolean(booleanPreferenceLimitOrderFtuxTooltipShownpref.get()) : null, null, false, false, null, false, ErrorCodes.IO_EXCEPTION, null), 1, null), null, 2, null);
                    }
                    if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    return LimitTaxLots.copy$default((LimitTaxLots) equityAdvancedOrderDataState, null, null, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(equityAdvancedOrderDuxo, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$3", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1807}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<EquityAdvancedOrderViewState> stateFlow = this.this$0.getStateFlow();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                    this.label = 1;
                    if (FlowKt.first(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                final EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityAdvancedOrderDuxo.C151831.AnonymousClass3.invokeSuspend$lambda$0(equityAdvancedOrderDuxo, (EquityAdvancedOrderDataState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$3$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderViewState, Continuation<? super Boolean>, Object> {
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
                public final Object invoke(EquityAdvancedOrderViewState equityAdvancedOrderViewState, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return boxing.boxBoolean(((EquityAdvancedOrderViewState) this.L$0).getTooltipWillBeShown());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
                BooleanPreference booleanPreferenceLimitOrderFtuxTooltipShownpref;
                if ((equityAdvancedOrderDataState instanceof LimitStandard) && (booleanPreferenceLimitOrderFtuxTooltipShownpref = equityAdvancedOrderDuxo.limitOrderFtuxTooltipShownpref((LimitStandard) equityAdvancedOrderDataState)) != null) {
                    booleanPreferenceLimitOrderFtuxTooltipShownpref.set(true);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$4", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1821}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EquityOrderExpireDateStore equityOrderExpireDateStore = this.this$0.orderExpireDateStore;
                    this.label = 1;
                    obj = equityOrderExpireDateStore.getExpireDate(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String gtc_expire_datetime = ((ApiOrderExpireDate) obj).getGtc_expire_datetime();
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(equityAdvancedOrderDuxo, gtc_expire_datetime, null));
                return Unit.INSTANCE;
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$4$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ String $dateTimeStr;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                    this.$dateTimeStr = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$dateTimeStr, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (!(equityAdvancedOrderDataState instanceof ILimit)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
                    String str = this.$dateTimeStr;
                    if (iLimit instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) iLimit;
                        return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, null, null, str, null, null, false, false, null, false, 1015, null), 1, null);
                    }
                    if (!(iLimit instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, null, null, str, null, null, false, false, null, false, 1015, null), 1, null), null, 2, null);
                }
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isAdtHours", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$5", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$5$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ boolean $isAdtHours;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                    this.$isAdtHours = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$isAdtHours, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (!(equityAdvancedOrderDataState instanceof ILimit)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
                    boolean z = this.$isAdtHours;
                    if (iLimit instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) iLimit;
                        return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, null, null, null, null, boxing.boxBoolean(z), false, false, null, false, 991, null), 1, null);
                    }
                    if (!(iLimit instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, null, null, null, null, boxing.boxBoolean(z), false, false, null, false, 991, null), 1, null), null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(equityAdvancedOrderDuxo, z, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$6", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, continuation);
                anonymousClass6.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass6;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$6$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ boolean $isEnabled;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                    this.$isEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$isEnabled, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (!(equityAdvancedOrderDataState instanceof ILimit)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
                    boolean z = this.$isEnabled;
                    if (iLimit instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) iLimit;
                        return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, null, null, null, null, null, z, false, null, false, 959, null), 1, null);
                    }
                    if (!(iLimit instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, null, null, null, null, null, z, false, null, false, 959, null), 1, null), null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(equityAdvancedOrderDuxo, z, null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/android/equityadvancedorder/UserCanHideDefaultLimitPrice$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$7", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<UserCanHideDefaultLimitPrice.Variant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
                anonymousClass7.L$0 = obj;
                return anonymousClass7;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UserCanHideDefaultLimitPrice.Variant variant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$7$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$launchLimitJobs$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ UserCanHideDefaultLimitPrice.Variant $variant;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, UserCanHideDefaultLimitPrice.Variant variant, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                    this.$variant = variant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$variant, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (!(equityAdvancedOrderDataState instanceof ILimit)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
                    UserCanHideDefaultLimitPrice.Variant variant = this.$variant;
                    if (iLimit instanceof LimitStandard) {
                        LimitStandard limitStandard = (LimitStandard) iLimit;
                        return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, null, null, null, null, null, false, false, variant, false, 767, null), 1, null);
                    }
                    if (!(iLimit instanceof LimitTaxLots)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
                    return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, null, null, null, null, null, false, false, variant, false, 767, null), 1, null), null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UserCanHideDefaultLimitPrice.Variant variant = (UserCanHideDefaultLimitPrice.Variant) this.L$0;
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(equityAdvancedOrderDuxo, variant, null));
                return Unit.INSTANCE;
            }
        }
    }

    private final Job launchLimitJobs() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151831(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BooleanPreference limitOrderFtuxTooltipShownpref(LimitStandard limitStandard) {
        int i = WhenMappings.$EnumSwitchMapping$3[limitStandard.getCommonState().getSide().ordinal()];
        if (i == 1) {
            return this.streamlinedLimitOrderBuyOnboardingSeenPref;
        }
        if (i != 2) {
            return null;
        }
        return this.streamlinedLimitOrderSellOnboardingSeenPref;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1890}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1 */
    static final class C152151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C152151(Continuation<? super C152151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C152151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EquityAdvancedOrderViewState> stateFlow = EquityAdvancedOrderDuxo.this.getStateFlow();
                final EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = EquityAdvancedOrderDuxo.this;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<StreamOrderContextResponse>() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super StreamOrderContextResponse> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, equityAdvancedOrderDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = equityAdvancedOrderDuxo;
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
                                EquityOrderContext equityOrderContext = ((EquityAdvancedOrderViewState) obj).getEquityOrderContext();
                                StreamOrderContextResponse proto = equityOrderContext != null ? EquityOrderContexts.toProto(equityOrderContext, ((EquityAdvancedOrderFragment.Args) EquityAdvancedOrderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getRefId()) : null;
                                if (proto != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(proto, anonymousClass1) == coroutine_suspended) {
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
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderContext", "Lmicrogram/contracts/equity_order_context/proto/v1/StreamOrderContextResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1891}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$updateMicrogramEquityOrderContextService$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<StreamOrderContextResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamOrderContextResponse streamOrderContextResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(streamOrderContextResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StreamOrderContextResponse streamOrderContextResponse = (StreamOrderContextResponse) this.L$0;
                    EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                    this.label = 1;
                    if (equityAdvancedOrderDuxo.m1960xf1418bf5(streamOrderContextResponse, this) == coroutine_suspended) {
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
    }

    private final void updateMicrogramEquityOrderContextService() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152151(null), 3, null);
    }

    /* renamed from: setMicrogramEquityOrderContext$lib_equity_advanced_order_externalDebug */
    public final Object m1960xf1418bf5(StreamOrderContextResponse streamOrderContextResponse, Continuation<? super Unit> continuation) {
        EquityOrderContextService equityOrderContextService = this.taxLotsCachedService.getEquityOrderContextService();
        Intrinsics.checkNotNull(equityOrderContextService, "null cannot be cast to non-null type com.robinhood.android.equityordercontext.microgram.RealEquityOrderContextService");
        Object context = ((RealEquityOrderContextService) equityOrderContextService).setContext(streamOrderContextResponse, continuation);
        return context == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? context : Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsExperiment$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1906}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsExperiment$1 */
    static final class C151721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151721(Continuation<? super C151721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(EquityAdvancedOrderDuxo.this.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "m1Member", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsExperiment$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsExperiment$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
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

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsExperiment$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsExperiment$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499321 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ boolean $m1Member;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499321(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, boolean z, Continuation<? super C499321> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                    this.$m1Member = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499321 c499321 = new C499321(this.this$0, this.$m1Member, continuation);
                    c499321.L$0 = obj;
                    return c499321;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((C499321) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (!(equityAdvancedOrderDataState instanceof ITaxLots)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    final boolean z = this.$m1Member;
                    return ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsExperiment$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return EquityAdvancedOrderDuxo.C151721.AnonymousClass1.C499321.invokeSuspend$lambda$0(z, (ITaxLots.TaxLotsState) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(boolean z, ITaxLots.TaxLotsState taxLotsState) {
                    return ITaxLots.TaxLotsState.copy$default(taxLotsState, null, null, z, null, false, null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.applyMutation(new C499321(equityAdvancedOrderDuxo, z, null));
                return Unit.INSTANCE;
            }
        }
    }

    private final void fetchTaxLotsExperiment() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151721(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSelectedTaxLots(String str, Continuation<? super Unit> continuation) {
        C151681 c151681;
        if (continuation instanceof C151681) {
            c151681 = (C151681) continuation;
            int i = c151681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c151681.label = i - Integer.MIN_VALUE;
            } else {
                c151681 = new C151681(continuation);
            }
        }
        Object objFirst = c151681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c151681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            TaxLotsCachedService taxLotsCachedService = this.taxLotsCachedService;
            Companion companion = INSTANCE;
            Flow<StreamSelectedTaxLotsResponse> flowStreamSelectedTaxLots = taxLotsCachedService.streamSelectedTaxLots(str, ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getRefId(), ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId());
            c151681.label = 1;
            objFirst = FlowKt.first(flowStreamSelectedTaxLots, c151681);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        applyMutation(new C151692(((StreamSelectedTaxLotsResponse) objFirst).getLots(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchSelectedTaxLots$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchSelectedTaxLots$2 */
    static final class C151692 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ List<TaxLotSelection> $selectedTaxLots;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151692(List<TaxLotSelection> list, Continuation<? super C151692> continuation) {
            super(2, continuation);
            this.$selectedTaxLots = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151692 c151692 = new C151692(this.$selectedTaxLots, continuation);
            c151692.L$0 = obj;
            return c151692;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151692) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (!(equityAdvancedOrderDataState instanceof ITaxLots)) {
                return equityAdvancedOrderDataState;
            }
            final List<TaxLotSelection> list = this.$selectedTaxLots;
            return ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchSelectedTaxLots$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityAdvancedOrderDuxo.C151692.invokeSuspend$lambda$0(list, (ITaxLots.TaxLotsState) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(List list, ITaxLots.TaxLotsState taxLotsState) {
            return ITaxLots.TaxLotsState.copy$default(taxLotsState, list, null, false, null, !list.isEmpty(), null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, null);
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsDisposalOptions$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1942}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsDisposalOptions$1 */
    static final class C151711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C151711(Continuation<? super C151711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TaxLotsCachedService taxLotsCachedService = EquityAdvancedOrderDuxo.this.taxLotsCachedService;
                this.label = 1;
                obj = taxLotsCachedService.getSelectionStrategyOptions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = EquityAdvancedOrderDuxo.this;
            equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(equityAdvancedOrderDuxo, (List) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsDisposalOptions$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsDisposalOptions$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
            final /* synthetic */ List<AvailableSelectionStrategyOption> $options;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, List<AvailableSelectionStrategyOption> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
                this.$options = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$options, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                if (!(equityAdvancedOrderDataState instanceof ITaxLots)) {
                    return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                }
                final List<AvailableSelectionStrategyOption> list = this.$options;
                return ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchTaxLotsDisposalOptions$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityAdvancedOrderDuxo.C151711.AnonymousClass1.invokeSuspend$lambda$0(list, (ITaxLots.TaxLotsState) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(List list, ITaxLots.TaxLotsState taxLotsState) {
                return ITaxLots.TaxLotsState.copy$default(taxLotsState, null, null, false, list, false, null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
            }
        }
    }

    private final void fetchTaxLotsDisposalOptions() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151711(null), 3, null);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1974}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1 */
    static final class C151701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberStream;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151701(Flow<String> flow, Continuation<? super C151701> continuation) {
            super(2, continuation);
            this.$accountNumberStream = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C151701(this.$accountNumberStream, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(FlowKt.debounce(FlowKt.distinctUntilChanged(FlowKt.flowCombine(this.$accountNumberStream, FlowKt.mapLatest(EquityAdvancedOrderDuxo.this.getStateFlow(), new EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1(null)), AnonymousClass3.INSTANCE)), 100L), ExperimentsProvider.DefaultImpls.streamStateFlow$default(EquityAdvancedOrderDuxo.this.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 6, null), null, 2, null), new C15149x15aa0923(null, EquityAdvancedOrderDuxo.this));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(EquityAdvancedOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass5, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<String, BigDecimal, Continuation<? super Tuples2<? extends String, ? extends BigDecimal>>, Object>, ContinuationImpl6 {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(3, Tuples2.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(String str, BigDecimal bigDecimal, Continuation<? super Tuples2<? extends String, ? extends BigDecimal>> continuation) {
                return invoke2(str, bigDecimal, (Continuation<? super Tuples2<String, ? extends BigDecimal>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(String str, BigDecimal bigDecimal, Continuation<? super Tuples2<String, ? extends BigDecimal>> continuation) {
                return C151701.invokeSuspend$lambda$0(str, bigDecimal, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(String str, BigDecimal bigDecimal, Continuation continuation) {
            return new Tuples2(str, bigDecimal);
        }

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$5", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<StreamTaxLotsSelectionStrategySummaryResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(streamTaxLotsSelectionStrategySummaryResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityAdvancedOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$5$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                final /* synthetic */ StreamTaxLotsSelectionStrategySummaryResponse $it;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityAdvancedOrderDuxo;
                    this.$it = streamTaxLotsSelectionStrategySummaryResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                    if (!(equityAdvancedOrderDataState instanceof ITaxLots)) {
                        return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                    }
                    final StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse = this.$it;
                    return ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$5$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return EquityAdvancedOrderDuxo.C151701.AnonymousClass5.AnonymousClass1.invokeSuspend$lambda$0(streamTaxLotsSelectionStrategySummaryResponse, (ITaxLots.TaxLotsState) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse, ITaxLots.TaxLotsState taxLotsState) {
                    Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(streamTaxLotsSelectionStrategySummaryResponse.getMaximum_number_of_lots());
                    return ITaxLots.TaxLotsState.copy$default(taxLotsState, null, null, false, null, false, streamTaxLotsSelectionStrategySummaryResponse, intOrNull != null ? intOrNull.intValue() : 30, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse = (StreamTaxLotsSelectionStrategySummaryResponse) this.L$0;
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                equityAdvancedOrderDuxo.applyMutation(new AnonymousClass1(equityAdvancedOrderDuxo, streamTaxLotsSelectionStrategySummaryResponse, null));
                return Unit.INSTANCE;
            }
        }
    }

    private final void fetchStrategySummary(Flow<String> accountNumberStream) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C151701(accountNumberStream, null), 3, null);
    }

    private final void startTaxLots(Flow<String> accountNumberStream) {
        fetchTaxLotsExperiment();
        fetchTaxLotsDisposalOptions();
        updateMicrogramEquityOrderContextService();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C152131(accountNumberStream, null), 3, null);
        fetchStrategySummary(accountNumberStream);
        streamSelectionStrategy(accountNumberStream);
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$startTaxLots$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {2001, 2001}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$startTaxLots$1 */
    static final class C152131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberStream;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152131(Flow<String> flow, Continuation<? super C152131> continuation) {
            super(2, continuation);
            this.$accountNumberStream = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityAdvancedOrderDuxo.this.new C152131(this.$accountNumberStream, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r1.fetchSelectedTaxLots((java.lang.String) r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EquityAdvancedOrderDuxo equityAdvancedOrderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                equityAdvancedOrderDuxo = EquityAdvancedOrderDuxo.this;
                Flow<String> flow = this.$accountNumberStream;
                this.L$0 = equityAdvancedOrderDuxo;
                this.label = 1;
                obj = FlowKt.first(flow, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            equityAdvancedOrderDuxo = (EquityAdvancedOrderDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$streamSelectionStrategy$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {2011}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$streamSelectionStrategy$1 */
    static final class C152141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberStream;
        int label;
        final /* synthetic */ EquityAdvancedOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C152141(Flow<String> flow, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super C152141> continuation) {
            super(2, continuation);
            this.$accountNumberStream = flow;
            this.this$0 = equityAdvancedOrderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C152141(this.$accountNumberStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C152141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(this.$accountNumberStream, ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 6, null), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EquityAdvancedOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$streamSelectionStrategy$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {2012, 2016}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$streamSelectionStrategy$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityAdvancedOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityAdvancedOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
            
                if (r8.collect(r1, r7) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
                    Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
                    UUID refId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getRefId();
                    UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId();
                    this.label = 1;
                    obj = taxLotsCachedService.streamTaxLotsSelectionStrategy(str, refId, instrumentId, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged((Flow) obj);
                final EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo.streamSelectionStrategy.1.1.1

                    /* compiled from: EquityAdvancedOrderDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$streamSelectionStrategy$1$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$streamSelectionStrategy$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C499381 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
                        final /* synthetic */ StreamTaxLotsSelectionStrategyResponse $response;
                        private /* synthetic */ Object L$0;
                        int label;
                        final /* synthetic */ EquityAdvancedOrderDuxo this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C499381(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse, Continuation<? super C499381> continuation) {
                            super(2, continuation);
                            this.this$0 = equityAdvancedOrderDuxo;
                            this.$response = streamTaxLotsSelectionStrategyResponse;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C499381 c499381 = new C499381(this.this$0, this.$response, continuation);
                            c499381.L$0 = obj;
                            return c499381;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
                            return ((C499381) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
                            if (!(equityAdvancedOrderDataState instanceof ITaxLots)) {
                                return this.this$0.illegalMutation(equityAdvancedOrderDataState);
                            }
                            final StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse = this.$response;
                            return ((ITaxLots) equityAdvancedOrderDataState).mutateTaxLots(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$streamSelectionStrategy$1$1$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return EquityAdvancedOrderDuxo.C152141.AnonymousClass1.C499371.C499381.invokeSuspend$lambda$0(streamTaxLotsSelectionStrategyResponse, (ITaxLots.TaxLotsState) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final ITaxLots.TaxLotsState invokeSuspend$lambda$0(StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse, ITaxLots.TaxLotsState taxLotsState) {
                            return ITaxLots.TaxLotsState.copy$default(taxLotsState, null, null, false, null, false, null, 0, streamTaxLotsSelectionStrategyResponse.getSelection_strategy(), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StreamTaxLotsSelectionStrategyResponse) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StreamTaxLotsSelectionStrategyResponse streamTaxLotsSelectionStrategyResponse, Continuation<? super Unit> continuation) {
                        EquityAdvancedOrderDuxo equityAdvancedOrderDuxo2 = equityAdvancedOrderDuxo;
                        equityAdvancedOrderDuxo2.applyMutation(new C499381(equityAdvancedOrderDuxo2, streamTaxLotsSelectionStrategyResponse, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 2;
            }
        }
    }

    private final void streamSelectionStrategy(Flow<String> accountNumberStream) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C152141(accountNumberStream, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityAdvancedOrderDataState illegalMutation(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
        String str;
        CrashReporter.Companion companion = CrashReporter.INSTANCE;
        if (equityAdvancedOrderDataState instanceof LimitStandard) {
            str = "LimitStandard";
        } else if (equityAdvancedOrderDataState instanceof LimitTaxLots) {
            str = "LimitTaxLots";
        } else if (equityAdvancedOrderDataState instanceof MarketStandard) {
            str = "MarketStandard";
        } else {
            if (!(equityAdvancedOrderDataState instanceof MarketTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "MarketTaxLots";
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(companion, new IllegalStateException("Illegal mutation. Current State: " + str), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
        return equityAdvancedOrderDataState;
    }

    public final void selectionStrategyUpdateCanceled() {
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.selectionStrategyUpdateCanceled$lambda$42(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectionStrategyUpdateCanceled$lambda$42(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState ds) {
        String sharesQuantityText;
        BigDecimal ZERO;
        Intrinsics.checkNotNullParameter(ds, "ds");
        List<TaxLotSelection> taxLots = ((ITaxLots) ds).getTaxLotsState().getTaxLots();
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (Object obj : taxLots) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            String shares = ((TaxLotSelection) obj).getShares();
            if (shares == null || (ZERO = BigDecimals7.toBigDecimalOrNull(shares)) == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            bigDecimalAdd = bigDecimalAdd.add(ZERO);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        equityAdvancedOrderDuxo.applyMutation(new EquityAdvancedOrderDuxo$selectionStrategyUpdateCanceled$1$1(bigDecimalAdd, null));
        TextField textField = TextField.NUMBER_OF_SHARES;
        String str = "";
        if (!BigDecimals7.isZero(bigDecimalAdd) && (sharesQuantityText = InitialDataStateHelper2.toSharesQuantityText(bigDecimalAdd)) != null) {
            str = sharesQuantityText;
        }
        equityAdvancedOrderDuxo.submit(new EquityOrderEvent.Advanced.SetEditingFieldText(textField, str));
        equityAdvancedOrderDuxo.setNumberOfSharesRowText(bigDecimalAdd, textField);
        return Unit.INSTANCE;
    }

    public final void handleSellAllButtonClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.handleSellAllButtonClick$lambda$45(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSellAllButtonClick$lambda$45(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState ds) {
        BigDecimal quantity;
        BigDecimal bigDecimalAbs;
        EquityAdvancedOrderDataState equityAdvancedOrderDataStateCopy$default;
        Intrinsics.checkNotNullParameter(ds, "ds");
        Position position = ds.getCommonState().getPosition();
        if (position != null && (quantity = position.getQuantity()) != null && (bigDecimalAbs = quantity.abs()) != null) {
            if (ds instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) ds;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                equityAdvancedOrderDataStateCopy$default = marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalAbs).toString(), (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            } else if (ds instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) ds;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                equityAdvancedOrderDataStateCopy$default = LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalAbs).toString(), (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            } else if (ds instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) ds;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                equityAdvancedOrderDataStateCopy$default = MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalAbs).toString(), (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            } else {
                if (!(ds instanceof LimitTaxLots)) {
                    throw new NoWhenBranchMatchedException();
                }
                LimitTaxLots limitTaxLots = (LimitTaxLots) ds;
                LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
                EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
                equityAdvancedOrderDataStateCopy$default = LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalAbs).toString(), (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
            }
            equityAdvancedOrderDuxo.setShareQuantity$lib_equity_advanced_order_externalDebug(bigDecimalAbs);
            equityAdvancedOrderDuxo.setNumberOfSharesRowText(bigDecimalAbs, TextField.NUMBER_OF_SHARES);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = equityAdvancedOrderDataStateCopy$default;
            validateAndReviewOrder$default(equityAdvancedOrderDuxo, equityAdvancedOrderDataState.getEquityOrderContext(), equityAdvancedOrderDataState.getCompletedConfiguration(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void handleTwentyFourHourButtonClick() {
        m1958xf90208f1(Order.Configuration.LIMIT);
    }

    public final void dismissTradingSessionChangeAlert() {
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.dismissTradingSessionChangeAlert$lambda$46(this.f$0, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissTradingSessionChangeAlert$lambda$46(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(equityAdvancedOrderDuxo.getLifecycleScope(), null, null, new EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1(equityAdvancedOrderDuxo, it, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void logOrderCheckAction(final String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        withDataState(new Function1() { // from class: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityAdvancedOrderDuxo.logOrderCheckAction$lambda$48(this.f$0, loggingIdentifier, (EquityAdvancedOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOrderCheckAction$lambda$48(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, String str, EquityAdvancedOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EquityOrderContext equityOrderContext = it.getEquityOrderContext();
        if (equityOrderContext != null) {
            TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(equityAdvancedOrderDuxo.eventLogger, OrderFormStep.ORDER_CHECK_ACTION, equityOrderContext.toOrderPayload(), equityOrderContext.getBrokerageAccountType(), EquityOrderSourceLogging.toMetaSource(((EquityAdvancedOrderFragment.Args) INSTANCE.getArgs((HasSavedState) equityAdvancedOrderDuxo)).getFlowSource()), null, str, null, 80, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderFragment$Args;", "<init>", "()V", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EquityAdvancedOrderDuxo, EquityAdvancedOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityAdvancedOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EquityAdvancedOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityAdvancedOrderFragment.Args getArgs(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo) {
            return (EquityAdvancedOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, equityAdvancedOrderDuxo);
        }
    }
}
