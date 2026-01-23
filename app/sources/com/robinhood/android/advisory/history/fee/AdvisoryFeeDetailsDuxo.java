package com.robinhood.android.advisory.history.fee;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.AdvisoryFeeDetailsKey;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.fee.AdvisoryFee;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.advisory.AdvisoryFeeStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AdvisoryFeeDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDataState;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryFeeStore", "Lcom/robinhood/store/advisory/AdvisoryFeeStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/advisory/AdvisoryFeeStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryFeeDetailsDuxo extends BaseDuxo<AdvisoryFeeDetailsDataState, AdvisoryFeeDetailsViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AdvisoryFeeStore advisoryFeeStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvisoryFeeDetailsDuxo(SavedStateHandle savedStateHandle, AccountProvider accountProvider, AdvisoryFeeStore advisoryFeeStore, DuxoBundle duxoBundle) {
        super(new AdvisoryFeeDetailsDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), AdvisoryFeeDetailsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryFeeStore, "advisoryFeeStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.advisoryFeeStore = advisoryFeeStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C87381(FlowKt.filterNotNull(this.advisoryFeeStore.streamAdvisoryFee(((AdvisoryFeeDetailsKey) INSTANCE.getArgs((HasSavedState) this)).getId())), this, null));
    }

    /* compiled from: AdvisoryFeeDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1", m3645f = "AdvisoryFeeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1 */
    static final class C87381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<AdvisoryFee> $advisoryFeeStream;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvisoryFeeDetailsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C87381(Flow<AdvisoryFee> flow, AdvisoryFeeDetailsDuxo advisoryFeeDetailsDuxo, Continuation<? super C87381> continuation) {
            super(2, continuation);
            this.$advisoryFeeStream = flow;
            this.this$0 = advisoryFeeDetailsDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C87381 c87381 = new C87381(this.$advisoryFeeStream, this.this$0, continuation);
            c87381.L$0 = obj;
            return c87381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C87381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvisoryFeeDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$1", m3645f = "AdvisoryFeeDetailsDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<AdvisoryFee> $advisoryFeeStream;
            int label;
            final /* synthetic */ AdvisoryFeeDetailsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<AdvisoryFee> flow, AdvisoryFeeDetailsDuxo advisoryFeeDetailsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$advisoryFeeStream = flow;
                this.this$0 = advisoryFeeDetailsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$advisoryFeeStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AdvisoryFeeDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "advisoryFee", "Lcom/robinhood/models/advisory/db/fee/AdvisoryFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$1$1", m3645f = "AdvisoryFeeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495631 extends ContinuationImpl7 implements Function2<AdvisoryFee, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryFeeDetailsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495631(AdvisoryFeeDetailsDuxo advisoryFeeDetailsDuxo, Continuation<? super C495631> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryFeeDetailsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495631 c495631 = new C495631(this.this$0, continuation);
                    c495631.L$0 = obj;
                    return c495631;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AdvisoryFee advisoryFee, Continuation<? super Unit> continuation) {
                    return ((C495631) create(advisoryFee, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisoryFeeDetailsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$1$1$1", m3645f = "AdvisoryFeeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495641 extends ContinuationImpl7 implements Function2<AdvisoryFeeDetailsDataState, Continuation<? super AdvisoryFeeDetailsDataState>, Object> {
                    final /* synthetic */ AdvisoryFee $advisoryFee;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495641(AdvisoryFee advisoryFee, Continuation<? super C495641> continuation) {
                        super(2, continuation);
                        this.$advisoryFee = advisoryFee;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495641 c495641 = new C495641(this.$advisoryFee, continuation);
                        c495641.L$0 = obj;
                        return c495641;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisoryFeeDetailsDataState advisoryFeeDetailsDataState, Continuation<? super AdvisoryFeeDetailsDataState> continuation) {
                        return ((C495641) create(advisoryFeeDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisoryFeeDetailsDataState.copy$default((AdvisoryFeeDetailsDataState) this.L$0, this.$advisoryFee, null, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495641((AdvisoryFee) this.L$0, null));
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
                    Flow<AdvisoryFee> flow = this.$advisoryFeeStream;
                    C495631 c495631 = new C495631(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c495631, this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$advisoryFeeStream, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$advisoryFeeStream, this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvisoryFeeDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$2", m3645f = "AdvisoryFeeDetailsDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<AdvisoryFee> $advisoryFeeStream;
            int label;
            final /* synthetic */ AdvisoryFeeDetailsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<AdvisoryFee> flow, AdvisoryFeeDetailsDuxo advisoryFeeDetailsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$advisoryFeeStream = flow;
                this.this$0 = advisoryFeeDetailsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$advisoryFeeStream, this.this$0, continuation);
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
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(FlowKt.transformLatest(this.$advisoryFeeStream, new C8737x232a2b07(null, this.this$0)), new Function1() { // from class: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ((Account) obj2).getAccountNumber();
                        }
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: AdvisoryFeeDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$2$3", m3645f = "AdvisoryFeeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisoryFeeDetailsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AdvisoryFeeDetailsDuxo advisoryFeeDetailsDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = advisoryFeeDetailsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisoryFeeDetailsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$2$3$1", m3645f = "AdvisoryFeeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.history.fee.AdvisoryFeeDetailsDuxo$onStart$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisoryFeeDetailsDataState, Continuation<? super AdvisoryFeeDetailsDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisoryFeeDetailsDataState advisoryFeeDetailsDataState, Continuation<? super AdvisoryFeeDetailsDataState> continuation) {
                        return ((AnonymousClass1) create(advisoryFeeDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisoryFeeDetailsDataState.copy$default((AdvisoryFeeDetailsDataState) this.L$0, null, this.$account, 1, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: AdvisoryFeeDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryFeeDetailsKey;", "<init>", "()V", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryFeeDetailsDuxo, AdvisoryFeeDetailsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryFeeDetailsKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryFeeDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryFeeDetailsKey getArgs(AdvisoryFeeDetailsDuxo advisoryFeeDetailsDuxo) {
            return (AdvisoryFeeDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, advisoryFeeDetailsDuxo);
        }
    }
}
