package com.robinhood.android.equitydetail.p123ui.chart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartExperiment;
import com.robinhood.android.chart.blackwidowadvancedchart.BwChartPrefModule4;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.chart.sharedchartspan.SharedSpanService;
import com.robinhood.android.common.data.prefs.ShowExtendedHoursChartPref;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore;
import com.robinhood.android.engagement.l2improvements.experiments.GoldL2DataUpsellImprovements;
import com.robinhood.android.engagement.l2improvements.experiments.GoldL2SdpEntrypointExperiment;
import com.robinhood.android.equitydetail.EquitiesAdtLabelRemovalExperiment;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ChartSettingsBottomSheetComposable2;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore4;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: InstrumentChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0087\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020$J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020*2\u0006\u0010'\u001a\u00020(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewState;", "stockDetailHistoricalChartDataStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "instrumentChartSpansStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;", "goldL2ImprovementsStore", "Lcom/robinhood/android/engagement/l2improvements/GoldL2ImprovementsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "isShowingExtendedHoursPref", "Lcom/robinhood/prefs/BooleanPreference;", "showCandlestickChartPrefState", "bwHasVisitedChartSharedPref", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;Lcom/robinhood/android/engagement/l2improvements/GoldL2ImprovementsStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "chartDisplaySpanFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "bind", "Lkotlinx/coroutines/Job;", "instrumentId", "Ljava/util/UUID;", "onSpanChanged", "", "span", "onLaunchAdvancedChart", "exposeGoldL2ExperimentWhenClickingSdpArrow", "onChartTypeSelected", "chartType", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartType;", "onShowAllHoursToggled", "state", "", "logPriceBookClicked", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentChartDuxo extends BaseDuxo<InstrumentChartViewDataState, InstrumentChartViewState> {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final BooleanPreference bwHasVisitedChartSharedPref;
    private final BwWebViewManager bwWebViewManager;
    private final StateFlow2<String> chartDisplaySpanFlow;
    private final ExperimentsStore experimentsStore;
    private final GoldL2ImprovementsStore goldL2ImprovementsStore;
    private final InstrumentChartSpansStore instrumentChartSpansStore;
    private final InstrumentStore instrumentStore;
    private final BooleanPreference isShowingExtendedHoursPref;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final RegionGateProvider regionGateProvider;
    private final SharedSpanService sharedSpanService;
    private final BooleanPreference showCandlestickChartPrefState;
    private final StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentChartDuxo(StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, InstrumentChartSpansStore instrumentChartSpansStore, GoldL2ImprovementsStore goldL2ImprovementsStore, MarginSubscriptionStore marginSubscriptionStore, @ShowExtendedHoursChartPref BooleanPreference isShowingExtendedHoursPref, @ShowCandlestickChartPref BooleanPreference showCandlestickChartPrefState, @BwChartPrefModule4 BooleanPreference bwHasVisitedChartSharedPref, SharedSpanService sharedSpanService, InstrumentStore instrumentStore, AnalyticsLogger analytics, ExperimentsStore experimentsStore, BwWebViewManager bwWebViewManager, RegionGateProvider regionGateProvider, InstrumentChartDuxo5 stateProvider, DuxoBundle duxoBundle) {
        super(new InstrumentChartViewDataState(null, null, null, null, null, null, null, null, false, false, false, false, false, 8191, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stockDetailHistoricalChartDataStore, "stockDetailHistoricalChartDataStore");
        Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
        Intrinsics.checkNotNullParameter(goldL2ImprovementsStore, "goldL2ImprovementsStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(isShowingExtendedHoursPref, "isShowingExtendedHoursPref");
        Intrinsics.checkNotNullParameter(showCandlestickChartPrefState, "showCandlestickChartPrefState");
        Intrinsics.checkNotNullParameter(bwHasVisitedChartSharedPref, "bwHasVisitedChartSharedPref");
        Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stockDetailHistoricalChartDataStore = stockDetailHistoricalChartDataStore;
        this.instrumentChartSpansStore = instrumentChartSpansStore;
        this.goldL2ImprovementsStore = goldL2ImprovementsStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.isShowingExtendedHoursPref = isShowingExtendedHoursPref;
        this.showCandlestickChartPrefState = showCandlestickChartPrefState;
        this.bwHasVisitedChartSharedPref = bwHasVisitedChartSharedPref;
        this.sharedSpanService = sharedSpanService;
        this.instrumentStore = instrumentStore;
        this.analytics = analytics;
        this.experimentsStore = experimentsStore;
        this.bwWebViewManager = bwWebViewManager;
        this.regionGateProvider = regionGateProvider;
        this.chartDisplaySpanFlow = StateFlow4.MutableStateFlow(InstrumentChartSpansStore4.getDefaultSelectedSpan().getServerValue());
    }

    /* compiled from: InstrumentChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1 */
    static final class C154451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C154451(UUID uuid, Continuation<? super C154451> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C154451 c154451 = InstrumentChartDuxo.this.new C154451(this.$instrumentId, continuation);
            c154451.L$0 = obj;
            return c154451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C154451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                InstrumentChartDuxo.this.instrumentStore.refresh(false, this.$instrumentId);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(InstrumentChartDuxo.this.instrumentStore.getInstrument(this.$instrumentId)), Integer.MAX_VALUE, null, 2, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flowBuffer$default, InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(flowBuffer$default, InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(InstrumentChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(InstrumentChartDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<Instrument> flow, InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$instrumentFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499401 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499401(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super C499401> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499401 c499401 = new C499401(this.this$0, continuation);
                    c499401.L$0 = obj;
                    return c499401;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                    return ((C499401) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$1$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499411 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ Instrument $instrument;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499411(Instrument instrument, Continuation<? super C499411> continuation) {
                        super(2, continuation);
                        this.$instrument = instrument;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499411 c499411 = new C499411(this.$instrument, continuation);
                        c499411.L$0 = obj;
                        return c499411;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499411) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, this.$instrument, null, null, null, null, false, false, false, false, false, 8183, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499411((Instrument) this.L$0, null));
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
                    Flow<Instrument> flow = this.$instrumentFlow;
                    C499401 c499401 = new C499401(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c499401, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2", m3645f = "InstrumentChartDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<Instrument> flow, InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$instrumentFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(this.$instrumentFlow, this.this$0.chartDisplaySpanFlow, Context7.buffer$default(RxConvert.asFlow(this.this$0.isShowingExtendedHoursPref.getChanges()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.this$0.showCandlestickChartPrefState.getChanges()), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)), new C15444x74f2a821(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
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

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore$RequestParams;", "instrument", "Lcom/robinhood/models/db/Instrument;", "displaySpan", "", "showExtendedHours", "", "showCandlesticks"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function5<Instrument, String, Boolean, Boolean, Continuation<? super StockDetailHistoricalChartDataStore.RequestParams>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                /* synthetic */ boolean Z$0;
                /* synthetic */ boolean Z$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(5, continuation);
                }

                public final Object invoke(Instrument instrument, String str, boolean z, boolean z2, Continuation<? super StockDetailHistoricalChartDataStore.RequestParams> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = instrument;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.Z$0 = z;
                    anonymousClass1.Z$1 = z2;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function5
                public /* bridge */ /* synthetic */ Object invoke(Instrument instrument, String str, Boolean bool, Boolean bool2, Continuation<? super StockDetailHistoricalChartDataStore.RequestParams> continuation) {
                    return invoke(instrument, str, bool.booleanValue(), bool2.booleanValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Instrument instrument = (Instrument) this.L$0;
                    return new StockDetailHistoricalChartDataStore.RequestParams(instrument.getId(), (String) this.L$1, boxing.boxBoolean(!this.Z$0), boxing.boxBoolean(this.Z$1), boxing.boxBoolean(Instrument4.isAllDayTradable(instrument)));
                }
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chart", "Lcom/robinhood/models/db/bonfire/instrument/SduiInstrumentChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2$3", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SduiInstrumentChart, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SduiInstrumentChart sduiInstrumentChart, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(sduiInstrumentChart, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2$3$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ SduiInstrumentChart $chart;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SduiInstrumentChart sduiInstrumentChart, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$chart = sduiInstrumentChart;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chart, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((AnonymousClass1) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, this.$chart, null, null, null, null, null, null, null, false, false, false, false, false, 8190, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((SduiInstrumentChart) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$3", m3645f = "InstrumentChartDuxo.kt", m3646l = {115}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.instrumentChartSpansStore.streamSpansFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "spans", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$3$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentChartSpans, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentChartSpans instrumentChartSpans, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(instrumentChartSpans, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$3$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499471 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ InstrumentChartSpans $spans;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499471(InstrumentChartSpans instrumentChartSpans, Continuation<? super C499471> continuation) {
                        super(2, continuation);
                        this.$spans = instrumentChartSpans;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499471 c499471 = new C499471(this.$spans, continuation);
                        c499471.L$0 = obj;
                        return c499471;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499471) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, this.$spans, null, null, null, null, null, null, false, false, false, false, false, 8189, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499471((InstrumentChartSpans) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$4", m3645f = "InstrumentChartDuxo.kt", m3646l = {123}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "span", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$4$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
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

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$4$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499481 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ String $span;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499481(String str, Continuation<? super C499481> continuation) {
                        super(2, continuation);
                        this.$span = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499481 c499481 = new C499481(this.$span, continuation);
                        c499481.L$0 = obj;
                        return c499481;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499481) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, this.$span, null, null, null, null, null, false, false, false, false, false, 8187, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499481((String) this.L$0, null));
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
                    StateFlow2 stateFlow2 = this.this$0.chartDisplaySpanFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow2, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$5", m3645f = "InstrumentChartDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<GoldL2DataUpsellImprovements.Variant> flowStreamGoldL2ImprovementExperiments = this.this$0.goldL2ImprovementsStore.streamGoldL2ImprovementExperiments();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamGoldL2ImprovementExperiments, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "experiment", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2DataUpsellImprovements$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$5$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldL2DataUpsellImprovements.Variant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GoldL2DataUpsellImprovements.Variant variant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$5$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499491 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ GoldL2DataUpsellImprovements.Variant $experiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499491(GoldL2DataUpsellImprovements.Variant variant, Continuation<? super C499491> continuation) {
                        super(2, continuation);
                        this.$experiment = variant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499491 c499491 = new C499491(this.$experiment, continuation);
                        c499491.L$0 = obj;
                        return c499491;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499491) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, null, this.$experiment, null, null, false, false, false, false, false, 8159, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499491((GoldL2DataUpsellImprovements.Variant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$6", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.marginSubscriptionStore.streamCurrentMarginSubscription()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginSubscription", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/subscription/db/MarginSubscription;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$6$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends MarginSubscription>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<MarginSubscription> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends MarginSubscription> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<MarginSubscription>) optional, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499501((MarginSubscription) ((Optional) this.L$0).getOrNull(), null));
                    return Unit.INSTANCE;
                }

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$6$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499501 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ MarginSubscription $subscription;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499501(MarginSubscription marginSubscription, Continuation<? super C499501> continuation) {
                        super(2, continuation);
                        this.$subscription = marginSubscription;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499501 c499501 = new C499501(this.$subscription, continuation);
                        c499501.L$0 = obj;
                        return c499501;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499501) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, this.$subscription, null, null, null, false, false, false, false, false, 8175, null);
                    }
                }
            }
        }

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$7", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<GoldL2SdpEntrypointExperiment.Variant> flowStreamGoldL2SdpEntrypointExperiment = this.this$0.goldL2ImprovementsStore.streamGoldL2SdpEntrypointExperiment(false);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamGoldL2SdpEntrypointExperiment, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "experiment", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$7$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldL2SdpEntrypointExperiment.Variant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GoldL2SdpEntrypointExperiment.Variant variant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$7$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499511 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ GoldL2SdpEntrypointExperiment.Variant $experiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499511(GoldL2SdpEntrypointExperiment.Variant variant, Continuation<? super C499511> continuation) {
                        super(2, continuation);
                        this.$experiment = variant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499511 c499511 = new C499511(this.$experiment, continuation);
                        c499511.L$0 = obj;
                        return c499511;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499511) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, null, null, this.$experiment, null, false, false, false, false, false, 8127, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499511((GoldL2SdpEntrypointExperiment.Variant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$8", m3645f = "InstrumentChartDuxo.kt", m3646l = {156}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$8$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DisplaySpan, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DisplaySpan displaySpan, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(displaySpan, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.onSpanChanged(((DisplaySpan) this.L$0).getServerValue());
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<DisplaySpan> flowStreamCurrentDisplaySpan = this.this$0.sharedSpanService.streamCurrentDisplaySpan();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamCurrentDisplaySpan, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$9", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$9$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
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

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$9$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499521 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499521(boolean z, Continuation<? super C499521> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499521 c499521 = new C499521(this.$it, continuation);
                        c499521.L$0 = obj;
                        return c499521;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499521) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        InstrumentChartViewDataState instrumentChartViewDataState = (InstrumentChartViewDataState) this.L$0;
                        if (this.$it) {
                            chartSettingsBottomSheetComposable2 = ChartSettingsBottomSheetComposable2.CANDLESTICK;
                        } else {
                            chartSettingsBottomSheetComposable2 = ChartSettingsBottomSheetComposable2.LINE;
                        }
                        return InstrumentChartViewDataState.copy$default(instrumentChartViewDataState, null, null, null, null, null, null, null, chartSettingsBottomSheetComposable2, false, false, false, false, false, 8063, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499521(this.Z$0, null));
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.showCandlestickChartPrefState.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$10", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$10$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
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

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$10$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499421 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499421(boolean z, Continuation<? super C499421> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499421 c499421 = new C499421(this.$it, continuation);
                        c499421.L$0 = obj;
                        return c499421;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499421) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, null, null, null, null, this.$it, false, false, false, false, 7935, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499421(this.Z$0, null));
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.isShowingExtendedHoursPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$11", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasVisitedBwChart", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$11$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
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

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$11$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499431 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ boolean $hasVisitedBwChart;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499431(boolean z, Continuation<? super C499431> continuation) {
                        super(2, continuation);
                        this.$hasVisitedBwChart = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499431 c499431 = new C499431(this.$hasVisitedBwChart, continuation);
                        c499431.L$0 = obj;
                        return c499431;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499431) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, null, null, null, null, false, this.$hasVisitedBwChart, false, false, false, 7679, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499431(this.Z$0, null));
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.bwHasVisitedChartSharedPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$12", m3645f = "InstrumentChartDuxo.kt", m3646l = {192}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$12$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$12$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
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

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$12$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$12$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499441 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499441(boolean z, Continuation<? super C499441> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499441 c499441 = new C499441(this.$it, continuation);
                        c499441.L$0 = obj;
                        return c499441;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499441) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, null, null, null, null, false, false, this.$it, false, false, 7167, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499441(this.Z$0, null));
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{BlackWidowAdvancedChartExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
        }

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$13", m3645f = "InstrumentChartDuxo.kt", m3646l = {200}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$13$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$13$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
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

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$13$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$13$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499451 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499451(boolean z, Continuation<? super C499451> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499451 c499451 = new C499451(this.$it, continuation);
                        c499451.L$0 = obj;
                        return c499451;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499451) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, null, null, null, null, false, false, false, this.$it, false, 6143, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499451(this.Z$0, null));
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
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$14", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.this$0 = instrumentChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$14$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$14$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentChartDuxo instrumentChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentChartDuxo;
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

                /* compiled from: InstrumentChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$14$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$bind$1$14$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499461 extends ContinuationImpl7 implements Function2<InstrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499461(boolean z, Continuation<? super C499461> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499461 c499461 = new C499461(this.$it, continuation);
                        c499461.L$0 = obj;
                        return c499461;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentChartViewDataState instrumentChartViewDataState, Continuation<? super InstrumentChartViewDataState> continuation) {
                        return ((C499461) create(instrumentChartViewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentChartViewDataState.copy$default((InstrumentChartViewDataState) this.L$0, null, null, null, null, null, null, null, null, false, false, false, false, this.$it, 4095, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499461(this.Z$0, null));
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquitiesAdtLabelRemovalExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
        }
    }

    public final Job bind(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C154451(instrumentId, null), 3, null);
    }

    public final void onSpanChanged(String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        StateFlow2<String> stateFlow2 = this.chartDisplaySpanFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), span)) {
        }
    }

    public final void onLaunchAdvancedChart() {
        SharedSpanService sharedSpanService = this.sharedSpanService;
        DisplaySpan displaySpanFromServerValue = DisplaySpan.INSTANCE.fromServerValue(this.chartDisplaySpanFlow.getValue());
        if (displaySpanFromServerValue == null) {
            displaySpanFromServerValue = DisplaySpan.UNKNOWN;
        }
        sharedSpanService.sendSharedSpanEvent(displaySpanFromServerValue);
        withDataState(new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartDuxo.onLaunchAdvancedChart$lambda$1(this.f$0, (InstrumentChartViewDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLaunchAdvancedChart$lambda$1(InstrumentChartDuxo instrumentChartDuxo, InstrumentChartViewDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        BuildersKt__Builders_commonKt.launch$default(instrumentChartDuxo.getLifecycleScope(), null, null, new InstrumentChartDuxo2(instrumentChartDuxo, ds, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: InstrumentChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$exposeGoldL2ExperimentWhenClickingSdpArrow$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$exposeGoldL2ExperimentWhenClickingSdpArrow$1 */
    static final class C154461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C154461(Continuation<? super C154461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentChartDuxo.this.new C154461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C154461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTake = FlowKt.take(InstrumentChartDuxo.this.goldL2ImprovementsStore.streamGoldL2SdpEntrypointExperiment(true), 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$exposeGoldL2ExperimentWhenClickingSdpArrow$1$1", m3645f = "InstrumentChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartDuxo$exposeGoldL2ExperimentWhenClickingSdpArrow$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldL2SdpEntrypointExperiment.Variant, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldL2SdpEntrypointExperiment.Variant variant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }
    }

    public final void exposeGoldL2ExperimentWhenClickingSdpArrow() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C154461(null), 3, null);
    }

    public final void onChartTypeSelected(ChartSettingsBottomSheetComposable2 chartType) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        this.showCandlestickChartPrefState.set(chartType == ChartSettingsBottomSheetComposable2.CANDLESTICK);
    }

    public final void onShowAllHoursToggled(boolean state) {
        this.isShowingExtendedHoursPref.set(state);
    }

    public final void logPriceBookClicked(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_STOCK_DETAIL_ACTIONS, AnalyticsStrings.BUTTON_STOCK_DETAIL_ACTIONS_GOLD_ARROW, null, null, instrumentId.toString(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null);
    }
}
