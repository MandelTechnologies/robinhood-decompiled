package com.robinhood.android.optionschain.sbschain;

import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.optionchain.extensions.CompareOptionInstrumentForDisplay;
import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainEvent;
import com.robinhood.android.optionschain.sbschain.logging.OptionSideBySideChainLogger;
import com.robinhood.android.optionschain.sbschain.table.SpreadSelectionState;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundlesToReplace;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.OptionChainSettingsPnlChartTypePref;
import com.robinhood.librobinhood.data.prefs.OptionChainSimulatedReturnLongPressBannerSeenPref;
import com.robinhood.librobinhood.data.prefs.OptionChainSimulatedReturnSwitchChartTooltipShownPref;
import com.robinhood.librobinhood.data.prefs.OptionPreTradeSimulatedReturnChartShownPref;
import com.robinhood.librobinhood.data.prefs.OptionSbsEduFooterDismissedPref;
import com.robinhood.librobinhood.data.prefs.OptionSbsLottieNuxAnimation;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionTradingSession;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.p370rx.ObservablesKt;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import com.robinhood.utils.extensions.Lists4;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
import kotlin.jvm.functions.Function0;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainDuxo.kt */
@Metadata(m3635d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 {2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001{B»\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001d\u0012\u000e\b\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\b\b\u0001\u0010#\u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020\u001d\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*¢\u0006\u0004\b+\u0010,J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000209H\u0016J\u000e\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020=J\u000e\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u000209J\u0006\u0010B\u001a\u000209J\u0006\u0010C\u001a\u000209J\u0006\u0010D\u001a\u000209J\u0018\u0010E\u001a\u0002092\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IJ\u0010\u0010J\u001a\u0002092\b\u0010H\u001a\u0004\u0018\u00010IJ\u0010\u0010K\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010L\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0002J\u000e\u0010M\u001a\u0002092\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u000209J\u0006\u0010T\u001a\u000209J\u0006\u0010U\u001a\u000209J\u0006\u0010V\u001a\u000209J\u0015\u0010W\u001a\u0002092\u0006\u0010X\u001a\u00020GH\u0000¢\u0006\u0002\bYJ\b\u0010Z\u001a\u000209H\u0002J\u000e\u0010[\u001a\u0002092\u0006\u0010\\\u001a\u00020]J\u000e\u0010^\u001a\u0002092\u0006\u0010F\u001a\u00020GJ\u0006\u0010_\u001a\u000209J\u000e\u0010`\u001a\u0002092\u0006\u0010a\u001a\u00020bJ\u000e\u0010c\u001a\u0002092\u0006\u0010a\u001a\u00020bJ\u0006\u0010d\u001a\u000209J\u0006\u0010e\u001a\u000209J\u0006\u0010f\u001a\u000209J\u0006\u0010g\u001a\u000209J\u000e\u0010h\u001a\u0002092\u0006\u0010i\u001a\u00020GJ\u000e\u0010j\u001a\u0002092\u0006\u0010k\u001a\u000201J\u0006\u0010l\u001a\u000209J\u0006\u0010m\u001a\u000209J\u0006\u0010n\u001a\u000209J\b\u0010o\u001a\u000209H\u0002J\b\u0010p\u001a\u000209H\u0002J\b\u0010q\u001a\u000209H\u0002J\u000e\u0010r\u001a\u0002092\u0006\u0010s\u001a\u00020GJ\u0006\u0010t\u001a\u000209J\u000e\u0010u\u001a\u0002092\u0006\u0010v\u001a\u00020wJ\b\u0010x\u001a\u000209H\u0002J\u0006\u0010y\u001a\u000209J\u0006\u0010z\u001a\u000209R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020105X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b6\u00107¨\u0006|"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainViewState;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainLogger", "Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "optionChainSimulatedReturnLongPressBannerSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "simulatedReturnChartShownPref", "simulatedReturnSwitchChartTooltipShownPref", "optionChainSettingsPnlChartTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "optionSbsEduFooterDismissedPref", "optionSbsLottieNuxAnimationSeenPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pageLoadedAndUserEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/optionschain/sbschain/IdleTimerState;", "snackbarTimerJob", "Lkotlinx/coroutines/Job;", "userIdleFlow", "Lkotlinx/coroutines/flow/Flow;", "getUserIdleFlow$annotations", "()V", "onCreate", "", "onDestroy", "setDefaultPricingSetting", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "onCurrentPageUpdated", "currentPage", "", "setLottieNuxAnimationSeen", "dismissEduFooterAnimation", "startEduFooterAnimation", "completeEduFooterAnimation", "onBidAskCellSingleTap", "selected", "", "optionLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "logTapLegCell", "onMultilegAdd", "onMultilegRemove", "onMultilegReplace", "legBundlesToReplace", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "onContractTypeClicked", "optionContractType", "Lcom/robinhood/models/db/OptionContractType;", "clearSelectedLegs", "logTapClearMultilegSelection", "turnOnTradeOnExpirationSetting", "showDiscoverZeroDteBottomSheetIfNotYet", "initializeSideBySideChainNuxMode", "chainSettingsTappedInCurrentActivity", "initializeSideBySideChainNuxMode$feature_options_chain_externalDebug", "initializeSideBySideChainTooltipStatus", "logSpreadTooltipAppear", "spreadSelectionState", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "setSpreadSelectedOnCurrentPage", "setSeenSpreadTooltip", "onTopTooltipBannerDismiss", "type", "Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "onTopTooltipBannerAppear", "dismissSpreadTooltipIfSeen", "logSwitchBackToClassicChainTooltipAppear", "setSeenSwitchBackToClassicChainTooltip", "dismissSwitchBackToClassicChainTooltip", "dismissSimulatedReturnSwitchChartTooltip", "withDelay", "resetUserIdleTimer", "state", "markSelloutSnackbarDismissedOrElapsed", "startSelloutSnackbarTimer", "cancelSnackbarTimer", "initializeUserIdleCollector", "initializeEarliestSelloutTime", "initializeIsMarketOpen", "setNuxSearchDismissed", "dismissed", "setTappedChainSettingsInCurrentSession", "onBottomSheetStateUpdated", "value", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "computeTooltipState", "logFragmentRecreated", "recordUserLongPressed", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDuxo extends BaseDuxo3<OptionSideBySideChainDataState, OptionSideBySideChainViewState, OptionSideBySideChainEvent> implements HasSavedState {
    public static final String ARG_SBS_CHAIN_SELECTED_LEGS = "argSbsChainSelectedLegs";
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref;
    private final BooleanPreference optionChainSimulatedReturnLongPressBannerSeenPref;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final BooleanPreference optionSbsEduFooterDismissedPref;
    private final BooleanPreference optionSbsLottieNuxAnimationSeenPref;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSideBySideChainLogger optionSideBySideChainLogger;
    private final OptionSideBySideChainStore optionSideBySideChainStore;
    private final SharedFlow2<OptionSideBySideChainDataState3> pageLoadedAndUserEventFlow;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference simulatedReturnChartShownPref;
    private final BooleanPreference simulatedReturnSwitchChartTooltipShownPref;
    private Job snackbarTimerJob;
    private final Flow<OptionSideBySideChainDataState3> userIdleFlow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionSideBySideChainDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainTooltipBanner3.values().length];
            try {
                iArr[OptionChainTooltipBanner3.LONG_PRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainTooltipBanner3.TAP_TO_SIMULATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionChainTooltipBanner3.SELECT_TO_SIMULATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static /* synthetic */ void getUserIdleFlow$annotations() {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionSideBySideChainDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainLogger optionSideBySideChainLogger, OptionSideBySideChainStore optionSideBySideChainStore, RegionGateProvider regionGateProvider, @OptionChainSimulatedReturnLongPressBannerSeenPref BooleanPreference optionChainSimulatedReturnLongPressBannerSeenPref, @OptionPreTradeSimulatedReturnChartShownPref BooleanPreference simulatedReturnChartShownPref, @OptionChainSimulatedReturnSwitchChartTooltipShownPref BooleanPreference simulatedReturnSwitchChartTooltipShownPref, @OptionChainSettingsPnlChartTypePref EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref, @OptionSbsEduFooterDismissedPref BooleanPreference optionSbsEduFooterDismissedPref, @OptionSbsLottieNuxAnimation BooleanPreference optionSbsLottieNuxAnimationSeenPref, SavedStateHandle savedStateHandle, OptionSideBySideChainStateProvider stateProvider, DuxoBundle duxoBundle) {
        OptionSideBySideChainDataState5 optionSideBySideChainDataState5;
        ImmutableList immutableList;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(optionChainSimulatedReturnLongPressBannerSeenPref, "optionChainSimulatedReturnLongPressBannerSeenPref");
        Intrinsics.checkNotNullParameter(simulatedReturnChartShownPref, "simulatedReturnChartShownPref");
        Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
        Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
        Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
        Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        OptionChainLaunchMode launchMode = ((InternalOptionChainFragmentKey) companion.getArgs(savedStateHandle)).getLaunchMode();
        ImmutableList3 persistentList = extensions2.toPersistentList(((InternalOptionChainFragmentKey) companion.getArgs(savedStateHandle)).getUiOptionChains());
        List list = (List) savedStateHandle.get(ARG_SBS_CHAIN_SELECTED_LEGS);
        ImmutableList immutableListPersistentListOf = (list == null || (immutableList = extensions2.toImmutableList(list)) == null) ? extensions2.persistentListOf() : immutableList;
        OptionChainExpirationDateState targetExpirationDate = ((InternalOptionChainFragmentKey) companion.getArgs(savedStateHandle)).getTargetExpirationDate();
        ImmutableList<UiOptionStrategyLegDisplay> targetLegs = ((InternalOptionChainFragmentKey) companion.getArgs(savedStateHandle)).getTargetLegs();
        BigDecimal targetStrikePrice = ((InternalOptionChainFragmentKey) companion.getArgs(savedStateHandle)).getTargetStrikePrice();
        if (optionSbsEduFooterDismissedPref.get()) {
            optionSideBySideChainDataState5 = OptionSideBySideChainDataState5.DISMISSED;
        } else {
            optionSideBySideChainDataState5 = OptionSideBySideChainDataState5.NOT_PLAYING;
        }
        super(new OptionSideBySideChainDataState(null, null, null, null, null, null, null, false, false, false, false, null, null, launchMode, immutableListPersistentListOf, null, targetExpirationDate, targetLegs, targetStrikePrice, null, persistentList, false, null, false, false, false, false, false, optionSideBySideChainDataState5, false, optionSbsLottieNuxAnimationSeenPref.get(), false, -1343709185, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainLogger = optionSideBySideChainLogger;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.regionGateProvider = regionGateProvider;
        this.optionChainSimulatedReturnLongPressBannerSeenPref = optionChainSimulatedReturnLongPressBannerSeenPref;
        this.simulatedReturnChartShownPref = simulatedReturnChartShownPref;
        this.simulatedReturnSwitchChartTooltipShownPref = simulatedReturnSwitchChartTooltipShownPref;
        this.optionChainSettingsPnlChartTypePref = optionChainSettingsPnlChartTypePref;
        this.optionSbsEduFooterDismissedPref = optionSbsEduFooterDismissedPref;
        this.optionSbsLottieNuxAnimationSeenPref = optionSbsLottieNuxAnimationSeenPref;
        this.savedStateHandle = savedStateHandle;
        SharedFlow2<OptionSideBySideChainDataState3> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.pageLoadedAndUserEventFlow = sharedFlow2MutableSharedFlow$default;
        Duration.Companion companion2 = Duration.INSTANCE;
        final Flow flowM28819debounceHG0u8IE = FlowKt.m28819debounceHG0u8IE(sharedFlow2MutableSharedFlow$default, Duration3.toDuration(2, DurationUnitJvm.SECONDS));
        this.userIdleFlow = new Flow<OptionSideBySideChainDataState3>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionSideBySideChainDataState3> flowCollector, Continuation continuation) {
                Object objCollect = flowM28819debounceHG0u8IE.collect(new C243782(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$special$$inlined$filter$1$2 */
            public static final class C243782<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$special$$inlined$filter$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return C243782.this.emit(null, this);
                    }
                }

                public C243782(FlowCollector flowCollector) {
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
                        if (((OptionSideBySideChainDataState3) obj) != OptionSideBySideChainDataState3.USER_INTERACTION_IN_PROGRESS) {
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
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.simulatedReturnChartShownPref.set(false);
        this.optionSideBySideChainStore.recordSideBySideChainShown();
        initializeSideBySideChainTooltipStatus();
        initializeUserIdleCollector();
        initializeEarliestSelloutTime();
        initializeIsMarketOpen();
        computeTooltipState();
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        this.optionAccountSwitcherStore.setActiveAccountNumber(((InternalOptionChainFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInitialAccountNumber());
        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.optionAccountSwitcherStore.streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C243971(flowBuffer$default, this, null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C244022(flowBuffer$default, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244033(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244044(flowBuffer$default, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244055(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244066(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244077(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244088(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C244099(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2439810(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2439911(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2440012(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2440113(null));
    }

    /* compiled from: OptionSideBySideChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$1 */
    static final class C243971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C243971(Flow<String> flow, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super C243971> continuation) {
            super(2, continuation);
            this.$accountNumberFlow = flow;
            this.this$0 = optionSideBySideChainDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C243971(this.$accountNumberFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C243971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$accountNumberFlow, new C24368x739d4f41(null, this.this$0)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$1$2$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                final /* synthetic */ Account $account;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$account = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, this.$account, null, null, null, null, null, null, false, false, false, false, null, null, null, extensions2.persistentListOf(), null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -16386, null);
                }
            }
        }
    }

    /* compiled from: OptionSideBySideChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$2 */
    static final class C244022 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C244022(Flow<String> flow, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super C244022> continuation) {
            super(2, continuation);
            this.$accountNumberFlow = flow;
            this.this$0 = optionSideBySideChainDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244022(this.$accountNumberFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244022) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$accountNumberFlow, new C24370xcabb4020(null, this.this$0)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$2$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionSettings, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSettings optionSettings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$2$2$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                final /* synthetic */ OptionSettings $optionSettings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSettings optionSettings, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$optionSettings = optionSettings;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionSettings, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, this.$optionSettings.getDefaultPricingSetting(), null, null, false, false, false, false, null, null, null, null, null, null, null, null, this.$optionSettings.getTradingOnExpirationState(), null, false, null, false, false, false, false, false, null, false, false, false, -524305, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((OptionSettings) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$3", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {192}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$3 */
    static final class C244033 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C244033(Continuation<? super C244033> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainDuxo.this.new C244033(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244033) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionSideBySideChainDuxo.this.optionMarketHoursStore.streamCurrentOrNextMarketDates()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$3$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionCurrentOrNextMarketDates, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainDuxo;
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$3$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504001 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                final /* synthetic */ OptionCurrentOrNextMarketDates $dates;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504001(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Continuation<? super C504001> continuation) {
                    super(2, continuation);
                    this.$dates = optionCurrentOrNextMarketDates;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504001 c504001 = new C504001(this.$dates, continuation);
                    c504001.L$0 = obj;
                    return c504001;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                    return ((C504001) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, this.$dates, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504001((OptionCurrentOrNextMarketDates) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4 */
    static final class C244044 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C244044(Flow<String> flow, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super C244044> continuation) {
            super(2, continuation);
            this.$accountNumberFlow = flow;
            this.this$0 = optionSideBySideChainDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C244044(this.$accountNumberFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C244044) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberFlow, new C24371x78f721de(null, this.this$0));
                final OptionSideBySideChainDuxo optionSideBySideChainDuxo = this.this$0;
                Flow flowTake = FlowKt.take(new Flow<Sequence<? extends OptionChainExpirationDateState>>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Sequence<? extends OptionChainExpirationDateState>> flowCollector, Continuation continuation) {
                        Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector, optionSideBySideChainDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ OptionSideBySideChainDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = optionSideBySideChainDuxo;
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
                                List list = (List) obj;
                                List<UiOptionChain> uiOptionChains = ((InternalOptionChainFragmentKey) OptionSideBySideChainDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getUiOptionChains();
                                final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(uiOptionChains, 10)), 16));
                                for (T t : uiOptionChains) {
                                    linkedHashMap.put(((UiOptionChain) t).getOptionChain().getId(), t);
                                }
                                Sequence sequenceMapNotNull = SequencesKt.mapNotNull(CollectionsKt.asSequence(list), 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0085: INVOKE (r8v4 'sequenceMapNotNull' kotlin.sequences.Sequence) = 
                                      (wrap:kotlin.sequences.Sequence:0x007c: INVOKE (r8v1 'list' java.util.List) STATIC call: kotlin.collections.CollectionsKt.asSequence(java.lang.Iterable):kotlin.sequences.Sequence A[MD:<T>:(java.lang.Iterable<? extends T>):kotlin.sequences.Sequence<T> (m), WRAPPED] (LINE:58))
                                      (wrap:kotlin.jvm.functions.Function1<com.robinhood.models.ui.UiAggregateOptionPositionSimple, com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState>:0x0082: CONSTRUCTOR (r5v1 'linkedHashMap' java.util.LinkedHashMap A[DONT_INLINE]) A[MD:(java.util.Map<java.util.UUID, com.robinhood.models.ui.UiOptionChain>):void (m), WRAPPED] (LINE:59) call: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$2$1.<init>(java.util.Map):void type: CONSTRUCTOR)
                                     STATIC call: kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence A[DECLARE_VAR, MD:<T, R>:(kotlin.sequences.Sequence<? extends T>, kotlin.jvm.functions.Function1<? super T, ? extends R>):kotlin.sequences.Sequence<R> (m)] (LINE:59) in method: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes11.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$2$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 21 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r9 instanceof com.robinhood.android.optionschain.sbschain.C24372x867ad2f0.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r9
                                    com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2$1 r0 = (com.robinhood.android.optionschain.sbschain.C24372x867ad2f0.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2$1 r0 = new com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$invokeSuspend$$inlined$map$1$2$1
                                    r0.<init>(r9)
                                L18:
                                    java.lang.Object r9 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L31
                                    if (r2 != r3) goto L29
                                    kotlin.ResultKt.throwOnFailure(r9)
                                    goto L92
                                L29:
                                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                                    r8.<init>(r9)
                                    throw r8
                                L31:
                                    kotlin.ResultKt.throwOnFailure(r9)
                                    kotlinx.coroutines.flow.FlowCollector r9 = r7.$this_unsafeFlow
                                    java.util.List r8 = (java.util.List) r8
                                    com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$Companion r2 = com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo.INSTANCE
                                    com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo r4 = r7.this$0
                                    android.os.Parcelable r2 = r2.getArgs(r4)
                                    com.robinhood.android.options.contracts.InternalOptionChainFragmentKey r2 = (com.robinhood.android.options.contracts.InternalOptionChainFragmentKey) r2
                                    java.util.List r2 = r2.getUiOptionChains()
                                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                                    r4 = 10
                                    int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
                                    int r4 = kotlin.collections.MapsKt.mapCapacity(r4)
                                    r5 = 16
                                    int r4 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r5)
                                    java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                                    r5.<init>(r4)
                                    java.util.Iterator r2 = r2.iterator()
                                L61:
                                    boolean r4 = r2.hasNext()
                                    if (r4 == 0) goto L7a
                                    java.lang.Object r4 = r2.next()
                                    r6 = r4
                                    com.robinhood.models.ui.UiOptionChain r6 = (com.robinhood.models.p355ui.UiOptionChain) r6
                                    com.robinhood.models.db.OptionChain r6 = r6.getOptionChain()
                                    java.util.UUID r6 = r6.getId()
                                    r5.put(r6, r4)
                                    goto L61
                                L7a:
                                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                                    kotlin.sequences.Sequence r8 = kotlin.collections.CollectionsKt.asSequence(r8)
                                    com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$2$1 r2 = new com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$2$1
                                    r2.<init>(r5)
                                    kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.mapNotNull(r8, r2)
                                    r0.label = r3
                                    java.lang.Object r8 = r9.emit(r8, r0)
                                    if (r8 != r1) goto L92
                                    return r1
                                L92:
                                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                                    return r8
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionschain.sbschain.C24372x867ad2f0.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }
                    }, 1);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "states", "Lkotlin/sequences/Sequence;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$3", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Sequence<? extends OptionChainExpirationDateState>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Sequence<? extends OptionChainExpirationDateState> sequence, Continuation<? super Unit> continuation) {
                    return invoke2((Sequence<OptionChainExpirationDateState>) sequence, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Sequence<OptionChainExpirationDateState> sequence, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(sequence, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$3$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ Sequence<OptionChainExpirationDateState> $states;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Sequence<OptionChainExpirationDateState> sequence, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$states = sequence;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$states, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, extensions2.toImmutableList(this.$states), false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -65, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Sequence) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$5", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$5 */
        static final class C244055 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C244055(Continuation<? super C244055> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C244055(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C244055) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(OptionSideBySideChainDuxo.this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEtfSupported", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$5$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$5$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504011 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $isEtfSupported;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504011(boolean z, Continuation<? super C504011> continuation) {
                        super(2, continuation);
                        this.$isEtfSupported = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504011 c504011 = new C504011(this.$isEtfSupported, continuation);
                        c504011.L$0 = obj;
                        return c504011;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C504011) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, this.$isEtfSupported, null, false, false, false, false, false, null, false, false, false, -2097153, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504011(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6 */
        static final class C244066 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C244066(Continuation<? super C244066> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C244066(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C244066) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionSideBySideChainViewState> stateFlow = OptionSideBySideChainDuxo.this.getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ImmutableList<? extends OptionLegBundle>>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ImmutableList<? extends OptionLegBundle>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    ImmutableList<OptionLegBundle> selectedLegs = ((OptionSideBySideChainViewState) obj).getSelectedLegs();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(selectedLegs, anonymousClass1) == coroutine_suspended) {
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
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "selectedLegs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/OptionLegBundle;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ImmutableList<? extends OptionLegBundle>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(ImmutableList<? extends OptionLegBundle> immutableList, Continuation<? super Unit> continuation) {
                    return invoke2((ImmutableList<OptionLegBundle>) immutableList, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(ImmutableList<OptionLegBundle> immutableList, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(immutableList, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getSavedStateHandle().set(OptionSideBySideChainDuxo.ARG_SBS_CHAIN_SELECTED_LEGS, Lists4.toArrayList((ImmutableList) this.L$0));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$7", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$7 */
        static final class C244077 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C244077(Continuation<? super C244077> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C244077(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C244077) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(OptionSideBySideChainDuxo.this.experimentsStore, new Experiment[]{Experiments.OptionsExpirationDateSnackbarDismissalExperiment.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$7$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$7$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504021 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $inExp;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504021(boolean z, Continuation<? super C504021> continuation) {
                        super(2, continuation);
                        this.$inExp = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504021 c504021 = new C504021(this.$inExp, continuation);
                        c504021.L$0 = obj;
                        return c504021;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C504021) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, this.$inExp, false, false, null, false, false, false, -33554433, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504021(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$8", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$8 */
        static final class C244088 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C244088(Continuation<? super C244088> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C244088(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C244088) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionSideBySideChainDuxo.this.optionChainSettingsPnlChartTypePref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "type", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$8$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainSettingsPnlChartType, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optionChainSettingsPnlChartType, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$8$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504031 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ OptionChainSettingsPnlChartType $type;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504031(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super C504031> continuation) {
                        super(2, continuation);
                        this.$type = optionChainSettingsPnlChartType;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504031 c504031 = new C504031(this.$type, continuation);
                        c504031.L$0 = obj;
                        return c504031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C504031) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                        final OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = this.$type;
                        return optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$8$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionSideBySideChainDuxo.C244088.AnonymousClass1.C504031.invokeSuspend$lambda$0(optionChainSettingsPnlChartType, (TooltipEligibility) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final TooltipEligibility invokeSuspend$lambda$0(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, TooltipEligibility tooltipEligibility) {
                        return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, false, false, null, optionChainSettingsPnlChartType, 511, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504031((OptionChainSettingsPnlChartType) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$9", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$9 */
        static final class C244099 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C244099(Continuation<? super C244099> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C244099(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C244099) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionSideBySideChainDuxo.this.optionSbsEduFooterDismissedPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isDismissed", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$9$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$9$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504041 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $isDismissed;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504041(boolean z, Continuation<? super C504041> continuation) {
                        super(2, continuation);
                        this.$isDismissed = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504041 c504041 = new C504041(this.$isDismissed, continuation);
                        c504041.L$0 = obj;
                        return c504041;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C504041) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, this.$isDismissed, false, false, -536870913, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504041(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$10", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {280}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$10 */
        static final class C2439810 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C2439810(Continuation<? super C2439810> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C2439810(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2439810) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(OptionSideBySideChainDuxo.this.optionSbsLottieNuxAnimationSeenPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isSeen", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$10$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$10$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503961 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $isSeen;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503961(boolean z, Continuation<? super C503961> continuation) {
                        super(2, continuation);
                        this.$isSeen = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503961 c503961 = new C503961(this.$isSeen, continuation);
                        c503961.L$0 = obj;
                        return c503961;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C503961) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, this.$isSeen, false, -1073741825, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503961(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$11", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$11 */
        static final class C2439911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C2439911(Continuation<? super C2439911> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C2439911(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2439911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(OptionSideBySideChainDuxo.this.experimentsStore, new Experiment[]{Experiments.OptionsSelloutImprovementExperiment.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inSelloutImprovementExp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$11$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$11$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503971 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $inSelloutImprovementExp;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503971(boolean z, Continuation<? super C503971> continuation) {
                        super(2, continuation);
                        this.$inSelloutImprovementExp = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503971 c503971 = new C503971(this.$inSelloutImprovementExp, continuation);
                        c503971.L$0 = obj;
                        return c503971;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C503971) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, this.$inSelloutImprovementExp, false, null, false, false, false, -67108865, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503971(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$12", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$12 */
        static final class C2440012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C2440012(Continuation<? super C2440012> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C2440012(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2440012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowStreamIsInSideBySideChainNuxRevampExperiment = OptionSideBySideChainDuxo.this.optionSideBySideChainStore.streamIsInSideBySideChainNuxRevampExperiment();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$12$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$12$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$12$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$12$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503981 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503981(boolean z, Continuation<? super C503981> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503981 c503981 = new C503981(this.$inExperiment, continuation);
                        c503981.L$0 = obj;
                        return c503981;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C503981) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                        final boolean z = this.$inExperiment;
                        return OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$12$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionSideBySideChainDuxo.C2440012.AnonymousClass1.C503981.invokeSuspend$lambda$0(z, (TooltipEligibility) obj2);
                            }
                        }), null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, this.$inExperiment, null, false, false, false, -134217729, null);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final TooltipEligibility invokeSuspend$lambda$0(boolean z, TooltipEligibility tooltipEligibility) {
                        return TooltipEligibility.copy$default(tooltipEligibility, false, z, false, false, false, false, false, false, null, null, 1021, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503981(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$13", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$13 */
        static final class C2440113 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C2440113(Continuation<? super C2440113> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C2440113(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2440113) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionSideBySideChainDuxo.this.experimentsStore, new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$13$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$13$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$13$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCreate$13$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503991 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $isMember;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503991(boolean z, Continuation<? super C503991> continuation) {
                        super(2, continuation);
                        this.$isMember = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503991 c503991 = new C503991(this.$isMember, continuation);
                        c503991.L$0 = obj;
                        return c503991;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C503991) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, this.$isMember, Integer.MAX_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503991(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
        public void onDestroy() {
            super.onDestroy();
            Iterator<T> it = ((InternalOptionChainFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getUiOptionChains().iterator();
            while (it.hasNext()) {
                this.optionSideBySideChainLogger.logAbortLoading((UiOptionChain) it.next());
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setDefaultPricingSetting$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setDefaultPricingSetting$1 */
        static final class C244181 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ OptionSettings.DefaultPricingSetting $defaultPricingSetting;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244181(OptionSettings.DefaultPricingSetting defaultPricingSetting, Continuation<? super C244181> continuation) {
                super(2, continuation);
                this.$defaultPricingSetting = defaultPricingSetting;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244181 c244181 = new C244181(this.$defaultPricingSetting, continuation);
                c244181.L$0 = obj;
                return c244181;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244181) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, this.$defaultPricingSetting, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -9, null);
            }
        }

        public final void setDefaultPricingSetting(OptionSettings.DefaultPricingSetting defaultPricingSetting) {
            Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
            applyMutation(new C244181(defaultPricingSetting, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCurrentPageUpdated$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onCurrentPageUpdated$1 */
        static final class C244101 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ int $currentPage;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244101(int i, Continuation<? super C244101> continuation) {
                super(2, continuation);
                this.$currentPage = i;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244101 c244101 = new C244101(this.$currentPage, continuation);
                c244101.L$0 = obj;
                return c244101;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244101) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, boxing.boxInt(this.$currentPage), null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -5, null);
            }
        }

        public final void onCurrentPageUpdated(int currentPage) {
            applyMutation(new C244101(currentPage, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setLottieNuxAnimationSeen$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setLottieNuxAnimationSeen$1 */
        static final class C244191 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C244191(Continuation<? super C244191> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244191 c244191 = new C244191(continuation);
                c244191.L$0 = obj;
                return c244191;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244191) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, true, false, -1073741825, null);
            }
        }

        public final void setLottieNuxAnimationSeen() {
            this.optionSideBySideChainStore.recordOptionSbsLottieNuxAnimationSeen();
            applyMutation(new C244191(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissEduFooterAnimation$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissEduFooterAnimation$1 */
        static final class C243821 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243821(Continuation<? super C243821> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243821 c243821 = new C243821(continuation);
                c243821.L$0 = obj;
                return c243821;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243821) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, OptionSideBySideChainDataState5.DISMISSED, true, false, false, -805306369, null);
            }
        }

        public final void dismissEduFooterAnimation() {
            this.optionSideBySideChainStore.recordSbsEduFooterDismissed();
            applyMutation(new C243821(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$startEduFooterAnimation$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$startEduFooterAnimation$1 */
        static final class C244241 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C244241(Continuation<? super C244241> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244241 c244241 = new C244241(continuation);
                c244241.L$0 = obj;
                return c244241;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244241) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, OptionSideBySideChainDataState5.PLAYING, false, false, false, -268435457, null);
            }
        }

        public final void startEduFooterAnimation() {
            applyMutation(new C244241(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$completeEduFooterAnimation$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$completeEduFooterAnimation$1 */
        static final class C243801 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243801(Continuation<? super C243801> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243801 c243801 = new C243801(continuation);
                c243801.L$0 = obj;
                return c243801;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243801) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, OptionSideBySideChainDataState5.FINISHED_PLAYING, false, false, false, -268435457, null);
            }
        }

        public final void completeEduFooterAnimation() {
            applyMutation(new C243801(null));
        }

        public final void onBidAskCellSingleTap(boolean selected, OptionLegBundle optionLegBundle) {
            if (optionLegBundle == null) {
                return;
            }
            if (selected) {
                onMultilegRemove(optionLegBundle);
            } else {
                onMultilegAdd(optionLegBundle);
            }
            applyMutation(new C243941(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onBidAskCellSingleTap$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onBidAskCellSingleTap$1 */
        static final class C243941 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243941(Continuation<? super C243941> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243941 c243941 = new C243941(continuation);
                c243941.L$0 = obj;
                return c243941;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243941) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, true, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -513, null);
            }
        }

        public final void logTapLegCell(OptionLegBundle optionLegBundle) {
            if (optionLegBundle == null) {
                return;
            }
            this.optionSideBySideChainLogger.logTapLegCell(optionLegBundle);
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onMultilegAdd$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onMultilegAdd$1 */
        static final class C244111 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ OptionLegBundle $optionLegBundle;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244111(OptionLegBundle optionLegBundle, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super C244111> continuation) {
                super(2, continuation);
                this.$optionLegBundle = optionLegBundle;
                this.this$0 = optionSideBySideChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244111 c244111 = new C244111(this.$optionLegBundle, this.this$0, continuation);
                c244111.L$0 = obj;
                return c244111;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244111) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                if (optionSideBySideChainDataState.getSelectedLegs().contains(this.$optionLegBundle)) {
                    return optionSideBySideChainDataState;
                }
                List mutableList = CollectionsKt.toMutableList((Collection) optionSideBySideChainDataState.getSelectedLegs());
                if (!optionSideBySideChainDataState.getSupportMultileg()) {
                    mutableList.clear();
                }
                mutableList.add(this.$optionLegBundle);
                CollectionsKt.sortWith(mutableList, new Comparator() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo.onMultilegAdd.1.1
                    @Override // java.util.Comparator
                    public final int compare(OptionLegBundle optionLegBundle, OptionLegBundle optionLegBundle2) {
                        return CompareOptionInstrumentForDisplay.compareOptionInstrumentForDisplay(optionLegBundle.getOptionInstrument(), optionLegBundle2.getOptionInstrument());
                    }
                });
                OptionLegBundle optionLegBundle = this.$optionLegBundle;
                Iterator it = mutableList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    OptionLegBundle optionLegBundle2 = (OptionLegBundle) it.next();
                    if (Intrinsics.areEqual(optionLegBundle2.getOptionInstrument().getId(), optionLegBundle.getOptionInstrument().getId()) && optionLegBundle2.getOptionConfigurationBundle().getOptionSide() != optionLegBundle.getOptionConfigurationBundle().getOptionSide()) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    mutableList.remove(i);
                }
                OptionContractType optionContractType = this.$optionLegBundle.getOptionConfigurationBundle().getOptionContractType();
                ImmutableList<OptionLegBundle> selectedLegs = optionSideBySideChainDataState.getSelectedLegs();
                ArrayList arrayList = new ArrayList();
                for (OptionLegBundle optionLegBundle3 : selectedLegs) {
                    if (optionLegBundle3.getOptionConfigurationBundle().getOptionContractType() == optionContractType) {
                        arrayList.add(optionLegBundle3);
                    }
                }
                if (arrayList.size() == 1) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : mutableList) {
                        if (((OptionLegBundle) obj2).getOptionConfigurationBundle().getOptionContractType() == optionContractType) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.size() == 2) {
                        this.this$0.submit(new OptionSideBySideChainEvent.ShowSpreadOverlayBorderAnimation(optionContractType));
                    }
                }
                return OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState, null, null, null, null, null, null, null, false, false, false, false, null, null, null, extensions2.toPersistentList(mutableList), null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -16385, null);
            }
        }

        private final void onMultilegAdd(OptionLegBundle optionLegBundle) {
            applyMutation(new C244111(optionLegBundle, this, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onMultilegRemove$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onMultilegRemove$1 */
        static final class C244121 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ OptionLegBundle $optionLegBundle;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244121(OptionLegBundle optionLegBundle, Continuation<? super C244121> continuation) {
                super(2, continuation);
                this.$optionLegBundle = optionLegBundle;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244121 c244121 = new C244121(this.$optionLegBundle, continuation);
                c244121.L$0 = obj;
                return c244121;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244121) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                return !optionSideBySideChainDataState.getSelectedLegs().contains(this.$optionLegBundle) ? optionSideBySideChainDataState : OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState, null, null, null, null, null, null, null, false, false, false, false, null, null, null, extensions2.toPersistentList(CollectionsKt.minus(CollectionsKt.toMutableList((Collection) optionSideBySideChainDataState.getSelectedLegs()), this.$optionLegBundle)), null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -16385, null);
            }
        }

        private final void onMultilegRemove(OptionLegBundle optionLegBundle) {
            applyMutation(new C244121(optionLegBundle, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onMultilegReplace$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onMultilegReplace$1 */
        static final class C244131 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ OptionLegBundlesToReplace $legBundlesToReplace;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244131(OptionLegBundlesToReplace optionLegBundlesToReplace, Continuation<? super C244131> continuation) {
                super(2, continuation);
                this.$legBundlesToReplace = optionLegBundlesToReplace;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244131 c244131 = new C244131(this.$legBundlesToReplace, continuation);
                c244131.L$0 = obj;
                return c244131;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244131) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                List mutableList = CollectionsKt.toMutableList((Collection) optionSideBySideChainDataState.getSelectedLegs());
                ImmutableList<OptionLegBundleWithRowIndex> legBundlesToRemove = this.$legBundlesToReplace.getLegBundlesToRemove();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundlesToRemove, 10));
                Iterator<OptionLegBundleWithRowIndex> it = legBundlesToRemove.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getLegBundle());
                }
                mutableList.removeAll(arrayList);
                ImmutableList<OptionLegBundleWithRowIndex> legBundlesToAdd = this.$legBundlesToReplace.getLegBundlesToAdd();
                ArrayList<OptionLegBundle> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundlesToAdd, 10));
                Iterator<OptionLegBundleWithRowIndex> it2 = legBundlesToAdd.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getLegBundle());
                }
                for (OptionLegBundle optionLegBundle : arrayList2) {
                    if (!mutableList.contains(optionLegBundle)) {
                        mutableList.add(optionLegBundle);
                    }
                    Iterator it3 = mutableList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i = -1;
                            break;
                        }
                        OptionLegBundle optionLegBundle2 = (OptionLegBundle) it3.next();
                        if (Intrinsics.areEqual(optionLegBundle2.getOptionInstrument().getId(), optionLegBundle.getOptionInstrument().getId()) && optionLegBundle2.getOptionConfigurationBundle().getOptionSide() != optionLegBundle.getOptionConfigurationBundle().getOptionSide()) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        mutableList.remove(i);
                    }
                }
                CollectionsKt.sortWith(mutableList, new Comparator() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo.onMultilegReplace.1.4
                    @Override // java.util.Comparator
                    public final int compare(OptionLegBundle optionLegBundle3, OptionLegBundle optionLegBundle4) {
                        return CompareOptionInstrumentForDisplay.compareOptionInstrumentForDisplay(optionLegBundle3.getOptionInstrument(), optionLegBundle4.getOptionInstrument());
                    }
                });
                return OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState, null, null, null, null, null, null, null, false, false, false, false, null, null, null, extensions2.toPersistentList(mutableList), null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -16385, null);
            }
        }

        public final void onMultilegReplace(OptionLegBundlesToReplace legBundlesToReplace) {
            Intrinsics.checkNotNullParameter(legBundlesToReplace, "legBundlesToReplace");
            applyMutation(new C244131(legBundlesToReplace, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onContractTypeClicked$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onContractTypeClicked$1 */
        static final class C243961 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ OptionContractType $optionContractType;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C243961(OptionContractType optionContractType, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super C243961> continuation) {
                super(2, continuation);
                this.$optionContractType = optionContractType;
                this.this$0 = optionSideBySideChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243961 c243961 = new C243961(this.$optionContractType, this.this$0, continuation);
                c243961.L$0 = obj;
                return c243961;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243961) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                OptionSideBySideChainDataState2 nextState = optionSideBySideChainDataState.getCallPutSwitcherState().getNextState(this.$optionContractType);
                this.this$0.optionSideBySideChainLogger.logTapCallPutSwitcher(nextState);
                return OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, nextState, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -32769, null);
            }
        }

        public final void onContractTypeClicked(OptionContractType optionContractType) {
            Intrinsics.checkNotNullParameter(optionContractType, "optionContractType");
            applyMutation(new C243961(optionContractType, this, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$clearSelectedLegs$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$clearSelectedLegs$1 */
        static final class C243791 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243791(Continuation<? super C243791> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243791 c243791 = new C243791(continuation);
                c243791.L$0 = obj;
                return c243791;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243791) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, extensions2.persistentListOf(), null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -16385, null);
            }
        }

        public final void clearSelectedLegs() {
            applyMutation(new C243791(null));
        }

        public final void logTapClearMultilegSelection() {
            this.optionSideBySideChainLogger.logTapClearMultilegSelection();
        }

        public final void turnOnTradeOnExpirationSetting() {
            Completable completableSwitchMapCompletable = this.optionAccountSwitcherStore.streamActiveAccountNumber().take(1L).switchMapCompletable(new Function() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo.turnOnTradeOnExpirationSetting.1
                @Override // io.reactivex.functions.Function
                public final CompletableSource apply(String accountNumber) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    return OptionSideBySideChainDuxo.this.optionSettingsStore.toggleFridayTradingCompletable(accountNumber, true);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
            LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionSideBySideChainDuxo.turnOnTradeOnExpirationSetting$lambda$2(this.f$0);
                }
            }, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionSideBySideChainDuxo.turnOnTradeOnExpirationSetting$lambda$3(this.f$0, (Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit turnOnTradeOnExpirationSetting$lambda$2(OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
            optionSideBySideChainDuxo.submit(OptionSideBySideChainEvent.EnableTradeOnExpirationSuccess.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit turnOnTradeOnExpirationSetting$lambda$3(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            optionSideBySideChainDuxo.submit(new OptionSideBySideChainEvent.EnableTradeOnExpirationFailure(throwable));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$showDiscoverZeroDteBottomSheetIfNotYet$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$showDiscoverZeroDteBottomSheetIfNotYet$1 */
        static final class C244231 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C244231(Continuation<? super C244231> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244231 c244231 = OptionSideBySideChainDuxo.this.new C244231(continuation);
                c244231.L$0 = obj;
                return c244231;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244231) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                if (optionSideBySideChainDataState.getHasShownDiscoverZeroDteBottomSheetInCurrentSession()) {
                    return optionSideBySideChainDataState;
                }
                OptionSideBySideChainDuxo.this.submit(OptionSideBySideChainEvent.ShowDiscoverZeroDteBottomSheet.INSTANCE);
                return OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState, null, null, null, null, null, null, null, true, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -129, null);
            }
        }

        public final void showDiscoverZeroDteBottomSheetIfNotYet() {
            applyMutation(new C244231(null));
        }

        /* renamed from: initializeSideBySideChainNuxMode$feature_options_chain_externalDebug */
        public final void m2329x75a36e64(boolean chainSettingsTappedInCurrentActivity) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new OptionSideBySideChainDuxo2(this, ((InternalOptionChainFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIDE_BY_SIDE_CHAIN_DEEPLINK) && !chainSettingsTappedInCurrentActivity, !this.optionSideBySideChainStore.getSideBySideChainShown(), null), 3, null);
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$1 */
        static final class C243901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C243901(Continuation<? super C243901> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C243901(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C243901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                    final OptionSideBySideChainDuxo optionSideBySideChainDuxo = this.this$0;
                    return OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionSideBySideChainDuxo.C243901.AnonymousClass1.invokeSuspend$lambda$0(optionSideBySideChainDuxo, optionSideBySideChainDataState, (TooltipEligibility) obj2);
                        }
                    }), null, null, null, null, null, null, null, false, this.this$0.optionChainSimulatedReturnLongPressBannerSeenPref.get(), false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -257, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final TooltipEligibility invokeSuspend$lambda$0(OptionSideBySideChainDuxo optionSideBySideChainDuxo, OptionSideBySideChainDataState optionSideBySideChainDataState, TooltipEligibility tooltipEligibility) {
                    return TooltipEligibility.copy$default(tooltipEligibility, false, false, !optionSideBySideChainDuxo.optionSideBySideChainStore.hasShownSideBySideChainSpreadTooltip(), !optionSideBySideChainDuxo.optionSideBySideChainStore.hasShownSwitchBackToClassicChainTooltip(), false, optionSideBySideChainDataState.getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK) ? false : optionSideBySideChainDuxo.simulatedReturnSwitchChartTooltipShownPref.get(), false, false, null, null, 979, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDuxo optionSideBySideChainDuxo = OptionSideBySideChainDuxo.this;
                optionSideBySideChainDuxo.applyMutation(new AnonymousClass1(optionSideBySideChainDuxo, null));
                return Unit.INSTANCE;
            }
        }

        private final void initializeSideBySideChainTooltipStatus() {
            getLifecycleScope().launchWhenCreated(new C243901(null));
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C243912(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2 */
        static final class C243912 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243912(Continuation<? super C243912> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243912 c243912 = OptionSideBySideChainDuxo.this.new C243912(continuation);
                c243912.L$0 = obj;
                return c243912;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C243912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {571}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
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
                        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.simulatedReturnChartShownPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                        C503931 c503931 = new C503931(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowBuffer$default, c503931, this) == coroutine_suspended) {
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

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shown", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503931 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    /* synthetic */ boolean Z$0;
                    int label;
                    final /* synthetic */ OptionSideBySideChainDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503931(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super C503931> continuation) {
                        super(2, continuation);
                        this.this$0 = optionSideBySideChainDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503931 c503931 = new C503931(this.this$0, continuation);
                        c503931.Z$0 = ((Boolean) obj).booleanValue();
                        return c503931;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return invoke(bool.booleanValue(), continuation);
                    }

                    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                        return ((C503931) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: OptionSideBySideChainDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2$1$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C503941 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                        final /* synthetic */ boolean $shown;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C503941(boolean z, Continuation<? super C503941> continuation) {
                            super(2, continuation);
                            this.$shown = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C503941 c503941 = new C503941(this.$shown, continuation);
                            c503941.L$0 = obj;
                            return c503941;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                            return ((C503941) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                            final boolean z = this.$shown;
                            return optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeSideBySideChainTooltipStatus$2$1$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionSideBySideChainDuxo.C243912.AnonymousClass1.C503931.C503941.invokeSuspend$lambda$0(z, (TooltipEligibility) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final TooltipEligibility invokeSuspend$lambda$0(boolean z, TooltipEligibility tooltipEligibility) {
                            return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, z, false, false, false, null, null, ErrorCodes.IO_EXCEPTION, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.applyMutation(new C503941(this.Z$0, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(OptionSideBySideChainDuxo.this, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final void logSpreadTooltipAppear(SpreadSelectionState spreadSelectionState) {
            Intrinsics.checkNotNullParameter(spreadSelectionState, "spreadSelectionState");
            this.optionSideBySideChainLogger.logSpreadTooltipAppear(spreadSelectionState);
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setSpreadSelectedOnCurrentPage$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setSpreadSelectedOnCurrentPage$1 */
        static final class C244211 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ boolean $selected;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244211(boolean z, Continuation<? super C244211> continuation) {
                super(2, continuation);
                this.$selected = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244211 c244211 = new C244211(this.$selected, continuation);
                c244211.L$0 = obj;
                return c244211;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244211) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                final boolean z = this.$selected;
                return optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setSpreadSelectedOnCurrentPage$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainDuxo.C244211.invokeSuspend$lambda$0(z, (TooltipEligibility) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final TooltipEligibility invokeSuspend$lambda$0(boolean z, TooltipEligibility tooltipEligibility) {
                return TooltipEligibility.copy$default(tooltipEligibility, z, false, false, false, false, false, false, false, null, null, 1022, null);
            }
        }

        public final void setSpreadSelectedOnCurrentPage(boolean selected) {
            applyMutation(new C244211(selected, null));
        }

        public final void setSeenSpreadTooltip() {
            this.optionSideBySideChainStore.setShownSideBySideChainSpreadTooltip();
        }

        public final void onTopTooltipBannerDismiss(OptionChainTooltipBanner3 type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i == 1) {
                applyMutation(new C244141(null));
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                applyMutation(new C244152(null));
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onTopTooltipBannerDismiss$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onTopTooltipBannerDismiss$1 */
        static final class C244141 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C244141(Continuation<? super C244141> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244141 c244141 = new C244141(continuation);
                c244141.L$0 = obj;
                return c244141;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244141) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, true, true, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -769, null);
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onTopTooltipBannerDismiss$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onTopTooltipBannerDismiss$2 */
        static final class C244152 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C244152(Continuation<? super C244152> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244152 c244152 = new C244152(continuation);
                c244152.L$0 = obj;
                return c244152;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244152) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, true, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -513, null);
            }
        }

        public final void onTopTooltipBannerAppear(OptionChainTooltipBanner3 type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i == 1) {
                this.optionChainSimulatedReturnLongPressBannerSeenPref.set(true);
            } else if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSpreadTooltipIfSeen$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSpreadTooltipIfSeen$1 */
        static final class C243841 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243841(Continuation<? super C243841> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243841 c243841 = new C243841(continuation);
                c243841.L$0 = obj;
                return c243841;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243841) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default(((OptionSideBySideChainDataState) this.L$0).copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSpreadTooltipIfSeen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainDuxo.C243841.invokeSuspend$lambda$0((TooltipEligibility) obj2);
                    }
                }), null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -4097, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final TooltipEligibility invokeSuspend$lambda$0(TooltipEligibility tooltipEligibility) {
                return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, false, false, null, null, 1019, null);
            }
        }

        public final void dismissSpreadTooltipIfSeen() {
            if (this.optionSideBySideChainStore.hasShownSideBySideChainSpreadTooltip()) {
                applyMutation(new C243841(null));
            }
        }

        public final void logSwitchBackToClassicChainTooltipAppear() {
            this.optionSideBySideChainLogger.logSwitchBackToClassicChainTooltipAppear();
        }

        public final void setSeenSwitchBackToClassicChainTooltip() {
            this.optionSideBySideChainStore.setShownSwitchBackToClassicChainTooltip();
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSwitchBackToClassicChainTooltip$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSwitchBackToClassicChainTooltip$1 */
        static final class C243851 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243851(Continuation<? super C243851> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243851 c243851 = new C243851(continuation);
                c243851.L$0 = obj;
                return c243851;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243851) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default(((OptionSideBySideChainDataState) this.L$0).copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSwitchBackToClassicChainTooltip$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainDuxo.C243851.invokeSuspend$lambda$0((TooltipEligibility) obj2);
                    }
                }), null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -4097, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final TooltipEligibility invokeSuspend$lambda$0(TooltipEligibility tooltipEligibility) {
                return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, false, false, null, null, 1015, null);
            }
        }

        public final void dismissSwitchBackToClassicChainTooltip() {
            applyMutation(new C243851(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {660}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1 */
        static final class C243831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $withDelay;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C243831(boolean z, Continuation<? super C243831> continuation) {
                super(2, continuation);
                this.$withDelay = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C243831(this.$withDelay, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C243831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionSideBySideChainDuxo.this.simulatedReturnSwitchChartTooltipShownPref.set(true);
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
                OptionSideBySideChainDuxo.this.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
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
                public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainDataState.copy$default(((OptionSideBySideChainDataState) this.L$0).copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$dismissSimulatedReturnSwitchChartTooltip$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionSideBySideChainDuxo.C243831.AnonymousClass1.invokeSuspend$lambda$0((TooltipEligibility) obj2);
                        }
                    }), null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -4097, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final TooltipEligibility invokeSuspend$lambda$0(TooltipEligibility tooltipEligibility) {
                    return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, true, false, false, null, null, 991, null);
                }
            }
        }

        public final void dismissSimulatedReturnSwitchChartTooltip(boolean withDelay) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C243831(withDelay, null), 3, null);
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$resetUserIdleTimer$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {675}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$resetUserIdleTimer$1 */
        static final class C244171 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ OptionSideBySideChainDataState3 $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244171(OptionSideBySideChainDataState3 optionSideBySideChainDataState3, Continuation<? super C244171> continuation) {
                super(2, continuation);
                this.$state = optionSideBySideChainDataState3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244171 c244171 = OptionSideBySideChainDuxo.this.new C244171(this.$state, continuation);
                c244171.L$0 = obj;
                return c244171;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244171) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                OptionSideBySideChainDataState optionSideBySideChainDataState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionSideBySideChainDataState optionSideBySideChainDataState2 = (OptionSideBySideChainDataState) this.L$0;
                    SharedFlow2 sharedFlow2 = OptionSideBySideChainDuxo.this.pageLoadedAndUserEventFlow;
                    OptionSideBySideChainDataState3 optionSideBySideChainDataState3 = this.$state;
                    this.L$0 = optionSideBySideChainDataState2;
                    this.label = 1;
                    if (sharedFlow2.emit(optionSideBySideChainDataState3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    optionSideBySideChainDataState = optionSideBySideChainDataState2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$resetUserIdleTimer$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainDuxo.C244171.invokeSuspend$lambda$0((TooltipEligibility) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final TooltipEligibility invokeSuspend$lambda$0(TooltipEligibility tooltipEligibility) {
                return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, false, false, null, null, 959, null);
            }
        }

        public final void resetUserIdleTimer(OptionSideBySideChainDataState3 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            applyMutation(new C244171(state, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$markSelloutSnackbarDismissedOrElapsed$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$markSelloutSnackbarDismissedOrElapsed$1 */
        static final class C243931 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C243931(Continuation<? super C243931> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243931 c243931 = new C243931(continuation);
                c243931.L$0 = obj;
                return c243931;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243931) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, true, false, false, false, null, false, false, false, -16777217, null);
            }
        }

        public final void markSelloutSnackbarDismissedOrElapsed() {
            if (getStateFlow().getValue().isOnTodayTab() && getStateFlow().getValue().isSelloutSnackbarDismissalExperimentEnabled()) {
                applyMutation(new C243931(null));
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$startSelloutSnackbarTimer$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {692}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$startSelloutSnackbarTimer$1 */
        static final class C244251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C244251(Continuation<? super C244251> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C244251(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C244251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                OptionSideBySideChainDuxo.this.markSelloutSnackbarDismissedOrElapsed();
                return Unit.INSTANCE;
            }
        }

        public final void startSelloutSnackbarTimer() {
            this.snackbarTimerJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C244251(null), 3, null);
        }

        public final void cancelSnackbarTimer() {
            Job job = this.snackbarTimerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeUserIdleCollector$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {703}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeUserIdleCollector$1 */
        static final class C243921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C243921(Continuation<? super C243921> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C243921(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C243921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/optionschain/sbschain/IdleTimerState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeUserIdleCollector$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeUserIdleCollector$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState3, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainDataState3 optionSideBySideChainDataState3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainDataState3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeUserIdleCollector$1$1$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeUserIdleCollector$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503951 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C503951(Continuation<? super C503951> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503951 c503951 = new C503951(continuation);
                        c503951.L$0 = obj;
                        return c503951;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((C503951) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((OptionSideBySideChainDataState) this.L$0).copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeUserIdleCollector$1$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionSideBySideChainDuxo.C243921.AnonymousClass1.C503951.invokeSuspend$lambda$0((TooltipEligibility) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final TooltipEligibility invokeSuspend$lambda$0(TooltipEligibility tooltipEligibility) {
                        return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, true, false, null, null, 959, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503951(null));
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
                    Flow flow = OptionSideBySideChainDuxo.this.userIdleFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainDuxo.this, null);
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

        private final void initializeUserIdleCollector() {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C243921(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {726}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1 */
        static final class C243861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C243861(Continuation<? super C243861> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C243861(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C243861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionSideBySideChainDuxo optionSideBySideChainDuxo = OptionSideBySideChainDuxo.this;
                    final StateFlow<OptionSideBySideChainViewState> stateFlow = optionSideBySideChainDuxo.getStateFlow();
                    Observable<T> observableAsObservable = optionSideBySideChainDuxo.asObservable(FlowKt.transformLatest(new Flow<OptionChainExpirationDateState>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionChainExpirationDateState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates = ((OptionSideBySideChainViewState) obj).getAdjustedExpirationDateStates();
                                    OptionChainExpirationDateState optionChainExpirationDateState = adjustedExpirationDateStates != null ? (OptionChainExpirationDateState) CollectionsKt.firstOrNull((List) adjustedExpirationDateStates) : null;
                                    if (optionChainExpirationDateState != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(optionChainExpirationDateState, anonymousClass1) == coroutine_suspended) {
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
                    }, new C24358x46c1b0c0(null, OptionSideBySideChainDuxo.this)));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    Instant instantOfEpochSecond = Instant.ofEpochSecond(0L);
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.onTimeoutEmit(observableAsObservable, 1L, timeUnit, instantOfEpochSecond)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionSideBySideChainDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "selloutTime", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$3", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$3$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeEarliestSelloutTime$1$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ Instant $selloutTime;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Instant instant, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$selloutTime = instant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selloutTime, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, this.$selloutTime, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -33, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Instant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        private final void initializeEarliestSelloutTime() {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C243861(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {747}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1 */
        static final class C243871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C243871(Continuation<? super C243871> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C243871(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C243871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionSideBySideChainViewState> stateFlow = OptionSideBySideChainDuxo.this.getStateFlow();
                    final Flow flowTransformLatest = FlowKt.transformLatest(new Flow<OptionChainExpirationDateState>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionChainExpirationDateState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates = ((OptionSideBySideChainViewState) obj).getAdjustedExpirationDateStates();
                                    OptionChainExpirationDateState optionChainExpirationDateState = adjustedExpirationDateStates != null ? (OptionChainExpirationDateState) CollectionsKt.firstOrNull((List) adjustedExpirationDateStates) : null;
                                    if (optionChainExpirationDateState != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(optionChainExpirationDateState, anonymousClass1) == coroutine_suspended) {
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
                    }, new C24360x9440d03c(null, OptionSideBySideChainDuxo.this));
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    Boolean boolBoxBoolean = boxing.boxBoolean(((OptionTradingSession) obj).isRegular());
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
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(OptionSideBySideChainDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isOptionRegularTradingOpenHours", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$4", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$4$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$initializeIsMarketOpen$1$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ boolean $isOptionRegularTradingOpenHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$isOptionRegularTradingOpenHours = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isOptionRegularTradingOpenHours, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, this.$isOptionRegularTradingOpenHours, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -1025, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        private final void initializeIsMarketOpen() {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C243871(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setNuxSearchDismissed$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setNuxSearchDismissed$1 */
        static final class C244201 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ boolean $dismissed;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C244201(boolean z, Continuation<? super C244201> continuation) {
                super(2, continuation);
                this.$dismissed = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244201 c244201 = new C244201(this.$dismissed, continuation);
                c244201.L$0 = obj;
                return c244201;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244201) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, this.$dismissed, false, false, false, false, null, false, false, false, -8388609, null);
            }
        }

        public final void setNuxSearchDismissed(boolean dismissed) {
            applyMutation(new C244201(dismissed, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setTappedChainSettingsInCurrentSession$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setTappedChainSettingsInCurrentSession$1 */
        static final class C244221 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C244221(Continuation<? super C244221> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244221 c244221 = new C244221(continuation);
                c244221.L$0 = obj;
                return c244221;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244221) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((OptionSideBySideChainDataState) this.L$0).copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$setTappedChainSettingsInCurrentSession$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainDuxo.C244221.invokeSuspend$lambda$0((TooltipEligibility) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final TooltipEligibility invokeSuspend$lambda$0(TooltipEligibility tooltipEligibility) {
                return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, false, true, null, null, 895, null);
            }
        }

        public final void setTappedChainSettingsInCurrentSession() {
            this.optionSideBySideChainLogger.logTapSettings();
            applyMutation(new C244221(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onBottomSheetStateUpdated$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onBottomSheetStateUpdated$1 */
        static final class C243951 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            final /* synthetic */ MultiModeSheetState2 $value;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C243951(MultiModeSheetState2 multiModeSheetState2, OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super C243951> continuation) {
                super(2, continuation);
                this.$value = multiModeSheetState2;
                this.this$0 = optionSideBySideChainDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C243951 c243951 = new C243951(this.$value, this.this$0, continuation);
                c243951.L$0 = obj;
                return c243951;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C243951) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                if (Intrinsics.areEqual(this.$value, MultiModeSheetState2.Expanded.INSTANCE) && optionSideBySideChainDataState.getTooltipState() == OptionSideBySideChainDataState7.CHAIN_SETTINGS_NUX) {
                    this.this$0.setSeenSwitchBackToClassicChainTooltip();
                    final MultiModeSheetState2 multiModeSheetState2 = this.$value;
                    return OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onBottomSheetStateUpdated$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionSideBySideChainDuxo.C243951.invokeSuspend$lambda$0(multiModeSheetState2, (TooltipEligibility) obj2);
                        }
                    }), null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -4097, null);
                }
                final MultiModeSheetState2 multiModeSheetState22 = this.$value;
                return optionSideBySideChainDataState.copyTooltipEligibility(new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$onBottomSheetStateUpdated$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainDuxo.C243951.invokeSuspend$lambda$1(multiModeSheetState22, (TooltipEligibility) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final TooltipEligibility invokeSuspend$lambda$0(MultiModeSheetState2 multiModeSheetState2, TooltipEligibility tooltipEligibility) {
                return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, false, false, multiModeSheetState2, null, 759, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final TooltipEligibility invokeSuspend$lambda$1(MultiModeSheetState2 multiModeSheetState2, TooltipEligibility tooltipEligibility) {
                return TooltipEligibility.copy$default(tooltipEligibility, false, false, false, false, false, false, false, false, multiModeSheetState2, null, 767, null);
            }
        }

        public final void onBottomSheetStateUpdated(MultiModeSheetState2 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            applyMutation(new C243951(value, this, null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {793}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1 */
        static final class C243811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C243811(Continuation<? super C243811> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionSideBySideChainDuxo.this.new C243811(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C243811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionSideBySideChainViewState> stateFlow = OptionSideBySideChainDuxo.this.getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends TooltipEligibility, ? extends OptionSideBySideChainDataState7>>() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends TooltipEligibility, ? extends OptionSideBySideChainDataState7>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    OptionSideBySideChainViewState optionSideBySideChainViewState = (OptionSideBySideChainViewState) obj;
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(optionSideBySideChainViewState.getTooltipEligibility(), optionSideBySideChainViewState.getTooltipState());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionSideBySideChainDuxo.this, null);
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

            /* compiled from: OptionSideBySideChainDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/optionschain/sbschain/TooltipEligibility;", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$2", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends TooltipEligibility, ? extends OptionSideBySideChainDataState7>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends TooltipEligibility, ? extends OptionSideBySideChainDataState7> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<TooltipEligibility, ? extends OptionSideBySideChainDataState7>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<TooltipEligibility, ? extends OptionSideBySideChainDataState7> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    TooltipEligibility tooltipEligibility = (TooltipEligibility) tuples2.component1();
                    if (((OptionSideBySideChainDataState7) tuples2.component2()) == null) {
                        this.this$0.applyMutation(new AnonymousClass1(tooltipEligibility, null));
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionSideBySideChainDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$2$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$computeTooltipState$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
                    final /* synthetic */ TooltipEligibility $tooltipEligibility;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(TooltipEligibility tooltipEligibility, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$tooltipEligibility = tooltipEligibility;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tooltipEligibility, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                        return ((AnonymousClass1) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionSideBySideChainDataState optionSideBySideChainDataState = (OptionSideBySideChainDataState) this.L$0;
                        return optionSideBySideChainDataState.getTooltipState() != null ? optionSideBySideChainDataState : OptionSideBySideChainDataState.copy$default(optionSideBySideChainDataState, null, null, null, null, null, null, null, false, false, false, false, null, this.$tooltipEligibility.getTooltipStateIfNoTooltipIsShowing(optionSideBySideChainDataState.getLaunchMode()), null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -4097, null);
                    }
                }
            }
        }

        private final void computeTooltipState() {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C243811(null));
        }

        public final void logFragmentRecreated() {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            String str = null;
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(null, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), null, null, new Context(i, i2, i3, null, null, null, null, null, i4, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(null, null, null, null, null, null, null, null, null, null, null, null, "side_by_side_option_chain_recreated", null, 12287, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), null, null, 109, null), false, false, 6, null);
        }

        public final void recordUserLongPressed() {
            if (getStateFlow().getValue().getMultilegAvailable()) {
                return;
            }
            applyMutation(new C244161(null));
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$recordUserLongPressed$1", m3645f = "OptionSideBySideChainDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDuxo$recordUserLongPressed$1 */
        static final class C244161 extends ContinuationImpl7 implements Function2<OptionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C244161(Continuation<? super C244161> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C244161 c244161 = new C244161(continuation);
                c244161.L$0 = obj;
                return c244161;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainDataState optionSideBySideChainDataState, Continuation<? super OptionSideBySideChainDataState> continuation) {
                return ((C244161) create(optionSideBySideChainDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionSideBySideChainDataState.copy$default((OptionSideBySideChainDataState) this.L$0, null, null, null, null, null, null, null, false, true, false, false, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, -257, null);
            }
        }

        /* compiled from: OptionSideBySideChainDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;", "Lcom/robinhood/android/options/contracts/InternalOptionChainFragmentKey;", "<init>", "()V", "ARG_SBS_CHAIN_SELECTED_LEGS", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements DuxoCompanion<OptionSideBySideChainDuxo, InternalOptionChainFragmentKey> {
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
            public InternalOptionChainFragmentKey getArgs(OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
                return (InternalOptionChainFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionSideBySideChainDuxo);
            }
        }
    }
