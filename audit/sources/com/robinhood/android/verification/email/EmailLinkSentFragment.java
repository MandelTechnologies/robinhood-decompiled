package com.robinhood.android.verification.email;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.EmailUtils2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.databinding.FragmentEmailLinkSentBinding;
import com.robinhood.android.verification.email.BaseEmailVerificationFragment;
import com.robinhood.android.verification.email.EmailLinkSentFragment;
import com.robinhood.android.verification.email.EmailLinkSentViewState;
import com.robinhood.android.verification.email.EmailLinkSentViewState2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: EmailLinkSentFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u00039:;B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020&H\u0016J\u0010\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020%H\u0016J\u0010\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020&2\u0006\u00107\u001a\u000208H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001f\u0010 R \u0010\"\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentFragment;", "Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/verification/email/EmailLinkSentDuxo;", "getDuxo", "()Lcom/robinhood/android/verification/email/EmailLinkSentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/verification/databinding/FragmentEmailLinkSentBinding;", "getBinding", "()Lcom/robinhood/android/verification/databinding/FragmentEmailLinkSentBinding;", "binding$delegate", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onLoading", "isLoading", "bindViewState", "state", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState;", "bindEvent", "eventState", "Lcom/robinhood/android/verification/email/EmailLinkSentViewState$Event;", "Callbacks", "Args", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EmailLinkSentFragment extends BaseEmailVerificationFragment implements AutoLoggableFragment {
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailLinkSentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(EmailLinkSentFragment.class, "binding", "getBinding()Lcom/robinhood/android/verification/databinding/FragmentEmailLinkSentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmailLinkSentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Callbacks;", "Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment$BaseCallbacks;", "onEmailVerified", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseEmailVerificationFragment.BaseCallbacks {
        void onEmailVerified();
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

    public EmailLinkSentFragment() {
        super(C31368R.layout.fragment_email_link_sent);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.verification.email.EmailLinkSentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EmailLinkSentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, EmailLinkSentDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, EmailLinkSentFragment2.INSTANCE);
        this.launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.verification.email.EmailLinkSentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.verification.email.EmailLinkSentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailLinkSentFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
        this.eventScreen = new Screen(Screen.Name.EMAIL_UPDATE_VERIFICATION, null, null, null, 14, null);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment
    public Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailLinkSentDuxo getDuxo() {
        return (EmailLinkSentDuxo) this.duxo.getValue();
    }

    private final FragmentEmailLinkSentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmailLinkSentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(EmailLinkSentFragment emailLinkSentFragment) {
        emailLinkSentFragment.getDuxo().resendLink(((Args) INSTANCE.getArgs((Fragment) emailLinkSentFragment)).getInitialToBeVerifiedEmail());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView emailLinkSentResendLinkText = getBinding().emailLinkSentResendLinkText;
        Intrinsics.checkNotNullExpressionValue(emailLinkSentResendLinkText, "emailLinkSentResendLinkText");
        int i = C31368R.string.email_link_sent_didnt_receive_it;
        int i2 = C31368R.string.email_link_sent_resend_link;
        String string2 = ViewsKt.getString(emailLinkSentResendLinkText, i);
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        TextViewsKt.setTextWithLearnMore((TextView) emailLinkSentResendLinkText, (CharSequence) string2, false, true, numValueOf != null ? ViewsKt.getString(emailLinkSentResendLinkText, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.verification.email.EmailLinkSentFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.this$0.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EMAIL_VERIFICATION, AnalyticsStrings.BUTTON_EMAIL_VERIFICATION_RESEND_LINK, null, null, null, null, this.this$0.requireBaseActivity().getScreenDescription(), null, 188, null);
                this.this$0.getDuxo().resendLink(((EmailLinkSentFragment.Args) EmailLinkSentFragment.INSTANCE.getArgs((Fragment) this.this$0)).getInitialToBeVerifiedEmail());
            }
        }, 1, (DefaultConstructorMarker) null));
        getBinding().emailLinkSentEmailText.setText(((Args) INSTANCE.getArgs((Fragment) this)).getInitialToBeVerifiedEmail());
        RdsButton emailLinkSentPrimaryCta = getBinding().emailLinkSentPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(emailLinkSentPrimaryCta, "emailLinkSentPrimaryCta");
        OnClickListeners.onClick(emailLinkSentPrimaryCta, new Function0() { // from class: com.robinhood.android.verification.email.EmailLinkSentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailLinkSentFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(EmailLinkSentFragment emailLinkSentFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(emailLinkSentFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EMAIL_VERIFICATION, AnalyticsStrings.BUTTON_EMAIL_VERIFICATION_OPEN_MAIL_APP, null, null, null, null, emailLinkSentFragment.requireBaseActivity().getScreenDescription(), null, 188, null);
        android.content.Context contextRequireContext = emailLinkSentFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        EmailUtils2.openMailApp(contextRequireContext);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C314081(this));
    }

    /* compiled from: EmailLinkSentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.verification.email.EmailLinkSentFragment$onStart$1 */
    /* synthetic */ class C314081 extends FunctionReferenceImpl implements Function1<EmailLinkSentViewState, Unit> {
        C314081(Object obj) {
            super(1, obj, EmailLinkSentFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/verification/email/EmailLinkSentViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EmailLinkSentViewState emailLinkSentViewState) {
            invoke2(emailLinkSentViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EmailLinkSentViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EmailLinkSentFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.verification.email.BaseEmailVerificationFragment
    public void onLoading(boolean isLoading) {
        super.onLoading(isLoading);
        getBinding().emailLinkSentResendLinkText.setMovementMethod(isLoading ? null : LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(EmailLinkSentViewState state) {
        onLoading(state instanceof EmailLinkSentViewState.Loading);
        if (Intrinsics.areEqual(state, EmailLinkSentViewState.Initial.INSTANCE) || Intrinsics.areEqual(state, EmailLinkSentViewState.Loading.INSTANCE)) {
            return;
        }
        if (!(state instanceof EmailLinkSentViewState.Event)) {
            throw new NoWhenBranchMatchedException();
        }
        bindEvent((EmailLinkSentViewState.Event) state);
    }

    private final void bindEvent(EmailLinkSentViewState.Event eventState) {
        EmailLinkSentViewState2 emailLinkSentViewState2Consume = eventState.getEvent().consume();
        if (emailLinkSentViewState2Consume instanceof EmailLinkSentViewState2.LinkSent) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C31368R.string.email_link_sent_dialog_title, new Object[0]).setMessage(getString(C31368R.string.email_link_sent_dialog_message, ((Args) INSTANCE.getArgs((Fragment) this)).getInitialToBeVerifiedEmail())).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "email-link-sent-dialog", false, 4, null);
            return;
        }
        if (emailLinkSentViewState2Consume instanceof EmailLinkSentViewState2.Error) {
            AbsErrorHandler.handleError$default(getErrorHandler(), ((EmailLinkSentViewState2.Error) emailLinkSentViewState2Consume).getThrowable(), false, 2, null);
            return;
        }
        if (emailLinkSentViewState2Consume instanceof EmailLinkSentViewState2.EmailVerified) {
            getCallbacks().onEmailVerified();
        } else if (emailLinkSentViewState2Consume instanceof EmailLinkSentViewState2.VerificationWorkflow) {
            EmailLinkSentViewState2.VerificationWorkflow verificationWorkflow = (EmailLinkSentViewState2.VerificationWorkflow) emailLinkSentViewState2Consume;
            this.launchSuv.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.getIsMigrated()));
        } else if (emailLinkSentViewState2Consume != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: EmailLinkSentFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Args;", "Landroid/os/Parcelable;", "initialToBeVerifiedEmail", "", "<init>", "(Ljava/lang/String;)V", "getInitialToBeVerifiedEmail", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String initialToBeVerifiedEmail;

        /* compiled from: EmailLinkSentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.initialToBeVerifiedEmail;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInitialToBeVerifiedEmail() {
            return this.initialToBeVerifiedEmail;
        }

        public final Args copy(String initialToBeVerifiedEmail) {
            Intrinsics.checkNotNullParameter(initialToBeVerifiedEmail, "initialToBeVerifiedEmail");
            return new Args(initialToBeVerifiedEmail);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.initialToBeVerifiedEmail, ((Args) other).initialToBeVerifiedEmail);
        }

        public int hashCode() {
            return this.initialToBeVerifiedEmail.hashCode();
        }

        public String toString() {
            return "Args(initialToBeVerifiedEmail=" + this.initialToBeVerifiedEmail + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.initialToBeVerifiedEmail);
        }

        public Args(String initialToBeVerifiedEmail) {
            Intrinsics.checkNotNullParameter(initialToBeVerifiedEmail, "initialToBeVerifiedEmail");
            this.initialToBeVerifiedEmail = initialToBeVerifiedEmail;
        }

        public final String getInitialToBeVerifiedEmail() {
            return this.initialToBeVerifiedEmail;
        }
    }

    /* compiled from: EmailLinkSentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/verification/email/EmailLinkSentFragment;", "Lcom/robinhood/android/verification/email/EmailLinkSentFragment$Args;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EmailLinkSentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EmailLinkSentFragment emailLinkSentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, emailLinkSentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmailLinkSentFragment newInstance(Args args) {
            return (EmailLinkSentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmailLinkSentFragment emailLinkSentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, emailLinkSentFragment, args);
        }
    }
}
