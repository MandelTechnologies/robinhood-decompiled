package com.robinhood.shared.login.passwordreset;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.login.passwordreset.PasswordResetEvent;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
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

/* compiled from: PasswordResetDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001(BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDataState;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetViewState;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/login/passwordreset/PasswordResetStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/login/passwordreset/PasswordResetStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "Ljava/util/UUID;", "requestId", "getRequestId$feature_login_externalRelease$annotations", "()V", "getRequestId$feature_login_externalRelease", "()Ljava/util/UUID;", "setRequestId$feature_login_externalRelease", "(Ljava/util/UUID;)V", "requestPasswordResetEmail", "", "email", "", "onForgotEmail", "fromActivityResult", "", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PasswordResetDuxo extends BaseDuxo3<PasswordResetDataState, PasswordResetViewState, PasswordResetEvent> implements HasSavedState {
    public static final String REQUEST_ID = "requestId";
    private final AuthManager authManager;
    private final SavedStateHandle savedStateHandle;
    private final SuvWorkflowManager suvWorkflowManager;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getRequestId$feature_login_externalRelease$annotations() {
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordResetDuxo(AppType appType, UserStore userStore, AuthManager authManager, SuvWorkflowManager suvWorkflowManager, DuxoBundle duxoBundle, PasswordResetStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        super(new PasswordResetDataState(false, appType, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userStore = userStore;
        this.authManager = authManager;
        this.suvWorkflowManager = suvWorkflowManager;
        this.savedStateHandle = savedStateHandle;
    }

    public final UUID getRequestId$feature_login_externalRelease() {
        UUID uuid = (UUID) getSavedStateHandle().get("requestId");
        if (uuid != null) {
            return uuid;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNull(uuidRandomUUID);
        setRequestId$feature_login_externalRelease(uuidRandomUUID);
        return uuidRandomUUID;
    }

    public final void setRequestId$feature_login_externalRelease(UUID value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getSavedStateHandle().set("requestId", value);
    }

    /* compiled from: PasswordResetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1", m3645f = "PasswordResetDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1 */
    static final class C391611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C391611(String str, Continuation<? super C391611> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PasswordResetDuxo.this.new C391611(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C391611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PasswordResetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1$1", m3645f = "PasswordResetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PasswordResetDataState, Continuation<? super PasswordResetDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PasswordResetDataState passwordResetDataState, Continuation<? super PasswordResetDataState> continuation) {
                return ((AnonymousClass1) create(passwordResetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PasswordResetDataState.copy$default((PasswordResetDataState) this.L$0, true, null, 2, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PasswordResetDuxo.this.applyMutation(new AnonymousClass1(null));
                    UserStore userStore = PasswordResetDuxo.this.userStore;
                    String str = this.$email;
                    this.label = 1;
                    if (userStore.sendPasswordResetEmail(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                PasswordResetDuxo.this.applyMutation(new AnonymousClass2(null));
                PasswordResetDuxo.this.submit(new PasswordResetEvent.EmailSent(this.$email));
            } catch (Throwable th) {
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
                String fieldError = errorResponseExtractErrorResponse != null ? errorResponseExtractErrorResponse.getFieldError("email") : null;
                if (Throwables.isNetworkRelated(th) && fieldError != null) {
                    PasswordResetDuxo.this.applyMutation(new AnonymousClass3(null));
                    PasswordResetDuxo.this.submit(new PasswordResetEvent.Error(fieldError));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PasswordResetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1$2", m3645f = "PasswordResetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PasswordResetDataState, Continuation<? super PasswordResetDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PasswordResetDataState passwordResetDataState, Continuation<? super PasswordResetDataState> continuation) {
                return ((AnonymousClass2) create(passwordResetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PasswordResetDataState.copy$default((PasswordResetDataState) this.L$0, false, null, 2, null);
            }
        }

        /* compiled from: PasswordResetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1$3", m3645f = "PasswordResetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$requestPasswordResetEmail$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PasswordResetDataState, Continuation<? super PasswordResetDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PasswordResetDataState passwordResetDataState, Continuation<? super PasswordResetDataState> continuation) {
                return ((AnonymousClass3) create(passwordResetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PasswordResetDataState.copy$default((PasswordResetDataState) this.L$0, false, null, 2, null);
            }
        }
    }

    public final void requestPasswordResetEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C391611(email, null), 3, null);
    }

    public final void onForgotEmail(boolean fromActivityResult) {
        if (!fromActivityResult) {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            setRequestId$feature_login_externalRelease(uuidRandomUUID);
        }
        applyMutation(new C391591(null));
        this.suvWorkflowManager.handleRequest(new C391602(null), new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PasswordResetDuxo.onForgotEmail$lambda$1(this.f$0, (LoginStatus) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PasswordResetDuxo.onForgotEmail$lambda$2(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PasswordResetDuxo.onForgotEmail$lambda$3(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* compiled from: PasswordResetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetDuxo$onForgotEmail$1", m3645f = "PasswordResetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$onForgotEmail$1 */
    static final class C391591 extends ContinuationImpl7 implements Function2<PasswordResetDataState, Continuation<? super PasswordResetDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C391591(Continuation<? super C391591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C391591 c391591 = new C391591(continuation);
            c391591.L$0 = obj;
            return c391591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PasswordResetDataState passwordResetDataState, Continuation<? super PasswordResetDataState> continuation) {
            return ((C391591) create(passwordResetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PasswordResetDataState.copy$default((PasswordResetDataState) this.L$0, true, null, 2, null);
        }
    }

    /* compiled from: PasswordResetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/login/LoginStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetDuxo$onForgotEmail$2", m3645f = "PasswordResetDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$onForgotEmail$2 */
    static final class C391602 extends ContinuationImpl7 implements Function1<Continuation<? super LoginStatus>, Object> {
        int label;

        C391602(Continuation<? super C391602> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PasswordResetDuxo.this.new C391602(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super LoginStatus> continuation) {
            return ((C391602) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            AuthManager authManager = PasswordResetDuxo.this.authManager;
            UUID requestId$feature_login_externalRelease = PasswordResetDuxo.this.getRequestId$feature_login_externalRelease();
            this.label = 1;
            Object objLoginAccountRecovery = authManager.loginAccountRecovery(requestId$feature_login_externalRelease, this);
            return objLoginAccountRecovery == coroutine_suspended ? coroutine_suspended : objLoginAccountRecovery;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onForgotEmail$lambda$1(PasswordResetDuxo passwordResetDuxo, LoginStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        passwordResetDuxo.applyMutation(new PasswordResetDuxo2(null));
        passwordResetDuxo.submit(new PasswordResetEvent.AccountRecoverySuccess(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onForgotEmail$lambda$2(PasswordResetDuxo passwordResetDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        passwordResetDuxo.applyMutation(new PasswordResetDuxo3(null));
        passwordResetDuxo.submit(new PasswordResetEvent.AccountRecoveryError(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onForgotEmail$lambda$3(PasswordResetDuxo passwordResetDuxo, UUID workflowId, boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        passwordResetDuxo.applyMutation(new PasswordResetDuxo4(null));
        passwordResetDuxo.submit(new PasswordResetEvent.VerificationWorkflow(workflowId, z));
        return Unit.INSTANCE;
    }

    /* compiled from: PasswordResetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo$Companion;", "", "<init>", "()V", "REQUEST_ID", "", "getREQUEST_ID$feature_login_externalRelease$annotations", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getREQUEST_ID$feature_login_externalRelease$annotations() {
        }

        private Companion() {
        }
    }
}
