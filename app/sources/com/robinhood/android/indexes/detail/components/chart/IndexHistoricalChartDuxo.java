package com.robinhood.android.indexes.detail.components.chart;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.indexes.detail.IndexDetailPageFragment;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexHistoricalChartStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.IndexDetailPageCurbHoursTooltipPref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.prefs.BooleanPreference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: IndexHistoricalChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\"BU\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "indexHistoricalChartStore", "Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "indexDetailPageCurbHoursTooltipPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartStateProvider;", "<init>", "(Lcom/robinhood/android/indexes/store/IndexHistoricalChartStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onSpanSelected", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onCandlestickToggled", "showCandlestickChart", "", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexHistoricalChartDuxo extends BaseDuxo<IndexHistoricalChartDataState, IndexHistoricalChartViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference indexDetailPageCurbHoursTooltipPref;
    private final IndexHistoricalChartStore indexHistoricalChartStore;
    private final IndexStore indexStore;
    private final OptionChainStore optionChainStore;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference showCandlestickChartPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexHistoricalChartDuxo(IndexHistoricalChartStore indexHistoricalChartStore, IndexStore indexStore, OptionChainStore optionChainStore, ExperimentsStore experimentsStore, @ShowCandlestickChartPref BooleanPreference showCandlestickChartPref, @IndexDetailPageCurbHoursTooltipPref BooleanPreference indexDetailPageCurbHoursTooltipPref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexHistoricalChartStateProvider stateProvider) {
        super(new IndexHistoricalChartDataState(null, null, null, ((IndexDetailPageFragment.Args) INSTANCE.getArgs(savedStateHandle)).getSource(), false, false, null, 119, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(indexHistoricalChartStore, "indexHistoricalChartStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        Intrinsics.checkNotNullParameter(indexDetailPageCurbHoursTooltipPref, "indexDetailPageCurbHoursTooltipPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.indexHistoricalChartStore = indexHistoricalChartStore;
        this.indexStore = indexStore;
        this.optionChainStore = optionChainStore;
        this.experimentsStore = experimentsStore;
        this.showCandlestickChartPref = showCandlestickChartPref;
        this.indexDetailPageCurbHoursTooltipPref = indexDetailPageCurbHoursTooltipPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Flow<Index> flowStreamIndex = this.indexStore.streamIndex(((IndexDetailPageFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getIndexId());
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C188201(flowStreamIndex, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188212(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188223(flowStreamIndex, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188234(null));
        applyMutation(new C188245(null));
    }

    /* compiled from: IndexHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$1 */
    static final class C188201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Index> $indexStream;
        int label;
        final /* synthetic */ IndexHistoricalChartDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188201(Flow<Index> flow, IndexHistoricalChartDuxo indexHistoricalChartDuxo, Continuation<? super C188201> continuation) {
            super(2, continuation);
            this.$indexStream = flow;
            this.this$0 = indexHistoricalChartDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188201(this.$indexStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IndexHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$1$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Index, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexHistoricalChartDuxo indexHistoricalChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Index index, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(index, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$1$1$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501911 extends ContinuationImpl7 implements Function2<IndexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState>, Object> {
                final /* synthetic */ Index $index;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501911(Index index, Continuation<? super C501911> continuation) {
                    super(2, continuation);
                    this.$index = index;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501911 c501911 = new C501911(this.$index, continuation);
                    c501911.L$0 = obj;
                    return c501911;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexHistoricalChartDataState indexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState> continuation) {
                    return ((C501911) create(indexHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexHistoricalChartDataState.copy$default((IndexHistoricalChartDataState) this.L$0, this.$index, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501911((Index) this.L$0, null));
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
                Flow<Index> flow = this.$indexStream;
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
    }

    /* compiled from: IndexHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2 */
    static final class C188212 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188212(Continuation<? super C188212> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexHistoricalChartDuxo.this.new C188212(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<IndexHistoricalChartViewState> stateFlow = IndexHistoricalChartDuxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(Operators.combine(new Flow<DisplaySpan>() { // from class: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2 */
                    public static final class C188182<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C188182.this.emit(null, this);
                            }
                        }

                        public C188182(FlowCollector flowCollector) {
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
                                DisplaySpan activeDisplaySpan = ((IndexHistoricalChartViewState) obj).getActiveDisplaySpan();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(activeDisplaySpan, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super DisplaySpan> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C188182(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, Context7.buffer$default(RxConvert.asFlow(IndexHistoricalChartDuxo.this.showCandlestickChartPref.getChanges()), Integer.MAX_VALUE, null, 2, null))), new C18817x5732521b(null, IndexHistoricalChartDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(IndexHistoricalChartDuxo.this, null);
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

        /* compiled from: IndexHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "historicalChart", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$3", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<IndexHistoricalChartModel, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(IndexHistoricalChartDuxo indexHistoricalChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = indexHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IndexHistoricalChartModel indexHistoricalChartModel, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(indexHistoricalChartModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$3$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState>, Object> {
                final /* synthetic */ IndexHistoricalChartModel $historicalChart;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IndexHistoricalChartModel indexHistoricalChartModel, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$historicalChart = indexHistoricalChartModel;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$historicalChart, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexHistoricalChartDataState indexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState> continuation) {
                    return ((AnonymousClass1) create(indexHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexHistoricalChartDataState.copy$default((IndexHistoricalChartDataState) this.L$0, null, null, this.$historicalChart, null, false, false, null, 123, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((IndexHistoricalChartModel) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$3", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$3 */
    static final class C188223 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Index> $indexStream;
        int label;
        final /* synthetic */ IndexHistoricalChartDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188223(Flow<Index> flow, IndexHistoricalChartDuxo indexHistoricalChartDuxo, Continuation<? super C188223> continuation) {
            super(2, continuation);
            this.$indexStream = flow;
            this.this$0 = indexHistoricalChartDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188223(this.$indexStream, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188223) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$indexStream, new C18819xae5042fa(null, this.this$0));
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

        /* compiled from: IndexHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chains", "", "Lcom/robinhood/models/ui/UiOptionChain;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$3$2", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends UiOptionChain>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IndexHistoricalChartDuxo indexHistoricalChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = indexHistoricalChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiOptionChain> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiOptionChain>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiOptionChain> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$3$2$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState>, Object> {
                final /* synthetic */ List<UiOptionChain> $chains;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<UiOptionChain> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chains = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chains, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexHistoricalChartDataState indexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState> continuation) {
                    return ((AnonymousClass1) create(indexHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    IndexHistoricalChartDataState indexHistoricalChartDataState = (IndexHistoricalChartDataState) this.L$0;
                    List<UiOptionChain> list = this.$chains;
                    boolean z = false;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((UiOptionChain) it.next()).getOptionChain().getExtendedHoursState().getHasExtendedHours()) {
                                z = true;
                                break;
                            }
                        }
                    }
                    return IndexHistoricalChartDataState.copy$default(indexHistoricalChartDataState, null, null, null, null, z, false, null, 111, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$4", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$4 */
    static final class C188234 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188234(Continuation<? super C188234> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexHistoricalChartDuxo.this.new C188234(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188234) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(IndexHistoricalChartDuxo.this.experimentsStore, new Experiment[]{Experiments.IndexOptionsExtendedHoursCurb.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexHistoricalChartDuxo.this, null);
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

        /* compiled from: IndexHistoricalChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inCurbHoursExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$4$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ IndexHistoricalChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexHistoricalChartDuxo indexHistoricalChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexHistoricalChartDuxo;
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

            /* compiled from: IndexHistoricalChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$4$1$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501921 extends ContinuationImpl7 implements Function2<IndexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState>, Object> {
                final /* synthetic */ boolean $inCurbHoursExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501921(boolean z, Continuation<? super C501921> continuation) {
                    super(2, continuation);
                    this.$inCurbHoursExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501921 c501921 = new C501921(this.$inCurbHoursExperiment, continuation);
                    c501921.L$0 = obj;
                    return c501921;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexHistoricalChartDataState indexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState> continuation) {
                    return ((C501921) create(indexHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexHistoricalChartDataState.copy$default((IndexHistoricalChartDataState) this.L$0, null, null, null, null, false, this.$inCurbHoursExperiment, null, 95, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501921(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$5", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onCreate$5 */
    static final class C188245 extends ContinuationImpl7 implements Function2<IndexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C188245(Continuation<? super C188245> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C188245 c188245 = IndexHistoricalChartDuxo.this.new C188245(continuation);
            c188245.L$0 = obj;
            return c188245;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndexHistoricalChartDataState indexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState> continuation) {
            return ((C188245) create(indexHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndexHistoricalChartDataState.copy$default((IndexHistoricalChartDataState) this.L$0, null, null, null, null, false, false, IndexHistoricalChartDuxo.this.indexDetailPageCurbHoursTooltipPref, 63, null);
        }
    }

    /* compiled from: IndexHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onSpanSelected$1", m3645f = "IndexHistoricalChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartDuxo$onSpanSelected$1 */
    static final class C188251 extends ContinuationImpl7 implements Function2<IndexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState>, Object> {
        final /* synthetic */ DisplaySpan $displaySpan;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188251(DisplaySpan displaySpan, Continuation<? super C188251> continuation) {
            super(2, continuation);
            this.$displaySpan = displaySpan;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C188251 c188251 = new C188251(this.$displaySpan, continuation);
            c188251.L$0 = obj;
            return c188251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndexHistoricalChartDataState indexHistoricalChartDataState, Continuation<? super IndexHistoricalChartDataState> continuation) {
            return ((C188251) create(indexHistoricalChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IndexHistoricalChartDataState.copy$default((IndexHistoricalChartDataState) this.L$0, null, this.$displaySpan, null, null, false, false, null, 125, null);
        }
    }

    public final void onSpanSelected(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        applyMutation(new C188251(displaySpan, null));
    }

    public final void onCandlestickToggled(boolean showCandlestickChart) {
        this.showCandlestickChartPref.set(showCandlestickChart);
    }

    /* compiled from: IndexHistoricalChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDuxo;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Args;", "<init>", "()V", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndexHistoricalChartDuxo, IndexDetailPageFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageFragment.Args getArgs(IndexHistoricalChartDuxo indexHistoricalChartDuxo) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, indexHistoricalChartDuxo);
        }
    }
}
