package com.robinhood.android.onboarding.p205ui.usercreation;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.ErrorResponses;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.android.onboarding.databinding.FragmentUserCreationFullNameBinding;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationFullNameFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationFullNameViewState2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UserCreationFullNameFragment.kt */
@Metadata(m3635d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001'\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002DEB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000200H\u0016J\b\u00109\u001a\u000200H\u0016J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u000200H\u0002J\b\u0010>\u001a\u000200H\u0002J\u0010\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020AH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationFullNameBinding;", "getBinding", "()Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationFullNameBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$Callbacks;", "callbacks$delegate", "errorHandler", "com/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$errorHandler$2$1;", "errorHandler$delegate", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent;", "onResume", "onPause", "bind", "state", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;", "onContinueClicked", "createUser", "setContinueEnabled", "isEnabled", "", "onLoading", "isLoading", "Callbacks", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UserCreationFullNameFragment extends BaseFragment implements AutoLoggableFragment {
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    public SharedEventLogger eventLogger;
    private final Screen eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserCreationFullNameFragment.class, "binding", "getBinding()Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationFullNameBinding;", 0)), Reflection.property1(new PropertyReference1Impl(UserCreationFullNameFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UserCreationFullNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$Callbacks;", "", "onUserCreationSuccess", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUserCreationSuccess(CountryCode.Supported locality);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public UserCreationFullNameFragment() {
        super(C22739R.layout.fragment_user_creation_full_name);
        this.eventScreen = new Screen(Screen.Name.USER_CREATION_LEGAL_NAME, null, "name", null, 10, null);
        this.duxo = DuxosKt.duxo(this, UserCreationFullNameDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, UserCreationFullNameFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof UserCreationFullNameFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserCreationFullNameFragment.errorHandler_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    public final SharedEventLogger getEventLogger() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (sharedEventLogger != null) {
            return sharedEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(SharedEventLogger sharedEventLogger) {
        Intrinsics.checkNotNullParameter(sharedEventLogger, "<set-?>");
        this.eventLogger = sharedEventLogger;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCreationFullNameDuxo getDuxo() {
        return (UserCreationFullNameDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentUserCreationFullNameBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentUserCreationFullNameBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final UserCreationFullNameFragment3 getErrorHandler() {
        return (UserCreationFullNameFragment3) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$errorHandler$2$1] */
    public static final UserCreationFullNameFragment3 errorHandler_delegate$lambda$0(final UserCreationFullNameFragment userCreationFullNameFragment) {
        final FragmentActivity fragmentActivityRequireActivity = userCreationFullNameFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, false, 0, null, 14, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
            public boolean handleErrorResponse(ErrorResponse errorResponse) {
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                String[] strArr = {"first_name", "last_name"};
                RdsTextInputContainerView userCreationFirstNameInputContainer = this.this$0.getBinding().userCreationFirstNameInputContainer;
                Intrinsics.checkNotNullExpressionValue(userCreationFirstNameInputContainer, "userCreationFirstNameInputContainer");
                Views.applyError(userCreationFirstNameInputContainer, errorResponse, strArr[0]);
                RdsTextInputContainerView userCreationLastNameInputContainer = this.this$0.getBinding().userCreationLastNameInputContainer;
                Intrinsics.checkNotNullExpressionValue(userCreationLastNameInputContainer, "userCreationLastNameInputContainer");
                Views.applyError(userCreationLastNameInputContainer, errorResponse, strArr[1]);
                return ErrorResponses.containsError(errorResponse, strArr) || super.handleErrorResponse(errorResponse);
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return requireBaseActivity().getScreenSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsTextInputEditText userCreationFirstNameInput = getBinding().userCreationFirstNameInput;
        Intrinsics.checkNotNullExpressionValue(userCreationFirstNameInput, "userCreationFirstNameInput");
        RdsTextInputEditText userCreationLastNameInput = getBinding().userCreationLastNameInput;
        Intrinsics.checkNotNullExpressionValue(userCreationLastNameInput, "userCreationLastNameInput");
        if (getAppType() == AppType.RHC) {
            getBinding().userCreationFullNameTitle.setText(C22739R.string.rhc_user_creation_full_name_title);
            getBinding().userCreationFullNameSubtitle.setText(C22739R.string.rhc_user_creation_full_name_subtitle);
            userCreationLastNameInput.setHint(C22739R.string.rhc_user_creation_surname_input_hint);
        } else {
            getBinding().userCreationFullNameTitle.setText(C22739R.string.user_creation_full_name_title);
            getBinding().userCreationFullNameSubtitle.setText(C22739R.string.user_creation_full_name_subtitle);
            userCreationLastNameInput.setHint(C22739R.string.user_creation_last_name_input_hint);
        }
        userCreationFirstNameInput.setSingleLine();
        userCreationLastNameInput.setSingleLine();
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            userCreationFirstNameInput.setText(((ApiUser.CreateUserRequest) companion.getArgs((Fragment) this)).getFirst_name());
            userCreationLastNameInput.setText(((ApiUser.CreateUserRequest) companion.getArgs((Fragment) this)).getLast_name());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            userCreationFirstNameInput.setImportantForAutofill(1);
            userCreationFirstNameInput.setAutofillHints(new String[]{"given-name", "firstname"});
            userCreationLastNameInput.setImportantForAutofill(1);
            userCreationLastNameInput.setAutofillHints(new String[]{"family-name", "lastname"});
        }
        BaseFragment.collectDuxoState$default(this, null, new C229231(userCreationLastNameInput, null), 1, null);
    }

    /* compiled from: UserCreationFullNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1", m3645f = "UserCreationFullNameFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1 */
    static final class C229231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RdsTextInputEditText $lastnameEdt;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C229231(RdsTextInputEditText rdsTextInputEditText, Continuation<? super C229231> continuation) {
            super(2, continuation);
            this.$lastnameEdt = rdsTextInputEditText;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C229231 c229231 = UserCreationFullNameFragment.this.new C229231(this.$lastnameEdt, continuation);
            c229231.L$0 = obj;
            return c229231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C229231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UserCreationFullNameFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$1", m3645f = "UserCreationFullNameFragment.kt", m3646l = {111}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UserCreationFullNameFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UserCreationFullNameFragment userCreationFullNameFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = userCreationFullNameFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UserCreationFullNameFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C503121 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ UserCreationFullNameFragment $tmp0;

                C503121(UserCreationFullNameFragment userCreationFullNameFragment) {
                    this.$tmp0 = userCreationFullNameFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, UserCreationFullNameFragment.class, "bind", "bind(Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(UserCreationFullNameViewState userCreationFullNameViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, userCreationFullNameViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((UserCreationFullNameViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<UserCreationFullNameViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C503121 c503121 = new C503121(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c503121, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bind(UserCreationFullNameFragment userCreationFullNameFragment, UserCreationFullNameViewState userCreationFullNameViewState, Continuation continuation) {
                userCreationFullNameFragment.bind(userCreationFullNameViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(UserCreationFullNameFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(UserCreationFullNameFragment.this, this.$lastnameEdt, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(UserCreationFullNameFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: UserCreationFullNameFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$2", m3645f = "UserCreationFullNameFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ RdsTextInputEditText $lastnameEdt;
            int label;
            final /* synthetic */ UserCreationFullNameFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UserCreationFullNameFragment userCreationFullNameFragment, RdsTextInputEditText rdsTextInputEditText, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = userCreationFullNameFragment;
                this.$lastnameEdt = rdsTextInputEditText;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$lastnameEdt, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UserCreationFullNameFragment userCreationFullNameFragment = this.this$0;
                RdsButton userCreationFullNamePrimaryCta = userCreationFullNameFragment.getBinding().userCreationFullNamePrimaryCta;
                Intrinsics.checkNotNullExpressionValue(userCreationFullNamePrimaryCta, "userCreationFullNamePrimaryCta");
                Observable observableMerge = Observable.merge(RxView.clicks(userCreationFullNamePrimaryCta), this.$lastnameEdt.onEnterOrDonePressed());
                Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
                UserCreationFullNameFragment userCreationFullNameFragment2 = this.this$0;
                final StateFlow<UserCreationFullNameViewState> stateFlow = userCreationFullNameFragment2.getDuxo().getStateFlow();
                ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(userCreationFullNameFragment, ObservablesKt.connectWhen$default(observableMerge, ObservablesAndroid.observeOnMainThread(userCreationFullNameFragment2.asObservable(new Flow<Boolean>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "UserCreationFullNameFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Boolean boolBoxBoolean = boxing.boxBoolean(((UserCreationFullNameViewState) obj).getCanSubmitRequest());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                })), null, 2, null), (LifecycleEvent) null, 1, (Object) null);
                final UserCreationFullNameFragment userCreationFullNameFragment3 = this.this$0;
                scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UserCreationFullNameFragment.C229231.AnonymousClass2.invokeSuspend$lambda$1(userCreationFullNameFragment3, obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(UserCreationFullNameFragment userCreationFullNameFragment, Object obj) {
                userCreationFullNameFragment.onContinueClicked();
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UserCreationFullNameFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$3", m3645f = "UserCreationFullNameFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UserCreationFullNameFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(UserCreationFullNameFragment userCreationFullNameFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = userCreationFullNameFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final UserCreationFullNameFragment userCreationFullNameFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment.onViewCreated.1.3.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<UserCreationFullNameViewState2>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<UserCreationFullNameViewState2> event, Continuation<? super Unit> continuation) {
                            EventConsumer<UserCreationFullNameViewState2> eventConsumerInvoke;
                            final UserCreationFullNameFragment userCreationFullNameFragment2 = userCreationFullNameFragment;
                            if ((event.getData() instanceof UserCreationFullNameViewState2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$onViewCreated$1$3$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16864invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16864invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        userCreationFullNameFragment2.handleEvent((UserCreationFullNameViewState2) event.getData());
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(UserCreationFullNameViewState2 event) {
        if (event instanceof UserCreationFullNameViewState2.UserCreationEvent) {
            createUser();
            return;
        }
        if (event instanceof UserCreationFullNameViewState2.UserCreationSuccessEvent) {
            Callbacks callbacks = getCallbacks();
            ApiUser.Origin origin = ((ApiUser.CreateUserRequest) INSTANCE.getArgs((Fragment) this)).getOrigin();
            callbacks.onUserCreationSuccess(origin != null ? origin.getLocality() : null);
        } else {
            if (!(event instanceof UserCreationFullNameViewState2.UserCreationErrorEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            AbsErrorHandler.handleError$default(getErrorHandler(), ((UserCreationFullNameViewState2.UserCreationErrorEvent) event).getError(), false, 2, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText userCreationFirstNameInput = getBinding().userCreationFirstNameInput;
        Intrinsics.checkNotNullExpressionValue(userCreationFirstNameInput, "userCreationFirstNameInput");
        BaseFragment.keyboardFocusOn$default(this, userCreationFirstNameInput, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(UserCreationFullNameViewState state) {
        onLoading(state.isLoading());
        setContinueEnabled(state.getAreFieldsFilled());
        RdsTextInputEditText userCreationLastNameInput = getBinding().userCreationLastNameInput;
        Intrinsics.checkNotNullExpressionValue(userCreationLastNameInput, "userCreationLastNameInput");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(userCreationLastNameInput), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationFullNameFragment.bind$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        RdsTextInputEditText userCreationFirstNameInput = getBinding().userCreationFirstNameInput;
        Intrinsics.checkNotNullExpressionValue(userCreationFirstNameInput, "userCreationFirstNameInput");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(userCreationFirstNameInput), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationFullNameFragment.bind$lambda$2(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(UserCreationFullNameFragment userCreationFullNameFragment, CharSequence lastNameEdt) {
        Intrinsics.checkNotNullParameter(lastNameEdt, "lastNameEdt");
        EventLogger.DefaultImpls.logType$default(userCreationFullNameFragment.getEventLogger(), null, userCreationFullNameFragment.getEventScreen(), new Component(Component.ComponentType.TEXT_FIELD, "surname", null, 4, null), null, null, 25, null);
        userCreationFullNameFragment.getDuxo().setLastName(lastNameEdt.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(UserCreationFullNameFragment userCreationFullNameFragment, CharSequence firstNameEdt) {
        Intrinsics.checkNotNullParameter(firstNameEdt, "firstNameEdt");
        EventLogger.DefaultImpls.logType$default(userCreationFullNameFragment.getEventLogger(), null, userCreationFullNameFragment.getEventScreen(), new Component(Component.ComponentType.TEXT_FIELD, "first_name", null, 4, null), null, null, 25, null);
        userCreationFullNameFragment.getDuxo().setFirstName(firstNameEdt.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContinueClicked() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 57, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Activity.hideKeyboard$default(activity, false, 1, null);
        }
        getDuxo().onContinueClicked();
    }

    private final void createUser() {
        getDuxo().createUser(String.valueOf(getBinding().userCreationFirstNameInput.getText()), String.valueOf(getBinding().userCreationLastNameInput.getText()));
    }

    private final void setContinueEnabled(boolean isEnabled) {
        getBinding().userCreationFullNamePrimaryCta.setEnabled(isEnabled);
    }

    private final void onLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        getBinding().userCreationFullNamePrimaryCta.setLoading(isLoading);
        getBinding().userCreationFirstNameInput.setEnabled(!isLoading);
        getBinding().userCreationLastNameInput.setEnabled(!isLoading);
    }

    /* compiled from: UserCreationFullNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameFragment;", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UserCreationFullNameFragment, ApiUser.CreateUserRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiUser.CreateUserRequest getArgs(UserCreationFullNameFragment userCreationFullNameFragment) {
            return (ApiUser.CreateUserRequest) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, userCreationFullNameFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UserCreationFullNameFragment newInstance(ApiUser.CreateUserRequest createUserRequest) {
            return (UserCreationFullNameFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, createUserRequest);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UserCreationFullNameFragment userCreationFullNameFragment, ApiUser.CreateUserRequest createUserRequest) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, userCreationFullNameFragment, createUserRequest);
        }
    }
}
