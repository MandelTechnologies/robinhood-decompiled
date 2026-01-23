package com.robinhood.android.acatsin.enablemargin;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginContract;
import com.robinhood.android.lib.accounts.MultipleIndividualAccountsExperiment;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.transfers.contracts.experiments.RetTransferPromoExperiment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.RetryOnError;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AcatsInEnableMarginDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDataState;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInEnableMarginDuxo extends BaseDuxo<AcatsInEnableMarginDataState, AcatsInEnableMarginViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final MarginEligibilityStore marginEligibilityStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInEnableMarginDuxo(MarginEligibilityStore marginEligibilityStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, AcatsInEnableMarginStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new AcatsInEnableMarginDataState(false, null, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.marginEligibilityStore = marginEligibilityStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C79121(null));
    }

    /* compiled from: AcatsInEnableMarginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1 */
    static final class C79121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C79121(Continuation<? super C79121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79121 c79121 = AcatsInEnableMarginDuxo.this.new C79121(continuation);
            c79121.L$0 = obj;
            return c79121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInEnableMarginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$1", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AcatsInEnableMarginDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInEnableMarginDuxo acatsInEnableMarginDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInEnableMarginDuxo;
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{RetTransferPromoExperiment.INSTANCE}, false, null, 6, null);
                    C495051 c495051 = new C495051(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, c495051, this) == coroutine_suspended) {
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

            /* compiled from: AcatsInEnableMarginDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inHoodMonth2025Promo", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$1$1", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495051 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AcatsInEnableMarginDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495051(AcatsInEnableMarginDuxo acatsInEnableMarginDuxo, Continuation<? super C495051> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInEnableMarginDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495051 c495051 = new C495051(this.this$0, continuation);
                    c495051.Z$0 = ((Boolean) obj).booleanValue();
                    return c495051;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C495051) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AcatsInEnableMarginDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$1$1$1", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495061 extends ContinuationImpl7 implements Function2<AcatsInEnableMarginDataState, Continuation<? super AcatsInEnableMarginDataState>, Object> {
                    final /* synthetic */ boolean $inHoodMonth2025Promo;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495061(boolean z, Continuation<? super C495061> continuation) {
                        super(2, continuation);
                        this.$inHoodMonth2025Promo = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495061 c495061 = new C495061(this.$inHoodMonth2025Promo, continuation);
                        c495061.L$0 = obj;
                        return c495061;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AcatsInEnableMarginDataState acatsInEnableMarginDataState, Continuation<? super AcatsInEnableMarginDataState> continuation) {
                        return ((C495061) create(acatsInEnableMarginDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AcatsInEnableMarginDataState.copy$default((AcatsInEnableMarginDataState) this.L$0, false, null, this.$inHoodMonth2025Promo, 3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495061(this.Z$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AcatsInEnableMarginDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AcatsInEnableMarginDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AcatsInEnableMarginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AcatsInEnableMarginDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AcatsInEnableMarginDuxo acatsInEnableMarginDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = acatsInEnableMarginDuxo;
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
                    final Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{MultipleIndividualAccountsExperiment.INSTANCE}, false, null, 6, null);
                    final AcatsInEnableMarginDuxo acatsInEnableMarginDuxo = this.this$0;
                    Flow<GetMultiAccountEligibilityResponseDto> flow = new Flow<GetMultiAccountEligibilityResponseDto>() { // from class: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AcatsInEnableMarginDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {52, 50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, AcatsInEnableMarginDuxo acatsInEnableMarginDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = acatsInEnableMarginDuxo;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
                            
                                if (r9.emit(r8, r0) != r1) goto L27;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                Object obj2;
                                FlowCollector flowCollector;
                                FlowCollector flowCollector2;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj3 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj3);
                                    FlowCollector flowCollector3 = this.$this_unsafeFlow;
                                    if (!((Boolean) obj).booleanValue()) {
                                        obj2 = null;
                                        flowCollector2 = flowCollector3;
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                    } else {
                                        AcatsInEnableMarginDuxo2 acatsInEnableMarginDuxo2 = new AcatsInEnableMarginDuxo2(this.this$0, null);
                                        anonymousClass1.L$0 = flowCollector3;
                                        anonymousClass1.label = 1;
                                        Object objRunCatchingNetworkExceptionsWithRetryExponential = RetryOnError.runCatchingNetworkExceptionsWithRetryExponential(2, acatsInEnableMarginDuxo2, anonymousClass1);
                                        if (objRunCatchingNetworkExceptionsWithRetryExponential != coroutine_suspended) {
                                            obj3 = objRunCatchingNetworkExceptionsWithRetryExponential;
                                            flowCollector = flowCollector3;
                                        }
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj3);
                                        return Unit.INSTANCE;
                                    }
                                    flowCollector = (FlowCollector) anonymousClass1.L$0;
                                    ResultKt.throwOnFailure(obj3);
                                }
                                Object obj4 = obj3;
                                flowCollector2 = flowCollector;
                                obj2 = obj4;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super GetMultiAccountEligibilityResponseDto> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamStateFlow$default.collect(new AnonymousClass2(flowCollector, acatsInEnableMarginDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    C495072 c495072 = new C495072(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c495072, this) == coroutine_suspended) {
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

            /* compiled from: AcatsInEnableMarginDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginEligibility", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$2", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C495072 extends ContinuationImpl7 implements Function2<GetMultiAccountEligibilityResponseDto, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInEnableMarginDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495072(AcatsInEnableMarginDuxo acatsInEnableMarginDuxo, Continuation<? super C495072> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInEnableMarginDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495072 c495072 = new C495072(this.this$0, continuation);
                    c495072.L$0 = obj;
                    return c495072;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super Unit> continuation) {
                    return ((C495072) create(getMultiAccountEligibilityResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AcatsInEnableMarginDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$2$1", m3645f = "AcatsInEnableMarginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInEnableMarginDataState, Continuation<? super AcatsInEnableMarginDataState>, Object> {
                    final /* synthetic */ GetMultiAccountEligibilityResponseDto $marginEligibility;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$marginEligibility = getMultiAccountEligibilityResponseDto;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$marginEligibility, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AcatsInEnableMarginDataState acatsInEnableMarginDataState, Continuation<? super AcatsInEnableMarginDataState> continuation) {
                        return ((AnonymousClass1) create(acatsInEnableMarginDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AcatsInEnableMarginDataState.copy$default((AcatsInEnableMarginDataState) this.L$0, true, this.$marginEligibility, false, 4, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((GetMultiAccountEligibilityResponseDto) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: AcatsInEnableMarginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDuxo;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInEnableMarginDuxo, AcatsInEnableMarginContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInEnableMarginContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInEnableMarginContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInEnableMarginContract.Key getArgs(AcatsInEnableMarginDuxo acatsInEnableMarginDuxo) {
            return (AcatsInEnableMarginContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInEnableMarginDuxo);
        }
    }
}
