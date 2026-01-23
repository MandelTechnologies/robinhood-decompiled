package com.robinhood.android.verification.email;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewEditorActionEvent;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.ErrorResponses;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.databinding.FragmentEmailUpdateBinding;
import com.robinhood.android.verification.email.BaseEmailVerificationFragment;
import com.robinhood.android.verification.email.EmailUpdateFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EmailUpdateFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003:;<B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\b\u0010,\u001a\u00020\u001cH\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001bH\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\u001a\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010*H\u0016J\u0010\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u000209H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b#\u0010$¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailUpdateFragment;", "Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/verification/email/EmailUpdateDuxo;", "getDuxo", "()Lcom/robinhood/android/verification/email/EmailUpdateDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/verification/databinding/FragmentEmailUpdateBinding;", "getBinding", "()Lcom/robinhood/android/verification/databinding/FragmentEmailUpdateBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/verification/email/EmailUpdateFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/verification/email/EmailUpdateFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onLoading", "isLoading", "onGenericErrorResponse", "errorResponse", "Lcom/robinhood/models/api/GenericErrorResponse;", "onBackPressed", "onPositiveButtonClicked", "id", "", "passthroughArgs", "bindViewState", "state", "Lcom/robinhood/android/verification/email/EmailUpdateViewState;", "Callbacks", "Args", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EmailUpdateFragment extends BaseEmailVerificationFragment implements RhDialogFragment.OnClickListener, AutoLoggableFragment {
    private static final String VERIFICATION_PRIVACY_DISCLOSURE_DIALOG_TAG = "verification-privacy-disclosure";
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailUpdateFragment.class, "binding", "getBinding()Lcom/robinhood/android/verification/databinding/FragmentEmailUpdateBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EmailUpdateFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/verification/email/EmailUpdateFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailUpdateFragment$Callbacks;", "Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment$BaseCallbacks;", "onEmailUpdateFinished", "", "newEmail", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseEmailVerificationFragment.BaseCallbacks {
        void onEmailUpdateFinished(String newEmail);
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailVerificationType.values().length];
            try {
                iArr[EmailVerificationType.VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailVerificationType.REVERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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

    public EmailUpdateFragment() {
        super(C31368R.layout.fragment_email_update);
        this.duxo = OldDuxos.oldDuxo(this, EmailUpdateDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, EmailUpdateFragment2.INSTANCE);
        this.launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.verification.email.EmailUpdateFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.verification.email.EmailUpdateFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailUpdateFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
        this.eventScreen = new Screen(Screen.Name.EMAIL_UPDATE, null, null, null, 14, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.verification.email.EmailUpdateFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EmailUpdateFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
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

    private final EmailUpdateDuxo getDuxo() {
        return (EmailUpdateDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentEmailUpdateBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmailUpdateBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(EmailUpdateFragment emailUpdateFragment) {
        emailUpdateFragment.getDuxo().submitEmailWithChallengeId(String.valueOf(emailUpdateFragment.getBinding().updateEmailInput.getText()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment
    public Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsTextInputEditText updateEmailInput = getBinding().updateEmailInput;
        Intrinsics.checkNotNullExpressionValue(updateEmailInput, "updateEmailInput");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(updateEmailInput).skipInitialValue(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateFragment.onViewCreated$lambda$2(this.f$0, (CharSequence) obj);
            }
        });
        RdsButton updateEmailPrimaryCta = getBinding().updateEmailPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(updateEmailPrimaryCta, "updateEmailPrimaryCta");
        Observable observableMerge = Observable.merge(RxView.clicks(updateEmailPrimaryCta), getBinding().updateEmailInput.onEnterOrDonePressed().filter(new Predicate() { // from class: com.robinhood.android.verification.email.EmailUpdateFragment.onViewCreated.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(TextViewEditorActionEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EmailUpdateFragment.this.getBinding().updateEmailPrimaryCta.isEnabled() && !EmailUpdateFragment.this.getBinding().updateEmailPrimaryCta.getIsLoading();
            }
        }));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        Observable<EmailUpdateViewState> states = getDuxo().getStates();
        final C314173 c314173 = new PropertyReference1Impl() { // from class: com.robinhood.android.verification.email.EmailUpdateFragment.onViewCreated.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((EmailUpdateViewState) obj).isConsentedToDisclosure());
            }
        };
        Observable<R> map = states.map(new Function(c314173) { // from class: com.robinhood.android.verification.email.EmailUpdateFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c314173, "function");
                this.function = c314173;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.mapToLatestFrom(observableMerge, map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.verification.email.EmailUpdateFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EmailUpdateFragment.onViewCreated$lambda$3(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C314185(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(EmailUpdateFragment emailUpdateFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        emailUpdateFragment.getDuxo().setEmailText(it.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(EmailUpdateFragment emailUpdateFragment, Boolean bool) {
        if (bool.booleanValue()) {
            emailUpdateFragment.getDuxo().sendUserConsentedToDisclosureAndSubmitUserEmail(String.valueOf(emailUpdateFragment.getBinding().updateEmailInput.getText()));
        } else {
            ActivityUtils.showVerificationPrivacyDisclosure(emailUpdateFragment, VERIFICATION_PRIVACY_DISCLOSURE_DIALOG_TAG, emailUpdateFragment.getAppType());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailUpdateFragment$onViewCreated$5 */
    /* synthetic */ class C314185 extends FunctionReferenceImpl implements Function1<EmailUpdateViewState, Unit> {
        C314185(Object obj) {
            super(1, obj, EmailUpdateFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/verification/email/EmailUpdateViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EmailUpdateViewState emailUpdateViewState) {
            invoke2(emailUpdateViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EmailUpdateViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EmailUpdateFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText updateEmailInput = getBinding().updateEmailInput;
        Intrinsics.checkNotNullExpressionValue(updateEmailInput, "updateEmailInput");
        BaseFragment.keyboardFocusOn$default(this, updateEmailInput, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        super.onPause();
    }

    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment
    public void onLoading(boolean isLoading) {
        super.onLoading(isLoading);
        getBinding().updateEmailPrimaryCta.setLoading(isLoading);
        getBinding().updateEmailInput.setEnabled(!isLoading);
    }

    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment
    public boolean onGenericErrorResponse(GenericErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        RdsTextInputContainerView updateEmailInputContainer = getBinding().updateEmailInputContainer;
        Intrinsics.checkNotNullExpressionValue(updateEmailInputContainer, "updateEmailInputContainer");
        Views.applyError(updateEmailInputContainer, errorResponse, "email");
        return ErrorResponses.containsError(errorResponse, "email");
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getVerificationType().ordinal()];
        if (i == 1) {
            return super.onBackPressed();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C20682R.id.dialog_id_privacy_policy_disclosure) {
            getDuxo().sendUserConsentedToDisclosureAndSubmitUserEmail(String.valueOf(getBinding().updateEmailInput.getText()));
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(EmailUpdateViewState state) {
        Tuples2<UUID, Boolean> tuples2Consume;
        Either<String, Throwable> eitherConsume;
        getBinding().updateEmailPrimaryCta.setEnabled(state.getIsInputValid());
        UiEvent<Either<String, Throwable>> submitEmailSuccessOrErrorEvent = state.getSubmitEmailSuccessOrErrorEvent();
        if (submitEmailSuccessOrErrorEvent != null && (eitherConsume = submitEmailSuccessOrErrorEvent.consume()) != null) {
            if (eitherConsume instanceof Either.Left) {
                getCallbacks().onEmailUpdateFinished((String) ((Either.Left) eitherConsume).getValue());
            } else {
                if (!(eitherConsume instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbsErrorHandler.handleError$default(getErrorHandler(), (Throwable) ((Either.Right) eitherConsume).getValue(), false, 2, null);
            }
        }
        UiEvent<Tuples2<UUID, Boolean>> verificationWorkflowEvent = state.getVerificationWorkflowEvent();
        if (verificationWorkflowEvent != null && (tuples2Consume = verificationWorkflowEvent.consume()) != null) {
            UUID uuidComponent1 = tuples2Consume.component1();
            Boolean boolComponent2 = tuples2Consume.component2();
            boolComponent2.booleanValue();
            this.launchSuv.invoke(uuidComponent1, boolComponent2);
        }
        onLoading(state.isLoading());
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailUpdateFragment$Args;", "Landroid/os/Parcelable;", "verificationType", "Lcom/robinhood/android/verification/email/EmailVerificationType;", "<init>", "(Lcom/robinhood/android/verification/email/EmailVerificationType;)V", "getVerificationType", "()Lcom/robinhood/android/verification/email/EmailVerificationType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final EmailVerificationType verificationType;

        /* compiled from: EmailUpdateFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(EmailVerificationType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, EmailVerificationType emailVerificationType, int i, Object obj) {
            if ((i & 1) != 0) {
                emailVerificationType = args.verificationType;
            }
            return args.copy(emailVerificationType);
        }

        /* renamed from: component1, reason: from getter */
        public final EmailVerificationType getVerificationType() {
            return this.verificationType;
        }

        public final Args copy(EmailVerificationType verificationType) {
            Intrinsics.checkNotNullParameter(verificationType, "verificationType");
            return new Args(verificationType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.verificationType == ((Args) other).verificationType;
        }

        public int hashCode() {
            return this.verificationType.hashCode();
        }

        public String toString() {
            return "Args(verificationType=" + this.verificationType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.verificationType.name());
        }

        public Args(EmailVerificationType verificationType) {
            Intrinsics.checkNotNullParameter(verificationType, "verificationType");
            this.verificationType = verificationType;
        }

        public final EmailVerificationType getVerificationType() {
            return this.verificationType;
        }
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailUpdateFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/verification/email/EmailUpdateFragment;", "Lcom/robinhood/android/verification/email/EmailUpdateFragment$Args;", "<init>", "()V", "VERIFICATION_PRIVACY_DISCLOSURE_DIALOG_TAG", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EmailUpdateFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EmailUpdateFragment emailUpdateFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, emailUpdateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmailUpdateFragment newInstance(Args args) {
            return (EmailUpdateFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmailUpdateFragment emailUpdateFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, emailUpdateFragment, args);
        }
    }
}
