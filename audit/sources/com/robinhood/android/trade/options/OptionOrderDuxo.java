package com.robinhood.android.trade.options;

import android.widget.Toast;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.options.accountswitcher.AccountSwitchers;
import com.robinhood.android.common.options.order.LimitPriceWithSource;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.order.OptionOrderContextFactory;
import com.robinhood.android.common.options.order.OptionOrderLimitPrice;
import com.robinhood.android.common.options.order.OptionOrderType2;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.experiments.TradeOptionsSduiAccountSwitcherExperiment;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.trade.options.OptionOrderDuxo;
import com.robinhood.android.trade.options.OptionOrderFragment;
import com.robinhood.android.trade.options.OptionOrderViewState;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarDataState;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarLoggingState;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarViewState3;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarViewState4;
import com.robinhood.android.trade.options.extensions.OptionOrderSource;
import com.robinhood.android.trade.options.profitloss.UserEnteredProfitLossParams;
import com.robinhood.android.trade.options.util.OptionOrderManager;
import com.robinhood.android.trade.options.validation.SufficientBuyingPowerCryptoFailure;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.librobinhood.data.prefs.OptionChainLandingPagePref;
import com.robinhood.librobinhood.data.prefs.OptionOrderMarketTooltipPref;
import com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore6;
import com.robinhood.librobinhood.data.store.OptionFeeStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionMarketabilityStore;
import com.robinhood.librobinhood.data.store.OptionOrderCheckStore;
import com.robinhood.librobinhood.data.store.OptionOrderDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionOrderNomenclatureStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionTradeSettingsStore;
import com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.ApiOptionOrderCheck;
import com.robinhood.models.api.ApiOptionOrderFeeRequest;
import com.robinhood.models.api.ApiOptionOrderPostBody;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.ApiOptionsBuyingPower;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPower;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPowerRequest;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.api.accountswitcher.ApiOptionsAccountSwitcherModel;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherType;
import com.robinhood.models.api.marketability.ApiOptionOrderMarketability;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionUnderlier;
import com.robinhood.models.p320db.OptionsBuyingPower;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher2;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionChainLandingPage;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderFee;
import com.robinhood.models.serverdriven.api.ApiGenericOrderCheckAction;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.serverdriven.utils.MoneyData;
import com.robinhood.models.util.Money;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionOrderCheckData;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.OrderCheckAbortReason;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import retrofit2.Response;
import rosetta.account.BrokerageAccountType;
import rosetta.option.MarketabilityType;
import rosetta.option.OptionOrderFormSource;
import rosetta.order.DefaultPriceSetting;

