package com.robinhood.android.optionschain.chainsettings;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.optionchain.chainsettings.OptionChainEntryPointType;
import com.robinhood.android.optionchain.chainsettings.logging.OptionChainCustomizationLogging;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.models.api.OptionSeenContext;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionChainCustomizationDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001*BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"J\u0017\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\"H\u0001¢\u0006\u0002\b&J\u0006\u0010'\u001a\u00020\u0019J\f\u0010(\u001a\u00020$*\u00020$H\u0002J\u0006\u0010)\u001a\u00020\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationViewState;", "Lcom/robinhood/android/optionschain/chainsettings/SelectedMetricChangedEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "updateHighlightedMetric", "highlightedMetric", "Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;", "updateHighlightedCategory", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "updateSelectedMetric", "metric", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "getUpdatedMetrics", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "targetMetric", "getUpdatedMetrics$feature_options_chain_externalDebug", "logTapEducation", "swapSelectedMetrics", "logShowSnackbar", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionChainCustomizationDuxo extends BaseDuxo3<OptionChainCustomizationDataState, OptionChainCustomizationViewState, SelectedMetricChangedEvent> implements HasSavedState {
    private final EventLogger eventLogger;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore;
    private final OptionChainCustomizationStore optionChainCustomizationStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainCustomizationDataState2.values().length];
            try {
                iArr[OptionChainCustomizationDataState2.METRIC_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainCustomizationDataState2.METRIC_TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainCustomizationDuxo(OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, EventLogger eventLogger, OptionChainCustomizationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionChainCustomizationDataState((OptionChainCustomizationLaunchMode) INSTANCE.getArgs(savedStateHandle), null, null, null, null, null, 62, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionChainCustomizationDiscoveryStore = optionChainCustomizationDiscoveryStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Observable<OptionChainAvailableMetrics> observableAsObservable;
        Observable<OptionChainSelectedMetrics> observableAsObservable2;
        OptionChainCustomizationLaunchMode optionChainCustomizationLaunchMode = (OptionChainCustomizationLaunchMode) INSTANCE.getArgs((HasSavedState) this);
        if (optionChainCustomizationLaunchMode instanceof OptionChainCustomizationLaunchMode.MainChain) {
            OptionChainCustomizationLaunchMode.MainChain mainChain = (OptionChainCustomizationLaunchMode.MainChain) optionChainCustomizationLaunchMode;
            observableAsObservable = this.optionChainCustomizationStore.getStreamChainAvailableMetrics().asObservable(mainChain.getOrderSide().getServerValue());
            observableAsObservable2 = this.optionChainCustomizationStore.getStreamChainSelectedMetricsById().asObservable(mainChain.getOrderSide().getServerValue());
            applyMutation(new C242301(optionChainCustomizationLaunchMode, null));
        } else {
            if (!(optionChainCustomizationLaunchMode instanceof OptionChainCustomizationLaunchMode.StrategyBuilder)) {
                throw new NoWhenBranchMatchedException();
            }
            OptionChainCustomizationLaunchMode.StrategyBuilder strategyBuilder = (OptionChainCustomizationLaunchMode.StrategyBuilder) optionChainCustomizationLaunchMode;
            observableAsObservable = this.optionChainCustomizationStore.getStreamStrategyBuilderAvailableMetrics().asObservable(strategyBuilder.getStrategyType().getServerValue());
            observableAsObservable2 = this.optionChainCustomizationStore.getStreamStrategyBuilderSelectedMetricsById().asObservable(strategyBuilder.getStrategyType().getServerValue());
        }
        Observable<OptionChainAvailableMetrics> observableDistinctUntilChanged = observableAsObservable.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationDuxo.onCreate$lambda$0(this.f$0, (OptionChainAvailableMetrics) obj);
            }
        });
        Observable<OptionChainSelectedMetrics> observableTake = observableAsObservable2.take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainCustomizationDuxo.onCreate$lambda$1(this.f$0, (OptionChainSelectedMetrics) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C242314(null), 3, null);
    }

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$1", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$1 */
    static final class C242301 extends ContinuationImpl7 implements Function2<OptionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState>, Object> {
        final /* synthetic */ OptionChainCustomizationLaunchMode $launchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: OptionChainCustomizationDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionChainCustomizationLaunchMode2.values().length];
                try {
                    iArr[OptionChainCustomizationLaunchMode2.METRIC_ONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionChainCustomizationLaunchMode2.METRIC_TWO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C242301(OptionChainCustomizationLaunchMode optionChainCustomizationLaunchMode, Continuation<? super C242301> continuation) {
            super(2, continuation);
            this.$launchMode = optionChainCustomizationLaunchMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242301 c242301 = new C242301(this.$launchMode, continuation);
            c242301.L$0 = obj;
            return c242301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainCustomizationDataState optionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState> continuation) {
            return ((C242301) create(optionChainCustomizationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OptionChainCustomizationDataState2 optionChainCustomizationDataState2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionChainCustomizationDataState optionChainCustomizationDataState = (OptionChainCustomizationDataState) this.L$0;
            int i = WhenMappings.$EnumSwitchMapping$0[((OptionChainCustomizationLaunchMode.MainChain) this.$launchMode).getInitialHighlightedMetric().ordinal()];
            if (i == 1) {
                optionChainCustomizationDataState2 = OptionChainCustomizationDataState2.METRIC_ONE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionChainCustomizationDataState2 = OptionChainCustomizationDataState2.METRIC_TWO;
            }
            return OptionChainCustomizationDataState.copy$default(optionChainCustomizationDataState, null, optionChainCustomizationDataState2, null, null, null, null, 61, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(OptionChainCustomizationDuxo optionChainCustomizationDuxo, OptionChainAvailableMetrics optionChainAvailableMetrics) {
        optionChainCustomizationDuxo.applyMutation(new OptionChainCustomizationDuxo2(optionChainAvailableMetrics, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OptionChainCustomizationDuxo optionChainCustomizationDuxo, OptionChainSelectedMetrics optionChainSelectedMetrics) {
        optionChainCustomizationDuxo.applyMutation(new OptionChainCustomizationDuxo3(optionChainSelectedMetrics, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {107}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4 */
    static final class C242314 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C242314(Continuation<? super C242314> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainCustomizationDuxo.this.new C242314(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242314) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<String> observableTake = OptionChainCustomizationDuxo.this.optionAccountSwitcherStore.streamActiveAccountNumber().take(1L);
                Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableTake), Integer.MAX_VALUE, null, 2, null);
                final StateFlow<OptionChainCustomizationViewState> stateFlow = OptionChainCustomizationDuxo.this.getStateFlow();
                Flow flowCombine = Operators.combine(flowBuffer$default, FlowKt.take(new Flow<OptionSeenContext>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionSeenContext userSeenContext = ((OptionChainCustomizationViewState) obj).getUserSeenContext();
                                if (userSeenContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(userSeenContext, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super OptionSeenContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 1));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionChainCustomizationDuxo.this, null);
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

        /* compiled from: OptionChainCustomizationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/robinhood/models/api/OptionSeenContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4$2", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends OptionSeenContext>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainCustomizationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainCustomizationDuxo optionChainCustomizationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionChainCustomizationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends OptionSeenContext> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<String, ? extends OptionSeenContext>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<String, ? extends OptionSeenContext> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    String str = (String) tuples2.component1();
                    OptionSeenContext optionSeenContext = (OptionSeenContext) tuples2.component2();
                    PostEndpoint<Tuples2<OptionSeenContext, String>, Unit> recordOptionUserContextSeen = this.this$0.optionChainCustomizationDiscoveryStore.getRecordOptionUserContextSeen();
                    Tuples2 tuples2M3642to = Tuples4.m3642to(optionSeenContext, str);
                    this.label = 1;
                    if (PostEndpoint.DefaultImpls.post$default(recordOptionUserContextSeen, tuples2M3642to, null, this, 2, null) == coroutine_suspended) {
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

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateHighlightedMetric$1", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateHighlightedMetric$1 */
    static final class C242331 extends ContinuationImpl7 implements Function2<OptionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState>, Object> {
        final /* synthetic */ OptionChainCustomizationDataState2 $highlightedMetric;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C242331(OptionChainCustomizationDataState2 optionChainCustomizationDataState2, Continuation<? super C242331> continuation) {
            super(2, continuation);
            this.$highlightedMetric = optionChainCustomizationDataState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242331 c242331 = new C242331(this.$highlightedMetric, continuation);
            c242331.L$0 = obj;
            return c242331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainCustomizationDataState optionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState> continuation) {
            return ((C242331) create(optionChainCustomizationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainCustomizationDataState.copy$default((OptionChainCustomizationDataState) this.L$0, null, this.$highlightedMetric, null, null, null, null, 61, null);
        }
    }

    public final void updateHighlightedMetric(OptionChainCustomizationDataState2 highlightedMetric) {
        Intrinsics.checkNotNullParameter(highlightedMetric, "highlightedMetric");
        applyMutation(new C242331(highlightedMetric, null));
        OptionChainCustomizationLogging.logCustomizationTap(this.eventLogger, new Component(Component.ComponentType.CHIP, highlightedMetric.getValue(), null, 4, null), OptionChainCustomizationLogging.getCustomizationEventContext$default(getStateFlow().getValue().getEntryPointId(), getStateFlow().getValue().getEntryPointType(), getStateFlow().getValue().getHighlightedCategoryLabel(), null, null, getStateFlow().getValue().getSelectedMetricOne().getMetricType(), getStateFlow().getValue().getSelectedMetricTwo().getMetricType(), 24, null));
    }

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateHighlightedCategory$1", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateHighlightedCategory$1 */
    static final class C242321 extends ContinuationImpl7 implements Function2<OptionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C242321(int i, Continuation<? super C242321> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242321 c242321 = new C242321(this.$index, continuation);
            c242321.L$0 = obj;
            return c242321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainCustomizationDataState optionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState> continuation) {
            return ((C242321) create(optionChainCustomizationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainCustomizationDataState.copy$default((OptionChainCustomizationDataState) this.L$0, null, null, null, null, boxing.boxInt(this.$index), null, 47, null);
        }
    }

    public final void updateHighlightedCategory(int index) {
        List<OptionChainAvailableMetrics.AvailableMetrics> availableMetrics;
        OptionChainAvailableMetrics.AvailableMetrics availableMetrics2;
        String categoryLabel = null;
        applyMutation(new C242321(index, null));
        OptionChainAvailableMetrics availableMetrics3 = getStateFlow().getValue().getAvailableMetrics();
        if (availableMetrics3 != null && (availableMetrics = availableMetrics3.getAvailableMetrics()) != null && (availableMetrics2 = availableMetrics.get(index)) != null) {
            categoryLabel = availableMetrics2.getCategoryLabel();
        }
        if (categoryLabel == null) {
            categoryLabel = "";
        }
        String str = categoryLabel;
        OptionChainCustomizationLogging.logCustomizationTap(this.eventLogger, new Component(Component.ComponentType.CHIP, str, null, 4, null), OptionChainCustomizationLogging.getCustomizationEventContext$default(getStateFlow().getValue().getEntryPointId(), getStateFlow().getValue().getEntryPointType(), str, null, null, getStateFlow().getValue().getSelectedMetricOne().getMetricType(), getStateFlow().getValue().getSelectedMetricTwo().getMetricType(), 24, null));
    }

    public final void updateSelectedMetric(OptionChainAvailableMetrics.Metric metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        OptionChainAvailableMetrics.MetricType metricType = getStateFlow().getValue().getSelectedMetricOne().getMetricType();
        OptionChainAvailableMetrics.MetricType metricType2 = getStateFlow().getValue().getSelectedMetricTwo().getMetricType();
        OptionChainSelectedMetrics updatedMetrics$feature_options_chain_externalDebug = getUpdatedMetrics$feature_options_chain_externalDebug(metric);
        if (updatedMetrics$feature_options_chain_externalDebug == null) {
            return;
        }
        applyMutation(new C242341(updatedMetrics$feature_options_chain_externalDebug, null));
        OptionChainEntryPointType entryPointType = getStateFlow().getValue().getEntryPointType();
        if (entryPointType == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C242352(updatedMetrics$feature_options_chain_externalDebug, entryPointType, null), 3, null);
        OptionChainCustomizationLogging.logCustomizationTap(this.eventLogger, new Component(Component.ComponentType.CHIP, metric.getMetricType().getServerValue(), null, 4, null), OptionChainCustomizationLogging.getCustomizationEventContext(getStateFlow().getValue().getEntryPointId(), entryPointType, getStateFlow().getValue().getHighlightedCategoryLabel(), metricType, metricType2, updatedMetrics$feature_options_chain_externalDebug.getSelectedMetricOne().getMetricType(), updatedMetrics$feature_options_chain_externalDebug.getSelectedMetricTwo().getMetricType()));
    }

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateSelectedMetric$1", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateSelectedMetric$1 */
    static final class C242341 extends ContinuationImpl7 implements Function2<OptionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState>, Object> {
        final /* synthetic */ OptionChainSelectedMetrics $updatedMetrics;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C242341(OptionChainSelectedMetrics optionChainSelectedMetrics, Continuation<? super C242341> continuation) {
            super(2, continuation);
            this.$updatedMetrics = optionChainSelectedMetrics;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242341 c242341 = new C242341(this.$updatedMetrics, continuation);
            c242341.L$0 = obj;
            return c242341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainCustomizationDataState optionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState> continuation) {
            return ((C242341) create(optionChainCustomizationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainCustomizationDataState.copy$default((OptionChainCustomizationDataState) this.L$0, null, null, this.$updatedMetrics.getSelectedMetricOne(), this.$updatedMetrics.getSelectedMetricTwo(), null, null, 51, null);
        }
    }

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateSelectedMetric$2", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$updateSelectedMetric$2 */
    static final class C242352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionChainEntryPointType $entryPointType;
        final /* synthetic */ OptionChainSelectedMetrics $updatedMetrics;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C242352(OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainEntryPointType optionChainEntryPointType, Continuation<? super C242352> continuation) {
            super(2, continuation);
            this.$updatedMetrics = optionChainSelectedMetrics;
            this.$entryPointType = optionChainEntryPointType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainCustomizationDuxo.this.new C242352(this.$updatedMetrics, this.$entryPointType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionChainCustomizationStore optionChainCustomizationStore = OptionChainCustomizationDuxo.this.optionChainCustomizationStore;
                OptionChainSelectedMetrics optionChainSelectedMetrics = this.$updatedMetrics;
                boolean z = this.$entryPointType == OptionChainEntryPointType.CHAIN;
                this.label = 1;
                if (optionChainCustomizationStore.updateSelectedMetric(optionChainSelectedMetrics, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainCustomizationDuxo.this.submit(SelectedMetricChangedEvent.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public final OptionChainSelectedMetrics getUpdatedMetrics$feature_options_chain_externalDebug(OptionChainAvailableMetrics.Metric targetMetric) {
        Intrinsics.checkNotNullParameter(targetMetric, "targetMetric");
        String entryPointId = getStateFlow().getValue().getEntryPointId();
        if (entryPointId == null) {
            return null;
        }
        OptionChainSelectedMetrics optionChainSelectedMetrics = new OptionChainSelectedMetrics(entryPointId, getStateFlow().getValue().getSelectedMetricOne(), getStateFlow().getValue().getSelectedMetricTwo());
        int i = WhenMappings.$EnumSwitchMapping$0[getStateFlow().getValue().getHighlightedMetric().ordinal()];
        if (i == 1) {
            if (targetMetric.getMetricType() == optionChainSelectedMetrics.getSelectedMetricTwo().getMetricType()) {
                return swapSelectedMetrics(optionChainSelectedMetrics);
            }
            return OptionChainSelectedMetrics.copy$default(optionChainSelectedMetrics, null, targetMetric, null, 5, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (targetMetric.getMetricType() == optionChainSelectedMetrics.getSelectedMetricOne().getMetricType()) {
            return swapSelectedMetrics(optionChainSelectedMetrics);
        }
        return OptionChainSelectedMetrics.copy$default(optionChainSelectedMetrics, null, null, targetMetric, 3, null);
    }

    public final void logTapEducation() {
        OptionChainCustomizationLogging.logCustomizationTap(this.eventLogger, new Component(Component.ComponentType.BUTTON, OptionChainCustomizationLogging.CHAIN_CUSTOMIZATION_EDUCATION_IDENTIFIER, null, 4, null), OptionChainCustomizationLogging.getCustomizationEventContext$default(getStateFlow().getValue().getEntryPointId(), getStateFlow().getValue().getEntryPointType(), getStateFlow().getValue().getHighlightedCategoryLabel(), null, null, getStateFlow().getValue().getSelectedMetricOne().getMetricType(), getStateFlow().getValue().getSelectedMetricTwo().getMetricType(), 24, null));
    }

    private final OptionChainSelectedMetrics swapSelectedMetrics(OptionChainSelectedMetrics optionChainSelectedMetrics) {
        return OptionChainSelectedMetrics.copy$default(optionChainSelectedMetrics, null, optionChainSelectedMetrics.getSelectedMetricTwo(), optionChainSelectedMetrics.getSelectedMetricOne(), 1, null);
    }

    public final void logShowSnackbar() {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN_CUSTOMIZATION_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.SUCCESS_TOAST, null, null, 6, null), null, OptionChainCustomizationLogging.getCustomizationEventContext$default(getStateFlow().getValue().getEntryPointId(), getStateFlow().getValue().getEntryPointType(), getStateFlow().getValue().getHighlightedCategoryLabel(), null, null, getStateFlow().getValue().getSelectedMetricOne().getMetricType(), getStateFlow().getValue().getSelectedMetricTwo().getMetricType(), 24, null), 9, null);
    }

    /* compiled from: OptionChainCustomizationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDuxo;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionChainCustomizationDuxo, OptionChainCustomizationLaunchMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainCustomizationLaunchMode getArgs(SavedStateHandle savedStateHandle) {
            return (OptionChainCustomizationLaunchMode) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainCustomizationLaunchMode getArgs(OptionChainCustomizationDuxo optionChainCustomizationDuxo) {
            return (OptionChainCustomizationLaunchMode) DuxoCompanion.DefaultImpls.getArgs(this, optionChainCustomizationDuxo);
        }
    }
}
