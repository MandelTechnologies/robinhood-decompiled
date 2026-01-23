package com.robinhood.android.advisory.tlh.flow.intro;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestFlowResponse;
import com.robinhood.store.advisory.TaxLossHarvestStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HarvestFlowIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/flow/intro/HarvestFlowIntroDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/tlh/flow/intro/HarvestFlowIntroViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", PlaceTypes.STORE, "Lcom/robinhood/store/advisory/TaxLossHarvestStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/store/advisory/TaxLossHarvestStore;)V", "onStart", "", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class HarvestFlowIntroDuxo extends BaseDuxo4<HarvestFlowIntroViewState> {
    public static final int $stable = 8;
    private final TaxLossHarvestStore store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarvestFlowIntroDuxo(DuxoBundle duxoBundle, TaxLossHarvestStore store) {
        super(new HarvestFlowIntroViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
    }

    /* compiled from: HarvestFlowIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1", m3645f = "HarvestFlowIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1 */
    static final class C94091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C94091(Continuation<? super C94091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94091 c94091 = HarvestFlowIntroDuxo.this.new C94091(continuation);
            c94091.L$0 = obj;
            return c94091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C94091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HarvestFlowIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1$1", m3645f = "HarvestFlowIntroDuxo.kt", m3646l = {25}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HarvestFlowIntroDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HarvestFlowIntroDuxo harvestFlowIntroDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = harvestFlowIntroDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: HarvestFlowIntroDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestFlowResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1$1$1", m3645f = "HarvestFlowIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496141 extends ContinuationImpl7 implements Function2<TaxLossHarvestFlowResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HarvestFlowIntroDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496141(HarvestFlowIntroDuxo harvestFlowIntroDuxo, Continuation<? super C496141> continuation) {
                    super(2, continuation);
                    this.this$0 = harvestFlowIntroDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496141 c496141 = new C496141(this.this$0, continuation);
                    c496141.L$0 = obj;
                    return c496141;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TaxLossHarvestFlowResponse taxLossHarvestFlowResponse, Continuation<? super Unit> continuation) {
                    return ((C496141) create(taxLossHarvestFlowResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HarvestFlowIntroDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/tlh/flow/intro/HarvestFlowIntroViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1$1$1$1", m3645f = "HarvestFlowIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496151 extends ContinuationImpl7 implements Function2<HarvestFlowIntroViewState, Continuation<? super HarvestFlowIntroViewState>, Object> {
                    final /* synthetic */ TaxLossHarvestFlowResponse $response;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496151(TaxLossHarvestFlowResponse taxLossHarvestFlowResponse, Continuation<? super C496151> continuation) {
                        super(2, continuation);
                        this.$response = taxLossHarvestFlowResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496151 c496151 = new C496151(this.$response, continuation);
                        c496151.L$0 = obj;
                        return c496151;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HarvestFlowIntroViewState harvestFlowIntroViewState, Continuation<? super HarvestFlowIntroViewState> continuation) {
                        return ((C496151) create(harvestFlowIntroViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((HarvestFlowIntroViewState) this.L$0).copy(this.$response.getIntro());
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496151((TaxLossHarvestFlowResponse) this.L$0, null));
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
                    Flow<TaxLossHarvestFlowResponse> flowStreamFlowResponse = this.this$0.store.streamFlowResponse();
                    C496141 c496141 = new C496141(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamFlowResponse, c496141, this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(HarvestFlowIntroDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C94091(null));
    }
}
