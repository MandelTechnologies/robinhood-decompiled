package com.robinhood.android.onboarding.p205ui.usercreation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.Validation;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordDuxo;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState2;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState3;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState4;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.FieldErrorListErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.api.RecoverAppMfaErrorResponse;
import com.robinhood.models.api.UserLockoutErrorResponse;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.recaptcha.RecaptchaManager;
import com.robinhood.shared.security.recaptcha.RecaptchaResult;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.ExceptionsH;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserCreationPasswordDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\"\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onPasswordInput", "", "text", "", "onSubmitPassword", "password", "", "validateUserPassword", "request", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "onPasswordError", "throwable", "", "getResult", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult;", "errorResponse", "Lcom/robinhood/models/api/ErrorResponse;", "createUser", "createUserRequest", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UserCreationPasswordDuxo extends OldBaseDuxo<UserCreationPasswordViewState> implements HasSavedState {
    private final AuthManager authManager;
    private final RecaptchaManager recaptchaManager;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserCreationPasswordDuxo(UserStore userStore, AuthManager authManager, RecaptchaManager recaptchaManager, SavedStateHandle savedStateHandle) {
        super(UserCreationPasswordViewState.Initial.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userStore = userStore;
        this.authManager = authManager;
        this.recaptchaManager = recaptchaManager;
        this.savedStateHandle = savedStateHandle;
    }

    public final void onPasswordInput(CharSequence text) {
        final UserCreationPasswordViewState4 userCreationPasswordViewState4;
        Intrinsics.checkNotNullParameter(text, "text");
        if (!Validation.INSTANCE.isPasswordValid(text)) {
            userCreationPasswordViewState4 = UserCreationPasswordViewState4.TooShort.INSTANCE;
        } else {
            userCreationPasswordViewState4 = UserCreationPasswordViewState4.Acceptable.INSTANCE;
        }
        mutate(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationPasswordDuxo.onPasswordInput$lambda$0(userCreationPasswordViewState4, (UserCreationPasswordViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserCreationPasswordViewState onPasswordInput$lambda$0(UserCreationPasswordViewState4 userCreationPasswordViewState4, UserCreationPasswordViewState currentState) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new UserCreationPasswordViewState.Typing(userCreationPasswordViewState4);
    }

    public final void onSubmitPassword(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        ApiUser.CreateUserRequest createUserRequestCopy$default = ApiUser.CreateUserRequest.copy$default((ApiUser.CreateUserRequest) INSTANCE.getArgs((HasSavedState) this), null, null, null, password, null, null, null, null, null, null, null, 2039, null);
        Affiliate.RHSG rhsg = Affiliate.RHSG.INSTANCE;
        ApiUser.Origin origin = createUserRequestCopy$default.getOrigin();
        if (rhsg.contains(origin != null ? origin.getLocality() : null)) {
            createUser(createUserRequestCopy$default);
        } else {
            validateUserPassword(createUserRequestCopy$default);
        }
    }

    private final void validateUserPassword(final ApiUser.CreateUserRequest request) {
        Observable<User> observableDoOnSubscribe = this.userStore.createUser(request).doOnSubscribe(new C229391());
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), new C229402(Preconditions.INSTANCE), new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationPasswordDuxo.validateUserPassword$lambda$1(this.f$0, request, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: UserCreationPasswordDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$validateUserPassword$1 */
    static final class C229391<T> implements Consumer {
        C229391() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserCreationPasswordViewState accept$lambda$0(UserCreationPasswordViewState currentState) {
            Intrinsics.checkNotNullParameter(currentState, "currentState");
            return UserCreationPasswordViewState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            UserCreationPasswordDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$validateUserPassword$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UserCreationPasswordDuxo.C229391.accept$lambda$0((UserCreationPasswordViewState) obj);
                }
            });
        }
    }

    /* compiled from: UserCreationPasswordDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$validateUserPassword$2 */
    /* synthetic */ class C229402 extends AdaptedFunctionReference implements Function1<Object, Unit> {
        C229402(Object obj) {
            super(1, obj, Preconditions.class, "failUnexpectedItem", "failUnexpectedItemKotlin(Ljava/lang/Object;)Ljava/lang/Void;", 8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            ((Preconditions) this.receiver).failUnexpectedItemKotlin(obj);
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateUserPassword$lambda$1(UserCreationPasswordDuxo userCreationPasswordDuxo, ApiUser.CreateUserRequest createUserRequest, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        userCreationPasswordDuxo.onPasswordError(it, createUserRequest);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPasswordError(Throwable throwable, ApiUser.CreateUserRequest request) {
        String fieldError;
        String password;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        final UserCreationPasswordViewState3 result = null;
        if (errorResponseExtractErrorResponse != null && (password = request.getPassword()) != null) {
            result = getResult(errorResponseExtractErrorResponse, request, password);
        }
        final UserCreationPasswordViewState4 otherError = (errorResponseExtractErrorResponse == null || (fieldError = errorResponseExtractErrorResponse.getFieldError("password")) == null) ? UserCreationPasswordViewState4.Acceptable.INSTANCE : new UserCreationPasswordViewState4.OtherError(fieldError);
        mutate(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationPasswordDuxo.onPasswordError$lambda$5(result, otherError, (UserCreationPasswordViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserCreationPasswordViewState onPasswordError$lambda$5(UserCreationPasswordViewState3 userCreationPasswordViewState3, UserCreationPasswordViewState4 userCreationPasswordViewState4, UserCreationPasswordViewState currentState) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        if (userCreationPasswordViewState3 != null) {
            return new UserCreationPasswordViewState.Result(new UiEvent(userCreationPasswordViewState3));
        }
        return new UserCreationPasswordViewState.Typing(userCreationPasswordViewState4);
    }

    private final UserCreationPasswordViewState3 getResult(ErrorResponse errorResponse, ApiUser.CreateUserRequest request, String password) {
        String fieldError = errorResponse.getFieldError("email");
        String fieldError2 = errorResponse.getFieldError("username");
        String fieldError3 = errorResponse.getFieldError("password");
        if (!(errorResponse instanceof FieldErrorListErrorResponse) && !(errorResponse instanceof GenericErrorResponse)) {
            if ((errorResponse instanceof ChallengeErrorResponse) || (errorResponse instanceof UserLockoutErrorResponse)) {
                return new UserCreationPasswordViewState3.AccountLocked(errorResponse.getError_message());
            }
            if ((errorResponse instanceof GenericAlertErrorResponse) || (errorResponse instanceof ErrorResponse3) || (errorResponse instanceof RecoverAppMfaErrorResponse)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (fieldError != null) {
            return new UserCreationPasswordViewState3.EmailUsernameError(fieldError, UserCreationPasswordViewState3.EmailUsernameError.ErrorType.EMAIL);
        }
        if (fieldError2 != null) {
            return new UserCreationPasswordViewState3.EmailUsernameError(fieldError2, UserCreationPasswordViewState3.EmailUsernameError.ErrorType.USERNAME);
        }
        if (fieldError3 != null) {
            return null;
        }
        Affiliate.RHSG rhsg = Affiliate.RHSG.INSTANCE;
        ApiUser.Origin origin = request.getOrigin();
        if (rhsg.contains(origin != null ? origin.getLocality() : null)) {
            throw new IllegalStateException("APAC users should not reach this null password error state");
        }
        return new UserCreationPasswordViewState3.Success(new UserCreationPasswordViewState2.Password(password));
    }

    /* compiled from: UserCreationPasswordDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$createUser$1", m3645f = "UserCreationPasswordDuxo.kt", m3646l = {147}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$createUser$1 */
    static final class C229321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiUser.CreateUserRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229321(ApiUser.CreateUserRequest createUserRequest, Continuation<? super C229321> continuation) {
            super(2, continuation);
            this.$request = createUserRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserCreationPasswordDuxo.this.new C229321(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecaptchaManager recaptchaManager = UserCreationPasswordDuxo.this.recaptchaManager;
                this.label = 1;
                obj = recaptchaManager.executeSignup(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RecaptchaResult recaptchaResult = (RecaptchaResult) obj;
            UserCreationPasswordDuxo.this.createUserRequest(ApiUser.CreateUserRequest.copy$default(this.$request, null, "", "", null, null, null, null, null, null, recaptchaResult.getToken(), recaptchaResult.getSiteKey(), 505, null));
            return Unit.INSTANCE;
        }
    }

    private final void createUser(ApiUser.CreateUserRequest request) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C229321(request, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createUserRequest(final ApiUser.CreateUserRequest request) {
        IdlingResourceCounters2.increment(IdlingResourceType.CREATE_USER);
        Observable observableDoFinally = this.userStore.createUser(request).flatMapSingle(new Function() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo.createUserRequest.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends User> apply(final User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                AuthManager authManager = UserCreationPasswordDuxo.this.authManager;
                String username = request.getUsername();
                if (username == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String password = request.getPassword();
                if (password == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                return AuthManager.DefaultImpls.login$default(authManager, username, password, null, null, null, 24, null).map(new Function() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo.createUserRequest.1.1
                    @Override // io.reactivex.functions.Function
                    public final User apply(LoginStatus loginStatus) {
                        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
                        if (loginStatus instanceof LoginStatus.Success) {
                            return user;
                        }
                        if (!(loginStatus instanceof LoginStatus.SuccessWithBackupCode) && !(loginStatus instanceof LoginStatus.MfaRequired)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(loginStatus);
                        throw new ExceptionsH();
                    }
                });
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo.createUserRequest.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(User user) {
                AuthManager authManager = UserCreationPasswordDuxo.this.authManager;
                Intrinsics.checkNotNull(user);
                authManager.onUserLoaded(user);
            }
        }).doOnSubscribe(new C229353()).doFinally(new Action() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo.createUserRequest.4
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.decrement(IdlingResourceType.CREATE_USER);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoFinally, (LifecycleEvent) null, 1, (Object) null), null, new Consumer() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo.createUserRequest.6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                UserCreationPasswordDuxo userCreationPasswordDuxo = UserCreationPasswordDuxo.this;
                Intrinsics.checkNotNull(th);
                userCreationPasswordDuxo.onPasswordError(th, request);
            }
        }, new C229375(), 1, null);
    }

    /* compiled from: UserCreationPasswordDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$createUserRequest$3 */
    static final class C229353<T> implements Consumer {
        C229353() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserCreationPasswordViewState accept$lambda$0(UserCreationPasswordViewState currentState) {
            Intrinsics.checkNotNullParameter(currentState, "currentState");
            return UserCreationPasswordViewState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            UserCreationPasswordDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$createUserRequest$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UserCreationPasswordDuxo.C229353.accept$lambda$0((UserCreationPasswordViewState) obj);
                }
            });
        }
    }

    /* compiled from: UserCreationPasswordDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$createUserRequest$5 */
    static final class C229375 implements Action {
        C229375() {
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            UserCreationPasswordDuxo.this.mutate(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordDuxo$createUserRequest$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UserCreationPasswordDuxo.C229375.run$lambda$0((UserCreationPasswordViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserCreationPasswordViewState run$lambda$0(UserCreationPasswordViewState currentState) {
            Intrinsics.checkNotNullParameter(currentState, "currentState");
            return new UserCreationPasswordViewState.Result(new UiEvent(new UserCreationPasswordViewState3.Success(UserCreationPasswordViewState2.User.INSTANCE)));
        }
    }

    /* compiled from: UserCreationPasswordDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordDuxo;", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UserCreationPasswordDuxo, ApiUser.CreateUserRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiUser.CreateUserRequest getArgs(SavedStateHandle savedStateHandle) {
            return (ApiUser.CreateUserRequest) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiUser.CreateUserRequest getArgs(UserCreationPasswordDuxo userCreationPasswordDuxo) {
            return (ApiUser.CreateUserRequest) DuxoCompanion.DefaultImpls.getArgs(this, userCreationPasswordDuxo);
        }
    }
}
