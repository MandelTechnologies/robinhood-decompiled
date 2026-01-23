package com.robinhood.android.futures.detail.p140ui.chart;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.charts.FuturesChartArg;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo2;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.futures.ChartType;
import com.robinhood.store.futures.FuturesSettingsStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.store.futures.p404di.FuturesVisitedMacPref;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.Monitoring;

/* compiled from: FuturesDetailChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "Lcom/robinhood/android/futures/detail/ui/chart/ChartEvent;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresSettingsStore", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "visitedMacPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/store/futures/FuturesSettingsStore;Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onResume", "setSelectedContractId", "contractId", "Ljava/util/UUID;", "viewMode", "Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "onChartTypeSelected", "type", "Lcom/robinhood/store/futures/ChartType;", "onContinuousChartSelected", "isContinuousChart", "", "onSpanSelected", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onChartSettingsClicked", "onChartSettingsDismissed", "onAdvancedChartOpened", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesDetailChartDuxo extends BaseDuxo3<FuturesDetailChartDataState, FuturesDetailChartViewState, FuturesDetailChartDuxo2> implements FuturesDetailChartCallbacks {
    public static final int $stable = 8;
    private final ExperimentsStore experimentsStore;
    private final FuturesChartsServiceManager futuresChartsServiceManager;
    private final FuturesContractStore futuresContractStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final FuturesSettingsStore futuresSettingsStore;
    private final BooleanPreference visitedMacPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesDetailChartDuxo(FuturesContractStore futuresContractStore, FuturesQuoteStore futuresQuoteStore, FuturesSettingsStore futuresSettingsStore, FuturesChartsServiceManager futuresChartsServiceManager, ExperimentsStore experimentsStore, @FuturesVisitedMacPref BooleanPreference visitedMacPref, DuxoBundle duxoBundle) {
        super(new FuturesDetailChartDataState(null, null, null, null, null, false, false, null, null, null, false, false, 4095, null), FuturesDetailChartDuxo3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(visitedMacPref, "visitedMacPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresContractStore = futuresContractStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresSettingsStore = futuresSettingsStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.experimentsStore = experimentsStore;
        this.visitedMacPref = visitedMacPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C170911(null));
    }

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1 */
    static final class C170911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C170911(Continuation<? super C170911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170911 c170911 = FuturesDetailChartDuxo.this.new C170911(continuation);
            c170911.L$0 = obj;
            return c170911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C170911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final StateFlow<FuturesDetailChartViewState> stateFlow = FuturesDetailChartDuxo.this.getStateFlow();
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            UUID contractId = ((FuturesDetailChartViewState) obj).getContractId();
                            if (contractId != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(contractId, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }), FuturesDetailChartDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, FuturesDetailChartDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, FuturesDetailChartDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(FuturesDetailChartDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(FuturesDetailChartDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(FuturesDetailChartDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(FuturesDetailChartDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: FuturesDetailChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $contractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UUID> sharedFlow, FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$contractIdFlow = sharedFlow;
                this.this$0 = futuresDetailChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$contractIdFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$contractIdFlow, new C17083xa54dc66a(null, this.this$0));
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

            /* compiled from: FuturesDetailChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$1$2", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FuturesQuote, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesQuote futuresQuote, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(futuresQuote, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$1$2$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C500981 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
                    final /* synthetic */ FuturesQuote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500981(FuturesQuote futuresQuote, Continuation<? super C500981> continuation) {
                        super(2, continuation);
                        this.$quote = futuresQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500981 c500981 = new C500981(this.$quote, continuation);
                        c500981.L$0 = obj;
                        return c500981;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
                        return ((C500981) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, this.$quote, false, false, null, null, null, false, false, 4079, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500981((FuturesQuote) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$2", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $contractIdFlow;
            int label;
            final /* synthetic */ FuturesDetailChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UUID> sharedFlow, FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$contractIdFlow = sharedFlow;
                this.this$0 = futuresDetailChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$contractIdFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$contractIdFlow, new C17084xfc6bb749(null, this.this$0.futuresContractStore));
                    C500992 c500992 = new C500992(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c500992, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$2$2", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C500992 extends ContinuationImpl7 implements Function2<UiFuturesContract, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500992(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super C500992> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500992 c500992 = new C500992(this.this$0, continuation);
                    c500992.L$0 = obj;
                    return c500992;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiFuturesContract uiFuturesContract, Continuation<? super Unit> continuation) {
                    return ((C500992) create(uiFuturesContract, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$2$2$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
                    final /* synthetic */ UiFuturesContract $contract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(UiFuturesContract uiFuturesContract, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$contract = uiFuturesContract;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contract, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, this.$contract.getContract(), this.$contract.getProduct(), null, false, false, null, null, null, false, false, 4083, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((UiFuturesContract) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailChartDuxo;
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
                    final StateFlow<FuturesDetailChartViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<FuturesChartArg>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super FuturesChartArg> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {58}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            /* JADX WARN: Type inference failed for: r4v0, types: [com.robinhood.android.futures.charts.FuturesChartArg] */
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
                                    FuturesDetailChartViewState futuresDetailChartViewState = (FuturesDetailChartViewState) obj;
                                    UUID contractId = futuresDetailChartViewState.getContractId();
                                    T futuresChartArg = contractId == null ? null : new FuturesChartArg(contractId, futuresDetailChartViewState.getCurrentDisplaySpan(), futuresDetailChartViewState.getCurrentChartType(), futuresDetailChartViewState.isContinuousChart(), false);
                                    if (futuresChartArg != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(futuresChartArg, anonymousClass1) == coroutine_suspended) {
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
                    }), new C17085x5389a828(null, this.this$0));
                    C501003 c501003 = new C501003(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c501003, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/futures/charts/FuturesChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$3", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C501003 extends ContinuationImpl7 implements Function2<FuturesChartResult, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501003(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super C501003> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501003 c501003 = new C501003(this.this$0, continuation);
                    c501003.L$0 = obj;
                    return c501003;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesChartResult futuresChartResult, Continuation<? super Unit> continuation) {
                    return ((C501003) create(futuresChartResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesDetailChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$3$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
                    final /* synthetic */ FuturesChartResult $result;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesChartResult futuresChartResult, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$result = futuresChartResult;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
                        return ((AnonymousClass1) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, null, false, false, this.$result, null, null, false, false, 3967, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesChartResult) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$4", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesDetailChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Monitoring> flowMonitorState = this.this$0.futuresChartsServiceManager.monitorState((CoroutineScope) this.L$0);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowMonitorState, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: FuturesDetailChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "microgramState", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$4$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesDetailChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailChartDuxo;
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

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Monitoring monitoring = (Monitoring) this.L$0;
                    if (monitoring instanceof Monitoring.Terminated.AppUpdateRequired) {
                        this.this$0.submit(new FuturesDetailChartDuxo2.Toast("Chart failed to load, please update your app."));
                    } else if (monitoring instanceof Monitoring.Terminated.Failure) {
                        this.this$0.submit(new FuturesDetailChartDuxo2.Error(((Monitoring.Terminated.Failure) monitoring).getException()));
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: FuturesDetailChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$5", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {155}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailChartDuxo;
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{FuturesAdvancedChartExperiment.INSTANCE}, false, null, 6, null);
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

            /* compiled from: FuturesDetailChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$5$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ FuturesDetailChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailChartDuxo;
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

                /* compiled from: FuturesDetailChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$5$1$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501011 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
                    final /* synthetic */ boolean $isInExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501011(boolean z, Continuation<? super C501011> continuation) {
                        super(2, continuation);
                        this.$isInExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501011 c501011 = new C501011(this.$isInExperiment, continuation);
                        c501011.L$0 = obj;
                        return c501011;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
                        return ((C501011) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, null, this.$isInExperiment, false, null, null, null, false, false, 4063, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501011(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FuturesDetailChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$6", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {165}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesDetailChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = futuresDetailChartDuxo;
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.visitedMacPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
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

            /* compiled from: FuturesDetailChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$6$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ FuturesDetailChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FuturesDetailChartDuxo futuresDetailChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresDetailChartDuxo;
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

                /* compiled from: FuturesDetailChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$6$1$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501021 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501021(boolean z, Continuation<? super C501021> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501021 c501021 = new C501021(this.$it, continuation);
                        c501021.L$0 = obj;
                        return c501021;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
                        return ((C501021) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, null, false, this.$it, null, null, null, false, false, 4031, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501021(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observable<ChartType> observableDistinctUntilChanged = this.futuresSettingsStore.streamChartType().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesDetailChartDuxo.onResume$lambda$0(this.f$0, (ChartType) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.futuresSettingsStore.streamContinuousChartSetting(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesDetailChartDuxo.onResume$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(FuturesDetailChartDuxo futuresDetailChartDuxo, ChartType chartType) {
        futuresDetailChartDuxo.applyMutation(new FuturesDetailChartDuxo7(chartType, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(FuturesDetailChartDuxo futuresDetailChartDuxo, boolean z) {
        futuresDetailChartDuxo.applyMutation(new FuturesDetailChartDuxo8(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$setSelectedContractId$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$setSelectedContractId$1 */
    static final class C170931 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
        final /* synthetic */ UUID $contractId;
        final /* synthetic */ FuturesDetailChartDuxo4 $viewMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170931(UUID uuid, FuturesDetailChartDuxo4 futuresDetailChartDuxo4, Continuation<? super C170931> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
            this.$viewMode = futuresDetailChartDuxo4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170931 c170931 = new C170931(this.$contractId, this.$viewMode, continuation);
            c170931.L$0 = obj;
            return c170931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
            return ((C170931) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, this.$contractId, this.$viewMode, null, null, null, false, false, null, null, null, false, false, 4092, null);
        }
    }

    public final void setSelectedContractId(UUID contractId, FuturesDetailChartDuxo4 viewMode) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        applyMutation(new C170931(contractId, viewMode, null));
    }

    @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
    public void onChartTypeSelected(ChartType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.futuresSettingsStore.setChartType(type2);
    }

    @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
    public void onContinuousChartSelected(boolean isContinuousChart) {
        this.futuresSettingsStore.setIsContinuousChart(isContinuousChart);
    }

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onSpanSelected$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onSpanSelected$1 */
    static final class C170921 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
        final /* synthetic */ DisplaySpan $span;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170921(DisplaySpan displaySpan, Continuation<? super C170921> continuation) {
            super(2, continuation);
            this.$span = displaySpan;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170921 c170921 = new C170921(this.$span, continuation);
            c170921.L$0 = obj;
            return c170921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
            return ((C170921) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, null, false, false, null, null, this.$span, false, false, 3583, null);
        }
    }

    @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
    public void onSpanSelected(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        applyMutation(new C170921(span, null));
    }

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onChartSettingsClicked$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onChartSettingsClicked$1 */
    static final class C170891 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C170891(Continuation<? super C170891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170891 c170891 = new C170891(continuation);
            c170891.L$0 = obj;
            return c170891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
            return ((C170891) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, null, false, false, null, null, null, false, true, 2047, null);
        }
    }

    @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
    public void onChartSettingsClicked() {
        applyMutation(new C170891(null));
    }

    /* compiled from: FuturesDetailChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onChartSettingsDismissed$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onChartSettingsDismissed$1 */
    static final class C170901 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C170901(Continuation<? super C170901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C170901 c170901 = new C170901(continuation);
            c170901.L$0 = obj;
            return c170901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
            return ((C170901) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, null, false, false, null, null, null, false, false, 2047, null);
        }
    }

    @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
    public void onChartSettingsDismissed() {
        applyMutation(new C170901(null));
    }

    @Override // com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartCallbacks
    public void onAdvancedChartOpened() {
        this.visitedMacPref.set(true);
    }
}
