package com.robinhood.android.trade.equity.p261ui.share;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.EquityOrderSourceLogging;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.equity.FeeEstimation2;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.equity.TaxLotsM1Experiment;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.equity.validation.CryptoPendingAndCancelExtension;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderContextStore;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equity.validation.ValidateAndReviewEquityOrder;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryService2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.experiments.TradeEquitiesSduiAccountSwitcherExperiment;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.lib.trade.view.AccountSwitcherExtensions;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.nbbo.NbboAnalytics;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.trade.equity.account.AccountSwitcherRefreshEvent;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderDataState;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderDuxo;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment;
import com.robinhood.android.trade.equity.prefs.BuySellOrderOnboardingSeenPref;
import com.robinhood.android.trade.equity.util.BaseDuxos;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration3;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareLimit;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.android.trading.contracts.configuration.ShareSimpleLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLimit;
import com.robinhood.android.trading.contracts.configuration.ShareStopLoss;
import com.robinhood.android.trading.contracts.configuration.ShareTrailingStop;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.HasShownAdtOnboardingBottomSheetPref;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.BuySellOrderOnboardingStore;
import com.robinhood.librobinhood.data.store.CollateralStore;
import com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager;
import com.robinhood.models.api.ApiBuySellOrderOnboardingResponse;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.EquityOrderMeta;
import com.robinhood.rosetta.eventlogging.EquityOrderPayload;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.SuitabilityStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.math.BigDecimals7;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import equity_order_summary.proto.p459v1.WarmupRequestDto;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.Collection;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.Monitoring;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: EquityShareOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ¢\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002¢\u0001B\u0085\u0002\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\b\b\u0001\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\b\b\u0001\u00104\u001a\u00020-\u0012\u0006\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u000208\u0012\u0006\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020<\u0012\u0006\u0010=\u001a\u00020>\u0012\u0006\u0010?\u001a\u00020@\u0012\u0006\u0010A\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\b\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020XH\u0016J\b\u0010Z\u001a\u00020XH\u0016J\r\u0010[\u001a\u00020XH\u0001¢\u0006\u0002\b\\J\u000e\u0010]\u001a\u00020X2\u0006\u0010U\u001a\u00020VJ\u000e\u0010^\u001a\u00020X2\u0006\u0010_\u001a\u00020SJ\u0016\u0010`\u001a\u00020X2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020S0RH\u0002J\u0010\u0010b\u001a\u00020c2\b\b\u0002\u0010d\u001a\u00020eJ\b\u0010f\u001a\u00020XH\u0002J\u000e\u0010g\u001a\u00020X2\u0006\u0010h\u001a\u00020iJ\u000e\u0010j\u001a\u00020X2\u0006\u0010k\u001a\u00020eJ\u000e\u0010l\u001a\u00020X2\u0006\u0010m\u001a\u00020nJ\u000e\u0010o\u001a\u00020X2\u0006\u0010p\u001a\u00020qJ\u000e\u0010r\u001a\u00020X2\u0006\u0010s\u001a\u00020eJ\u0006\u0010t\u001a\u00020XJ\u0006\u0010u\u001a\u00020XJ\u0014\u0010v\u001a\u00020X2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020y0xJ\u0010\u0010z\u001a\u00020c2\b\b\u0002\u0010{\u001a\u00020|J\u0006\u0010}\u001a\u00020XJ!\u0010~\u001a\u00020X2\u0006\u0010\u007f\u001a\u00020y2\u0007\u0010\u0080\u0001\u001a\u00020e2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0007\u0010\u0083\u0001\u001a\u00020XJ\u0011\u0010\u0084\u0001\u001a\u00020X2\u0006\u0010_\u001a\u00020SH\u0002J\u0007\u0010\u0085\u0001\u001a\u00020XJ\u0010\u0010\u0086\u0001\u001a\u00020X2\u0007\u0010\u0087\u0001\u001a\u00020yJ=\u0010\u0088\u0001\u001a\u00020X2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020y0\u008a\u00012\u000f\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008a\u00012\u0011\u0010\u008d\u0001\u001a\f\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u008a\u0001H\u0002J\u0007\u0010\u008f\u0001\u001a\u00020XJ\u000f\u0010\u0090\u0001\u001a\u00020XH\u0001¢\u0006\u0003\b\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u00020X2\u0006\u0010\u007f\u001a\u00020yJ\u0007\u0010\u0093\u0001\u001a\u00020XJ)\u0010\u0094\u0001\u001a\u00020X2\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020y0\u008a\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0001¢\u0006\u0003\b\u0098\u0001J\u0007\u0010\u0099\u0001\u001a\u00020XJE\u0010\u009a\u0001\u001a\u00020X2\u0006\u0010\u007f\u001a\u00020y2\u000b\b\u0002\u0010\u009b\u0001\u001a\u0004\u0018\u00010q2\u000b\b\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u00010q2\f\b\u0002\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u00012\f\b\u0002\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001J\u0007\u0010¡\u0001\u001a\u00020eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020BX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010I\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bK\u0010LR4\u0010O\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R T*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R\u0018\u00010Q0Q0PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020VX\u0082.¢\u0006\u0002\n\u0000¨\u0006£\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderViewState;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Share;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "equityOrderContextStore", "Lcom/robinhood/android/equity/validation/EquityOrderContextStore;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityTradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "buySellOrderOnboardingSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "buySellOrderOnboardingStore", "Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "twentyFourHourMarketOnboardingBottomSheetManager", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "hasShownAdtOnboardingBottomSheetPref", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/CollateralStore;Lcom/robinhood/android/equity/validation/EquityOrderContextStore;Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/android/equity/submission/EquityOrderManager;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/store/base/SuitabilityStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "summaryComponent", "Lmicrogram/android/inject/MicrogramComponent;", "idlOrderSummaryService", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "getIdlOrderSummaryService", "()Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "idlOrderSummaryService$delegate", "Lkotlin/Lazy;", "retryWhenRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "kotlin.jvm.PlatformType", "staticInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "onCreate", "", "onStart", "onResume", "streamSelectedTaxLots", "streamSelectedTaxLots$feature_trade_equity_externalDebug", "setStaticInputs", "submit", "equityOrderContext", "setRetryWhen", "retryWhen", "validateAndReviewOrder", "Lkotlinx/coroutines/Job;", "awaitContext", "", "generateSummary", "recordSilentAlert", "action", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "sellAll", "shouldValidate", "setConfiguration", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "setShareQuantity", "shareQuantity", "Ljava/math/BigDecimal;", "setReviewingState", "reviewing", "overrideToExecuteInMarketHoursOnlyAndValidate", "overrideFlipIpoAccessSharesAndValidate", "appendOverridesAndValidate", "overridesToAppend", "", "", "cancelPendingCryptoOrders", "minTimeInFlight", "", "refreshNbbo", "setAccountNumber", "accountNumber", "checkForceSuitability", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "refreshAccountSwitcher", "logSubmitEvent", "logSwipeToSubmit", "logOrderCheckAction", "loggingIdentifier", "maybeShowNotEnoughSharesDialog", "accountNumberStream", "Lio/reactivex/Observable;", "instrumentStream", "Lcom/robinhood/models/db/Instrument;", "oldOrderStream", "Lcom/robinhood/models/db/Order;", "markBuySellOrderOnboardingSeen", "fetchBuySellOrderOnboarding", "fetchBuySellOrderOnboarding$feature_trade_equity_externalDebug", "convertToShareQuantity", "dismissTradingSessionChangeAlert", "fetchAdtOnboardingBottomSheet", "selectedAccountNumberStream", "instrumentId", "Ljava/util/UUID;", "fetchAdtOnboardingBottomSheet$feature_trade_equity_externalDebug", "markAdtBottomSheetSeen", "startLimitOrderFlow", EquityShareOrderFragment.ARG_SHARES, "limitPrice", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "onBackPressedMaybeEditOrder", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityShareOrderDuxo extends BaseDuxo3<EquityShareOrderDataState, EquityShareOrderViewState, EquityOrderEvent.Share> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final AnalyticsLogger analytics;
    private final BackupWithholdingStore backupWithholdingStore;
    private final BooleanPreference buySellOrderOnboardingSeenPref;
    private final BuySellOrderOnboardingStore buySellOrderOnboardingStore;
    private final CollateralStore collateralStore;
    private final EquityOrderCheckValidator equityOrderCheckValidator;
    private final EquityOrderContextStore equityOrderContextStore;
    private final EquityTradingSeenStatusStore equityTradingSeenStatusStore;
    private final EquityTradingSessionChangedStore equityTradingSessionChangedStore;
    private final TraderEventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference hasShownAdtOnboardingBottomSheetPref;

    /* renamed from: idlOrderSummaryService$delegate, reason: from kotlin metadata */
    private final Lazy idlOrderSummaryService;
    private final InstrumentAccountSwitcherStore instrumentAccountSwitcherStore;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final NbboSummaryStore nbboSummaryStore;
    private final EquityOrderManager orderManager;
    private final OrderStore orderStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> retryWhenRelay;
    private final SavedStateHandle savedStateHandle;
    private final ShortingInfoStore shortingInfoStore;
    private EquityOrderRequestInputs.StaticInputs staticInputs;
    private final SuitabilityStore suitabilityStore;
    private final MicrogramComponent summaryComponent;
    private final TaxLotsCachedService taxLotsCachedService;
    private final TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Order.Configuration.values().length];
            try {
                iArr[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Order.Configuration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Order.Configuration.STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Order.Configuration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Order.Configuration.TRAILING_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EquityShareOrderDuxo(AccountProvider accountProvider, AnalyticsLogger analytics, BackupWithholdingStore backupWithholdingStore, CollateralStore collateralStore, EquityOrderContextStore equityOrderContextStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityTradingSessionChangedStore equityTradingSessionChangedStore, TraderEventLogger eventLogger, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, TraderMarketHoursManager marketHoursManager, NbboSummaryStore nbboSummaryStore, EquityOrderManager orderManager, PositionStore positionStore, QuoteStore quoteStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, SuitabilityStore suitabilityStore, @BuySellOrderOnboardingSeenPref BooleanPreference buySellOrderOnboardingSeenPref, BuySellOrderOnboardingStore buySellOrderOnboardingStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager, @HasShownAdtOnboardingBottomSheetPref BooleanPreference hasShownAdtOnboardingBottomSheetPref, OrderStore orderStore, TaxLotsCachedService taxLotsCachedService, ShortingInfoStore shortingInfoStore, AccountAccessStore accountAccessStore, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
        Intrinsics.checkNotNullParameter(equityOrderContextStore, "equityOrderContextStore");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
        Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        EquityShareOrderDataState.Companion companion = EquityShareOrderDataState.INSTANCE;
        Companion companion2 = INSTANCE;
        super(companion.initialState(((EquityShareOrderFragment.Args) companion2.getArgs(savedStateHandle)).getAccountNumber(), ((EquityShareOrderFragment.Args) companion2.getArgs(savedStateHandle)).getFlowSource(), ((EquityShareOrderFragment.Args) companion2.getArgs(savedStateHandle)).getSide()), new EquityShareOrderStateProvider(), duxoBundle);
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.backupWithholdingStore = backupWithholdingStore;
        this.collateralStore = collateralStore;
        this.equityOrderContextStore = equityOrderContextStore;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.equityTradingSessionChangedStore = equityTradingSessionChangedStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.instrumentStore = instrumentStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.marketHoursManager = marketHoursManager;
        this.nbboSummaryStore = nbboSummaryStore;
        this.orderManager = orderManager;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.suitabilityStore = suitabilityStore;
        this.buySellOrderOnboardingSeenPref = buySellOrderOnboardingSeenPref;
        this.buySellOrderOnboardingStore = buySellOrderOnboardingStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.twentyFourHourMarketOnboardingBottomSheetManager = twentyFourHourMarketOnboardingBottomSheetManager;
        this.hasShownAdtOnboardingBottomSheetPref = hasShownAdtOnboardingBottomSheetPref;
        this.orderStore = orderStore;
        this.taxLotsCachedService = taxLotsCachedService;
        this.shortingInfoStore = shortingInfoStore;
        this.accountAccessStore = accountAccessStore;
        this.savedStateHandle = savedStateHandle;
        this.summaryComponent = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-equity-order-summary", null, 2, null), null, 4, null);
        this.idlOrderSummaryService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityShareOrderDuxo.idlOrderSummaryService_delegate$lambda$0(this.f$0);
            }
        });
        BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.retryWhenRelay = behaviorRelayCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderSummaryService getIdlOrderSummaryService() {
        return (EquityOrderSummaryService) this.idlOrderSummaryService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderSummaryService idlOrderSummaryService_delegate$lambda$0(EquityShareOrderDuxo equityShareOrderDuxo) {
        return (EquityOrderSummaryService) equityShareOrderDuxo.summaryComponent.getServiceLocator().getClient(EquityOrderSummaryService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        final UUID instrumentId = staticInputs.getInstrumentId();
        Observable<String> observableFilterIsPresent = ObservablesKt.filterIsPresent(this.instrumentAccountSwitcherStore.streamActiveAccountNumber());
        Observable observableSwitchMap = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final ShareBasedOrderConfiguration apply(EquityShareOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getConfiguration();
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<NbboSummary>> apply(ShareBasedOrderConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return configuration instanceof ShareLimit ? ObservablesKt.toOptionals(EquityShareOrderDuxo.this.nbboSummaryStore.streamNbboSummary(instrumentId)) : ObservablesKt.toOptionals(EquityShareOrderDuxo.this.nbboSummaryStore.getStream().asObservable(instrumentId));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.RESUMED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C296134(null));
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onCreate$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296146(null), 3, null);
        EquityOrderRequestInputs.StaticInputs staticInputs2 = this.staticInputs;
        if (staticInputs2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs2 = null;
        }
        if (!staticInputs2.isPreIpo() && ((EquityShareOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOrderToReplaceId() != null) {
            EquityOrderRequestInputs.StaticInputs staticInputs3 = this.staticInputs;
            if (staticInputs3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
                staticInputs3 = null;
            }
            if (staticInputs3.getSide() != EquityOrderSide.SELL_SHORT) {
                fetchBuySellOrderOnboarding$feature_trade_equity_externalDebug();
                fetchAdtOnboardingBottomSheet$feature_trade_equity_externalDebug(observableFilterIsPresent, instrumentId);
            }
        }
        BaseDuxos.setupInitialLoadLogger(this, this.eventLogger);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C296157(null));
        withDataState(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onCreate$lambda$4(this.f$0, (EquityShareOrderDataState) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C296169(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2960810(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2960911(null));
        if (((EquityShareOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSide() == EquityOrderSide.SELL_SHORT) {
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2961012(null));
        }
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2961113(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(EquityShareOrderDuxo equityShareOrderDuxo, Optional optional) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onCreate$3$1((NbboSummary) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4 */
    static final class C296134 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296134(Continuation<? super C296134> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296134(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296134) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingSessionChangedStore equityTradingSessionChangedStore = EquityShareOrderDuxo.this.equityTradingSessionChangedStore;
                Companion companion = EquityShareOrderDuxo.INSTANCE;
                Flow<GenericAlertContent<GenericAction>> flowTradingSessionChangedAlerts = equityTradingSessionChangedStore.tradingSessionChangedAlerts(((EquityShareOrderFragment.Args) companion.getArgs((HasSavedState) EquityShareOrderDuxo.this)).getInstrumentId(), ((EquityShareOrderFragment.Args) companion.getArgs((HasSavedState) EquityShareOrderDuxo.this)).getSide(), new AnonymousClass1(EquityShareOrderDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityShareOrderDuxo.this, null);
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super DirectOrder>, Object> {
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = equityShareOrderDuxo;
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
                final StateFlow<EquityShareOrderViewState> stateFlow = this.this$0.getStateFlow();
                Flow<ShareBasedOrderConfiguration> flow = new Flow<ShareBasedOrderConfiguration>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ShareBasedOrderConfiguration> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C295932(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C295932<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C295932.this.emit(null, this);
                            }
                        }

                        public C295932(FlowCollector flowCollector) {
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
                                ShareBasedOrderConfiguration configuration = ((EquityShareOrderViewState) obj).getConfiguration();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(configuration, anonymousClass1) == coroutine_suspended) {
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
                this.label = 1;
                Object objFirst = FlowKt.first(flow, this);
                return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
            }
        }

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GenericAlertContent<? extends GenericAction>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
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

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$2$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$4$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
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
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : this.$alertContent, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(EquityShareOrderDuxo equityShareOrderDuxo, boolean z) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onCreate$5$1(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$6", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$6 */
    static final class C296146 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296146(Continuation<? super C296146> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296146(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296146) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsKt.streamWithExperiment(EquityShareOrderDuxo.this.regionGateProvider, EquityShareOrderDuxo.this.experimentsStore, SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, false)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityShareOrderDuxo.this, null);
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", KaizenExperiment.VARIATION_MEMBER, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$6$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
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

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$6$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505811 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
                final /* synthetic */ boolean $member;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505811(boolean z, Continuation<? super C505811> continuation) {
                    super(2, continuation);
                    this.$member = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505811 c505811 = new C505811(this.$member, continuation);
                    c505811.L$0 = obj;
                    return c505811;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((C505811) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : this.$member, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505811(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$7", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$7 */
    static final class C296157 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296157(Continuation<? super C296157> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296157(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296157) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$7$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$7$1, reason: invalid class name */
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

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            if (r6.Warmup(r1, r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            EquityOrderRequestInputs.StaticInputs staticInputs = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Monitoring> state = EquityShareOrderDuxo.this.summaryComponent.getMicrogramMonitor().getState();
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
            EquityOrderSummaryService idlOrderSummaryService = EquityShareOrderDuxo.this.getIdlOrderSummaryService();
            EquityOrderRequestInputs.StaticInputs staticInputs2 = EquityShareOrderDuxo.this.staticInputs;
            if (staticInputs2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            } else {
                staticInputs = staticInputs2;
            }
            String string2 = staticInputs.getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            WarmupRequestDto warmupRequestDto = new WarmupRequestDto(string2);
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(EquityShareOrderDuxo equityShareOrderDuxo, EquityShareOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getConfiguration() instanceof ShareMarket) {
            Observable<Boolean> observableTake = ExperimentsKt.isMarketBuysV2Enabled(equityShareOrderDuxo.regionGateProvider, equityShareOrderDuxo.experimentsStore, true).take(2L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(equityShareOrderDuxo, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityShareOrderDuxo.onCreate$lambda$4$lambda$3((Boolean) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4$lambda$3(Boolean bool) {
        return Unit.INSTANCE;
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.f2776x87e624cb}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9 */
    static final class C296169 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296169(Continuation<? super C296169> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296169(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296169) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EquityShareOrderViewState> stateFlow = EquityShareOrderDuxo.this.getStateFlow();
                Flow flowM28818catch = FlowKt.m28818catch(FlowKt.flow(new C29595xcba2c5e8(FlowKt.distinctUntilChanged(new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                EquityOrderContext equityOrderContext = ((EquityShareOrderViewState) obj).getEquityOrderContext();
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
                }, new Function2() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Boolean.valueOf(((EquityOrderContext) obj2).hasEqualCollateral((EquityOrderContext) obj3));
                    }
                }), null, EquityShareOrderDuxo.this)), new AnonymousClass4(null));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(EquityShareOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass5, this) == coroutine_suspended) {
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/api/ApiCollateral;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$4", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function3<FlowCollector<? super ApiCollateral>, Throwable, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super ApiCollateral> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = flowCollector;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    this.label = 1;
                    if (flowCollector.emit(null, this) == coroutine_suspended) {
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiCollateral;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$5", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<ApiCollateral, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiCollateral apiCollateral, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(apiCollateral, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$5$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$9$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
                final /* synthetic */ ApiCollateral $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ApiCollateral apiCollateral, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = apiCollateral;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : this.$it, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ApiCollateral) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10 */
    static final class C2960810 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2960810(Continuation<? super C2960810> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C2960810(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2960810) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OrderStore orderStore = EquityShareOrderDuxo.this.orderStore;
                final StateFlow<EquityShareOrderViewState> stateFlow = EquityShareOrderDuxo.this.getStateFlow();
                Flow<Result<ApiEstimatedFees>> flowEstimateFees = FeeEstimation2.estimateFees(orderStore, new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C295902(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$invokeSuspend$$inlined$map$1$2 */
                    public static final class C295902<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$invokeSuspend$$inlined$map$1$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C295902.this.emit(null, this);
                            }
                        }

                        public C295902(FlowCollector flowCollector) {
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
                                EquityOrderContext equityOrderContext = ((EquityShareOrderViewState) obj).getEquityOrderContext();
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
                }, EquityShareOrderDuxo.this.regionGateProvider);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityShareOrderDuxo.this, null);
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiEstimatedFees;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends ApiEstimatedFees>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
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

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$2$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$10$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
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
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : this.$it, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
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

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.f2774x74902ae0}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11 */
    static final class C2960911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2960911(Continuation<? super C2960911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C2960911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2960911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityOrderContextStore equityOrderContextStore = EquityShareOrderDuxo.this.equityOrderContextStore;
                final StateFlow<EquityShareOrderViewState> stateFlow = EquityShareOrderDuxo.this.getStateFlow();
                Flow<EquityOrderContext> flowInflate = equityOrderContextStore.inflate(FlowKt.filterNotNull(new Flow<EquityOrderRequestInputs>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderRequestInputs> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C295912(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$invokeSuspend$$inlined$map$1$2 */
                    public static final class C295912<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$invokeSuspend$$inlined$map$1$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C295912.this.emit(null, this);
                            }
                        }

                        public C295912(FlowCollector flowCollector) {
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
                                EquityOrderRequestInputs requestInputs = ((EquityShareOrderViewState) obj).getRequestInputs();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(requestInputs, anonymousClass1) == coroutine_suspended) {
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
                }));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityShareOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowInflate, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equity/validation/EquityOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EquityOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityOrderContext equityOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(equityOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$2$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$11$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
                final /* synthetic */ EquityOrderContext $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityOrderContext equityOrderContext, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = equityOrderContext;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : this.$it, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((EquityOrderContext) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$12", m3645f = "EquityShareOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$12 */
    static final class C2961012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2961012(Continuation<? super C2961012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C2961012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2961012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(EquityShareOrderDuxo.this.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null), new C29592xb9d48b3c(null, EquityShareOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityShareOrderDuxo.this, null);
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Result;", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$12$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$12$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends ShortingInfo>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
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

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$12$2$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$12$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
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
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : this.$it, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
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

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$13", m3645f = "EquityShareOrderDuxo.kt", m3646l = {340}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$13 */
    static final class C2961113 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2961113(Continuation<? super C2961113> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C2961113(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2961113) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(EquityShareOrderDuxo.this.experimentsStore, new Experiment[]{TradeEquitiesSduiAccountSwitcherExperiment.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityShareOrderDuxo.this, null);
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "useSduiAccountSwitcher", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$13$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$13$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
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

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$13$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onCreate$13$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505801 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
                final /* synthetic */ boolean $useSduiAccountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505801(boolean z, Continuation<? super C505801> continuation) {
                    super(2, continuation);
                    this.$useSduiAccountSwitcher = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505801 c505801 = new C505801(this.$useSduiAccountSwitcher, continuation);
                    c505801.L$0 = obj;
                    return c505801;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((C505801) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : this.$useSduiAccountSwitcher);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505801(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable observableFilter = Observables.INSTANCE.combineLatest(this.retryWhenRelay, asObservable(getStateFlow())).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onStart.1
            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            @Override // io.reactivex.functions.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean apply(Tuples2<? extends Optional<? extends Validator.Action.RetryWhen<? super EquityOrderContext>>, EquityShareOrderViewState> tuples2) {
                boolean zBooleanValue;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<? extends Validator.Action.RetryWhen<? super EquityOrderContext>> optionalComponent1 = tuples2.component1();
                EquityShareOrderViewState equityShareOrderViewStateComponent2 = tuples2.component2();
                Validator.Action.RetryWhen<? super EquityOrderContext> orNull = optionalComponent1.getOrNull();
                if (orNull == null) {
                    zBooleanValue = false;
                } else {
                    EquityOrderContext equityOrderContext = equityShareOrderViewStateComponent2.getEquityOrderContext();
                    Boolean boolValueOf = equityOrderContext != null ? Boolean.valueOf(orNull.matches(equityOrderContext)) : null;
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            }
        }).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean shouldRetryValidation) {
                Intrinsics.checkNotNullParameter(shouldRetryValidation, "shouldRetryValidation");
                return shouldRetryValidation.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onStart$lambda$5(this.f$0, (Boolean) obj);
            }
        });
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        UUID instrumentId = staticInputs.getInstrumentId();
        InstrumentAccountSwitcherStore.refresh$default(this.instrumentAccountSwitcherStore, instrumentId, null, false, 6, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentAccountSwitcherStore.getInstrumentAccountSwitcherQuery().asObservable(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onStart$lambda$6(this.f$0, (InstrumentAccountSwitcher) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAllSelfDirectedAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onStart$lambda$7(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(EquityShareOrderDuxo equityShareOrderDuxo, Boolean bool) {
        validateAndReviewOrder$default(equityShareOrderDuxo, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(EquityShareOrderDuxo equityShareOrderDuxo, InstrumentAccountSwitcher accountSwitcher) {
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onStart$4$1(accountSwitcher, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(EquityShareOrderDuxo equityShareOrderDuxo, List allAccounts) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onStart$5$1(allAccounts, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        Observable<Order> order;
        ScopedObservable scopedObservableBind$default;
        super.onResume();
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        final UUID instrumentId = staticInputs.getInstrumentId();
        Observable<String> observableFilterIsPresent = ObservablesKt.filterIsPresent(this.instrumentAccountSwitcherStore.streamActiveAccountNumber());
        this.accountProvider.refresh(false);
        final AccountProvider accountProvider = this.accountProvider;
        Observable<R> observableSwitchMap = observableFilterIsPresent.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final Observable<Account> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return accountProvider.streamAccount(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$8(this.f$0, (Account) obj);
            }
        });
        Observable<String> observableAutoConnect = observableFilterIsPresent.distinctUntilChanged().replay(1).autoConnect();
        Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "autoConnect(...)");
        Observable<Instrument> instrument = this.instrumentStore.getInstrument(instrumentId);
        this.instrumentStore.refresh(true, instrumentId);
        Observable<Instrument> observableDistinctUntilChanged = instrument.distinctUntilChanged();
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$9(this.f$0, (Instrument) obj);
            }
        });
        Observable observableStartWith = ObservablesKt.toOptionals(this.quoteStore.getStreamQuote().asObservable(instrumentId)).startWith((Observable) Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableStartWith, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$10(this.f$0, (Optional) obj);
            }
        });
        Observable<R> observableSwitchMap2 = observableAutoConnect.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Position> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                EquityShareOrderDuxo.this.positionStore.refreshAccount(accountNumber, false);
                return PositionStore.getPositionForAccount$default(EquityShareOrderDuxo.this.positionStore, instrumentId, accountNumber, false, 4, null).take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$11(this.f$0, (Position) obj);
            }
        });
        Observable<R> observableSwitchMap3 = observableAutoConnect.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InstrumentBuyingPower> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                UUID orderToReplaceId = ((EquityShareOrderFragment.Args) EquityShareOrderDuxo.INSTANCE.getArgs((HasSavedState) EquityShareOrderDuxo.this)).getOrderToReplaceId();
                if (orderToReplaceId == null) {
                    EquityShareOrderDuxo.this.instrumentBuyingPowerStore.refreshSelectedAccount(true, instrumentId, accountNumber);
                    return QueryKt.asObservable(EquityShareOrderDuxo.this.instrumentBuyingPowerStore.getStreamSelectedAccountBuyingPowerForInstrument(), instrumentId, accountNumber);
                }
                EquityShareOrderDuxo equityShareOrderDuxo = EquityShareOrderDuxo.this;
                return equityShareOrderDuxo.asObservable(equityShareOrderDuxo.instrumentBuyingPowerStore.streamSelectedAccountBuyingPowerForInstrumentReplace(instrumentId, accountNumber, orderToReplaceId));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$12(this.f$0, (InstrumentBuyingPower) obj);
            }
        });
        Observable<T> observableAsObservable = asObservable(getStateFlow());
        final C296309 c296309 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.9
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((EquityShareOrderViewState) obj).getReviewing());
            }
        };
        Observable observableSwitchMap4 = observableAsObservable.map(new Function(c296309) { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c296309, "function");
                this.function = c296309;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.10
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.11
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends NbboSummary> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Query<UUID, NbboSummary> streamCache = EquityShareOrderDuxo.this.nbboSummaryStore.getStreamCache();
                EquityOrderRequestInputs.StaticInputs staticInputs2 = EquityShareOrderDuxo.this.staticInputs;
                if (staticInputs2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
                    staticInputs2 = null;
                }
                return streamCache.asObservable(staticInputs2.getInstrumentId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$13(this.f$0, (NbboSummary) obj);
            }
        });
        Observable<R> observableSwitchMap5 = observableAutoConnect.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingStatus>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return EquityShareOrderDuxo.this.backupWithholdingStore.streamWithholdingStatus(accountNumber, instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap5, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$14(this.f$0, (Optional) obj);
            }
        });
        Observable map = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$backupWithholdingAmountObs$1

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            public final Optional<BigDecimal> apply(EquityShareOrderViewState state) {
                BigDecimal decimalValue;
                Intrinsics.checkNotNullParameter(state, "state");
                Optional.Companion companion = Optional.INSTANCE;
                EquityOrderContext equityOrderContext = state.getEquityOrderContext();
                BigDecimal bigDecimalMultiply = null;
                if ((equityOrderContext != null ? equityOrderContext.getSide() : null) == EquityOrderSide.SELL) {
                    switch (WhenMappings.$EnumSwitchMapping$0[state.getEquityOrderContext().getConfiguration().ordinal()]) {
                        case 1:
                        case 2:
                            Money lastTradePrice = state.getLastTradePrice();
                            if (lastTradePrice == null) {
                                decimalValue = null;
                                break;
                            } else {
                                decimalValue = lastTradePrice.getDecimalValue();
                                break;
                            }
                        case 3:
                            decimalValue = state.getEquityOrderContext().getPrice();
                            break;
                        case 4:
                        case 5:
                        case 6:
                            decimalValue = state.getEquityOrderContext().getStopPrice();
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (decimalValue != null) {
                        BigDecimal quantity = state.getEquityOrderContext().getQuantity();
                        if (quantity == null) {
                            quantity = BigDecimal.ZERO;
                        }
                        bigDecimalMultiply = decimalValue.multiply(quantity);
                    }
                }
                return companion.m2972of(bigDecimalMultiply);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map).filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$backupWithholdingAmountObs$2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(BigDecimal amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                return !BigDecimals7.isZero(amount);
            }
        }).distinctUntilChanged();
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableDistinctUntilChanged2);
        Observable observableDistinctUntilChanged3 = observables.combineLatest(observableAutoConnect, observableDistinctUntilChanged2).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.15
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingEstimatedAmount>> apply(Tuples2<String, ? extends BigDecimal> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                String strComponent1 = tuples2.component1();
                BigDecimal bigDecimalComponent2 = tuples2.component2();
                BackupWithholdingStore backupWithholdingStore = EquityShareOrderDuxo.this.backupWithholdingStore;
                Intrinsics.checkNotNull(bigDecimalComponent2);
                Intrinsics.checkNotNull(strComponent1);
                return backupWithholdingStore.streamTaxWithholdingEstimatedAmount(bigDecimalComponent2, strComponent1, instrumentId);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$15(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursManager.getCurrentMarketHoursObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$16(this.f$0, (MarketHours) obj);
            }
        });
        Observable<Boolean> observableMarketChangesObservable = this.marketHoursManager.marketChangesObservable();
        MarketHours currentMarketHours = this.marketHoursManager.getCurrentMarketHours();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        Observable<Boolean> observableStartWith2 = observableMarketChangesObservable.startWith((Observable<Boolean>) Boolean.valueOf(currentMarketHours.isOpenExtended(instantNow)));
        Intrinsics.checkNotNullExpressionValue(observableStartWith2, "startWith(...)");
        Observable observableDistinctUntilChanged4 = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.18
            @Override // io.reactivex.functions.Function
            public final Boolean apply(EquityShareOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                EquityOrderContext equityOrderContext = state.getEquityOrderContext();
                return Boolean.valueOf(equityOrderContext != null ? Intrinsics.areEqual(equityOrderContext.isExtendedHours(), Boolean.TRUE) : false);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        Observable observableDistinctUntilChanged5 = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.19
            @Override // io.reactivex.functions.Function
            public final Boolean apply(EquityShareOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(EquityOrderConfiguration3.getOverrideMarketHours(state.getConfiguration()) == OrderMarketHours.ALL_DAY_HOURS);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        Observable observableSwitchMap6 = observables.combineLatest(observableStartWith2, observableDistinctUntilChanged4, observableDistinctUntilChanged5).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.onResume.20
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(Tuples3<Boolean, Boolean, Boolean> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                Boolean boolComponent2 = tuples3.component2();
                Boolean boolComponent3 = tuples3.component3();
                TraderMarketHoursManager traderMarketHoursManager = EquityShareOrderDuxo.this.marketHoursManager;
                Intrinsics.checkNotNull(boolComponent3);
                boolean zBooleanValue = boolComponent3.booleanValue();
                Intrinsics.checkNotNull(boolComponent2);
                return traderMarketHoursManager.effectiveMarketHoursObservable(zBooleanValue, boolComponent2.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap6, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap6, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$17(this.f$0, (MarketHours) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursManager.streamIsAdtHours(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.onResume$lambda$18(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2962523(null), 3, null);
        UUID orderToReplaceId = ((EquityShareOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOrderToReplaceId();
        if (orderToReplaceId != null) {
            this.orderStore.refresh(true, orderToReplaceId);
            order = this.orderStore.getOrder(orderToReplaceId);
        } else {
            order = null;
        }
        if (order != null && (scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(this, order, (LifecycleEvent) null, 1, (Object) null)) != null) {
            scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityShareOrderDuxo.onResume$lambda$20(this.f$0, (Order) obj);
                }
            });
        }
        maybeShowNotEnoughSharesDialog(observableFilterIsPresent, observableDistinctUntilChanged, order);
        streamSelectedTaxLots$feature_trade_equity_externalDebug();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2962625(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2962726(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(EquityShareOrderDuxo equityShareOrderDuxo, Account account) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$2$1(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(EquityShareOrderDuxo equityShareOrderDuxo, Instrument instrument) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$3$1(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(EquityShareOrderDuxo equityShareOrderDuxo, Optional optional) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$4$1((Quote) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(EquityShareOrderDuxo equityShareOrderDuxo, Position position) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$6$1(position, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(EquityShareOrderDuxo equityShareOrderDuxo, InstrumentBuyingPower instrumentBuyingPower) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$8$1(instrumentBuyingPower, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(EquityShareOrderDuxo equityShareOrderDuxo, NbboSummary nbboSummary) {
        NbboAnalytics.INSTANCE.logNbboAppear(equityShareOrderDuxo.eventLogger, nbboSummary);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(EquityShareOrderDuxo equityShareOrderDuxo, Optional optional) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$14$1((WithholdingStatus) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(EquityShareOrderDuxo equityShareOrderDuxo, Optional optional) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$16$1((WithholdingEstimatedAmount) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(EquityShareOrderDuxo equityShareOrderDuxo, MarketHours currentMarketHours) {
        Intrinsics.checkNotNullParameter(currentMarketHours, "currentMarketHours");
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$17$1(currentMarketHours, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(EquityShareOrderDuxo equityShareOrderDuxo, MarketHours marketHours) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$21$1(marketHours, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(EquityShareOrderDuxo equityShareOrderDuxo, boolean z) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$22$1(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$23", m3645f = "EquityShareOrderDuxo.kt", m3646l = {582}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$23 */
    static final class C2962523 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2962523(Continuation<? super C2962523> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C2962523(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2962523) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$23$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$23$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
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

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$23$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$23$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505821 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
                final /* synthetic */ Monitoring $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505821(Monitoring monitoring, Continuation<? super C505821> continuation) {
                    super(2, continuation);
                    this.$state = monitoring;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505821 c505821 = new C505821(this.$state, continuation);
                    c505821.L$0 = obj;
                    return c505821;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((C505821) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : this.$state, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505821((Monitoring) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Monitoring> state = EquityShareOrderDuxo.this.summaryComponent.getMicrogramMonitor().getState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityShareOrderDuxo.this, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$20(EquityShareOrderDuxo equityShareOrderDuxo, Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$onResume$24$1(order, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$25", m3645f = "EquityShareOrderDuxo.kt", m3646l = {607}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$25 */
    static final class C2962625 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2962625(Continuation<? super C2962625> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C2962625(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2962625) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", KaizenExperiment.VARIATION_MEMBER, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$25$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$25$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
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

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$25$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$25$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505831 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
                final /* synthetic */ boolean $member;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505831(boolean z, Continuation<? super C505831> continuation) {
                    super(2, continuation);
                    this.$member = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505831 c505831 = new C505831(this.$member, continuation);
                    c505831.L$0 = obj;
                    return c505831;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((C505831) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : this.$member, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505831(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(EquityShareOrderDuxo.this.experimentsStore, new Experiment[]{TaxLotsM1Experiment.INSTANCE}, false, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityShareOrderDuxo.this, null);
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
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$26", m3645f = "EquityShareOrderDuxo.kt", m3646l = {616}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$26 */
    static final class C2962726 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2962726(Continuation<? super C2962726> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C2962726(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2962726) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(EquityShareOrderDuxo.this.accountProvider.streamAllSelfDirectedAccounts()), Integer.MAX_VALUE, null, 2, null), new C29596xf33a13aa(null, EquityShareOrderDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityShareOrderDuxo.this, null);
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginAccounts", "", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$26$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$26$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends Account>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityShareOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityShareOrderDuxo equityShareOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityShareOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, Continuation<? super Unit> continuation) {
                return invoke2((List<Account>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<Account> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$26$2$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onResume$26$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
                final /* synthetic */ List<Account> $marginAccounts;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<Account> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$marginAccounts = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$marginAccounts, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : this.$marginAccounts, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void streamSelectedTaxLots$feature_trade_equity_externalDebug() {
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        if (staticInputs.getSide() != EquityOrderSide.SELL) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new EquityShareOrderDuxo$streamSelectedTaxLots$1(this, null), 3, null);
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setStaticInputs$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setStaticInputs$1 */
    static final class C296421 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
        final /* synthetic */ EquityOrderRequestInputs.StaticInputs $staticInputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296421(EquityOrderRequestInputs.StaticInputs staticInputs, Continuation<? super C296421> continuation) {
            super(2, continuation);
            this.$staticInputs = staticInputs;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C296421 c296421 = new C296421(this.$staticInputs, continuation);
            c296421.L$0 = obj;
            return c296421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
            return ((C296421) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
            return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : this.$staticInputs, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
        }
    }

    public final void setStaticInputs(EquityOrderRequestInputs.StaticInputs staticInputs) {
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        this.staticInputs = staticInputs;
        applyMutation(new C296421(staticInputs, null));
    }

    public final void submit(EquityOrderContext equityOrderContext) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "equityOrderContext");
        logSubmitEvent(equityOrderContext);
        OrderSubmissionManager.submit$default(this.orderManager, equityOrderContext.getOrderRequestDraft(), null, false, 6, null);
    }

    private final void setRetryWhen(Validator.Action.RetryWhen<? super EquityOrderContext> retryWhen) {
        this.retryWhenRelay.accept(Optional3.asOptional(retryWhen));
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {680}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1 */
    static final class C296441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $awaitContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296441(boolean z, Continuation<? super C296441> continuation) {
            super(2, continuation);
            this.$awaitContext = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296441(this.$awaitContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
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
            public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : equityShareOrderDataState.getResetTooltipKey() + 1, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            EquityOrderRequestInputs.StaticInputs staticInputs = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityShareOrderDuxo.this.applyMutation(new AnonymousClass1(null));
                EquityShareOrderDuxo.this.generateSummary();
                final StateFlow<EquityShareOrderViewState> stateFlow = EquityShareOrderDuxo.this.getStateFlow();
                final Flow<EquityOrderContext> flow = new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$map$1$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                EquityOrderContext equityOrderContext = ((EquityShareOrderViewState) obj).getEquityOrderContext();
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
                };
                final boolean z = this.$awaitContext;
                Flow<EquityOrderContext> flow2 = new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, z), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ boolean $awaitContext$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$filter$1$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, boolean z) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$awaitContext$inlined = z;
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
                                if (((EquityOrderContext) obj) != null || !this.$awaitContext$inlined) {
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
                };
                this.label = 1;
                obj = FlowKt.first(flow2, this);
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
            if (equityOrderContext == null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("EquityOrderContext null at validation"), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
            } else {
                EquityShareOrderDuxo equityShareOrderDuxo = EquityShareOrderDuxo.this;
                BehaviorRelay behaviorRelay = equityShareOrderDuxo.retryWhenRelay;
                EquityOrderRequestInputs.StaticInputs staticInputs2 = EquityShareOrderDuxo.this.staticInputs;
                if (staticInputs2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
                } else {
                    staticInputs = staticInputs2;
                }
                EquityOrderFlowSource flowSource = staticInputs.getFlowSource();
                EquityOrderCheckValidator equityOrderCheckValidator = EquityShareOrderDuxo.this.equityOrderCheckValidator;
                final EquityShareOrderDuxo equityShareOrderDuxo2 = EquityShareOrderDuxo.this;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityShareOrderDuxo.C296441.invokeSuspend$lambda$2(equityShareOrderDuxo2, (ValidationState) obj2);
                    }
                };
                final EquityShareOrderDuxo equityShareOrderDuxo3 = EquityShareOrderDuxo.this;
                ValidateAndReviewEquityOrder.validateAndReviewEquityOrder(equityShareOrderDuxo, behaviorRelay, equityOrderContext, flowSource, equityOrderCheckValidator, function1, new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$validateAndReviewOrder$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityShareOrderDuxo.C296441.invokeSuspend$lambda$3(equityShareOrderDuxo3, (EquityOrderEvent.OrderCheckEvent) obj2);
                    }
                }, (64 & 64) != 0 ? equityShareOrderDuxo.getLifecycleScope() : null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(EquityShareOrderDuxo equityShareOrderDuxo, ValidationState validationState) {
            equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$validateAndReviewOrder$1$2$1(validationState, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(EquityShareOrderDuxo equityShareOrderDuxo, EquityOrderEvent.OrderCheckEvent orderCheckEvent) {
            equityShareOrderDuxo.submit((EquityShareOrderDuxo) orderCheckEvent);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Job validateAndReviewOrder$default(EquityShareOrderDuxo equityShareOrderDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return equityShareOrderDuxo.validateAndReviewOrder(z);
    }

    public final Job validateAndReviewOrder(boolean awaitContext) {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296441(awaitContext, null), 3, null);
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$generateSummary$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {706, 707, 708}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$generateSummary$1 */
    static final class C296041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C296041(Continuation<? super C296041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        
            if (r14 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EquityShareOrderViewState equityShareOrderViewState;
            EquityOrderContext equityOrderContext;
            C296041 c296041;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityShareOrderViewState> stateFlow = EquityShareOrderDuxo.this.getStateFlow();
                EquityShareOrderDuxo$generateSummary$1$readyState$1 equityShareOrderDuxo$generateSummary$1$readyState$1 = new EquityShareOrderDuxo$generateSummary$1$readyState$1(null);
                this.label = 1;
                obj = FlowKt.first(stateFlow, equityShareOrderDuxo$generateSummary$1$readyState$1, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c296041 = this;
                    EquityShareOrderDuxo.this.applyMutation(new AnonymousClass2((String) obj, null));
                    return Unit.INSTANCE;
                }
                equityShareOrderViewState = (EquityShareOrderViewState) this.L$0;
                ResultKt.throwOnFailure(obj);
                EquityOrderSummaryService idlOrderSummaryService = EquityShareOrderDuxo.this.getIdlOrderSummaryService();
                equityOrderContext = equityShareOrderViewState.getEquityOrderContext();
                if (equityOrderContext != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                DirectOrderRequestDraft orderRequestDraft = equityOrderContext.getOrderRequestDraft();
                MarketHours marketHours = equityShareOrderViewState.getMarketHours();
                if (marketHours != null) {
                    this.L$0 = null;
                    this.label = 3;
                    c296041 = this;
                    obj = EquityOrderSummaryService2.getOrderSummary$default(idlOrderSummaryService, orderRequestDraft, marketHours, false, c296041, 4, null);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            equityShareOrderViewState = (EquityShareOrderViewState) obj;
            StateFlow<Monitoring> state = EquityShareOrderDuxo.this.summaryComponent.getMicrogramMonitor().getState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.L$0 = equityShareOrderViewState;
            this.label = 2;
            if (FlowKt.first(state, anonymousClass1, this) != coroutine_suspended) {
                EquityOrderSummaryService idlOrderSummaryService2 = EquityShareOrderDuxo.this.getIdlOrderSummaryService();
                equityOrderContext = equityShareOrderViewState.getEquityOrderContext();
                if (equityOrderContext != null) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$generateSummary$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$generateSummary$1$1, reason: invalid class name */
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

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$generateSummary$1$2", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$generateSummary$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
            final /* synthetic */ String $summary;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$summary = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$summary, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                return ((AnonymousClass2) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : this.$summary, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void generateSummary() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296041(null), 3, null);
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$recordSilentAlert$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$recordSilentAlert$1 */
    static final class C296351 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
        final /* synthetic */ GenericOrderCheckAction $action;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296351(GenericOrderCheckAction genericOrderCheckAction, Continuation<? super C296351> continuation) {
            super(2, continuation);
            this.$action = genericOrderCheckAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C296351 c296351 = new C296351(this.$action, continuation);
            c296351.L$0 = obj;
            return c296351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
            return ((C296351) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
            return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : CollectionsKt.plus((Collection<? extends GenericOrderCheckAction>) equityShareOrderDataState.getSilentActionsTaken(), this.$action), (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
        }
    }

    public final void recordSilentAlert(GenericOrderCheckAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        applyMutation(new C296351(action, null));
    }

    public final void sellAll(final boolean shouldValidate) {
        Observable observableTake = asObservable(getStateFlow()).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable map = observableTake.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$sellAll$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EquityShareOrderViewState) it).getAccountNumber());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EquityShareOrderDuxo$sellAll$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.sellAll.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Position> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                EquityShareOrderDuxo.this.positionStore.refreshAccount(accountNumber, false);
                PositionStore positionStore = EquityShareOrderDuxo.this.positionStore;
                EquityOrderRequestInputs.StaticInputs staticInputs = EquityShareOrderDuxo.this.staticInputs;
                if (staticInputs == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
                    staticInputs = null;
                }
                return PositionStore.getPositionForAccount$default(positionStore, staticInputs.getInstrumentId(), accountNumber, false, 4, null).take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.sellAll$lambda$23(this.f$0, shouldValidate, (Position) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sellAll$lambda$23(EquityShareOrderDuxo equityShareOrderDuxo, boolean z, final Position position) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$sellAll$3$1(equityShareOrderDuxo, position, null));
        if (z) {
            equityShareOrderDuxo.setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(EquityShareOrderDuxo.sellAll$lambda$23$lambda$22(position, (EquityOrderContext) obj));
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sellAll$lambda$23$lambda$22(Position position, EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getQuantity(), position.getClosableQuantity());
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setConfiguration$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setConfiguration$1 */
    static final class C296391 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
        final /* synthetic */ ShareBasedOrderConfiguration $configuration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296391(ShareBasedOrderConfiguration shareBasedOrderConfiguration, Continuation<? super C296391> continuation) {
            super(2, continuation);
            this.$configuration = shareBasedOrderConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C296391 c296391 = new C296391(this.$configuration, continuation);
            c296391.L$0 = obj;
            return c296391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
            return ((C296391) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<String> listEmptyList;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
            ShareBasedOrderConfiguration shareBasedOrderConfiguration = this.$configuration;
            DirectOrder.Validated validated = shareBasedOrderConfiguration instanceof DirectOrder.Validated ? (DirectOrder.Validated) shareBasedOrderConfiguration : null;
            if (validated == null || (listEmptyList = validated.getCheckOverrides()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List<String> list = listEmptyList;
            ShareBasedOrderConfiguration shareBasedOrderConfiguration2 = this.$configuration;
            DirectOrder.Validated validated2 = shareBasedOrderConfiguration2 instanceof DirectOrder.Validated ? (DirectOrder.Validated) shareBasedOrderConfiguration2 : null;
            return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : this.$configuration, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : ValidationState.Initial.INSTANCE, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : list, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : validated2 != null ? validated2.getOrderSummary() : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
        }
    }

    public final void setConfiguration(ShareBasedOrderConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        applyMutation(new C296391(configuration, null));
        if ((configuration instanceof DirectOrder.Validated) && ((DirectOrder.Validated) configuration).getOrderSummary() == null) {
            generateSummary();
        }
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setShareQuantity$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setShareQuantity$1 */
    static final class C296411 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
        final /* synthetic */ BigDecimal $shareQuantity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296411(BigDecimal bigDecimal, Continuation<? super C296411> continuation) {
            super(2, continuation);
            this.$shareQuantity = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C296411 c296411 = new C296411(this.$shareQuantity, continuation);
            c296411.L$0 = obj;
            return c296411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
            return ((C296411) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
            return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : equityShareOrderDataState.getConfiguration().mutateShareQuantity(this.$shareQuantity), ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
        }
    }

    public final void setShareQuantity(BigDecimal shareQuantity) {
        Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
        applyMutation(new C296411(shareQuantity, null));
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setReviewingState$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setReviewingState$1 */
    static final class C296401 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
        final /* synthetic */ boolean $reviewing;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296401(boolean z, Continuation<? super C296401> continuation) {
            super(2, continuation);
            this.$reviewing = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C296401 c296401 = new C296401(this.$reviewing, continuation);
            c296401.L$0 = obj;
            return c296401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
            return ((C296401) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ValidationState validationState;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
            if (this.$reviewing) {
                validationState = ValidationState.Validated.INSTANCE;
            } else {
                validationState = ValidationState.Initial.INSTANCE;
            }
            return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : validationState, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
        }
    }

    public final void setReviewingState(boolean reviewing) {
        applyMutation(new C296401(reviewing, null));
    }

    public final void overrideToExecuteInMarketHoursOnlyAndValidate() {
        withDataState(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.overrideToExecuteInMarketHoursOnlyAndValidate$lambda$24(this.f$0, (EquityShareOrderDataState) obj);
            }
        });
        setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityShareOrderDuxo.overrideToExecuteInMarketHoursOnlyAndValidate$lambda$25((EquityOrderContext) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit overrideToExecuteInMarketHoursOnlyAndValidate$lambda$24(EquityShareOrderDuxo equityShareOrderDuxo, EquityShareOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ShareBasedOrderConfiguration configuration = it.getConfiguration();
        if (configuration instanceof ShareSimpleLimit) {
            if (!Intrinsics.areEqual(it.isMarketBuysEnabled(), Boolean.TRUE)) {
                EquityOrderRequestInputs.StaticInputs staticInputs = equityShareOrderDuxo.staticInputs;
                if (staticInputs == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
                    staticInputs = null;
                }
                if (staticInputs.getSide() != EquityOrderSide.BUY) {
                }
            }
            equityShareOrderDuxo.setConfiguration(new ShareMarket.New(configuration.getAccountNumber(), configuration.getShareQuantity()));
        } else {
            equityShareOrderDuxo.applyMutation(new C29634x92bb15d3(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overrideToExecuteInMarketHoursOnlyAndValidate$lambda$25(EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOnlyRegularHours();
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$overrideFlipIpoAccessSharesAndValidate$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$overrideFlipIpoAccessSharesAndValidate$1 */
    static final class C296331 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C296331(Continuation<? super C296331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C296331 c296331 = new C296331(continuation);
            c296331.L$0 = obj;
            return c296331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
            return ((C296331) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
            return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : true, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
        }
    }

    public final void overrideFlipIpoAccessSharesAndValidate() {
        applyMutation(new C296331(null));
        setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityShareOrderDuxo.overrideFlipIpoAccessSharesAndValidate$lambda$26((EquityOrderContext) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overrideFlipIpoAccessSharesAndValidate$lambda$26(EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRequestContext().getOverrideFlipIpoAccessShares();
    }

    public final void appendOverridesAndValidate(final List<String> overridesToAppend) {
        Intrinsics.checkNotNullParameter(overridesToAppend, "overridesToAppend");
        Single singleFirstOrError = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.appendOverridesAndValidate.1
            @Override // io.reactivex.functions.Function
            public final List<String> apply(EquityShareOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCheckOverrides();
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.appendOverridesAndValidate$lambda$28(overridesToAppend, this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendOverridesAndValidate$lambda$28(List list, EquityShareOrderDuxo equityShareOrderDuxo, List list2) {
        Intrinsics.checkNotNull(list2);
        final List listPlus = CollectionsKt.plus((Collection) list2, (Iterable) list);
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$appendOverridesAndValidate$2$1(listPlus, null));
        equityShareOrderDuxo.setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityShareOrderDuxo.appendOverridesAndValidate$lambda$28$lambda$27(listPlus, (EquityOrderContext) obj));
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean appendOverridesAndValidate$lambda$28$lambda$27(List list, EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getCheckOverrides(), list);
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$cancelPendingCryptoOrders$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {833}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$cancelPendingCryptoOrders$1 */
    static final class C296021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $minTimeInFlight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296021(long j, Continuation<? super C296021> continuation) {
            super(2, continuation);
            this.$minTimeInFlight = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296021(this.$minTimeInFlight, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityOrderCheckValidator equityOrderCheckValidator = EquityShareOrderDuxo.this.equityOrderCheckValidator;
                long j = this.$minTimeInFlight;
                final EquityShareOrderDuxo equityShareOrderDuxo = EquityShareOrderDuxo.this;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$cancelPendingCryptoOrders$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityShareOrderDuxo.C296021.invokeSuspend$lambda$0(equityShareOrderDuxo, ((Boolean) obj2).booleanValue());
                    }
                };
                final EquityShareOrderDuxo equityShareOrderDuxo2 = EquityShareOrderDuxo.this;
                Function1 function12 = new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$cancelPendingCryptoOrders$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityShareOrderDuxo.C296021.invokeSuspend$lambda$1(equityShareOrderDuxo2, (EquityOrderEvent) obj2);
                    }
                };
                this.label = 1;
                if (CryptoPendingAndCancelExtension.cancelPendingCryptoOrders(equityOrderCheckValidator, j, function1, function12, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(EquityShareOrderDuxo equityShareOrderDuxo, boolean z) {
            equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$cancelPendingCryptoOrders$1$1$1(z, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(EquityShareOrderDuxo equityShareOrderDuxo, EquityOrderEvent equityOrderEvent) {
            Intrinsics.checkNotNull(equityOrderEvent, "null cannot be cast to non-null type com.robinhood.android.equity.validation.event.EquityOrderEvent.Share");
            equityShareOrderDuxo.submit((EquityShareOrderDuxo) equityOrderEvent);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Job cancelPendingCryptoOrders$default(EquityShareOrderDuxo equityShareOrderDuxo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return equityShareOrderDuxo.cancelPendingCryptoOrders(j);
    }

    public final Job cancelPendingCryptoOrders(long minTimeInFlight) {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296021(minTimeInFlight, null), 3, null);
    }

    public final void refreshNbbo() {
        NbboSummaryStore nbboSummaryStore = this.nbboSummaryStore;
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        Single<Response<ApiNbboSummary>> singleDoOnSubscribe = nbboSummaryStore.refresh(staticInputs.getInstrumentId()).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo.refreshNbbo.1

            /* compiled from: EquityShareOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$refreshNbbo$1$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$refreshNbbo$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
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
                public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                    return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : true, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                EquityShareOrderDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.refreshNbbo$lambda$29(this.f$0, (Response) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNbbo$lambda$29(EquityShareOrderDuxo equityShareOrderDuxo, Response response) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$refreshNbbo$2$1(null));
        return Unit.INSTANCE;
    }

    public final void setAccountNumber(String accountNumber, boolean checkForceSuitability, EquityOrderSide side) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(side, "side");
        if (checkForceSuitability) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C296381(accountNumber, null), 3, null);
        } else {
            this.instrumentAccountSwitcherStore.setActiveAccountNumber(accountNumber);
        }
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setAccountNumber$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {863, 861, 864}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$setAccountNumber$1 */
    static final class C296381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296381(String str, Continuation<? super C296381> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296381(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        
            if (r8 != r0) goto L22;
         */
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
                SuitabilityStore suitabilityStore2 = EquityShareOrderDuxo.this.suitabilityStore;
                str = this.$accountNumber;
                StateFlow<EquityShareOrderViewState> stateFlow = EquityShareOrderDuxo.this.getStateFlow();
                this.L$0 = suitabilityStore2;
                this.L$1 = str;
                this.label = 1;
                Object objFirst = FlowKt.first(stateFlow, this);
                if (objFirst != coroutine_suspended) {
                    suitabilityStore = suitabilityStore2;
                    obj = objFirst;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                str = (String) this.L$1;
                suitabilityStore = (SuitabilityStore) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) ((Tuples2) obj).getFirst()).booleanValue()) {
                        EquityShareOrderDuxo.this.instrumentAccountSwitcherStore.setActiveAccountNumber(this.$accountNumber);
                    } else {
                        EquityShareOrderDuxo.this.submit((EquityShareOrderDuxo) new EquityOrderEvent.CheckForceSuitabilityOnAccountSwitchedEvent(this.$accountNumber));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.label = 3;
                obj = FlowKt.first((Flow) obj, this);
            }
            OrderPositionEffect positionEffect = ((EquityShareOrderViewState) obj).getPositionEffect();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = suitabilityStore.shouldForceSuitability(str, positionEffect, this);
            if (obj != coroutine_suspended) {
                this.label = 3;
                obj = FlowKt.first((Flow) obj, this);
            }
            return coroutine_suspended;
        }
    }

    public final void refreshAccountSwitcher() {
        Observable observableJust = Observable.just(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        AccountSwitcherRefreshEvent.refreshAccountSwitcherExtension(this, observableJust, staticInputs.getInstrumentId(), this.instrumentAccountSwitcherStore, new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.refreshAccountSwitcher$lambda$30(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.refreshAccountSwitcher$lambda$32(this.f$0, (InstrumentAccountSwitcher) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.refreshAccountSwitcher$lambda$33(this.f$0, (EquityOrderEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAccountSwitcher$lambda$30(EquityShareOrderDuxo equityShareOrderDuxo, boolean z) {
        equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$refreshAccountSwitcher$1$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAccountSwitcher$lambda$32(EquityShareOrderDuxo equityShareOrderDuxo, InstrumentAccountSwitcher switcher) {
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        Account account = equityShareOrderDuxo.getStateFlow().getValue().getAccount();
        if (account != null) {
            equityShareOrderDuxo.submit((EquityShareOrderDuxo) new EquityOrderEvent.AccountSwitcherRefreshedEvent(AccountSwitcherExtensions.toAccountSwitcherData(switcher.getTradeBar(), account.getAccountNumber(), new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null)), null));
            equityShareOrderDuxo.applyMutation(new EquityShareOrderDuxo$refreshAccountSwitcher$2$1$1(switcher, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAccountSwitcher$lambda$33(EquityShareOrderDuxo equityShareOrderDuxo, EquityOrderEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityShareOrderDuxo.submit((EquityShareOrderDuxo) it);
        return Unit.INSTANCE;
    }

    private final void logSubmitEvent(EquityOrderContext equityOrderContext) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[equityOrderContext.getConfiguration().ordinal()];
        if (i == 1) {
            str = AnalyticsStrings.BUTTON_TRADED_EQUITY_SHARE_MARKET_ORDER;
        } else if (i == 2) {
            str = AnalyticsStrings.BUTTON_TRADED_EQUITY_SHARE_LIMIT_ORDER;
        } else if (i == 3) {
            str = AnalyticsStrings.BUTTON_TRADED_EQUITY_SHARE_STOP_LIMIT_ORDER;
        } else if (i == 4) {
            str = AnalyticsStrings.BUTTON_TRADED_EQUITY_SHARE_STOP_ORDER;
        } else if (i == 5) {
            str = AnalyticsStrings.BUTTON_TRADED_EQUITY_SHARE_TRAILING_STOP_ORDER;
        } else {
            str = "unknown";
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_TRADED_EQUITY, str, null, null, null, null, equityOrderContext.getRefId().toString(), null, 188, null);
        TraderEventLogger traderEventLogger = this.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.SUBMIT;
        EquityOrderPayload orderPayload = equityOrderContext.toOrderPayload();
        BrokerageAccountType brokerageAccountType = equityOrderContext.getBrokerageAccountType();
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        EquityOrderMeta.Source metaSource = EquityOrderSourceLogging.toMetaSource(staticInputs.getFlowSource());
        Order orderToReplace = equityOrderContext.getOrderRequestDraft().getOrderToReplace();
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(traderEventLogger, orderFormStep, orderPayload, brokerageAccountType, metaSource, null, null, orderToReplace != null ? orderToReplace.getId() : null, 48, null);
    }

    public final void logSwipeToSubmit() {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.SWIPE, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), null, UserInteractionEventData.Action.SUBMIT_ORDER, null, null, null, 116, null), true, false, 4, null);
    }

    public final void logOrderCheckAction(final String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Observable map = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$logOrderCheckAction$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EquityShareOrderViewState) it).getEquityOrderContext());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EquityShareOrderDuxo$logOrderCheckAction$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.logOrderCheckAction$lambda$35(this.f$0, loggingIdentifier, (EquityOrderContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOrderCheckAction$lambda$35(EquityShareOrderDuxo equityShareOrderDuxo, String str, EquityOrderContext equityOrderContext) {
        TraderEventLogger traderEventLogger = equityShareOrderDuxo.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.ORDER_CHECK_ACTION;
        EquityOrderPayload orderPayload = equityOrderContext.toOrderPayload();
        BrokerageAccountType brokerageAccountType = equityOrderContext.getBrokerageAccountType();
        EquityOrderRequestInputs.StaticInputs staticInputs = equityShareOrderDuxo.staticInputs;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(traderEventLogger, orderFormStep, orderPayload, brokerageAccountType, EquityOrderSourceLogging.toMetaSource(staticInputs.getFlowSource()), null, str, null, 80, null);
        return Unit.INSTANCE;
    }

    private final void maybeShowNotEnoughSharesDialog(Observable<String> accountNumberStream, Observable<Instrument> instrumentStream, Observable<Order> oldOrderStream) {
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        EquityOrderRequestInputs.StaticInputs staticInputs2 = null;
        if (staticInputs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
            staticInputs = null;
        }
        UUID instrumentId = staticInputs.getInstrumentId();
        EquityOrderRequestInputs.StaticInputs staticInputs3 = this.staticInputs;
        if (staticInputs3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticInputs");
        } else {
            staticInputs2 = staticInputs3;
        }
        if (staticInputs2.getSide() != EquityOrderSide.SELL) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296061(accountNumberStream, this, instrumentId, oldOrderStream, instrumentStream, null), 3, null);
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$maybeShowNotEnoughSharesDialog$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {1159, 1160, 1161, 972, 1162}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$maybeShowNotEnoughSharesDialog$1 */
    static final class C296061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<String> $accountNumberStream;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ Observable<Instrument> $instrumentStream;
        final /* synthetic */ Observable<Order> $oldOrderStream;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ EquityShareOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296061(Observable<String> observable, EquityShareOrderDuxo equityShareOrderDuxo, UUID uuid, Observable<Order> observable2, Observable<Instrument> observable3, Continuation<? super C296061> continuation) {
            super(2, continuation);
            this.$accountNumberStream = observable;
            this.this$0 = equityShareOrderDuxo;
            this.$instrumentId = uuid;
            this.$oldOrderStream = observable2;
            this.$instrumentStream = observable3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C296061(this.$accountNumberStream, this.this$0, this.$instrumentId, this.$oldOrderStream, this.$instrumentStream, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        
            if (r15 == r0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Position position;
            Observable<Order> observable;
            BigDecimal bigDecimalAdd;
            Quote quote;
            Quote quote2;
            Position position2;
            EquityShareOrderDuxo equityShareOrderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<String> observable2 = this.$accountNumberStream;
                this.label = 1;
                obj = RxAwait3.awaitFirst(observable2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue(obj, "awaitFirst(...)");
                    position = (Position) obj;
                    observable = this.$oldOrderStream;
                    if (observable != null) {
                        this.L$0 = position;
                        this.label = 3;
                        obj = RxAwait3.awaitFirstOrNull(observable, this);
                    }
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    bigDecimalAdd = position.getClosableQuantity().add(ZERO);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    if (!BigDecimals7.isPositive(bigDecimalAdd)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    position = (Position) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Order order = (Order) obj;
                    if (order == null || (ZERO = order.getQuantity()) == null) {
                        BigDecimal ZERO2 = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                    }
                    bigDecimalAdd = position.getClosableQuantity().add(ZERO2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                    if (!BigDecimals7.isPositive(bigDecimalAdd)) {
                        Flow<Quote> flowStreamQuote = this.this$0.quoteStore.streamQuote(this.$instrumentId);
                        this.L$0 = position;
                        this.label = 4;
                        obj = FlowKt.first(flowStreamQuote, this);
                        if (obj != coroutine_suspended) {
                            quote = (Quote) obj;
                            if (quote != null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    position2 = (Position) this.L$2;
                    equityShareOrderDuxo = (EquityShareOrderDuxo) this.L$1;
                    quote2 = (Quote) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue(obj, "awaitFirst(...)");
                    equityShareOrderDuxo.submit((EquityShareOrderDuxo) new EquityOrderEvent.Share.NotEnoughSharesEvent(position2, (Instrument) obj, quote2));
                    return Unit.INSTANCE;
                }
                position = (Position) this.L$0;
                ResultKt.throwOnFailure(obj);
                quote = (Quote) obj;
                if (quote != null) {
                    return Unit.INSTANCE;
                }
                EquityShareOrderDuxo equityShareOrderDuxo2 = this.this$0;
                Observable<Instrument> observable3 = this.$instrumentStream;
                this.L$0 = quote;
                this.L$1 = equityShareOrderDuxo2;
                this.L$2 = position;
                this.label = 5;
                Object objAwaitFirst = RxAwait3.awaitFirst(observable3, this);
                if (objAwaitFirst != coroutine_suspended) {
                    quote2 = quote;
                    obj = objAwaitFirst;
                    position2 = position;
                    equityShareOrderDuxo = equityShareOrderDuxo2;
                    Intrinsics.checkNotNullExpressionValue(obj, "awaitFirst(...)");
                    equityShareOrderDuxo.submit((EquityShareOrderDuxo) new EquityOrderEvent.Share.NotEnoughSharesEvent(position2, (Instrument) obj, quote2));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            Intrinsics.checkNotNullExpressionValue(obj, "awaitFirst(...)");
            String str = (String) obj;
            this.this$0.positionStore.refreshAccount(str, false);
            Observable positionForAccount$default = PositionStore.getPositionForAccount$default(this.this$0.positionStore, this.$instrumentId, str, false, 4, null);
            this.label = 2;
            obj = RxAwait3.awaitFirst(positionForAccount$default, this);
            if (obj != coroutine_suspended) {
                Intrinsics.checkNotNullExpressionValue(obj, "awaitFirst(...)");
                position = (Position) obj;
                observable = this.$oldOrderStream;
                if (observable != null) {
                }
                BigDecimal ZERO22 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO22, "ZERO");
                bigDecimalAdd = position.getClosableQuantity().add(ZERO22);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                if (!BigDecimals7.isPositive(bigDecimalAdd)) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$markBuySellOrderOnboardingSeen$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {986}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$markBuySellOrderOnboardingSeen$1 */
    static final class C296051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296051(Continuation<? super C296051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BuySellOrderOnboardingStore buySellOrderOnboardingStore = EquityShareOrderDuxo.this.buySellOrderOnboardingStore;
                this.label = 1;
                if (buySellOrderOnboardingStore.markBuySellOrderOnboardingSeen(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityShareOrderDuxo.this.buySellOrderOnboardingSeenPref.set(true);
            return Unit.INSTANCE;
        }
    }

    public final void markBuySellOrderOnboardingSeen() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296051(null), 3, null);
    }

    public final void fetchBuySellOrderOnboarding$feature_trade_equity_externalDebug() {
        if (this.buySellOrderOnboardingSeenPref.get()) {
            return;
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.buySellOrderOnboardingStore.fetchBuySellOrderOnboarding(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.fetchBuySellOrderOnboarding$lambda$36(this.f$0, (ApiBuySellOrderOnboardingResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchBuySellOrderOnboarding$lambda$36(EquityShareOrderDuxo equityShareOrderDuxo, ApiBuySellOrderOnboardingResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.getHas_seen()) {
            equityShareOrderDuxo.submit((EquityShareOrderDuxo) new EquityOrderEvent.BuySellOrderOnboardingEvent(response));
        } else {
            equityShareOrderDuxo.buySellOrderOnboardingSeenPref.set(true);
        }
        return Unit.INSTANCE;
    }

    public final void convertToShareQuantity(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        submit((EquityShareOrderDuxo) new EquityOrderEvent.Share.ConvertToSharesEvent(accountNumber));
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$dismissTradingSessionChangeAlert$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {1012}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$dismissTradingSessionChangeAlert$1 */
    static final class C296031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296031(Continuation<? super C296031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderDuxo.this.new C296031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C296031 c296031;
            Object objM22646determineCurrentSessionConfigurationyxL6bBk$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingSessionChangedStore equityTradingSessionChangedStore = EquityShareOrderDuxo.this.equityTradingSessionChangedStore;
                Companion companion = EquityShareOrderDuxo.INSTANCE;
                UUID instrumentId = ((EquityShareOrderFragment.Args) companion.getArgs((HasSavedState) EquityShareOrderDuxo.this)).getInstrumentId();
                EquityOrderSide side = ((EquityShareOrderFragment.Args) companion.getArgs((HasSavedState) EquityShareOrderDuxo.this)).getSide();
                ShareBasedOrderConfiguration configuration = EquityShareOrderDuxo.this.getStateFlow().getValue().getConfiguration();
                this.label = 1;
                c296031 = this;
                objM22646determineCurrentSessionConfigurationyxL6bBk$default = EquityTradingSessionChangedStore.m22646determineCurrentSessionConfigurationyxL6bBk$default(equityTradingSessionChangedStore, instrumentId, side, configuration, false, c296031, 8, null);
                if (objM22646determineCurrentSessionConfigurationyxL6bBk$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22646determineCurrentSessionConfigurationyxL6bBk$default = ((Result) obj).getValue();
                c296031 = this;
            }
            EquityShareOrderDuxo equityShareOrderDuxo = EquityShareOrderDuxo.this;
            if (Result.m28553exceptionOrNullimpl(objM22646determineCurrentSessionConfigurationyxL6bBk$default) == null) {
                DirectOrder directOrder = (DirectOrder) objM22646determineCurrentSessionConfigurationyxL6bBk$default;
                if ((directOrder instanceof AdvancedOrder) || (directOrder instanceof ShareBasedOrderConfiguration) || directOrder != null) {
                    equityShareOrderDuxo.submit((EquityShareOrderDuxo) new EquityOrderEvent.ChangeOrderConfiguration(directOrder));
                }
            } else {
                equityShareOrderDuxo.submit((EquityShareOrderDuxo) EquityOrderEvent.Exit.INSTANCE);
            }
            EquityShareOrderDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityShareOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$dismissTradingSessionChangeAlert$1$3", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$dismissTradingSessionChangeAlert$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
                return ((AnonymousClass3) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
                return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : null, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : ValidationState.Initial.INSTANCE, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
            }
        }
    }

    public final void dismissTradingSessionChangeAlert() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296031(null), 3, null);
    }

    public final void fetchAdtOnboardingBottomSheet$feature_trade_equity_externalDebug(Observable<String> selectedAccountNumberStream, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(selectedAccountNumberStream, "selectedAccountNumberStream");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        if (this.hasShownAdtOnboardingBottomSheetPref.get()) {
            return;
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.twentyFourHourMarketOnboardingBottomSheetManager.fetchTwentyFourHourMarketOnboardingBottomSheetId(selectedAccountNumberStream, instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.fetchAdtOnboardingBottomSheet$lambda$38(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAdtOnboardingBottomSheet$lambda$38(final EquityShareOrderDuxo equityShareOrderDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final String str = (String) tuples2.component1();
        final Account account = (Account) tuples2.component2();
        equityShareOrderDuxo.withDataState(new Function1() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityShareOrderDuxo.fetchAdtOnboardingBottomSheet$lambda$38$lambda$37(this.f$0, str, account, (EquityShareOrderDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAdtOnboardingBottomSheet$lambda$38$lambda$37(EquityShareOrderDuxo equityShareOrderDuxo, String str, Account account, EquityShareOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EquityOrderContext equityOrderContext = it.getEquityOrderContext();
        if ((equityOrderContext != null ? equityOrderContext.getMarketHours() : null) != OrderMarketHours.ALL_DAY_HOURS) {
            equityShareOrderDuxo.submit((EquityShareOrderDuxo) new EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent(str, account.getAccountNumber(), it.getQuantityOrAmount$feature_trade_equity_externalDebug()));
        }
        return Unit.INSTANCE;
    }

    public final void markAdtBottomSheetSeen() {
        BaseDuxos.handleAdtSheetSeen(this, this.equityTradingSeenStatusStore, this.hasShownAdtOnboardingBottomSheetPref);
    }

    public static /* synthetic */ void startLimitOrderFlow$default(EquityShareOrderDuxo equityShareOrderDuxo, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, OrderMarketHours orderMarketHours, OrderTimeInForce orderTimeInForce, int i, Object obj) {
        if ((i & 2) != 0) {
            bigDecimal = null;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = null;
        }
        if ((i & 8) != 0) {
            orderMarketHours = null;
        }
        if ((i & 16) != 0) {
            orderTimeInForce = null;
        }
        equityShareOrderDuxo.startLimitOrderFlow(str, bigDecimal, bigDecimal2, orderMarketHours, orderTimeInForce);
    }

    public final void startLimitOrderFlow(String accountNumber, BigDecimal shares, BigDecimal limitPrice, OrderMarketHours tradingSession, OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        submit((EquityShareOrderDuxo) new EquityOrderEvent.ChangeOrderConfiguration(new AdvancedOrder.LimitNew(accountNumber, shares, limitPrice, timeInForce, tradingSession, false)));
    }

    public final boolean onBackPressedMaybeEditOrder() {
        DirectOrder.Draft draftEdit;
        EquityShareOrderViewState value = getStateFlow().getValue();
        DirectOrder.Draft configuration = value.getConfiguration();
        if ((configuration instanceof AdvancedOrder.MarketNew) || (configuration instanceof AdvancedOrder.MarketDraft) || (configuration instanceof AdvancedOrder.MarketComplete)) {
            configuration = new AdvancedOrder.MarketNew(configuration.getAccountNumber(), configuration.getShareQuantity(), configuration.getTaxLots());
        } else {
            if ((configuration instanceof AdvancedOrder.LimitNew) || (configuration instanceof AdvancedOrder.LimitDraft) || (configuration instanceof AdvancedOrder.LimitComplete)) {
                String accountNumber = configuration.getAccountNumber();
                BigDecimal shareQuantity = value.getConfiguration().getShareQuantity();
                EquityOrderContext equityOrderContext = value.getEquityOrderContext();
                BigDecimal price = equityOrderContext != null ? equityOrderContext.getPrice() : null;
                EquityOrderContext equityOrderContext2 = value.getEquityOrderContext();
                OrderMarketHours marketHours = equityOrderContext2 != null ? equityOrderContext2.getMarketHours() : null;
                EquityOrderContext equityOrderContext3 = value.getEquityOrderContext();
                configuration = new AdvancedOrder.LimitNew(accountNumber, shareQuantity, price, equityOrderContext3 != null ? equityOrderContext3.getTimeInForce() : null, marketHours, configuration.getTaxLots());
            } else if (configuration instanceof ShareLimit) {
                String accountNumber2 = configuration.getAccountNumber();
                BigDecimal shareQuantity2 = value.getConfiguration().getShareQuantity();
                EquityOrderContext equityOrderContext4 = value.getEquityOrderContext();
                BigDecimal price2 = equityOrderContext4 != null ? equityOrderContext4.getPrice() : null;
                EquityOrderContext equityOrderContext5 = value.getEquityOrderContext();
                OrderMarketHours marketHours2 = equityOrderContext5 != null ? equityOrderContext5.getMarketHours() : null;
                EquityOrderContext equityOrderContext6 = value.getEquityOrderContext();
                configuration = new AdvancedOrder.LimitNew(accountNumber2, shareQuantity2, price2, equityOrderContext6 != null ? equityOrderContext6.getTimeInForce() : null, marketHours2, ((ShareLimit) configuration).getTaxLots());
            } else if (!(configuration instanceof ShareMarket) && !(configuration instanceof ShareSimpleLimit) && !(configuration instanceof ShareStopLimit) && !(configuration instanceof ShareStopLoss) && !(configuration instanceof ShareTrailingStop)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        DirectOrder.Draft draftCompletedDraft = configuration.completedDraft();
        if (draftCompletedDraft != null && (draftEdit = draftCompletedDraft.edit()) != null) {
            configuration = draftEdit;
        }
        submit((EquityShareOrderDuxo) new EquityOrderEvent.ChangeOrderConfiguration(configuration));
        return true;
    }

    /* compiled from: EquityShareOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EquityShareOrderDuxo, EquityShareOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityShareOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EquityShareOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityShareOrderFragment.Args getArgs(EquityShareOrderDuxo equityShareOrderDuxo) {
            return (EquityShareOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, equityShareOrderDuxo);
        }
    }
}
