package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.futures.onboarding.p145ui.valueprops.FuturesOnboardingValuePropsFragment;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.experiment.EventContractsExperiments;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import futures_onboarding_value_props.proto.p463v1.PageDto;
import futures_onboarding_value_props.proto.p463v1.ValuePropsService;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.MicrogramLaunchId;
import microgram.android.Monitoring;
import microgram.android.Monitoring2;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: FuturesOnboardingValuePropsDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001#B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010!R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDataState;", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsViewState;", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "valuePropsService", "Lfutures_onboarding_value_props/proto/v1/ValuePropsService;", "microgramMonitor", "Lmicrogram/android/Monitor;", "onCreate", "", "loadExperimentValues", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPages", "Companion", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesOnboardingValuePropsDuxo extends BaseDuxo3<FuturesOnboardingValuePropsDataState, FuturesOnboardingValuePropsViewState, FuturesOnboardingValuePropsDuxo3> implements HasSavedState {
    private final ExperimentsProvider experimentsProvider;
    private final MicrogramComponent microgramComponent;
    private final MicrogramManager2 microgramInstance;
    private final Monitoring2 microgramMonitor;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;
    private final ValuePropsService valuePropsService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOnboardingValuePropsDuxo(SavedStateHandle savedStateHandle, MicrogramManager microgramManager, DuxoBundle duxoBundle, ExperimentsProvider experimentsProvider, RegionGateProvider regionGateProvider, UserStore userStore) {
        super(new FuturesOnboardingValuePropsDataState(null, null, false, 7, null), FuturesOnboardingValuePropsDuxo4.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.savedStateHandle = savedStateHandle;
        this.experimentsProvider = experimentsProvider;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-futures-value-props", null, 2, null), null, 2, null), null, 4, null);
        this.microgramInstance = microgramManager2M16549getInstancemoChb0s$default;
        MicrogramComponent component = microgramManager2M16549getInstancemoChb0s$default.getComponent();
        this.microgramComponent = component;
        this.valuePropsService = (ValuePropsService) component.getServiceLocator().getClient(ValuePropsService.class);
        this.microgramMonitor = component.getMicrogramMonitor();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C174381(null));
    }

    /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1 */
    static final class C174381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174381(Continuation<? super C174381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174381 c174381 = FuturesOnboardingValuePropsDuxo.this.new C174381(continuation);
            c174381.L$0 = obj;
            return c174381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$1", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingValuePropsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingValuePropsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$1$1", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501341 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ FuturesOnboardingValuePropsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501341(FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo, Continuation<? super C501341> continuation) {
                    super(2, continuation);
                    this.this$0 = futuresOnboardingValuePropsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501341 c501341 = new C501341(this.this$0, continuation);
                    c501341.L$0 = obj;
                    return c501341;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Monitoring monitoring, Continuation<? super Unit> continuation) {
                    return ((C501341) create(monitoring, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$1$1$1", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501351 extends ContinuationImpl7 implements Function2<FuturesOnboardingValuePropsDataState, Continuation<? super FuturesOnboardingValuePropsDataState>, Object> {
                    final /* synthetic */ Monitoring $state;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501351(Monitoring monitoring, Continuation<? super C501351> continuation) {
                        super(2, continuation);
                        this.$state = monitoring;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501351 c501351 = new C501351(this.$state, continuation);
                        c501351.L$0 = obj;
                        return c501351;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(FuturesOnboardingValuePropsDataState futuresOnboardingValuePropsDataState, Continuation<? super FuturesOnboardingValuePropsDataState> continuation) {
                        return ((C501351) create(futuresOnboardingValuePropsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return FuturesOnboardingValuePropsDataState.copy$default((FuturesOnboardingValuePropsDataState) this.L$0, null, this.$state, false, 5, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501351((Monitoring) this.L$0, null));
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
                    StateFlow<Monitoring> state = this.this$0.microgramMonitor.getState();
                    C501341 c501341 = new C501341(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(state, c501341, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(FuturesOnboardingValuePropsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(FuturesOnboardingValuePropsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(FuturesOnboardingValuePropsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$2", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingValuePropsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingValuePropsDuxo;
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
                    FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo = this.this$0;
                    this.label = 1;
                    if (futuresOnboardingValuePropsDuxo.loadExperimentValues(this) == coroutine_suspended) {
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

        /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$3", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FuturesOnboardingValuePropsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = futuresOnboardingValuePropsDuxo;
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
                    FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo = this.this$0;
                    this.label = 1;
                    if (futuresOnboardingValuePropsDuxo.loadPages(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadExperimentValues(Continuation<? super Unit> continuation) {
        Flow flowBuffer$default;
        if (!((FuturesOnboardingValuePropsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).isEventsContracts()) {
            flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, FuturesTradingRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null);
        } else {
            flowBuffer$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsProvider, new Experiment[]{EventContractsExperiments.INSTANCE}, false, null, 6, null);
        }
        Object objCollectLatest = FlowKt.collectLatest(flowBuffer$default, new C174352(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadExperimentValues$2", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadExperimentValues$2 */
    static final class C174352 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        C174352(Continuation<? super C174352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174352 c174352 = FuturesOnboardingValuePropsDuxo.this.new C174352(continuation);
            c174352.Z$0 = ((Boolean) obj).booleanValue();
            return c174352;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C174352) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadExperimentValues$2$1", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadExperimentValues$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOnboardingValuePropsDataState, Continuation<? super FuturesOnboardingValuePropsDataState>, Object> {
            final /* synthetic */ boolean $it;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesOnboardingValuePropsDataState futuresOnboardingValuePropsDataState, Continuation<? super FuturesOnboardingValuePropsDataState> continuation) {
                return ((AnonymousClass1) create(futuresOnboardingValuePropsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FuturesOnboardingValuePropsDataState.copy$default((FuturesOnboardingValuePropsDataState) this.L$0, null, null, this.$it, 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesOnboardingValuePropsDuxo.this.applyMutation(new AnonymousClass1(this.Z$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadPages(Continuation<? super Unit> continuation) {
        Observable observableDistinctUntilChanged = this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo.loadPages.2
            @Override // io.reactivex.functions.Function
            public final CountryCode.Supported apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrigin().getLocality();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null), new C17433x5ab67d12(null, this)), new C174374(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lfutures_onboarding_value_props/proto/v1/PageDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$4", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$4 */
    static final class C174374 extends ContinuationImpl7 implements Function2<ImmutableList<? extends PageDto>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C174374(Continuation<? super C174374> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174374 c174374 = FuturesOnboardingValuePropsDuxo.this.new C174374(continuation);
            c174374.L$0 = obj;
            return c174374;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ImmutableList<? extends PageDto> immutableList, Continuation<? super Unit> continuation) {
            return invoke2((ImmutableList<PageDto>) immutableList, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ImmutableList<PageDto> immutableList, Continuation<? super Unit> continuation) {
            return ((C174374) create(immutableList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$4$1", m3645f = "FuturesOnboardingValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.FuturesOnboardingValuePropsDuxo$loadPages$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesOnboardingValuePropsDataState, Continuation<? super FuturesOnboardingValuePropsDataState>, Object> {
            final /* synthetic */ ImmutableList<PageDto> $pages;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ImmutableList<PageDto> immutableList, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$pages = immutableList;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pages, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesOnboardingValuePropsDataState futuresOnboardingValuePropsDataState, Continuation<? super FuturesOnboardingValuePropsDataState> continuation) {
                return ((AnonymousClass1) create(futuresOnboardingValuePropsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FuturesOnboardingValuePropsDataState.copy$default((FuturesOnboardingValuePropsDataState) this.L$0, this.$pages, null, false, 6, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesOnboardingValuePropsDuxo.this.applyMutation(new AnonymousClass1((ImmutableList) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FuturesOnboardingValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/valueprops/FuturesOnboardingValuePropsFragment$Args;", "<init>", "()V", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesOnboardingValuePropsDuxo, FuturesOnboardingValuePropsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesOnboardingValuePropsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesOnboardingValuePropsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesOnboardingValuePropsFragment.Args getArgs(FuturesOnboardingValuePropsDuxo futuresOnboardingValuePropsDuxo) {
            return (FuturesOnboardingValuePropsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, futuresOnboardingValuePropsDuxo);
        }
    }
}
