package com.robinhood.android.jointaccounts.onboarding.outro.created;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchJointAccountCreatedRequestDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchJointAccountCreatedResponseDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.JointAccountsOnboardingService;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountCreatedKey;
import com.robinhood.android.jointaccounts.onboarding.UtilsKt;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.AsyncResult2;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: JointAccountCreatedDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "service", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingService;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "fetchData", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountCreatedDuxo extends BaseDuxo4<AsyncResult<? extends JointAccountCreatedViewState>> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final JointAccountsOnboardingService service;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountCreatedDuxo(JointAccountsOnboardingService service, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(AsyncResult.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.service = service;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchData();
    }

    /* compiled from: JointAccountCreatedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1", m3645f = "JointAccountCreatedDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1 */
    static final class C201351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201351(Continuation<? super C201351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountCreatedDuxo.this.new C201351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: JointAccountCreatedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1$1", m3645f = "JointAccountCreatedDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super JointAccountCreatedViewState>, Object> {
            int label;
            final /* synthetic */ JointAccountCreatedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JointAccountCreatedDuxo jointAccountCreatedDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = jointAccountCreatedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super JointAccountCreatedViewState> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    JointAccountsOnboardingService jointAccountsOnboardingService = this.this$0.service;
                    Companion companion = JointAccountCreatedDuxo.INSTANCE;
                    FetchJointAccountCreatedRequestDto fetchJointAccountCreatedRequestDto = new FetchJointAccountCreatedRequestDto(((JointAccountCreatedKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((JointAccountCreatedKey) companion.getArgs((HasSavedState) this.this$0)).getSource());
                    this.label = 1;
                    obj = jointAccountsOnboardingService.FetchJointAccountCreated(fetchJointAccountCreatedRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return new JointAccountCreatedViewState((FetchJointAccountCreatedResponseDto) obj, ((JointAccountCreatedKey) JointAccountCreatedDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getSource());
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowCatching = AsyncResult2.flowCatching(new AnonymousClass1(JointAccountCreatedDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(JointAccountCreatedDuxo.this, null);
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

        /* compiled from: JointAccountCreatedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1$2", m3645f = "JointAccountCreatedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AsyncResult<? extends JointAccountCreatedViewState>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ JointAccountCreatedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(JointAccountCreatedDuxo jointAccountCreatedDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = jointAccountCreatedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AsyncResult<JointAccountCreatedViewState> asyncResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends JointAccountCreatedViewState> asyncResult, Continuation<? super Unit> continuation) {
                return invoke2((AsyncResult<JointAccountCreatedViewState>) asyncResult, continuation);
            }

            /* compiled from: JointAccountCreatedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1$2$1", m3645f = "JointAccountCreatedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.created.JointAccountCreatedDuxo$fetchData$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AsyncResult<? extends JointAccountCreatedViewState>, Continuation<? super AsyncResult<? extends JointAccountCreatedViewState>>, Object> {
                final /* synthetic */ AsyncResult<JointAccountCreatedViewState> $result;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AsyncResult<JointAccountCreatedViewState> asyncResult, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$result = asyncResult;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(AsyncResult<JointAccountCreatedViewState> asyncResult, Continuation<? super AsyncResult<JointAccountCreatedViewState>> continuation) {
                    return ((AnonymousClass1) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends JointAccountCreatedViewState> asyncResult, Continuation<? super AsyncResult<? extends JointAccountCreatedViewState>> continuation) {
                    return invoke2((AsyncResult<JointAccountCreatedViewState>) asyncResult, (Continuation<? super AsyncResult<JointAccountCreatedViewState>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UtilsKt.takeMostRelevantState((AsyncResult) this.L$0, this.$result);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((AsyncResult) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void fetchData() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C201351(null), 3, null);
    }

    /* compiled from: JointAccountCreatedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/created/JointAccountCreatedDuxo;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountCreatedKey;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<JointAccountCreatedDuxo, JointAccountCreatedKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountCreatedKey getArgs(SavedStateHandle savedStateHandle) {
            return (JointAccountCreatedKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountCreatedKey getArgs(JointAccountCreatedDuxo jointAccountCreatedDuxo) {
            return (JointAccountCreatedKey) DuxoCompanion.DefaultImpls.getArgs(this, jointAccountCreatedDuxo);
        }
    }
}
