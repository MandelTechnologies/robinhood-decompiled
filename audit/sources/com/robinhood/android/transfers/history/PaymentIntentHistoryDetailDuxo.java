package com.robinhood.android.transfers.history;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.contracts.PaymentIntentHistoryDetailKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bff.PaymentIntentStore;
import com.robinhood.models.p320db.bff.PaymentIntent;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: PaymentIntentHistoryDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDataState;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "paymentIntentStore", "Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PaymentIntentHistoryDetailDuxo extends BaseDuxo<PaymentIntentHistoryDetailDataState, PaymentIntentHistoryDetailViewState> implements HasSavedState {
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final PaymentIntentStore paymentIntentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentHistoryDetailDuxo(PaymentIntentStore paymentIntentStore, PaymentInstrumentStore paymentInstrumentStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, PaymentIntentHistoryDetailStateProvider stateProvider) {
        super(new PaymentIntentHistoryDetailDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(paymentIntentStore, "paymentIntentStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.paymentIntentStore = paymentIntentStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1", m3645f = "PaymentIntentHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1 */
    static final class C302571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C302571(Continuation<? super C302571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C302571 c302571 = PaymentIntentHistoryDetailDuxo.this.new C302571(continuation);
            c302571.L$0 = obj;
            return c302571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(PaymentIntentHistoryDetailDuxo.this.paymentIntentStore.streamPaymentIntent(((PaymentIntentHistoryDetailKey) PaymentIntentHistoryDetailDuxo.INSTANCE.getArgs((HasSavedState) PaymentIntentHistoryDetailDuxo.this)).getPaymentIntentId()), PaymentIntentHistoryDetailDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, PaymentIntentHistoryDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, PaymentIntentHistoryDetailDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$1", m3645f = "PaymentIntentHistoryDetailDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<PaymentIntent> $paymentIntentFlow;
            int label;
            final /* synthetic */ PaymentIntentHistoryDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<PaymentIntent> sharedFlow, PaymentIntentHistoryDetailDuxo paymentIntentHistoryDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$paymentIntentFlow = sharedFlow;
                this.this$0 = paymentIntentHistoryDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$paymentIntentFlow, this.this$0, continuation);
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
                    SharedFlow<PaymentIntent> sharedFlow = this.$paymentIntentFlow;
                    C505971 c505971 = new C505971(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c505971, this) == coroutine_suspended) {
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

            /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/bff/PaymentIntent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$1$1", m3645f = "PaymentIntentHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505971 extends ContinuationImpl7 implements Function2<PaymentIntent, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PaymentIntentHistoryDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505971(PaymentIntentHistoryDetailDuxo paymentIntentHistoryDetailDuxo, Continuation<? super C505971> continuation) {
                    super(2, continuation);
                    this.this$0 = paymentIntentHistoryDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505971 c505971 = new C505971(this.this$0, continuation);
                    c505971.L$0 = obj;
                    return c505971;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaymentIntent paymentIntent, Continuation<? super Unit> continuation) {
                    return ((C505971) create(paymentIntent, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$1$1$1", m3645f = "PaymentIntentHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505981 extends ContinuationImpl7 implements Function2<PaymentIntentHistoryDetailDataState, Continuation<? super PaymentIntentHistoryDetailDataState>, Object> {
                    final /* synthetic */ PaymentIntent $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505981(PaymentIntent paymentIntent, Continuation<? super C505981> continuation) {
                        super(2, continuation);
                        this.$it = paymentIntent;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505981 c505981 = new C505981(this.$it, continuation);
                        c505981.L$0 = obj;
                        return c505981;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PaymentIntentHistoryDetailDataState paymentIntentHistoryDetailDataState, Continuation<? super PaymentIntentHistoryDetailDataState> continuation) {
                        return ((C505981) create(paymentIntentHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PaymentIntentHistoryDetailDataState.copy$default((PaymentIntentHistoryDetailDataState) this.L$0, this.$it, null, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505981((PaymentIntent) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$2", m3645f = "PaymentIntentHistoryDetailDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<PaymentIntent> $paymentIntentFlow;
            int label;
            final /* synthetic */ PaymentIntentHistoryDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<PaymentIntent> sharedFlow, PaymentIntentHistoryDetailDuxo paymentIntentHistoryDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$paymentIntentFlow = sharedFlow;
                this.this$0 = paymentIntentHistoryDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$paymentIntentFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$paymentIntentFlow, new C30256x68049d4f(null, this.this$0));
                    C505992 c505992 = new C505992(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c505992, this) == coroutine_suspended) {
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

            /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$2$2", m3645f = "PaymentIntentHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C505992 extends ContinuationImpl7 implements Function2<PaymentInstrumentV2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PaymentIntentHistoryDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505992(PaymentIntentHistoryDetailDuxo paymentIntentHistoryDetailDuxo, Continuation<? super C505992> continuation) {
                    super(2, continuation);
                    this.this$0 = paymentIntentHistoryDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505992 c505992 = new C505992(this.this$0, continuation);
                    c505992.L$0 = obj;
                    return c505992;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaymentInstrumentV2 paymentInstrumentV2, Continuation<? super Unit> continuation) {
                    return ((C505992) create(paymentInstrumentV2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$2$2$1", m3645f = "PaymentIntentHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PaymentIntentHistoryDetailDataState, Continuation<? super PaymentIntentHistoryDetailDataState>, Object> {
                    final /* synthetic */ PaymentInstrumentV2 $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PaymentInstrumentV2 paymentInstrumentV2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = paymentInstrumentV2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PaymentIntentHistoryDetailDataState paymentIntentHistoryDetailDataState, Continuation<? super PaymentIntentHistoryDetailDataState> continuation) {
                        return ((AnonymousClass1) create(paymentIntentHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return PaymentIntentHistoryDetailDataState.copy$default((PaymentIntentHistoryDetailDataState) this.L$0, null, this.$it, 1, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((PaymentInstrumentV2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C302571(null), 3, null);
    }

    /* compiled from: PaymentIntentHistoryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDuxo;", "Lcom/robinhood/android/transfers/contracts/PaymentIntentHistoryDetailKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaymentIntentHistoryDetailDuxo, PaymentIntentHistoryDetailKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaymentIntentHistoryDetailKey getArgs(SavedStateHandle savedStateHandle) {
            return (PaymentIntentHistoryDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PaymentIntentHistoryDetailKey getArgs(PaymentIntentHistoryDetailDuxo paymentIntentHistoryDetailDuxo) {
            return (PaymentIntentHistoryDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, paymentIntentHistoryDetailDuxo);
        }
    }
}
