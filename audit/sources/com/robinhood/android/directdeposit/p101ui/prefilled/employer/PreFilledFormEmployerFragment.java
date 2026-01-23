package com.robinhood.android.directdeposit.p101ui.prefilled.employer;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.prefilled.employer.PreFilledFormEmployerFragment;
import com.robinhood.android.directdeposit.p101ui.prefilled.employer.PreFilledFormEmployerViewState;
import com.robinhood.android.employment.lib.ChooseEmploymentResultContract;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.onboarding.contracts.ChooseEmploymentContext;
import com.robinhood.shared.onboarding.contracts.ChooseEmploymentIntentKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PreFilledFormEmployerFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002=>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020%H\u0016J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020%H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0016J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010)H\u0016J\u001a\u00107\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010)H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u000203H\u0002J\u0010\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "employerEdt", "Landroid/widget/EditText;", "getEmployerEdt", "()Landroid/widget/EditText;", "employerEdt$delegate", "continueBtn", "Landroid/widget/Button;", "getContinueBtn", "()Landroid/widget/Button;", "continueBtn$delegate", "chooseEmployerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindViewState", "state", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerViewState;", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "confirmEmployer", "updatedEmploymentInfo", "showUpdateEmployerDialog", "dialogContent", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerViewState$UpdateDialogContent;", "Callbacks", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormEmployerFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ActivityResultLauncher<Intent> chooseEmployerLauncher;

    /* renamed from: continueBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 continueBtn;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: employerEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 employerEdt;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PreFilledFormEmployerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormEmployerFragment.class, "employerEdt", "getEmployerEdt()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormEmployerFragment.class, "continueBtn", "getContinueBtn()Landroid/widget/Button;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PreFilledFormEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment$Callbacks;", "", "onEmployerConfirmed", "", "employer", "", "updatedEmploymentInfo", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEmployerConfirmed(String employer, boolean updatedEmploymentInfo);
    }

    public PreFilledFormEmployerFragment() {
        super(C14044R.layout.fragment_pre_filled_form_employer);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, PreFilledFormEmployerDuxo.class);
        this.employerEdt = bindView(C14044R.id.pre_filled_form_employer);
        this.continueBtn = bindView(C14044R.id.pre_filled_form_employer_continue_btn);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChooseEmploymentResultContract(), new ActivityResultCallback() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerFragment$chooseEmployerLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(UiEmploymentInfo uiEmploymentInfo) {
                if (uiEmploymentInfo != null) {
                    PreFilledFormEmployerFragment.Callbacks callbacks = this.this$0.getCallbacks();
                    String employerName = uiEmploymentInfo.getEmployerName();
                    Intrinsics.checkNotNull(employerName);
                    callbacks.onEmployerConfirmed(employerName, true);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.chooseEmployerLauncher = activityResultLauncherRegisterForActivityResult;
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
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final PreFilledFormEmployerDuxo getDuxo() {
        return (PreFilledFormEmployerDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText getEmployerEdt() {
        return (EditText) this.employerEdt.getValue(this, $$delegatedProperties[1]);
    }

    private final Button getContinueBtn() {
        return (Button) this.continueBtn.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getDuxo().bindEmployerInputChanges(RxTextView.textChanges(getEmployerEdt()));
        OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormEmployerFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        getLifecycleScope().launchWhenStarted(new C141012(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PreFilledFormEmployerFragment preFilledFormEmployerFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormEmployerFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_PARTIAL_PAYCHECK, new Screen(Screen.Name.DD_UPDATE_EMPLOYER, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormEmployerFragment.getDuxo().onContinueClick(preFilledFormEmployerFragment.getEmployerEdt().getText().toString());
        return Unit.INSTANCE;
    }

    /* compiled from: PreFilledFormEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerFragment$onViewCreated$2", m3645f = "PreFilledFormEmployerFragment.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerFragment$onViewCreated$2 */
    static final class C141012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C141012(Continuation<? super C141012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PreFilledFormEmployerFragment.this.new C141012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C141012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FragmentActivity fragmentActivityRequireActivity = PreFilledFormEmployerFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ContextsUiExtensions.showKeyboard$default(fragmentActivityRequireActivity, PreFilledFormEmployerFragment.this.getEmployerEdt(), false, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_UPDATE_EMPLOYER, null, null, null, 14, null), null, null, null, 29, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141001(this));
    }

    /* compiled from: PreFilledFormEmployerFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.prefilled.employer.PreFilledFormEmployerFragment$onStart$1 */
    /* synthetic */ class C141001 extends FunctionReferenceImpl implements Function1<PreFilledFormEmployerViewState, Unit> {
        C141001(Object obj) {
            super(1, obj, PreFilledFormEmployerFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PreFilledFormEmployerViewState preFilledFormEmployerViewState) throws Resources.NotFoundException {
            invoke2(preFilledFormEmployerViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PreFilledFormEmployerViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PreFilledFormEmployerFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(PreFilledFormEmployerViewState state) throws Resources.NotFoundException {
        String employerInputHint = state.getEmployerInputHint();
        if (employerInputHint != null) {
            getEmployerEdt().setHint(employerInputHint);
        }
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(state.isLoading());
        }
        getEmployerEdt().setEnabled(state.getEmployerInputEnabled());
        getContinueBtn().setEnabled(state.getContinueButtonEnabled());
        UiEvent<Unit> employmentConfirmed = state.getEmploymentConfirmed();
        if ((employmentConfirmed != null ? employmentConfirmed.consume() : null) != null) {
            confirmEmployer(false);
        }
        UiEvent<Unit> employmentUpdated = state.getEmploymentUpdated();
        if ((employmentUpdated != null ? employmentUpdated.consume() : null) != null) {
            confirmEmployer(true);
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        PreFilledFormEmployerViewState.UpdateDialogContent updateDialogBundle = state.getUpdateDialogBundle(resources, getEmployerEdt().getText().toString());
        if (updateDialogBundle != null) {
            showUpdateEmployerDialog(updateDialogBundle);
        }
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getEmploymentUpdateError());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14044R.id.dialog_direct_deposit_update_employment || id == C14044R.id.dialog_direct_deposit_update_employment_experiment) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.APPROVE, new Screen(Screen.Name.DD_UPDATE_EMPLOYER, null, null, null, 14, null), new Component(Component.ComponentType.UPDATE_EMPLOYER_INFO_ALERT, null, null, 6, null), null, null, false, 56, null);
            ActivityResultLauncher<Intent> activityResultLauncher = this.chooseEmployerLauncher;
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new ChooseEmploymentIntentKey(new ChooseEmploymentContext.Employed(getEmployerEdt().getText().toString()), false, 2, null), null, false, 12, null));
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14044R.id.dialog_direct_deposit_update_employment || id == C14044R.id.dialog_direct_deposit_update_employment_experiment) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.DD_UPDATE_EMPLOYER, null, null, null, 14, null), new Component(Component.ComponentType.UPDATE_EMPLOYER_INFO_ALERT, null, null, 6, null), null, null, false, 56, null);
            if (id != C14044R.id.dialog_direct_deposit_update_employment_experiment) {
                return true;
            }
            getCallbacks().onEmployerConfirmed(getEmployerEdt().getText().toString(), false);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final void confirmEmployer(boolean updatedEmploymentInfo) {
        getCallbacks().onEmployerConfirmed(getEmployerEdt().getText().toString(), updatedEmploymentInfo);
    }

    private final void showUpdateEmployerDialog(PreFilledFormEmployerViewState.UpdateDialogContent dialogContent) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(dialogContent.getId()).setTitle(dialogContent.getTitleRes(), new Object[0]).setMessage(dialogContent.getMessage()).setPositiveButton(dialogContent.getPositiveButtonRes(), new Object[0]).setNegativeButton(dialogContent.getNegativeButtonRes(), new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "directDepositUpdateEmployment", false, 4, null);
    }

    /* compiled from: PreFilledFormEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/directdeposit/ui/prefilled/employer/PreFilledFormEmployerFragment;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PreFilledFormEmployerFragment newInstance() {
            return new PreFilledFormEmployerFragment();
        }
    }
}
