package com.robinhood.android.optionsstrategybuilder;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.extensions.Events2;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import com.robinhood.android.optionchain.chainsettings.OptionChainEntryPointType;
import com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLogging;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState2;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.calculator.FilterChoicesData;
import com.robinhood.android.optionsstrategybuilder.calculator.FilteredStrategiesListData;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.prefs.OptionChainSettleOnOpenTooltipPref;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.GetOptionInstrumentsParams;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationTourStore;
import com.robinhood.models.api.OptionTooltipDisplayBehavior;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyBuilderTourStates;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiAggregateOptionPositionSimple;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionChains;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTourResult;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.Uuids;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;

/* compiled from: OptionStrategyBuilderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 \u008c\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006\u008d\u0001\u008e\u0001\u008c\u0001B£\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\b\b\u0001\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020,H\u0002¢\u0006\u0004\b3\u0010.J\u0019\u00106\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J'\u0010=\u001a\u00020,2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020,2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJÛ\u0002\u0010K\u001aÃ\u0002\u0012\u0099\u0001\u0012\u0096\u0001\u0012D\u0012B\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI J* \u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI\u0018\u00010F0F J*J\u0012D\u0012B\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI J* \u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI\u0018\u00010F0F\u0018\u00010E0E J* \u0001\u0012\u0099\u0001\u0012\u0096\u0001\u0012D\u0012B\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI J* \u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI\u0018\u00010F0F J*J\u0012D\u0012B\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI J* \u0012\u000f\u0012\r\u0012\u0004\u0012\u00020H0G¢\u0006\u0002\bI\u0012\t\u0012\u00070D¢\u0006\u0002\bI\u0018\u00010F0F\u0018\u00010E0E\u0018\u00010C0C*\b\u0012\u0004\u0012\u00020D0CH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020,H\u0016¢\u0006\u0004\bM\u0010.J\u000f\u0010N\u001a\u00020,H\u0016¢\u0006\u0004\bN\u0010.J\u000f\u0010O\u001a\u00020,H\u0016¢\u0006\u0004\bO\u0010.J\u0015\u0010R\u001a\u00020,2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020,2\u0006\u0010T\u001a\u00020:¢\u0006\u0004\bU\u0010VJ\u001d\u0010[\u001a\u00020,2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u00020,2\u0006\u0010T\u001a\u00020]¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020,2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020,¢\u0006\u0004\bd\u0010.J\r\u0010e\u001a\u00020,¢\u0006\u0004\be\u0010.J\r\u0010f\u001a\u00020,¢\u0006\u0004\bf\u0010.J\r\u0010g\u001a\u00020,¢\u0006\u0004\bg\u0010.J\u001d\u0010j\u001a\u00020,2\u0006\u0010i\u001a\u00020h2\u0006\u0010T\u001a\u00020]¢\u0006\u0004\bj\u0010kJ\u0015\u0010m\u001a\u00020,2\u0006\u0010l\u001a\u00020:¢\u0006\u0004\bm\u0010VJ\r\u0010n\u001a\u00020,¢\u0006\u0004\bn\u0010.J\r\u0010o\u001a\u00020,¢\u0006\u0004\bo\u0010.J\r\u0010p\u001a\u00020,¢\u0006\u0004\bp\u0010.J\r\u0010q\u001a\u00020,¢\u0006\u0004\bq\u0010.J\r\u0010r\u001a\u00020,¢\u0006\u0004\br\u0010.J\u0015\u0010u\u001a\u00020,2\u0006\u0010t\u001a\u00020s¢\u0006\u0004\bu\u0010vR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010wR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010xR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010yR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010zR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010{R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010|R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010}R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010~R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u007fR\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0080\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0081\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0082\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0083\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0084\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0085\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0086\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0087\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0088\u0001R\u001d\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b)\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008f\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "educationTourStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionTooltipStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/prefs/BooleanPreference;", "showSettleOnOpenTooltipPref", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;)V", "", "setupUnderlyingQuotesAndOptionQuotes", "()V", "Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData;", "filteredStrategiesListData", "saveChoices", "(Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData;)V", "restoreChoicesAndFocusedStrategy", "Lcom/robinhood/models/api/OptionTooltipDisplayBehavior;", "displayBehavior", "autoDismissIfNeeded", "(Lcom/robinhood/models/api/OptionTooltipDisplayBehavior;)V", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "filterType", "", "selectorValueOld", "selectorValueNew", "logFilterSelect", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "name", "logPerformanceBeginFilter", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;)V", "Lio/reactivex/Observable;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "Lcom/robinhood/utils/Optional;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/OptionInstrument;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "streamInstruments", "(Lio/reactivex/Observable;)Lio/reactivex/Observable;", "onCreate", "onStart", "onResume", "j$/time/Instant", "expirationDate", "refreshTradability", "(Lj$/time/Instant;)V", OptionStrategyBuilderDuxo.SELECTED_STRATEGY_KEY, "updateShouldShowStrategyBuilderTour", "(Ljava/lang/String;)V", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "selectorArgs", "", "newIndex", "updateFilter", "(Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;I)V", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;", "saveFocusedStrategy", "(Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;)V", "Lcom/robinhood/models/db/OptionTooltip;", "tooltip", "setTooltipSeen", "(Lcom/robinhood/models/db/OptionTooltip;)V", "setTooltipTapped", "setSettleOnOpenTooltipSeen", "dismissSettleOnOpenTooltip", "logStrategyChainAppear", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "logStrategyChainRowTap", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;)V", "tourId", "logShowEducationTour", "logDisclosureItemTap", "logPerformanceBeginStrategyChain", "logPerformanceEnd", "logPerformanceEndForFilters", "abortLogs", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "chainCustomizationErrorEvent", "logCustomizationSnackbar", "(Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;)V", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/android/indexes/store/IndexStore;", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lcom/robinhood/prefs/BooleanPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "SavedChoices", "OptionInstrumentsData", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderDuxo extends OldBaseDuxo<OptionStrategyBuilderViewState> implements HasSavedState {
    private static final String CHOICES_KEY = "choices";
    private static final String SELECTED_STRATEGY_KEY = "strategy";
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final EducationTourStore educationTourStore;
    private final QuoteStore equityQuoteStore;
    private final EventLogger eventLogger;
    private final IndexStore indexStore;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore;
    private final OptionChainCustomizationStore optionChainCustomizationStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSideBySideChainStore optionSideBySideChainStore;
    private final OptionStrategyBuilderStore optionStrategyBuilderStore;
    private final OptionTooltipStore optionTooltipStore;
    private final PerformanceLogger performanceLogger;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference showSettleOnOpenTooltipPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionStrategyBuilderDuxo(AggregateOptionPositionStore aggregateOptionPositionStore, EducationTourStore educationTourStore, QuoteStore equityQuoteStore, EventLogger eventLogger, IndexStore indexStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionStrategyBuilderStore optionStrategyBuilderStore, OptionTooltipStore optionTooltipStore, PerformanceLogger performanceLogger, @OptionChainSettleOnOpenTooltipPref BooleanPreference showSettleOnOpenTooltipPref, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(educationTourStore, "educationTourStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
        Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        OptionStrategyBuilderFragment.Args args = (OptionStrategyBuilderFragment.Args) INSTANCE.getArgs(savedStateHandle);
        List<OptionChainExpirationDateState> listAdjust = OptionChainExpirationDateState2.adjust(OptionChainExpirationDateState2.getSortedExpirationDateStates(args.getUiOptionChains()), args.getTradeOnExpirationSettings(), args.getCurrentOrNextMarketDates());
        FilterChoicesData filterChoicesData = new FilterChoicesData(listAdjust, args.getTemplate(), UiOptionChains.getUnderlyingType(args.getUiOptionChains()), null, null, 24, null);
        FilteredStrategiesListData filteredStrategiesListData = new FilteredStrategiesListData(filterChoicesData, OptionStrategyChainTemplates.getInitialChoicesForDates(args.getTemplate(), listAdjust), 0 == true ? 1 : 0, SetsKt.emptySet(), 4, null);
        IacAlertSheet iacAlertSheet = null;
        boolean z = false;
        super(new OptionStrategyBuilderViewState(args.getInitialAccountNumber(), iacAlertSheet, z, extensions2.toImmutableList(args.getUiOptionChains()), args.getTemplate(), filteredStrategiesListData, filterChoicesData, args.getStrategyId(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554178, null), null, 2, null);
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.educationTourStore = educationTourStore;
        this.equityQuoteStore = equityQuoteStore;
        this.eventLogger = eventLogger;
        this.indexStore = indexStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionChainCustomizationDiscoveryStore = optionChainCustomizationDiscoveryStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionStrategyBuilderStore = optionStrategyBuilderStore;
        this.optionTooltipStore = optionTooltipStore;
        this.performanceLogger = performanceLogger;
        this.showSettleOnOpenTooltipPref = showSettleOnOpenTooltipPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore;
        Companion companion = INSTANCE;
        optionAccountSwitcherStore.setActiveAccountNumber(((OptionStrategyBuilderFragment.Args) companion.getArgs((HasSavedState) this)).getInitialAccountNumber());
        LifecycleHost.DefaultImpls.bind$default(this, this.optionAccountSwitcherStore.streamActiveAccountNumber(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$2(this.f$0, (String) obj);
            }
        });
        setupUnderlyingQuotesAndOptionQuotes();
        restoreChoicesAndFocusedStrategy();
        Observable observableDistinctUntilChanged = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionStrategyBuilderViewState) it).getAccountNumber();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableDistinctUntilChanged2 = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Map<UUID, UiOptionPositionCounts>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                OptionPositionStore optionPositionStore = OptionStrategyBuilderDuxo.this.optionPositionStore;
                List<UiOptionChain> uiOptionChains = ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getUiOptionChains();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiOptionChains, 10));
                Iterator<T> it = uiOptionChains.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UiOptionChain) it.next()).getOptionChain().getId());
                }
                optionPositionStore.refreshWithChainIds(false, arrayList, CollectionsKt.listOf(accountNumber));
                return OptionStrategyBuilderDuxo.this.optionPositionStore.getOptionPositionCountsByInstrument(accountNumber);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$5(this.f$0, (Map) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionStrategyBuilderViewState) it).getAccountNumber();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        Observable map = observableDistinctUntilChanged3.switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<UiAggregateOptionPositionSimple>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                AggregateOptionPositionStore aggregateOptionPositionStore = OptionStrategyBuilderDuxo.this.aggregateOptionPositionStore;
                List<UiOptionChain> uiOptionChains = ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getUiOptionChains();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiOptionChains, 10));
                Iterator<T> it = uiOptionChains.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UiOptionChain) it.next()).getOptionChain().getId());
                }
                aggregateOptionPositionStore.refreshWithChainIds(false, arrayList, accountNumber);
                AggregateOptionPositionStore aggregateOptionPositionStore2 = OptionStrategyBuilderDuxo.this.aggregateOptionPositionStore;
                List<UiOptionChain> uiOptionChains2 = ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getUiOptionChains();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiOptionChains2, 10));
                Iterator<T> it2 = uiOptionChains2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((UiOptionChain) it2.next()).getOptionChain().getId());
                }
                return aggregateOptionPositionStore2.streamUiAggregateOptionPositionsForChainIds(accountNumber, arrayList2);
            }
        }).map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.7
            @Override // io.reactivex.functions.Function
            public final Tuples2<List<UiAggregateOptionPosition>, List<UiAggregateOptionPosition>> apply(List<UiAggregateOptionPositionSimple> allPositions) {
                Intrinsics.checkNotNullParameter(allPositions, "allPositions");
                Sequence sequenceAsSequence = CollectionsKt.asSequence(allPositions);
                OptionStrategyChainTemplate.StrategyTemplate strategyTemplate = ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getTemplate().getStrategyTemplate();
                return Tuples4.m3642to(SequencesKt.toList(OptionStrategyChainTemplates.filterPositions(strategyTemplate, sequenceAsSequence, false)), SequencesKt.toList(OptionStrategyChainTemplates.filterPositions(strategyTemplate, sequenceAsSequence, true)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$8(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinct$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionStrategyBuilderViewState) it).getAccountNumber();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        Observable observableDistinctUntilChanged5 = observableDistinctUntilChanged4.switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.10
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionSettings> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return OptionStrategyBuilderDuxo.this.optionSettingsStore.streamOptionSettings(accountNumber);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$11(this.f$0, (OptionSettings) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.optionMarketHoursStore.streamCurrentOrNextMarketDates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$13(this.f$0, (OptionCurrentOrNextMarketDates) obj);
            }
        });
        Observable<R> map2 = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getOptionInstrumentsQueryParams());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged6 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged6, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$17(this.f$0, (GetOptionInstrumentsParams) obj);
            }
        });
        Observable<R> map3 = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinctNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getFirstLegStreamingArgs());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinctNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable<OptionStrategyBuilderStore.LegStreamingArgs> observableDistinctUntilChanged7 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        Observable<Optional<Tuples2<List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs>>> observableStreamInstruments = streamInstruments(observableDistinctUntilChanged7);
        Observable<R> map4 = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinctNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getSecondLegStreamingArgs());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinctNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable<OptionStrategyBuilderStore.LegStreamingArgs> observableDistinctUntilChanged8 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        Observable observableCombineLatest = Observable.combineLatest(observableStreamInstruments, streamInstruments(observableDistinctUntilChanged8), new BiFunction() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.17
            @Override // io.reactivex.functions.BiFunction
            public final OptionInstrumentsData apply(Optional<? extends Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs>> p0, Optional<? extends Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs>> p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                return new OptionInstrumentsData(p0, p1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableCombineLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$21(this.f$0, (OptionStrategyBuilderDuxo.OptionInstrumentsData) obj);
            }
        });
        Observable observableDistinctUntilChanged9 = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$$inlined$mapDistinct$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((OptionStrategyBuilderViewState) it).getFilterChoicesData().getHasStrategies());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        Observable observableFilter = observableDistinctUntilChanged9.filter(new Predicate() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.20
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$26(this.f$0, (Boolean) obj);
            }
        });
        Observable observableRefCount = this.optionStrategyBuilderStore.getStreamShouldShowStrategyBuilderTour().asObservable(Unit.INSTANCE).distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$shouldShowStrategyBuilderTourObs$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionStrategyBuilderTourStates tourStates) {
                Intrinsics.checkNotNullParameter(tourStates, "tourStates");
                List<OptionStrategyBuilderTourStates.OptionStrategyBuilderTourState> tourStates2 = tourStates.getTourStates();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(tourStates2, 10)), 16));
                for (OptionStrategyBuilderTourStates.OptionStrategyBuilderTourState optionStrategyBuilderTourState : tourStates2) {
                    Tuples2 tuples2M3642to = Tuples4.m3642to(optionStrategyBuilderTourState.getStrategy(), Boolean.valueOf(optionStrategyBuilderTourState.getShouldShowTour()));
                    linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                }
                Boolean bool = (Boolean) linkedHashMap.get(((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTemplate().getStrategyId());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$shouldShowStrategyBuilderTourObs$2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable map5 = observableRefCount.map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.22
            @Override // io.reactivex.functions.Function
            public final Completable apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Completables.ignoreNetworkExceptions(OptionStrategyBuilderDuxo.this.educationTourStore.refreshEducationTour(EducationTourScreenNames.STRATEGY_BUILDER_PAGE_SCREEN, ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getTemplate().getStrategyId(), false));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, map5, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.onCreate.23
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends EducationTourResult> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionStrategyBuilderDuxo.this.educationTourStore.streamEducationTour(EducationTourScreenNames.STRATEGY_BUILDER_PAGE_SCREEN, ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getTemplate().getStrategyId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$28(this.f$0, (EducationTourResult) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2482725(null), 3, null);
        Observable<OptionChainSelectedMetrics> observableDistinctUntilChanged10 = this.optionChainCustomizationStore.getStreamStrategyBuilderSelectedMetricsById().asObservable(((OptionStrategyBuilderFragment.Args) companion.getArgs((HasSavedState) this)).getStrategyId()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged10, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged10, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$30(this.f$0, (OptionChainSelectedMetrics) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C2482827(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$2$lambda$1(accountNumber, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$2$lambda$1(String str, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554430, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final Map map) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$5$lambda$4(map, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$5$lambda$4(Map map, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(map);
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, map, null, null, null, null, null, null, null, null, null, null, false, 33546239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, Tuples2 tuples2) {
        final List list = (List) tuples2.component1();
        final List list2 = (List) tuples2.component2();
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$8$lambda$7(list, list2, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$8$lambda$7(List list, List list2, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, null, list, list2, null, null, null, null, null, null, null, null, false, 33505279, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$11(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final OptionSettings optionSettings) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$11$lambda$10(optionSettings, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$11$lambda$10(OptionSettings optionSettings, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionSettings.getDefaultPricingSetting(), optionSettings.getTradingOnExpirationState(), null, null, null, null, null, false, 33161215, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final OptionCurrentOrNextMarketDates dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$13$lambda$12(dates, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$13$lambda$12(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionCurrentOrNextMarketDates, null, null, null, null, false, 33030143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$17(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, GetOptionInstrumentsParams queryParams) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$17$lambda$16((OptionStrategyBuilderViewState) obj);
            }
        });
        optionStrategyBuilderDuxo.optionStrategyBuilderStore.refreshOptionInstruments(queryParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$17$lambda$16(OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices = applyMutation.getFilteredStrategiesListData().getSelectedChoices();
        Set<OptionStrategyChainTemplate.FilterType> filterTypesForClientSideFiltering = OptionStrategyChainTemplates.getFilterTypesForClientSideFiltering(applyMutation.getTemplate());
        ArrayList arrayList = new ArrayList();
        for (OptionStrategyChainTemplate.FilterType filterType : filterTypesForClientSideFiltering) {
            OptionStrategyBuilderViewState.PreviousValue overrideValue = applyMutation.getOverrideValue(filterType);
            Tuples2 tuples2M3642to = overrideValue == null ? null : Tuples4.m3642to(filterType, overrideValue);
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, new FilteredStrategiesListData(applyMutation.getFilterChoicesData(), selectedChoices, applyMutation.getFilteredStrategiesListData().getUserEditedFilters(), SetsKt.emptySet()), null, null, MapsKt.toMap(arrayList), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$21(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final OptionInstrumentsData optionInstrumentsData) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$21$lambda$20(optionInstrumentsData, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$21$lambda$20(OptionInstrumentsData optionInstrumentsData, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (!optionInstrumentsData.isValidWithState(applyMutation)) {
            return applyMutation;
        }
        FilterChoicesData filterChoicesDataCopy$default = FilterChoicesData.copy$default(applyMutation.getFilterChoicesData(), null, null, null, optionInstrumentsData.getFirstLegOptionInstruments(), optionInstrumentsData.getSecondLegOptionInstruments(), 7, null);
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, new FilteredStrategiesListData(filterChoicesDataCopy$default, applyMutation.getFilteredStrategiesListData().getSelectedChoices(), applyMutation.getFilteredStrategiesListData().getUserEditedFilters(), applyMutation.getFilteredStrategiesListData().getCurrentStrategyIds()), filterChoicesDataCopy$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554335, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$26(final OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, Boolean bool) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$26$lambda$25(this.f$0, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$26$lambda$25(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, OptionStrategyBuilderViewState applyMutation) {
        OptionStrategyBuilderViewState.Choice defaultChoice;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> initialChoicesForClientSideFilters = OptionStrategyChainTemplates.getInitialChoicesForClientSideFilters(applyMutation.getTemplate(), applyMutation.getFilterChoicesData());
        Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices = applyMutation.getFilteredStrategiesListData().getSelectedChoices();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<OptionStrategyChainTemplate.Filter> filters = OptionStrategyChainTemplates.getFilters(applyMutation.getTemplate());
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(filters, 10)), 16));
        for (OptionStrategyChainTemplate.Filter filter : filters) {
            OptionStrategyChainTemplate.FilterType filterType = filter.getFilterType();
            OptionStrategyBuilderViewState.PreviousValue previousValue = applyMutation.getOverrideChoices().get(filterType);
            List<OptionStrategyBuilderViewState.Choice> listEmptyList = applyMutation.getFilterChoicesData().getFilterChoices().get(filterType);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (OptionStrategyChainTemplates.getFilterTypesForQuery(((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) optionStrategyBuilderDuxo)).getTemplate()).contains(filterType)) {
                defaultChoice = selectedChoices.get(filterType);
            } else if (applyMutation.getOverrideChoices().isEmpty()) {
                linkedHashSet.add(filter.getFilterType());
                defaultChoice = initialChoicesForClientSideFilters.get(filterType);
            } else if (!applyMutation.getOverrideChoices().keySet().contains(filterType)) {
                defaultChoice = null;
            } else if (previousValue != null && previousValue.isUserEdited() && listEmptyList.contains(previousValue.getChoice())) {
                defaultChoice = previousValue.getChoice();
            } else {
                linkedHashSet.add(filter.getFilterType());
                defaultChoice = OptionStrategyChainTemplates.getDefaultChoice(filter, applyMutation.getUnderlyingQuote(), listEmptyList);
            }
            Tuples2 tuples2M3642to = Tuples4.m3642to(filterType, defaultChoice);
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        FilterChoicesData filterChoicesData = applyMutation.getFilteredStrategiesListData().getFilterChoicesData();
        Set<OptionStrategyChainTemplate.FilterType> userEditedFilters = applyMutation.getFilteredStrategiesListData().getUserEditedFilters();
        Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.PreviousValue> overrideChoices = applyMutation.getOverrideChoices();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.PreviousValue> entry : overrideChoices.entrySet()) {
            if (entry.getValue().isUserEdited()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        FilteredStrategiesListData filteredStrategiesListData = new FilteredStrategiesListData(filterChoicesData, linkedHashMap, SetsKt.minus(SetsKt.plus((Set) userEditedFilters, (Iterable) linkedHashMap2.keySet()), (Iterable) linkedHashSet), applyMutation.getFilteredStrategiesListData().getCurrentStrategyIds());
        optionStrategyBuilderDuxo.saveChoices(filteredStrategiesListData);
        Unit unit = Unit.INSTANCE;
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, filteredStrategiesListData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554399, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$28(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final EducationTourResult educationTourResult) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$28$lambda$27(educationTourResult, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$28$lambda$27(EducationTourResult educationTourResult, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, educationTourResult.getTour(), null, null, null, null, null, null, null, null, null, null, null, false, 33550335, null);
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$25", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {360}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$25 */
    static final class C2482725 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2482725(Continuation<? super C2482725> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderDuxo.this.new C2482725(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2482725) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore = OptionStrategyBuilderDuxo.this.optionChainCustomizationDiscoveryStore;
                String strategyId = ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getStrategyId();
                this.label = 1;
                obj = optionChainCustomizationDiscoveryStore.getIacAlertSheetForInvestingOptionBuilder(strategyId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final IacAlertSheet iacAlertSheet = (IacAlertSheet) obj;
            OptionStrategyBuilderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$25$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionStrategyBuilderDuxo.C2482725.invokeSuspend$lambda$0(iacAlertSheet, (OptionStrategyBuilderViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionStrategyBuilderViewState invokeSuspend$lambda$0(IacAlertSheet iacAlertSheet, OptionStrategyBuilderViewState optionStrategyBuilderViewState) {
            return OptionStrategyBuilderViewState.copy$default(optionStrategyBuilderViewState, null, iacAlertSheet, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554429, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$30(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final OptionChainSelectedMetrics optionChainSelectedMetrics) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onCreate$lambda$30$lambda$29(optionChainSelectedMetrics, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onCreate$lambda$30$lambda$29(OptionChainSelectedMetrics optionChainSelectedMetrics, OptionStrategyBuilderViewState applyMutation) {
        UiEvent uiEvent;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (optionChainSelectedMetrics.isAnyDisabled()) {
            uiEvent = new UiEvent(OptionChainCustomizationErrorEvent.RemovedMetricType.INSTANCE);
        } else {
            uiEvent = optionChainSelectedMetrics.isAnyUnsupported() ? new UiEvent(OptionChainCustomizationErrorEvent.UnsupportedMetricType.INSTANCE) : null;
        }
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionChainSelectedMetrics, uiEvent, false, 20971519, null);
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$27", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {390}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$27 */
    static final class C2482827 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2482827(Continuation<? super C2482827> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderDuxo.this.new C2482827(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2482827) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionStrategyBuilderDuxo.this.optionSideBySideChainStore.streamIsInSideBySideChainNuxRevampExperiment());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionStrategyBuilderDuxo.this, null);
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

        /* compiled from: OptionStrategyBuilderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inSbsChainNuxRevampExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$27$1", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$27$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionStrategyBuilderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionStrategyBuilderDuxo;
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
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onCreate$27$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionStrategyBuilderDuxo.C2482827.AnonymousClass1.invokeSuspend$lambda$0(z, (OptionStrategyBuilderViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OptionStrategyBuilderViewState invokeSuspend$lambda$0(boolean z, OptionStrategyBuilderViewState optionStrategyBuilderViewState) {
                return OptionStrategyBuilderViewState.copy$default(optionStrategyBuilderViewState, null, null, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554427, null);
            }
        }
    }

    private final void setupUnderlyingQuotesAndOptionQuotes() {
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setupUnderlyingQuotesAndOptionQuotes$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getSelectedUiOptionChain());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24818xf639a7df<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Observable observableFilter = observableDistinctUntilChanged.filter(new Predicate() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(UiOptionChain it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getUnderlyingType() == OptionChain.UnderlyingType.EQUITY;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable map2 = observableFilter.map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setupUnderlyingQuotesAndOptionQuotes$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionUnderlying optionUnderlying = (OptionUnderlying) CollectionsKt.firstOrNull((List) ((UiOptionChain) it).getUnderlyings());
                return Optional3.asOptional(optionUnderlying != null ? optionUnderlying.getUnderlyingId() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24819xf639a7e0<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map2).switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(UUID equityUnderlyingId) {
                Intrinsics.checkNotNullParameter(equityUnderlyingId, "equityUnderlyingId");
                return OptionStrategyBuilderDuxo.this.equityQuoteStore.getStreamQuote().asObservable(equityUnderlyingId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes$lambda$34(this.f$0, (Quote) obj);
            }
        });
        Observable observableFilter2 = observableDistinctUntilChanged.filter(new Predicate() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes.5
            @Override // io.reactivex.functions.Predicate
            public final boolean test(UiOptionChain it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getUnderlyingType() == OptionChain.UnderlyingType.INDEX;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter2, "filter(...)");
        Observable map3 = observableFilter2.map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setupUnderlyingQuotesAndOptionQuotes$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((UiOptionChain) it).getIndexUnderlyingId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24820xf639a7e1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableSwitchMap2 = ObservablesKt.filterIsPresent(map3).switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends IndexValue> apply(UUID indexUnderlyingId) {
                Intrinsics.checkNotNullParameter(indexUnderlyingId, "indexUnderlyingId");
                OptionStrategyBuilderDuxo optionStrategyBuilderDuxo = OptionStrategyBuilderDuxo.this;
                return optionStrategyBuilderDuxo.asObservable(optionStrategyBuilderDuxo.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(indexUnderlyingId)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes$lambda$37(this.f$0, (IndexValue) obj);
            }
        });
        Observable observableSwitchMap3 = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes.9
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Map<UUID, OptionInstrumentQuote>> apply(UiOptionChain selectedUiOptionChain) {
                Intrinsics.checkNotNullParameter(selectedUiOptionChain, "selectedUiOptionChain");
                return OptionStrategyBuilderDuxo.this.optionQuoteStore.getQuotesForOptionSymbol(selectedUiOptionChain.getOptionChain().getId()).throttleLatest(1L, TimeUnit.SECONDS, Schedulers.m3346io()).map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes.9.1
                    @Override // io.reactivex.functions.Function
                    public final Map<UUID, OptionInstrumentQuote> apply(List<OptionInstrumentQuote> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        List<OptionInstrumentQuote> list = it;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (T t : list) {
                            linkedHashMap.put(((OptionInstrumentQuote) t).getOptionInstrumentId(), t);
                        }
                        return linkedHashMap;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes$lambda$39(this.f$0, (Map) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setupUnderlyingQuotesAndOptionQuotes$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionStrategyBuilderViewState) it).getFilterChoicesData();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable map4 = observableDistinctUntilChanged2.map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setupUnderlyingQuotesAndOptionQuotes$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                List listEmptyList;
                List listEmptyList2;
                Intrinsics.checkNotNullParameter(it, "it");
                FilterChoicesData filterChoicesData = (FilterChoicesData) it;
                List<OptionInstrument> firstLegOptionInstruments = filterChoicesData.getFirstLegOptionInstruments();
                if (firstLegOptionInstruments != null) {
                    List<OptionInstrument> list = firstLegOptionInstruments;
                    listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        listEmptyList.add(((OptionInstrument) it2.next()).getId());
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List<OptionInstrument> secondLegOptionInstruments = filterChoicesData.getSecondLegOptionInstruments();
                if (secondLegOptionInstruments != null) {
                    List<OptionInstrument> list2 = secondLegOptionInstruments;
                    listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        listEmptyList2.add(((OptionInstrument) it3.next()).getId());
                    }
                } else {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                return Optional3.asOptional((listEmptyList.isEmpty() && listEmptyList2.isEmpty()) ? null : CollectionsKt.union(listEmptyList, listEmptyList2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24817x8cdd5c43<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        Observable observableSwitchMap4 = observableDistinctUntilChanged3.switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(Set<UUID> optionInstrumentIds) {
                Intrinsics.checkNotNullParameter(optionInstrumentIds, "optionInstrumentIds");
                if (!optionInstrumentIds.isEmpty()) {
                    return OptionStrategyBuilderDuxo.this.optionQuoteStore.pollQuotes(CollectionsKt.toList(optionInstrumentIds));
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupUnderlyingQuotesAndOptionQuotes$lambda$34(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final Quote quote) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes$lambda$34$lambda$33(quote, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState setupUnderlyingQuotesAndOptionQuotes$lambda$34$lambda$33(Quote quote, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, quote, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33553919, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupUnderlyingQuotesAndOptionQuotes$lambda$37(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final IndexValue indexValue) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes$lambda$37$lambda$36(indexValue, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState setupUnderlyingQuotesAndOptionQuotes$lambda$37$lambda$36(IndexValue indexValue, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, indexValue, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33553407, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupUnderlyingQuotesAndOptionQuotes$lambda$39(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, final Map map) {
        optionStrategyBuilderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.setupUnderlyingQuotesAndOptionQuotes$lambda$39$lambda$38(map, (OptionStrategyBuilderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState setupUnderlyingQuotesAndOptionQuotes$lambda$39$lambda$38(Map map, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(map);
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, map, null, null, null, null, null, null, null, null, null, null, null, null, false, 33552383, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onStart$lambda$44(this.f$0, (OptionStrategyBuilderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState onStart$lambda$44(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionStrategyBuilderDuxo.showSettleOnOpenTooltipPref.get(), 16777215, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionStrategyBuilderViewState optionStrategyBuilderViewState = (OptionStrategyBuilderViewState) it;
                return Optional3.asOptional(PairUtils.toNullable(Tuples4.m3642to(optionStrategyBuilderViewState.getStrategyId(), optionStrategyBuilderViewState.getAccountNumber())));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionStrategyBuilderDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.onResume$lambda$46(this.f$0, (Tuples2) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C248343(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$46(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, Tuples2 tuples2) {
        BuildersKt__Builders_commonKt.launch$default(optionStrategyBuilderDuxo.getLifecycleScope(), null, null, new OptionStrategyBuilderDuxo4(optionStrategyBuilderDuxo, (String) tuples2.component1(), (String) tuples2.component2(), null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onResume$3", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {490}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onResume$3 */
    static final class C248343 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C248343(Continuation<? super C248343> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderDuxo.this.new C248343(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C248343) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionChainCustomizationStore optionChainCustomizationStore = OptionStrategyBuilderDuxo.this.optionChainCustomizationStore;
                    String strategyId = ((OptionStrategyBuilderFragment.Args) OptionStrategyBuilderDuxo.INSTANCE.getArgs((HasSavedState) OptionStrategyBuilderDuxo.this)).getStrategyId();
                    this.label = 1;
                    if (optionChainCustomizationStore.fetchStrategyBuilderSelectedMetrics(strategyId, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    OptionStrategyBuilderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$onResume$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionStrategyBuilderDuxo.C248343.invokeSuspend$lambda$0(th, (OptionStrategyBuilderViewState) obj2);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionStrategyBuilderViewState invokeSuspend$lambda$0(Throwable th, OptionStrategyBuilderViewState optionStrategyBuilderViewState) {
            Object genericError;
            if (Throwables.isNetworkRelated(th)) {
                genericError = OptionChainCustomizationErrorEvent.OptionServiceDown.INSTANCE;
            } else {
                genericError = new OptionChainCustomizationErrorEvent.GenericError(th);
            }
            return OptionStrategyBuilderViewState.copy$default(optionStrategyBuilderViewState, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(genericError), false, 25165823, null);
        }
    }

    public final void refreshTradability(Instant expirationDate) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        List<UiOptionChain> uiOptionChains = ((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUiOptionChains();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uiOptionChains, 10));
        Iterator<T> it = uiOptionChains.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiOptionChain) it.next()).getOptionChain().getId());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.optionInstrumentStore.refreshChainByExpiration(true, (UUID) it2.next(), Instants.toLocalDate(expirationDate, ZoneIds.INSTANCE.getNEW_YORK()));
        }
    }

    public final void updateShouldShowStrategyBuilderTour(String strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        LifecycleHost.DefaultImpls.bind$default(this, this.optionStrategyBuilderStore.updateShouldShowStrategyBuilderTour(strategy), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void updateFilter(final PillView.SelectorArgs selectorArgs, int newIndex) {
        Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
        final OptionStrategyChainTemplate.FilterType filterType = selectorArgs.getFilter().getFilterType();
        Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices = selectorArgs.getSelectedChoices();
        final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices2 = selectorArgs.getSelectedChoices(newIndex);
        for (Map.Entry<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> entry : selectedChoices2.entrySet()) {
            PerformanceMetricEventData.Name performanceName = OptionStrategyChainTemplates.getPerformanceName(filterType);
            if (performanceName != null) {
                logPerformanceBeginFilter(performanceName);
            }
        }
        OptionStrategyBuilderViewState.Choice choice = selectedChoices.get(filterType);
        String loggingValue = choice != null ? choice.getLoggingValue() : null;
        if (loggingValue == null) {
            loggingValue = "";
        }
        OptionStrategyBuilderViewState.Choice choice2 = selectedChoices2.get(filterType);
        String loggingValue2 = choice2 != null ? choice2.getLoggingValue() : null;
        logFilterSelect(filterType, loggingValue, loggingValue2 != null ? loggingValue2 : "");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.updateFilter$lambda$54(selectorArgs, this, selectedChoices2, filterType, (OptionStrategyBuilderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState updateFilter$lambda$54(PillView.SelectorArgs selectorArgs, OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, Map map, OptionStrategyChainTemplate.FilterType filterType, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List<OptionStrategyChainTemplate.FilterType> exclusiveWith = selectorArgs.getFilter().getExclusiveWith();
        FilterChoicesData filterChoicesData = applyMutation.getFilteredStrategiesListData().getFilterChoicesData();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(applyMutation.getFilteredStrategiesListData().getSelectedChoices());
        linkedHashMap.putAll(map);
        if (exclusiveWith != null) {
            Iterator<T> it = exclusiveWith.iterator();
            while (it.hasNext()) {
                linkedHashMap.put((OptionStrategyChainTemplate.FilterType) it.next(), null);
            }
        }
        Unit unit = Unit.INSTANCE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(applyMutation.getFilteredStrategiesListData().getUserEditedFilters());
        linkedHashSet.add(filterType);
        FilteredStrategiesListData filteredStrategiesListData = new FilteredStrategiesListData(filterChoicesData, linkedHashMap, linkedHashSet, applyMutation.getFilteredStrategiesListData().getCurrentStrategyIds());
        optionStrategyBuilderDuxo.saveChoices(filteredStrategiesListData);
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, filteredStrategiesListData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32505823, null);
    }

    private final void saveChoices(FilteredStrategiesListData filteredStrategiesListData) {
        getSavedStateHandle().set("choices", new SavedChoices(filteredStrategiesListData.getSelectedChoices(), filteredStrategiesListData.getUserEditedFilters()));
    }

    public final void saveFocusedStrategy(OptionStrategyBuilderViewState.Strategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        getSavedStateHandle().set(SELECTED_STRATEGY_KEY, strategy.getIdentifier());
    }

    private final void restoreChoicesAndFocusedStrategy() {
        final SavedChoices savedChoices = (SavedChoices) getSavedStateHandle().get("choices");
        if (savedChoices != null) {
            final String str = (String) getSavedStateHandle().get(SELECTED_STRATEGY_KEY);
            applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionStrategyBuilderDuxo.restoreChoicesAndFocusedStrategy$lambda$55(savedChoices, str, (OptionStrategyBuilderViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState restoreChoicesAndFocusedStrategy$lambda$55(SavedChoices savedChoices, String str, OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OptionStrategyBuilderViewState optionStrategyBuilderViewStateCopy$default = OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, savedChoices.toFilteredStrategiesListData(applyMutation.getFilteredStrategiesListData()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554399, null);
        return str == null ? optionStrategyBuilderViewStateCopy$default : OptionStrategyBuilderViewState.copy$default(optionStrategyBuilderViewStateCopy$default, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionStrategyBuilderViewState.SavedScrollTarget(str, new UiEvent(Unit.INSTANCE)), null, null, null, false, 32505855, null);
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {592}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1 */
    static final class C248361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionTooltip $tooltip;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C248361(OptionTooltip optionTooltip, Continuation<? super C248361> continuation) {
            super(2, continuation);
            this.$tooltip = optionTooltip;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderDuxo.this.new C248361(this.$tooltip, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C248361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionStrategyBuilderViewState> statesFlow = OptionStrategyBuilderDuxo.this.getStatesFlow();
                Flow flowTake = FlowKt.take(new Flow<String>() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                String accountNumber = ((OptionStrategyBuilderViewState) obj).getAccountNumber();
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionStrategyBuilderDuxo.this, this.$tooltip, null);
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

        /* compiled from: OptionStrategyBuilderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1$2", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setTooltipSeen$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionTooltip $tooltip;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionStrategyBuilderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, OptionTooltip optionTooltip, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionStrategyBuilderDuxo;
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C248361(tooltip, null), 3, null);
        autoDismissIfNeeded(tooltip.getDisplayBehavior());
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, tooltip.getReceiptId(), null, 4, null), null, null, 25, null);
    }

    public final void setTooltipTapped() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.setTooltipTapped$lambda$56((OptionStrategyBuilderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState setTooltipTapped$lambda$56(OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 31457279, null);
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$autoDismissIfNeeded$1", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {617}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$autoDismissIfNeeded$1 */
    static final class C248211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionTooltipDisplayBehavior $displayBehavior;
        int label;
        final /* synthetic */ OptionStrategyBuilderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C248211(OptionTooltipDisplayBehavior optionTooltipDisplayBehavior, OptionStrategyBuilderDuxo optionStrategyBuilderDuxo, Continuation<? super C248211> continuation) {
            super(2, continuation);
            this.$displayBehavior = optionTooltipDisplayBehavior;
            this.this$0 = optionStrategyBuilderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C248211(this.$displayBehavior, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C248211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$autoDismissIfNeeded$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionStrategyBuilderDuxo.C248211.invokeSuspend$lambda$0((OptionStrategyBuilderViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionStrategyBuilderViewState invokeSuspend$lambda$0(OptionStrategyBuilderViewState optionStrategyBuilderViewState) {
            return OptionStrategyBuilderViewState.copy$default(optionStrategyBuilderViewState, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 31457279, null);
        }
    }

    private final void autoDismissIfNeeded(OptionTooltipDisplayBehavior displayBehavior) {
        if (displayBehavior == null || !displayBehavior.getAutoDismiss()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C248211(displayBehavior, this, null), 3, null);
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setSettleOnOpenTooltipSeen$1", m3645f = "OptionStrategyBuilderDuxo.kt", m3646l = {632}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setSettleOnOpenTooltipSeen$1 */
    static final class C248351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C248351(Continuation<? super C248351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionStrategyBuilderDuxo.this.new C248351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C248351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OptionStrategyBuilderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$setSettleOnOpenTooltipSeen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionStrategyBuilderDuxo.C248351.invokeSuspend$lambda$0((OptionStrategyBuilderViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionStrategyBuilderViewState invokeSuspend$lambda$0(OptionStrategyBuilderViewState optionStrategyBuilderViewState) {
            return OptionStrategyBuilderViewState.copy$default(optionStrategyBuilderViewState, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777215, null);
        }
    }

    public final void setSettleOnOpenTooltipSeen() {
        this.showSettleOnOpenTooltipPref.set(false);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C248351(null), 3, null);
    }

    public final void dismissSettleOnOpenTooltip() {
        this.showSettleOnOpenTooltipPref.set(false);
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderDuxo.dismissSettleOnOpenTooltip$lambda$57((OptionStrategyBuilderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBuilderViewState dismissSettleOnOpenTooltip$lambda$57(OptionStrategyBuilderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBuilderViewState.copy$default(applyMutation, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777215, null);
    }

    public final void logStrategyChainAppear() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        int i4 = 0;
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null), null, null, new Context(i, i2, i3, null, null, str, null, null, i4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(getStatesFlow().getValue().getOptionChainIdsForLogging(), null, null, null, Events2.getStrategyName(((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTemplate().getStrategyId()), null, null, null, null, null, null, null, null, null, 16366, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), 13, null);
    }

    public final void logStrategyChainRowTap(UserInteractionEventData.Action action, OptionStrategyBuilderViewState.Strategy strategy) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, action, new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.STRATEGY_ROW, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strategy.toOptionsContextLog(((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTemplate().getStrategyId()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    private final void logFilterSelect(OptionStrategyChainTemplate.FilterType filterType, String selectorValueOld, String selectorValueNew) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.DROPDOWN_OPTION, null, null, 6, null), null, new Context(i, i2, i3, str, null, str2, null, null, i4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(getStatesFlow().getValue().getOptionChainIdsForLogging(), null, null, null, Events2.getStrategyName(((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTemplate().getStrategyId()), null, null, null, null, null, null, null, null, null, 16366, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ValueSelectorContext(filterType.getServerValue(), selectorValueOld, selectorValueNew, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -16777217, -1, -1, -1, 16383, null), false, 40, null);
    }

    public final void logShowEducationTour(String tourId) {
        Intrinsics.checkNotNullParameter(tourId, "tourId");
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_EDUCATION_TOUR;
        Screen screen = new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.EDUCATION_TOUR_TOOLTIP, null, null, 6, null);
        Companion companion = INSTANCE;
        String str = null;
        String str2 = null;
        Context.ProductTag productTag = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Screen screen2 = null;
        String str6 = null;
        Asset asset = null;
        com.robinhood.rosetta.eventlogging.List list = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str7 = null;
        int i4 = 0;
        NewsFeedItem newsFeedItem = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(i, i2, i3, null, str, str2, str7, productTag, i4, str3, str4, str5, screen2, str6, asset, list, newsFeedItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EducationTour("OPTION_STRATEGY_CHAIN", ((OptionStrategyBuilderFragment.Args) companion.getArgs((HasSavedState) this)).getTemplate().getStrategyId(), tourId, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(getStatesFlow().getValue().getOptionChainIdsForLogging(), null, null, null, Events2.getStrategyName(((OptionStrategyBuilderFragment.Args) companion.getArgs((HasSavedState) this)).getTemplate().getStrategyId()), null, null, null, null, null, null, null, null, null, 16366, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194313, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public final void logDisclosureItemTap() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        int i4 = 0;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.LEARN_MORE, new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.MENU_ITEM, null, null, 6, null), null, new Context(i, i2, i3, null, null, str, null, null, i4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(getStatesFlow().getValue().getOptionChainIdsForLogging(), null, null, null, Events2.getStrategyName(((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTemplate().getStrategyId()), null, null, null, null, null, null, null, null, null, 16366, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo$SavedChoices;", "Landroid/os/Parcelable;", "selectedChoices", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "userEditedFilters", "", "<init>", "(Ljava/util/Map;Ljava/util/Set;)V", "getSelectedChoices", "()Ljava/util/Map;", "getUserEditedFilters", "()Ljava/util/Set;", "toFilteredStrategiesListData", "Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData;", "oldValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SavedChoices implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedChoices> CREATOR = new Creator();
        private final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices;
        private final Set<OptionStrategyChainTemplate.FilterType> userEditedFilters;

        /* compiled from: OptionStrategyBuilderDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedChoices> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedChoices createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(OptionStrategyChainTemplate.FilterType.valueOf(parcel.readString()), parcel.readParcelable(SavedChoices.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(OptionStrategyChainTemplate.FilterType.valueOf(parcel.readString()));
                }
                return new SavedChoices(linkedHashMap, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedChoices[] newArray(int i) {
                return new SavedChoices[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SavedChoices copy$default(SavedChoices savedChoices, Map map, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                map = savedChoices.selectedChoices;
            }
            if ((i & 2) != 0) {
                set = savedChoices.userEditedFilters;
            }
            return savedChoices.copy(map, set);
        }

        public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> component1() {
            return this.selectedChoices;
        }

        public final Set<OptionStrategyChainTemplate.FilterType> component2() {
            return this.userEditedFilters;
        }

        public final SavedChoices copy(Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, Set<? extends OptionStrategyChainTemplate.FilterType> userEditedFilters) {
            Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
            Intrinsics.checkNotNullParameter(userEditedFilters, "userEditedFilters");
            return new SavedChoices(selectedChoices, userEditedFilters);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedChoices)) {
                return false;
            }
            SavedChoices savedChoices = (SavedChoices) other;
            return Intrinsics.areEqual(this.selectedChoices, savedChoices.selectedChoices) && Intrinsics.areEqual(this.userEditedFilters, savedChoices.userEditedFilters);
        }

        public int hashCode() {
            return (this.selectedChoices.hashCode() * 31) + this.userEditedFilters.hashCode();
        }

        public String toString() {
            return "SavedChoices(selectedChoices=" + this.selectedChoices + ", userEditedFilters=" + this.userEditedFilters + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> map = this.selectedChoices;
            dest.writeInt(map.size());
            for (Map.Entry<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> entry : map.entrySet()) {
                dest.writeString(entry.getKey().name());
                dest.writeParcelable(entry.getValue(), flags);
            }
            Set<OptionStrategyChainTemplate.FilterType> set = this.userEditedFilters;
            dest.writeInt(set.size());
            Iterator<OptionStrategyChainTemplate.FilterType> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SavedChoices(Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, Set<? extends OptionStrategyChainTemplate.FilterType> userEditedFilters) {
            Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
            Intrinsics.checkNotNullParameter(userEditedFilters, "userEditedFilters");
            this.selectedChoices = selectedChoices;
            this.userEditedFilters = userEditedFilters;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> getSelectedChoices() {
            return this.selectedChoices;
        }

        public final Set<OptionStrategyChainTemplate.FilterType> getUserEditedFilters() {
            return this.userEditedFilters;
        }

        public final FilteredStrategiesListData toFilteredStrategiesListData(FilteredStrategiesListData oldValue) {
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            return new FilteredStrategiesListData(oldValue.getFilterChoicesData(), this.selectedChoices, this.userEditedFilters, oldValue.getCurrentStrategyIds());
        }
    }

    public final void logPerformanceBeginStrategyChain() {
        OptionChain firstOptionChainForPerformanceLogging = getStatesFlow().getValue().getFirstOptionChainForPerformanceLogging();
        this.performanceLogger.beginMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN, PerformanceMetricEventData.Source.SOURCE_OPTION_STRATEGY_CHAIN, firstOptionChainForPerformanceLogging.getId(), new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(null, null, false, firstOptionChainForPerformanceLogging.getSymbol(), null, Events2.getStrategyName(((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTemplate().getStrategyId()), null, 87, null), null, null, null, null, null, null, null, null, 4087, null));
    }

    private final void logPerformanceBeginFilter(PerformanceMetricEventData.Name name) {
        UUID id = getStatesFlow().getValue().getFirstOptionChainForPerformanceLogging().getId();
        this.performanceLogger.beginMetric(name, PerformanceMetricEventData.Source.SOURCE_OPTION_STRATEGY_CHAIN, id, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(null, null, false, Uuids.toStringOrEmpty(id), null, Events2.getStrategyName(((OptionStrategyBuilderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTemplate().getStrategyId()), null, 87, null), null, null, null, null, null, null, null, null, 4087, null));
    }

    public final void logPerformanceEnd() {
        this.performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN, getStatesFlow().getValue().getFirstOptionChainForPerformanceLogging().getId());
    }

    public final void logPerformanceEndForFilters() {
        UUID id = getStatesFlow().getValue().getFirstOptionChainForPerformanceLogging().getId();
        PerformanceLogger performanceLogger = this.performanceLogger;
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER, id);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_FAR_FILTER, id);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER, id);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER, id);
    }

    public final void abortLogs() {
        UUID id = getStatesFlow().getValue().getFirstOptionChainForPerformanceLogging().getId();
        PerformanceLogger performanceLogger = this.performanceLogger;
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN, id);
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER, id);
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_FAR_FILTER, id);
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER, id);
        performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER, id);
    }

    public final void logCustomizationSnackbar(OptionChainCustomizationErrorEvent chainCustomizationErrorEvent) {
        OptionChainAvailableMetrics.Metric selectedMetricTwo;
        OptionChainAvailableMetrics.Metric selectedMetricOne;
        Intrinsics.checkNotNullParameter(chainCustomizationErrorEvent, "chainCustomizationErrorEvent");
        EventLogger eventLogger = this.eventLogger;
        Screen screen = new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.ERROR_TOAST, OptionChainCustomizationLogging.getToastComponentIdentifier(chainCustomizationErrorEvent), null, 4, null);
        String strategyId = getStatesFlow().getValue().getStrategyId();
        OptionChainEntryPointType optionChainEntryPointType = OptionChainEntryPointType.STRATEGY_BUILDER;
        OptionChainSelectedMetrics selectedMetrics = getStatesFlow().getValue().getSelectedMetrics();
        OptionChainAvailableMetrics.MetricType metricType = null;
        OptionChainAvailableMetrics.MetricType metricType2 = (selectedMetrics == null || (selectedMetricOne = selectedMetrics.getSelectedMetricOne()) == null) ? null : selectedMetricOne.getMetricType();
        OptionChainSelectedMetrics selectedMetrics2 = getStatesFlow().getValue().getSelectedMetrics();
        if (selectedMetrics2 != null && (selectedMetricTwo = selectedMetrics2.getSelectedMetricTwo()) != null) {
            metricType = selectedMetricTwo.getMetricType();
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, OptionChainCustomizationLogging.getCustomizationEventContext$default(strategyId, optionChainEntryPointType, null, null, null, metricType2, metricType, 28, null), 9, null);
    }

    private final Observable<Optional<Tuples2<List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs>>> streamInstruments(Observable<OptionStrategyBuilderStore.LegStreamingArgs> observable) {
        Observable<R> observableSwitchMap = observable.switchMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.streamInstruments.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs>> apply(final OptionStrategyBuilderStore.LegStreamingArgs args) {
                Intrinsics.checkNotNullParameter(args, "args");
                return OptionStrategyBuilderDuxo.this.optionStrategyBuilderStore.streamLegOptionInstruments(args).map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderDuxo.streamInstruments.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs> apply(List<OptionInstrument> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(it, args);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return ObservablesKt.toOptionals(observableSwitchMap).startWith((Observable) Optional2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBI\b\u0016\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00070\r0\f\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00070\r0\f¢\u0006\u0004\b\t\u0010\u000fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo$OptionInstrumentsData;", "", "firstLegOptionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;", "secondLegOptionInstruments", "firstLegStreamingArgs", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "secondLegStreamingArgs", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;)V", "firstPair", "Lcom/robinhood/utils/Optional;", "Lkotlin/Pair;", "secondPair", "(Lcom/robinhood/utils/Optional;Lcom/robinhood/utils/Optional;)V", "getFirstLegOptionInstruments", "()Ljava/util/List;", "getSecondLegOptionInstruments", "getFirstLegStreamingArgs", "()Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore$LegStreamingArgs;", "getSecondLegStreamingArgs", "isValidWithState", "", "state", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class OptionInstrumentsData {
        private final List<OptionInstrument> firstLegOptionInstruments;
        private final OptionStrategyBuilderStore.LegStreamingArgs firstLegStreamingArgs;
        private final List<OptionInstrument> secondLegOptionInstruments;
        private final OptionStrategyBuilderStore.LegStreamingArgs secondLegStreamingArgs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionInstrumentsData copy$default(OptionInstrumentsData optionInstrumentsData, List list, List list2, OptionStrategyBuilderStore.LegStreamingArgs legStreamingArgs, OptionStrategyBuilderStore.LegStreamingArgs legStreamingArgs2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = optionInstrumentsData.firstLegOptionInstruments;
            }
            if ((i & 2) != 0) {
                list2 = optionInstrumentsData.secondLegOptionInstruments;
            }
            if ((i & 4) != 0) {
                legStreamingArgs = optionInstrumentsData.firstLegStreamingArgs;
            }
            if ((i & 8) != 0) {
                legStreamingArgs2 = optionInstrumentsData.secondLegStreamingArgs;
            }
            return optionInstrumentsData.copy(list, list2, legStreamingArgs, legStreamingArgs2);
        }

        public final List<OptionInstrument> component1() {
            return this.firstLegOptionInstruments;
        }

        public final List<OptionInstrument> component2() {
            return this.secondLegOptionInstruments;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionStrategyBuilderStore.LegStreamingArgs getFirstLegStreamingArgs() {
            return this.firstLegStreamingArgs;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionStrategyBuilderStore.LegStreamingArgs getSecondLegStreamingArgs() {
            return this.secondLegStreamingArgs;
        }

        public final OptionInstrumentsData copy(List<OptionInstrument> firstLegOptionInstruments, List<OptionInstrument> secondLegOptionInstruments, OptionStrategyBuilderStore.LegStreamingArgs firstLegStreamingArgs, OptionStrategyBuilderStore.LegStreamingArgs secondLegStreamingArgs) {
            return new OptionInstrumentsData(firstLegOptionInstruments, secondLegOptionInstruments, firstLegStreamingArgs, secondLegStreamingArgs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionInstrumentsData)) {
                return false;
            }
            OptionInstrumentsData optionInstrumentsData = (OptionInstrumentsData) other;
            return Intrinsics.areEqual(this.firstLegOptionInstruments, optionInstrumentsData.firstLegOptionInstruments) && Intrinsics.areEqual(this.secondLegOptionInstruments, optionInstrumentsData.secondLegOptionInstruments) && Intrinsics.areEqual(this.firstLegStreamingArgs, optionInstrumentsData.firstLegStreamingArgs) && Intrinsics.areEqual(this.secondLegStreamingArgs, optionInstrumentsData.secondLegStreamingArgs);
        }

        public int hashCode() {
            List<OptionInstrument> list = this.firstLegOptionInstruments;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<OptionInstrument> list2 = this.secondLegOptionInstruments;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            OptionStrategyBuilderStore.LegStreamingArgs legStreamingArgs = this.firstLegStreamingArgs;
            int iHashCode3 = (iHashCode2 + (legStreamingArgs == null ? 0 : legStreamingArgs.hashCode())) * 31;
            OptionStrategyBuilderStore.LegStreamingArgs legStreamingArgs2 = this.secondLegStreamingArgs;
            return iHashCode3 + (legStreamingArgs2 != null ? legStreamingArgs2.hashCode() : 0);
        }

        public String toString() {
            return "OptionInstrumentsData(firstLegOptionInstruments=" + this.firstLegOptionInstruments + ", secondLegOptionInstruments=" + this.secondLegOptionInstruments + ", firstLegStreamingArgs=" + this.firstLegStreamingArgs + ", secondLegStreamingArgs=" + this.secondLegStreamingArgs + ")";
        }

        public OptionInstrumentsData(List<OptionInstrument> list, List<OptionInstrument> list2, OptionStrategyBuilderStore.LegStreamingArgs legStreamingArgs, OptionStrategyBuilderStore.LegStreamingArgs legStreamingArgs2) {
            this.firstLegOptionInstruments = list;
            this.secondLegOptionInstruments = list2;
            this.firstLegStreamingArgs = legStreamingArgs;
            this.secondLegStreamingArgs = legStreamingArgs2;
        }

        public final List<OptionInstrument> getFirstLegOptionInstruments() {
            return this.firstLegOptionInstruments;
        }

        public final List<OptionInstrument> getSecondLegOptionInstruments() {
            return this.secondLegOptionInstruments;
        }

        public final OptionStrategyBuilderStore.LegStreamingArgs getFirstLegStreamingArgs() {
            return this.firstLegStreamingArgs;
        }

        public final OptionStrategyBuilderStore.LegStreamingArgs getSecondLegStreamingArgs() {
            return this.secondLegStreamingArgs;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OptionInstrumentsData(Optional<? extends Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs>> firstPair, Optional<? extends Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs>> secondPair) {
            Intrinsics.checkNotNullParameter(firstPair, "firstPair");
            Intrinsics.checkNotNullParameter(secondPair, "secondPair");
            Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs> orNull = firstPair.getOrNull();
            List<OptionInstrument> first = orNull != null ? orNull.getFirst() : null;
            Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs> orNull2 = secondPair.getOrNull();
            List<OptionInstrument> first2 = orNull2 != null ? orNull2.getFirst() : null;
            Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs> orNull3 = firstPair.getOrNull();
            OptionStrategyBuilderStore.LegStreamingArgs second = orNull3 != null ? orNull3.getSecond() : null;
            Tuples2<? extends List<OptionInstrument>, OptionStrategyBuilderStore.LegStreamingArgs> orNull4 = secondPair.getOrNull();
            this(first, first2, second, orNull4 != null ? orNull4.getSecond() : null);
        }

        public final boolean isValidWithState(OptionStrategyBuilderViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return Intrinsics.areEqual(this.firstLegStreamingArgs, state.getFirstLegStreamingArgs()) && Intrinsics.areEqual(this.secondLegStreamingArgs, state.getSecondLegStreamingArgs());
        }
    }

    /* compiled from: OptionStrategyBuilderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment$Args;", "<init>", "()V", "CHOICES_KEY", "", "SELECTED_STRATEGY_KEY", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionStrategyBuilderDuxo, OptionStrategyBuilderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionStrategyBuilderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionStrategyBuilderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionStrategyBuilderFragment.Args getArgs(OptionStrategyBuilderDuxo optionStrategyBuilderDuxo) {
            return (OptionStrategyBuilderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionStrategyBuilderDuxo);
        }
    }
}
