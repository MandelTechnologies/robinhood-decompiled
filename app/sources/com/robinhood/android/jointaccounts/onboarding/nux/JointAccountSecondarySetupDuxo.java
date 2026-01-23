package com.robinhood.android.jointaccounts.onboarding.nux;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountSecondarySetupKey;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.jointaccounts.onboarding.UtilsKt;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.jointaccounts.api.confirmation.ApiSecondarySetupViewModel;
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
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: JointAccountSecondarySetupDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/nux/JointAccountSecondarySetupDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "onRetryClicked", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountSecondarySetupDuxo extends BaseDuxo4<AsyncResult<? extends SecondarySetupViewState>> implements HasSavedState {
    private final JointAccountsApi jointAccountsApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountSecondarySetupDuxo(JointAccountsApi jointAccountsApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(AsyncResult.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.jointAccountsApi = jointAccountsApi;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: JointAccountSecondarySetupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$fetchData$2", m3645f = "JointAccountSecondarySetupDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$fetchData$2 */
    static final class C201192 extends ContinuationImpl7 implements Function1<Continuation<? super SecondarySetupViewState>, Object> {
        int label;

        C201192(Continuation<? super C201192> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return JointAccountSecondarySetupDuxo.this.new C201192(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super SecondarySetupViewState> continuation) {
            return ((C201192) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountsApi jointAccountsApi = JointAccountSecondarySetupDuxo.this.jointAccountsApi;
                String invitationId = ((JointAccountSecondarySetupKey) JointAccountSecondarySetupDuxo.INSTANCE.getArgs((HasSavedState) JointAccountSecondarySetupDuxo.this)).getInvitationId();
                this.label = 1;
                obj = jointAccountsApi.getSecondarySetup(invitationId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new SecondarySetupViewState((ApiSecondarySetupViewModel) obj, ((JointAccountSecondarySetupKey) JointAccountSecondarySetupDuxo.INSTANCE.getArgs((HasSavedState) JointAccountSecondarySetupDuxo.this)).getSource());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchData(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(AsyncResult2.flowCatching(new C201192(null)), new C201203(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: JointAccountSecondarySetupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$fetchData$3", m3645f = "JointAccountSecondarySetupDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$fetchData$3 */
    static final class C201203 extends ContinuationImpl7 implements Function2<AsyncResult<? extends SecondarySetupViewState>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C201203(Continuation<? super C201203> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201203 c201203 = JointAccountSecondarySetupDuxo.this.new C201203(continuation);
            c201203.L$0 = obj;
            return c201203;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AsyncResult<SecondarySetupViewState> asyncResult, Continuation<? super Unit> continuation) {
            return ((C201203) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends SecondarySetupViewState> asyncResult, Continuation<? super Unit> continuation) {
            return invoke2((AsyncResult<SecondarySetupViewState>) asyncResult, continuation);
        }

        /* compiled from: JointAccountSecondarySetupDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/jointaccounts/onboarding/nux/SecondarySetupViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$fetchData$3$1", m3645f = "JointAccountSecondarySetupDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$fetchData$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AsyncResult<? extends SecondarySetupViewState>, Continuation<? super AsyncResult<? extends SecondarySetupViewState>>, Object> {
            final /* synthetic */ AsyncResult<SecondarySetupViewState> $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AsyncResult<SecondarySetupViewState> asyncResult, Continuation<? super AnonymousClass1> continuation) {
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
            public final Object invoke2(AsyncResult<SecondarySetupViewState> asyncResult, Continuation<? super AsyncResult<SecondarySetupViewState>> continuation) {
                return ((AnonymousClass1) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends SecondarySetupViewState> asyncResult, Continuation<? super AsyncResult<? extends SecondarySetupViewState>> continuation) {
                return invoke2((AsyncResult<SecondarySetupViewState>) asyncResult, (Continuation<? super AsyncResult<SecondarySetupViewState>>) continuation);
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
                JointAccountSecondarySetupDuxo.this.applyMutation(new AnonymousClass1((AsyncResult) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: JointAccountSecondarySetupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$onStart$1", m3645f = "JointAccountSecondarySetupDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$onStart$1 */
    static final class C201221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201221(Continuation<? super C201221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountSecondarySetupDuxo.this.new C201221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountSecondarySetupDuxo jointAccountSecondarySetupDuxo = JointAccountSecondarySetupDuxo.this;
                this.label = 1;
                if (jointAccountSecondarySetupDuxo.fetchData(this) == coroutine_suspended) {
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
        getLifecycleScope().launchWhenStarted(new C201221(null));
    }

    /* compiled from: JointAccountSecondarySetupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$onRetryClicked$1", m3645f = "JointAccountSecondarySetupDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.nux.JointAccountSecondarySetupDuxo$onRetryClicked$1 */
    static final class C201211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201211(Continuation<? super C201211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountSecondarySetupDuxo.this.new C201211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountSecondarySetupDuxo jointAccountSecondarySetupDuxo = JointAccountSecondarySetupDuxo.this;
                this.label = 1;
                if (jointAccountSecondarySetupDuxo.fetchData(this) == coroutine_suspended) {
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C201211(null), 3, null);
    }

    /* compiled from: JointAccountSecondarySetupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/nux/JointAccountSecondarySetupDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/nux/JointAccountSecondarySetupDuxo;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountSecondarySetupKey;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<JointAccountSecondarySetupDuxo, JointAccountSecondarySetupKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountSecondarySetupKey getArgs(SavedStateHandle savedStateHandle) {
            return (JointAccountSecondarySetupKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountSecondarySetupKey getArgs(JointAccountSecondarySetupDuxo jointAccountSecondarySetupDuxo) {
            return (JointAccountSecondarySetupKey) DuxoCompanion.DefaultImpls.getArgs(this, jointAccountSecondarySetupDuxo);
        }
    }
}
