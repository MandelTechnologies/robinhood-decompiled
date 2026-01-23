package com.robinhood.android.slip.lib.history;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.slip.contracts.SlipGroupedPaymentDetailFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.SlipGroupedPayment;
import com.robinhood.utils.Optional;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SlipGroupedPaymentDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDataState;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipPaymentStore", "Lcom/robinhood/librobinhood/data/store/SlipGroupedPaymentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/SlipGroupedPaymentStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "fetch", "Lkotlinx/coroutines/Job;", "Companion", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipGroupedPaymentDetailDuxo extends BaseDuxo<SlipGroupedPaymentDetailDataState, SlipGroupedPaymentDetailState3> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final SlipGroupedPaymentStore slipPaymentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipGroupedPaymentDetailDuxo(AccountProvider accountProvider, SlipGroupedPaymentStore slipPaymentStore, DuxoBundle duxoBundle, SlipGroupedPaymentDetailState2 stateProvider, SavedStateHandle savedStateHandle) {
        super(new SlipGroupedPaymentDetailDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipPaymentStore, "slipPaymentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.slipPaymentStore = slipPaymentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        fetch();
    }

    /* compiled from: SlipGroupedPaymentDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1", m3645f = "SlipGroupedPaymentDetailDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1 */
    static final class C285441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C285441(Continuation<? super C285441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C285441 c285441 = SlipGroupedPaymentDetailDuxo.this.new C285441(continuation);
            c285441.L$0 = obj;
            return c285441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C285441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    Flow<SlipGroupedPayment> flowAsFlow = SlipGroupedPaymentDetailDuxo.this.slipPaymentStore.getStream().asFlow(((SlipGroupedPaymentDetailFragmentKey) SlipGroupedPaymentDetailDuxo.INSTANCE.getArgs((HasSavedState) SlipGroupedPaymentDetailDuxo.this)).getId());
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    Object objFirst = FlowKt.first(flowAsFlow, this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope2;
                    obj = objFirst;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope3;
                }
                SlipGroupedPayment slipGroupedPayment = (SlipGroupedPayment) obj;
                SlipGroupedPaymentDetailDuxo.this.applyMutation(new AnonymousClass1(slipGroupedPayment, null));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SlipGroupedPaymentDetailDuxo.this, slipGroupedPayment, null), 3, null);
            } catch (Exception e) {
                SlipGroupedPaymentDetailDuxo.this.applyMutation(new AnonymousClass3(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SlipGroupedPaymentDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$1", m3645f = "SlipGroupedPaymentDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SlipGroupedPaymentDetailDataState, Continuation<? super SlipGroupedPaymentDetailDataState>, Object> {
            final /* synthetic */ SlipGroupedPayment $slipPayment;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SlipGroupedPayment slipGroupedPayment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$slipPayment = slipGroupedPayment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$slipPayment, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SlipGroupedPaymentDetailDataState slipGroupedPaymentDetailDataState, Continuation<? super SlipGroupedPaymentDetailDataState> continuation) {
                return ((AnonymousClass1) create(slipGroupedPaymentDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SlipGroupedPaymentDetailDataState.copy$default((SlipGroupedPaymentDetailDataState) this.L$0, this.$slipPayment, null, null, 6, null);
            }
        }

        /* compiled from: SlipGroupedPaymentDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$2", m3645f = "SlipGroupedPaymentDetailDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SlipGroupedPayment $slipPayment;
            int label;
            final /* synthetic */ SlipGroupedPaymentDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SlipGroupedPaymentDetailDuxo slipGroupedPaymentDetailDuxo, SlipGroupedPayment slipGroupedPayment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = slipGroupedPaymentDetailDuxo;
                this.$slipPayment = slipGroupedPayment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$slipPayment, continuation);
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccountOptional(this.$slipPayment.getAccountNumber())), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: SlipGroupedPaymentDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$2$1", m3645f = "SlipGroupedPaymentDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends Account>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SlipGroupedPaymentDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SlipGroupedPaymentDetailDuxo slipGroupedPaymentDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = slipGroupedPaymentDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Account> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<Account>) optional, continuation);
                }

                /* compiled from: SlipGroupedPaymentDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$2$1$1", m3645f = "SlipGroupedPaymentDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505451 extends ContinuationImpl7 implements Function2<SlipGroupedPaymentDetailDataState, Continuation<? super SlipGroupedPaymentDetailDataState>, Object> {
                    final /* synthetic */ Optional<Account> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505451(Optional<Account> optional, Continuation<? super C505451> continuation) {
                        super(2, continuation);
                        this.$it = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505451 c505451 = new C505451(this.$it, continuation);
                        c505451.L$0 = obj;
                        return c505451;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(SlipGroupedPaymentDetailDataState slipGroupedPaymentDetailDataState, Continuation<? super SlipGroupedPaymentDetailDataState> continuation) {
                        return ((C505451) create(slipGroupedPaymentDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return SlipGroupedPaymentDetailDataState.copy$default((SlipGroupedPaymentDetailDataState) this.L$0, null, this.$it.getOrNull(), null, 5, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505451((Optional) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: SlipGroupedPaymentDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$3", m3645f = "SlipGroupedPaymentDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.slip.lib.history.SlipGroupedPaymentDetailDuxo$fetch$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SlipGroupedPaymentDetailDataState, Continuation<? super SlipGroupedPaymentDetailDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4968$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.f4968$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f4968$e, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SlipGroupedPaymentDetailDataState slipGroupedPaymentDetailDataState, Continuation<? super SlipGroupedPaymentDetailDataState> continuation) {
                return ((AnonymousClass3) create(slipGroupedPaymentDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SlipGroupedPaymentDetailDataState.copy$default((SlipGroupedPaymentDetailDataState) this.L$0, null, null, this.f4968$e, 3, null);
            }
        }
    }

    public final Job fetch() {
        return getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C285441(null));
    }

    /* compiled from: SlipGroupedPaymentDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDuxo;", "Lcom/robinhood/android/slip/contracts/SlipGroupedPaymentDetailFragmentKey;", "<init>", "()V", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SlipGroupedPaymentDetailDuxo, SlipGroupedPaymentDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipGroupedPaymentDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (SlipGroupedPaymentDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipGroupedPaymentDetailFragmentKey getArgs(SlipGroupedPaymentDetailDuxo slipGroupedPaymentDetailDuxo) {
            return (SlipGroupedPaymentDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, slipGroupedPaymentDetailDuxo);
        }
    }
}
