package com.robinhood.android.trade.equity.p261ui.dollar;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equity.EquityOrderSourceLogging;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.equity.FeeEstimation2;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.equity.validation.CryptoPendingAndCancelExtension;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equity.validation.ValidateAndReviewEquityOrder;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryService2;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.experiments.TradeEquitiesSduiAccountSwitcherExperiment;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.lib.trade.view.AccountSwitcherExtensions;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.nbbo.NbboAnalytics;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.tickerinputview.CharArrays;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.account.AccountSwitcherRefreshEvent;
import com.robinhood.android.trade.equity.p261ui.dollar.EquityDollarOrderDuxo;
import com.robinhood.android.trade.equity.p261ui.dollar.EquityDollarOrderFragment;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment;
import com.robinhood.android.trade.equity.prefs.BuySellOrderOnboardingSeenPref;
import com.robinhood.android.trade.equity.util.BaseDuxos;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DollarBased;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.HasShownAdtOnboardingBottomSheetPref;
import com.robinhood.librobinhood.data.store.BuySellOrderOnboardingStore;
import com.robinhood.librobinhood.data.store.EquityOrderDefaultStore;
import com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuickTradeAmountsStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager;
import com.robinhood.models.api.ApiBuySellOrderOnboardingResponse;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiQuickTradeAmounts;
import com.robinhood.models.api.ApiSalesTax;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.SuitabilityStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import equity_order_summary.proto.p459v1.WarmupRequestDto;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.Monitoring;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import retrofit2.Response;

