package com.robinhood.android.portfolio.benchmarkSearch;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.portfolio.BenchmarkSelection;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.BenchmarkSearchActivityScopedStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BenchmarkSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001$B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0017J\u001c\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "benchmarkSearchActivityScopedStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/BenchmarkSearchActivityScopedStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/BenchmarkSearchActivityScopedStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "queryState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onCreate", "", "onQueryChanged", "query", "saveJob", "Lkotlinx/coroutines/Job;", "onSave", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "benchmarks", "", "Lcom/robinhood/android/models/portfolio/BenchmarkSelection;", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class BenchmarkSearchDuxo extends BaseDuxo<BenchmarkSearchDataState, BenchmarkSearchStateProvider3> implements HasSavedState {
    private final BenchmarkSearchActivityScopedStore benchmarkSearchActivityScopedStore;
    private final StateFlow2<String> queryState;
    private final RegionGateProvider regionGateProvider;
    private Job saveJob;
    private final SavedStateHandle savedStateHandle;
    private final PerformanceChartSettingsV2Store settingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenchmarkSearchDuxo(BenchmarkSearchStateProvider stateProvider, SavedStateHandle savedStateHandle, BenchmarkSearchActivityScopedStore benchmarkSearchActivityScopedStore, PerformanceChartSettingsV2Store settingsStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        super(new BenchmarkSearchDataState(null, null, false, false, false, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(benchmarkSearchActivityScopedStore, "benchmarkSearchActivityScopedStore");
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.benchmarkSearchActivityScopedStore = benchmarkSearchActivityScopedStore;
        this.settingsStore = settingsStore;
        this.regionGateProvider = regionGateProvider;
        this.queryState = StateFlow4.MutableStateFlow("");
    }

    /* compiled from: BenchmarkSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchFragment$Key;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BenchmarkSearchDuxo, BenchmarkSearchFragment.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BenchmarkSearchFragment.Key getArgs(SavedStateHandle savedStateHandle) {
            return (BenchmarkSearchFragment.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BenchmarkSearchFragment.Key getArgs(BenchmarkSearchDuxo benchmarkSearchDuxo) {
            return (BenchmarkSearchFragment.Key) DuxoCompanion.DefaultImpls.getArgs(this, benchmarkSearchDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C255841(null));
    }

    /* compiled from: BenchmarkSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1 */
    static final class C255841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C255841(Continuation<? super C255841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C255841 c255841 = BenchmarkSearchDuxo.this.new C255841(continuation);
            c255841.L$0 = obj;
            return c255841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C255841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BenchmarkSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BenchmarkSearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = benchmarkSearchDuxo;
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
                    PerformanceChartSettingsV2Store performanceChartSettingsV2Store = this.this$0.settingsStore;
                    Companion companion = BenchmarkSearchDuxo.INSTANCE;
                    Flow<PerformanceChartSettingsV2> flowQuerySettings = performanceChartSettingsV2Store.querySettings(((BenchmarkSearchFragment.Key) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((BenchmarkSearchFragment.Key) companion.getArgs((HasSavedState) this.this$0)).getChartType());
                    C504611 c504611 = new C504611(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowQuerySettings, c504611, this) == coroutine_suspended) {
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

            /* compiled from: BenchmarkSearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$1$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504611 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsV2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BenchmarkSearchDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504611(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super C504611> continuation) {
                    super(2, continuation);
                    this.this$0 = benchmarkSearchDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504611 c504611 = new C504611(this.this$0, continuation);
                    c504611.L$0 = obj;
                    return c504611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PerformanceChartSettingsV2 performanceChartSettingsV2, Continuation<? super Unit> continuation) {
                    return ((C504611) create(performanceChartSettingsV2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BenchmarkSearchDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$1$1$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504621 extends ContinuationImpl7 implements Function2<BenchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState>, Object> {
                    final /* synthetic */ PerformanceChartSettingsV2 $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504621(PerformanceChartSettingsV2 performanceChartSettingsV2, Continuation<? super C504621> continuation) {
                        super(2, continuation);
                        this.$it = performanceChartSettingsV2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504621 c504621 = new C504621(this.$it, continuation);
                        c504621.L$0 = obj;
                        return c504621;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BenchmarkSearchDataState benchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState> continuation) {
                        return ((C504621) create(benchmarkSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BenchmarkSearchDataState.copy$default((BenchmarkSearchDataState) this.L$0, this.$it, null, false, false, false, 30, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504621((PerformanceChartSettingsV2) this.L$0, null));
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
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(BenchmarkSearchDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(BenchmarkSearchDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(BenchmarkSearchDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(BenchmarkSearchDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: BenchmarkSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BenchmarkSearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = benchmarkSearchDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
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
                    final StateFlow2 stateFlow2 = this.this$0.queryState;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.debounceDuration(new Flow<String>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C255832<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C255832.this.emit(null, this);
                                }
                            }

                            public C255832(FlowCollector flowCollector) {
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
                                    String str = (String) obj;
                                    if (StringsKt.isBlank(str)) {
                                        str = "";
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow2.collect(new C255832(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return BenchmarkSearchDuxo.C255841.AnonymousClass2.invokeSuspend$lambda$3((String) obj2);
                        }
                    }), new C25582x44d76f31(null, this.this$0));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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
            public static final Duration invokeSuspend$lambda$3(String str) {
                Duration.Companion companion = Duration.INSTANCE;
                DurationUnitJvm durationUnitJvm = DurationUnitJvm.MILLISECONDS;
                Duration durationM28726boximpl = Duration.m28726boximpl(Duration3.toDuration(500, durationUnitJvm));
                durationM28726boximpl.getRawValue();
                if (StringsKt.isBlank(str)) {
                    durationM28726boximpl = null;
                }
                return Duration.m28726boximpl(durationM28726boximpl != null ? durationM28726boximpl.getRawValue() : Duration3.toDuration(0, durationUnitJvm));
            }

            /* compiled from: BenchmarkSearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$4", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<BenchmarkingSearchResults, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BenchmarkSearchDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = benchmarkSearchDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BenchmarkingSearchResults benchmarkingSearchResults, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(benchmarkingSearchResults, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BenchmarkSearchDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$4$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$2$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BenchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState>, Object> {
                    final /* synthetic */ BenchmarkingSearchResults $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BenchmarkingSearchResults benchmarkingSearchResults, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = benchmarkingSearchResults;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BenchmarkSearchDataState benchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState> continuation) {
                        return ((AnonymousClass1) create(benchmarkSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BenchmarkSearchDataState.copy$default((BenchmarkSearchDataState) this.L$0, null, this.$it, false, false, false, 29, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BenchmarkingSearchResults) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: BenchmarkSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$3", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BenchmarkSearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = benchmarkSearchDuxo;
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
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null);
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

            /* compiled from: BenchmarkSearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inRegionGate", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$3$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ BenchmarkSearchDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = benchmarkSearchDuxo;
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

                /* compiled from: BenchmarkSearchDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$3$1$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504631 extends ContinuationImpl7 implements Function2<BenchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState>, Object> {
                    final /* synthetic */ boolean $inRegionGate;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504631(boolean z, Continuation<? super C504631> continuation) {
                        super(2, continuation);
                        this.$inRegionGate = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504631 c504631 = new C504631(this.$inRegionGate, continuation);
                        c504631.L$0 = obj;
                        return c504631;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BenchmarkSearchDataState benchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState> continuation) {
                        return ((C504631) create(benchmarkSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BenchmarkSearchDataState.copy$default((BenchmarkSearchDataState) this.L$0, null, null, false, this.$inRegionGate, false, 23, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504631(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: BenchmarkSearchDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$4", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {95}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BenchmarkSearchDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = benchmarkSearchDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
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
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, CryptoRegionGate.INSTANCE, false, 2, null);
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

            /* compiled from: BenchmarkSearchDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inRegionGate", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$4$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ BenchmarkSearchDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BenchmarkSearchDuxo benchmarkSearchDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = benchmarkSearchDuxo;
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

                /* compiled from: BenchmarkSearchDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$4$1$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onCreate$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504641 extends ContinuationImpl7 implements Function2<BenchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState>, Object> {
                    final /* synthetic */ boolean $inRegionGate;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504641(boolean z, Continuation<? super C504641> continuation) {
                        super(2, continuation);
                        this.$inRegionGate = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C504641 c504641 = new C504641(this.$inRegionGate, continuation);
                        c504641.L$0 = obj;
                        return c504641;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BenchmarkSearchDataState benchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState> continuation) {
                        return ((C504641) create(benchmarkSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BenchmarkSearchDataState.copy$default((BenchmarkSearchDataState) this.L$0, null, null, false, false, this.$inRegionGate, 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C504641(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onQueryChanged(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.queryState.setValue(query);
    }

    /* compiled from: BenchmarkSearchDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onSave$1", m3645f = "BenchmarkSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchDuxo$onSave$1 */
    static final class C255851 extends ContinuationImpl7 implements Function2<BenchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C255851(Continuation<? super C255851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C255851 c255851 = new C255851(continuation);
            c255851.L$0 = obj;
            return c255851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BenchmarkSearchDataState benchmarkSearchDataState, Continuation<? super BenchmarkSearchDataState> continuation) {
            return ((C255851) create(benchmarkSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BenchmarkSearchDataState.copy$default((BenchmarkSearchDataState) this.L$0, null, null, true, false, false, 27, null);
        }
    }

    public final void onSave(PerformanceChartSettingsV2 settings, List<BenchmarkSelection> benchmarks) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(benchmarks, "benchmarks");
        Job job = this.saveJob;
        if (job != null) {
            Job6.cancel$default(job, "New save", null, 2, null);
        }
        applyMutation(new C255851(null));
        this.saveJob = this.settingsStore.updateSettings(settings, benchmarks);
    }
}
