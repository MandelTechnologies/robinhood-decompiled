package com.robinhood.android.optionschain;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.OptionChainSource;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarState;
import com.robinhood.android.indexes.models.api.ApiIndexCloseDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import com.robinhood.android.optionchain.chainsettings.OptionChainEntryPointType;
import com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLogging;
import com.robinhood.android.optionchain.extensions.CompareOptionInstrumentForDisplay;
import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.OptionChainDuxo;
import com.robinhood.android.optionschain.OptionChainViewState;
import com.robinhood.android.optionschain.extensions.OptionChainPerf;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
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
import com.robinhood.librobinhood.data.prefs.OptionChainMultipleUnderlyingsTooltipPref;
import com.robinhood.librobinhood.data.prefs.OptionChainSettingsPnlChartTypePref;
import com.robinhood.librobinhood.data.prefs.OptionChainSettleOnOpenTooltipPref;
import com.robinhood.librobinhood.data.prefs.OptionChainSimulatedReturnSwitchChartTooltipShownPref;
import com.robinhood.librobinhood.data.prefs.OptionChainSwitchFocusedToSbsTooltipDismissedPref;
import com.robinhood.librobinhood.data.prefs.OptionPreTradeSimulatedReturnChartShownPref;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionChainLandingPageUnderlyingState;
import com.robinhood.librobinhood.data.store.OptionChainLandingStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionOrderFilterStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.OptionTooltipDisplayBehavior;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.models.p320db.OptionStrategyBuilderNuxStates;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionSimple;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionChains;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import rosetta.option.OptionType;
import rosetta.order.Side;