/* compiled from: EquityDollarOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 °\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002°\u0001Bý\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\b\b\u0001\u0010,\u001a\u00020-\u0012\b\b\u0001\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u000208\u0012\u0006\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020<\u0012\u0006\u0010=\u001a\u00020>\u0012\u0006\u0010?\u001a\u00020@¢\u0006\u0004\bA\u0010BJ\b\u0010V\u001a\u00020OH\u0016J\b\u0010W\u001a\u00020OH\u0016J\b\u0010X\u001a\u00020OH\u0016J\u001b\u0010Y\u001a\u00020O2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0001¢\u0006\u0002\b]J\u000e\u0010^\u001a\u00020O2\u0006\u0010_\u001a\u00020`J\u0006\u0010a\u001a\u00020OJ\u0006\u0010b\u001a\u00020OJ\u0010\u0010c\u001a\u00020O2\u0006\u0010d\u001a\u00020UH\u0002J\u000e\u0010e\u001a\u00020O2\u0006\u0010f\u001a\u00020\\J\u0006\u0010g\u001a\u00020OJ\u0016\u0010h\u001a\u00020O2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020U0TH\u0002J\u0006\u0010j\u001a\u00020OJ\u0006\u0010k\u001a\u00020OJ\u0006\u0010l\u001a\u00020OJ\u000e\u0010m\u001a\u00020O2\u0006\u0010n\u001a\u00020oJ\u0010\u0010p\u001a\u00020q2\b\b\u0002\u0010r\u001a\u00020sJ\u0010\u0010t\u001a\u00020O2\b\b\u0002\u0010u\u001a\u00020vJ\u000e\u0010w\u001a\u00020O2\u0006\u0010x\u001a\u00020vJ\u000e\u0010y\u001a\u00020O2\u0006\u0010z\u001a\u00020{J\u0006\u0010|\u001a\u00020OJ\u0006\u0010}\u001a\u00020OJ\u0015\u0010~\u001a\u00020O2\r\u0010\u007f\u001a\t\u0012\u0004\u0012\u00020\\0\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020O2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001J\"\u0010\u0084\u0001\u001a\u00020O2\u000f\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0080\u00012\b\u0010\u0086\u0001\u001a\u00030\u0083\u0001J\u0018\u0010\u0087\u0001\u001a\u00020O2\u000f\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0080\u0001J%\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0001¢\u0006\u0003\b\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020O2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001J#\u0010\u008f\u0001\u001a\u00020O2\u0007\u0010\u0090\u0001\u001a\u00020\\2\u0007\u0010\u0091\u0001\u001a\u00020v2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001J\u0007\u0010\u0094\u0001\u001a\u00020OJ\u0016\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008a\u00012\b\u0010\u0096\u0001\u001a\u00030\u008a\u0001H\u0002J\u0013\u0010\u0097\u0001\u001a\u00020O2\b\u0010\u0085\u0001\u001a\u00030\u0098\u0001H\u0002J\u001a\u0010\u0099\u0001\u001a\u00020\\2\u000f\u0010\u009a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0080\u0001H\u0002J\u0019\u0010\u009b\u0001\u001a\u00020O2\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0000¢\u0006\u0003\b\u009e\u0001J\u0007\u0010\u009f\u0001\u001a\u00020OJ\t\u0010 \u0001\u001a\u00020OH\u0002J\u001e\u0010¡\u0001\u001a\u00020O2\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0001¢\u0006\u0003\b£\u0001J\u0007\u0010¤\u0001\u001a\u00020OJ\u0007\u0010¥\u0001\u001a\u00020OJ\u0012\u0010¦\u0001\u001a\u00020O2\u0007\u0010§\u0001\u001a\u00020oH\u0007J\u0007\u0010¨\u0001\u001a\u00020OJF\u0010©\u0001\u001a\u00020O2\u0007\u0010\u0090\u0001\u001a\u00020\\2\u000b\b\u0002\u0010ª\u0001\u001a\u0004\u0018\u00010o2\u000b\b\u0002\u0010«\u0001\u001a\u0004\u0018\u00010o2\f\b\u0002\u0010¬\u0001\u001a\u0005\u0018\u00010\u00ad\u00012\f\b\u0002\u0010®\u0001\u001a\u0005\u0018\u00010¯\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020@X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010G\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bI\u0010JR\u001c\u0010M\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010O0O0NX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010Q\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0T P*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0T\u0018\u00010S0S0RX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006±\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderViewState;", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "Lcom/robinhood/android/udf/HasSavedState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityTradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quickTradeStore", "Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityOrderDefaultStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "buySellOrderOnboardingSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownAdtOnboardingBottomSheetPref", "buySellOrderOnboardingStore", "Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "twentyFourHourMarketOnboardingBottomSheetManager", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/equity/submission/EquityOrderManager;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/store/base/SuitabilityStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "summaryComponent", "Lmicrogram/android/inject/MicrogramComponent;", "idlOrderSummaryService", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "getIdlOrderSummaryService", "()Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "idlOrderSummaryService$delegate", "Lkotlin/Lazy;", "accountSwitcherRefreshSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "retryWhenRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "onCreate", "onStart", "onResume", "fetchPosition", "accountNumberObs", "Lio/reactivex/Observable;", "", "fetchPosition$feature_trade_equity_externalDebug", "setStaticInputs", "staticInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "submit", "logSwipeToSubmit", "logSubmitEvent", "equityOrderContext", "logOrderCheckAction", "loggingIdentifier", "onSubmitted", "setRetryWhen", "retryWhen", "validateAndReviewOrder", "logReviewingReadyToSubmit", "refreshNbbo", "setQuantityAndValidate", "quantity", "Ljava/math/BigDecimal;", "cancelPendingCryptoOrders", "Lkotlinx/coroutines/Job;", "minTimeInFlight", "", "sellAll", "shouldValidate", "", "setReviewingState", "reviewing", "recordSilentAlert", "action", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "overrideToExecuteInMarketHoursOnlyAndValidate", "overrideFlipIpoAccessSharesAndValidate", "appendOverridesAndValidate", "overridesToAppend", "", "setDollarAmountAndValidate", "dollarAmount", "Lcom/robinhood/models/util/Money;", "logQuickTradeTap", "quickTradeAmounts", "selectedQuickTradeAmount", "logQuickTradeSellAllTap", "validateUserInputs", "amountCharArray", "", "keyEvent", "Landroid/view/KeyEvent;", "validateUserInputs$feature_trade_equity_externalDebug", "consumeKeyEvent", "setAccountNumber", "accountNumber", "checkForceSuitability", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "refreshAccountSwitcher", "format", "charArray", "logQuickTradeAmountsAppear", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "groupButtonTitle", "quickTradeAmountsForSide", "setConfiguration", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "setConfiguration$feature_trade_equity_externalDebug", "markBuySellOrderOnboardingSeen", "fetchBuySellOrderOnboarding", "fetchTwentyFourHourMarketOnboardingBottomSheet", "selectedAccountNumberStream", "fetchTwentyFourHourMarketOnboardingBottomSheet$feature_trade_equity_externalDebug", "markAdtBottomSheetSeen", "convertToShareQuantity", "submitConvertToShareQuantityAmount", "shareAmount", "dismissTradingSessionChangeAlert", "startLimitOrderFlow", EquityShareOrderFragment.ARG_SHARES, "limitPrice", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityDollarOrderDuxo extends BaseDuxo3<EquityDollarOrderDataState, EquityDollarOrderViewState, EquityOrderEvent.Dollar> implements HasSavedState {
    private static final NumberFormat FORMATTER;
    private static final char[] INITIAL_STATE;
    private static final BigDecimal MAX_AMOUNT;
    private final AccountProvider accountProvider;
    private final PublishSubject<Unit> accountSwitcherRefreshSubject;
    private final AnalyticsLogger analytics;
    private final BackupWithholdingStore backupWithholdingStore;
    private final BooleanPreference buySellOrderOnboardingSeenPref;
    private final BuySellOrderOnboardingStore buySellOrderOnboardingStore;
    private final EquityOrderCheckValidator equityOrderCheckValidator;
    private final EquityOrderDefaultStore equityOrderDefaultStore;
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
    private final PerformanceLogger performanceLogger;
    private final PositionStore positionStore;
    private final QuickTradeAmountsStore quickTradeStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> retryWhenRelay;
    private final SavedStateHandle savedStateHandle;
    private final SuitabilityStore suitabilityStore;
    private final MicrogramComponent summaryComponent;
    private final TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EquityDollarOrderDuxo(AnalyticsLogger analytics, EquityOrderManager orderManager, AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityTradingSessionChangedStore equityTradingSessionChangedStore, TraderEventLogger eventLogger, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, PositionStore positionStore, QuickTradeAmountsStore quickTradeStore, QuoteStore quoteStore, EquityOrderDefaultStore equityOrderDefaultStore, TraderMarketHoursManager marketHoursManager, NbboSummaryStore nbboSummaryStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, SuitabilityStore suitabilityStore, OrderStore orderStore, @BuySellOrderOnboardingSeenPref BooleanPreference buySellOrderOnboardingSeenPref, @HasShownAdtOnboardingBottomSheetPref BooleanPreference hasShownAdtOnboardingBottomSheetPref, BuySellOrderOnboardingStore buySellOrderOnboardingStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager, PerformanceLogger performanceLogger, ExperimentsStore experimentsStore, MicrogramComponent.Factory microgramComponentFactory, EquityDollarOrderStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quickTradeStore, "quickTradeStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        DollarBased orderConfiguration = ((EquityDollarOrderFragment.Args) INSTANCE.getArgs(savedStateHandle)).getOrderConfiguration();
        Currency currency = Currencies.USD;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        super(new EquityDollarOrderDataState(orderConfiguration, new OrderRequest2.DollarAmount(new Money(currency, ZERO)), null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -4, 3, null), stateProvider, duxoBundle);
        this.analytics = analytics;
        this.orderManager = orderManager;
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.equityTradingSessionChangedStore = equityTradingSessionChangedStore;
        this.eventLogger = eventLogger;
        this.regionGateProvider = regionGateProvider;
        this.instrumentStore = instrumentStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.positionStore = positionStore;
        this.quickTradeStore = quickTradeStore;
        this.quoteStore = quoteStore;
        this.equityOrderDefaultStore = equityOrderDefaultStore;
        this.marketHoursManager = marketHoursManager;
        this.nbboSummaryStore = nbboSummaryStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.suitabilityStore = suitabilityStore;
        this.orderStore = orderStore;
        this.buySellOrderOnboardingSeenPref = buySellOrderOnboardingSeenPref;
        this.hasShownAdtOnboardingBottomSheetPref = hasShownAdtOnboardingBottomSheetPref;
        this.buySellOrderOnboardingStore = buySellOrderOnboardingStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.twentyFourHourMarketOnboardingBottomSheetManager = twentyFourHourMarketOnboardingBottomSheetManager;
        this.performanceLogger = performanceLogger;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.summaryComponent = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-equity-order-summary", null, 2, null), null, 4, null);
        this.idlOrderSummaryService = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDollarOrderDuxo.idlOrderSummaryService_delegate$lambda$0(this.f$0);
            }
        });
        PublishSubject<Unit> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.accountSwitcherRefreshSubject = publishSubjectCreate;
        BehaviorRelay<Optional<Validator.Action.RetryWhen<EquityOrderContext>>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.retryWhenRelay = behaviorRelayCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EquityOrderSummaryService getIdlOrderSummaryService() {
        return (EquityOrderSummaryService) this.idlOrderSummaryService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderSummaryService idlOrderSummaryService_delegate$lambda$0(EquityDollarOrderDuxo equityDollarOrderDuxo) {
        return (EquityOrderSummaryService) equityDollarOrderDuxo.summaryComponent.getServiceLocator().getClient(EquityOrderSummaryService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        setAccountNumber(((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInitialAccountNumber(), false, ((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSide());
        Observable<String> observableFilterIsPresent = ObservablesKt.filterIsPresent(this.instrumentAccountSwitcherStore.streamActiveAccountNumber());
        this.equityOrderDefaultStore.setDefaultToDollarBased();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.toOptionals(this.nbboSummaryStore.getStream().asObservable(((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.RESUMED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C295352(null));
        fetchBuySellOrderOnboarding();
        m2496x39a0682e(observableFilterIsPresent);
        BaseDuxos.setupInitialLoadLogger(this, this.eventLogger);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C295363(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C295374(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C295385(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C295396(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(EquityDollarOrderDuxo equityDollarOrderDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onCreate$1$1((NbboSummary) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2 */
    static final class C295352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295352(Continuation<? super C295352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295352(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingSessionChangedStore equityTradingSessionChangedStore = EquityDollarOrderDuxo.this.equityTradingSessionChangedStore;
                Companion companion = EquityDollarOrderDuxo.INSTANCE;
                Flow<GenericAlertContent<GenericAction>> flowTradingSessionChangedAlerts = equityTradingSessionChangedStore.tradingSessionChangedAlerts(((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getInstrumentId(), ((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getSide(), new AnonymousClass1(EquityDollarOrderDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityDollarOrderDuxo.this, null);
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

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {204}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super DirectOrder>, Object> {
            int label;
            final /* synthetic */ EquityDollarOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityDollarOrderDuxo equityDollarOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = equityDollarOrderDuxo;
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
                final StateFlow<EquityDollarOrderViewState> stateFlow = this.this$0.getStateFlow();
                Flow<DollarBased> flow = new Flow<DollarBased>() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super DollarBased> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C295272(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C295272<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1$2", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C295272.this.emit(null, this);
                            }
                        }

                        public C295272(FlowCollector flowCollector) {
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
                                DollarBased configuration = ((EquityDollarOrderViewState) obj).getConfiguration();
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

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$2", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GenericAlertContent<? extends GenericAction>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityDollarOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityDollarOrderDuxo equityDollarOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityDollarOrderDuxo;
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

            /* compiled from: EquityDollarOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$2$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
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
                public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, this.$alertContent, null, null, null, false, false, false, false, -67108865, 3, null);
                }
            }
        }
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$3", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {224, 225}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$3 */
    static final class C295363 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295363(Continuation<? super C295363> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295363(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295363) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$3$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$3$1, reason: invalid class name */
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
                StateFlow<Monitoring> state = EquityDollarOrderDuxo.this.summaryComponent.getMicrogramMonitor().getState();
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
            EquityOrderSummaryService idlOrderSummaryService = EquityDollarOrderDuxo.this.getIdlOrderSummaryService();
            String string2 = ((EquityDollarOrderFragment.Args) EquityDollarOrderDuxo.INSTANCE.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            WarmupRequestDto warmupRequestDto = new WarmupRequestDto(string2);
            this.label = 2;
        }
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$4", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$4 */
    static final class C295374 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295374(Continuation<? super C295374> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295374(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295374) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$4$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityDollarOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityDollarOrderDuxo equityDollarOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityDollarOrderDuxo;
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

            /* compiled from: EquityDollarOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$4$1$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505771 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
                final /* synthetic */ Monitoring $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505771(Monitoring monitoring, Continuation<? super C505771> continuation) {
                    super(2, continuation);
                    this.$state = monitoring;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505771 c505771 = new C505771(this.$state, continuation);
                    c505771.L$0 = obj;
                    return c505771;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
                    return ((C505771) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, this.$state, false, false, false, false, -536870913, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505771((Monitoring) this.L$0, null));
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
                StateFlow<Monitoring> state = EquityDollarOrderDuxo.this.summaryComponent.getMicrogramMonitor().getState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityDollarOrderDuxo.this, null);
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

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5 */
    static final class C295385 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295385(Continuation<? super C295385> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295385(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295385) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OrderStore orderStore = EquityDollarOrderDuxo.this.orderStore;
                final StateFlow<EquityDollarOrderViewState> stateFlow = EquityDollarOrderDuxo.this.getStateFlow();
                final Flow flowFilterNotNull = FlowKt.filterNotNull(new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C295292(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2 */
                    public static final class C295292<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C295292.this.emit(null, this);
                            }
                        }

                        public C295292(FlowCollector flowCollector) {
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
                                EquityOrderContext equityOrderContext = ((EquityDollarOrderViewState) obj).getEquityOrderContext();
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
                });
                Flow<Result<ApiEstimatedFees>> flowEstimateFees = FeeEstimation2.estimateFees(orderStore, new Flow<EquityOrderContext>() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super EquityOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C295282(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C295282<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1$2", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                return C295282.this.emit(null, this);
                            }
                        }

                        public C295282(FlowCollector flowCollector) {
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
                                EquityOrderContext equityOrderContext = (EquityOrderContext) obj;
                                BigDecimal quantity = equityOrderContext.getQuantity();
                                if (quantity != null && !BigDecimals7.isZero(quantity) && !BigDecimals7.isZero(equityOrderContext.getEstimatedCost())) {
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
                }, EquityDollarOrderDuxo.this.regionGateProvider);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(EquityDollarOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowEstimateFees, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiEstimatedFees;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$3", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Result<? extends ApiEstimatedFees>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityDollarOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EquityDollarOrderDuxo equityDollarOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = equityDollarOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends ApiEstimatedFees> result, Continuation<? super Unit> continuation) {
                return invoke2((Result<ApiEstimatedFees>) result, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Result<ApiEstimatedFees> result, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityDollarOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$3$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$5$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
                final /* synthetic */ Result<ApiEstimatedFees> $result;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Result<ApiEstimatedFees> result, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$result = result;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityDollarOrderDataState equityDollarOrderDataState = (EquityDollarOrderDataState) this.L$0;
                    Result<ApiEstimatedFees> result = this.$result;
                    List<ApiSalesTax> salesTaxes = null;
                    if (result != null) {
                        Object value = result.getValue();
                        if (Result.m28555isFailureimpl(value)) {
                            value = null;
                        }
                        ApiEstimatedFees apiEstimatedFees = (ApiEstimatedFees) value;
                        if (apiEstimatedFees != null) {
                            salesTaxes = apiEstimatedFees.getSalesTaxes();
                        }
                    }
                    return EquityDollarOrderDataState.copy$default(equityDollarOrderDataState, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, salesTaxes != null ? !salesTaxes.isEmpty() : false, false, -1, 2, null);
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

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$6", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {256}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$6 */
    static final class C295396 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295396(Continuation<? super C295396> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295396(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295396) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(EquityDollarOrderDuxo.this.experimentsStore, new Experiment[]{TradeEquitiesSduiAccountSwitcherExperiment.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityDollarOrderDuxo.this, null);
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

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "useSduiAccountSwitcher", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$6$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityDollarOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityDollarOrderDuxo equityDollarOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityDollarOrderDuxo;
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

            /* compiled from: EquityDollarOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$6$1$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505781 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
                final /* synthetic */ boolean $useSduiAccountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505781(boolean z, Continuation<? super C505781> continuation) {
                    super(2, continuation);
                    this.$useSduiAccountSwitcher = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505781 c505781 = new C505781(this.$useSduiAccountSwitcher, continuation);
                    c505781.L$0 = obj;
                    return c505781;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
                    return ((C505781) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, this.$useSduiAccountSwitcher, -1, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505781(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable observableSwitchMapSingle = Observables.INSTANCE.combineLatest(this.retryWhenRelay, asObservable(getStateFlow())).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onStart.1
            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            @Override // io.reactivex.functions.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean apply(Tuples2<? extends Optional<? extends Validator.Action.RetryWhen<? super EquityOrderContext>>, EquityDollarOrderViewState> tuples2) {
                boolean zBooleanValue;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<? extends Validator.Action.RetryWhen<? super EquityOrderContext>> optionalComponent1 = tuples2.component1();
                EquityDollarOrderViewState equityDollarOrderViewStateComponent2 = tuples2.component2();
                Validator.Action.RetryWhen<? super EquityOrderContext> orNull = optionalComponent1.getOrNull();
                if (orNull == null) {
                    zBooleanValue = false;
                } else {
                    EquityOrderContext equityOrderContext = equityDollarOrderViewStateComponent2.getEquityOrderContext();
                    Boolean boolValueOf = equityOrderContext != null ? Boolean.valueOf(orNull.matches(equityOrderContext)) : null;
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            }
        }).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean shouldRetryValidation) {
                Intrinsics.checkNotNullParameter(shouldRetryValidation, "shouldRetryValidation");
                return shouldRetryValidation.booleanValue();
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onStart.3

            /* compiled from: EquityDollarOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onStart$3$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onStart$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ EquityDollarOrderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityDollarOrderDuxo equityDollarOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityDollarOrderDuxo;
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
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.validateAndReviewOrder();
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Unit> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                EquityDollarOrderDuxo equityDollarOrderDuxo = EquityDollarOrderDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(equityDollarOrderDuxo, null, new AnonymousClass1(equityDollarOrderDuxo, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.instrumentAccountSwitcherStore;
        Companion companion = INSTANCE;
        InstrumentAccountSwitcherStore.refresh$default(instrumentAccountSwitcherStore, ((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), null, false, 6, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentAccountSwitcherStore.getInstrumentAccountSwitcherQuery().asObservable(((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onStart$lambda$2(this.f$0, (InstrumentAccountSwitcher) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAllSelfDirectedAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onStart$lambda$3(this.f$0, (List) obj);
            }
        });
        AccountSwitcherRefreshEvent.refreshAccountSwitcherExtension(this, this.accountSwitcherRefreshSubject, ((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), this.instrumentAccountSwitcherStore, new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onStart$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onStart$lambda$6(this.f$0, (InstrumentAccountSwitcher) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onStart$lambda$7(this.f$0, (EquityOrderEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(EquityDollarOrderDuxo equityDollarOrderDuxo, InstrumentAccountSwitcher accountSwitcher) {
        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onStart$4$1(accountSwitcher, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(EquityDollarOrderDuxo equityDollarOrderDuxo, List allAccounts) {
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onStart$5$1(allAccounts, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(EquityDollarOrderDuxo equityDollarOrderDuxo, boolean z) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onStart$6$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(EquityDollarOrderDuxo equityDollarOrderDuxo, InstrumentAccountSwitcher switcher) {
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        Account account = equityDollarOrderDuxo.getStateFlow().getValue().getAccount();
        if (account != null) {
            equityDollarOrderDuxo.submit(new EquityOrderEvent.AccountSwitcherRefreshedEvent(AccountSwitcherExtensions.toAccountSwitcherData(switcher.getTradeBar(), account.getAccountNumber(), new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null)), null));
            equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onStart$7$1$1(switcher, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(EquityDollarOrderDuxo equityDollarOrderDuxo, EquityOrderEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityDollarOrderDuxo.submit((EquityOrderEvent.Dollar) it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observable<T> observableAsObservable = asObservable(getStateFlow());
        final UUID instrumentId = ((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId();
        this.accountProvider.refresh(false);
        Single<List<String>> singleFirstOrError = this.accountProvider.streamAllSelfDirectedAccountNumbers().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$8(this.f$0, instrumentId, (List) obj);
            }
        });
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(this.instrumentAccountSwitcherStore.streamActiveAccountNumber());
        final AccountProvider accountProvider = this.accountProvider;
        Observable observableSwitchMap = observableFilterIsPresent.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final Observable<Account> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return accountProvider.streamAccount(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$9(this.f$0, (Account) obj);
            }
        });
        Observable<String> observableAutoConnect = observableFilterIsPresent.distinctUntilChanged().replay(1).autoConnect();
        Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "autoConnect(...)");
        Observable<R> observableSwitchMap2 = observableAutoConnect.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InstrumentBuyingPower> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                EquityDollarOrderDuxo.this.instrumentBuyingPowerStore.refreshSelectedAccount(true, instrumentId, accountNumber);
                return QueryKt.asObservable(EquityDollarOrderDuxo.this.instrumentBuyingPowerStore.getStreamSelectedAccountBuyingPowerForInstrument(), instrumentId, accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$10(this.f$0, (InstrumentBuyingPower) obj);
            }
        });
        this.instrumentStore.refresh(true, instrumentId);
        Observable<Instrument> observableDistinctUntilChanged = this.instrumentStore.getInstrument(instrumentId).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$11(this.f$0, (Instrument) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = asObservable(this.marketHoursManager.getCurrentTradingSession()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$12(this.f$0, (TradingSession) obj);
            }
        });
        Observable observableStartWith = ObservablesKt.toOptionals(this.quoteStore.getStreamQuote().asObservable(instrumentId)).startWith((Observable) Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableStartWith, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$13(this.f$0, (Optional) obj);
            }
        });
        fetchPosition$feature_trade_equity_externalDebug(observableAutoConnect);
        Observable observableFilter = observableAsObservable.filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.9
            @Override // io.reactivex.functions.Predicate
            public final boolean test(EquityDollarOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.isQuickTradeAvailable();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable map = observableFilter.map(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(Boolean.valueOf(((EquityDollarOrderViewState) it).getCanShowReviewButton()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EquityDollarOrderDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSkip = ObservablesKt.filterIsPresent(map).distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSkip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$15(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = observableAutoConnect.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.12
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<ApiQuickTradeAmounts>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                QuickTradeAmountsStore quickTradeAmountsStore = EquityDollarOrderDuxo.this.quickTradeStore;
                Companion companion = EquityDollarOrderDuxo.INSTANCE;
                quickTradeAmountsStore.refresh(((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getInstrumentId(), accountNumber);
                return EquityDollarOrderDuxo.this.quickTradeStore.stream(((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getInstrumentId(), accountNumber);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$17(this.f$0, (Optional) obj);
            }
        });
        final C2954114 c2954114 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.14
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((EquityDollarOrderViewState) obj).getReviewing());
            }
        };
        Observable observableSwitchMap3 = observableAsObservable.map(new Function(c2954114) { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c2954114, "function");
                this.function = c2954114;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.15
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.16
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends NbboSummary> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EquityDollarOrderDuxo.this.nbboSummaryStore.getStreamCache().asObservable(((EquityDollarOrderFragment.Args) EquityDollarOrderDuxo.INSTANCE.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getInstrumentId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$18(this.f$0, (NbboSummary) obj);
            }
        });
        Observable observableTake = observableAsObservable.filter(new Predicate() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.18
            @Override // io.reactivex.functions.Predicate
            public final boolean test(EquityDollarOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.isQuickTradeAvailable() || it.getCanShowReviewButton();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$19(this.f$0, instrumentId, (EquityDollarOrderViewState) obj);
            }
        });
        Observable<R> observableSwitchMap4 = observableAutoConnect.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.onResume.20
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<WithholdingStatus>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return EquityDollarOrderDuxo.this.backupWithholdingStore.streamWithholdingStatus(accountNumber, instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$20(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$21(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsKt.streamWithExperiment(this.regionGateProvider, this.experimentsStore, SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, false), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onResume$lambda$22(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(EquityDollarOrderDuxo equityDollarOrderDuxo, UUID uuid, List list) {
        QuickTradeAmountsStore quickTradeAmountsStore = equityDollarOrderDuxo.quickTradeStore;
        Intrinsics.checkNotNull(list);
        quickTradeAmountsStore.refreshForAllAccounts(uuid, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(EquityDollarOrderDuxo equityDollarOrderDuxo, Account account) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$3$1(account, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(EquityDollarOrderDuxo equityDollarOrderDuxo, InstrumentBuyingPower instrumentBuyingPower) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$5$1(instrumentBuyingPower, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(EquityDollarOrderDuxo equityDollarOrderDuxo, Instrument instrument) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$6$1(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(EquityDollarOrderDuxo equityDollarOrderDuxo, TradingSession tradingSession) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$7$1(tradingSession, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(EquityDollarOrderDuxo equityDollarOrderDuxo, Optional optional) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$8$1((Quote) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(EquityDollarOrderDuxo equityDollarOrderDuxo, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        equityDollarOrderDuxo.submit(new EquityOrderEvent.Dollar.QuickTradeToggledEvent(bool.booleanValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(EquityDollarOrderDuxo equityDollarOrderDuxo, Optional optional) {
        ApiQuickTradeAmounts apiQuickTradeAmounts = (ApiQuickTradeAmounts) optional.component1();
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$13$1(apiQuickTradeAmounts, null));
        if (apiQuickTradeAmounts != null) {
            equityDollarOrderDuxo.logQuickTradeAmountsAppear(apiQuickTradeAmounts);
        }
        equityDollarOrderDuxo.submit(new EquityOrderEvent.Dollar.QuickTradeLoadedEvent(equityDollarOrderDuxo.getStateFlow().getValue().getCanShowReviewButton()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(EquityDollarOrderDuxo equityDollarOrderDuxo, NbboSummary nbboSummary) {
        NbboAnalytics.INSTANCE.logNbboAppear(equityDollarOrderDuxo.eventLogger, nbboSummary);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$19(EquityDollarOrderDuxo equityDollarOrderDuxo, UUID uuid, EquityDollarOrderViewState equityDollarOrderViewState) {
        equityDollarOrderDuxo.performanceLogger.completeMetric(PerformanceMetricEventData.Name.BUY_EQUITY_TRADE_FLOW, uuid);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$20(EquityDollarOrderDuxo equityDollarOrderDuxo, Optional optional) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$21$1((WithholdingStatus) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$21(EquityDollarOrderDuxo equityDollarOrderDuxo, boolean z) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$22$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$22(EquityDollarOrderDuxo equityDollarOrderDuxo, boolean z) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$onResume$23$1(z, null));
        return Unit.INSTANCE;
    }

    public final void fetchPosition$feature_trade_equity_externalDebug(Observable<String> accountNumberObs) {
        Intrinsics.checkNotNullParameter(accountNumberObs, "accountNumberObs");
        Observable<R> observableSwitchMap = accountNumberObs.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$fetchPosition$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Position> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.this$0.positionStore.refreshAccount(accountNumber, false);
                return PositionStore.getPositionForAccount$default(this.this$0.positionStore, ((EquityDollarOrderFragment.Args) EquityDollarOrderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInstrumentId(), accountNumber, false, 4, null).take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.fetchPosition$lambda$23(this.f$0, (Position) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchPosition$lambda$23(EquityDollarOrderDuxo equityDollarOrderDuxo, Position position) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$fetchPosition$2$1(position, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setStaticInputs$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setStaticInputs$1 */
    static final class C295611 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        final /* synthetic */ EquityOrderRequestInputs.StaticInputs $staticInputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295611(EquityOrderRequestInputs.StaticInputs staticInputs, Continuation<? super C295611> continuation) {
            super(2, continuation);
            this.$staticInputs = staticInputs;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295611 c295611 = new C295611(this.$staticInputs, continuation);
            c295611.L$0 = obj;
            return c295611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295611) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, this.$staticInputs, false, false, null, null, null, null, null, false, false, false, false, -4194305, 3, null);
        }
    }

    public final void setStaticInputs(EquityOrderRequestInputs.StaticInputs staticInputs) {
        Intrinsics.checkNotNullParameter(staticInputs, "staticInputs");
        applyMutation(new C295611(staticInputs, null));
    }

    public final void submit() {
        Observable map = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$submit$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EquityDollarOrderViewState) it).getEquityOrderContext());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EquityDollarOrderDuxo$submit$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.submit$lambda$25(this.f$0, (EquityOrderContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submit$lambda$25(EquityDollarOrderDuxo equityDollarOrderDuxo, EquityOrderContext equityOrderContext) {
        Intrinsics.checkNotNull(equityOrderContext);
        equityDollarOrderDuxo.logSubmitEvent(equityOrderContext);
        OrderSubmissionManager.submit$default(equityDollarOrderDuxo.orderManager, equityOrderContext.getOrderRequestDraft(), null, false, 6, null);
        return Unit.INSTANCE;
    }

    public final void logSwipeToSubmit() {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.SWIPE, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), null, UserInteractionEventData.Action.SUBMIT_ORDER, null, null, null, 116, null), true, false, 4, null);
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_EQUITY_CONFIRM, null, null, null, 14, null);
    }

    private final void logSubmitEvent(EquityOrderContext equityOrderContext) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_TRADED_EQUITY, AnalyticsStrings.BUTTON_TRADED_EQUITY_DOLLAR_MARKET_ORDER, null, null, null, null, equityOrderContext.getRefId().toString(), null, 188, null);
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(this.eventLogger, OrderFormStep.SUBMIT, equityOrderContext.toOrderPayload(), equityOrderContext.getBrokerageAccountType(), EquityOrderSourceLogging.toMetaSource(((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getFlowSource()), null, null, null, 112, null);
    }

    public final void logOrderCheckAction(final String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Observable map = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$logOrderCheckAction$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((EquityDollarOrderViewState) it).getEquityOrderContext());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((EquityDollarOrderDuxo$logOrderCheckAction$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.logOrderCheckAction$lambda$27(this.f$0, loggingIdentifier, (EquityOrderContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOrderCheckAction$lambda$27(EquityDollarOrderDuxo equityDollarOrderDuxo, String str, EquityOrderContext equityOrderContext) {
        TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(equityDollarOrderDuxo.eventLogger, OrderFormStep.ORDER_CHECK_ACTION, equityOrderContext.toOrderPayload(), equityOrderContext.getBrokerageAccountType(), EquityOrderSourceLogging.toMetaSource(((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) equityDollarOrderDuxo)).getFlowSource()), null, str, null, 80, null);
        return Unit.INSTANCE;
    }

    public final void onSubmitted() {
        withDataState(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.onSubmitted$lambda$29(this.f$0, (EquityDollarOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSubmitted$lambda$29(EquityDollarOrderDuxo equityDollarOrderDuxo, EquityDollarOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EquityOrderEvent.Dollar orderSubmittedEvent = dataState.getOrderSubmittedEvent();
        if (orderSubmittedEvent != null) {
            equityDollarOrderDuxo.submit(orderSubmittedEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRetryWhen(Validator.Action.RetryWhen<? super EquityOrderContext> retryWhen) {
        this.retryWhenRelay.accept(Optional3.asOptional(retryWhen));
    }

    public final void validateAndReviewOrder() {
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.REVIEW_EQUITY_SWIPE_TO_SUBMIT, null, null, null, 14, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295621(null), 3, null);
        EquityOrderContext equityOrderContext = getStateFlow().getValue().getEquityOrderContext();
        if (equityOrderContext != null) {
            ValidateAndReviewEquityOrder.validateAndReviewEquityOrder(this, this.retryWhenRelay, equityOrderContext, ((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getFlowSource(), this.equityOrderCheckValidator, new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityDollarOrderDuxo.validateAndReviewOrder$lambda$30(this.f$0, (ValidationState) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityDollarOrderDuxo.validateAndReviewOrder$lambda$31(this.f$0, (EquityOrderEvent.OrderCheckEvent) obj);
                }
            }, (64 & 64) != 0 ? getLifecycleScope() : null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("EquityOrderContext null at validation"), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
        }
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$validateAndReviewOrder$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {597, 600, 601}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$validateAndReviewOrder$1 */
    static final class C295621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C295621(Continuation<? super C295621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        
            if (r8 == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EquityDollarOrderViewState equityDollarOrderViewState;
            EquityOrderContext equityOrderContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<EquityDollarOrderViewState> stateFlow = EquityDollarOrderDuxo.this.getStateFlow();
                EquityDollarOrderDuxo$validateAndReviewOrder$1$readyState$1 equityDollarOrderDuxo$validateAndReviewOrder$1$readyState$1 = new EquityDollarOrderDuxo$validateAndReviewOrder$1$readyState$1(null);
                this.label = 1;
                obj = FlowKt.first(stateFlow, equityDollarOrderDuxo$validateAndReviewOrder$1$readyState$1, this);
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
                    EquityDollarOrderDuxo.this.applyMutation(new AnonymousClass2((String) obj, null));
                    return Unit.INSTANCE;
                }
                equityDollarOrderViewState = (EquityDollarOrderViewState) this.L$0;
                ResultKt.throwOnFailure(obj);
                EquityOrderSummaryService idlOrderSummaryService = EquityDollarOrderDuxo.this.getIdlOrderSummaryService();
                equityOrderContext = equityDollarOrderViewState.getEquityOrderContext();
                if (equityOrderContext != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                DirectOrderRequestDraft orderRequestDraft = equityOrderContext.getOrderRequestDraft();
                TradingSession tradingSession = equityDollarOrderViewState.getTradingSession();
                MarketHours currentMarketHours = tradingSession != null ? tradingSession.getCurrentMarketHours() : null;
                if (currentMarketHours == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                boolean hasSalesTaxes = equityDollarOrderViewState.getHasSalesTaxes();
                this.L$0 = null;
                this.label = 3;
                obj = EquityOrderSummaryService2.getOrderSummary(idlOrderSummaryService, orderRequestDraft, currentMarketHours, hasSalesTaxes, this);
            }
            equityDollarOrderViewState = (EquityDollarOrderViewState) obj;
            StateFlow<Monitoring> state = EquityDollarOrderDuxo.this.summaryComponent.getMicrogramMonitor().getState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.L$0 = equityDollarOrderViewState;
            this.label = 2;
            if (FlowKt.first(state, anonymousClass1, this) != coroutine_suspended) {
                EquityOrderSummaryService idlOrderSummaryService2 = EquityDollarOrderDuxo.this.getIdlOrderSummaryService();
                equityOrderContext = equityDollarOrderViewState.getEquityOrderContext();
                if (equityOrderContext != null) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$validateAndReviewOrder$1$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$validateAndReviewOrder$1$1, reason: invalid class name */
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

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$validateAndReviewOrder$1$2", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$validateAndReviewOrder$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
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
            public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
                return ((AnonymousClass2) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, this.$summary, null, null, false, false, false, false, -134217729, 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAndReviewOrder$lambda$30(EquityDollarOrderDuxo equityDollarOrderDuxo, ValidationState validationState) {
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$validateAndReviewOrder$2$1(validationState, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAndReviewOrder$lambda$31(EquityDollarOrderDuxo equityDollarOrderDuxo, EquityOrderEvent.OrderCheckEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        equityDollarOrderDuxo.performanceLogger.abortMetric(PerformanceMetricEventData.Name.REVIEW_EQUITY_SWIPE_TO_SUBMIT, null);
        equityDollarOrderDuxo.submit(event);
        return Unit.INSTANCE;
    }

    public final void logReviewingReadyToSubmit() {
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.REVIEW_EQUITY_SWIPE_TO_SUBMIT, null, 2, null);
    }

    public final void refreshNbbo() {
        Single<Response<ApiNbboSummary>> singleDoOnSubscribe = this.nbboSummaryStore.refresh(((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId()).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.refreshNbbo.1

            /* compiled from: EquityDollarOrderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$refreshNbbo$1$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$refreshNbbo$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
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
                public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
                    return ((AnonymousClass1) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, true, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -17, 3, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                EquityDollarOrderDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.refreshNbbo$lambda$32(this.f$0, (Response) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshNbbo$lambda$32(EquityDollarOrderDuxo equityDollarOrderDuxo, Response response) {
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$refreshNbbo$2$1(null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setQuantityAndValidate$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setQuantityAndValidate$1 */
    static final class C295591 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C295591(Continuation<? super C295591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295591 c295591 = new C295591(continuation);
            c295591.L$0 = obj;
            return c295591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295591) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -5, 3, null);
        }
    }

    public final void setQuantityAndValidate(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        applyMutation(new C295591(null));
        submitConvertToShareQuantityAmount(quantity);
    }

    public static /* synthetic */ Job cancelPendingCryptoOrders$default(EquityDollarOrderDuxo equityDollarOrderDuxo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return equityDollarOrderDuxo.cancelPendingCryptoOrders(j);
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$cancelPendingCryptoOrders$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {678}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$cancelPendingCryptoOrders$1 */
    static final class C295311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $minTimeInFlight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295311(long j, Continuation<? super C295311> continuation) {
            super(2, continuation);
            this.$minTimeInFlight = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295311(this.$minTimeInFlight, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityOrderCheckValidator equityOrderCheckValidator = EquityDollarOrderDuxo.this.equityOrderCheckValidator;
                long j = this.$minTimeInFlight;
                final EquityDollarOrderDuxo equityDollarOrderDuxo = EquityDollarOrderDuxo.this;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$cancelPendingCryptoOrders$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityDollarOrderDuxo.C295311.invokeSuspend$lambda$0(equityDollarOrderDuxo, ((Boolean) obj2).booleanValue());
                    }
                };
                final EquityDollarOrderDuxo equityDollarOrderDuxo2 = EquityDollarOrderDuxo.this;
                Function1 function12 = new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$cancelPendingCryptoOrders$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EquityDollarOrderDuxo.C295311.invokeSuspend$lambda$1(equityDollarOrderDuxo2, (EquityOrderEvent) obj2);
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
        public static final Unit invokeSuspend$lambda$0(EquityDollarOrderDuxo equityDollarOrderDuxo, boolean z) {
            equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$cancelPendingCryptoOrders$1$1$1(z, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(EquityDollarOrderDuxo equityDollarOrderDuxo, EquityOrderEvent equityOrderEvent) {
            Intrinsics.checkNotNull(equityOrderEvent, "null cannot be cast to non-null type com.robinhood.android.equity.validation.event.EquityOrderEvent.Dollar");
            equityDollarOrderDuxo.submit((EquityOrderEvent.Dollar) equityOrderEvent);
            return Unit.INSTANCE;
        }
    }

    public final Job cancelPendingCryptoOrders(long minTimeInFlight) {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295311(minTimeInFlight, null), 3, null);
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$sellAll$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$sellAll$1 */
    static final class C295561 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        final /* synthetic */ boolean $shouldValidate;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityDollarOrderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295561(boolean z, EquityDollarOrderDuxo equityDollarOrderDuxo, Continuation<? super C295561> continuation) {
            super(2, continuation);
            this.$shouldValidate = z;
            this.this$0 = equityDollarOrderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295561 c295561 = new C295561(this.$shouldValidate, this.this$0, continuation);
            c295561.L$0 = obj;
            return c295561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295561) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityDollarOrderDataState equityDollarOrderDataState = (EquityDollarOrderDataState) this.L$0;
            final Position position = equityDollarOrderDataState.getPosition();
            if (position == null) {
                return equityDollarOrderDataState;
            }
            if (this.$shouldValidate) {
                this.this$0.setRetryWhen(new Validator.Action.RetryWhen(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$sellAll$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(EquityDollarOrderDuxo.C295561.invokeSuspend$lambda$0(position, (EquityOrderContext) obj2));
                    }
                }));
            }
            return EquityDollarOrderDataState.copy$default(equityDollarOrderDataState, null, new OrderRequest2.ShareQuantity(position.getClosableQuantity()), null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -7, 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(Position position, EquityOrderContext equityOrderContext) {
            return Intrinsics.areEqual(equityOrderContext.getQuantity(), position.getClosableQuantity());
        }
    }

    public static /* synthetic */ void sellAll$default(EquityDollarOrderDuxo equityDollarOrderDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        equityDollarOrderDuxo.sellAll(z);
    }

    public final void sellAll(boolean shouldValidate) {
        applyMutation(new C295561(shouldValidate, this, null));
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setReviewingState$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setReviewingState$1 */
    static final class C295601 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        final /* synthetic */ boolean $reviewing;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295601(boolean z, Continuation<? super C295601> continuation) {
            super(2, continuation);
            this.$reviewing = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295601 c295601 = new C295601(this.$reviewing, continuation);
            c295601.L$0 = obj;
            return c295601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295601) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ValidationState validationState;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityDollarOrderDataState equityDollarOrderDataState = (EquityDollarOrderDataState) this.L$0;
            if (this.$reviewing) {
                validationState = ValidationState.Validated.INSTANCE;
            } else {
                validationState = ValidationState.Initial.INSTANCE;
            }
            return EquityDollarOrderDataState.copy$default(equityDollarOrderDataState, null, null, null, validationState, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -9, 3, null);
        }
    }

    public final void setReviewingState(boolean reviewing) {
        applyMutation(new C295601(reviewing, null));
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$recordSilentAlert$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$recordSilentAlert$1 */
    static final class C295541 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        final /* synthetic */ GenericOrderCheckAction $action;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295541(GenericOrderCheckAction genericOrderCheckAction, Continuation<? super C295541> continuation) {
            super(2, continuation);
            this.$action = genericOrderCheckAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295541 c295541 = new C295541(this.$action, continuation);
            c295541.L$0 = obj;
            return c295541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295541) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityDollarOrderDataState equityDollarOrderDataState = (EquityDollarOrderDataState) this.L$0;
            return EquityDollarOrderDataState.copy$default(equityDollarOrderDataState, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, CollectionsKt.plus((Collection<? extends GenericOrderCheckAction>) equityDollarOrderDataState.getSilentActionsTaken(), this.$action), null, false, false, false, false, -268435457, 3, null);
        }
    }

    public final void recordSilentAlert(GenericOrderCheckAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        applyMutation(new C295541(action, null));
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$overrideToExecuteInMarketHoursOnlyAndValidate$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$overrideToExecuteInMarketHoursOnlyAndValidate$1 */
    static final class C295531 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C295531(Continuation<? super C295531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295531 c295531 = new C295531(continuation);
            c295531.L$0 = obj;
            return c295531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295531) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, true, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -131073, 3, null);
        }
    }

    public final void overrideToExecuteInMarketHoursOnlyAndValidate() {
        applyMutation(new C295531(null));
        setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityDollarOrderDuxo.overrideToExecuteInMarketHoursOnlyAndValidate$lambda$33((EquityOrderContext) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overrideToExecuteInMarketHoursOnlyAndValidate$lambda$33(EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOnlyRegularHours();
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$overrideFlipIpoAccessSharesAndValidate$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$overrideFlipIpoAccessSharesAndValidate$1 */
    static final class C295521 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C295521(Continuation<? super C295521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295521 c295521 = new C295521(continuation);
            c295521.L$0 = obj;
            return c295521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295521) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, true, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -524289, 3, null);
        }
    }

    public final void overrideFlipIpoAccessSharesAndValidate() {
        applyMutation(new C295521(null));
        setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityDollarOrderDuxo.overrideFlipIpoAccessSharesAndValidate$lambda$34((EquityOrderContext) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overrideFlipIpoAccessSharesAndValidate$lambda$34(EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOverrideFlipIpoAccessShares();
    }

    public final void appendOverridesAndValidate(final List<String> overridesToAppend) {
        Intrinsics.checkNotNullParameter(overridesToAppend, "overridesToAppend");
        Single singleFirstOrError = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo.appendOverridesAndValidate.1
            @Override // io.reactivex.functions.Function
            public final List<String> apply(EquityDollarOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCheckOverrides();
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.appendOverridesAndValidate$lambda$36(overridesToAppend, this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendOverridesAndValidate$lambda$36(List list, EquityDollarOrderDuxo equityDollarOrderDuxo, List list2) {
        Intrinsics.checkNotNull(list2);
        final List listPlus = CollectionsKt.plus((Collection) list2, (Iterable) list);
        equityDollarOrderDuxo.applyMutation(new EquityDollarOrderDuxo$appendOverridesAndValidate$2$1(listPlus, null));
        equityDollarOrderDuxo.setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityDollarOrderDuxo.appendOverridesAndValidate$lambda$36$lambda$35(listPlus, (EquityOrderContext) obj));
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean appendOverridesAndValidate$lambda$36$lambda$35(List list, EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getCheckOverrides(), list);
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setDollarAmountAndValidate$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setDollarAmountAndValidate$1 */
    static final class C295581 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        final /* synthetic */ Money $dollarAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295581(Money money, Continuation<? super C295581> continuation) {
            super(2, continuation);
            this.$dollarAmount = money;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295581 c295581 = new C295581(this.$dollarAmount, continuation);
            c295581.L$0 = obj;
            return c295581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295581) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, new OrderRequest2.DollarAmount(this.$dollarAmount), null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -7, 3, null);
        }
    }

    public final void setDollarAmountAndValidate(final Money dollarAmount) {
        Intrinsics.checkNotNullParameter(dollarAmount, "dollarAmount");
        applyMutation(new C295581(dollarAmount, null));
        setRetryWhen(new Validator.Action.RetryWhen<>(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EquityDollarOrderDuxo.setDollarAmountAndValidate$lambda$37(dollarAmount, (EquityOrderContext) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDollarAmountAndValidate$lambda$37(Money money, EquityOrderContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDollarBasedAmount(), money);
    }

    public final void logQuickTradeTap(List<Money> quickTradeAmounts, Money selectedQuickTradeAmount) {
        Intrinsics.checkNotNullParameter(quickTradeAmounts, "quickTradeAmounts");
        Intrinsics.checkNotNullParameter(selectedQuickTradeAmount, "selectedQuickTradeAmount");
        AnalyticsLogger analyticsLogger = this.analytics;
        String strGroupButtonTitle = groupButtonTitle(quickTradeAmounts);
        String plainString = Money3.getBigDecimalCompat(selectedQuickTradeAmount).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, strGroupButtonTitle, plainString, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final void logQuickTradeSellAllTap(List<Money> quickTradeAmounts) {
        Intrinsics.checkNotNullParameter(quickTradeAmounts, "quickTradeAmounts");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, groupButtonTitle(quickTradeAmounts), AnalyticsStrings.BUTTON_QUICK_TRADE_SELL_ALL, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final EquityOrderEvent.Dollar validateUserInputs$feature_trade_equity_externalDebug(char[] amountCharArray, KeyEvent keyEvent) {
        BigDecimal number;
        Intrinsics.checkNotNullParameter(amountCharArray, "amountCharArray");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (KeyEvents2.isDigit(keyEvent) && (number = CharArrays.toNumber(ArraysKt.plus(amountCharArray, keyEvent.getNumber()))) != null && number.compareTo(MAX_AMOUNT) > 0) {
            return new EquityOrderEvent.Dollar.InputErrorEvent(StringResource.INSTANCE.invoke(C29365R.string.order_create_fractional_input_error_max_value, new Object[0]));
        }
        if (KeyEvents2.isDot(keyEvent) && BigDecimals7.isZero(CharArrays.toNumber(amountCharArray))) {
            return new EquityOrderEvent.Dollar.InputErrorEvent(StringResource.INSTANCE.invoke(C29365R.string.order_create_fractional_input_error_below_one_dollar, new Object[0]));
        }
        if (!KeyEvents2.isDot(keyEvent) || CharArrays.isNumber(ArraysKt.plus(amountCharArray, keyEvent.getNumber()))) {
            return null;
        }
        return new EquityOrderEvent.Dollar.InputErrorEvent(null);
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$consumeKeyEvent$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$consumeKeyEvent$1 */
    static final class C295321 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295321(KeyEvent keyEvent, Continuation<? super C295321> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C295321 c295321 = EquityDollarOrderDuxo.this.new C295321(this.$keyEvent, continuation);
            c295321.L$0 = obj;
            return c295321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
            return ((C295321) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            char[] initial_state;
            BigDecimal number;
            Money money;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityDollarOrderDataState equityDollarOrderDataState = (EquityDollarOrderDataState) this.L$0;
            EquityOrderEvent.Dollar dollarValidateUserInputs$feature_trade_equity_externalDebug = EquityDollarOrderDuxo.this.validateUserInputs$feature_trade_equity_externalDebug(equityDollarOrderDataState.getAmountCharArray(), this.$keyEvent);
            if (dollarValidateUserInputs$feature_trade_equity_externalDebug != null) {
                EquityDollarOrderDuxo.this.submit(dollarValidateUserInputs$feature_trade_equity_externalDebug);
                return EquityDollarOrderDataState.copy$default(equityDollarOrderDataState, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -1, 3, null);
            }
            if (KeyEvents2.isDelete(this.$keyEvent)) {
                initial_state = equityDollarOrderDataState.getAmountCharArray().length > 2 ? EquityDollarOrderDuxo.this.format(CollectionsKt.toCharArray(ArraysKt.dropLast(equityDollarOrderDataState.getAmountCharArray(), 1))) : EquityDollarOrderDuxo.INSTANCE.getINITIAL_STATE();
            } else if (KeyEvents2.isDigit(this.$keyEvent) || KeyEvents2.isDot(this.$keyEvent)) {
                initial_state = EquityDollarOrderDuxo.this.format(ArraysKt.plus(equityDollarOrderDataState.getAmountCharArray(), this.$keyEvent.getNumber()));
                if (initial_state == null) {
                    initial_state = EquityDollarOrderDuxo.INSTANCE.getINITIAL_STATE();
                }
            } else {
                initial_state = null;
            }
            char[] cArr = initial_state;
            return (cArr == null || (number = CharArrays.toNumber(cArr)) == null || (money = Money3.toMoney(number, Currencies.USD)) == null) ? equityDollarOrderDataState : EquityDollarOrderDataState.copy$default(equityDollarOrderDataState, null, new OrderRequest2.DollarAmount(money), cArr, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -7, 3, null);
        }
    }

    public final void consumeKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C295321(keyEvent, null));
    }

    public final void setAccountNumber(String accountNumber, boolean checkForceSuitability, EquityOrderSide side) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(side, "side");
        if (checkForceSuitability) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C295571(accountNumber, side, null), 3, null);
        } else {
            this.instrumentAccountSwitcherStore.setActiveAccountNumber(accountNumber);
        }
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setAccountNumber$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {840, 842}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$setAccountNumber$1 */
    static final class C295571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ EquityOrderSide $side;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C295571(String str, EquityOrderSide equityOrderSide, Continuation<? super C295571> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$side = equityOrderSide;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295571(this.$accountNumber, this.$side, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r6 == r0) goto L15;
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
                SuitabilityStore suitabilityStore = EquityDollarOrderDuxo.this.suitabilityStore;
                String str = this.$accountNumber;
                EquityOrderSide equityOrderSide = this.$side;
                this.label = 1;
                obj = suitabilityStore.shouldForceSuitability(str, equityOrderSide, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) ((Tuples2) obj).getFirst()).booleanValue()) {
                    EquityDollarOrderDuxo.this.instrumentAccountSwitcherStore.setActiveAccountNumber(this.$accountNumber);
                } else {
                    EquityDollarOrderDuxo.this.submit(new EquityOrderEvent.CheckForceSuitabilityOnAccountSwitchedEvent(this.$accountNumber));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
            obj = FlowKt.first((Flow) obj, this);
        }
    }

    public final void refreshAccountSwitcher() {
        this.accountSwitcherRefreshSubject.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final char[] format(char[] charArray) {
        char[] charArray2;
        List<char[]> listSplitByDecimalSeparator = CharArrays.splitByDecimalSeparator(CharArrays.dropChars(charArray, TickerInputView.CURRENCY_SYMBOL), '.');
        if (listSplitByDecimalSeparator.isEmpty()) {
            return null;
        }
        BigDecimal number = CharArrays.toNumber(listSplitByDecimalSeparator.get(0));
        if (number == null) {
            charArray2 = new char[0];
        } else {
            String str = FORMATTER.format(number);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            charArray2 = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        }
        if (listSplitByDecimalSeparator.size() == 1) {
            return ArraysKt.plus(new char[]{TickerInputView.CURRENCY_SYMBOL}, charArray2);
        }
        if (listSplitByDecimalSeparator.size() != 2) {
            return null;
        }
        return ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(new char[]{TickerInputView.CURRENCY_SYMBOL}, charArray2), '.'), ArraysKt.take(listSplitByDecimalSeparator.get(1), FORMATTER.getMaximumFractionDigits()));
    }

    private final void logQuickTradeAmountsAppear(ApiQuickTradeAmounts quickTradeAmounts) {
        List<Money> buy_amounts;
        int i = WhenMappings.$EnumSwitchMapping$0[((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSide().ordinal()];
        if (i == 1) {
            buy_amounts = quickTradeAmounts.getBuy_amounts();
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("dollar short orders not supported");
                }
                throw new NoWhenBranchMatchedException();
            }
            buy_amounts = quickTradeAmounts.getSell_amounts();
        }
        for (Money money : buy_amounts) {
            AnalyticsLogger analyticsLogger = this.analytics;
            String strGroupButtonTitle = groupButtonTitle(buy_amounts);
            String plainString = Money3.getBigDecimalCompat(money).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analyticsLogger, strGroupButtonTitle, plainString, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, groupButtonTitle(buy_amounts), AnalyticsStrings.BUTTON_QUICK_TRADE_SELL_ALL, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    private final String groupButtonTitle(List<Money> quickTradeAmountsForSide) {
        String str;
        StringBuilder sb = new StringBuilder("qta_");
        int i = WhenMappings.$EnumSwitchMapping$0[((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSide().ordinal()];
        if (i == 1) {
            str = "buy_";
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("dollar short orders not supported");
            }
            str = "sell_";
        }
        sb.append(str);
        sb.append(CollectionsKt.joinToString$default(quickTradeAmountsForSide, "_", null, null, 0, null, new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.groupButtonTitle$lambda$39((Money) obj);
            }
        }, 30, null));
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence groupButtonTitle$lambda$39(Money quickTradeAmount) {
        Intrinsics.checkNotNullParameter(quickTradeAmount, "quickTradeAmount");
        String plainString = Money3.getBigDecimalCompat(quickTradeAmount).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return plainString;
    }

    public final void setConfiguration$feature_trade_equity_externalDebug(DollarBased orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        applyMutation(new EquityDollarOrderDuxo$setConfiguration$1(orderConfiguration, null));
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$markBuySellOrderOnboardingSeen$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {932}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$markBuySellOrderOnboardingSeen$1 */
    static final class C295341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295341(Continuation<? super C295341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BuySellOrderOnboardingStore buySellOrderOnboardingStore = EquityDollarOrderDuxo.this.buySellOrderOnboardingStore;
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
            EquityDollarOrderDuxo.this.buySellOrderOnboardingSeenPref.set(true);
            return Unit.INSTANCE;
        }
    }

    public final void markBuySellOrderOnboardingSeen() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295341(null), 3, null);
    }

    private final void fetchBuySellOrderOnboarding() {
        if (this.buySellOrderOnboardingSeenPref.get()) {
            return;
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.buySellOrderOnboardingStore.fetchBuySellOrderOnboarding(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.fetchBuySellOrderOnboarding$lambda$40(this.f$0, (ApiBuySellOrderOnboardingResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchBuySellOrderOnboarding$lambda$40(EquityDollarOrderDuxo equityDollarOrderDuxo, ApiBuySellOrderOnboardingResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.getHas_seen()) {
            equityDollarOrderDuxo.submit(new EquityOrderEvent.BuySellOrderOnboardingEvent(response));
        } else {
            equityDollarOrderDuxo.buySellOrderOnboardingSeenPref.set(true);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: fetchTwentyFourHourMarketOnboardingBottomSheet$feature_trade_equity_externalDebug */
    public final void m2496x39a0682e(Observable<String> selectedAccountNumberStream) {
        Intrinsics.checkNotNullParameter(selectedAccountNumberStream, "selectedAccountNumberStream");
        if (this.hasShownAdtOnboardingBottomSheetPref.get()) {
            return;
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.twentyFourHourMarketOnboardingBottomSheetManager.fetchTwentyFourHourMarketOnboardingBottomSheetId(selectedAccountNumberStream, ((EquityDollarOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.fetchTwentyFourHourMarketOnboardingBottomSheet$lambda$42(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchTwentyFourHourMarketOnboardingBottomSheet$lambda$42(final EquityDollarOrderDuxo equityDollarOrderDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final String str = (String) tuples2.component1();
        final Account account = (Account) tuples2.component2();
        equityDollarOrderDuxo.withDataState(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.m2495x9c1c6b15(this.f$0, str, account, (EquityDollarOrderDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchTwentyFourHourMarketOnboardingBottomSheet$lambda$42$lambda$41 */
    public static final Unit m2495x9c1c6b15(EquityDollarOrderDuxo equityDollarOrderDuxo, String str, Account account, EquityDollarOrderDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        EquityOrderContext equityOrderContext = state.getEquityOrderContext();
        if ((equityOrderContext != null ? equityOrderContext.getMarketHours() : null) != OrderMarketHours.ALL_DAY_HOURS) {
            equityDollarOrderDuxo.submit(new EquityOrderEvent.TwentyFourHourMarketOnboardingBottomSheetEvent(str, account.getAccountNumber(), state.getQuantityOrAmount()));
        }
        return Unit.INSTANCE;
    }

    public final void markAdtBottomSheetSeen() {
        BaseDuxos.handleAdtSheetSeen(this, this.equityTradingSeenStatusStore, this.hasShownAdtOnboardingBottomSheetPref);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertToShareQuantity$lambda$43(EquityDollarOrderDuxo equityDollarOrderDuxo, EquityDollarOrderDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EquityOrderEvent.Dollar convertToSharesEvent = it.getConvertToSharesEvent();
        if (convertToSharesEvent != null) {
            equityDollarOrderDuxo.submit(convertToSharesEvent);
        }
        return Unit.INSTANCE;
    }

    public final void convertToShareQuantity() {
        withDataState(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.convertToShareQuantity$lambda$43(this.f$0, (EquityDollarOrderDataState) obj);
            }
        });
    }

    public final void submitConvertToShareQuantityAmount(final BigDecimal shareAmount) {
        Intrinsics.checkNotNullParameter(shareAmount, "shareAmount");
        withDataState(new Function1() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityDollarOrderDuxo.submitConvertToShareQuantityAmount$lambda$45(shareAmount, this, (EquityDollarOrderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitConvertToShareQuantityAmount$lambda$45(BigDecimal bigDecimal, EquityDollarOrderDuxo equityDollarOrderDuxo, EquityDollarOrderDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        EquityOrderEvent.Dollar convertToSharesAmountEvent = state.getConvertToSharesAmountEvent(bigDecimal);
        if (convertToSharesAmountEvent != null) {
            equityDollarOrderDuxo.submit(convertToSharesAmountEvent);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$dismissTradingSessionChangeAlert$1", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {991}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$dismissTradingSessionChangeAlert$1 */
    static final class C295331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295331(Continuation<? super C295331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderDuxo.this.new C295331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C295331 c295331;
            Object objM22646determineCurrentSessionConfigurationyxL6bBk$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradingSessionChangedStore equityTradingSessionChangedStore = EquityDollarOrderDuxo.this.equityTradingSessionChangedStore;
                Companion companion = EquityDollarOrderDuxo.INSTANCE;
                UUID instrumentId = ((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getInstrumentId();
                EquityOrderSide side = ((EquityDollarOrderFragment.Args) companion.getArgs((HasSavedState) EquityDollarOrderDuxo.this)).getSide();
                DollarBased configuration = EquityDollarOrderDuxo.this.getStateFlow().getValue().getConfiguration();
                this.label = 1;
                c295331 = this;
                objM22646determineCurrentSessionConfigurationyxL6bBk$default = EquityTradingSessionChangedStore.m22646determineCurrentSessionConfigurationyxL6bBk$default(equityTradingSessionChangedStore, instrumentId, side, configuration, false, c295331, 8, null);
                if (objM22646determineCurrentSessionConfigurationyxL6bBk$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22646determineCurrentSessionConfigurationyxL6bBk$default = ((Result) obj).getValue();
                c295331 = this;
            }
            EquityDollarOrderDuxo equityDollarOrderDuxo = EquityDollarOrderDuxo.this;
            if (Result.m28553exceptionOrNullimpl(objM22646determineCurrentSessionConfigurationyxL6bBk$default) == null) {
                DirectOrder directOrder = (DirectOrder) objM22646determineCurrentSessionConfigurationyxL6bBk$default;
                if (directOrder instanceof DollarBased) {
                    equityDollarOrderDuxo.setConfiguration$feature_trade_equity_externalDebug((DollarBased) directOrder);
                } else if (directOrder != null) {
                    equityDollarOrderDuxo.submit(new EquityOrderEvent.ChangeOrderConfiguration(directOrder));
                }
            } else {
                equityDollarOrderDuxo.submit(EquityOrderEvent.Exit.INSTANCE);
            }
            EquityDollarOrderDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityDollarOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$dismissTradingSessionChangeAlert$1$3", m3645f = "EquityDollarOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderDuxo$dismissTradingSessionChangeAlert$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<EquityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState>, Object> {
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
            public final Object invoke(EquityDollarOrderDataState equityDollarOrderDataState, Continuation<? super EquityDollarOrderDataState> continuation) {
                return ((AnonymousClass3) create(equityDollarOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EquityDollarOrderDataState.copy$default((EquityDollarOrderDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, false, null, false, false, null, null, null, null, null, false, false, false, false, -67108865, 3, null);
            }
        }
    }

    public final void dismissTradingSessionChangeAlert() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295331(null), 3, null);
    }

    public static /* synthetic */ void startLimitOrderFlow$default(EquityDollarOrderDuxo equityDollarOrderDuxo, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, OrderMarketHours orderMarketHours, OrderTimeInForce orderTimeInForce, int i, Object obj) {
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
        equityDollarOrderDuxo.startLimitOrderFlow(str, bigDecimal, bigDecimal2, orderMarketHours, orderTimeInForce);
    }

    public final void startLimitOrderFlow(String accountNumber, BigDecimal shares, BigDecimal limitPrice, OrderMarketHours tradingSession, OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        submit(new EquityOrderEvent.ChangeOrderConfiguration(new AdvancedOrder.LimitNew(accountNumber, shares, limitPrice, timeInForce, tradingSession, false)));
    }

    /* compiled from: EquityDollarOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Args;", "<init>", "()V", "INITIAL_STATE", "", "getINITIAL_STATE", "()[C", "MAX_AMOUNT", "Ljava/math/BigDecimal;", "getMAX_AMOUNT", "()Ljava/math/BigDecimal;", "FORMATTER", "Ljava/text/NumberFormat;", "getFORMATTER", "()Ljava/text/NumberFormat;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EquityDollarOrderDuxo, EquityDollarOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityDollarOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EquityDollarOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityDollarOrderFragment.Args getArgs(EquityDollarOrderDuxo equityDollarOrderDuxo) {
            return (EquityDollarOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, equityDollarOrderDuxo);
        }

        public final char[] getINITIAL_STATE() {
            return EquityDollarOrderDuxo.INITIAL_STATE;
        }

        public final BigDecimal getMAX_AMOUNT() {
            return EquityDollarOrderDuxo.MAX_AMOUNT;
        }

        public final NumberFormat getFORMATTER() {
            return EquityDollarOrderDuxo.FORMATTER;
        }
    }

    static {
        char[] charArray = "$0".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        INITIAL_STATE = charArray;
        MAX_AMOUNT = new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        FORMATTER = numberInstance;
    }
}
