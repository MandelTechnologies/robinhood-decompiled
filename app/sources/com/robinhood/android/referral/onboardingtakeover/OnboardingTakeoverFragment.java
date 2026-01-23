package com.robinhood.android.referral.onboardingtakeover;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment;
import com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverState2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.ReferralLandingSdui;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OnboardingWelcomeTakeoverScreenContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OnboardingTakeoverFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u0003:\u00013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020'H\u0002J\u001a\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016J\r\u0010-\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010.J\u0015\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u000201H\u0003¢\u0006\u0002\u00102R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u00064²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDuxo;", "getDuxo", "()Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "handleEvent", "event", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "onValidationCompletedEvent", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$Success;", "onGenericErrorEvent", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$GenericError;", "onDuplicateEmailErrorEvent", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$DuplicateEmailError;", "onInvalidEmailErrorEvent", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$InvalidEmailError;", "onSuggestedEmailEvent", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$SuggestedEmail;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "LoggableScreenContent", "viewState", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverViewState;", "(Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverViewState;Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class OnboardingTakeoverFragment extends GenericComposeFragment implements AutoLoggableFragment, RhDialogFragment.OnClickListener {
    private static final String ARG_DUPLICATED_EMAIL = "duplicated_email";
    private static final String CURRENT_EMAIL = "current_email";
    private static final String DUPLICATE_EMAIL_ERROR_DIALOG_TAG = "duplicate-email-error";
    private static final String INVALID_EMAIL_ERROR_DIALOG_TAG = "email-validation-err";
    private static final String SUGGESTED_EMAIL = "suggested_email";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(OnboardingTakeoverFragment onboardingTakeoverFragment, int i, Composer composer, int i2) {
        onboardingTakeoverFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoggableScreenContent$lambda$4(OnboardingTakeoverFragment onboardingTakeoverFragment, OnboardingTakeoverViewState onboardingTakeoverViewState, int i, Composer composer, int i2) {
        onboardingTakeoverFragment.LoggableScreenContent(onboardingTakeoverViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    public OnboardingTakeoverFragment() {
        String simpleName = OnboardingTakeoverFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.eventScreen = new Screen(null, null, simpleName, null, 11, null);
        this.duxo = DuxosKt.duxo(this, OnboardingTakeoverDuxo.class);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingTakeoverDuxo getDuxo() {
        return (OnboardingTakeoverDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C267611(null), 1, null);
    }

    /* compiled from: OnboardingTakeoverFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$onViewCreated$1", m3645f = "OnboardingTakeoverFragment.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$onViewCreated$1 */
    static final class C267611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C267611(Continuation<? super C267611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnboardingTakeoverFragment.this.new C267611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C267611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(OnboardingTakeoverFragment.this.getDuxo().getEventFlow());
                final OnboardingTakeoverFragment onboardingTakeoverFragment = OnboardingTakeoverFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<OnboardingTakeoverState2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<OnboardingTakeoverState2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<OnboardingTakeoverState2> eventConsumerInvoke;
                        final OnboardingTakeoverFragment onboardingTakeoverFragment2 = onboardingTakeoverFragment;
                        if ((event.getData() instanceof OnboardingTakeoverState2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m18046invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m18046invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onboardingTakeoverFragment2.handleEvent((OnboardingTakeoverState2) event.getData());
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(OnboardingTakeoverState2 event) throws Throwable {
        if (event instanceof OnboardingTakeoverState2.SuggestedEmail) {
            onSuggestedEmailEvent((OnboardingTakeoverState2.SuggestedEmail) event);
            return;
        }
        if (event instanceof OnboardingTakeoverState2.DuplicateEmailError) {
            onDuplicateEmailErrorEvent((OnboardingTakeoverState2.DuplicateEmailError) event);
            return;
        }
        if (event instanceof OnboardingTakeoverState2.InvalidEmailError) {
            onInvalidEmailErrorEvent((OnboardingTakeoverState2.InvalidEmailError) event);
        } else if (event instanceof OnboardingTakeoverState2.GenericError) {
            onGenericErrorEvent((OnboardingTakeoverState2.GenericError) event);
        } else {
            if (!(event instanceof OnboardingTakeoverState2.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            onValidationCompletedEvent((OnboardingTakeoverState2.Success) event);
        }
    }

    private final void onValidationCompletedEvent(OnboardingTakeoverState2.Success event) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new UserCreation(null, event.getEmail(), null, null, null, event.getForceDarkTheme(), 29, null), null, false, null, null, 60, null);
    }

    private final void onGenericErrorEvent(OnboardingTakeoverState2.GenericError event) throws Throwable {
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, event.getThrowable(), true, false, 0, null, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingTakeoverViewState ComposeContent$lambda$2(SnapshotState4<OnboardingTakeoverViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private final void onDuplicateEmailErrorEvent(OnboardingTakeoverState2.DuplicateEmailError event) {
        Bundle bundle = new Bundle();
        bundle.putString(ARG_DUPLICATED_EMAIL, event.getEmail());
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder positiveButton = companion.create(fragmentActivityRequireActivity).setId(C26659R.id.dialog_id_onboarding_duplicate_email).setTitle(C11287R.string.user_creation_duplicate_email_error_title, new Object[0]).setPassthroughArgs(bundle).setMessage(C11287R.string.user_creation_duplicate_email_error_message, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]).setPositiveButton(C11287R.string.user_creation_duplicate_email_error_positive_button, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, DUPLICATE_EMAIL_ERROR_DIALOG_TAG, false, 4, null);
    }

    private final void onInvalidEmailErrorEvent(OnboardingTakeoverState2.InvalidEmailError event) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        RhDialogFragment.Builder message = companion.create(fragmentActivityRequireActivity).setId(C26659R.id.dialog_id_onboarding_invalid_email).setTitle(C11287R.string.onboarding_email_validation_error_title, new Object[0]).setMessage(C11287R.string.onboarding_email_validation_error, event.getEmail());
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, parentFragmentManager, INVALID_EMAIL_ERROR_DIALOG_TAG, false, 4, null);
    }

    private final void onSuggestedEmailEvent(OnboardingTakeoverState2.SuggestedEmail event) {
        String suggestedEmail = event.getSuggestedEmail();
        Bundle bundle = new Bundle();
        bundle.putString(SUGGESTED_EMAIL, suggestedEmail);
        bundle.putString(CURRENT_EMAIL, event.getCurrentEmail());
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(C11287R.id.dialog_id_email_entry_validation_error).setPassthroughArgs(bundle).setTitle(C11287R.string.onboarding_email_validation_error_title, new Object[0]);
        if (suggestedEmail == null) {
            title.setMessage(C11287R.string.onboarding_email_validation_error, event.getCurrentEmail()).setPositiveButton(C11287R.string.onboarding_email_validation_continue_action, new Object[0]).setNegativeButton(C11287R.string.onboarding_email_validation_edit_action, new Object[0]);
        } else {
            title.setMessage(C11287R.string.onboarding_email_validation_error_with_suggestion, suggestedEmail).setPositiveButton(C11048R.string.general_label_yes, new Object[0]).setNegativeButton(C11048R.string.general_label_no, new Object[0]);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(title, parentFragmentManager, INVALID_EMAIL_ERROR_DIALOG_TAG, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11287R.id.dialog_id_email_entry_validation_error) {
            String string2 = passthroughArgs != null ? passthroughArgs.getString(SUGGESTED_EMAIL) : null;
            String string3 = passthroughArgs != null ? passthroughArgs.getString(CURRENT_EMAIL) : null;
            if (string2 == null) {
                string2 = string3;
            }
            if (string2 != null) {
                getDuxo().onEmailConfirmed(string2, true);
            }
            return true;
        }
        if (id == C26659R.id.dialog_id_onboarding_duplicate_email) {
            Intrinsics.checkNotNull(passthroughArgs);
            String string4 = passthroughArgs.getString(ARG_DUPLICATED_EMAIL);
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new Login(string4, null, false, 6, null), null, false, null, null, 60, null);
            return true;
        }
        if (id == C20682R.id.dialog_id_privacy_policy_disclosure || id == C26659R.id.dialog_id_onboarding_invalid_email) {
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11287R.id.dialog_id_email_entry_validation_error) {
            String string2 = passthroughArgs != null ? passthroughArgs.getString(SUGGESTED_EMAIL) : null;
            String string3 = passthroughArgs != null ? passthroughArgs.getString(CURRENT_EMAIL) : null;
            if (string2 == null || string3 == null) {
                return true;
            }
            OnboardingTakeoverDuxo.onEmailConfirmed$default(getDuxo(), string3, false, 2, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(844626620);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(844626620, i2, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.ComposeContent (OnboardingTakeoverFragment.kt:185)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(-62632462);
            if (((ReferralLandingSdui) INSTANCE.getArgs((Fragment) this)).getTheme() != ColorTheme.DARK) {
                boolean z = DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme2.BentoTheme(Boolean.valueOf(!z), null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1891388932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.ComposeContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1891388932, i3, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.ComposeContent.<anonymous> (OnboardingTakeoverFragment.kt:190)");
                        }
                        if (((ReferralLandingSdui) OnboardingTakeoverFragment.INSTANCE.getArgs((Fragment) OnboardingTakeoverFragment.this)).getUse_xray_theme()) {
                            composer2.startReplaceGroup(691781346);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            long jet = bentoTheme.getColors(composer2, i4).getJet();
                            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i4).getJade(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                            long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i4).getJade(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
                            long jM21354getNightXrayLight0d7_KjU = BentoColor.INSTANCE.m21354getNightXrayLight0d7_KjU();
                            long jM6705copywmQWz5c$default3 = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i4).getJade(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null);
                            long jM6705copywmQWz5c$default4 = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i4).getJade(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                            final OnboardingTakeoverFragment onboardingTakeoverFragment = OnboardingTakeoverFragment.this;
                            final SnapshotState4<OnboardingTakeoverViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jet, jM6705copywmQWz5c$default, jM6705copywmQWz5c$default2, jM21354getNightXrayLight0d7_KjU, jM6705copywmQWz5c$default3, jM6705copywmQWz5c$default4, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1693664805, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.ComposeContent.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i5) {
                                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1693664805, i5, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.ComposeContent.<anonymous>.<anonymous> (OnboardingTakeoverFragment.kt:199)");
                                    }
                                    onboardingTakeoverFragment.LoggableScreenContent(OnboardingTakeoverFragment.ComposeContent$lambda$2(snapshotState4), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 805306368, 385);
                            SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer2, 0, 1);
                            Unit unit = Unit.INSTANCE;
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged = composer2.changed(systemUiControllerRememberSystemUiController);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new OnboardingTakeoverFragment2(systemUiControllerRememberSystemUiController, null);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(692584990);
                            OnboardingTakeoverFragment.this.LoggableScreenContent(OnboardingTakeoverFragment.ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle), composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingTakeoverFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void LoggableScreenContent(final OnboardingTakeoverViewState onboardingTakeoverViewState, Composer composer, final int i) {
        int i2;
        String experiment;
        String referral_code;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1721223425);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onboardingTakeoverViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1721223425, i2, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.LoggableScreenContent (OnboardingTakeoverFragment.kt:215)");
            }
            String simpleName = OnboardingTakeoverFragment.class.getSimpleName();
            ReferralLandingSdui.LoggingContext logging_context = onboardingTakeoverViewState.getContent().getLogging_context();
            String str = (logging_context == null || (referral_code = logging_context.getReferral_code()) == null) ? "" : referral_code;
            ReferralLandingSdui.LoggingContext logging_context2 = onboardingTakeoverViewState.getContent().getLogging_context();
            String str2 = (logging_context2 == null || (experiment = logging_context2.getExperiment()) == null) ? "" : experiment;
            Object[] objArr = 0 == true ? 1 : 0;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(simpleName, null, null, new Context(0, 0, 0, null, null, 0 == true ? 1 : 0, null, objArr, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OnboardingWelcomeTakeoverScreenContext(str, str2, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -17, -1, 16383, null), null, null, 54, null), ComposableLambda3.rememberComposableLambda(-802968204, true, new C267601(onboardingTakeoverViewState, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingTakeoverFragment.LoggableScreenContent$lambda$4(this.f$0, onboardingTakeoverViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OnboardingTakeoverFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$LoggableScreenContent$1 */
    static final class C267601 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OnboardingTakeoverViewState $viewState;
        final /* synthetic */ OnboardingTakeoverFragment this$0;

        C267601(OnboardingTakeoverViewState onboardingTakeoverViewState, OnboardingTakeoverFragment onboardingTakeoverFragment) {
            this.$viewState = onboardingTakeoverViewState;
            this.this$0 = onboardingTakeoverFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-802968204, i, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment.LoggableScreenContent.<anonymous> (OnboardingTakeoverFragment.kt:227)");
            }
            ReferralLandingSdui content = this.$viewState.getContent();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final OnboardingTakeoverFragment onboardingTakeoverFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$LoggableScreenContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OnboardingTakeoverFragment.C267601.invoke$lambda$1$lambda$0(onboardingTakeoverFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
            final OnboardingTakeoverFragment onboardingTakeoverFragment2 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$LoggableScreenContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OnboardingTakeoverFragment.C267601.invoke$lambda$3$lambda$2(onboardingTakeoverFragment2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(this.this$0);
            final OnboardingTakeoverFragment onboardingTakeoverFragment3 = this.this$0;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$LoggableScreenContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OnboardingTakeoverFragment.C267601.invoke$lambda$5$lambda$4(onboardingTakeoverFragment3, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverFragment$LoggableScreenContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OnboardingTakeoverFragment.C267601.invoke$lambda$7$lambda$6((AlertAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            OnboardingTakeoverComposable.OnboardingTakeoverComposable(null, content, function0, function1, function12, (Function1) objRememberedValue4, composer, 196608, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OnboardingTakeoverFragment onboardingTakeoverFragment) {
            onboardingTakeoverFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(OnboardingTakeoverFragment onboardingTakeoverFragment, String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Navigator navigator = onboardingTakeoverFragment.getNavigator();
            android.content.Context contextRequireContext = onboardingTakeoverFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(deeplink), null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(OnboardingTakeoverFragment onboardingTakeoverFragment, String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            onboardingTakeoverFragment.getDuxo().validateEmail(email);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(AlertAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OnboardingTakeoverFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverFragment;", "Lcom/robinhood/models/api/ReferralLandingSdui;", "<init>", "()V", "CURRENT_EMAIL", "", "SUGGESTED_EMAIL", "ARG_DUPLICATED_EMAIL", "DUPLICATE_EMAIL_ERROR_DIALOG_TAG", "INVALID_EMAIL_ERROR_DIALOG_TAG", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OnboardingTakeoverFragment, ReferralLandingSdui> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ReferralLandingSdui getArgs(OnboardingTakeoverFragment onboardingTakeoverFragment) {
            return (ReferralLandingSdui) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, onboardingTakeoverFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OnboardingTakeoverFragment newInstance(ReferralLandingSdui referralLandingSdui) {
            return (OnboardingTakeoverFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, referralLandingSdui);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OnboardingTakeoverFragment onboardingTakeoverFragment, ReferralLandingSdui referralLandingSdui) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, onboardingTakeoverFragment, referralLandingSdui);
        }
    }
}
