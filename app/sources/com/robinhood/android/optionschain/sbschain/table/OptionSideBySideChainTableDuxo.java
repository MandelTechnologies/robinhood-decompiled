package com.robinhood.android.optionschain.sbschain.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.tradability.UiOptionInstrumentTradability;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState4;
import com.robinhood.android.optionschain.sbschain.logging.OptionSideBySideChainLogger;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDataState;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableEvent;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundlesToReplace;
import com.robinhood.android.optionschain.sbschain.table.util.OptionLegBundleReplaceHelper;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.OptionSbsEduFooterDismissedPref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainTableData;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p320db.OptionTradingSession;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: OptionSideBySideChainTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 `2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002_`B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\b\u0010*\u001a\u00020+H\u0016J6\u0010,\u001a\u00020+2\u001e\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u000202010/0.2\f\u00103\u001a\b\u0012\u0004\u0012\u0002000.H\u0002J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J6\u00107\u001a\u00020+2\f\u00103\u001a\b\u0012\u0004\u0012\u0002000.2\u001e\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u000202010/0.H\u0002J(\u00108\u001a\u00020+2\u001e\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u000202010/0.H\u0002J.\u00109\u001a\u00020+2\u0006\u0010:\u001a\u0002002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020AJ\u0010\u0010B\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u00010DJ\u0014\u0010E\u001a\u00020+2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0<J\u000e\u0010H\u001a\u00020+2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020+2\u0006\u0010L\u001a\u00020JJ\u0015\u0010M\u001a\u00020+2\u0006\u0010N\u001a\u00020OH\u0000¢\u0006\u0002\bPJ\u000e\u0010Q\u001a\u00020+2\u0006\u0010R\u001a\u00020)J\u0006\u0010S\u001a\u00020+J\u000e\u0010T\u001a\u00020+2\u0006\u0010U\u001a\u00020JJ\b\u0010V\u001a\u00020+H\u0002J\u0016\u0010W\u001a\u00020+2\f\u00103\u001a\b\u0012\u0004\u0012\u0002000.H\u0002J\b\u0010X\u001a\u00020+H\u0002J\u0006\u0010Y\u001a\u00020+J\u000e\u0010Z\u001a\u00020+2\u0006\u0010[\u001a\u00020\\J\u000e\u0010]\u001a\u00020+2\u0006\u0010[\u001a\u00020\\J\u000e\u0010^\u001a\u00020+2\u0006\u0010[\u001a\u00020\\R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableViewState;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo$InitArg;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainLogger", "Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionSbsEduFooterDismissedPref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "legUpdateDebounceFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "onCreate", "", "initializeOptionInstrumentsAndUnderlyingQuote", "expirationDateStateToOptionInstrumentsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "", "Lcom/robinhood/models/db/OptionInstrument;", "expirationDateStateFlow", "initialLoadCompleteObserver", "initializeOptionPositions", "initializeWatchlistItems", "pollOptionQuotes", "initializeTradeOnExpirationStates", "bind", "expirationDateState", "targetLegs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetStrikePrice", "Ljava/math/BigDecimal;", "scrollPositionForLastExpirationDate", "Lcom/robinhood/android/optionschain/sbschain/table/ScrollPosition;", "bindEquityInstrumentId", "equityInstrumentId", "Ljava/util/UUID;", "bindSelectedLegs", "selectedLegs", "Lcom/robinhood/models/ui/OptionLegBundle;", "bindSelloutSnackbarDismissedOrElapsed", "selloutSnackbarDismissedOrElapsed", "", "bindIsNuxSearchDismissed", "isNuxSearchDismissed", "bindInitialDragTarget", "dragTarget", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "bindInitialDragTarget$feature_options_chain_externalDebug", "onDraggedIndexChanged", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "onDragEnd", "bindIsNuxAnimationFinished", "isNuxAnimationFinished", "initializeLegUpdateObserver", "initializeOptionTradingOpenHours", "initializeSideBySideTableMetrics", "logHorizontalScrollStart", "logBeginLoading", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "logCompleteLoading", "logAbortLoading", "InitArg", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTableDuxo extends BaseDuxo3<OptionSideBySideChainTableDataState, OptionSideBySideChainTableViewState, OptionSideBySideChainTableEvent> implements HasArgs<InitArg> {
    private static final long INSTRUMENT_LOADING_TIMEOUT;
    private static final long LEG_UPDATE_DEBOUNCE_MS = 20;
    private final ExperimentsStore experimentsStore;
    private final SharedFlow2<Integer> legUpdateDebounceFlow;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final BooleanPreference optionSbsEduFooterDismissedPref;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSideBySideChainLogger optionSideBySideChainLogger;
    private final OptionSideBySideChainStore optionSideBySideChainStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArg getArgs(SavedStateHandle savedStateHandle) {
        return (InitArg) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSideBySideChainTableDuxo(ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainLogger optionSideBySideChainLogger, OptionSideBySideChainStore optionSideBySideChainStore, OptionsWatchlistStore optionsWatchlistStore, OptionInstrumentStore optionInstrumentStore, @OptionSbsEduFooterDismissedPref BooleanPreference optionSbsEduFooterDismissedPref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, OptionSideBySideChainTableStateProvider stateProvider) {
        super(new OptionSideBySideChainTableDataState(null, null, null, null, null, null, null, false, ((InitArg) INSTANCE.getArgs(savedStateHandle)).getNuxMode(), false, false, false, false, null, null, null, false, optionSbsEduFooterDismissedPref.get(), false, false, null, 1965823, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.experimentsStore = experimentsStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainLogger = optionSideBySideChainLogger;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionSbsEduFooterDismissedPref = optionSbsEduFooterDismissedPref;
        this.savedStateHandle = savedStateHandle;
        this.legUpdateDebounceFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C245591(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C245602(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C245613(null));
        final StateFlow<OptionSideBySideChainTableViewState> stateFlow = getStateFlow();
        Flow<OptionChainExpirationDateState> flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(new Flow<OptionChainExpirationDateState>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OptionChainExpirationDateState> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C245342(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$$inlined$mapNotNull$1$2 */
            public static final class C245342<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$$inlined$mapNotNull$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C245342.this.emit(null, this);
                    }
                }

                public C245342(FlowCollector flowCollector) {
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
                        OptionChainExpirationDateState expirationDateState = ((OptionSideBySideChainTableViewState) obj).getExpirationDateState();
                        if (expirationDateState != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(expirationDateState, anonymousClass1) == coroutine_suspended) {
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
        }, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionSideBySideChainTableDuxo.onCreate$lambda$1((OptionChainExpirationDateState) obj);
            }
        });
        SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.transformLatest(flowDistinctUntilChangedBy, new OptionSideBySideChainTableDuxo$onCreate$$inlined$flatMapLatest$1(null, this)), getLifecycleScope(), SharingStarted.INSTANCE.getEagerly(), 1);
        initializeOptionInstrumentsAndUnderlyingQuote(sharedFlowShareIn, flowDistinctUntilChangedBy);
        initialLoadCompleteObserver();
        initializeOptionPositions();
        initializeWatchlistItems();
        initializeTradeOnExpirationStates(sharedFlowShareIn);
        pollOptionQuotes(flowDistinctUntilChangedBy, sharedFlowShareIn);
        initializeLegUpdateObserver();
        initializeOptionTradingOpenHours(flowDistinctUntilChangedBy);
        initializeSideBySideTableMetrics();
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$1 */
    static final class C245591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C245591(Continuation<? super C245591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamIsInSideBySideChainNuxRevampExperiment = OptionSideBySideChainTableDuxo.this.optionSideBySideChainStore.streamIsInSideBySideChainNuxRevampExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainTableDuxo.this, null);
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
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

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$1$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504161 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ boolean $inExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504161(boolean z, Continuation<? super C504161> continuation) {
                    super(2, continuation);
                    this.$inExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504161 c504161 = new C504161(this.$inExperiment, continuation);
                    c504161.L$0 = obj;
                    return c504161;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((C504161) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, false, false, false, null, null, null, false, false, this.$inExperiment, false, null, 1835007, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504161(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {110}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$2 */
    static final class C245602 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C245602(Continuation<? super C245602> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245602(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionSideBySideChainTableDuxo.this.experimentsStore, new Experiment[]{Experiments.OptionsSnackbarDismissalFollowUp.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainTableDuxo.this, null);
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$2$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
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

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$2$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504171 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ boolean $inExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504171(boolean z, Continuation<? super C504171> continuation) {
                    super(2, continuation);
                    this.$inExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504171 c504171 = new C504171(this.$inExperiment, continuation);
                    c504171.L$0 = obj;
                    return c504171;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((C504171) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, false, false, false, null, null, null, false, false, false, this.$inExperiment, null, 1572863, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504171(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$3", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {119}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$3 */
    static final class C245613 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C245613(Continuation<? super C245613> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245613(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245613) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<OptionChainSettingsSideBySideBidAskPriceLabelType> flowStreamSideBySideBidAskPriceLabelSetting = OptionSideBySideChainTableDuxo.this.optionSettingsStore.streamSideBySideBidAskPriceLabelSetting();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainTableDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamSideBySideBidAskPriceLabelSetting, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "type", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$3$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainSettingsSideBySideBidAskPriceLabelType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionChainSettingsSideBySideBidAskPriceLabelType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$3$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504181 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ OptionChainSettingsSideBySideBidAskPriceLabelType $type;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504181(OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, Continuation<? super C504181> continuation) {
                    super(2, continuation);
                    this.$type = optionChainSettingsSideBySideBidAskPriceLabelType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504181 c504181 = new C504181(this.$type, continuation);
                    c504181.L$0 = obj;
                    return c504181;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((C504181) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, this.$type, null, null, null, null, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097147, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504181((OptionChainSettingsSideBySideBidAskPriceLabelType) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$1(OptionChainExpirationDateState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey();
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1 */
    static final class C245501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<OptionChainExpirationDateState> $expirationDateStateFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245501(Flow<OptionChainExpirationDateState> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super C245501> continuation) {
            super(2, continuation);
            this.$expirationDateStateFlow = flow;
            this.this$0 = optionSideBySideChainTableDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245501(this.$expirationDateStateFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<OptionChainExpirationDateState> flow = this.$expirationDateStateFlow;
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "expirationDateState", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainExpirationDateState, Continuation<? super Unit>, Object> {
            long J$0;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainExpirationDateState optionChainExpirationDateState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionChainExpirationDateState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                OptionChainExpirationDateState optionChainExpirationDateState;
                long j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionChainExpirationDateState optionChainExpirationDateState2 = (OptionChainExpirationDateState) this.L$0;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Job jobRefreshChainByExpiration = this.this$0.optionInstrumentStore.refreshChainByExpiration(false, optionChainExpirationDateState2.getUiOptionChain().getOptionChain().getId(), optionChainExpirationDateState2.getExpirationDate());
                    long j2 = OptionSideBySideChainTableDuxo.INSTRUMENT_LOADING_TIMEOUT;
                    C504091 c504091 = new C504091(jobRefreshChainByExpiration, null);
                    this.L$0 = optionChainExpirationDateState2;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    if (Timeout6.m28790withTimeoutOrNullKLykuaI(j2, c504091, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    optionChainExpirationDateState = optionChainExpirationDateState2;
                    j = jCurrentTimeMillis;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    optionChainExpirationDateState = (OptionChainExpirationDateState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Timber.INSTANCE.mo3350d("Sbs instrument " + optionChainExpirationDateState.getExpirationDate() + " load time = " + (System.currentTimeMillis() - j), new Object[0]);
                this.this$0.applyMutation(new AnonymousClass2(optionChainExpirationDateState, null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Job $job;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504091(Job job, Continuation<? super C504091> continuation) {
                    super(2, continuation);
                    this.$job = job;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C504091(this.$job, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C504091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = this.$job;
                        this.label = 1;
                        if (job.join(this) == coroutine_suspended) {
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

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ OptionChainExpirationDateState $expirationDateState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionChainExpirationDateState optionChainExpirationDateState, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$expirationDateState = optionChainExpirationDateState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$expirationDateState, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((AnonymousClass2) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((OptionSideBySideChainTableDataState) this.L$0).copyPageState(this.$expirationDateState, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$1$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionSideBySideChainTableDuxo.C245501.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0((OptionSideBySideChainTableDataState.PageState) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionSideBySideChainTableDataState.PageState invokeSuspend$lambda$0(OptionSideBySideChainTableDataState.PageState pageState) {
                    return OptionSideBySideChainTableDataState.PageState.copy$default(pageState, true, null, null, null, null, null, null, null, null, 510, null);
                }
            }
        }
    }

    private final void initializeOptionInstrumentsAndUnderlyingQuote(Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> expirationDateStateToOptionInstrumentsFlow, Flow<OptionChainExpirationDateState> expirationDateStateFlow) {
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C245501(expirationDateStateFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C245512(expirationDateStateFlow, expirationDateStateToOptionInstrumentsFlow, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2 */
    static final class C245512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<OptionChainExpirationDateState> $expirationDateStateFlow;
        final /* synthetic */ Flow<Tuples2<OptionChainExpirationDateState, List<OptionInstrument>>> $expirationDateStateToOptionInstrumentsFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C245512(Flow<OptionChainExpirationDateState> flow, Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> flow2, Continuation<? super C245512> continuation) {
            super(2, continuation);
            this.$expirationDateStateFlow = flow;
            this.$expirationDateStateToOptionInstrumentsFlow = flow2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245512(this.$expirationDateStateFlow, this.$expirationDateStateToOptionInstrumentsFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionSideBySideChainTableViewState> stateFlow = OptionSideBySideChainTableDuxo.this.getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ImmutableList<? extends UiOptionStrategyLegDisplay>>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ImmutableList<? extends UiOptionStrategyLegDisplay>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                ImmutableList<UiOptionStrategyLegDisplay> targetLegs = ((OptionSideBySideChainTableViewState) obj).getTargetLegs();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(targetLegs, anonymousClass1) == coroutine_suspended) {
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
                final StateFlow<OptionSideBySideChainTableViewState> stateFlow2 = OptionSideBySideChainTableDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(flowDistinctUntilChanged, FlowKt.distinctUntilChanged(new Flow<BigDecimal>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super BigDecimal> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$2$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                BigDecimal targetStrikePrice = ((OptionSideBySideChainTableViewState) obj).getTargetStrikePrice();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(targetStrikePrice, anonymousClass1) == coroutine_suspended) {
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
                }), this.$expirationDateStateFlow, new AnonymousClass3(null)), new C24522x2db89d76(null, OptionSideBySideChainTableDuxo.this, this.$expirationDateStateToOptionInstrumentsFlow));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(OptionSideBySideChainTableDuxo.this, null);
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "Ljava/math/BigDecimal;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "targetLegs", "targetStrikePrice", "expirationDateState"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$3", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function4<ImmutableList<? extends UiOptionStrategyLegDisplay>, BigDecimal, OptionChainExpirationDateState, Continuation<? super Tuples3<? extends ImmutableList<? extends UiOptionStrategyLegDisplay>, ? extends BigDecimal, ? extends OptionChainExpirationDateState>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(4, continuation);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(ImmutableList<? extends UiOptionStrategyLegDisplay> immutableList, BigDecimal bigDecimal, OptionChainExpirationDateState optionChainExpirationDateState, Continuation<? super Tuples3<? extends ImmutableList<? extends UiOptionStrategyLegDisplay>, ? extends BigDecimal, ? extends OptionChainExpirationDateState>> continuation) {
                return invoke2(immutableList, bigDecimal, optionChainExpirationDateState, (Continuation<? super Tuples3<? extends ImmutableList<? extends UiOptionStrategyLegDisplay>, ? extends BigDecimal, OptionChainExpirationDateState>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ImmutableList<? extends UiOptionStrategyLegDisplay> immutableList, BigDecimal bigDecimal, OptionChainExpirationDateState optionChainExpirationDateState, Continuation<? super Tuples3<? extends ImmutableList<? extends UiOptionStrategyLegDisplay>, ? extends BigDecimal, OptionChainExpirationDateState>> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = immutableList;
                anonymousClass3.L$1 = bigDecimal;
                anonymousClass3.L$2 = optionChainExpirationDateState;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Tuples3((ImmutableList) this.L$0, (BigDecimal) this.L$1, (OptionChainExpirationDateState) this.L$2);
            }
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$5", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionChainExpirationDateState, ? extends OptionSideBySideChainTableData>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionChainExpirationDateState, ? extends OptionSideBySideChainTableData> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<OptionChainExpirationDateState, OptionSideBySideChainTableData>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<OptionChainExpirationDateState, OptionSideBySideChainTableData> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$5$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ OptionChainExpirationDateState $expirationDateState;
                final /* synthetic */ OptionSideBySideChainTableData $tableData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionChainExpirationDateState optionChainExpirationDateState, OptionSideBySideChainTableData optionSideBySideChainTableData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$expirationDateState = optionChainExpirationDateState;
                    this.$tableData = optionSideBySideChainTableData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$expirationDateState, this.$tableData, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) this.L$0;
                    OptionChainExpirationDateState optionChainExpirationDateState = this.$expirationDateState;
                    final OptionSideBySideChainTableData optionSideBySideChainTableData = this.$tableData;
                    return optionSideBySideChainTableDataState.copyPageState(optionChainExpirationDateState, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionInstrumentsAndUnderlyingQuote$2$5$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionSideBySideChainTableDuxo.C245512.AnonymousClass5.AnonymousClass1.invokeSuspend$lambda$0(optionSideBySideChainTableData, (OptionSideBySideChainTableDataState.PageState) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionSideBySideChainTableDataState.PageState invokeSuspend$lambda$0(OptionSideBySideChainTableData optionSideBySideChainTableData, OptionSideBySideChainTableDataState.PageState pageState) {
                    return OptionSideBySideChainTableDataState.PageState.copy$default(pageState, false, null, optionSideBySideChainTableData, null, null, null, null, null, null, 507, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1((OptionChainExpirationDateState) tuples2.component1(), (OptionSideBySideChainTableData) tuples2.component2(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1 */
    static final class C245471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C245471(Continuation<? super C245471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionSideBySideChainTableViewState> stateFlow = OptionSideBySideChainTableDuxo.this.getStateFlow();
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(new Flow<OptionSideBySideChainTableViewState>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionSideBySideChainTableViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                OptionSideBySideChainTableViewState optionSideBySideChainTableViewState = (OptionSideBySideChainTableViewState) obj;
                                if (optionSideBySideChainTableViewState.getExpirationDateState() != null && optionSideBySideChainTableViewState.getInitialInstrumentsLoaded() && optionSideBySideChainTableViewState.getInitialScrollEvent() != null) {
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
                }, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainTableDuxo.C245471.invokeSuspend$lambda$1((OptionSideBySideChainTableViewState) obj2);
                    }
                });
                Flow<OptionSideBySideChainTableEvent> flow = new Flow<OptionSideBySideChainTableEvent>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionSideBySideChainTableEvent> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionSideBySideChainTableEvent initialScrollEvent = ((OptionSideBySideChainTableViewState) obj).getInitialScrollEvent();
                                if (initialScrollEvent != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(initialScrollEvent, anonymousClass1) == coroutine_suspended) {
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
                final OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo = OptionSideBySideChainTableDuxo.this;
                FlowCollector<? super OptionSideBySideChainTableEvent> flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo.initialLoadCompleteObserver.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((OptionSideBySideChainTableEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* compiled from: OptionSideBySideChainTableDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$4$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$4$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                        final /* synthetic */ OptionSideBySideChainTableEvent $event;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(OptionSideBySideChainTableEvent optionSideBySideChainTableEvent, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$event = optionSideBySideChainTableEvent;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                            return ((AnonymousClass1) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, false, false, true, null, null, null, false, false, false, false, new UiEvent(this.$event), 1044479, null);
                        }
                    }

                    public final Object emit(OptionSideBySideChainTableEvent optionSideBySideChainTableEvent, Continuation<? super Unit> continuation) {
                        if (optionSideBySideChainTableEvent instanceof OptionSideBySideChainTableEvent.ScrollToTargetRowIndex) {
                            optionSideBySideChainTableDuxo.applyMutation(new AnonymousClass1(optionSideBySideChainTableEvent, null));
                        } else {
                            optionSideBySideChainTableDuxo.applyMutation(new AnonymousClass2(optionSideBySideChainTableEvent, null));
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: OptionSideBySideChainTableDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$4$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$1$4$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                        final /* synthetic */ OptionSideBySideChainTableEvent $event;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(OptionSideBySideChainTableEvent optionSideBySideChainTableEvent, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$event = optionSideBySideChainTableEvent;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$event, continuation);
                            anonymousClass2.L$0 = obj;
                            return anonymousClass2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                            return ((AnonymousClass2) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, false, false, false, null, null, null, false, false, false, false, new UiEvent(this.$event), 1048575, null);
                        }
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
        public static final String invokeSuspend$lambda$1(OptionSideBySideChainTableViewState optionSideBySideChainTableViewState) {
            OptionChainExpirationDateState expirationDateState = optionSideBySideChainTableViewState.getExpirationDateState();
            if (expirationDateState != null) {
                return expirationDateState.getKey();
            }
            return null;
        }
    }

    private final void initialLoadCompleteObserver() {
        if (((InitArg) INSTANCE.getArgs((HasArgs) this)).getInSbsChainPerfExperiment()) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C245471(null));
        } else {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C245482(null));
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2 */
    static final class C245482 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C245482(Continuation<? super C245482> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245482(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245482) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionSideBySideChainTableViewState> stateFlow = OptionSideBySideChainTableDuxo.this.getStateFlow();
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(new Flow<OptionSideBySideChainTableViewState>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionSideBySideChainTableViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                OptionSideBySideChainTableViewState optionSideBySideChainTableViewState = (OptionSideBySideChainTableViewState) obj;
                                if (optionSideBySideChainTableViewState.getExpirationDateState() != null && optionSideBySideChainTableViewState.getInitialInstrumentsLoaded() && optionSideBySideChainTableViewState.getInitialScrollEvent() != null) {
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
                }, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainTableDuxo.C245482.invokeSuspend$lambda$1((OptionSideBySideChainTableViewState) obj2);
                    }
                });
                Flow<OptionSideBySideChainTableEvent> flow = new Flow<OptionSideBySideChainTableEvent>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionSideBySideChainTableEvent> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionSideBySideChainTableEvent initialScrollEvent = ((OptionSideBySideChainTableViewState) obj).getInitialScrollEvent();
                                if (initialScrollEvent != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(initialScrollEvent, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(OptionSideBySideChainTableDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass4, this) == coroutine_suspended) {
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
        public static final String invokeSuspend$lambda$1(OptionSideBySideChainTableViewState optionSideBySideChainTableViewState) {
            OptionChainExpirationDateState expirationDateState = optionSideBySideChainTableViewState.getExpirationDateState();
            if (expirationDateState != null) {
                return expirationDateState.getKey();
            }
            return null;
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$4", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableEvent, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSideBySideChainTableEvent optionSideBySideChainTableEvent, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(optionSideBySideChainTableEvent, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSideBySideChainTableEvent optionSideBySideChainTableEvent = (OptionSideBySideChainTableEvent) this.L$0;
                if (optionSideBySideChainTableEvent instanceof OptionSideBySideChainTableEvent.ScrollToTargetRowIndex) {
                    this.this$0.applyMutation(new AnonymousClass1(null));
                }
                this.this$0.submit(optionSideBySideChainTableEvent);
                return Unit.INSTANCE;
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$4$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initialLoadCompleteObserver$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
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
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, false, false, true, null, null, null, false, false, false, false, null, 2093055, null);
                }
            }
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1 */
    static final class C245521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C245521(Continuation<? super C245521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245521 c245521 = OptionSideBySideChainTableDuxo.this.new C245521(continuation);
            c245521.L$0 = obj;
            return c245521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
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
                    Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.this$0.optionAccountSwitcherStore.streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null), new C24528xb1637cd4(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionPositionCountMap", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiOptionPositionCounts;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends UiOptionPositionCounts>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainTableDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiOptionPositionCounts> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, UiOptionPositionCounts>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, UiOptionPositionCounts> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionSideBySideChainTableDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1$1$2$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionPositions$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C504101 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                    final /* synthetic */ Map<UUID, UiOptionPositionCounts> $optionPositionCountMap;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504101(Map<UUID, UiOptionPositionCounts> map, Continuation<? super C504101> continuation) {
                        super(2, continuation);
                        this.$optionPositionCountMap = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504101 c504101 = new C504101(this.$optionPositionCountMap, continuation);
                        c504101.L$0 = obj;
                        return c504101;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                        return ((C504101) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, this.$optionPositionCountMap, null, null, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097135, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504101((Map) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(OptionSideBySideChainTableDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void initializeOptionPositions() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C245521(null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1 */
    static final class C245581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C245581(Continuation<? super C245581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245581 c245581 = OptionSideBySideChainTableDuxo.this.new C245581(continuation);
            c245581.L$0 = obj;
            return c245581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
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
                    this.this$0.optionsWatchlistStore.refreshItems(false);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.optionsWatchlistStore.streamAllItems()), Integer.MAX_VALUE, null, 2, null);
                    C504141 c504141 = new C504141(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, c504141, this) == coroutine_suspended) {
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

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/CuratedListItems;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504141 extends ContinuationImpl7 implements Function2<Optional<? extends CuratedListItems>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504141(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super C504141> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainTableDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504141 c504141 = new C504141(this.this$0, continuation);
                    c504141.L$0 = obj;
                    return c504141;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<CuratedListItems> optional, Continuation<? super Unit> continuation) {
                    return ((C504141) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends CuratedListItems> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<CuratedListItems>) optional, continuation);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Set setEmptySet;
                    List<CuratedListItem> listItems;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        CuratedListItems curatedListItems = (CuratedListItems) ((Optional) this.L$0).component1();
                        if (curatedListItems == null || (listItems = curatedListItems.getListItems()) == null) {
                            setEmptySet = SetsKt.emptySet();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = listItems.iterator();
                            while (it.hasNext()) {
                                String strategyCode = ((CuratedListItem) it.next()).getStrategyCode();
                                if (strategyCode != null) {
                                    arrayList.add(strategyCode);
                                }
                            }
                            setEmptySet = CollectionsKt.toSet(arrayList);
                            if (setEmptySet == null) {
                            }
                        }
                        this.this$0.applyMutation(new C504151(setEmptySet, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* compiled from: OptionSideBySideChainTableDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1$1$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeWatchlistItems$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504151 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                    final /* synthetic */ Set<String> $watchlistSet;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504151(Set<String> set, Continuation<? super C504151> continuation) {
                        super(2, continuation);
                        this.$watchlistSet = set;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504151 c504151 = new C504151(this.$watchlistSet, continuation);
                        c504151.L$0 = obj;
                        return c504151;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                        return ((C504151) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, this.$watchlistSet, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097087, null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(OptionSideBySideChainTableDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void initializeWatchlistItems() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C245581(null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1 */
    static final class C245641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<OptionChainExpirationDateState> $expirationDateStateFlow;
        final /* synthetic */ Flow<Tuples2<OptionChainExpirationDateState, List<OptionInstrument>>> $expirationDateStateToOptionInstrumentsFlow;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C245641(Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Flow<OptionChainExpirationDateState> flow2, Continuation<? super C245641> continuation) {
            super(2, continuation);
            this.$expirationDateStateToOptionInstrumentsFlow = flow;
            this.this$0 = optionSideBySideChainTableDuxo;
            this.$expirationDateStateFlow = flow2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245641 c245641 = new C245641(this.$expirationDateStateToOptionInstrumentsFlow, this.this$0, this.$expirationDateStateFlow, continuation);
            c245641.L$0 = obj;
            return c245641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<OptionChainExpirationDateState, List<OptionInstrument>>> $expirationDateStateToOptionInstrumentsFlow;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$expirationDateStateToOptionInstrumentsFlow = flow;
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$expirationDateStateToOptionInstrumentsFlow, this.this$0, continuation);
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
                    final Flow<Tuples2<OptionChainExpirationDateState, List<OptionInstrument>>> flow = this.$expirationDateStateToOptionInstrumentsFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends OptionInstrument>>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends OptionInstrument>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                            /* JADX WARN: Multi-variable type inference failed */
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
                                    Object second = ((Tuples2) obj).getSecond();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(second, anonymousClass1) == coroutine_suspended) {
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
                    }), new C24536x225670a4(null, this.this$0));
                    this.label = 1;
                    if (FlowKt.collect(flowTransformLatest, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$expirationDateStateToOptionInstrumentsFlow, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$expirationDateStateFlow, this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {330}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<OptionChainExpirationDateState> $expirationDateStateFlow;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<OptionChainExpirationDateState> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$expirationDateStateFlow = flow;
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$expirationDateStateFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.$expirationDateStateFlow), new C24539x79746183(null, this.this$0));
                    C504192 c504192 = new C504192(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c504192, this) == coroutine_suspended) {
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

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$2$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C504192 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionChainExpirationDateState, ? extends Map<UUID, ? extends OptionInstrumentQuote>>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504192(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super C504192> continuation) {
                    super(2, continuation);
                    this.this$0 = optionSideBySideChainTableDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504192 c504192 = new C504192(this.this$0, continuation);
                    c504192.L$0 = obj;
                    return c504192;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionChainExpirationDateState, ? extends Map<UUID, ? extends OptionInstrumentQuote>> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<OptionChainExpirationDateState, ? extends Map<UUID, OptionInstrumentQuote>>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<OptionChainExpirationDateState, ? extends Map<UUID, OptionInstrumentQuote>> tuples2, Continuation<? super Unit> continuation) {
                    return ((C504192) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionSideBySideChainTableDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$2$2$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                    final /* synthetic */ OptionChainExpirationDateState $expirationDateState;
                    final /* synthetic */ Map<UUID, OptionInstrumentQuote> $optionQuotes;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionChainExpirationDateState optionChainExpirationDateState, Map<UUID, OptionInstrumentQuote> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$expirationDateState = optionChainExpirationDateState;
                        this.$optionQuotes = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$expirationDateState, this.$optionQuotes, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                        return ((AnonymousClass1) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) this.L$0;
                        OptionChainExpirationDateState optionChainExpirationDateState = this.$expirationDateState;
                        final Map<UUID, OptionInstrumentQuote> map = this.$optionQuotes;
                        return optionSideBySideChainTableDataState.copyPageState(optionChainExpirationDateState, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$pollOptionQuotes$1$2$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionSideBySideChainTableDuxo.C245641.AnonymousClass2.C504192.AnonymousClass1.invokeSuspend$lambda$0(map, (OptionSideBySideChainTableDataState.PageState) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionSideBySideChainTableDataState.PageState invokeSuspend$lambda$0(Map map, OptionSideBySideChainTableDataState.PageState pageState) {
                        return OptionSideBySideChainTableDataState.PageState.copy$default(pageState, false, null, null, MapsKt.plus(pageState.getOptionInstrumentQuotes(), map), null, null, null, null, null, 503, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        this.this$0.applyMutation(new AnonymousClass1((OptionChainExpirationDateState) tuples2.component1(), (Map) tuples2.component2(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    private final void pollOptionQuotes(Flow<OptionChainExpirationDateState> expirationDateStateFlow, Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> expirationDateStateToOptionInstrumentsFlow) {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C245641(expirationDateStateToOptionInstrumentsFlow, this, expirationDateStateFlow, null));
    }

    private final void initializeTradeOnExpirationStates(Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> expirationDateStateToOptionInstrumentsFlow) {
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.optionAccountSwitcherStore.streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null), new C24531xb267c02f(null, this)));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C245551(flowDistinctUntilChanged, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C245562(expirationDateStateToOptionInstrumentsFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C245573(flowDistinctUntilChanged, this, expirationDateStateToOptionInstrumentsFlow, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {352}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$1 */
    static final class C245551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<OptionSettings> $optionSettingsFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245551(Flow<OptionSettings> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super C245551> continuation) {
            super(2, continuation);
            this.$optionSettingsFlow = flow;
            this.this$0 = optionSideBySideChainTableDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245551(this.$optionSettingsFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<OptionSettings> flow = this.$optionSettingsFlow;
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSettings, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionSettings optionSettings, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$1$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504121 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ OptionSettings $optionSettings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504121(OptionSettings optionSettings, Continuation<? super C504121> continuation) {
                    super(2, continuation);
                    this.$optionSettings = optionSettings;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504121 c504121 = new C504121(this.$optionSettings, continuation);
                    c504121.L$0 = obj;
                    return c504121;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((C504121) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, this.$optionSettings.getTradingOnExpirationState(), null, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097119, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504121((OptionSettings) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {361}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$2 */
    static final class C245562 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<OptionChainExpirationDateState, List<OptionInstrument>>> $expirationDateStateToOptionInstrumentsFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C245562(Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super C245562> continuation) {
            super(2, continuation);
            this.$expirationDateStateToOptionInstrumentsFlow = flow;
            this.this$0 = optionSideBySideChainTableDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245562(this.$expirationDateStateToOptionInstrumentsFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245562) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<OptionChainExpirationDateState, List<OptionInstrument>>> flow = this.$expirationDateStateToOptionInstrumentsFlow;
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "", "Lcom/robinhood/models/db/OptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$2$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$2$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504131 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ OptionChainExpirationDateState $expirationDateState;
                final /* synthetic */ List<OptionInstrument> $optionInstruments;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504131(OptionChainExpirationDateState optionChainExpirationDateState, List<OptionInstrument> list, Continuation<? super C504131> continuation) {
                    super(2, continuation);
                    this.$expirationDateState = optionChainExpirationDateState;
                    this.$optionInstruments = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504131 c504131 = new C504131(this.$expirationDateState, this.$optionInstruments, continuation);
                    c504131.L$0 = obj;
                    return c504131;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((C504131) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) this.L$0;
                    OptionChainExpirationDateState optionChainExpirationDateState = this.$expirationDateState;
                    final List<OptionInstrument> list = this.$optionInstruments;
                    return optionSideBySideChainTableDataState.copyPageState(optionChainExpirationDateState, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$2$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionSideBySideChainTableDuxo.C245562.AnonymousClass1.C504131.invokeSuspend$lambda$0(list, (OptionSideBySideChainTableDataState.PageState) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionSideBySideChainTableDataState.PageState invokeSuspend$lambda$0(List list, OptionSideBySideChainTableDataState.PageState pageState) {
                    OptionInstrument optionInstrument = (OptionInstrument) CollectionsKt.firstOrNull(list);
                    return OptionSideBySideChainTableDataState.PageState.copy$default(pageState, false, null, null, null, null, optionInstrument != null ? optionInstrument.getSelloutDatetime() : null, null, null, null, 479, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.applyMutation(new C504131((OptionChainExpirationDateState) tuples2.component1(), (List) tuples2.component2(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {386}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3 */
    static final class C245573 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<OptionChainExpirationDateState, List<OptionInstrument>>> $expirationDateStateToOptionInstrumentsFlow;
        final /* synthetic */ Flow<OptionSettings> $optionSettingsFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C245573(Flow<OptionSettings> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Flow<? extends Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>> flow2, Continuation<? super C245573> continuation) {
            super(2, continuation);
            this.$optionSettingsFlow = flow;
            this.this$0 = optionSideBySideChainTableDuxo;
            this.$expirationDateStateToOptionInstrumentsFlow = flow2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245573(this.$optionSettingsFlow, this.this$0, this.$expirationDateStateToOptionInstrumentsFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245573) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(this.$optionSettingsFlow, Context7.buffer$default(RxConvert.asFlow(this.this$0.optionMarketHoursStore.streamCurrentOrNextMarketDates()), Integer.MAX_VALUE, null, 2, null), this.$expirationDateStateToOptionInstrumentsFlow, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0001H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Tradability;", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "expirationDateStateToOptionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<OptionSettings, OptionCurrentOrNextMarketDates, Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>>, Continuation<? super Tuples2<? extends OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(OptionSettings optionSettings, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>> tuples2, Continuation<? super Tuples2<OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = optionSettings;
                anonymousClass1.L$1 = optionCurrentOrNextMarketDates;
                anonymousClass1.L$2 = tuples2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(OptionSettings optionSettings, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Tuples2<? extends OptionChainExpirationDateState, ? extends List<? extends OptionInstrument>> tuples2, Continuation<? super Tuples2<? extends OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>>> continuation) {
                return invoke2(optionSettings, optionCurrentOrNextMarketDates, (Tuples2<OptionChainExpirationDateState, ? extends List<OptionInstrument>>) tuples2, (Continuation<? super Tuples2<OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionSettings optionSettings = (OptionSettings) this.L$0;
                OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = (OptionCurrentOrNextMarketDates) this.L$1;
                Tuples2 tuples2 = (Tuples2) this.L$2;
                OptionChainExpirationDateState optionChainExpirationDateState = (OptionChainExpirationDateState) tuples2.component1();
                List<OptionInstrument> list = (List) tuples2.component2();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (OptionInstrument optionInstrument : list) {
                    Tuples2 tuples2M3642to = Tuples4.m3642to(optionInstrument.getId(), new UiOptionInstrumentTradability(optionCurrentOrNextMarketDates, optionSettings.getTradingOnExpirationState(), optionInstrument, optionChainExpirationDateState.getUiOptionChain()).getAdjustedTradability());
                    linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                }
                return Tuples4.m3642to(optionChainExpirationDateState, linkedHashMap);
            }
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/Tradability;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<OptionChainExpirationDateState, ? extends Map<UUID, ? extends Tradability>> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3$2$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ OptionChainExpirationDateState $expirationDataState;
                final /* synthetic */ Map<UUID, Tradability> $optionInstrumentIdToTradabilityMap;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(OptionChainExpirationDateState optionChainExpirationDateState, Map<UUID, ? extends Tradability> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$expirationDataState = optionChainExpirationDateState;
                    this.$optionInstrumentIdToTradabilityMap = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$expirationDataState, this.$optionInstrumentIdToTradabilityMap, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) this.L$0;
                    OptionChainExpirationDateState optionChainExpirationDateState = this.$expirationDataState;
                    final Map<UUID, Tradability> map = this.$optionInstrumentIdToTradabilityMap;
                    return optionSideBySideChainTableDataState.copyPageState(optionChainExpirationDateState, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeTradeOnExpirationStates$3$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionSideBySideChainTableDuxo.C245573.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(map, (OptionSideBySideChainTableDataState.PageState) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionSideBySideChainTableDataState.PageState invokeSuspend$lambda$0(Map map, OptionSideBySideChainTableDataState.PageState pageState) {
                    return OptionSideBySideChainTableDataState.PageState.copy$default(pageState, false, null, null, null, map, null, null, null, null, 495, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1((OptionChainExpirationDateState) tuples2.component1(), (Map) tuples2.component2(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bind$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bind$1 */
    static final class C245411 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
        final /* synthetic */ OptionChainExpirationDateState $expirationDateState;
        final /* synthetic */ ScrollPosition $scrollPositionForLastExpirationDate;
        final /* synthetic */ ImmutableList<UiOptionStrategyLegDisplay> $targetLegs;
        final /* synthetic */ BigDecimal $targetStrikePrice;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C245411(OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList<? extends UiOptionStrategyLegDisplay> immutableList, BigDecimal bigDecimal, ScrollPosition scrollPosition, Continuation<? super C245411> continuation) {
            super(2, continuation);
            this.$expirationDateState = optionChainExpirationDateState;
            this.$targetLegs = immutableList;
            this.$targetStrikePrice = bigDecimal;
            this.$scrollPositionForLastExpirationDate = scrollPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245411 c245411 = new C245411(this.$expirationDateState, this.$targetLegs, this.$targetStrikePrice, this.$scrollPositionForLastExpirationDate, continuation);
            c245411.L$0 = obj;
            return c245411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
            return ((C245411) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((OptionSideBySideChainTableDataState) this.L$0).resetCurrentPageState(this.$expirationDateState, this.$targetLegs, this.$targetStrikePrice, this.$scrollPositionForLastExpirationDate);
        }
    }

    public final void bind(OptionChainExpirationDateState expirationDateState, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, ScrollPosition scrollPositionForLastExpirationDate) {
        Intrinsics.checkNotNullParameter(expirationDateState, "expirationDateState");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        Intrinsics.checkNotNullParameter(scrollPositionForLastExpirationDate, "scrollPositionForLastExpirationDate");
        applyMutation(new C245411(expirationDateState, targetLegs, targetStrikePrice, scrollPositionForLastExpirationDate, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindEquityInstrumentId$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindEquityInstrumentId$1 */
    static final class C245421 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
        final /* synthetic */ UUID $equityInstrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245421(UUID uuid, Continuation<? super C245421> continuation) {
            super(2, continuation);
            this.$equityInstrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245421 c245421 = new C245421(this.$equityInstrumentId, continuation);
            c245421.L$0 = obj;
            return c245421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
            return ((C245421) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, this.$equityInstrumentId, null, null, null, null, null, null, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097150, null);
        }
    }

    public final void bindEquityInstrumentId(UUID equityInstrumentId) {
        applyMutation(new C245421(equityInstrumentId, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindSelectedLegs$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindSelectedLegs$1 */
    static final class C245451 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
        final /* synthetic */ ImmutableList<OptionLegBundle> $selectedLegs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245451(ImmutableList<OptionLegBundle> immutableList, Continuation<? super C245451> continuation) {
            super(2, continuation);
            this.$selectedLegs = immutableList;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245451 c245451 = new C245451(this.$selectedLegs, continuation);
            c245451.L$0 = obj;
            return c245451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
            return ((C245451) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, this.$selectedLegs, null, null, null, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097143, null);
        }
    }

    public final void bindSelectedLegs(ImmutableList<OptionLegBundle> selectedLegs) {
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        applyMutation(new C245451(selectedLegs, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindSelloutSnackbarDismissedOrElapsed$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindSelloutSnackbarDismissedOrElapsed$1 */
    static final class C245461 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
        final /* synthetic */ boolean $selloutSnackbarDismissedOrElapsed;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245461(boolean z, Continuation<? super C245461> continuation) {
            super(2, continuation);
            this.$selloutSnackbarDismissedOrElapsed = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245461 c245461 = new C245461(this.$selloutSnackbarDismissedOrElapsed, continuation);
            c245461.L$0 = obj;
            return c245461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
            return ((C245461) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, false, false, false, null, null, null, this.$selloutSnackbarDismissedOrElapsed, false, false, false, null, 2031615, null);
        }
    }

    public final void bindSelloutSnackbarDismissedOrElapsed(boolean selloutSnackbarDismissedOrElapsed) {
        applyMutation(new C245461(selloutSnackbarDismissedOrElapsed, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindIsNuxSearchDismissed$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindIsNuxSearchDismissed$1 */
    static final class C245441 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
        final /* synthetic */ boolean $isNuxSearchDismissed;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245441(boolean z, Continuation<? super C245441> continuation) {
            super(2, continuation);
            this.$isNuxSearchDismissed = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245441 c245441 = new C245441(this.$isNuxSearchDismissed, continuation);
            c245441.L$0 = obj;
            return c245441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
            return ((C245441) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, false, this.$isNuxSearchDismissed, false, false, null, null, null, false, false, false, false, null, 2096127, null);
        }
    }

    public final void bindIsNuxSearchDismissed(boolean isNuxSearchDismissed) {
        applyMutation(new C245441(isNuxSearchDismissed, null));
    }

    public final void bindInitialDragTarget$feature_options_chain_externalDebug(DragTarget dragTarget) {
        Intrinsics.checkNotNullParameter(dragTarget, "dragTarget");
        applyMutation(new OptionSideBySideChainTableDuxo2(dragTarget, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onDraggedIndexChanged$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {451}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onDraggedIndexChanged$1 */
    static final class C245631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245631(int i, Continuation<? super C245631> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245631(this.$index, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = OptionSideBySideChainTableDuxo.this.legUpdateDebounceFlow;
                Integer numBoxInt = boxing.boxInt(this.$index);
                this.label = 1;
                if (sharedFlow2.emit(numBoxInt, this) == coroutine_suspended) {
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

    public final void onDraggedIndexChanged(int index) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C245631(index, null), 3, null);
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onDragEnd$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$onDragEnd$1 */
    static final class C245621 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C245621(Continuation<? super C245621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245621 c245621 = OptionSideBySideChainTableDuxo.this.new C245621(continuation);
            c245621.L$0 = obj;
            return c245621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
            return ((C245621) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) this.L$0;
            OptionSideBySideChainTableDuxo.this.optionSideBySideChainLogger.logDragEnd(optionSideBySideChainTableDataState.getInitialDragTargetForLogging(), optionSideBySideChainTableDataState.getDragTarget());
            return optionSideBySideChainTableDataState.copyDragTarget(null, null);
        }
    }

    public final void onDragEnd() {
        applyMutation(new C245621(null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindIsNuxAnimationFinished$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindIsNuxAnimationFinished$1 */
    static final class C245431 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
        final /* synthetic */ boolean $isNuxAnimationFinished;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245431(boolean z, Continuation<? super C245431> continuation) {
            super(2, continuation);
            this.$isNuxAnimationFinished = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C245431 c245431 = new C245431(this.$isNuxAnimationFinished, continuation);
            c245431.L$0 = obj;
            return c245431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
            return ((C245431) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, false, null, this.$isNuxAnimationFinished, false, false, false, null, null, null, false, false, false, false, null, 2096639, null);
        }
    }

    public final void bindIsNuxAnimationFinished(boolean isNuxAnimationFinished) {
        applyMutation(new C245431(isNuxAnimationFinished, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeLegUpdateObserver$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {476}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeLegUpdateObserver$1 */
    static final class C245491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C245491(Continuation<? super C245491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDebounce = FlowKt.debounce(OptionSideBySideChainTableDuxo.this.legUpdateDebounceFlow, 20L);
                final OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo = OptionSideBySideChainTableDuxo.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo.initializeLegUpdateObserver.1.1

                    /* compiled from: OptionSideBySideChainTableDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeLegUpdateObserver$1$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeLegUpdateObserver$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C504081 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                        final /* synthetic */ int $index;
                        private /* synthetic */ Object L$0;
                        int label;
                        final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C504081(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, int i, Continuation<? super C504081> continuation) {
                            super(2, continuation);
                            this.this$0 = optionSideBySideChainTableDuxo;
                            this.$index = i;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C504081 c504081 = new C504081(this.this$0, this.$index, continuation);
                            c504081.L$0 = obj;
                            return c504081;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                            return ((C504081) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            DragTarget dragTargetCopy$default;
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) this.L$0;
                            OptionSideBySideChainTableViewState value = this.this$0.getStateFlow().getValue();
                            if (value.getDragTarget() != null) {
                                Integer draggedOverIndex = value.getDraggedOverIndex();
                                int i = this.$index;
                                if (draggedOverIndex == null || draggedOverIndex.intValue() != i) {
                                    OptionLegBundlesToReplace legBundlesToReplace = OptionLegBundleReplaceHelper.getLegBundlesToReplace(value, this.$index);
                                    if (legBundlesToReplace.shouldPerformReplace()) {
                                        this.this$0.submit(new OptionSideBySideChainTableEvent.DragUpdateSelectedLegs(legBundlesToReplace));
                                        DragTarget dragTarget = value.getDragTarget();
                                        if (dragTarget instanceof DragTarget.OptionLegDragTarget) {
                                            dragTargetCopy$default = DragTarget.OptionLegDragTarget.copy$default((DragTarget.OptionLegDragTarget) value.getDragTarget(), this.$index, 0, legBundlesToReplace.getLegBundlesToAdd(), 2, null);
                                        } else {
                                            if (!(dragTarget instanceof DragTarget.OptionSpreadDragTarget)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            dragTargetCopy$default = DragTarget.OptionSpreadDragTarget.copy$default((DragTarget.OptionSpreadDragTarget) value.getDragTarget(), this.$index, 0, legBundlesToReplace.getLegBundlesToAdd(), 2, null);
                                        }
                                        List mutableList = CollectionsKt.toMutableList((Collection) optionSideBySideChainTableDataState.getSelectedLegs());
                                        ImmutableList<OptionLegBundleWithRowIndex> legBundlesToRemove = legBundlesToReplace.getLegBundlesToRemove();
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundlesToRemove, 10));
                                        Iterator<OptionLegBundleWithRowIndex> it = legBundlesToRemove.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(it.next().getLegBundle());
                                        }
                                        mutableList.removeAll(arrayList);
                                        ImmutableList<OptionLegBundleWithRowIndex> legBundlesToAdd = legBundlesToReplace.getLegBundlesToAdd();
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundlesToAdd, 10));
                                        Iterator<OptionLegBundleWithRowIndex> it2 = legBundlesToAdd.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(it2.next().getLegBundle());
                                        }
                                        mutableList.addAll(arrayList2);
                                        return OptionSideBySideChainTableDataState.copy$default(optionSideBySideChainTableDataState.copyDragTarget(dragTargetCopy$default, boxing.boxInt(this.$index)), null, null, null, mutableList, null, null, null, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097143, null);
                                    }
                                }
                            }
                            return optionSideBySideChainTableDataState;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo2 = optionSideBySideChainTableDuxo;
                        optionSideBySideChainTableDuxo2.applyMutation(new C504081(optionSideBySideChainTableDuxo2, i2, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDebounce.collect(flowCollector, this) == coroutine_suspended) {
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

    private final void initializeLegUpdateObserver() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C245491(null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {531}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1 */
    static final class C245531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<OptionChainExpirationDateState> $expirationDateStateFlow;
        int label;
        final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C245531(Flow<OptionChainExpirationDateState> flow, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super C245531> continuation) {
            super(2, continuation);
            this.$expirationDateStateFlow = flow;
            this.this$0 = optionSideBySideChainTableDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245531(this.$expirationDateStateFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowTransformLatest = FlowKt.transformLatest(this.$expirationDateStateFlow, new C24529x24c9c8f3(null, this.this$0));
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
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
            return Unit.INSTANCE;
        }

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isOptionRegularTradingOpenHours", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$3", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$3$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeOptionTradingOpenHours$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
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
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((AnonymousClass1) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, null, null, null, null, null, null, this.$isOptionRegularTradingOpenHours, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097023, null);
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

    private final void initializeOptionTradingOpenHours(Flow<OptionChainExpirationDateState> expirationDateStateFlow) {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C245531(expirationDateStateFlow, this, null));
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeSideBySideTableMetrics$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {543}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeSideBySideTableMetrics$1 */
    static final class C245541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C245541(Continuation<? super C245541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionSideBySideChainTableDuxo.this.new C245541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C245541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionSideBySideChainTableDuxo.this.optionSideBySideChainStore.streamOptionSideBySideTableMetrics());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionSideBySideChainTableDuxo.this, null);
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

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "metrics", "", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeSideBySideTableMetrics$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeSideBySideTableMetrics$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends OptionSideBySideChainMetric>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionSideBySideChainTableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionSideBySideChainTableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends OptionSideBySideChainMetric> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionSideBySideChainTableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeSideBySideTableMetrics$1$1$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$initializeSideBySideTableMetrics$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504111 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
                final /* synthetic */ List<OptionSideBySideChainMetric> $metrics;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C504111(List<? extends OptionSideBySideChainMetric> list, Continuation<? super C504111> continuation) {
                    super(2, continuation);
                    this.$metrics = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504111 c504111 = new C504111(this.$metrics, continuation);
                    c504111.L$0 = obj;
                    return c504111;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
                    return ((C504111) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionSideBySideChainTableDataState.copy$default((OptionSideBySideChainTableDataState) this.L$0, null, this.$metrics, null, null, null, null, null, false, null, false, false, false, false, null, null, null, false, false, false, false, null, 2097149, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504111((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void initializeSideBySideTableMetrics() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C245541(null));
    }

    public final void logHorizontalScrollStart() {
        this.optionSideBySideChainLogger.logHorizontalScrollStart();
    }

    public final void logBeginLoading(UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        this.optionSideBySideChainLogger.logBeginLoading(uiOptionChain);
    }

    public final void logCompleteLoading(UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        this.optionSideBySideChainLogger.logCompleteLoading(uiOptionChain);
    }

    public final void logAbortLoading(UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        this.optionSideBySideChainLogger.logAbortLoading(uiOptionChain);
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo$InitArg;", "Landroid/os/Parcelable;", "nuxMode", "Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "inSbsChainPerfExperiment", "", "<init>", "(Lcom/robinhood/android/optionschain/sbschain/NuxMode;Z)V", "getNuxMode", "()Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "getInSbsChainPerfExperiment", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArg implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArg> CREATOR = new Creator();
        private final boolean inSbsChainPerfExperiment;
        private final OptionSideBySideChainDataState4 nuxMode;

        /* compiled from: OptionSideBySideChainTableDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArg> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArg createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArg(OptionSideBySideChainDataState4.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArg[] newArray(int i) {
                return new InitArg[i];
            }
        }

        public static /* synthetic */ InitArg copy$default(InitArg initArg, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                optionSideBySideChainDataState4 = initArg.nuxMode;
            }
            if ((i & 2) != 0) {
                z = initArg.inSbsChainPerfExperiment;
            }
            return initArg.copy(optionSideBySideChainDataState4, z);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionSideBySideChainDataState4 getNuxMode() {
            return this.nuxMode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInSbsChainPerfExperiment() {
            return this.inSbsChainPerfExperiment;
        }

        public final InitArg copy(OptionSideBySideChainDataState4 nuxMode, boolean inSbsChainPerfExperiment) {
            Intrinsics.checkNotNullParameter(nuxMode, "nuxMode");
            return new InitArg(nuxMode, inSbsChainPerfExperiment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArg)) {
                return false;
            }
            InitArg initArg = (InitArg) other;
            return this.nuxMode == initArg.nuxMode && this.inSbsChainPerfExperiment == initArg.inSbsChainPerfExperiment;
        }

        public int hashCode() {
            return (this.nuxMode.hashCode() * 31) + Boolean.hashCode(this.inSbsChainPerfExperiment);
        }

        public String toString() {
            return "InitArg(nuxMode=" + this.nuxMode + ", inSbsChainPerfExperiment=" + this.inSbsChainPerfExperiment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.nuxMode.name());
            dest.writeInt(this.inSbsChainPerfExperiment ? 1 : 0);
        }

        public InitArg(OptionSideBySideChainDataState4 nuxMode, boolean z) {
            Intrinsics.checkNotNullParameter(nuxMode, "nuxMode");
            this.nuxMode = nuxMode;
            this.inSbsChainPerfExperiment = z;
        }

        public final OptionSideBySideChainDataState4 getNuxMode() {
            return this.nuxMode;
        }

        public final boolean getInSbsChainPerfExperiment() {
            return this.inSbsChainPerfExperiment;
        }
    }

    /* compiled from: OptionSideBySideChainTableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo$InitArg;", "<init>", "()V", "LEG_UPDATE_DEBOUNCE_MS", "", "INSTRUMENT_LOADING_TIMEOUT", "Lkotlin/time/Duration;", "J", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<OptionSideBySideChainTableDuxo, InitArg> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArg getArgs(SavedStateHandle savedStateHandle) {
            return (InitArg) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArg getArgs(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo) {
            return (InitArg) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, optionSideBySideChainTableDuxo);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        INSTRUMENT_LOADING_TIMEOUT = Duration3.toDuration(2, DurationUnitJvm.SECONDS);
    }
}
