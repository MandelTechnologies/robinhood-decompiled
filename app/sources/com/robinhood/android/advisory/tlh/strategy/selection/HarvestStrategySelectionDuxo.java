package com.robinhood.android.advisory.tlh.strategy.selection;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesResponse;
import com.robinhood.store.advisory.TaxLossHarvestStore;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: HarvestStrategySelectionDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/strategy/selection/HarvestStrategySelectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/tlh/strategy/selection/StrategySelectionScreenViewState;", "taxLossHarvestStore", "Lcom/robinhood/store/advisory/TaxLossHarvestStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisory/TaxLossHarvestStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumbersFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "setAccountNumbers", "", "accountNumbers", "onStart", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class HarvestStrategySelectionDuxo extends BaseDuxo4<StrategySelectionScreenViewState> {
    public static final int $stable = 8;
    private final StateFlow2<List<String>> accountNumbersFlow;
    private final TaxLossHarvestStore taxLossHarvestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarvestStrategySelectionDuxo(TaxLossHarvestStore taxLossHarvestStore, DuxoBundle duxoBundle) {
        super(new StrategySelectionScreenViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(taxLossHarvestStore, "taxLossHarvestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxLossHarvestStore = taxLossHarvestStore;
        this.accountNumbersFlow = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
    }

    public final void setAccountNumbers(List<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        this.accountNumbersFlow.setValue(accountNumbers);
    }

    /* compiled from: HarvestStrategySelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1", m3645f = "HarvestStrategySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1 */
    static final class C94581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C94581(Continuation<? super C94581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94581 c94581 = HarvestStrategySelectionDuxo.this.new C94581(continuation);
            c94581.L$0 = obj;
            return c94581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HarvestStrategySelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1$1", m3645f = "HarvestStrategySelectionDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HarvestStrategySelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HarvestStrategySelectionDuxo harvestStrategySelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = harvestStrategySelectionDuxo;
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.accountNumbersFlow, new C9457x16580e4d(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: HarvestStrategySelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1$1$2", m3645f = "HarvestStrategySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TaxLossHarvestStrategiesResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HarvestStrategySelectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(HarvestStrategySelectionDuxo harvestStrategySelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = harvestStrategySelectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxLossHarvestStrategiesResponse taxLossHarvestStrategiesResponse, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(taxLossHarvestStrategiesResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HarvestStrategySelectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/strategy/selection/StrategySelectionScreenViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1$1$2$1", m3645f = "HarvestStrategySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionDuxo$onStart$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C496221 extends ContinuationImpl7 implements Function2<StrategySelectionScreenViewState, Continuation<? super StrategySelectionScreenViewState>, Object> {
                    final /* synthetic */ TaxLossHarvestStrategiesResponse $response;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496221(TaxLossHarvestStrategiesResponse taxLossHarvestStrategiesResponse, Continuation<? super C496221> continuation) {
                        super(2, continuation);
                        this.$response = taxLossHarvestStrategiesResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496221 c496221 = new C496221(this.$response, continuation);
                        c496221.L$0 = obj;
                        return c496221;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(StrategySelectionScreenViewState strategySelectionScreenViewState, Continuation<? super StrategySelectionScreenViewState> continuation) {
                        return ((C496221) create(strategySelectionScreenViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((StrategySelectionScreenViewState) this.L$0).copy(this.$response.getStrategies());
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496221((TaxLossHarvestStrategiesResponse) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(HarvestStrategySelectionDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C94581(null));
    }
}
