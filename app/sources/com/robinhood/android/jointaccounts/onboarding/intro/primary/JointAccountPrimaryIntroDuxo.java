package com.robinhood.android.jointaccounts.onboarding.intro.primary;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingPrimaryIntro;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountPrimaryIntroResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: JointAccountPrimaryIntroDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "api", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStop", "fetchData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryFetchingData", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class JointAccountPrimaryIntroDuxo extends BaseDuxo<JointAccountPrimaryIntroDataState, JointAccountPrimaryIntroViewState> implements HasSavedState {
    private final JointAccountsApi api;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo", m3645f = "JointAccountPrimaryIntroDuxo.kt", m3646l = {54}, m3647m = "fetchData")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$fetchData$1 */
    static final class C200741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C200741(Continuation<? super C200741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JointAccountPrimaryIntroDuxo.this.fetchData(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JointAccountPrimaryIntroDuxo(JointAccountsApi api, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new JointAccountPrimaryIntroDataState(((JointAccountOnboardingPrimaryIntro) INSTANCE.getArgs(savedStateHandle)).getSource(), false, null, 6, null), JointAccountPrimaryIntroDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.api = api;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C200781(null));
    }

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$onCreate$1", m3645f = "JointAccountPrimaryIntroDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$onCreate$1 */
    static final class C200781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200781(Continuation<? super C200781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountPrimaryIntroDuxo.this.new C200781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountPrimaryIntroDuxo jointAccountPrimaryIntroDuxo = JointAccountPrimaryIntroDuxo.this;
                this.label = 1;
                if (jointAccountPrimaryIntroDuxo.fetchData(this) == coroutine_suspended) {
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

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$onStop$1", m3645f = "JointAccountPrimaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$onStop$1 */
    static final class C200791 extends ContinuationImpl7 implements Function2<JointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C200791(Continuation<? super C200791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200791 c200791 = new C200791(continuation);
            c200791.L$0 = obj;
            return c200791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountPrimaryIntroDataState jointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState> continuation) {
            return ((C200791) create(jointAccountPrimaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountPrimaryIntroDataState.copy$default((JointAccountPrimaryIntroDataState) this.L$0, null, false, null, 3, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        applyMutation(new C200791(null));
    }

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$fetchData$2", m3645f = "JointAccountPrimaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$fetchData$2 */
    static final class C200752 extends ContinuationImpl7 implements Function2<JointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C200752(Continuation<? super C200752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200752 c200752 = new C200752(continuation);
            c200752.L$0 = obj;
            return c200752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountPrimaryIntroDataState jointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState> continuation) {
            return ((C200752) create(jointAccountPrimaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountPrimaryIntroDataState.copy$default((JointAccountPrimaryIntroDataState) this.L$0, null, false, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchData(Continuation<? super Unit> continuation) {
        C200741 c200741;
        if (continuation instanceof C200741) {
            c200741 = (C200741) continuation;
            int i = c200741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c200741.label = i - Integer.MIN_VALUE;
            } else {
                c200741 = new C200741(continuation);
            }
        }
        Object primaryIntro = c200741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c200741.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(primaryIntro);
                applyMutation(new C200752(null));
                JointAccountsApi jointAccountsApi = this.api;
                c200741.label = 1;
                primaryIntro = jointAccountsApi.getPrimaryIntro(c200741);
                if (primaryIntro == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(primaryIntro);
            }
            applyMutation(new C200763((ApiJointAccountPrimaryIntroResponse) primaryIntro, null));
        } catch (Exception unused) {
            applyMutation(new C200774(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$fetchData$3", m3645f = "JointAccountPrimaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$fetchData$3 */
    static final class C200763 extends ContinuationImpl7 implements Function2<JointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState>, Object> {
        final /* synthetic */ ApiJointAccountPrimaryIntroResponse $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C200763(ApiJointAccountPrimaryIntroResponse apiJointAccountPrimaryIntroResponse, Continuation<? super C200763> continuation) {
            super(2, continuation);
            this.$response = apiJointAccountPrimaryIntroResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200763 c200763 = new C200763(this.$response, continuation);
            c200763.L$0 = obj;
            return c200763;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountPrimaryIntroDataState jointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState> continuation) {
            return ((C200763) create(jointAccountPrimaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountPrimaryIntroDataState.copy$default((JointAccountPrimaryIntroDataState) this.L$0, null, false, this.$response, 3, null);
        }
    }

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$fetchData$4", m3645f = "JointAccountPrimaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$fetchData$4 */
    static final class C200774 extends ContinuationImpl7 implements Function2<JointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C200774(Continuation<? super C200774> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C200774 c200774 = new C200774(continuation);
            c200774.L$0 = obj;
            return c200774;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JointAccountPrimaryIntroDataState jointAccountPrimaryIntroDataState, Continuation<? super JointAccountPrimaryIntroDataState> continuation) {
            return ((C200774) create(jointAccountPrimaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return JointAccountPrimaryIntroDataState.copy$default((JointAccountPrimaryIntroDataState) this.L$0, null, true, null, 5, null);
        }
    }

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$retryFetchingData$1", m3645f = "JointAccountPrimaryIntroDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroDuxo$retryFetchingData$1 */
    static final class C200801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C200801(Continuation<? super C200801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JointAccountPrimaryIntroDuxo.this.new C200801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C200801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JointAccountPrimaryIntroDuxo jointAccountPrimaryIntroDuxo = JointAccountPrimaryIntroDuxo.this;
                this.label = 1;
                if (jointAccountPrimaryIntroDuxo.fetchData(this) == coroutine_suspended) {
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

    public final void retryFetchingData() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C200801(null), 3, null);
    }

    /* compiled from: JointAccountPrimaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDuxo;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountOnboardingPrimaryIntro;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<JointAccountPrimaryIntroDuxo, JointAccountOnboardingPrimaryIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountOnboardingPrimaryIntro getArgs(SavedStateHandle savedStateHandle) {
            return (JointAccountOnboardingPrimaryIntro) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public JointAccountOnboardingPrimaryIntro getArgs(JointAccountPrimaryIntroDuxo jointAccountPrimaryIntroDuxo) {
            return (JointAccountOnboardingPrimaryIntro) DuxoCompanion.DefaultImpls.getArgs(this, jointAccountPrimaryIntroDuxo);
        }
    }
}
