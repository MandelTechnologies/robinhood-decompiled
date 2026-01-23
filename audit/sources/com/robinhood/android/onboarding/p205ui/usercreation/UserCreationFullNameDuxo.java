package com.robinhood.android.onboarding.p205ui.usercreation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationFullNameViewState2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.ApiToggleThreadNotificationSettingRequest;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.recaptcha.RecaptchaManager;
import com.robinhood.shared.security.recaptcha.RecaptchaResult;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserCreationFullNameDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001(BS\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001eJ\u0016\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eJ\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "marketingOptInApi", "Lcom/robinhood/android/onboarding/ui/usercreation/MarketingOptInApi;", "hasOptInForMarketingEmails", "Lcom/robinhood/prefs/BooleanPreference;", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;Lcom/robinhood/android/onboarding/ui/usercreation/MarketingOptInApi;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/referral/AttributionManager;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "setFirstName", "", "first", "", "setLastName", "last", "createUser", "firstName", "lastName", "createUserRequest", "request", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "onContinueClicked", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UserCreationFullNameDuxo extends BaseDuxo5<UserCreationFullNameViewState, UserCreationFullNameViewState2> implements HasSavedState {
    private final AppType appType;
    private final AttributionManager attributionManager;
    private final AuthManager authManager;
    private final BooleanPreference hasOptInForMarketingEmails;
    private final MarketingOptInApi marketingOptInApi;
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
    public UserCreationFullNameDuxo(UserStore userStore, AuthManager authManager, RecaptchaManager recaptchaManager, MarketingOptInApi marketingOptInApi, @HasOptInForMarketingEmails BooleanPreference hasOptInForMarketingEmails, AttributionManager attributionManager, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new UserCreationFullNameViewState(null, null, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
        Intrinsics.checkNotNullParameter(marketingOptInApi, "marketingOptInApi");
        Intrinsics.checkNotNullParameter(hasOptInForMarketingEmails, "hasOptInForMarketingEmails");
        Intrinsics.checkNotNullParameter(attributionManager, "attributionManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userStore = userStore;
        this.authManager = authManager;
        this.recaptchaManager = recaptchaManager;
        this.marketingOptInApi = marketingOptInApi;
        this.hasOptInForMarketingEmails = hasOptInForMarketingEmails;
        this.attributionManager = attributionManager;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: UserCreationFullNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$setFirstName$1", m3645f = "UserCreationFullNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$setFirstName$1 */
    static final class C229171 extends ContinuationImpl7 implements Function2<UserCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState>, Object> {
        final /* synthetic */ String $first;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229171(String str, Continuation<? super C229171> continuation) {
            super(2, continuation);
            this.$first = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229171 c229171 = new C229171(this.$first, continuation);
            c229171.L$0 = obj;
            return c229171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationFullNameViewState userCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState> continuation) {
            return ((C229171) create(userCreationFullNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationFullNameViewState.copy$default((UserCreationFullNameViewState) this.L$0, this.$first, null, false, 6, null);
        }
    }

    public final void setFirstName(String first) {
        Intrinsics.checkNotNullParameter(first, "first");
        applyMutation(new C229171(first, null));
    }

    /* compiled from: UserCreationFullNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$setLastName$1", m3645f = "UserCreationFullNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$setLastName$1 */
    static final class C229181 extends ContinuationImpl7 implements Function2<UserCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState>, Object> {
        final /* synthetic */ String $last;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229181(String str, Continuation<? super C229181> continuation) {
            super(2, continuation);
            this.$last = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229181 c229181 = new C229181(this.$last, continuation);
            c229181.L$0 = obj;
            return c229181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationFullNameViewState userCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState> continuation) {
            return ((C229181) create(userCreationFullNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationFullNameViewState.copy$default((UserCreationFullNameViewState) this.L$0, null, this.$last, false, 5, null);
        }
    }

    public final void setLastName(String last) {
        Intrinsics.checkNotNullParameter(last, "last");
        applyMutation(new C229181(last, null));
    }

    /* compiled from: UserCreationFullNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUser$1", m3645f = "UserCreationFullNameDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUser$1 */
    static final class C229111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $firstName;
        final /* synthetic */ String $lastName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229111(String str, String str2, Continuation<? super C229111> continuation) {
            super(2, continuation);
            this.$firstName = str;
            this.$lastName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserCreationFullNameDuxo.this.new C229111(this.$firstName, this.$lastName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objExecuteSignup;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecaptchaManager recaptchaManager = UserCreationFullNameDuxo.this.recaptchaManager;
                this.label = 1;
                objExecuteSignup = recaptchaManager.executeSignup(this);
                if (objExecuteSignup == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objExecuteSignup = obj;
            }
            RecaptchaResult recaptchaResult = (RecaptchaResult) objExecuteSignup;
            UserCreationFullNameDuxo.this.createUserRequest(ApiUser.CreateUserRequest.copy$default((ApiUser.CreateUserRequest) UserCreationFullNameDuxo.INSTANCE.getArgs((HasSavedState) UserCreationFullNameDuxo.this), null, this.$firstName, this.$lastName, null, null, null, null, null, null, recaptchaResult.getToken(), recaptchaResult.getSiteKey(), 505, null));
            return Unit.INSTANCE;
        }
    }

    public final void createUser(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C229111(firstName, lastName, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createUserRequest(final ApiUser.CreateUserRequest request) {
        IdlingResourceCounters2.increment(IdlingResourceType.CREATE_USER);
        Observable<R> observableFlatMapSingle = this.userStore.createUser(request).flatMapSingle(new Function() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo.createUserRequest.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends User> apply(final User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                AuthManager authManager = UserCreationFullNameDuxo.this.authManager;
                String username = request.getUsername();
                Intrinsics.checkNotNull(username);
                String password = request.getPassword();
                Intrinsics.checkNotNull(password);
                return AuthManager.DefaultImpls.login$default(authManager, username, password, null, null, null, 24, null).map(new Function() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo.createUserRequest.1.1
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
        });
        final AuthManager authManager = this.authManager;
        Completable completableDoFinally = observableFlatMapSingle.doOnNext(new Consumer() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo.createUserRequest.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(User p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                authManager.onUserLoaded(p0);
            }
        }).flatMapCompletable(new Function() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo.createUserRequest.3

            /* compiled from: UserCreationFullNameDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$3$1", m3645f = "UserCreationFullNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ UserCreationFullNameDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UserCreationFullNameDuxo userCreationFullNameDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = userCreationFullNameDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.attributionManager.completeAttribution();
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(User it) {
                Completable completableRxCompletable$default;
                Intrinsics.checkNotNullParameter(it, "it");
                UserCreationFullNameDuxo userCreationFullNameDuxo = UserCreationFullNameDuxo.this;
                Completable completableOnErrorComplete = RxFactory.DefaultImpls.rxCompletable$default(userCreationFullNameDuxo, null, new AnonymousClass1(userCreationFullNameDuxo, null), 1, null).onErrorComplete();
                ApiUser.Origin origin = ((ApiUser.CreateUserRequest) UserCreationFullNameDuxo.INSTANCE.getArgs((HasSavedState) UserCreationFullNameDuxo.this)).getOrigin();
                if (Intrinsics.areEqual(origin != null ? origin.getLocality() : null, CountryCode.Supported.UnitedKingdom.INSTANCE) || UserCreationFullNameDuxo.this.appType == AppType.RHC) {
                    UserCreationFullNameDuxo userCreationFullNameDuxo2 = UserCreationFullNameDuxo.this;
                    completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(userCreationFullNameDuxo2, null, new AnonymousClass2(userCreationFullNameDuxo2, null), 1, null);
                } else {
                    completableRxCompletable$default = Completable.complete();
                    Intrinsics.checkNotNull(completableRxCompletable$default);
                }
                return completableOnErrorComplete.andThen(completableRxCompletable$default);
            }

            /* compiled from: UserCreationFullNameDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$3$2", m3645f = "UserCreationFullNameDuxo.kt", m3646l = {95}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ UserCreationFullNameDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(UserCreationFullNameDuxo userCreationFullNameDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = userCreationFullNameDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            MarketingOptInApi marketingOptInApi = this.this$0.marketingOptInApi;
                            ApiToggleThreadNotificationSettingRequest apiToggleThreadNotificationSettingRequest = new ApiToggleThreadNotificationSettingRequest(this.this$0.hasOptInForMarketingEmails.get());
                            this.label = 1;
                            if (marketingOptInApi.submitMarketingOptInPreference(apiToggleThreadNotificationSettingRequest, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                    } catch (Exception e) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                    }
                    return Unit.INSTANCE;
                }
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo.createUserRequest.4

            /* compiled from: UserCreationFullNameDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$4$1", m3645f = "UserCreationFullNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UserCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState>, Object> {
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
                public final Object invoke(UserCreationFullNameViewState userCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState> continuation) {
                    return ((AnonymousClass1) create(userCreationFullNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UserCreationFullNameViewState.copy$default((UserCreationFullNameViewState) this.L$0, null, null, true, 3, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                UserCreationFullNameDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo.createUserRequest.5

            /* compiled from: UserCreationFullNameDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$5$1", m3645f = "UserCreationFullNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$createUserRequest$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UserCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState>, Object> {
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
                public final Object invoke(UserCreationFullNameViewState userCreationFullNameViewState, Continuation<? super UserCreationFullNameViewState> continuation) {
                    return ((AnonymousClass1) create(userCreationFullNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UserCreationFullNameViewState.copy$default((UserCreationFullNameViewState) this.L$0, null, null, false, 3, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                UserCreationFullNameDuxo.this.applyMutation(new AnonymousClass1(null));
                IdlingResourceCounters2.decrement(IdlingResourceType.CREATE_USER);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserCreationFullNameDuxo.createUserRequest$lambda$0(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationFullNameDuxo.createUserRequest$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createUserRequest$lambda$0(UserCreationFullNameDuxo userCreationFullNameDuxo) {
        userCreationFullNameDuxo.submit(UserCreationFullNameViewState2.UserCreationSuccessEvent.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createUserRequest$lambda$1(UserCreationFullNameDuxo userCreationFullNameDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        userCreationFullNameDuxo.submit(new UserCreationFullNameViewState2.UserCreationErrorEvent(throwable));
        return Unit.INSTANCE;
    }

    public final void onContinueClicked() {
        submit(UserCreationFullNameViewState2.UserCreationEvent.INSTANCE);
    }

    /* compiled from: UserCreationFullNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo;", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UserCreationFullNameDuxo, ApiUser.CreateUserRequest> {
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
        public ApiUser.CreateUserRequest getArgs(UserCreationFullNameDuxo userCreationFullNameDuxo) {
            return (ApiUser.CreateUserRequest) DuxoCompanion.DefaultImpls.getArgs(this, userCreationFullNameDuxo);
        }
    }
}
