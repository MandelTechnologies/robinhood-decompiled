package com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.account.contracts.jointaccounts.LoggedInJointAccountOnboardingSecondaryIntro;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountSecondaryIntroResponse;
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

/* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "api", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onStop", "fetchData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryFetchingData", "Companion", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class AuthenticatedJointAccountSecondaryIntroDuxo extends BaseDuxo<AuthenticatedJointAccountSecondaryIntroDataState, JointAccountSecondaryIntroViewState> implements HasSavedState {
    private final JointAccountsApi api;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo", m3645f = "AuthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {52}, m3647m = "fetchData")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$fetchData$1 */
    static final class C201001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C201001(Continuation<? super C201001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticatedJointAccountSecondaryIntroDuxo.this.fetchData(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticatedJointAccountSecondaryIntroDuxo(JointAccountsApi api, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AuthenticatedJointAccountSecondaryIntroDataState(false, null, 3, null), AuthenticatedJointAccountSecondaryIntroDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.api = api;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$onCreate$1", m3645f = "AuthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$onCreate$1 */
    static final class C201041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201041(Continuation<? super C201041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthenticatedJointAccountSecondaryIntroDuxo.this.new C201041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthenticatedJointAccountSecondaryIntroDuxo authenticatedJointAccountSecondaryIntroDuxo = AuthenticatedJointAccountSecondaryIntroDuxo.this;
                this.label = 1;
                if (authenticatedJointAccountSecondaryIntroDuxo.fetchData(this) == coroutine_suspended) {
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
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C201041(null));
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$onStop$1", m3645f = "AuthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$onStop$1 */
    static final class C201051 extends ContinuationImpl7 implements Function2<AuthenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C201051(Continuation<? super C201051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201051 c201051 = new C201051(continuation);
            c201051.L$0 = obj;
            return c201051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AuthenticatedJointAccountSecondaryIntroDataState authenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState> continuation) {
            return ((C201051) create(authenticatedJointAccountSecondaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AuthenticatedJointAccountSecondaryIntroDataState.copy$default((AuthenticatedJointAccountSecondaryIntroDataState) this.L$0, false, null, 1, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        applyMutation(new C201051(null));
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$fetchData$2", m3645f = "AuthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$fetchData$2 */
    static final class C201012 extends ContinuationImpl7 implements Function2<AuthenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C201012(Continuation<? super C201012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201012 c201012 = new C201012(continuation);
            c201012.L$0 = obj;
            return c201012;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AuthenticatedJointAccountSecondaryIntroDataState authenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState> continuation) {
            return ((C201012) create(authenticatedJointAccountSecondaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AuthenticatedJointAccountSecondaryIntroDataState) this.L$0).copy(false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchData(Continuation<? super Unit> continuation) {
        C201001 c201001;
        if (continuation instanceof C201001) {
            c201001 = (C201001) continuation;
            int i = c201001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c201001.label = i - Integer.MIN_VALUE;
            } else {
                c201001 = new C201001(continuation);
            }
        }
        Object secondaryIntro = c201001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c201001.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(secondaryIntro);
                applyMutation(new C201012(null));
                JointAccountsApi jointAccountsApi = this.api;
                String invitationId = ((LoggedInJointAccountOnboardingSecondaryIntro) INSTANCE.getArgs((HasSavedState) this)).getInvitationId();
                c201001.label = 1;
                secondaryIntro = jointAccountsApi.getSecondaryIntro(invitationId, c201001);
                if (secondaryIntro == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(secondaryIntro);
            }
            applyMutation(new C201023((ApiJointAccountSecondaryIntroResponse) secondaryIntro, null));
        } catch (Exception unused) {
            applyMutation(new C201034(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$fetchData$3", m3645f = "AuthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$fetchData$3 */
    static final class C201023 extends ContinuationImpl7 implements Function2<AuthenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState>, Object> {
        final /* synthetic */ ApiJointAccountSecondaryIntroResponse $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C201023(ApiJointAccountSecondaryIntroResponse apiJointAccountSecondaryIntroResponse, Continuation<? super C201023> continuation) {
            super(2, continuation);
            this.$response = apiJointAccountSecondaryIntroResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201023 c201023 = new C201023(this.$response, continuation);
            c201023.L$0 = obj;
            return c201023;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AuthenticatedJointAccountSecondaryIntroDataState authenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState> continuation) {
            return ((C201023) create(authenticatedJointAccountSecondaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AuthenticatedJointAccountSecondaryIntroDataState.copy$default((AuthenticatedJointAccountSecondaryIntroDataState) this.L$0, false, this.$response, 1, null);
        }
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$fetchData$4", m3645f = "AuthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$fetchData$4 */
    static final class C201034 extends ContinuationImpl7 implements Function2<AuthenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C201034(Continuation<? super C201034> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C201034 c201034 = new C201034(continuation);
            c201034.L$0 = obj;
            return c201034;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AuthenticatedJointAccountSecondaryIntroDataState authenticatedJointAccountSecondaryIntroDataState, Continuation<? super AuthenticatedJointAccountSecondaryIntroDataState> continuation) {
            return ((C201034) create(authenticatedJointAccountSecondaryIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AuthenticatedJointAccountSecondaryIntroDataState.copy$default((AuthenticatedJointAccountSecondaryIntroDataState) this.L$0, true, null, 2, null);
        }
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$retryFetchingData$1", m3645f = "AuthenticatedJointAccountSecondaryIntroDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountSecondaryIntroDuxo$retryFetchingData$1 */
    static final class C201061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201061(Continuation<? super C201061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AuthenticatedJointAccountSecondaryIntroDuxo.this.new C201061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthenticatedJointAccountSecondaryIntroDuxo authenticatedJointAccountSecondaryIntroDuxo = AuthenticatedJointAccountSecondaryIntroDuxo.this;
                this.label = 1;
                if (authenticatedJointAccountSecondaryIntroDuxo.fetchData(this) == coroutine_suspended) {
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C201061(null), 3, null);
    }

    /* compiled from: AuthenticatedJointAccountSecondaryIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDuxo;", "Lcom/robinhood/android/account/contracts/jointaccounts/LoggedInJointAccountOnboardingSecondaryIntro;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AuthenticatedJointAccountSecondaryIntroDuxo, LoggedInJointAccountOnboardingSecondaryIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoggedInJointAccountOnboardingSecondaryIntro getArgs(SavedStateHandle savedStateHandle) {
            return (LoggedInJointAccountOnboardingSecondaryIntro) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoggedInJointAccountOnboardingSecondaryIntro getArgs(AuthenticatedJointAccountSecondaryIntroDuxo authenticatedJointAccountSecondaryIntroDuxo) {
            return (LoggedInJointAccountOnboardingSecondaryIntro) DuxoCompanion.DefaultImpls.getArgs(this, authenticatedJointAccountSecondaryIntroDuxo);
        }
    }
}