/* compiled from: OptionOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\b\u0007\u0018\u0000 è\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004é\u0001è\u0001Bó\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\b\b\u0001\u00107\u001a\u000206\u0012\u000e\b\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00020908\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ)\u0010G\u001a\u00020?2\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0002H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010K\u001a\u00020?2\u0006\u0010F\u001a\u00020\u00022\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u00010B2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bM\u0010NJ\u001b\u0010F\u001a\u00020O*\u00020O2\u0006\u0010F\u001a\u00020\u0002H\u0002¢\u0006\u0004\bF\u0010PJ\u000f\u0010Q\u001a\u00020?H\u0016¢\u0006\u0004\bQ\u0010AJ\u000f\u0010R\u001a\u00020?H\u0016¢\u0006\u0004\bR\u0010AJ\u000f\u0010S\u001a\u00020?H\u0016¢\u0006\u0004\bS\u0010AJ\r\u0010T\u001a\u00020?¢\u0006\u0004\bT\u0010AJ\r\u0010U\u001a\u00020?¢\u0006\u0004\bU\u0010AJ%\u0010X\u001a\u00020?2\u0006\u0010F\u001a\u00020\u00022\u0006\u0010J\u001a\u00020I2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ-\u0010^\u001a\u00020?2\u0006\u0010[\u001a\u00020Z2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010V¢\u0006\u0004\b^\u0010_J'\u0010c\u001a\u00020?2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020D0`2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010V¢\u0006\u0004\bc\u0010dJK\u0010o\u001a\u00020?2\u0006\u0010f\u001a\u00020e2\u0006\u0010E\u001a\u00020D2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010i\u001a\u0004\u0018\u00010V2\b\u0010j\u001a\u0004\u0018\u00010B2\u0006\u0010l\u001a\u00020k2\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020?¢\u0006\u0004\bq\u0010AJ\r\u0010r\u001a\u00020?¢\u0006\u0004\br\u0010AJ\u001f\u0010v\u001a\u00020?2\b\u0010s\u001a\u0004\u0018\u00010g2\u0006\u0010u\u001a\u00020t¢\u0006\u0004\bv\u0010wJ\u0017\u0010z\u001a\u00020?2\b\u0010y\u001a\u0004\u0018\u00010x¢\u0006\u0004\bz\u0010{J\u001d\u0010~\u001a\u00020?2\u0006\u0010}\u001a\u00020|2\u0006\u0010u\u001a\u00020t¢\u0006\u0004\b~\u0010\u007fJ\"\u0010\u0082\u0001\u001a\u00020?2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010u\u001a\u00020t¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001b\u0010\u0085\u0001\u001a\u00020?2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010g¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u000f\u0010\u0087\u0001\u001a\u00020?¢\u0006\u0005\b\u0087\u0001\u0010AJ3\u0010\u008d\u0001\u001a\u00020?2\b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u000e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020B0\u008a\u00012\u0007\u0010\u008c\u0001\u001a\u00020V¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020?¢\u0006\u0005\b\u008f\u0001\u0010AJ\u000f\u0010\u0090\u0001\u001a\u00020?¢\u0006\u0005\b\u0090\u0001\u0010AJ\u001a\u0010\u0093\u0001\u001a\u00020?2\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u000f\u0010\u0095\u0001\u001a\u00020?¢\u0006\u0005\b\u0095\u0001\u0010AJ\u0019\u0010\u0097\u0001\u001a\u00020?2\u0007\u0010\u0096\u0001\u001a\u00020t¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u000f\u0010\u0099\u0001\u001a\u00020?¢\u0006\u0005\b\u0099\u0001\u0010AJ\u001a\u0010\u009c\u0001\u001a\u00020?2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J,\u0010¡\u0001\u001a\u00020?2\u001a\u0010 \u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020?0\u009e\u0001¢\u0006\u0003\b\u009f\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u000f\u0010£\u0001\u001a\u00020?¢\u0006\u0005\b£\u0001\u0010AJ&\u0010¦\u0001\u001a\u00020?2\u0007\u0010¤\u0001\u001a\u00020V2\u000b\b\u0002\u0010¥\u0001\u001a\u0004\u0018\u00010V¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001b\u0010©\u0001\u001a\u00020?2\t\u0010¨\u0001\u001a\u0004\u0018\u00010g¢\u0006\u0006\b©\u0001\u0010\u0086\u0001J!\u0010«\u0001\u001a\u00020?2\u0006\u0010j\u001a\u00020V2\u0007\u0010ª\u0001\u001a\u00020m¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u000f\u0010\u00ad\u0001\u001a\u00020?¢\u0006\u0005\b\u00ad\u0001\u0010AJ\"\u0010°\u0001\u001a\u00020?2\u0006\u0010j\u001a\u00020V2\b\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0019\u0010²\u0001\u001a\u00020?2\u0007\u0010\u008c\u0001\u001a\u00020V¢\u0006\u0006\b²\u0001\u0010³\u0001J\u000f\u0010´\u0001\u001a\u00020?¢\u0006\u0005\b´\u0001\u0010AJ\u0019\u0010¶\u0001\u001a\u00020?2\u0007\u0010µ\u0001\u001a\u00020V¢\u0006\u0006\b¶\u0001\u0010³\u0001J\u0019\u0010·\u0001\u001a\u00020?2\u0007\u0010µ\u0001\u001a\u00020V¢\u0006\u0006\b·\u0001\u0010³\u0001J\u0019\u0010¸\u0001\u001a\u00020?2\u0007\u0010µ\u0001\u001a\u00020V¢\u0006\u0006\b¸\u0001\u0010³\u0001J\u001a\u0010»\u0001\u001a\u00020?2\b\u0010º\u0001\u001a\u00030¹\u0001¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001a\u0010¿\u0001\u001a\u00020?2\b\u0010¾\u0001\u001a\u00030½\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0019\u0010Â\u0001\u001a\u00020?2\u0007\u0010Á\u0001\u001a\u00020V¢\u0006\u0006\bÂ\u0001\u0010³\u0001J\u000f\u0010Ã\u0001\u001a\u00020?¢\u0006\u0005\bÃ\u0001\u0010AJ\u000f\u0010Ä\u0001\u001a\u00020?¢\u0006\u0005\bÄ\u0001\u0010AJ\u000f\u0010Å\u0001\u001a\u00020?¢\u0006\u0005\bÅ\u0001\u0010AJ\u001a\u0010Æ\u0001\u001a\u00020?2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u000f\u0010È\u0001\u001a\u00020?¢\u0006\u0005\bÈ\u0001\u0010AJ\u000f\u0010É\u0001\u001a\u00020?¢\u0006\u0005\bÉ\u0001\u0010AR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Ê\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ë\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Ì\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010Í\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010Î\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010Ï\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010Ð\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010Ñ\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010Ò\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010Ó\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010Ô\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010Õ\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010Ö\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010×\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010Ø\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010Ù\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010Ú\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010Û\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010Ü\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010Ý\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010Þ\u0001R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010ß\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010à\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010á\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010â\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010ã\u0001R\u001b\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010ä\u0001R\u001d\u0010<\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b<\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001¨\u0006ê\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/trade/options/OptionOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "cryptoPendingAndCancelStore", "Lcom/robinhood/analytics/TraderEventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "optionBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/OptionFeeStore;", "optionFeeStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketabilityStore;", "optionMarketabilityStore", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "optionOrderContextFactory", "Lcom/robinhood/librobinhood/data/store/OptionOrderCheckStore;", "optionOrderCheckStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "optionOrderManager", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "optionTradeSettingsStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/prefs/BooleanPreference;", "optionOrderMarketTooltipPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainLandingPage;", "optionChainLandingPagePref", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/OptionFeeStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionMarketabilityStore;Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;Lcom/robinhood/librobinhood/data/store/OptionOrderCheckStore;Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;Lcom/robinhood/android/trade/options/util/OptionOrderManager;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/EnumPreference;Landroidx/lifecycle/SavedStateHandle;)V", "", "initializeExperiments", "()V", "Ljava/util/UUID;", "requestId", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "optionOrderContext", "state", "logReview", "(Ljava/util/UUID;Lcom/robinhood/android/common/options/order/OptionOrderContext;Lcom/robinhood/android/trade/options/OptionOrderViewState;)V", "Lcom/robinhood/models/api/ApiOptionOrderCheck$ApiOptionOrderCheckAlert;", "failure", "logServerDrivenOrderCheckAlert", "(Lcom/robinhood/android/trade/options/OptionOrderViewState;Lcom/robinhood/models/api/ApiOptionOrderCheck$ApiOptionOrderCheckAlert;)V", "syncServerMarketability", "(Lcom/robinhood/android/common/options/order/OptionOrderContext;)Ljava/util/UUID;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "(Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;Lcom/robinhood/android/trade/options/OptionOrderViewState;)Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "onCreate", "onResume", "onStop", "validateAndReviewOrder", "logReviewClicked", "", "actionId", "logServerDrivenOrderCheckAlertTap", "(Lcom/robinhood/android/trade/options/OptionOrderViewState;Lcom/robinhood/models/api/ApiOptionOrderCheck$ApiOptionOrderCheckAlert;Ljava/lang/String;)V", "Lcom/robinhood/rosetta/eventlogging/OrderCheckAbortReason;", "abortReason", "alertType", "triggeredActionId", "skipAllChecksAndContinue", "(Lcom/robinhood/rosetta/eventlogging/OrderCheckAbortReason;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "action", "overrideNameForSkipAction", "handleFailureResolution", "(Lcom/robinhood/android/lib/trade/validation/Validator$Action;Ljava/lang/String;)V", "Lrosetta/account/BrokerageAccountType;", "analyticsAccountType", "Ljava/math/BigDecimal;", "userEnteredLimitPriceForAnalytics", "chainSymbol", "orderId", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "source", "Lrosetta/option/MarketabilityType;", "marketabilityType", "submit", "(Lrosetta/account/BrokerageAccountType;Lcom/robinhood/android/common/options/order/OptionOrderContext;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;Lrosetta/option/MarketabilityType;)V", "onSwipeToSubmitAnimationStart", "onSwipeToSubmitAnimationComplete", "shareQuantity", "", "editedByUser", "setQuantity", "(Ljava/math/BigDecimal;Z)V", "Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "newLimitPriceWithSource", "setLimitPrice", "(Lcom/robinhood/android/common/options/order/LimitPriceWithSource;)V", "Lcom/robinhood/models/db/OptionOrderType;", "optionOrderType", "setOptionOrderType", "(Lcom/robinhood/models/db/OptionOrderType;Z)V", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "setTimeInForce", "(Lcom/robinhood/models/db/OrderTimeInForce;Z)V", "stopPrice", "setStopPriceInStopLimitOrder", "(Ljava/math/BigDecimal;)V", "cancelPendingCryptoOrders", "Landroid/content/Context;", "context", "", "optionOrderRhIds", "accountNumber", "cancelBlockingOrders", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V", "clearCancelPendingCryptoState", "overrideDayTradeChecks", "Lcom/robinhood/models/db/OrderDirection;", "direction", "overrideDirection", "(Lcom/robinhood/models/db/OrderDirection;)V", "overrideDtbpChecks", "preserveUserInput", "setPreserveUserInput", "(Z)V", "clearOrderCheckOverride", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "formState", "setFormState", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "f", "runWithAnalytics", "(Lkotlin/jvm/functions/Function1;)V", "finishPerformanceLogging", "screenIdentifier", "buttonText", "logTapOptionOrderTypePicker", "(Ljava/lang/String;Ljava/lang/String;)V", "debouncedLimitPrice", "setDebouncedLimitPrice", "rosettaType", "logSingleLegMarketability", "(Ljava/lang/String;Lrosetta/option/MarketabilityType;)V", "logReviewingReadyToSubmit", "Lcom/robinhood/android/trade/options/OptionOrderViewState$UiMarketability;", "uiMarketability", "logMarketabilityUiChange", "(Ljava/lang/String;Lcom/robinhood/android/trade/options/OptionOrderViewState$UiMarketability;)V", "setAccountNumber", "(Ljava/lang/String;)V", "refreshAccountSwitcher", "value", "onBidDebugInputChanged", "onMarkDebugInputChanged", "onAskDebugInputChanged", "", "width", "onBidAskBarCanvasWidthUpdated", "(F)V", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;", "event", "onBidAskBarTouchEvent", "(Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarMotionEvent;)V", "newValue", "onStopTriggerPriceTextInputValueChange", "updateTotalCostRowCollapsedState", "requestFocusStopTriggerPrice", "onStopPriceFocused", "logTapTimeInForce", "(Lcom/robinhood/models/db/OrderTimeInForce;)V", "recordOptionsMarketTooltipSeen", "dismissOptionsMarketTooltip", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "Lcom/robinhood/analytics/TraderEventLogger;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/android/indexes/store/IndexStore;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "Lcom/robinhood/librobinhood/data/store/OptionFeeStore;", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/OptionMarketabilityStore;", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "Lcom/robinhood/librobinhood/data/store/OptionOrderCheckStore;", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "Lcom/robinhood/android/trade/options/util/OptionOrderManager;", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/prefs/EnumPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "SingleUnderlyingEquityContext", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderDuxo extends OldBaseDuxo<OptionOrderViewState> implements HasSavedState {
    public static final long OPTION_ORDER_CHECK_TIMEOUT_TIME = 5000;
    public static final long OPTION_ORDER_MULTI_LEG_MARKETABILITY_RESET_TIME = 2000;
    private final AccountProvider accountProvider;
    private final AnalyticsLogger analytics;
    private final Clock clock;
    private final CryptoPendingAndCancelStore cryptoPendingAndCancelStore;
    private final TraderEventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final IndexStore indexStore;
    private final MarketHoursStore marketHoursStore;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionsBuyingPowerStore optionBuyingPowerStore;
    private final EnumPreference<OptionChainLandingPage> optionChainLandingPagePref;
    private final OptionFeeStore optionFeeStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionMarketabilityStore optionMarketabilityStore;
    private final OptionOrderCheckStore optionOrderCheckStore;
    private final OptionOrderContextFactory optionOrderContextFactory;
    private final OptionOrderDiscoveryStore optionOrderDiscoveryStore;
    private final OptionOrderManager optionOrderManager;
    private final BooleanPreference optionOrderMarketTooltipPref;
    private final OptionOrderNomenclatureStore optionOrderNomenclatureStore;
    private final OptionOrderStore optionOrderStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionTradeSettingsStore optionTradeSettingsStore;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final PerformanceLogger performanceLogger;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<Experiment<SimpleVariant>> sdocImprovementExperiments = CollectionsKt.listOf((Object[]) new Experiment[]{Experiments.OptionsOrderPathMaxOrderSizeV2.INSTANCE, Experiments.OptionsOrderPathAmbiguousOrderDirection.INSTANCE, Experiments.OptionsOrderPathMarketTradingHours.INSTANCE, Experiments.OptionsOrderPathStopMarketTradingHours.INSTANCE, Experiments.OptionsOrderPathBidAskSpread.INSTANCE, Experiments.OptionsOrderPathNeccMultileg.INSTANCE, Experiments.OptionsOrderPathMaxOrderSizeV3.INSTANCE});

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOrderMeta.Source.values().length];
            try {
                iArr[OptionOrderMeta.Source.SOURCE_OPTION_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderMeta.Source.SOURCE_STRATEGY_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionOrderDuxo(AccountProvider accountProvider, AnalyticsLogger analytics, Clock clock, CryptoPendingAndCancelStore cryptoPendingAndCancelStore, TraderEventLogger eventLogger, ExperimentsStore experimentsStore, IndexStore indexStore, MarketHoursStore marketHoursStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionsBuyingPowerStore optionBuyingPowerStore, OptionFeeStore optionFeeStore, OptionMarketHoursStore optionMarketHoursStore, OptionMarketabilityStore optionMarketabilityStore, OptionOrderContextFactory optionOrderContextFactory, OptionOrderCheckStore optionOrderCheckStore, OptionOrderDiscoveryStore optionOrderDiscoveryStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionOrderManager optionOrderManager, OptionOrderStore optionOrderStore, OptionQuoteStore optionQuoteStore, OptionTradeSettingsStore optionTradeSettingsStore, PerformanceLogger performanceLogger, QuoteStore quoteStore, UserStore userStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, @OptionOrderMarketTooltipPref BooleanPreference optionOrderMarketTooltipPref, @OptionChainLandingPagePref EnumPreference<OptionChainLandingPage> optionChainLandingPagePref, SavedStateHandle savedStateHandle) {
        UiEvent uiEvent;
        UiEvent uiEvent2;
        OptionOrder optionOrder;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionBuyingPowerStore, "optionBuyingPowerStore");
        Intrinsics.checkNotNullParameter(optionFeeStore, "optionFeeStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionMarketabilityStore, "optionMarketabilityStore");
        Intrinsics.checkNotNullParameter(optionOrderContextFactory, "optionOrderContextFactory");
        Intrinsics.checkNotNullParameter(optionOrderCheckStore, "optionOrderCheckStore");
        Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
        Intrinsics.checkNotNullParameter(optionOrderManager, "optionOrderManager");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(optionOrderMarketTooltipPref, "optionOrderMarketTooltipPref");
        Intrinsics.checkNotNullParameter(optionChainLandingPagePref, "optionChainLandingPagePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        OptionOrderFormSource source = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getSource();
        OrderDirection directionOverride = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getOptionOrderBundle().getDirectionOverride();
        UiOptionOrder orderToReplace = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getOrderToReplace();
        UiEvent uiEvent3 = orderToReplace != null ? new UiEvent(orderToReplace) : null;
        BigDecimal prefilledQuantity = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getPrefilledQuantity();
        UiEvent uiEvent4 = prefilledQuantity != null ? new UiEvent(prefilledQuantity) : null;
        OptionOrderType prefilledOrderType = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getPrefilledOrderType();
        UiEvent uiEvent5 = prefilledOrderType != null ? new UiEvent(prefilledOrderType) : null;
        OrderTimeInForce prefilledTimeInForce = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getPrefilledTimeInForce();
        UiEvent uiEvent6 = prefilledTimeInForce != null ? new UiEvent(prefilledTimeInForce) : null;
        Unit unit = Unit.INSTANCE;
        UiEvent uiEvent7 = new UiEvent(unit);
        if (((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getShouldSetInitialFocusToLimitPrice()) {
            uiEvent = uiEvent7;
        } else {
            UiOptionOrder orderToReplace2 = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getOrderToReplace();
            OptionOrder optionOrder2 = orderToReplace2 != null ? orderToReplace2.getOptionOrder() : null;
            if (optionOrder2 == null || optionOrder2.getStopPrice() != null) {
                uiEvent = null;
            }
        }
        UiEvent uiEvent8 = new UiEvent(unit);
        if (((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getShouldSetInitialFocusToStopPrice()) {
            uiEvent2 = uiEvent8;
        } else {
            UiOptionOrder orderToReplace3 = ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getOrderToReplace();
            if (((orderToReplace3 == null || (optionOrder = orderToReplace3.getOptionOrder()) == null) ? null : optionOrder.getStopPrice()) == null) {
                uiEvent2 = null;
            }
        }
        super(new OptionOrderViewState(null, null, null, null, null, null, null, null, false, null, null, null, uiEvent, uiEvent2, uiEvent3, uiEvent4, uiEvent5, uiEvent6, false, false, false, null, false, null, null, 0, ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getOptionOrderBundle(), null, null, null, null, null, ((OptionOrderFragment.Args) companion.getArgs(savedStateHandle)).getOrderToReplace(), false, directionOverride, false, false, null, null, false, false, source, null, false, null, null, null, null, null, false, false, false, null, null, false, null, null, null, false, false, -67366913, 268434938, null), null, 2, null);
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.clock = clock;
        this.cryptoPendingAndCancelStore = cryptoPendingAndCancelStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.indexStore = indexStore;
        this.marketHoursStore = marketHoursStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionBuyingPowerStore = optionBuyingPowerStore;
        this.optionFeeStore = optionFeeStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionMarketabilityStore = optionMarketabilityStore;
        this.optionOrderContextFactory = optionOrderContextFactory;
        this.optionOrderCheckStore = optionOrderCheckStore;
        this.optionOrderDiscoveryStore = optionOrderDiscoveryStore;
        this.optionOrderNomenclatureStore = optionOrderNomenclatureStore;
        this.optionOrderManager = optionOrderManager;
        this.optionOrderStore = optionOrderStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionTradeSettingsStore = optionTradeSettingsStore;
        this.performanceLogger = performanceLogger;
        this.quoteStore = quoteStore;
        this.userStore = userStore;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.optionOrderMarketTooltipPref = optionOrderMarketTooltipPref;
        this.optionChainLandingPagePref = optionChainLandingPagePref;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderDuxo$SingleUnderlyingEquityContext;", "", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "equityInstrumentId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/db/OptionInstrument;Ljava/util/UUID;)V", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getEquityInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SingleUnderlyingEquityContext {
        public static final int $stable = 8;
        private final UUID equityInstrumentId;
        private final OptionInstrument optionInstrument;

        public static /* synthetic */ SingleUnderlyingEquityContext copy$default(SingleUnderlyingEquityContext singleUnderlyingEquityContext, OptionInstrument optionInstrument, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                optionInstrument = singleUnderlyingEquityContext.optionInstrument;
            }
            if ((i & 2) != 0) {
                uuid = singleUnderlyingEquityContext.equityInstrumentId;
            }
            return singleUnderlyingEquityContext.copy(optionInstrument, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionInstrument getOptionInstrument() {
            return this.optionInstrument;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getEquityInstrumentId() {
            return this.equityInstrumentId;
        }

        public final SingleUnderlyingEquityContext copy(OptionInstrument optionInstrument, UUID equityInstrumentId) {
            Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
            Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
            return new SingleUnderlyingEquityContext(optionInstrument, equityInstrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleUnderlyingEquityContext)) {
                return false;
            }
            SingleUnderlyingEquityContext singleUnderlyingEquityContext = (SingleUnderlyingEquityContext) other;
            return Intrinsics.areEqual(this.optionInstrument, singleUnderlyingEquityContext.optionInstrument) && Intrinsics.areEqual(this.equityInstrumentId, singleUnderlyingEquityContext.equityInstrumentId);
        }

        public int hashCode() {
            return (this.optionInstrument.hashCode() * 31) + this.equityInstrumentId.hashCode();
        }

        public String toString() {
            return "SingleUnderlyingEquityContext(optionInstrument=" + this.optionInstrument + ", equityInstrumentId=" + this.equityInstrumentId + ")";
        }

        public SingleUnderlyingEquityContext(OptionInstrument optionInstrument, UUID equityInstrumentId) {
            Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
            Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
            this.optionInstrument = optionInstrument;
            this.equityInstrumentId = equityInstrumentId;
        }

        public final OptionInstrument getOptionInstrument() {
            return this.optionInstrument;
        }

        public final UUID getEquityInstrumentId() {
            return this.equityInstrumentId;
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        PerformanceLogger performanceLogger = this.performanceLogger;
        PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.OPTION_ORDER;
        String string2 = ((OptionOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOptionOrderBundle().getOptionChainBundle().getOptionChainId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, null, null, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(null, null, false, string2, null, null, null, 119, null), null, null, null, null, null, null, null, null, 4087, null), 6, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$7(this.f$0, (User) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionOrderViewState) it).initialLoadAnalyticsData(this.this$0.clock));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$9(this.f$0, (OptionOrderViewState.OptionOrderInitialLoadAnalyticsData) obj);
            }
        });
        Observable<R> map2 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionOrderViewState) it).getOptionOrderContext());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onCreate$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableTimeout = ObservablesKt.filterIsPresent(map2).take(1L).timeout(1L, TimeUnit.MINUTES);
        Intrinsics.checkNotNullExpressionValue(observableTimeout, "timeout(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableTimeout, (LifecycleEvent) null, 1, (Object) null), null, new Consumer() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onCreate.5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                CrashReporter.Companion companion = CrashReporter.INSTANCE;
                Intrinsics.checkNotNull(th);
                CrashReporter.DefaultImpls.reportNonFatal$default(companion, th, false, null, 4, null);
            }
        }, null, 5, null);
        Observable<OptionOrderViewState> observableFilter = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onCreate.6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.shouldQueryServerDrivenMarketability(OptionOrderDuxo.this.clock);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable<R> map3 = observableFilter.map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                OptionOrderContext optionOrderContext = optionOrderViewState.getOptionOrderContext();
                return Optional3.asOptional(PairUtils.toNullable(Tuples4.m3642to(optionOrderContext != null ? OptionOrderContext.getApiOptionOrderPostBody$default(optionOrderContext, UUID.randomUUID().toString(), 0, null, optionOrderViewState.isInMaxOrderSizeImprovementExperiment(), null, 6, null) : null, Long.valueOf(optionOrderViewState.getOptionsValuationTradeFlowM1Variant().getMarketabilityDebounceRate()))));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onCreate$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable map4 = observableDistinctUntilChanged.debounce(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onCreate.8
            @Override // io.reactivex.functions.Function
            public final ObservableSource<Unit> apply(Tuples2<ApiOptionOrderPostBody, Long> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Observable.empty().delay(tuples2.component2().longValue(), TimeUnit.MILLISECONDS);
            }
        }).map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onCreate.9
            @Override // io.reactivex.functions.Function
            public final ApiOptionOrderPostBody apply(Tuples2<ApiOptionOrderPostBody, Long> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return tuples2.component1();
            }
        });
        final OptionMarketabilityStore optionMarketabilityStore = this.optionMarketabilityStore;
        Observable observableSwitchMapSingle = map4.switchMapSingle(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onCreate.10
            @Override // io.reactivex.functions.Function
            public final Single<ApiOptionOrderMarketability> apply(ApiOptionOrderPostBody p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionMarketabilityStore.getOptionOrderMarketability(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$13(this.f$0, (ApiOptionOrderMarketability) obj);
            }
        });
        Observable<R> map5 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$$inlined$mapDistinctNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionOrderViewState) it).debouncedMultiLegMarketability(this.this$0.clock));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onCreate$$inlined$mapDistinctNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map5).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableDebounce = observableDistinctUntilChanged2.debounce(2000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDebounce, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$16(this.f$0, (OptionOrderViewState.UiMarketability) obj);
            }
        });
        Observable<OptionOrderViewState> observableFilter2 = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onCreate.14
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShouldShowAccountSwitcher();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter2, "filter(...)");
        Observable observableDistinctUntilChanged3 = observableFilter2.map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionOrderViewState) it).getOptionsAccountSwitcherId();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        Observable observableSwitchMap = observableDistinctUntilChanged3.switchMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onCreate.16
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionsAccountSwitcher> apply(OptionsAccountSwitcherId it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionOrderDuxo.this.optionAccountSwitcherStore.getOptionsAccountSwitcherQuery().asObservable(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$19(this.f$0, (OptionsAccountSwitcher) obj);
            }
        });
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C2969418(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2969519(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2969620(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2969721(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(OptionOrderDuxo optionOrderDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$7$lambda$6(user, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onCreate$lambda$7$lambda$6(User user, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : user.getOrigin().getLocality(), (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(OptionOrderDuxo optionOrderDuxo, OptionOrderViewState.OptionOrderInitialLoadAnalyticsData optionOrderInitialLoadAnalyticsData) {
        String string2;
        String string3;
        String string4;
        String string5;
        MarketabilityType rosettaType;
        String chainTypeForLogging;
        OptionOrderViewState.Marketability marketability;
        OptionOrderViewState.Marketability.MarketabilityType marketabilityType;
        OptionOrder optionOrder;
        UUID id;
        BigDecimal askPriceForLogging;
        BigDecimal bidPriceForLogging;
        BrokerageAccountType analyticsAccountType = optionOrderInitialLoadAnalyticsData.getAnalyticsAccountType();
        OptionOrderContext optionOrderContext = optionOrderInitialLoadAnalyticsData.getOptionOrderContext();
        BigDecimal limitPrice = optionOrderInitialLoadAnalyticsData.getLimitPrice();
        OptionOrderViewState.UiMarketability singleLegMarketabilityForLogging = optionOrderInitialLoadAnalyticsData.getSingleLegMarketabilityForLogging();
        UUID uuidSyncServerMarketability = optionOrderDuxo.syncServerMarketability(optionOrderContext);
        TraderEventLogger traderEventLogger = optionOrderDuxo.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.INITIAL_LOAD;
        ApiOptionOrderRequest apiRequest = optionOrderContext.getApiRequest();
        OptionOrderContext.QuoteAggregation quoteAggregation = optionOrderContext.getPrices().getQuoteAggregation();
        if (quoteAggregation == null || (bidPriceForLogging = quoteAggregation.getBidPriceForLogging()) == null || (string2 = bidPriceForLogging.toString()) == null) {
            string2 = "";
        }
        OptionOrderContext.QuoteAggregation quoteAggregation2 = optionOrderContext.getPrices().getQuoteAggregation();
        if (quoteAggregation2 == null || (askPriceForLogging = quoteAggregation2.getAskPriceForLogging()) == null || (string3 = askPriceForLogging.toString()) == null) {
            string3 = "";
        }
        DefaultPriceSetting rosettaValue = OptionSettings.DefaultPricingSetting.INSTANCE.toRosettaValue(optionOrderContext.getPrices().getDefaultPricingType());
        if (limitPrice == null || (string4 = limitPrice.toString()) == null) {
            string4 = "";
        }
        Companion companion = INSTANCE;
        OptionOrderMeta.Source metaSource = OptionOrderSource.toMetaSource(((OptionOrderFragment.Args) companion.getArgs((HasSavedState) optionOrderDuxo)).getSource());
        String strategyCode = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) optionOrderDuxo)).getStrategyCode();
        String str = strategyCode == null ? "" : strategyCode;
        String symbol = optionOrderContext.getRequestContext().getOptionChain().getOptionChain().getSymbol();
        UiOptionOrder orderToReplace = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) optionOrderDuxo)).getOrderToReplace();
        if (orderToReplace == null || (optionOrder = orderToReplace.getOptionOrder()) == null || (id = optionOrder.getId()) == null || (string5 = id.toString()) == null) {
            string5 = "";
        }
        if (singleLegMarketabilityForLogging == null || (marketability = singleLegMarketabilityForLogging.getMarketability()) == null || (marketabilityType = marketability.getMarketabilityType()) == null || (rosettaType = marketabilityType.getRosettaType()) == null) {
            rosettaType = MarketabilityType.MARKETABILITY_UNSPECIFIED;
        }
        String string6 = uuidSyncServerMarketability != null ? uuidSyncServerMarketability.toString() : null;
        String str2 = string6 == null ? "" : string6;
        int size = optionOrderContext.getLegContexts().size();
        OptionChainDisplayMode chainDisplayModeForLogging = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) optionOrderDuxo)).getChainDisplayModeForLogging();
        traderEventLogger.logOptionOrderEvent(orderFormStep, apiRequest, new OptionOrderMeta(string2, string3, string4, metaSource, symbol, string5, null, null, size, null, null, null, null, rosettaType, null, null, rosettaValue, str2, null, str, null, null, null, null, analyticsAccountType, null, null, (chainDisplayModeForLogging == null || (chainTypeForLogging = chainDisplayModeForLogging.toChainTypeForLogging()) == null) ? "" : chainTypeForLogging, ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) optionOrderDuxo)).getOptionRelatedOrderData(), null, 653582016, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13(OptionOrderDuxo optionOrderDuxo, final ApiOptionOrderMarketability apiOptionOrderMarketability) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$13$lambda$12(apiOptionOrderMarketability, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onCreate$lambda$13$lambda$12(ApiOptionOrderMarketability apiOptionOrderMarketability, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : new OptionOrderViewState.Marketability(OptionOrderViewState.INSTANCE.toViewStateMarketability$feature_trade_options_externalDebug(apiOptionOrderMarketability.getMarketability()), apiOptionOrderMarketability.getMarketability_request_id()), ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$16(OptionOrderDuxo optionOrderDuxo, OptionOrderViewState.UiMarketability uiMarketability) {
        TraderEventLogger traderEventLogger = optionOrderDuxo.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CLEAR_STALE_DATA;
        Screen screen = new Screen(Screen.Name.OPTION_ORDER_FORM, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.OPTION_ORDER_MARKETABILITY_TAG, null, null, 6, null);
        String string2 = ((OptionOrderFragment.Args) INSTANCE.getArgs((HasSavedState) optionOrderDuxo)).getOrderUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        MarketabilityType rosettaType = uiMarketability.getMarketability().getMarketabilityType().getRosettaType();
        String requestId = uiMarketability.getMarketability().getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        EventLogger.DefaultImpls.logDisappear$default(traderEventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(null, null, rosettaType, string2, null, null, null, null, null, requestId, null, null, null, null, 15859, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), 8, null);
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$16$lambda$15((OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onCreate$lambda$16$lambda$15(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$19(OptionOrderDuxo optionOrderDuxo, final OptionsAccountSwitcher optionsAccountSwitcher) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onCreate$lambda$19$lambda$18(optionsAccountSwitcher, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onCreate$lambda$19$lambda$18(OptionsAccountSwitcher optionsAccountSwitcher, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : optionsAccountSwitcher, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18", m3645f = "OptionOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18 */
    static final class C2969418 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2969418(Continuation<? super C2969418> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDuxo.this.new C2969418(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2969418) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderViewState> statesFlow = OptionOrderDuxo.this.getStatesFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new C296822(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C296822<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C296822.this.emit(null, this);
                            }
                        }

                        public C296822(FlowCollector flowCollector) {
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
                                UUID indexUnderlyingId = ((OptionOrderViewState) obj).getIndexUnderlyingId();
                                if (indexUnderlyingId != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(indexUnderlyingId, anonymousClass1) == coroutine_suspended) {
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
                }), new C29681x24faf691(null, OptionOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionOrderDuxo.this, null);
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

        /* compiled from: OptionOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18$3", m3645f = "OptionOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<IndexValue, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionOrderDuxo optionOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IndexValue indexValue, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(indexValue, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final IndexValue indexValue = (IndexValue) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$18$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionOrderDuxo.C2969418.AnonymousClass3.invokeSuspend$lambda$0(indexValue, (OptionOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionOrderViewState invokeSuspend$lambda$0(IndexValue indexValue, OptionOrderViewState optionOrderViewState) {
                return optionOrderViewState.copy(((-2049) & 1) != 0 ? optionOrderViewState.account : null, ((-2049) & 2) != 0 ? optionOrderViewState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? optionOrderViewState.allAccounts : null, ((-2049) & 8) != 0 ? optionOrderViewState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? optionOrderViewState.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? optionOrderViewState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? optionOrderViewState.editedForm : false, ((-2049) & 512) != 0 ? optionOrderViewState.equityQuote : null, ((-2049) & 1024) != 0 ? optionOrderViewState.formState : null, ((-2049) & 2048) != 0 ? optionOrderViewState.indexValue : indexValue, ((-2049) & 4096) != 0 ? optionOrderViewState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? optionOrderViewState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? optionOrderViewState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? optionOrderViewState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? optionOrderViewState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? optionOrderViewState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? optionOrderViewState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? optionOrderViewState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? optionOrderViewState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? optionOrderViewState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? optionOrderViewState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? optionOrderViewState.marketHours : null, ((-2049) & 16777216) != 0 ? optionOrderViewState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? optionOrderViewState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? optionOrderViewState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? optionOrderViewState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? optionOrderViewState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? optionOrderViewState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? optionOrderViewState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? optionOrderViewState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? optionOrderViewState.orderToReplace : null, (268435455 & 2) != 0 ? optionOrderViewState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? optionOrderViewState.overrideDirection : null, (268435455 & 8) != 0 ? optionOrderViewState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? optionOrderViewState.preserveUserInput : false, (268435455 & 32) != 0 ? optionOrderViewState.quantity : null, (268435455 & 64) != 0 ? optionOrderViewState.retryWhenAction : null, (268435455 & 128) != 0 ? optionOrderViewState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? optionOrderViewState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? optionOrderViewState.source : null, (268435455 & 1024) != 0 ? optionOrderViewState.timeInForce : null, (268435455 & 2048) != 0 ? optionOrderViewState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? optionOrderViewState.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? optionOrderViewState.userInputPrices : null, (268435455 & 16384) != 0 ? optionOrderViewState.validationPendingRequest : null, (268435455 & 32768) != 0 ? optionOrderViewState.validationFailure : null, (268435455 & 65536) != 0 ? optionOrderViewState.validationSkippedChecks : null, (268435455 & 131072) != 0 ? optionOrderViewState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? optionOrderViewState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? optionOrderViewState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? optionOrderViewState.locality : null, (268435455 & 2097152) != 0 ? optionOrderViewState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? optionOrderViewState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? optionOrderViewState.tradingSession : null, (268435455 & 16777216) != 0 ? optionOrderViewState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? optionOrderViewState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? optionOrderViewState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? optionOrderViewState.withShortenedVolatilityPeriod : false);
            }
        }
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19", m3645f = "OptionOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19 */
    static final class C2969519 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2969519(Continuation<? super C2969519> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDuxo.this.new C2969519(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2969519) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderViewState> statesFlow = OptionOrderDuxo.this.getStatesFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<ApiOptionOrderFeeRequest>() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ApiOptionOrderFeeRequest> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new C296842(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C296842<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C296842.this.emit(null, this);
                            }
                        }

                        public C296842(FlowCollector flowCollector) {
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
                                ApiOptionOrderFeeRequest apiOptionOrderFeeRequest = ((OptionOrderViewState) obj).getApiOptionOrderFeeRequest();
                                if (apiOptionOrderFeeRequest != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(apiOptionOrderFeeRequest, anonymousClass1) == coroutine_suspended) {
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
                }), new C29683x7c18e770(null, OptionOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionOrderDuxo.this, null);
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

        /* compiled from: OptionOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiOptionOrderFee", "Lcom/robinhood/models/ui/UiOptionOrderFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19$3", m3645f = "OptionOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<UiOptionOrderFee, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionOrderDuxo optionOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiOptionOrderFee uiOptionOrderFee, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(uiOptionOrderFee, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UiOptionOrderFee uiOptionOrderFee = (UiOptionOrderFee) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$19$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionOrderDuxo.C2969519.AnonymousClass3.invokeSuspend$lambda$0(uiOptionOrderFee, (OptionOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionOrderViewState invokeSuspend$lambda$0(UiOptionOrderFee uiOptionOrderFee, OptionOrderViewState optionOrderViewState) {
                return optionOrderViewState.copy(((-2049) & 1) != 0 ? optionOrderViewState.account : null, ((-2049) & 2) != 0 ? optionOrderViewState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? optionOrderViewState.allAccounts : null, ((-2049) & 8) != 0 ? optionOrderViewState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? optionOrderViewState.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? optionOrderViewState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? optionOrderViewState.editedForm : false, ((-2049) & 512) != 0 ? optionOrderViewState.equityQuote : null, ((-2049) & 1024) != 0 ? optionOrderViewState.formState : null, ((-2049) & 2048) != 0 ? optionOrderViewState.indexValue : null, ((-2049) & 4096) != 0 ? optionOrderViewState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? optionOrderViewState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? optionOrderViewState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? optionOrderViewState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? optionOrderViewState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? optionOrderViewState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? optionOrderViewState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? optionOrderViewState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? optionOrderViewState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? optionOrderViewState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? optionOrderViewState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? optionOrderViewState.marketHours : null, ((-2049) & 16777216) != 0 ? optionOrderViewState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? optionOrderViewState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? optionOrderViewState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? optionOrderViewState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? optionOrderViewState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? optionOrderViewState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? optionOrderViewState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? optionOrderViewState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? optionOrderViewState.orderToReplace : null, (268435455 & 2) != 0 ? optionOrderViewState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? optionOrderViewState.overrideDirection : null, (268435455 & 8) != 0 ? optionOrderViewState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? optionOrderViewState.preserveUserInput : false, (268435455 & 32) != 0 ? optionOrderViewState.quantity : null, (268435455 & 64) != 0 ? optionOrderViewState.retryWhenAction : null, (268435455 & 128) != 0 ? optionOrderViewState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? optionOrderViewState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? optionOrderViewState.source : null, (268435455 & 1024) != 0 ? optionOrderViewState.timeInForce : null, (268435455 & 2048) != 0 ? optionOrderViewState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? optionOrderViewState.uiOptionOrderFee : uiOptionOrderFee, (268435455 & 8192) != 0 ? optionOrderViewState.userInputPrices : null, (268435455 & 16384) != 0 ? optionOrderViewState.validationPendingRequest : null, (268435455 & 32768) != 0 ? optionOrderViewState.validationFailure : null, (268435455 & 65536) != 0 ? optionOrderViewState.validationSkippedChecks : null, (268435455 & 131072) != 0 ? optionOrderViewState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? optionOrderViewState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? optionOrderViewState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? optionOrderViewState.locality : null, (268435455 & 2097152) != 0 ? optionOrderViewState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? optionOrderViewState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? optionOrderViewState.tradingSession : null, (268435455 & 16777216) != 0 ? optionOrderViewState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? optionOrderViewState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? optionOrderViewState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? optionOrderViewState.withShortenedVolatilityPeriod : false);
            }
        }
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20", m3645f = "OptionOrderDuxo.kt", m3646l = {EnumC7081g.f2781x2ba65ba3}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20 */
    static final class C2969620 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2969620(Continuation<? super C2969620> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDuxo.this.new C2969620(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2969620) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderViewState> statesFlow = OptionOrderDuxo.this.getStatesFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<OptionChain.UnderlyingType>() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionChain.UnderlyingType> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new C296862(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C296862<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C296862.this.emit(null, this);
                            }
                        }

                        public C296862(FlowCollector flowCollector) {
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
                                OptionChain.UnderlyingType underlyingType = ((OptionOrderViewState) obj).getSingleUiOptionChain().getUnderlyingType();
                                if (underlyingType != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(underlyingType, anonymousClass1) == coroutine_suspended) {
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
                }, new C29685xf8ab9a9a(null, OptionOrderDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionOrderDuxo.this, null);
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

        /* compiled from: OptionOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20$3", m3645f = "OptionOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionOrderDuxo optionOrderDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final OrderMarketHours orderMarketHours = (OrderMarketHours) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$20$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionOrderDuxo.C2969620.AnonymousClass3.invokeSuspend$lambda$0(orderMarketHours, (OptionOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionOrderViewState invokeSuspend$lambda$0(OrderMarketHours orderMarketHours, OptionOrderViewState optionOrderViewState) {
                return optionOrderViewState.copy(((-2049) & 1) != 0 ? optionOrderViewState.account : null, ((-2049) & 2) != 0 ? optionOrderViewState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? optionOrderViewState.allAccounts : null, ((-2049) & 8) != 0 ? optionOrderViewState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? optionOrderViewState.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? optionOrderViewState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? optionOrderViewState.editedForm : false, ((-2049) & 512) != 0 ? optionOrderViewState.equityQuote : null, ((-2049) & 1024) != 0 ? optionOrderViewState.formState : null, ((-2049) & 2048) != 0 ? optionOrderViewState.indexValue : null, ((-2049) & 4096) != 0 ? optionOrderViewState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? optionOrderViewState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? optionOrderViewState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? optionOrderViewState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? optionOrderViewState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? optionOrderViewState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? optionOrderViewState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? optionOrderViewState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? optionOrderViewState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? optionOrderViewState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? optionOrderViewState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? optionOrderViewState.marketHours : null, ((-2049) & 16777216) != 0 ? optionOrderViewState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? optionOrderViewState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? optionOrderViewState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? optionOrderViewState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? optionOrderViewState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? optionOrderViewState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? optionOrderViewState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? optionOrderViewState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? optionOrderViewState.orderToReplace : null, (268435455 & 2) != 0 ? optionOrderViewState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? optionOrderViewState.overrideDirection : null, (268435455 & 8) != 0 ? optionOrderViewState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? optionOrderViewState.preserveUserInput : false, (268435455 & 32) != 0 ? optionOrderViewState.quantity : null, (268435455 & 64) != 0 ? optionOrderViewState.retryWhenAction : null, (268435455 & 128) != 0 ? optionOrderViewState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? optionOrderViewState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? optionOrderViewState.source : null, (268435455 & 1024) != 0 ? optionOrderViewState.timeInForce : null, (268435455 & 2048) != 0 ? optionOrderViewState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? optionOrderViewState.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? optionOrderViewState.userInputPrices : null, (268435455 & 16384) != 0 ? optionOrderViewState.validationPendingRequest : null, (268435455 & 32768) != 0 ? optionOrderViewState.validationFailure : null, (268435455 & 65536) != 0 ? optionOrderViewState.validationSkippedChecks : null, (268435455 & 131072) != 0 ? optionOrderViewState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? optionOrderViewState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? optionOrderViewState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? optionOrderViewState.locality : null, (268435455 & 2097152) != 0 ? optionOrderViewState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? optionOrderViewState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? optionOrderViewState.tradingSession : orderMarketHours, (268435455 & 16777216) != 0 ? optionOrderViewState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? optionOrderViewState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? optionOrderViewState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? optionOrderViewState.withShortenedVolatilityPeriod : false);
            }
        }
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$21", m3645f = "OptionOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$21 */
    static final class C2969721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2969721(Continuation<? super C2969721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDuxo.this.new C2969721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2969721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(OptionOrderDuxo.this.optionMarketHoursStore.streamCurrentOrNextMarketDates()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$21$1", m3645f = "OptionOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$21$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionCurrentOrNextMarketDates, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOrderDuxo optionOrderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionCurrentOrNextMarketDates, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = (OptionCurrentOrNextMarketDates) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onCreate$21$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionOrderDuxo.C2969721.AnonymousClass1.invokeSuspend$lambda$0(optionCurrentOrNextMarketDates, (OptionOrderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionOrderViewState invokeSuspend$lambda$0(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionOrderViewState optionOrderViewState) {
                return optionOrderViewState.copy(((-2049) & 1) != 0 ? optionOrderViewState.account : null, ((-2049) & 2) != 0 ? optionOrderViewState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? optionOrderViewState.allAccounts : null, ((-2049) & 8) != 0 ? optionOrderViewState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? optionOrderViewState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? optionOrderViewState.currentOrNextMarketDates : optionCurrentOrNextMarketDates, ((-2049) & 128) != 0 ? optionOrderViewState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? optionOrderViewState.editedForm : false, ((-2049) & 512) != 0 ? optionOrderViewState.equityQuote : null, ((-2049) & 1024) != 0 ? optionOrderViewState.formState : null, ((-2049) & 2048) != 0 ? optionOrderViewState.indexValue : null, ((-2049) & 4096) != 0 ? optionOrderViewState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? optionOrderViewState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? optionOrderViewState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? optionOrderViewState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? optionOrderViewState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? optionOrderViewState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? optionOrderViewState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? optionOrderViewState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? optionOrderViewState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? optionOrderViewState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? optionOrderViewState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? optionOrderViewState.marketHours : null, ((-2049) & 16777216) != 0 ? optionOrderViewState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? optionOrderViewState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? optionOrderViewState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? optionOrderViewState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? optionOrderViewState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? optionOrderViewState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? optionOrderViewState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? optionOrderViewState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? optionOrderViewState.orderToReplace : null, (268435455 & 2) != 0 ? optionOrderViewState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? optionOrderViewState.overrideDirection : null, (268435455 & 8) != 0 ? optionOrderViewState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? optionOrderViewState.preserveUserInput : false, (268435455 & 32) != 0 ? optionOrderViewState.quantity : null, (268435455 & 64) != 0 ? optionOrderViewState.retryWhenAction : null, (268435455 & 128) != 0 ? optionOrderViewState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? optionOrderViewState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? optionOrderViewState.source : null, (268435455 & 1024) != 0 ? optionOrderViewState.timeInForce : null, (268435455 & 2048) != 0 ? optionOrderViewState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? optionOrderViewState.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? optionOrderViewState.userInputPrices : null, (268435455 & 16384) != 0 ? optionOrderViewState.validationPendingRequest : null, (268435455 & 32768) != 0 ? optionOrderViewState.validationFailure : null, (268435455 & 65536) != 0 ? optionOrderViewState.validationSkippedChecks : null, (268435455 & 131072) != 0 ? optionOrderViewState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? optionOrderViewState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? optionOrderViewState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? optionOrderViewState.locality : null, (268435455 & 2097152) != 0 ? optionOrderViewState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? optionOrderViewState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? optionOrderViewState.tradingSession : null, (268435455 & 16777216) != 0 ? optionOrderViewState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? optionOrderViewState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? optionOrderViewState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? optionOrderViewState.withShortenedVolatilityPeriod : false);
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        initializeExperiments();
        ImmutableList<OptionLegBundle> legBundles = ((OptionOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOptionOrderBundle().getLegBundles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        Iterator<OptionLegBundle> it = legBundles.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getOptionInstrument().getId());
        }
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, this.optionQuoteStore.pollQuotes(arrayList), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable<R> map = getStates().map(C297021.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(SingleUnderlyingEquityContext singleUnderlyingEquityContext) {
                Intrinsics.checkNotNullParameter(singleUnderlyingEquityContext, "singleUnderlyingEquityContext");
                return OptionOrderDuxo.this.quoteStore.getStreamQuote().asObservable(singleUnderlyingEquityContext.getEquityInstrumentId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$22(this.f$0, (Quote) obj);
            }
        });
        Observable<R> map2 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onResume$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return Optional3.asOptional(((OptionOrderViewState) it2).getRequestInputs());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onResume$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable<OptionOrderContextFactory.RequestInputs> observableRefCount = observableDistinctUntilChanged.replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Companion companion = INSTANCE;
        Observable<OptionOrderContext> observableDistinctUntilChanged2 = this.optionOrderContextFactory.create(new OptionOrderContextFactory.StaticInputs(((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getOptionOrderBundle(), ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSource(), ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getOrderUuid(), ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getDefaultPricingSettingOverride(), ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getShouldIgnoreDefaultPricing()), observableRefCount).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$25(this.f$0, (OptionOrderContext) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.optionAccountSwitcherStore.streamActiveAccountNumber().switchMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return OptionOrderDuxo.this.accountProvider.streamAccount(it2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$27(this.f$0, (Account) obj);
            }
        });
        Observable<R> map3 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onResume$$inlined$mapDistinctNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                Account account = ((OptionOrderViewState) it2).getAccount();
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onResume$$inlined$mapDistinctNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        Observable observableSwitchMap3 = observableDistinctUntilChanged3.switchMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.8
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionsBuyingPower> apply(String it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return OptionOrderDuxo.this.optionBuyingPowerStore.streamOptionsBuyingPower(it2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$30(this.f$0, (OptionsBuyingPower) obj);
            }
        });
        Observable<List<Account>> observableDistinctUntilChanged4 = this.accountProvider.streamAllSelfDirectedAccounts().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$32(this.f$0, (List) obj);
            }
        });
        Observable<R> map4 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onResume$$inlined$mapDistinctNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return Optional3.asOptional(((OptionOrderViewState) it2).getOptionsDisplayedBuyingPowerRequest());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onResume$$inlined$mapDistinctNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged5 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        final OptionsBuyingPowerStore optionsBuyingPowerStore = this.optionBuyingPowerStore;
        Observable observableSwitchMap4 = observableDistinctUntilChanged5.switchMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.12
            @Override // io.reactivex.functions.Function
            public final Observable<ApiOptionsDisplayedBuyingPower> apply(ApiOptionsDisplayedBuyingPowerRequest p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionsBuyingPowerStore.pollOptionsDisplayedBuyingPower(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$35(this.f$0, (ApiOptionsDisplayedBuyingPower) obj);
            }
        });
        Observable observableDistinctUntilChanged6 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.14
            @Override // io.reactivex.functions.Function
            public final Optional<UserEnteredProfitLossParams> apply(OptionOrderViewState it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                ApiOptionsProfitLossChartRequestParams profitLossChartRequestParams = it2.getProfitLossChartRequestParams();
                return Optional3.asOptional(profitLossChartRequestParams != null ? UserEnteredProfitLossParams.INSTANCE.getUserEnteredParams(profitLossChartRequestParams) : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$37(this.f$0, (UserEnteredProfitLossParams) obj);
            }
        });
        Observable<R> observableScan = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.16
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionOrderViewState it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getEditedForm();
            }
        }).distinctUntilChanged((Function<? super OptionOrderViewState, K>) new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.17
            @Override // io.reactivex.functions.Function
            public final ApiOptionOrderRequest apply(OptionOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                OptionOrderContext optionOrderContext = state.getOptionOrderContext();
                if (optionOrderContext != null) {
                    return optionOrderContext.getApiRequest();
                }
                return null;
            }
        }).debounce(1000L, TimeUnit.MILLISECONDS).scan(new Tuples2(null, null), new BiFunction() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.18
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<OptionOrderViewState, OptionOrderViewState> apply(Tuples2<OptionOrderViewState, OptionOrderViewState> tuples2, OptionOrderViewState newState) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Intrinsics.checkNotNullParameter(newState, "newState");
                return Tuples4.m3642to(tuples2.component2(), newState);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableScan, "scan(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableScan, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$40(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> map5 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it2;
                ApiOptionOrderPostBody serverDrivenOrderCheckPostBody = optionOrderViewState.getServerDrivenOrderCheckPostBody();
                return Optional3.asOptional(serverDrivenOrderCheckPostBody == null ? null : Tuples4.m3642to(optionOrderViewState, serverDrivenOrderCheckPostBody));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableSwitchMapSingle = ObservablesKt.filterIsPresent(map5).switchMapSingle(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.21
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<OptionOrderViewState, ApiOptionOrderCheck>> apply(Tuples2<OptionOrderViewState, ApiOptionOrderPostBody> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                final OptionOrderViewState optionOrderViewStateComponent1 = tuples2.component1();
                return OptionOrderDuxo.this.optionOrderCheckStore.optionOrderCheckSingle(tuples2.component2()).map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.21.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<OptionOrderViewState, ApiOptionOrderCheck> apply(ApiOptionOrderCheck it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Tuples4.m3642to(optionOrderViewStateComponent1, it2);
                    }
                }).timeout(5000L, TimeUnit.MILLISECONDS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$45(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$46(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.optionOrderNomenclatureStore.isInNomenclatureExperiment(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$48(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        this.marketHoursStore.refreshToday(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursStore.getMarketHoursToday(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$50(this.f$0, (MarketHours) obj);
            }
        });
        List<Experiment<SimpleVariant>> list = sdocImprovementExperiments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{(Experiment) it2.next()}, false, null, 6, null).distinctUntilChanged().startWith((Observable) Boolean.FALSE));
        }
        Observable observableDistinctUntilChanged7 = Observable.combineLatest(arrayList2, new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.27
            @Override // io.reactivex.functions.Function
            public final ImmutableList<String> apply(Object[] resultsArray) {
                Intrinsics.checkNotNullParameter(resultsArray, "resultsArray");
                ArrayList arrayList3 = new ArrayList(resultsArray.length);
                for (Object obj : resultsArray) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    arrayList3.add(bool);
                }
                List listZip = CollectionsKt.zip(OptionOrderDuxo.INSTANCE.getSdocImprovementExperiments(), arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (T t : listZip) {
                    if (((Boolean) ((Tuples2) t).component2()).booleanValue()) {
                        arrayList4.add(t);
                    }
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator<T> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((Experiment) ((Tuples2) it3.next()).component1()).getServerName());
                }
                return extensions2.toImmutableList(arrayList5);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged7, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$53(this.f$0, (ImmutableList) obj);
            }
        });
        Observable<OptionOrderViewState> observableTake = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.29
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionOrderViewState it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                OptionOrderContext optionOrderContext = it3.getOptionOrderContext();
                return optionOrderContext != null && optionOrderContext.getIsReviewable();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$54(this.f$0, (OptionOrderViewState) obj);
            }
        });
        Observable observableDistinctUntilChanged8 = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onResume$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                return (R) Boolean.valueOf(((OptionOrderViewState) it3).isToolbarMarketDiscoveryDotVisible());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        Observable observableFilter = observableDistinctUntilChanged8.filter(new Predicate() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.32
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$56(this.f$0, (Boolean) obj);
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$57(this.f$0, (OptionOrderViewState) obj);
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$58(this.f$0, (OptionOrderViewState) obj);
            }
        });
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$onResume$1 */
    static final class C297021<T, R> implements Function {
        public static final C297021<T, R> INSTANCE = new C297021<>();

        C297021() {
        }

        @Override // io.reactivex.functions.Function
        public final Optional<SingleUnderlyingEquityContext> apply(OptionOrderViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return state.getOptionOrderContext() == null ? Optional2.INSTANCE : Optional3.asOptional(SequencesKt.singleOrNull(SequencesKt.distinctBy(SequencesKt.flatMapIterable(CollectionsKt.asSequence(state.getOptionOrderContext().getLegContexts()), new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$onResume$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderDuxo.C297021.apply$lambda$1((OptionOrderContext.LegContext) obj);
                }
            }), new PropertyReference1Impl() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.onResume.1.2
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return ((SingleUnderlyingEquityContext) obj).getEquityInstrumentId();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Iterable apply$lambda$1(OptionOrderContext.LegContext legContext) {
            Intrinsics.checkNotNullParameter(legContext, "legContext");
            List<OptionUnderlier> optionUnderliers = legContext.getRequestContext().getOptionInstrument().getOptionUnderliers();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionUnderliers, 10));
            Iterator<T> it = optionUnderliers.iterator();
            while (it.hasNext()) {
                arrayList.add(new SingleUnderlyingEquityContext(legContext.getRequestContext().getOptionInstrument().getOptionInstrument(), ((OptionUnderlier) it.next()).getInstrumentId()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$22(OptionOrderDuxo optionOrderDuxo, final Quote quote) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$22$lambda$21(quote, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$22$lambda$21(Quote quote, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : quote, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$25(OptionOrderDuxo optionOrderDuxo, final OptionOrderContext optionOrderContext) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda78
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$25$lambda$24(optionOrderContext, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$25$lambda$24(OptionOrderContext optionOrderContext, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : optionOrderContext, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$27(OptionOrderDuxo optionOrderDuxo, final Account account) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$27$lambda$26(account, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$27$lambda$26(Account account, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : account, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$30(OptionOrderDuxo optionOrderDuxo, final OptionsBuyingPower optionsBuyingPower) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$30$lambda$29(optionsBuyingPower, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$30$lambda$29(OptionsBuyingPower optionsBuyingPower, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : optionsBuyingPower, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$32(OptionOrderDuxo optionOrderDuxo, final List list) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$32$lambda$31(list, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$32$lambda$31(List list, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : list, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$35(OptionOrderDuxo optionOrderDuxo, final ApiOptionsDisplayedBuyingPower apiOptionsDisplayedBuyingPower) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$35$lambda$34(apiOptionsDisplayedBuyingPower, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$35$lambda$34(ApiOptionsDisplayedBuyingPower apiOptionsDisplayedBuyingPower, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : apiOptionsDisplayedBuyingPower, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$37(OptionOrderDuxo optionOrderDuxo, final UserEnteredProfitLossParams lastRefreshedParams) {
        Intrinsics.checkNotNullParameter(lastRefreshedParams, "lastRefreshedParams");
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$37$lambda$36(lastRefreshedParams, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$37$lambda$36(UserEnteredProfitLossParams userEnteredProfitLossParams, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : userEnteredProfitLossParams, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$40(OptionOrderDuxo optionOrderDuxo, Tuples2 tuples2) {
        OptionOrderViewState optionOrderViewState = (OptionOrderViewState) tuples2.component1();
        OptionOrderViewState optionOrderViewState2 = (OptionOrderViewState) tuples2.component2();
        if (optionOrderViewState2 == null) {
            return Unit.INSTANCE;
        }
        TraderEventLogger traderEventLogger = optionOrderDuxo.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.EDIT_VALUES;
        OptionOrderContext optionOrderContext = optionOrderViewState2.getOptionOrderContext();
        BigDecimal quantity = null;
        ApiOptionOrderRequest apiRequest = optionOrderContext != null ? optionOrderContext.getApiRequest() : null;
        OptionOrderMeta optionOrderMetaState = optionOrderDuxo.state(new OptionOrderMeta(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null), optionOrderViewState2);
        OptionOrderContext optionOrderContext2 = optionOrderViewState2.getOptionOrderContext();
        if ((optionOrderContext2 != null ? optionOrderContext2.getApiRequest() : null) != null && (optionOrderViewState == null || (quantity = optionOrderViewState.getQuantity()) == null)) {
            quantity = BigDecimal.ONE;
        }
        if (quantity != null) {
            String string2 = quantity.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            OptionOrderMeta optionOrderMetaCopy = optionOrderMetaState.copy((268173311 & 1) != 0 ? optionOrderMetaState.bid_price : null, (268173311 & 2) != 0 ? optionOrderMetaState.ask_price : null, (268173311 & 4) != 0 ? optionOrderMetaState.entered_price : null, (268173311 & 8) != 0 ? optionOrderMetaState.source : null, (268173311 & 16) != 0 ? optionOrderMetaState.chain_symbol : null, (268173311 & 32) != 0 ? optionOrderMetaState.existing_order_id : null, (268173311 & 64) != 0 ? optionOrderMetaState.has_position : null, (268173311 & 128) != 0 ? optionOrderMetaState.is_watching : null, (268173311 & 256) != 0 ? optionOrderMetaState.num_legs : 0, (268173311 & 512) != 0 ? optionOrderMetaState.adjusted_mark_price : null, (268173311 & 1024) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down : null, (268173311 & 2048) != 0 ? optionOrderMetaState.adjusted_mark_price_min_tick : null, (268173311 & 4096) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down_min_tick : null, (268173311 & 8192) != 0 ? optionOrderMetaState.marketability : null, (268173311 & 16384) != 0 ? optionOrderMetaState.prev_order_state : null, (268173311 & 32768) != 0 ? optionOrderMetaState.current_order_state : null, (268173311 & 65536) != 0 ? optionOrderMetaState.default_price_setting : null, (268173311 & 131072) != 0 ? optionOrderMetaState.marketability_request_id : null, (268173311 & 262144) != 0 ? optionOrderMetaState.order_check_data : null, (268173311 & 524288) != 0 ? optionOrderMetaState.strategy_code : null, (268173311 & 1048576) != 0 ? optionOrderMetaState.tmp_round_experiment_no_round_price : null, (268173311 & 2097152) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_round_price : null, (268173311 & 4194304) != 0 ? optionOrderMetaState.tmp_round_experiment_min_tick_round_price : null, (268173311 & 8388608) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_and_min_tick_round_price : null, (268173311 & 16777216) != 0 ? optionOrderMetaState.account_type : null, (268173311 & 33554432) != 0 ? optionOrderMetaState.previous_quantity : string2, (268173311 & 67108864) != 0 ? optionOrderMetaState.option_order_type : null, (268173311 & 134217728) != 0 ? optionOrderMetaState.chain_type : null, (268173311 & 268435456) != 0 ? optionOrderMetaState.related_order_data : null, (268173311 & 536870912) != 0 ? optionOrderMetaState.unknownFields() : null);
            if (optionOrderMetaCopy != null) {
                optionOrderMetaState = optionOrderMetaCopy;
            }
        }
        traderEventLogger.logOptionOrderEvent(orderFormStep, apiRequest, optionOrderMetaState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$45(final OptionOrderDuxo optionOrderDuxo, Tuples2 tuples2) {
        final OptionOrderViewState optionOrderViewState = (OptionOrderViewState) tuples2.component1();
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final ApiOptionOrderCheck apiOptionOrderCheck = (ApiOptionOrderCheck) objComponent2;
        final ApiOptionOrderCheck.ApiOptionOrderCheckAlert alert = apiOptionOrderCheck.getAlert();
        PerformanceLogger.DefaultImpls.completeMetric$default(optionOrderDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_ORDER_REVIEW, null, 2, null);
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$45$lambda$44(apiOptionOrderCheck, alert, optionOrderDuxo, optionOrderViewState, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$45$lambda$44(ApiOptionOrderCheck apiOptionOrderCheck, ApiOptionOrderCheck.ApiOptionOrderCheckAlert apiOptionOrderCheckAlert, OptionOrderDuxo optionOrderDuxo, OptionOrderViewState optionOrderViewState, OptionOrderViewState applyMutation) {
        String accountNumber;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiGenericOrderCheckAction action = apiOptionOrderCheck.getAction();
        GenericOrderCheckAction dbModel = action != null ? action.toDbModel() : null;
        if (!(dbModel instanceof GenericOrderCheckAction.McwPresentQuickConversionAction)) {
            if (apiOptionOrderCheckAlert == null) {
                return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : DefaultOrderState.REVIEWING, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
            }
            optionOrderDuxo.analytics.logError(AnalyticsStrings.ERROR_ORDER_CHECK, apiOptionOrderCheckAlert.getType());
            optionOrderDuxo.logServerDrivenOrderCheckAlert(optionOrderViewState, apiOptionOrderCheckAlert);
            return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : applyMutation.getNumberOfChecksSeen() + 1, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : apiOptionOrderCheckAlert, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
        }
        Account account = applyMutation.getAccount();
        if (account == null || (accountNumber = account.getAccountNumber()) == null) {
            throw new IllegalStateException("No account number!");
        }
        GenericOrderCheckAction.McwPresentQuickConversionAction mcwPresentQuickConversionAction = (GenericOrderCheckAction.McwPresentQuickConversionAction) dbModel;
        String title = mcwPresentQuickConversionAction.getTitle();
        String message = mcwPresentQuickConversionAction.getMessage();
        String placeholder = mcwPresentQuickConversionAction.getPlaceholder();
        Currency currency = Currency.getInstance(mcwPresentQuickConversionAction.getSourceCurrencyCode());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        MoneyData amountNeeded = mcwPresentQuickConversionAction.getAmountNeeded();
        Currency currency2 = Currency.getInstance(amountNeeded.getCurrency_code());
        Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
        Money money = new Money(currency2, amountNeeded.getAmount());
        MoneyData currentBuyingPower = mcwPresentQuickConversionAction.getCurrentBuyingPower();
        Currency currency3 = Currency.getInstance(currentBuyingPower.getCurrency_code());
        Intrinsics.checkNotNullExpressionValue(currency3, "getInstance(...)");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : new UiEvent(new QuickConversionKey(accountNumber, title, message, placeholder, currency, money, new Money(currency3, currentBuyingPower.getAmount()), mcwPresentQuickConversionAction.getSecondaryCta())), (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$46(OptionOrderDuxo optionOrderDuxo, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        PerformanceLogger.DefaultImpls.completeMetric$default(optionOrderDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_ORDER_REVIEW, null, 2, null);
        if (exception instanceof TimeoutException) {
            skipAllChecksAndContinue$default(optionOrderDuxo, OrderCheckAbortReason.TIMEOUT, null, null, 6, null);
        } else {
            skipAllChecksAndContinue$default(optionOrderDuxo, OrderCheckAbortReason.HTTP_ERROR, null, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$48(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$48$lambda$47(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$48$lambda$47(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : z, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$50(OptionOrderDuxo optionOrderDuxo, final MarketHours it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$50$lambda$49(it, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$50$lambda$49(MarketHours marketHours, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : marketHours, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$53(OptionOrderDuxo optionOrderDuxo, final ImmutableList immutableList) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onResume$lambda$53$lambda$52(immutableList, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$53$lambda$52(ImmutableList immutableList, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : immutableList, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$54(OptionOrderDuxo optionOrderDuxo, OptionOrderViewState optionOrderViewState) {
        PerformanceLogger.DefaultImpls.completeMetric$default(optionOrderDuxo.performanceLogger, PerformanceMetricEventData.Name.BUY_OPTION_TRADE_DETAILS, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$56(OptionOrderDuxo optionOrderDuxo, Boolean bool) {
        optionOrderDuxo.optionOrderDiscoveryStore.recordOptionOrderMarketGreenDotSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$57(OptionOrderDuxo optionOrderDuxo, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : optionOrderDuxo.optionOrderDiscoveryStore.shouldShowOptionOrderMarketGreenDot(), (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onResume$lambda$58(OptionOrderDuxo optionOrderDuxo, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : optionOrderDuxo.optionOrderMarketTooltipPref.get(), (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStop() {
        super.onStop();
        this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTION_ORDER, null);
        this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_ORDER_REVIEW, null);
    }

    private final void initializeExperiments() {
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsMaxOrderSizeImprovementsExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$60(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{OptionsOrderLatencyDecreaseExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$62(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, Experiments.OptionsValuationTradeFlowM1Experiment.INSTANCE, Experiments.OptionsValuationTradeFlowM1Experiment.Variant.CONTROL, false, 4, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$64(this.f$0, (Experiments.OptionsValuationTradeFlowM1Experiment.Variant) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsCatFeesCopyKillSwitch.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$66(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsCatFeesKillSwitch.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$68(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$70(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, Experiments.IndexOptionsSingleLegOrderSummaryUpdates.INSTANCE, Experiments.IndexOptionsSingleLegOrderSummaryUpdates.Variant.CONTROL, false, 4, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$72(this.f$0, (Experiments.IndexOptionsSingleLegOrderSummaryUpdates.Variant) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{TradeOptionsSduiAccountSwitcherExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$74(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsOrderPathMarketTradingHours.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$76(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$60(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$60$lambda$59(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$60$lambda$59(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : z, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$62(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$62$lambda$61(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$62$lambda$61(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : z, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$64(OptionOrderDuxo optionOrderDuxo, final Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$64$lambda$63(variant, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$64$lambda$63(Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : variant, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$66(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$66$lambda$65(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$66$lambda$65(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : !z, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$68(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$68$lambda$67(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$68$lambda$67(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : !z, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$70(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$70$lambda$69(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$70$lambda$69(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : z, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$72(OptionOrderDuxo optionOrderDuxo, final Experiments.IndexOptionsSingleLegOrderSummaryUpdates.Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$72$lambda$71(variant, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$72$lambda$71(Experiments.IndexOptionsSingleLegOrderSummaryUpdates.Variant variant, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : variant, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$74(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda84
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$74$lambda$73(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$74$lambda$73(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : z, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeExperiments$lambda$76(OptionOrderDuxo optionOrderDuxo, final boolean z) {
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.initializeExperiments$lambda$76$lambda$75(z, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState initializeExperiments$lambda$76$lambda$75(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : z);
    }

    public final void validateAndReviewOrder() {
        PerformanceLogger performanceLogger = this.performanceLogger;
        PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.OPTIONS_ORDER_REVIEW;
        String string2 = ((OptionOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOptionOrderBundle().getOptionChainBundle().getOptionChainId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, null, null, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(null, null, false, string2, null, null, null, 119, null), null, null, null, null, null, null, null, null, 4087, null), 6, null);
        mutate(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.validateAndReviewOrder$lambda$77(this.f$0, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState validateAndReviewOrder$lambda$77(OptionOrderDuxo optionOrderDuxo, OptionOrderViewState startState) {
        Intrinsics.checkNotNullParameter(startState, "startState");
        OptionOrderViewState optionOrderViewStateCopy = startState.copy(((-2049) & 1) != 0 ? startState.account : null, ((-2049) & 2) != 0 ? startState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? startState.allAccounts : null, ((-2049) & 8) != 0 ? startState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? startState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? startState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? startState.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? startState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? startState.editedForm : false, ((-2049) & 512) != 0 ? startState.equityQuote : null, ((-2049) & 1024) != 0 ? startState.formState : null, ((-2049) & 2048) != 0 ? startState.indexValue : null, ((-2049) & 4096) != 0 ? startState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? startState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? startState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? startState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? startState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? startState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? startState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? startState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? startState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? startState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? startState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? startState.marketHours : null, ((-2049) & 16777216) != 0 ? startState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? startState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? startState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? startState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? startState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? startState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? startState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? startState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? startState.orderToReplace : null, (268435455 & 2) != 0 ? startState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? startState.overrideDirection : null, (268435455 & 8) != 0 ? startState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? startState.preserveUserInput : false, (268435455 & 32) != 0 ? startState.quantity : null, (268435455 & 64) != 0 ? startState.retryWhenAction : null, (268435455 & 128) != 0 ? startState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? startState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? startState.source : null, (268435455 & 1024) != 0 ? startState.timeInForce : null, (268435455 & 2048) != 0 ? startState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? startState.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? startState.userInputPrices : null, (268435455 & 16384) != 0 ? startState.validationPendingRequest : null, (268435455 & 32768) != 0 ? startState.validationFailure : null, (268435455 & 65536) != 0 ? startState.validationSkippedChecks : null, (268435455 & 131072) != 0 ? startState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? startState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? startState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? startState.locality : null, (268435455 & 2097152) != 0 ? startState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? startState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? startState.tradingSession : null, (268435455 & 16777216) != 0 ? startState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? startState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? startState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? startState.withShortenedVolatilityPeriod : false);
        OptionOrderContext optionOrderContext = optionOrderViewStateCopy.getOptionOrderContext();
        if (optionOrderContext == null || !optionOrderContext.getIsReviewable()) {
            return optionOrderViewStateCopy;
        }
        UUID uuidSyncServerMarketability = optionOrderDuxo.syncServerMarketability(optionOrderContext);
        optionOrderDuxo.logReview(uuidSyncServerMarketability, optionOrderContext, optionOrderViewStateCopy);
        return optionOrderViewStateCopy.copy(((-2049) & 1) != 0 ? optionOrderViewStateCopy.account : null, ((-2049) & 2) != 0 ? optionOrderViewStateCopy.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? optionOrderViewStateCopy.allAccounts : null, ((-2049) & 8) != 0 ? optionOrderViewStateCopy.bidAskBarDataState : null, ((-2049) & 16) != 0 ? optionOrderViewStateCopy.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? optionOrderViewStateCopy.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? optionOrderViewStateCopy.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? optionOrderViewStateCopy.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? optionOrderViewStateCopy.editedForm : false, ((-2049) & 512) != 0 ? optionOrderViewStateCopy.equityQuote : null, ((-2049) & 1024) != 0 ? optionOrderViewStateCopy.formState : null, ((-2049) & 2048) != 0 ? optionOrderViewStateCopy.indexValue : null, ((-2049) & 4096) != 0 ? optionOrderViewStateCopy.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? optionOrderViewStateCopy.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? optionOrderViewStateCopy.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? optionOrderViewStateCopy.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? optionOrderViewStateCopy.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? optionOrderViewStateCopy.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? optionOrderViewStateCopy.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? optionOrderViewStateCopy.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? optionOrderViewStateCopy.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? optionOrderViewStateCopy.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? optionOrderViewStateCopy.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? optionOrderViewStateCopy.marketHours : null, ((-2049) & 16777216) != 0 ? optionOrderViewStateCopy.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? optionOrderViewStateCopy.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? optionOrderViewStateCopy.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? optionOrderViewStateCopy.optionOrderContext : null, ((-2049) & 268435456) != 0 ? optionOrderViewStateCopy.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? optionOrderViewStateCopy.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? optionOrderViewStateCopy.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? optionOrderViewStateCopy.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? optionOrderViewStateCopy.orderToReplace : null, (268435455 & 2) != 0 ? optionOrderViewStateCopy.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? optionOrderViewStateCopy.overrideDirection : null, (268435455 & 8) != 0 ? optionOrderViewStateCopy.overrideDtbpChecks : false, (268435455 & 16) != 0 ? optionOrderViewStateCopy.preserveUserInput : false, (268435455 & 32) != 0 ? optionOrderViewStateCopy.quantity : null, (268435455 & 64) != 0 ? optionOrderViewStateCopy.retryWhenAction : null, (268435455 & 128) != 0 ? optionOrderViewStateCopy.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? optionOrderViewStateCopy.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? optionOrderViewStateCopy.source : null, (268435455 & 1024) != 0 ? optionOrderViewStateCopy.timeInForce : null, (268435455 & 2048) != 0 ? optionOrderViewStateCopy.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? optionOrderViewStateCopy.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? optionOrderViewStateCopy.userInputPrices : null, (268435455 & 16384) != 0 ? optionOrderViewStateCopy.validationPendingRequest : new UiEvent(uuidSyncServerMarketability), (268435455 & 32768) != 0 ? optionOrderViewStateCopy.validationFailure : null, (268435455 & 65536) != 0 ? optionOrderViewStateCopy.validationSkippedChecks : null, (268435455 & 131072) != 0 ? optionOrderViewStateCopy.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? optionOrderViewStateCopy.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? optionOrderViewStateCopy.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? optionOrderViewStateCopy.locality : null, (268435455 & 2097152) != 0 ? optionOrderViewStateCopy.orderPathExperiments : null, (268435455 & 4194304) != 0 ? optionOrderViewStateCopy.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? optionOrderViewStateCopy.tradingSession : null, (268435455 & 16777216) != 0 ? optionOrderViewStateCopy.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? optionOrderViewStateCopy.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? optionOrderViewStateCopy.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? optionOrderViewStateCopy.withShortenedVolatilityPeriod : false);
    }

    public final void logReviewClicked() {
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.REVIEW_OPTION_SWIPE_TO_SUBMIT, null, null, null, 14, null);
    }

    private final void logReview(UUID requestId, OptionOrderContext optionOrderContext, OptionOrderViewState state) {
        String string2;
        String string3;
        String string4;
        String string5;
        MarketabilityType rosettaType;
        String chainTypeForLogging;
        OptionOrderViewState.Marketability marketability;
        OptionOrderViewState.Marketability.MarketabilityType marketabilityType;
        OptionOrder optionOrder;
        UUID id;
        BigDecimal askPriceForLogging;
        BigDecimal bidPriceForLogging;
        TraderEventLogger traderEventLogger = this.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.REVIEW;
        ApiOptionOrderRequest apiRequest = optionOrderContext.getApiRequest();
        BrokerageAccountType analyticsAccountType = state.getAnalyticsAccountType();
        OptionOrderContext.QuoteAggregation quoteAggregation = optionOrderContext.getPrices().getQuoteAggregation();
        if (quoteAggregation == null || (bidPriceForLogging = quoteAggregation.getBidPriceForLogging()) == null || (string2 = bidPriceForLogging.toString()) == null) {
            string2 = "";
        }
        OptionOrderContext.QuoteAggregation quoteAggregation2 = optionOrderContext.getPrices().getQuoteAggregation();
        if (quoteAggregation2 == null || (askPriceForLogging = quoteAggregation2.getAskPriceForLogging()) == null || (string3 = askPriceForLogging.toString()) == null) {
            string3 = "";
        }
        DefaultPriceSetting rosettaValue = OptionSettings.DefaultPricingSetting.INSTANCE.toRosettaValue(optionOrderContext.getPrices().getDefaultPricingType());
        BigDecimal absoluteLimitPriceForAnalytics = state.getUserInputPrices().getAbsoluteLimitPriceForAnalytics();
        if (absoluteLimitPriceForAnalytics == null || (string4 = absoluteLimitPriceForAnalytics.toString()) == null) {
            string4 = "";
        }
        Companion companion = INSTANCE;
        OptionOrderMeta.Source metaSource = OptionOrderSource.toMetaSource(((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getSource());
        String strategyCode = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getStrategyCode();
        String str = strategyCode == null ? "" : strategyCode;
        String symbol = optionOrderContext.getRequestContext().getOptionChain().getOptionChain().getSymbol();
        UiOptionOrder orderToReplace = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getOrderToReplace();
        if (orderToReplace == null || (optionOrder = orderToReplace.getOptionOrder()) == null || (id = optionOrder.getId()) == null || (string5 = id.toString()) == null) {
            string5 = "";
        }
        int size = optionOrderContext.getLegContexts().size();
        OptionOrderViewState.UiMarketability uiMarketabilitySingleLegMarketabilityForLogging = state.singleLegMarketabilityForLogging(this.clock);
        if (uiMarketabilitySingleLegMarketabilityForLogging == null || (marketability = uiMarketabilitySingleLegMarketabilityForLogging.getMarketability()) == null || (marketabilityType = marketability.getMarketabilityType()) == null || (rosettaType = marketabilityType.getRosettaType()) == null) {
            rosettaType = MarketabilityType.MARKETABILITY_UNSPECIFIED;
        }
        MarketabilityType marketabilityType2 = rosettaType;
        String string6 = requestId != null ? requestId.toString() : null;
        String str2 = string6 == null ? "" : string6;
        OptionChainDisplayMode chainDisplayModeForLogging = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getChainDisplayModeForLogging();
        traderEventLogger.logOptionOrderEvent(orderFormStep, apiRequest, new OptionOrderMeta(string2, string3, string4, metaSource, symbol, string5, null, null, size, null, null, null, null, marketabilityType2, null, null, rosettaValue, str2, null, str, null, null, null, null, analyticsAccountType, null, null, (chainDisplayModeForLogging == null || (chainTypeForLogging = chainDisplayModeForLogging.toChainTypeForLogging()) == null) ? "" : chainTypeForLogging, ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getOptionRelatedOrderData(), null, 653582016, null));
        PerformanceLogger.DefaultImpls.resumeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.REVIEW_OPTION_SWIPE_TO_SUBMIT, null, 2, null);
    }

    private final void logServerDrivenOrderCheckAlert(OptionOrderViewState state, ApiOptionOrderCheck.ApiOptionOrderCheckAlert failure) {
        TraderEventLogger traderEventLogger = this.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.ORDER_CHECK;
        OptionOrderContext optionOrderContext = state.getOptionOrderContext();
        ApiOptionOrderRequest apiRequest = optionOrderContext != null ? optionOrderContext.getApiRequest() : null;
        OptionOrderMeta optionOrderMetaState = state(new OptionOrderMeta(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null), state);
        traderEventLogger.logOptionOrderEvent(orderFormStep, apiRequest, optionOrderMetaState.copy((268173311 & 1) != 0 ? optionOrderMetaState.bid_price : null, (268173311 & 2) != 0 ? optionOrderMetaState.ask_price : null, (268173311 & 4) != 0 ? optionOrderMetaState.entered_price : null, (268173311 & 8) != 0 ? optionOrderMetaState.source : null, (268173311 & 16) != 0 ? optionOrderMetaState.chain_symbol : null, (268173311 & 32) != 0 ? optionOrderMetaState.existing_order_id : null, (268173311 & 64) != 0 ? optionOrderMetaState.has_position : null, (268173311 & 128) != 0 ? optionOrderMetaState.is_watching : null, (268173311 & 256) != 0 ? optionOrderMetaState.num_legs : 0, (268173311 & 512) != 0 ? optionOrderMetaState.adjusted_mark_price : null, (268173311 & 1024) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down : null, (268173311 & 2048) != 0 ? optionOrderMetaState.adjusted_mark_price_min_tick : null, (268173311 & 4096) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down_min_tick : null, (268173311 & 8192) != 0 ? optionOrderMetaState.marketability : null, (268173311 & 16384) != 0 ? optionOrderMetaState.prev_order_state : null, (268173311 & 32768) != 0 ? optionOrderMetaState.current_order_state : null, (268173311 & 65536) != 0 ? optionOrderMetaState.default_price_setting : null, (268173311 & 131072) != 0 ? optionOrderMetaState.marketability_request_id : null, (268173311 & 262144) != 0 ? optionOrderMetaState.order_check_data : new OptionOrderCheckData(failure.getType(), null, null, String.valueOf(state.getNumberOfChecksSeen() + 1), null, 22, null), (268173311 & 524288) != 0 ? optionOrderMetaState.strategy_code : null, (268173311 & 1048576) != 0 ? optionOrderMetaState.tmp_round_experiment_no_round_price : null, (268173311 & 2097152) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_round_price : null, (268173311 & 4194304) != 0 ? optionOrderMetaState.tmp_round_experiment_min_tick_round_price : null, (268173311 & 8388608) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_and_min_tick_round_price : null, (268173311 & 16777216) != 0 ? optionOrderMetaState.account_type : null, (268173311 & 33554432) != 0 ? optionOrderMetaState.previous_quantity : null, (268173311 & 67108864) != 0 ? optionOrderMetaState.option_order_type : null, (268173311 & 134217728) != 0 ? optionOrderMetaState.chain_type : null, (268173311 & 268435456) != 0 ? optionOrderMetaState.related_order_data : null, (268173311 & 536870912) != 0 ? optionOrderMetaState.unknownFields() : null));
        PerformanceLogger.DefaultImpls.pauseMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.REVIEW_OPTION_SWIPE_TO_SUBMIT, null, 2, null);
    }

    public final void logServerDrivenOrderCheckAlertTap(OptionOrderViewState state, ApiOptionOrderCheck.ApiOptionOrderCheckAlert failure, String actionId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(failure, "failure");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        TraderEventLogger traderEventLogger = this.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.ORDER_CHECK_ACTION;
        OptionOrderContext optionOrderContext = state.getOptionOrderContext();
        ApiOptionOrderRequest apiRequest = optionOrderContext != null ? optionOrderContext.getApiRequest() : null;
        OptionOrderMeta optionOrderMetaState = state(new OptionOrderMeta(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null), state);
        traderEventLogger.logOptionOrderEvent(orderFormStep, apiRequest, optionOrderMetaState.copy((268173311 & 1) != 0 ? optionOrderMetaState.bid_price : null, (268173311 & 2) != 0 ? optionOrderMetaState.ask_price : null, (268173311 & 4) != 0 ? optionOrderMetaState.entered_price : null, (268173311 & 8) != 0 ? optionOrderMetaState.source : null, (268173311 & 16) != 0 ? optionOrderMetaState.chain_symbol : null, (268173311 & 32) != 0 ? optionOrderMetaState.existing_order_id : null, (268173311 & 64) != 0 ? optionOrderMetaState.has_position : null, (268173311 & 128) != 0 ? optionOrderMetaState.is_watching : null, (268173311 & 256) != 0 ? optionOrderMetaState.num_legs : 0, (268173311 & 512) != 0 ? optionOrderMetaState.adjusted_mark_price : null, (268173311 & 1024) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down : null, (268173311 & 2048) != 0 ? optionOrderMetaState.adjusted_mark_price_min_tick : null, (268173311 & 4096) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down_min_tick : null, (268173311 & 8192) != 0 ? optionOrderMetaState.marketability : null, (268173311 & 16384) != 0 ? optionOrderMetaState.prev_order_state : null, (268173311 & 32768) != 0 ? optionOrderMetaState.current_order_state : null, (268173311 & 65536) != 0 ? optionOrderMetaState.default_price_setting : null, (268173311 & 131072) != 0 ? optionOrderMetaState.marketability_request_id : null, (268173311 & 262144) != 0 ? optionOrderMetaState.order_check_data : new OptionOrderCheckData(failure.getType(), actionId, null, String.valueOf(state.getNumberOfChecksSeen()), null, 20, null), (268173311 & 524288) != 0 ? optionOrderMetaState.strategy_code : null, (268173311 & 1048576) != 0 ? optionOrderMetaState.tmp_round_experiment_no_round_price : null, (268173311 & 2097152) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_round_price : null, (268173311 & 4194304) != 0 ? optionOrderMetaState.tmp_round_experiment_min_tick_round_price : null, (268173311 & 8388608) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_and_min_tick_round_price : null, (268173311 & 16777216) != 0 ? optionOrderMetaState.account_type : null, (268173311 & 33554432) != 0 ? optionOrderMetaState.previous_quantity : null, (268173311 & 67108864) != 0 ? optionOrderMetaState.option_order_type : null, (268173311 & 134217728) != 0 ? optionOrderMetaState.chain_type : null, (268173311 & 268435456) != 0 ? optionOrderMetaState.related_order_data : null, (268173311 & 536870912) != 0 ? optionOrderMetaState.unknownFields() : null));
    }

    public static /* synthetic */ void skipAllChecksAndContinue$default(OptionOrderDuxo optionOrderDuxo, OrderCheckAbortReason orderCheckAbortReason, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        optionOrderDuxo.skipAllChecksAndContinue(orderCheckAbortReason, str, str2);
    }

    public final void skipAllChecksAndContinue(final OrderCheckAbortReason abortReason, final String alertType, final String triggeredActionId) {
        Intrinsics.checkNotNullParameter(abortReason, "abortReason");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda75
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.skipAllChecksAndContinue$lambda$82(this.f$0, abortReason, alertType, triggeredActionId, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState skipAllChecksAndContinue$lambda$82(OptionOrderDuxo optionOrderDuxo, OrderCheckAbortReason orderCheckAbortReason, String str, String str2, OptionOrderViewState applyMutation) {
        OptionOrderCheckData optionOrderCheckDataCopy$default;
        OptionOrderCheckData optionOrderCheckDataCopy$default2;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        TraderEventLogger traderEventLogger = optionOrderDuxo.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.ABORT_ORDER_CHECKS;
        OptionOrderContext optionOrderContext = applyMutation.getOptionOrderContext();
        ApiOptionOrderRequest apiRequest = optionOrderContext != null ? optionOrderContext.getApiRequest() : null;
        OptionOrderMeta optionOrderMetaState = optionOrderDuxo.state(new OptionOrderMeta(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null), applyMutation);
        String lowerCase = orderCheckAbortReason.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        OptionOrderCheckData optionOrderCheckData = new OptionOrderCheckData(null, null, lowerCase, String.valueOf(applyMutation.getNumberOfChecksSeen()), null, 19, null);
        OptionOrderCheckData optionOrderCheckData2 = (str == null || (optionOrderCheckDataCopy$default2 = OptionOrderCheckData.copy$default(optionOrderCheckData, str, null, null, null, null, 30, null)) == null) ? optionOrderCheckData : optionOrderCheckDataCopy$default2;
        traderEventLogger.logOptionOrderEvent(orderFormStep, apiRequest, optionOrderMetaState.copy((268173311 & 1) != 0 ? optionOrderMetaState.bid_price : null, (268173311 & 2) != 0 ? optionOrderMetaState.ask_price : null, (268173311 & 4) != 0 ? optionOrderMetaState.entered_price : null, (268173311 & 8) != 0 ? optionOrderMetaState.source : null, (268173311 & 16) != 0 ? optionOrderMetaState.chain_symbol : null, (268173311 & 32) != 0 ? optionOrderMetaState.existing_order_id : null, (268173311 & 64) != 0 ? optionOrderMetaState.has_position : null, (268173311 & 128) != 0 ? optionOrderMetaState.is_watching : null, (268173311 & 256) != 0 ? optionOrderMetaState.num_legs : 0, (268173311 & 512) != 0 ? optionOrderMetaState.adjusted_mark_price : null, (268173311 & 1024) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down : null, (268173311 & 2048) != 0 ? optionOrderMetaState.adjusted_mark_price_min_tick : null, (268173311 & 4096) != 0 ? optionOrderMetaState.adjusted_mark_price_round_down_min_tick : null, (268173311 & 8192) != 0 ? optionOrderMetaState.marketability : null, (268173311 & 16384) != 0 ? optionOrderMetaState.prev_order_state : null, (268173311 & 32768) != 0 ? optionOrderMetaState.current_order_state : null, (268173311 & 65536) != 0 ? optionOrderMetaState.default_price_setting : null, (268173311 & 131072) != 0 ? optionOrderMetaState.marketability_request_id : null, (268173311 & 262144) != 0 ? optionOrderMetaState.order_check_data : (str2 == null || (optionOrderCheckDataCopy$default = OptionOrderCheckData.copy$default(optionOrderCheckData2, null, str2, null, null, null, 29, null)) == null) ? optionOrderCheckData2 : optionOrderCheckDataCopy$default, (268173311 & 524288) != 0 ? optionOrderMetaState.strategy_code : null, (268173311 & 1048576) != 0 ? optionOrderMetaState.tmp_round_experiment_no_round_price : null, (268173311 & 2097152) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_round_price : null, (268173311 & 4194304) != 0 ? optionOrderMetaState.tmp_round_experiment_min_tick_round_price : null, (268173311 & 8388608) != 0 ? optionOrderMetaState.tmp_round_experiment_mark_and_min_tick_round_price : null, (268173311 & 16777216) != 0 ? optionOrderMetaState.account_type : null, (268173311 & 33554432) != 0 ? optionOrderMetaState.previous_quantity : null, (268173311 & 67108864) != 0 ? optionOrderMetaState.option_order_type : null, (268173311 & 134217728) != 0 ? optionOrderMetaState.chain_type : null, (268173311 & 268435456) != 0 ? optionOrderMetaState.related_order_data : null, (268173311 & 536870912) != 0 ? optionOrderMetaState.unknownFields() : null));
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : DefaultOrderState.REVIEWING, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public static /* synthetic */ void handleFailureResolution$default(OptionOrderDuxo optionOrderDuxo, Validator.Action action, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        optionOrderDuxo.handleFailureResolution(action, str);
    }

    public final void handleFailureResolution(final Validator.Action<? super OptionOrderContext> action, final String overrideNameForSkipAction) {
        Intrinsics.checkNotNullParameter(action, "action");
        mutate(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.handleFailureResolution$lambda$83(action, this, overrideNameForSkipAction, (OptionOrderViewState) obj);
            }
        });
        if (action instanceof Validator.Action.Skip) {
            validateAndReviewOrder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState handleFailureResolution$lambda$83(Validator.Action action, OptionOrderDuxo optionOrderDuxo, String str, OptionOrderViewState startState) {
        Set<String> setAppendSkippedCheck$feature_trade_options_externalDebug;
        Intrinsics.checkNotNullParameter(startState, "startState");
        if (action instanceof Validator.Action.Abort) {
            optionOrderDuxo.performanceLogger.abortMetric(PerformanceMetricEventData.Name.REVIEW_OPTION_SWIPE_TO_SUBMIT, null);
            return startState.copy(((-2049) & 1) != 0 ? startState.account : null, ((-2049) & 2) != 0 ? startState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? startState.allAccounts : null, ((-2049) & 8) != 0 ? startState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? startState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? startState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? startState.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? startState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? startState.editedForm : false, ((-2049) & 512) != 0 ? startState.equityQuote : null, ((-2049) & 1024) != 0 ? startState.formState : null, ((-2049) & 2048) != 0 ? startState.indexValue : null, ((-2049) & 4096) != 0 ? startState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? startState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? startState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? startState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? startState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? startState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? startState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? startState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? startState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? startState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? startState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? startState.marketHours : null, ((-2049) & 16777216) != 0 ? startState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? startState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? startState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? startState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? startState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? startState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? startState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? startState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? startState.orderToReplace : null, (268435455 & 2) != 0 ? startState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? startState.overrideDirection : null, (268435455 & 8) != 0 ? startState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? startState.preserveUserInput : false, (268435455 & 32) != 0 ? startState.quantity : null, (268435455 & 64) != 0 ? startState.retryWhenAction : null, (268435455 & 128) != 0 ? startState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? startState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? startState.source : null, (268435455 & 1024) != 0 ? startState.timeInForce : null, (268435455 & 2048) != 0 ? startState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? startState.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? startState.userInputPrices : null, (268435455 & 16384) != 0 ? startState.validationPendingRequest : null, (268435455 & 32768) != 0 ? startState.validationFailure : null, (268435455 & 65536) != 0 ? startState.validationSkippedChecks : null, (268435455 & 131072) != 0 ? startState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? startState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? startState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? startState.locality : null, (268435455 & 2097152) != 0 ? startState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? startState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? startState.tradingSession : null, (268435455 & 16777216) != 0 ? startState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? startState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? startState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? startState.withShortenedVolatilityPeriod : false);
        }
        if (action instanceof Validator.Action.Skip) {
            if (startState.getValidationFailure() == null) {
                setAppendSkippedCheck$feature_trade_options_externalDebug = startState.getValidationSkippedChecks();
            } else {
                setAppendSkippedCheck$feature_trade_options_externalDebug = INSTANCE.appendSkippedCheck$feature_trade_options_externalDebug(startState.getValidationSkippedChecks(), str);
            }
            return startState.copy(((-2049) & 1) != 0 ? startState.account : null, ((-2049) & 2) != 0 ? startState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? startState.allAccounts : null, ((-2049) & 8) != 0 ? startState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? startState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? startState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? startState.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? startState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? startState.editedForm : false, ((-2049) & 512) != 0 ? startState.equityQuote : null, ((-2049) & 1024) != 0 ? startState.formState : null, ((-2049) & 2048) != 0 ? startState.indexValue : null, ((-2049) & 4096) != 0 ? startState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? startState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? startState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? startState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? startState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? startState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? startState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? startState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? startState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? startState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? startState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? startState.marketHours : null, ((-2049) & 16777216) != 0 ? startState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? startState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? startState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? startState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? startState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? startState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? startState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? startState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? startState.orderToReplace : null, (268435455 & 2) != 0 ? startState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? startState.overrideDirection : null, (268435455 & 8) != 0 ? startState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? startState.preserveUserInput : false, (268435455 & 32) != 0 ? startState.quantity : null, (268435455 & 64) != 0 ? startState.retryWhenAction : null, (268435455 & 128) != 0 ? startState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? startState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? startState.source : null, (268435455 & 1024) != 0 ? startState.timeInForce : null, (268435455 & 2048) != 0 ? startState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? startState.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? startState.userInputPrices : null, (268435455 & 16384) != 0 ? startState.validationPendingRequest : null, (268435455 & 32768) != 0 ? startState.validationFailure : null, (268435455 & 65536) != 0 ? startState.validationSkippedChecks : setAppendSkippedCheck$feature_trade_options_externalDebug, (268435455 & 131072) != 0 ? startState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? startState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? startState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? startState.locality : null, (268435455 & 2097152) != 0 ? startState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? startState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? startState.tradingSession : null, (268435455 & 16777216) != 0 ? startState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? startState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? startState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? startState.withShortenedVolatilityPeriod : false);
        }
        if (!(action instanceof Validator.Action.RetryWhen)) {
            throw new NoWhenBranchMatchedException();
        }
        return startState.copy(((-2049) & 1) != 0 ? startState.account : null, ((-2049) & 2) != 0 ? startState.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? startState.allAccounts : null, ((-2049) & 8) != 0 ? startState.bidAskBarDataState : null, ((-2049) & 16) != 0 ? startState.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? startState.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? startState.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? startState.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? startState.editedForm : false, ((-2049) & 512) != 0 ? startState.equityQuote : null, ((-2049) & 1024) != 0 ? startState.formState : null, ((-2049) & 2048) != 0 ? startState.indexValue : null, ((-2049) & 4096) != 0 ? startState.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? startState.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? startState.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? startState.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? startState.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? startState.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? startState.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? startState.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? startState.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? startState.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? startState.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? startState.marketHours : null, ((-2049) & 16777216) != 0 ? startState.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? startState.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? startState.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? startState.optionOrderContext : null, ((-2049) & 268435456) != 0 ? startState.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? startState.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? startState.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? startState.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? startState.orderToReplace : null, (268435455 & 2) != 0 ? startState.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? startState.overrideDirection : null, (268435455 & 8) != 0 ? startState.overrideDtbpChecks : false, (268435455 & 16) != 0 ? startState.preserveUserInput : false, (268435455 & 32) != 0 ? startState.quantity : null, (268435455 & 64) != 0 ? startState.retryWhenAction : (Validator.Action.RetryWhen) action, (268435455 & 128) != 0 ? startState.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? startState.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? startState.source : null, (268435455 & 1024) != 0 ? startState.timeInForce : null, (268435455 & 2048) != 0 ? startState.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? startState.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? startState.userInputPrices : null, (268435455 & 16384) != 0 ? startState.validationPendingRequest : null, (268435455 & 32768) != 0 ? startState.validationFailure : null, (268435455 & 65536) != 0 ? startState.validationSkippedChecks : null, (268435455 & 131072) != 0 ? startState.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? startState.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? startState.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? startState.locality : null, (268435455 & 2097152) != 0 ? startState.orderPathExperiments : null, (268435455 & 4194304) != 0 ? startState.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? startState.tradingSession : null, (268435455 & 16777216) != 0 ? startState.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? startState.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? startState.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? startState.withShortenedVolatilityPeriod : false);
    }

    public final void submit(BrokerageAccountType analyticsAccountType, OptionOrderContext optionOrderContext, BigDecimal userEnteredLimitPriceForAnalytics, String chainSymbol, UUID orderId, OptionOrderMeta.Source source, MarketabilityType marketabilityType) {
        String string2;
        String string3;
        String string4;
        String string5;
        String chainTypeForLogging;
        BigDecimal askPriceForLogging;
        BigDecimal bidPriceForLogging;
        Intrinsics.checkNotNullParameter(analyticsAccountType, "analyticsAccountType");
        Intrinsics.checkNotNullParameter(optionOrderContext, "optionOrderContext");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(marketabilityType, "marketabilityType");
        UUID uuidSyncServerMarketability = syncServerMarketability(optionOrderContext);
        TraderEventLogger traderEventLogger = this.eventLogger;
        OrderFormStep orderFormStep = OrderFormStep.SUBMIT;
        ApiOptionOrderRequest apiRequest = optionOrderContext.getApiRequest();
        OptionOrderContext.QuoteAggregation quoteAggregation = optionOrderContext.getPrices().getQuoteAggregation();
        if (quoteAggregation == null || (bidPriceForLogging = quoteAggregation.getBidPriceForLogging()) == null || (string2 = bidPriceForLogging.toString()) == null) {
            string2 = "";
        }
        OptionOrderContext.QuoteAggregation quoteAggregation2 = optionOrderContext.getPrices().getQuoteAggregation();
        if (quoteAggregation2 == null || (askPriceForLogging = quoteAggregation2.getAskPriceForLogging()) == null || (string3 = askPriceForLogging.toString()) == null) {
            string3 = "";
        }
        DefaultPriceSetting rosettaValue = OptionSettings.DefaultPricingSetting.INSTANCE.toRosettaValue(optionOrderContext.getPrices().getDefaultPricingType());
        if (userEnteredLimitPriceForAnalytics == null || (string4 = userEnteredLimitPriceForAnalytics.toString()) == null) {
            string4 = "";
        }
        Companion companion = INSTANCE;
        String strategyCode = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getStrategyCode();
        String str = strategyCode == null ? "" : strategyCode;
        String str2 = chainSymbol == null ? "" : chainSymbol;
        if (orderId == null || (string5 = orderId.toString()) == null) {
            string5 = "";
        }
        int size = optionOrderContext.getLegContexts().size();
        OptionChainLandingPage optionChainLandingPage = null;
        String string6 = uuidSyncServerMarketability != null ? uuidSyncServerMarketability.toString() : null;
        String str3 = string6 == null ? "" : string6;
        OptionChainDisplayMode chainDisplayModeForLogging = ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getChainDisplayModeForLogging();
        traderEventLogger.logOptionOrderEvent(orderFormStep, apiRequest, new OptionOrderMeta(string2, string3, string4, source, str2, string5, null, null, size, null, null, null, null, marketabilityType, null, null, rosettaValue, str3, null, str, null, null, null, null, analyticsAccountType, null, null, (chainDisplayModeForLogging == null || (chainTypeForLogging = chainDisplayModeForLogging.toChainTypeForLogging()) == null) ? "" : chainTypeForLogging, ((OptionOrderFragment.Args) companion.getArgs((HasSavedState) this)).getOptionRelatedOrderData(), null, 653582016, null));
        int i = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
        if (i == 1) {
            optionChainLandingPage = OptionChainLandingPage.NEAREST_EXPIRATION_DATE;
        } else if (i == 2) {
            optionChainLandingPage = OptionChainLandingPage.STRATEGY_BUILDER;
        }
        OptionChainLandingPage optionChainLandingPage2 = optionChainLandingPage;
        if (optionChainLandingPage2 != null) {
            this.optionChainLandingPagePref.set(optionChainLandingPage2);
        }
        OrderSubmissionManager.submit$default(this.optionOrderManager, optionOrderContext.getApiRequest(), optionOrderContext, false, 4, null);
    }

    public final void onSwipeToSubmitAnimationStart() {
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.SWIPE_TO_SUBMIT_OPTION_CONFIRMATION, null, null, null, 14, null);
        this.optionOrderManager.setSwipeAnimationStarted();
    }

    public final void onSwipeToSubmitAnimationComplete() {
        this.optionOrderManager.setSwipeAnimationFinished();
    }

    public final void setQuantity(final BigDecimal shareQuantity, final boolean editedByUser) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setQuantity$lambda$85(editedByUser, shareQuantity, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setQuantity$lambda$85(boolean z, BigDecimal bigDecimal, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : z, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : bigDecimal, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void setLimitPrice(final LimitPriceWithSource newLimitPriceWithSource) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setLimitPrice$lambda$86(newLimitPriceWithSource, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setLimitPrice$lambda$86(LimitPriceWithSource limitPriceWithSource, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        LimitPriceWithSource limitPriceWithSourceInViewState = applyMutation.getUserInputPrices().getLimitPriceWithSourceInViewState();
        BigDecimal limitPrice = limitPriceWithSourceInViewState != null ? limitPriceWithSourceInViewState.getLimitPrice() : null;
        BigDecimal limitPrice2 = limitPriceWithSource != null ? limitPriceWithSource.getLimitPrice() : null;
        if (limitPrice == null && limitPrice2 == null) {
            return applyMutation;
        }
        if (limitPrice2 == null || limitPrice == null || limitPrice.compareTo(limitPrice2) != 0) {
            return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : limitPrice2 != null, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : applyMutation.getUserInputPrices().setLimitPriceWithSource(limitPriceWithSource), (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
        }
        return applyMutation;
    }

    public final void setOptionOrderType(final OptionOrderType optionOrderType, final boolean editedByUser) {
        Intrinsics.checkNotNullParameter(optionOrderType, "optionOrderType");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setOptionOrderType$lambda$87(editedByUser, optionOrderType, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setOptionOrderType$lambda$87(boolean z, OptionOrderType optionOrderType, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : z, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : OptionOrderType2.toDefaultUserInputPrices(optionOrderType), (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void setTimeInForce(final OrderTimeInForce timeInForce, final boolean editedByUser) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda82
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setTimeInForce$lambda$88(editedByUser, timeInForce, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setTimeInForce$lambda$88(boolean z, OrderTimeInForce orderTimeInForce, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : z, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : orderTimeInForce, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void setStopPriceInStopLimitOrder(final BigDecimal stopPrice) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda81
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setStopPriceInStopLimitOrder$lambda$89(stopPrice, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setStopPriceInStopLimitOrder$lambda$89(BigDecimal bigDecimal, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : bigDecimal != null, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : applyMutation.getUserInputPrices().setStopPriceForStopLimitOrder(bigDecimal), (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void cancelPendingCryptoOrders() {
        Single<R> singleFlatMap = this.cryptoPendingAndCancelStore.cancelAllBuySidePendingOrdersAndReturnResponse().flatMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.cancelPendingCryptoOrders.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Response<ApiCryptoCancelAllPendingOrders>> apply(final Response<ApiCryptoCancelAllPendingOrders> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Observable<R> map = OptionOrderDuxo.this.getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$cancelPendingCryptoOrders$1$apply$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Account account = ((OptionOrderViewState) it).getAccount();
                        return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((C29679xa680511b<T, R>) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Single<T> singleSingleOrError = ObservablesKt.filterIsPresent(map).take(1L).singleOrError();
                final OptionOrderDuxo optionOrderDuxo = OptionOrderDuxo.this;
                return singleSingleOrError.flatMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.cancelPendingCryptoOrders.1.2
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends ApiOptionsBuyingPower> apply(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return optionOrderDuxo.optionBuyingPowerStore.forceFetchOptionsBuyingPower(it);
                    }
                }).map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.cancelPendingCryptoOrders.1.3
                    @Override // io.reactivex.functions.Function
                    public final Response<ApiCryptoCancelAllPendingOrders> apply(ApiOptionsBuyingPower it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return response;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SingleDelay2.minTimeInFlight$default(singleFlatMap, 1000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda86
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.cancelPendingCryptoOrders$lambda$92(this.f$0, (Response) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelPendingCryptoOrders$lambda$92(OptionOrderDuxo optionOrderDuxo, final Response response) {
        final SufficientBuyingPowerCryptoFailure cancelResponse;
        if (!response.isSuccessful()) {
            cancelResponse = new SufficientBuyingPowerCryptoFailure.CancelResponseNetwork(optionOrderDuxo.eventLogger);
        } else {
            ApiCryptoCancelAllPendingOrders apiCryptoCancelAllPendingOrders = (ApiCryptoCancelAllPendingOrders) response.body();
            cancelResponse = (apiCryptoCancelAllPendingOrders == null || apiCryptoCancelAllPendingOrders.getTotal_pending_order_count() == apiCryptoCancelAllPendingOrders.getCanceled_pending_order_count()) ? null : new SufficientBuyingPowerCryptoFailure.CancelResponse(optionOrderDuxo.eventLogger, apiCryptoCancelAllPendingOrders.getCanceled_pending_order_count(), apiCryptoCancelAllPendingOrders.getTotal_pending_order_count());
        }
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.cancelPendingCryptoOrders$lambda$92$lambda$91(response, cancelResponse, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState cancelPendingCryptoOrders$lambda$92$lambda$91(Response response, SufficientBuyingPowerCryptoFailure sufficientBuyingPowerCryptoFailure, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : response, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : sufficientBuyingPowerCryptoFailure != null ? new UiEvent(sufficientBuyingPowerCryptoFailure) : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : sufficientBuyingPowerCryptoFailure == null ? applyMutation.getRetryWhenAction() : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void cancelBlockingOrders(final android.content.Context context, List<UUID> optionOrderRhIds, final String accountNumber) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(optionOrderRhIds, "optionOrderRhIds");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Completable completableFlatMapCompletable = Observable.fromIterable(optionOrderRhIds).flatMapCompletable(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.cancelBlockingOrders.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID orderRhId) {
                Intrinsics.checkNotNullParameter(orderRhId, "orderRhId");
                return OptionOrderDuxo.this.optionOrderStore.cancelOptionOrder(orderRhId, accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletableDelay2.minTimeInFlight$default(completableFlatMapCompletable, 1000L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.cancelBlockingOrders$lambda$94(context, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelBlockingOrders$lambda$94(android.content.Context context, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Toast.makeText(context, C29757R.string.option_cancels_failed_desc, 1).show();
        return Unit.INSTANCE;
    }

    public final void clearCancelPendingCryptoState() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda83
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.clearCancelPendingCryptoState$lambda$95((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState clearCancelPendingCryptoState$lambda$95(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void overrideDayTradeChecks() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.overrideDayTradeChecks$lambda$96((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState overrideDayTradeChecks$lambda$96(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : true, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void overrideDirection(final OrderDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda67
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.overrideDirection$lambda$97(direction, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState overrideDirection$lambda$97(OrderDirection orderDirection, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : orderDirection, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void overrideDtbpChecks() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.overrideDtbpChecks$lambda$98((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState overrideDtbpChecks$lambda$98(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : true, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void setPreserveUserInput(final boolean preserveUserInput) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setPreserveUserInput$lambda$99(preserveUserInput, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setPreserveUserInput$lambda$99(boolean z, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : z, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void clearOrderCheckOverride() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.clearOrderCheckOverride$lambda$100((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState clearOrderCheckOverride$lambda$100(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void setFormState(final DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setFormState$lambda$101(formState, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setFormState$lambda$101(DefaultOrderState defaultOrderState, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : defaultOrderState, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void runWithAnalytics(Function1<? super AnalyticsLogger, Unit> f) {
        Intrinsics.checkNotNullParameter(f, "f");
        f.invoke(this.analytics);
    }

    public final void finishPerformanceLogging() {
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.OPTION_ORDER, null, 2, null);
    }

    public static /* synthetic */ void logTapOptionOrderTypePicker$default(OptionOrderDuxo optionOrderDuxo, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        optionOrderDuxo.logTapOptionOrderTypePicker(str, str2);
    }

    public final void logTapOptionOrderTypePicker(String screenIdentifier, String buttonText) {
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Component.ComponentType componentType = Component.ComponentType.ORDER_TYPE_PICKER;
        TraderEventLogger traderEventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Screen.Name name = Screen.Name.OPTION_ORDER_FORM;
        EventLogger.DefaultImpls.logAppear$default(traderEventLogger, action, new Screen(name, null, screenIdentifier, null, 10, null), new Component(componentType, null, null, 6, null), null, buttonText != null ? new Context(0, 0, 0, buttonText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null) : null, 8, null);
        TraderEventLogger traderEventLogger2 = this.eventLogger;
        Screen screen = new Screen(name, null, null, null, 14, null);
        Component component = new Component(componentType, null, null, 6, null);
        String str = buttonText == null ? "" : buttonText;
        String string2 = ((OptionOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getOrderUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(traderEventLogger2, action, screen, component, null, new Context(0, 0, 0, str, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(null, null, null, string2, null, null, null, null, null, null, OptionOrderType2.toRosettaType(getStatesFlow().getValue().getUserInputPrices().getOptionOrderType()), null, null, null, 15351, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -4194305, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public final void setDebouncedLimitPrice(final BigDecimal debouncedLimitPrice) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.setDebouncedLimitPrice$lambda$103(debouncedLimitPrice, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState setDebouncedLimitPrice$lambda$103(BigDecimal bigDecimal, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : bigDecimal, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    private final UUID syncServerMarketability(OptionOrderContext optionOrderContext) {
        if (!optionOrderContext.shouldUseServerMarketability(this.clock)) {
            return null;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        LifecycleHost.DefaultImpls.bind$default(this, this.optionMarketabilityStore.getOptionOrderMarketability(OptionOrderContext.getApiOptionOrderPostBody$default(optionOrderContext, uuidRandomUUID.toString(), 0, null, optionOrderContext.shouldIncludeMaxOrderSizeImprovements(), null, 6, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        return uuidRandomUUID;
    }

    public final void logSingleLegMarketability(String orderId, MarketabilityType rosettaType) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(rosettaType, "rosettaType");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.TYPE, new Screen(Screen.Name.OPTION_ORDER_FORM, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(null, null, rosettaType, orderId, null, null, null, null, null, null, null, null, null, null, 16371, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), null, null, 108, null), false, false, 6, null);
    }

    public final void logReviewingReadyToSubmit() {
        PerformanceLogger.DefaultImpls.completeMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.REVIEW_OPTION_SWIPE_TO_SUBMIT, null, 2, null);
    }

    public final void logMarketabilityUiChange(String orderId, OptionOrderViewState.UiMarketability uiMarketability) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(uiMarketability, "uiMarketability");
        if (uiMarketability.getIsTagVisible()) {
            TraderEventLogger traderEventLogger = this.eventLogger;
            UserInteractionEventData.Action action = UserInteractionEventData.Action.EDIT;
            Screen screen = new Screen(Screen.Name.OPTION_ORDER_FORM, null, null, null, 14, null);
            Component component = new Component(Component.ComponentType.OPTION_ORDER_MARKETABILITY_TAG, null, null, 6, null);
            MarketabilityType rosettaType = uiMarketability.getMarketability().getMarketabilityType().getRosettaType();
            String requestId = uiMarketability.getMarketability().getRequestId();
            if (requestId == null) {
                requestId = "";
            }
            EventLogger.DefaultImpls.logAppear$default(traderEventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(null, null, rosettaType, orderId, null, null, null, null, null, requestId, null, null, null, null, 15859, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), 8, null);
        }
    }

    private final OptionOrderMeta state(OptionOrderMeta optionOrderMeta, OptionOrderViewState optionOrderViewState) {
        MarketabilityType rosettaType;
        String chainTypeForLogging;
        OptionOrderViewState.Marketability marketability;
        OptionOrderViewState.Marketability.MarketabilityType marketabilityType;
        OptionOrder optionOrder;
        UUID id;
        String string2;
        String string3;
        OptionOrderContext.Prices prices;
        OptionOrderContext.Prices prices2;
        OptionOrderContext.QuoteAggregation quoteAggregation;
        BigDecimal askPriceForLogging;
        String string4;
        OptionOrderContext.Prices prices3;
        OptionOrderContext.QuoteAggregation quoteAggregation2;
        BigDecimal bidPriceForLogging;
        String string5;
        OptionOrderContext optionOrderContext = optionOrderViewState.getOptionOrderContext();
        String str = (optionOrderContext == null || (prices3 = optionOrderContext.getPrices()) == null || (quoteAggregation2 = prices3.getQuoteAggregation()) == null || (bidPriceForLogging = quoteAggregation2.getBidPriceForLogging()) == null || (string5 = bidPriceForLogging.toString()) == null) ? "" : string5;
        OptionOrderContext optionOrderContext2 = optionOrderViewState.getOptionOrderContext();
        String str2 = (optionOrderContext2 == null || (prices2 = optionOrderContext2.getPrices()) == null || (quoteAggregation = prices2.getQuoteAggregation()) == null || (askPriceForLogging = quoteAggregation.getAskPriceForLogging()) == null || (string4 = askPriceForLogging.toString()) == null) ? "" : string4;
        OptionSettings.DefaultPricingSetting.Companion companion = OptionSettings.DefaultPricingSetting.INSTANCE;
        OptionOrderContext optionOrderContext3 = optionOrderViewState.getOptionOrderContext();
        DefaultPriceSetting rosettaValue = companion.toRosettaValue((optionOrderContext3 == null || (prices = optionOrderContext3.getPrices()) == null) ? null : prices.getDefaultPricingType());
        BigDecimal absoluteLimitPriceForAnalytics = optionOrderViewState.getUserInputPrices().getAbsoluteLimitPriceForAnalytics();
        String str3 = (absoluteLimitPriceForAnalytics == null || (string3 = absoluteLimitPriceForAnalytics.toString()) == null) ? "" : string3;
        Companion companion2 = INSTANCE;
        OptionOrderMeta.Source metaSource = OptionOrderSource.toMetaSource(((OptionOrderFragment.Args) companion2.getArgs((HasSavedState) this)).getSource());
        String strategyCode = ((OptionOrderFragment.Args) companion2.getArgs((HasSavedState) this)).getStrategyCode();
        String str4 = strategyCode == null ? "" : strategyCode;
        String chainSymbol = optionOrderViewState.getChainSymbol();
        String str5 = chainSymbol == null ? "" : chainSymbol;
        UiOptionOrder orderToReplace = ((OptionOrderFragment.Args) companion2.getArgs((HasSavedState) this)).getOrderToReplace();
        String str6 = (orderToReplace == null || (optionOrder = orderToReplace.getOptionOrder()) == null || (id = optionOrder.getId()) == null || (string2 = id.toString()) == null) ? "" : string2;
        OptionOrderViewState.UiMarketability uiMarketabilitySingleLegMarketabilityForLogging = optionOrderViewState.singleLegMarketabilityForLogging(this.clock);
        if (uiMarketabilitySingleLegMarketabilityForLogging == null || (marketability = uiMarketabilitySingleLegMarketabilityForLogging.getMarketability()) == null || (marketabilityType = marketability.getMarketabilityType()) == null || (rosettaType = marketabilityType.getRosettaType()) == null) {
            rosettaType = MarketabilityType.MARKETABILITY_UNSPECIFIED;
        }
        MarketabilityType marketabilityType2 = rosettaType;
        OptionChainDisplayMode chainDisplayModeForLogging = ((OptionOrderFragment.Args) companion2.getArgs((HasSavedState) this)).getChainDisplayModeForLogging();
        return optionOrderMeta.copy((268173311 & 1) != 0 ? optionOrderMeta.bid_price : str, (268173311 & 2) != 0 ? optionOrderMeta.ask_price : str2, (268173311 & 4) != 0 ? optionOrderMeta.entered_price : str3, (268173311 & 8) != 0 ? optionOrderMeta.source : metaSource, (268173311 & 16) != 0 ? optionOrderMeta.chain_symbol : str5, (268173311 & 32) != 0 ? optionOrderMeta.existing_order_id : str6, (268173311 & 64) != 0 ? optionOrderMeta.has_position : null, (268173311 & 128) != 0 ? optionOrderMeta.is_watching : null, (268173311 & 256) != 0 ? optionOrderMeta.num_legs : 0, (268173311 & 512) != 0 ? optionOrderMeta.adjusted_mark_price : null, (268173311 & 1024) != 0 ? optionOrderMeta.adjusted_mark_price_round_down : null, (268173311 & 2048) != 0 ? optionOrderMeta.adjusted_mark_price_min_tick : null, (268173311 & 4096) != 0 ? optionOrderMeta.adjusted_mark_price_round_down_min_tick : null, (268173311 & 8192) != 0 ? optionOrderMeta.marketability : marketabilityType2, (268173311 & 16384) != 0 ? optionOrderMeta.prev_order_state : null, (268173311 & 32768) != 0 ? optionOrderMeta.current_order_state : null, (268173311 & 65536) != 0 ? optionOrderMeta.default_price_setting : rosettaValue, (268173311 & 131072) != 0 ? optionOrderMeta.marketability_request_id : null, (268173311 & 262144) != 0 ? optionOrderMeta.order_check_data : null, (268173311 & 524288) != 0 ? optionOrderMeta.strategy_code : str4, (268173311 & 1048576) != 0 ? optionOrderMeta.tmp_round_experiment_no_round_price : null, (268173311 & 2097152) != 0 ? optionOrderMeta.tmp_round_experiment_mark_round_price : null, (268173311 & 4194304) != 0 ? optionOrderMeta.tmp_round_experiment_min_tick_round_price : null, (268173311 & 8388608) != 0 ? optionOrderMeta.tmp_round_experiment_mark_and_min_tick_round_price : null, (268173311 & 16777216) != 0 ? optionOrderMeta.account_type : null, (268173311 & 33554432) != 0 ? optionOrderMeta.previous_quantity : null, (268173311 & 67108864) != 0 ? optionOrderMeta.option_order_type : null, (268173311 & 134217728) != 0 ? optionOrderMeta.chain_type : (chainDisplayModeForLogging == null || (chainTypeForLogging = chainDisplayModeForLogging.toChainTypeForLogging()) == null) ? "" : chainTypeForLogging, (268173311 & 268435456) != 0 ? optionOrderMeta.related_order_data : ((OptionOrderFragment.Args) companion2.getArgs((HasSavedState) this)).getOptionRelatedOrderData(), (268173311 & 536870912) != 0 ? optionOrderMeta.unknownFields() : null);
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.optionAccountSwitcherStore.setActiveAccountNumber(accountNumber);
    }

    public final void refreshAccountSwitcher() {
        Observable<R> observableSwitchMap = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.refreshAccountSwitcher.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getAccountSwitcherType() != null;
            }
        }).take(1L).switchMap(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.refreshAccountSwitcher.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<OptionAccountSwitcherStore6, OptionsAccountSwitcherType>> apply(final OptionOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return OptionOrderDuxo.this.optionAccountSwitcherStore.forceFetchAccountSwitcher(state.getOptionsAccountSwitcherId()).map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo.refreshAccountSwitcher.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<OptionAccountSwitcherStore6, OptionsAccountSwitcherType> apply(OptionAccountSwitcherStore6 it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        OptionsAccountSwitcherType accountSwitcherType = state.getAccountSwitcherType();
                        Intrinsics.checkNotNull(accountSwitcherType);
                        return Tuples4.m3642to(it, accountSwitcherType);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.refreshAccountSwitcher$lambda$105(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAccountSwitcher$lambda$105(OptionOrderDuxo optionOrderDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final OptionAccountSwitcherStore6 optionAccountSwitcherStore6 = (OptionAccountSwitcherStore6) objComponent1;
        final OptionsAccountSwitcherType optionsAccountSwitcherType = (OptionsAccountSwitcherType) tuples2.component2();
        optionOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.refreshAccountSwitcher$lambda$105$lambda$104(optionAccountSwitcherStore6, optionsAccountSwitcherType, (OptionOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState refreshAccountSwitcher$lambda$105$lambda$104(OptionAccountSwitcherStore6 optionAccountSwitcherStore6, OptionsAccountSwitcherType optionsAccountSwitcherType, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (optionAccountSwitcherStore6 instanceof OptionAccountSwitcherStore6.Failure) {
            return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : new UiEvent(new Either.Right(((OptionAccountSwitcherStore6.Failure) optionAccountSwitcherStore6).getThrowable())), ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
        }
        if (Intrinsics.areEqual(optionAccountSwitcherStore6, OptionAccountSwitcherStore6.Loading.INSTANCE)) {
            return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : true, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
        }
        if (!(optionAccountSwitcherStore6 instanceof OptionAccountSwitcherStore6.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        OptionAccountSwitcherStore6.Success success = (OptionAccountSwitcherStore6.Success) optionAccountSwitcherStore6;
        ApiOptionsAccountSwitcherModel viewModel = OptionsAccountSwitcher2.getViewModel(success.getSwitcher(), optionsAccountSwitcherType);
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : (applyMutation.getAccount() == null || viewModel == null) ? null : new UiEvent(new Either.Left(AccountSwitchers.toAccountSwitcherData(viewModel, applyMutation.getAccount().getAccountNumber(), new Screen(Screen.Name.OPTION_ORDER_FORM, null, null, null, 14, null)))), ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : success.getSwitcher(), ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onBidDebugInputChanged$lambda$106(String str, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : OptionOrderBidAskBarDataState.copy$default(applyMutation.getBidAskBarDataState(), str, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void onBidDebugInputChanged(final String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onBidDebugInputChanged$lambda$106(value, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onMarkDebugInputChanged$lambda$107(String str, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : OptionOrderBidAskBarDataState.copy$default(applyMutation.getBidAskBarDataState(), null, str, null, null, null, null, null, 125, null), ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void onMarkDebugInputChanged(final String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda85
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onMarkDebugInputChanged$lambda$107(value, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onAskDebugInputChanged$lambda$108(String str, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : OptionOrderBidAskBarDataState.copy$default(applyMutation.getBidAskBarDataState(), null, null, str, null, null, null, null, 123, null), ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void onAskDebugInputChanged(final String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onAskDebugInputChanged$lambda$108(value, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onBidAskBarCanvasWidthUpdated$lambda$109(float f, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : OptionOrderBidAskBarDataState.copy$default(applyMutation.getBidAskBarDataState(), null, null, null, null, Float.valueOf(f), null, null, 111, null), ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void onBidAskBarCanvasWidthUpdated(final float width) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onBidAskBarCanvasWidthUpdated$lambda$109(width, (OptionOrderViewState) obj);
            }
        });
    }

    public final void onBidAskBarTouchEvent(final OptionOrderBidAskBarViewState3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onBidAskBarTouchEvent$lambda$111(event, this, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onBidAskBarTouchEvent$lambda$111(OptionOrderBidAskBarViewState3 optionOrderBidAskBarViewState3, OptionOrderDuxo optionOrderDuxo, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Tuples2<BigDecimal, OptionOrderBidAskBarViewState4> updatedLimitPriceAndSnapTypeFromBidAskBar = applyMutation.getUpdatedLimitPriceAndSnapTypeFromBidAskBar(optionOrderBidAskBarViewState3);
        BigDecimal bigDecimalComponent1 = updatedLimitPriceAndSnapTypeFromBidAskBar.component1();
        OptionOrderBidAskBarViewState4 optionOrderBidAskBarViewState4Component2 = updatedLimitPriceAndSnapTypeFromBidAskBar.component2();
        if (bigDecimalComponent1 == null) {
            return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : OptionOrderBidAskBarDataState.copy$default(applyMutation.getBidAskBarDataState(), null, null, null, null, null, optionOrderBidAskBarViewState3, null, 95, null), ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
        }
        OptionOrderBidAskBarLoggingState optionOrderBidAskBarLoggingState = applyMutation.getOptionOrderBidAskBarLoggingState(optionOrderBidAskBarViewState3, bigDecimalComponent1);
        if (optionOrderBidAskBarLoggingState != null) {
            OptionOrderLoggings.logOptionOrderBidAskBarInteraction(optionOrderDuxo.eventLogger, optionOrderBidAskBarLoggingState);
        }
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : OptionOrderBidAskBarDataState.copy$default(applyMutation.getBidAskBarDataState(), null, null, null, optionOrderBidAskBarViewState4Component2, null, optionOrderBidAskBarViewState3, applyMutation.getBidAskBarHapticFeedbackUiEvent(bigDecimalComponent1, optionOrderBidAskBarViewState3), 23, null), ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : true, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : applyMutation.getUserInputPrices().setLimitPriceWithSource(new LimitPriceWithSource(bigDecimalComponent1, OptionOrderLimitPrice.BID_ASK_BAR)), (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void onStopTriggerPriceTextInputValueChange(final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onStopTriggerPriceTextInputValueChange$lambda$112(newValue, (OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onStopTriggerPriceTextInputValueChange$lambda$112(String str, OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : true, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : applyMutation.getUserInputPrices().setStopPriceTextForStopMarket(str), (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1", m3645f = "OptionOrderDuxo.kt", m3646l = {1319}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1 */
    static final class C297171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C297171(Continuation<? super C297171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDuxo.this.new C297171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderViewState> statesFlow = OptionOrderDuxo.this.getStatesFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionOrderType>() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionOrderType> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionOrderType optionOrderType = ((OptionOrderViewState) obj).getUserInputPrices().getOptionOrderType();
                                if (optionOrderType != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionOrderType, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOrderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OptionOrderType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1$2", m3645f = "OptionOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$updateTotalCostRowCollapsedState$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionOrderType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOrderDuxo optionOrderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOrderType optionOrderType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionOrderType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionOrderLoggings.logOptionOrderToggleFeesRow(this.this$0.eventLogger, (OptionOrderType) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void updateTotalCostRowCollapsedState() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297171(null), 3, null);
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.updateTotalCostRowCollapsedState$lambda$113((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState updateTotalCostRowCollapsedState$lambda$113(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : !applyMutation.getTotalCostRowCollapsed(), (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void requestFocusStopTriggerPrice() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.requestFocusStopTriggerPrice$lambda$114((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState requestFocusStopTriggerPrice$lambda$114(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : true, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    public final void onStopPriceFocused() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.onStopPriceFocused$lambda$115((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState onStopPriceFocused$lambda$115(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1", m3645f = "OptionOrderDuxo.kt", m3646l = {1346}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1 */
    static final class C296901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderTimeInForce $timeInForce;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C296901(OrderTimeInForce orderTimeInForce, Continuation<? super C296901> continuation) {
            super(2, continuation);
            this.$timeInForce = orderTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderDuxo.this.new C296901(this.$timeInForce, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderViewState> statesFlow = OptionOrderDuxo.this.getStatesFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionOrderType>() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionOrderType> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionOrderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionOrderType optionOrderType = ((OptionOrderViewState) obj).getUserInputPrices().getOptionOrderType();
                                if (optionOrderType != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionOrderType, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOrderDuxo.this, this.$timeInForce, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OptionOrderType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1$2", m3645f = "OptionOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderDuxo$logTapTimeInForce$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionOrderType, Continuation<? super Unit>, Object> {
            final /* synthetic */ OrderTimeInForce $timeInForce;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOrderDuxo optionOrderDuxo, OrderTimeInForce orderTimeInForce, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderDuxo;
                this.$timeInForce = orderTimeInForce;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$timeInForce, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOrderType optionOrderType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionOrderType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionOrderLoggings.logTapTimeInForce(this.this$0.eventLogger, (OptionOrderType) this.L$0, this.$timeInForce);
                return Unit.INSTANCE;
            }
        }
    }

    public final void logTapTimeInForce(OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296901(timeInForce, null), 3, null);
    }

    public final void recordOptionsMarketTooltipSeen() {
        this.optionOrderMarketTooltipPref.set(false);
    }

    public final void dismissOptionsMarketTooltip() {
        this.optionOrderMarketTooltipPref.set(false);
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderDuxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDuxo.dismissOptionsMarketTooltip$lambda$116((OptionOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOrderViewState dismissOptionsMarketTooltip$lambda$116(OptionOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2049) & 1) != 0 ? applyMutation.account : null, ((-2049) & 2) != 0 ? applyMutation.accountSwitcherRefreshedEvent : null, ((-2049) & 4) != 0 ? applyMutation.allAccounts : null, ((-2049) & 8) != 0 ? applyMutation.bidAskBarDataState : null, ((-2049) & 16) != 0 ? applyMutation.cryptoCancelAllPendingOrdersResponse : null, ((-2049) & 32) != 0 ? applyMutation.cryptoCancelAllPendingOrdersFailure : null, ((-2049) & 64) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-2049) & 128) != 0 ? applyMutation.debouncedLimitPrice : null, ((-2049) & 256) != 0 ? applyMutation.editedForm : false, ((-2049) & 512) != 0 ? applyMutation.equityQuote : null, ((-2049) & 1024) != 0 ? applyMutation.formState : null, ((-2049) & 2048) != 0 ? applyMutation.indexValue : null, ((-2049) & 4096) != 0 ? applyMutation.initialFocusLimitPriceEvent : null, ((-2049) & 8192) != 0 ? applyMutation.initialFocusStopPriceEvent : null, ((-2049) & 16384) != 0 ? applyMutation.initializeOrderToReplaceEvent : null, ((-2049) & 32768) != 0 ? applyMutation.initializePrefilledQuantityEvent : null, ((-2049) & 65536) != 0 ? applyMutation.initializePrefilledOrderTypeEvent : null, ((-2049) & 131072) != 0 ? applyMutation.initializePrefilledTimeInForceEvent : null, ((-2049) & 262144) != 0 ? applyMutation.isInMaxOrderSizeImprovementExperiment : false, ((-2049) & 524288) != 0 ? applyMutation.isInLatencyDecreaseExperiment : false, ((-2049) & 1048576) != 0 ? applyMutation.isInNomenclatureExperiment : false, ((-2049) & 2097152) != 0 ? applyMutation.lastRefreshedProfitLossParams : null, ((-2049) & 4194304) != 0 ? applyMutation.loadingAccountSwitcher : false, ((-2049) & 8388608) != 0 ? applyMutation.marketHours : null, ((-2049) & 16777216) != 0 ? applyMutation.serverDrivenMarketability : null, ((-2049) & 33554432) != 0 ? applyMutation.numberOfChecksSeen : 0, ((-2049) & 67108864) != 0 ? applyMutation.optionOrderBundle : null, ((-2049) & 134217728) != 0 ? applyMutation.optionOrderContext : null, ((-2049) & 268435456) != 0 ? applyMutation.optionsAccountSwitcher : null, ((-2049) & 536870912) != 0 ? applyMutation.optionsBuyingPower : null, ((-2049) & 1073741824) != 0 ? applyMutation.optionsDisplayedBuyingPower : null, ((-2049) & Integer.MIN_VALUE) != 0 ? applyMutation.optionsValuationTradeFlowM1Variant : null, (268435455 & 1) != 0 ? applyMutation.orderToReplace : null, (268435455 & 2) != 0 ? applyMutation.overrideDayTradeChecks : false, (268435455 & 4) != 0 ? applyMutation.overrideDirection : null, (268435455 & 8) != 0 ? applyMutation.overrideDtbpChecks : false, (268435455 & 16) != 0 ? applyMutation.preserveUserInput : false, (268435455 & 32) != 0 ? applyMutation.quantity : null, (268435455 & 64) != 0 ? applyMutation.retryWhenAction : null, (268435455 & 128) != 0 ? applyMutation.shouldShowMarketDiscovery : false, (268435455 & 256) != 0 ? applyMutation.shouldShowOptionsMarketTooltip : false, (268435455 & 512) != 0 ? applyMutation.source : null, (268435455 & 1024) != 0 ? applyMutation.timeInForce : null, (268435455 & 2048) != 0 ? applyMutation.totalCostRowCollapsed : false, (268435455 & 4096) != 0 ? applyMutation.uiOptionOrderFee : null, (268435455 & 8192) != 0 ? applyMutation.userInputPrices : null, (268435455 & 16384) != 0 ? applyMutation.validationPendingRequest : null, (268435455 & 32768) != 0 ? applyMutation.validationFailure : null, (268435455 & 65536) != 0 ? applyMutation.validationSkippedChecks : null, (268435455 & 131072) != 0 ? applyMutation.shouldRequestFocusStopTriggerPrice : false, (268435455 & 262144) != 0 ? applyMutation.shouldIncludeCatFee : false, (268435455 & 524288) != 0 ? applyMutation.shouldShowCatFeeNewCopy : false, (268435455 & 1048576) != 0 ? applyMutation.locality : null, (268435455 & 2097152) != 0 ? applyMutation.orderPathExperiments : null, (268435455 & 4194304) != 0 ? applyMutation.inIndexOptionsCurbHoursExperiment : false, (268435455 & 8388608) != 0 ? applyMutation.tradingSession : null, (268435455 & 16777216) != 0 ? applyMutation.indexOptionsSingleLegOrderSummaryUpdatesVariant : null, (268435455 & 33554432) != 0 ? applyMutation.presentQuickConversionSheet : null, (268435455 & 67108864) != 0 ? applyMutation.useSduiAccountSwitcher : false, (268435455 & 134217728) != 0 ? applyMutation.withShortenedVolatilityPeriod : false);
    }

    /* compiled from: OptionOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$Args;", "<init>", "()V", "OPTION_ORDER_MULTI_LEG_MARKETABILITY_RESET_TIME", "", "OPTION_ORDER_CHECK_TIMEOUT_TIME", "sdocImprovementExperiments", "", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "getSdocImprovementExperiments", "()Ljava/util/List;", "appendSkippedCheck", "", "", "overrideNameForSkipAction", "appendSkippedCheck$feature_trade_options_externalDebug", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOrderDuxo, OptionOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionOrderFragment.Args getArgs(OptionOrderDuxo optionOrderDuxo) {
            return (OptionOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionOrderDuxo);
        }

        public final List<Experiment<SimpleVariant>> getSdocImprovementExperiments() {
            return OptionOrderDuxo.sdocImprovementExperiments;
        }

        public final Set<String> appendSkippedCheck$feature_trade_options_externalDebug(Set<String> set, String str) {
            Intrinsics.checkNotNullParameter(set, "<this>");
            return str != null ? SetsKt.plus(set, str) : set;
        }
    }
}
