package com.robinhood.android.securitycenter.p251ui.mfa.app;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.databinding.FragmentMfaAuthAppKeyBinding;
import com.robinhood.android.securitycenter.p251ui.mfa.app.MfaAuthAppKeyEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MfaAuthAppKeyFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001c\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0003:;<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u000205H\u0002J\u0016\u00106\u001a\u00020\u001a2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyDuxo;", "getDuxo", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppKeyBinding;", "getBinding", "()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppKeyBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Callbacks;", "callbacks$delegate", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "errorHandler", "com/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$errorHandler$2$1", "getErrorHandler", "()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$errorHandler$2$1;", "errorHandler$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "bind", "state", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyEvent;", "Callbacks", "Args", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MfaAuthAppKeyFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    private final Screen eventScreen;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MfaAuthAppKeyFragment.class, "binding", "getBinding()Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppKeyBinding;", 0)), Reflection.property1(new PropertyReference1Impl(MfaAuthAppKeyFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MfaAuthAppKeyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Callbacks;", "", "onAuthAppKeyContinue", "", "onFinishMfaFlow", "hasCompletedSetup", "", "onErrorDialogDismissed", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAuthAppKeyContinue();

        void onErrorDialogDismissed();

        void onFinishMfaFlow(boolean hasCompletedSetup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<MfaAuthAppKeyEvent> event) {
        EventConsumer<MfaAuthAppKeyEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof MfaAuthAppKeyEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18812invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18812invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MfaAuthAppKeyEvent mfaAuthAppKeyEvent = (MfaAuthAppKeyEvent) event.getData();
                if (mfaAuthAppKeyEvent instanceof MfaAuthAppKeyEvent.Error) {
                    AbsErrorHandler.handleError$default(this.getErrorHandler(), ((MfaAuthAppKeyEvent.Error) mfaAuthAppKeyEvent).getThrowable(), false, 2, null);
                } else {
                    if (!(mfaAuthAppKeyEvent instanceof MfaAuthAppKeyEvent.VerificationRequired)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MfaAuthAppKeyEvent.VerificationRequired verificationRequired = (MfaAuthAppKeyEvent.VerificationRequired) mfaAuthAppKeyEvent;
                    this.launchSuv.invoke(verificationRequired.getWorkflowId(), Boolean.valueOf(verificationRequired.isMigrated()));
                }
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

    public MfaAuthAppKeyFragment() {
        super(C28186R.layout.fragment_mfa_auth_app_key);
        this.duxo = DuxosKt.duxo(this, MfaAuthAppKeyDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, MfaAuthAppKeyFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppKeyFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppKeyFragment.launchSuv$lambda$2(this.f$0);
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppKeyFragment.errorHandler_delegate$lambda$3(this.f$0);
            }
        });
        this.eventScreen = new Screen(Screen.Name.MANUAL_APP_MFA_ENROLLMENT_KEY, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaAuthAppKeyDuxo getDuxo() {
        return (MfaAuthAppKeyDuxo) this.duxo.getValue();
    }

    private final FragmentMfaAuthAppKeyBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMfaAuthAppKeyBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(MfaAuthAppKeyFragment mfaAuthAppKeyFragment) {
        mfaAuthAppKeyFragment.getDuxo().fetchAuthAppToken();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(MfaAuthAppKeyFragment mfaAuthAppKeyFragment) {
        mfaAuthAppKeyFragment.getCallbacks().onFinishMfaFlow(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaAuthAppKeyFragment3 getErrorHandler() {
        return (MfaAuthAppKeyFragment3) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$errorHandler$2$1] */
    public static final MfaAuthAppKeyFragment3 errorHandler_delegate$lambda$3(final MfaAuthAppKeyFragment mfaAuthAppKeyFragment) {
        final FragmentActivity fragmentActivityRequireActivity = mfaAuthAppKeyFragment.requireActivity();
        return new ActivityErrorHandler<Object>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$errorHandler$2$1
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getToken() != null) {
            return false;
        }
        getCallbacks().onFinishMfaFlow(false);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: MfaAuthAppKeyFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$1 */
    /* synthetic */ class C282631 extends FunctionReferenceImpl implements Function0<Unit> {
        C282631(Object obj) {
            super(0, obj, Callbacks.class, "onAuthAppKeyContinue", "onAuthAppKeyContinue()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onAuthAppKeyContinue();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton mfaAuthAppContinueBtn = getBinding().mfaAuthAppContinueBtn;
        Intrinsics.checkNotNullExpressionValue(mfaAuthAppContinueBtn, "mfaAuthAppContinueBtn");
        OnClickListeners.onClick(mfaAuthAppContinueBtn, new C282631(getCallbacks()));
        BaseFragment.collectDuxoState$default(this, null, new C282642(null), 1, null);
    }

    /* compiled from: MfaAuthAppKeyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2", m3645f = "MfaAuthAppKeyFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2 */
    static final class C282642 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282642(Continuation<? super C282642> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282642 c282642 = MfaAuthAppKeyFragment.this.new C282642(continuation);
            c282642.L$0 = obj;
            return c282642;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282642) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MfaAuthAppKeyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2$1", m3645f = "MfaAuthAppKeyFragment.kt", m3646l = {100}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MfaAuthAppKeyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MfaAuthAppKeyFragment mfaAuthAppKeyFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mfaAuthAppKeyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MfaAuthAppKeyFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C505381 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ MfaAuthAppKeyFragment $tmp0;

                C505381(MfaAuthAppKeyFragment mfaAuthAppKeyFragment) {
                    this.$tmp0 = mfaAuthAppKeyFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, MfaAuthAppKeyFragment.class, "bind", "bind(Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(MfaAuthAppKeyViewState mfaAuthAppKeyViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, mfaAuthAppKeyViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((MfaAuthAppKeyViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<MfaAuthAppKeyViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C505381 c505381 = new C505381(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c505381, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bind(MfaAuthAppKeyFragment mfaAuthAppKeyFragment, MfaAuthAppKeyViewState mfaAuthAppKeyViewState, Continuation continuation) {
                mfaAuthAppKeyFragment.bind(mfaAuthAppKeyViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(MfaAuthAppKeyFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(MfaAuthAppKeyFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: MfaAuthAppKeyFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2$2", m3645f = "MfaAuthAppKeyFragment.kt", m3646l = {103}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MfaAuthAppKeyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MfaAuthAppKeyFragment mfaAuthAppKeyFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = mfaAuthAppKeyFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MfaAuthAppKeyFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$onViewCreated$2$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ MfaAuthAppKeyFragment $tmp0;

                AnonymousClass1(MfaAuthAppKeyFragment mfaAuthAppKeyFragment) {
                    this.$tmp0 = mfaAuthAppKeyFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, MfaAuthAppKeyFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<MfaAuthAppKeyEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<MfaAuthAppKeyEvent>) obj, (Continuation<? super Unit>) continuation);
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
            public static final /* synthetic */ Object invokeSuspend$handleEvent(MfaAuthAppKeyFragment mfaAuthAppKeyFragment, Event event, Continuation continuation) {
                mfaAuthAppKeyFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
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
    public final void bind(final MfaAuthAppKeyViewState state) {
        RhTextView mfaAuthAppKeySubtitle = getBinding().mfaAuthAppKeySubtitle;
        Intrinsics.checkNotNullExpressionValue(mfaAuthAppKeySubtitle, "mfaAuthAppKeySubtitle");
        String string2 = ViewsKt.getString(mfaAuthAppKeySubtitle, C28186R.string.setting_mfa_auth_app_key_subtitle);
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore((TextView) mfaAuthAppKeySubtitle, (CharSequence) string2, true, true, num != null ? ViewsKt.getString(mfaAuthAppKeySubtitle, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$bind$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string3 = this.this$0.getString(C28186R.string.url_mfa_faq);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                android.content.Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string3);
            }
        }, 1, (DefaultConstructorMarker) null));
        getBinding().mfaAuthAppKeyLabel.setText(state.getToken());
        RdsTextButton mfaAuthAppKeyCopyBtn = getBinding().mfaAuthAppKeyCopyBtn;
        Intrinsics.checkNotNullExpressionValue(mfaAuthAppKeyCopyBtn, "mfaAuthAppKeyCopyBtn");
        mfaAuthAppKeyCopyBtn.setVisibility(state.isLoading() ? 8 : 0);
        RdsTextButton mfaAuthAppKeyCopyBtn2 = getBinding().mfaAuthAppKeyCopyBtn;
        Intrinsics.checkNotNullExpressionValue(mfaAuthAppKeyCopyBtn2, "mfaAuthAppKeyCopyBtn");
        OnClickListeners.onClick(mfaAuthAppKeyCopyBtn2, new Function0() { // from class: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MfaAuthAppKeyFragment.bind$lambda$6(this.f$0, state);
            }
        });
        getBinding().mfaAuthAppContinueBtn.setLoading(state.isLoading());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(MfaAuthAppKeyFragment mfaAuthAppKeyFragment, MfaAuthAppKeyViewState mfaAuthAppKeyViewState) {
        String string2 = mfaAuthAppKeyFragment.getString(C28186R.string.setting_mfa_auth_app_key_clipdata_label);
        String token = mfaAuthAppKeyViewState.getToken();
        Intrinsics.checkNotNull(token);
        ClipData clipDataNewPlainText = ClipData.newPlainText(string2, token);
        FragmentActivity fragmentActivityRequireActivity = mfaAuthAppKeyFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ContextSystemServices.getClipboardManager(fragmentActivityRequireActivity).setPrimaryClip(clipDataNewPlainText);
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        LinearLayout root = mfaAuthAppKeyFragment.getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String string3 = mfaAuthAppKeyFragment.getString(C28186R.string.setting_mfa_copy_token_alert);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        companion.make(root, string3, -1).setLeadingIcon(C20690R.drawable.ic_rds_info_24dp).show();
        return Unit.INSTANCE;
    }

    /* compiled from: MfaAuthAppKeyFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Args;", "Landroid/os/Parcelable;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "token", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getChallengeId", "()Ljava/util/UUID;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID challengeId;
        private final String token;

        /* compiled from: MfaAuthAppKeyFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.challengeId;
            }
            if ((i & 2) != 0) {
                str = args.token;
            }
            return args.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final Args copy(UUID challengeId, String token) {
            return new Args(challengeId, token);
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
            return Intrinsics.areEqual(this.challengeId, args.challengeId) && Intrinsics.areEqual(this.token, args.token);
        }

        public int hashCode() {
            UUID uuid = this.challengeId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            String str = this.token;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(challengeId=" + this.challengeId + ", token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.challengeId);
            dest.writeString(this.token);
        }

        public Args(UUID uuid, String str) {
            this.challengeId = uuid;
            this.token = str;
        }

        public /* synthetic */ Args(UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : str);
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final String getToken() {
            return this.token;
        }
    }

    /* compiled from: MfaAuthAppKeyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment;", "Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyFragment$Args;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MfaAuthAppKeyFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MfaAuthAppKeyFragment mfaAuthAppKeyFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, mfaAuthAppKeyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MfaAuthAppKeyFragment newInstance(Args args) {
            return (MfaAuthAppKeyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MfaAuthAppKeyFragment mfaAuthAppKeyFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, mfaAuthAppKeyFragment, args);
        }
    }
}
