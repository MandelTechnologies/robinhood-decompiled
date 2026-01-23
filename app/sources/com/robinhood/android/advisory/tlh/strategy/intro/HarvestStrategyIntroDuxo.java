package com.robinhood.android.advisory.tlh.strategy.intro;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestFlowResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesLoading;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesResponse;
import com.robinhood.store.advisory.TaxLossHarvestStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: HarvestStrategyIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u001a\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDataState;", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroViewState;", "taxLossHarvestStore", "Lcom/robinhood/store/advisory/TaxLossHarvestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisory/TaxLossHarvestStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumbersFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "setAccountNumbers", "", "accountNumbers", "onStart", "startMinWaitForLoadedStateTimer", "minLoadingTimeMs", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class HarvestStrategyIntroDuxo extends BaseDuxo<HarvestStrategyIntroDataState, HarvestStrategyIntroViewState> {
    public static final int $stable = 8;
    private final StateFlow2<List<String>> accountNumbersFlow;
    private final TaxLossHarvestStore taxLossHarvestStore;

    /* compiled from: HarvestStrategyIntroDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {64}, m3647m = "startMinWaitForLoadedStateTimer")
    /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$startMinWaitForLoadedStateTimer$1 */
    static final class C94401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C94401(Continuation<? super C94401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HarvestStrategyIntroDuxo.this.startMinWaitForLoadedStateTimer(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarvestStrategyIntroDuxo(TaxLossHarvestStore taxLossHarvestStore, DuxoBundle duxoBundle) {
        super(new HarvestStrategyIntroDataState(null, false, false, null, 15, null), HarvestStrategyIntroDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(taxLossHarvestStore, "taxLossHarvestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLossHarvestStore = taxLossHarvestStore;
        this.accountNumbersFlow = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
    }

    public final void setAccountNumbers(List<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        this.accountNumbersFlow.setValue(accountNumbers);
    }

    /* compiled from: HarvestStrategyIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1 */
    static final class C94391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C94391(Continuation<? super C94391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94391 c94391 = HarvestStrategyIntroDuxo.this.new C94391(continuation);
            c94391.L$0 = obj;
            return c94391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HarvestStrategyIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$1", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HarvestStrategyIntroDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HarvestStrategyIntroDuxo harvestStrategyIntroDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = harvestStrategyIntroDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: HarvestStrategyIntroDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestFlowResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$1$1", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496191 extends ContinuationImpl7 implements Function2<TaxLossHarvestFlowResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HarvestStrategyIntroDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496191(HarvestStrategyIntroDuxo harvestStrategyIntroDuxo, Continuation<? super C496191> continuation) {
                    super(2, continuation);
                    this.this$0 = harvestStrategyIntroDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496191 c496191 = new C496191(this.this$0, continuation);
                    c496191.L$0 = obj;
                    return c496191;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxLossHarvestFlowResponse taxLossHarvestFlowResponse, Continuation<? super Unit> continuation) {
                    return ((C496191) create(taxLossHarvestFlowResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HarvestStrategyIntroDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$1$1$1", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496201 extends ContinuationImpl7 implements Function2<HarvestStrategyIntroDataState, Continuation<? super HarvestStrategyIntroDataState>, Object> {
                    final /* synthetic */ TaxLossHarvestFlowResponse $response;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496201(TaxLossHarvestFlowResponse taxLossHarvestFlowResponse, Continuation<? super C496201> continuation) {
                        super(2, continuation);
                        this.$response = taxLossHarvestFlowResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496201 c496201 = new C496201(this.$response, continuation);
                        c496201.L$0 = obj;
                        return c496201;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HarvestStrategyIntroDataState harvestStrategyIntroDataState, Continuation<? super HarvestStrategyIntroDataState> continuation) {
                        return ((C496201) create(harvestStrategyIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HarvestStrategyIntroDataState.copy$default((HarvestStrategyIntroDataState) this.L$0, null, false, false, this.$response.getLoading(), 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        TaxLossHarvestFlowResponse taxLossHarvestFlowResponse = (TaxLossHarvestFlowResponse) this.L$0;
                        this.this$0.applyMutation(new C496201(taxLossHarvestFlowResponse, null));
                        HarvestStrategyIntroDuxo harvestStrategyIntroDuxo = this.this$0;
                        TaxLossHarvestStrategiesLoading loading = taxLossHarvestFlowResponse.getLoading();
                        Long lBoxLong = loading != null ? boxing.boxLong(loading.getMinLoadingTimeMs()) : null;
                        this.label = 1;
                        if (harvestStrategyIntroDuxo.startMinWaitForLoadedStateTimer(lBoxLong, this) == coroutine_suspended) {
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<TaxLossHarvestFlowResponse> flowStreamFlowResponse = this.this$0.taxLossHarvestStore.streamFlowResponse();
                    C496191 c496191 = new C496191(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamFlowResponse, c496191, this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(HarvestStrategyIntroDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(HarvestStrategyIntroDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: HarvestStrategyIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$2", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HarvestStrategyIntroDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HarvestStrategyIntroDuxo harvestStrategyIntroDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = harvestStrategyIntroDuxo;
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.accountNumbersFlow, new C9438xeddb6c4c(null, this.this$0));
                    C496212 c496212 = new C496212(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c496212, this) == coroutine_suspended) {
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

            /* compiled from: HarvestStrategyIntroDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$2$2", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C496212 extends ContinuationImpl7 implements Function2<TaxLossHarvestStrategiesResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HarvestStrategyIntroDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496212(HarvestStrategyIntroDuxo harvestStrategyIntroDuxo, Continuation<? super C496212> continuation) {
                    super(2, continuation);
                    this.this$0 = harvestStrategyIntroDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496212 c496212 = new C496212(this.this$0, continuation);
                    c496212.L$0 = obj;
                    return c496212;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxLossHarvestStrategiesResponse taxLossHarvestStrategiesResponse, Continuation<? super Unit> continuation) {
                    return ((C496212) create(taxLossHarvestStrategiesResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HarvestStrategyIntroDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$2$2$1", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$onStart$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HarvestStrategyIntroDataState, Continuation<? super HarvestStrategyIntroDataState>, Object> {
                    final /* synthetic */ TaxLossHarvestStrategiesResponse $response;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(TaxLossHarvestStrategiesResponse taxLossHarvestStrategiesResponse, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$response = taxLossHarvestStrategiesResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HarvestStrategyIntroDataState harvestStrategyIntroDataState, Continuation<? super HarvestStrategyIntroDataState> continuation) {
                        return ((AnonymousClass1) create(harvestStrategyIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HarvestStrategyIntroDataState.copy$default((HarvestStrategyIntroDataState) this.L$0, this.$response.getIntro(), false, this.$response.getStrategies() != null, null, 10, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((TaxLossHarvestStrategiesResponse) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C94391(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startMinWaitForLoadedStateTimer(Long l, Continuation<? super Unit> continuation) {
        C94401 c94401;
        if (continuation instanceof C94401) {
            c94401 = (C94401) continuation;
            int i = c94401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c94401.label = i - Integer.MIN_VALUE;
            } else {
                c94401 = new C94401(continuation);
            }
        }
        Object obj = c94401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c94401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long jLongValue = l != null ? l.longValue() : 3000L;
            c94401.label = 1;
            if (DelayKt.delay(jLongValue, c94401) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        applyMutation(new C94412(null));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object startMinWaitForLoadedStateTimer$default(HarvestStrategyIntroDuxo harvestStrategyIntroDuxo, Long l, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return harvestStrategyIntroDuxo.startMinWaitForLoadedStateTimer(l, continuation);
    }

    /* compiled from: HarvestStrategyIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/strategy/intro/HarvestStrategyIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$startMinWaitForLoadedStateTimer$2", m3645f = "HarvestStrategyIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroDuxo$startMinWaitForLoadedStateTimer$2 */
    static final class C94412 extends ContinuationImpl7 implements Function2<HarvestStrategyIntroDataState, Continuation<? super HarvestStrategyIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C94412(Continuation<? super C94412> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94412 c94412 = new C94412(continuation);
            c94412.L$0 = obj;
            return c94412;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HarvestStrategyIntroDataState harvestStrategyIntroDataState, Continuation<? super HarvestStrategyIntroDataState> continuation) {
            return ((C94412) create(harvestStrategyIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return HarvestStrategyIntroDataState.copy$default((HarvestStrategyIntroDataState) this.L$0, null, true, false, null, 13, null);
        }
    }
}
