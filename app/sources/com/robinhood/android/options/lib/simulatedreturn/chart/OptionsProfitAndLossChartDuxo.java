package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartEvent;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggings;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGenerator;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParams;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossMetrics;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnMarketDataParamsRequestV3;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnMarketDataParamsRequestV4;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore;
import com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnOptionParams;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV4Request;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p320db.simulatedreturns.OptionSimulatedReturnsConfigurationResponse;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.datetime.Instant;
import p479j$.time.LocalDate;

/* compiled from: OptionsProfitAndLossChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J?\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020\u0016J\u0010\u0010)\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020#J\u000e\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartViewState;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartEvent;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "stateProvider", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "bind", "accountNumber", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "sliderPosition", "", "profitLossLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "chartBundle", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "isFullyExpanded", "", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Ljava/lang/Double;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Z)V", "onScrubPointUpdated", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "onScrubStopped", "resetScrubState", "isManualReset", "onBottomSheetStateChanged", "isHiddenOrNull", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsProfitAndLossChartDuxo extends BaseDuxo3<OptionsProfitAndLossChartDataState, OptionsProfitAndLossChartViewState, OptionsSimulatedReturnChartEvent> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionSimulatedReturnsStore optionSimulatedReturnsStore;
    private final OptionUnderlyingQuoteStore optionUnderlyingQuoteStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsProfitAndLossChartDuxo(EventLogger eventLogger, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsProfitAndLossChartStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new OptionsProfitAndLossChartDataState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32767, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventLogger = eventLogger;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSimulatedReturnsStore = optionSimulatedReturnsStore;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C231811(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231822(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231833(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231844(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231855(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231866(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231877(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C231888(null));
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1 */
    static final class C231811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231811(Continuation<? super C231811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                final Flow<OptionsProfitAndLossChartViewState> flow = new Flow<OptionsProfitAndLossChartViewState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$filterNot$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$filterNot$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
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
                                if (!((OptionsProfitAndLossChartViewState) obj).getScrubState().getScrubbing()) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsProfitAndLossChartViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends ProfitAndLossChartParams, ? extends OptionsProfitAndLossChartPostProcessParams>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState = (OptionsProfitAndLossChartViewState) obj;
                                Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(optionsProfitAndLossChartViewState.getPnlChartParams(), optionsProfitAndLossChartViewState.getPnlPostProcessParams()));
                                if (nullable != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(nullable, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends ProfitAndLossChartParams, ? extends OptionsProfitAndLossChartPostProcessParams>> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                Duration.Companion companion = Duration.INSTANCE;
                final Flow flowM28820sampleHG0u8IE = FlowKt.m28820sampleHG0u8IE(flowDistinctUntilChanged, Duration3.toDuration(5, DurationUnitJvm.MILLISECONDS));
                Flow<OptionsProfitAndLossChartData> flow2 = new Flow<OptionsProfitAndLossChartData>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Tuples2 tuples2 = (Tuples2) obj;
                                ProfitAndLossChartParams profitAndLossChartParams = (ProfitAndLossChartParams) tuples2.component1();
                                OptionsProfitAndLossChartData optionsProfitAndLossChartDataMapToChartData = OptionsProfitAndLossChartUtils.mapToChartData(ProfitAndLossChartGenerator.generateProfitAndLossChart(profitAndLossChartParams.getLegs(), profitAndLossChartParams.getUnderlying(), profitAndLossChartParams.getQuantity(), profitAndLossChartParams.getOptionOrderPrice(), profitAndLossChartParams.getEquityPositionQuantity(), profitAndLossChartParams.getEquityPositionAverageCost(), profitAndLossChartParams.getUnderlyingPrice(), profitAndLossChartParams.getExpirationType(), profitAndLossChartParams.getEvaluationTime()), profitAndLossChartParams, (OptionsProfitAndLossChartPostProcessParams) tuples2.component2(), profitAndLossChartParams.getUnderlyingPrice().getDecimalValue(), profitAndLossChartParams.getOptionOrderPrice().getDecimalValue());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionsProfitAndLossChartDataMapToChartData, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsProfitAndLossChartData> flowCollector, Continuation continuation) {
                        Object objCollect = flowM28820sampleHG0u8IE.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(OptionsProfitAndLossChartDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartData", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$4", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartData, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsProfitAndLossChartData optionsProfitAndLossChartData, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(optionsProfitAndLossChartData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$4$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
                final /* synthetic */ OptionsProfitAndLossChartData $chartData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsProfitAndLossChartData optionsProfitAndLossChartData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chartData = optionsProfitAndLossChartData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartData, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                    return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                    return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : this.$chartData, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((OptionsProfitAndLossChartData) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2 */
    static final class C231822 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231822(Continuation<? super C231822> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231822(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                final Flow<OptionsProfitAndLossChartViewState> flow = new Flow<OptionsProfitAndLossChartViewState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$filterNot$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$filterNot$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
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
                                if (!((OptionsProfitAndLossChartViewState) obj).getScrubState().getScrubbing()) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsProfitAndLossChartViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ProfitAndLossChartParams>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                ProfitAndLossChartParams pnlChartParams = ((OptionsProfitAndLossChartViewState) obj).getPnlChartParams();
                                if (pnlChartParams != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(pnlChartParams, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ProfitAndLossChartParams> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                Duration.Companion companion = Duration.INSTANCE;
                final Flow flowM28820sampleHG0u8IE = FlowKt.m28820sampleHG0u8IE(flowDistinctUntilChanged, Duration3.toDuration(5, DurationUnitJvm.MILLISECONDS));
                Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new Flow<ProfitAndLossMetrics>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                ProfitAndLossChartParams profitAndLossChartParams = (ProfitAndLossChartParams) obj;
                                ProfitAndLossMetrics profitAndLossMetricsGenerateProfitAndLossMetrics = ProfitAndLossChartGenerator.generateProfitAndLossMetrics(profitAndLossChartParams.getLegs(), profitAndLossChartParams.getUnderlying(), profitAndLossChartParams.getQuantity(), profitAndLossChartParams.getOptionOrderPrice(), profitAndLossChartParams.getEquityPositionQuantity(), profitAndLossChartParams.getEquityPositionAverageCost(), profitAndLossChartParams.getUnderlyingPrice(), profitAndLossChartParams.getExpirationType());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(profitAndLossMetricsGenerateProfitAndLossMetrics, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ProfitAndLossMetrics> flowCollector, Continuation continuation) {
                        Object objCollect = flowM28820sampleHG0u8IE.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(OptionsProfitAndLossChartDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged2, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "metrics", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$4", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<ProfitAndLossMetrics, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProfitAndLossMetrics profitAndLossMetrics, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(profitAndLossMetrics, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$4$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
                final /* synthetic */ ProfitAndLossMetrics $metrics;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ProfitAndLossMetrics profitAndLossMetrics, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$metrics = profitAndLossMetrics;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$metrics, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                    return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                    return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : this.$metrics, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ProfitAndLossMetrics) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3 */
    static final class C231833 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231833(Continuation<? super C231833> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231833(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231833) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<OptionSimulatedChartBundle5>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionSimulatedChartBundle5> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionSimulatedChartBundle chartBundle = ((OptionsProfitAndLossChartViewState) obj).getChartBundle();
                                OptionSimulatedChartBundle5 underlying = chartBundle != null ? chartBundle.getUnderlying() : null;
                                if (underlying != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(underlying, anonymousClass1) == coroutine_suspended) {
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
                }, new C23159x2dfcf3be(null, OptionsProfitAndLossChartDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsProfitAndLossChartDuxo.this, null);
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

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$3", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<UnderlyingQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UnderlyingQuote underlyingQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(underlyingQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$3$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
                final /* synthetic */ UnderlyingQuote $underlyingQuote;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UnderlyingQuote underlyingQuote, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$underlyingQuote = underlyingQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$underlyingQuote, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                    return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                    return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : this.$underlyingQuote, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((UnderlyingQuote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4 */
    static final class C231844 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231844(Continuation<? super C231844> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231844(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231844) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                final Flow<OptionsProfitAndLossChartViewState> flow = new Flow<OptionsProfitAndLossChartViewState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsProfitAndLossChartViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((OptionsProfitAndLossChartViewState) obj).getScrubState() == OptionsSimulatedChartScrubState.IDLE) {
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Float>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Float> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Float underlyingX = ((OptionsProfitAndLossChartViewState) obj).getChartData().getUnderlyingX();
                                if (underlyingX != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(underlyingX, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsProfitAndLossChartDuxo.this, null);
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

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "underlyingX", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$3", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Float, Continuation<? super Unit>, Object> {
            /* synthetic */ float F$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.F$0 = ((Number) obj).floatValue();
                return anonymousClass3;
            }

            public final Object invoke(float f, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Unit> continuation) {
                return invoke(f.floatValue(), continuation);
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$3$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
                final /* synthetic */ float $underlyingX;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(float f, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$underlyingX = f;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$underlyingX, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                    return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                    OptionsSimulatedChartScrubState scrubState = optionsProfitAndLossChartDataState.getScrubState();
                    OptionsSimulatedChartScrubState optionsSimulatedChartScrubState = OptionsSimulatedChartScrubState.IDLE;
                    if (scrubState == optionsSimulatedChartScrubState) {
                        return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : optionsSimulatedChartScrubState, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : new Point(this.$underlyingX, 0.0f), (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                    }
                    return optionsProfitAndLossChartDataState;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.F$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$5", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {156}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$5 */
    static final class C231855 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231855(Continuation<? super C231855> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231855(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231855) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$5$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                List<UUID> optionInstrumentIds = ((OptionsProfitAndLossChartViewState) obj).getOptionInstrumentIds();
                                if (optionInstrumentIds != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionInstrumentIds, anonymousClass1) == coroutine_suspended) {
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
                }), new C23163xdc38d57c(null, OptionsProfitAndLossChartDuxo.this));
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

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6 */
    static final class C231866 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231866(Continuation<? super C231866> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231866(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231866) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                List<UUID> optionInstrumentIds = ((OptionsProfitAndLossChartViewState) obj).getOptionInstrumentIds();
                                if (optionInstrumentIds != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionInstrumentIds, anonymousClass1) == coroutine_suspended) {
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
                }), new C23165x3356c65b(null, OptionsProfitAndLossChartDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsProfitAndLossChartDuxo.this, null);
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

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$3", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends OptionInstrumentQuote>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends OptionInstrumentQuote> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<UUID, OptionInstrumentQuote>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<UUID, OptionInstrumentQuote> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$3$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$6$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
                final /* synthetic */ Map<UUID, OptionInstrumentQuote> $optionQuotes;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<UUID, OptionInstrumentQuote> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$optionQuotes = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionQuotes, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                    return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                    return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : this.$optionQuotes, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {201}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7 */
    static final class C231877 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231877(Continuation<? super C231877> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231877(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231877) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(FlowKt.transformLatest(FlowKt.distinctUntilChangedBy(new Flow<Either<? extends OptionSimulatedReturnMarketDataParamsRequestV3, ? extends OptionSimulatedReturnMarketDataParamsRequestV4>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Either<? extends OptionSimulatedReturnMarketDataParamsRequestV3, ? extends OptionSimulatedReturnMarketDataParamsRequestV4>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Either<OptionSimulatedReturnMarketDataParamsRequestV3, OptionSimulatedReturnMarketDataParamsRequestV4> simulatedReturnMarketDataParamsRequest = ((OptionsProfitAndLossChartViewState) obj).getSimulatedReturnMarketDataParamsRequest();
                                if (simulatedReturnMarketDataParamsRequest != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(simulatedReturnMarketDataParamsRequest, anonymousClass1) == coroutine_suspended) {
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
                }, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionsProfitAndLossChartDuxo.C231877.invokeSuspend$lambda$2((Either) obj2);
                    }
                }), new C23170x8a74b73a(null, OptionsProfitAndLossChartDuxo.this)), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionsProfitAndLossChartDuxo.C231877.invokeSuspend$lambda$7((Either) obj2);
                    }
                });
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(OptionsProfitAndLossChartDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass5, this) == coroutine_suspended) {
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
        public static final Object invokeSuspend$lambda$2(Either either) {
            if (either instanceof Either.Left) {
                return ((OptionSimulatedReturnMarketDataParamsRequestV3) ((Either.Left) either).getValue()).getStrategyCode();
            }
            if (!(either instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            List<OptionInstrument> optionInstruments = ((OptionSimulatedReturnMarketDataParamsRequestV4) ((Either.Right) either).getValue()).getOptionInstruments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionInstruments, 10));
            Iterator<T> it = optionInstruments.iterator();
            while (it.hasNext()) {
                arrayList.add(((OptionInstrument) it.next()).getId());
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$lambda$7(Either either) {
            if (either instanceof Either.Left) {
                return ((ApiOptionSimulatedReturnsConfigurationV3Request) ((Either.Left) either).getValue()).getStrategyCode();
            }
            if (!(either instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            List<ApiOptionSimulatedReturnOptionParams> optionParamsList = ((ApiOptionSimulatedReturnsConfigurationV4Request) ((Either.Right) either).getValue()).getOptionParamsList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionParamsList, 10));
            Iterator<T> it = optionParamsList.iterator();
            while (it.hasNext()) {
                arrayList.add(((ApiOptionSimulatedReturnOptionParams) it.next()).getOptionId());
            }
            return arrayList;
        }

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketDataParams", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV4Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, 211, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Either<? extends ApiOptionSimulatedReturnsConfigurationV3Request, ? extends ApiOptionSimulatedReturnsConfigurationV4Request>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Either<ApiOptionSimulatedReturnsConfigurationV3Request, ApiOptionSimulatedReturnsConfigurationV4Request> either, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(either, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Either<? extends ApiOptionSimulatedReturnsConfigurationV3Request, ? extends ApiOptionSimulatedReturnsConfigurationV4Request> either, Continuation<? super Unit> continuation) {
                return invoke2((Either<ApiOptionSimulatedReturnsConfigurationV3Request, ApiOptionSimulatedReturnsConfigurationV4Request>) either, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r1, r0, r17) == r6) goto L35;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objForceFetch$default;
                Object objForceFetch$default2;
                OptionSimulatedReturnsConfigurationResponse optionSimulatedReturnsConfigurationResponse;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                } catch (Throwable th) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    if (Throwables.isNetworkRelated(th)) {
                        final Flow flowTake = FlowKt.take(this.this$0.getStateFlow(), 1);
                        Flow<OptionsProfitAndLossChartViewState> flow = new Flow<OptionsProfitAndLossChartViewState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$invokeSuspend$$inlined$filter$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsProfitAndLossChartViewState> flowCollector, Continuation continuation) {
                                Object objCollect = flowTake.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                        if (((OptionsProfitAndLossChartViewState) obj).getErrorState() == null) {
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
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                        this.label = 3;
                    } else {
                        this.this$0.submit(new OptionsSimulatedReturnChartEvent.GenericErrorEvent(th));
                    }
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Either either = (Either) this.L$0;
                    if (either instanceof Either.Left) {
                        Endpoint<ApiOptionSimulatedReturnsConfigurationV3Request, OptionSimulatedReturnsConfigurationResponse> getOptionSimulatedReturnConfigurationV3Endpoint = this.this$0.optionSimulatedReturnsStore.getGetOptionSimulatedReturnConfigurationV3Endpoint();
                        Object value = ((Either.Left) either).getValue();
                        this.label = 1;
                        objForceFetch$default2 = Endpoint.DefaultImpls.forceFetch$default(getOptionSimulatedReturnConfigurationV3Endpoint, value, null, this, 2, null);
                        if (objForceFetch$default2 == coroutine_suspended) {
                        }
                        optionSimulatedReturnsConfigurationResponse = (OptionSimulatedReturnsConfigurationResponse) objForceFetch$default2;
                    } else if (either instanceof Either.Right) {
                        Endpoint<ApiOptionSimulatedReturnsConfigurationV4Request, OptionSimulatedReturnsConfigurationResponse> getOptionSimulatedReturnConfigurationV4Endpoint = this.this$0.optionSimulatedReturnsStore.getGetOptionSimulatedReturnConfigurationV4Endpoint();
                        Object value2 = ((Either.Right) either).getValue();
                        this.label = 2;
                        objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(getOptionSimulatedReturnConfigurationV4Endpoint, value2, null, this, 2, null);
                        if (objForceFetch$default == coroutine_suspended) {
                        }
                        optionSimulatedReturnsConfigurationResponse = (OptionSimulatedReturnsConfigurationResponse) objForceFetch$default;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objForceFetch$default2 = obj;
                    optionSimulatedReturnsConfigurationResponse = (OptionSimulatedReturnsConfigurationResponse) objForceFetch$default2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    objForceFetch$default = obj;
                    optionSimulatedReturnsConfigurationResponse = (OptionSimulatedReturnsConfigurationResponse) objForceFetch$default;
                }
                this.this$0.applyMutation(new AnonymousClass1(optionSimulatedReturnsConfigurationResponse, null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
                final /* synthetic */ OptionSimulatedReturnsConfigurationResponse $config;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: OptionsProfitAndLossChartDuxo.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[OptionsSimulatedReturnErrorState.values().length];
                        try {
                            iArr[OptionsSimulatedReturnErrorState.NETWORK_ERROR.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[OptionsSimulatedReturnErrorState.INVALID_IV.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionSimulatedReturnsConfigurationResponse optionSimulatedReturnsConfigurationResponse, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$config = optionSimulatedReturnsConfigurationResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$config, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                    return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    OptionsSimulatedReturnErrorState errorState;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                    OptionsSimulatedReturnErrorState errorState2 = optionsProfitAndLossChartDataState.getErrorState();
                    int i = errorState2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[errorState2.ordinal()];
                    if (i == -1 || i == 1 || i == 2) {
                        List<OptionPricingParams> paramResponses = this.$config.getParamResponses();
                        if ((paramResponses instanceof Collection) && paramResponses.isEmpty()) {
                            errorState = null;
                        } else {
                            Iterator<T> it = paramResponses.iterator();
                            while (it.hasNext()) {
                                if (!((OptionPricingParams) it.next()).isValidIv()) {
                                    errorState = OptionsSimulatedReturnErrorState.INVALID_IV;
                                    break;
                                }
                            }
                            errorState = null;
                        }
                    } else {
                        errorState = optionsProfitAndLossChartDataState.getErrorState();
                    }
                    OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState = errorState;
                    List<OptionPricingParams> paramResponses2 = this.$config.getParamResponses();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(paramResponses2, 10)), 16));
                    for (Object obj2 : paramResponses2) {
                        linkedHashMap.put(((OptionPricingParams) obj2).getOptionId(), obj2);
                    }
                    return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : optionsSimulatedReturnErrorState, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : linkedHashMap, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                }
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$3", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartViewState, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsProfitAndLossChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(optionsProfitAndLossChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsProfitAndLossChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$3$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$7$5$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
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
                    public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                        return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                        return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : OptionsSimulatedReturnErrorState.NETWORK_ERROR, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1(null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8 */
    static final class C231888 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231888(Continuation<? super C231888> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231888(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231888) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends Tuples2<? extends OptionChain, ? extends Map<UUID, ? extends LocalDate>>>>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends Tuples2<? extends OptionChain, ? extends Map<UUID, ? extends LocalDate>>>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionSimulatedChartBundle chartBundle = ((OptionsProfitAndLossChartViewState) obj).getChartBundle();
                                List<Tuples2<OptionChain, Map<UUID, LocalDate>>> chainToLegExpirationDatesList = chartBundle != null ? chartBundle.getChainToLegExpirationDatesList() : null;
                                if (chainToLegExpirationDatesList != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(chainToLegExpirationDatesList, anonymousClass1) == coroutine_suspended) {
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
                }), new C23174xe192a819(null, OptionsProfitAndLossChartDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsProfitAndLossChartDuxo.this, null);
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

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "expirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$3", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends Instant>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends Instant> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<UUID, Instant>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<UUID, Instant> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionsProfitAndLossChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$3$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onCreate$8$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
                final /* synthetic */ Map<UUID, Instant> $expirationTimes;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<UUID, Instant> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$expirationTimes = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$expirationTimes, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
                    return ((AnonymousClass1) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
                    return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : this.$expirationTimes, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$bind$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$bind$1 */
    static final class C231791 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ OptionSimulatedChartBundle $chartBundle;
        final /* synthetic */ boolean $isFullyExpanded;
        final /* synthetic */ OptionsSimulatedReturnLoggingState $loggingState;
        final /* synthetic */ OptionsProfitAndLossChartDataState4 $profitLossLaunchMode;
        final /* synthetic */ Double $sliderPosition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C231791(String str, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, Double d, OptionSimulatedChartBundle optionSimulatedChartBundle, boolean z, Continuation<? super C231791> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$loggingState = optionsSimulatedReturnLoggingState;
            this.$profitLossLaunchMode = optionsProfitAndLossChartDataState4;
            this.$sliderPosition = d;
            this.$chartBundle = optionSimulatedChartBundle;
            this.$isFullyExpanded = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C231791 c231791 = new C231791(this.$accountNumber, this.$loggingState, this.$profitLossLaunchMode, this.$sliderPosition, this.$chartBundle, this.$isFullyExpanded, continuation);
            c231791.L$0 = obj;
            return c231791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
            return ((C231791) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
            return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : this.$accountNumber, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : this.$loggingState, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : this.$profitLossLaunchMode, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : this.$sliderPosition, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : null, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : this.$chartBundle, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : this.$isFullyExpanded);
        }
    }

    public final void bind(String accountNumber, OptionsSimulatedReturnLoggingState loggingState, Double sliderPosition, OptionsProfitAndLossChartDataState4 profitLossLaunchMode, OptionSimulatedChartBundle chartBundle, boolean isFullyExpanded) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(profitLossLaunchMode, "profitLossLaunchMode");
        Intrinsics.checkNotNullParameter(chartBundle, "chartBundle");
        applyMutation(new C231791(accountNumber, loggingState, profitLossLaunchMode, sliderPosition, chartBundle, isFullyExpanded, null));
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubPointUpdated$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubPointUpdated$1 */
    static final class C231891 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
        final /* synthetic */ Point $scrubPoint;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C231891(Point point, OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super C231891> continuation) {
            super(2, continuation);
            this.$scrubPoint = point;
            this.this$0 = optionsProfitAndLossChartDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C231891 c231891 = new C231891(this.$scrubPoint, this.this$0, continuation);
            c231891.L$0 = obj;
            return c231891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
            return ((C231891) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
            OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataStateCopy = optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : OptionsSimulatedChartScrubState.SCRUB_IN_PROGRESS, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : this.$scrubPoint, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
            boolean z = false;
            boolean z2 = optionsProfitAndLossChartDataStateCopy.getShouldSnap() && optionsProfitAndLossChartDataState.getSnappedScrubPoint().getX() != optionsProfitAndLossChartDataStateCopy.getSnappedScrubPoint().getX();
            if (!optionsProfitAndLossChartDataState.getScrubState().getScrubbing() && optionsProfitAndLossChartDataStateCopy.getScrubState().getScrubbing()) {
                z = true;
            }
            if (!z2 && !z) {
                return optionsProfitAndLossChartDataStateCopy;
            }
            this.this$0.submit(OptionsSimulatedReturnChartEvent.ScrubberHapticFeedback.INSTANCE);
            return optionsProfitAndLossChartDataStateCopy;
        }
    }

    public final void onScrubPointUpdated(Point scrubPoint) {
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        applyMutation(new C231891(scrubPoint, this, null));
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$1 */
    static final class C231901 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C231901(Continuation<? super C231901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C231901 c231901 = new C231901(continuation);
            c231901.L$0 = obj;
            return c231901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
            return ((C231901) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
            return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : OptionsSimulatedChartScrubState.SCRUB_PAUSED, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : null, (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
        }
    }

    public final void onScrubStopped() {
        applyMutation(new C231901(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C231912(null), 3, null);
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2 */
    static final class C231912 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C231912(Continuation<? super C231912> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsProfitAndLossChartDuxo.this.new C231912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C231912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsProfitAndLossChartViewState> stateFlow = OptionsProfitAndLossChartDuxo.this.getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionsSimulatedReturnLoggingState>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionsSimulatedReturnLoggingState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionsSimulatedReturnLoggingState loggingState = ((OptionsProfitAndLossChartViewState) obj).getLoggingState();
                                if (loggingState != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
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
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsProfitAndLossChartDuxo.this, null);
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

        /* compiled from: OptionsProfitAndLossChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2$2", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onScrubStopped$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnLoggingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsProfitAndLossChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optionsSimulatedReturnLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnChartDrag(this.this$0.eventLogger, (OptionsSimulatedReturnLoggingState) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ void resetScrubState$default(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        optionsProfitAndLossChartDuxo.resetScrubState(z);
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$resetScrubState$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$resetScrubState$1 */
    static final class C231921 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
        final /* synthetic */ boolean $isManualReset;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OptionsProfitAndLossChartDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C231921(boolean z, OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, Continuation<? super C231921> continuation) {
            super(2, continuation);
            this.$isManualReset = z;
            this.this$0 = optionsProfitAndLossChartDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C231921 c231921 = new C231921(this.$isManualReset, this.this$0, continuation);
            c231921.L$0 = obj;
            return c231921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
            return ((C231921) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OptionsSimulatedReturnLoggingState loggingState;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
            if (this.$isManualReset && (loggingState = optionsProfitAndLossChartDataState.getLoggingState()) != null) {
                OptionsSimulatedReturnLoggings.logOptionsSimulatedReturnResetChartMetrics(this.this$0.eventLogger, loggingState);
            }
            OptionsSimulatedChartScrubState optionsSimulatedChartScrubState = OptionsSimulatedChartScrubState.IDLE;
            Float underlyingX = optionsProfitAndLossChartDataState.getChartData().getUnderlyingX();
            return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : optionsSimulatedChartScrubState, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : new Point(underlyingX != null ? underlyingX.floatValue() : 0.0f, 0.0f), (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
        }
    }

    public final void resetScrubState(boolean isManualReset) {
        applyMutation(new C231921(isManualReset, this, null));
    }

    /* compiled from: OptionsProfitAndLossChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onBottomSheetStateChanged$1", m3645f = "OptionsProfitAndLossChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo$onBottomSheetStateChanged$1 */
    static final class C231801 extends ContinuationImpl7 implements Function2<OptionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C231801(Continuation<? super C231801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C231801 c231801 = new C231801(continuation);
            c231801.L$0 = obj;
            return c231801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState, Continuation<? super OptionsProfitAndLossChartDataState> continuation) {
            return ((C231801) create(optionsProfitAndLossChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) this.L$0;
            OptionsSimulatedChartScrubState optionsSimulatedChartScrubState = OptionsSimulatedChartScrubState.IDLE;
            Float underlyingX = optionsProfitAndLossChartDataState.getChartData().getUnderlyingX();
            return optionsProfitAndLossChartDataState.copy((15254 & 1) != 0 ? optionsProfitAndLossChartDataState.accountNumber : null, (15254 & 2) != 0 ? optionsProfitAndLossChartDataState.errorState : null, (15254 & 4) != 0 ? optionsProfitAndLossChartDataState.expirationTimes : null, (15254 & 8) != 0 ? optionsProfitAndLossChartDataState.loggingState : null, (15254 & 16) != 0 ? optionsProfitAndLossChartDataState.optionQuotes : null, (15254 & 32) != 0 ? optionsProfitAndLossChartDataState.profitLossLaunchMode : null, (15254 & 64) != 0 ? optionsProfitAndLossChartDataState.sliderPosition : null, (15254 & 128) != 0 ? optionsProfitAndLossChartDataState.scrubState : optionsSimulatedChartScrubState, (15254 & 256) != 0 ? optionsProfitAndLossChartDataState.scrubPoint : new Point(underlyingX != null ? underlyingX.floatValue() : 0.0f, 0.0f), (15254 & 512) != 0 ? optionsProfitAndLossChartDataState.simulatedReturnsConfigs : null, (15254 & 1024) != 0 ? optionsProfitAndLossChartDataState.chartBundle : null, (15254 & 2048) != 0 ? optionsProfitAndLossChartDataState.chartData : null, (15254 & 4096) != 0 ? optionsProfitAndLossChartDataState.underlyingQuote : null, (15254 & 8192) != 0 ? optionsProfitAndLossChartDataState.pnlMetrics : null, (15254 & 16384) != 0 ? optionsProfitAndLossChartDataState.isFullyExpanded : false);
        }
    }

    public final void onBottomSheetStateChanged(boolean isHiddenOrNull) {
        if (isHiddenOrNull) {
            applyMutation(new C231801(null));
        }
    }
}
