package com.robinhood.android.advisory.tlh.strategy.celebration;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.tlh.SubmitTaxLossHarvestStrategyResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyCelebration;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyType;
import com.robinhood.store.advisory.TaxLossHarvestStore;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: HarvestStrategyCelebrationDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/celebration/HarvestStrategyCelebrationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/tlh/strategy/celebration/HarvestStrategyCelebrationViewState;", "taxLossHarvestStore", "Lcom/robinhood/store/advisory/TaxLossHarvestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisory/TaxLossHarvestStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumbersFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "strategyTypeFlow", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyType;", "setUp", "", "accountNumbers", "strategyType", "onStart", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class HarvestStrategyCelebrationDuxo extends BaseDuxo4<HarvestStrategyCelebrationViewState> {
    public static final int $stable = 8;
    private final StateFlow2<List<String>> accountNumbersFlow;
    private final StateFlow2<TaxLossHarvestStrategyType> strategyTypeFlow;
    private final TaxLossHarvestStore taxLossHarvestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarvestStrategyCelebrationDuxo(TaxLossHarvestStore taxLossHarvestStore, DuxoBundle duxoBundle) {
        super(new HarvestStrategyCelebrationViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(taxLossHarvestStore, "taxLossHarvestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLossHarvestStore = taxLossHarvestStore;
        this.accountNumbersFlow = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.strategyTypeFlow = StateFlow4.MutableStateFlow(null);
    }

    public final void setUp(List<String> accountNumbers, TaxLossHarvestStrategyType strategyType) {
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        this.strategyTypeFlow.setValue(strategyType);
        this.accountNumbersFlow.setValue(accountNumbers);
    }

    /* compiled from: HarvestStrategyCelebrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1", m3645f = "HarvestStrategyCelebrationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1 */
    static final class C94311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C94311(Continuation<? super C94311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94311 c94311 = HarvestStrategyCelebrationDuxo.this.new C94311(continuation);
            c94311.L$0 = obj;
            return c94311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HarvestStrategyCelebrationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1", m3645f = "HarvestStrategyCelebrationDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HarvestStrategyCelebrationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HarvestStrategyCelebrationDuxo harvestStrategyCelebrationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = harvestStrategyCelebrationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: HarvestStrategyCelebrationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyCelebration;", "accountNumbers", "", "", "strategyType", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1$1", m3645f = "HarvestStrategyCelebrationDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496171 extends ContinuationImpl7 implements Function3<List<? extends String>, TaxLossHarvestStrategyType, Continuation<? super TaxLossHarvestStrategyCelebration>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ HarvestStrategyCelebrationDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496171(HarvestStrategyCelebrationDuxo harvestStrategyCelebrationDuxo, Continuation<? super C496171> continuation) {
                    super(3, continuation);
                    this.this$0 = harvestStrategyCelebrationDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(List<? extends String> list, TaxLossHarvestStrategyType taxLossHarvestStrategyType, Continuation<? super TaxLossHarvestStrategyCelebration> continuation) {
                    return invoke2((List<String>) list, taxLossHarvestStrategyType, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<String> list, TaxLossHarvestStrategyType taxLossHarvestStrategyType, Continuation<? super TaxLossHarvestStrategyCelebration> continuation) {
                    C496171 c496171 = new C496171(this.this$0, continuation);
                    c496171.L$0 = list;
                    c496171.L$1 = taxLossHarvestStrategyType;
                    return c496171.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            List<String> list = (List) this.L$0;
                            TaxLossHarvestStrategyType taxLossHarvestStrategyType = (TaxLossHarvestStrategyType) this.L$1;
                            TaxLossHarvestStore taxLossHarvestStore = this.this$0.taxLossHarvestStore;
                            this.L$0 = null;
                            this.label = 1;
                            obj = taxLossHarvestStore.submitHarvestStrategy(taxLossHarvestStrategyType, list, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return ((SubmitTaxLossHarvestStrategyResponse) obj).getCelebration();
                    } catch (Throwable th) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                        return null;
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.combine(this.this$0.accountNumbersFlow, FlowKt.filterNotNull(this.this$0.strategyTypeFlow), new C496171(this.this$0, null)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: HarvestStrategyCelebrationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "celebration", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyCelebration;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1$2", m3645f = "HarvestStrategyCelebrationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TaxLossHarvestStrategyCelebration, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HarvestStrategyCelebrationDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(HarvestStrategyCelebrationDuxo harvestStrategyCelebrationDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = harvestStrategyCelebrationDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(taxLossHarvestStrategyCelebration, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HarvestStrategyCelebrationDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/strategy/celebration/HarvestStrategyCelebrationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1$2$1", m3645f = "HarvestStrategyCelebrationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationDuxo$onStart$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C496181 extends ContinuationImpl7 implements Function2<HarvestStrategyCelebrationViewState, Continuation<? super HarvestStrategyCelebrationViewState>, Object> {
                    final /* synthetic */ TaxLossHarvestStrategyCelebration $celebration;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496181(TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration, Continuation<? super C496181> continuation) {
                        super(2, continuation);
                        this.$celebration = taxLossHarvestStrategyCelebration;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496181 c496181 = new C496181(this.$celebration, continuation);
                        c496181.L$0 = obj;
                        return c496181;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HarvestStrategyCelebrationViewState harvestStrategyCelebrationViewState, Continuation<? super HarvestStrategyCelebrationViewState> continuation) {
                        return ((C496181) create(harvestStrategyCelebrationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((HarvestStrategyCelebrationViewState) this.L$0).copy(this.$celebration);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496181((TaxLossHarvestStrategyCelebration) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(HarvestStrategyCelebrationDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C94311(null));
    }
}