/* compiled from: OptionChainDuxo.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Ã\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002Ã\u0001B\u0093\u0002\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\b\b\u0001\u00103\u001a\u000202\u0012\b\b\u0001\u00104\u001a\u000202\u0012\b\b\u0001\u00105\u001a\u000202\u0012\b\b\u0001\u00106\u001a\u000202\u0012\b\b\u0001\u00107\u001a\u000202\u0012\u000e\b\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00020908\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0017\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\u00020C2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020C2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010P\u001a\u00020C2\u0006\u0010O\u001a\u00020N2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020CH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020CH\u0016¢\u0006\u0004\bT\u0010SJ\u000f\u0010U\u001a\u00020CH\u0016¢\u0006\u0004\bU\u0010SJ\u0015\u0010W\u001a\u00020C2\u0006\u0010V\u001a\u00020A¢\u0006\u0004\bW\u0010EJ\u0015\u0010Z\u001a\u00020C2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\u00020C2\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020C2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020C2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ\u0015\u0010j\u001a\u00020C2\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ\u0015\u0010n\u001a\u00020C2\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ\u0015\u0010r\u001a\u00020C2\u0006\u0010q\u001a\u00020p¢\u0006\u0004\br\u0010sJ\u0015\u0010t\u001a\u00020C2\u0006\u0010q\u001a\u00020p¢\u0006\u0004\bt\u0010sJ\r\u0010u\u001a\u00020C¢\u0006\u0004\bu\u0010SJ\r\u0010v\u001a\u00020C¢\u0006\u0004\bv\u0010SJ\r\u0010w\u001a\u00020C¢\u0006\u0004\bw\u0010SJ\r\u0010x\u001a\u00020C¢\u0006\u0004\bx\u0010SJ\u0017\u0010{\u001a\u00020C2\b\u0010z\u001a\u0004\u0018\u00010y¢\u0006\u0004\b{\u0010|J\u0015\u0010}\u001a\u00020C2\u0006\u0010}\u001a\u00020d¢\u0006\u0004\b}\u0010gJ\u0018\u0010\u0080\u0001\u001a\u00020C2\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u000f\u0010\u0082\u0001\u001a\u00020C¢\u0006\u0005\b\u0082\u0001\u0010SJ\u000f\u0010\u0083\u0001\u001a\u00020C¢\u0006\u0005\b\u0083\u0001\u0010SJ\u000f\u0010\u0084\u0001\u001a\u00020C¢\u0006\u0005\b\u0084\u0001\u0010SJ\u000f\u0010\u0085\u0001\u001a\u00020C¢\u0006\u0005\b\u0085\u0001\u0010SJ\u000f\u0010\u0086\u0001\u001a\u00020C¢\u0006\u0005\b\u0086\u0001\u0010SJ\u000f\u0010\u0087\u0001\u001a\u00020C¢\u0006\u0005\b\u0087\u0001\u0010SJ\u000f\u0010\u0088\u0001\u001a\u00020C¢\u0006\u0005\b\u0088\u0001\u0010SJ\u0018\u0010\u008a\u0001\u001a\u00020C2\u0007\u0010\u0089\u0001\u001a\u00020d¢\u0006\u0005\b\u008a\u0001\u0010gJ\u0018\u0010\u008c\u0001\u001a\u00020C2\u0007\u0010\u008b\u0001\u001a\u00020d¢\u0006\u0005\b\u008c\u0001\u0010gJ\u000f\u0010\u008d\u0001\u001a\u00020C¢\u0006\u0005\b\u008d\u0001\u0010SJ\u001a\u0010\u0090\u0001\u001a\u00020C2\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u00020C¢\u0006\u0005\b\u0092\u0001\u0010SJ\u000f\u0010\u0093\u0001\u001a\u00020C¢\u0006\u0005\b\u0093\u0001\u0010SJ\u000f\u0010\u0094\u0001\u001a\u00020C¢\u0006\u0005\b\u0094\u0001\u0010SJ\u000f\u0010\u0095\u0001\u001a\u00020C¢\u0006\u0005\b\u0095\u0001\u0010SJ\u000f\u0010\u0096\u0001\u001a\u00020C¢\u0006\u0005\b\u0096\u0001\u0010SJ\u001a\u0010\u0099\u0001\u001a\u00020C2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u000f\u0010\u009b\u0001\u001a\u00020C¢\u0006\u0005\b\u009b\u0001\u0010SJ\u000f\u0010\u009c\u0001\u001a\u00020C¢\u0006\u0005\b\u009c\u0001\u0010SJ\u0018\u0010\u009e\u0001\u001a\u00020C2\u0007\u0010\u009d\u0001\u001a\u00020d¢\u0006\u0005\b\u009e\u0001\u0010gJ\u000f\u0010\u009f\u0001\u001a\u00020C¢\u0006\u0005\b\u009f\u0001\u0010SR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010 \u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¡\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010¢\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010£\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010¤\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¥\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010¦\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010§\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¨\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010©\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010ª\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010«\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010¬\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u00ad\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010®\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010¯\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010°\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010±\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010²\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010³\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010´\u0001R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010µ\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010¶\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010·\u0001R\u0015\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010·\u0001R\u0015\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010·\u0001R\u0015\u00106\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010·\u0001R\u0015\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010·\u0001R\u001b\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010¸\u0001R\u0015\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010¹\u0001R\u001d\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b>\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R \u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020N0½\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001¨\u0006Ä\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/optionschain/OptionChainViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;", "optionOrderFilterStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionChainLandingStore;", "optionChainLandingStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "showMultipleUnderlyingsTooltipPref", "showSettleOnOpenTooltipPref", "optionChainSwitchFocusedToSbsTooltipDismissedPref", "optionPreTradeSimulatedReturnChartShownPref", "simulatedReturnSwitchChartTooltipShownPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "optionChainSettingsPnlChartTypePref", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionChainLandingStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/EnumPreference;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/models/db/OptionOrderFilter;", "initialFilter", "", "initializeInitialFilter", "(Lcom/robinhood/models/db/OptionOrderFilter;)V", "Lcom/robinhood/models/api/OptionTooltipDisplayBehavior;", "displayBehavior", "autoDismissIfNeeded", "(Lcom/robinhood/models/api/OptionTooltipDisplayBehavior;)V", "Ljava/util/UUID;", "optionChainId", "clearOptionPerformanceMetrics", "(Ljava/util/UUID;)V", "", "sideOrType", "logTapChangeSideOrContractType", "(Ljava/lang/String;Ljava/util/UUID;)V", "onCreate", "()V", "onStart", "onResume", "optionOrderFilter", "setOptionOrderFilter", "Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;", "chainScrollTarget", "setScrollTarget", "(Lcom/robinhood/android/optionschain/OptionChainViewState$ChainScrollTarget;)V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "setCurrentPage", "(I)V", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPricingSetting", "setDefaultPricingSetting", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;)V", "", "dismissed", "setNuxSearchDismissed", "(Z)V", "Lcom/robinhood/models/db/OrderSide;", "side", "onSideSelected", "(Lcom/robinhood/models/db/OrderSide;)V", "Lcom/robinhood/models/db/OptionContractType;", "contractType", "onContractTypeSelected", "(Lcom/robinhood/models/db/OptionContractType;)V", "Lcom/robinhood/models/ui/OptionLegBundle;", "optionLegBundle", "onMultilegAdd", "(Lcom/robinhood/models/ui/OptionLegBundle;)V", "onMultilegRemove", "clearMultilegSelection", "turnOnTradeOnExpirationSettingForDiscoverZeroDte", "dismissDiscoverZeroDteSnackbar", "recordSeenDiscoverZeroDteBottomSheet", "Lcom/robinhood/models/db/OptionStrategyBuilder$SentimentFilter;", "sentiment", "setSentiment", "(Lcom/robinhood/models/db/OptionStrategyBuilder$SentimentFilter;)V", "isDay", "Lcom/robinhood/models/db/OptionTooltip;", "tooltip", "setTooltipSeen", "(Lcom/robinhood/models/db/OptionTooltip;)V", "setTooltipTapped", "setMultipleUnderlyingsTooltipSeen", "dismissMultipleUnderlyingsTooltip", "setSettleOnOpenTooltipSeen", "dismissSettleOnOpenTooltip", "setSwitchFocusedToSbsTooltipSeen", "dismissSwitchFocusedToSbsTooltip", "withDelay", "dismissSimulatedReturnSwitchChartTooltip", "requireL2", "dismissTopTooltipBanner", "logMultilegClearTap", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;", "contractSelectorLaunchMode", "logRollingContractSelectorAppear", "(Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;)V", "logOptionChainSettingsTap", "dismissSelloutSnackbar", "markSelloutSnackbarDismissedOrElapsed", "startSelloutSnackbarTimer", "cancelSnackbarTimer", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "chainCustomizationErrorEvent", "logCustomizationSnackbar", "(Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;)V", "logOptionsPagesLoaded", "logFragmentRecreated", "onboardingSearchSelectorVisible", "setIsOnboardingSearchSelectorVisible", "decrementNuxBlink", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/android/indexes/store/IndexStore;", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainLandingStore;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/prefs/EnumPreference;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lio/reactivex/Observable;", "accountNumberObs", "Lio/reactivex/Observable;", "Lkotlinx/coroutines/Job;", "snackbarTimerJob", "Lkotlinx/coroutines/Job;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainDuxo extends OldBaseDuxo<OptionChainViewState> implements HasSavedState {
    public static final String ARG_OPTION_CHAIN_CONFIGURATION = "argOptionChainConfiguration";
    private Observable<String> accountNumberObs;
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final Clock clock;
    private final InstrumentStore equityInstrumentStore;
    private final QuoteStore equityQuoteStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final IndexStore indexStore;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore;
    private final OptionChainCustomizationStore optionChainCustomizationStore;
    private final OptionChainLandingStore optionChainLandingStore;
    private final EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref;
    private final BooleanPreference optionChainSwitchFocusedToSbsTooltipDismissedPref;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionOrderFilterStore optionOrderFilterStore;
    private final OptionPositionStore optionPositionStore;
    private final BooleanPreference optionPreTradeSimulatedReturnChartShownPref;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSideBySideChainStore optionSideBySideChainStore;
    private final OptionStrategyBuilderStore optionStrategyBuilderStore;
    private final OptionTooltipStore optionTooltipStore;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final PerformanceLogger performanceLogger;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference showMultipleUnderlyingsTooltipPref;
    private final BooleanPreference showSettleOnOpenTooltipPref;
    private final BooleanPreference simulatedReturnSwitchChartTooltipShownPref;
    private Job snackbarTimerJob;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionChainDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, InstrumentStore equityInstrumentStore, QuoteStore equityQuoteStore, ExperimentsStore experimentsStore, EventLogger eventLogger, IndexStore indexStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionMarketHoursStore optionMarketHoursStore, OptionOrderFilterStore optionOrderFilterStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionSettingsStore optionSettingsStore, OptionStrategyBuilderStore optionStrategyBuilderStore, OptionTooltipStore optionTooltipStore, OptionInstrumentStore optionInstrumentStore, OptionChainLandingStore optionChainLandingStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, PerformanceLogger performanceLogger, RegionGateProvider regionGateProvider, @OptionChainMultipleUnderlyingsTooltipPref BooleanPreference showMultipleUnderlyingsTooltipPref, @OptionChainSettleOnOpenTooltipPref BooleanPreference showSettleOnOpenTooltipPref, @OptionChainSwitchFocusedToSbsTooltipDismissedPref BooleanPreference optionChainSwitchFocusedToSbsTooltipDismissedPref, @OptionPreTradeSimulatedReturnChartShownPref BooleanPreference optionPreTradeSimulatedReturnChartShownPref, @OptionChainSimulatedReturnSwitchChartTooltipShownPref BooleanPreference simulatedReturnSwitchChartTooltipShownPref, @OptionChainSettingsPnlChartTypePref EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref, Clock clock, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionOrderFilterStore, "optionOrderFilterStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
        Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionChainLandingStore, "optionChainLandingStore");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(showMultipleUnderlyingsTooltipPref, "showMultipleUnderlyingsTooltipPref");
        Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
        Intrinsics.checkNotNullParameter(optionChainSwitchFocusedToSbsTooltipDismissedPref, "optionChainSwitchFocusedToSbsTooltipDismissedPref");
        Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
        Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
        Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        InternalOptionChainFragmentKey internalOptionChainFragmentKey = (InternalOptionChainFragmentKey) INSTANCE.getArgs(savedStateHandle);
        OptionChainLaunchMode launchMode = internalOptionChainFragmentKey.getLaunchMode();
        ImmutableList immutableList = extensions2.toImmutableList(internalOptionChainFragmentKey.getUiOptionChains());
        OptionChainLaunchMode launchMode2 = internalOptionChainFragmentKey.getLaunchMode();
        OptionChainLaunchMode.RollingContractSelector rollingContractSelector = launchMode2 instanceof OptionChainLaunchMode.RollingContractSelector ? (OptionChainLaunchMode.RollingContractSelector) launchMode2 : null;
        UiEvent uiEvent = rollingContractSelector != null ? new UiEvent(rollingContractSelector.getOptionInstrumentToRoll()) : null;
        StrategyBuilderSentiment selectedSentiment = internalOptionChainFragmentKey.getSelectedSentiment();
        OptionChainConfiguration optionChainConfiguration = (OptionChainConfiguration) savedStateHandle.get(ARG_OPTION_CHAIN_CONFIGURATION);
        OptionChainConfiguration optionChainConfiguration2 = optionChainConfiguration == null ? new OptionChainConfiguration(null, 1, null) : optionChainConfiguration;
        OptionChainExpirationDateState targetExpirationDate = internalOptionChainFragmentKey.getTargetExpirationDate();
        super(new OptionChainViewState(null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, false, null, false, launchMode, false, immutableList, null, null, optionChainConfiguration2, uiEvent, null, null, null, null, null, !internalOptionChainFragmentKey.getTargetLegs().isEmpty() ? new UiEvent(internalOptionChainFragmentKey.getTargetLegs()) : null, targetExpirationDate != null ? new UiEvent(targetExpirationDate) : null, null, null, selectedSentiment, null, null, null, null, null, null, null, null, null, false, null, null, false, false, false, false, false, false, null, null, false, false, false, false, 0, false, false, -105906177, -20, null), null, 2, null);
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.equityInstrumentStore = equityInstrumentStore;
        this.equityQuoteStore = equityQuoteStore;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.indexStore = indexStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionChainCustomizationDiscoveryStore = optionChainCustomizationDiscoveryStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionOrderFilterStore = optionOrderFilterStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionStrategyBuilderStore = optionStrategyBuilderStore;
        this.optionTooltipStore = optionTooltipStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionChainLandingStore = optionChainLandingStore;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.performanceLogger = performanceLogger;
        this.regionGateProvider = regionGateProvider;
        this.showMultipleUnderlyingsTooltipPref = showMultipleUnderlyingsTooltipPref;
        this.showSettleOnOpenTooltipPref = showSettleOnOpenTooltipPref;
        this.optionChainSwitchFocusedToSbsTooltipDismissedPref = optionChainSwitchFocusedToSbsTooltipDismissedPref;
        this.optionPreTradeSimulatedReturnChartShownPref = optionPreTradeSimulatedReturnChartShownPref;
        this.simulatedReturnSwitchChartTooltipShownPref = simulatedReturnSwitchChartTooltipShownPref;
        this.optionChainSettingsPnlChartTypePref = optionChainSettingsPnlChartTypePref;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        OptionOrderFilter initialFilter = ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getInitialFilter();
        if (initialFilter != null) {
            initializeInitialFilter(initialFilter);
        }
        this.optionPreTradeSimulatedReturnChartShownPref.set(false);
        UUID equityInstrumentId = ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getEquityInstrumentId();
        if (equityInstrumentId != null) {
            Observable<Instrument> observableDistinctUntilChanged = this.equityInstrumentStore.getInstrument(equityInstrumentId).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.onCreate$lambda$4(this.f$0, (Instrument) obj);
                }
            });
        }
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        Observable observableTake = this.accountProvider.streamAllSelfDirectedAccountNumbers().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.size() > 1);
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$6(this.f$0, (Boolean) obj);
            }
        });
        this.optionAccountSwitcherStore.setActiveAccountNumber(((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getInitialAccountNumber());
        Observable<String> observableStreamActiveAccountNumber = this.optionAccountSwitcherStore.streamActiveAccountNumber();
        this.accountNumberObs = observableStreamActiveAccountNumber;
        if (observableStreamActiveAccountNumber == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountNumberObs");
            observableStreamActiveAccountNumber = null;
        }
        final AccountProvider accountProvider = this.accountProvider;
        Observable observableDistinctUntilChanged2 = observableStreamActiveAccountNumber.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.5
            @Override // io.reactivex.functions.Function
            public final Observable<Account> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return accountProvider.streamAccount(p0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$8(this.f$0, (Account) obj);
            }
        });
        Observable<String> observable = this.accountNumberObs;
        if (observable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountNumberObs");
            observable = null;
        }
        final OptionSettingsStore optionSettingsStore = this.optionSettingsStore;
        Observable observableDistinctUntilChanged3 = observable.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.7
            @Override // io.reactivex.functions.Function
            public final Observable<OptionSettings> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionSettingsStore.streamOptionSettings(p0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$10(this.f$0, (OptionSettings) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.9
            @Override // io.reactivex.functions.Function
            public final Optional<OptionChainViewState.UpsellHook> apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getUpsellType());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake2 = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$12(this.f$0, (OptionChainViewState.UpsellHook) obj);
            }
        });
        final boolean z = Intrinsics.areEqual(((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getSource(), OptionChainSource.ONBOARDING_UPSELL_SDP) || ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK);
        Observable observableDistinctUntilChanged4 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionChainViewState) it).getOptionChainLandingPageUnderlyingState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        Observable observableDistinctUntilChanged5 = observableDistinctUntilChanged4.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.12
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Integer> apply(OptionChainLandingPageUnderlyingState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return OptionChainDuxo.this.optionChainLandingStore.getIndexForOptionChainLandingPage(state, z);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$15(this.f$0, (Integer) obj);
            }
        });
        final BigDecimal targetStrikePrice = ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getTargetStrikePrice();
        if (targetStrikePrice != null) {
            Observable observableDistinctUntilChanged6 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$$inlined$mapDistinct$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final R apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return (R) ((OptionChainViewState) it).getOptionChainLandingPageUnderlyingState();
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
            Observable observableTake3 = observableDistinctUntilChanged6.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.15
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Integer> apply(OptionChainLandingPageUnderlyingState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return OptionChainDuxo.this.optionChainLandingStore.getIndexForNextTradableExpirationDate(state);
                }
            }).filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.16
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Integer it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.intValue() >= 0;
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake3, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.onCreate$lambda$18(this.f$0, targetStrikePrice, (Integer) obj);
                }
            });
        }
        if (!((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.DISABLE_DEFAULT_ORDER_FILTER)) {
            final OptionOrderFilter initialFilter2 = ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getInitialFilter();
            if (!(((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getLaunchMode() instanceof OptionChainLaunchMode.RollingContractSelector)) {
                Observable<R> map2 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(((OptionChainViewState) it).getOptionOrderFilterKey());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((OptionChainDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                Observable observableDistinctUntilChanged7 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.21
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends OptionOrderFilter> apply(String filterKey) {
                        Intrinsics.checkNotNullParameter(filterKey, "filterKey");
                        return OptionChainDuxo.this.optionOrderFilterStore.getAndSaveOptionOrderFilter(filterKey);
                    }
                }).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged7, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainDuxo.onCreate$lambda$23(this.f$0, (OptionOrderFilter) obj);
                    }
                });
            } else {
                if (initialFilter2 == null) {
                    throw new IllegalArgumentException("Initial filter must be set for rolling");
                }
                applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainDuxo.onCreate$lambda$20(initialFilter2, (OptionChainViewState) obj);
                    }
                });
            }
        }
        Observable<OptionChainViewState> observableTake4 = getStates().filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.23
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShowNormalIacAlertSheet();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake4, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$24(this.f$0, (OptionChainViewState) obj);
            }
        });
        Observable<OptionChainViewState> observableTake5 = getStates().filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.25
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShowOptionChainCustomizationGtmIacAlertSheet();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake5, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$25(this.f$0, (OptionChainViewState) obj);
            }
        });
        Observable observableDistinctUntilChanged8 = getStates().filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.27
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShouldEmitChainCustomizationEvent();
            }
        }).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.28
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShouldEmitChainCustomizationEvent());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onCreate.29
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<OptionChainSelectedMetrics>> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionChainDuxo.this.optionChainCustomizationStore.getStreamChainSelectedMetrics().asObservable(Unit.INSTANCE);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged8, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$32(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$34(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        UUID indexUnderlyingId = UiOptionChains.getIndexUnderlyingId(((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getUiOptionChains());
        if (indexUnderlyingId != null) {
            LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
            LifecycleState lifecycleState = LifecycleState.RESUMED;
            lifecycleScope.repeatOnLifecycle(lifecycleState, new C2404132(indexUnderlyingId, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2404233(indexUnderlyingId, null));
        }
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsExpirationDateSnackbarDismissalExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$36(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsSelloutImprovementExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$38(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsSnackbarDismissalFollowUp.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$40(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHostCoroutineScope lifecycleScope2 = getLifecycleScope();
        LifecycleState lifecycleState2 = LifecycleState.STARTED;
        lifecycleScope2.repeatOnLifecycle(lifecycleState2, new C2404337(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState2, new C2404438(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState2, new C2404539(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(OptionChainDuxo optionChainDuxo, final Instrument instrument) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$4$lambda$3(instrument, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$4$lambda$3(Instrument instrument, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : instrument, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(OptionChainDuxo optionChainDuxo, final Boolean bool) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda67
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$6$lambda$5(bool, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$6$lambda$5(Boolean bool, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : bool.booleanValue(), ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(OptionChainDuxo optionChainDuxo, final Account account) {
        optionChainDuxo.clearMultilegSelection();
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$8$lambda$7(account, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$8$lambda$7(Account account, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : account, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(OptionChainDuxo optionChainDuxo, final OptionSettings optionSettings) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$10$lambda$9(optionSettings, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$10$lambda$9(OptionSettings optionSettings, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : optionSettings.getDefaultPricingSetting(), ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : optionSettings.getTradingOnExpirationState(), ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(OptionChainDuxo optionChainDuxo, final OptionChainViewState.UpsellHook upsellHook) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$12$lambda$11(upsellHook, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$12$lambda$11(OptionChainViewState.UpsellHook upsellHook, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : new UiEvent(upsellHook), ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$15(OptionChainDuxo optionChainDuxo, final Integer num) {
        if (num == null || num.intValue() != -1) {
            optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.onCreate$lambda$15$lambda$14(num, (OptionChainViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$15$lambda$14(Integer num, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : new UiEvent(num), ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18(OptionChainDuxo optionChainDuxo, final BigDecimal bigDecimal, final Integer num) {
        if (num.intValue() >= 0) {
            optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.onCreate$lambda$18$lambda$17(bigDecimal, num, (OptionChainViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$18$lambda$17(BigDecimal bigDecimal, Integer num, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : new UiEvent(Tuples4.m3642to(bigDecimal, num)), ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$20(OptionOrderFilter optionOrderFilter, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : optionOrderFilter, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$23(OptionChainDuxo optionChainDuxo, final OptionOrderFilter optionOrderFilter) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$23$lambda$22(optionOrderFilter, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$23$lambda$22(OptionOrderFilter optionOrderFilter, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : optionOrderFilter, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$24(OptionChainDuxo optionChainDuxo, OptionChainViewState optionChainViewState) {
        BuildersKt__Builders_commonKt.launch$default(optionChainDuxo.getLifecycleScope(), null, null, new OptionChainDuxo2(optionChainDuxo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$25(OptionChainDuxo optionChainDuxo, OptionChainViewState optionChainViewState) {
        BuildersKt__Builders_commonKt.launch$default(optionChainDuxo.getLifecycleScope(), null, null, new OptionChainDuxo3(optionChainDuxo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$32(OptionChainDuxo optionChainDuxo, List list) {
        Object next;
        Intrinsics.checkNotNull(list);
        List<OptionChainSelectedMetrics> list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            OptionChainSelectedMetrics optionChainSelectedMetrics = (OptionChainSelectedMetrics) next;
            if (optionChainSelectedMetrics.isAnyDisabled() || optionChainSelectedMetrics.isAnyUnsupported()) {
                break;
            }
        }
        final OptionChainSelectedMetrics optionChainSelectedMetrics2 = (OptionChainSelectedMetrics) next;
        if (optionChainSelectedMetrics2 != null) {
            optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda72
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.onCreate$lambda$32$lambda$28$lambda$27(optionChainSelectedMetrics2, (OptionChainViewState) obj);
                }
            });
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final OptionChainSelectedMetrics optionChainSelectedMetrics3 : list2) {
            String id = optionChainSelectedMetrics3.getId();
            if (Intrinsics.areEqual(id, OrderSide.BUY.getServerValue())) {
                optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda73
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainDuxo.onCreate$lambda$32$lambda$31$lambda$29(optionChainSelectedMetrics3, (OptionChainViewState) obj);
                    }
                });
            } else if (Intrinsics.areEqual(id, OrderSide.SELL.getServerValue())) {
                optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda74
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainDuxo.onCreate$lambda$32$lambda$31$lambda$30(optionChainSelectedMetrics3, (OptionChainViewState) obj);
                    }
                });
            }
            arrayList.add(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$32$lambda$28$lambda$27(OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainViewState applyMutation) {
        UiEvent uiEvent;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (optionChainSelectedMetrics.isAnyDisabled()) {
            uiEvent = new UiEvent(OptionChainCustomizationErrorEvent.RemovedMetricType.INSTANCE);
        } else {
            uiEvent = optionChainSelectedMetrics.isAnyUnsupported() ? new UiEvent(OptionChainCustomizationErrorEvent.UnsupportedMetricType.INSTANCE) : null;
        }
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : uiEvent, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$32$lambda$31$lambda$29(OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : optionChainSelectedMetrics, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$32$lambda$31$lambda$30(OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : optionChainSelectedMetrics, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$34(OptionChainDuxo optionChainDuxo, final boolean z) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$34$lambda$33(z, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$34$lambda$33(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : z, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$32", m3645f = "OptionChainDuxo.kt", m3646l = {398}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$32 */
    static final class C2404132 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $indexId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2404132(UUID uuid, Continuation<? super C2404132> continuation) {
            super(2, continuation);
            this.$indexId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C2404132(this.$indexId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2404132) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<IndexValue> flowStreamIndexValue = OptionChainDuxo.this.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(this.$indexId));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamIndexValue, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$32$1", m3645f = "OptionChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$32$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexValue, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainDuxo optionChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IndexValue indexValue, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(indexValue, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final IndexValue indexValue = (IndexValue) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$32$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionChainDuxo.C2404132.AnonymousClass1.invokeSuspend$lambda$0(indexValue, (OptionChainViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionChainViewState invokeSuspend$lambda$0(IndexValue indexValue, OptionChainViewState optionChainViewState) {
                return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : indexValue, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
            }
        }
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$33", m3645f = "OptionChainDuxo.kt", m3646l = {408}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$33 */
    static final class C2404233 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $indexId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2404233(UUID uuid, Continuation<? super C2404233> continuation) {
            super(2, continuation);
            this.$indexId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C2404233(this.$indexId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2404233) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<IndexCloseValue> flowStreamIndexCloseValue = OptionChainDuxo.this.indexStore.streamIndexCloseValue(new ApiIndexCloseDetailRequest.ApiIndexCloseRequestById(this.$indexId));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamIndexCloseValue, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$33$1", m3645f = "OptionChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$33$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexCloseValue, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainDuxo optionChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IndexCloseValue indexCloseValue, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(indexCloseValue, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final IndexCloseValue indexCloseValue = (IndexCloseValue) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$33$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionChainDuxo.C2404233.AnonymousClass1.invokeSuspend$lambda$0(indexCloseValue, (OptionChainViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionChainViewState invokeSuspend$lambda$0(IndexCloseValue indexCloseValue, OptionChainViewState optionChainViewState) {
                return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : indexCloseValue, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$36(OptionChainDuxo optionChainDuxo, final boolean z) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$36$lambda$35(z, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$36$lambda$35(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : z, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$38(OptionChainDuxo optionChainDuxo, final boolean z) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$38$lambda$37(z, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$38$lambda$37(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : z, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$40(OptionChainDuxo optionChainDuxo, final boolean z) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onCreate$lambda$40$lambda$39(z, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onCreate$lambda$40$lambda$39(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : z, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$37", m3645f = "OptionChainDuxo.kt", m3646l = {442}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$37 */
    static final class C2404337 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2404337(Continuation<? super C2404337> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C2404337(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2404337) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamIsInSideBySideChainNuxRevampExperiment = OptionChainDuxo.this.optionSideBySideChainStore.streamIsInSideBySideChainNuxRevampExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamIsInSideBySideChainNuxRevampExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inSbsChainNuxRevampExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$37$1", m3645f = "OptionChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$37$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainDuxo optionChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainDuxo;
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
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$37$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionChainDuxo.C2404337.AnonymousClass1.invokeSuspend$lambda$0(z, (OptionChainViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionChainViewState invokeSuspend$lambda$0(boolean z, OptionChainViewState optionChainViewState) {
                return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : z, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
            }
        }
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$38", m3645f = "OptionChainDuxo.kt", m3646l = {451}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$38 */
    static final class C2404438 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2404438(Continuation<? super C2404438> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C2404438(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2404438) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowIsIndexOptionsExtendedHoursEnabled = OptionChainDuxo.this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowIsIndexOptionsExtendedHoursEnabled, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isIndexOptionsExtendedHoursEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$38$1", m3645f = "OptionChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$38$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainDuxo optionChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainDuxo;
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
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$38$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionChainDuxo.C2404438.AnonymousClass1.invokeSuspend$lambda$0(z, (OptionChainViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionChainViewState invokeSuspend$lambda$0(boolean z, OptionChainViewState optionChainViewState) {
                return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : z, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
            }
        }
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$39", m3645f = "OptionChainDuxo.kt", m3646l = {460}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$39 */
    static final class C2404539 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2404539(Continuation<? super C2404539> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C2404539(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2404539) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionChainDuxo.this.experimentsStore, new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainDuxo.this, null);
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

        /* compiled from: OptionChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$39$1", m3645f = "OptionChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$39$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainDuxo optionChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainDuxo;
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
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$39$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionChainDuxo.C2404539.AnonymousClass1.invokeSuspend$lambda$0(z, (OptionChainViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionChainViewState invokeSuspend$lambda$0(boolean z, OptionChainViewState optionChainViewState) {
                return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : z);
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.optionPreTradeSimulatedReturnChartShownPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onStart$lambda$42(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.optionChainSettingsPnlChartTypePref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onStart$lambda$44(this.f$0, (OptionChainSettingsPnlChartType) obj);
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onStart$lambda$45(this.f$0, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$42(OptionChainDuxo optionChainDuxo, final boolean z) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onStart$lambda$42$lambda$41(z, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onStart$lambda$42$lambda$41(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : z, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$44(OptionChainDuxo optionChainDuxo, final OptionChainSettingsPnlChartType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onStart$lambda$44$lambda$43(type2, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onStart$lambda$44$lambda$43(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : optionChainSettingsPnlChartType, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onStart$lambda$45(OptionChainDuxo optionChainDuxo, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : optionChainDuxo.optionSideBySideChainStore.getSideBySideChainShown(), ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : optionChainDuxo.optionSideBySideChainStore.getSideBySideChainBottomSheetShown(), ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : optionChainDuxo.optionSideBySideChainStore.getChainSettingsShown(), ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : optionChainDuxo.optionSideBySideChainStore.getSbsNuxRevampSettingsShown(), ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : optionChainDuxo.showMultipleUnderlyingsTooltipPref.get(), ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : optionChainDuxo.showSettleOnOpenTooltipPref.get(), ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : !optionChainDuxo.optionChainSwitchFocusedToSbsTooltipDismissedPref.get(), ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : applyMutation.getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK) ? false : optionChainDuxo.simulatedReturnSwitchChartTooltipShownPref.get(), ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        OptionInstrument optionInstrumentToRoll;
        super.onResume();
        Observable<String> observable = this.accountNumberObs;
        if (observable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountNumberObs");
            observable = null;
        }
        final AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore;
        Observable observableTake = observable.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final Observable<List<UiAggregateOptionPositionSimple>> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return AggregateOptionPositionStore.streamUiAggregateOptionPositionsSimple$default(aggregateOptionPositionStore, p0, null, 2, null);
            }
        }).map(new C240552()).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$47(this.f$0, (Sequence) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.optionMarketHoursStore.streamCurrentOrNextMarketDates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$49(this.f$0, (OptionCurrentOrNextMarketDates) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getCurrentSelloutTimeQueryParams());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instant> apply(OptionChainViewState.CurrentSelloutTimeQueryParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return OptionChainDuxo.this.optionInstrumentStore.getSelloutTimeOnExpirationDate(params.getOptionChainId(), params.getContractType(), params.getExpirationDate());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$52(this.f$0, (Instant) obj);
            }
        });
        Companion companion = INSTANCE;
        UUID equityInstrumentId = ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getEquityInstrumentId();
        if (equityInstrumentId != null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.equityQuoteStore.getStreamQuote().asObservable(equityInstrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.onResume$lambda$55$lambda$54(this.f$0, (Quote) obj);
                }
            });
        }
        OptionChainLaunchMode launchMode = ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getLaunchMode();
        OptionChainLaunchMode.RollingContractSelector rollingContractSelector = launchMode instanceof OptionChainLaunchMode.RollingContractSelector ? (OptionChainLaunchMode.RollingContractSelector) launchMode : null;
        UUID id = (rollingContractSelector == null || (optionInstrumentToRoll = rollingContractSelector.getOptionInstrumentToRoll()) == null) ? null : optionInstrumentToRoll.getId();
        if (id != null) {
            ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, this.optionQuoteStore.pollQuote(id), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
            Observable<OptionInstrumentQuote> observableDistinctUntilChanged = this.optionQuoteStore.getOptionQuote(id).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.onResume$lambda$57(this.f$0, (OptionInstrumentQuote) obj);
                }
            });
        }
        Observable<R> map2 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onResume.10
            @Override // io.reactivex.functions.Function
            public final Optional<OptionOrderFilter> apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getSelectedOptionOrderFilter());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$58(this.f$0, (OptionOrderFilter) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onResume.12
            @Override // io.reactivex.functions.Function
            public final OptionChainConfiguration apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionChainConfiguration();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$59(this.f$0, (OptionChainConfiguration) obj);
            }
        });
        Observable<OptionChainViewState> observableRefCount = getStates().filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onResume$showBuilderObs$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShowBuilder();
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableDistinctUntilChanged4 = observableRefCount.take(1L).switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onResume.14
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionStrategyBuilder> apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionChainDuxo.this.optionStrategyBuilderStore.getStreamOptionStrategyBuilder().asObservable(UiOptionChains.getUnderlyingType(((InternalOptionChainFragmentKey) OptionChainDuxo.INSTANCE.getArgs((HasSavedState) OptionChainDuxo.this)).getUiOptionChains()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$61(this.f$0, (OptionStrategyBuilder) obj);
            }
        });
        Observable observableDistinctUntilChanged5 = observableRefCount.take(1L).switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onResume.16
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionStrategyBuilderNuxStates> apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionChainDuxo.this.optionStrategyBuilderStore.getShouldShowStrategyBuilderNux();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$64(this.f$0, (OptionStrategyBuilderNuxStates) obj);
            }
        });
        Observable<OptionChainViewState> observableFilter = getStates().filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.onResume.18
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShowOptionChainCustomizationGtmIacAlertSheet() || it.getShowNormalIacAlertSheet();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable<R> map3 = observableFilter.map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onResume$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getAccount());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainDuxo$onResume$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableTake2 = ObservablesKt.filterIsPresent(map3).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$66(this.f$0, (Account) obj);
            }
        });
        Observable<String> observable2 = this.accountNumberObs;
        if (observable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountNumberObs");
            observable2 = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, observable2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$67(this.f$0, (String) obj);
            }
        });
        UUID equityInstrumentId2 = ((InternalOptionChainFragmentKey) companion.getArgs((HasSavedState) this)).getEquityInstrumentId();
        if (equityInstrumentId2 != null) {
            this.equityQuoteStore.refresh(false, equityInstrumentId2);
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2405623(null), 3, null);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onResume$2 */
    static final class C240552<T, R> implements Function {
        C240552() {
        }

        @Override // io.reactivex.functions.Function
        public final Sequence<OptionChainExpirationDateState> apply(List<UiAggregateOptionPositionSimple> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            List<UiOptionChain> uiOptionChains = ((InternalOptionChainFragmentKey) OptionChainDuxo.INSTANCE.getArgs((HasSavedState) OptionChainDuxo.this)).getUiOptionChains();
            final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(uiOptionChains, 10)), 16));
            for (T t : uiOptionChains) {
                linkedHashMap.put(((UiOptionChain) t).getOptionChain().getId(), t);
            }
            return SequencesKt.mapNotNull(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onResume$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.C240552.apply$lambda$1(linkedHashMap, (UiAggregateOptionPositionSimple) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainExpirationDateState apply$lambda$1(Map map, UiAggregateOptionPositionSimple position) {
            Intrinsics.checkNotNullParameter(position, "position");
            UiOptionChain uiOptionChain = (UiOptionChain) map.get(position.getOptionChain().getId());
            if (uiOptionChain != null) {
                return new OptionChainExpirationDateState((LocalDate) position.getExpirationDateRange().getStart(), uiOptionChain);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$47(OptionChainDuxo optionChainDuxo, final Sequence sequence) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda75
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$47$lambda$46(sequence, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onResume$lambda$47$lambda$46(Sequence sequence, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(sequence);
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : extensions2.toImmutableList(sequence), ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$49(OptionChainDuxo optionChainDuxo, final OptionCurrentOrNextMarketDates dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$49$lambda$48(dates, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onResume$lambda$49$lambda$48(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : optionCurrentOrNextMarketDates, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$52(OptionChainDuxo optionChainDuxo, final Instant instant) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$52$lambda$51(instant, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onResume$lambda$52$lambda$51(Instant instant, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : instant, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$55$lambda$54(OptionChainDuxo optionChainDuxo, final Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$55$lambda$54$lambda$53(quote, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onResume$lambda$55$lambda$54$lambda$53(Quote quote, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : quote, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$57(OptionChainDuxo optionChainDuxo, final OptionInstrumentQuote optionInstrumentQuote) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$57$lambda$56(optionInstrumentQuote, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onResume$lambda$57$lambda$56(OptionInstrumentQuote optionInstrumentQuote, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : optionInstrumentQuote, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$58(OptionChainDuxo optionChainDuxo, OptionOrderFilter optionOrderFilter) {
        OptionOrderFilterStore optionOrderFilterStore = optionChainDuxo.optionOrderFilterStore;
        Intrinsics.checkNotNull(optionOrderFilter);
        optionOrderFilterStore.saveOptionFilterAndGlobalFilter(optionOrderFilter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$59(OptionChainDuxo optionChainDuxo, OptionChainConfiguration optionChainConfiguration) {
        optionChainDuxo.getSavedStateHandle().set(ARG_OPTION_CHAIN_CONFIGURATION, optionChainConfiguration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$61(OptionChainDuxo optionChainDuxo, final OptionStrategyBuilder optionStrategyBuilder) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$61$lambda$60(optionStrategyBuilder, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onResume$lambda$61$lambda$60(OptionStrategyBuilder optionStrategyBuilder, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : optionStrategyBuilder, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$64(OptionChainDuxo optionChainDuxo, final OptionStrategyBuilderNuxStates optionStrategyBuilderNuxStates) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onResume$lambda$64$lambda$63(optionStrategyBuilderNuxStates, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onResume$lambda$64$lambda$63(OptionStrategyBuilderNuxStates optionStrategyBuilderNuxStates, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List<OptionStrategyBuilderNuxStates.OptionStrategyBuilderNuxState> nuxStates = optionStrategyBuilderNuxStates.getNuxStates();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(nuxStates, 10)), 16));
        for (OptionStrategyBuilderNuxStates.OptionStrategyBuilderNuxState optionStrategyBuilderNuxState : nuxStates) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(optionStrategyBuilderNuxState.getStrategy(), Boolean.valueOf(optionStrategyBuilderNuxState.getShowNux()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : linkedHashMap, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$66(OptionChainDuxo optionChainDuxo, Account account) {
        BuildersKt__Builders_commonKt.launch$default(optionChainDuxo.getLifecycleScope(), null, null, new OptionChainDuxo5(optionChainDuxo, account, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$67(OptionChainDuxo optionChainDuxo, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        OptionPositionStore.refresh$default(optionChainDuxo.optionPositionStore, false, (UUID) null, accountNumber, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onResume$23", m3645f = "OptionChainDuxo.kt", m3646l = {668}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23 */
    static final class C2405623 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2405623(Continuation<? super C2405623> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C2405623(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2405623) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionChainViewState> statesFlow = OptionChainDuxo.this.getStatesFlow();
                    final Flow<OptionChainViewState> flow = new Flow<OptionChainViewState>() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionChainViewState> flowCollector, Continuation continuation) {
                            Object objCollect = statesFlow.collect(new C240222(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C240222<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionChainDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    return C240222.this.emit(null, this);
                                }
                            }

                            public C240222(FlowCollector flowCollector) {
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
                                    if (((OptionChainViewState) obj).getShouldEmitChainCustomizationEvent()) {
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C240232(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$map$1$2 */
                        public static final class C240232<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$map$1$2", m3645f = "OptionChainDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C240232.this.emit(null, this);
                                }
                            }

                            public C240232(FlowCollector flowCollector) {
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
                                    Boolean boolBoxBoolean = boxing.boxBoolean(((OptionChainViewState) obj).getShouldEmitChainCustomizationEvent());
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
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionChainDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                OptionChainDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionChainDuxo.C2405623.invokeSuspend$lambda$2(th, (OptionChainViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$3", m3645f = "OptionChainDuxo.kt", m3646l = {669}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onResume$23$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionChainDuxo optionChainDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionChainCustomizationStore optionChainCustomizationStore = this.this$0.optionChainCustomizationStore;
                    this.label = 1;
                    if (optionChainCustomizationStore.fetchChainSelectedMetrics(this) == coroutine_suspended) {
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
        public static final OptionChainViewState invokeSuspend$lambda$2(Throwable th, OptionChainViewState optionChainViewState) {
            Object genericError;
            if (Throwables.isNetworkRelated(th)) {
                genericError = OptionChainCustomizationErrorEvent.OptionServiceDown.INSTANCE;
            } else {
                genericError = new OptionChainCustomizationErrorEvent.GenericError(th);
            }
            return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : new UiEvent(genericError), ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
        }
    }

    private final void initializeInitialFilter(OptionOrderFilter initialFilter) {
        String optionOrderFilterKey = getStatesFlow().getValue().getOptionOrderFilterKey();
        if (!Intrinsics.areEqual(initialFilter.getFilterKey(), optionOrderFilterKey)) {
            throw new IllegalArgumentException(("Initial filter filterKey: " + initialFilter.getFilterKey() + " must be equal to " + optionOrderFilterKey).toString());
        }
        this.optionOrderFilterStore.saveOptionFilterAndGlobalFilter(initialFilter);
    }

    public final void setOptionOrderFilter(final OptionOrderFilter optionOrderFilter) {
        Intrinsics.checkNotNullParameter(optionOrderFilter, "optionOrderFilter");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setOptionOrderFilter$lambda$70(optionOrderFilter, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setOptionOrderFilter$lambda$70(OptionOrderFilter optionOrderFilter, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : optionOrderFilter, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void setScrollTarget(final OptionChainViewState.ChainScrollTarget chainScrollTarget) {
        Intrinsics.checkNotNullParameter(chainScrollTarget, "chainScrollTarget");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setScrollTarget$lambda$71(chainScrollTarget, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setScrollTarget$lambda$71(OptionChainViewState.ChainScrollTarget chainScrollTarget, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : chainScrollTarget, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : new UiEvent(chainScrollTarget.getScrollTarget()), ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void setCurrentPage(final int index) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setCurrentPage$lambda$72(this.f$0, index, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setCurrentPage$lambda$72(OptionChainDuxo optionChainDuxo, int i, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OptionOrderFilter optionOrderFilter = applyMutation.getOptionOrderFilter();
        if (applyMutation.getCurrentPage() != null) {
            EventLogger.DefaultImpls.logDisappear$default(optionChainDuxo.eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), null, null, null, 29, null);
            optionChainDuxo.cancelSnackbarTimer();
        }
        EventLogger.DefaultImpls.logAppear$default(optionChainDuxo.eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), null, null, null, 29, null);
        if (optionOrderFilter != null) {
            if (applyMutation.getOptionChainIdForLogging() != null) {
                optionChainDuxo.clearOptionPerformanceMetrics(applyMutation.getOptionChainIdForLogging());
            }
            IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_CHAIN_ITEMS_LOADED, true);
            PerformanceLogger performanceLogger = optionChainDuxo.performanceLogger;
            UUID optionChainIdForLogging = applyMutation.getOptionChainIdForLogging();
            PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE, null, optionChainIdForLogging, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(OptionChainPerf.toRosettaOptionContractType(optionOrderFilter.getContractType()), OptionChainPerf.toRosettaOrderSide(optionOrderFilter.getSide()), !applyMutation.getOptionChainConfiguration().getSelectedLegs().isEmpty(), String.valueOf(applyMutation.getOptionChainIdForLogging()), applyMutation.getOptionChainSymbolForLogging(), null, null, 96, null), null, null, null, null, null, null, null, null, 4087, null), 2, null);
            PerformanceLogger.DefaultImpls.beginMetric$default(optionChainDuxo.performanceLogger, PerformanceMetricEventData.Name.OPTIONS_CONTRACT_DATE_CONTRACTS, null, applyMutation.getOptionChainIdForLogging(), null, 10, null);
        }
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : Integer.valueOf(i), ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void setDefaultPricingSetting(final OptionSettings.DefaultPricingSetting defaultPricingSetting) {
        Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setDefaultPricingSetting$lambda$73(defaultPricingSetting, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setDefaultPricingSetting$lambda$73(OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : defaultPricingSetting, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void setNuxSearchDismissed(final boolean dismissed) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setNuxSearchDismissed$lambda$74(dismissed, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setNuxSearchDismissed$lambda$74(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : z, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void onSideSelected(final OrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onSideSelected$lambda$75(this.f$0, side, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onSideSelected$lambda$75(OptionChainDuxo optionChainDuxo, OrderSide orderSide, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OptionOrderFilter optionOrderFilter = applyMutation.getOptionOrderFilter();
        if (optionOrderFilter != null && applyMutation.getOptionChainIdForLogging() != null) {
            optionChainDuxo.clearOptionPerformanceMetrics(applyMutation.getOptionChainIdForLogging());
            PerformanceLogger performanceLogger = optionChainDuxo.performanceLogger;
            UUID optionChainIdForLogging = applyMutation.getOptionChainIdForLogging();
            PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_SIDE;
            Side rosettaOrderSide = OptionChainPerf.toRosettaOrderSide(orderSide);
            OptionType rosettaOptionContractType = OptionChainPerf.toRosettaOptionContractType(optionOrderFilter.getContractType());
            String string2 = applyMutation.getOptionChainIdForLogging().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, null, optionChainIdForLogging, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(rosettaOptionContractType, rosettaOrderSide, !applyMutation.getOptionChainConfiguration().getSelectedLegs().isEmpty(), string2, applyMutation.getOptionChainSymbolForLogging(), null, null, 96, null), null, null, null, null, null, null, null, null, 4087, null), 2, null);
            if (applyMutation.getSelectedOrderSide() != null) {
                optionChainDuxo.logTapChangeSideOrContractType(orderSide.getServerValue(), applyMutation.getOptionChainIdForLogging());
            }
        }
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : orderSide, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void onContractTypeSelected(final OptionContractType contractType) {
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onContractTypeSelected$lambda$76(this.f$0, contractType, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onContractTypeSelected$lambda$76(OptionChainDuxo optionChainDuxo, OptionContractType optionContractType, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OptionOrderFilter optionOrderFilter = applyMutation.getOptionOrderFilter();
        if (optionOrderFilter != null && applyMutation.getOptionChainIdForLogging() != null) {
            optionChainDuxo.clearOptionPerformanceMetrics(applyMutation.getOptionChainIdForLogging());
            PerformanceLogger performanceLogger = optionChainDuxo.performanceLogger;
            UUID optionChainIdForLogging = applyMutation.getOptionChainIdForLogging();
            PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE;
            Side rosettaOrderSide = OptionChainPerf.toRosettaOrderSide(optionOrderFilter.getSide());
            OptionType rosettaOptionContractType = OptionChainPerf.toRosettaOptionContractType(optionContractType);
            String string2 = applyMutation.getOptionChainIdForLogging().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, null, optionChainIdForLogging, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(rosettaOptionContractType, rosettaOrderSide, !applyMutation.getOptionChainConfiguration().getSelectedLegs().isEmpty(), string2, applyMutation.getOptionChainSymbolForLogging(), null, null, 96, null), null, null, null, null, null, null, null, null, 4087, null), 2, null);
            if (applyMutation.getSelectedContractType() != null) {
                optionChainDuxo.logTapChangeSideOrContractType(optionContractType.getServerValue(), applyMutation.getOptionChainIdForLogging());
            }
        }
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : optionContractType, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void onMultilegAdd(final OptionLegBundle optionLegBundle) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onMultilegAdd$lambda$77(optionLegBundle, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onMultilegAdd$lambda$77(OptionLegBundle optionLegBundle, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OptionChainConfiguration optionChainConfiguration = applyMutation.getOptionChainConfiguration();
        if (optionChainConfiguration.getSelectedLegs().contains(optionLegBundle)) {
            return applyMutation;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) optionChainConfiguration.getSelectedLegs());
        mutableList.add(optionLegBundle);
        CollectionsKt.sortWith(mutableList, new Comparator() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onMultilegAdd$1$1
            @Override // java.util.Comparator
            public final int compare(OptionLegBundle optionLegBundle2, OptionLegBundle optionLegBundle3) {
                return CompareOptionInstrumentForDisplay.compareOptionInstrumentForDisplay(optionLegBundle2.getOptionInstrument(), optionLegBundle3.getOptionInstrument());
            }
        });
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : true, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : new OptionChainConfiguration(extensions2.toPersistentList(mutableList)), ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void onMultilegRemove(final OptionLegBundle optionLegBundle) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.onMultilegRemove$lambda$78(optionLegBundle, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState onMultilegRemove$lambda$78(OptionLegBundle optionLegBundle, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OptionChainConfiguration optionChainConfiguration = applyMutation.getOptionChainConfiguration();
        if (optionChainConfiguration.getSelectedLegs().contains(optionLegBundle)) {
            return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : new OptionChainConfiguration(extensions2.toPersistentList(CollectionsKt.minus(optionChainConfiguration.getSelectedLegs(), optionLegBundle))), ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
        }
        return applyMutation;
    }

    public final void clearMultilegSelection() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.clearMultilegSelection$lambda$79((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState clearMultilegSelection$lambda$79(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : new OptionChainConfiguration(extensions2.persistentListOf()), ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void turnOnTradeOnExpirationSettingForDiscoverZeroDte() {
        Observable<String> observable = this.accountNumberObs;
        if (observable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountNumberObs");
            observable = null;
        }
        Observable<R> observableSwitchMapSingle = observable.take(1L).switchMapSingle(new C240631());
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.turnOnTradeOnExpirationSettingForDiscoverZeroDte$lambda$81(this.f$0, (String) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.turnOnTradeOnExpirationSettingForDiscoverZeroDte$lambda$83(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$turnOnTradeOnExpirationSettingForDiscoverZeroDte$1 */
    static final class C240631<T, R> implements Function {
        C240631() {
        }

        @Override // io.reactivex.functions.Function
        public final SingleSource<? extends String> apply(final String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            OptionChainDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$turnOnTradeOnExpirationSettingForDiscoverZeroDte$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.C240631.apply$lambda$0((OptionChainViewState) obj);
                }
            });
            return OptionChainDuxo.this.optionSettingsStore.toggleFridayTradingCompletable(accountNumber, true).toSingle(new Callable() { // from class: com.robinhood.android.optionschain.OptionChainDuxo.turnOnTradeOnExpirationSettingForDiscoverZeroDte.1.2
                @Override // java.util.concurrent.Callable
                public final String call() {
                    return accountNumber;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainViewState apply$lambda$0(OptionChainViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : OptionDiscoverZeroDteSnackbarState.NETWORK_REQUEST_STARTED, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnTradeOnExpirationSettingForDiscoverZeroDte$lambda$81(OptionChainDuxo optionChainDuxo, final String str) {
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.m2299x49e76ef8(str, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: turnOnTradeOnExpirationSettingForDiscoverZeroDte$lambda$81$lambda$80 */
    public static final OptionChainViewState m2299x49e76ef8(String str, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : new UiEvent(str), ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : OptionDiscoverZeroDteSnackbarState.SHOWING, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnOnTradeOnExpirationSettingForDiscoverZeroDte$lambda$83(OptionChainDuxo optionChainDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        optionChainDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda78
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.m2300x73b0d47c(t, (OptionChainViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: turnOnTradeOnExpirationSettingForDiscoverZeroDte$lambda$83$lambda$82 */
    public static final OptionChainViewState m2300x73b0d47c(Throwable th, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : new UiEvent(th), ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : OptionDiscoverZeroDteSnackbarState.NETWORK_REQUEST_FAILED, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void dismissDiscoverZeroDteSnackbar() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.dismissDiscoverZeroDteSnackbar$lambda$84((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState dismissDiscoverZeroDteSnackbar$lambda$84(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : OptionDiscoverZeroDteSnackbarState.DISMISSED, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void recordSeenDiscoverZeroDteBottomSheet() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.recordSeenDiscoverZeroDteBottomSheet$lambda$85((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState recordSeenDiscoverZeroDteBottomSheet$lambda$85(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void setSentiment(final OptionStrategyBuilder.SentimentFilter sentiment) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setSentiment$lambda$86(sentiment, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setSentiment$lambda$86(OptionStrategyBuilder.SentimentFilter sentimentFilter, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : sentimentFilter != null ? sentimentFilter.getSentiment() : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void isDay(final boolean isDay) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.isDay$lambda$87(isDay, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState isDay$lambda$87(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : Boolean.valueOf(z), ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1", m3645f = "OptionChainDuxo.kt", m3646l = {950}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1 */
    static final class C240611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionTooltip $tooltip;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240611(OptionTooltip optionTooltip, Continuation<? super C240611> continuation) {
            super(2, continuation);
            this.$tooltip = optionTooltip;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C240611(this.$tooltip, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionChainViewState> statesFlow = OptionChainDuxo.this.getStatesFlow();
                Flow flowTake = FlowKt.take(new Flow<String>() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionChainDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Account account = ((OptionChainViewState) obj).getAccount();
                                String accountNumber = account != null ? account.getAccountNumber() : null;
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionChainDuxo.this, this.$tooltip, null);
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

        /* compiled from: OptionChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1$2", m3645f = "OptionChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$setTooltipSeen$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionTooltip $tooltip;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainDuxo optionChainDuxo, OptionTooltip optionTooltip, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionChainDuxo;
                this.$tooltip = optionTooltip;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$tooltip, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.optionTooltipStore.recordOptionTooltipSeen(this.$tooltip.getReceiptId(), (String) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void setTooltipSeen(OptionTooltip tooltip) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240611(tooltip, null), 3, null);
        autoDismissIfNeeded(tooltip.getDisplayBehavior());
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, tooltip.getReceiptId(), null, 4, null), null, null, 25, null);
    }

    public final void setTooltipTapped() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setTooltipTapped$lambda$88((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setTooltipTapped$lambda$88(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$autoDismissIfNeeded$1", m3645f = "OptionChainDuxo.kt", m3646l = {975}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$autoDismissIfNeeded$1 */
    static final class C240291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionTooltipDisplayBehavior $displayBehavior;
        int label;
        final /* synthetic */ OptionChainDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240291(OptionTooltipDisplayBehavior optionTooltipDisplayBehavior, OptionChainDuxo optionChainDuxo, Continuation<? super C240291> continuation) {
            super(2, continuation);
            this.$displayBehavior = optionTooltipDisplayBehavior;
            this.this$0 = optionChainDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C240291(this.$displayBehavior, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(this.$displayBehavior.getDismissAfterSeconds(), DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$autoDismissIfNeeded$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionChainDuxo.C240291.invokeSuspend$lambda$0((OptionChainViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainViewState invokeSuspend$lambda$0(OptionChainViewState optionChainViewState) {
            return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
        }
    }

    private final void autoDismissIfNeeded(OptionTooltipDisplayBehavior displayBehavior) {
        if (displayBehavior == null || !displayBehavior.getAutoDismiss()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240291(displayBehavior, this, null), 3, null);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$setMultipleUnderlyingsTooltipSeen$1", m3645f = "OptionChainDuxo.kt", m3646l = {990}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$setMultipleUnderlyingsTooltipSeen$1 */
    static final class C240581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240581(Continuation<? super C240581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C240581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$setMultipleUnderlyingsTooltipSeen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionChainDuxo.C240581.invokeSuspend$lambda$0((OptionChainViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainViewState invokeSuspend$lambda$0(OptionChainViewState optionChainViewState) {
            return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
        }
    }

    public final void setMultipleUnderlyingsTooltipSeen() {
        this.showMultipleUnderlyingsTooltipPref.set(false);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240581(null), 3, null);
    }

    public final void dismissMultipleUnderlyingsTooltip() {
        this.showMultipleUnderlyingsTooltipPref.set(false);
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.dismissMultipleUnderlyingsTooltip$lambda$89((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState dismissMultipleUnderlyingsTooltip$lambda$89(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$setSettleOnOpenTooltipSeen$1", m3645f = "OptionChainDuxo.kt", m3646l = {1003}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$setSettleOnOpenTooltipSeen$1 */
    static final class C240591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240591(Continuation<? super C240591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C240591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$setSettleOnOpenTooltipSeen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionChainDuxo.C240591.invokeSuspend$lambda$0((OptionChainViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainViewState invokeSuspend$lambda$0(OptionChainViewState optionChainViewState) {
            return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
        }
    }

    public final void setSettleOnOpenTooltipSeen() {
        this.showSettleOnOpenTooltipPref.set(false);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240591(null), 3, null);
    }

    public final void dismissSettleOnOpenTooltip() {
        this.showSettleOnOpenTooltipPref.set(false);
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.dismissSettleOnOpenTooltip$lambda$90((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState dismissSettleOnOpenTooltip$lambda$90(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void setSwitchFocusedToSbsTooltipSeen() {
        this.optionChainSwitchFocusedToSbsTooltipDismissedPref.set(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240601(null), 3, null);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$setSwitchFocusedToSbsTooltipSeen$1", m3645f = "OptionChainDuxo.kt", m3646l = {1023}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$setSwitchFocusedToSbsTooltipSeen$1 */
    static final class C240601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240601(Continuation<? super C240601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C240601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(7, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$setSwitchFocusedToSbsTooltipSeen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionChainDuxo.C240601.invokeSuspend$lambda$0((OptionChainViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainViewState invokeSuspend$lambda$0(OptionChainViewState optionChainViewState) {
            return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
        }
    }

    public final void dismissSwitchFocusedToSbsTooltip() {
        this.optionChainSwitchFocusedToSbsTooltipDismissedPref.set(true);
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.dismissSwitchFocusedToSbsTooltip$lambda$91((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState dismissSwitchFocusedToSbsTooltip$lambda$91(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1", m3645f = "OptionChainDuxo.kt", m3646l = {1045}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1 */
    static final class C240301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $withDelay;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240301(boolean z, Continuation<? super C240301> continuation) {
            super(2, continuation);
            this.$withDelay = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C240301(this.$withDelay, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionChainDuxo.this.simulatedReturnSwitchChartTooltipShownPref.set(true);
                if (this.$withDelay) {
                    this.label = 1;
                    if (DelayKt.delay(7000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionChainDuxo.C240301.invokeSuspend$lambda$0((OptionChainViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionChainViewState invokeSuspend$lambda$0(OptionChainViewState optionChainViewState) {
            return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : null, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : true, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
        }
    }

    public final void dismissSimulatedReturnSwitchChartTooltip(boolean withDelay) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240301(withDelay, null), 3, null);
    }

    public final void dismissTopTooltipBanner(final boolean requireL2) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.dismissTopTooltipBanner$lambda$92(requireL2, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState dismissTopTooltipBanner$lambda$92(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (z && applyMutation.getMultilegAvailable()) {
            return applyMutation;
        }
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : true, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void logMultilegClearTap() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.MULTILEG_CLEAR, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    public final void logRollingContractSelectorAppear(OptionChainLaunchMode.RollingContractSelector contractSelectorLaunchMode) {
        Intrinsics.checkNotNullParameter(contractSelectorLaunchMode, "contractSelectorLaunchMode");
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_ROLLING_CONTRACT_SELECTOR, null, contractSelectorLaunchMode.getStrategyCode(), null, 10, null), null, null, null, 29, null);
    }

    public final void logOptionChainSettingsTap() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.VIEW_OPTION_CHAIN_SETTINGS, new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    public final void dismissSelloutSnackbar() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.dismissSelloutSnackbar$lambda$93((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState dismissSelloutSnackbar$lambda$93(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : new UiEvent(Unit.INSTANCE), ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void markSelloutSnackbarDismissedOrElapsed() {
        if (getStatesFlow().getValue().shouldDismissSelloutSnackbar(this.clock)) {
            applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainDuxo.markSelloutSnackbarDismissedOrElapsed$lambda$94((OptionChainViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState markSelloutSnackbarDismissedOrElapsed$lambda$94(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : true, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$startSelloutSnackbarTimer$1", m3645f = "OptionChainDuxo.kt", m3646l = {1102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$startSelloutSnackbarTimer$1 */
    static final class C240621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240621(Continuation<? super C240621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainDuxo.this.new C240621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainDuxo.this.markSelloutSnackbarDismissedOrElapsed();
            return Unit.INSTANCE;
        }
    }

    public final void startSelloutSnackbarTimer() {
        this.snackbarTimerJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C240621(null), 3, null);
    }

    public final void cancelSnackbarTimer() {
        Job job = this.snackbarTimerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    public final void logCustomizationSnackbar(OptionChainCustomizationErrorEvent chainCustomizationErrorEvent) {
        OptionChainDuxo optionChainDuxo;
        OptionChainSelectedMetrics buySelectedMetrics;
        OptionChainAvailableMetrics.Metric selectedMetricTwo;
        OptionChainAvailableMetrics.Metric selectedMetricOne;
        Intrinsics.checkNotNullParameter(chainCustomizationErrorEvent, "chainCustomizationErrorEvent");
        OrderSide selectedOrderSide = getStatesFlow().getValue().getSelectedOrderSide();
        int i = selectedOrderSide == null ? -1 : WhenMappings.$EnumSwitchMapping$0[selectedOrderSide.ordinal()];
        OptionChainAvailableMetrics.MetricType metricType = null;
        if (i != -1) {
            if (i == 1) {
                buySelectedMetrics = getStatesFlow().getValue().getBuySelectedMetrics();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buySelectedMetrics = getStatesFlow().getValue().getSellSelectedMetrics();
            }
            optionChainDuxo = this;
        } else {
            optionChainDuxo = this;
            buySelectedMetrics = null;
        }
        EventLogger eventLogger = optionChainDuxo.eventLogger;
        Screen screen = new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.ERROR_TOAST, OptionChainCustomizationLogging.getToastComponentIdentifier(chainCustomizationErrorEvent), null, 4, null);
        OrderSide selectedOrderSide2 = optionChainDuxo.getStatesFlow().getValue().getSelectedOrderSide();
        String serverValue = selectedOrderSide2 != null ? selectedOrderSide2.getServerValue() : null;
        OptionChainEntryPointType optionChainEntryPointType = OptionChainEntryPointType.CHAIN;
        OptionChainAvailableMetrics.MetricType metricType2 = (buySelectedMetrics == null || (selectedMetricOne = buySelectedMetrics.getSelectedMetricOne()) == null) ? null : selectedMetricOne.getMetricType();
        if (buySelectedMetrics != null && (selectedMetricTwo = buySelectedMetrics.getSelectedMetricTwo()) != null) {
            metricType = selectedMetricTwo.getMetricType();
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, OptionChainCustomizationLogging.getCustomizationEventContext$default(serverValue, optionChainEntryPointType, null, null, null, metricType2, metricType, 28, null), 9, null);
    }

    public final void logOptionsPagesLoaded() {
        this.performanceLogger.completeMetric(PerformanceMetricEventData.Name.TRADE_OPTIONS_STRATEGY_BUILDER, ((InternalOptionChainFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getOptionChainId());
    }

    private final void clearOptionPerformanceMetrics(UUID optionChainId) {
        PerformanceLogger performanceLogger = this.performanceLogger;
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN, optionChainId);
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE, optionChainId);
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_SIDE, optionChainId);
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE, optionChainId);
    }

    private final void logTapChangeSideOrContractType(String sideOrType, UUID optionChainId) {
        EventLogger eventLogger = this.eventLogger;
        Screen screen = new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.BUTTON, "option_chain_switch_to_" + sideOrType, null, 4, null);
        String string2 = optionChainId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(string2, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    public final void logFragmentRecreated() {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(null, new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(null, null, null, null, null, null, null, null, null, null, null, null, "option_chain_recreated", null, 12287, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), null, null, 109, null), false, false, 6, null);
    }

    public final void setIsOnboardingSearchSelectorVisible(final boolean onboardingSearchSelectorVisible) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.setIsOnboardingSearchSelectorVisible$lambda$96(onboardingSearchSelectorVisible, (OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState setIsOnboardingSearchSelectorVisible$lambda$96(boolean z, OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : z, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
    }

    public final void decrementNuxBlink() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDuxo.decrementNuxBlink$lambda$97((OptionChainViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState decrementNuxBlink$lambda$97(OptionChainViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        int settingGreenDotRemainingBlinks = applyMutation.getSettingGreenDotRemainingBlinks();
        if (settingGreenDotRemainingBlinks > 0) {
            return applyMutation.copy(((-1) & 1) != 0 ? applyMutation.account : null, ((-1) & 2) != 0 ? applyMutation.chainScrollTarget : null, ((-1) & 4) != 0 ? applyMutation.currentPage : null, ((-1) & 8) != 0 ? applyMutation.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? applyMutation.currentSelloutTime : null, ((-1) & 32) != 0 ? applyMutation.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? applyMutation.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? applyMutation.equityInstrument : null, ((-1) & 256) != 0 ? applyMutation.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? applyMutation.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? applyMutation.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? applyMutation.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? applyMutation.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? applyMutation.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? applyMutation.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? applyMutation.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? applyMutation.iacAlertSheet : null, ((-1) & 131072) != 0 ? applyMutation.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? applyMutation.isDay : null, ((-1) & 524288) != 0 ? applyMutation.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? applyMutation.launchMode : null, ((-1) & 2097152) != 0 ? applyMutation.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? applyMutation.uiOptionChains : null, ((-1) & 8388608) != 0 ? applyMutation.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? applyMutation.optionOrderFilter : null, ((-1) & 33554432) != 0 ? applyMutation.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? applyMutation.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? applyMutation.selectedContractType : null, ((-1) & 268435456) != 0 ? applyMutation.selectedOrderSide : null, ((-1) & 536870912) != 0 ? applyMutation.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? applyMutation.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? applyMutation.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? applyMutation.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? applyMutation.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? applyMutation.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? applyMutation.scrollTargetEvent : null, ((-4097) & 16) != 0 ? applyMutation.selectedSentiment : null, ((-4097) & 32) != 0 ? applyMutation.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? applyMutation.underlyingQuote : null, ((-4097) & 128) != 0 ? applyMutation.underlyingIndexValue : null, ((-4097) & 256) != 0 ? applyMutation.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? applyMutation.upsellHookEvent : null, ((-4097) & 1024) != 0 ? applyMutation.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? applyMutation.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? applyMutation.tooltip : null, ((-4097) & 8192) != 0 ? applyMutation.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? applyMutation.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? applyMutation.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? applyMutation.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? applyMutation.isEtfSupported : false, ((-4097) & 262144) != 0 ? applyMutation.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? applyMutation.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? applyMutation.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? applyMutation.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? applyMutation.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? applyMutation.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? applyMutation.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? applyMutation.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? applyMutation.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? applyMutation.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? applyMutation.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? applyMutation.settingGreenDotRemainingBlinks : settingGreenDotRemainingBlinks - 1, ((-4097) & 1073741824) != 0 ? applyMutation.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? applyMutation.isMemberPdtRevampV1 : false);
        }
        return applyMutation;
    }

    /* compiled from: OptionChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionschain/OptionChainDuxo;", "Lcom/robinhood/android/options/contracts/InternalOptionChainFragmentKey;", "<init>", "()V", "ARG_OPTION_CHAIN_CONFIGURATION", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionChainDuxo, InternalOptionChainFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalOptionChainFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (InternalOptionChainFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalOptionChainFragmentKey getArgs(OptionChainDuxo optionChainDuxo) {
            return (InternalOptionChainFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionChainDuxo);
        }
    }
}
