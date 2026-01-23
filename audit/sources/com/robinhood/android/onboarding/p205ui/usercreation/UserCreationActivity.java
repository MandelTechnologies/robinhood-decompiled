package com.robinhood.android.onboarding.p205ui.usercreation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import com.robinhood.android.onboarding.contracts.PostUserCreationShimIntentKey;
import com.robinhood.android.onboarding.p205ui.OnboardingMonochromeOverlay;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationFullNameFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState2;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationState;
import com.robinhood.android.onboarding.p205ui.usercreation.loading.UserCreationLoadingFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.UserCreationRegionFragmentKey;
import com.robinhood.shared.user.contracts.UserCreationRegionSelectorFragmentKey;
import com.robinhood.shared.user.contracts.UserCreationUnsupportedRegionFragmentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UserCreationActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001IB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020(H\u0014J\b\u0010,\u001a\u00020&H\u0016J\b\u0010-\u001a\u00020&H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u00020(H\u0016J\b\u00101\u001a\u00020(H\u0016J\u0010\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020(2\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0018\u00109\u001a\u00020(2\u0006\u0010/\u001a\u00020\u00162\u0006\u0010:\u001a\u00020&H\u0016J\u0010\u0010;\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0016H\u0002J\u0018\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0016H\u0016J\u0010\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020AH\u0016J\u0012\u0010B\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0018\u0010E\u001a\u00020(2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010GH\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingFragment$Callbacks;", "Lcom/robinhood/shared/user/contracts/UserCreationRegionFragmentKey$Callbacks;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Callbacks;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment$Callbacks;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$Callbacks;", "<init>", "()V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "duxo", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "createUserRequest", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "getCreateUserRequest", "()Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "createUserRequest$delegate", "Lkotlin/properties/ReadWriteProperty;", "fromCcWaitlist", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "requiresAuthentication", "shouldPromptForLockscreen", "onAlreadyHaveAnAcctClicked", "email", "onUserCreationStartsWithRegion", "onUserCreationStartsWithEmail", "onUserRegionConfirmed", "regionCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "onUnsupportedRegionSelected", "unsupportedRegionFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "onRegionDropdownClicked", "onEmailFragmentFinished", "isFromCcWaitlist", "onEmailReady", "onEmailOrUsernameFailed", "errorText", "analyticsTag", "onPasswordFinished", "state", "Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;", "onUserCreationSuccess", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEvent;", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UserCreationActivity extends BaseActivity implements UserCreationLoadingFragment.Callbacks, UserCreationRegionFragmentKey.Callbacks, UserCreationEmailFragment.Callbacks, UserCreationPasswordFragment.Callbacks, UserCreationFullNameFragment.Callbacks {
    public AnalyticsLogger analytics;
    public AuthManager authManager;

    /* renamed from: createUserRequest$delegate, reason: from kotlin metadata */
    private final Interfaces3 createUserRequest;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean fromCcWaitlist;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserCreationActivity.class, "createUserRequest", "getCreateUserRequest()Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UserCreationActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserCreationFlow.values().length];
            try {
                iArr[UserCreationFlow.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserCreationFlow.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(final Event<UserCreationState> event) {
        EventConsumer<UserCreationState> eventConsumerInvoke;
        if (event == null || !(event.getData() instanceof UserCreationState) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationActivity$handleDuxoEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m16861invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16861invoke(Object it) {
                Fragment fragmentNewInstance;
                Intrinsics.checkNotNullParameter(it, "it");
                UserCreationState userCreationState = (UserCreationState) event.getData();
                UserCreationEmailFragment.Args args = new UserCreationEmailFragment.Args((UserCreation) UserCreationActivity.INSTANCE.getExtras((Activity) this), userCreationState.getCountryCode());
                if (userCreationState instanceof UserCreationState.ShowEmailInput) {
                    fragmentNewInstance = UserCreationEmailFragment.INSTANCE.newInstance((Parcelable) args);
                } else {
                    if (!(userCreationState instanceof UserCreationState.ShowEmailInputWithRewardsTakeover)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fragmentNewInstance = UserCreationRewardsEmailFragment.Companion.newInstance((Parcelable) args);
                }
                this.replaceFragment(fragmentNewInstance);
            }
        });
    }

    public UserCreationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, UserCreationDuxo.class);
        this.createUserRequest = (Interfaces3) BindSavedState2.savedParcelable(this, new ApiUser.CreateUserRequest(null, null, null, null, null, null, null, null, null, null, null, 2047, null)).provideDelegate(this, $$delegatedProperties[0]);
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return ((UserCreation) INSTANCE.getExtras((Activity) this)).getSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCreationDuxo getDuxo() {
        return (UserCreationDuxo) this.duxo.getValue();
    }

    private final ApiUser.CreateUserRequest getCreateUserRequest() {
        return (ApiUser.CreateUserRequest) this.createUserRequest.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), OnboardingMonochromeOverlay.INSTANCE, null, 2, null);
        Companion companion = INSTANCE;
        if (((UserCreation) companion.getExtras((Activity) this)).getForceDarkTheme()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        BaseActivity.collectDuxoState$default(this, null, new C229011(null), 1, null);
        if (savedInstanceState == null) {
            if (getAuthManager().isLoggedIn()) {
                Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new PostUserCreationShimIntentKey(false, null, ((UserCreation) companion.getExtras((Activity) this)).getSource(), ((UserCreation) companion.getExtras((Activity) this)).getForceDarkTheme(), UserCreationActivity2.getOnboardingFlowPathType((UserCreation) companion.getExtras((Activity) this)), 3, null), null, false, null, null, 60, null);
                finish();
                return;
            }
            getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_STARTED_USER_SIGNUP);
            int i = WhenMappings.$EnumSwitchMapping$0[((UserCreation) companion.getExtras((Activity) this)).getFlow().ordinal()];
            if (i == 1) {
                setFragment(C11048R.id.fragment_container, UserCreationLoadingFragment.INSTANCE.newInstance());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), UserCreationRegionFragmentKey.INSTANCE, null, 2, null));
            }
        }
    }

    /* compiled from: UserCreationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationActivity$onCreate$1", m3645f = "UserCreationActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationActivity$onCreate$1 */
    static final class C229011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C229011(Continuation<? super C229011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229011 c229011 = UserCreationActivity.this.new C229011(continuation);
            c229011.L$0 = obj;
            return c229011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UserCreationActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationActivity$onCreate$1$1", m3645f = "UserCreationActivity.kt", m3646l = {73}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UserCreationActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UserCreationActivity userCreationActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = userCreationActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UserCreationActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C503101 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ UserCreationActivity $tmp0;

                C503101(UserCreationActivity userCreationActivity) {
                    this.$tmp0 = userCreationActivity;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, UserCreationActivity.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<UserCreationState> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleDuxoEvent = AnonymousClass1.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<UserCreationState>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Event<UserCreationState>> eventFlow = this.this$0.getDuxo().getEventFlow();
                    C503101 c503101 = new C503101(this.this$0);
                    this.label = 1;
                    if (eventFlow.collect(c503101, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(UserCreationActivity userCreationActivity, Event event, Continuation continuation) {
                userCreationActivity.handleDuxoEvent(event);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(UserCreationActivity.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ScarletManager.removeOverlay$default(ScarletManager2.getScarletManager(this), OnboardingMonochromeOverlay.INSTANCE.getPriority(), null, 2, null);
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment.Callbacks
    public void onAlreadyHaveAnAcctClicked(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Login(email, ((UserCreation) INSTANCE.getExtras((Activity) this)).getLoginInsteadExitDeepLinkOverride(), false, 4, null), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingFragment.Callbacks
    public void onUserCreationStartsWithRegion() {
        replaceFragmentWithoutAnimationAndBackStack(Navigator.DefaultImpls.createFragment$default(getNavigator(), UserCreationRegionFragmentKey.INSTANCE, null, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingFragment.Callbacks
    public void onUserCreationStartsWithEmail() {
        Fragment fragmentNewInstance;
        Companion companion = INSTANCE;
        String emailAddress = ((UserCreation) companion.getExtras((Activity) this)).getEmailAddress();
        if (emailAddress == null) {
            fragmentNewInstance = UserCreationEmailFragment.INSTANCE.newInstance((Parcelable) new UserCreationEmailFragment.Args((UserCreation) companion.getExtras((Activity) this), null, 2, 0 == true ? 1 : 0));
        } else {
            onEmailReady(emailAddress);
            fragmentNewInstance = UserCreationPasswordFragment.INSTANCE.newInstance((Parcelable) getCreateUserRequest());
        }
        replaceFragmentWithoutAnimationAndBackStack(fragmentNewInstance);
    }

    @Override // com.robinhood.shared.user.contracts.UserCreationRegionFragmentKey.Callbacks
    public void onUserRegionConfirmed(CountryCode regionCode) {
        Intrinsics.checkNotNullParameter(regionCode, "regionCode");
        if (regionCode instanceof CountryCode.Supported) {
            getCreateUserRequest().setOrigin(new ApiUser.Origin((CountryCode.Supported) regionCode));
            getDuxo().launchEmailInput(((UserCreation) INSTANCE.getExtras((Activity) this)).getFlow(), regionCode);
        } else {
            if (!(regionCode instanceof CountryCode.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            onUnsupportedRegionSelected(UserCreationUnsupportedRegionFragmentKey.INSTANCE);
        }
    }

    @Override // com.robinhood.shared.user.contracts.UserCreationRegionFragmentKey.Callbacks
    public void onUnsupportedRegionSelected(FragmentKey unsupportedRegionFragmentKey) {
        Intrinsics.checkNotNullParameter(unsupportedRegionFragmentKey, "unsupportedRegionFragmentKey");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), unsupportedRegionFragmentKey, null, 2, null));
    }

    @Override // com.robinhood.shared.user.contracts.UserCreationRegionFragmentKey.Callbacks
    public void onRegionDropdownClicked(CountryCode regionCode) {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new UserCreationRegionSelectorFragmentKey(regionCode), null, 2, null));
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailFragment.Callbacks
    public void onEmailFragmentFinished(String email, boolean isFromCcWaitlist) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.fromCcWaitlist = isFromCcWaitlist;
        onEmailReady(email);
        replaceFragment(UserCreationPasswordFragment.INSTANCE.newInstance((Parcelable) getCreateUserRequest()));
    }

    private final void onEmailReady(String email) {
        getCreateUserRequest().setEmail(email);
        getCreateUserRequest().setUsername(email);
        getAnalytics().onUserChanged(email, null);
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment.Callbacks
    public void onEmailOrUsernameFailed(String errorText, String analyticsTag) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        Intrinsics.checkNotNullParameter(analyticsTag, "analyticsTag");
        getAnalytics().logError(AnalyticsStrings.ERROR_EMAIL_OR_USER_NAME_NOT_ELIGIBLE, analyticsTag);
        RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setTitle(C22739R.string.user_creation_email_error_title, new Object[0]).setMessage(errorText);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, "email-or-username-err", false, 4, null);
        popLastFragment();
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment.Callbacks
    public void onPasswordFinished(UserCreationPasswordViewState2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof UserCreationPasswordViewState2.Password) {
            getCreateUserRequest().setPassword(((UserCreationPasswordViewState2.Password) state).getPassword());
            replaceFragment(UserCreationFullNameFragment.INSTANCE.newInstance((Parcelable) getCreateUserRequest()));
        } else {
            if (!(state instanceof UserCreationPasswordViewState2.User)) {
                throw new NoWhenBranchMatchedException();
            }
            ApiUser.Origin origin = getCreateUserRequest().getOrigin();
            onUserCreationSuccess(origin != null ? origin.getLocality() : null);
        }
    }

    @Override // com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment.Callbacks
    public void onUserCreationSuccess(CountryCode.Supported locality) {
        String iso3166CountryCode;
        OnboardingFlowPathType onboardingFlowPathType;
        if (locality == null || (iso3166CountryCode = locality.getIso3166CountryCode()) == null) {
            iso3166CountryCode = "";
        }
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_FINISHED_USER_SIGNUP, null, null, "locality: " + iso3166CountryCode, 6, null);
        Intent intentAddFlags = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, 12, null).addFlags(268468224);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        Navigator navigator = getNavigator();
        Companion companion = INSTANCE;
        String source = ((UserCreation) companion.getExtras((Activity) this)).getSource();
        if (!this.fromCcWaitlist) {
            onboardingFlowPathType = UserCreationActivity2.getOnboardingFlowPathType((UserCreation) companion.getExtras((Activity) this));
        } else {
            onboardingFlowPathType = OnboardingFlowPathType.CreditCard.INSTANCE;
        }
        startActivities(new Intent[]{intentAddFlags, Navigator.DefaultImpls.createIntent$default(navigator, this, new PostUserCreationShimIntentKey(true, null, source, ((UserCreation) companion.getExtras((Activity) this)).getForceDarkTheme(), onboardingFlowPathType, 2, null), null, false, 12, null)});
        finish();
    }

    /* compiled from: UserCreationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationActivity;", "Lcom/robinhood/shared/user/contracts/auth/UserCreation;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<UserCreationActivity, UserCreation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public UserCreation getExtras(UserCreationActivity userCreationActivity) {
            return (UserCreation) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, userCreationActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, UserCreation userCreation) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, userCreation);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, UserCreation userCreation) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, userCreation);
        }
    }
}
