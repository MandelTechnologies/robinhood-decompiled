package com.robinhood.android.optionsupgrade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetViewState2;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: OptionOnboardingUpsellAllSetDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0015\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetViewState;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sdpTimerFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo$SdpTimer;", "onStart", "", "setupSdpFlowTimer", "isSdp", "", "SdpTimer", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellAllSetDuxo extends BaseDuxo5<OptionOnboardingUpsellAllSetViewState, OptionOnboardingUpsellAllSetViewState2> implements HasSavedState {
    private static final long WAIT_TIMER = 3000;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow2<SdpTimer> sdpTimerFlow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOnboardingUpsellAllSetDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionOnboardingUpsellAllSetViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.sdpTimerFlow = StateFlow4.MutableStateFlow(new SdpTimer(false, false));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C250561(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C250572(null));
    }

    /* compiled from: OptionOnboardingUpsellAllSetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$1", m3645f = "OptionOnboardingUpsellAllSetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$1 */
    static final class C250561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C250561(Continuation<? super C250561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingUpsellAllSetDuxo.this.new C250561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C250561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = OptionOnboardingUpsellAllSetDuxo.this.sdpTimerFlow;
                OptionOnboardingUpsellAllSetDuxo optionOnboardingUpsellAllSetDuxo = OptionOnboardingUpsellAllSetDuxo.this;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, SdpTimer.copy$default((SdpTimer) value, ((ScreenArgs.UpsellAllSet) OptionOnboardingUpsellAllSetDuxo.INSTANCE.getArgs((HasSavedState) optionOnboardingUpsellAllSetDuxo)).isFromSdp(), false, 2, null)));
                OptionOnboardingUpsellAllSetDuxo optionOnboardingUpsellAllSetDuxo2 = OptionOnboardingUpsellAllSetDuxo.this;
                optionOnboardingUpsellAllSetDuxo2.applyMutation(new AnonymousClass2(optionOnboardingUpsellAllSetDuxo2, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionOnboardingUpsellAllSetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$1$2", m3645f = "OptionOnboardingUpsellAllSetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionOnboardingUpsellAllSetViewState, Continuation<? super OptionOnboardingUpsellAllSetViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOnboardingUpsellAllSetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOnboardingUpsellAllSetDuxo optionOnboardingUpsellAllSetDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingUpsellAllSetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionOnboardingUpsellAllSetViewState optionOnboardingUpsellAllSetViewState, Continuation<? super OptionOnboardingUpsellAllSetViewState> continuation) {
                return ((AnonymousClass2) create(optionOnboardingUpsellAllSetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((OptionOnboardingUpsellAllSetViewState) this.L$0).copy(((ScreenArgs.UpsellAllSet) OptionOnboardingUpsellAllSetDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).isPostEnablementMember());
            }
        }
    }

    /* compiled from: OptionOnboardingUpsellAllSetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2", m3645f = "OptionOnboardingUpsellAllSetDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2 */
    static final class C250572 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C250572(Continuation<? super C250572> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingUpsellAllSetDuxo.this.new C250572(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C250572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionOnboardingUpsellAllSetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo$SdpTimer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2$2", m3645f = "OptionOnboardingUpsellAllSetDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SdpTimer, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionOnboardingUpsellAllSetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOnboardingUpsellAllSetDuxo optionOnboardingUpsellAllSetDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOnboardingUpsellAllSetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SdpTimer sdpTimer, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(sdpTimer, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.submit(OptionOnboardingUpsellAllSetViewState2.SdpSuccess.INSTANCE);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow2 stateFlow2 = OptionOnboardingUpsellAllSetDuxo.this.sdpTimerFlow;
                Flow<SdpTimer> flow = new Flow<SdpTimer>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2$invokeSuspend$$inlined$filter$1$2", m3645f = "OptionOnboardingUpsellAllSetDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAllSetDuxo$onStart$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                OptionOnboardingUpsellAllSetDuxo.SdpTimer sdpTimer = (OptionOnboardingUpsellAllSetDuxo.SdpTimer) obj;
                                if (sdpTimer.getInSdpExperiment() && sdpTimer.getSdpFlow()) {
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
                    public Object collect(FlowCollector<? super OptionOnboardingUpsellAllSetDuxo.SdpTimer> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionOnboardingUpsellAllSetDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

    public final void setupSdpFlowTimer(boolean isSdp) {
        SdpTimer value;
        if (isSdp) {
            StateFlow2<SdpTimer> stateFlow2 = this.sdpTimerFlow;
            do {
                value = stateFlow2.getValue();
            } while (!stateFlow2.compareAndSet(value, SdpTimer.copy$default(value, false, true, 1, null)));
        }
    }

    /* compiled from: OptionOnboardingUpsellAllSetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo$SdpTimer;", "", "inSdpExperiment", "", "sdpFlow", "<init>", "(ZZ)V", "getInSdpExperiment", "()Z", "getSdpFlow", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SdpTimer {
        public static final int $stable = 0;
        private final boolean inSdpExperiment;
        private final boolean sdpFlow;

        public static /* synthetic */ SdpTimer copy$default(SdpTimer sdpTimer, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = sdpTimer.inSdpExperiment;
            }
            if ((i & 2) != 0) {
                z2 = sdpTimer.sdpFlow;
            }
            return sdpTimer.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInSdpExperiment() {
            return this.inSdpExperiment;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSdpFlow() {
            return this.sdpFlow;
        }

        public final SdpTimer copy(boolean inSdpExperiment, boolean sdpFlow) {
            return new SdpTimer(inSdpExperiment, sdpFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdpTimer)) {
                return false;
            }
            SdpTimer sdpTimer = (SdpTimer) other;
            return this.inSdpExperiment == sdpTimer.inSdpExperiment && this.sdpFlow == sdpTimer.sdpFlow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.inSdpExperiment) * 31) + Boolean.hashCode(this.sdpFlow);
        }

        public String toString() {
            return "SdpTimer(inSdpExperiment=" + this.inSdpExperiment + ", sdpFlow=" + this.sdpFlow + ")";
        }

        public SdpTimer(boolean z, boolean z2) {
            this.inSdpExperiment = z;
            this.sdpFlow = z2;
        }

        public final boolean getInSdpExperiment() {
            return this.inSdpExperiment;
        }

        public final boolean getSdpFlow() {
            return this.sdpFlow;
        }
    }

    /* compiled from: OptionOnboardingUpsellAllSetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAllSetDuxo;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellAllSet;", "<init>", "()V", "WAIT_TIMER", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOnboardingUpsellAllSetDuxo, ScreenArgs.UpsellAllSet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenArgs.UpsellAllSet getArgs(SavedStateHandle savedStateHandle) {
            return (ScreenArgs.UpsellAllSet) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenArgs.UpsellAllSet getArgs(OptionOnboardingUpsellAllSetDuxo optionOnboardingUpsellAllSetDuxo) {
            return (ScreenArgs.UpsellAllSet) DuxoCompanion.DefaultImpls.getArgs(this, optionOnboardingUpsellAllSetDuxo);
        }
    }
}
