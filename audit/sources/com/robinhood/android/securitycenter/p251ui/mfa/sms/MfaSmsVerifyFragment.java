package com.robinhood.android.securitycenter.p251ui.mfa.sms;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.Dialogs;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentMfaSmsVerifyBinding;
import com.robinhood.android.securitycenter.p251ui.mfa.sms.MfaSmsVerifyEvent;
import com.robinhood.android.securitycenter.p251ui.mfa.sms.MfaSmsVerifyFragment;
import com.robinhood.android.settings.util.MfaSmsRetriever;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.api.RecoverAppMfaErrorResponse;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.security.contracts.PhoneVerifyIntentKey;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MfaSmsVerifyFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\"\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0003BCDB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020 H\u0016J\u001a\u00101\u001a\u00020 2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00106\u001a\u00020 2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;H\u0002J\u0016\u0010<\u001a\u00020 2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\b\u0010@\u001a\u00020 H\u0002J\b\u0010A\u001a\u00020 H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSmsVerifyBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSmsVerifyBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Callbacks;", "callbacks$delegate", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "errorHandler", "com/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$errorHandler$2$1;", "errorHandler$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyEvent;", "logResendCode", "logPhoneVerification", "Callbacks", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MfaSmsVerifyFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MfaSmsVerifyFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSmsVerifyBinding;", 0)), Reflection.property1(new PropertyReference1Impl(MfaSmsVerifyFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MfaSmsVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Callbacks;", "", "onErrorDialogDismissed", "", "onFinishMfaFlow", "hasCompletedSetup", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onErrorDialogDismissed();

        void onFinishMfaFlow(boolean hasCompletedSetup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<MfaSmsVerifyEvent> event) {
        EventConsumer<MfaSmsVerifyEvent> eventConsumerInvoke;
        EventConsumer<MfaSmsVerifyEvent> eventConsumerInvoke2;
        EventConsumer<MfaSmsVerifyEvent> eventConsumerInvoke3;
        EventConsumer<MfaSmsVerifyEvent> eventConsumerInvoke4;
        if ((event.getData() instanceof MfaSmsVerifyEvent.SubmitSuccessEvent) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18826invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18826invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onFinishMfaFlow(true);
                }
            });
        }
        if ((event.getData() instanceof MfaSmsVerifyEvent.ResendEvent) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18827invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18827invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    MfaSmsVerifyEvent.ResendEvent resendEvent = (MfaSmsVerifyEvent.ResendEvent) event.getData();
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Dialogs.showMfaVerificationResentDialog(fragmentActivityRequireActivity, resendEvent.getPhoneNumber(), true);
                }
            });
        }
        if ((event.getData() instanceof MfaSmsVerifyEvent.VerificationWorkflowEvent) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18828invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18828invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    MfaSmsVerifyEvent.VerificationWorkflowEvent verificationWorkflowEvent = (MfaSmsVerifyEvent.VerificationWorkflowEvent) event.getData();
                    this.launchSuv.invoke(verificationWorkflowEvent.getWorkflowId(), Boolean.valueOf(verificationWorkflowEvent.isMigrated()));
                }
            });
        }
        if (!(event.getData() instanceof MfaSmsVerifyEvent.ErrorEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$handleEvent$$inlined$consumeIfType$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18829invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18829invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbsErrorHandler.handleError$default(this.getErrorHandler(), ((MfaSmsVerifyEvent.ErrorEvent) event.getData()).getThrowable(), false, 2, null);
                this.getBinding().mfaSmsVerifyInput.setText("");
            }
        });
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

    public MfaSmsVerifyFragment() {
        super(C28186R.layout.fragment_mfa_sms_verify);
        this.duxo = DuxosKt.duxo(this, MfaSmsVerifyDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, MfaSmsVerifyFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSmsVerifyFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSmsVerifyFragment.launchSuv$lambda$2(this.f$0);
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSmsVerifyFragment.errorHandler_delegate$lambda$3(this.f$0);
            }
        });
        this.eventScreen = new Screen(Screen.Name.MFA_SMS_VERIFICATION, null, null, null, 14, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaSmsVerifyDuxo getDuxo() {
        return (MfaSmsVerifyDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentMfaSmsVerifyBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMfaSmsVerifyBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(MfaSmsVerifyFragment mfaSmsVerifyFragment) {
        mfaSmsVerifyFragment.getDuxo().sendCode(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(MfaSmsVerifyFragment mfaSmsVerifyFragment) {
        mfaSmsVerifyFragment.getCallbacks().onFinishMfaFlow(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaSmsVerifyFragment3 getErrorHandler() {
        return (MfaSmsVerifyFragment3) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$errorHandler$2$1] */
    public static final MfaSmsVerifyFragment3 errorHandler_delegate$lambda$3(final MfaSmsVerifyFragment mfaSmsVerifyFragment) {
        final FragmentActivity fragmentActivityRequireActivity = mfaSmsVerifyFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, false, 0, null, 14, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showShortError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                showLongError(message);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showLongError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                RhDialogFragment.Builder message2 = companion.create(fragmentActivityRequireActivity2).setId(C11048R.id.dialog_id_generic_error).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
                FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
            }

            @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
            public boolean handleError(Throwable t, boolean handleNonNetworkError) {
                Intrinsics.checkNotNullParameter(t, "t");
                Integer httpStatusCode = Throwables.getHttpStatusCode(t);
                if (httpStatusCode != null && httpStatusCode.intValue() == 401 && ((MfaSmsVerifyFragment.Args) MfaSmsVerifyFragment.INSTANCE.getArgs((Fragment) this.this$0)).getFlowId() == Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_SMS_MFA) {
                    this.this$0.getCallbacks().onErrorDialogDismissed();
                    return true;
                }
                return super.handleError(t, handleNonNetworkError);
            }

            @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
            public boolean handleErrorResponse(ErrorResponse errorResponse) {
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                if (errorResponse instanceof RecoverAppMfaErrorResponse) {
                    RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                    RhDialogFragment.Builder message = companion.create(fragmentActivityRequireActivity2).setId(C28186R.id.dialog_id_settings_mfa_recovery_try_again).setUseDesignSystemOverlay(true).setTitle(C28186R.string.setting_mfa_sms_verify_v2_recovery_retry_title, new Object[0]).setMessage(C28186R.string.setting_mfa_sms_verify_v2_recovery_retry_message, new Object[0]);
                    FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(message, supportFragmentManager, "error", false, 4, null);
                    return true;
                }
                if (errorResponse instanceof GenericErrorResponse) {
                    if (((MfaSmsVerifyFragment.Args) MfaSmsVerifyFragment.INSTANCE.getArgs((Fragment) this.this$0)).getFlowId() == Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_SMS_MFA) {
                        this.this$0.getCallbacks().onErrorDialogDismissed();
                        return true;
                    }
                    return super.handleErrorResponse(errorResponse);
                }
                return super.handleErrorResponse(errorResponse);
            }
        };
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        MfaSmsRetriever mfaSmsRetriever = MfaSmsRetriever.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, mfaSmsRetriever.listenForMfaCode(contextRequireContext), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaSmsVerifyFragment.onStart$lambda$5(this.f$0, (String) obj);
            }
        });
        RdsFormattedEditText mfaSmsVerifyInput = getBinding().mfaSmsVerifyInput;
        Intrinsics.checkNotNullExpressionValue(mfaSmsVerifyInput, "mfaSmsVerifyInput");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(mfaSmsVerifyInput).map(new Function() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final String apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = StringsKt.trim(it.toString()).toString();
                String strSubstring = string2.substring(0, Math.min(string2.length(), 6));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C282913(getDuxo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(MfaSmsVerifyFragment mfaSmsVerifyFragment, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        mfaSmsVerifyFragment.getBinding().mfaSmsVerifyInput.setText(code);
        return Unit.INSTANCE;
    }

    /* compiled from: MfaSmsVerifyFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onStart$3 */
    /* synthetic */ class C282913 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        C282913(Object obj) {
            super(1, obj, MfaSmsVerifyDuxo.class, "onInputChange", "onInputChange(Ljava/lang/CharSequence;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MfaSmsVerifyDuxo) this.receiver).onInputChange(p0);
        }
    }

    /* compiled from: MfaSmsVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1", m3645f = "MfaSmsVerifyFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1 */
    static final class C282921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282921(Continuation<? super C282921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282921 c282921 = MfaSmsVerifyFragment.this.new C282921(continuation);
            c282921.L$0 = obj;
            return c282921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MfaSmsVerifyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1$1", m3645f = "MfaSmsVerifyFragment.kt", m3646l = {151}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MfaSmsVerifyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MfaSmsVerifyFragment mfaSmsVerifyFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mfaSmsVerifyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MfaSmsVerifyFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C505401 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ MfaSmsVerifyFragment $tmp0;

                C505401(MfaSmsVerifyFragment mfaSmsVerifyFragment) {
                    this.$tmp0 = mfaSmsVerifyFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, MfaSmsVerifyFragment.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(MfaSmsVerifyViewState mfaSmsVerifyViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, mfaSmsVerifyViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((MfaSmsVerifyViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<MfaSmsVerifyViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C505401 c505401 = new C505401(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c505401, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bind(MfaSmsVerifyFragment mfaSmsVerifyFragment, MfaSmsVerifyViewState mfaSmsVerifyViewState, Continuation continuation) {
                mfaSmsVerifyFragment.bind(mfaSmsVerifyViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(MfaSmsVerifyFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(MfaSmsVerifyFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: MfaSmsVerifyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1$2", m3645f = "MfaSmsVerifyFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MfaSmsVerifyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MfaSmsVerifyFragment mfaSmsVerifyFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = mfaSmsVerifyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MfaSmsVerifyFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$onViewCreated$1$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ MfaSmsVerifyFragment $tmp0;

                AnonymousClass1(MfaSmsVerifyFragment mfaSmsVerifyFragment) {
                    this.$tmp0 = mfaSmsVerifyFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, MfaSmsVerifyFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<MfaSmsVerifyEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<MfaSmsVerifyEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleEvent(MfaSmsVerifyFragment mfaSmsVerifyFragment, Event event, Continuation continuation) {
                mfaSmsVerifyFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C282921(null), 1, null);
        getBinding().mfaSmsVerifyNumpad.useDefaultKeyHandler();
        RdsButton mfaSmsVerifyResendBtn = getBinding().mfaSmsVerifyResendBtn;
        Intrinsics.checkNotNullExpressionValue(mfaSmsVerifyResendBtn, "mfaSmsVerifyResendBtn");
        OnClickListeners.onClick(mfaSmsVerifyResendBtn, new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSmsVerifyFragment.onViewCreated$lambda$6(this.f$0);
            }
        });
        RdsButton mfaSmsVerifyChangeNumberBtn = getBinding().mfaSmsVerifyChangeNumberBtn;
        Intrinsics.checkNotNullExpressionValue(mfaSmsVerifyChangeNumberBtn, "mfaSmsVerifyChangeNumberBtn");
        OnClickListeners.onClick(mfaSmsVerifyChangeNumberBtn, new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaSmsVerifyFragment.onViewCreated$lambda$7(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(MfaSmsVerifyFragment mfaSmsVerifyFragment) {
        mfaSmsVerifyFragment.logResendCode();
        mfaSmsVerifyFragment.getDuxo().sendCode(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(MfaSmsVerifyFragment mfaSmsVerifyFragment) {
        mfaSmsVerifyFragment.logPhoneVerification();
        Navigator navigator = mfaSmsVerifyFragment.getNavigator();
        android.content.Context contextRequireContext = mfaSmsVerifyFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PhoneVerifyIntentKey(null, 1, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onErrorDialogDismissed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MfaSmsVerifyViewState state) {
        RdsButton mfaSmsVerifyChangeNumberBtn = getBinding().mfaSmsVerifyChangeNumberBtn;
        Intrinsics.checkNotNullExpressionValue(mfaSmsVerifyChangeNumberBtn, "mfaSmsVerifyChangeNumberBtn");
        mfaSmsVerifyChangeNumberBtn.setVisibility(state.getShowChangeNumberButton() ? 0 : 8);
        ShimmerLoadingView mfaSmsVerifyLoadingView = getBinding().mfaSmsVerifyLoadingView;
        Intrinsics.checkNotNullExpressionValue(mfaSmsVerifyLoadingView, "mfaSmsVerifyLoadingView");
        mfaSmsVerifyLoadingView.setVisibility(state.isLoading() ? 0 : 8);
        RhTextView rhTextView = getBinding().mfaSmsVerifySubtitle;
        StringResource subtitle = state.getSubtitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(subtitle.getText(resources));
    }

    private final void logResendCode() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.RESEND_SMS_CODE, new Screen(Screen.Name.MFA_SMS_VERIFICATION, null, null, null, 14, null), null, null, null, false, 60, null);
    }

    private final void logPhoneVerification() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VERIFY_PHONE, new Screen(Screen.Name.MFA_SMS_VERIFICATION, null, null, null, 14, null), null, null, null, false, 60, null);
    }

    /* compiled from: MfaSmsVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Args;", "Landroid/os/Parcelable;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "enrollmentToken", "", "flowId", "Lcom/robinhood/models/api/Challenge$Flow;", "phoneNumber", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/Challenge$Flow;Ljava/lang/String;)V", "getChallengeId", "()Ljava/util/UUID;", "getEnrollmentToken", "()Ljava/lang/String;", "getFlowId", "()Lcom/robinhood/models/api/Challenge$Flow;", "getPhoneNumber", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID challengeId;
        private final String enrollmentToken;
        private final Challenge.Flow flowId;
        private final String phoneNumber;

        /* compiled from: MfaSmsVerifyFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readString(), (Challenge.Flow) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, String str, Challenge.Flow flow, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.challengeId;
            }
            if ((i & 2) != 0) {
                str = args.enrollmentToken;
            }
            if ((i & 4) != 0) {
                flow = args.flowId;
            }
            if ((i & 8) != 0) {
                str2 = args.phoneNumber;
            }
            return args.copy(uuid, str, flow, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEnrollmentToken() {
            return this.enrollmentToken;
        }

        /* renamed from: component3, reason: from getter */
        public final Challenge.Flow getFlowId() {
            return this.flowId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final Args copy(UUID challengeId, String enrollmentToken, Challenge.Flow flowId, String phoneNumber) {
            return new Args(challengeId, enrollmentToken, flowId, phoneNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.challengeId, args.challengeId) && Intrinsics.areEqual(this.enrollmentToken, args.enrollmentToken) && this.flowId == args.flowId && Intrinsics.areEqual(this.phoneNumber, args.phoneNumber);
        }

        public int hashCode() {
            UUID uuid = this.challengeId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            String str = this.enrollmentToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Challenge.Flow flow = this.flowId;
            int iHashCode3 = (iHashCode2 + (flow == null ? 0 : flow.hashCode())) * 31;
            String str2 = this.phoneNumber;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(challengeId=" + this.challengeId + ", enrollmentToken=" + this.enrollmentToken + ", flowId=" + this.flowId + ", phoneNumber=" + this.phoneNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.challengeId);
            dest.writeString(this.enrollmentToken);
            dest.writeParcelable(this.flowId, flags);
            dest.writeString(this.phoneNumber);
        }

        public Args(UUID uuid, String str, Challenge.Flow flow, String str2) {
            this.challengeId = uuid;
            this.enrollmentToken = str;
            this.flowId = flow;
            this.phoneNumber = str2;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final String getEnrollmentToken() {
            return this.enrollmentToken;
        }

        public final Challenge.Flow getFlowId() {
            return this.flowId;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    /* compiled from: MfaSmsVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment;", "Lcom/robinhood/android/securitycenter/ui/mfa/sms/MfaSmsVerifyFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MfaSmsVerifyFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MfaSmsVerifyFragment mfaSmsVerifyFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, mfaSmsVerifyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MfaSmsVerifyFragment newInstance(Args args) {
            return (MfaSmsVerifyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MfaSmsVerifyFragment mfaSmsVerifyFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, mfaSmsVerifyFragment, args);
        }
    }
}
