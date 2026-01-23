package com.robinhood.android.onboarding.p205ui.usercreation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.android.onboarding.databinding.FragmentUserCreationPasswordBinding;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordFragment;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState3;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState4;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: UserCreationPasswordFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0002;<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016J\u0010\u00102\u001a\u00020+2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u000207H\u0002J\b\u0010:\u001a\u00020+H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordDuxo;", "getDuxo", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationPasswordBinding;", "getBinding", "()Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationPasswordBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment$Callbacks;", "callbacks$delegate", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "screenSource", "", "getScreenSource", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "bind", "state", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;", "onLoading", "isLoading", "", "setContinueEnabled", "isEnabled", "onContinueClicked", "Callbacks", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UserCreationPasswordFragment extends BaseFragment implements AutoLoggableFragment {
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UserCreationPasswordFragment.class, "binding", "getBinding()Lcom/robinhood/android/onboarding/databinding/FragmentUserCreationPasswordBinding;", 0)), Reflection.property1(new PropertyReference1Impl(UserCreationPasswordFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UserCreationPasswordFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment$Callbacks;", "", "onEmailOrUsernameFailed", "", "errorText", "", "analyticsTag", "onPasswordFinished", "state", "Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEmailOrUsernameFailed(String errorText, String analyticsTag);

        void onPasswordFinished(UserCreationPasswordViewState2 state);
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

    public UserCreationPasswordFragment() {
        super(C22739R.layout.fragment_user_creation_password);
        this.eventScreen = new Screen(Screen.Name.USER_CREATION_PASSWORD, null, "password", null, 10, null);
        this.duxo = OldDuxos.oldDuxo(this, UserCreationPasswordDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, UserCreationPasswordFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof UserCreationPasswordFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final UserCreationPasswordDuxo getDuxo() {
        return (UserCreationPasswordDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentUserCreationPasswordBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentUserCreationPasswordBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
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

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
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
        if (getAppType() == AppType.RHC) {
            getBinding().userCreationPasswordTitle.setText(C22739R.string.rhc_user_creation_choose_password_title);
            RhTextView userCreationPasswordSubtitle = getBinding().userCreationPasswordSubtitle;
            Intrinsics.checkNotNullExpressionValue(userCreationPasswordSubtitle, "userCreationPasswordSubtitle");
            userCreationPasswordSubtitle.setVisibility(0);
        } else {
            getBinding().userCreationPasswordTitle.setText(C22739R.string.user_creation_choose_password_title);
            RhTextView userCreationPasswordSubtitle2 = getBinding().userCreationPasswordSubtitle;
            Intrinsics.checkNotNullExpressionValue(userCreationPasswordSubtitle2, "userCreationPasswordSubtitle");
            userCreationPasswordSubtitle2.setVisibility(8);
        }
        RdsButton userCreationPasswordPrimaryCta = getBinding().userCreationPasswordPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(userCreationPasswordPrimaryCta, "userCreationPasswordPrimaryCta");
        OnClickListeners.onClick(userCreationPasswordPrimaryCta, new Function0() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserCreationPasswordFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsTextInputEditText userCreationPasswordInput = getBinding().userCreationPasswordInput;
        Intrinsics.checkNotNullExpressionValue(userCreationPasswordInput, "userCreationPasswordInput");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RxTextView.textChanges(userCreationPasswordInput).skipInitialValue()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationPasswordFragment.onViewCreated$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        Observable<TextViewEditorActionEvent> observableFilter = getBinding().userCreationPasswordInput.onEnterOrDonePressed().filter(new Predicate() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment.onViewCreated.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(TextViewEditorActionEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return UserCreationPasswordFragment.this.getBinding().userCreationPasswordPrimaryCta.isEnabled();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationPasswordFragment.onViewCreated$lambda$2(this.f$0, (TextViewEditorActionEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(UserCreationPasswordFragment userCreationPasswordFragment) {
        EventLogger.DefaultImpls.logTap$default(userCreationPasswordFragment.getEventLogger(), null, userCreationPasswordFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, null, false, 57, null);
        userCreationPasswordFragment.onContinueClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(UserCreationPasswordFragment userCreationPasswordFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logType$default(userCreationPasswordFragment.getEventLogger(), null, userCreationPasswordFragment.getEventScreen(), new Component(Component.ComponentType.TEXT_FIELD, userCreationPasswordFragment.getEventScreen().getIdentifier(), null, 4, null), null, null, 25, null);
        userCreationPasswordFragment.getDuxo().onPasswordInput(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(UserCreationPasswordFragment userCreationPasswordFragment, TextViewEditorActionEvent textViewEditorActionEvent) {
        userCreationPasswordFragment.onContinueClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C229421(this));
    }

    /* compiled from: UserCreationPasswordFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordFragment$onStart$1 */
    /* synthetic */ class C229421 extends FunctionReferenceImpl implements Function1<UserCreationPasswordViewState, Unit> {
        C229421(Object obj) {
            super(1, obj, UserCreationPasswordFragment.class, "bind", "bind(Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserCreationPasswordViewState userCreationPasswordViewState) {
            invoke2(userCreationPasswordViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(UserCreationPasswordViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((UserCreationPasswordFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText userCreationPasswordInput = getBinding().userCreationPasswordInput;
        Intrinsics.checkNotNullExpressionValue(userCreationPasswordInput, "userCreationPasswordInput");
        BaseFragment.keyboardFocusOn$default(this, userCreationPasswordInput, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(UserCreationPasswordViewState state) {
        String err;
        onLoading(state instanceof UserCreationPasswordViewState.Loading);
        setContinueEnabled(state.getContinueEnabled());
        if (state instanceof UserCreationPasswordViewState.Typing) {
            RdsTextInputContainerView rdsTextInputContainerView = getBinding().userCreationPasswordInputContainer;
            UserCreationPasswordViewState.Typing typing = (UserCreationPasswordViewState.Typing) state;
            UserCreationPasswordViewState4 validationState = typing.getValidationState();
            if (Intrinsics.areEqual(validationState, UserCreationPasswordViewState4.TooShort.INSTANCE)) {
                err = getString(C22739R.string.user_creation_signup_error_password_too_short);
            } else if (validationState instanceof UserCreationPasswordViewState4.OtherError) {
                err = ((UserCreationPasswordViewState4.OtherError) typing.getValidationState()).getErr();
            } else {
                if (!Intrinsics.areEqual(validationState, UserCreationPasswordViewState4.Acceptable.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                err = null;
            }
            rdsTextInputContainerView.setErrorText(err);
            return;
        }
        if (state instanceof UserCreationPasswordViewState.Result) {
            UserCreationPasswordViewState3 userCreationPasswordViewState3Consume = ((UserCreationPasswordViewState.Result) state).getEvent().consume();
            if (userCreationPasswordViewState3Consume instanceof UserCreationPasswordViewState3.EmailUsernameError) {
                UserCreationPasswordViewState3.EmailUsernameError emailUsernameError = (UserCreationPasswordViewState3.EmailUsernameError) userCreationPasswordViewState3Consume;
                getCallbacks().onEmailOrUsernameFailed(emailUsernameError.getErr(), emailUsernameError.getErrorType().getAnalyticsTag());
                return;
            }
            if (userCreationPasswordViewState3Consume instanceof UserCreationPasswordViewState3.AccountLocked) {
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder message = companion.create(contextRequireContext).setId(C22739R.id.dialog_id_onboarding_acct_locked).setMessage(((UserCreationPasswordViewState3.AccountLocked) userCreationPasswordViewState3Consume).getErr());
                FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message, parentFragmentManager, "user-acct-locked", false, 4, null);
                return;
            }
            if (userCreationPasswordViewState3Consume instanceof UserCreationPasswordViewState3.Success) {
                getCallbacks().onPasswordFinished(((UserCreationPasswordViewState3.Success) userCreationPasswordViewState3Consume).getState());
                return;
            } else {
                if (userCreationPasswordViewState3Consume != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (!(state instanceof UserCreationPasswordViewState.Initial) && !(state instanceof UserCreationPasswordViewState.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void onLoading(boolean isLoading) {
        getBinding().userCreationPasswordPrimaryCta.setLoading(isLoading);
        getBinding().userCreationPasswordInput.setEnabled(!isLoading);
        requireToolbar().setLoadingViewVisible(isLoading);
    }

    private final void setContinueEnabled(boolean isEnabled) {
        getBinding().userCreationPasswordPrimaryCta.setEnabled(isEnabled);
    }

    private final void onContinueClicked() {
        getDuxo().onSubmitPassword(String.valueOf(getBinding().userCreationPasswordInput.getText()));
    }

    /* compiled from: UserCreationPasswordFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordFragment;", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UserCreationPasswordFragment, ApiUser.CreateUserRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiUser.CreateUserRequest getArgs(UserCreationPasswordFragment userCreationPasswordFragment) {
            return (ApiUser.CreateUserRequest) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, userCreationPasswordFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UserCreationPasswordFragment newInstance(ApiUser.CreateUserRequest createUserRequest) {
            return (UserCreationPasswordFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, createUserRequest);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UserCreationPasswordFragment userCreationPasswordFragment, ApiUser.CreateUserRequest createUserRequest) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, userCreationPasswordFragment, createUserRequest);
        }
    }
}
