package com.robinhood.android.advancedchart;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.chart.AdvancedChartExperiments;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorState4;
import com.robinhood.android.advanced.chart.IndicatorStateList;
import com.robinhood.android.advancedchart.AdvancedChartEvent;
import com.robinhood.android.charts.models.p080db.AdvancedChartModel;
import com.robinhood.android.common.data.prefs.ShowExtendedHoursChartPref;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.CustomIntervalsTooltipShownPrefState;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAdvancedChartRequest;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAdvancedChartStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartFragmentKey;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.ranges.Ranges3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;

/* compiled from: AdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001SB\u008d\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u000200H\u0016J\u0016\u00104\u001a\u0002002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206J\u001e\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002060)H\u0002J\u000e\u0010<\u001a\u0002002\u0006\u0010=\u001a\u000206J.\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u00022\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010)J\u000e\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020\u001aJ\u0006\u0010G\u001a\u000200J\u0016\u0010H\u001a\u0002002\u0006\u0010-\u001a\u0002062\u0006\u0010=\u001a\u000206J\u0014\u0010I\u001a\u0002002\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KJ\u0006\u0010M\u001a\u000200J\u000e\u0010N\u001a\u0002002\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u000200J\u0006\u0010R\u001a\u000200R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;", "Lcom/robinhood/android/advancedchart/AdvancedChartEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "instrumentAdvancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentChartSpansStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;", "instrumentChartIntervalsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "showExtendedHoursChartPref", "customIntervalsTooltipShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAdvancedChartStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "apiTechnicalIndicatorListJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "instrument", "Lcom/robinhood/models/db/Instrument;", "instrumentId", "Ljava/util/UUID;", "onCreate", "", "onStart", "onStop", "onResume", "onIndicatorTapped", "id", "", "title", "toggleIndicator", "indicatorStateList", "Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "idList", "onSpanSelected", "spanId", "getAdvancedChartAnalyticsCommonData", "Lcom/robinhood/android/advancedchart/AdvancedChartAnalyticsCommonData;", "state", "newDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "newIndicatorList", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "logScrubbingModeUpdate", "inScrubbingMode", "onCustomIntervalsTooltipDismissed", "onOpenCustomIntervalsTooltipDismissed", "onXAxisZoomed", "newXAxisZoomRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "onXAxisZoomEnd", "setIndicatorListViewHeight", "height", "", "onAlertClick", "onChartLearnMoreClick", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartDuxo extends BaseDuxo5<AdvancedChartViewState, AdvancedChartEvent> implements HasSavedState {
    private final AdvancedChartStore advancedChartStore;
    private final JsonAdapter<List<ApiTechnicalIndicator>> apiTechnicalIndicatorListJsonAdapter;
    private final StateFlow2<Boolean> customIntervalsTooltipShownPrefState;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final Instrument instrument;
    private final InstrumentAdvancedChartStore instrumentAdvancedChartStore;
    private final InstrumentChartIntervalsStore instrumentChartIntervalsStore;
    private final InstrumentChartSpansStore instrumentChartSpansStore;
    private final UUID instrumentId;
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference showCandlestickChartPref;
    private final BooleanPreference showExtendedHoursChartPref;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedChartDuxo(QuoteStore quoteStore, AdvancedChartStore advancedChartStore, InstrumentAdvancedChartStore instrumentAdvancedChartStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, InstrumentChartSpansStore instrumentChartSpansStore, InstrumentChartIntervalsStore instrumentChartIntervalsStore, UserStore userStore, @ShowCandlestickChartPref BooleanPreference showCandlestickChartPref, @ShowExtendedHoursChartPref BooleanPreference showExtendedHoursChartPref, @CustomIntervalsTooltipShownPrefState StateFlow2<Boolean> customIntervalsTooltipShownPrefState, EventLogger eventLogger, SavedStateHandle savedStateHandle, LazyMoshi moshi, DuxoBundle duxoBundle) {
        super(new AdvancedChartViewState(null, null, null, null, false, null, 0, null, null, false, false, false, false, false, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null), duxoBundle);
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
        Intrinsics.checkNotNullParameter(instrumentAdvancedChartStore, "instrumentAdvancedChartStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
        Intrinsics.checkNotNullParameter(instrumentChartIntervalsStore, "instrumentChartIntervalsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        Intrinsics.checkNotNullParameter(showExtendedHoursChartPref, "showExtendedHoursChartPref");
        Intrinsics.checkNotNullParameter(customIntervalsTooltipShownPrefState, "customIntervalsTooltipShownPrefState");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.quoteStore = quoteStore;
        this.advancedChartStore = advancedChartStore;
        this.instrumentAdvancedChartStore = instrumentAdvancedChartStore;
        this.experimentsStore = experimentsStore;
        this.instrumentStore = instrumentStore;
        this.instrumentChartSpansStore = instrumentChartSpansStore;
        this.instrumentChartIntervalsStore = instrumentChartIntervalsStore;
        this.userStore = userStore;
        this.showCandlestickChartPref = showCandlestickChartPref;
        this.showExtendedHoursChartPref = showExtendedHoursChartPref;
        this.customIntervalsTooltipShownPrefState = customIntervalsTooltipShownPrefState;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        Types types = Types.INSTANCE;
        this.apiTechnicalIndicatorListJsonAdapter = moshi.adapter(new TypeToken<List<? extends ApiTechnicalIndicator>>() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$special$$inlined$getAdapter$1
        }.getType());
        Companion companion = INSTANCE;
        this.instrument = ((AdvancedChartFragmentKey) companion.getArgs(getSavedStateHandle())).getInstrument();
        this.instrumentId = ((AdvancedChartFragmentKey) companion.getArgs(getSavedStateHandle())).getInstrumentId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Observable<TechnicalIndicatorConfigList> observableStreamTechnicalIndicatorConfigList;
        Historical.Span chartSpan;
        super.onCreate();
        if (this.instrument != null) {
            applyMutation(new C84591(null));
        } else {
            LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(((AdvancedChartFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvancedChartDuxo.onCreate$lambda$0(this.f$0, (Instrument) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.showCandlestickChartPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.showExtendedHoursChartPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Query<UUID, Quote> streamQuote = this.quoteStore.getStreamQuote();
        Companion companion = INSTANCE;
        Observable<Quote> observableDistinctUntilChanged = streamQuote.asObservable(((AdvancedChartFragmentKey) companion.getArgs((HasSavedState) this)).getInstrumentId()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$3(this.f$0, (Quote) obj);
            }
        });
        AdvancedChartFragmentKey.AlertArgs alertArgs = ((AdvancedChartFragmentKey) companion.getArgs((HasSavedState) this)).getAlertArgs();
        if ((alertArgs != null ? alertArgs.getSelectedIndicators() : null) != null) {
            observableStreamTechnicalIndicatorConfigList = this.advancedChartStore.streamTechnicalIndicatorConfigList().take(1L).doOnNext(new Consumer() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo.onCreate.6
                @Override // io.reactivex.functions.Consumer
                public final void accept(TechnicalIndicatorConfigList technicalIndicatorConfigList) {
                    IndicatorStateList indicatorStateList = new IndicatorStateList(IndicatorState4.toIndicatorStates(technicalIndicatorConfigList.getTechnicalIndicatorConfigs()), technicalIndicatorConfigList.getTimestamp());
                    AdvancedChartFragmentKey.AlertArgs alertArgs2 = ((AdvancedChartFragmentKey) AdvancedChartDuxo.INSTANCE.getArgs((HasSavedState) AdvancedChartDuxo.this)).getAlertArgs();
                    List<IndicatorState> preselectIndicatorList = indicatorStateList.getPreselectIndicatorList(alertArgs2 != null ? alertArgs2.getSelectedIndicators() : null);
                    AdvancedChartDuxo advancedChartDuxo = AdvancedChartDuxo.this;
                    List<IndicatorState> list = preselectIndicatorList;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((IndicatorState) it.next()).getId());
                    }
                    advancedChartDuxo.toggleIndicator(indicatorStateList, arrayList);
                }
            }).flatMap(new Function() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo.onCreate.7
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends TechnicalIndicatorConfigList> apply(TechnicalIndicatorConfigList it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return AdvancedChartDuxo.this.advancedChartStore.streamTechnicalIndicatorConfigList();
                }
            });
        } else {
            observableStreamTechnicalIndicatorConfigList = this.advancedChartStore.streamTechnicalIndicatorConfigList();
        }
        Observable<TechnicalIndicatorConfigList> observableDistinctUntilChanged2 = observableStreamTechnicalIndicatorConfigList.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$4(this.f$0, (TechnicalIndicatorConfigList) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AdvancedChartExperiments.ChartsIndicatorImprovementP1.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AdvancedChartExperiments.ChartsIndicatorImprovementP2.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$6(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        GraphSelection graphSelection = ((AdvancedChartFragmentKey) companion.getArgs((HasSavedState) this)).getGraphSelection();
        if (graphSelection == null) {
            AdvancedChartFragmentKey.AlertArgs alertArgs2 = ((AdvancedChartFragmentKey) companion.getArgs((HasSavedState) this)).getAlertArgs();
            graphSelection = (alertArgs2 == null || (chartSpan = alertArgs2.getChartSpan()) == null) ? null : AdvancedChartDuxoKt.toGraphSelection(chartSpan);
        }
        applyMutation(new C846011(graphSelection, null));
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentChartSpansStore.streamSpans(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$7(this.f$0, (InstrumentChartSpans) obj);
            }
        });
        InstrumentChartIntervalsStore instrumentChartIntervalsStore = this.instrumentChartIntervalsStore;
        String string2 = this.instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        LifecycleHost.DefaultImpls.bind$default(this, instrumentChartIntervalsStore.streamChartIntervals(string2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$8(this.f$0, (InstrumentChartIntervals) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.customIntervalsTooltipShownPrefState), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$9(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onCreate$lambda$10(this.f$0, (User) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C846116(null), 3, null);
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onCreate$1", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onCreate$1 */
    static final class C84591 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C84591(Continuation<? super C84591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84591 c84591 = AdvancedChartDuxo.this.new C84591(continuation);
            c84591.L$0 = obj;
            return c84591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
            return ((C84591) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
            return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : null, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : AdvancedChartDuxo.this.instrument, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(AdvancedChartDuxo advancedChartDuxo, Instrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$2$1(it, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AdvancedChartDuxo advancedChartDuxo, boolean z) {
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$3$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(AdvancedChartDuxo advancedChartDuxo, boolean z) {
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$4$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(AdvancedChartDuxo advancedChartDuxo, Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$5$1(quote, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(AdvancedChartDuxo advancedChartDuxo, TechnicalIndicatorConfigList technicalIndicatorConfigList) {
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$8$1(technicalIndicatorConfigList, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(AdvancedChartDuxo advancedChartDuxo, boolean z) {
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$9$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(AdvancedChartDuxo advancedChartDuxo, boolean z) {
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$10$1(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onCreate$11", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onCreate$11 */
    static final class C846011 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
        final /* synthetic */ GraphSelection $initialSpan;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C846011(GraphSelection graphSelection, Continuation<? super C846011> continuation) {
            super(2, continuation);
            this.$initialSpan = graphSelection;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C846011 c846011 = new C846011(this.$initialSpan, continuation);
            c846011.L$0 = obj;
            return c846011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
            return ((C846011) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Historical.Span span;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
            GraphSelection graphSelection = this.$initialSpan;
            return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : (graphSelection == null || (span = graphSelection.getSpan()) == null) ? null : span.getServerValue(), (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(AdvancedChartDuxo advancedChartDuxo, InstrumentChartSpans chartSpans) {
        Intrinsics.checkNotNullParameter(chartSpans, "chartSpans");
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$12$1(chartSpans, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(AdvancedChartDuxo advancedChartDuxo, InstrumentChartIntervals chartIntervals) {
        Intrinsics.checkNotNullParameter(chartIntervals, "chartIntervals");
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$13$1(chartIntervals, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(AdvancedChartDuxo advancedChartDuxo, boolean z) {
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$14$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(AdvancedChartDuxo advancedChartDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onCreate$15$1(user, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onCreate$16", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onCreate$16 */
    static final class C846116 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C846116(Continuation<? super C846116> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedChartDuxo.this.new C846116(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C846116) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (AdvancedChartDuxo.this.advancedChartStore.shouldShowAdvancedChartZoomNux()) {
                    AdvancedChartDuxo.this.submit(AdvancedChartEvent.ShowZoomNux.INSTANCE);
                    AdvancedChartDuxo.this.advancedChartStore.recordAdvancedChartZoomNuxShown();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onStart$lambda$11(this.f$0, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(AdvancedChartDuxo advancedChartDuxo, AdvancedChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData$default = getAdvancedChartAnalyticsCommonData$default(advancedChartDuxo, it, null, null, 6, null);
        if (advancedChartAnalyticsCommonData$default != null) {
            AdvancedChartLoggings3.logAdvancedChartAppear(advancedChartDuxo.eventLogger, advancedChartAnalyticsCommonData$default);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onStop$lambda$12(this.f$0, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$12(AdvancedChartDuxo advancedChartDuxo, AdvancedChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData$default = getAdvancedChartAnalyticsCommonData$default(advancedChartDuxo, it, null, null, 6, null);
        if (advancedChartAnalyticsCommonData$default != null) {
            AdvancedChartLoggings3.logAdvancedChartDisappear(advancedChartDuxo.eventLogger, advancedChartAnalyticsCommonData$default);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        final StateFlow<AdvancedChartViewState> stateFlow = getStateFlow();
        Observable observableSwitchMap = asObservable(FlowKt.distinctUntilChanged(new Flow<InstrumentAdvancedChartRequest>() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InstrumentAdvancedChartRequest> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C84582(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$$inlined$mapNotNull$1$2 */
            public static final class C84582<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$$inlined$mapNotNull$1$2", m3645f = "AdvancedChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C84582.this.emit(null, this);
                    }
                }

                public C84582(FlowCollector flowCollector) {
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
                        InstrumentAdvancedChartRequest advancedChartRequest = ((AdvancedChartViewState) obj).getAdvancedChartRequest();
                        if (advancedChartRequest != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(advancedChartRequest, anonymousClass1) == coroutine_suspended) {
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
        })).switchMap(new Function() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo.onResume.2

            /* compiled from: AdvancedChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$2$1", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
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
                public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
                    return ((AnonymousClass1) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
                    return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : null, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : true, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AdvancedChartModel> apply(InstrumentAdvancedChartRequest advancedChartRequest) {
                Intrinsics.checkNotNullParameter(advancedChartRequest, "advancedChartRequest");
                AdvancedChartDuxo.this.applyMutation(new AnonymousClass1(null));
                AdvancedChartDuxo advancedChartDuxo = AdvancedChartDuxo.this;
                Observable<T> observableAsObservable = advancedChartDuxo.asObservable(advancedChartDuxo.instrumentAdvancedChartStore.streamAdvancedChart(advancedChartRequest));
                final AdvancedChartDuxo advancedChartDuxo2 = AdvancedChartDuxo.this;
                return observableAsObservable.onErrorResumeNext(new Function() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo.onResume.2.2

                    /* compiled from: AdvancedChartDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$2$2$1", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onResume$2$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
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
                        public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
                            return ((AnonymousClass1) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
                            return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : null, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
                        }
                    }

                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends AdvancedChartModel> apply(Throwable t) {
                        Intrinsics.checkNotNullParameter(t, "t");
                        advancedChartDuxo2.applyMutation(new AnonymousClass1(null));
                        advancedChartDuxo2.submit(new AdvancedChartEvent.ShowError(t));
                        return Observable.empty();
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onResume$lambda$14(this.f$0, (AdvancedChartModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(AdvancedChartDuxo advancedChartDuxo, AdvancedChartModel advancedChartModel) {
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onResume$3$1(advancedChartModel, null));
        return Unit.INSTANCE;
    }

    public final void onIndicatorTapped(final String id, final String title) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onIndicatorTapped$lambda$17(this.f$0, id, title, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onIndicatorTapped$lambda$17(AdvancedChartDuxo advancedChartDuxo, String str, String str2, AdvancedChartViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<IndicatorState> indicatorStates = dataState.getIndicatorList().getIndicatorStates();
        Iterator<IndicatorState> it = indicatorStates.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getId(), str)) {
                break;
            }
            i++;
        }
        IndicatorState indicatorState = indicatorStates.get(i);
        List mutableList = CollectionsKt.toMutableList((Collection) indicatorStates);
        mutableList.set(i, indicatorState.toggle());
        long epochMilli = Instant.now().toEpochMilli();
        advancedChartDuxo.applyMutation(new AdvancedChartDuxo$onIndicatorTapped$1$1(mutableList, epochMilli, null));
        AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData$default = getAdvancedChartAnalyticsCommonData$default(advancedChartDuxo, dataState, null, mutableList, 2, null);
        if (advancedChartAnalyticsCommonData$default != null) {
            AdvancedChartLoggings3.logAdvancedChartTechnicalIndicatorPillTapped(advancedChartDuxo.eventLogger, str2, advancedChartAnalyticsCommonData$default);
        }
        advancedChartDuxo.advancedChartStore.updateIndicatorConfigsWithStoreScope(IndicatorState4.toIndicatorConfigs(mutableList), epochMilli);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleIndicator(IndicatorStateList indicatorStateList, List<String> idList) {
        if (idList.isEmpty()) {
            return;
        }
        List<IndicatorState> indicatorStates = indicatorStateList.getIndicatorStates();
        List mutableList = CollectionsKt.toMutableList((Collection) indicatorStates);
        for (String str : idList) {
            Iterator<IndicatorState> it = indicatorStates.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getId(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                mutableList.set(i, indicatorStates.get(i).toggle());
            }
        }
        long epochMilli = Instant.now().toEpochMilli();
        applyMutation(new C84682(mutableList, epochMilli, null));
        this.advancedChartStore.updateIndicatorConfigsWithStoreScope(IndicatorState4.toIndicatorConfigs(mutableList), epochMilli);
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$toggleIndicator$2", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$toggleIndicator$2 */
    static final class C84682 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
        final /* synthetic */ List<IndicatorState> $newIndicatorList;
        final /* synthetic */ long $timestamp;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84682(List<IndicatorState> list, long j, Continuation<? super C84682> continuation) {
            super(2, continuation);
            this.$newIndicatorList = list;
            this.$timestamp = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84682 c84682 = new C84682(this.$newIndicatorList, this.$timestamp, continuation);
            c84682.L$0 = obj;
            return c84682;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
            return ((C84682) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
            return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : null, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : new IndicatorStateList(this.$newIndicatorList, this.$timestamp), (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
        }
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onSpanSelected$1", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onSpanSelected$1 */
    static final class C84651 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
        final /* synthetic */ String $spanId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84651(String str, Continuation<? super C84651> continuation) {
            super(2, continuation);
            this.$spanId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84651 c84651 = new C84651(this.$spanId, continuation);
            c84651.L$0 = obj;
            return c84651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
            return ((C84651) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
            return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : this.$spanId, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
        }
    }

    public final void onSpanSelected(final String spanId) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        applyMutation(new C84651(spanId, null));
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onSpanSelected$lambda$20(this.f$0, spanId, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSpanSelected$lambda$20(AdvancedChartDuxo advancedChartDuxo, String str, AdvancedChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData$default = getAdvancedChartAnalyticsCommonData$default(advancedChartDuxo, it, DisplaySpan.INSTANCE.fromServerValue(str), null, 4, null);
        if (advancedChartAnalyticsCommonData$default != null) {
            AdvancedChartLoggings3.logAdvancedChartSpanTapped(advancedChartDuxo.eventLogger, advancedChartAnalyticsCommonData$default);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedChartAnalyticsCommonData getAdvancedChartAnalyticsCommonData$default(AdvancedChartDuxo advancedChartDuxo, AdvancedChartViewState advancedChartViewState, DisplaySpan displaySpan, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            displaySpan = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return advancedChartDuxo.getAdvancedChartAnalyticsCommonData(advancedChartViewState, displaySpan, list);
    }

    public final AdvancedChartAnalyticsCommonData getAdvancedChartAnalyticsCommonData(AdvancedChartViewState state, DisplaySpan newDisplaySpan, List<IndicatorState> newIndicatorList) {
        Intrinsics.checkNotNullParameter(state, "state");
        String displaySpan = state.getDisplaySpan();
        if (newDisplaySpan == null && displaySpan == null) {
            return null;
        }
        UUID instrumentId = ((AdvancedChartFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId();
        if (newDisplaySpan == null && (newDisplaySpan = DisplaySpan.INSTANCE.fromServerValue(displaySpan)) == null) {
            newDisplaySpan = DisplaySpan.UNKNOWN;
        }
        DisplaySpan displaySpan2 = newDisplaySpan;
        boolean showCandlesticks = state.getShowCandlesticks();
        boolean z = !state.getHideExtendedHours();
        JsonAdapter<List<ApiTechnicalIndicator>> jsonAdapter = this.apiTechnicalIndicatorListJsonAdapter;
        if (newIndicatorList == null) {
            newIndicatorList = state.getIndicatorList().getIndicatorStates();
        }
        List<IndicatorState> list = newIndicatorList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndicatorState) it.next()).getApiTechnicalIndicator());
        }
        String json = jsonAdapter.toJson(arrayList);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return new AdvancedChartAnalyticsCommonData(instrumentId, displaySpan2, showCandlesticks, z, json);
    }

    public final void logScrubbingModeUpdate(final boolean inScrubbingMode) {
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.logScrubbingModeUpdate$lambda$21(this.f$0, inScrubbingMode, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logScrubbingModeUpdate$lambda$21(AdvancedChartDuxo advancedChartDuxo, boolean z, AdvancedChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData$default = getAdvancedChartAnalyticsCommonData$default(advancedChartDuxo, it, null, null, 6, null);
        if (advancedChartAnalyticsCommonData$default != null) {
            if (z) {
                AdvancedChartLoggings3.logEnterScrubbingMode(advancedChartDuxo.eventLogger, advancedChartAnalyticsCommonData$default);
            } else {
                AdvancedChartLoggings3.logExitScrubbingMode(advancedChartDuxo.eventLogger, advancedChartAnalyticsCommonData$default);
            }
        }
        return Unit.INSTANCE;
    }

    public final void onCustomIntervalsTooltipDismissed() {
        this.customIntervalsTooltipShownPrefState.setValue(Boolean.TRUE);
    }

    public final void onOpenCustomIntervalsTooltipDismissed(final String instrumentId, final String spanId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        this.customIntervalsTooltipShownPrefState.setValue(Boolean.TRUE);
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onOpenCustomIntervalsTooltipDismissed$lambda$22(this.f$0, instrumentId, spanId, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOpenCustomIntervalsTooltipDismissed$lambda$22(AdvancedChartDuxo advancedChartDuxo, String str, String str2, AdvancedChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartDuxo.submit(new AdvancedChartEvent.LaunchInstrumentIntervalsDialog(str, str2, it.getShowCandlesticks()));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onXAxisZoomed$1", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$onXAxisZoomed$1 */
    static final class C84661 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
        final /* synthetic */ Ranges3<Float> $newXAxisZoomRange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84661(Ranges3<Float> ranges3, Continuation<? super C84661> continuation) {
            super(2, continuation);
            this.$newXAxisZoomRange = ranges3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84661 c84661 = new C84661(this.$newXAxisZoomRange, continuation);
            c84661.L$0 = obj;
            return c84661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
            return ((C84661) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
            return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : null, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : this.$newXAxisZoomRange);
        }
    }

    public final void onXAxisZoomed(Ranges3<Float> newXAxisZoomRange) {
        Intrinsics.checkNotNullParameter(newXAxisZoomRange, "newXAxisZoomRange");
        applyMutation(new C84661(newXAxisZoomRange, null));
    }

    public final void onXAxisZoomEnd() {
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onXAxisZoomEnd$lambda$23(this.f$0, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onXAxisZoomEnd$lambda$23(AdvancedChartDuxo advancedChartDuxo, AdvancedChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData$default = getAdvancedChartAnalyticsCommonData$default(advancedChartDuxo, it, null, null, 6, null);
        if (advancedChartAnalyticsCommonData$default != null) {
            AdvancedChartLoggings3.logAdvancedChartZoom(advancedChartDuxo.eventLogger, advancedChartAnalyticsCommonData$default);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$setIndicatorListViewHeight$1", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartDuxo$setIndicatorListViewHeight$1 */
    static final class C84671 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
        final /* synthetic */ int $height;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84671(int i, Continuation<? super C84671> continuation) {
            super(2, continuation);
            this.$height = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84671 c84671 = new C84671(this.$height, continuation);
            c84671.L$0 = obj;
            return c84671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
            return ((C84671) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
            return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : null, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : this.$height, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : false, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
        }
    }

    public final void setIndicatorListViewHeight(int height) {
        applyMutation(new C84671(height, null));
    }

    public final void onAlertClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onAlertClick$lambda$24(this.f$0, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAlertClick$lambda$24(AdvancedChartDuxo advancedChartDuxo, AdvancedChartViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getInstrument() != null && dataState.getChartSpans() != null) {
            advancedChartDuxo.submit(new AdvancedChartEvent.LaunchAdvancedAlert(dataState.getInstrument(), dataState.getActiveChartInterval()));
        }
        return Unit.INSTANCE;
    }

    public final void onChartLearnMoreClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartDuxo.onChartLearnMoreClick$lambda$25(this.f$0, (AdvancedChartViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChartLearnMoreClick$lambda$25(AdvancedChartDuxo advancedChartDuxo, AdvancedChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartDuxo.submit(new AdvancedChartEvent.LaunchRemoteDisclosure(it.getDisclosureId()));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advancedchart/AdvancedChartDuxo;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartFragmentKey;", "<init>", "()V", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvancedChartDuxo, AdvancedChartFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvancedChartFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartFragmentKey getArgs(AdvancedChartDuxo advancedChartDuxo) {
            return (AdvancedChartFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, advancedChartDuxo);
        }
    }
}
