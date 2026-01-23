package com.robinhood.android.jointaccounts.onboarding.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryEvent;
import com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondaryViewModel;
import com.robinhood.models.jointaccounts.api.confirmation.ApiRejectInvitationRequest;
import com.robinhood.models.jointaccounts.api.confirmation.ApiRejectSecondarySuccessViewModel;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.AsyncResult2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: JointAccountConfirmSecondaryDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "api", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "onRetryClicked", "onRejectClicked", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountConfirmSecondaryDuxo extends BaseDuxo3<JointAccountConfirmSecondaryDataState, JointAccountConfirmSecondaryViewState, JointAccountConfirmSecondaryEvent> implements HasSavedState {
    private final JointAccountsApi api;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountConfirmSecondaryDuxo(JointAccountsApi api, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new JointAccountConfirmSecondaryDataState(((JointAccountConfirmSecondaryFragment.Args) INSTANCE.getArgs(savedStateHandle)).getSource(), null, false, 6, null), JointAccountConfirmSecondaryDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.api = api;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$fetchData$2", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$fetchData$2 */
    static final class C200082 extends ContinuationImpl7 implements Function1<Continuation<? super ApiConfirmSecondaryViewModel>, Object> {
        int label;

        C200082(Continuation<? super C200082> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return JointAccountConfirmSecondaryDuxo.this.new C200082(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ApiConfirmSecondaryViewModel> continuation) {
            return ((C200082) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            JointAccountsApi jointAccountsApi = JointAccountConfirmSecondaryDuxo.this.api;
            String invitationId = ((JointAccountConfirmSecondaryFragment.Args) JointAccountConfirmSecondaryDuxo.INSTANCE.getArgs((HasSavedState) JointAccountConfirmSecondaryDuxo.this)).getInvitationId();
            this.label = 1;
            Object secondaryConfirmation = jointAccountsApi.getSecondaryConfirmation(invitationId, this);
            return secondaryConfirmation == coroutine_suspended ? coroutine_suspended : secondaryConfirmation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchData(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(AsyncResult2.flowCatching(new C200082(null)), new C200093(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$fetchData$3", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$fetchData$3 */
    static final class C200093 extends ContinuationImpl7 implements Function2<AsyncResult<? extends ApiConfirmSecondaryViewModel>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C200093(Continuation<? super C200093> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200093 c200093 = JointAccountConfirmSecondaryDuxo.this.new C200093(continuation);
            c200093.L$0 = obj;
            return c200093;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AsyncResult<ApiConfirmSecondaryViewModel> asyncResult, Continuation<? super Unit> continuation) {
            return ((C200093) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends ApiConfirmSecondaryViewModel> asyncResult, Continuation<? super Unit> continuation) {
            return invoke2((AsyncResult<ApiConfirmSecondaryViewModel>) asyncResult, continuation);
        }

        /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$fetchData$3$1", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$fetchData$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<JointAccountConfirmSecondaryDataState, Continuation<? super JointAccountConfirmSecondaryDataState>, Object> {
            final /* synthetic */ AsyncResult<ApiConfirmSecondaryViewModel> $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AsyncResult<ApiConfirmSecondaryViewModel> asyncResult, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = asyncResult;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(JointAccountConfirmSecondaryDataState jointAccountConfirmSecondaryDataState, Continuation<? super JointAccountConfirmSecondaryDataState> continuation) {
                return ((AnonymousClass1) create(jointAccountConfirmSecondaryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return JointAccountConfirmSecondaryDataState.copy$default((JointAccountConfirmSecondaryDataState) this.L$0, null, this.$result, false, 5, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountConfirmSecondaryDuxo.this.applyMutation(new AnonymousClass1((AsyncResult) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onStart$1", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onStart$1 */
    static final class C200121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200121(Continuation<? super C200121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountConfirmSecondaryDuxo.this.new C200121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountConfirmSecondaryDuxo jointAccountConfirmSecondaryDuxo = JointAccountConfirmSecondaryDuxo.this;
                this.label = 1;
                if (jointAccountConfirmSecondaryDuxo.fetchData(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C200121(null));
    }

    /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRetryClicked$1", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRetryClicked$1 */
    static final class C200111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200111(Continuation<? super C200111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountConfirmSecondaryDuxo.this.new C200111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountConfirmSecondaryDuxo jointAccountConfirmSecondaryDuxo = JointAccountConfirmSecondaryDuxo.this;
                this.label = 1;
                if (jointAccountConfirmSecondaryDuxo.fetchData(this) == coroutine_suspended) {
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

    public final void onRetryClicked() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C200111(null), 3, null);
    }

    /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1 */
    static final class C200101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200101(Continuation<? super C200101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountConfirmSecondaryDuxo.this.new C200101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiRejectSecondarySuccessViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1$1", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super ApiRejectSecondarySuccessViewModel>, Object> {
            int label;
            final /* synthetic */ JointAccountConfirmSecondaryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JointAccountConfirmSecondaryDuxo jointAccountConfirmSecondaryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = jointAccountConfirmSecondaryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super ApiRejectSecondarySuccessViewModel> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                JointAccountsApi jointAccountsApi = this.this$0.api;
                ApiRejectInvitationRequest apiRejectInvitationRequest = new ApiRejectInvitationRequest(((JointAccountConfirmSecondaryFragment.Args) JointAccountConfirmSecondaryDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInvitationId());
                this.label = 1;
                Object objRejectInvitation = jointAccountsApi.rejectInvitation(apiRejectInvitationRequest, this);
                return objRejectInvitation == coroutine_suspended ? coroutine_suspended : objRejectInvitation;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowCatching = AsyncResult2.flowCatching(new AnonymousClass1(JointAccountConfirmSecondaryDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(JointAccountConfirmSecondaryDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowCatching, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiRejectSecondarySuccessViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1$2", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AsyncResult<? extends ApiRejectSecondarySuccessViewModel>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ JointAccountConfirmSecondaryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(JointAccountConfirmSecondaryDuxo jointAccountConfirmSecondaryDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = jointAccountConfirmSecondaryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AsyncResult<ApiRejectSecondarySuccessViewModel> asyncResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends ApiRejectSecondarySuccessViewModel> asyncResult, Continuation<? super Unit> continuation) {
                return invoke2((AsyncResult<ApiRejectSecondarySuccessViewModel>) asyncResult, continuation);
            }

            /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1$2$1", m3645f = "JointAccountConfirmSecondaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryDuxo$onRejectClicked$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<JointAccountConfirmSecondaryDataState, Continuation<? super JointAccountConfirmSecondaryDataState>, Object> {
                final /* synthetic */ AsyncResult<ApiRejectSecondarySuccessViewModel> $result;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AsyncResult<ApiRejectSecondarySuccessViewModel> asyncResult, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$result = asyncResult;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(JointAccountConfirmSecondaryDataState jointAccountConfirmSecondaryDataState, Continuation<? super JointAccountConfirmSecondaryDataState> continuation) {
                    return ((AnonymousClass1) create(jointAccountConfirmSecondaryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return JointAccountConfirmSecondaryDataState.copy$default((JointAccountConfirmSecondaryDataState) this.L$0, null, null, this.$result instanceof AsyncResult.Loading, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AsyncResult asyncResult = (AsyncResult) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1(asyncResult, null));
                    if (asyncResult instanceof AsyncResult.Failure) {
                        this.this$0.submit(new JointAccountConfirmSecondaryEvent.PostFailed(((AsyncResult.Failure) asyncResult).getException()));
                    } else if (!(asyncResult instanceof AsyncResult.Loading)) {
                        if (!(asyncResult instanceof AsyncResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.submit(JointAccountConfirmSecondaryEvent.Rejected.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onRejectClicked() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C200101(null), 3, null);
    }

    /* compiled from: JointAccountConfirmSecondaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryFragment$Args;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<JointAccountConfirmSecondaryDuxo, JointAccountConfirmSecondaryFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountConfirmSecondaryFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (JointAccountConfirmSecondaryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountConfirmSecondaryFragment.Args getArgs(JointAccountConfirmSecondaryDuxo jointAccountConfirmSecondaryDuxo) {
            return (JointAccountConfirmSecondaryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, jointAccountConfirmSecondaryDuxo);
        }
    }
}
