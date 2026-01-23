package com.robinhood.android.advancedchart.config;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.chart.AdvancedChartExperiments;
import com.robinhood.android.advancedchart.AdvancedChartLoggings3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartAddIndicatorFragmentKey;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.p386db.SupportedIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartAddIndicatorDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001eB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDataState;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "onIndicatorTypeSelected", "type", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "resetSelectedIndicator", "logOnErrorShown", "errorMessage", "", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvancedChartAddIndicatorDuxo extends BaseDuxo<AdvancedChartAddIndicatorDataState, AdvancedChartAddIndicatorViewState> implements HasSavedState {
    private final AdvancedChartStore advancedChartStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedChartAddIndicatorDuxo(AdvancedChartStore advancedChartStore, ExperimentsStore experimentsStore, EventLogger eventLogger, AdvancedChartAddIndicatorViewState3 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AdvancedChartAddIndicatorDataState(null, null, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.advancedChartStore = advancedChartStore;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observable<List<SupportedIndicator>> observableDistinctUntilChanged = this.advancedChartStore.streamSupportedIndicators().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartAddIndicatorDuxo.onResume$lambda$0(this.f$0, (List) obj);
            }
        });
        Observable<TechnicalIndicatorConfigList> observableDistinctUntilChanged2 = this.advancedChartStore.streamTechnicalIndicatorConfigList().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartAddIndicatorDuxo.onResume$lambda$1(this.f$0, (TechnicalIndicatorConfigList) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, AdvancedChartExperiments.ChartsIndicatorImprovementP4.INSTANCE, AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant.CONTROL, false, 4, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartAddIndicatorDuxo.onResume$lambda$2(this.f$0, (AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(AdvancedChartAddIndicatorDuxo advancedChartAddIndicatorDuxo, List list) {
        advancedChartAddIndicatorDuxo.applyMutation(new AdvancedChartAddIndicatorDuxo2(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(AdvancedChartAddIndicatorDuxo advancedChartAddIndicatorDuxo, TechnicalIndicatorConfigList technicalIndicatorConfigList) {
        advancedChartAddIndicatorDuxo.applyMutation(new AdvancedChartAddIndicatorDuxo3(technicalIndicatorConfigList, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(AdvancedChartAddIndicatorDuxo advancedChartAddIndicatorDuxo, AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant variant) {
        advancedChartAddIndicatorDuxo.applyMutation(new AdvancedChartAddIndicatorDuxo4(variant, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartAddIndicatorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$onIndicatorTypeSelected$1", m3645f = "AdvancedChartAddIndicatorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$onIndicatorTypeSelected$1 */
    static final class C85031 extends ContinuationImpl7 implements Function2<AdvancedChartAddIndicatorDataState, Continuation<? super AdvancedChartAddIndicatorDataState>, Object> {
        final /* synthetic */ ApiTechnicalIndicator.Type $type;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C85031(ApiTechnicalIndicator.Type type2, Continuation<? super C85031> continuation) {
            super(2, continuation);
            this.$type = type2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C85031 c85031 = new C85031(this.$type, continuation);
            c85031.L$0 = obj;
            return c85031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartAddIndicatorDataState advancedChartAddIndicatorDataState, Continuation<? super AdvancedChartAddIndicatorDataState> continuation) {
            return ((C85031) create(advancedChartAddIndicatorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvancedChartAddIndicatorDataState.copy$default((AdvancedChartAddIndicatorDataState) this.L$0, null, null, this.$type, null, 11, null);
        }
    }

    public final void onIndicatorTypeSelected(ApiTechnicalIndicator.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        applyMutation(new C85031(type2, null));
    }

    /* compiled from: AdvancedChartAddIndicatorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$resetSelectedIndicator$1", m3645f = "AdvancedChartAddIndicatorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$resetSelectedIndicator$1 */
    static final class C85041 extends ContinuationImpl7 implements Function2<AdvancedChartAddIndicatorDataState, Continuation<? super AdvancedChartAddIndicatorDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C85041(Continuation<? super C85041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C85041 c85041 = new C85041(continuation);
            c85041.L$0 = obj;
            return c85041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedChartAddIndicatorDataState advancedChartAddIndicatorDataState, Continuation<? super AdvancedChartAddIndicatorDataState> continuation) {
            return ((C85041) create(advancedChartAddIndicatorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvancedChartAddIndicatorDataState.copy$default((AdvancedChartAddIndicatorDataState) this.L$0, null, null, null, null, 11, null);
        }
    }

    public final void resetSelectedIndicator() {
        applyMutation(new C85041(null));
    }

    public final void logOnErrorShown(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        AdvancedChartLoggings3.logIndicatorUpdateError(this.eventLogger, ((AdvancedChartAddIndicatorFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId(), errorMessage);
    }

    /* compiled from: AdvancedChartAddIndicatorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDuxo;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartAddIndicatorFragmentKey;", "<init>", "()V", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvancedChartAddIndicatorDuxo, AdvancedChartAddIndicatorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartAddIndicatorFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvancedChartAddIndicatorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartAddIndicatorFragmentKey getArgs(AdvancedChartAddIndicatorDuxo advancedChartAddIndicatorDuxo) {
            return (AdvancedChartAddIndicatorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, advancedChartAddIndicatorDuxo);
        }
    }
}
