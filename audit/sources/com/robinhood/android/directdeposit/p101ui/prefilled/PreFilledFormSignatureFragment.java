package com.robinhood.android.directdeposit.p101ui.prefilled;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.signature.SignatureView;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PreFilledFormSignatureFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020(H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b \u0010\u001dR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b$\u0010%¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "root$delegate", "signatureView", "Lcom/robinhood/android/signature/SignatureView;", "getSignatureView", "()Lcom/robinhood/android/signature/SignatureView;", "signatureView$delegate", "acceptBtn", "Lcom/robinhood/android/designsystem/button/RdsIconButton;", "getAcceptBtn", "()Lcom/robinhood/android/designsystem/button/RdsIconButton;", "acceptBtn$delegate", "clearBtn", "getClearBtn", "clearBtn$delegate", "signHereLabel", "Landroid/widget/TextView;", "getSignHereLabel", "()Landroid/widget/TextView;", "signHereLabel$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onSignatureStateChanged", "signatureViewState", "Lcom/robinhood/android/signature/SignatureView$State;", "onStart", "Callbacks", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormSignatureFragment extends BaseFragment {

    /* renamed from: acceptBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 acceptBtn;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: clearBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 clearBtn;
    public EventLogger eventLogger;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final Interfaces2 root;

    /* renamed from: signHereLabel$delegate, reason: from kotlin metadata */
    private final Interfaces2 signHereLabel;

    /* renamed from: signatureView$delegate, reason: from kotlin metadata */
    private final Interfaces2 signatureView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PreFilledFormSignatureFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSignatureFragment.class, BentoCurrencyPicker.ROOT_TEST_TAG, "getRoot()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSignatureFragment.class, "signatureView", "getSignatureView()Lcom/robinhood/android/signature/SignatureView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSignatureFragment.class, "acceptBtn", "getAcceptBtn()Lcom/robinhood/android/designsystem/button/RdsIconButton;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSignatureFragment.class, "clearBtn", "getClearBtn()Lcom/robinhood/android/designsystem/button/RdsIconButton;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormSignatureFragment.class, "signHereLabel", "getSignHereLabel()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PreFilledFormSignatureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment$Callbacks;", "", "onConfirmSignature", "", "signature", "Lcom/robinhood/android/signature/SignatureView$Signature;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmSignature(SignatureView.Signature signature);
    }

    /* compiled from: PreFilledFormSignatureFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignatureView.State.values().length];
            try {
                iArr[SignatureView.State.CLEARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignatureView.State.DRAWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PreFilledFormSignatureFragment() {
        super(C14044R.layout.fragment_pre_filled_form_signature);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormSignatureFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.root = bindView(C14044R.id.pre_filled_form_signature_root);
        this.signatureView = bindView(C14044R.id.pre_filled_form_signature_pad);
        this.acceptBtn = bindView(C14044R.id.pre_filled_form_signature_accept);
        this.clearBtn = bindView(C14044R.id.pre_filled_form_signature_clear);
        this.signHereLabel = bindView(C14044R.id.pre_filled_form_signature_sign_here);
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final ViewGroup getRoot() {
        return (ViewGroup) this.root.getValue(this, $$delegatedProperties[1]);
    }

    private final SignatureView getSignatureView() {
        return (SignatureView) this.signatureView.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsIconButton getAcceptBtn() {
        return (RdsIconButton) this.acceptBtn.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsIconButton getClearBtn() {
        return (RdsIconButton) this.clearBtn.getValue(this, $$delegatedProperties[4]);
    }

    private final TextView getSignHereLabel() {
        return (TextView) this.signHereLabel.getValue(this, $$delegatedProperties[5]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, getSignatureView().getStateRelay(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormSignatureFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormSignatureFragment.onViewCreated$lambda$0(this.f$0, (SignatureView.State) obj);
            }
        });
        OnClickListeners.onClick(getAcceptBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormSignatureFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormSignatureFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        OnClickListeners.onClick(getClearBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormSignatureFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormSignatureFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PreFilledFormSignatureFragment preFilledFormSignatureFragment, SignatureView.State state) {
        Intrinsics.checkNotNull(state);
        preFilledFormSignatureFragment.onSignatureStateChanged(state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(PreFilledFormSignatureFragment preFilledFormSignatureFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormSignatureFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_SIGNED_FORM, new Screen(Screen.Name.DD_SIGNATURE, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormSignatureFragment.getCallbacks().onConfirmSignature(preFilledFormSignatureFragment.getSignatureView().saveSignature());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(PreFilledFormSignatureFragment preFilledFormSignatureFragment) {
        preFilledFormSignatureFragment.getSignatureView().clear();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    private final void onSignatureStateChanged(SignatureView.State signatureViewState) {
        ViewGroup root = getRoot();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormSignatureFragment$onSignatureStateChanged$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormSignatureFragment$onSignatureStateChanged$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        Transitions2.add(transitionSet, new Fade());
        TransitionManager.beginDelayedTransition(root, transitionSet);
        int i = WhenMappings.$EnumSwitchMapping$0[signatureViewState.ordinal()];
        if (i == 1) {
            getSignHereLabel().setVisibility(0);
            getAcceptBtn().setVisibility(4);
            getClearBtn().setVisibility(4);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getSignHereLabel().setVisibility(8);
            getAcceptBtn().setVisibility(0);
            getClearBtn().setVisibility(0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_SIGNATURE, null, null, null, 14, null), null, null, null, 29, null);
    }

    /* compiled from: PreFilledFormSignatureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormSignatureFragment;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PreFilledFormSignatureFragment newInstance() {
            return new PreFilledFormSignatureFragment();
        }
    }
}
