package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.portfolio.contracts.PerformanceChartSettingsContract;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartFeatureStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.BenchmarkIntroShownPrefState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.ChartHoursEnabledPrefState;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PerformanceChartSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001'BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0016\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDataState;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "chartFeatureStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "benchmarkIntroShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "chartHoursEnabledPrefState", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "settingsUpdateJob", "Lkotlinx/coroutines/Job;", "updatedSettingsState", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "onCreate", "", "onResume", "onStyleChanged", "settings", ResourceTypes.STYLE, "Lcom/robinhood/android/models/portfolio/api/PerformanceChartStyle;", "onToggleChartHours", "onToggleBenchmark", "benchmarkId", "", "update", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PerformanceChartSettingsDuxo extends BaseDuxo<PerformanceChartSettingsDataState, PerformanceChartSettingsStateProvider3> implements HasSavedState {
    private final StateFlow2<Boolean> benchmarkIntroShownPrefState;
    private final PerformanceChartFeatureStore chartFeatureStore;
    private final StateFlow2<Boolean> chartHoursEnabledPrefState;
    private final SavedStateHandle savedStateHandle;
    private final PerformanceChartSettingsV2Store settingsStore;
    private Job settingsUpdateJob;
    private final StateFlow2<PerformanceChartSettingsV2> updatedSettingsState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceChartSettingsDuxo(PerformanceChartSettingsStateProvider stateProvider, SavedStateHandle savedStateHandle, PerformanceChartFeatureStore chartFeatureStore, PerformanceChartSettingsV2Store settingsStore, @BenchmarkIntroShownPrefState StateFlow2<Boolean> benchmarkIntroShownPrefState, @ChartHoursEnabledPrefState StateFlow2<Boolean> chartHoursEnabledPrefState, DuxoBundle duxoBundle) {
        super(new PerformanceChartSettingsDataState(null, false, false, false, false, false, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
        Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.chartFeatureStore = chartFeatureStore;
        this.settingsStore = settingsStore;
        this.benchmarkIntroShownPrefState = benchmarkIntroShownPrefState;
        this.chartHoursEnabledPrefState = chartHoursEnabledPrefState;
        this.updatedSettingsState = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: PerformanceChartSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo;", "Lcom/robinhood/android/portfolio/contracts/PerformanceChartSettingsContract$Key;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PerformanceChartSettingsDuxo, PerformanceChartSettingsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PerformanceChartSettingsContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (PerformanceChartSettingsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PerformanceChartSettingsContract.Key getArgs(PerformanceChartSettingsDuxo performanceChartSettingsDuxo) {
            return (PerformanceChartSettingsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, performanceChartSettingsDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.RESUMED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C256571(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C256582(null));
        if (((PerformanceChartSettingsContract.Key) INSTANCE.getArgs((HasSavedState) this)).getAllowReturnsComparisons()) {
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C256593(null));
        }
    }

    /* compiled from: PerformanceChartSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$1 */
    static final class C256571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C256571(Continuation<? super C256571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PerformanceChartSettingsDuxo.this.new C256571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C256571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PerformanceChartSettingsDuxo.this.updatedSettingsState);
                PerformanceChartSettingsV2Store performanceChartSettingsV2Store = PerformanceChartSettingsDuxo.this.settingsStore;
                Companion companion = PerformanceChartSettingsDuxo.INSTANCE;
                Flow flowMerge = FlowKt.merge(flowFilterNotNull, performanceChartSettingsV2Store.querySettings(((PerformanceChartSettingsContract.Key) companion.getArgs((HasSavedState) PerformanceChartSettingsDuxo.this)).getAccountNumber(), ((PerformanceChartSettingsContract.Key) companion.getArgs((HasSavedState) PerformanceChartSettingsDuxo.this)).getChartType()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PerformanceChartSettingsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowMerge, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PerformanceChartSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$1$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsV2, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PerformanceChartSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PerformanceChartSettingsDuxo performanceChartSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = performanceChartSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PerformanceChartSettingsV2 performanceChartSettingsV2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(performanceChartSettingsV2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PerformanceChartSettingsV2 performanceChartSettingsV2 = (PerformanceChartSettingsV2) this.L$0;
                if (((PerformanceChartSettingsContract.Key) PerformanceChartSettingsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAllowReturnsComparisons() && !performanceChartSettingsV2.getBenchmarks().isEmpty()) {
                    this.this$0.benchmarkIntroShownPrefState.setValue(boxing.boxBoolean(true));
                }
                this.this$0.applyMutation(new C504651(performanceChartSettingsV2, null));
                return Unit.INSTANCE;
            }

            /* compiled from: PerformanceChartSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$1$1$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504651 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState>, Object> {
                final /* synthetic */ PerformanceChartSettingsV2 $settings;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504651(PerformanceChartSettingsV2 performanceChartSettingsV2, Continuation<? super C504651> continuation) {
                    super(2, continuation);
                    this.$settings = performanceChartSettingsV2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504651 c504651 = new C504651(this.$settings, continuation);
                    c504651.L$0 = obj;
                    return c504651;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PerformanceChartSettingsDataState performanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState> continuation) {
                    return ((C504651) create(performanceChartSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PerformanceChartSettingsDataState.copy$default((PerformanceChartSettingsDataState) this.L$0, this.$settings, false, false, false, false, false, 62, null);
                }
            }
        }
    }

    /* compiled from: PerformanceChartSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$2", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$2 */
    static final class C256582 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C256582(Continuation<? super C256582> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PerformanceChartSettingsDuxo.this.new C256582(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C256582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PerformanceChartSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartHoursEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$2$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PerformanceChartSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PerformanceChartSettingsDuxo performanceChartSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = performanceChartSettingsDuxo;
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

            /* compiled from: PerformanceChartSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$2$1$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504661 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState>, Object> {
                final /* synthetic */ boolean $chartHoursEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504661(boolean z, Continuation<? super C504661> continuation) {
                    super(2, continuation);
                    this.$chartHoursEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504661 c504661 = new C504661(this.$chartHoursEnabled, continuation);
                    c504661.L$0 = obj;
                    return c504661;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PerformanceChartSettingsDataState performanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState> continuation) {
                    return ((C504661) create(performanceChartSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PerformanceChartSettingsDataState.copy$default((PerformanceChartSettingsDataState) this.L$0, null, false, false, this.$chartHoursEnabled, false, false, 55, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504661(this.Z$0, null));
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
                StateFlow2 stateFlow2 = PerformanceChartSettingsDuxo.this.chartHoursEnabledPrefState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PerformanceChartSettingsDuxo.this, null);
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

    /* compiled from: PerformanceChartSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$3", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$3 */
    static final class C256593 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C256593(Continuation<? super C256593> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PerformanceChartSettingsDuxo.this.new C256593(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C256593) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PerformanceChartSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "returnsIntroShown", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$3$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PerformanceChartSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PerformanceChartSettingsDuxo performanceChartSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = performanceChartSettingsDuxo;
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

            /* compiled from: PerformanceChartSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$3$1$1", m3645f = "PerformanceChartSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504671 extends ContinuationImpl7 implements Function2<PerformanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState>, Object> {
                final /* synthetic */ boolean $returnsIntroShown;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504671(boolean z, Continuation<? super C504671> continuation) {
                    super(2, continuation);
                    this.$returnsIntroShown = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504671 c504671 = new C504671(this.$returnsIntroShown, continuation);
                    c504671.L$0 = obj;
                    return c504671;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PerformanceChartSettingsDataState performanceChartSettingsDataState, Continuation<? super PerformanceChartSettingsDataState> continuation) {
                    return ((C504671) create(performanceChartSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PerformanceChartSettingsDataState.copy$default((PerformanceChartSettingsDataState) this.L$0, null, false, false, false, false, !this.$returnsIntroShown, 31, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504671(this.Z$0, null));
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
                StateFlow2 stateFlow2 = PerformanceChartSettingsDuxo.this.benchmarkIntroShownPrefState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PerformanceChartSettingsDuxo.this, null);
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        PerformanceChartFeatureStore performanceChartFeatureStore = this.chartFeatureStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, performanceChartFeatureStore.isChartViewEnabled(((PerformanceChartSettingsContract.Key) companion.getArgs((HasSavedState) this)).getChartType()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartSettingsDuxo.onResume$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.chartFeatureStore.isAdtToggleEnabled(((PerformanceChartSettingsContract.Key) companion.getArgs((HasSavedState) this)).getChartType()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartSettingsDuxo.onResume$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        if (((PerformanceChartSettingsContract.Key) companion.getArgs((HasSavedState) this)).getAllowReturnsComparisons()) {
            LifecycleHost.DefaultImpls.bind$default(this, this.chartFeatureStore.isBenchmarksEnabled(((PerformanceChartSettingsContract.Key) companion.getArgs((HasSavedState) this)).getChartType()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PerformanceChartSettingsDuxo.onResume$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(PerformanceChartSettingsDuxo performanceChartSettingsDuxo, boolean z) {
        performanceChartSettingsDuxo.applyMutation(new PerformanceChartSettingsDuxo2(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(PerformanceChartSettingsDuxo performanceChartSettingsDuxo, boolean z) {
        performanceChartSettingsDuxo.applyMutation(new PerformanceChartSettingsDuxo3(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(PerformanceChartSettingsDuxo performanceChartSettingsDuxo, boolean z) {
        performanceChartSettingsDuxo.applyMutation(new PerformanceChartSettingsDuxo4(z, null));
        return Unit.INSTANCE;
    }

    public final void onStyleChanged(PerformanceChartSettingsV2 settings, PerformanceChartStyle style) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(style, "style");
        update(PerformanceChartSettingsV2.copy$default(settings, null, null, null, style, 7, null));
    }

    public final void onToggleChartHours() {
        StateFlow2<Boolean> stateFlow2 = this.chartHoursEnabledPrefState;
        do {
        } while (!stateFlow2.compareAndSet(stateFlow2.getValue(), Boolean.valueOf(!r1.booleanValue())));
    }

    public final void onToggleBenchmark(PerformanceChartSettingsV2 settings, String benchmarkId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(benchmarkId, "benchmarkId");
        List<PerformanceChartBenchmarkV2> benchmarks = settings.getBenchmarks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(benchmarks, 10));
        for (PerformanceChartBenchmarkV2 performanceChartBenchmarkV2Copy$default : benchmarks) {
            if (Intrinsics.areEqual(performanceChartBenchmarkV2Copy$default.getId(), benchmarkId)) {
                performanceChartBenchmarkV2Copy$default = PerformanceChartBenchmarkV2.copy$default(performanceChartBenchmarkV2Copy$default, null, null, null, null, !performanceChartBenchmarkV2Copy$default.isSelected(), null, 47, null);
            }
            arrayList.add(performanceChartBenchmarkV2Copy$default);
        }
        update(PerformanceChartSettingsV2.copy$default(settings, null, null, arrayList, null, 11, null));
    }

    private final void update(PerformanceChartSettingsV2 settings) {
        Job job = this.settingsUpdateJob;
        if (job != null) {
            Job6.cancel$default(job, "New update", null, 2, null);
        }
        this.updatedSettingsState.setValue(settings);
        this.settingsUpdateJob = PerformanceChartSettingsV2Store.updateSettings$default(this.settingsStore, settings, null, 2, null);
    }
}
