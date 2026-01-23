package com.robinhood.android.onboarding.p205ui.usercreation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailEvent;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.UserRegion;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import com.robinhood.models.api.bonfire.waitlist.EmailWaitlistSpotStatus;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.models.api.sheriff.ApiUserEmailValidationResponse;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.store.user.UserStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import waitlist.OnboardingEmailWaitlistApi;

/* compiled from: UserCreationEmailDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001%BC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001bJ\u001a\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "waitlistApi", "Lwaitlist/OnboardingEmailWaitlistApi;", "hasOptInForMarketingEmails", "Lcom/robinhood/prefs/BooleanPreference;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/UserRegionStore;Lwaitlist/OnboardingEmailWaitlistApi;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setEmailEdt", "emailEdt", "", "onContinueCtaClicked", "validateEmailWithSheriff", "email", "onEmailValidated", "onMarketingOptInSubmitted", "optIn", "", "onVisitJoinWaitlistPage", "waitlistUrl", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UserCreationEmailDuxo extends BaseDuxo5<UserCreationEmailViewState, UserCreationEmailEvent> implements HasSavedState {
    private final AppType appType;
    private final BooleanPreference hasOptInForMarketingEmails;
    private final SavedStateHandle savedStateHandle;
    private final UserRegionStore userRegionStore;
    private final UserStore userStore;
    private final OnboardingEmailWaitlistApi waitlistApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCreationEmailDuxo(UserStore userStore, UserRegionStore userRegionStore, OnboardingEmailWaitlistApi waitlistApi, @HasOptInForMarketingEmails BooleanPreference hasOptInForMarketingEmails, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new UserCreationEmailViewState((UserCreationEmailFragment.Args) INSTANCE.getArgs(savedStateHandle), false, null, null, 14, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
        Intrinsics.checkNotNullParameter(waitlistApi, "waitlistApi");
        Intrinsics.checkNotNullParameter(hasOptInForMarketingEmails, "hasOptInForMarketingEmails");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.userStore = userStore;
        this.userRegionStore = userRegionStore;
        this.waitlistApi = waitlistApi;
        this.hasOptInForMarketingEmails = hasOptInForMarketingEmails;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: UserCreationEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailDuxo;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Args;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UserCreationEmailDuxo, UserCreationEmailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UserCreationEmailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (UserCreationEmailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UserCreationEmailFragment.Args getArgs(UserCreationEmailDuxo userCreationEmailDuxo) {
            return (UserCreationEmailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, userCreationEmailDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.userRegionStore.getCurrentRegion(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationEmailDuxo.onCreate$lambda$0(this.f$0, (UserRegion) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(UserCreationEmailDuxo userCreationEmailDuxo, UserRegion region) {
        Intrinsics.checkNotNullParameter(region, "region");
        userCreationEmailDuxo.applyMutation(new UserCreationEmailDuxo2(region, null));
        return Unit.INSTANCE;
    }

    /* compiled from: UserCreationEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$setEmailEdt$1", m3645f = "UserCreationEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$setEmailEdt$1 */
    static final class C229041 extends ContinuationImpl7 implements Function2<UserCreationEmailViewState, Continuation<? super UserCreationEmailViewState>, Object> {
        final /* synthetic */ String $emailEdt;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229041(String str, Continuation<? super C229041> continuation) {
            super(2, continuation);
            this.$emailEdt = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229041 c229041 = new C229041(this.$emailEdt, continuation);
            c229041.L$0 = obj;
            return c229041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationEmailViewState userCreationEmailViewState, Continuation<? super UserCreationEmailViewState> continuation) {
            return ((C229041) create(userCreationEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationEmailViewState.copy$default((UserCreationEmailViewState) this.L$0, null, false, this.$emailEdt, null, 11, null);
        }
    }

    public final void setEmailEdt(String emailEdt) {
        Intrinsics.checkNotNullParameter(emailEdt, "emailEdt");
        applyMutation(new C229041(emailEdt, null));
    }

    public final void onContinueCtaClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationEmailDuxo.onContinueCtaClicked$lambda$1(this.f$0, (UserCreationEmailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueCtaClicked$lambda$1(UserCreationEmailDuxo userCreationEmailDuxo, UserCreationEmailViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isContinueEnabled()) {
            if (Intrinsics.areEqual(((UserCreationEmailFragment.Args) INSTANCE.getArgs((HasSavedState) userCreationEmailDuxo)).getCountryCode(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                userCreationEmailDuxo.onEmailValidated(it.getTypedEmail());
            } else {
                userCreationEmailDuxo.validateEmailWithSheriff(it.getTypedEmail());
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UserCreationEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$validateEmailWithSheriff$1", m3645f = "UserCreationEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$validateEmailWithSheriff$1 */
    static final class C229051 extends ContinuationImpl7 implements Function2<UserCreationEmailViewState, Continuation<? super UserCreationEmailViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C229051(Continuation<? super C229051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229051 c229051 = new C229051(continuation);
            c229051.L$0 = obj;
            return c229051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationEmailViewState userCreationEmailViewState, Continuation<? super UserCreationEmailViewState> continuation) {
            return ((C229051) create(userCreationEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationEmailViewState.copy$default((UserCreationEmailViewState) this.L$0, null, true, null, null, 13, null);
        }
    }

    /* compiled from: UserCreationEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$validateEmailWithSheriff$2", m3645f = "UserCreationEmailDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$validateEmailWithSheriff$2 */
    static final class C229062 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229062(String str, Continuation<? super C229062> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserCreationEmailDuxo.this.new C229062(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UserCreationEmailDuxo userCreationEmailDuxo;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserStore userStore = UserCreationEmailDuxo.this.userStore;
                        String str = this.$email;
                        this.label = 1;
                        obj = userStore.getUserEmailValidation(str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ApiUserEmailValidationResponse apiUserEmailValidationResponse = (ApiUserEmailValidationResponse) obj;
                    if (apiUserEmailValidationResponse.getIsValid() && apiUserEmailValidationResponse.getDid_you_mean() == null) {
                        UserCreationEmailDuxo.this.onEmailValidated(this.$email);
                    } else {
                        UserCreationEmailDuxo.this.submit(new UserCreationEmailEvent.SuggestedEmail(this.$email, apiUserEmailValidationResponse.getDid_you_mean()));
                    }
                    userCreationEmailDuxo = UserCreationEmailDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                } catch (Throwable unused) {
                    UserCreationEmailDuxo.this.onEmailValidated(this.$email);
                    userCreationEmailDuxo = UserCreationEmailDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                }
                userCreationEmailDuxo.applyMutation(anonymousClass1);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                UserCreationEmailDuxo.this.applyMutation(new AnonymousClass1(null));
                throw th;
            }
        }

        /* compiled from: UserCreationEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$validateEmailWithSheriff$2$1", m3645f = "UserCreationEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$validateEmailWithSheriff$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UserCreationEmailViewState, Continuation<? super UserCreationEmailViewState>, Object> {
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
            public final Object invoke(UserCreationEmailViewState userCreationEmailViewState, Continuation<? super UserCreationEmailViewState> continuation) {
                return ((AnonymousClass1) create(userCreationEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UserCreationEmailViewState.copy$default((UserCreationEmailViewState) this.L$0, null, false, null, null, 13, null);
            }
        }
    }

    private final void validateEmailWithSheriff(String email) {
        applyMutation(new C229051(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C229062(email, null), 3, null);
    }

    /* compiled from: UserCreationEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onEmailValidated$1", m3645f = "UserCreationEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onEmailValidated$1 */
    static final class C229021 extends ContinuationImpl7 implements Function2<UserCreationEmailViewState, Continuation<? super UserCreationEmailViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C229021(Continuation<? super C229021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229021 c229021 = new C229021(continuation);
            c229021.L$0 = obj;
            return c229021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UserCreationEmailViewState userCreationEmailViewState, Continuation<? super UserCreationEmailViewState> continuation) {
            return ((C229021) create(userCreationEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UserCreationEmailViewState.copy$default((UserCreationEmailViewState) this.L$0, null, true, null, null, 13, null);
        }
    }

    /* compiled from: UserCreationEmailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onEmailValidated$2", m3645f = "UserCreationEmailDuxo.kt", m3646l = {92, 111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onEmailValidated$2 */
    static final class C229032 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* compiled from: UserCreationEmailDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onEmailValidated$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EmailWaitlistSpotStatus.values().length];
                try {
                    iArr[EmailWaitlistSpotStatus.VERIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EmailWaitlistSpotStatus.NEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EmailWaitlistSpotStatus.GRANTED_ACCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229032(String str, Continuation<? super C229032> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserCreationEmailDuxo.this.new C229032(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r8.validateEmail(r1, r7) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
        
            if (r8 == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            UserCreationEmailDuxo userCreationEmailDuxo;
            ?? anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
                        if (errorResponseExtractErrorResponse == null) {
                            UserCreationEmailDuxo.this.submit(new UserCreationEmailEvent.GenericError(th));
                        } else if (errorResponseExtractErrorResponse.getFieldError("email") != null) {
                            UserCreationEmailDuxo.this.submit(new UserCreationEmailEvent.DuplicateEmailError(this.$email));
                        } else if (!CollectionsKt.contains(Affiliate.RHSG.INSTANCE.plus(CountryCode.Supported.UnitedKingdom.INSTANCE), ((UserCreationEmailFragment.Args) UserCreationEmailDuxo.INSTANCE.getArgs((HasSavedState) UserCreationEmailDuxo.this)).getCountryCode()) && UserCreationEmailDuxo.this.appType != AppType.RHC) {
                            OnboardingEmailWaitlistApi onboardingEmailWaitlistApi = UserCreationEmailDuxo.this.waitlistApi;
                            String str = this.$email;
                            this.label = 2;
                            obj = onboardingEmailWaitlistApi.getEmailWaitlistSpot("credit_card", str, this);
                            obj2 = coroutine_suspended;
                        } else {
                            UserCreationEmailDuxo.this.submit(new UserCreationEmailEvent.PromotionEmailBottomSheet(this.$email));
                        }
                    }
                } catch (Throwable unused) {
                    UserCreationEmailDuxo.this.submit(new UserCreationEmailEvent.Finish(this.$email, false));
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UserStore userStore = UserCreationEmailDuxo.this.userStore;
                    ApiUser.ValidateEmailRequest validateEmailRequest = new ApiUser.ValidateEmailRequest(this.$email);
                    this.label = 1;
                    obj2 = coroutine_suspended;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        int i2 = WhenMappings.$EnumSwitchMapping$0[((ApiEmailWaitlistSpot) obj).getState().ordinal()];
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            UserCreationEmailDuxo.this.submit(new UserCreationEmailEvent.Finish(this.$email, true));
                        } else {
                            UserCreationEmailDuxo.this.submit(new UserCreationEmailEvent.Finish(this.$email, false));
                        }
                        userCreationEmailDuxo = UserCreationEmailDuxo.this;
                        anonymousClass1 = new AnonymousClass1(null);
                        userCreationEmailDuxo.applyMutation(anonymousClass1);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                userCreationEmailDuxo = UserCreationEmailDuxo.this;
                coroutine_suspended = new AnonymousClass1(null);
                anonymousClass1 = coroutine_suspended;
                userCreationEmailDuxo.applyMutation(anonymousClass1);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                UserCreationEmailDuxo.this.applyMutation(new AnonymousClass1(null));
                throw th2;
            }
        }

        /* compiled from: UserCreationEmailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onEmailValidated$2$1", m3645f = "UserCreationEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onEmailValidated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UserCreationEmailViewState, Continuation<? super UserCreationEmailViewState>, Object> {
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
            public final Object invoke(UserCreationEmailViewState userCreationEmailViewState, Continuation<? super UserCreationEmailViewState> continuation) {
                return ((AnonymousClass1) create(userCreationEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UserCreationEmailViewState.copy$default((UserCreationEmailViewState) this.L$0, null, false, null, null, 13, null);
            }
        }
    }

    public final void onEmailValidated(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        applyMutation(new C229021(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C229032(email, null), 3, null);
    }

    public static /* synthetic */ void onMarketingOptInSubmitted$default(UserCreationEmailDuxo userCreationEmailDuxo, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        userCreationEmailDuxo.onMarketingOptInSubmitted(z, str);
    }

    public final void onMarketingOptInSubmitted(boolean optIn, String email) {
        this.hasOptInForMarketingEmails.set(optIn);
        if (email == null) {
            email = getStateFlow().getValue().getTypedEmail();
        }
        submit(new UserCreationEmailEvent.Finish(email, false, 2, null));
    }

    public final void onVisitJoinWaitlistPage(String waitlistUrl) {
        Intrinsics.checkNotNullParameter(waitlistUrl, "waitlistUrl");
        submit(new UserCreationEmailEvent.GBOnboardingWaitlist(waitlistUrl));
    }
}
