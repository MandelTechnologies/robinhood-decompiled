package com.robinhood.android.referral.onboardingtakeover;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.Validation;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverState;
import com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverState2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ReferralLandingSdui;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.models.api.sheriff.ApiUserEmailValidationResponse;
import com.robinhood.models.serverdriven.experimental.api.TextInput;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnboardingTakeoverDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverViewState;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "onboardingTakeoverStateProvider", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "validateEmail", "email", "", "validateEmailWithSheriff", "onEmailConfirmed", "acceptedSuggestion", "", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class OnboardingTakeoverDuxo extends BaseDuxo3<OnboardingTakeoverState, OnboardingTakeoverViewState, OnboardingTakeoverState2> implements HasSavedState {
    private final AnalyticsLogger analytics;
    private final EventLogger eventLogger;
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
    public OnboardingTakeoverDuxo(AnalyticsLogger analytics, EventLogger eventLogger, UserStore userStore, OnboardingTakeoverStateProvider onboardingTakeoverStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OnboardingTakeoverState.Fresh((ReferralLandingSdui) INSTANCE.getArgs(savedStateHandle)), onboardingTakeoverStateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(onboardingTakeoverStateProvider, "onboardingTakeoverStateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: OnboardingTakeoverDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDuxo;", "Lcom/robinhood/models/api/ReferralLandingSdui;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OnboardingTakeoverDuxo, ReferralLandingSdui> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReferralLandingSdui getArgs(SavedStateHandle savedStateHandle) {
            return (ReferralLandingSdui) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReferralLandingSdui getArgs(OnboardingTakeoverDuxo onboardingTakeoverDuxo) {
            return (ReferralLandingSdui) DuxoCompanion.DefaultImpls.getArgs(this, onboardingTakeoverDuxo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Object next;
        super.onCreate();
        Companion companion = INSTANCE;
        if (((ReferralLandingSdui) companion.getArgs((HasSavedState) this)).getClient_should_log_started_signup()) {
            this.analytics.logUserAction(AnalyticsStrings.USER_ACTION_STARTED_USER_SIGNUP);
        }
        Iterator<T> it = ((ReferralLandingSdui) companion.getArgs((HasSavedState) this)).getBody_components().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((UIComponent) next) instanceof TextInput) {
                    break;
                }
            }
        }
        if (((UIComponent) next) != null) {
            AnalyticsLogger.DefaultImpls.buildTransitionEvent$default(this.analytics, null, "UserCreationEmailFragment", null, null, null, null, null, null, null, null, 1000, 1, null).send();
            EventLogger eventLogger = this.eventLogger;
            String str = null;
            String str2 = "sdui";
            Screen screen = new Screen(Screen.Name.USER_CREATION_EMAIL, str, str2, null, 10, null);
            UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.SCREEN_TRANSITION_APPEAR;
            int i = EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
            Object[] objArr = 0 == true ? 1 : 0;
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, screen, null, objArr, null, 0 == true ? 1 : 0, null, i, null), false, false, 6, null);
        }
    }

    public final void validateEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        if (Validation.INSTANCE.isEmailValid(email)) {
            validateEmailWithSheriff(email);
        } else {
            submit(new OnboardingTakeoverState2.InvalidEmailError(email));
        }
    }

    /* compiled from: OnboardingTakeoverDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$validateEmailWithSheriff$1", m3645f = "OnboardingTakeoverDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$validateEmailWithSheriff$1 */
    /* loaded from: classes5.dex */
    static final class C267521 extends ContinuationImpl7 implements Function2<OnboardingTakeoverState, Continuation<? super OnboardingTakeoverState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C267521(Continuation<? super C267521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C267521 c267521 = new C267521(continuation);
            c267521.L$0 = obj;
            return c267521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OnboardingTakeoverState onboardingTakeoverState, Continuation<? super OnboardingTakeoverState> continuation) {
            return ((C267521) create(onboardingTakeoverState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new OnboardingTakeoverState.LoadingChanged(((OnboardingTakeoverState) this.L$0).getContent(), true);
        }
    }

    private final void validateEmailWithSheriff(String email) {
        applyMutation(new C267521(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C267532(email, null), 3, null);
    }

    /* compiled from: OnboardingTakeoverDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$validateEmailWithSheriff$2", m3645f = "OnboardingTakeoverDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$validateEmailWithSheriff$2 */
    /* loaded from: classes5.dex */
    static final class C267532 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C267532(String str, Continuation<? super C267532> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnboardingTakeoverDuxo.this.new C267532(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C267532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            OnboardingTakeoverDuxo onboardingTakeoverDuxo;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserStore userStore = OnboardingTakeoverDuxo.this.userStore;
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
                        OnboardingTakeoverDuxo.onEmailConfirmed$default(OnboardingTakeoverDuxo.this, this.$email, false, 2, null);
                    } else {
                        OnboardingTakeoverDuxo.this.submit(new OnboardingTakeoverState2.SuggestedEmail(this.$email, apiUserEmailValidationResponse.getDid_you_mean()));
                    }
                    onboardingTakeoverDuxo = OnboardingTakeoverDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                } catch (Throwable th) {
                    OnboardingTakeoverDuxo.this.applyMutation(new AnonymousClass1(null));
                    throw th;
                }
            } catch (Throwable unused) {
                OnboardingTakeoverDuxo.onEmailConfirmed$default(OnboardingTakeoverDuxo.this, this.$email, false, 2, null);
                onboardingTakeoverDuxo = OnboardingTakeoverDuxo.this;
                anonymousClass1 = new AnonymousClass1(null);
            }
            onboardingTakeoverDuxo.applyMutation(anonymousClass1);
            return Unit.INSTANCE;
        }

        /* compiled from: OnboardingTakeoverDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$validateEmailWithSheriff$2$1", m3645f = "OnboardingTakeoverDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$validateEmailWithSheriff$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OnboardingTakeoverState, Continuation<? super OnboardingTakeoverState>, Object> {
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
            public final Object invoke(OnboardingTakeoverState onboardingTakeoverState, Continuation<? super OnboardingTakeoverState> continuation) {
                return ((AnonymousClass1) create(onboardingTakeoverState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new OnboardingTakeoverState.LoadingChanged(((OnboardingTakeoverState) this.L$0).getContent(), false);
            }
        }
    }

    public static /* synthetic */ void onEmailConfirmed$default(OnboardingTakeoverDuxo onboardingTakeoverDuxo, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        onboardingTakeoverDuxo.onEmailConfirmed(str, z);
    }

    /* compiled from: OnboardingTakeoverDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$1", m3645f = "OnboardingTakeoverDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$1 */
    /* loaded from: classes5.dex */
    static final class C267491 extends ContinuationImpl7 implements Function2<OnboardingTakeoverState, Continuation<? super OnboardingTakeoverState>, Object> {
        final /* synthetic */ String $email;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C267491(String str, Continuation<? super C267491> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C267491 c267491 = new C267491(this.$email, continuation);
            c267491.L$0 = obj;
            return c267491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OnboardingTakeoverState onboardingTakeoverState, Continuation<? super OnboardingTakeoverState> continuation) {
            return ((C267491) create(onboardingTakeoverState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new OnboardingTakeoverState.EmailSuggestionAccepted(((OnboardingTakeoverState) this.L$0).getContent(), this.$email);
        }
    }

    public final void onEmailConfirmed(String email, boolean acceptedSuggestion) {
        Intrinsics.checkNotNullParameter(email, "email");
        if (acceptedSuggestion) {
            applyMutation(new C267491(email, null));
        }
        applyMutation(new C267502(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C267513(email, null), 3, null);
    }

    /* compiled from: OnboardingTakeoverDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$2", m3645f = "OnboardingTakeoverDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$2 */
    /* loaded from: classes5.dex */
    static final class C267502 extends ContinuationImpl7 implements Function2<OnboardingTakeoverState, Continuation<? super OnboardingTakeoverState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C267502(Continuation<? super C267502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C267502 c267502 = new C267502(continuation);
            c267502.L$0 = obj;
            return c267502;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OnboardingTakeoverState onboardingTakeoverState, Continuation<? super OnboardingTakeoverState> continuation) {
            return ((C267502) create(onboardingTakeoverState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new OnboardingTakeoverState.LoadingChanged(((OnboardingTakeoverState) this.L$0).getContent(), true);
        }
    }

    /* compiled from: OnboardingTakeoverDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$3", m3645f = "OnboardingTakeoverDuxo.kt", m3646l = {119}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$3 */
    /* loaded from: classes5.dex */
    static final class C267513 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C267513(String str, Continuation<? super C267513> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnboardingTakeoverDuxo.this.new C267513(this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C267513) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object success;
            OnboardingTakeoverDuxo onboardingTakeoverDuxo;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UserStore userStore = OnboardingTakeoverDuxo.this.userStore;
                    ApiUser.ValidateEmailRequest validateEmailRequest = new ApiUser.ValidateEmailRequest(this.$email);
                    this.label = 1;
                    if (userStore.validateEmail(validateEmailRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                onboardingTakeoverDuxo = OnboardingTakeoverDuxo.this;
                anonymousClass1 = new AnonymousClass1(null);
            } catch (Throwable th) {
                try {
                    ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
                    OnboardingTakeoverDuxo onboardingTakeoverDuxo2 = OnboardingTakeoverDuxo.this;
                    if (errorResponseExtractErrorResponse == null) {
                        success = new OnboardingTakeoverState2.GenericError(th);
                    } else if (errorResponseExtractErrorResponse.getFieldError("email") != null) {
                        success = new OnboardingTakeoverState2.DuplicateEmailError(this.$email);
                    } else {
                        if (((ReferralLandingSdui) OnboardingTakeoverDuxo.INSTANCE.getArgs((HasSavedState) OnboardingTakeoverDuxo.this)).getTheme() != ColorTheme.DARK) {
                            z = false;
                        }
                        success = new OnboardingTakeoverState2.Success(this.$email, z);
                    }
                    onboardingTakeoverDuxo2.submit(success);
                    onboardingTakeoverDuxo = OnboardingTakeoverDuxo.this;
                    anonymousClass1 = new AnonymousClass1(null);
                } catch (Throwable th2) {
                    OnboardingTakeoverDuxo.this.applyMutation(new AnonymousClass1(null));
                    throw th2;
                }
            }
            onboardingTakeoverDuxo.applyMutation(anonymousClass1);
            return Unit.INSTANCE;
        }

        /* compiled from: OnboardingTakeoverDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$3$1", m3645f = "OnboardingTakeoverDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverDuxo$onEmailConfirmed$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OnboardingTakeoverState, Continuation<? super OnboardingTakeoverState>, Object> {
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
            public final Object invoke(OnboardingTakeoverState onboardingTakeoverState, Continuation<? super OnboardingTakeoverState> continuation) {
                return ((AnonymousClass1) create(onboardingTakeoverState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new OnboardingTakeoverState.LoadingChanged(((OnboardingTakeoverState) this.L$0).getContent(), false);
            }
        }
    }
}
