package com.robinhood.android.securitycenter.p251ui.mfa.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentMfaAuthAppVerifyBinding;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppVerifyEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.RecoverAppMfaErrorResponse;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
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

/* compiled from: MfaAuthAppVerifyFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0005CDEFGB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u0002042\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000101H\u0016J\u001a\u00109\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000101H\u0016J\u0010\u0010:\u001a\u00020\u001a2\u0006\u00106\u001a\u000207H\u0016J\b\u0010;\u001a\u00020\u0019H\u0016J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>H\u0002J\u0016\u0010?\u001a\u00020\u001a2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppVerifyBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppVerifyBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Callbacks;", "callbacks$delegate", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "tokenErrorHandler", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$ErrorHandler;", "getTokenErrorHandler", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$ErrorHandler;", "tokenErrorHandler$delegate", "submitErrorHandler", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$SubmitErrorHandler;", "getSubmitErrorHandler", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$SubmitErrorHandler;", "submitErrorHandler$delegate", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onDialogDismissed", "onBackPressed", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyEvent;", "Callbacks", "SubmitErrorHandler", "ErrorHandler", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MfaAuthAppVerifyFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final Function2<UUID, Boolean, Unit> launchSuv;

    /* renamed from: submitErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy submitErrorHandler;

    /* renamed from: tokenErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy tokenErrorHandler;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MfaAuthAppVerifyFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppVerifyBinding;", 0)), Reflection.property1(new PropertyReference1Impl(MfaAuthAppVerifyFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MfaAuthAppVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Callbacks;", "", "onFinishMfaFlow", "", "hasCompletedSetup", "", "onErrorDialogDismissed", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onErrorDialogDismissed();

        void onFinishMfaFlow(boolean hasCompletedSetup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<MfaAuthAppVerifyEvent> event) {
        EventConsumer<MfaAuthAppVerifyEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof MfaAuthAppVerifyEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18820invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18820invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MfaAuthAppVerifyEvent mfaAuthAppVerifyEvent = (MfaAuthAppVerifyEvent) event.getData();
                if (!(mfaAuthAppVerifyEvent instanceof MfaAuthAppVerifyEvent.SubmitError)) {
                    if (!(mfaAuthAppVerifyEvent instanceof MfaAuthAppVerifyEvent.SubmitSuccess)) {
                        if (mfaAuthAppVerifyEvent instanceof MfaAuthAppVerifyEvent.TokenError) {
                            AbsErrorHandler.handleError$default(this.getTokenErrorHandler(), ((MfaAuthAppVerifyEvent.TokenError) mfaAuthAppVerifyEvent).getThrowable(), false, 2, null);
                            return;
                        }
                        if (mfaAuthAppVerifyEvent instanceof MfaAuthAppVerifyEvent.TokenSuccess) {
                            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.getString(C28186R.string.url_auth_app_deeplink, ((MfaAuthAppVerifyEvent.TokenSuccess) mfaAuthAppVerifyEvent).getToken()))));
                            return;
                        } else {
                            if (!(mfaAuthAppVerifyEvent instanceof MfaAuthAppVerifyEvent.VerificationRequired)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            MfaAuthAppVerifyEvent.VerificationRequired verificationRequired = (MfaAuthAppVerifyEvent.VerificationRequired) mfaAuthAppVerifyEvent;
                            this.launchSuv.invoke(verificationRequired.getWorkflowId(), Boolean.valueOf(verificationRequired.isMigrated()));
                            return;
                        }
                    }
                    this.getCallbacks().onFinishMfaFlow(true);
                    return;
                }
                AbsErrorHandler.handleError$default(this.getSubmitErrorHandler(), ((MfaAuthAppVerifyEvent.SubmitError) mfaAuthAppVerifyEvent).getThrowable(), false, 2, null);
                this.getBinding().mfaAuthAppVerifyInput.setText("");
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

    public MfaAuthAppVerifyFragment() {
        super(C28186R.layout.fragment_mfa_auth_app_verify);
        this.duxo = DuxosKt.duxo(this, MfaAuthAppVerifyDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, MfaAuthAppVerifyFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppVerifyFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppVerifyFragment.launchSuv$lambda$2(this.f$0);
            }
        });
        this.tokenErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppVerifyFragment.tokenErrorHandler_delegate$lambda$3(this.f$0);
            }
        });
        this.submitErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppVerifyFragment.submitErrorHandler_delegate$lambda$4(this.f$0);
            }
        });
        this.eventScreen = new Screen(Screen.Name.APP_MFA_ENROLLMENT_CODE, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaAuthAppVerifyDuxo getDuxo() {
        return (MfaAuthAppVerifyDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentMfaAuthAppVerifyBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMfaAuthAppVerifyBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment) {
        mfaAuthAppVerifyFragment.getDuxo().fetchAuthAppToken();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment) {
        mfaAuthAppVerifyFragment.getCallbacks().onFinishMfaFlow(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorHandler getTokenErrorHandler() {
        return (ErrorHandler) this.tokenErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorHandler tokenErrorHandler_delegate$lambda$3(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment) {
        FragmentActivity fragmentActivityRequireActivity = mfaAuthAppVerifyFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new ErrorHandler(fragmentActivityRequireActivity, C11048R.id.dialog_id_mfa_token_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubmitErrorHandler getSubmitErrorHandler() {
        return (SubmitErrorHandler) this.submitErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmitErrorHandler submitErrorHandler_delegate$lambda$4(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment) {
        FragmentActivity fragmentActivityRequireActivity = mfaAuthAppVerifyFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new SubmitErrorHandler(fragmentActivityRequireActivity, C11048R.id.dialog_id_generic_error, ((Args) INSTANCE.getArgs((Fragment) mfaAuthAppVerifyFragment)).getFlowId());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setSoftInputMode(3);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C282721(null), 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().mfaAuthAppVerifyNumpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyFragment.onViewCreated$lambda$6(this.f$0, (KeyEvent) obj);
            }
        });
        RdsFormattedEditText mfaAuthAppVerifyInput = getBinding().mfaAuthAppVerifyInput;
        Intrinsics.checkNotNullExpressionValue(mfaAuthAppVerifyInput, "mfaAuthAppVerifyInput");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(mfaAuthAppVerifyInput).map(new Function() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment.onViewCreated.3
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
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MfaAuthAppVerifyFragment.onViewCreated$lambda$7(this.f$0, (String) obj);
            }
        });
    }

    /* compiled from: MfaAuthAppVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1", m3645f = "MfaAuthAppVerifyFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1 */
    static final class C282721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282721(Continuation<? super C282721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282721 c282721 = MfaAuthAppVerifyFragment.this.new C282721(continuation);
            c282721.L$0 = obj;
            return c282721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MfaAuthAppVerifyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1$1", m3645f = "MfaAuthAppVerifyFragment.kt", m3646l = {94}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MfaAuthAppVerifyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mfaAuthAppVerifyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MfaAuthAppVerifyFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C505391 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ MfaAuthAppVerifyFragment $tmp0;

                C505391(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment) {
                    this.$tmp0 = mfaAuthAppVerifyFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, MfaAuthAppVerifyFragment.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(MfaAuthAppVerifyViewState mfaAuthAppVerifyViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, mfaAuthAppVerifyViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((MfaAuthAppVerifyViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<MfaAuthAppVerifyViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C505391 c505391 = new C505391(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c505391, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bind(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment, MfaAuthAppVerifyViewState mfaAuthAppVerifyViewState, Continuation continuation) {
                mfaAuthAppVerifyFragment.bind(mfaAuthAppVerifyViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(MfaAuthAppVerifyFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(MfaAuthAppVerifyFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: MfaAuthAppVerifyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1$2", m3645f = "MfaAuthAppVerifyFragment.kt", m3646l = {97}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MfaAuthAppVerifyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = mfaAuthAppVerifyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MfaAuthAppVerifyFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$onViewCreated$1$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ MfaAuthAppVerifyFragment $tmp0;

                AnonymousClass1(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment) {
                    this.$tmp0 = mfaAuthAppVerifyFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, MfaAuthAppVerifyFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<MfaAuthAppVerifyEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<MfaAuthAppVerifyEvent>) obj, (Continuation<? super Unit>) continuation);
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
            public static final /* synthetic */ Object invokeSuspend$handleEvent(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment, Event event, Continuation continuation) {
                mfaAuthAppVerifyFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment, KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mfaAuthAppVerifyFragment.getBinding().mfaAuthAppVerifyInput.dispatchKeyEvent(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment, String str) {
        mfaAuthAppVerifyFragment.getDuxo().onInputChange(str.toString());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11048R.id.dialog_id_submit_error) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Login(null, null, false, 7, null), null, true, null, null, 52, null);
            requireActivity().finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11048R.id.dialog_id_submit_error) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Login(null, null, false, 7, null), null, true, null, null, 52, null);
            Navigator navigator2 = getNavigator();
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, contextRequireContext2, new ContactSupportFragmentKey.TriageFlow(null, null, null, null, null, 31, null), false, false, false, false, null, false, null, null, 988, null);
            requireActivity().finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_mfa_token_error) {
            getCallbacks().onErrorDialogDismissed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getShouldOpenAuthApp() && ((Args) companion.getArgs((Fragment) this)).getTotpToken() == null) {
            getCallbacks().onFinishMfaFlow(false);
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MfaAuthAppVerifyViewState state) {
        ShimmerLoadingView mfaAuthAppVerifyLoadingView = getBinding().mfaAuthAppVerifyLoadingView;
        Intrinsics.checkNotNullExpressionValue(mfaAuthAppVerifyLoadingView, "mfaAuthAppVerifyLoadingView");
        mfaAuthAppVerifyLoadingView.setVisibility(state.isLoading() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MfaAuthAppVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$SubmitErrorHandler;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$ErrorHandler;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dialogId", "", "flowId", "Lcom/robinhood/models/api/Challenge$Flow;", "<init>", "(Landroidx/fragment/app/FragmentActivity;ILcom/robinhood/models/api/Challenge$Flow;)V", "handleError", "", "t", "", "handleNonNetworkError", "handleErrorResponse", "errorResponse", "Lcom/robinhood/models/api/ErrorResponse;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class SubmitErrorHandler extends ErrorHandler {
        private final FragmentActivity activity;
        private final int dialogId;
        private final Challenge.Flow flowId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitErrorHandler(FragmentActivity activity, int i, Challenge.Flow flow) {
            super(activity, i);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.dialogId = i;
            this.flowId = flow;
        }

        @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
        public boolean handleError(Throwable t, boolean handleNonNetworkError) {
            Intrinsics.checkNotNullParameter(t, "t");
            Integer httpStatusCode = Throwables.getHttpStatusCode(t);
            if (httpStatusCode != null && httpStatusCode.intValue() == 401 && this.flowId == Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_APP_MFA) {
                RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this.activity).setId(C11048R.id.dialog_id_submit_error).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setPositiveButton(C28186R.string.setting_mfa_auth_app_revovery_fail_primary, new Object[0]).setNegativeButton(C39076R.string.challenge_response_dialog_attempts_exhausted_contact_support, new Object[0]).setTitle(C28186R.string.setting_mfa_auth_app_recovery_fail_title, new Object[0]).setMessage(C28186R.string.setting_mfa_auth_app_recovery_fail_message, new Object[0]);
                FragmentManager supportFragmentManager = this.activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message, supportFragmentManager, "error", false, 4, null);
                return true;
            }
            return super.handleError(t, handleNonNetworkError);
        }

        @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
        public boolean handleErrorResponse(ErrorResponse errorResponse) {
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            if (errorResponse instanceof RecoverAppMfaErrorResponse) {
                RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this.activity).setId(this.dialogId).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C28186R.string.setting_mfa_auth_app_recovery_retry_title, new Object[0]).setMessage(C28186R.string.setting_mfa_auth_app_recovery_retry_message, new Object[0]);
                FragmentManager supportFragmentManager = this.activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message, supportFragmentManager, "error", false, 4, null);
                return true;
            }
            return super.handleErrorResponse(errorResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MfaAuthAppVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$ErrorHandler;", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "dialogId", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;I)V", "showShortError", "", "message", "", "showLongError", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static class ErrorHandler extends ActivityErrorHandler<Object> {
        private final FragmentActivity activity;
        private final int dialogId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorHandler(FragmentActivity activity, int i) {
            super(activity, false, 0, null, 14, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.dialogId = i;
        }

        @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
        protected void showShortError(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            showLongError(message);
        }

        @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
        protected void showLongError(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            RhDialogFragment.Builder message2 = RhDialogFragment.INSTANCE.create(this.activity).setId(this.dialogId).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
            FragmentManager supportFragmentManager = this.activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
        }
    }

    /* compiled from: MfaAuthAppVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Args;", "Landroid/os/Parcelable;", "shouldOpenAuthApp", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "totpToken", "", "enrollmentToken", "flowId", "Lcom/robinhood/models/api/Challenge$Flow;", "<init>", "(ZLjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/Challenge$Flow;)V", "getShouldOpenAuthApp", "()Z", "getChallengeId", "()Ljava/util/UUID;", "getTotpToken", "()Ljava/lang/String;", "getEnrollmentToken", "getFlowId", "()Lcom/robinhood/models/api/Challenge$Flow;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID challengeId;
        private final String enrollmentToken;
        private final Challenge.Flow flowId;
        private final boolean shouldOpenAuthApp;
        private final String totpToken;

        /* compiled from: MfaAuthAppVerifyFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), (Challenge.Flow) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, UUID uuid, String str, String str2, Challenge.Flow flow, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.shouldOpenAuthApp;
            }
            if ((i & 2) != 0) {
                uuid = args.challengeId;
            }
            if ((i & 4) != 0) {
                str = args.totpToken;
            }
            if ((i & 8) != 0) {
                str2 = args.enrollmentToken;
            }
            if ((i & 16) != 0) {
                flow = args.flowId;
            }
            Challenge.Flow flow2 = flow;
            String str3 = str;
            return args.copy(z, uuid, str3, str2, flow2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldOpenAuthApp() {
            return this.shouldOpenAuthApp;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTotpToken() {
            return this.totpToken;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEnrollmentToken() {
            return this.enrollmentToken;
        }

        /* renamed from: component5, reason: from getter */
        public final Challenge.Flow getFlowId() {
            return this.flowId;
        }

        public final Args copy(boolean shouldOpenAuthApp, UUID challengeId, String totpToken, String enrollmentToken, Challenge.Flow flowId) {
            return new Args(shouldOpenAuthApp, challengeId, totpToken, enrollmentToken, flowId);
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
            return this.shouldOpenAuthApp == args.shouldOpenAuthApp && Intrinsics.areEqual(this.challengeId, args.challengeId) && Intrinsics.areEqual(this.totpToken, args.totpToken) && Intrinsics.areEqual(this.enrollmentToken, args.enrollmentToken) && this.flowId == args.flowId;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.shouldOpenAuthApp) * 31;
            UUID uuid = this.challengeId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            String str = this.totpToken;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.enrollmentToken;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Challenge.Flow flow = this.flowId;
            return iHashCode4 + (flow != null ? flow.hashCode() : 0);
        }

        public String toString() {
            return "Args(shouldOpenAuthApp=" + this.shouldOpenAuthApp + ", challengeId=" + this.challengeId + ", totpToken=" + this.totpToken + ", enrollmentToken=" + this.enrollmentToken + ", flowId=" + this.flowId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.shouldOpenAuthApp ? 1 : 0);
            dest.writeSerializable(this.challengeId);
            dest.writeString(this.totpToken);
            dest.writeString(this.enrollmentToken);
            dest.writeParcelable(this.flowId, flags);
        }

        public Args(boolean z, UUID uuid, String str, String str2, Challenge.Flow flow) {
            this.shouldOpenAuthApp = z;
            this.challengeId = uuid;
            this.totpToken = str;
            this.enrollmentToken = str2;
            this.flowId = flow;
        }

        public /* synthetic */ Args(boolean z, UUID uuid, String str, String str2, Challenge.Flow flow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : flow);
        }

        public final boolean getShouldOpenAuthApp() {
            return this.shouldOpenAuthApp;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final String getTotpToken() {
            return this.totpToken;
        }

        public final String getEnrollmentToken() {
            return this.enrollmentToken;
        }

        public final Challenge.Flow getFlowId() {
            return this.flowId;
        }
    }

    /* compiled from: MfaAuthAppVerifyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppVerifyFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MfaAuthAppVerifyFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, mfaAuthAppVerifyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MfaAuthAppVerifyFragment newInstance(Args args) {
            return (MfaAuthAppVerifyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MfaAuthAppVerifyFragment mfaAuthAppVerifyFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, mfaAuthAppVerifyFragment, args);
        }
    }
}
