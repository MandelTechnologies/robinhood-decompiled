package com.robinhood.android.optionschain;

import androidx.core.graphics.Insets;
import androidx.lifecycle.SavedStateHandle;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.OptionChainActivityEvent;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.suitability.CarSuitabilityStore;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OptionChainActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001,B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#J\b\u0010$\u001a\u0004\u0018\u00010#J\u0006\u0010%\u001a\u00020\u0016J\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u001dJ\u000e\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainActivityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;", "Lcom/robinhood/android/optionschain/OptionChainActivityEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "carSuitabilityStore", "Lcom/robinhood/librobinhood/data/store/suitability/CarSuitabilityStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/librobinhood/data/store/suitability/CarSuitabilityStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onDestroy", "streamUiOptionChains", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/ui/UiOptionChain;", "streamSbsChainPerfExperiment", "", "getLatestAdjustedOptionChainDisplayModeIfChanged", "Lcom/robinhood/models/ui/OptionChainDisplayMode;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSharedSelectedExpirationDate", "selectedExpirationPage", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getSharedSelectedExpirationDate", "setSideBySideChainSettingsTapped", "setNuxSearchDismissed", "setOnboardingSearchSelectorVisible", "isVisible", "setWindowInsets", "insets", "Landroidx/core/graphics/Insets;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainActivityDuxo extends BaseDuxo5<OptionChainActivityViewState, OptionChainActivityEvent> implements HasSavedState {
    private final CarSuitabilityStore carSuitabilityStore;
    private final ExperimentsStore experimentsStore;
    private final OptionChainStore optionChainStore;
    private final OptionSideBySideChainStore optionSideBySideChainStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo", m3645f = "OptionChainActivityDuxo.kt", m3646l = {101}, m3647m = "getLatestAdjustedOptionChainDisplayModeIfChanged")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$getLatestAdjustedOptionChainDisplayModeIfChanged$1 */
    static final class C240101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C240101(Continuation<? super C240101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionChainActivityDuxo.this.getLatestAdjustedOptionChainDisplayModeIfChanged(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionChainActivityDuxo(ExperimentsStore experimentsStore, OptionChainStore optionChainStore, OptionSideBySideChainStore optionSideBySideChainStore, CarSuitabilityStore carSuitabilityStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(carSuitabilityStore, "carSuitabilityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new OptionChainActivityViewState(null, false, null, false, false, ((OptionChainIntentKey) companion.getExtras(savedStateHandle)).getInitialAccountNumber(), ((OptionChainIntentKey) companion.getExtras(savedStateHandle)).getLaunchMode(), null, false, null, 927, null), duxoBundle);
        this.experimentsStore = experimentsStore;
        this.optionChainStore = optionChainStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.carSuitabilityStore = carSuitabilityStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (((OptionChainIntentKey) INSTANCE.getExtras((HasSavedState) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIDE_BY_SIDE_CHAIN_DEEPLINK)) {
            applyMutation(new C240131(this.optionSideBySideChainStore.getSharedPrefOptionChainDisplayMode(), null));
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C240142(null));
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$onCreate$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$onCreate$1 */
    static final class C240131 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
        final /* synthetic */ OptionChainDisplayMode $sharedPrefDisplayMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240131(OptionChainDisplayMode optionChainDisplayMode, Continuation<? super C240131> continuation) {
            super(2, continuation);
            this.$sharedPrefDisplayMode = optionChainDisplayMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240131 c240131 = new C240131(this.$sharedPrefDisplayMode, continuation);
            c240131.L$0 = obj;
            return c240131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
            return ((C240131) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, this.$sharedPrefDisplayMode, false, null, false, false, null, null, null, false, null, 1022, null);
        }
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$onCreate$2", m3645f = "OptionChainActivityDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$onCreate$2 */
    static final class C240142 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240142(Continuation<? super C240142> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainActivityDuxo.this.new C240142(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240142) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String initialAccountNumber = ((OptionChainIntentKey) OptionChainActivityDuxo.INSTANCE.getExtras((HasSavedState) OptionChainActivityDuxo.this)).getInitialAccountNumber();
                if (initialAccountNumber == null) {
                    return Unit.INSTANCE;
                }
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionChainActivityDuxo.this.carSuitabilityStore.streamCarRequired(initialAccountNumber, CarSuitabilityType.Option.INSTANCE));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainActivityDuxo.this, null);
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

        /* compiled from: OptionChainActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isCarRequired", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$onCreate$2$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionChainActivityDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainActivityDuxo optionChainActivityDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainActivityDuxo;
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
                if (this.Z$0) {
                    this.this$0.submit(OptionChainActivityEvent.ShowCar.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onDestroy() {
        OptionChainDisplayMode chainDisplayModeBeforeSbsNuxDeeplink;
        super.onDestroy();
        if (!((OptionChainIntentKey) INSTANCE.getExtras((HasSavedState) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIDE_BY_SIDE_CHAIN_DEEPLINK) || (chainDisplayModeBeforeSbsNuxDeeplink = getStateFlow().getValue().getChainDisplayModeBeforeSbsNuxDeeplink()) == null) {
            return;
        }
        this.optionSideBySideChainStore.setSharedPrefOptionChainDisplayMode(chainDisplayModeBeforeSbsNuxDeeplink);
    }

    public final Flow<List<UiOptionChain>> streamUiOptionChains() {
        final Flow flowRefreshAndStreamUiOptionChain$default = OptionChainStore.refreshAndStreamUiOptionChain$default(this.optionChainStore, ((OptionChainIntentKey) INSTANCE.getExtras((HasSavedState) this)).getOptionChainIdLaunchMode().getOptionChainIds(), false, 2, null);
        return new Flow<List<? extends UiOptionChain>>() { // from class: com.robinhood.android.optionschain.OptionChainActivityDuxo$streamUiOptionChains$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$streamUiOptionChains$$inlined$filter$1$2 */
            public static final class C240092<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ OptionChainActivityDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$streamUiOptionChains$$inlined$filter$1$2", m3645f = "OptionChainActivityDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$streamUiOptionChains$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return C240092.this.emit(null, this);
                    }
                }

                public C240092(FlowCollector flowCollector, OptionChainActivityDuxo optionChainActivityDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = optionChainActivityDuxo;
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
                        if (((List) obj).size() == ((OptionChainIntentKey) OptionChainActivityDuxo.INSTANCE.getExtras((HasSavedState) this.this$0)).getOptionChainIdLaunchMode().getOptionChainIds().size()) {
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
            public Object collect(FlowCollector<? super List<? extends UiOptionChain>> flowCollector, Continuation continuation) {
                Object objCollect = flowRefreshAndStreamUiOptionChain$default.collect(new C240092(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$streamSbsChainPerfExperiment$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {96, 95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$streamSbsChainPerfExperiment$1 */
    static final class C240201 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C240201(Continuation<? super C240201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240201 c240201 = OptionChainActivityDuxo.this.new C240201(continuation);
            c240201.L$0 = obj;
            return c240201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C240201) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionChainActivityDuxo.this.experimentsStore, new Experiment[]{Experiments.SbsChainPerfImprovement.INSTANCE}, false, null, 6, null);
                Duration.Companion companion = Duration.INSTANCE;
                Flow flowM22187timeoutWithDefault8Mi8wO0 = Operators.m22187timeoutWithDefault8Mi8wO0(flowStreamStateFlow$default, Duration3.toDuration(1000, DurationUnitJvm.MILLISECONDS), boxing.boxBoolean(false));
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FlowKt.first(flowM22187timeoutWithDefault8Mi8wO0, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final Flow<Boolean> streamSbsChainPerfExperiment() {
        return FlowKt.flow(new C240201(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLatestAdjustedOptionChainDisplayModeIfChanged(Continuation<? super OptionChainDisplayMode> continuation) {
        C240101 c240101;
        if (continuation instanceof C240101) {
            c240101 = (C240101) continuation;
            int i = c240101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c240101.label = i - Integer.MIN_VALUE;
            } else {
                c240101 = new C240101(continuation);
            }
        }
        Object objFirst = c240101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c240101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<OptionChainDisplayMode> flowStreamOptionChainDisplayMode = this.optionSideBySideChainStore.streamOptionChainDisplayMode();
            c240101.label = 1;
            objFirst = FlowKt.first(flowStreamOptionChainDisplayMode, c240101);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        OptionChainDisplayMode optionChainDisplayMode = (OptionChainDisplayMode) objFirst;
        Companion companion = INSTANCE;
        if (((OptionChainIntentKey) companion.getExtras((HasSavedState) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.FORCE_FOCUSED_CHAIN)) {
            optionChainDisplayMode = OptionChainDisplayMode.DEFAULT;
        } else if (((OptionChainIntentKey) companion.getExtras((HasSavedState) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.FORCE_SIDE_BY_SIDE_CHAIN_WHEN_ENTERING) && !getStateFlow().getValue().getHasForcedSideBySideChainOnce()) {
            applyMutation(new OptionChainActivityDuxo2(null));
            optionChainDisplayMode = OptionChainDisplayMode.SIDE_BY_SIDE;
        }
        if (getStateFlow().getValue().getCurrentChainDisplayMode() == optionChainDisplayMode) {
            return null;
        }
        applyMutation(new C240112(optionChainDisplayMode, null));
        return optionChainDisplayMode;
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$getLatestAdjustedOptionChainDisplayModeIfChanged$2", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$getLatestAdjustedOptionChainDisplayModeIfChanged$2 */
    static final class C240112 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
        final /* synthetic */ OptionChainDisplayMode $adjustedDisplayMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240112(OptionChainDisplayMode optionChainDisplayMode, Continuation<? super C240112> continuation) {
            super(2, continuation);
            this.$adjustedDisplayMode = optionChainDisplayMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240112 c240112 = new C240112(this.$adjustedDisplayMode, continuation);
            c240112.L$0 = obj;
            return c240112;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
            return ((C240112) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, null, false, null, false, false, null, null, this.$adjustedDisplayMode, false, null, 895, null);
        }
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$setSharedSelectedExpirationDate$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$setSharedSelectedExpirationDate$1 */
    static final class C240171 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
        final /* synthetic */ OptionChainExpirationDateState $selectedExpirationPage;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240171(OptionChainExpirationDateState optionChainExpirationDateState, Continuation<? super C240171> continuation) {
            super(2, continuation);
            this.$selectedExpirationPage = optionChainExpirationDateState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240171 c240171 = new C240171(this.$selectedExpirationPage, continuation);
            c240171.L$0 = obj;
            return c240171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
            return ((C240171) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, null, false, this.$selectedExpirationPage, false, false, null, null, null, false, null, 1019, null);
        }
    }

    public final void setSharedSelectedExpirationDate(OptionChainExpirationDateState selectedExpirationPage) {
        applyMutation(new C240171(selectedExpirationPage, null));
    }

    public final OptionChainExpirationDateState getSharedSelectedExpirationDate() {
        return getStateFlow().getValue().getSelectedExpirationPage();
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$setSideBySideChainSettingsTapped$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$setSideBySideChainSettingsTapped$1 */
    static final class C240181 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C240181(Continuation<? super C240181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240181 c240181 = new C240181(continuation);
            c240181.L$0 = obj;
            return c240181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
            return ((C240181) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, null, false, null, true, false, null, null, null, false, null, 1015, null);
        }
    }

    public final void setSideBySideChainSettingsTapped() {
        applyMutation(new C240181(null));
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$setNuxSearchDismissed$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$setNuxSearchDismissed$1 */
    static final class C240151 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C240151(Continuation<? super C240151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240151 c240151 = new C240151(continuation);
            c240151.L$0 = obj;
            return c240151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
            return ((C240151) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, null, false, null, false, true, null, null, null, false, null, ErrorCodes.IO_EXCEPTION, null);
        }
    }

    public final void setNuxSearchDismissed() {
        applyMutation(new C240151(null));
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$setOnboardingSearchSelectorVisible$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$setOnboardingSearchSelectorVisible$1 */
    static final class C240161 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
        final /* synthetic */ boolean $isVisible;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240161(boolean z, Continuation<? super C240161> continuation) {
            super(2, continuation);
            this.$isVisible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240161 c240161 = new C240161(this.$isVisible, continuation);
            c240161.L$0 = obj;
            return c240161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
            return ((C240161) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, null, false, null, false, false, null, null, null, this.$isVisible, null, 767, null);
        }
    }

    public final void setOnboardingSearchSelectorVisible(boolean isVisible) {
        applyMutation(new C240161(isVisible, null));
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$setWindowInsets$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$setWindowInsets$1 */
    static final class C240191 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
        final /* synthetic */ Insets $insets;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C240191(Insets insets, Continuation<? super C240191> continuation) {
            super(2, continuation);
            this.$insets = insets;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C240191 c240191 = new C240191(this.$insets, continuation);
            c240191.L$0 = obj;
            return c240191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
            return ((C240191) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, null, false, null, false, false, null, null, null, false, this.$insets, 511, null);
        }
    }

    public final void setWindowInsets(Insets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        applyMutation(new C240191(insets, null));
    }

    /* compiled from: OptionChainActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainActivityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/optionschain/OptionChainActivityDuxo;", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<OptionChainActivityDuxo, OptionChainIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public OptionChainIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (OptionChainIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public OptionChainIntentKey getExtras(OptionChainActivityDuxo optionChainActivityDuxo) {
            return (OptionChainIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, optionChainActivityDuxo);
        }
    }
}
